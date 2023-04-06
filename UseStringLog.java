//----------------------------------------------------------------------------
// UseStringLog.java           by Dale/Joyce/Weems
//
// Simple example of the use of a StringLog.
//----------------------------------------------------------------------------

public class UseStringLog
{
  public static void main(String[] args)
  {
    StringLogInterface sample;
    sample = new ArrayListStringLog("Example Use");
    sample.insert("Elvis");
    sample.insert("King Louis XII");
    sample.insert("Captain Kirk");
    sample.uniqInsert("Elvis");
    
    System.out.println("How many Elvis? " + sample.howMany("Elvis"));
    sample.delete("Elvis");
    System.out.println("Elvis Deleted");
    sample.uniqInsert("Zombie Elvis");
    
    
    System.out.println("How many Elvis? " + sample.howMany("Elvis"));
    
    System.out.println(sample);
    System.out.println(sample.isEmpty());
    System.out.println("The size of the log is " + sample.size());
    System.out.println("Elvis is in the log: " + sample.contains("Elvis"));
    System.out.println("Santa is in the log: " + sample.contains("Santa"));
    
    
    // Make some copies
    sample.insert("Elvis");
    sample.insert("Elvis");
    sample.insert("Elvis");
    // Delete All
    System.out.println("Number of Deleted Elvis: " + sample.deleteAll("Elvis"));
    
  }
}