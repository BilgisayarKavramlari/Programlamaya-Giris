import java.util.Scanner;

public class JavaApplication1 {
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        Integer carpim;
        System.out.println("Kaç Saat Mesai Yapnız ? :");
        Integer saat=s.nextInt();
        carpim=(saat<10 ? 1:(saat<20?2:(saat<40?3:4)));
        System.out.println("Mesai Ücretiniz : "+saat*carpim);
    }
}
