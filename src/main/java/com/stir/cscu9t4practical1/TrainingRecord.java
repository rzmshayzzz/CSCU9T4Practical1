// An implementation of a Training Record as an ArrayList
package com.stir.cscu9t4practical1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class TrainingRecord {
    private List<Entry> tr;
    
    public TrainingRecord() {
        tr = new ArrayList<Entry>();
    } //constructor
    
    // add a record to the list
    public void addEntry(Entry e){
        tr.add(e);
    } // addClass
    
    // look up the entry of a given day and month
    public String lookupEntry (int d, int m, int y) {
        ListIterator<Entry> iter = tr.listIterator();
        String result = "No entries found";
        while (iter.hasNext()) {
            Entry current = iter.next();
            if (current.getDay() == d && current.getMonth() == m && current.getYear() == y) {
                result = current.getEntry();
            }
        }
        return result;
    } // lookupEntry
    
    // Return all entries on a given date
    public String getAllEntriesByDate(int d, int m, int y) {
        StringBuilder result = new StringBuilder();
        for (Entry entry : tr) {
            if (entry.getDay() == d && entry.getMonth() == m && entry.getYear() == y) {
                result.append(entry.getEntry()).append("\n");
            }
        }
        return result.toString();
    }
    
    // Remove entry based on provided Name, Day, Month, and Year
    public boolean removeEntry(String name, int d, int m, int y) {
        Iterator<Entry> iterator = tr.iterator();
        while (iterator.hasNext()) {
            Entry entry = iterator.next();
            if (entry.getName().equals(name) && entry.getDay() == d && entry.getMonth() == m && entry.getYear() == y) {
                iterator.remove();
                return true; // Entry removed successfully
            }
        }
        return false; // No matching entry found
    }
    
    // Count the number of entries
    public int getNumberOfEntries(){
        return tr.size();
    }
    
    // Clear all entries
    public void clearAllEntries(){
        tr.clear();
    }
    
} // TrainingRecord
