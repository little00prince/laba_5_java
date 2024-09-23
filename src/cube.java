public class cube extends figure{
    private final double[] sides=new double[3];
    private int view;
    private double diagonal;
    public cube(double[] sides){
        System.arraycopy(sides, 0, this.sides, 0, 3);
        view = 0;
        diagonal=0;
    }
    public int getView() {
        return view;
    }

    public double getDiagonal() {
        return diagonal;
    }
    public void workCube(){
        diagonal = Math.sqrt(Math.pow(sides[0],2) + Math.pow(sides[1],2) + Math.pow(sides[2],2));
        area = (sides[0] * sides[1] * 2) + (sides[0] * sides[2] * 2) + (sides[1] * sides[2] * 2);
        volume = sides[0] * sides[1] * sides[2];

        if (sides[0] == sides[1] && sides[1] == sides[2])
            view = 1;
        else view = 2;
    }
}
