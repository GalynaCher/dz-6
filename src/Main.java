import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        // приймає як вхідний параметр масив рядків; (наприклад "мама", "папа", "їж їжак желе");
        String[] stringsArray = new String[] {"мама", "папа", "їж їжак желе"};

        System.out.println("Рядки в яких кожен символ трапляється парну кількість разів та набір унікальних символів у знайдених словах: ");
        for (int i = 0; i < stringsArray.length; i++) {
            Map<Character, Integer> letters = new HashMap<>(); // Reset values

            for (char ch : stringsArray[i].toCharArray()) {
                int count = letters.getOrDefault(ch, 0);
                letters.put(ch, count + 1);
                //System.out.println(stringsArray[i]);
            }

            boolean isEveryLetterOccursTwice = true;
            Set<String> hashSet = new HashSet<>();

            for (Map.Entry<Character, Integer> pairVar : letters.entrySet()){

                //System.out.println(pairVar.getKey() + " : " + pairVar.getValue());
                if (pairVar.getValue() % 2 != 0)
                    isEveryLetterOccursTwice = false;
                else
                    hashSet.add(pairVar.getKey() + "");
            }

           if (isEveryLetterOccursTwice == true) {
                    int num = i + 1;
                    System.out.println("Рядок #" + num + ": " + stringsArray[i]);
                    System.out.println(hashSet);
            }
        }
    }
}