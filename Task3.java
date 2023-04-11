package homework3;

public class Task3 {

//    Вывести в консоль сумму всех нечётных чисел от 20 до 60 включительно.

    public static void main(String[] args) {

        int x = 0;
        for (int a = 21; a <= 60; a +=2) {
            x += 1;
        }
        System.out.println(x);
    }
}
