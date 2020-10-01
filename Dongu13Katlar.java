public class Dongu13Katlar {
  public static void main(String[] args) {
    int i = 1;
    while (i < 100) {
      if ((i % 13) == 0) {
        System.out.println(i);
      }
      i++;
    }
  }
}
