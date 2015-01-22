package com.soagrowers.android;

import org.junit.runners.model.InitializationError;
import org.robolectric.AndroidManifest;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;
import org.robolectric.res.Fs;

public class RobolectricGradleTestRunner extends RobolectricTestRunner {
  private static final int MAX_SDK_SUPPORTED_BY_ROBOLECTRIC = 18;

  public RobolectricGradleTestRunner(Class<?> testClass) throws InitializationError {
    super(testClass);
  }

  @Override
  protected AndroidManifest getAppManifest(Config config) {
    //String appRoot = "D:\\TmpCodingProjects\\TripComputer\\app\\src\\main\\";
    String appRoot = "../app/src/main/";
    String manifestPath = appRoot + "AndroidManifest.xml";
    String resDir = appRoot + "res";
    String assetsDir = appRoot + "assets";
    AndroidManifest manifest = createAppManifest(Fs.fileFromPath(manifestPath),
      Fs.fileFromPath(resDir),
      Fs.fileFromPath(assetsDir));

	// If you change the package - don't forget to change the build.gradle and the AndroidManifest.xml
    manifest.setPackageName("com.soagrowers.android");
    // Robolectric is already going to look in the  'app' dir ...
    // so no need to add to package name
    return manifest;
  }

    /*@Override
    protected AndroidManifest getAppManifest(Config config) {
        String manifestProperty = "../app/src/main/AndroidManifest.xml";
        String resProperty = "../app/src/main/res";
        return new AndroidManifest(Fs.fileFromPath(manifestProperty), Fs.fileFromPath(resProperty)) {
            @Override
            public int getTargetSdkVersion() {
                return MAX_SDK_SUPPORTED_BY_ROBOLECTRIC;
            }
        };
    }*/
}
