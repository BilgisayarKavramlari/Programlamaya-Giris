public class BilgisayarKavramlari {
    public static void main(String[] args) {
    int a[] = new int[6];
        int b[] = new int[6];
        int c[] = new int[6];
        int d[] = new int[6];
        
        int x = 0;
        
      for(int i=1;i<=100;i++){
        if(i%15==0){
         a[x] = i;
         x++;
        }
    }     
        x = 0;
        for(int j=1;j<=30;j++){
          if(j%5==0){
        b[x] = j;
         x++;
        }
      }
        x = 0;
      for(int y=100;y>=50;y--){
          if(y%10==0){
        c[x] = y;
         x++;
        }
      }
      x = 0;
      for(int k=1;k<=6;k++){
        d[x] = (int)Math.pow(2, k);
        x++;
         }
      for(int u=0;u<6;u++){ //bastirma dongusu
      System.out.println(""+a[u]+b[u]+c[u]+d[u]);
      }
    }
    
}
