
import java.util.ArrayList;

/**
 *
 * @author  ALSUBHI, Abdulrahman Nafeye A   S3578164
 */

public class AdultPerson extends Profile{

    private ArrayList<String> children; //list to hold list of children

    //getter
    public ArrayList<String> getChildren() {
        return children;
    }
    
    //method to add as friend
    public boolean addFriend(String username)
    {
        //checking if friend is already added
        boolean friend=false;
        for(int i=0;i<super.getFriends().size();i++)
        {
            if(super.getFriends().get(i).equals(username))
            {
                friend=true;
            }
        }
        if(!friend)
        {
            //calling base class function
            super.addFriend(username);
            return true;
        }
        else
            return false;
    }
    
    //method to add dependent to the list

    public boolean addDependent(String username)
    {
        //checking if a dependent is already added
        boolean dependent = false;
        for(int i=0;i<this.children.size();i++)
        {
            if(this.children.get(i).equals(username))
                dependent=true;
        }
        if(!dependent)
        {
            this.children.add(username);
            return true;
        }
        else
        {
            System.out.println("Cannot add as friend again.");
            return false;
        }
            
    }
    //constructor
    public AdultPerson()
    {
        super();
        this.children = new ArrayList<>();
    }
}
