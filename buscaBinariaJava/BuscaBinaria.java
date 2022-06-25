
public class BuscaBinaria{
    //primeiro e ultimo são os index do vetor
    int buscaBinaria(int vet[], int primeiro, int ultimo, int chave) {
        if (ultimo >= primeiro )//verifica se o vetor tem mais de um elemento
         {
             int meio = primeiro + (ultimo- primeiro) / 2;
            if (vet[meio] == chave){
                return meio;}
           else if (vet[meio] > chave){
                return buscaBinaria(vet, primeiro,meio - 1, chave);//vetor a esquerda do meio
            } else{
            return buscaBinaria(vet, meio + 1, ultimo, chave);//vetor a direita do meio 
        }
        }
        return -1;
    }
    public static void main(String args[]) {
        BuscaBinaria teste = new BuscaBinaria();
        int vet[] = { 1, 2, 3, 4, 5,10,15,20,45 };
        int n = vet.length;
        int x = 5;
        int posicao = teste.buscaBinaria(vet, 0, n - 1, x);
        if (posicao == -1)
            System.out.println("Elemento não encontrtado!");
        else
            System.out.println("Element encontrado no index:" + posicao);
    

}
}