plugins {
    kotlin("jvm") version "1.2.31"
}

repositories {
    jcenter()
}

// tag::configure-dependencies[]
dependencies {
    implementation(kotlin("stdlib", "1.2.31"))
    testImplementation("junit:junit:4.12") // <1>
}
// tag::configure-dependencies[]
