package storage;

import model.SolveModel;

/**
 * Created by vitaly on 16.06.16.
 */
public class MainStorage {


    /*
    -8.311319173294317e36	+1.0643373712066897e38	-2.4250027624457042e44 	+7.416219019902903e44	-1.2572905182492805e44	# a0

+4.1556595866471583e37	-3.193012113620069e38	+2.4250027624457042e44	+7.416219019902903e44	-3.7718715547478416e44	# a1

-8.311319173294317e37	+2.1286747424133793e38	+4.850005524891409e44	-1.4832438039805805e45	-2.514581036498561e44	# a2

+8.311319173294317e37    +2.1286747424133793e38	-4.850005524891409e44	-1.4832438039805805e45	+2.514581036498561e44	# a3

-4.1556595866471583e37	-3.193012113620069e38	-2.4250027624457042e44	+7.416219019902903e44	+3.7718715547478416e44	# a4

8.311319173294317e36	+1.0643373712066897e38	+2.4250027624457042e44	+7.416219019902903e44	+1.2572905182492805e44	# a5

-2.0143405496386915e32	+7.793535202057248e32	+5.822536226071442e38	-1.7677251284560244e45 	# b0

2.0143405496386933e32	+7.793535202057248e32	+1.7467608678214325e39	-8.838625642280122e45	# b1

4.028681099277385e32	-1.5587070404114494e33	+1.1645072452142884e39	-1.7677251284560242e46	# b2

-4.028681099277385e32	-1.5587070404114497e33	-1.1645072452142882e39	-1.7677251284560242e46	# b3

-2.0143405496386933e32	+7.793535202057248e32	-1.7467608678214325e39	-8.838625642280122e45	# b4

2.0143405496386915e32	+7.793535202057248e32	-5.822536226071442e38	-1.7677251284560244e45	# b5

     */


    public double geta0() {
        return -8.311319173294317e36
                + 1.0643373712066897e38 * SolveModel.STEP
                - 2.4250027624457042e44 * SolveModel.STEP * SolveModel.STEP
                + 7.416219019902903e44 * SolveModel.STEP * SolveModel.STEP * SolveModel.STEP
                - 1.2572905182492805e44 * SolveModel.STEP * SolveModel.STEP * SolveModel.STEP * SolveModel.STEP;
    }

    public double geta1(){
        return +4.1556595866471583e37
                - 3.193012113620069e38 * SolveModel.STEP
                + 2.4250027624457042e44 * SolveModel.STEP * SolveModel.STEP
                + 7.416219019902903e44 * SolveModel.STEP * SolveModel.STEP * SolveModel.STEP
                - 3.7718715547478416e44 * SolveModel.STEP * SolveModel.STEP * SolveModel.STEP * SolveModel.STEP;
    }


    public double geta2() {
        return -8.311319173294317e37
                + 2.1286747424133793e38 * SolveModel.STEP
                + 4.850005524891409e44 * SolveModel.STEP * SolveModel.STEP
                - 1.4832438039805805e45 * SolveModel.STEP * SolveModel.STEP * SolveModel.STEP
                - 2.514581036498561e44 * SolveModel.STEP * SolveModel.STEP * SolveModel.STEP * SolveModel.STEP;
    }


    public double geta3() {
        return +8.311319173294317e37
                + 2.1286747424133793e38 * SolveModel.STEP
                - 4.850005524891409e44 * SolveModel.STEP * SolveModel.STEP
                - 1.4832438039805805e45 * SolveModel.STEP * SolveModel.STEP * SolveModel.STEP
                + 2.514581036498561e44 * SolveModel.STEP * SolveModel.STEP * SolveModel.STEP * SolveModel.STEP;
    }

    public double geta4() {
        return -4.1556595866471583e37
                -3.193012113620069e38 * SolveModel.STEP
                -2.4250027624457042e44 * SolveModel.STEP * SolveModel.STEP
                +7.416219019902903e44 * SolveModel.STEP * SolveModel.STEP * SolveModel.STEP
                +3.7718715547478416e44 * SolveModel.STEP * SolveModel.STEP * SolveModel.STEP * SolveModel.STEP;
    }


    public double geta5() {
        return 8.311319173294317e36
            + 1.0643373712066897e38 * SolveModel.STEP
            + 2.4250027624457042e44 * SolveModel.STEP * SolveModel.STEP
            + 7.416219019902903e44 * SolveModel.STEP * SolveModel.STEP * SolveModel.STEP
            + 1.2572905182492805e44 * SolveModel.STEP * SolveModel.STEP * SolveModel.STEP * SolveModel.STEP;
    }




    public double getb0() {
        return -2.0143405496386915e32 * SolveModel.STEP * SolveModel.STEP
                + 7.793535202057248e32 * SolveModel.STEP * SolveModel.STEP * SolveModel.STEP
                + 5.822536226071442e38 * SolveModel.STEP * SolveModel.STEP * SolveModel.STEP * SolveModel.STEP
                - 1.7677251284560244e45 * SolveModel.STEP * SolveModel.STEP * SolveModel.STEP * SolveModel.STEP * SolveModel.STEP;
    }

    public double getb1() {
        return 2.0143405496386933e32 * SolveModel.STEP * SolveModel.STEP
                +7.793535202057248e32 * SolveModel.STEP * SolveModel.STEP * SolveModel.STEP
                +1.7467608678214325e39 * SolveModel.STEP * SolveModel.STEP * SolveModel.STEP * SolveModel.STEP
                -8.838625642280122e45 * SolveModel.STEP * SolveModel.STEP * SolveModel.STEP * SolveModel.STEP * SolveModel.STEP;
    }


    public double getb2() {
        return 4.028681099277385e32 * SolveModel.STEP * SolveModel.STEP
            - 1.5587070404114494e33 * SolveModel.STEP * SolveModel.STEP * SolveModel.STEP
            + 1.1645072452142884e39 * SolveModel.STEP * SolveModel.STEP * SolveModel.STEP * SolveModel.STEP
            - 1.7677251284560242e46 * SolveModel.STEP * SolveModel.STEP * SolveModel.STEP * SolveModel.STEP * SolveModel.STEP;
    }

    public double getb3() {
        return -4.028681099277385e32 * SolveModel.STEP * SolveModel.STEP
                - 1.5587070404114497e33 * SolveModel.STEP * SolveModel.STEP * SolveModel.STEP
                - 1.1645072452142882e39 * SolveModel.STEP * SolveModel.STEP * SolveModel.STEP * SolveModel.STEP
                - 1.7677251284560242e46 * SolveModel.STEP * SolveModel.STEP * SolveModel.STEP * SolveModel.STEP * SolveModel.STEP;
    }

    public double getb4() {
        return -2.0143405496386933e32 * SolveModel.STEP * SolveModel.STEP
                + 7.793535202057248e32 * SolveModel.STEP * SolveModel.STEP * SolveModel.STEP
                - 1.7467608678214325e39 * SolveModel.STEP * SolveModel.STEP * SolveModel.STEP * SolveModel.STEP
                - 8.838625642280122e45 * SolveModel.STEP * SolveModel.STEP * SolveModel.STEP * SolveModel.STEP * SolveModel.STEP;
    }

    public double getb5() {
        return 2.0143405496386915e32 * SolveModel.STEP * SolveModel.STEP
                + 7.793535202057248e32 * SolveModel.STEP * SolveModel.STEP * SolveModel.STEP
                - 5.822536226071442e38 * SolveModel.STEP * SolveModel.STEP * SolveModel.STEP * SolveModel.STEP
                - 1.7677251284560244e45 * SolveModel.STEP * SolveModel.STEP * SolveModel.STEP * SolveModel.STEP * SolveModel.STEP;
    }

}
