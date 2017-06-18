Console.WriteLine("İsminizi Giriniz");
string girilen = Console.ReadLine();
string[] isimler = girilen.Split(new char[]{' '});
string harfler = "";
foreach(var isim in isimler)
{
  harfler += isim[0];
  Console.WriteLine(isim);
}
Console.WriteLine(harfler);
