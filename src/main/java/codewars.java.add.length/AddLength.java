package codewars.java.add.length;

public class AddLength{
  
  public static String[] addLength(String str){
    String[] array = str.split(" ");

    for (int i = 0; i < array.length; i++) {
      array[i] = array[i] + " " + array[i].length();
    }

    return array;
  }
}