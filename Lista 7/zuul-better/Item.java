public class Item {

    private int peso;
    private String descricao;

    public Item(String descricao,int peso){
        this.descricao=descricao;
        this.peso=peso;
    }

    public String getPesoDescricao(){

        return "O item " + descricao + " pesa "+peso+" Kg" ;
    }
    public int getPeso(){

    return peso;

    }
}
