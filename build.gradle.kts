buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:7.1.3")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.6.10")
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
