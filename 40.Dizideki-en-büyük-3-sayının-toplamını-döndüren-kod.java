public class DizidekiEnBüyük3SayısınınToplamınıDöndürenKod {
    
    public static void main(String[] args) {
        int toplam;
    int[] array=new int[100];
    for(int i=0;i<array.length;i++){
        array[i]=(int)(Math.random()*101);
    }
    int büyük1,büyük2,büyük3;
    büyük1=array[0];
    büyük2=array[1];
    büyük3=array[2];
    for(int i=0;i<array.length;i++){
        if(büyük1<array[i]){
            büyük2=büyük1;
            büyük1=array[i];
        }
        else if(büyük2<array.length){
            büyük3=büyük2;
            büyük3=array[i];
        }
        else if(büyük3<array.length){
            büyük3=array[i];
        }
    }
        toplam=büyük1+büyük2+büyük3;
        System.out.println("Dizinin en büyük 1. elemanı:"+ büyük1);
        System.out.println("Dizinin en büyük 2. elemanı:"+ büyük2);
        System.out.println("Dizinin en büyük 3. elemanı:"+ büyük3);      
        System.out.println("Dizideki en büyük 3 sayının toplamı:"+ toplam);
    }
    }



   
      
