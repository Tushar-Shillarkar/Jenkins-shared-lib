def call (String Project , String ImageTag , String dokcerHubUser){
  withCredentials([usernamePassword(credentialsId: 'DockerHub-cred',passwordVariable: 'DockerHubpass', usernameVariable: 'DockerHubUsername')]){
    sh "docker login -u ${dockerHubUser} -p ${dockerhubpass}"

sh "docker push ${dockerHubUser}/${Project}:${ImageTag}"
    
}
  
}
