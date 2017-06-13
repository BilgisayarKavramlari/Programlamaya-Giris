public static void main(String[] args) {
        System.out.println("Mesafeyi km olarak girin: ");
        Scanner s = new Scanner(System.in);
        float x = s.nextInt();
        System.out.println("Aracın ortalama hızını girin: ");
        Scanner ss = new Scanner(System.in);
        float y = ss.nextInt();
        float toplamSure = x/y;
        System.out.println("Süre: "+ toplamSure+" saattir");
    
    
    }
    
}
