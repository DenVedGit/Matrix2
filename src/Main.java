import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void printMatrix(int[][] matrix){
    for (int i = 0; i < SIZE; i++) {
        for (int j = 0; j < SIZE; j++) {
            System.out.format("%4d", matrix[i][j]);
        }
        System.out.println();
    }
}
    public static final int SIZE = 8;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] colors = new int[SIZE][SIZE];
        int[][] rotatedColors = new int[SIZE][SIZE];
        Random random = new Random();
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                colors[i][j] = random.nextInt(256);
            }
        }
        System.out.println("Обычная матрица");
        printMatrix(colors);
        System.out.println("На сколько градусов хотите повернуть матрицу? 90, 180, 270");
        int grad = scanner.nextInt();
        if (grad == 90) {
            System.out.println("Матрица повернута на 90 градусов");
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    rotatedColors[i][j] = colors[SIZE - j - 1][i];
                }
            }
        } else if (grad == 180) {
            System.out.println("Матрица повернута на 180 градусов");
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    rotatedColors[i][j] = colors[SIZE - i - 1][SIZE - j - 1];
                }
            }
        } else if (grad == 270) {
            System.out.println("Матрица повернута на 270 градусов");
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    rotatedColors[i][j] = colors[j][SIZE - i - 1];
                }
            }
        } else {
            System.out.println("Неверное число");
            return;
        }
        printMatrix(rotatedColors);
    }
}


