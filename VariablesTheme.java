public class VariablesTheme {
    public static void main(String[] args) {
        // 1. Вывод характеристик компьютера
        System.out.println("1. Вывод характеристик компьютера\n");
        byte coresQuantity = 4;
        System.out.println("Количество ядер: " + coresQuantity);
        int ramVolume = 16;
        System.out.println("Объём оперативной памяти ОЗУ: " + ramVolume + " ГБ");
        short videoCardMemory = 8;
        System.out.println("Объём памяти видеокарты : " + videoCardMemory + " ГБ");
        long ssdVolume = 512L;
        System.out.println("Объём диска SSD: " + ssdVolume + " ГБ");
        float monitorSize = 15.6f;
        System.out.println("Размер экрана: " + monitorSize + " дюймов");
        double cpuFrecuency = 4.4d;
        System.out.println("Мощность процессора: " + cpuFrecuency + " ГГц");
        boolean hasGames = true;
        System.out.println("Предустановленные игры: " + hasGames);
        char laptopModel = 'E';
        System.out.println("Модель ноутбука: " + laptopModel + "\n");

        // 2. Расчет стоимости товара со скидкой
        System.out.println("2. Расчет стоимости товара со скидкой\n");
        float penPrice = 105.5f;
        float bookPrice = 235.83f;
        float basePrice = penPrice + bookPrice;
        String basePriceResult = String.format("%.2f", basePrice);
        float discountSum = basePrice * 0.11f;
        String discountResult = String.format("%.2f", discountSum);
        float discountPrice = basePrice - discountSum;
        String discountPriceResult = String.format("%.2f", discountPrice);
        System.out.println("Стоимость товара без скидки: " + basePriceResult + " руб.");
        System.out.println("Сумма скидки: " + discountResult + " руб.");
        System.out.println("Стоимость товаров со скидкой: " + discountPriceResult + " руб.");

        // 3. Вывод слова JAVA
        System.out.println("\n3. Вывод слова JAVA");
        System.out.println("\n   J    a  v     v  a");
        System.out.println("   J   a a  v   v  a a");
        System.out.println("J  J  aaaaa  V V  aaaaa");
        System.out.println(" JJ  a     a  V  a     a");

        // 4. Вывод min и max значений целых числовых типов
        System.out.println("\n4. Вывод min и max значений целых числовых типов");
        int feedPrice = 2147483647;
        System.out.println("\nint первоначальное значение: " + feedPrice + 
                "\nint значение после инкремента на единицу: " + ++feedPrice + 
                "\nint значение после декремента на единицу: " + --feedPrice);
        byte cowNumbers = 127;
        System.out.println("\nbyte первоначальное значение: " + cowNumbers + 
                "\nbyte значение после инкремента на единицу: " + ++cowNumbers + 
                "\nbyte значение после декремента на единицу: " + --cowNumbers);
        long profitTotal = 9223372036854775807L;
        System.out.println("\nlong первоначальное значение: " + profitTotal + 
                "\nlong значение после инкремента на единицу: " + ++profitTotal + 
                "\nlong значение после декремента на единицу: " + --profitTotal);
        short ducksPrice = 32767;
        System.out.println("\nshort первоначальное значение: " + ducksPrice + 
                "\nshort значение после инкремента на единицу: " + ++ducksPrice + 
                "\nshort значение после декремента на единицу: " + --ducksPrice);
        int value = 127;
        char purchaseCode = 65535;
        System.out.println("\nchar первоначальное значение: " + (int) purchaseCode + 
                "\nchar значение после инкремента на единицу: " + (int) ++purchaseCode + 
                "\nchar значение после декремента на единицу: " + (int) --purchaseCode);

        // 5. Перестановка значений переменных
        System.out.println("\n5. Перестановка значений переменных");
        int x = 2;
        int y = 5;
        System.out.println("\nИсходные значения переменных: int x = 2, int y = 5 ");
        int swap = x;
        x = y;
        y = swap;
        System.out.println("Значения переменных после перестановки значений с помощью третьей " + 
                "переменной: " + "int x = " + x + ", " + "int y = " + y);
        // x = x + y - (y = x);
        x += y;
        y = x - y;
        x -= y;
        System.out.println("Значения переменных после перестановки значений с помощью" +
                " арифметических операций: " + "int x = " + x + ", " + "int y = " + y);
        x ^= y;
        y ^= x;
        x ^= y;
        System.out.println("Значения переменных после перестановки значений с помощью побитовой" +
                " операции: " + "int x = " + x + ", " + "int y = " + y);

        // 6. Вывод символов и их кодов
        System.out.println("\n6. Вывод символов и их кодов");
        char dollar = '$';
        System.out.println((int) dollar + " " + dollar);
        char asterisk = '*';
        System.out.println((int) asterisk + " " + asterisk);
        char atSign = '@';
        System.out.println((int) atSign + " " + atSign);
        char verticalBar = '|';
        System.out.println((int) verticalBar + " " + verticalBar);
        char tilde = '~';
        System.out.println((int) tilde + " " + tilde);

        // 7. Вывод в консоль ASCII-арт Дюка
        System.out.println("\n7. Вывод в консоль ASCII-арт Дюка");
        char slash = '/';
        char backslash = '\\';
        char underscore = '_';
        char leftParenthesis = '(';
        char rightParenthesis = ')';
        System.out.println("     " + slash + backslash);
        System.out.println("    " + slash + "  " + backslash);
        System.out.println("   " + slash + underscore + leftParenthesis + " " + rightParenthesis + backslash);
        System.out.println("  " + slash + "      " + backslash);
        System.out.println(" " + slash + underscore + underscore + underscore + underscore + 
                slash + backslash + underscore + underscore + backslash);

        // 8. Манипуляции с сотнями, десятками и единицами числа
        System.out.println("\n8. Манипуляции с сотнями, десятками и единицами числа");
        int num = 123;
        int numHundreds = num / 100;
        int numTens = (num / 10) % 10;
        int numOnes = num % 10;
        int digitsSum = numHundreds + numTens + numOnes;
        int digitsMult = numHundreds * numTens * numOnes;
        System.out.println("\nЧисло " + num + " содержит:\n" + "  " + "сотен - " + numHundreds + 
                "\n" + "  " + "десятков - " + numTens + "\n" + "  " + "единиц - " + numOnes + 
                "\n" + "Сумма разрядов = " + digitsSum + "\n" + 
                "Произведение разрядов = " + digitsMult);

        // 9. Перевод секунд в часы, минуты и секунды
        System.out.println("\n9. Перевод секунд в часы, минуты и секунды\n");
        int totalSeconds = 86399;
        int hh = totalSeconds / 3600;
        int mm = (totalSeconds % 3600) / 60;
        int ss = totalSeconds % 60;
        System.out.println(hh + ":" + mm + ":" + ss);
    }
}
