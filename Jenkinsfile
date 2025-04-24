@Library('jenkinslib') _

def tools = new org.devops.tools()
pipeline {
    agent any
    options {
        timestamps()
    }
    stages {
        stage('One') {
            steps {
                echo 'Stage One'
            }
        }
        stage('Two') {
            steps {
                echo 'Stage Two'
                script {
                    input id: 'TestID', message: 'continue', ok: 'Yes, Continue', parameters: [choice(choices: ['a', 'b'], name: 'testP')], submitter: 'mo'
                    echo 'Stage Two1111'
                    tools.PrintMes("This is my lib", 'blue')
                }
            }
        }
        stage('Three') {
            steps {
                script {
                    def mvHome = tool "maven"
                    println('asdasdasd '+ mvHome )
                    sh "${mvHome}/bin/mvn  --version"
                    tools.PrintMes("This is my lib", "red")
                    
                }            
                
            }
        }
        stage('end') {
            parallel {
                stage('01') {
                    steps {
                        echo "01"
                    }
                }
                stage('02') {
                    steps {
                        echo "02"
                    }
                    }
            }
        }
    }
}
