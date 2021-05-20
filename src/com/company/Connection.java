package com.company;

import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;

public class Connection {

    private URL url;


    Connection(String url) throws MalformedURLException, UnsupportedEncodingException {
        this.url= new URL(url);

    }

    public void connect() throws Exception{
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        System.out.println(this + " " + connection.getResponseCode());
        connection.getInputStream();
    }

}
