package codewars.java.is.there.a.vowel.in.there;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class VowelMapper {

    public static List<Object> isVow(List<Integer> a) {
        List<Object> output = new ArrayList<>(a);
        String[] vowels = {"a", "e", "i", "o", "u"};
        for (int i = 0; i < a.size(); i++) {
            char aChar = (char) a.get(i).intValue();
            for (int j = 0; j < vowels.length; j++) {
                if (aChar == vowels[j].charAt(0)){
                    output.set(i, vowels[j]);
                }
            }
        }
        return output;
    }
}