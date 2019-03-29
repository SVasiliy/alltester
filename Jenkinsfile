pipeline {
  agent any
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
        sh 'cp /home/application-prod.properties src/main/resources'
        sh 'pwd'
        sh 'ls src/main/resources'
        sh 'mvn clean install'
        sh 'docker image build -t alltester:1.0 --build-arg JAR_FILE=target/myproject-0.0.1-SNAPSHOT.jar .'
      }
    }
    stage('deliver') {
	   agent none
      steps {
        sh '/home/restart_alltester.sh'
      }
    }
  }
}