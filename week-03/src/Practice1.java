import java.util.Scanner;

class Program{
    void main() {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.printf("Your number: %d \n", num);
        float height = in.nextFloat();
        /* next(): считывает введенную строку до первого пробела

    nextLine(): считывает всю введенную строку

    nextInt(): считывает введенное число int

    nextDouble(): считывает введенное число double

    nextBoolean(): считывает значение boolean

    nextByte(): считывает введенное число byte

    nextFloat(): считывает введенное число float

    nextShort(): считывает введенное число short */

        in.close();

        System.out.println(true);     // true
        System.out.println(false);    // false

        System.out.println(-11);
        // для двоичных чисел пишем 0b или 0B
        System.out.println(0b100001);    // 33
        // для шестнатеричных чисел пишем 0X или 0x
        System.out.println(0XFF);    // 255
        System.out.println(0Xff);    // 255
        System.out.println(0xFF);    // 255
        System.out.println(0xff);    // 255
        // для наглядности можем разделить цифры через _
        System.out.println(123_456);    // 123456
        System.out.println(234_567__789);   // 234567789
        /*
        '\n' - перевод строки

        '\t' - табуляция

        '\' - слеш*/
        int x=5;
        int y=6;
        System.out.println("x=" + x + "; y=" + y);
        // можно переписать как
        System.out.printf("x=%d; y=%d \n", x, y);

    }
}