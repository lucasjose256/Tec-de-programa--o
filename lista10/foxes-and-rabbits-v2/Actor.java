import java.util.List;

public
interface Actor

{

 /**

     * Executa o comportamento regular do ator.

     * @param newActors Uma lista para armazenar os

     * atorescriadosrecetemente.

     */

    void act(List<Actor> newActors);

    /**

 * O ator ainda está ativo?
     * @return 

 * @returntruese ainda ativo, false, caso contrário.

     */

 void booleanisActive();

}
