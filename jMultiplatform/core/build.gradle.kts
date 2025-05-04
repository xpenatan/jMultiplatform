plugins {
    id("java")
    id("maven-publish")
}

group = "com.github.xpenatan"
version = "0.1.2"

publishing {
    publications {
        create<MavenPublication>("mavenJava") {
            from(components["java"])
            artifactId = "jmultiplatform"
        }
    }
}

dependencies {
}