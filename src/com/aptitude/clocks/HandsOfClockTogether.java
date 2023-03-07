package com.aptitude.clocks;

public class HandsOfClockTogether {
    /*To find Where the hand of a clock will Together*/
    static double Together(double hours1){
        double hands_together=(60*(hours1*5))/55;
        return hands_together;
    }
    /*To find where the hands of a clock will opposite*/
    static double Opposite_direction(double hour1,double hour2){
        if (hour1<=6){
            double hands_opposite=(60*(30+hour1*5))/55;
            return hands_opposite;
        }else{
            double hands_opposite= (60 * (30 - (hour1 * 5))) / 55;
            return -hands_opposite;
        }
    }
    /*The hands of a clock apart*/
     static double Apart_beside(double hour1,double hour2,double minute){
         double spaces=(5*hour1);
         System.out.println("At "+hour1+" clock, the minute hand is "+spaces+" min spaces behind the hour class");
         System.out.println("in this case the,the minute hand has to gain "+spaces+"-"+minute+" = "+(spaces-minute)+ " minute spaces");
         System.out.println("55 minutes are gained in 60 minutes");
         double angle=6*minute;
         double time=((30*(hour1)-angle)*2)/11;
         System.out.println((spaces-minute)+" minutes are gained in 60/55*"+(spaces-minute)+"="+time+" min");
         return time;
     }
    static double Apart_ahead(double hour1,double hour2,double minute){
        double spaces=(5*hour1);
        System.out.println("At "+hour1+" clock, the minute hand is "+spaces+" min spaces behind the hour class");
        System.out.println("in this case the,the minute hand has to gain "+spaces+"-"+minute+" = "+(spaces+minute)+ " minute spaces");
        System.out.println("55 minutes are gained in 60 minutes");
        double angle=6*minute;
        double time=(((30*(hour1))+angle)*2)/11;
        System.out.println((spaces-minute)+" minutes are gained in 60/55*"+(spaces+minute)+"="+time+" min");
        return time;
    }
}
