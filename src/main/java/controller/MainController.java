package controller;

/**
 * Created by vitaly on 16.06.16.
 */
public class MainController {

    private OperationController operationController;
    private DataController dataController;
    private FileController fileController;

    public MainController() {
        this.operationController = new OperationController();
        this.dataController = new DataController();
        this.fileController = new FileController();
    }

    public void saveMetaData(){
        String info = dataController.getMetaInfo();
        String dir = dataController.getDirectory();
        fileController.saveMetaData(info, dir);
    }


}
