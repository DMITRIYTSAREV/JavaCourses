package ru.java.courses;
import java.util.Scanner;
import java.lang.String;

class Lesson2 {

    /**
     * Нужно реализовать формулу y = √(13x + 13/x)
     * Подсказка: квадратный корень вычисляется функцией Math.sqrt()
     *
     * @param x на текущем этапе входное значение будет больше нуля
     * @return возвращаем только целую часть от полученного результата,
     * хвост отбрасываем без откругления
     */
    public static void main(String[] args) {
        int y = 0;

        System.out.println("Введите X");
        Scanner x = new Scanner(System.in);
        formula(y, x.nextInt());


        System.out.println("введите ФИО");
        String str;
        Scanner strlength = new Scanner(System.in);
        str = strlength.nextLine();
        char k[] = new char[3];


        byte s = 0;

        k[0] = str.charAt(0);
        s++;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                k[s] = str.charAt(i + 1);
                s++;
            }


        }

        char F = Character.toUpperCase(k[0]);
        char I = Character.toUpperCase(k[1]);
        char O = Character.toUpperCase(k[2]);
        char pr = '.';
        String FIO = new StringBuilder().append(F).append(pr).append(I).append(pr).append(O).append(pr).toString();
        System.out.println(FIO);


    }

    static double formula(double y, int x) {
        y = Math.sqrt(13 * x + (13 / x));
        y = (int) y;
        System.out.println(y);
        return 0;
    }
}

    /**
     * Нужно привести строку с полным именем к инициалам.
     * Например, "Иванов Петр Александрович" → "И.П.А."
     * Подсказка:
     * разделение строки на части: .split(" ");
     * получение символа на определенной позиции: .charAt();
     * приведение к верхнему регистру: .toUpperCase();
     *
     * @param fullName на текущем этапе имена будут состоять из имени, фамили и отчества, разделяться пробелами.
     *                 Регистр букв во входном параметре может быть любым.
     *
     * @return возвращаем инициалы в верхнем регистре разделенные точкой, как в примере выше
     */



