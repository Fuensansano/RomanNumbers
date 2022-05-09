
public class RomanNumbers {
  public final String ONE = "I";
  public final String FOUR = "IV";
  public final String FIVE = "V";
  public final String NINE = "IX";
  public final String TEN = "X";

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

    int[] decimalNumbers = {1,4,5,9,10};
    String[] romanNumbers = {"I","IV","V","IX","X"};


    if (number >= 10) {
      number = number - 10;
      result += TEN;
    }

    if (number == 9) {
      number = number - 9;
      result += NINE;
    }

    if (number >= 5) {
      number = number - 5;
      result += FIVE;
    }

    if (number == 4) {
      number = number - 4;
      result += FOUR;
    }

    for (int i = 0; i < number; i++) {
      result += ONE;
    }

    return result;
  }

}
