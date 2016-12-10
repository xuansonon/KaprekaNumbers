import java.io.*;
import java.lang.*;
import java.util.*;

class KaprekarNumber {

  public static Boolean ifValidNumber(int aNumber) {
    return (aNumber > 0);
  }

  public static void seperateDigitsToArray(ArrayList<Integer> aList, int aSqrdNum) {
    int tempSqrd = aSqrdNum;
    while(tempSqrd > 0) {
      aList.add(0, tempSqrd % 10);
      tempSqrd /= 10;
    }
  }

  public static int combineDigits(ArrayList<Integer> aList, int aStartPosition, int aEndPosition) {
    int total = 0;
    for(int i = aStartPosition; i <= aEndPosition; i++) {
      total = total * 10 + aList.get(i);
    }
    return total;
  }

  public static void checkKaprekar(int aSqrdNum, int aNum) {
    int sqrdNum = aSqrdNum;
    ArrayList<Integer> sqrdNumArray = new ArrayList<Integer>();
    seperateDigitsToArray(sqrdNumArray, sqrdNum);
    int i = 0;
    while(i < (sqrdNumArray.size() - 1)) {
      int firstSum = combineDigits(sqrdNumArray, 0, i);
      int secondSum = combineDigits(sqrdNumArray, i + 1, sqrdNumArray.size() - 1);
      if(((firstSum + secondSum) == aNum) && (secondSum > 0)) {
        System.out.println(String.valueOf(aNum) + " (" + firstSum + " + " + secondSum + ").");
        return;
      }
      i++;
    }
  }

  public static void findKaprekarNumber(int number) {
    if(ifValidNumber(number)) {
      int numSqrd = (int) (Math.pow((double) number, 2.0));
      checkKaprekar(numSqrd, number);
    } else {
      System.out.println("Invalid number.");
    }
  }

  public static int getInput(String aMessage) {
    System.out.print(aMessage);
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String input = null;
    int resultNumber = 0;
    try {
      input = br.readLine();
      resultNumber = Integer.parseInt(input);
    } catch(IOException e) {
      return 0;
    } catch(NumberFormatException e) {
      return 0;
    }
    return resultNumber;
  }

  public static void main(String[] args) {
    int startRange = getInput("Please enter a starting range number: ");
    int endRange = getInput("Please enter a ending range number: ");
    System.out.println("Kapreka Numbers Found: (" + String.valueOf(startRange) + " - " + String.valueOf(endRange) + ")");
    for(int i = startRange; i <= endRange; i++) {
      findKaprekarNumber(i);
    }
    System.out.println("");
  }
}
