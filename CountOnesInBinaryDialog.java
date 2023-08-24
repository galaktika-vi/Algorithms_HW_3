import java.util.Scanner;

public class CountOnesInBinaryDialog {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое число: ");
        int number = scanner.nextInt();

        System.out.println("Вы ввели число: " + number);
        System.out.println("Бинарное представление числа: " + Integer.toBinaryString(number));

        int result = countOnes(number);
        System.out.println("Подсчет единиц в бинарном представлении числа...");

        for (int i = 0; i < 32; i++) {
            int bit = (number >> i) & 1;
            System.out.println("Бит " + i + ": " + bit);
        }

        System.out.println("Количество единиц в бинарном представлении числа " + number + ": " + result);

        scanner.close();
    }

    public static int countOnes(int number) {
        int count = 0;
        while (number != 0) {
            count += number & 1;
            number >>= 1;
        }
        return count;
    }
}
