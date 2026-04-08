package codewars.java.sum.the.strings;

public class Kata{
  
  public static String sumStr(String a, String b){
    int numA = a.isEmpty() ? 0 : Integer.parseInt(a);
    int numB = b.isEmpty() ? 0 : Integer.parseInt(b);
    String result = String.valueOf(numA + numB);

    return result;
  }
 
}