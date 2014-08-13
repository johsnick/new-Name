package com.company;


import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Party party = new Party();
        Scanner in = new Scanner(System.in);
        String input = "";
        while (!input.equals("q")){
            input = "";
            input = in.nextLine();
            System.out.println(input);
        }
    }

}

