package com.company;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;

public class Attacker extends Thread{

    String url;
    String threadName;
    Connection connection;

    Attacker(String url, String threadName){
        this.url = url;
        this.threadName= threadName;

        try {
            connection= new Connection(this.url);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        while(true){
            try {
                connection.connect(this.threadName);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
