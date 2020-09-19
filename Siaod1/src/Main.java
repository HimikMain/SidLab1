import java.security.Policy;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        List polyP = new List();
        List polyQ = new List();

        System.out.println("Выберете пункт меню:");
        System.out.println("1 - Добавить одночлен к первому многочлену");
        System.out.println("2 - Добавить одночлен ко второму многочлену");
        System.out.println("3 - Вывести первый многочлен");
        System.out.println("4 - Вывести второй многочлен");
        System.out.println("5 - Сравнить первый и второй многочлен");
        System.out.println("6 - Вычислить значение многочлена в конкретной точке x");
        System.out.println("7 - Вычислить сумму многочленов");
        System.out.println("0 - Завершение программы");
        Scanner sc = new Scanner(System.in);

        boolean exit = false;
        while (!exit) {
            while (!sc.hasNextInt()) {
                System.out.println("Введите число от 0 до 7");
                sc.next();
            }
            int choice = sc.nextInt();

            if (choice >= 0 && choice <= 8) {
                switch (choice) {
                    case 0:
                        exit = true;
                        break;
                    case 1:
                        Scanner scanP = new Scanner(System.in);
                        System.out.print("Введите коэффициент:");
                        while (!scanP.hasNextInt()) {
                            System.out.println("Введите число");
                            scanP.next();
                        }
                        int coefficientP = scanP.nextInt();

                        System.out.print("Введите индекс:");
                        while (!scanP.hasNextInt()) {
                            System.out.println("Введите число");
                            scanP.next();
                        }
                        int indexP = scanP.nextInt();

                        polyP.add(coefficientP, indexP);
                        break;
                    case 2:
                        Scanner scanQ = new Scanner(System.in);
                        System.out.print("Введите коэффициент:");
                        while (!scanQ.hasNextInt()) {
                            System.out.println("Введите число");
                            scanQ.next();
                        }
                        int coefficientQ = scanQ.nextInt();

                        System.out.print("Введите индекс:");
                        while (!scanQ.hasNextInt()) {
                            System.out.println("Введите число");
                            scanQ.next();
                        }
                        int indexQ = scanQ.nextInt();

                        polyQ.add(coefficientQ, indexQ);
                        break;
                    case 3:

                        break;
                    case 4:

                        break;
                    case 5:

                        break;
                    case 6:

                        break;
                    case 7:

                        break;
                }
            } else {
                System.out.println("Введите число от 0 до 7");
            }
        }
    }
}

