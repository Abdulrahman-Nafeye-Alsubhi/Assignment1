
import java.util.ArrayList;

/**
 *
 * @author ALSUBHI, Abdulrahman Nafeye A   S3578164
 */
public class Profile {

//private data members    
    private String userName;
    private String fullName;
    private String status;
    private int birthYear;
    private String gender;
    private ArrayList<String> friends;

    
    //setters
    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    //getters
    public String getUserName() {
        return userName;
    }
    
    public String getFullName() {
        return fullName;
    }

    public String getStatus() {
        return status;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public String getGender() {
        return gender;
    }

    public ArrayList<String> getFriends() {
        return friends;
    }
       
    //method to check if a friend is already in the friend list
    public boolean isFriend(String username)
    {
        return friends.contains(username);
    }
    
    //method to display profile
    public void display()
    {
        {
            System.out.println("Name: " + getFullName());
            System.out.println("Username: " + getUserName());
            System.out.println("Status: " + getStatus());
            System.out.println("Gender: " + getGender());
            System.out.println("Birthyear: " + getBirthYear());
        }
    }
    
    //method to add as friend
    protected boolean addFriend(String username)
    {
        this.friends.add(username);
        return true;
    }
    
    //constructor
    Profile()
    {
        //initializing list
        friends = new ArrayList<>();
    }
 
}
