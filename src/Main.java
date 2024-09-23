import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int type;
        double e, s = 0, v = 0;
        cube one = null;
        ball two = null;
        tetrapyramid three = null;
        Scanner in = new Scanner(System.in);
        System.out.print("\n1-Куб\n2-Шар\n3-Правильный тетраэдр\n--------------------\nВыберите фигуру:");
        type = in.nextInt();
        //Ввод и обработка
        switch (type) {
            case 1:
                System.out.print("Длина стороны куба:");
                e = in.nextDouble();
                one = new cube(e);
                one.workCube();
                break;
            case 2:
                System.out.print("Радиус шара:");
                e = in.nextDouble();
                two = new ball(e);
                two.workBall();
                break;
            case 3:
                System.out.print("Длина стороны правильного тетраэдра:");
                e = in.nextDouble();
                three = new tetrapyramid(e);
                three.workTetrapyramid();
            default:;
        }
        //Вывод результатов
        System.out.print("Фигура: ");
        switch (type) {
            case 1:
                System.out.print("Куб");
                e = one.getDiagonal();
                System.out.printf("\nДиагональ: %f", e);
                s = one.getArea();
                v = one.getVolume();
                break;
            case 2:
                System.out.println("Шар");
                e = two.getD();
                System.out.printf("Диаметр: %f", e);
                s = two.getArea();
                v = two.getVolume();
                break;
            case 3:
                System.out.print("Правильный тетраэдр");
                s = three.getArea();
                v = three.getVolume();
                break;
        }
        System.out.printf("\nПлощадь: %f", s);
        System.out.printf("\nОбъем: %f\n", v);
    }
}