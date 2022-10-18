
package tarea2;

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
