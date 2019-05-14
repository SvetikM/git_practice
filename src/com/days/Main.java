

package com.days;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {

//	Введите номер дня недели и выведите название этого дня.

    public static void main(String[] args) {

       Scanner in = new Scanner(System.in);
        System.out.print("Input a number of day: ");
        int num = in.nextInt();

        switch (num) {

            case 1:
                System.out.println("the day of the week is Sunday");
                break;
            case 2:
                System.out.println("the day of the week is Monday");
                break;
            case 3:
                System.out.println("the day of the week is Tuesday");
                break;
            case 4:
                System.out.println("the day of the week is Wednesday");
                break;
            case 5:
                System.out.println("the day of the week is Thursday");
                break;
            case 6:
                System.out.println("the day of the week is Friday");
                break;
            case 7:
                System.out.println("the day of the week is Saturday");
                break;
            default:
                System.out.println("the number is incorrect");
        }

//	Группа людей участвует в марафоне, их имена и время за которое они пробежали марафон вы можете увидеть ниже.
        String[] names = {"Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex", "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda", "Aaron", "Kate"};
        int[] time = {341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299, 343, 317, 265};


        for (int i = names.length -1 ; i > 0 ; i--) {
            for (int j = 0; j < i ; j++) {
                if (time[j] > time[j+1]){
                    int tempTime = time[j];
                    time[j] = time[j+1];
                    time[j+1] = tempTime;
                    String tempName = names[j];
                    names[j] = names[j+1];
                    names[j+1] = tempName;
                }
            }
        }



        for (int i = 0; i < names.length; ) {
            System.out.printf("name: %s  time: %d  \n", names[i], time[i]);
            i++;
        }

        Scanner in1 = new Scanner(System.in);
        System.out.print("Input a number of place: ");
        int place = in.nextInt();
        System.out.printf("name: %s  time: %d  \n", names[place-1], time[place-1]);


//	Выведите в консоль контур ромба из «*».

        System.out.println();Scanner in2 = new Scanner(System.in);
        System.out.print("Input a number *: ");
        int n = in1.nextInt();

        int xMax = 2*n-1;//полная ширина фигуры
        int yMax = 2*n-1;//полная высота фмгуры, y=kx+b формула прямой

        for(int x = 0; x < xMax; x++) {

            for(int y = 0; y < yMax; y++) {

                if(y==yMax/2-x||y==x-yMax/2||y==x+yMax/2||y==xMax-x+xMax/2-1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }



    }


}


