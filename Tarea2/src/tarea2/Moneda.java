
package tarea2;

import java.util.ArrayList;

abstract class Moneda{
    private Moneda m;
public Moneda(){
    
}
 public String getSerie(){
 return "serie"+m;
}
}

 class Moneda100 extends Moneda{
    public int getValor(){
        return 100;
    }
}
 class Moneda500 extends Moneda{
     public int getValor(){
        return 500;
    }
}
 class Moneda1000 extends Moneda{
     public int getValor(){
        return 1000;
    }
}

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
