pipeline {
    agent any
    tools {
        jdk 'JDK17'
        maven 'Maven3'
    }
    stages {
        stage('Checkout') {
            steps { checkout scm }
        }
        stage('Build') {
            steps { sh 'mvn clean compile' }
        }
        stage('Test') {
           environment {
                SPRING_DATASOURCE_URL = 'jdbc:oracle:thin:@//db:1521/hangarstation'
            }

            steps { sh 'mvn test' }
        }
        stage('SonarQube') {
           environment {
                TOKEN_SONAR = credentials('TOKEN_SONAR')
            }


               steps {
                    sh 'mvn sonar:sonar -Dsonar.host.url=http://sonarqube:9000 -Dsonar.login=$TOKEN_SONAR -Dsonar.organization=hangarstation'
                }

        }
    }

    
}