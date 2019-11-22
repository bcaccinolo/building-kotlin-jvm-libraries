// tag::apply-kotlin-plugin[]

// tag::apply-build-scan-plugin[]
plugins {
// end::apply-kotlin-plugin[]
    `build-scan`
// tag::apply-kotlin-plugin[]
    id("org.jetbrains.kotlin.jvm") version "1.3.60" // <1>
}
// end::apply-kotlin-plugin[]
// end::apply-build-scan-plugin[]

// tag::configure-dependencies[]
repositories {
    jcenter() // <2>
}

dependencies {
    implementation(kotlin("stdlib")) // <3>
}
// end::configure-dependencies[]

// tag::configure-build-scan[]
buildScan {
    termsOfServiceUrl = "https://gradle.com/terms-of-service" // <1>
    termsOfServiceAgree = "yes"

    publishAlways() // <2>
}
// end::configure-build-scan[]
