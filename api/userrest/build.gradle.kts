apply {
    plugin("org.springframework.boot")
}

dependencies {
    implementation(project(":userdata"))
    implementation(project(":rest"))
    implementation(project(":user"))
    implementation("org.springframework.boot:spring-boot-starter-web")
}