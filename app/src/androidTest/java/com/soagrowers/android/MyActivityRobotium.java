package com.soagrowers.android;

import android.test.ActivityInstrumentationTestCase2;

import com.robotium.solo.Solo;

import junit.framework.Assert;

/**
 * Created by Ben on 20/01/2015.
 */
public class MyActivityRobotium extends ActivityInstrumentationTestCase2<MyActivity> {

  Solo solo;

  public MyActivityRobotium() {
    super(MyActivity.class);
  }

  @Override
  public void setUp() throws Exception {
    solo = new Solo(getInstrumentation(), getActivity());
  }

  @Override
  public void tearDown() throws Exception {
    solo.finishOpenedActivities();
  }

  public void testMyActivityWithRobotium() {
    // check that we have the right activity
    solo.assertCurrentActivity("wrong activity", MyActivity.class);
    Assert.assertTrue(solo.searchText(getActivity().getString(R.string.hello_world)));

    // Click a button which will start a new Activity
    // Here we use the ID of the string to find the right button
    solo.clickOnButton(solo.getString(R.string.click_me));
    Assert.assertTrue(solo.waitForText(getActivity().getString(R.string.ok_thanks)));

    // Validate that the Activity is the correct one
    solo.assertCurrentActivity("wrong activity", MyActivity.class);
  }
}
