package edu.miracosta.cs113.hw1.lab2;

/**
 * Martin Dorobczynski
 * CS 113
 * 1/30/2017
 *
 * Lab 2 - PowerofTwo
 *
 * Method that checks if a number is a power of town
 * Tester program that shows my method works correctly
 */

public class Main
{
    public static void main(String args[])
    {
        System.out.printf("is the integer %d a power of Two? %b%n", 1, isPowerofTwo(1));
        System.out.printf("is the integer %d a power of Two? %b%n", 2, isPowerofTwo(2));
        System.out.printf("is the integer %d a power of Two? %b%n", 3, isPowerofTwo(3));
        System.out.printf("is the integer %d a power of Two? %b%n", 4, isPowerofTwo(4));
        System.out.printf("is the integer %d a power of Two? %b%n", 7, isPowerofTwo(7));
        System.out.printf("is the integer %d a power of Two? %b%n", -1, isPowerofTwo(-1));
    }

    public static boolean isPowerofTwo(int number)
    {
        return (number & (number -1)) == 0;
    }
}