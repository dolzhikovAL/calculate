import sun.util.resources.cldr.en.TimeZoneNames_en_AU;

import java.util.Scanner;
import java.util.function.BinaryOperator;

public class calculator3 {
    public static void main(String[] args) {
        char masznach[] = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'b', 'd', 'e', 'f'};
        byte result[] = new byte[32];
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите целочисленное положительное число");
        int enter = scanner.nextInt();
        int number = enter;
        byte i = 0;
        byte method[] = new byte[]{2, 8, 16};
        for (byte j = 0; j < 3; j++) {
            do {
                result[i] = (byte) (number % method[j]);
                number /= method[j];
                i++;
            }
            while (number > 0);
            while (i > 0) {
                System.out.print(masznach[result[i - 1]]);
                i--;
            }
            System.out.println("");
            number = enter;
        }
        System.out.println("");
        // Бинарный формат числа
        String convert = Integer.toBinaryString(number);
        System.out.println(convert);

        // Восьмиричная форма
        convert = Integer.toOctalString(number);
        System.out.println(convert);

        // Шеснадцатиричная форма
        convert = Integer.toHexString(number);
        System.out.println(convert);
    }
}