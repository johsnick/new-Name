package com.company;

import java.io.File;

class Party {
    public  Party (){
        File folder = new File("/Users/nickjohs/Documents/");
        File[] listOfFiles = folder.listFiles();
        Character[] chars = new Character[listOfFiles.length];
        int h = 0;
        for (int i = 0; i < listOfFiles.length; i++) {
            if (!listOfFiles[i].getName().startsWith(".")) {
                chars[h] = new Character(listOfFiles[i].getAbsolutePath());
                h++;
            }
        }
    }
}

