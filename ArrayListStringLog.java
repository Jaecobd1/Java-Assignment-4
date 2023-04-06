import java.util.ArrayList;
public class ArrayListStringLog implements StringLogInterface {
	  protected String name;              // name of this StringLog
	  protected ArrayList<String> log;             // array that holds strings
	  protected int lastIndex = -1;       // index of last string in array

	  public ArrayListStringLog(String name, int maxSize)
	  // Precondition:   maxSize > 0
	  //
	  // Instantiates and returns a reference to an empty ArrayStringLog
	  // object with name "name" and room for maxSize strings.
	  {
	    log = new ArrayList<String>();
	    this.name = name;
	  }

	  public ArrayListStringLog(String name)
	  // Instantiates and returns a reference to an empty ArrayStringLog
	  // object with name "name" and room for 100 strings.
	  {
	    log = new ArrayList<String>();
	    this.name = name;
	  }

	  public void insert(String element)
	  // Precondition:   This StringLog is not full.
	  //
	  // Places element into this StringLog.
	  {
	    lastIndex++;
	    log.add(element);
	  }
	  
	  public boolean uniqInsert(String element) {
		  boolean isElementFound = false;
		  
		  for(String item: log)
			  if(element.equalsIgnoreCase(item)) {
				  
				  return false;
			  }
		  
		  if(!isElementFound) {
			  lastIndex++;
			  log.add(element);
		  }
		  return true;
	  }
	  

	  public boolean delete(String element) {
		  boolean moreToSearch;
		  int location = 0;
		  boolean found = false;
		  moreToSearch = (location <= lastIndex);
		  
		  while(moreToSearch && !found) {
			  String current = log.get(location);
			  if (element.equalsIgnoreCase(current)){
				  found = true;
			  }
			  else {
				  location++;
				  moreToSearch = (location <= lastIndex);
			  }
		  }
		  
		  if(found) {
			  log.remove(location);
			  lastIndex--;
		  }
		  return found; 
	  }
	  
	  public int deleteAll(String element) {
		  int count = 0;
		  for(int i = 0; i < log.size(); i++) {
			  if (element.equalsIgnoreCase(log.get(i))) {
				  delete(element);
				  count++;
			  }
		  }
		  
		  return count; 
	  }
	  
	  public boolean isEmpty() {
		  if(lastIndex < 0) {
			  return true;
		  } else {
			  return false;
		  }
	  }
	  
	  public int howMany(String element) {
		  int count = 0;
		  
		  for(String word: log) {
			  if(element.equalsIgnoreCase(word)) {
				  count++;
			  }
		  }
		  
		  return count;
	  }
	  
	  public boolean isFull()
	  // Returns true if this StringLog is full, otherwise returns false.
	  {
	    if (lastIndex == (log.size() - 1))
	      return true;
	    else
	      return false;
	  }

	  public int size()
	  // Returns the number of Strings in this StringLog.
	  {
	    return (lastIndex + 1);
	  }

	  public boolean contains(String element)
	  // Returns true if element is in this StringLog,
	  // otherwise returns false.
	  // Ignores case differences when doing string comparison.
	  {
	    int location = 0;
	    while (location <= lastIndex)
	    {
	      if (element.equalsIgnoreCase(log.get(location)))  // if they match
	        return true;
	      else
	        location++;
	    }
	   return false;
	  }

	  public void clear()
	  // Makes this StringLog empty.
	  {
	    for (int i = 0; i <= lastIndex; i++)
	      log.remove(i);
	      lastIndex = -1;
	  }

	  public String getName()
	  // Returns the name of this StringLog.
	  {
	    return name;
	  }

	  public String toString()
	  // Returns a nicely formatted string representing this StringLog.
	  {
	    String logString = "Log: " + name + "\n\n";

	    for (int i = 0; i <= lastIndex; i++)
	      logString = logString + (i+1) + ". " + log.get(i) + "\n";

	    return logString;
	  }
}
