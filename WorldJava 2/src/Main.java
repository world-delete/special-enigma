import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

/*        double rost = 1.8;
        double mass = 75.0;

        System.out.println("\t\t\t*** Добро пожаловать в калькулятор BMI ***");
        System.out.println("BMI: " + mass / (rost*rost));*/

// конвертер температуры по дз
        // Формула преобразования: (F = C * 1.8 + 32)

        // System.out.print("Температура по F = " );
        // System.out.println((10 * 1.8) + 32);
        // double rubles = 151.0;
// старый аналог

        /*System.out.println("*** Добро пожаловать в конвертер валют ***");
        System.out.print(rubles);
        System.out.print(" Рублей = ");
        System.out.print(rubles / 100);
        System.out.print(" Долларов и ");
        System.out.print(rubles / 110);
        System.out.print(" Евро.");*/

// конвертер рублей в евро бакс по дз через сканер

        System.out.println("Введите кол-во рублей: ");
        double rr = new Scanner(System.in).nextDouble();

        System.out.println("Введите актуальный курс доллара");
        double doll = new Scanner(System.in).nextDouble();

        System.out.println("Введите актуальный курс евро");
        double euro = new Scanner(System.in).nextDouble();

        System.out.print(rr + " рублей это " + (rr * (1 / doll)) + " долларов и ");
        System.out.println(rr * (1 / euro) + " евро.");

    }
}