import java.util.ArrayList;

public class Aeroporto {
    
    ArrayList<Aviao> avioes;
    Pista pist1;
    Pista pista2;

    public Aeroporto(){
        avioes=new ArrayList<Aviao>();
        pist1=new Pista(1);
        pista2=new Pista(2);

    avioes.add(new Aviao(true, false));
    avioes.add(new Aviao(false, true));
    avioes.add(new Aviao(true, false));
    avioes.add(new Aviao(false, true));

    }
    
}
