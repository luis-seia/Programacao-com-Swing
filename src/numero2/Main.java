package numero2;

import java.math.BigDecimal;
public class Main {
    public static void main(String[] args)
    {
        // Creating a BigDecimal object
        Object sampleObject = new BigDecimal(10000000.45);
     
        System.out.println((String)sampleObject);
        
        
        /*ClassCastException em Java ocorre quando tentamos converter o tipo de dados de entrada em outro. Isso está relacionado ao recurso de conversão 
        de tipo e a conversão de tipo de dados é bem-sucedida apenas onde uma classe estende uma classe pai e a classe filha é lançada em sua classe pai*/
    }
}
