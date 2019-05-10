import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.3.30"
    id("com.github.johnrengelman.shadow") version "5.0.0"
}

repositories {
    mavenCentral()
    maven("https://hub.spigotmc.org/nexus/content/repositories/snapshots/")
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))

    implementation(project(":kotlin-bukkit"))
    
    compileOnly("org.bukkit:bukkit:1.13.2-R0.1-SNAPSHOT")
}

tasks {
    withType<KotlinCompile> {
        kotlinOptions.jvmTarget = "1.8"
    }

    named<Jar>("jar") {
        finalizedBy("shadowJar")
        archiveName = "TestPlugin-$version.jar"
    }
}