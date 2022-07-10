
public class reverser {
    static int[] repeats = {1000, 10_000, 100_000};
    static String word = "Синхрофазотрон";

    public static void main (String[] args) {
        reverse(repeats, word);
    }

    private static void reverse(int[] arr, String word) {
        char[] word_as_array = word.toCharArray();
        char[] reversed_word = new char[word.length()];

        for (int z = 0; z < arr.length; z++) {    // В этом цикле форме мы проходим про всем возможным значениям повторений метода (1000, 10_000, 100_000).
            long startTime = System.currentTimeMillis();
            for (int j = 0; j < arr[z]; j++) {    // В этом цикле метод повторяется нужное количество раз.
                for (int x = 0; x < word_as_array.length; x++) {     // В этом цикле происходит переворачивание слова.
                    reversed_word[(word_as_array.length - 1) - x] = word_as_array[x];
                }
            }
           long finishTime = System.currentTimeMillis();
           long time = finishTime - startTime;
            System.out.println("Количество повторений :" + arr[z] + "| Время работы: " + time + " миллисекунд.");
        }
        System.out.println("Строка : " + word);
        System.out.println("Развернутая строка: " +String.valueOf(reversed_word));
    }
}
