package com.aptitude.clocks;

public class SingleProblems {
    /*How many rotations will the hour hand of a clock complete in x hours*/
    static double rotations(double hours){
        double rotations=hours/12;
        System.out.println("number of rotations ="+hours+"/12"+" =");
       return rotations;
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
    /*The clock gains x mins in one hour then the angle traversed by minute hand in y hours*/
    static double gain(int minutes,int hours){
        double requiredangle=hours*(6*(60+minutes));
        return requiredangle;

    }
    /*A clock strikes once at 1'O clock twice at 2"o clock and so on total no of strikes in x hours */
    static int strikes(int days){
        int noofstrikes=(2*(12*13/2)*days);
        return noofstrikes;
    }
    /*A wall clock takes 9 seconds in tringing at 9'o clock the time it will take in training at 11'o clock is*/
    static double prob_27(double sec1,double hour1,double hour2){

        double requiredtime=((hour1*(hour2-1))/(sec1-1));
        return requiredtime;
    }
    /*A watch becomes fast by x mins everyday by what % does it become fast */
    static double timereduce(double time){
        double requiredPercent=(time*100)/1440;//1440 is the value of number of minutes in a day(24*60)
        return requiredPercent;
    }










}
