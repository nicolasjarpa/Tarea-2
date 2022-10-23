package tarea2;
import java.util.ArrayList;
class DepositoVuelto{
    private ArrayList <Moneda> m;
    private int total;
    private Moneda1000 a;
    private Moneda500 b;
    private Moneda100 c;
    
    public DepositoVuelto(){
      m = new ArrayList <Moneda>();
      total = a.getValor()+b.getValor()+c.getValor();
    }
    public void addMoneda(Moneda b){
        m.add(b);
    }
    public Moneda vuelto(){
        if(total == 0){
            return null;
        }
        return m.remove(0);
    }
}