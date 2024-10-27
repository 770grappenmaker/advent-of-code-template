// Configuration for gradle, do not worry about it

plugins {
    java
}

repositories {
    mavenCentral()
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}

// Allows you to run the advent of code solutions from the console
open class RunAoc : JavaExec() {
    @Option(option = "class", description = "The class to run")
    override fun getMainClass() = super.getMainClass()
}

val compileJava: Task by tasks.getting
val run by tasks.registering(RunAoc::class) {
    classpath(compileJava.outputs, configurations.runtimeClasspath)

    doFirst {
        if (!mainClass.isPresent) throw GradleException("Set the file to run with --file!")
    }
}