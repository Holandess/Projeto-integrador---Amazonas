import java.io.*;

import org.jfree.chart.ChartUtilities;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

public class PieChart {
   
   public static void main( String[ ] args ) throws Exception {
       
      DefaultPieDataset dataset = new DefaultPieDataset( );
      dataset.setValue("Dragao Branco de olhos azuis", new Double( 20 ) );
      dataset.setValue("SamSung Grand", new Double( 20 ) );
      dataset.setValue("MotoG", new Double( 40 ) );
      dataset.setValue("Nokia Lumia", new Double( 10 ) );

      JFreeChart chart = ChartFactory.createPieChart(
         "Produtos vendidos por Categoria",   // chart title
         dataset,          // data
         true,             // include legend
         true,
         false);
         
      int width = 640;   /* Width of the image */
      int height = 480;  /* Height of the image */ 
      File pieChart = new File( "src/View/imgs/PieChart.jpeg" ); 
      ChartUtilities.saveChartAsJPEG( pieChart , chart , width , height );
   }
}