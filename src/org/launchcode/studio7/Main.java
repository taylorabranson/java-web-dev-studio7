package org.launchcode.studio7;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args){

        // TODO: Declare and initialize a CD and a DVD object.

        ArrayList<String> cdData = new ArrayList<>(Arrays.asList("Hello, world.", "Hey, world", "What's up everybody"));
        CD myCoolCd = new CD("Quotes Disc", 700, 0, "CD", cdData);

        ArrayList<String> dvdData = new ArrayList<>(Arrays.asList("What's up doc?", "Yo yo yo", "Whoopsie"));
        DVD myCoolDvd = new DVD("Quotes Disc", 700, 0, "CD", dvdData);

        // TODO: Call each CD and DVD method to verify that they work as expected.

        myCoolCd.readData();
        myCoolDvd.readData();

        myCoolCd.spinDisc();
        myCoolDvd.spinDisc();
    }
}
