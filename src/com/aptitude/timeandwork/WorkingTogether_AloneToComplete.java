package com.aptitude.timeandwork;

public class WorkingTogether_AloneToComplete {
    /*
     * A and B complete a work in x days and B and C complete in y days and A and
     * C complete in z days how many days A and B and C together to complete
     */

    static double abc_Together(double x, double y, double z) {
        double total_work = (((1 / x) + (1 / y) + (1 / z))) / 2;
        return 1 / total_work;
    }

    /*
     * A and B complete a work in x days and B and C complete in y days and A and
     * C complete in z days how many days B alone to complete
     */
    static double b_alone(double x, double y, double z) {
        double B_work = ((1 / x) + (1 / y) - (1 / z)) / 2;
        return 1 / B_work;
    }

    /*
     * A and B complete a work in x days and B and C complete in y days and A and
     * C complete in z days how many days A alone to complete
     */
    static double a_alone(double x, double y, double z) {
        double A_work = (((1 / x) - (1 / y) + (1 / z))) / 2;

        return Math.round(1 / A_work);

    }
    /*
     * A and B complete a work in x days and B and C complete in y days and A and C
     * complete in z days how many days C alone to complete
     */
    static double c_alone(double x, double y, double z) {
        double C_Work = ((-(1 / x) +(1 / y) + (1 / z))) / 2;

        return Math.round(1 / C_Work);

    }
}
