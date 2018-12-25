pipeline {
  agent {
        docker {
            image 'maven:3-alpine'
            args '-v /ec2-user/.m2:/root/.m2'
        }
    }
  stages {
    stage('build') {
      steps {
        git(url: 'https://github.com/SVasiliy/alltester.git', branch: 'master')
        sh 'mvn clean install'
      }
    }
    stage('deliver') {
      steps {
        sh 'docker stop alltester'
        sh 'docker rm alltester'
        sh 'docker run -p 9100:8080 --name=alltester -d alltester:1.0'
      }
    }
  }
}