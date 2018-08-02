pipeline{
	agent any
	stages{
		stage('test'){
			steps{
				useWrapper(false)
				gradle('test')
			}
		}
		stage('build'){
			steps{
				useWrapper(false)
				gradle('build')
			}
		}
	}
}
