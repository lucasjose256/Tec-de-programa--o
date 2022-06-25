import java.util.ArrayList;

/**
 * A class to maintain an arbitrarily long list of notes.
 * Notes are numbered for external reference by a human user.
 * In this version, note numbers start at 0.
 * 
 * @author David J. Barnes and Michael Kolling.
 * @version 2008.03.30
 */
public class Notebook
{
    // Storage for an arbitrary number of notes.
    private ArrayList<String> notes;

    /**
     * Perform any initialization that is required for the
     * notebook.
     */
    public Notebook()
    {
        notes = new ArrayList<String>();
    }

    /**
     * Store a new note into the notebook.
     * @param note The note to be stored.
     */
    public void storeNote(String note)
    {
        notes.add(note);
    }

    /**
     * @return The number of notes currently in the notebook.
     */
    public int numberOfNotes()
    {
        return notes.size();
    }

    /**
     * Show a note.
     * @param noteNumber The number of the note to be shown.
     */
    public void showNote(int noteNumber)
    {
        if(noteNumber < 0) {
            // This is not a valid note number, so do nothing.
        }
        else if(noteNumber < numberOfNotes()) {
            // This is a valid note number, so we can print it.
            System.out.println(notes.get(noteNumber));
        }
        else {
            System.out.println("Esse número nao e valido");
        }
    }
    
    
    public boolean isPrime(int n){
    int i=2;
    boolean flag=true;
    while(i<n-1){
    
        if(n % 2 == 0){flag=false;}
        
        i++;
        
        
    }
    
    return flag;
    } 
    
    public void search(String word){
    
    if(notes.contains(word)){
    System.out.println("a palavra "+word+" foi encontrada");
    }
    else 
    System.out.println("a palavra  nao foi encontrada"); 
        
    }
    
}
