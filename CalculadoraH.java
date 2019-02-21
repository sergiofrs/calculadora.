package calculadorah;

public class CalculadoraH 
{

    public static void main(String[] args) 
    {
        double n1=10;
        double n2=5;
        
        Suma sum=new Suma(n1,n2);
        sum.mostrarResultado();
        
        Resta resta=new Resta(n1,n2);
        resta.mostrarResultado();
        
        Multiplicacion multiplicacion=new Multiplicacion(n1,n2);
        multiplicacion.mostrarResultado();
        
        division div=new division(n1,n2);
        div.mostrarResultado();
    }
    
}
