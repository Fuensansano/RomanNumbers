
public class RomanNumbers {
public final String ONE = "I";
  public final String FIVE = "V";

  public String convert(int number) {
    String result = "";

    if (number > 5) {
      for (int i = 5; i < number; i++) {
        result += ONE;
      }
      return FIVE + result;
    }

    if (number == 5) {
      return "V";
    }

    if (number == 4) {
      return "IV";
    }

    for (int i = 0; i < number; i++) {
      result += "I";
    }

    return result;
  }
}
