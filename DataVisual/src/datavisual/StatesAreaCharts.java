import javafx.util.*;
import javafx.scene.*;
import javafx.scene.chart.*;
import javafx.scene.control.*;
import javafx.scene.input.ScrollEvent;
import javafx.scene.layout.*;
import javafx.geometry.*;

public class StatesAreaCharts {
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
    private static void AreaCharting(AreaChart<String,Number> lc, XYChart.Series series){
        lc.getData().add(series);
        lc.setLegendVisible(true); lc.setPrefHeight(1000);
        lc.setOnScroll(e -> scrolling(e, lc));
    }
    private static void scrolling(ScrollEvent se, AreaChart<String, Number> lc){
        final double scaleDelta = 5.0; se.consume();
        if(se.getDeltaY() == 0)
            return;
        else if(se.getDeltaY() > 0)
            lc.setPrefHeight(lc.getPrefHeight() + scaleDelta);
        else if(se.getDeltaY() < 0)
            lc.setPrefHeight(lc.getPrefHeight() - scaleDelta);
    }
    //All
    public static Scene displayAreaCharts(int getMonthVal, String getAreaName){
        String months = MonthValConverter(getMonthVal);
        System.out.println(months+"\t"+getAreaName);

        Label title = new Label("COVID-19 within "+months+" in "+getAreaName);
        // create the line chart
        CategoryAxis xAxis = new CategoryAxis(); NumberAxis yAxis = new NumberAxis();
        xAxis.setLabel("Date in 2020"); yAxis.setLabel("Accumulated Cases");
        AreaChart<String,Number> areaChart = new AreaChart<String,Number>(xAxis,yAxis);
        XYChart.Series seriesJH = new XYChart.Series(); AreaCharting(areaChart, seriesJH);
        XYChart.Series seriesKD = new XYChart.Series(); AreaCharting(areaChart, seriesKD);
        XYChart.Series seriesKE = new XYChart.Series(); AreaCharting(areaChart, seriesKE);
        XYChart.Series seriesML = new XYChart.Series(); AreaCharting(areaChart, seriesML);
        XYChart.Series seriesNS = new XYChart.Series(); AreaCharting(areaChart, seriesNS);
        XYChart.Series seriesPH = new XYChart.Series(); AreaCharting(areaChart, seriesPH);
        XYChart.Series seriesPG = new XYChart.Series(); AreaCharting(areaChart, seriesPG);
        XYChart.Series seriesPK = new XYChart.Series(); AreaCharting(areaChart, seriesPK);
        XYChart.Series seriesPR = new XYChart.Series(); AreaCharting(areaChart, seriesPR);
        XYChart.Series seriesSB = new XYChart.Series(); AreaCharting(areaChart, seriesSB);
        XYChart.Series seriesSR = new XYChart.Series(); AreaCharting(areaChart, seriesSR);
        XYChart.Series seriesSE = new XYChart.Series(); AreaCharting(areaChart, seriesSE);
        XYChart.Series seriesTR = new XYChart.Series(); AreaCharting(areaChart, seriesTR);
        XYChart.Series seriesKL = new XYChart.Series(); AreaCharting(areaChart, seriesKL);
        XYChart.Series seriesPJ = new XYChart.Series(); AreaCharting(areaChart, seriesPJ);
        XYChart.Series seriesLB = new XYChart.Series(); AreaCharting(areaChart, seriesLB);

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
            seriesJH.getNode().setVisible(true); areaChart.setLegendVisible(false);
        }
        else if(getAreaName == "Kedah"){
            CoviData.retrievekedahData(months, seriesKD);
            seriesKD.getNode().setVisible(true); areaChart.setLegendVisible(false);
        }
        else if(getAreaName == "Kelantan"){
            CoviData.retrievekelantanData(months, seriesKE);
            seriesKE.getNode().setVisible(true); areaChart.setLegendVisible(false);
        }
        else if(getAreaName == "Malacca"){
            CoviData.retrievemalaccaData(months, seriesML);
            seriesML.getNode().setVisible(true); areaChart.setLegendVisible(false);
        }
        else if(getAreaName == "Negeri Sembilan"){
            CoviData.retrievensData(months, seriesNS);
            seriesNS.getNode().setVisible(true); areaChart.setLegendVisible(false);
        }
        else if(getAreaName == "Pahang"){
            CoviData.retrievepahangData(months, seriesPH);
            seriesPH.getNode().setVisible(true); areaChart.setLegendVisible(false);
        }
        else if(getAreaName == "Penang"){
            CoviData.retrievepenangData(months, seriesPG);
            seriesPG.getNode().setVisible(true); areaChart.setLegendVisible(false);
        }
        else if(getAreaName == "Perak"){
            CoviData.retrieveperakData(months, seriesPK);
            seriesPK.getNode().setVisible(true); areaChart.setLegendVisible(false);
        }
        else if(getAreaName == "Perlis"){
            CoviData.retrieveperlisData(months, seriesPR);
            seriesPR.getNode().setVisible(true); areaChart.setLegendVisible(false);
        }
        else if(getAreaName == "Sabah"){
            CoviData.retrievesabahData(months, seriesSB);
            seriesSB.getNode().setVisible(true); areaChart.setLegendVisible(false);
        }
        else if(getAreaName == "Sarawak"){
            CoviData.retrievesarawakData(months, seriesSR);
            seriesSR.getNode().setVisible(true); areaChart.setLegendVisible(false);
        }
        else if(getAreaName == "Selangor"){
            CoviData.retrieveselangorData(months, seriesSE);
            seriesSE.getNode().setVisible(true); areaChart.setLegendVisible(false);
        }
        else if(getAreaName == "Terengganu"){
            CoviData.retrieveterengganuData(months, seriesTR);
            seriesTR.getNode().setVisible(true); areaChart.setLegendVisible(false);
        }
        else if(getAreaName == "Kuala Lumpur"){
            CoviData.retrieveklData(months, seriesKL);
            seriesKL.getNode().setVisible(true); areaChart.setLegendVisible(false);
        }
        else if(getAreaName == "Putrajaya"){
            CoviData.retrieveputrajayaData(months, seriesPJ);
            seriesPJ.getNode().setVisible(true); areaChart.setLegendVisible(false);
        }
        else if(getAreaName == "Labuan"){
            CoviData.retrievelabuanData(months, seriesLB);
            seriesLB.getNode().setVisible(true); areaChart.setLegendVisible(false);
        }
        // tooltips when hover on a symbol
        for(XYChart.Series<String, Number> s : areaChart.getData()){
            for(XYChart.Data<String, Number> d : s.getData()){
                Tooltip tooltip = new Tooltip(
                    d.getXValue().toString()+"\n"+s.getName()+"\n"+"Cases: "+d.getYValue());
                Tooltip.install(d.getNode(), tooltip);

                d.getNode().setOnMouseEntered(e -> d.getNode().getStyleClass().add("onHover"));
                d.getNode().setOnMouseExited(e -> d.getNode().getStyleClass().remove("onHover"));
            }
        }

        Label lbl_back = new Label("Click to go back to re-select the chart types you want");
        Button backBtn = new Button("Back to Charts");
        backBtn.setOnAction(e -> App.window.setScene(Charts.displayChartTypeMenu(getMonthVal, getAreaName)));

        VBox layout = new VBox(28); layout.setAlignment(Pos.CENTER);
        layout.getChildren().addAll(title, areaChart, lbl_back, backBtn);

        Scene renderAreaChart = new Scene(layout, 1440, 800);
        renderAreaChart.getStylesheets().add("datavisual/chartStyle.css");
        return renderAreaChart;
    }
}