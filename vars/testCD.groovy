def call(body){
    def config = [:]
    body.resolveStrategy = Closure.DELEGATE_FIRST
    body.delegate = config
    body()

    pipeline {
        agent {label 'docker'}
        
        stages{
            stage('TestCD'){
                steps{
                    sh 'echo "Hello, World!"'
                }
            }
        }
    }
}