def call (string){
    def tag = sh returnStdout: true, script: 'git rev-parse --short HEAD'
    return tag
}
