package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BlueRayCollection BD = new BlueRayCollection();
        int choice;
        while (true){
        System.out.println("0 Quit");
        System.out.println("1 Add BlueRay to collection");
        System.out.println("2 See collection");

        choice = sc.nextInt();
        switch(choice){
            case 0:
              System.exit(0);
            case 1:
              System.out.println("What is the title");
               sc.nextLine();
               String title = sc.nextLine();
              System.out.println("Who is the director");
                String director = sc.nextLine();
              System.out.println("What year was this released");
                int release = Integer.parseInt(sc.nextLine());
              System.out.println("How much does it cost ");
              double cost = sc.nextDouble();
              BD.add(director, title,release,cost );

            case 2:
                BD.show_all();

        }
        }
    }
}

