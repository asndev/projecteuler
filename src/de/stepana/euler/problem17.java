package de.stepana.euler;

/**
 * 
 * @author antonstepan
 */
public class problem17 {

  public static void main(final String[] args) {

    final long start = System.nanoTime();
    int sum = 0;
    for (int i = 1; i <= 1000; i++) {
      final String act = Integer.toString(i);

      switch (act.length()) {

        case 1:
          sum += singleDigit(i);
          break;
        case 2:
          sum += doubleDigit(i);
          break;
        case 3:
          sum += tripleDigit(i);
          break;
        case 4:
          sum += 11;// one thousand
          break;
      }
    }
    final long end = System.nanoTime();
    final long dauer = end - start;
    System.out.println("Dauer: " + dauer + "ns <=> " + dauer * 1e-6 + "ms");
    System.out.println(sum);
  }

  public static int tripleDigit(final int n) {

    if (n == 100) return singleDigit(n / 100) + 7;
    if (n == 200) return singleDigit(n / 100) + 7;
    if (n == 300) return singleDigit(n / 100) + 7;
    if (n == 400) return singleDigit(n / 100) + 7;
    if (n == 500) return singleDigit(n / 100) + 7;
    if (n == 600) return singleDigit(n / 100) + 7;
    if (n == 700) return singleDigit(n / 100) + 7;
    if (n == 800) return singleDigit(n / 100) + 7;
    if (n == 900) return singleDigit(n / 100) + 7;

    final String numb = Integer.toString(n);
    final int a = Integer.parseInt(numb.charAt(0) + "");
    final int b = Integer.parseInt(numb.charAt(1) + "");
    final int c = Integer.parseInt(numb.charAt(2) + "");
    final int bc = b == 0 ? c : Integer.parseInt(numb.charAt(1) + "" + numb.charAt(2));
    final int pwnd = b == 0 ? singleDigit(c) : doubleDigit(bc);

    return singleDigit(a) + 7 + 3 + pwnd; // One Hundred and thirty two
  }

  public static int doubleDigit(final int n) {

    int res = 0;

    if (n == 10) {
      return 3; // ten
    }
    if (n == 11) {
      return 6; // eleven
    }
    if (n == 12) {
      return 6; // twelve
    }
    if (n == 13) {
      return 8; // thirteen
    }
    if (n == 14) {
      return 8; // fourteen
    }
    if (n == 15) {
      return 7; // fifteen
    }
    if (n == 16) {
      return 7; // sixteen
    }
    if (n == 17) {
      return 9; // seventeen
    }
    if (n == 18) {
      return 8; // eighteen
    }
    if (n == 19) {
      return 8; // nineteen
    }
    if (n == 20) {
      return 6; // twenty
    }


    final String number = Integer.toString(n);
    final int a = Integer.parseInt(number.charAt(0) + "");
    final int b = Integer.parseInt(number.charAt(1) + "");


    switch (a) {
      case 2:
        res = 6; // twenty
        break;
      case 3:
        res = 6; // thirty
        break;
      case 4:
        res = 5; // forty
        break;
      case 5:
        res = 5; // fifty
        break;
      case 6:
        res = 5; // sixty
        break;
      case 7:
        res = 7; // seventy
        break;
      case 8:
        res = 6; // eighty
        break;
      case 9:
        res = 6; // ninety
        break;
    }

    return res + singleDigit(b);
  }

  public static int singleDigit(final int n) {

    int res = 0;
    switch (n) {
      case 0:
        res = 0;
        break;
      case 1:
        res = 3; // one
        break;
      case 2:
        res = 3; // two
        break;
      case 3:
        res = 5; // three
        break;
      case 4:
        res = 4; // four
        break;
      case 5:
        res = 4; // five
        break;
      case 6:
        res = 3; // six
        break;
      case 7:
        res = 5; // seven
        break;
      case 8:
        res = 5; // eight
        break;
      case 9:
        res = 4; // nine
        break;

    }

    return res;

  }
}
