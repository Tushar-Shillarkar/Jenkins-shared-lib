
def call(string ProjectName, String ImageTag, String DockerHubUser){
sh "docker build -t ${DockerHubUser}/${ProjectName}:${imageTag} ."
        }
