import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SomaNumeros {
    private List<Integer> listaInt = new ArrayList<>();


    public SomaNumeros(){

    }
    public void adicionarNumero(int numero){
        listaInt.add(numero);
    }
    
    public int calcularSoma() {
        int soma = 0;
  
        Integer numero;
        for(Iterator var2 = this.listaInt.iterator(); var2.hasNext(); soma += numero) {
           numero = (Integer)var2.next();
        }
  
        return soma;
     }

     public int encontrarMaiorNumero(){
        int maiorNumero = Integer.MIN_VALUE;
        Iterator var2 = this.listaInt.iterator();

        while (var2.hasNext()) {
            Integer numero = (Integer)var2.next();
            if (numero > maiorNumero) {
                
                maiorNumero = numero;
               }
        }
        return maiorNumero;
     }


     public int encontrarMenorNumero(){
        int menorNumero = Integer.MAX_VALUE;

        Iterator var2 = this.listaInt.iterator();
        System.out.println("Todos os Numeros : ");
        while (var2.hasNext()) {
            Integer numero = (Integer)var2.next();
            if (numero < menorNumero) {
                
                menorNumero = numero;
               }
        }
        return menorNumero;
     }
     
     public void exibirNumeros(){

        Iterator var2 = this.listaInt.iterator();
        while (var2.hasNext()) {
            Integer numero = (Integer)var2.next();
            System.out.println(numero);
        }
     }
}
