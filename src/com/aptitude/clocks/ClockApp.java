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
            System.out.println("8.How many rotations will the hour hand of a clock complete in x hours");
            System.out.println("9.To find angle of minute hand when the clock starting to till the required time");
            System.out.println("10.To find angle of hour hand when the clock starting to till the required time");
            System.out.println("11.How many times the hands of a clock coincide/opposite in x hours");
            System.out.println("12.How many times the hands of a clock Straight/right angle in x hours");
            System.out.println("13.in every x hours the time increse by y mins");
            System.out.println("14.How much does a watch lose per day, if its hands coincide every x minutes");




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
                    System.out.println(HandsOfClockTogether.Together(hour1,hour2)+" past " + hour1);
                }
                case 4->{
                    System.out.println("Enter time in hours");
                    int hour1= sc.nextInt();
                    System.out.println("Enter time in hours");
                    int hour2= sc.nextInt();
                    System.out.println(HandsOfClockTogether.Opposite_direction(hour1,hour2)+" past " + hour1);
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
                            " min.spaces apart at = "+ HandsOfClockTogether.Apart_ahead(hour1,hour2,minute)+" minutes past "+hour1);

                }
                case 7->{
                    System.out.println("Enter the hour1");
                    double hour1=sc.nextDouble();
                    System.out.println("Enter hour2");
                    double hour2=sc.nextDouble();
                    System.out.println("Enter minutes apart");
                    double minute=sc.nextDouble();
                    System.out.println("The hands will be "+minute+
                            " min.spaces apart at = "+ HandsOfClockTogether.Apart_beside(hour1,hour2,minute)+" minutes past "+hour1);
                }
                case 8->{
                    System.out.println("enter the number of hours :");
                    double hours=sc.nextInt();
                    System.out.println(SingleProblems.rotations(hours));
                }
                case 9->{
                    System.out.println("Enter time in minutes");
                    double minutes=sc.nextDouble();
                    System.out.println(SingleProblems.Angle(minutes));
                }
                case 10->{
                    System.out.println("Enter time in hours");
                    double hours=sc.nextDouble();
                    System.out.println(SingleProblems.AngleOfHour(hours));
                }
                case 11->{
                    System.out.println("Enter number of hours");
                    double coincide=sc.nextDouble();
                    System.out.println(SingleProblems.coincide(coincide));
                }
                case 12->{
                    System.out.println("Enter number of hours");
                    double straight=sc.nextDouble();
                    System.out.println(SingleProblems.straight(straight));

                }
                case 13->{
                    System.out.println("enter the total numbers of hours the time gained");
                    double hours= sc.nextDouble();
                    System.out.println("enter the total time that gained for every hour");
                    double minutes=sc.nextDouble();
                    System.out.println("enter the starting time");
                    double StarTime=sc.nextDouble();
                    System.out.println("Enter the end time ");
                    double endTime=sc.nextDouble();
                    System.out.println("The actual time is: "+( StarTime+endTime));
                    System.out.println("The time gained by the watch= "+SingleProblems.timeDiffer(hours,minutes));
                    System.out.println("the total time is: "+ (StarTime+endTime)+"."+SingleProblems.timeDiffer(hours,minutes));
                }
                case 14->{
                    System.out.println("enter loss of minutes");
                    double minutes=sc.nextDouble();
                    System.out.println("The total loss in one day is: "+ SingleProblems.loss(minutes));
                }
        }
    }
}

