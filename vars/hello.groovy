package org.cicd

// def getCredentials(def credentialsId, def type) {
//     if (type == 'Secret text') {
//         withCredentials([string(credentialsId: credentialsId, variable: 'myCredentials')]) {
//             return myCredentials
//         }
//     }
// }

def call() {
    return 'Hello world
}