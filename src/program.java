package programm.java;

import user.User;

import java.util.Scanner;

public class Programm extends User {

    private User user;

    public Programm() {
    }

    public void CreateUser() {
        this.user = new User();
    }

    public void UserPrint() {
        System.out.println("ID user: " + this.user.getUuID());
        System.out.println("First Name: " + this.user.getFirstName());
        System.out.println("Middle Name: " + this.user.getMiddleName());
        System.out.println("Lat Name: " + this.user.getLastName());
        System.out.println("Balance: " + this.user.getBalance());
    }

    public void Unit() {
        Scanner input = new Scanner(System.in);

        int id = 0;
        System.out.println("Id User: ");
        System.out.println("First Name: ");
        String firstName = input.nextLine();
        System.out.println("Middle Name: ");
        String middleName = input.nextLine();
        System.out.println("Last Name: ");
        String lastName = input.nextLine();
        //нужно создать вывод с балансом - прописать баланс как с именем
        this.user.setUuID(id);
        this.user.setFirstName(firstName);
        this.user.setMiddleName(middleName);
        this.user.setLastName(lastName);
    }
}

