public class Leaving {
    /*
     * A and B can do alone a job in x days and y days. They began the work together
     * but z days before the completion of job, A leaves off. In how many days will
     * the work be completed?
     */
    static double leaving_A(double x, double y, double z) {
        double time = (y * (x + z)) / (x + y);
        return time;
    }
    /*
     * A and B can do alone a job in x days and y days. They began the work together
     * but z days before the completion of job, B leaves off. In how many days will
     * the work be completed?
     */

    static double leaving_B(double x, double y, double z) {
        double time = (x * (y + z)) / (x + y);
        return time;
    }
    /*A and B and C can do alone a job in x days and y days and Z days. They began the work together
     * but z days before the completion of job, A leaves off. In how many days will
     * the work be completed?*/
    static double leaving() {
        //d + t + z = d + [(1/x + 1/y + 1/z - d/x) x (1/y + 1/z)] / [(1/y + 1/z)]

        return 0;
    }

}
