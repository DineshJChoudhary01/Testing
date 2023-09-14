
pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build Backend and Test') {
            steps {
                dir('JavaBackendServiceWithSpringSecurity') {
                    bat 'mvn clean install'
                }
            }
        }

         stage('Test Backend') {
            steps {
                dir('JavaBackendServiceWithSpringSecurity') {
                    bat 'mvn test'
                }
            }
        }

     

        stage('Deploy Backend') {
            steps {
                dir('JavaBackendServiceWithSpringSecurity/target') {
                    bat 'xcopy *.war "C:\\Program Files\\Apache Software Foundation\\Tomcat 10.1\\webapps\\" /Y'
                }

            }
        }

    }
        post {
        success {
                echo 'Build and deployment successful!'
                emailext subject: 'Jenkins Build Success',
                        body: 'The Jenkins build and deployment were successful.',
                        to: 'dineshjchoudhary01@gmail.com'
            }
            
            failure {
                echo 'Build or deployment failed!'
                emailext subject: 'Jenkins Build Failure',
                        body: 'The Jenkins build or deployment failed.',
                        to: 'dineshjchoudhary01@gmail.com'
            }
        }
    

}   