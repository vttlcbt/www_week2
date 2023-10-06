plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    compileOnly("jakarta.platform:jakarta.jakartaee-web-api:9.1.0")
    implementation("org.glassfish.jersey.containers:jersey-container-servlet:3.0.4")
    implementation("org.glassfish.jersey.media:jersey-media-json-jackson:3.0.4")
    implementation("org.glassfish.jersey.inject:jersey-cdi2-se:3.0.4")
    implementation("org.jboss.weld.se:weld-se-core:4.0.3.Final")


}

tasks.test {
    useJUnitPlatform()
}