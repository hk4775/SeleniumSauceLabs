package com.aa;

public class HomePage {
    static String url = "https://www.aa.com";
    static  String title = "American Airlines - Airline tickets and cheap flights at AA.com";

    public void goTo() {
        Browser.goTo(url);
    }

    public boolean isAt() {
        return Browser.title().equals(title);
    }
}
