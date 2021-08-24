package com.co.pa;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        StringBuilder result = new StringBuilder();
        Scanner scanner = new Scanner(System.in);
	    int number = scanner.nextInt();

	    for(int i = 0; i < number; i++){
	        String row = getRow((i + 1), number);
	        result.append(row).append("\n");
        }

	    System.out.println(result);
    }

    public static String getRow(int index, int number){
        StringBuilder result = new StringBuilder();
        int difference = number - index;

        if(difference > 0){
            for(int i = 0; i < difference; i++){
                result.append(" ");
            }
        }

        for(int i = 0; i < index; i++){
            result.append("#");
        }

        return result.toString();
    }
}
