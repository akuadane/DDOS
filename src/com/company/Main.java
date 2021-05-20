package com.company;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;

public class Main {

    public static void main(String[] args) {
	// write your code here
        try {
            Connection connection = new Connection("https://ynccc.org/");
            connection.connect();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
