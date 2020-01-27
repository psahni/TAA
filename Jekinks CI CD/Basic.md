DevOps Pipeline
Cont. Intge Cont. Delievery


I downloaded the jenkins for windows
Installed it
Jenkins automatically started at 8080 port
initialPassword file is located at
C:\Program Files (x86)\Jenkins\secrets

You can change the default port from jenkins.xml file
Here:- C:\Program Files (x86)\Jenkins


SCM POLL option under build trigger
- H/5 * * * *
Which means jenkins will poll github, for any code changes after every 5 mins
If there are any code changes, it will trigger the build.

You can use the env variables in your jenkins jobs

# Jenkins Pipeline

In Jenkins, a pipeline is a group of events or jobs which are interlinked with one another in a sequence.
https://www.guru99.com/jenkins-pipeline-tutorial.html

Build ==> Deploy ==> Test ==> Release

Why Pipeline ?
Multiple Components

Lower layer => Middle Layer ==> Upper Layer

For example: Run test cases after build
Analysis sonar


https://dev.to/raghwendrasonu/create-jenkins-pipeline-with-an-example-3p7j

Pipeline jobs can be controlled with a Jenkins file. So, you can specify what to be done in the Jenkins file and the job will run accordingly. Groovy DSL is used to write this Jenkins file. You need to specify agents, stages, steps and action to be done in the file. The file name should be Jenkinsfile, so that Jenkins can identify the file.

We configure Pipelines through
Post-build Actions
So Build1
    Configure => Post-build Actions => new build name (Build2) that will run after Build1


# Artifactory
An artifact could be java compiled code
html code, config files which are neccary to run the target systems

java
jFrog

https://www.quora.com/What-is-the-difference-between-JFrog-and-Git

The standard response to such a question would be a Source control system is used to store the sources! And not your binaries! If you want to store binaries then you need something which is more catered towards binaries!
Git cannot handle binary files which have no textual context.

- All binaries, war, jar files are stored on the artifactory

# CI CD Pipeline with Jenkins, Gradle, and Artifactory

Bit Bucket
  Tetra Noodle
    webapp_maven_deploy

Pom - project object model. contains configuration and dependencies to build the application
artifact id, group id

JAR vs WAR

WAR:- web applicatio archive
JAR:- Java archive

# Jenkins and Maven
- Job to Generate war file
- Job to deploy


* Squitch is database change management tool


* PHpadmin, httpd

* We can configure the postgres configuratio file to allow the traffic from diff sources

* Master and slave nodes in Jenkins

# Question
- Anna is an administrator of a large organization having more than 500 employees and a complex network infrastructure. While defining security in Jenkins, which option would you recommend her for configuring TCP/IP connections between Jenkins master and slave nodes?

--   Fixed port is the recommended option for configuring TCP/IP connections between Jenkins master and slave nodes in large and complex network infrastructure

Tips:
 * The Unix user group database option enables you to store information about your security rules and users within the Linux or Unix user datastore.
 *  You should not run jobs on master and you should always plan your slave nodes for high usage. Moreover your master node should be deployed in a robust hardware or virtual machine