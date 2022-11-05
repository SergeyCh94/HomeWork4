public class Main {
    public static void main(String[] args) {
        task1 ();
        task2 ();
        task3 ();
        task4 ();
        task5 ();
        task6 ();
        task7 ();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        int age = 28;
        int ageLimit = 18;

        if (age >= ageLimit) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        }

        if (age < ageLimit) {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, " +
                    "нужно немного подождать");
        }
        System.out.println("\n");
    }

    public static void task2 () {
        System.out.println("Задача 2");
        int temp = 3;
        int tempLimit = 5;

        if (temp < tempLimit) {
            System.out.println("На улице " + temp + " градусов, нужно надеть шапку");
        }

        if (temp >= tempLimit) {
            System.out.println("На улице " + temp + " градусов, можно идти без шапки");
        }
        System.out.println("\n");
    }

    public static void task3 () {
        System.out.println("Задача 3");
        int speed = 62;
        int speedLimit = 60;

        if (speed > speedLimit) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        }

        if (speed <= speedLimit) {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        }
        System.out.println("\n");
    }

    public static void task4 () {
        System.out.println("Задача 4");
        int age = 25;

        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад");
        } else if (age >= 7 && age <= 18) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");
        } else if (age > 18 && age <= 24) {
            System.out.println("Если возраст человека равен " + age + ", то его место в университете");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то ему пора ходить на работу");
        }
        System.out.println("\n");
    }

    public static void task5 () {
        System.out.println("Задача 5");
        int age = 12;

        if (age < 5) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему нельзя кататься на аттракционе");
        } else if (age >= 5 && age < 14) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе " +
                    "в сопровождении взрослого");
        } else {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе " +
                    "без сопровождения взрослого");
        }
        System.out.println("\n");
    }

    public static void task6 () {
        System.out.println("Задача 6");
        int numberSeat = 103;

        if (numberSeat <= 60 && numberSeat < 102) {
            System.out.println("Ваше место сидячие");
        } else if (numberSeat > 60 && numberSeat <= 102) {
            System.out.println("Ваше место стоячие");
        } else {
            System.out.println("Вагон полностью забит");
        }
        System.out.println("\n");
    }

    public static void task7 () {
        System.out.println("Задача 7");
        int one = 1;
        int two = 2;
        int three = 3;

        if (one > two && one > three) {
            System.out.println("Больше число переменной one");
        } else if (two > one && two > three) {
            System.out.println("Больше число переменной two");
        } else if (one == two && two == three) {
            System.out.println("Все переменный равны");
        } else {
            System.out.println("Больше число переменной three");
        }
    }
}