public static void main(String[] args) {
        
    System.out.println("Saat sayısını giriniz: ");
    Scanner s = new Scanner (System.in);
    int i = s.nextInt();
    int x = i*1;
    int y = i*2;
    int z = i*3;
    int t = i*4;
    int w = i*5;    
    if(i >= 0 && i < 10 ){
        System.out.println("Mesai Ücreti: "+ x);
    } else if(i >= 10 && i<20){
        System.out.println("Mesai Ücreti: "+ y);
    } else if(i >= 20 && i<40){
        System.out.println("Mesai Ücreti: "+ z);      
    } else if(i >= 40 && i<100){
        System.out.println("Mesai Ücreti: "+ t);
    } else if(i >= 100){
        System.out.println("Mesai Ücreti: "+ w);
    } else {
        System.out.println("Lütfen pozitif giriş yapın ");
    }
  }
}
