

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;
/**
 *
 * @author ALSAHAFI, Abdullah Omar A s3593438
 */

 //method to list the adult person profiles
   

public class Drive {
     public static void listAdultPersons(ArrayList<AdultPerson> list)
    {
        for(int i=0;i<list.size();i++)
        {
            System.out.println("Profile number "+(i+1));
            System.out.println("*****************");
            list.get(i).display();
            System.out.println();
        }
    }
    //method to list the dependent profiles    
    public static void listDependents(ArrayList<Dependent> list)
    {
        for(int i=0;i<list.size();i++)
        {
            System.out.println("Profile number "+(i+1));
            System.out.println("*****************");
            list.get(i).display();
            System.out.println();
        }
    }
    public Drive()
    {
    	
        //Arrays for name, username, gender, status and birthyear
    	
        String [] fullNameArray = {"Mohammed Alharbi","Fahad Ahmad","Sultan Sami","Khaled Ali","Rami Abdullah","Sara Khaled","Nadia Mohammed","Nora Saad","Lujain Abdullah","Shroq ALsahafi","Tahni Bader","Mansor Turki","Hani Omar","Jana Abdullah","Abdulrhaman Alsubhi"};
        String [] usernameArray = {"Mohammed","Fahad","Sultan","Khaled","Rami","Sara","Nadia","Nora","Lujain","shroq","TAhani","Mansor","Hani","Jana" , "Abdulrhaman"};
        String [] statusArray = {"Working at a superstore","Student at Oxford","Working at Amazon","Watching movie","Feeling sick","Jogging","Freelance","Feeling bored", "Student at RMIT","Working at KFC","Playing outside","Picnic","Completing homework","Going to trip","It's raining outside"};
        String [] genderArray = {"male","male","male","male","male","female","female","female","female","female","female","male","male","female","male"};
        int [] birthYearArray = {1985,1987,1983,1990,1991,1989,1993,1986,1993,1994,2008,2007,2010,2009,2007};
        ArrayList<AdultPerson> persons = new ArrayList<>();//Array for adult profiles
        ArrayList<Dependent> dependents = new ArrayList<>();//array for dependents
        
        //Adding the data for adult profiles
        for(int i=0;i<10;i++)
        {
            AdultPerson person = new AdultPerson();
            person.setFullName(fullNameArray[i]);
            person.setUserName(usernameArray[i]);
            person.setStatus(statusArray[i]);
            person.setGender(genderArray[i]);
            person.setBirthYear(birthYearArray[i]);
            persons.add(person);
        }
        //Adding the data for dependent profiles
        for(int i=10;i<15;i++)
        {
            Dependent dependent = new Dependent(persons.get(i-10).getUserName(),persons.get(i-5).getUserName());
            dependent.setFullName(fullNameArray[i]);
            dependent.setUserName(usernameArray[i]);
            dependent.setStatus(statusArray[i]);
            dependent.setGender(genderArray[i]);
            dependent.setBirthYear(birthYearArray[i]);
            dependents.add(dependent);
        }
        
        //Adding dependents to the adult profiles
        persons.get(0).addDependent(dependents.get(0).getUserName());
        persons.get(3).addDependent(dependents.get(0).getUserName());
        persons.get(1).addDependent(dependents.get(1).getUserName());
        persons.get(4).addDependent(dependents.get(1).getUserName());
        persons.get(2).addDependent(dependents.get(2).getUserName());
        persons.get(5).addDependent(dependents.get(2).getUserName());
        persons.get(8).addDependent(dependents.get(3).getUserName());
        persons.get(6).addDependent(dependents.get(3).getUserName());
        persons.get(9).addDependent(dependents.get(4).getUserName());
        persons.get(7).addDependent(dependents.get(4).getUserName());
        
        //making friend connection betweeen adult profiles        
        persons.get(0).addFriend(persons.get(3).getUserName());
        persons.get(0).addFriend(persons.get(6).getUserName());
        persons.get(0).addFriend(persons.get(7).getUserName());
        
        persons.get(1).addFriend(persons.get(2).getUserName());
        persons.get(1).addFriend(persons.get(4).getUserName());
        persons.get(1).addFriend(persons.get(9).getUserName());
        persons.get(1).addFriend(persons.get(5).getUserName());
        
        persons.get(2).addFriend(persons.get(1).getUserName());
        persons.get(2).addFriend(persons.get(3).getUserName());
        persons.get(2).addFriend(persons.get(8).getUserName());
        persons.get(2).addFriend(persons.get(7).getUserName());
        
        persons.get(3).addFriend(persons.get(0).getUserName());
        persons.get(3).addFriend(persons.get(2).getUserName());
        persons.get(3).addFriend(persons.get(4).getUserName());
        persons.get(3).addFriend(persons.get(5).getUserName());
        persons.get(3).addFriend(persons.get(9).getUserName());
        
        persons.get(4).addFriend(persons.get(1).getUserName());
        persons.get(4).addFriend(persons.get(3).getUserName());
        persons.get(4).addFriend(persons.get(6).getUserName());
        
        persons.get(5).addFriend(persons.get(3).getUserName());
        persons.get(5).addFriend(persons.get(1).getUserName());
        persons.get(5).addFriend(persons.get(8).getUserName());
        persons.get(5).addFriend(persons.get(9).getUserName());
        
        persons.get(6).addFriend(persons.get(0).getUserName());
        persons.get(6).addFriend(persons.get(4).getUserName());
        persons.get(6).addFriend(persons.get(7).getUserName());
        persons.get(6).addFriend(persons.get(9).getUserName());
        
        persons.get(7).addFriend(persons.get(0).getUserName());
        persons.get(7).addFriend(persons.get(6).getUserName());
        persons.get(7).addFriend(persons.get(2).getUserName());
        persons.get(7).addFriend(persons.get(8).getUserName());
        
        persons.get(8).addFriend(persons.get(2).getUserName());
        persons.get(8).addFriend(persons.get(5).getUserName());
        persons.get(8).addFriend(persons.get(7).getUserName());
        
        persons.get(9).addFriend(persons.get(1).getUserName());
        persons.get(9).addFriend(persons.get(5).getUserName());
        persons.get(9).addFriend(persons.get(6).getUserName());
        persons.get(9).addFriend(persons.get(3).getUserName());
        
        //making friend connection between dependents
        dependents.get(0).addFriend(dependents.get(1).getUserName(),dependents.get(1).getBirthYear());
        dependents.get(0).addFriend(dependents.get(2).getUserName(),dependents.get(2).getBirthYear());
        dependents.get(0).addFriend(dependents.get(3).getUserName(),dependents.get(3).getBirthYear());
        
        dependents.get(1).addFriend(dependents.get(0).getUserName(),dependents.get(0).getBirthYear());
        dependents.get(1).addFriend(dependents.get(2).getUserName(),dependents.get(2).getBirthYear());
        
        dependents.get(2).addFriend(dependents.get(0).getUserName(),dependents.get(0).getBirthYear());
        dependents.get(2).addFriend(dependents.get(1).getUserName(),dependents.get(1).getBirthYear());
        dependents.get(2).addFriend(dependents.get(4).getUserName(),dependents.get(4).getBirthYear());
        
        dependents.get(3).addFriend(dependents.get(4).getUserName(),dependents.get(4).getBirthYear());
        dependents.get(3).addFriend(dependents.get(0).getUserName(),dependents.get(0).getBirthYear());
        
        dependents.get(4).addFriend(dependents.get(3).getUserName(),dependents.get(3).getBirthYear());
        dependents.get(4).addFriend(dependents.get(2).getUserName(),dependents.get(2).getBirthYear());
        
        
        //The menu list for the program
        Scanner in = new Scanner(System.in);
        int menuChoice = 1;
        while(menuChoice>=1 && menuChoice<=7)
        {
            System.out.println("Mininet Menu");
            System.out.println("===================================");
            System.out.println("1. List every one on the network.");
            System.out.println("2. List only adult persons.");
            System.out.println("3. List only dependents.");
            System.out.println("4. Add an adult person to the network.");
            System.out.println("5. Add a dependent to the network.");
            System.out.println("6. Select an adult person by username.");
            System.out.println("7. Select a dependent by username.");
            System.out.println("-------------------");
            System.out.println("Enter an option");
            
            menuChoice=in.nextInt();
            
            //Choice to list all profiles
            if(menuChoice==1)
            {
                System.out.println("*****List of Adult persons.*****");
                listAdultPersons(persons);
                System.out.println("*****List of dependents.*****");
                listDependents(dependents);
            }
            
            //Choice to list only all adult profiles
            else if(menuChoice==2)
            {
                System.out.println("*****List of Adult persons.*****");
                listAdultPersons(persons);
            }
            
            //Choice to list only all dependent profiles
            else if(menuChoice==3)
            {
                System.out.println("*****List of dependents.*****");
                listDependents(dependents);            
            }
            
            //Choice to add an adult person to the network
            else if(menuChoice==4)
            {
                System.out.println("Please enter the details for the adult person.");
                in.nextLine();
                String userName="";
                boolean isUniqueUsername;
                boolean run=true;
                
                //while loop, which will run until unique username entered by user
                while(run)
                {
                    isUniqueUsername=true;
                    System.out.print("Username (Single word only): ");
                    userName=in.next();
                    for(int i=0;i<persons.size();i++)
                    {
                        if(persons.get(i).getUserName().equals(userName))
                            isUniqueUsername=false;
                    }
                    if(isUniqueUsername)
                    {
                        for(int i=0;i<dependents.size();i++)
                        {
                            if(dependents.get(i).getUserName().equals(userName))
                                isUniqueUsername=false;
                        }   
                    }
                    if(isUniqueUsername)
                        run=false;
                    else
                        System.out.println("This username is already exists, please choose another one.");
                }
                //getting name
                System.out.print("Full name: ");
                in.nextLine();
                String fullName=in.nextLine();
                
                //getting status
                System.out.print("Status: ");
                String status=in.nextLine();
                int birthYear=0;
                boolean isValidAge;
                run=true;
                //loop to get birthyear from user
                while(run)
                {
                    //this loop will make sure that the birthyear is a valid input
                    //4 digit birthyear and range in 1930 to 2002
                    isValidAge=true;
                    System.out.print("Birth year (Enter 4 digit of year): ");
                    birthYear=in.nextInt();
                    birthYear=Math.abs(birthYear); //converting minus input to positive
                    if(Integer.toString(birthYear).toString().length()!=4)
                    {
                        isValidAge=false;
                        System.out.println("Please enter 4 digit birth year");
                    }
                    if(isValidAge)
                    {
                        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
                         if(birthYear>currentYear)
                         {
                            isValidAge=false;
                            System.out.println("Please enter age year less than "+currentYear);
                         }
                         else if(birthYear<1930)
                         {
                            isValidAge=false;
                            System.out.println("Please enter age year greater than 1930.");
                         }
                         else if(currentYear-birthYear<=16)
                         {
                            isValidAge=false;
                            System.out.println("Your age must be greater than 16.");
                         }
                         
                    }
                    if(isValidAge)
                    {
                       run=false;                        
                    }

                }
                int gender=0;
                run=true;
                //loop to take gender from user
                while(run)
                {
                    //1 for male, and 2 for female
                    System.out.print("Gender: (Enter 1 for male, 2 for female) ");
                    gender=in.nextInt();
                    if(gender==1 || gender==2)
                    {
                        run=false;
                    }
                    
                    else
                        System.out.println("Please enter 1 or 2 only.");
                }
                
                //declaring an adult profile and setting the values
                //after setting the values, the profile will be added to the array of adult profiles
                AdultPerson adultPerson = new AdultPerson();
                adultPerson.setUserName(userName);
                adultPerson.setFullName(fullName);
                adultPerson.setStatus(status);
                adultPerson.setBirthYear(birthYear);
                if(gender==1)
                    adultPerson.setGender("male");
                else
                    adultPerson.setGender("female");
                persons.add(adultPerson);
                System.out.println("Adult person has been added to the network.");
                System.out.println();
            }
            
            //Choice to add a dependent to the network
            else if(menuChoice==5)
            {
                System.out.println("Please enter the details for the dependent.");
                in.nextLine();
                String userName="";
                boolean isUniqueUsername;
                boolean run=true;
                //loop to take username from user
                while(run)
                {
                    isUniqueUsername=true;
                    System.out.print("Username (Single word only): ");
                    userName=in.next();
                    for(int i=0;i<persons.size();i++)
                    {
                        if(persons.get(i).getUserName().equals(userName))
                            isUniqueUsername=false;
                    }
                    if(isUniqueUsername)
                    {
                        for(int i=0;i<dependents.size();i++)
                        {
                            if(dependents.get(i).getUserName().equals(userName))
                                isUniqueUsername=false;
                        }   
                    }
                    if(isUniqueUsername==true)
                        run=false;
                    else
                        System.out.println("This username is already exists, please choose another one.");
                }
                System.out.print("Full name: ");
                in.nextLine();
                String fullName=in.nextLine();
                System.out.print("Status: ");
                String status=in.nextLine();
                int birthYear=0;
                boolean isValidAge;
                run=true;
                //loop to take birthyear from user
                while(run)
                {
                    //the loop will make sure that user enters only valid input
                    
                    isValidAge=true;
                    System.out.print("Birth year (Enter 4 digit of year): ");
                    birthYear=in.nextInt();
                    birthYear=Math.abs(birthYear);
                    if(Integer.toString(birthYear).toString().length()!=4)
                    {
                        isValidAge=false;
                        System.out.println("Please enter 4 digit birth year");
                    }
                    if(isValidAge)
                    {
                        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
                         if(birthYear>currentYear)
                         {
                            isValidAge=false;
                            System.out.println("Please enter age year less than "+currentYear);
                         }
                         //the age of a dependent should be 16 or less
                         else if(currentYear-birthYear>=16)
                         {
                            isValidAge=false;
                            System.out.println("Your age must be less than 16.");
                         }
                         
                    }
                    if(isValidAge)
                    {
                       run=false;                        
                    }

                }
                int gender=0;
                run=true;
                //loop to take gender
                while(run)
                {
                    System.out.print("Gender: (Enter 1 for male, 2 for female) ");
                    gender=in.nextInt();
                    if(gender==1 || gender==2)
                    {
                        run=false;
                    }
                    
                    else
                        System.out.println("Please enter 1 or 2 only.");
                }
                
                //getting father and mother user name from user
                String fatherUsername="";
                String motherUsername="";
                boolean isFather;
                run=true;
                
                //loop to take father username
                while(run)
                {
                    
                    isFather=false;
                    System.out.print("Enter username of father of dependent: ");
                    fatherUsername=in.next();
                    int index=0;
                    for(int i=0;i<persons.size();i++)
                    {
                        if(persons.get(i).getUserName().equals(fatherUsername))
                        {
                            isFather=true;
                            index=i;
                        }
                    }
                    if(isFather==true)
                    {   
                        //making sure that the username is of a male person
                        if(persons.get(index).getGender().equals("female"))
                            System.out.println("Please enter username of male profile.");
                        else
                            run=false;
                    }
                    else
                        System.out.println("This username is not found. Please try again");
                }
                
                boolean isMother;
                run=true;
                
                //loop to take mother username
                while(run)
                {
                    isMother=false;
                    System.out.print("Enter username of mother of dependent: ");
                    motherUsername=in.next();
                    int index=0;
                    for(int i=0;i<persons.size();i++)
                    {
                        if(persons.get(i).getUserName().equals(motherUsername))
                        {
                            isMother=true;
                            index=i;
                        }
                    }
                    if(isMother==true)
                    {
                        //making sure that the username is of a female person
                        if(persons.get(index).getGender().equals("male"))
                            System.out.println("Please enter username of female profile.");
                        else
                            run=false;
                    }
                    else
                        System.out.println("This username is not found. Please try again");
                }
                
                //Adding the dependent to the network
                //after declaring an object and setting the values
                Dependent dependent = new Dependent(fatherUsername, motherUsername);
                dependent.setUserName(userName);
                dependent.setFullName(fullName);
                dependent.setStatus(status);
                dependent.setBirthYear(birthYear);
                if(gender==1)
                    dependent.setGender("male");
                else
                    dependent.setGender("female");
                dependents.add(dependent);
                System.out.println("Dependent has been added to the network.");
                System.out.println();
            }
            //choice to select an adult profile by username
            else if(menuChoice==6)
{
	System.out.println("Enter username of the adult person");
	in.nextLine();
        String username = in.nextLine();
	for(int i = 0;i<persons.size();++i)
	{
		if(persons.get(i).getUserName().equals(username)) 
		{
			int subChoice = 1;
			while(subChoice>=1 && subChoice<=4)
			{
				//the sub menu choices for the selected profile
				System.out.println("1. Display the profile of this adult person.");
				System.out.println("2. Update the profile of this adult person.");
				System.out.println("3. Delete the profile of this adult person.");
				System.out.println("4. Display the children of this adult person.");
                                System.out.println("5. Display the friends of this adult person.");
                                System.out.println("6. Connect with another adult person.");
                                System.out.println("7. Find whether this adult person is friend with another adult person.");
				System.out.println("8. Go back to main menu.");

				subChoice = in.nextInt();

				//1. Display the selected profile
				if(subChoice==1)
				{
                                    persons.get(i).display();
				}

				//2. Update the selected profile
				else if(subChoice==2)
				{
					System.out.println("Please enter the new details for the adult person.");
					in.nextLine();
					System.out.print("Full name: ");
					String fullName=in.nextLine();
					System.out.print("Status: ");
					String status=in.nextLine();
					int birthYear=0;
					boolean isValidAge;
					boolean run=true;
					while(run)
					{
						isValidAge=true;
						System.out.print("Birth year (Enter 4 digit of year): ");
						birthYear=in.nextInt();
						birthYear=Math.abs(birthYear);
						if(Integer.toString(birthYear).toString().length()!=4)
						{
							isValidAge=false;
							System.out.println("Please enter 4 digit birth year");
						}
						if(isValidAge)
						{
							int currentYear = Calendar.getInstance().get(Calendar.YEAR);
							 if(birthYear>currentYear)
							 {
								isValidAge=false;
								System.out.println("Please enter age year less than "+currentYear);
							 }
							 else if(birthYear<1930)
							 {
								isValidAge=false;
								System.out.println("Please enter age year greater than 1930.");
							 }
							 else if(currentYear-birthYear<=16)
							 {
								isValidAge=false;
								System.out.println("Your age must be greater than 16.");
							 }

						}
						if(isValidAge)
						{
							run=false;                        
						}
						
					}
                                        persons.get(i).setFullName(fullName);
						persons.get(i).setStatus(status);
						persons.get(i).setBirthYear(birthYear);
						System.out.println("The adult person has been updated successfully.");
		
	
				}

				//3. Delete the person
				else if (subChoice==3)
				{
					persons.remove(persons.get(i));
					System.out.println("The adult person has been deleted.");
                                        subChoice=0;
				}

				//4. choice to display the children of the profile
				else if (subChoice==4)
				{
                                    for(int j=0;j<persons.get(i).getChildren().size();j++)
                                    {
                                        for(int k=0;k<dependents.size();k++)
                                        {
                                            if(dependents.get(k).getUserName().equals(persons.get(i).getChildren().get(j)))
                                            {
                                                System.out.println("Child "+ (j+1));
                                                dependents.get(k).display();
                                                System.out.println();
                                            }
                                        }
                                    }
				}
                                //choice to display the friends of the profile
                                else if (subChoice==5)
				{
                                    for(int j=0;j<persons.get(i).getFriends().size();j++)
                                    {
                                        for(int k=0;k<persons.size();k++)
                                        {
                                            if(persons.get(k).getUserName().equals(persons.get(i).getFriends().get(j)))
                                            {
                                                System.out.println("Friend "+ (j+1));
                                                persons.get(k).display();
                                                System.out.println();
                                            }
                                        }
                                    }
                                    subChoice=1;
				}
                                //choice to connect this profile to another person as friend
                                else if(subChoice==6)
                                {
                                    String userName="";
                                    boolean isUsernameExists;
                                        isUsernameExists=false;
                                        System.out.print("Enter username of an adult person: ");
                                        userName=in.next();
                                        
                                        //making sure that user wont enter same profile user name
                                        if(username.equals(persons.get(i)))
                                                System.out.println("Please enter another user name.");
                                        else
                                        {
                                        for(int j=0;j<persons.size();j++)
                                        {
                                            if(persons.get(j).getUserName().equals(userName))
                                                isUsernameExists=true;
                                        }
                                        if(isUsernameExists==true)
                                        {
                                            //if use enteres a valid username
                                            //we will add that profile to selected profile as friend
                                            boolean isAdded=persons.get(i).addFriend(userName);
                                            if(isAdded)
                                            {
                                                //Now making a two way friendship
                                               for(int j=0;j<persons.size();j++)
                                               {
                                                   if(persons.get(j).getUserName().equals(userName))
                                                   {
                                                       persons.get(j).addFriend(persons.get(i).getUserName());
                                                   }
                                               }       
                                                System.out.println("Successfully added as a friend.");
                                            }
                                            else
                                                System.out.println("Already friend.");
                                        subChoice=1;
                                        }
                                        else
                                        {
                                            System.out.println("The username is not found.");
                                            subChoice=1;
                                        }
                                        }
                                }
                                //choice to check for a friendship
                                else if(subChoice==7)
                                {
                                    String userName="";
                                    boolean isUsernameExists;
                                        isUsernameExists=false;
                                        System.out.print("Enter username of an adult person: ");
                                        userName=in.next();
                                        for(int j=0;j<persons.size();j++)
                                        {
                                            if(persons.get(j).getUserName().equals(userName) && !(persons.get(j).getUserName().equals(persons.get(i).getUserName())))
                                                isUsernameExists=true;
                                        }
                                        if(isUsernameExists==true)
                                        {
                                            boolean isFriend=persons.get(i).isFriend(userName);
                                            if(isFriend)
                                                System.out.println("Yes, they are friends.");
                                            else
                                                System.out.println("Not a friend.");
                                            subChoice=1;
                                        }
                                        else
                                        {
                                            System.out.println("The username is not found.");
                                            subChoice=1;
                                        }
                                            

                                }
                                //choice to go back to previous menu
                                else if(subChoice==8)
                                    subChoice=0;
			}
		}
	}
}
                        else if(menuChoice==7)
{
	System.out.println("Enter username of the dependent.");
	in.nextLine();
        String username = in.nextLine();
	for(int i = 0;i<dependents.size();++i)
	{
		if(dependents.get(i).getUserName().equals(username)) 
		{
			int subChoice = 1;
			while(subChoice>=1 && subChoice<=4)
			{
                                //The submenu for the selected profile
				System.out.println("1. Display the profile of this dependent.");
				System.out.println("2. Update the profile of this dependent.");
				System.out.println("3. Delete the profile of this dependent.");
				System.out.println("4. Display the parents of this dependent.");
				System.out.println("5. Display the friends of this dependent.");
                                System.out.println("6. Connect with another dependent.");
                                System.out.println("7. Find whether this dependent is friend with another dependent.");
				System.out.println("8. Go back to main menu.");

				subChoice = in.nextInt();

				//1. Display the selected profile
				if(subChoice==1)
				{
                                    dependents.get(i).display();
				}

				//2. Update the selected profile
				else if(subChoice==2)
				{
					System.out.println("Please enter the details for the dependent.");
                                        System.out.print("Full name: ");
                                        in.nextLine();
                                        String fullName=in.nextLine();
                                        System.out.print("Status: ");
                                        String status=in.nextLine();
                                        int birthYear=0;
                                        boolean isValidAge;
                                        boolean run=true;
                                        while(run)
                                        {
                                            isValidAge=true;
                                            System.out.print("Birth year (Enter 4 digit of year): ");
                                            birthYear=in.nextInt();
                                            birthYear=Math.abs(birthYear);
                                            if(Integer.toString(birthYear).toString().length()!=4)
                                            {
                                                isValidAge=false;
                                                System.out.println("Please enter 4 digit birth year");
                                            }
                                            if(isValidAge)
                                            {
                                                int currentYear = Calendar.getInstance().get(Calendar.YEAR);
                                                 if(birthYear>currentYear)
                                                 {
                                                    isValidAge=false;
                                                    System.out.println("Please enter age year less than "+currentYear);
                                                 }

                                            else if(currentYear-birthYear>=16)
                                            {
                                               isValidAge=false;
                                               System.out.println("Your age must be less than 16.");
                                            }

                                       }
                                       if(isValidAge)
                                       {
                                           run=false;                        
                                        }
                                    }
                
                                    dependents.get(i).setFullName(fullName);
                                    dependents.get(i).setStatus(status);
                                    dependents.get(i).setBirthYear(birthYear);
                                    System.out.println("The dependent has been updated successfully.");
                                    System.out.println();
                                }

				//3. Delete the selected dependent
				else if (subChoice==3)
				{
					dependents.remove(dependents.get(i));
					System.out.println("The dependent has been deleted.");
                                        subChoice=0;
				}

				//4. displaying the parents of the selected dependent
				else if (subChoice==4)
				{
                                    System.out.println("Father username: "+ dependents.get(i).getFather());
                                    System.out.println("Mother username: "+ dependents.get(i).getMother());
                                }
                                
                                //displaying the friends of the selected dependent
                                else if (subChoice==5)
				{
                                    for(int j=0;j<dependents.get(i).getFriends().size();j++)
                                    {
                                        for(int k=0;k<dependents.size();k++)
                                        {
                                            if(dependents.get(k).getUserName().equals(dependents.get(i).getFriends().get(j)))
                                            {
                                                System.out.println("Friend "+ (j+1));
                                                dependents.get(k).display();
                                                System.out.println();
                                            }
                                        }
                                    }
                                    subChoice=1;
				}
                                
                                //Choice to connect this dependent with another dependent
                                else if(subChoice==6)
                                {
                                    String userName="";
                                    boolean isUsernameExists;
                                        isUsernameExists=false;
                                        System.out.print("Enter username of a dependent: ");
                                        userName=in.next();
                                        int year=0;
                                        if(username.equals(dependents.get(i)))
                                                System.out.println("Please enter another user name.");
                                        else
                                        {
                                        for(int j=0;j<dependents.size();j++)
                                        {
                                            if(dependents.get(j).getUserName().equals(userName))
                                            {
                                                year=dependents.get(j).getBirthYear();
                                                isUsernameExists=true;
                                            }
                                            }
                                        if(isUsernameExists==true)
                                        {
                                            boolean isAdded=dependents.get(i).addFriend(userName,year);
                                            if(isAdded)
                                            {
                                                //Making two way friendship
                                                for(int j=0;j<dependents.size();j++)
                                               {
                                                   if(dependents.get(j).getUserName().equals(userName))
                                                   {
                                                       dependents.get(j).addFriend(dependents.get(i).getUserName(),dependents.get(i).getBirthYear());
                                                   }
                                               }
                                                System.out.println("Successfully added as a friend.");
                                            subChoice=1;
                                            }
                                            subChoice=6;
                                        
                                        }
                                        else
                                        {
                                            System.out.println("The username is not found.");
                                            subChoice=1;
                                        }
                                        }
                                        
                                }
                                
                                //Choice to check for a friendship
                                else if(subChoice==7)
                                {
                                    String userName="";
                                    boolean isUsernameExists;
                                        isUsernameExists=false;
                                        System.out.print("Enter username of a dependent: ");
                                        userName=in.next();
                                        for(int j=0;j<dependents.size();j++)
                                        {
                                            if(dependents.get(j).getUserName().equals(userName) && !(dependents.get(j).getUserName().equals(dependents.get(i).getUserName())))
                                                isUsernameExists=true;
                                        }
                                        if(isUsernameExists==true)
                                        {
                                            boolean isFriend=dependents.get(i).isFriend(userName);
                                            if(isFriend)
                                                System.out.println("Yes, they are friends.");
                                            else
                                                System.out.println("Not a friend.");
                                            subChoice=1;
                                        }
                                        else
                                        {
                                            System.out.println("The username is not found.");
                                            subChoice=1;
                                        }
                                            

                                }
                                //choice to go back to previous menu
                                else if(subChoice==8)
                                    subChoice=0;
                                        }
                                    }
				}
			
                        }
		}
    }
    
}
