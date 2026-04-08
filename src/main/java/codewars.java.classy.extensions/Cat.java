package codewars.java.classy.extensions;

public class Cat extends Animal {
  public Cat(String name) {
    super(name);
  }

  public String speak(){
    return String.format("%s meows.", this.name);
  }
  


}