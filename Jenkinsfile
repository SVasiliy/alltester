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
        echo test
        ls
        echo test 2
        pwd
        sh 'mvn clean install'
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