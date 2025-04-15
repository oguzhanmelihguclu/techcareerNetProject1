pipeline {
    agent any

    triggers {
        cron('29 22 * * *')
    }

    stages {
        stage('Build') {
            steps {
                echo 'Pipeline çalıştı! Saat 22:29 (10:29 PM)'
            }
        }
    }
}
