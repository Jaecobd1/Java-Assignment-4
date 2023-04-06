//----------------------------------------------------------------------
// StringLogInterface.java     by Dale/Joyce/Weems
//
// Interface for a class that implements a log of Strings.
// A log "remembers" the elements placed into it.
//
// A log must have a "name".
//----------------------------------------------------------------------

public interface StringLogInterface
{
  void insert(String element);
  // Precondition:   This StringLog is not full.
  //
  // Places element into this StringLog.
  
  boolean uniqInsert(String element);
  // Returns true and adds a string if a given element is unique
  // Returns false if element is within log
  
  boolean delete(String element);
  // Delete an element from the String Log
  // Returns true if the element is deleted, otherwise, return false.
  
  int deleteAll(String element);
  // Deletes all occurrence of an element from the StringLog
  // Returns the number of deletions
  
  boolean isEmpty();
  // Returns true if the logs is empty and false otherwise
  
  int howMany(String element);
  // Returns an integer value indicating how many times an element occurs in the log

  boolean isFull();
  // Returns true if this StringLog is full, otherwise returns false.

  int size();
  // Returns the number of Strings in this StringLog.

  boolean contains(String element);
  // Returns true if element is in this StringLog,
  // otherwise returns false.
  // Ignores case differences when doing string comparison.

  void clear();
  // Makes this StringLog empty.

  String getName();
  // Returns the name of this StringLog.

  String toString();
  // Returns a nicely formatted string representing this StringLog.
}
