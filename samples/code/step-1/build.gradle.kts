// tag::apply-kotlin-plugin[]

plugins {
// end::apply-kotlin-plugin[]
// tag::apply-kotlin-plugin[]
    kotlin("jvm") version "1.2.61" // <1>
}
// end::apply-kotlin-plugin[]

// tag::configure-dependencies[]
repositories {
    jcenter() // <2>
}

dependencies {
    implementation(kotlin("stdlib")) // <3>
}
// end::configure-dependencies[]

// tag::set-version[]
group = "org.example"  // <4>
version = "1.0-SNAPSHOT"
// end::set-version[]
