pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                withMaven(maven:'maven') {
                  'sh mvn clean package'  
                }
                 
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}