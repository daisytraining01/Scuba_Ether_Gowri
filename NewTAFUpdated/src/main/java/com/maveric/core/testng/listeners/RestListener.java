package com.maveric.core.testng.listeners;

import io.restassured.RestAssured;
import org.testng.ISuite;
import org.testng.ISuiteListener;

public class RestListener implements ISuiteListener {
    @Override
    public void onStart(ISuite suite) {

        RestAssured.filters(new RestLogFilter());
    }

	@Override
	public void onFinish(ISuite arg0) {
		// TODO Auto-generated method stub
		
	}


}
