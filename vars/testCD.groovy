def call(body){
    def config = [:]
    body.resolveStrategy = Closure.DELEGATE_FIRST
    body.delegate = config
    body()

    pipeline {
        agent any

        stage('hello') {
            echo "Hello, World! test"
        }
    }
}