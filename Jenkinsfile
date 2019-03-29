pipeline {
  agent none
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
        sh 'ls /bin'
        sh 'ls /usr/bin'
        sh 'mvn clean install'
      }
    }
    stage('deliver') {
      agent { label 'master' }
      steps {
        sh 'docker image build -t alltester:1.0 --build-arg JAR_FILE=target/myproject-0.0.1-SNAPSHOT.jar .'
        sh '/home/restart_alltester.sh'
      }
    }
  }
}