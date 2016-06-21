package controller;

import border.SystemBorder;
import storage.DataStorage;

/**
 * Created by vitaly on 16.06.16.
 */
public class DataController {

    private DataStorage dataStorage;
    private SystemBorder systemBorder;

    public DataController() {
        this.dataStorage = new DataStorage();
        this.systemBorder = new SystemBorder();
    }

    public String getMetaInfo(){
        return dataStorage.getAuthorInfo();
    }

    public String getDirectory(){
        return systemBorder.getDirectory();
    }

}
