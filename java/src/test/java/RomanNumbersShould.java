import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class RomanNumbersShould {

  public RomanNumbers romanNumbers;

  @BeforeEach
  public void setUp() {
    romanNumbers = new RomanNumbers();
  }

  @ParameterizedTest
  @CsvSource({
      "I, 1",
      "III, 3",
      "IV, 4",
      "V, 5",
      "IX, 9",
      "X, 10",
      "XI, 11",
      "XIV, 14",
      "XV, 15",
      "XIX, 19",
      "XX, 20",
      "XXIV, 24",
      "XL, 40",
      "L, 50",
      "XC, 90"
  })
  public void should_return_roman_number_when_given_decimal_number(String romanNumber, int decimalNumber) {
    assertEquals(romanNumber, romanNumbers.convert(decimalNumber));
  }
}
