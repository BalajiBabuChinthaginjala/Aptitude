package com.aptitude.chainrule;

import java.util.Scanner;

public class ChainRuleApp {
    public static void main(String[] args) {
       // System.out.println(Formula.adding());
        System.out.println("1.To find price for single");
        System.out.println("2.To find work or people or time or hours");
        System.out.println("3.if m1 men or w1 women can do a work in d1 days ," +
                "then in how many days will m2 men and w2 women do the same work");
        System.out.println("4.m1 men or w1 women can earn x money how much will m2 men and w2 women earn");
        Scanner sc=new Scanner(System.in);
        int choice=sc.nextInt();
        switch (choice){
            case 1->{
                System.out.println("Enter the amount of items");
                double items=sc.nextDouble();
                System.out.println("Enter the price of items");
                double price=sc.nextDouble();
                System.out.println("Enter the number of items to find price");
                double num_of_items=sc.nextDouble();
                System.out.println(Formula.ToFindPrice(items,price,num_of_items));
            }
            case 2-> ChainRule.main(args);
            case 3->{
                //double m1,double w1,double d1,double m2,double w2
                System.out.println("Enter number of mens");
                double m1=sc.nextDouble();
                System.out.println("Enter number of women");
                double w1= sc.nextDouble();
                System.out.println("Enter that the number of days working either men or women");
                double d1= sc.nextDouble();
                System.out.println("Enter the number of men");
                double m2=sc.nextDouble();
                System.out.println("Enter the number of women");
                double w2=sc.nextDouble();
                System.out.println(Formula.type1(m1,w1,d1,m2,w2));
            }
            case 4->{
                System.out.println("Enter number of mens");
                double m1= sc.nextDouble();
                System.out.println("Enter number of women");
                double w1=sc.nextDouble();
                System.out.println("Enter the total money get");
                double amount=sc.nextDouble();
                System.out.println("Enter the number of mens");
                double m2=sc.nextDouble();
                System.out.println("Enter the number of women");
                double w2= sc.nextDouble();
                System.out.println(Formula.priceforsingle(m1,w1,amount,m2,w2));
            }
        }
    }
}
