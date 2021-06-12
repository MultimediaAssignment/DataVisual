import javafx.util.*;
import javafx.scene.*;
import javafx.scene.chart.*;
import javafx.scene.control.*;
import javafx.scene.input.*;
import javafx.scene.layout.*;
import javafx.geometry.*;

public class StatesLineCharts {
    private static String MonthValConverter(int getMonthVal){
        String getFinalizedMonth = "";
        switch(getMonthVal){
            case 3:
                getFinalizedMonth = "March";
                break;
            case 4:
                getFinalizedMonth = "April";
                break;
            case 5:
                getFinalizedMonth = "May";
                break;
            case 6:
                getFinalizedMonth = "June";
                break;
            case 7:
                getFinalizedMonth = "July";
                break;
            case 8:
                getFinalizedMonth = "August";
                break;
            case 9:
                getFinalizedMonth = "September";
                break;
            case 10:
                getFinalizedMonth = "October";
                break;
            case 11:
                getFinalizedMonth = "November";
                break;
            case 12:
                getFinalizedMonth = "December";
                break;
        }
        return getFinalizedMonth;
    }
    private static void lineCharting(LineChart<String,Number> lc, XYChart.Series series){
        lc.getData().add(series);
        lc.setLegendVisible(true); lc.setPrefHeight(1000);
        lc.setOnScroll(e -> scrolling(e, lc));
    }
    private static void scrolling(ScrollEvent se, LineChart<String,Number> lc){
        final double scaleDelta = 5.0; se.consume();
        if(se.getDeltaY() == 0)
            return;
        else if(se.getDeltaY() > 0)
            lc.setPrefHeight(lc.getPrefHeight() + scaleDelta);
        else if(se.getDeltaY() < 0)
            lc.setPrefHeight(lc.getPrefHeight() - scaleDelta);
    }
    //All

    public static Scene displayLineCharts(int getMonthVal, String getAreaName){
        String months = MonthValConverter(getMonthVal);
        System.out.println(months+"\t"+getAreaName);

        Label title = new Label("COVID-19 within "+months+" in "+getAreaName);
        // create the line chart
        CategoryAxis xAxis = new CategoryAxis(); NumberAxis yAxis = new NumberAxis();
        xAxis.setLabel("Date in 2020"); yAxis.setLabel("Accumulated Cases");
        LineChart<String,Number> lineChart = new LineChart<String,Number>(xAxis,yAxis);
        XYChart.Series seriesJH = new XYChart.Series(); lineCharting(lineChart, seriesJH);
        XYChart.Series seriesKD = new XYChart.Series(); lineCharting(lineChart, seriesKD);
        XYChart.Series seriesKE = new XYChart.Series(); lineCharting(lineChart, seriesKE);
        XYChart.Series seriesML = new XYChart.Series(); lineCharting(lineChart, seriesML);
        XYChart.Series seriesNS = new XYChart.Series(); lineCharting(lineChart, seriesNS);
        XYChart.Series seriesPH = new XYChart.Series(); lineCharting(lineChart, seriesPH);
        XYChart.Series seriesPG = new XYChart.Series(); lineCharting(lineChart, seriesPG);
        XYChart.Series seriesPK = new XYChart.Series(); lineCharting(lineChart, seriesPK);
        XYChart.Series seriesPR = new XYChart.Series(); lineCharting(lineChart, seriesPR);
        XYChart.Series seriesSB = new XYChart.Series(); lineCharting(lineChart, seriesSB);
        XYChart.Series seriesSR = new XYChart.Series(); lineCharting(lineChart, seriesSR);
        XYChart.Series seriesSE = new XYChart.Series(); lineCharting(lineChart, seriesSE);
        XYChart.Series seriesTR = new XYChart.Series(); lineCharting(lineChart, seriesTR);
        XYChart.Series seriesKL = new XYChart.Series(); lineCharting(lineChart, seriesKL);
        XYChart.Series seriesPJ = new XYChart.Series(); lineCharting(lineChart, seriesPJ);
        XYChart.Series seriesLB = new XYChart.Series(); lineCharting(lineChart, seriesLB);

        seriesJH.setName("Johor"); seriesKD.setName("Kedah"); seriesKE.setName("Kelantan");
        seriesML.setName("Malacca"); seriesNS.setName("Negeri Sembilan"); seriesPH.setName("Pahang");
        seriesPG.setName("Penang"); seriesPK.setName("Perak"); seriesPR.setName("Perlis");
        seriesSB.setName("Sabah"); seriesSR.setName("Sarawak"); seriesSE.setName("Selangor");
        seriesTR.setName("Terengganu"); seriesKL.setName("Kuala Lumpur");
        seriesPJ.setName("Putrajaya"); seriesLB.setName("Labuan");

        if(getAreaName == "All States"){
            CoviData.retrieveData(months, seriesJH, seriesKD, seriesKE, seriesML, seriesNS, seriesPH,
            seriesPG, seriesPK, seriesPR, seriesSB, seriesSR, seriesSE, seriesTR, seriesKL,
            seriesPJ, seriesLB);
        }
        else if(getAreaName == "Johor"){
            CoviData.retrievejohorData(months, seriesJH);
            seriesJH.getNode().setVisible(true); lineChart.setLegendVisible(false);
        }
        else if(getAreaName == "Kedah"){
            CoviData.retrievekedahData(months, seriesKD);
            seriesKD.getNode().setVisible(true); lineChart.setLegendVisible(false);
        }
        else if(getAreaName == "Kelantan"){
            CoviData.retrievekelantanData(months, seriesKE);
            seriesKE.getNode().setVisible(true); lineChart.setLegendVisible(false);
        }
        else if(getAreaName == "Malacca"){
            CoviData.retrievemalaccaData(months, seriesML);
            seriesML.getNode().setVisible(true); lineChart.setLegendVisible(false);
        }
        else if(getAreaName == "Negeri Sembilan"){
            CoviData.retrievensData(months, seriesNS);
            seriesNS.getNode().setVisible(true); lineChart.setLegendVisible(false);
        }
        else if(getAreaName == "Pahang"){
            CoviData.retrievepahangData(months, seriesPH);
            seriesPH.getNode().setVisible(true); lineChart.setLegendVisible(false);
        }
        else if(getAreaName == "Penang"){
            CoviData.retrievepenangData(months, seriesPG);
            seriesPG.getNode().setVisible(true); lineChart.setLegendVisible(false);
        }
        else if(getAreaName == "Perak"){
            CoviData.retrieveperakData(months, seriesPK);
            seriesPK.getNode().setVisible(true); lineChart.setLegendVisible(false);
        }
        else if(getAreaName == "Perlis"){
            CoviData.retrieveperlisData(months, seriesPR);
            seriesPR.getNode().setVisible(true); lineChart.setLegendVisible(false);
        }
        else if(getAreaName == "Sabah"){
            CoviData.retrievesabahData(months, seriesSB);
            seriesSB.getNode().setVisible(true); lineChart.setLegendVisible(false);
        }
        else if(getAreaName == "Sarawak"){
            CoviData.retrievesarawakData(months, seriesSR);
            seriesSR.getNode().setVisible(true); lineChart.setLegendVisible(false);
        }
        else if(getAreaName == "Selangor"){
            CoviData.retrieveselangorData(months, seriesSE);
            seriesSE.getNode().setVisible(true); lineChart.setLegendVisible(false);
        }
        else if(getAreaName == "Terengganu"){
            CoviData.retrieveterengganuData(months, seriesTR);
            seriesTR.getNode().setVisible(true); lineChart.setLegendVisible(false);
        }
        else if(getAreaName == "Kuala Lumpur"){
            CoviData.retrieveklData(months, seriesKL);
            seriesKL.getNode().setVisible(true); lineChart.setLegendVisible(false);
        }
        else if(getAreaName == "Putrajaya"){
            CoviData.retrieveputrajayaData(months, seriesPJ);
            seriesPJ.getNode().setVisible(true); lineChart.setLegendVisible(false);
        }
        else if(getAreaName == "Labuan"){
            CoviData.retrievelabuanData(months, seriesLB);
            seriesLB.getNode().setVisible(true); lineChart.setLegendVisible(false);
        }
        // tooltips when hover on a symbol
        for(XYChart.Series<String, Number> s : lineChart.getData()){
            for(XYChart.Data<String, Number> d : s.getData()){
                Tooltip tooltip = new Tooltip(
                    d.getXValue().toString()+"\n"+s.getName()+"\n"+"Cases: "+d.getYValue());
                tooltip.setShowDelay(Duration.seconds(0.1));
                Tooltip.install(d.getNode(), tooltip);

                d.getNode().setOnMouseEntered(e -> d.getNode().getStyleClass().add("onHover"));
                d.getNode().setOnMouseExited(e -> d.getNode().getStyleClass().remove("onHover"));
            }
        }

        Label lbl_back = new Label("Click to go back to re-select the chart types you want");
        Button backBtn = new Button("Back to Charts");
        backBtn.setOnAction(e -> App.window.setScene(Charts.displayChartTypeMenu(getMonthVal, getAreaName)));

        VBox layout = new VBox(28); layout.setAlignment(Pos.CENTER);
        layout.getChildren().addAll(title, lineChart, lbl_back, backBtn);

        Scene renderLineChart = new Scene(layout, 1440, 800);
        renderLineChart.getStylesheets().add("chartStyle.css");
        return renderLineChart;
    }
}
