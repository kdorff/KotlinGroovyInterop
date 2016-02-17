# KotlinGroovyInterop

## Introduction

I've been exploring interoperability of Kotlin and Groovy.

## Running the code

1. Install JAVA 1.7+
2. Fork my KotlinGroovyInterop repository into your own Github repo 
3. Clone the repo to your PC and run the code (commands just below)

```
$ git clone URL_FOR_YOUR_GITHUB_REPO
$ cd KotlinGroovyInterop
$ ./gradelw test
$ ./gradlew run
```

## What I've learned

* Using Gradle (see build.gradle) I was able to create a project that 
  contains a Groovy class and a Kotlin class.
* The Groovy class was able to create execute and execute on the Kotlin class.
* The Kotlin class was only able to create and execute the Groovy class in 
  the IntelliJ IDE. Triggered from Gradle, the Kotlin wouldn't compile. 
  From the surface, this appears to be a chicken-and-egg problem. It is
  my observation that Kotlin code always compiles first and since the Groovy
  classes are not yet compiled, the Kotlin compiler complains. I believe
  Groovy+Java gets around this by having the Groovy compiler compile
  the Java code. **It is certainly possible my build.gradle is the source of
  my problem.**
* I was able to write Groovy unit tests with Spock and test both
  the Groovy code and the Kotlin code.

