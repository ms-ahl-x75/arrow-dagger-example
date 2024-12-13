plugins {
  kotlin("jvm") version "2.0.20"
  id("com.google.devtools.ksp") version "2.0.20-1.0.25"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
  mavenCentral()
}

dependencies {
  implementation("io.arrow-kt:arrow-core:2.0.0")
  implementation("com.google.dagger:dagger:2.52")
  ksp("com.google.dagger:dagger-compiler:2.52")
}

kotlin {
  jvmToolchain(17)
}
