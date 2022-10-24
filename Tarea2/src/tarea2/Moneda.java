
package tarea2;

import java.util.ArrayList;

abstract class Moneda{
    private Moneda m;
public Moneda(){
    
}
 public String getSerie(){
 return "serie"+m;
}
 public int getValor(){
     
        return 100;
     
 }
}

 class Moneda100 extends Moneda{
    public int getValor(){
        return getValor();
    }
}
 class Moneda500 extends Moneda{
     public int getValor(){
         return getValor()*5;
    }
}
 class Moneda1000 extends Moneda{
     public int getValor(){
        return getValor()*10;
    }
}
