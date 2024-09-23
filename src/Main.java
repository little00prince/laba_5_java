import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int i, j = 0, k = 0;
        double e, s, v;
        double[] sides = new double[3];
        cube one = null;
        ball[][] two = new ball[2][2];
        tetrapyramid[] three = new tetrapyramid[2];
        Scanner in = new Scanner(System.in);
        System.out.print("\n1-Прямоугольный параллелепипед\n2-Шар\n3-Правильный тетраэдр\n--------------------\nВыберите фигуру:");
        figure.setType(in.nextInt());
        s = 0;
        v = 0;
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
                two[j][k] = new ball(e);
                two[j][k].workBall();
                break;
            case 3:
                System.out.print("Длина стороны правильного тетраэдра:");
                e = in.nextDouble();
                three[j] = new tetrapyramid(e);
                three[j].workTetrapyramid();
                break;
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
                e = two[j][k].getD();
                System.out.printf("Диаметр: %f", e);
                s = two[j][k].getArea();
                v = two[j][k].getVolume();
                break;
            case 3:
                System.out.print("Правильный тетраэдр");
                s = three[j].getArea();
                v = three[j].getVolume();
                break;
        }
        System.out.printf("\nПлощадь: %f", s);
        System.out.printf("\nОбъем: %f\n", v);
    }
}