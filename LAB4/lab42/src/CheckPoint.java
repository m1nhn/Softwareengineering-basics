public class CheckPoint {
    double x,y,r;
    boolean check;

    public CheckPoint(double x1, double y1, double r1) throws IllegalAccessException {
        if(r1 <= 0.0){
            throw new IllegalAccessException("Check your radius again !, r always > 0");
        }
        x = x1;
        y = y1;
        r = r1;
        check = inOrNot(x,y,r);
    }

    private static boolean checkInTheInterval(double d, double e, double f){
        return d >= e && e <= f;
    }

    private static boolean checkSegTriangle(double x, double y, double r){
        return checkInTheInterval(x,0.0,r) && checkInTheInterval(y,-r/2,0.0);
    }

    private static boolean checkSegCycle(double x, double y, double r){
        return checkInTheInterval(x,-r,0.0) && checkInTheInterval(y,-r,0.0);
    }

    private static boolean checkFianlSeg(double x, double y, double r){
        return checkInTheInterval(x,0,r) && checkInTheInterval(y,0.0,r/2);
    }

    private static boolean inOrNot(double x, double y, double r){
        return checkSegTriangle(x,y,r) || checkSegCycle(x,y,r) || checkFianlSeg(x,y,r);
    }

    @Override
    public String toString(){
        return String.format("This point(x: %f, y: %f, r: %f) passes in the range", x, y, r, check);
    }
}
