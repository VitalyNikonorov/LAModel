package controller;

import border.FileBorder;

/**
 * Created by vitaly on 16.06.16.
 */
public class FileController {

    private FileBorder fileBorder;

    public FileController() {
         this.fileBorder = new FileBorder();
    }

    public void saveMetaData(String info, String directory){
        fileBorder.saveMetaData(info, directory);
    }

}
