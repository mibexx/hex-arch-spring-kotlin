import org.springframework.boot.gradle.tasks.bundling.BootJar

apply {
    plugin("org.springframework.boot")
}

val bootJar: BootJar by tasks
bootJar.enabled = false

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web")
}
