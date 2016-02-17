# KotlinGroovyInterop

## Introduction

I've been exploring interoperability of Kotlin and Groovy.

## Running the code

1. Install JAVA **SDK** 1.7+. It should **not** be necessary to install
   sdkman, Groovy, Kodlin, Gradle, etc. If in doubt, check that
   $JAVA_HOME/bin is on your path and that $JAVA_HOME/bin/javac exists.
   **Note:** $JAVA_HOME is an environment variable that should point to the JAVA SDK.
   exists on your PATH and a
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

## How can you help?

* Help me figure out how to solve the compilation problem so I can
  call Groovy from Kotlin. There is no reason we shouldn't have
  two-way interop.
* Are you a master of Kotlin tests? Add one or many. I plan to do this because
  I don't think that tests will have the compilation issue but have not
  yet demonstrated this.
