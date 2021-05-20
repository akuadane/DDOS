package com.company;

import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Connection {

    private URL url;


    Connection(String url) throws MalformedURLException {
        this.url= new URL(url);

    }

    public void connect(String threadName){

        try{
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            System.out.println("Response from "+url.toString() + " to "+threadName+"\t-> " + connection.getResponseCode());
            connection.getInputStream();
        }
        catch (Exception e){
            System.out.println("Couldn't Connect to server! Error Code: ");
        }

    }

}
