plugins {
    kotlin("jvm") version "1.5.10"
}

group = "de.themeinerlp"
version = "1.0-SNAPSHOT"

repositories {
    maven(url = "https://repo.spongepowered.org/maven")
    maven(url = "https://jitpack.io")
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation("com.github.Minestom:Minestom:-SNAPSHOT")
}
buildscript {
    repositories {
        maven(url = "https://repo.spongepowered.org/maven")
        maven(url = "https://jitpack.io")
        mavenLocal()
    }
    dependencies {
        classpath("dev.themeinerlp:ItemGenerator:1.0-SNAPSHOT")
    }
}
apply(plugin = "dev.themeinerlp.itemgenerator")