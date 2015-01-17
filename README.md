This shows a simple Android-Gradle template which demonstrates and configures Instrumentation Tests, Robolectric Tests and Unit Tests together in one project.

Project Structure
-----------------

Project is broken down into 3 modules

`/core` - A simple Java library module (with JUnit 4 tests)
`/app` - Android application and integration test module (instrumentation tests)
`/app-tests` - Application Unit Tests (with Robolectric tests) 

Dependencies & Frameworks
-------------------------

1. Square's AssertJ for Android has been used to make testing of android components easier (for both integration tests and unit tests with Robolectric). https://github.com/square/assertj-android

2. Robolectric is used for the offline testing of Android activities (i.e. device API's are simulated, so there is no need for an emulator or physical device)

3. JUnit v4 can be used, to give annotated marking of tests etc.

4. I've used ActionBarActivity for that appcompat-v7 library is included.

Running Tests
-------------

Tests can be run using one of the following (or combinations thereof):

```
./gradlew test
./gradlew check
./gradlew build
./gradlew connectedCheck
```

Cautions
--------

This stuff is brittle! It's a very volatile set of tools we're using.

1. Android Studio is only just out of beta.
2. Android build tools and Gradle plugin is only just out of beta.
3. Android app development borrows the Java language syntax, but not the runtime, so the compile & build tools are complex compared to standard Java. Kind of reminds me of the early days of JEE...
4. Gradle is still relatively new to me, so probably this project can be much improved.
5. Testing with standard Android is way harder and clunkier than it should be IMHO.
6. It's slow (on my Core 2 duo anyway).

I'm not sure anyone other than google can improve the situation to be brutally honest.

On the plus side, I haven't used any additional gradle plugins. I've seen and tries lots but they can go out of date quite quickly

Acknowledgements
----------------

This whole project is based on the following blog post (but further adapted to include instrumentation and a core module)

http://blog.blundell-apps.com/android-gradle-app-with-robolectric-junit-tests/

The tests for Robolectric can also be configured to run from within Android Studio 1.0.x if you follow this post:

http://blog.blundell-apps.com/how-to-run-robolectric-junit-tests-in-android-studio/

I had lots of issues with AppCompat which took a while to fix, but @sjorsgeelen and @loeschg had the right answer here:

https://github.com/robolectric/robolectric/issues/1334
