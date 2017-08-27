 public static void main(String[] args) {
        //burada ilk başta kolonlarımı tanımlıyorum
     int[] a=new int[6];//15in katı
     int[] b=new int[6];//5in katı
     int[] c=new int[6];//100den 50ye
     int[] d=new int[6];//2nin katları
     int x=15,y=5,z=100;/* birden fazla for döngüsü kullanmıyım diye başlanıç değerlerini
     veriyorum.Böylece tek bir forla dizilerime değerleri atıyorum*/
     for(int i=0;i<6;i++)
     {
       a[i]=x;
       x+=15;
          b[i]=y;
       y+=5;
         c[i]=z;
       z-=10;
       d[i]=(int)Math.pow(2, (i+1));
     }
     for(int k=0;k<6;k++)
     {
         System.out.println(" "+a[k]+" "+b[k]+" "+c[k]+" "+d[k]);//burada hepsini yan yana yazdırıyorum.
     }
    }
    
