package com.soagrowers.android;

import com.soagrowers.android.MyActivity;
import com.soagrowers.android.RobolectricGradleTestRunner;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.annotation.Config;

import static org.assertj.android.api.Assertions.assertThat;

@RunWith(RobolectricGradleTestRunner.class)
@Config(emulateSdk = 18, reportSdk = 18)
public class MyActivityTest {

  private MyActivity mActivity;

  @Before
  public void setup() {
    mActivity = Robolectric.buildActivity(MyActivity.class).create().get();
  }

  @Test
  public void testWhenActivityCreatedHelloTextViewIsVisible() throws Exception {
    assertThat(mActivity.my_hello_text_view).isVisible();
    assertThat(mActivity.my_hello_text_view).hasText("Hello world!");
  }
}
