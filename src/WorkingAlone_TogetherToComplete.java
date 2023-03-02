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
}
