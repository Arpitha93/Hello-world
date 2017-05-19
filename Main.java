package com.arpitha;

public class Main {

    public static void main(String[] args) {
	byte myByteValue = 20;
	int myIntValue = 10;
	short myShortValue = 50;
	long myLongTotal = 1000L + 10L * (myByteValue+myIntValue+myShortValue);
        System.out.println("long total =" +myLongTotal);
    }
}
