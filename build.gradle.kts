plugins {
    kotlin("jvm") version "1.4.10"
}

group = "org.example"
version = "1.0"

repositories {
    mavenLocal()
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation("org.example:sealed-opaque:1.0")
    implementation("com.tylerthrailkill.helpers:pretty-print:2.0.2")
}
