
public class RomanNumbers {

  public String convert(int number) {
    if (number == 6) {
      return "VI";
    }

    if (number == 5) {
      return "V";
    }

    if (number == 4) {
      return "IV";
    }

    String result = "";
    for (int i = 0; i < number; i++) {
      result += "I";
    }

    return result;
  }
}
