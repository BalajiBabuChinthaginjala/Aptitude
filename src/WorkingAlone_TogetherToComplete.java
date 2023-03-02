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

}
