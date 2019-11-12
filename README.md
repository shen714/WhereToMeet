WhereToMeet is a web application to help friends choose place to hang out. 

## How to Deploy
### 1. clone the project from github
'''
git clone https://github.com/shen714/WhereToMeet.git
'''

### 2. Use Maven to package all the dependencies
#### method 1: use terminal
'''
mvn package
'''
#### method 2: use IDE
'''
Execute Maven Goal --> command line : package 
'''

### 3. open [elastic beanstalk] (https://console.aws.amazon.com/elasticbeanstalk/home?region=us-east-1#/applications)

### 4. create new application 

### 5. upload the .jar file from step 2