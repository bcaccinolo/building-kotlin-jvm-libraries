// tag::apply-dokka-plugin[]
plugins {
    kotlin("jvm") version "1.2.61"
    id("org.jetbrains.dokka") version "0.9.17"
}
// end::apply-dokka-plugin[]

repositories {
    jcenter()
}

dependencies {
    implementation(kotlin("stdlib"))
    testImplementation("junit:junit:4.12")
}

// tag::configure-dokka-plugin[]
val dokka by tasks.getting(org.jetbrains.dokka.gradle.DokkaTask::class) {  // <1>
    outputFormat = "html"
    outputDirectory = "$buildDir/javadoc"
}
// end::configure-dokka-plugin[]

// tag::configure-dokka-jar[]
val dokkaJar by tasks.creating(Jar::class) {  // <1>
    group = JavaBasePlugin.DOCUMENTATION_GROUP
    description = "Assembles Kotlin docs with Dokka"
    classifier = "javadoc"
    from(dokka)  // <2>
}
// end::configure-dokka-jar[]
