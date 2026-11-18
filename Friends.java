import java.util.*;
// Represent a person's name with three components, a first name,
// a middle name, and a last name.

public class Friends {

   // declare and initialize the ArrayList
   ArrayList<Name> names = new ArrayList<Name>();
   // declare and initialize the Random class
   Random rand = new Random();
   Name name = new Name("Katie", "Maggie", "Andy");
   
   // the constructor
   public Friends () {
       // add three names to the ArrayList
       names.add(name);
   }
   
   public void printRandomFriend(){
       //print a random Name object from the List
       System.out.println(names.get(rand.nextInt(names.size())));
    }
   
  
}