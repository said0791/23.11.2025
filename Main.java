public class Main {

    public static void main(String[] args) {



            System.out.println("Задания 1");
            System.out.println("Расписание отчетов за месяц");


            for (int firstFriday = 5; firstFriday <= 31; firstFriday += 7) {
                System.out.println("Сегодня пятница, " + firstFriday + "-е число. Необходимо подготовить отчет.");
            }

            System.out.println("Задания 2");

            System.out.println("Версия с do-while ");


            int distanse = 0;
            int marafon = 500;
            int step = 42195;

            do {
                int remaining = step - distanse;
                System.out.println("Держитесь! Осталось " + remaining + " метров");
                distanse += marafon;
            } while (distanse <= step);

            System.out.println("Версия с For ");

            int marafonTwo = 42195;
            int stepTwo = 500;
            for (distanse = 0; distanse <= marafonTwo; distanse += stepTwo){ ;
            int remainingTwo = marafonTwo - distanse;
            System.out.println("Держитесь! Осталось " + remainingTwo + " метров");

        }

        System.out.println("Задания 3");

        int budget = 1000;

        // Версия с while
        int dayWhile = 1;
        int moneyWhile = budget;

        while (moneyWhile >= 100) {
            if (dayWhile % 5 == 0) {
                dayWhile++;
                continue;
            }
            moneyWhile -= 100;
            dayWhile++;
        }

        // Версия с for
        int dayFor = 0;
        int moneyFor = budget;

        for (int day = 1; moneyFor >= 100; day++) {
            dayFor = day;
            if (day % 5 == 0) {
                continue;
            }
            moneyFor -= 100;
        }

        System.out.println("Бюджет: " + budget + " ₽");
        System.out.println("Версия while: " + (dayWhile - 1) + " дней");
        System.out.println("Версия for: " + dayFor + " дней");
        System.out.println("Результаты " + ((dayWhile - 1) == dayFor ? "совпадают" : "не совпадают"));

        System.out.println("Задания 4");

        int month = 0;
        double total = 0;
        final double TARGET = 12_000_000;
        final double MONTHLY_DEPOSIT = 15_000;

        while (true) {
            month++;
            total += MONTHLY_DEPOSIT;

            if (month % 6 == 0) {
                total += total * 0.07;
            }

            System.out.printf("Месяц %d, сумма: %.2f ₽%n", month, total);

            if (total >= TARGET) {
                break;}
        }
        System.out.println("\nЦель достигнута за " + month + " месяцев!");

        System.out.println("Задания 5");

        int charge = 20;
        int minute = 0;
        int overheats = 0;

        while (charge < 100 && overheats <= 3) {
            minute++;

            if (minute % 10 == 0) {
                overheats++;
                System.out.println("Перегрев! Пропуск зарядки на 2 минуты");
                minute += 2;
                continue;
            }

            charge += 2;
            System.out.println("Минута " + minute + ", заряд: " + charge + "%");

            if (overheats >= 3) {
                System.out.println("Зарядка прекращена. Текущий заряд: " + charge + "%");
                break;
            }
        }

        System.out.println("Время зарядки составило " + minute + " минут");
        }
    }

