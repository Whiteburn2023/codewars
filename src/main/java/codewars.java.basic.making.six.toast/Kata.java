package codewars.java.basic.making.six.toast;

public class Kata{
  public static int sixToast(int num){

    num = num >= 6 ? num -6 : 6 - num;
    return num;
  }
}