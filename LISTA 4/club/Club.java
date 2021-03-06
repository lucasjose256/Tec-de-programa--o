/**
 * Store details of club memberships.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class Club
{
    // Define any necessary fields here ...
    ArrayList<Membership> memb;
    
    /**
     * Constructor for objects of class Club
     */
    public Club()
    {
        // Initialise any fields here ...
        memb= new ArrayList<Membership>();
        
    }

    /**
     * Add a new member to the club's list of members.
     * @param member The member object to be added.
     */
    public void join(String name, int month, int year)
    
    {  Membership member=new Membership(name,month,year);
        
        memb.add(member);
    }

    /**
     * @return The number of members (Membership objects) in
     *         the club.
     */
    public int numberOfMembers()
    {
        return memb.size();
    }
}
