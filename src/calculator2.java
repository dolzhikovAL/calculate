import java.util.Scanner;

public class calculator2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите целочисленное положительное число ");
        int l = scanner.nextInt();
        int p = l;
        int i = 0;
        char mas1[] = new char[]{'a', 'b', 'c', 'd', 'e', 'f'};
        byte[] result = new byte[32];
        System.out.println("введите разрядность системы конечной системы");
        byte method = scanner.nextByte();
        System.out.println("----------------------------------");
        do {
            result[i] = (byte) (l % method);
            l /= method;
            i++;
        }
        while (l > 0);
        while (i > 0) {
            if (result[i - 1] > 9)
                System.out.print(mas1[result[i - 1] - 10] + " ");

            else
                System.out.print(result[i - 1] + " ");
            i--;
        }
        // Бинарный формат числа
        String convert = Integer.toBinaryString(p);
        System.out.println("\n" + convert);

        // Восьмиричная форма
        convert = Integer.toOctalString(p);
        System.out.println(convert);

        // Шеснадцатиричная форма
        convert = Integer.toHexString(p);
        System.out.println(convert);


    }
}