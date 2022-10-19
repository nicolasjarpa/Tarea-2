
package tarea2;
import java.util.ArrayList;


package tarea2;


abstract class Bebida {
 private int xd;
    public Bebida(int a){
        xd=a;
        
    }
    public int getSerie(){
        return xd;
    }
    public String beber(){
        return "sabor: ";
    }
}

class Fanta extends Bebida{
        public Fanta(int a){
    super(a);
}
public String beber(){
    
return super.beber()+"Fanta";
}
}


class Coca extends Bebida{
 public Coca(int a){
    super(a);
}
public String beber(){
    
return super.beber()+"coca";
}
}


class Sprite extends Bebida{
   public Sprite(int a){
    super(a);
}
public String beber(){
    
return super.beber()+"sprite";
}
}

class Deposito{
    private ArrayList <Bebida> n;
    public Deposito(){
      n = new ArrayList <Bebida>();
    }
    public void addBebida(Bebida b){
        n.add(b);
    }
    public Bebida getBebida(){
        if(n.size() ==0){
            return null;
        }
        return n.remove(0);
    }
}
