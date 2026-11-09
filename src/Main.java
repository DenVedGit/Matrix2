import java.util.Random;
import java.util.Scanner;

public class Main {
    public static final int SIZE = 8;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[][] colors = new int[SIZE][SIZE];
        int[][] rotatedColors = new int[SIZE][SIZE];

        System.out.println("Обычная матрица");

        Random random = new Random();
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                colors[i][j] = random.nextInt(256);
                System.out.format("%4d", colors[i][j]);
            }
            System.out.println();
        }

        System.out.println("На сколько градусов хотите повернуть матрицу? 90, 180, 270");

        int grad = scanner.nextInt();

        if (grad == 90) {
            System.out.println("Матрица повернута на 90 градусов");
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    rotatedColors[i][j] = colors[SIZE - j - 1][i];
                    System.out.format("%4d", rotatedColors[i][j]);
                }
                System.out.println();
            }

        } else if (grad == 180) {
            System.out.println("Матрица повернута на 180 градусов");
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    rotatedColors[i][j] = colors[SIZE - j - 1][SIZE - i - 1];
                    System.out.format("%4d", rotatedColors[i][j]);
                }
                System.out.println();
            }
        }
        else if (grad == 270) {
            System.out.println("Матрица повернута на 270 градусов");
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    rotatedColors[i][j] = colors[j][SIZE - i - 1];
                    System.out.format("%4d", rotatedColors[i][j]);
                }
                System.out.println();
            }
        }
        else {
            System.out.println("Неверное число");
        }
    }
}


