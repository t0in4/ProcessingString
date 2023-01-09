import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        char[] chars = {'A', 'B', 'C', 'D', 'E', 'F' };

        String stringFromChars = String.valueOf(chars); // массив буквенных символов превратили в строку
        System.out.println(Arrays.asList(chars)); // вывод адреса в памяти где находится массив
        System.out.println(stringFromChars);
        char[] charsFromString = stringFromChars.toCharArray(); // строку превратили в массив буквенных символов
        System.out.println(charsFromString); // просто вывод массива

        String text = "Hello";
        String[] parts = text.split(""); // применяя метод сплит разделяем строку в массив
        System.out.println(parts); // вывод в консоль адреса в памяти где находится массив
        System.out.println(Arrays.asList(parts)); // вывод самого массива

        String sentence = "a long text";
        String[] words = sentence.split(" "); // для массива слов
        System.out.println(Arrays.asList(words));
        String[] letters = sentence.split("");
        System.out.println(Arrays.asList(letters)); // для массива символов

        String number = "+1-213-345-6789";
        String[] digits = number.split("-");
        System.out.println(Arrays.asList(digits));

        String phrase = "I'm gonna be a programmer";
        String[] phrasePart = phrase.split(" gonna be ");
        System.out.println(Arrays.asList(phrasePart));

        // проход через строку
        String scientistName = "Isaac Newton";
        
        for (int i = 0; i < scientistName.length(); i++) {
            System.out.print(scientistName.charAt(i) + " ");

        }


    }
}