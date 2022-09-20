pipeline {
    agent any 
    stages {
        		stage('Cleaning Stage') { 
            		steps {
                			   bat "mvn clean"
            			}
        }
        		stage('Testing Stage') { 
            		steps {
                			   bat "mvn test" 
            			}
        }
        		stage('Packaging Stage') { 
            		steps {
                			   bat "mvn package"
           				}
			stage('Email Build Status') {
				steps{
					mail body:"${env.JOB_NAME} - Build #{env.BUILD_NUMBER} - ${currentBuild.currentResult}\n\nCheck console outputcat ${env.BUILD_URL}to view the results.",subject:"${env.JOB_NAME} - Build # ${env.BUILD_NUMBER} - ${currentBuild.currentResult}!!",to:'pramila.halyal@cognizant.com'
        }
    }
}
