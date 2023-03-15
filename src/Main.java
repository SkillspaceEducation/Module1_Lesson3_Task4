import java.util.Scanner;

/*
Поделить пиццу.

1.Через System.in вводить:

- количество людей
- количество кусков в одной пицце

2. Вывести на экран минимальное количество пицц, чтобы у всех было одинаковое количество кусков и ни одного не
осталось лишнего в коробке.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество людей");
        int quantPeople = scanner.nextInt();
        System.out.println("Введите количество кусков пиццы в одной пицце");
        int quantPiecePizza = scanner.nextInt();
        scanner.close();
        System.out.println("Hello world!");
    }
}