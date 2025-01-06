plugins {
    java
    application
}

application {
    mainClass = "spring.Main"
}

tasks.withType<JavaExec> {
    standardInput = System.`in`
}
