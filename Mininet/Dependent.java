
import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author ALSUBHI, Abdulrahman Nafeye A   S3578164
 */
public class Dependent extends Profile{
 
    String father;//father user name
    String mother;//mother username

    //setters
    private void setFather(String father) {
        this.father = father;
    }

    private void setMother(String mother) {
        this.mother = mother;
    }
    
    //getters
    public String getFather() {
        return father;
    }

    public String getMother() {
        return mother;
    }
    
    //method to add a friend
    public boolean addFriend(String username, int year)
    {
        boolean friend=false;
        //Checking if friedn is already added
        for(int i=0;i<super.getFriends().size();i++)
        {
            if(super.getFriends().get(i).equals(username))
            {
                friend=true;
            }
        }
        //if not already added
        if(!friend)
        {
            int currentYear = Calendar.getInstance().get(Calendar.YEAR);//getting current system year
            //if age is not 2 years and if age difference is not more than 3 years
            if (currentYear-this.getBirthYear()>2 && currentYear-year>2 && Math.abs(this.getBirthYear()-year)<=3)
            {
                //calling base class method to add friend in list of friends.
                super.addFriend(username);
                return true;
            }
            
            else
            {
                System.out.println("Cannot add as friend because of age restriction.");
                return false;
            }
        }
        else
        {
            System.out.println("Cannot add as friend again.");
            return false;
        }
    }
    //constructor
    public Dependent(String father, String mother)
    {
        //The father and mother will be added when the object is being constrcuted
        //father nd mother cannot be set again
        super();
        setFather(father);
        setMother(mother);
    }
    
    
}
