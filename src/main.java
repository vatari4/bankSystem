import programm.java.Programm;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Programm user = new Programm();

        user.CreateUser();
        user.Unit();
        user.UserPrint();

    }
}