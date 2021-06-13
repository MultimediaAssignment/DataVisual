import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.geometry.*;

public class Charts {
    public static Scene displayAreaMenu(int DetermineMonthValue){
        int month_val = DetermineMonthValue; System.out.println(month_val);
        // States buttons
        Label lbl_S = new Label("Please pick an option in States");
        Button johorBtn = new Button("Johor");
        johorBtn.setOnAction(e -> App.window.setScene(displayChartTypeMenu(month_val, "Johor")));
        Button kedahBtn = new Button("Kedah");
        kedahBtn.setOnAction(e -> App.window.setScene(displayChartTypeMenu(month_val, "Kedah")));
        Button kelantanBtn = new Button("Kelantan");
        kelantanBtn.setOnAction(e -> App.window.setScene(displayChartTypeMenu(month_val, "Kelantan")));
        Button malaccaBtn = new Button("Malacca");
        malaccaBtn.setOnAction(e -> App.window.setScene(displayChartTypeMenu(month_val, "Malacca")));
        Button sembilanBtn = new Button("Negeri Sembilan");
        sembilanBtn.setOnAction(e -> App.window.setScene(displayChartTypeMenu(month_val, "Negeri Sembilan")));
        Button pahangBtn = new Button("Pahang");
        pahangBtn.setOnAction(e -> App.window.setScene(displayChartTypeMenu(month_val, "Pahang")));
        Button penangBtn = new Button("Penang");
        penangBtn.setOnAction(e -> App.window.setScene(displayChartTypeMenu(month_val, "Penang")));
        Button perakBtn = new Button("Perak");
        perakBtn.setOnAction(e -> App.window.setScene(displayChartTypeMenu(month_val, "Perak")));
        Button perlisBtn = new Button("Perlis");
        perlisBtn.setOnAction(e -> App.window.setScene(displayChartTypeMenu(month_val, "Perlis")));
        Button sabahBtn = new Button("Sabah");
        sabahBtn.setOnAction(e -> App.window.setScene(displayChartTypeMenu(month_val, "Sabah")));
        Button sarawakBtn = new Button("Sarawak");
        sarawakBtn.setOnAction(e -> App.window.setScene(displayChartTypeMenu(month_val, "Sarawak")));
        Button selangorBtn = new Button("Selangor");
        selangorBtn.setOnAction(e -> App.window.setScene(displayChartTypeMenu(month_val, "Selangor")));
        Button terengganuBtn = new Button("Terengganu");
        terengganuBtn.setOnAction(e -> App.window.setScene(displayChartTypeMenu(month_val, "Terengganu")));
        // Federal Territories buttons
        Label lbl_FT = new Label("Please pick an option in Federal Territories");
        Button KLBtn = new Button("Kuala Lumpur");
        KLBtn.setOnAction(e -> App.window.setScene(displayChartTypeMenu(month_val, "Kuala Lumpur")));
        Button PTBtn = new Button("Putrajaya");
        PTBtn.setOnAction(e -> App.window.setScene(displayChartTypeMenu(month_val, "Putrajaya")));
        Button LabuanBtn = new Button("Labuan");
        LabuanBtn.setOnAction(e -> App.window.setScene(displayChartTypeMenu(month_val, "Labuan")));
        // All state button
        Label lbl_all = new Label("Comparison between all the states");
        Button AllBtn = new Button("All States");
        AllBtn.setOnAction(e -> App.window.setScene(displayChartTypeMenu(month_val, "All States")));
        
        Label lbl_back = new Label("Click to go back to re-select the specific date you want");
        Button backBtn = new Button("Back to Date");
        backBtn.setOnAction(e -> App.window.setScene(App.displayDateMenu()));

        VBox VlayoutArea = new VBox(28); HBox HlayoutArea = new HBox(28);
        HBox HlayoutArea0 = new HBox(28); HlayoutArea0.setAlignment(Pos.CENTER);
        HBox HlayoutArea1 = new HBox(28); HlayoutArea1.setAlignment(Pos.CENTER);
        HBox HlayoutArea2 = new HBox(28); HlayoutArea2.setAlignment(Pos.CENTER);
        HBox HlayoutArea3 = new HBox(28); HlayoutArea3.setAlignment(Pos.CENTER);
        HBox HlayoutArea4 = new HBox(28); HlayoutArea4.setAlignment(Pos.CENTER);
        HBox HlayoutArea5 = new HBox(28); HlayoutArea5.setAlignment(Pos.CENTER);
        HBox HlayoutArea6 = new HBox(28); HlayoutArea6.setAlignment(Pos.CENTER);
        
        HlayoutArea.setAlignment(Pos.CENTER); HlayoutArea.getChildren().add(lbl_S);
        HlayoutArea0.getChildren().addAll(johorBtn, kedahBtn, kelantanBtn, malaccaBtn, sembilanBtn);
        HlayoutArea1.getChildren().addAll(pahangBtn, penangBtn, perakBtn, perlisBtn, sabahBtn);
        HlayoutArea2.getChildren().addAll(sarawakBtn, selangorBtn, terengganuBtn);
        HlayoutArea3.getChildren().add(lbl_FT);
        HlayoutArea4.getChildren().addAll(KLBtn, PTBtn, LabuanBtn);

        VlayoutArea.setAlignment(Pos.CENTER);
        VlayoutArea.getChildren().addAll(HlayoutArea, HlayoutArea0, HlayoutArea1, HlayoutArea2, 
        HlayoutArea3, HlayoutArea4, lbl_all, AllBtn, lbl_back, backBtn);

        Scene renderAreaScene = new Scene(VlayoutArea, 1440, 800);
        renderAreaScene.getStylesheets().add("datavisual/chartStyle.css");
        return renderAreaScene;
    }
    //Specific state/federal territory or all of them
    public static Scene displayChartTypeMenu(int getMonthVal, String getAreaName){        
        System.out.println(getMonthVal+"\t"+getAreaName);
        // Chart types
        Label lbl_charts = new Label("Please pick an option in the following charts");
        Button lineBtn = new Button("Line Chart");
        lineBtn.setOnAction(e -> App.window.setScene(
            StatesLineCharts.displayLineCharts(getMonthVal, getAreaName)));
        Button barBtn = new Button("Bar Chart");
        barBtn.setOnAction(e -> App.window.setScene(
            StatesBarCharts.displayBarCharts(getMonthVal, getAreaName)));
        Button areaBtn = new Button("Area Chart");
        areaBtn.setOnAction(e -> App.window.setScene(
            StatesAreaCharts.displayAreaCharts(getMonthVal, getAreaName)));

        Label lbl_back = new Label("Click to go back to re-select the specific area you want");
        Button backBtn = new Button("Back to Area");
        backBtn.setOnAction(e -> App.window.setScene(displayAreaMenu(getMonthVal)));

        VBox VlayoutCharts = new VBox(28);
        VlayoutCharts.setAlignment(Pos.CENTER);
        VlayoutCharts.getChildren().addAll(lbl_charts, lineBtn, barBtn, areaBtn, lbl_back, backBtn);

        Scene renderChartTypeScene = new Scene(VlayoutCharts ,1440, 800);
        renderChartTypeScene.getStylesheets().add("datavisual/chartStyle.css");
        return renderChartTypeScene;
    }
}
