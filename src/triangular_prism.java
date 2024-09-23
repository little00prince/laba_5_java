public class triangular_prism extends figure{
    private final double[] sides=new double[3];
    private int h;
    public triangular_prism(double[] sides){
        System.arraycopy(sides, 0, this.sides, 0, 3);
    }

    public void workе_triangular_prism()throws Exception{
        double p;
        h = 1;
        p = (sides[0] + sides[1] + sides[2]) / 2;
        area = Math.sqrt(p * (p - sides[0]) * (p - sides[1]) * (p - sides[2])) + h * (sides[0] + sides[1] + sides[2]);
        volume = Math.sqrt(p * (p - sides[0]) * (p - sides[1]) * (p - sides[2])) * h;
        if ((sides[0] >= sides[1] + sides[2]) || (sides[1] >= sides[0] + sides[2]) || (sides[2] >= sides[0] + sides[1]))
        {
            throw new Exception ("Треугольная призма не существует");
        }
    }
}
