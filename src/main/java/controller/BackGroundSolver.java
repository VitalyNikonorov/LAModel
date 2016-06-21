package controller;

import model.SolveModel;
import org.jfree.data.time.Millisecond;
import org.jfree.data.time.TimeSeries;

import java.util.Date;

/**
 * Created by vitaly on 21.06.16.
 */
public class BackGroundSolver implements Runnable {

    double result[];
    double time[];
    double manage[];
    private Millisecond curTime;
    private TimeSeries mainSeries;

    private double a0, a1, a2, a3, a4, a5,
            b0, b1, b2, b3, b4, b5;

    public BackGroundSolver(Millisecond curTime, double[] result, double[] time, double[] manage, TimeSeries mainSeries) {
        this.curTime = curTime;
        this.result = result;
        this.time = time;
        this.manage = manage;
        this.mainSeries = mainSeries;
        OperationController operationController = new OperationController();

        a0 = operationController.getA0();
        a1 = operationController.getA1();
        a2 = operationController.getA2();
        a3 = operationController.getA3();
        a4 = operationController.getA4();
        a5 = operationController.getA5();

        b0 = operationController.getB0();
        b1 = operationController.getB1();
        b2 = operationController.getB2();
        b3 = operationController.getB3();
        b4 = operationController.getB4();
        b5 = operationController.getB5();

    }

    @Override
    public void run() {


        for (int i = 0; i < 5; i++){
            time[i] = SolveModel.STEP * i;

            manage[i] = 0.0;
            result[i] = 0.0;

            mainSeries.add(new Millisecond(new Date(curTime.getMillisecond() + i * ((long)(SolveModel.STEP * 1000)))), result[i]);

        }

        for (int i = 5; i < time.length; i++){
            time[i] = SolveModel.STEP * i;

            if (time[i] < SolveModel.MANAGE_TIME){
                manage[i] = SolveModel.MANAGE_VALUE;
            } else {
                manage[i] = 0.0;
            }

            result[i] = 1 / a5 * (
                    b0 * manage[i-5] +
                            b1 * manage[i-4] +
                            b2 * manage[i-3] +
                            b3 * manage[i-2] +
                            b4 * manage[i-1] +
                            b5 * manage[i]

                            - a0 * result[i-5]
                            - a1 * result[i-4]
                            - a2 * result[i-3]
                            - a3 * result[i-2]
                            - a4 * result[i-1]);

            mainSeries.add(new Millisecond(new Date(curTime.getMillisecond() + i * ((long)(SolveModel.STEP * 1000)))), result[i]);
        }
    }
}
