   import java.util.Scanner;

public class A1093377_0317_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("請輸入N的值：");
        int n = scanner.nextInt();

        System.out.print("請輸入M的值：");
        int m = scanner.nextInt();

        int[][] array = new int[n][m];

        for (int i = 0; i <array.length; i++) {
            for (int j = 0; j <array[i].length; j++) {
                array[i][j] = (i+1)*(j+1);
            }
        }

        System.out.println("結果：");
        for (int[] row : array) {
            for (int element : row) {
                System.out.print(element);
            }
            System.out.println();
        }
    }
}