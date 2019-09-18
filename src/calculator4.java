import java.util.Scanner;

public class calculator4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите целочисленное положительное число");
        int number = scanner.nextInt();
        int number2 = number;
        System.out.println("введите разрядность системы конечной системы  2,8,16");
        byte method = scanner.nextByte();
        byte i = 0;
        switch (method) {
            case 2:
            case 8: {
                byte result[] = new byte[32];
                do {
                    result[i] = (byte) (number % method);
                    number /= method;
                    i++;
                }
                while (number > 0);
                while (i > 0) {
                    System.out.print(result[i - 1]);
                    i--;
                }
                break;
            }
            case 16: {
                char resultchar[] = new char[32];
                char symbol[] = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'b', 'd', 'e', 'f'};
                do {
                    resultchar[i] = symbol[(number % method)];
                    number /= method;
                    i++;
                }
                while (number > 0);
                while (i > 0) {
                    System.out.print(resultchar[i - 1]);
                    i--;
                }
            }
        }
        System.out.println("\n" + "----------------");

        // Бинарный формат числа
        String convert = Integer.toBinaryString(number2);
        System.out.println(convert);

        // Восьмиричная форма
        convert = Integer.toOctalString(number2);
        System.out.println(convert);

        // Шеснадцатиричная форма
        convert = Integer.toHexString(number2);
        System.out.println(convert);
    }
}


