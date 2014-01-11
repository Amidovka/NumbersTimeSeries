package Numbers;


import weka.classifiers.evaluation.NumericPrediction;
import weka.classifiers.timeseries.WekaForecaster;
import weka.core.Instances;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.List;

public class NumTimeSeries{

    public double getPrediction() throws Exception {

        // read data
        Instances num = new Instances(new BufferedReader(new FileReader("Numbers.arff")));
        // new forecaster
        WekaForecaster forecaster = new WekaForecaster();
        forecaster.setFieldsToForecast("numbers");
        forecaster.buildForecaster(num, System.out);
        forecaster.primeForecaster(num);
        List<List<NumericPrediction>> forecast = forecaster.forecast(1, System.out);
        // output
        List<NumericPrediction> predsAtStep = forecast.get(0);
        NumericPrediction predForTarget = predsAtStep.get(0);
        double p = predForTarget.predicted();
        return p;
    }
}
