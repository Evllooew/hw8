public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
        task11();
        task12();
        task13();
        task14();
        task15();
        task16();
        task17();
        task18();
        task19();
        task20();
        task21();
        task22();
        task23();
        task24();
        task25();
        task26();
        task27();
        task28();
        task29();
        task30();
        task31();
        task32();
        task33();
        task34();
        task35();


    }

    public static void task1() {

        int a = 27897;
        byte b = 67;
        short c = 569;
        long d = 987678965549L;
        double f = -159;
        float g = 27.12f;
        float i = 2.786f;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(f);
        System.out.println(g);
        System.out.println(i);
    }

    public static void task2() {

        short Leaflets = 480;
        byte aClassroom = 23;
        byte bClassroom = 27;
        byte cClassroom = 30;
        int students = aClassroom + bClassroom + cClassroom;
        int onTheStudent = Leaflets / students;
        System.out.println("На каждого ученика рассчитано " + onTheStudent + " листов бумаги");
    }

    public static void task3() {

        byte bottlesTwoMinutes = 16;
        byte justAMinute = 16 / 2;

        byte twentyMinutes = 20;
        short minutesPerDay = 1440;
        short minutesThreeDays = 4320;
        int minutseMonthOfApril = 43200;

        int inTwentyMinutes = justAMinute * twentyMinutes;
        int inPerDay = justAMinute * minutesPerDay;
        int inThreeDayss = justAMinute * minutesThreeDays;
        int forTheMonthOfApril = justAMinute * minutseMonthOfApril;

        System.out.println("За 20 минут, машина производит " + inTwentyMinutes + " Штук бутылок");
        System.out.println("За один день, машина производит " + inPerDay + " Штук бутылок");
        System.out.println("За три дня, машина производит " + inThreeDayss + " Штук бутылок");
        System.out.println("За Апрель месяц, машина производит " + forTheMonthOfApril + " Штук бутылок");

    }

    public static void task4() {

        byte cansOfPaint = 120;
        int classroom = cansOfPaint / 6;
        int white = 2 * classroom;
        int brown = 4 * classroom;

        System.out.println("В школе, где " + classroom + " классов, нужно " + white + " банок белой краски и " + brown + " банок коричневой краски");
    }

    public static void task5() {
        byte bananas = 5;
        byte bananaGram = 80;
        short milk = 2;
        byte milk100MlGram = 105;
        byte iceCreamBriquette = 2;
        short iceCreamBriquettegram = 2 * 100;
        byte eggs = 4;
        byte eggGram = 70;

        int cocktail = ((bananas * bananaGram) + (milk * milk100MlGram) + (iceCreamBriquette + iceCreamBriquettegram) + (eggs * eggGram));


        System.out.println(cocktail + " грамм в спорткоктейле");

        short oneKilogram = 1000;
        float aKilogramInACocktail = cocktail / 1000f;

        System.out.println(aKilogramInACocktail + " Кг в спорткоктейле");

    }

    public static void task6() {
        short sevenKilogram = 7000;
        short TheFirstOption = 250;
        short TheSecondOption = 500;
        int twoHundreDandFiftyGram = sevenKilogram / TheFirstOption;
        int fiveHundredRublesGram = sevenKilogram / TheSecondOption;
        int averageNumberOfDays = twoHundreDandFiftyGram + fiveHundredRublesGram / 2;

        System.out.println("Если по 250гр " + twoHundreDandFiftyGram + " дней");
        System.out.println("Если по 500гр " + fiveHundredRublesGram + "дней");
        System.out.println("В среднем " + averageNumberOfDays + " дней");
    }

    public static void task7() {
        int masha = 67760;
        int denis = 83690;
        int kristina = 76230;
        double masha1 = 67760 * 0.1;
        double denis1 = 83690 * 0.1;
        double kristina1 = 76230 * 0.1;

        System.out.println("Маша теперь получает " + (masha + masha1) + " рублей. Годовой доход вырос на " + masha1 + " рублей ");
        System.out.println("Денис теперь получает " + (denis + denis1) + " рублей. Годовой доход вырос на " + denis1 + " рублей ");
        System.out.println("Кристина теперь получает " + (kristina + kristina1) + " рублей. Годовой доход вырос на " + kristina1 + " рублей ");
    }

    public static void task8() {

        System.out.println("ДЗ номер 5");
        System.out.println("Здача 1-3");

        int age = 24;
        if (age >= 18) {
            System.out.println("он совершеннолетний");
        } else {
            System.out.println("он не достиг совершеннолетия, нужно немного подождать.");
        }

    }

    public static void task9() {
        System.out.println("Задача 2-3");
        int Degrees = 17;
        if (Degrees >= 5) {
            System.out.println("Сегодня тепло, можно идти без шапки");
        } else {
            System.out.println("На улице холодно, нужно надеть шапку");
        }
    }

    public static void task10() {
        System.out.println("Задача 3-3");

        int khm = 74;
        if (khm > 60) {
            System.out.println("придется заплатить штраф");
        } else {
            System.out.println("можно ездить спокойно");
        }
    }

    public static void task11() {
        System.out.println("Задача 4-7");
        int age = 47;

        if (age <= 2) {
            System.out.println(" Если возраст человека равен " + age + " годам, пора спать ");
        } else if (age > 2 && age < 7) {
            System.out.println("Если возраст человека равен " + age + " лет, нужно ходить в детский сад");
        } else if (age >= 7 && age < 18) {
            System.out.println("Если возраст человека равен " + age + " лет,нужно ходить в школу");
        } else if (age >= 18 && age < 24) {
            System.out.println("Если возраст человека равен " + age + " лет, нужно ходить в университет");
        } else if (age >= 24 && age < 60) {
            System.out.println("Если возраст человека равен " + age + " лет, пора ходить на работу");
        } else if (age >= 60) {
            System.out.println("Если возраст человека равен " + age + " лет и более,пора на пенсию");
        }

    }


    public static void task12() {

        System.out.println("Задача 5-7");

        int age = 13;


        if (age <= 5) {
            System.out.println("Если возраст равен " + age + " нельзя кататься на аттракционе");
        } else if (age > 5 && age < 14) {
            System.out.println("Если возраст равен " + age + " он может кататься только в сопровождении взрослых");
        } else if (age >= 14) {
            System.out.println("Если возраст равен " + age + " он может кататься");
        }

    }


    public static void task13() {

        System.out.println("Здача 6-7");

        byte capacityOfOneTrainCar = 102;
        byte seating = 60;
        int human = 64;


        if (capacityOfOneTrainCar < human) {
            System.out.println("нету мест в вагоне");
        } else {
            System.out.println("есть места в вагоне ");
        }


        if (human < seating && human < capacityOfOneTrainCar) {
            System.out.println("есть сидячии места");
        }


        if (human >= seating && human < capacityOfOneTrainCar) {
            System.out.println("только стоячии места");
        }

    }

    public static void task14() {

        System.out.println("Задача 7-7");
        int one = 1;
        int two = 2;
        int three = 3;

        if (one > two) {

            if (one > three) {

                System.out.println(one);

            } else {

                System.out.println(three);

            }

        } else if (two > three) {

            System.out.println(two);

        } else {

            System.out.println(three);
        }
    }


    public static void task15() {

        System.out.println("2-2 задачи");

        int clientOS = 1;
        int clientDeviceYear = 2023;

        if (clientOS == 1 && clientDeviceYear > 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (clientOS == 2 && clientDeviceYear > 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");

        } else if (clientOS == 1 && clientDeviceYear <= 2015) {
            System.out.println("Установите облегченную версию приложения для Iphone по ссылке");

        } else if (clientOS == 2 && clientDeviceYear <= 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }


    }

    public static void task16() {

        System.out.println("Задача 3");

        int year = 2100;
        int a = year % 400;
        int b = a % 100;
        int c = b % 4;

        if (a == 0) {
            System.out.println(year + " Високостный");
        } else if (b == 0) {
            System.out.println(year + " Не Високостный");
        } else if (c == 0) {
            System.out.println(year + "  високостный");
        } else System.out.println(year + " Не високостный");

    }


    public static void task17() {
        System.out.println("Задача 4");

        int deliveryDistance = 43;

        if (deliveryDistance >= 0 && deliveryDistance <= 20) {
            System.out.println(" потребуется 1 день " + deliveryDistance + " km");
        } else if (deliveryDistance >= 21 && deliveryDistance <= 60) {

            System.out.println("Потребуется дня 2 " + deliveryDistance + " km");

        } else if (deliveryDistance >= 61 && deliveryDistance <= 100) {
            System.out.println("потребуется 3 дня " + deliveryDistance + " km");

        } else System.out.println("доставляем только на расстоянии 100км");


    }


    public static void task18() {

        System.out.println("Задача 5");

        byte monthNumber = 11;

        switch (monthNumber) {
            case 1:
                System.out.println("Январь" + " Зима");
                break;
            case 2:
                System.out.println("Февраль" + " Зима");
                break;
            case 3:
                System.out.println("Март" + " Весна");
                break;
            case 4:
                System.out.println("Апрель" + " Весна");
                break;
            case 5:
                System.out.println("Май" + " Весна");
                break;
            case 6:
                System.out.println("Июнь" + " Лето");
                break;
            case 7:
                System.out.println("Июль" + " Лето");
                break;
            case 8:
                System.out.println("Август" + " Лето");
                break;
            case 9:
                System.out.println("Сентябрь" + " Осень");
                break;
            case 10:
                System.out.println("Октябрь" + " Осень");
                break;
            case 11:
                System.out.println("Ноябрь" + " Осень");
                break;
            case 12:
                System.out.println("Декабрь" + " Зима");
                break;
            default:
                System.out.println(" больше 12 месяцев, не бывает )");

        }
    }

    public static void task19() {
        System.out.println("Циклы 1 часть");
        System.out.println("Задача 1");


        for (int i = 1; i < 11; i = i + 1) {

            System.out.println("отсчет до десяти " + i);
        }


    }

    public static void task20() {
        System.out.println("2 задача");

        for (int i = 10; i > -1; i = i - 1) {

            System.out.println("обратный отсчет от десяти " + i);
        }


    }

    public static void task21() {
        System.out.println("Задача 3");
        for (int i = 0; i < 17; i = i + 2) {

            System.out.println(i);
        }


    }

    public static void task22() {

        System.out.println("Задача 4");

        for (int i = 10; i > -11; i = i - 1) {
            System.out.println(i);
        }


    }

    public static void task23() {

        System.out.println("Задача 5");

        for (int i = 1904; i < 2096; i = i + 4) {
            System.out.println(i + " год является високосным");
        }


    }

    public static void task24() {

        System.out.println("Задача 6");

        for (int i = 7; i < 105; i = i + 7)
            System.out.println(i);


    }

    public static void task25() {

        System.out.println("Задача 7");

        for (int i = 1; i < 513; i = i * 2) {

            System.out.println(i);
        }


    }

    public static void task26() {
        System.out.println("Задача 8");

        int salary = 29000;
        double total = 0;

        for (int i = 0; i < 12; i++) {


            total = total + salary;
            System.out.println("Месяц " + i + " Итого  " + total);
        }
        System.out.println(total);


    }

    public static void task27() {
        System.out.println("Задача 9");

        int salary = 29000;
        int total = 0;

        for (int i = 0; i < 12; i++) {

            total = total + total / 100;
            total = total + salary;

            System.out.println("Месяц " + i + " Итого  " + total);
        }
        System.out.println(total);


    }

    public static void task28() {
        System.out.println("Задача 10");

        int table = 2;

        for (int i = 1; i < 10; i++) {

            System.out.println(table + "х" + (i + 1) + "=" + (table * (i + 1)));

        }
    }

    public static void task29() {
        System.out.println("Задача 1");

        int salary = 15000;
        int piggyBank = 0;
        int i = 0;
        int goal = 2_459_000;

        while (piggyBank < goal) {

            i = i + 1;

            piggyBank = piggyBank + salary;

            System.out.println("Месяц " + i + " Итого  " + piggyBank);

        }

    }


    public static void task30() {
        System.out.println("Задача 2");

        int i = 0;
        while (i <= 10) {
            System.out.print(" " + i + " ");
            i++;
        }
        System.out.println();

        for (int e = 10; e > 0; e--) {
            System.out.print(" " + e + " ");
        }
    }

    public static void task31() {
        System.out.println("Задача 3");
        int totalPopulation = 12000000;
        int people = 17;
        int mortality = 8;
        for (int year = 1; year <= 10; year++) {
            int growth = (people - mortality) * totalPopulation / 1000;
            totalPopulation = totalPopulation + growth;
            System.out.println("Год " + year + " численность населения составляет " + totalPopulation);
        }


    }

    public static void task32() {

        System.out.println("Задача 4");
        int pot = 15000;
        int goal = 12_000_000;
        int percentages = 7;
        int piggyBank = 0;
        int i = 0;
        while (piggyBank <= goal) {
            i = i + 1;
            piggyBank = piggyBank + piggyBank * percentages / 100;
            piggyBank = piggyBank + pot;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + " сумма накоплений равна " + piggyBank + " рублей");
            }
        }
    }

    public static void task33() {
        System.out.println("Задача 6");


        int pot = 15000;
        int percent = 7;
        int years = 9;
        int month = years * 12;

        for (int i = 1; i <= month; i++) {

            pot = pot + pot * percent / 100;

            System.out.println("Сумма накоплений после  " + i + " - го полугодия: " + pot + " рублей");

        }
    }


    public static void task34() {
        System.out.println("Задача 7");
        int friday = 5;
        int month = 31;
        for (int i = friday; i <= month; i = i + 7) {
            System.out.println("Сегодня пятница " + i + " .-е число. Необходимо подготовить отчет");

        }
    }

    public static void task35() {
        System.out.println("Задача 8");

        int currentYear = 2023;
        int startYear = currentYear - 200;
        int endYear = currentYear + 100;
        for (int year = startYear; year <= endYear; year++) {
            if ((year % 79) == 0) {
                System.out.println(year);

            }
        }
    }


}







