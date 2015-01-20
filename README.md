This shows a simple Android-Gradle template which demonstrates and configures
Robolectric, Robotium, Instrumentation and JUnit Tests together in one project.

Project Structure
-----------------

Project is broken down into 3 modules

1. `/core` - Vanilla Java library module (with JUnit 4 tests)
2. `/app` - Android app and integration test module (Robotium and Instrumentation)
3. `/app-tests` - Android unit test module (Robolectric)

Dependencies & Frameworks
-------------------------

This project template integrates and depends on the following popular Java and Android frameworks:

1. AssertJ for Android. Used to make the testing of android components easier by introducing an android specific DSL.
See https://github.com/square/assertj-android

2. Robolectric. Used for the simulated testing of Android apps (i.e. device API's are simulated, so there is no need for an emulator or physical device).
See https://github.com/robolectric/robolectric

3. JUnit. Used to simplify testing of core Java and simulated Android tests.
See http://junit.org/

4. AppCompat. Popular google support library for backwards compatibility.
See https://developer.android.com/tools/support-library/features.html

5. Robotium. Used to augment normal Instrumentation Tests and provide black box integration testing.
https://code.google.com/p/robotium/

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
6. It's very slow (on my Core 2 duo anyway, your mileage may vary).
7. I'm not what you'd call a 'natural born tester' (but I do at least try).

I'm not sure anyone other than Google can improve the situation regarding Android testing if I'm brutally honest. It's a bit of a 'dogs dinner'.

On the plus side, I haven't used any additional gradle plugins. I've seen and tries lots but they can go out of date quite quickly

Acknowledgements
----------------

The original inspiration for this template project came from Jason Atwood's blog at Big Nerd Ranch:

http://www.bignerdranch.com/blog/all-in-together-android-studio-gradle-and-robolectric/

This template project is based on the following blog post and code samples (but I further further adapted it soa as to include instrumentation and a java core module)

http://blog.blundell-apps.com/android-gradle-app-with-robolectric-junit-tests/

The tests for Robolectric can also be configured to run from within Android Studio 1.0.x if you follow this post:

http://blog.blundell-apps.com/how-to-run-robolectric-junit-tests-in-android-studio/

I had lots of issues with AppCompat which took a while to fix, but @sjorsgeelen and @loeschg had the right answer here:

https://github.com/robolectric/robolectric/issues/1334
