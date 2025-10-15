import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        1.Ввод суммы
//        2. Выбор варианта доллар/евро
//        3. Посчитать итоговое значение(сумма*курс доллар/евро)
//        4. Сохранить где-то в приложении курс доллара и евро

        while (true) {
            converter();
        }
    }
    static void converter() {
        double courseRuDollars = 0.012;
        double courseRuEuro = 0.011;
        System.out.print("Введите сумму в рублях для перевода в валюту: ");
        Scanner scanner = new Scanner(System.in);
        int inputAmount = scanner.nextInt();
        System.out.print("Выберите значение валюты, где 1 - для перевода суммы в доллары " +
                "и 2 - для перевода суммы в евро: ");
        byte inputCurrency  = scanner.nextByte();

        System.out.print(inputCurrency == 1 ?
                "Итоговое значение в долларах составляет: " + String.format("%.2f",courseRuDollars*inputAmount):
                        inputCurrency == 2 ?
                "Итоговое значение в евро составляет: " + String.format("%.2f",courseRuEuro*inputAmount):
                "Вы ввели неверное значение валюты, попробуйте заново!");
        System.out.println();
    }
}
