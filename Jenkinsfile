pipeline {
  stages {
    stage('build') {
	  agent {
	        docker {
	            image 'maven:3-alpine'
	            args '-v /ec2-user/.m2:/root/.m2'
	        }
	    }
      steps {
        git(url: 'https://github.com/SVasiliy/alltester.git', branch: 'master')
        sh 'mvn clean install'
      }
    }
    stage('deliver') {
      steps {
        sh 'sudo docker stop alltester'
        sh 'sudo docker rm alltester'
        sh 'sudo docker run -p 9100:8080 --name=alltester -d alltester:1.0'
      }
    }
  }
}