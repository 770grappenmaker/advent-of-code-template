// Configuration for gradle, do not worry about it

plugins {
    alias(libs.plugins.kotlin)
}

repositories {
    mavenCentral()
}

kotlin {
    jvmToolchain(21)
}

// Allows you to run the advent of code solutions from the console
open class RunAoc : JavaExec() {
    @Option(option = "file", description = "The file to run")
    override fun getMainClass() = super.getMainClass()
}

val compileKotlin: Task by tasks.getting
val run by tasks.registering(RunAoc::class) {
    classpath(compileKotlin.outputs, configurations.runtimeClasspath)

    doFirst {
        if (!mainClass.isPresent) throw GradleException("Set the file to run with --file!")
    }
}