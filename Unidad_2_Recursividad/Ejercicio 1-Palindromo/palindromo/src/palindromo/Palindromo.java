
package palindromo;



public class Palindromo {

    
    public static boolean es_Palindromo(String pala){
    if(pala.length() <= 1){
        return true;
    }else{
        if(pala.charAt(0) == pala.charAt(pala.length() - 1)){
            return es_Palindromo(pala.substring(1,pala.length() - 1 ) );
        }else{
            return false;
        }
    }   
}
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        String pala = "oso";
        
        if(es_Palindromo(pala) == true){
            System.out.println("La frase; " +pala+ " es un palindromo");
    }else{
            System.out.println("La frase; " +pala+ " no es un palindromo");
        }
    
    }
}
