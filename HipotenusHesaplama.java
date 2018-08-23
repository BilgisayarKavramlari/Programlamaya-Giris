import java.util.Scanner;

public class HipotenusHesaplama{

public static void main(String[] args){
Scanner scan = new Scanner(System.in);

System.out.println("Hipotenüs Hesaplayan Program");
System.out.print("Dik üçgenin ilk kenarını giriniz: ");
int kenar1 = scan.nextInt();
System.out.print("Dik üçgenin ikinci kenarını giriniz: ");
int kenar2 = scan.nextInt();

System.out.println("Üçgenin hipotenüsü: " + Math.sqrt((Math.pow(kenar1, 2) + Math.pow(kenar2, 2)));





}


}
