public class RomanNumbers {
  public enum DecimalToRomanNumber {
    FIFTY ("L", 50),
    FORTY ("XL", 40),
    TEN ("X", 10),
    NINE ("IX", 9),
    FIVE ("V", 5),
    FOUR ("IV", 4),
    ONE ("I", 1);

    private final String romanNumber;
    private final int decimalNumber;

    DecimalToRomanNumber(String romanNumber, int decimalNumber) {
      this.romanNumber = romanNumber;
      this.decimalNumber = decimalNumber;
    }
  }

  public String convert(int number) {
    String result = "";

    for (DecimalToRomanNumber decimalToRomanNumber : DecimalToRomanNumber.values()) {

      if (number >= decimalToRomanNumber.decimalNumber) {
        result += appendCharacter(number / decimalToRomanNumber.decimalNumber, decimalToRomanNumber.romanNumber);
        number %= decimalToRomanNumber.decimalNumber;
      }
    }

    return result;
  }

  private String appendCharacter(int number, String character) {
    String result = "";

    for (int i = 0; i < number; i++) {
      result += character;
    }

    return result;
  }

}
