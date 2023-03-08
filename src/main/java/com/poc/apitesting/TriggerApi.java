package com.poc.apitesting;

public class TriggerApi {

    public static void main(String[] args) {
        System.out.println("===============Automated Testing Started");
        DemoIntegrationTest.shouldCallGetXXX();
        DemoIntegrationTest.shouldCallPOSTXXX();
        DemoIntegrationTest.shouldCallPUTXXX();
        DemoIntegrationTest.shouldCallDELETEXXX();
        System.out.println("===============Automated Testing Finished");
    }
}
