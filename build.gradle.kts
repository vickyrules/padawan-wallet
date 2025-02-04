buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:8.1.2")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.8.0")
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()

        // snapshot repository
        maven("https://s01.oss.sonatype.org/content/repositories/snapshots/")

        // local Maven
        // mavenLocal()
    }
}
