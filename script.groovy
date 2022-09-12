def buildApp(){
  echo 'building the application...'
}

def testApp(){
   echo 'building the application..'
}

def deployApp(){
  echo 'testing the application.${params.NUMBER}'
}


return this
