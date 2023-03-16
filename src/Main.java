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
        int quantPiecePizzaInit = scanner.nextInt();
        scanner.close();
        int quantPizza = quantPizza(quantPeople, quantPiecePizzaInit);
        String quantPizzaTxt = quantPizzaTxt(quantPizza);
        System.out.printf("Чтобы все присутствующие смогли насладиться одинаковым количеством еды, потребуется %d "
                + quantPizzaTxt, quantPizza);
    }

    private static int quantPizza(int quantPeople, int quantPiecePizzaInit) {
        int quantPiecePizza = quantPiecePizzaInit;
        while (quantPiecePizza % quantPeople != 0) { //если кол-во кусков пицц в коробке не делится на кол-во гостей нацело
            quantPiecePizza += quantPiecePizzaInit; // увеличиваем кол-во кусков пицц
        }
        return quantPiecePizza / quantPiecePizzaInit;
    }

    private static String quantPizzaTxt(int quantPizza) {
        if (quantPizza % 10 == 0 || quantPizza % 100 == 11 || quantPizza % 100 == 12 || quantPizza % 100 == 13
                || quantPizza % 100 == 14) {
            return ("пицц.\n");
        } else if ((quantPizza % 10 == 2 || quantPizza % 10 == 3 || quantPizza % 10 == 4) && (quantPizza < 10
                || quantPizza > 20)) {
            return ("пиццы.\n");
        } else if (quantPizza % 10 == 1 && quantPizza != 11) {
            return ("пицца.\n");
        } else return ("пицц.\n");
    }
}