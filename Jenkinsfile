pipeline{
agents any
node {
    stage("checkout") {
        git 'https://github.com/bnilles/JenkinsSample.git'
    }
    stage("build") {
        sh 'mvn clean package'
    } 
    stage("archive") {
        archiveArtifacts artifacts: 'target/*.jar'
    }
    stage("upload") {
        withAWS(credentials: 'myAWS', region: 'us-east-2') {
        s3Upload  bucket: 'jenkins-example',  file: 'target/JenkinsSample-0.0.1-SNAPSHOT.jar'
}
       
    }
}
}