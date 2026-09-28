import java.util.Arrays;
import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {

        System.out.println("Вас приветствует список покупок");

        String[] shoppingList = new String[8];
        int ProductCount = 0;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Выберите одну из команд");
            System.out.println("1. Добавить товар в список");
            System.out.println("2. Показать список");
            System.out.println("3. Очистить список");
            System.out.println("4. Завершить работу");

            int actionNumber = scanner.nextInt();

            if (actionNumber == 1) {
                System.out.println("Напишите название товара:");
                String productName = scanner.next();
                shoppingList[ProductCount] = productName;
                System.out.println("Товар " + productName + " добавлен в список под номером " + ++ProductCount);
            } else if (actionNumber == 2) {
                if (ProductCount == 0) {
                    System.out.println("Список пуст");
                } else {
                    for (int i = 0; i < ProductCount; i++) {
                        System.out.println((i + 1) + ". " + shoppingList[i]);
                    }
                }
            } else if (actionNumber == 3) {
                for (int i = 0; i < shoppingList.length; i++) {
                    shoppingList[i] = null;
                }
                ProductCount = 0;
                System.out.println("Список очищен!");
            } else if (actionNumber == 4) {
                System.out.println("Всего доброго!");
                break;
            } else {
                System.out.println("Неизвестная команда!");
            }
        }


    }
}
