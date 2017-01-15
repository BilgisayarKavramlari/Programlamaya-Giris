using System;

class Program
{
    static int[,] salyangozMatrisiOlustur(int boyut)
    {
        //salyangoz matrisini tutmak için 2 boyutlu int dizisi oluşturuyoruz.
        int[,] matris = new int[boyut, boyut];

        //Alttaki Initialize() fonksiyonu ile dizinin elemanlarını varsayılan değerlerine yani sıfıra eşitliyoruz.
        //Bir elemanın sıfır olması aynı zamanda henüz o elemanın atanmadığı anlamına gelecektir.
        //Yani aşağıdaki kodlarda bu matrisin elemanının sıfıra eşit olup olmamasına göre işlem yapacağız.
        matris.Initialize();

        //Burada matris içinde salyangoz çizip gerekli değerleri atamak için gereken değişkenler mevcut.
        int apsisGezgini = 0, ordinatGezgini = 0, toplam = 1;

        //Bu değişken true olduğunda apsis ve ordinat gezginlerini arttırırız aksi halde azaltırız.
        bool arttir = true;

        //Burada boyut sayısı kadar döngü tekrar ettiğinde salyangoz tamamlanıyor.
        for (int i = 0; i < boyut; i++)
        {
            //apsis ve ordinat gezginlerinin arttırılmadan önceki değerleri atanıyor.
            matris[apsisGezgini, ordinatGezgini] = toplam;

            if (arttir) //Bu alanda hem apsis hem ordinat gezginlerinin değerleri max alabilecekleri kadar arttırılıyor.
            {
                //Arttırma işlemi yapmak için bir sonraki koordinatın dolu olup olmadığına bakıyoruz.
                while (apsisGezgini + 1 < boyut && matris[apsisGezgini + 1, ordinatGezgini] == 0)
                {
                    apsisGezgini++; //apsisGezginini 1 arttırıyoruz.
                    toplam++;       //toplam değişkenini 1 arttırıyoruz.

                    //Matrisimizde şuandaki noktanın değeri 'toplam' değişkenine eşit olduğu için 
                    //gerekli atamayı yapıyoruz.
                    matris[apsisGezgini, ordinatGezgini] = toplam;
                }
                //Bir üstteki işlemin aynısı ordinat gezgini için yapılıyor.
                while (ordinatGezgini + 1 < boyut && matris[apsisGezgini, ordinatGezgini + 1] == 0)
                {
                    ordinatGezgini++;
                    toplam++;
                    matris[apsisGezgini, ordinatGezgini] = toplam;
                }
            }
            else //Bu alanda hem apsis hem ordinat gezginlerinin değerleri minimum alabilecekleri kadar azaltıyoruz.
            {
                //Azaltma işlemi yapmak için bir önceki koordinatın dolu olup olmadığına bakıyoruz.
                while (apsisGezgini > 0 && matris[apsisGezgini - 1, ordinatGezgini] == 0)
                {
                    apsisGezgini--; //apsisGezginini 1 azaltıyoruz.
                    toplam++;       //toplam değişkenini 1 arttırıyoruz.

                    //Matrisimizde şuandaki noktanın değeri 'toplam' değişkenine eşit olduğu için 
                    //gerekli atamayı yapıyoruz.
                    matris[apsisGezgini, ordinatGezgini] = toplam;
                }
                //Bir üstteki işlemin aynısı ordinat gezgini için yapılıyor.
                while (ordinatGezgini > 0 && matris[apsisGezgini, ordinatGezgini - 1] == 0)
                {
                    ordinatGezgini--;
                    toplam++;
                    matris[apsisGezgini, ordinatGezgini] = toplam;
                }
            }
            //arttir değişkeninin tersini alıyoruz ki üstteki if yapısının blokları sırasıyla işlesin.
            arttir = !arttir;
        }
        //Oluşturulan salyangoz matrisini döndürüyoruz.
        return matris;
    }

    static void Main(string[] args)
    {
        //Matris boyutunu tutan değişken.
        int matrisBoyutu;

        //Kullanıcıdan matris boyutu girmesini istiyoruz.
        Console.WriteLine("Salyangoz matrisi için boyut giriniz:");

        //Girilen matris boyutunu alıyoruz.
        matrisBoyutu = int.Parse(Console.ReadLine());

        //Üstte yazdığımız 2 boyutlu int türünde dizi döndüren 'salyangozMatrisiOlustur' ismindeki 
        //fonksiyonu çağırarak istenilen boyutta salyangoz matrisi oluşturuyoruz.
        int[,] matris = salyangozMatrisiOlustur(matrisBoyutu);

        //Oluşturduğumuz salyangoz matrisini ekrana yazdırıyoruz.
        for (int satir = 0; satir < matrisBoyutu; satir++)
        {
            for (int sutun = 0; sutun < matrisBoyutu; sutun++)
            {
                //Burada ekrana yazılan her değerin yanına düzenli görünmesi için tab boşluğu ekleniyor.
                Console.Write(matris[sutun, satir] + "\t");
            }
            //Alt satıra geçiyoruz.
            Console.WriteLine();
        }
        Console.ReadKey();
    }
}
