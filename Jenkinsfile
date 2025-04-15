pipeline {
    agent any

    triggers {
        cron('38 22 * * *')
    }

    stages {
        stage('Build') {
            steps {
                echo 'Pipeline çalıştı! Saat 22:38 (10:38 PM)'
            }
        }
    }
}
