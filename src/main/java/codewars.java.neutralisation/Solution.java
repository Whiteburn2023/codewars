package codewars.java.neutralisation;

public class Solution {
  public static String neutralise(String s1, String s2) {

    StringBuilder stringBuilder = new StringBuilder();
    for (int i = 0; i < s1.length(); i++) {
      char symbolS1 = s1.charAt(i);
      char symbolS2 = s2.charAt(i);
      if (symbolS1 != symbolS2) {
        stringBuilder.append('0');
      } else {
        stringBuilder.append(symbolS1);
      }
    }
    return stringBuilder.toString();
  }
}