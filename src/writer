package writer;

import java.io.*;

public class Writer {

        public static void main() throws IOException {
/*         String separator = File.separator;

            String path = separator + "C:" + separator + "Users" + separator + "mehak" + separator + "Desktop" + separator +"program" + separator
                    + "notes3.txt";
*/

            try{
                File file = new File("C:\\path.txt");
                if (!file.exists())
                    file.createNewFile();

                PrintWriter pw = new PrintWriter(file);

                pw.println("Ever");
                pw.close();


            }catch (IOException e){
                System.out.println("ERROR" + e);
            }



        }
}
