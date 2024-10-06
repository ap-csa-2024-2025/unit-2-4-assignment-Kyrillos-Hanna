import java.util.Scanner;
public class Main
{
  public static void main(String[] args)
  {
   Scanner scanner = new Scanner(System.in);
   System.out.println("First String");
   String firstString = scanner.nextLine();
   System.out.println("Second String");
   String secondString = scanner.nextLine();
   System.out.println("Int");
   int number = scanner.nextInt();
   scanner.nextLine();

   System.out.println(lastFirstN(firstString, secondString, number));

   System.out.println("Third String");
   String thirdString = scanner.nextLine();
   System.out.println("Fourth String");
   String fourthString = scanner.nextLine();

   stringManip(thirdString, fourthString);

  }

  public static String lastFirstN(String s1, String s2, int n) {
    String part1 = s1.substring(s1.length() - n, s1.length());
    String part2 = s2.substring(0, n );
    return part1 + part2;
  }

  public static void stringManip(String s1, String s2) {
    s1 = s1.toUpperCase();
    s2 = s2.toLowerCase();
    String s2Caliptal = s2.substring(0, 1);
    s2Caliptal = s2Caliptal.toUpperCase();
    s2 = s2Caliptal + s2.substring(1, s2.length());
    System.out.println(s1);
    System.out.println(s2);
  }
}
