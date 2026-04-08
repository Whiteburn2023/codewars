package codewars.java.classy.extensions;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;

// TODO: Replace examples and use TDD by writing your own tests

class SampleTest {
  @Test
  void mrWhiskers() {
    Cat cat = new Cat("Mr Whiskers");
    assertEquals("Mr Whiskers meows.", cat.speak());
    assertInstanceOf(Animal.class, cat, "Your Cat class should extend Animal");
  }

  @Test
  void lamp() {
    Cat cat = new Cat("Lamp");
    assertEquals("Lamp meows.", cat.speak());
  }
  @Test
  void moneyBags() {
    Cat cat = new Cat("$$Money Bags$$");
    assertEquals("$$Money Bags$$ meows.", cat.speak());
  }
}
