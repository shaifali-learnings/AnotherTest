pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                step{
       				 withMaven(maven:'maven') {
                		  'mvn clean package'  
               		 }
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