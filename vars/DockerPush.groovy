def call (String Project , String ImageTag , String dokcerhubuser){
  withCredentials([usernamePassword(credentialsId: 'DockerHub-cred',passwordVariable: 'DockerHubpass', usernameVariable: 'DockerHubUsername')]){
    sh "docker login -u ${dockerhubuser} -p ${dockerhubpass}"

sh "docker push ${DockerHubUser}/${Project}:${ImageTag}"
    
}
  
}
