pipeline{
    agent any
    environment{
        PATH = "/usr/local/Cellar/maven/3.6.3/bin:$PATH"
    }
    stages{
        stage("Git Checkout"){
            steps{
               git credentialsId: 'Github', url: 'https://github.com/AakashMaheedar/MicroServiceNameService'
            }
        }
        stage("Maven Build"){
            steps{
                sh "mvn clean install"
            }
            }
        stage("Docker Image Build"){
                    steps{
                        sh "docker build  -f Dockerfile -t dockerimage.jar ."
"
                    }
              }
        }
}