package tarea2;
import java.util.ArrayList;

class DepositoVuelto{
    private Moneda m;
    private ArrayList <Bebida> b;
    private int vuelto;
    
    public DepositoVuelto(){
      vuelto = 0;
    }
    public Moneda vuelto(int precio){
        
        if(m.getValor()){
        
            vuelto = m.getValor() - precio;
            return null;
        }
    }
}