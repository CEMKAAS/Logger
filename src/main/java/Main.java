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
        int sizeList = Integer.parseInt(scanner.next());
        logger.log("Введите верхнюю границу для значений:");
        int maxIntRandom = Integer.parseInt(scanner.next());
        logger.log("Создаём и наполняем список");
        List<Integer> result = list(sizeList, maxIntRandom);
        logger.log("Вот случайный список:" + result);
        logger.log("Просим Вас ввести входные данные для фильтрации");
        logger.log("Введите порог для фильтра:");
        int filterInt = Integer.parseInt(scanner.next());
        Filter filter = new Filter(filterInt);
        logger.log("Отфильрованный список " + filter.filterOut(result));
        logger.log("Завершение программы");
    }

    public static List<Integer> list(int sizeList, int maxIntRandom) {
        List<Integer> result = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < sizeList; i++) {
            result.add(random.nextInt(maxIntRandom));
        }
        return result;
    }
}
