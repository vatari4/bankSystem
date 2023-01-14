package programm.java;

import user.User;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.io.*;

public class Programm extends User {
    String path = "C:\\path.txt";//путь
    int id = 1;


    private User user;

    public Programm() {
    }

    public void CreateUser() {
        this.user = new User();
    }

    public void UserPrint() {
        /*System.out.println("ID user: " + this.user.getUuID());
        System.out.println("First Name: " + this.user.getFirstName());
        System.out.println("Middle Name: " + this.user.getMiddleName());
        System.out.println("Lat Name: " + this.user.getLastName());
        System.out.println("Balance: " + this.user.getBalance());
        System.out.println("Login is: " + this.user.getLogin());*/

    }

    public void Unit() throws IOException {
        Scanner scanner = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new FileReader(path));


        int id = 0;
        System.out.println("Do u have acc in Tinkoff \n yes or no");
        String answer = scanner.nextLine().toLowerCase();
        if (answer.equals("yes") && answer.isEmpty() == false) {
            //---------------------//
            FileReader fr = new FileReader (path);
            Scanner scan = new Scanner(fr);
            System.out.println("Input ur login");
            String login = scanner.nextLine().toLowerCase();
            System.out.println("Input ur password");
            String password = scanner.nextLine();
            while(scan.hasNextLine()) {
                String str = scan.nextLine();
                String[] params = str.split(" ");
                if (login.equals(params[1]) && password.equals(params[2])) {
                    System.out.println("Вы вошли в систему как " + login + ".");
                    break;
                }
                else if (!scan.hasNextLine())
                    System.out.println("Логин или пароль не корректны.");
            }
            if (login.isEmpty()) {
                System.out.println("Login is Empty");
            }
        }
        /*this.user.setLogin(login);*/
        else if (answer.equals("no")) {

            System.out.println("U need registration? \n yes or no");
            String registration = scanner.nextLine().toLowerCase();
            if (registration.equals("yes")) {
                System.out.println("Input ur login");
                String login = scanner.nextLine().toLowerCase();
                System.out.println("Input ur password");
                String password = scanner.nextLine();
                try (FileWriter writer = new FileWriter(path, true))  //true - записывает поверх, false - перезапись
                {
                    String s1;
                    while ((s1 = br.readLine()) != null) {
                        if (s1.contains("Логин") == true) {
                            id++;
                        }
                    }

                    // запись по символам
                    writer.append('\n');
                    writer.append("Логин: " + login + "" + password + "\n");
                    writer.append("Id: " + id + "\n");


                    writer.flush();
                } catch (IOException ex) {

                    System.out.println("ERROR" + ex);
                }

            } else {
                System.out.println("have a good day");
            }
        /*System.out.println("First Name: ");
        String firstName = scanner.nextLine();
        System.out.println("Middle Name: ");
        String middleName = scanner.nextLine();
        System.out.println("Last Name: ");
        String lastName = scanner.nextLine();*/
            //нужно создать вывод с балансом - прописать баланс как с именем
            /*this.user.setUuID(id);*/

        /*this.user.setFirstName(firstName);
        this.user.setMiddleName(middleName);
        this.user.setLastName(lastName);*/

/*         String separator = File.separator;

            String path = separator + "C:" + separator + "Users" + separator + "mehak" + separator + "Desktop" + separator +"program" + separator
                    + "notes3.txt";
*/




            /*String str = "Mawa";*/
            /*boolean Logins = login.contains(login);*/




                /*if(Logins == false){
                    System.out.println("Login not found");
                }else {
                    System.out.println("Successful, write ur password");
                }*/



        /*} catch (FileNotFoundException e) {
            throw new RuntimeException(e);*/


        }


    }
}





