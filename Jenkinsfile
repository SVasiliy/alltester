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
        sh 'echo test'
        sh 'ls'
        sh 'echo test 2'
        sh 'pwd'
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