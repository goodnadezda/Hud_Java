import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner;

        int number;
        String name;
        String arr;

        boolean result = true;

        do {
            scanner = new Scanner(System.in);
            System.out.println("Input number: ");
            while (!scanner.hasNextInt()) {
                System.out.println("That not a number!");
                scanner.next();
            }
            number = scanner.nextInt();
            result = false;
        } while (result);

        getHello (number);

        do {
            scanner = new Scanner(System.in);
            System.out.println("Input string: ");
            name = scanner.nextLine();
        } while (name.isEmpty());

    String nameResult  = getName(name);
    System.out.println(nameResult);

        do {
            scanner = new Scanner(System.in);
            System.out.println("Input array number in format: 1,2,3,4 .....");
            arr = scanner.nextLine();
        } while (arr.isEmpty());

        getArrInt (arr);

    }

    private static void getHello(int number) {
        if (number > 7)
            System.out.println("Hello");
    }

    private static String getName(String name) {
        if (name.equals("John"))
            return "Hello, " + name;
        return "There is no such name";
    }

    private static void getArrInt(String arr) {
        String [] arrStr = arr.split(",");
        for (String str : arrStr) {
            int arrInt = Integer.parseInt(str);
            if(arrInt % 3 == 0) {
                System.out.println(arrInt);
            }
        }
    }

}