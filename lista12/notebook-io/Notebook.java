import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
/**
 * A class to maintain an arbitrarily long list of notes.
 * Notes are numbered for external reference by a human user.
 * In this version, note numbers start at 0.
 * 
 * @author David J. Barnes and Michael Kolling.
 * @version 2008.03.30
 */
public class Notebook
{   public static void main(String[] args) throws FileNotFoundException {
    
    Notebook book=new Notebook();
    
    book.storeNote("Uncharted");
    book.storeNote("THE HERO");
    book.storeNote("Horizon Zero Down");
    book.storeNote("GOW");
    book.storeNote("TLOU||");
    
  //  book.listNotes();
  //  book.writeOnflile(book.getlistNotes());
    book.readFile();

     
}
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
     * Remove a note from the notebook if it exists.
     * @param noteNumber The number of the note to be removed.
     */
    public void removeNote(int noteNumber)
    {
        if(noteNumber < 0) {
            // This is not a valid note number, so do nothing.
        }
        else if(noteNumber < numberOfNotes()) {
            // This is a valid note number.
            notes.remove(noteNumber);
        }
        else {
            // This is not a valid note number, so do nothing.
        }
    }

    /**
     * List all notes in the notebook.
     */
    public void listNotes()
    {
        for(String note : notes) {
            System.out.println(note);
        }
    }
    public   ArrayList<String> getlistNotes(){

        return notes;
    }


    public  boolean writeOnflile(ArrayList<String> texto){

       try{
        FileWriter arq=new FileWriter("file.txt");
        PrintWriter gravarArq=new PrintWriter(arq);
        
        for(String it:texto){
           
        gravarArq.println(it);
      
        }  gravarArq.close();
        return true;
       } catch(IOException e){
        System.out.println(e.getMessage());
        return false;
       }

    }
    public void addListinArq( ArrayList<String> notes){

        for(String it:notes){

           // writeOnflile(it);
        }
    }

    public void readFile() throws FileNotFoundException{

        File file = new File("file.txt");
        Scanner sc = new Scanner(file);
     
        while (sc.hasNextLine())
          System.out.println(sc.nextLine());
      }
    
    

}
