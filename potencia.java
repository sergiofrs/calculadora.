
package calculadorah;

public class potencia extends Operacion
{
    double pot;
    public potencia(double n1, double n2)
    {
        super(n1,n2,'^');
        this.pot=Math.pow(n1, n2);
        this.setRes(this.pot);
    }  
}
