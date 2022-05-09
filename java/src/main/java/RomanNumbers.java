
public class RomanNumbers {

  public String convert(int number) {
    if (number == 5) {
      return "V";
    }

    String result = "";
    for (int i = 0; i < number; i++) {
      result += "I";
    }

    return result;
  }
}
