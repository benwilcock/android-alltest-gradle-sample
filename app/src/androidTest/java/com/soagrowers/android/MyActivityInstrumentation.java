package com.soagrowers.android;

import android.test.ActivityInstrumentationTestCase2;
import android.test.UiThreadTest;

import com.soagrowers.android.MyActivity;

import static org.assertj.android.api.Assertions.assertThat;

public class MyActivityInstrumentation extends ActivityInstrumentationTestCase2<MyActivity> {

  private MyActivity mActivity;

  public MyActivityInstrumentation() {
    super(MyActivity.class);
  }

  @Override
  public void setUp() throws Exception {
    super.setUp();
    mActivity = getActivity();
  }


  @UiThreadTest
  public void testMyActivityAppearsAsExpectedInitially() {
    assertThat(mActivity.my_hello_text_view).isVisible();
    assertThat(mActivity.my_hello_text_view).hasText("Hello world!");
    assertThat(mActivity.mClickMeBtn).hasText("Click Me");
  }

  @UiThreadTest
  public void testClickingClickMeButtonChangesHelloWorldText() {
    assertThat(mActivity.my_hello_text_view).hasText(R.string.hello_world);
    mActivity.mClickMeBtn.performClick();
    assertThat(mActivity.my_hello_text_view).hasText(R.string.ok_thanks);
  }
}
