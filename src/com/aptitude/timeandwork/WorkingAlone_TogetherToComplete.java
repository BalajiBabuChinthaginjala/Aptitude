package com.aptitude.timeandwork;

public class WorkingAlone_TogetherToComplete {
    /*
     * If A and B can do a piece of work in X and Y days respectively while working
     * alone, they will together take time to complete it.
     */
    static double A_BTogether(double x, double y) {

        return x * y / (x + y);
    }
    /*
     * If A , B , C can do a piece of work in X , Y , Z days respectively while
     * working alone , they will together take time to finish it
     */
    static double A_B_CTogether(double x, double y, double z) {
        return x * y * z / ((x * y) + (y * z) + (z * x));

    }
    /*
     * If A can finish work in X days and B in Y days and A, B and C together in S
     * day then :
     *
     * C can finish work alone in
     *
     * B + C can finish in time
     *
     * A + C can finish in time
     */

    static double c_work(double x, double y, double z) {
        double c_work = (x * y * z) / ((x * y) - (y * z) - (z * x));
        return c_work;

    }

    static double B_C_work(double x, double y, double z) {
        double B_C_work = (z * x) / (x - z);
        return B_C_work;
    }

    static double A_C_work(double x, double y, double z) {

        double A_C_work = (z * y) / (y - z);
        return A_C_work;
    }

    static double A_B_work(double x, double y, double z) {
        double A_B_work = x * y / (x + y);
        return A_B_work;
    }

    /*A can complete  X piece of work in 'n1' days and
    B-> Y piece of work in 'n2' days in how many days both A and B can complete*/
    static double A_BWork(double x,double d1,double y,double d2){
        double A_oneWork=(x)*d1;
        double B_oneWork=(y)*d2;
        double a_bTogether=WorkingAlone_TogetherToComplete.A_BTogether(A_oneWork,B_oneWork);
        return (a_bTogether);
    }

    /*A can complete  X piece of work in 'n1' days and
    B-> Y piece of work in 'n2' days in how many days both A and B can complete z piece of work */
    static double Work(double x,double d1,double y,double d2,double z){
        double AOneDayWork=x/d1;
        double BOneDayWork=y/d2;
        double totalWorkDone=z/(AOneDayWork+BOneDayWork);
        return totalWorkDone;
    }

}
