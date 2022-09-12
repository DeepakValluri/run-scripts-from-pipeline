def gv

pipeline {
    agent any
    parameters {
        choice(name: 'NUMBER',
            choices: [10,20,30,40,50,60,70,80,90],
            description: 'Select the value for F(n) for the Fibonnai sequence.')
        booleanParam(name: 'executeTests', defaultValue: true, description:'')
    }

    stages {
        stage('Make executable') {
            steps {
             script{
                        gv = load "script.groovy"            
                }
                
                echo "make executable"

            }
        }
        stage('test') {
            when {
                expression{
                    params.executeTests == true
                }
            }
            
            steps {
                script{
                    gv.testApp() 
                }
               
            }
        }
        
        stage('deploy'){
         
            input {
                message "Select the environment to deploy to"
                ok "Done"
                
                 parameters {
                    choice(name: 'ONE', choices: ['dev', 'staging', 'prod'], description:'')
                    
                }
                
        
            }       
            steps{
                        script{
                gv.buildApp()
                            echo "deploying to ${ONE}"
            }   
            }
 
        }

    }
}
