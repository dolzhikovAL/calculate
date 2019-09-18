import com.sun.org.apache.xerces.internal.impl.dv.xs.SchemaDVFactoryImpl;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import sun.text.normalizer.UCharacterIterator;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите целочисленное положительное число");
        int number = scanner.nextInt();
        char masznach[] = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'b', 'd', 'e', 'f'};
        byte i = 0;
        int p = number;
        String str = new String();
        System.out.println("введите разрадность итогового числа для перевода чила в в пределах от 2 до 16");
        byte method = scanner.nextByte();
        System.out.println("----------------------------------");
        do {
            str = masznach[(number % method)] + str;
            number /= method;
        }
        while (number > 0);
        System.out.println(str);
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

