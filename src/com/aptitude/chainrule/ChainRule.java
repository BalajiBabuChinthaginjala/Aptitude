package com.aptitude.chainrule;

import java.util.Scanner;

public class ChainRule {
    public static void main(String[] args) {
        // formula =p1D1H1W2 = p2D2H2W1;
        /*If x people can do W1 work in D1 days while putting in H1 hours per day,
         *  and if x people can complete W2 work in D2 days while putting in H2 hours per day,
         *   then the relationship between them will be. P1D1H1W2 = P2D2H2W1...
         */

        Scanner sc = new Scanner(System.in);
        String w1, w2, p1, p2, h1, h2, d1, d2;
        System.out.println();
        System.out.println("NOTE:**IF THE VALUES OF HOURS OR WORK ARE NOT INCLUDED PLEASE MENTION  AS  '1' NOT'0'");
        System.out.println();
        System.out.println("THE VALUES OF UNKNOWN ARE TAKEN AS 'X'  ");
        System.out.println();

        System.out.println("Enter value of work1");
        w1 = sc.nextLine();
        System.out.println("enter the value for No-persons p1");
        p1 = sc.nextLine();
        System.out.println("enter the values for No_days d1 ");
        d1 = sc.nextLine();
        System.out.println("enter the value for No_hours h1");
        h1 = sc.nextLine();

        System.out.println("Enter value of work2");
        w2 = sc.nextLine();
        System.out.println("enter the value for No-persons p2");
        p2 = sc.nextLine();
        System.out.println("enter the values for No_days d2 ");
        d2 = sc.nextLine();
        System.out.println("enter the value for No_hours h1");
        h2 = sc.nextLine();

        if (p1.equals("x")) {
            double upper = Double.parseDouble(w1) * Double.parseDouble(p2) * Double.parseDouble(h2) * Double.parseDouble(d2);
            double lower = Double.parseDouble(w2) * Double.parseDouble(h1) * Double.parseDouble(d1);
            double persons = upper / lower;
            System.out.println(persons);
        } else if (p2.equals("x")) {
            double upper = Double.parseDouble(w2) * Double.parseDouble(p1) * Double.parseDouble(h1) * Double.parseDouble(d1);
            double lower = Double.parseDouble(w1) * Double.parseDouble(h2) * Double.parseDouble(d2);
            double persons = upper / lower;
            System.out.println(persons);

        } else if (w1.equals("x")) {
            double upper = Double.parseDouble(w2) * Double.parseDouble(p1) * Double.parseDouble(h1) * Double.parseDouble(d1);
            double lower = Double.parseDouble(p2) * Double.parseDouble(h2) * Double.parseDouble(d2);
            double work = upper / lower;
            System.out.println(work);
        } else if (w2.equals("x")) {
            double upper = Double.parseDouble(w1) * Double.parseDouble(p2) * Double.parseDouble(h2) * Double.parseDouble(d2);
            double lower = Double.parseDouble(p1) * Double.parseDouble(h1) * Double.parseDouble(d1);
            double work = upper / lower;
            System.out.println(work);
        } else if (d1.equals("x")) {
            double upper = Double.parseDouble(w1) * Double.parseDouble(p2) * Double.parseDouble(h2) * Double.parseDouble(d2);
            double lower = Double.parseDouble(w2) * Double.parseDouble(h1) * Double.parseDouble(p1);
            double NO_days = upper / lower;
            System.out.println(NO_days);

        } else if (d2.equals("x")) {
            double upper = Double.parseDouble(w2) * Double.parseDouble(p1) * Double.parseDouble(h1) * Double.parseDouble(d1);
            double lower = Double.parseDouble(w1) * Double.parseDouble(h2) * Double.parseDouble(p2);
            double NO_days = upper / lower;
            System.out.println(NO_days);
        } else if (h1.equals("x")) {
            double upper = Double.parseDouble(w1) * Double.parseDouble(p2) * Double.parseDouble(h2) * Double.parseDouble(d2);
            double lower = Double.parseDouble(w2) * Double.parseDouble(d1) * Double.parseDouble(p1);
            double hours = upper / lower;
            System.out.println(hours);
        } else if (h2.equals("x")) {
            double upper = Double.parseDouble(w2) * Double.parseDouble(p1) * Double.parseDouble(h1) * Double.parseDouble(d1);
            double lower = Double.parseDouble(w1) * Double.parseDouble(d2) * Double.parseDouble(p2);
            double hours = upper / lower;
            System.out.println(hours);
        } else {
            System.out.println("AT LEAST ONE VALUE MUST BE 'X' ");
        }
        sc.close();
    }
}

