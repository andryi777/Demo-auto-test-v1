pipeline {

    agent any
    
    tools {
        maven 'M3'
        jdk 'jdk8.221'
    }
    
    options {
		buildDiscarder(logRotator(numToKeepStr: '20'))
	    disableConcurrentBuilds()
	}
    
    stages {
	
        stage ('Build') {
            steps {
                bat ("mvn -X clean verify")
            }
        }
        
		stage("Ejecutar Pruebas") {
            steps {
            	script {
        			try {
        				bat ("mvn test -Dcucumber.features='src/test/resources/features/' -Dcucumber.filter.tags=\'${ESCENARIO}\' -Dcucumber.plugin=json:target/site/result.json -Dcucumber.glue=demo")
				                        	
        			}
        			catch (ex) {
        				echo 'Finalizo ejecucion con fallos...'
        				error ('Failed')
                    }
                }
            }
        }
        
        stage ('Reporte') {
        	steps {
        		script {
					try {
                     	bat "mvn serenity:aggregate"
                    	publishHTML([allowMissing: true, alwaysLinkToLastBuild: true, keepAll: true, reportDir: "${WORKSPACE}/target/site/serenity", reportFiles: 'index.html', reportName: 'Evidencias de Prueba', reportTitles: 'Reporte de Pruebas'])
                    	//publishHTML([allowMissing: false, alwaysLinkToLastBuild: false, keepAll: false, reportDir: "${WORKSPACE}/target/site/serenity${defTimestamp}", reportFiles: 'index.html', reportName: 'Evidencias de Prueba', reportTitles: ''])
                    	//publishHTML([allowMissing: false, alwaysLinkToLastBuild: false, keepAll: false, reportDir: "${WORKSPACE}\\target\\site\\serenity${defTimestamp}", reportFiles: 'index.html', reportName: 'Evidencias de Prueba', reportTitles: ''])
                        echo 'Reporte realizado con exito'
                    }

                    catch (ex) {
                        echo 'Reporte realizado con Fallos'
                        error ('Failed')
                    }
                }
            }
        }
    }
}