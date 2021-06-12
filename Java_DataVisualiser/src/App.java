import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.geometry.*;

public class App extends Application{
    static Stage window;
    static Scene introMenu, dateMenu;
    static Button closeBtn;
    public static void main(String[] args) throws Exception {
        launch(args);
    }
    @Override
    public void start(Stage stage) throws Exception {
        window = stage;
        IntroVisual();
        window.setScene(introMenu);
        window.setTitle("Data Visualisation Software");
        window.show();
    }
    public static Scene IntroVisual(){
        // Show Introduction labels to guide the users
        Label lbl1 = new Label("Welcome to the Data Visualisation Software");
        Label lbl2 = new Label("This program consists of the data which displaying the "+
         "coronavirus cases in Malaysia in Year 2020 from March to December.");
        Label lbl3 = new Label("Upon you clicked the 'Start' button, you can choose "+
        "particular date, area and chart to visualise the result from the given data.");
        Button startBtn = new Button("Start");
        startBtn.setOnAction(e -> window.setScene(displayDateMenu()));
        closeBtn = new Button("Exit to Desktop");
        closeBtn.setOnAction(e -> window.close());

        VBox layout = new VBox(28);
        layout.setAlignment(Pos.CENTER);
        layout.getChildren().addAll(lbl1, lbl2, lbl3, startBtn, closeBtn);
        introMenu = new Scene(layout, 1440, 800);
        introMenu.getStylesheets().add("chartStyle.css");
        return introMenu;
    }
    public static Scene displayDateMenu(){
        Label lbl1 = new Label("Please pick an option in date");
        Label lbl2 = new Label("Click to go back to introduction again or quit the application");
        Button backBtn = new Button("Back to Intro");
        backBtn.setOnAction(e -> window.setScene(IntroVisual()));
        closeBtn = new Button("Exit to Desktop");
        closeBtn.setOnAction(e -> window.close());

        Button marBtn = new Button("March");
        marBtn.setOnAction(e -> App.window.setScene(Charts.displayAreaMenu(3)));
        Button aprBtn = new Button("April");
        aprBtn.setOnAction(e -> App.window.setScene(Charts.displayAreaMenu(4)));
        Button mayBtn = new Button("May");
        mayBtn.setOnAction(e -> App.window.setScene(Charts.displayAreaMenu(5)));
        Button junBtn = new Button("June");
        junBtn.setOnAction(e -> App.window.setScene(Charts.displayAreaMenu(6)));
        Button julBtn = new Button("July");
        julBtn.setOnAction(e -> App.window.setScene(Charts.displayAreaMenu(7)));
        Button augBtn = new Button("August");
        augBtn.setOnAction(e -> App.window.setScene(Charts.displayAreaMenu(8)));
        Button septBtn = new Button("September");
        septBtn.setOnAction(e -> App.window.setScene(Charts.displayAreaMenu(9)));
        Button octBtn = new Button("October");
        octBtn.setOnAction(e -> App.window.setScene(Charts.displayAreaMenu(10)));
        Button novBtn = new Button("November");
        novBtn.setOnAction(e -> App.window.setScene(Charts.displayAreaMenu(11)));
        Button decBtn = new Button("December");
        decBtn.setOnAction(e -> App.window.setScene(Charts.displayAreaMenu(12)));

        HBox HlayoutDate = new HBox(28); VBox VlayoutDate = new VBox(28);
        HBox HlayoutDate0 = new HBox(28); HlayoutDate0.setAlignment(Pos.CENTER);
        HBox HlayoutDate1 = new HBox(28); HlayoutDate1.setAlignment(Pos.CENTER);
        HBox HlayoutDate2 = new HBox(28); HlayoutDate2.setAlignment(Pos.CENTER);
        HBox HlayoutDate3 = new HBox(28); HlayoutDate3.setAlignment(Pos.CENTER);

        HlayoutDate.setAlignment(Pos.CENTER); HlayoutDate.getChildren().add(lbl1);
        HlayoutDate0.getChildren().addAll(marBtn, aprBtn, mayBtn, junBtn);
        HlayoutDate1.getChildren().addAll(julBtn, augBtn, septBtn, octBtn);
        HlayoutDate2.getChildren().addAll(novBtn, decBtn);
        HlayoutDate3.getChildren().add(lbl2);

        VlayoutDate.setAlignment(Pos.CENTER);
        VlayoutDate.getChildren().addAll(HlayoutDate, HlayoutDate0, HlayoutDate1, HlayoutDate2, 
        HlayoutDate3, backBtn, closeBtn);
        
        Scene renderIntScene =  new Scene(VlayoutDate, 1440, 800);
        renderIntScene.getStylesheets().add("chartStyle.css");
        return renderIntScene;
    }
}
