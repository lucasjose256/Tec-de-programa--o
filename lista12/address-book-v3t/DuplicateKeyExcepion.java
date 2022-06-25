import java.util.List;

class DuplicateKeyExcepion extends Exception{

    public DuplicateKeyExcepion(){

       

    }
 
    
    /**
     * @return A diagnostic string containing the key in error.
     */
    public String toString()
    {
        return "The key already exist";
    }

}