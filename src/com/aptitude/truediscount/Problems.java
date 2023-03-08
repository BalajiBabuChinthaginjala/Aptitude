package com.aptitude.truediscount;

public class Problems {
    static double prob1(double amount,double r,double t){
        double sol=Formula.pw_using_amount(amount,r,t);
        return sol;
    }
    static double prob2_5(double td, double r, double t){
        double pw=Formula.pw_using_td(td,r,t);
        double sum=pw+td;
        return sum;
    }
    static double prob3(double sum,double td,double time){
        double pw=sum-td;
        double rate=Formula.rate(td,pw,time);
        return rate;
    }
    //((100*td)/(pw*time))
    static double prob4_20(double sum,double td,double rate){
        double pw=sum-td;
        double time=((100*td)/(pw*rate));
        return (time*12);
    }

    static double prob6(){

        return 0;
    }
    static double prob7_18(double si,double td){
        double sum=Formula.sum_using_si_td(si,td);
        return sum;
    }
    static double prob8_17_19(double amount,double td,double time){
        double originalvalue=amount-td;
        double si=td*time;
        double tdonammount=originalvalue+si;
        double value=(si/tdonammount)*amount;
        return value;
    }
    static double prob9(double amount1,double amount2,double rate,double time){
        double pw=Formula.pw_using_amount(amount2,rate,time);
        if (amount1>pw){
            System.out.println(pw+" is better");
            return pw;
        }else{
            System.out.println(amount1+" is better");
            return amount1;
        }
    }
    static double prob10_13_14(double cp,double sp,double rate,double time){
        double pw=cp+((rate/100)*cp);
        double td=sp-pw;
        double roi=Formula.rate(td,pw,time);
        return roi;
    }
    static double prob11(double pw,double rate){
        double amount=pw/2;
        double sum=Formula.pw_using_amount(amount,rate,0.5)+Formula.pw_using_amount(amount,rate,1);
        return sum;
    }
    static double prob12(double amount,double rate,double noofmonths){
        double sum=Formula.pw_using_amount(amount,rate,noofmonths/12);
        return sum;
    }
    static double prob15_16(double amount1,double time1,double amount2,double time2,double rate){
        double pw1=Formula.pw_using_amount(amount1,rate,time1);
        System.out.println(pw1);
        double pw2=Formula.pw_using_amount(amount2,rate,time2);
        System.out.println(pw2);
        double value=pw1-pw2;
        return value;
    }

}
