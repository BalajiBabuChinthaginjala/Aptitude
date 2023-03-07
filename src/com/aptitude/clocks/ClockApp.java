package com.aptitude.clocks;

import java.util.Date;
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
            System.out.println("15.The clock gains x mins in one hour then the angle traversed by minute hand in y hours");
            System.out.println("16.A clock strikes once at 1'O clock twice at 2\"o clock and so on total no of strikes in x hours ");
            System.out.println("17.A wall clock takes 9 seconds in tringing at 9'o clock the time it will take in training at 11'o clock is");
            System.out.println("18.A watch becomes fast by x mins everyday by what % does it become fast");


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
                    System.out.println("Enter start time in hours");
                    int hour1= sc.nextInt();
                    System.out.println(HandsOfClockTogether.Together(hour1)+" past " + hour1);
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
                    System.out.println(AngleOfHourAndMinute.AngleOfMinute(minutes));
                }
                case 10->{
                    System.out.println("Enter time in hours");
                    double hours=sc.nextDouble();
                    System.out.println(AngleOfHourAndMinute.AngleOfHour(hours));
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
                    System.out.println("Enter that how many hours after the time you need to find ");
                    double endTime=sc.nextDouble();
                    System.out.println("The actual time is: "+( StarTime+endTime));
                    System.out.println("The time gained by the watch= "+SingleProblems.timeDiffer(hours,minutes));
                    System.out.println("the total time is: "+(int)(StarTime+endTime)+"."+(int)SingleProblems.timeDiffer(hours,minutes));
                }
                case 14->{
                    System.out.println("enter loss of minutes");
                    double minutes=sc.nextDouble();
                    System.out.println("The total loss in one day is: "+ SingleProblems.loss(minutes));
                }
                case 15->{
                    System.out.println("Number of minutes gain in one hour");
                    int minutes=sc.nextInt();
                    System.out.println("Number of hours to find angle");
                    int hours=sc.nextInt();
                    System.out.println("The angle is "+SingleProblems.gain(minutes,hours));
                }
                case 16->{
                    System.out.println("enter no of days");
                    int days=sc.nextInt();
                    System.out.println(SingleProblems.strikes(days));

                }
                case 17->{
                    System.out.println("Enter no of seconds tringing");
                    double sec1=sc.nextInt();
                    System.out.println("enter no of hours that start tringing");
                    double hour1=sc.nextInt();
                    System.out.println("Enter the that tringing up to");
                    double hour2= sc.nextInt();
                    System.out.println(SingleProblems.prob_27(sec1,hour1,hour2));
                }
                case 18->{
                    System.out.println("Enter number of minutes that fast");
                    double minute= sc.nextDouble();
                    System.out.println("Required  percentage= "+SingleProblems.timereduce(minute));
                }
            }
    }
}

