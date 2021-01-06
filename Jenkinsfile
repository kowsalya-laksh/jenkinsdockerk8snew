pipeline {
    agent none
     stages {
        stage("build and deploy on Windows and Linux") {
            parallel {
                stage("windows") {
                    agent {
                        label "kowsalya_windows"
                    }
                    stages {
                        stage("Windows validate") {
                            steps {
                                bat "hostname"
                            }
                        }
                        stage("Windows Build and compile") {
                            when {
                                branch "master"
                            }
                            steps {
							    git "https://github.com/kowsalya-laksh/jenkinsdockerk8snew.git"
                                bat "mvn validate compile -f pom.xml"
                            }
                        }
                    }
                }

                stage("linux") {
                    agent {
                        label "master"
                    }
                    stages {
                        stage("Linux validate") {
                            steps {
                                sh "hostname"
                            }
                        }
                        stage("Linux Build and compile") {
				when {
                                branch "or"
                            }
                             steps {
							    git "https://github.com/kowsalya-laksh/jenkinsdockerk8snew.git"
                                sh "mvn validate compile -f pom.xml"
                            }
                        }
                    }
                }
            }
        }
    }
}
