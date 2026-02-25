pipeline {
    agent any

    tools {
        maven 'Maven3'
        jdk 'JDK25'
    }

    environment {
        IMAGE_NAME = "student-app"
    }

    stages {

        stage('Checkout Code') {
            steps {
                checkout scm
            }
        }

        stage('Clean & Build Jar') {
            steps {
                sh 'mvn clean package -DskipTests'
            }
        }

        stage('Build Docker Image') {
            steps {
                sh 'docker build -t $IMAGE_NAME .'
            }
        }

        stage('Stop Old Containers') {
            steps {
                sh 'docker compose down || true'
            }
        }

        stage('Start Containers') {
            steps {
                sh 'docker compose up -d --build'
            }
        }
    }

    post {
        success {
            echo 'Application deployed successfully 🚀'
        }
        failure {
            echo 'Build failed ❌'
        }
    }
}