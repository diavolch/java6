package homework6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop("MacBookAir13", 8, "Apple M1", "silver", "Mac OS", 256, 13.3);
        Laptop laptop2 = new Laptop("MacBookPro14",16, "Apple M1", "grey", "Mac OS", 512, 14);
        Laptop laptop3 = new Laptop("SamsungGalaxyBook215",16, "Intel Core i5", "blue", "Windows 11", 512, 15);
        Laptop laptop4 = new Laptop("SamsungGalaxyBook2PRO",16, "Intel Core i5", "black", "Windows 11", 512, 13);
        Laptop laptop5 = new Laptop("AsusVivoBook",16, "Intel Core i5", "black", "Windows 11", 1024, 15);
        Laptop laptop6 = new Laptop("LenovoYoga7",8, "AMD Ryzen 5", "grey", "Windows 11", 512, 14);

        List<Laptop> laptops = List.of(laptop1, laptop2, laptop3, laptop4, laptop5, laptop6);

        System.out.println(
                "1. Вывести весь перечень ноутбуков;\n"+
                "2. Задать минимальную оперативную память;\n" +
                "3. Искать по цвету ноутбука;\n" +
                "4. Искать по процессору ноутбука;\n" +
                "5. Искать по операционной системе;\n" +
                "6. Задать минимальное зачение жесткого диска;\n" +
                "5. Задать минимальную диагональ.\n" +
                "Введите цифру запроса: ");
        Scanner sc = new Scanner(System.in);
        int inputChoice = sc.nextInt();
        if (inputChoice == 1) {
            for (Laptop laptop: laptops) {
                System.out.println(laptop.getModel());
            }
        } else if (inputChoice == 2) {
            System.out.println("Введите минимальную оперативную память ноутбука: ");
            Scanner scan = new Scanner(System.in);
            int memory = sc.nextInt();
            for (Laptop laptop: laptops) {
                if (laptop.getRam() >= memory) {
                    System.out.println(laptop.getModel() + " оперативная память " + laptop.getRam());
                }
            }
        } else if (inputChoice == 3) {
            System.out.println("Введите цвет ноутбука: ");
            Scanner scan = new Scanner(System.in);
            String inputColor = scan.nextLine();
            for (Laptop laptop: laptops) {
                if (laptop.getColor().equals(inputColor)) {
                    System.out.println(laptop.getModel() + " цвет " + laptop.getColor());
                }
            }
        } else if (inputChoice == 4) {
            System.out.println("Введите процессор ноутбука: ");
            Scanner scan = new Scanner(System.in);
            String inputProcessor = scan.nextLine().toLowerCase();
            for (Laptop laptop: laptops) {
                if (laptop.getProcessor().toLowerCase().equals(inputProcessor)) {
                    System.out.println(laptop.getModel() + "с процессором " + laptop.getProcessor());
                }
            }
        } else if (inputChoice == 5) {
            System.out.println("Введите операционную систему ноутбука: ");
            Scanner scan = new Scanner(System.in);
            String inputOS = scan.nextLine().toLowerCase();
            for (Laptop laptop: laptops) {
                if (laptop.getOperatingSystem().toLowerCase().equals(inputOS)) {
                    System.out.println(laptop.getModel() + " с операционной системой " + laptop.getOperatingSystem());
                }
            }
        } else if (inputChoice == 6) {
            System.out.println("Введите минимальную диагональ ноутбука: ");
            Scanner scan = new Scanner(System.in);
            int inputDiagonal = scan.nextInt();
            for (Laptop laptop: laptops) {
                if (laptop.getDiagonal() >= inputDiagonal) {
                    System.out.println(laptop.getModel() + "с диагональю " + laptop.getDiagonal());
                }
            }
        } else {
            System.out.println("Такого запроса нет!");
        }
    }

}
