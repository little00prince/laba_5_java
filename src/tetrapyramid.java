public class tetrapyramid extends figure{
    private double a;
    public tetrapyramid(double a)
    {
        this.a = a;
    }
    public void workTetrapyramid(){
        area = (Math.sqrt(3) * Math.pow(a, 2)) / 4;
        volume = (Math.pow(a, 3) * Math.sqrt(2)) / 12;
    }
}