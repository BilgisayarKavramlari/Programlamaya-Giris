package YasHesaplama;

import java.util.*;
import java.text.*;
/**
 *
 * @author menderes
 */

public class YasveAldigiGunHesaplama {
 
    public static void main (String[] args){
    
    //Şu anda sistemin bulunduğu günü önce string'e sonra da işlem yapabilmek için integer'a dönüştür.    
    Date simdikiGun = new Date( );
    SimpleDateFormat gun = new SimpleDateFormat ("DD");
    String gunuSDonustur = gun.format(new Date());
    int gunuDonustur = Integer.parseInt(gunuSDonustur);
      
    // Şu anda sistemin bulunduğu ayı önce string'e sonra da işlem yapabilmek için integer'a dönüştür.
    Date simdikiAy = new Date();
    SimpleDateFormat ay = new SimpleDateFormat ("MM");
    String ayiSDonustur = ay.format(new Date());
    int ayiDonustur = Integer.parseInt(ayiSDonustur);
    
    // Şu anda sistemin bulunduğu yılı önce string'e sonra da işlem yapabilmek için integer'a dönüştür.
    Date simdikiYil = new Date();
    SimpleDateFormat yil =  new SimpleDateFormat ("y");
    String yiliSDonustur = yil.format(new Date());
    int yiliDonustur = Integer.parseInt(yiliSDonustur);
    
    //Kullanıcı giriş aygıtı ile veriyi girme aşaması.
    System.out.println("Merhaba. Yaş hesaplama programına hoşgeldiniz. Yaşınızı hesaplayabilmemiz için sırası ile doğum tarihinizin gün, ay ve yılını giriniz.");
    Scanner read = new Scanner(System.in);
    System.out.println("Doğum gününüz?: ");
    int dogumGunu= read.nextInt();
    System.out.println("Doğum ayınız?: ");
    int dogumAyi= read.nextInt();
    System.out.println("Doğum yılınız?: ");
    int dogumYili= read.nextInt();
    
    //Burada kullanıcının yaşı, mevcut yıl - doğum yılı işlemi yapılarak bulunur. Kod bloğunun çalıştığı anda, kullanıcının doğdu ay ve gün 
    //henüz gelmemiş ise yaşını bir eksiltip, hangi yaşta gün aldığını ekrana yazılması için if-else kullanıldı.
    int hesaplamaYap = (yiliDonustur - dogumYili); 
    if (ayiDonustur <= dogumAyi || gunuDonustur <= dogumGunu)
       {
           int yiliHesapla = ((yiliDonustur - dogumYili-1));
           int aldigiGun = (yiliHesapla + 1);
           System.out.println("Yaşınız: " + yiliHesapla + "'dir. Siz, " + aldigiGun + " yaşından gün aldınız.");
        }
    else
        {
            int yiliHesapla = ((yiliDonustur - dogumYili));
            int aldigiGun = (yiliHesapla + 1);
            System.out.println("Yaşınız: " + yiliHesapla + "'dir ve siz, " + aldigiGun + " yaşından gün aldınız.");
        }
    }
}
