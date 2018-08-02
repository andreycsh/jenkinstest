pipeline{
	agent any
	stages{
		stage('test'){
			steps{
				gradle test
			}
		}
		stage('build'){
			steps{
				gradle build
			}
		}
	}
}
