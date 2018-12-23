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
        sh 'echo test'
      }
    }
  }
}