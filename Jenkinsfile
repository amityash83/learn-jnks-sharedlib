@Library('jenkins-shared-library') _

pipeline {
    agent any
    stages {
        stage('Replace YAML values') {
            steps {
                replaceYamlValues()
            }
        }
    }
}
