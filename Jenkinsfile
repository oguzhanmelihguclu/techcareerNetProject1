pipeline {
    agent any

    triggers {
        cron('26 23 * * *') // Her gün 22:30'da çalışır
    }

    tools {
        MAVEN_HOME 'Maven 3.9.9'  // Jenkins'te tanımlı olan Maven adı
        JAVA_HOME 'Java 17.0.14'        // Java versiyonu
    }

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/sezginmert/techcareerNetProject.git' // GitHub repo URL
            }
        }

        stage('Build & Test') {
            steps {
                sh 'mvn clean test'
            }
        }

        stage('Generate Report') {
            steps {
                sh 'mvn allure:report'
            }
        }
    }

    post {
        always {
            archiveArtifacts artifacts: 'target/*.jar', fingerprint: true
            junit 'target/cucumber-reports/*.xml'
        }
    }
}