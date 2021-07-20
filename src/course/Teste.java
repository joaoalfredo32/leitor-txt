package course;

public class Teste {

        

    static int oper (int n, int m){

        int r =0;
   
        if (n == m){
            r = n;
        }     

        if (n > m){

            r = oper (n-m, m);
        }
        
        if (n < m){

            r = oper (n, m-n);
        }

        
        return r;
    }

    

    public static void main (String args[]){

        System.out.println(oper (25,15));

    }

 }