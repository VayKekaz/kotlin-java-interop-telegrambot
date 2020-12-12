plugins {
    java
    kotlin("jvm") version "1.4.10"
}

group = "org.kotlinlang.discuss"
version = "0.0.0"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    // Telegram
    implementation("org.telegram:telegrambots:5.0.1")
    testCompile("junit", "junit", "4.12")
}
