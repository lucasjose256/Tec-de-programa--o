import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Delayed;

public class Teste{

public static void main(String[] args) {
   
    ListaMarcas l1=new ListaMarcas();   
    ListaMarcas l2=new ListaMarcas();
    l1.imprime();
    l2.imprime();


}

}

class ListaMarcas extends Thread{

 public ArrayList<String> list = new ArrayList<String>();

   public ListaMarcas(){
    //Adicionamos as marcas na lista
        list.add("Netflix");
        list.add("Amazon");
        list.add("Apple");
        list.add("Nokia");
        list.add("Copel");
        list.add("Adobe");
        list.add("Disney");
        //Ordena a lista em ordem alfabética
        Collections.sort(list);
    }

    public void imprime(){
        for(String marca:list){
            System.out.println(marca);
            try {
                Thread.sleep(800);

            } catch (InterruptedException e) {
               
            }
    }

}
}