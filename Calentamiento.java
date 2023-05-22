
package calentamiento;

import java.util.Scanner;

public class Calentamiento {

public static void main(String[] args) {
        
        int N=0;
        int x;
        int cont=0;
        Scanner scanner = new Scanner(System.in);
        N=scanner.nextInt();
        int vec[]=new int[N];
        
        for(int i=0; i<N; i++){
            
            x=scanner.nextInt();
            while(x<1 && x>2000){
                x=scanner.nextInt();
            }         
      
            if (N >= 20) {
                for (int j = 0; j < vec.length; j++) {
                    
                    if(vec[j]==x){
                        cont++;
                    }
                    
                }
            }
            
            if(cont<20){
                vec[i]=x;
            }
            
        }
        
        for(int i=1; i<vec.length; i++){
            
            int menor = hallarmenor(vec);
            int con=0;
            String string="";
    
            int j = 0;
            while (j < N) {
                if (vec[j] == menor) {

                    con++;
                    vec[j] = 0;
                    
                }
                
                j++;
            }
            string = menor + " aparece " + con + "vez(es)";
            System.out.println(string);

        }
        
        
    }
    
    public static int hallarmenor(int vec[]){
        
        int menor=2001;
        
        for (int i = 0; i < vec.length ; i++) {
            
            if (vec[i] < menor && vec[i]!=0) {
                menor = vec[i];
            }           
        }
        
        return menor;

    }
     
  
}



