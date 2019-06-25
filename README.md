# restassured-demo

Pre-requisite:
MAVEN and JAVA should be installed with class path been set

Steps:
1/ Create a quick start maven project from your favourite IDE

2/ Open pom.xml

3/ Add dependencies the below dependencies
<dependency>
      <groupId>io.rest-assured</groupId>
      <artifactId>rest-assured</artifactId>
      <version>4.0.0</version>
      <scope>test</scope>
</dependency>

<dependency>
      <groupId>io.rest-assured</groupId>
      <artifactId>json-path</artifactId>
      <version>4.0.0</version>
</dependency>

<dependency>
      <groupId>io.rest-assured</groupId>
      <artifactId>xml-path</artifactId>
      <version>4.0.0</version>
</dependency>

<dependency>
      <groupId>io.rest-assured</groupId>
      <artifactId>json-schema-validator</artifactId>
      <version>4.0.0</version>
      <scope>test</scope>
</dependency>

4/ Create junit or testng test; initiate get or post request with parameters and validate the body.

5/ mvn test

6/ mvn surefire-report:report-only (To generate html test report)

7/ mvn site -DgenerateReports=false (To include css and image so it will be complete report)
