package lms

public class Patron{

    private int memberId;
    private String Name;
    private String contactNo;

//getters and setters

    abstract void addPatron(Patron)
    abstract void removePatron(memberId);
    abstract void updatePatron(memberId,Patron);
}
