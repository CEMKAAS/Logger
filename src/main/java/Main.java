import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();

        Scanner scanner = new Scanner(System.in);

        logger.log("Запускаем программу");
        logger.log("Введите входные данные для списка");
        logger.log("Введите размер списка:");
        int o = Integer.parseInt(scanner.next());
        logger.log("Введите верхнюю границу для значений:");
        int a = Integer.parseInt(scanner.next());
        logger.log("Создаём и наполняем список");
        List<Integer> result = list(o, a);
        logger.log("Вот случайный список:" + result);
        logger.log("Просим Вас ввести входные данные для фильтрации");
        logger.log("Введите порог для фильтра:");
        int ao = Integer.parseInt(scanner.next());
        Filter filter = new Filter(ao);
        logger.log("Отфильрованный список " + filter.filterOut(result));
        logger.log("Завершение программы");
    }

    public static List<Integer> list(int o, int a) {
        List<Integer> result = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < o; i++) {
            result.add(random.nextInt(a));
        }
        return result;
    }
}
