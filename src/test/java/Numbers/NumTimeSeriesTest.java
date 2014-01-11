package Numbers;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class NumTimeSeriesTest {

    @Test
    public void fiveNumbTest() throws Exception {

        NumTimeSeries numb = new NumTimeSeries();

        assertTrue((numb.getPrediction() + " " + "4.9999984722552115"), numb.getPrediction()==4.9999984722552115);
    }
}
