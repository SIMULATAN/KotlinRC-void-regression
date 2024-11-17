plugins {
	kotlin("jvm") version "2.1.0-RC"
}

group = "me.simulatan.kotlin"
version = "1.0"

repositories {
	mavenCentral()
}

dependencies {
	testImplementation(platform("org.junit:junit-bom:5.10.0"))
	testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
	useJUnitPlatform()
}
