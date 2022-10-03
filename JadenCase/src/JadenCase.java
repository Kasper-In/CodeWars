//метод возвращает строку где все первые буквы слов заглавные

import java.util.Arrays;
import java.util.stream.Collectors;

public class JadenCase {

    public String toJadenCase(String phrase) {
        // TODO put your code below this comment
        if (phrase == null || phrase.isEmpty()){
            return null;
        }
        String[] words = phrase.split(" ");

        return Arrays.stream(words)
                        .map(l->l.substring(0, 1).toUpperCase() + l.substring(1))
                        .collect(Collectors.joining(" "));
    }

    public static void main(String[] args) {
        JadenCase jc = new JadenCase();
        System.out.println(jc.toJadenCase("most trees are blue"));
    }
}
