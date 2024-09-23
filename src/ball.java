public class ball extends figure{
    private double r;
    private double d;
    public ball(double r){
        this.r = r;
        d=0;
    }
    public double getD() {
        return d;
    }
    public void workBall(){
        d = r * 2;
        area = 4 * 3.14 * Math.pow(r,2);
        volume = (4/3) * 3.14 * Math.pow(r,3);
    }
}
