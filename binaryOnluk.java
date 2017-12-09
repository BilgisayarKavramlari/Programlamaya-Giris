  public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Integer sayi;
        String binarySayi;
        System.out.println("Binary Bir Sayı Girin:");
        binarySayi = s.next();
        sayi = Integer.parseInt(binarySayi, 2);
        System.out.println(sayi);
    }
