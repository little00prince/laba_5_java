public class cube extends figure{
    private double a;
    private double diagonal;
    public cube(double a){
        this.a=a;
        diagonal=0;
        area=0;
        volume =0;
    }
    public double getDiagonal() {
        return diagonal;
    }
    public void workCube(){
        diagonal=Math.sqrt(3)*a;
        area=Math.pow(a,2) * 6;
        volume = Math.pow(a,3);
    }
}