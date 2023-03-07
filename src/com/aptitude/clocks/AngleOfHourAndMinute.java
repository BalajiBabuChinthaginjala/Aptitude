package com.aptitude.clocks;

public class AngleOfHourAndMinute {
    /*TO find angle between hour and minute hand*/
    static double Angle(int hours,int minutes){

        double angle=((30*hours)-((5.5)*minutes));
        if (angle<0){
            return -angle;
        }else {
            return angle;
        }
    }
    /*.TO find Reflect_angle between hour and minute hand*/
    static double reflectAngle(int hours,int minutes){

        return 360-AngleOfHourAndMinute.Angle(hours,minutes);
    }
    /*The hour hand moved x degrees find the time*/
    static double time_usingAngle(double hour,double angle){
        System.out.println("Time taken by the hour hand to move 360 degree=12 hours");
        System.out.println("Time taken by the hour hand to move " + angle +"is");
        double time=((12*angle)/360);
        double total_time=(hour+time);
        System.out.println(" = (12*"+angle+")/360 ="+time);
        System.out.println("Required time is " + time + " hrs ahead of "+hour+" is : "+hour+"+"+time);
        return total_time;
    }
    /*To find angle of minute hand when the clock starting to till the required time*/
    static double AngleOfMinute(double minutes){
        double angle=6*minutes ;
        System.out.println("Angle traced by the minute hand in " + minutes + " is: ");
        return angle;
    }
    /*To find angle of hours hand when the clock starting to till the required time*/
    static double AngleOfHour(double hours){
        double angle=30*(hours) ;
        System.out.println("Angle traced by the minute hand in " + hours + " is: ");
        return angle;
    }



}
