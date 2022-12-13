package reader;

import java.io.*;

public class Reader {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("C:\\path.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("ERROR" + e);
        } finally {
            br.close();
        }
    }
}
