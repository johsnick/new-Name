package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Character {
    String name;
    int level;
    public Character(String filename){
        File file = new File(filename);
        Scanner in = null;
        try {
            in = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        name = in.nextLine();
        level= in.nextInt();
    }
    public String toString(){
        return "Name: " + name +
                "\nLevel:  " + level;
    }
}