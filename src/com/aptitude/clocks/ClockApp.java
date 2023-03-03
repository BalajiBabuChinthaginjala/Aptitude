package com.aptitude.clocks;

import java.util.Scanner;

public class ClockApp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("1.TO find angle between hour and minute hand");
        System.out.println("2.TO find Reflect_angle between hour and minute hand");
        System.out.println("3.To find Where the hand of a clock will Together");
        System.out.println("4.To find where the hands of a clock will opposite");
        System.out.println("5.The hour hand moved x degrees find the time");
        System.out.println("6.The hands of a clock apart beside");
        System.out.println("7.The hands of a clock apart ahead");

        int choice= sc.nextInt();
        switch (choice){
            case 1->{
                System.out.println("Enter hours");
                int hours= sc.nextInt();
                System.out.println("Enter Minutes");
                int minutes= sc.nextInt();
                System.out.println(AngleOfHourAndMinute.Angle(hours,minutes));
            }
            case 2->{
                System.out.println("Enter hours");
                int hours= sc.nextInt();
                System.out.println("Enter Minutes");
                int minutes= sc.nextInt();
                System.out.println(AngleOfHourAndMinute.reflectAngle(hours,minutes));
            }
            case 3->{
                System.out.println("Enter time in hours");
                int hour1= sc.nextInt();
                System.out.println("Enter time in hours");
                int hour2= sc.nextInt();
                System.out.println(HandsOfClocktogether.Together(hour1,hour2)+" past " + hour1);
            }
            case 4->{
                System.out.println("Enter time in hours");
                int hour1= sc.nextInt();
                System.out.println("Enter time in hours");
                int hour2= sc.nextInt();
                System.out.println(HandsOfClocktogether.Opposite_direction(hour1,hour2)+" past " + hour1);
            }
            case 5->{
                System.out.println("Enter starting time");
                double hour= sc.nextDouble();
                System.out.println("Enter the angle done by hour hand");
                double angle=sc.nextDouble();

                System.out.println(AngleOfHourAndMinute.time_usingAngle(hour,angle));

            }
            case 6->{
                System.out.println("Enter the hour1");
                double hour1=sc.nextDouble();
                System.out.println("Enter hour2");
                double hour2=sc.nextDouble();
                System.out.println("Enter minutes apart");
                double minute=sc.nextDouble();
                System.out.println("The hands will be "+minute+
                        " min.spaces apart at = "+HandsOfClocktogether.Apart_ahead(hour1,hour2,minute)+" minutes past "+hour1);

            }
            case 7->{
                System.out.println("Enter the hour1");
                double hour1=sc.nextDouble();
                System.out.println("Enter hour2");
                double hour2=sc.nextDouble();
                System.out.println("Enter minutes apart");
                double minute=sc.nextDouble();
                System.out.println("The hands will be "+minute+
                        " min.spaces apart at = "+HandsOfClocktogether.Apart_beside(hour1,hour2,minute)+" minutes past "+hour1);


            }


        }
    }
}