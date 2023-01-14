package user;

public class User {
    private int uuID;

    private String login;

    private String password;


    private String firstName;

    private String middleName;

    private String lastName;

    private double balance;


    public User(){
    }

    public User(int uuID,String login,String password, String firstName, String middleName, String lastName, double balance){
        this.uuID = uuID;
        this.login = login;
        this.password = password;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.balance = balance;
    }

    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }

    public int getUuID() {
        return uuID;
    }

    public void setUuID(int uuID) {
        this.uuID = uuID;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}


