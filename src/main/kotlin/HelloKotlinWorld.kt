class HelloKotlinWorld

fun main(args: Array<String>) {
    println("Hello from Kotlin")

    //
    // ISSUE: It seems I can easily call Kotlin from Groovy, but calling Groovy from Kotlin seems to be
    // a chicken in the egg problem, at least compiling with my Gradle build (in IntelliJ it works, I believe,
    // so the problem is a compilation order issue? Perhaps my build.gradle is wrong).
    // The Kotlin classes compile first and thus cannot see the not-yet-compiled Groovy classes. Weird.
    //
    // val g = HelloGroovyWorld()
    // g.sayHi()
}

fun add(x:Int, y:Int): Int = x + y
