package tarea2;
import java.util.ArrayList;
public class Expendedor {
    private Deposito coca;
    private Deposito fanta;
    private Deposito sprite;
    public Expendedor(int cantidad, int precio){
        coca= new Deposito();
            fanta = new Deposito();
          sprite = new Deposito();
           for(int i=0; i<cantidad; i++){
              coca.addBebida(new Coca(i));
              fanta.addBebida(new Fanta(i));
              sprite.addBebida(new Sprite(i));
              }
           
      }
    }
    

