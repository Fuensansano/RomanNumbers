
public class RomanNumbers {
public final String ONE = "I";
  public final String FIVE = "V";

  public String convert(int number) {
    String result = "";

    if (number == 10) {
      return "X";
    }

    if (number == 9) {
      return "IX";
    }

    if (number > 5) {
      number = number - 5;
      result += FIVE;
    }

    if (number == 5) {
      return "V";
    }

    if (number == 4) {
      return "IV";
    }

    result += appendCharacter(number);

    return result;
  }

  private String appendCharacter(int number) {
    String result = "";
    for (int i = 0; i < number; i++) {
      result += "I";
    }
    return result;
  }

}
