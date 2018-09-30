# apiFramework-prac

## Maven Installation Notes:
maven in 5 mins (read about that on google to understand project structure)
1. Advantages of using Maven:
     a. Central repository
	 b. maintaining common organized project structure
	 c. flexibility for integrating with CI/CD
	 d. plugins for test framework executions

2. Installing maven:
     a. Download the "bin" zip from their website
	 b. Configure environment variables on your local
	 c. Check version on cmd to see if the installation happened correctly

3. Creating Maven project:
      a. understand what is groupId,artifactId,archetype etc
	  b. know where is your working directory (Example: C:\Manisha_Automation)
	  c. in cmd run this command for making maven project on your local
	  mvn archetype:generate -DgroupId=<giveAName> -DartifactId=<> -DarchetypeArtifactid=maven-archetype-quickstart -DinteractiveMode=false
	  d. for eclipse you need to run another command as below:
	  mvn eclipse:eclipse
	  sometimes IDE has the maven plugins in that case go ahead and import the project as "External source" using "Maven"

	  Note:
	  archetypeId = becomes projectName
	  groupId = becomes package name inside the src
	  DarchetypeArtifactid = is to define the sample project structure template you would like to build, maven offers few like "maven-archetype-quickstart"

4. Add tests in project
5. Go to maven central repo online and search for xml lines of code of each of the dependencies (Example: selenium, rest assured,test NG)
6. Paste the dependencies in pom.xml
7. Maven surefire plugin must also be placed in pom.xml,get it's dependencies lines of code online from maven central repo
https://maven.apache.org/surefire/maven-surefire-plugin/usage.html
surfire plugin is important to run maven tests.

8. few commands which are important to run maven tests: go to the source directory on cmd
mvn clean
mvn compile
mvn test -> note just by running this comman also runs all the maven tests by doing clean first and then compile
Note: maven can do code compilations on jenkins where no IDE exists.Hence it is useful there.

9. java classes must end with word "Test" for maven to pickup those tests. (Example: SeleniumTest class has two tests)

## Integrating Maven with Testng

1. if eclipse right click project to create as TestNG which will auto generate testng.xml
otherwise use maven official site on how to make simple testng.xml

2. you can add tests to testng.xml and add configurations to maven-surfice plugin to run tests which are defined in testng.xml
https://maven.apache.org/plugins-archives/maven-surefire-plugin-2.12.4/usage.html

3. then use command "mvn test" to test if the right number of tests were picked.

4. to run a single test using cmd prompt use
https://maven.apache.org/plugins-archives/maven-surefire-plugin-2.12.4/examples/single-test.html

## Adding testNG reports to jenkins:
1. it is plugin which can be imported in jenkins and then restart Jenkins

## Adding Log4j to framework
1. Go to apache official site and download log4j zip
https://logging.apache.org/log4j/2.0/download.html

2. unzip and add the jars to IDE library
Note: only two jars are important "log4j-api-<latestVersionNumber>.jar" and "log4j-core-<latestVersionNumber>.jar"

3. refer to Log4j scripts package in src on sample tests which were created by using logger commands



