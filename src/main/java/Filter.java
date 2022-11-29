import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Filter {
    protected int treshold;

    public Filter(int treshold) {
        this.treshold = treshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance();
        List<Integer> result = new ArrayList<>();
        logger.log("Запускаем фильтрацию");
        for (int aO : source) {
            if (aO < treshold) {
                logger.log("Элемент " + aO + " не проходит");
            } else {
                logger.log("Элемент " + aO + " проходит");
                result.add(aO);
            }
        }
        logger.log("Прошло фильтр " + result.size() + " элемента из " + source.size());
        logger.log("Выводим результат на экран");

        return result;
    }
}
