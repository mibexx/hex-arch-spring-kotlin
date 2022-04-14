import org.springframework.boot.gradle.tasks.bundling.BootJar

apply {
    plugin("org.springframework.boot")
}

val bootJar: BootJar by tasks
bootJar.enabled = false

dependencies {
    implementation(project(":userdata"))
    implementation("org.springframework.boot:spring-boot-starter")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
}