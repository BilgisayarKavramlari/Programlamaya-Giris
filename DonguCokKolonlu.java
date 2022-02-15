import static java.lang.Math.*;

public class MainClass {
       
    public static void main(String[] args)
    {
        int a=1,b=100,c=1;
        
        for(int i=1; i<100;i++)
        {
            if((i%15)==0){
                System.out.print(i+" ");
                while(a<31){
                
                    if((a%5)==0)
                    {
                        System.out.print(a+" ");
                        while(b>49){
                            if((b%10)==0){
                                System.out.print(b+" ");
                                while(c<10)
                                {
                                    System.out.println(pow(2,c));                                        
                                    c++;
                                    break;
                                }
                                b--;
                                break;
                                
                            } b--;
                       }
                        a++;
                        break;
                    }
                    a++;
                }
            }
        }      
    }
}
