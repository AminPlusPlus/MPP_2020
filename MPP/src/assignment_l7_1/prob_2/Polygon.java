package assignment_l7_1.prob_2;


interface Polygon extends ClosedCurve {

    default double computePerimeter(){

        double sum  = 0;
        for (double s : getLengths())
            sum+=s;
        return sum;
    }

    double[] getLengths();
}
