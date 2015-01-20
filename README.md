#Android All-test Gradle Sample

This project provides a Gradle project template for an Android project which integrates and configures testing using Robolectric, Robotium, Java JUnit Tests and Android Instrumentation tests together in one project.

Background
----------

I develop the [TripComputer Android App](https://play.google.com/store/apps/details?id=com.soagrowers.android.tripcomputer) but I find testing it using the standard Instrumentation framework is really slow because it demands either a connected device or an emulator to be running upon which it runs the tests.

Slow testing cycles are a disincentive to TDD, so most tutorials bestow the virtues of switching to the [Robolectric](https://github.com/robolectric/robolectric) framework when unit testing Android apps because it 'simulates' the android SDK in a standard Java VM. This allows your Android tests to be executed outside of the emulator/device. It also allows the use of JUnit v4 syntax rather than the older JUnit v3 required by the built in Android Instrumentation testing framework.

However, there's a **problem** - it's tricky to get this stuff to work in [Android Studio](http://developer.android.com/tools/studio/index.html).

I've been an Android Studio user ever since it first went public nearly 2 years ago. It's an awesome IDE but one consequence of it's use is that it promotes the Gradle build system to be the default choice for Android projects. This is good news for Android developers but unfortunately, getting Android Studio, Gradle, Robolectric and JUnit to all work happily together is a real pain in the rear.

Over the past year or so it's been a slowly improving picture, but now Android Studio has gone to a 1.0 release, I (and many others) have figured the time was right to try and bring these tools together.

The [android-alltest-gradle-sample](https://github.com/benwilcock/android-alltest-gradle-sample) project on GitHub  is my attempt to create a template project that can be used as a starting point for anyone who wishes to use these best of breed Android Testing tools together with Gradle and Android Studio in one project.

To use the sample, simply clone the repository (or download a ZIP), import into Android Studio, test it and then start running code. Check out the [Acknowledgements](https://github.com/benwilcock/android-alltest-gradle-sample#acknowledgements) section in the readme for further help, tips and advice (including how to execute your Robolectric tests from within Android Studio as well as from the cmdline).

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

On the plus side, I haven't used any additional gradle plugins. I've seen and tried lots but they can go out of date quite quickly.

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
