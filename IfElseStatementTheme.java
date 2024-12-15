public class IfElseStatementTheme {
    public static void main(String[] args) {
        // 1. Перевод псевдокода на язык Java
        System.out.println("\n1. Перевод псевдокода на язык Java\n");
        String userGender = "man";
        if (!userGender.equals("man")) {
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
        char firstNameLetter = "Joan".charAt(0);
        if (firstNameLetter == 'M') {
            System.out.println("Пройдите в кабинет № 2.");
        } else if (firstNameLetter == 'I') {
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
            System.out.println("Числа равны.");
        }

        // 3. Проверка числа
        System.out.println("\n3. Проверка числа\n");
        int number = 7;
        if (number == 0) {
            System.out.println("Число является нулём");
        } else {
            if (number > 0) {
                System.out.print(number + " является положительным");
            } else {
                System.out.print(number + " является отрицательным");
            }
            if (number % 2 == 0) {
                System.out.print(" и четным");
            } else {
                System.out.println(" и нечётным");
            }
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
        } else {
            System.out.println("Исходные числа: " + doorNumber + " и " + houseNumber);
            if (doorOnes == houseOnes) {
                System.out.println("Разряд единиц в числах совпадает: " + doorOnes);
            }
            if (doorTens == houseTens) {
                System.out.println("Разряд десятков в числах совпадает: " + doorTens);
            }
            if (doorHundreds == houseHundreds) {
                System.out.println("Разряд сотен в числах совпадает: " + doorHundreds);
            }
        }

        // 5. Определение символа по его коду
        System.out.println("\n5. Определение символа по его коду\n");
        char laptopModel = '\u0057';
        if (Character.isUpperCase(laptopModel)) {
            System.out.println("'" + laptopModel + "'" + " большая буква");
        } else if (Character.isLowerCase(laptopModel)) {
            System.out.println("'" + laptopModel + "'" + " маленькая буква");
        } else if (Character.isDigit(laptopModel)) {
            System.out.println("'" + laptopModel + "'" + " это цифра");
        } else {
            System.out.println("'" + laptopModel + "'" + " ни буква и ни цифра");
        }

        // 6.Подсчет начисленных банком %
        System.out.println("\n6.Подсчет начисленных банком %\n");
        double depositSum = 321123.59d;
        double interestRate = 0.05;
        double accrual = depositSum * interestRate;
        if (depositSum < 100000) {
            interestRate = 0.05;
        } else if (depositSum >= 100000 && depositSum <= 300000) {
            interestRate = 0.07;
        } else {
            interestRate = 0.10;
        }
        double totalSum = depositSum + accrual;
        System.out.printf("Сумма вклада: %.2f руб.\n", depositSum); 
        System.out.printf("Сумма начисления: %.2f руб.\n", accrual); 
        System.out.printf("Итоговая сумма с %%: %.2f руб.\n", totalSum);

        // 7.Определение оценки по предметам
        System.out.println("\n7.Определение оценки по предметам\n");
        int historyPercent = 59;
        int historyGrade = 0;
        if (historyPercent > 91) {
            historyGrade = 5;
        } else if (historyPercent > 73) {
            historyGrade = 4;
        } else if (historyPercent > 60) {
            historyGrade = 3;
        } else if (historyPercent <= 60) {
            historyGrade = 2;
        }
        int programmingPercent = 92;
        int programmingGrade = 0;
        if (programmingPercent > 91) {
            programmingGrade = 5;
        } else if (programmingPercent > 73) {
            programmingGrade = 4;
        } else if (programmingPercent > 60) {
            programmingGrade = 3;
        } else if (programmingPercent <= 60) {
            programmingGrade = 2;
        }
        int averageGrade = (historyGrade + programmingGrade) / 2;
        int averagePercent = (historyPercent + programmingPercent) / 2;
        System.out.println("История: " + historyGrade + "\n" + 
                "Программирование: " + programmingGrade + "\n" + 
                "Средний балл оценок по предметам: " + averageGrade + "\n" + 
                "Средний процент по предметам: " + averagePercent + " %");

        // 8. Расчет годовой прибыли
        System.out.println("\n8. Расчет годовой прибыли\n");
        double perMonthSales = 13025.233d;
        double perMonthRent = 5123.018d;
        double productionCost = 9001.729d;
        double annualProfit = (perMonthSales - (perMonthRent + productionCost)) * 12;
        if (annualProfit > 0) {
            System.out.printf("Прибыль за год: +%.2f руб.\n", annualProfit);
        } else {
            System.out.printf("Прибыль за год: %.2f руб.\n", annualProfit);
        }
    }
}