class Ilk20AsalSayi
{
    public static void main(String[] args) 
    {
        byte bolenSayisi = 0, sayıKontrolEdilen = 0, sayıKontrolEden = 0, sayac = 1;
        for (byte i = 1; i <= 20; i++) 
        {
            sayıKontrolEdilen = i;
            for (byte j = 1; j <= sayıKontrolEdilen; j++) 
            {
                sayıKontrolEden = j;
                if (sayıKontrolEdilen % sayıKontrolEden == 0) 
                {
                    bolenSayisi++;
                }
            }
            if (bolenSayisi == 2) 
            {
                System.out.println(sayac + ". asal sayı = " + sayıKontrolEdilen);
                sayac++;
            }
            bolenSayisi = 0;
        }
    }
}
