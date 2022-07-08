
package studentlinkedlist;

import java.util.LinkedList;

public class StudentLinkedList {    
LinkedList list = new LinkedList();


public StudentLinkedList(){
    list = new LinkedList<StudentDetails>();
}


public void add(StudentDetails studentdetails) {
        //Check if a record already exists or not, 
        if (!search(studentdetails.getStudentID())) {
            //if the record doesn't exist then add it to the student details list,
            list.add(studentdetails);
 
        } else { // Otherwise
            System.out.println("Record already exists in the Record list"); //error display message
        }
    }
 
    /**
     * Search Record.
     *
     * @param studentID
     * @return
     */
    public boolean search(int studentID) {
 
        // Iterate the student detail list
        for (StudentDetails l : list) {
            // Check record by id Number
            if (l.getStudentID()== studentID) {
                System.out.println(l);
                return true;
            }
        }
        return false;
    }
 
    /**
     * Delete Record.
     *
     * @param StdIDdetails
     */
    public void delete(int StdIDdetails) {
        StudentDetails deleteDetails = null;
        // Iterate student detail list.
        for (StudentDetails ll : list) {
            //Find record to be deleted by id Number.
            if (ll.getStudentID()== StdIDdetails) {
                deleteDetails  = ll;
            }
        }
        //If delDetails is null, then show error message,         
        if (deleteDetails  == null) {
            System.out.println("Invalid record Id");
        } else {
             //else remove the record from StudentLinkedList.
            list.remove(deleteDetails );
            System.out.println("Successfully removed record from the list");
        }
    }
 
    /**
     * Find Record.
     *
     * @param studentID
     * @return
     */
    public StudentDetails SearchRecord(int studentID) {
        // Iterate student detail list
        for (StudentDetails l : list) {
            // Check record by student id Number.
            if (l.getStudentID()== studentID) {
                return l;
            }
        }
        return null;
    }
 
 
    /**
     * Display Records
     */
    public void display() {
        // If StudentDetails list is empty
        if (list.isEmpty()) {
            //print the message below.
            System.out.println("The list has no records\n");
        }
        // Iterate student detail list
        for (StudentDetails studentdetails : list) {
            // Print the StudentDetails list.
            System.out.println(studentdetails.toString());
        }
    }
 
}

