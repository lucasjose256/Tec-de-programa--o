import java.util.ArrayList;

public class Player {
    private int pesoMax;
    private Room salaAtual;
    private ArrayList<Item> coletaItem;
    

    public Player(){

        pesoMax=100;
        coletaItem= new ArrayList<Item>();

    }
    //verifica se o item a pegar é mais pesasdo que o pesoMax
    public void take(Item item){
        if(item.getPeso()<pesoMax){

        coletaItem.add(item);}
        else{System.out.println("Excesso de:"+(item.getPeso()-pesoMax)+"Kg");}

    }
    //remove um determinado item
    public void drop(Item itemAserRemovido){
        coletaItem.remove(itemAserRemovido);


}
public void setSalaAtual(Room salaAtual){
    this.salaAtual=salaAtual;
}

}
