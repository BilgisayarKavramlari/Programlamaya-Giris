import java.util.*;                            //required and guaranteed library for Scanner a=new Scanner(); process
import java.lang.*;                            //required and guaranteed library for string methods like contains() , split() etc. 

public class Program                           //all methods and definitons must be defined in a class.
{ 
    
public static String[] domainType(String[] domains) {  // this metod's input is an string array of web adresses
                                                       //and will return a string array domain extension's definitons.
   
   
   String[] tmp;                           //to contain each splitted element of web adress array defined in main metod at the bottom.
   String tmp2;                            //to contain string (domain extensions like com ,org) after the last dot.
   
   System.out.print("Extensions are:"+"\n");   // headline for console test of tmp2.
                                               // we coded this before and outside the loop since we want only one headline. 
   
   for(int i=0;i<domains.length;i++) {         //from 0th to last element of array domain (array of web adresses),
   
    tmp=domains[i].split("\\.");               //splitting each web adress with dot "."("//"regex is to adjust dot as a splitter)
    tmp2=tmp[tmp.length-1];                    //splitted web adres is loaded on variable "tmp" as an array, so we append last element
                                               //of this array where our domain extension is (anyword.blabla.......bla.COM) and assign 
                                               //to a string (not array) variable tmp2
    
    if(domains[i].contains("."))                               //to check if extension exists(user input contains dot), 
    {System.out.print(" "+"("+tmp2+")");}                      //splitting process is true and tmp has the true value.
     else{System.out.print(" "+"("+"no ext."+")"+" ");}  
    
    
    if (tmp2.equals("com"))                // == operator can only compare referances of strings,not values.So equals() method 
                                           //is applied to get accurate comparison.
    
      {domains[i]="commercial";}                                //now we are replacing our initial web adresses array's
      else if (tmp2.equals("net")){domains[i]="network";}       // elements with extension definitons.Briefly, each 
      else if (tmp2.equals("info")){domains[i]="information";}  //element of our input array "domains" is having new 
      else if (tmp2.equals("org")){domains[i]="organization";}  //values of strings as extension definitons according  
      else {domains[i]="nodomain";}                             // to the extensions it has.
       
  }
  
  System.out.println("\n");                               // after the loop, to jump on next line to print headline of the program output.
  System.out.print("Domaintypes are: "+"\n");             //print headline of extension definitions array (program output).
   
  return domains; //returns string array "domains" with new elements.
}
	
	
 public static void main(String[] args) {                //java will start to execute program after this line.
	   
   Scanner scan=new Scanner(System.in);                  //we create new scanning object named "scan" to fill inputs by user.
 
   System.out.print("Define the number of websites: ");  //headline and user determination of the domains array's length. 
   int maxdomain = Integer.parseInt(scan.nextLine());    //direct usage of nextInt() could not catch nextline and would
                                                         //cause to skip the first iteration of array[]dom in "for" loop below.
 
   System.out.println(maxdomain+"\n");                   //displays the user input on console and jumps next console line ("\n").
 
   String[] dom = new String[maxdomain];                 //Definiton of input array (array of web adresses) with the length determined by user.
 
   for(int i = 0; i < maxdomain; i++){                   // each element of input array. 
         dom[i]=scan.nextLine();                         //is filled by user as a string by using nextLine() method. 
                                      }
     
    System.out.print("Websites you defined are: "+"\n"); //headline of program's output array.
    System.out.println(Arrays.toString(dom)+"\n");       //list of extensions.
    System.out.println(Arrays.toString(domainType(dom)));//obtaining a string array from domainType method.
                                                          //then convert this array to string, print on console.
	}
}  
