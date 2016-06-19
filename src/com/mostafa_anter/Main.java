package com.mostafa_anter;

import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
	// test code by insert some names here

        TreeSet<Name> mNames = new TreeSet<>();

        mNames.add(Util.createNameObject("عبدالرحمن"));
        mNames.add(Util.createNameObject("مصطفى"));
        mNames.add(Util.createNameObject("هانى"));
        mNames.add(Util.createNameObject("احمد"));

        mNames.add(Util.createNameObject("باسم"));



        for (Name name :
             mNames) {
            System.out.println(name.getName());
        }




    }
}
