/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Sabrina Lopez
 */

package org.example;

import java.util.Scanner;

public class App {
    public static void main( String[] args ) {

        System.out.println("\nWhat is the quote? "); //output #1

        Scanner scannedQuote = new Scanner(System.in); //scan for quote
        String quote = scannedQuote.nextLine();

        System.out.println("\nWho said it? "); //output #2

        Scanner scannedAuthor = new Scanner(System.in); //scan for author who said quote
        String author= scannedAuthor.nextLine();

        System.out.println("\n" + author + " says, " + "\"" + quote + "\""); //output #3

    }
}