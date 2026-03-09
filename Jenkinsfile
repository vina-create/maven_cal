pipeline {
    agent any

    tools {
        maven 'Maven'
    }

    stages {

        stage('Compile') {
            steps {
                bat 'mvn compile'
            }
        }

        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }

        stage('Build') {
            steps {
                bat 'mvn clean install'
            }
        }

    }
}
