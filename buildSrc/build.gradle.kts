plugins {
    `kotlin-dsl`
}

repositories {
    gradlePluginPortal()
}

dependencies {
    implementation(kotlin("gradle-plugin", "1.4.0"))
    implementation("com.jfrog.bintray.gradle:gradle-bintray-plugin:1.8.5")
}
