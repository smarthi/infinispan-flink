### Infinispan Flink connector

#### Supported:

* Write any key-value based DataStream to Infinispan server
* Create an DataStream from a Infinispan server cache
* Use Infinispan server side filters to create a cache based DataStream
* Write any DataStream to Infinispan server
* Create a DataStream for events (insert, modify and delete) in a cache
* Java API


#### Compatibility

* Apache Flink 0.10.0 or above
* Infinispan 8.0.0.Beta3 
* Java 8  
* Scala 2.10/2.11

#### Dependency:

Maven:

<dependency>
    <groupId>org.infinispan</groupId>
    <artifactId>infinispan-flink</artifactId>
    <version>0.1-SNAPSHOT</version>
</dependency>

#### Build instructions

Package: mvn clean install  
Run all tests: mvn clean test

#### Publishing

To publish to nexus, first export the credentials as environment variables:

```
export NEXUS_USER=...   
export NEXUS_PASS=...
```





