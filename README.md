# jenkinsfile-sample-component1

mvn -Dsonar.login=TOKEN -Dsonar.pullrequest.key=4 -Dsonar.pullrequest.branch=feature1 verify sonar:sonar
