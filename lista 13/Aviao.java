import java.util.Random;

import org.omg.CORBA.Request;

public class Aviao{
    Random gerador;
    public int id;
    public boolean decolar;
    public boolean aterrissar;
    
    public Aviao(boolean decolar,boolean aterrissar){
        //construtor gera difentes ids para cada avião
        gerador=new Random();
        id=gerador.nextInt(5080);

        this.decolar=decolar;
        this.aterrissar=aterrissar;
    }
    public boolean getDecolar(){

        return decolar;
    }
    public boolean getAterrissar(){ return aterrissar;}


    public void imprimeDecolar(){

        System.out.println("o Aviao "+id+" está decolando");
    }
    public void imprimeAterrissar(){ 

        System.out.println("o Aviao "+id+" Aterrissando");
    }
}