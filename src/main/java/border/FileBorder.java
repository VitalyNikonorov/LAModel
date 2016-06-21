package border;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by vitaly on 16.06.16.
 */
public class FileBorder {

    public void saveMetaData(String info, String directory){

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd G 'в' HH:mm:ss z");
        String dir = dateFormat.format( new Date() );

        new File(String.format("%s/%s", directory, dir)).mkdir();

        File outputRaw = new File(String.format("%s/%s/%s", directory, dir, "info.txt"));

        try(FileOutputStream os = new FileOutputStream(outputRaw)) {
            os.write(info.getBytes());
            os.flush();

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

}
