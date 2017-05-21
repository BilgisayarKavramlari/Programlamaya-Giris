package dikucgenkontrol;
import java.util.Scanner;

/**
 *
 * @author dusunvekodla
 */
 
public class DikUcgenKontrol {

    public static void main(String[] args) {
        
        System.out.println("Üçgenin kenar uzunluklarını giriniz..");
        Scanner scanner = new Scanner(System.in);
        
        //Kullanıcından alınan kenar uzunluklarını tutan dizi
        int[] kenarUzunluklari = new int[3];
        //Diziyi sıralarken kullanılan değişken
        int temp =0;        
        
        //Kullanıcıdan sayıların alındığı ve sıralandığı döngü
        for(int i=0;i<3;i++)
        {
            //Kenar uzunluğu alınır
            kenarUzunluklari[i] = scanner.nextInt();
            //ilk veri değilse ve dizinin elemanı kendinden önceki elemandan küçükse
            //yerleri değiştirilir
            //dizi veriler alınırken aynı anda en büyük elemanı dizinin sonuna atar
            if(i>0)
            {
                if(kenarUzunluklari[i] < kenarUzunluklari[i-1])
                {
                    temp = kenarUzunluklari[i];
                    kenarUzunluklari[i] = kenarUzunluklari[i-1];
                    kenarUzunluklari[i-1] = temp;
                }
            }
        }
        //döngü sona erdiğinde dizide üç kenar uzunluğu en büyük kenar son eleman
        //olmak üzere sıralanmıştır
        
        //Eğer hipotenüs kuralına uyuyorsa üçgen dik üçgendir
        if( KareAl(kenarUzunluklari[2]) == KareAl(kenarUzunluklari[0]) + KareAl(kenarUzunluklari[1]) )
        {
            System.out.println("Dik Üçgendir.");
        }
        else
            System.out.println("Dik Üçgen Değildir.");
        
        
    }
    
    //Hipotenus formulu için kare al methodu
    public static int KareAl(int sayi)
    {
        return sayi*sayi;
    }
    
}
