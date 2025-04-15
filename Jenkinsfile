pipeline {
    agent any

    triggers {
        cron('13 22 * * *')  // Her gün saat 22:13'te çalışır
    }

    stages {
        stage('Hazırlık') {
            steps {
                echo 'Pipeline başladı - Saat 22:13'
            }
        }

        stage('Build Çalıştır') {
            steps {
                sh './build.sh'
            }
        }

        stage('Temizleme') {
            steps {
                echo 'İşlem tamamlandı, cleanup yapılabilir.'
            }
        }
    }