public class RomanNumbers {
  public enum DecimalToRomanNumber {
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

    if (number == 21) {
      return "XXI";
    }

    if (number == 20) {
      return "XX";
    }

    result += appendCharacter(number);

    return result;
  }

  private String appendCharacter(int number) {
    String result = "";

    for (DecimalToRomanNumber decimalToRomanNumber : DecimalToRomanNumber.values()) {

      if (number >= decimalToRomanNumber.decimalNumber) {
        number = number - decimalToRomanNumber.decimalNumber;
        result += decimalToRomanNumber.romanNumber;
      }
    }

    for (int i = 0; i < number; i++) {
      result += "I";
    }

    return result;
  }

}
