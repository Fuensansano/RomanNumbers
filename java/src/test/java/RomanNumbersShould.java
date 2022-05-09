import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RomanNumbersShould {


	@Test
	public void should_return_I_when_given_1() {
    RomanNumbers romanNumbers = new RomanNumbers();
    assertEquals("I", romanNumbers.convert(1));
	}

  @Test
  public void should_return_II_when_given_2() {
    RomanNumbers romanNumbers = new RomanNumbers();
    assertEquals("II", romanNumbers.convert(2));
  }

  @Test
  public void should_return_III_when_given_3() {
    RomanNumbers romanNumbers = new RomanNumbers();
    assertEquals("III", romanNumbers.convert(3));
  }

}
