package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int smallest = 0;
        int number = 0;
        int integers;
        System.out.print( "Введите количество целых чисел: " );
        integers = input.nextInt();
        for ( int counter = 1; counter <= integers; counter++ ) {
            System.out.print( "Введите число: " );
            number = input.nextInt();
            if ( counter == 1 )
                smallest = number;
            else if ( number < smallest )
                smallest = number;
        }
        System.out.print( "Наименьшее число: "+smallest );
    }
}
