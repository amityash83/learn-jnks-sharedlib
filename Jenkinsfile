@Library('jenkins-shared-library') _

pipeline {
    agent any
    stages {
        stage('init') {
            scripts {
                library "jenkins-shared-library"
            }
        }
        stage('Replace YAML values') {
            steps {
                replaceYamlValues()
            }
        }
    }
}
