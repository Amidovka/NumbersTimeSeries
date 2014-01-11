package Numbers;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by amid on 9.01.14.
 */

// creates arff file

public class CreateArff {

    public static void main(String[] args) {

        FileOutputStream fop = null;
        File file;
        String content = "@RELATION radacisel\n\n@ATTRIBUTE numbers NUMERIC\n\n@DATA\n1\n2\n3\n4";

        try {

            file = new File("Numbers.arff");
            fop = new FileOutputStream(file);

            // if file doesn't exist, then create it
            if (!file.exists()) {
                file.createNewFile();
            }

            // get the content in bytes
            byte[] contentInBytes = content.getBytes();

            fop.write(contentInBytes);
            fop.flush();
            fop.close();

            System.out.println("Done");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fop != null) {
                    fop.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}