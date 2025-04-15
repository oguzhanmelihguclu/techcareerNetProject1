pipeline {
    agent any

    environment {
        RECIPIENT = 'oguzhanmguclu@gmail.com'
        GIT_CREDENTIALS_ID = 'dc56b904-2c60-4991-91e7-e86def0e981b'
        TARGET_BRANCH = 'main'
        REPO_URL = 'https://github.com/oguzhanmelihguclu/techcareerNetProject1.git'
    }

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build & Test') {
            steps {
                echo 'Running Maven tests...'
                sh 'mvn clean test'
            }
        }

        stage('Push to GitHub') {
            when {
                expression {
                    currentBuild.result == null || currentBuild.result == 'SUCCESS'
                }
            }
            steps {
                echo 'Tests passed, pushing to GitHub...'
                withCredentials([usernamePassword(credentialsId: "${GIT_CREDENTIALS_ID}", usernameVariable: 'GIT_USER', passwordVariable: 'GIT_PASS')]) {
                    sh '''
                    git config user.email "jenkins@example.com"
                    git config user.name "Jenkins CI"

                    git checkout -B ${TARGET_BRANCH}
                    git push https://${GIT_USER}:${GIT_PASS}@github.com/oguzhanmelihguclu/techcareerNetProject1.git ${TARGET_BRANCH}
                    '''
                }
            }
        }
    }

    post {
        failure {
            mail to: "${env.RECIPIENT}",
                 subject: "🚨 Build FAILED: ${env.JOB_NAME} #${env.BUILD_NUMBER}",
                 body: "Build başarısız oldu.\n\nDetaylar: ${env.BUILD_URL}console"
        }
    }
}
