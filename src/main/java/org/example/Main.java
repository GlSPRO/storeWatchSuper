package org.example;
import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        for (int i = 1; i < 4; i++) {
            String[] markWatch = {"","1.CASIO", "2.ROLEX", "3.HERMLE"};
            String[][] Marks = {
                    {markWatch[0], ":", "A159WA-N1 ", "HS-70W-1D ", "MTP-V006D-1B2"},
                    {markWatch[1], ":", "Datejust 31", "Datejust 36", "Datejust 41"},
                    {markWatch[2], ":", "Hermle 23003", "Hermle 70310", "Hermle 70332"}
            };

            System.out.println("Введите ваши данные: \nФИО: ");
            String dannye = scanner.nextLine();
            System.out.println("email:");
            String email = scanner.nextLine();
            System.out.println("Телефон:");
            int numberPhone = scanner.nextInt();
            int model = 0;
            System.out.println("Выберите фирму часов:" + Arrays.stream(markWatch).distinct().toList());
            int firm = scanner.nextInt();
            scanner.nextLine();
            if (firm == 1) {
                System.out.println("Выберите модель часов:" + Arrays.stream(Marks[0]).distinct().toList());
                model = scanner.nextInt();

            } else if (firm == 2) {
                System.out.println("Выберите модель часов:" + Arrays.stream(Marks[1]).distinct().toList());
                model = scanner.nextInt();

            } else if (firm == 3) {
                System.out.println("Выберите модель часов:" + Arrays.stream(Marks[2]).distinct().toList());
                model = scanner.nextInt();
            }


            Object[] Clients = new Object[5];
            Clients[0] = dannye;
            Clients[1] = email;
            Clients[2] = numberPhone;
            Clients[3] = markWatch[firm];
            Clients[4] = Marks[firm -1][model +1];

            System.out.println("Данные заказа №" + i);
            System.out.println("ФИО: " + Clients[0]);
            System.out.println("email: " + Clients[1]);
            System.out.println("Телефон: " + Clients[2]);
            System.out.println("Фирма часов: " + Clients[3]);
            System.out.println("Марка: " + Clients[4]);
        }
    }
}