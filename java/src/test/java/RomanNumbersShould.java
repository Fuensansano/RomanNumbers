import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RomanNumbersShould {

  public RomanNumbers romanNumbers;

  @BeforeEach
  public void setUp() {
    romanNumbers = new RomanNumbers();
  }

	@Test
	public void should_return_I_when_given_1() {
    assertEquals("I", romanNumbers.convert(1));
	}

  @Test
  public void should_return_II_when_given_2() {
    assertEquals("II", romanNumbers.convert(2));
  }

  @Test
  public void should_return_III_when_given_3() {
    assertEquals("III", romanNumbers.convert(3));
  }

  @Test
  public void should_return_IV_when_given_4() {
    assertEquals("IV", romanNumbers.convert(4));
  }

  @Test
  public void should_return_V_when_given_5() {
    assertEquals("V", romanNumbers.convert(5));
  }

  @Test
  public void should_return_VI_when_given_6() {
    assertEquals("VI", romanNumbers.convert(6));
  }

  @Test
  public void should_return_IX_when_given_9() {
    assertEquals("IX", romanNumbers.convert(9));
  }

  @Test
  public void should_return_X_when_given_10() {
    assertEquals("X", romanNumbers.convert(10));
  }
}
