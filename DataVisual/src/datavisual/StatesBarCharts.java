import javafx.util.*;
import javafx.scene.*;
import javafx.scene.chart.*;
import javafx.scene.control.*;
import javafx.scene.input.*;
import javafx.scene.layout.*;
import javafx.geometry.*;
public class StatesBarCharts {
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
    private static void barCharting(BarChart<String,Number> bc, XYChart.Series series){
        bc.setBarGap(0.5);
        bc.setCategoryGap(1);
        bc.getData().add(series);
        bc.setLegendVisible(true); bc.setPrefHeight(1000);
        bc.setOnScroll(e -> scrolling(e, bc));
    }
    private static void scrolling(ScrollEvent se, BarChart<String,Number> bc){
        final double scaleDelta = 5.0; se.consume();
        if(se.getDeltaY() == 0)
            return;
        else if(se.getDeltaY() > 0)
            bc.setPrefHeight(bc.getPrefHeight() + scaleDelta);
        else if(se.getDeltaY() < 0)
            bc.setPrefHeight(bc.getPrefHeight() - scaleDelta);
    }
    //All
    public static Scene displayBarCharts(int getMonthVal, String getAreaName){
        String months = MonthValConverter(getMonthVal);
        System.out.println(months+"\t"+getAreaName);

        Label title = new Label("COVID-19 within "+months+" in "+getAreaName);
        // create the line chart
        CategoryAxis xAxis = new CategoryAxis(); NumberAxis yAxis = new NumberAxis();
        xAxis.setLabel("Date in 2020"); yAxis.setLabel("Accumulated Cases");
        BarChart<String,Number> barChart = new BarChart<String,Number>(xAxis,yAxis);

        if(getAreaName == "All States"){
            XYChart.Series seriesJH = new XYChart.Series(); barCharting(barChart, seriesJH);
            XYChart.Series seriesKD = new XYChart.Series(); barCharting(barChart, seriesKD);
            XYChart.Series seriesKE = new XYChart.Series(); barCharting(barChart, seriesKE);
            XYChart.Series seriesML = new XYChart.Series(); barCharting(barChart, seriesML);
            XYChart.Series seriesNS = new XYChart.Series(); barCharting(barChart, seriesNS);
            XYChart.Series seriesPH = new XYChart.Series(); barCharting(barChart, seriesPH);
            XYChart.Series seriesPG = new XYChart.Series(); barCharting(barChart, seriesPG);
            XYChart.Series seriesPK = new XYChart.Series(); barCharting(barChart, seriesPK);
            XYChart.Series seriesPR = new XYChart.Series(); barCharting(barChart, seriesPR);
            XYChart.Series seriesSB = new XYChart.Series(); barCharting(barChart, seriesSB);
            XYChart.Series seriesSR = new XYChart.Series(); barCharting(barChart, seriesSR);
            XYChart.Series seriesSE = new XYChart.Series(); barCharting(barChart, seriesSE);
            XYChart.Series seriesTR = new XYChart.Series(); barCharting(barChart, seriesTR);
            XYChart.Series seriesKL = new XYChart.Series(); barCharting(barChart, seriesKL);
            XYChart.Series seriesPJ = new XYChart.Series(); barCharting(barChart, seriesPJ);
            XYChart.Series seriesLB = new XYChart.Series(); barCharting(barChart, seriesLB);
            seriesJH.setName("Johor"); seriesKD.setName("Kedah"); seriesKE.setName("Kelantan");
            seriesML.setName("Malacca"); seriesNS.setName("Negeri Sembilan"); seriesPH.setName("Pahang");
            seriesPG.setName("Penang"); seriesPK.setName("Perak"); seriesPR.setName("Perlis");
            seriesSB.setName("Sabah"); seriesSR.setName("Sarawak"); seriesSE.setName("Selangor");
            seriesTR.setName("Terengganu"); seriesKL.setName("Kuala Lumpur");
            seriesPJ.setName("Putrajaya"); seriesLB.setName("Labuan");

            CoviData.retrieveData(months, seriesJH, seriesKD, seriesKE, seriesML, seriesNS, seriesPH,
            seriesPG, seriesPK, seriesPR, seriesSB, seriesSR, seriesSE, seriesTR, seriesKL,
            seriesPJ, seriesLB);
        }
        else if(getAreaName == "Johor"){
            XYChart.Series seriesJH = new XYChart.Series(); barCharting(barChart, seriesJH);
            CoviData.retrievejohorData(months, seriesJH); barChart.setLegendVisible(false);
        }
        else if(getAreaName == "Kedah"){
            XYChart.Series seriesKD = new XYChart.Series(); barCharting(barChart, seriesKD);
            CoviData.retrievekedahData(months, seriesKD); barChart.setLegendVisible(false);
            barChart.lookupAll(".chart-bar").forEach(n -> n.setStyle("-fx-bar-fill: orange"));
        }
        else if(getAreaName == "Kelantan"){
            XYChart.Series seriesKE = new XYChart.Series(); barCharting(barChart, seriesKE);
            CoviData.retrievekelantanData(months, seriesKE); barChart.setLegendVisible(false);
            barChart.lookupAll(".chart-bar").forEach(n -> n.setStyle("-fx-bar-fill: green"));
        }
        else if(getAreaName == "Malacca"){
            XYChart.Series seriesML = new XYChart.Series(); barCharting(barChart, seriesML);
            CoviData.retrievemalaccaData(months, seriesML); barChart.setLegendVisible(false);
            barChart.lookupAll(".chart-bar").forEach(n -> n.setStyle("-fx-bar-fill: darkcyan"));
        }
        else if(getAreaName == "Negeri Sembilan"){
            XYChart.Series seriesNS = new XYChart.Series(); barCharting(barChart, seriesNS);
            CoviData.retrievensData(months, seriesNS); barChart.setLegendVisible(false);
            barChart.lookupAll(".chart-bar").forEach(n -> n.setStyle("-fx-bar-fill: darkblue"));
        }
        else if(getAreaName == "Pahang"){
            XYChart.Series seriesPH = new XYChart.Series(); barCharting(barChart, seriesPH);
            CoviData.retrievepahangData(months, seriesPH); barChart.setLegendVisible(false);
            barChart.lookupAll(".chart-bar").forEach(n -> n.setStyle("-fx-bar-fill: purple"));
        }
        else if(getAreaName == "Penang"){
            XYChart.Series seriesPG = new XYChart.Series(); barCharting(barChart, seriesPG);
            CoviData.retrievepenangData(months, seriesPG); barChart.setLegendVisible(false);
            barChart.lookupAll(".chart-bar").forEach(n -> n.setStyle("-fx-bar-fill: indianred"));
        }
        else if(getAreaName == "Perak"){
            XYChart.Series seriesPK = new XYChart.Series(); barCharting(barChart, seriesPK);
            CoviData.retrieveperakData(months, seriesPK); barChart.setLegendVisible(false);
            barChart.lookupAll(".chart-bar").forEach(n -> n.setStyle("-fx-bar-fill: gray"));
        }
        else if(getAreaName == "Perlis"){
            XYChart.Series seriesPR = new XYChart.Series(); barCharting(barChart, seriesPR);
            CoviData.retrieveperlisData(months, seriesPR); barChart.setLegendVisible(false);
        }
        else if(getAreaName == "Sabah"){
            XYChart.Series seriesSB = new XYChart.Series(); barCharting(barChart, seriesSB);
            CoviData.retrievesabahData(months, seriesSB); barChart.setLegendVisible(false);
            barChart.lookupAll(".chart-bar").forEach(n -> n.setStyle("-fx-bar-fill: orange"));
        }
        else if(getAreaName == "Sarawak"){
            XYChart.Series seriesSR = new XYChart.Series(); barCharting(barChart, seriesSR);
            CoviData.retrievesarawakData(months, seriesSR); barChart.setLegendVisible(false);
            barChart.lookupAll(".chart-bar").forEach(n -> n.setStyle("-fx-bar-fill: green"));
        }
        else if(getAreaName == "Selangor"){
            XYChart.Series seriesSE = new XYChart.Series(); barCharting(barChart, seriesSE);
            CoviData.retrieveselangorData(months, seriesSE); barChart.setLegendVisible(false);
            barChart.lookupAll(".chart-bar").forEach(n -> n.setStyle("-fx-bar-fill: darkcyan"));
        }
        else if(getAreaName == "Terengganu"){
            XYChart.Series seriesTR = new XYChart.Series(); barCharting(barChart, seriesTR);
            CoviData.retrieveterengganuData(months, seriesTR); barChart.setLegendVisible(false);
            barChart.lookupAll(".chart-bar").forEach(n -> n.setStyle("-fx-bar-fill: darkblue"));
        }
        else if(getAreaName == "Kuala Lumpur"){
            XYChart.Series seriesKL = new XYChart.Series(); barCharting(barChart, seriesKL);
            CoviData.retrieveklData(months, seriesKL); barChart.setLegendVisible(false);
            barChart.lookupAll(".chart-bar").forEach(n -> n.setStyle("-fx-bar-fill: purple"));
        }
        else if(getAreaName == "Putrajaya"){
            XYChart.Series seriesPJ = new XYChart.Series(); barCharting(barChart, seriesPJ);
            CoviData.retrieveputrajayaData(months, seriesPJ); barChart.setLegendVisible(false);
            barChart.lookupAll(".chart-bar").forEach(n -> n.setStyle("-fx-bar-fill: indianred"));
        }
        else if(getAreaName == "Labuan"){
            XYChart.Series seriesLB = new XYChart.Series(); barCharting(barChart, seriesLB);
            CoviData.retrievelabuanData(months, seriesLB); barChart.setLegendVisible(false);
            barChart.lookupAll(".chart-bar").forEach(n -> n.setStyle("-fx-bar-fill: gray"));
        }
        // tooltips when hover on a symbol
        for(XYChart.Series<String, Number> s : barChart.getData()){
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
        layout.getChildren().addAll(title, barChart, lbl_back, backBtn);

        Scene renderLineChart = new Scene(layout, 1440, 800);
        renderLineChart.getStylesheets().add("datavisual/chartStyle.css");
        return renderLineChart;
    }
}