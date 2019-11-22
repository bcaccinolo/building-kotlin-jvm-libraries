plugins {
    `build-scan`
    id("org.jetbrains.kotlin.jvm") version "1.3.60"
}

repositories {
    jcenter()
}

// tag::configure-dependencies[]
dependencies {
    implementation(kotlin("stdlib"))
    testImplementation("junit:junit:4.12") // <1>
}
// tag::configure-dependencies[]

buildScan {
    termsOfServiceUrl = "https://gradle.com/terms-of-service"
    termsOfServiceAgree = "yes"

    publishAlways()
}
