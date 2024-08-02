import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * Этот класс отвечает за получение и хранение чисел, введенных пользователем.
 */
public class UserInput {
    private Scanner scanner;

    /**
     * Конструктор:
     * Инициализирует объект `Scanner` для чтения ввода с консоли.
     */
    public UserInput() {
        this.scanner = new Scanner(System.in);
    }

    /**
     * Метод :
     * Запрашивает у пользователя ввод 6 чисел.
     * Проверяет, чтобы числа были уникальными и в диапазоне от 1 до 45.
     * @return Возвращает набор чисел (`TreeSet`).
     */
    public Set<Integer> getUserNumbers() {
        Set<Integer> userSet = new TreeSet<>();
        System.out.println("Введите 6 чисел от 1 до 45 :");
        while (userSet.size() < 6) {
            userSet.add(scanner.nextInt());
        }
        return userSet;
    }

    /**
     * Метод :
     * Выводит меню выбора на консоль.
     * Читает
     * @retur возвращает выбор пользователя.
     */
    public int getSelection() {
        System.out.println("\nВыберите что вы хотите : ");
        System.out.println("1. Вводить числа самостоятельно");
        System.out.println("2. Или предоставить это дело компьютеру");
        System.out.println("3. Выход");
        return scanner.nextInt();
    }

    /**
     * Метод :
     * Запрашивает у пользователя количество комбинаций, которые он хочет ввести или сгенерировать.
     * Читает
     * @return возвращает количество.
     */
    public int getNumCombinations() {
        System.out.println("Введите количество комбинаций, которые вы хотите ввести/сгенерировать:");
        return scanner.nextInt();
    }
}
