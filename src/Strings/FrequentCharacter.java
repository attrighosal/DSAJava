package Strings;

import java.util.Arrays;

public class FrequentCharacter {

  private static int index(char ch) {
    return ch-'a';
  }

  private static char character(int index) {
    return (char)(97+index);
  }

  public static void main(String[] args) {

    String s = "helloworld"; // -> 1
    int[] frequency = new int[26]; // -> 1

    for (int i=0; i<s.length(); i++) { // -> n
      char ch = s.charAt(i);  // ch = letter  // -> 1*n
      int index = index(ch); // index = position in the frequency array // -> 1*n
      frequency[index]++; // incrementing the count // -> 1*n
    }

    int maxValue=0, maxIndex=-1;   // -> 1
    for (int i=0; i<26; i++) { // -> 26
      if (frequency[i]>maxValue) {  // -> 1*26
        maxValue = frequency[i];  // -> 1*26
        maxIndex = i; // -> 1*26
      }
    }

    // Total = 1+1+n+n+n+n + 26+26+26+26 = 4n + 106 = O(n)
    // Space Complexity = O(1)

    System.out.println(maxValue);
    System.out.println(maxIndex);

    char ch = character(maxIndex);
    System.out.println(ch);

    System.out.println(Arrays.toString(frequency));
  }
}
