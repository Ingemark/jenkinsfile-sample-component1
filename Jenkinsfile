#!groovy

pipeline {
    agent {
        none
    }
    options {
        disableConcurrentBuilds()
        buildDiscarder(logRotator(numToKeepStr: '10', artifactNumToKeepStr: '2'))
    }
    stages {
       stage('Deploy image to DEMO Environment'){
            steps{
                echo 'Deploying image...'
            }
        }

    }
}
