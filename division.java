
package calculadorah;

public class division extends Operacion
{
    double div;
    public division(double n1, double n2)
    {
        super(n1,n2,'/');
        this.div=n1/n2;
        this.setRes(this.div);
    }   
}
