package com.aptitude.truediscount;

public class Formula {
    /*To find pw using amount*/
    static  double pw_using_amount(double amount,double r,double t){
     double pw=(100*amount)/(100+(r*t));
     return  pw;
   }
   /*To find pw using Td*/
   static double pw_using_td(double td,double r,double t){
     double pw=(100*td)/(r*t);
     return pw;
   }
   /*To find Td using pw*/
   static double td_using_pw(double pw,double r,double t){
     double td=(pw*r*t)/100;
     return td;
   }
   /*To find Td using amount*/
  static double td_using_amount(double amount,double r,double t){
    double td=(amount*r*t)/(100+(r*t));
    return td;
  }
  /*TO find amount using si and td*/
  static double sum_using_si_td(double si,double td){
     double sum=(si*td)/(si-td);
     return sum;
  }
  /*Si on Td =Si-td*/
  static double si_on_td(double si,double td){
     double si_on_td=si-td;
     return si_on_td;
  }
  /*To find si using p,t,r*/
  static double si(double p,double t,double r){
        double si=(p*t*r)/100;
        return si;
  }
  /*To find rate of interest using si,principle and time*/
  static double rate(double si,double p,double t){
        double rate=(si*100)/(p*t);
        return rate;
  }
}
