package com.aptitude.timeandwork;

public class Leaving {
    /*
     * A and B can do alone a job in x days and y days. They began the work together
     * but z days before the completion of job, A leaves off. In how many days will
     * the work be completed?
     */
    static double leaving_A(double x, double y, double z) {
        return (y * (x + z)) / (x + y);
    }
    /*
     * A and B can do alone a job in x days and y days. They began the work together
     * but z days before the completion of job, B leaves off. In how many days will
     * the work be completed?
     */

    static double leaving_B(double x, double y, double z) {

        return (x * (y + z)) / (x + y);
    }
    /*A and B and C can do alone a job in x days and y days and Z days. They began the work together
     * but z days before the completion of job, A leaves off. In how many days will
     * the work be completed?*/
    static double leaving(double x, double y, double z, double d) {
      double lcm= Lcm.lcmThree(x,y,z);
      double WorkDoneByA=(lcm/x);
      double WorkDoneByB=(lcm/y);
      double WorkDoneByC=(lcm/z);
      double totalWorkDone=(lcm+(d*WorkDoneByA))/(WorkDoneByA=WorkDoneByB+WorkDoneByC);
      return totalWorkDone;


    }

}
