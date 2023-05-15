@Library('jenkins-shared-library') _

pipeline {
    agent any
    stages {
        stage('Git Checkout') {
            vcCheckout(
                branch: "main",
                url: "https://github.com/amityash83/learn-jnks-sharedlib"
            )
        }
        stage('Replace YAML values') {
            steps {
                replaceYamlValues()
            }
        }
    }
}
