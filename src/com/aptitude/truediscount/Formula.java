package com.aptitude.truediscount;

public class Formula {
    static  double pw_using_amount(double amount,double r,double t){
     double pw=(100*amount)/(100+(r*t));
     return  pw;
   }
   static double pw_using_td(double td,double r,double t){
     double pw=(100*td)/(r*t);
     return pw;
   }
   static double td_using_pw(double pw,double r,double t){
     double td=(pw*r*t)/100;
     return td;
   }
  static double td_using_amount(double amount,double r,double t){
    double td=(amount*r*t)/(100+(r*t));
    return td;
  }
  static double sum_using_si_td(double si,double td){
     double sum=(si*td)/(si-td);
     return sum;
  }
  static double si_on_td(double si,double td){
     double si_on_td=si-td;
     return si_on_td;
  }
  static double si(double p,double t,double r){
        double si=(p*t*r)/100;
        return si;
  }
  static double rate(double si,double p,double t){
        double rate=(si*100)/(p*t);
        return rate;
  }



}
