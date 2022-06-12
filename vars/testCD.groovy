def call(body){
    def config = [:]
    body.resolveStrategy = Closure.DELEGATE_FIRST
    body.delegate = config
    body()

    pipeline {
        agent {lable 'docker'}
        
        stages{
            stage('TestCD'){
                steps{
                    sh 'echo "Hello, World!"'
                }
            }
        }
    }
}