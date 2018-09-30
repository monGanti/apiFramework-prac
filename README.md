# apiFramework-prac

## Maven notes:
-> maven in 5 mins (read about that on google to understand project structure)
1.) Advantages of using Maven:
     -> Central repository
	 -> maintaining common organized project structure
	 -> flexibility for integrating with CI/CD
	 -> plugins for test framework executions

2.) Installing maven
    -> Download the "bin" zip from their website
	-> Configure environemnt variables
	-> Check version on cmd to see if the intallation happened correctly

3.) Creating Maven project
      -> understand what is groupId,artifactId,archetype etc
	  -> know where is your working directory (Example: C:\Manisha_Automation)
	  -> in cmd run this command for making maven project on your local
	  mvn archetype:generate -DgroupId=<giveAName> -DartifactId=<> -DarchetypeArtifactid=maven-archetype-quickstart -DinteractiveMode=false
	  -> for eclipe you need to run another command as below:
	  mvn eclipse:eclipse
	  sometimes IDE has the maven plugins in that case go ahead and import the project as "External source" using "Maven"

	  Note:
	  archetypeId = becomes projectName
	  groupId = becomes package name inside the src
	  DarchetypeArtifactid = is to define the sample project structure template you would like to build, maven offers few like "maven-archetype-quickstart"

4.) Add tests in project
5.) go to maven repo and search and get the xml lines of code of each of the dependencies (Example: selenium, rest assured,test NG)
6.) paste the dependenciesin pom.xml
7.) Maven surefire plugin must also be placed in pom.xml,get it's dependencies lines of code online from maven repo
https://maven.apache.org/surefire/maven-surefire-plugin/usage.html
surfire plugin is important to run maven tests.

8.) few commands which are important to run maven tests:
go to the source directory on cmd
mvn clean
mvn compile
mvn test -> note just by running this comman also runs all the maven tests by doing clean first and then compile
maven can do code compliations on jenkins where no IDE exists.hence it is useful there.

9.) java classes must end with word "Test" for maven to pickup those tests. (Example: SeleniumTest class has two tests)

## Integrating Maven with Testng

1.) if eclipse right click project to create as TestNG which will auto generate testng.xml
otherwise use maven official site on how to make simple testng.xml

2.) you can add tests to testng.xml and add configurations to maven-surfice plugin to run tests which are defined in testng.xml
https://maven.apache.org/plugins-archives/maven-surefire-plugin-2.12.4/usage.html

3.) then use command "mvn test" to test if the right number of tests were picked.

4.) to run a single test using cmd prompt use
https://maven.apache.org/plugins-archives/maven-surefire-plugin-2.12.4/examples/single-test.html


## Adding testNG reports to jenkins:
1.) it is plugin which can be imported in jenkins and then restart Jenkins



