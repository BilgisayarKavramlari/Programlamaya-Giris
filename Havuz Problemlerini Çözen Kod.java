public static void main(String[] args) {
        
    System.out.println("a musluğu havuzu kaç saatte doldurmaktadır: ");
    Scanner a = new Scanner (System.in);
    float x = a.nextInt();
    System.out.println("b musluğu havuzu kaç saatte doldurmaktadır: ");
    Scanner b = new Scanner (System.in);
    float y = b.nextInt();
    System.out.println("c musluğu havuzu kaç saatte doldurmaktadır: ");
    Scanner c = new Scanner (System.in);
    float z = c.nextInt();
    float kacSaat =  (((1/x)+(1/y)+(1/z)));    
    System.out.println("3 musluk aynı anda açılırsa havuz: "+ (1/kacSaat)+" saatte dolar" ); 
  
    }
  }
