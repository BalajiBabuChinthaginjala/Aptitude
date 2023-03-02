public class SingleProblems {
    /*
     * A is K times as good a worker as B and takes X days less than B to finish the
     * work. Then the amount of time required by A and B working together is
     * time-work k*x/k^2-1 days.
     */
    static double ab_together(double k, double x) {
        return (k * x) / (Math.pow(k, 2) - 1);
    }
}
