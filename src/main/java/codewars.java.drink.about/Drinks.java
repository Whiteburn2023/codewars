package codewars.java.drink.about;

public class Drinks{
  
  public static String peopleWithAgeDrink(int age){

    String result = age < 14 ? "drink toddy" : age < 18 ? "drink coke" : age < 21 ? "drink beer" : "drink whisky";

    return result;
  }
}