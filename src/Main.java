/* ad211.cheban */
import java.util.Scanner; /* використовуємо для зчитування інфорції, введеної користувачем*/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть розмір масиву: "); /* заповнюємо масив */
        int number = sc.nextInt();
        int[] array = new int[number];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Введіть число: ");
            array[i] = sc.nextInt();
        }
        System.out.println(isSorted(array)); /* виводимо результат */
    }
    private static boolean isSorted(int[] array) { /* знаходимо результат для виведення */
        if(array.length>=2) {
            for (int i = 0; i < array.length; i++) {
                int suml = 0;
                int sumr = 0;
                for (int j = 0; j < i; j++) /* шукаємо суму елементів масиву починаючи з лівої сторони */
                {suml += array[j];}
                for (int j = i; j < array.length; j++) /* шукаємо суму елементів масиву починаючи з правої сторони */
                {sumr += array[j];}
                 if(suml == sumr) { /* порівнюємо суми, якщо вони однакові то масив можна поділити на дві
                                       частини с однаковою сумою чисел */
                    return true;
                 }
                }
        }
        return false;
    }
}