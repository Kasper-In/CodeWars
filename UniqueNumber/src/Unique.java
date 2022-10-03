import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

import static java.util.stream.Collectors.*;

//поиск элемента, единственного в масииве
public class Unique {
    public static double findUniq(double arr[]) {

        //Преобразование массива double в лист double
        List<Double> allUsers = DoubleStream.of(arr).boxed().collect(toList());
        //Новый лист с элементами, встречащиеся только один раз
        List<Double> unique = allUsers.stream()
                //группируем в map (число -> количество вхождений)
                .collect(Collectors.groupingBy(Function.identity()))
                //проходим по группам
                .entrySet()
                .stream()
                //отбираем числа, встречающиеся один раз
                .filter(e -> e.getValue().size() == 1)
                //вытаскиваем ключи
                .map(Map.Entry::getKey)
                //собираем в список
                .collect(Collectors.toList());

        return unique.get(0);
    }

    public static void main(String[] args) {
        System.out.println(findUniq(new double[]{1, 1, 1, 2, 1, 1}));
    }
}
