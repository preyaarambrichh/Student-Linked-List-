
package studentlinkedlist;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        
 
        //Creating StudentLinkedList Object.
        StudentLinkedList std = new StudentLinkedList();
        StudentDetails studentdetails = new StudentDetails();
        
                studentdetails.setStudentID(202006115);
                studentdetails.setName("Preyaa");
                studentdetails.setAddress("Goodlands");
                studentdetails.setAge(21);
                studentdetails.setGender("Female");
                // Calling the add method for adding the first student details to add static data to linked List. 
                std.add(studentdetails);
        
        StudentLinkedList std1 = new StudentLinkedList();
        StudentDetails studentdetails1 = new StudentDetails();
        
                studentdetails1.setStudentID(202006630);
                studentdetails1.setName("Alvin");
                studentdetails1.setAddress("Belle Vue Maurel");
                studentdetails1.setAge(30);
                studentdetails1.setGender("Male");
                // Calling the add method for adding the second student details to add static data to linked List. 
                std1.add(studentdetails1);
                
        StudentLinkedList std2 = new StudentLinkedList();
        StudentDetails studentdetails2 = new StudentDetails();
        
                studentdetails2.setStudentID(202006409);
                studentdetails2.setName("Natasha");
                studentdetails2.setAddress("Long Mountain");
                studentdetails2.setAge(24);
                studentdetails2.setGender("Female");
                // Calling the add method for adding the third student details to add static data to linked List. 
                std2.add(studentdetails2);
                
        StudentLinkedList std3 = new StudentLinkedList();
        StudentDetails studentdetails3 = new StudentDetails();
        
                studentdetails3.setStudentID(202006648);
                studentdetails3.setName("Yashwini");
                studentdetails3.setAddress("Petit Raffray");
                studentdetails3.setAge(25);
                studentdetails3.setGender("Female");
                // Calling the add method for adding the fourth student details to add static data to linked List. 
                std3.add(studentdetails3);
        
               
 
        //Creating Scanner Object.
        Scanner input = new Scanner(System.in);
 
        //Creating Option Integer Variable.
        int option = 0;
        //Do - While loop
        do {
            menu();
            option = input.nextInt();
 
            switch (option) {
                // Created Linked List for student details
                case 1:
                std.display();
                std1.display(); 
                std2.display();
                std3.display();
                    break;
                    
                // Adding details about new student into the list    
                case 2:
                    System.out.print("The student ID Number = "); // user input: Input student number
                    int studentID = input.nextInt();    
                    input.nextLine();
                    
                    System.out.print("The Student Name = "); // user input: Input student name
                    String name = input.nextLine();
                   
                    System.out.print("The Student Address = "); // user input: Input student address
                    String address = input.nextLine();   
                    
                    System.out.print("The student age = "); // user input: Input student age
                    int age = input.nextInt();
                    input.nextLine();
                    
                    System.out.print("The Student Gender = "); // user input: Input student gender
                    String gender = input.nextLine();
                    // Create studentdetails object and pass these constructor parameters.
                    studentdetails = new StudentDetails(studentID, name, address, age, gender);
                    // Call the method add studentdetails
                    std.add(studentdetails);
                 
                    System.out.println(studentdetails.toString()); // Display the new student details list
                    break;
                    
                case 3:
                    System.out.print("Please enter the student ID: ");
                    int Id = input.nextInt();
                    // delete studentdetails about a particular student
                    std.delete(Id);  //delete the first student details present in the created list
                    std1.delete(Id); 
                    std2.delete(Id); 
                    std3.delete(Id); 
                    break;
 
                case 4:
                    //searching details about a particular student
                    System.out.print("Please enter the student ID: ");
                    int stdId = input.nextInt();
 
                    if (!std.search(stdId)) 
                    {
                      if (!std1.search(stdId)) 
                      {
                        if (!std2.search(stdId))
                        {
                         if (!std3.search(stdId))
                         {                                
                                                    
                            }else
                                 {
                                     // print this error message if the user didn't input a valid student ID
                                        System.out.println("Student id does not exist\n");      
                                 }
                        }                                 
                      }
                    }

                    break;                  
                case 5:
                    // printing the student details
                    std.display();
                    std1.display();
                    std2.display();
                    std3.display();
                    break;
                    
                case 6:
                    // Exiting the program
                    System.out.println("\nThank you for using the student program\n");
                    System.exit(0);
                    break;
                default:
                    // Invalid input if the user didn't input a choice between 1 - 6
                    System.out.println("\nInvalid input\n");
                    break;
 
            }
        } while (option != 6);
    }
 
    /**
     * Menu - Static menu for displaying options.
     */
    public static void menu() {
        System.out.println("******************MENU OPTION LIST*******************");
        System.out.println("*     1: Create Student Linked List                 *");
        System.out.println("*     2: Add new Student Details                    *");
        System.out.println("*     3: Delete details of a particular student     *");
        System.out.println("*     4: Search details of a particular student     *");
        System.out.println("*     5: Display student details                    *");
        System.out.println("*     6: Exit Program                               *");
        System.out.println("*****************************************************");
        System.out.print("Make your selection : ");
        
        }
 
}

