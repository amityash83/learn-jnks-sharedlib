def call() {
    def configFile = readYaml file: "${Jenkins.instance.getRootDir()}/jenkins-shared-library/resources/config.yaml"
    return configFile
}
