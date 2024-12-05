public class VariablesTheme {
    public static void main(String[] args) {
        // 1. Вывод характеристик компьютера
        System.out.println("1. Вывод характеристик компьютера\n");
        byte coresQuantity = 4;
        System.out.println("Количество ядер: " + coresQuantity);
        short ram = 16;
        System.out.println("ОЗУ: " + ram + " ГБ");
        int ddr = 20;
        System.out.println("Диск DDR: " + ddr + " ГБ");
        long ssd = 512L;
        System.out.println("Диск SSD: " + ssd + " ГБ");
        float monitorSize = 15.6f;
        System.out.println("Размер экрана: " + monitorSize + " дюймов");
        double cpuFrecuency = 4.4d;
        System.out.println("Мощность процессора: " + cpuFrecuency + " ГГц");
        boolean games = true;
        System.out.println("Игры: " + games);
        char laptopModel = 'E';
        System.out.println("Модель ноутбука: " + laptopModel + "\n");

        // 2. Расчет стоимости товара со скидкой
        System.out.println("2. Расчет стоимости товара со скидкой\n");
        float penPrice = 105.5f;
        float bookPrice = 235.83f;
        float noDisc = penPrice + bookPrice;
        String noDiscResult = String.format("%.2f", noDisc);
        float disc = (penPrice + bookPrice) * 0.11f;
        String discResult = String.format("%.2f", disc);
        float discPrice = noDisc - disc;
        String discPriceResult = String.format("%.2f", discPrice);
        System.out.println("Стоимость товара без скидки: " + noDiscResult + " руб.");
        System.out.println("Сумма скидки: " + discResult + " руб.");
        System.out.println("Стоимость товаров со скидкой: " + discPriceResult + " руб.");

        // 3. Вывод слова JAVA
        System.out.println("\n3. Вывод слова JAVA");
        System.out.println("\n   J    a  v     v  a");
        System.out.println("   J   a a  v   v  a a");
        System.out.println("J  J  aaaaa  V V  aaaaa");
        System.out.println(" JJ  a     a  V  a     a");

        // 4. Вывод min и max значений целых числовых типов
        System.out.println("\n4. Вывод min и max значений целых числовых типов");
        int a = 2147483647;
        System.out.println("\nint " + a);
        System.out.println("int max " + ++a);
        --a;
        --a;
        System.out.println("int min " + a);
        byte b = 127;
        System.out.println("byte " + b);
        System.out.println("byte max " + ++b);
        --b;
        --b;
        System.out.println("byte min " + b);
        long c = 9223372036854775807L;
        System.out.println("long " + c);
        System.out.println("long max " + ++c);
        --c;
        --c;
        System.out.println("long min " + c);
        short d = 32767;
        System.out.println("short " + d);
        System.out.println("short max " + ++d);
        --d;
        --d;
        System.out.println("short min " + d);
        char i = '9';
        System.out.println("char " + i);
        System.out.println("char max " + ++i);
        --i;
        --i;
        System.out.println("char min " + i);

        // 5. Перестановка значений переменных
        System.out.println("\n5. Перестановка значений переменных");
        int x = 2;
        int y = 5;
        System.out.println("\nИсходные значения переменных: int x = 2, int y = 5 ");
        int z = x;
        x = y;
        y = z;
        System.out.println("Значения переменных после перестановки значений с помощью третьей" + 
                " переменной: " + "int x = " + x + ", " + "int y = " + y);
        x = x + y - (y = x);
        /* x = x + y;
        y = x - y;
        x = x - y;*/
        System.out.println("Значения переменных после перестановки значений с помощью" +
                " арифметических операций: " + "int x = " + x + ", " + "int y = " + y);
        x = x ^ y;
        y = x ^ y;
        x = x ^ y;
        System.out.println("Значения переменных после перестановки значений с помощью побитовой" +
                " операции: " + "int x = " + x + ", " + "int y = " + y);

        // 6. Вывод символов и их кодов
        System.out.println("\n6. Вывод символов и их кодов");
        char dollar = '$';
        System.out.print((int) '$');
        System.out.println(" " + dollar);
        char asterisk = '*';
        System.out.print((int) '*');
        System.out.println(" " + asterisk);
        char arroba = '@';
        System.out.print((int) '@');
        System.out.println(" " + arroba);
        char slash = '|';
        System.out.print((int) '|');
        System.out.println(" " + slash);
        char tilde = '~';
        System.out.print((int) '~');
        System.out.println(" " + tilde);

        // 7. Вывод в консоль ASCII-арт Дюка
        System.out.println("\n7. Вывод в консоль ASCII-арт Дюка");
        char duckSlash = '/';
        String str1 = new String(new char[]{duckSlash});
        char invSlash = '\\';
        String str2 = new String(new char[]{invSlash});
        char underscore = '_';
        String str3 = new String(new char[]{underscore});
        char openparent = '(';
        String str4 = new String(new char[]{openparent});
        char closeparent = ')';
        String str5 = new String(new char[]{closeparent});
        System.out.println("     " + str1 + str2);
        System.out.println("    " + str1 + "  " + str2);
        System.out.println("   " + str1 + str3 + str4 + " " + str5 + str2);
        System.out.println("  " + str1 + "      " + str2);
        System.out.println(" " + str1 + str3 + str3 + str3 + str3 + 
                str1 + str2 + str3 + str3 + str2);

        // 8. Манипуляции с сотнями, десятками и единицами числа
        System.out.println("\n8. Манипуляции с сотнями, десятками и единицами числа");
        int num = 123;
        int numHundr = num / 100;
        int numTens = (num / 10) % 10;
        int numUnits = num % 10;
        int digitsSum = numHundr + numTens + numUnits;
        int digitsMult = numHundr * numTens * numUnits;
        System.out.println("\nЧисло " + num + " содержит:\n" + "  " + "сотен - " + numHundr + 
                "\n" + "  " + "десятков - " + numTens + "\n" + "  " + "единиц - " + numUnits + 
                "\n" + "Сумма разрядов = " + digitsSum + "\n" + 
                "Произведение разрядов = " + digitsMult);

        // 9. Перевод секунд в часы, минуты и секунды
        System.out.println("\n9. Перевод секунд в часы, минуты и секунды\n");
        int sec = 86399;
        int hours = sec / 3600;
        int min = (sec % 3600) / 60;
        int secRest = sec % 60;
        System.out.println(hours + ":" + min + ":" + secRest);
    }
}
