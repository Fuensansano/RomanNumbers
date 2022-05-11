import org.junit.jupiter.api.Assertions;
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
      "III, 3",
      "XI, 11",
      "XIV, 14",
      "XV, 15",
      "XIX, 19",
      "XX, 20",
      "XXIV, 24",
  })
  public void should_return_roman_number_when_given_decimal_number(String romanNumber, int decimalNumber) {
    assertEquals(romanNumber, romanNumbers.convert(decimalNumber));
  }

  @ParameterizedTest
  @CsvSource({
    "I, 1",
    "IV, 4",
    "V, 5",
    "IX, 9",
    "X, 10",
    "XL, 40",
    "L, 50",
    "XC, 90",
    "C, 100",
    "CD, 400",
    "D, 500",
    "CM, 900"
  })
  public void should_return_unit_roman_number_when_given_decimal_number(String romanNumber, int decimalNumber) {
    assertEquals(romanNumber, romanNumbers.convert(decimalNumber));
  }
  @Test
  public void should_can_not_convert_to_roman_number() {
    Assertions.assertThrows(IllegalArgumentException.class, () -> {
      romanNumbers.convert(0);
    });
  }
}
