import java.util.Scanner;
import java.util.function.DoubleToIntFunction;

public class change {
    public static void main(String[] args) {
        int[] arr;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao kich thuoc cua mang");
        int size = scanner.nextInt();
        if (size > 20) {
            System.out.println("Mang lon hon 20 khong duoc chap nhan");
        } else {
            arr = new int[size];
            int i = 0;
            while (i < arr.length) {
                System.out.println("Nhap vao so thu " + (i + 1) + " :");
                arr[i] = scanner.nextInt();
                i++;
            }
            System.out.printf("%-20s%s", "Elements in array: ", "");
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[j] + "\t");
            }
            for (int j = 0; j < arr.length / 2; j++) {
                int temp = arr[j];
                arr[j] = arr[size - 1 - j];
                arr[size - 1 - j] = temp;
            }
            System.out.printf("%-20s%s", "Elements in array: ", "");
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[j] + "\t");
            }
        }

    }
}
