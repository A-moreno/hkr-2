import java.util.Scanner;
import java.util.StringTokenizer;
public class ContarPalabras {

    public static void main(String[] args) {
       Scanner lee = new Scanner(System.in);
       int r= 1;
        String frase = lee.next();
        char[]palabra;
       palabra = frase.toCharArray();
       int azu = frase.length();
        for(int j=0; j<azu; j++){
            if(palabra[j]>=45 && palabra[j]<= 90){
              r= r+1;  
            }
        }
            //else(palabra[j]<=60 && palabra[j]>=90){
               //r=1;
            
                
        
      
    
System.out.println(r);
}
}
