import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int i;
        double e, s = 0, v = 0;
        double[] sides = new double[3];
        cube one = null;
        ball two = null;
        tetrapyramid three = null;
        Scanner in = new Scanner(System.in);
        System.out.print("\n1-Прямоугольный параллелепипед\n2-Шар\n3-Правильный тетраэдр\n--------------------\nВыберите фигуру:");
        figure.setType(in.nextInt());
        //Ввод и обработка
        switch (figure.type) {
            case 1:
                System.out.print("Длины сторон прямоугольного параллелепипеда:");
                for (i = 0; i < 3; i++) {
                    sides[i] = in.nextDouble();
                }
                one = new cube(sides);
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
        switch (figure.type) {
            case 1:
                i = one.getView();
                String view = null;
                switch (i) {
                    case 1:
                        view = "Куб";
                        break;
                    case 2:
                        view = "Прямоугольный параллелепипед";
                        break;
                    default:
                        ;
                }
                System.out.print(view);
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