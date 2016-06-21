package border;

import controller.BackGroundSolver;
import controller.MainController;
import model.SolveModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.plot.XYPlot;
import org.jfree.data.time.Millisecond;
import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.TimeSeriesCollection;
import org.jfree.data.xy.XYDataset;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by vitaly on 16.06.16.
 */
public class MainBorder {

    private JPanel mainPanel;
    private JTextField manageTimeTF;
    private JTextField manageValueTF;
    private JTextField stepTF;
    private JTextField modelingTimeTF;
    private JButton applyModel;
    private JButton solveBtn;
    private JButton saveBtn;
    private JPanel chartPanel;
    private JButton clearBtn;

    public TimeSeries mainSeries;
    private JFreeChart mainChart;

    private MainController mainController;

    public TimeSeriesCollection dataCollection;

    public MainBorder() {
        mainController = new MainController();

        this.mainSeries = new TimeSeries("Воздействие", Millisecond.class);
        dataCollection = new TimeSeriesCollection(this.mainSeries);

        mainChart = createChart(dataCollection, "Высота, м");

        ChartPanel mainChartPanel = new ChartPanel(mainChart);
        chartPanel.removeAll();
        chartPanel.add(mainChartPanel, BorderLayout.CENTER);
        chartPanel.validate();

        applyModel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                applyParameters();
            }
        });
        solveBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int countTimes = (int) (SolveModel.MODELING_TIME / SolveModel.STEP);
                double result[] = new double[countTimes];
                double time[] = new double[countTimes];
                double manage[] = new double[countTimes];
                Millisecond curTime = new Millisecond();

                BackGroundSolver solver = new BackGroundSolver(curTime, result, time, manage, mainSeries);
                new Thread(solver).start();
            }
        });
        saveBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainController.saveMetaData();
            }
        });
        clearBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainChart.clearSubtitles();
                mainSeries.clear();
            }
        });
    }

    public static void main(String[] args){
        JFrame mainFrame = new JFrame("Модель продольного движения ЛА");
        mainFrame.setContentPane(new MainBorder().mainPanel);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.pack();
        mainFrame.setVisible(true);
    }

    private void applyParameters(){
        SolveModel.STEP = new Double(stepTF.getText());
        SolveModel.MANAGE_TIME = new Double(manageTimeTF.getText());
        SolveModel.MANAGE_VALUE = new Double(manageValueTF.getText());
        SolveModel.MODELING_TIME = new Double(modelingTimeTF.getText());
    }

    private JFreeChart createChart(final XYDataset dataset, String title) {
        final JFreeChart result = ChartFactory.createTimeSeriesChart(
                title,
                "",
                "",
                dataset,
                false,
                true,
                false
        );
        final XYPlot plot = result.getXYPlot();
        ValueAxis axis = plot.getDomainAxis();
        axis.setAutoRange(true);
        axis = plot.getRangeAxis();
        return result;
    }

}
