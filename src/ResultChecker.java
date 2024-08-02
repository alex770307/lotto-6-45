import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Этот класс отвечает за проверку совпадений между сгенерированными числами и числами, введенными пользователем.
 */
public class ResultChecker {

    /**
     * Метод
     * Принимает два набора чисел (сгенерированные и введенные пользователем).
     * @param generatedNumbers
     * @param userNumbers
     * @return Возвращает количество совпадений между этими наборами.
     */
    public int getMatchCount(Set<Integer> generatedNumbers,
                             Set<Integer> userNumbers) {
        return (int) userNumbers.stream()
                .filter(generatedNumbers::contains)
                .count();
    }

    /**
     * Метод
     * Принимает два набора чисел
     * @param generatedNumbers
     * @param userNumbers
     * @return Возвращает список чисел, которые совпадают в обоих наборах.
     */
    public List<Integer> getMatchingNumbers(Set<Integer> generatedNumbers,
                                            Set<Integer> userNumbers) {
        return userNumbers.stream()
                .filter(generatedNumbers::contains)
                .collect(Collectors.toList());
    }

/**
 * Метод
 * Принимает количество совпадений.
 * @return Возвращает `true`, если количество совпадений равно 6 (джекпот), иначе `false`.
 */
    public boolean isJackpot(int matchCount) {
        return matchCount == 6;
    }
}
