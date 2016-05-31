# Groovy HTS Sample Info

This project contains simple classes to model the sample information typically used / required
in modeling high throughput genomic sequencing studies.

The code started out life as a part of [groovy-ngs-utils](https://github.com/ssadedin/groovy-ngs-utils), but has 
been extracted so that it can be maintained independently of that project.

The sample meta data model is used by [Cpipe](http://cpipeline.org), a shared pipeline for 
analysis of exome sequencing data that is specialised for clinical sequencing applications.

## Building

The project should compile automatically with Gradle if you have a sufficient version of Java installed:

```
./gradlew clean jar
```
