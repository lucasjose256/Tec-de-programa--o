public class Pista {
        public int id;
        static int tamanho=1500;
 public Pista(int num){
    id=num;
 }

 public  void recebeAviao(Aviao av){
    if(av.getAterrissar())
        {
            av.imprimeAterrissar();
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            av.aterrissar=false;
            System.out.println("o Aviao "+av.id+"saiu da pista"+ id);
        }
        else if(av.getDecolar())
            {
            av.imprimeDecolar();
                try {
                Thread.sleep(4000);
                     } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                            }
                    av.decolar=false;
                    System.out.println("o Aviao "+av.id+"saiu da pista"+ id);
        }//liberamos o avião
        av=null;
       
}
}
