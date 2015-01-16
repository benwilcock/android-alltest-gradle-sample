package com.soagrowers.android;

import android.test.ActivityInstrumentationTestCase2;

import com.soagrowers.android.MyActivity;

import static org.assertj.android.api.Assertions.assertThat;

public class MyActivityIT extends ActivityInstrumentationTestCase2<MyActivity> {

  private MyActivity mActivity;

  public MyActivityIT() {
    super(MyActivity.class);
  }

  @Override
  public void setUp() throws Exception {
    super.setUp();
    mActivity = getActivity();
  }

  public void testWhenActivityCreatedHelloTextViewIsVisible() throws Exception {
    assertThat(mActivity.my_hello_text_view).isVisible();
    assertThat(mActivity.my_hello_text_view).hasText("Hello world!");
  }
}
