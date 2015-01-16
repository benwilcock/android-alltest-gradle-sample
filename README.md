This shows a simple Android-Gradle template which demonstrates and configures Instrumentation Tests, Robolectric Tests and Unit Tests together in one project.

Project is broken down into 3 modules

`/core` - A simple Java library module (with JUnit 4 tests)
`/app` - Android application and integration test module (instrumentation tests)
`/app-tests` - Application Unit Tests (with Robolectric tests) 

Some other frameworks are also configured:

Square's AssertJ for Android has been used to make testing of android components easier (for both integration tests and unit tests with Robolectric). https://github.com/square/assertj-android

Tests can be run using one of the following (or combinations thereof):

```
./gradlew test
./gradlew check
./gradlew build
./gradlew connectedCheck
```

This whole project is based on the following blog post (but further adapted to include instrumentation and a core module)

http://blog.blundell-apps.com/android-gradle-app-with-robolectric-junit-tests/

The tests for Robolectric can also be configured to run from within Android Studio 1.0.x if you follow this post:

http://blog.blundell-apps.com/how-to-run-robolectric-junit-tests-in-android-studio/
