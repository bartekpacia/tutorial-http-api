plugins {
    kotlin("jvm") version "1.8.0"
    id("io.ktor.plugin") version "2.2.3"
    id("org.jetbrains.kotlin.plugin.serialization") version "1.8.0"
}

kotlin {
    jvmToolchain(11)
}

group = "com.example"
version = "0.0.1"
application {
    mainClass.set("io.ktor.server.netty.EngineMain")

    val isDevelopment: Boolean = project.ext.has("development")
    applicationDefaultJvmArgs = listOf("-Dio.ktor.development=$isDevelopment")
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("io.ktor:ktor-server-core-jvm:2.2.3")
    implementation("io.ktor:ktor-server-content-negotiation-jvm:2.2.3")
    implementation("io.ktor:ktor-serialization-kotlinx-json-jvm:2.2.3")
    implementation("io.ktor:ktor-server-netty-jvm:2.2.3")
    implementation("ch.qos.logback:logback-classic:1.4.4")
    testImplementation("io.ktor:ktor-server-tests-jvm:2.2.3")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.8.0")
}
