def buildApp(){
  echo 'building the build application...'
}

def testApp(){
   echo 'building the test application..'
}

def deployApp(){
  echo 'testing the application.${params.NUMBER}'
}


return this
