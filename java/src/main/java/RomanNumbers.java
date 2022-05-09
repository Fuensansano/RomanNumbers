
public class RomanNumbers {
  public final String ONE = "I";
  public final String FIVE = "V";
  public final String TEN = "X";

  public String convert(int number) {
    String result = "";

    if (number == 9) {
      return "IX";
    }

    if (number == 4) {
      return "IV";
    }

    result += appendCharacter(number);

    return result;
  }

  private String appendCharacter(int number) {
    String result = "";

    if (number >= 10) {
      number = number - 10;
      result += TEN;
    }

    if (number >= 5) {
      number = number - 5;
      result += FIVE;
    }

    for (int i = 0; i < number; i++) {
      result += ONE;
    }
    return result;
  }

}
