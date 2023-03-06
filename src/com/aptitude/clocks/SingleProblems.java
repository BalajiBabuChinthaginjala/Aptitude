package com.aptitude.clocks;

public class SingleProblems {
    /*How many rotations will the hour hand of a clock complete in x hours*/
    static double rotations(double hours){
        double rotations=hours/12;
        System.out.println("number of rotations ="+hours+"/12"+" =");
       return rotations;
    }
    /*To find angle of minute hand when the clock starting to till the required time*/
    static double Angle(double minutes){
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
    /*How many times the hands of a clock coincide/Opposite in x days*/
    static double coincide(double hours){
        double coincide=((hours/12)*11);
        System.out.println("the number of times the hands of a clock coincide in "+hours+" days is: ");
        return coincide;

    }
    /*How many times the hands of a clock Straight/right angle in x days*/
    static double straight(double hours){
        double straight=(hours/12)*22;
        System.out.println("the number of times the hands of a clock Straight/right angle in "+hours+" days is: ");
        return straight;

    }
    /*in every x hours the time increse by y mins */
    static double  timeDiffer(double hours, double minutes){
        double timeGained=hours*minutes;
        return timeGained ;
    }
    /*How much does a watch lose per day, if its hands coincide every x minutes*/
    static double loss(double minutes){
        double spaces=65.45454545;
        System.out.println("60 mins Spaces are covered in : "+ spaces);
        double loss=(spaces-minutes);
        System.out.println("Loss in "+minutes+" is :"+loss+" mins");
        double lossinoneday=((loss)*(1/minutes)*(24*60));
        return lossinoneday;
    }






}
