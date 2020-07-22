This project contains how to generate project structure for spring boot/java application.

1. An Archetype, is a simple artifact, that helps in generation of project structure.


2. Command to Generate basic structure:

      mvn archetype:generate
      -DgroupId=[project's group id]
      -DartifactId=[project's artifact id]
      -DarchetypeGroupId=org.apache.maven.archetypes
      -DarchetypeArtifactId=maven-archetype-archetype

         
  

3. Typical Project Structure for Archetype : 


Archetype
  | -- pom.xml
     --  src
           | -- main
                       | -- resources
                                    | -- META-INF
                                    |             | -- maven
                                    |                        |-- archetype-metadata.xml
                                    |
                                    | -- archetype-resources
                                                      | -- pom.xml
                                                      | -- src
                                                                | -- main
                                                                |           -- java
                                                                |                   -- Application.java
                                                                |                   -- controller
                                                                |                   -- service
                                                                |           --  resources
                                                                |                   --  application- dev.properties
                                                                |                    --  application- qa.properties  
                                                                |
                                                                | -- test
                                                                            -- java
                                                                                      -- ApplicationTest.java
