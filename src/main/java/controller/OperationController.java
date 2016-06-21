package controller;

import storage.MainStorage;

/**
 * Created by vitaly on 16.06.16.
 */
public class OperationController {

    private MainStorage mainStorage;

    public OperationController() {
        this.mainStorage = new MainStorage();
    }

    public double getA0(){
        return mainStorage.geta0();
    }

    public double getA1(){
        return mainStorage.geta1();
    }

    public double getA2(){
        return mainStorage.geta2();
    }

    public double getA3(){
        return mainStorage.geta3();
    }

    public double getA4(){
        return mainStorage.geta4();
    }

    public double getA5(){
        return mainStorage.geta5();
    }

    public double getB0(){
        return mainStorage.getb0();
    }

    public double getB1(){
        return mainStorage.getb1();
    }

    public double getB2(){
        return mainStorage.getb2();
    }

    public double getB3(){
        return mainStorage.getb3();
    }

    public double getB4(){
        return mainStorage.getb4();
    }

    public double getB5(){
        return mainStorage.getb5();
    }

}
