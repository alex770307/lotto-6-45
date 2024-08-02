import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Этот класс отвечает за генерацию уникальных случайных чисел для лотереи.
 */
public class LotteryNumberGenerator implements NumberGenerator{
    /**
     * Константы:
     * NUMBER_COUNT — количество чисел, которые нужно сгенерировать (6).
     * MAX_NUMBER — максимальное значение числа (45).
     */
    private static final int NUMBER_COUNT = 6;
    private static final int MAX_NUMBER = 45;

    /**
     * Использует `Random` для генерации случайных чисел.
     * Использует `IntStream` для генерации потока случайных чисел.
     * Применяет `distinct()` для обеспечения уникальности чисел.
     * Ограничивает поток до `NUMBER_COUNT` чисел.
     * Преобразует поток в коллекцию `TreeSet`, чтобы числа были отсортированы и уникальны.
     * @return  возвращает уникальные случайные числа
     */
    @Override
    public Set<Integer> generateNumbers() {
        Random random = new Random();
        return IntStream.generate(() -> random.nextInt(1, MAX_NUMBER + 1))
                .distinct()
                .limit(NUMBER_COUNT)
                .boxed()
                .collect(Collectors.toCollection(TreeSet::new));
    }
}
