
package studentlinkedlist;

/**
 *
 * @author Preyaa
 */
public class StudentDetails {
    //Instance Variables.
    private int studentID;
    private String name;
    private String address;
    private int age;
    private String gender;
 
    /**
     * Default Constructor.
     */
    public StudentDetails() {
    }
 
    /**
     * Parameterized Constructor.
     *
     * @param studentID
     * @param name
     * @param address
     * @param age
     * @param gender
     */
    public StudentDetails(int studentID,String name, String address, int age, String gender) {
        this.studentID=studentID;
        this.name = name;
        this.address=address;
        this.age = age;
        this.gender = gender;
    }
 
    /**
     * Get the value of StudentID
     *
     * @return the value of studentID
     */
    public int getStudentID() {
        return studentID;
    }
 
    /**
     * Set the value of StudentID
     *
     * @param studentID new value of studentID
     */
    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }
 
    /**
     * Get the value of Name
     *
     * @return the value of name
     */
    public String getName() {
        return name;
    }
 
    /**
     * Set the value of Name
     *
     * @param name new value of name
     */
    public void setName(String name) {
        this.name = name;
    }
 
    /**
     * Get the value of Address
     *
     * @return the value of address
     */
    public String getAddress() {
        return address;
    }
 
    /**
     * Set the value of Address
     *
     * @param address new value of address
     */
    public void setAddress(String address) {
        this.address = address;
    }
    /**
     * Get the value of Age
     *
     * @return the value of age
     */
    public int getAge() {
        return age;
    }
 
    /**
     * Set the value of Age
     *
     * @param age new value of age
     */
    public void setAge(int age) {
        this.age = age;
    }
    /**
     * Get the value of Gender
     *
     * @return the value of gender
     */
    public String getGender() {
        return address;
    }
 
    /**
     * Set the value of Gender
     *
     * @param gender new value of gender
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    
    
 
    /**
     * toString Method.
     *
     * @return
     */
    @Override
    public String toString() {
        return "StudentDetails{" + "studentID =" + studentID + ",name=" + name + ", address=" + address + ", age=" + age + ",gender="+ gender + '}';
    }
 
}

