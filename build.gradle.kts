plugins {
    kotlin("jvm") version "2.0.21"
    alias(libs.plugins.versions)
    alias(libs.plugins.version.catalog.update)
    alias(libs.plugins.graal)
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    testImplementation(libs.assertj)
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(17)
}