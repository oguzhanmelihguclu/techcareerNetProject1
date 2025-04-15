pipeline {
    agent any

    triggers {
        cron('34 22 * * *')
    }

    stages {
        stage('Build') {
            steps {
                echo 'Pipeline çalıştı! Saat 22:34 (10:34 PM)'
            }
        }
    }
}
