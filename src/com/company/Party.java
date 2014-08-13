package com.company;

import java.io.File;

class Party {
    Character[] chars;
    public  Party (){
        File folder = new File("C:\\Users\\Neoch\\Documents\\GitHub\\DM-Helper\\Party");
        File[] listOfFiles = folder.listFiles();
        chars = new Character[listOfFiles.length];
        int h = 0;
        for (int i = 0; i < listOfFiles.length; i++) {
            if (!listOfFiles[i].getName().startsWith(".")) {
                chars[h] = new Character(listOfFiles[i].getAbsolutePath());
                h++;
            }
        }
    }

    public String toString(){
        String party = "";
        for (Character c : chars){
            party += "\n" + c.toString();
        }
        return party;
    }
}

