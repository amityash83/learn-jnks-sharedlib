def call() {
    def targetFile = "${Jenkins.instance.getRootDir()}/jenkins-shared-library/resources/target.yaml"
    def configFile = readYamlConfig()
    def targetConfig = readYaml file: targetFile

    configFile.each { key, value ->
        targetConfig = replaceYamlValue(targetConfig, key, value)
    }

    writeYaml file: targetFile, data: targetConfig
}

def replaceYamlValue(def yaml, def key, def value) {
    def node = yaml
    key.split(/\./).each { subKey ->
        node = node[subKey]
    }
    node = value
    return yaml
}
