#!/usr/bin/env groovy
// Declarative //
pipeline {
 
agent any
 
stages {
 
stage('Build') {
 
steps {
 
echo 'Building..'
 
}
 
}
 
stage('Test') {
 
steps {
 
echo 'Testing..'
 
}
 
}
 
stage('Deploy') {
 
steps {
 
echo 'Deploying....'
 
}
 
}
 
}
}
// Script //
node {
   def mvnHome
   stage('Preparation') { // for display purposes
      // Get some code from a GitHub repository
      git 'https://github.com/shfq100/CacheFramework.git'
      // Get the Maven tool.
      // ** NOTE: This 'M3' Maven tool must be configured
      // **       in the global configuration.           
      mvnHome = tool 'Maven_Home'
   }
   stage('Build') {
      // Run the maven build
      if (isUnix()) {
         sh "'${mvnHome}/bin/mvn' -Dmaven.test.failure.ignore clean package"
      } else {
         bat(/"${mvnHome}\bin\mvn" -Dmaven.test.failure.ignore clean package/)
      }
   }
   stage('Results') {
      junit '**/target/surefire-reports/TEST-*.xml'
      archive 'target/*.jar'
   }
}
