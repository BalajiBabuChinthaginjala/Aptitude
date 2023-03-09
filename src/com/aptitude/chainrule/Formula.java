package com.aptitude.chainrule;

public class Formula {
    /* if m1 men or w1 women can do a work in d1 days ,then in how many days will m2 men and w2 women do the same work*/
    static double type1(double m1,double w1,double d1,double m2,double w2){
        double m_1day_work=1/(m1*d1);
        double w_1day_work=1/(w1*d1);
        double work_done=((m2*m_1day_work)+(w2*w_1day_work));

        return 1/work_done;
    }
    /*To Find price*/
    static double ToFindPrice(double x,double y,double a){
        double SinglePrice=y/x;
        double required_price=SinglePrice*a;
        return required_price;
    }
    static double priceforsingle(double m1,double w1,double amount,double m2,double w2){
        double m1oneday=amount/m1;
        double w1oneday=amount/w1;
        double m2andw2amount=((m2*m1oneday)+(w2*w1oneday));
        return m2andw2amount;
    }
    static double adding(double m1,double d1,double m2,double d2){
        double ans=(m1*(d1-d2))/(m1+m2);
        return ans;

    }
    static double leaving(double m1,double d1,double m2,double d2){
        double ans=(m1*(d1-d2))/(m1-m2);
        return ans;

    }


}
