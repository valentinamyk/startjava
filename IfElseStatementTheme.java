public class IfElseStatementTheme {
    public static void main(String[] args) {
        // 1. Перевод псевдокода на язык Java
        System.out.println("\n1. Перевод псевдокода на язык Java\n");
        String user = "man";
        if (!user.equals("man")) {
            System.out.println("Мальчики, направо.");
        } else {
            System.out.println("Девочки, налево.");
        }

        int age = 60;
        if (age > 18) {
            System.out.println("Ты взрослый.");
        } else {
            System.out.println("Ты еще ребенок.");
        }

        double height = 1.5;
        if (height < 1.8) {
            System.out.println("Ты невысокий.");
        } else {
            System.out.println("Ты высокий.");
        }

        String name = "Joan";
        char nameFirstLetter = "Joan".charAt(0);
        if (nameFirstLetter == 'M') {
            System.out.println("Пройдите в кабинет № 2.");
        } else if (nameFirstLetter == 'I') {
            System.out.println("Пройдите в кабинет № 4.");
        } else {
            System.out.println("Пройдите в кабинет № 5.");
        }

        // 2. Поиск большего числа
        System.out.println("\n2. Поиск большего числа\n");
        int coffePrice = 3;
        int menuAir = 34;
        if (coffePrice < menuAir) {
            System.out.println(coffePrice + " < " + menuAir);
        } else if (coffePrice > menuAir) {
            System.out.println(coffePrice + " > " + menuAir);
        } else {
            System.out.println("Нет большего числа.");
        }
        if (coffePrice == menuAir) {
            System.out.println("Числа равны.");
        } else {
            System.out.println("Числа не равны.");
        }

        // 3. Проверка числа
        System.out.println("\n3. Проверка числа\n");
        int number = 7;
        if (number == 0) {
            System.out.println("Число является нулём");
        } else if ((number % 2 == 0) && (number > 0)) {
            System.out.println(number + " является положительным и чётным");
        } else if ((number % 2 == 0) && (number < 0)) {
            System.out.println(number + " является отрицательным и чётным");
        } else if ((number % 2 != 0) && (number > 0)) {
            System.out.println(number + " является положительным и нечётным");
        } else if ((number % 2 != 0) && (number < 0)) {
            System.out.println(number + " является отрицательным и нечётным");
        }

        // 4. Поиск одинаковых цифр в числах
        System.out.println("\n4. Поиск одинаковых цифр в числах\n");
        int doorNumber = 123;
        int houseNumber = 223;
        int doorOnes = doorNumber % 10;
        int doorTens = (doorNumber / 10) % 10;
        int doorHundreds = doorNumber / 100;
        int houseOnes = houseNumber % 10;
        int houseTens = (houseNumber / 10) % 10;
        int houseHundreds = houseNumber / 100;
        if ((doorOnes != houseOnes) && (doorTens != houseTens) && 
                (doorHundreds != houseHundreds)) {
            System.out.println("В числах " + doorNumber + " и " + houseNumber + 
                        " равных разрядов нет");
        } else if (doorOnes == houseOnes || doorTens == houseTens || doorHundreds == 
                houseHundreds) {
            System.out.println("Исходные числа: " + doorNumber + " и " + houseNumber);
            if (doorOnes == houseOnes) {
                System.out.println("Разряд единиц в числах совпадает и равен: " + doorOnes);
            } else {
                System.out.println("Разряд единиц в числах не совпадает");
            }
            if (doorTens == houseTens) {
                System.out.println("Разряд десятков в числах совпадает и равен: " + doorTens);
            } else {
                System.out.println("Разряд десятков в числах не совпадает");
            }
            if (doorHundreds == houseHundreds) {
                System.out.println("Разряд сотен в числах совпадает и равен: " + doorHundreds);
            } else {
                System.out.println("Разряд сотен в числах не совпадает\n");
            }
        }

        // 5. Определение символа по его коду
        System.out.println("5. Определение символа по его коду\n");
        char laptopModel = '\u0057';
        if ((Character.isLetter(laptopModel)) && (Character.isUpperCase(laptopModel))) {
            System.out.println("'" + laptopModel + "'" + " большая буква");
        } else if ((Character.isLetter(laptopModel)) && (Character.isLowerCase(laptopModel))) {
            System.out.println("'" + laptopModel + "'" + " маленькая буква");
        } else if (Character.isDigit(laptopModel)) {
            System.out.println("'" + laptopModel + "'" + " это цифра");
        } else {
            System.out.println("'" + laptopModel + "'" + " ни буква и ни цифра");
        }

        // 6.Подсчет начисленных банком %
        System.out.println("\n6.Подсчет начисленных банком %\n");
        double depositSum = 321123.59d;
        double accrual5 = depositSum * 0.05;
        String accrual5Result = String.format("%.2f", accrual5);
        double depositTotal5 = depositSum + accrual5;
        String depositTotal5Result = String.format("%.2f", depositTotal5);
        double accrual7 = depositSum * 0.07;
        String accrual7Result = String.format("%.2f", accrual7);
        double depositTotal7 = depositSum + accrual7;
        String depositTotal7Result = String.format("%.2f", depositTotal7);
        double accrual10 = depositSum * 0.1;
        String accrual10Result = String.format("%.2f", accrual10);
        double depositTotal10 = depositSum + accrual10;
        String depositTotal10Result = String.format("%.2f", depositTotal10);
        if (depositSum < 100000) {
            System.out.println("Сумма вклада: " + depositSum + " руб." + "\n" + 
                    "Сумма начисления (5 %): " + accrual5Result + " руб." + "\n" + 
                    "Итоговая сумма: " + depositTotal5Result + " руб.");
        } else if (depositSum > 100000 && depositSum < 300000) {
            System.out.println("Сумма вклада: " + depositSum + " руб." + "\n" + 
                    "Сумма начисления (7 %): " + accrual7Result + " руб." + "\n" + 
                    "Итоговая сумма: " + depositTotal7Result + " руб.");
        } else if (depositSum > 300000) {
            System.out.println("Сумма вклада: " + depositSum + " руб." + "\n" + 
                    "Сумма начисления (10 %): " + accrual10Result + " руб." + "\n" + 
                    "Итоговая сумма: " + depositTotal10Result + " руб.");
        }

        // 7.Определение оценки по предметам
        System.out.println("\n7.Определение оценки по предметам\n");
        int historyPercentage = 59;
        int programmingPercentage = 92;
        if (historyPercentage <= 60) {
            System.out.println("История: 2");
        } else if (historyPercentage > 91) {
            System.out.println("История: 5");
        } else if (historyPercentage > 73) {
            System.out.println("История: 4");
        } else if (historyPercentage > 60) {
            System.out.println("История: 3");
        }
        if (programmingPercentage <= 60) {
            System.out.println("Программирование: 2");
        } else if (programmingPercentage > 91) {
            System.out.println("Программирование: 5");
        } else if (programmingPercentage > 73) {
            System.out.println("Программирование: 4");
        } else if (programmingPercentage > 60) {
            System.out.println("Программирование: 3");
        } 
        float historyGrade = 2f;
        float programmingGrade = 5f;
        float averageGrade = (historyGrade + programmingGrade) / 2;
        System.out.println("Средний балл оценок по предметам: " + averageGrade);
        int averagePercentage = (historyPercentage + programmingPercentage) / 2;
        System.out.println("Средний процент по предметам: " + averagePercentage + " %");

        // 8. Расчет годовой прибыли
        System.out.println("\n8. Расчет годовой прибыли\n");
        double perMonthSales = 13025.233d;
        double perMonthRent = 5123.018d;
        double productionCost = 9001.729d;
        double annualProfit = perMonthSales * 12 - (perMonthRent + productionCost) * 12;
        String annualProfit1 = String.format("%.2f", annualProfit);
        if (annualProfit < 0) {
            System.out.println("Прибыль за год: " + annualProfit1 + " руб.");
        } else if (annualProfit > 0) {
            System.out.println("Прибыль за год: " + "+" + annualProfit1 + " руб.");
        }
    }
}