pipeline {
    agent any

    stages {

        stage('Clone') {
            steps {
                git 'https://github.com/vina-create/maven_cal.git'
            }
        }

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
