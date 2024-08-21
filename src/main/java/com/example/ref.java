
// //package replit;
// package com.example;

// import javafx.application.Application;
// import javafx.fxml.FXMLLoader;
// import javafx.scene.Parent;
// import javafx.scene.Scene;
// import javafx.stage.Stage;

// import java.io.IOException;
// import javafx.application.Application;
// import javafx.stage.Stage;
// import javafx.scene.Scene;
// import javafx.scene.control.Label;
// import javafx.scene.control.TextField;
// import javafx.scene.control.Button;
// import javafx.scene.layout.VBox;
// import javafx.geometry.Pos;
// import javafx.event.EventHandler;
// import javafx.event.ActionEvent;
// import javafx.scene.paint.Color;
// import javafx.scene.input.MouseEvent;
// import javafx.beans.binding.Bindings;
// import javafx.animation.Animation;
// import javafx.animation.Transition;
// import javafx.util.Duration;
// import java.util.ArrayList;
// import javafx.scene.text.Text;
// import javafx.scene.input.KeyEvent;
// import javafx.scene.input.KeyCode;
// import javafx.scene.layout.*;
// import javafx.scene.layout.BackgroundImage;
// import javafx.scene.paint.ImagePattern;
// import javafx.scene.image.Image;
// import javafx.scene.image.ImageView;
// import javafx.scene.layout.BackgroundSize;
// import javafx.scene.layout.ColumnConstraints;
// import javafx.scene.layout.GridPane;
// import javafx.scene.layout.RowConstraints;
// import javafx.scene.text.Font;
// import javafx.scene.text.FontPosture;
// import javafx.animation.FadeTransition;
// import javafx.animation.PauseTransition;
// import javafx.animation.SequentialTransition;
// import javafx.animation.KeyFrame;
// import javafx.animation.Timeline;
// import javafx.application.Platform;

// public class App extends Application 
// {

//   @Override
//   public void start(Stage primaryStage) {

//     //opening
//     GridPane openingNode;
//     Scene opening;
//     //name
//     VBox nameNode;
//     Scene name;
//     //story1
//     GridPane story1Node;
//     Scene story1;
//     //story2
//     GridPane story2Node;
//     Scene story2;
//     //story4
//     GridPane story3Node;
//     Scene story3;
//     //story4
//     GridPane story4Node;
//     Scene story4;
//     //story5
//     GridPane story5Node;
//     Scene story5;
//     //story6
//     GridPane story6Node;
//     Scene story6;
//     //story7
//     GridPane story7Node;
//     Scene story7;
//     //story8
//     GridPane story8Node;
//     Scene story8;
//     //story9
//     GridPane story9Node;
//     Scene story9;
//     //story10
//     GridPane story10Node;
//     Scene story10;
//     //story11
//     GridPane story11Node;
//     Scene story11;
//     //story12
//     GridPane story12Node;
//     Scene story12;
//     //story13
//     GridPane story13Node;
//     Scene story13;
//     //story14
//     GridPane story14Node;
//     Scene story14;
//     //story15
//     GridPane story15Node;
//     Scene story15;
//     //story16
//     GridPane story16Node;
//     Scene story16;
//     //story17
//     GridPane story17Node;
//     Scene story17;
//     //story18
//     GridPane story18Node;
//     Scene story18;
//     //story19
//     GridPane story19Node;
//     Scene story19;
//     //story20
//     GridPane story20Node;
//     Scene story20;
//     //story21
//     GridPane story21Node;
//     Scene story21;
//     //story22
//     GridPane story22Node;
//     Scene story22;
//     //story23
//     GridPane story23Node;
//     Scene story23;
//     //story24
//     GridPane story24Node;
//     Scene story24;
//     //story25
//     GridPane story25Node;
//     Scene story25;
//     //story26
//     GridPane story26Node;
//     Scene story26;
//     //story27
//     GridPane story27Node;
//     Scene story27;
//     //story28
//     GridPane story28Node;
//     Scene story28;
//     //story29
//     GridPane story29Node;
//     Scene story29;
//     //story30
//     GridPane story30Node;
//     Scene story30;
//     //story31
//     GridPane story31Node;
//     Scene story31;
//     //story32
//     GridPane story32Node;
//     Scene story32;
//     //story33
//     GridPane story33Node;
//     Scene story33;
//     //story34
//     GridPane story34Node;
//     Scene story34;
//     //story35
//     GridPane story35Node;
//     Scene story35;
//     //story36
//     GridPane story36Node;
//     Scene story36;
//     //story37
//     GridPane story37Node;
//     Scene story37;
//     //story38
//     GridPane story38Node;
//     Scene story38;
//     //story39
//     GridPane story39Node;
//     Scene story39;
//     //story40
//     GridPane story40Node;
//     Scene story40;
//     //story41
//     GridPane story41Node;
//     Scene story41;
//     //story42
//     GridPane story42Node;
//     Scene story42;
//     //story43
//     GridPane story43Node;
//     Scene story43;
//     //story44
//     GridPane story44Node;
//     Scene story44;
//     //story45
//     GridPane story45Node;
//     Scene story45;
//     //story46
//     GridPane story46Node;
//     Scene story46;
//     //story47
//     GridPane story47Node;
//     Scene story47;
//     //story48
//     GridPane story48Node;
//     Scene story48;
//     //story49
//     GridPane story49Node;
//     Scene story49;
//     //story50
//     GridPane story50Node;
//     Scene story50;
//     //story51
//     GridPane story51Node;
//     Scene story51;
//     //story52
//     GridPane story52Node;
//     Scene story52;
//     //story53
//     GridPane story53Node;
//     Scene story53;
//     //story54
//     GridPane story54Node;
//     Scene story54;
//     //story55
//     GridPane story55Node;
//     Scene story55;
//     //story56
//     GridPane story56Node;
//     Scene story56;
//     //story57
//     GridPane story57Node;
//     Scene story57;
//     //story58
//     GridPane story58Node;
//     Scene story58;
//     //story59
//     GridPane story59Node;
//     Scene story59;
//     //story60
//     GridPane story60Node;
//     Scene story60;
//     //story61
//     GridPane story61Node;
//     Scene story61;
//     //story62
//    // GridPane story62Node;
//   //  Scene story62;
//     //story63
//     GridPane story63Node;
//     Scene story63;
//     //story64
//     GridPane story64Node;
//     Scene story64;
//     //story65
//     GridPane story65Node;
//     Scene story65;
//     //story66
//     GridPane story66Node;
//     Scene story66;
//     //story67
//     GridPane story67Node;
//     Scene story67;
//     //story68
//     GridPane story68Node;
//     Scene story68;
//     //story69
//     GridPane story69Node;
//     Scene story69;
//     //story70
//     GridPane story70Node;
//     Scene story70;
//     //story71
//     GridPane story71Node;
//     Scene story71;
//     //story72
//     GridPane story72Node;
//     Scene story72;
//     //story73
//     GridPane story73Node;
//     Scene story73;
//     //story74
//     GridPane story74Node;
//     Scene story74;
//     //story75
//     GridPane story75Node;
//     Scene story75;
//     //story76
//     GridPane story76Node;
//     Scene story76;
//     //story77
//     GridPane story77Node;
//     Scene story77;
//     //story78
//     GridPane story78Node;
//     Scene story78;
    

//     //OPENING
//       //1) variables and attributes
//     Image play= new Image("https://cdn.discordapp.com/attachments/1261210481721348159/1268252834948976731/IMG_4334.png?ex=66b79d7e&is=66b64bfe&hm=081886eeffab90a517461193663149a1d5eab499c7d06c016db6c13a643bead3&");
//     Image exit = new Image("https://cdn.discordapp.com/attachments/1261210481721348159/1268252834948976731/IMG_4334.png?ex=66b79d7e&is=66b64bfe&hm=081886eeffab90a517461193663149a1d5eab499c7d06c016db6c13a643bead3&");
    
//     Image play1= new Image("https://cdn.discordapp.com/attachments/1261210481721348159/1268252834948976731/IMG_4334.png?ex=66b79d7e&is=66b64bfe&hm=081886eeffab90a517461193663149a1d5eab499c7d06c016db6c13a643bead3&");
//     Image exit1= new Image("https://cdn.discordapp.com/attachments/1261210481721348159/1268252834948976731/IMG_4334.png?ex=66b79d7e&is=66b64bfe&hm=081886eeffab90a517461193663149a1d5eab499c7d06c016db6c13a643bead3&");
    
//     Button playButton; //play
//     playButton = new Button(""); //play
//       playButton.setStyle("-fx-background-color:transparent;-fx-border-width:0px");
//       playButton.setGraphic(new ImageView(play));
//       playButton.setFocusTraversable(false);
//       playButton.setMinWidth(130);
//       playButton.setMinHeight(50);
//       playButton.setMaxWidth(130);
//       playButton.setMaxHeight(50);
    
//     Button exitButton; // load 
//     exitButton = new Button(""); //load
//       exitButton.setStyle("-fx-background-color:transparent;-fx-border-width:0px");
//       exitButton.setGraphic(new ImageView(exit));
//       exitButton.setMinWidth(130);
//       exitButton.setMinHeight(50);
//       exitButton.setMaxWidth(130);
//       exitButton.setMaxHeight(50);
//       exitButton.setFocusTraversable(false);
    
//       //2) gridPane initialization
//     openingNode = new GridPane();
//     openingNode.add(playButton, 1, 1);
//     openingNode.add(exitButton, 1, 3);
  
//       //3) row/column initialization
//     RowConstraints openingRow1 = new RowConstraints();
//     openingRow1.setMinHeight(25);
//     RowConstraints openingRow2 = new RowConstraints();
//     openingRow2.setMinHeight(50);
//     RowConstraints openingRow3 = new RowConstraints();
//     openingRow3.setMinHeight(30);
//     RowConstraints openingRow4 = new RowConstraints();
//     openingRow4.setMinHeight(50);
//     RowConstraints openingRow5 = new RowConstraints();
//     openingRow5.setMinHeight(30);
//     RowConstraints openingRow6 = new RowConstraints();
//     openingRow6.setMinHeight(50);
//     RowConstraints openingRow7 = new RowConstraints();
//     openingRow7.setMinHeight(170);
//     ColumnConstraints openingColumn1 = new ColumnConstraints();
//     openingColumn1.setMinWidth(21);
//     ColumnConstraints openingColumn2 = new ColumnConstraints();
//     openingColumn2.setMinWidth(100);
//     ColumnConstraints openingColumn3 = new ColumnConstraints();
//     openingColumn3.setMinWidth(579);
//     openingNode.getRowConstraints().addAll(openingRow1,openingRow2,openingRow3,openingRow4,openingRow5,openingRow6, openingRow7); 
//     openingNode.getColumnConstraints().addAll(openingColumn1, openingColumn2, openingColumn3); 
    
//       //4) background image
//     BackgroundSize openingBackgroundSize = new BackgroundSize(900, 700, true, true, true, false);
//     BackgroundImage openingImage = new BackgroundImage(new Image("https://cdn.discordapp.com/attachments/1261210481721348159/1268252834948976731/IMG_4334.png?ex=66b79d7e&is=66b64bfe&hm=081886eeffab90a517461193663149a1d5eab499c7d06c016db6c13a643bead3&"),
//         BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, openingBackgroundSize);
//     openingNode.setBackground(new Background(openingImage));

//     //NAME 
//       //1)variables and attributes
//     Label label3; // name warning title
//     label3 = new Label("What is your nickname?"); // nickname label
//       label3.setStyle("-fx-text-fill:white;-fx-font-size:200%;-fx-font-weight:bold");
//     TextField tf1; // name textfield
//     tf1 = new TextField(""); // enter nickname field
//       tf1.setMinWidth(500);
//       tf1.setMinHeight(50);
//       tf1.setMaxWidth(500);
//       tf1.setMaxHeight(50);
//       tf1.setStyle("-fx-font-size:130%;-fx-font-weight:bold");
//     Button button3; // submit name
//     button3 = new Button("SUBMIT");
//       button3.setStyle("-fx-background-color:white;-fx-font-weight:bold;-fx-border-width:0px;");
//       button3.setMinWidth(100);
//       button3.setMinHeight(60);
//       button3.setFocusTraversable(false);
//       //2) vbox intialization
//     nameNode = new VBox(label3, tf1, button3);
//     nameNode.setSpacing(60);
//     nameNode.setAlignment(Pos.CENTER);
//       //3) background image
//     BackgroundSize backgroundSize1 = new BackgroundSize(900, 700, true, true, true, false);
//     BackgroundImage image1 = new BackgroundImage(
//         new Image("https://cdn.discordapp.com/attachments/1261210481721348159/1268252834948976731/IMG_4334.png?ex=66b79d7e&is=66b64bfe&hm=081886eeffab90a517461193663149a1d5eab499c7d06c016db6c13a643bead3&"),
//         BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, backgroundSize1);
//     nameNode.setBackground(new Background(image1));

//     //story1
//       //variable and attributes
//     Label story1Speaker;
//     story1Speaker = new Label("");
//     story1Speaker.textProperty().bind(Bindings.concat(tf1.textProperty(), " ") );
//       story1Speaker.setStyle("-fx-text-fill:white;-fx-font-size:200%;-fx-font-weight:bold;");
//       story1Speaker.setAlignment(Pos.CENTER_LEFT);
//     Label story1Label; // story array
//     story1Label = new Label(""); // blank space
//       story1Label.setMinWidth(550);
//       story1Label.setMaxWidth(550);
//       story1Label.setMinHeight(100);  
//       story1Label.setStyle("-fx-text-fill:black;-fx-font-size:120%;-fx-background-color:rgba(255,255,255,0.7)");
//       story1Label.setAlignment(Pos.CENTER_LEFT);
//     Label story1Blank;
//     story1Blank = new Label("");
//       story1Blank.setMinWidth(30);
//       story1Blank.setMinHeight(50); 
//       story1Blank.setStyle("-fx-background-color:transparent");
//     Label story1Blank1;
//     story1Blank1 = new Label("");
//       story1Blank1.setMinWidth(30);
//       story1Blank1.setMinHeight(100);
// story1Blank1.setStyle("-fx-background-color:rgba(255,255,255,0.7)");
     
//       //animation
// 	//text dialogue. Put /n if too long to split
//     final String story1Content = "Oh no! I’m late to class!! Sighhh… why did I wake up so late today?";
//     final Text story1Text = new Text(10, 20, "");
    
//     final Animation story1Animation = new Transition() {
//         {
//             setCycleDuration(Duration.millis(3000));
//         }
    
//         protected void interpolate(double frac) {
//             final int story1Length = story1Content.length();
//             final int story1N = Math.round(story1Length * (float) frac);
//             story1Label.setText(story1Content.substring(0, story1N));
//         }
        
//     };

    
//       //1) gridpane intialization
//     story1Node = new GridPane();
//     story1Node.add(story1Speaker, 2, 2);
//     story1Node.add(story1Label, 2, 3);
//     story1Node.add(story1Blank, 1, 2, 1, 1);
//     story1Node.add(story1Blank1, 1, 3, 1, 1);
//       //2) row/column intialization
//     RowConstraints story1row1 = new RowConstraints();
//     story1row1.setMinHeight(50);
//     RowConstraints story1row2 = new RowConstraints();
//     story1row2.setMinHeight(200);
//     RowConstraints story1row3 = new RowConstraints();
//     story1row3.setMinHeight(50);
//     RowConstraints story1row4 = new RowConstraints();
//     story1row4.setMinHeight(100);
//     ColumnConstraints story1col1 = new ColumnConstraints();
//     story1col1.setMinWidth(50);
//     ColumnConstraints story1col2 = new ColumnConstraints();
//     story1col2.setMinWidth(30);
//     ColumnConstraints story1col3 = new ColumnConstraints();
//     story1col3.setMinWidth(550);
//     ColumnConstraints story1col4 = new ColumnConstraints();
//     story1col4.setMinWidth(50);
//     story1Node.getRowConstraints().addAll(story1row1,story1row2,story1row3,story1row4); 
//     story1Node.getColumnConstraints().addAll(story1col1, story1col2, story1col3,story1col4); 

//       //3) background image
//     BackgroundSize story1BackgroundSize = new BackgroundSize(900, 700, true, true, true, false);
// 	//image. Replace url
//     BackgroundImage story1Image = new BackgroundImage(
//         new Image("https://cdn.discordapp.com/attachments/1261210481721348159/1268252834948976731/IMG_4334.png?ex=66b79d7e&is=66b64bfe&hm=081886eeffab90a517461193663149a1d5eab499c7d06c016db6c13a643bead3&"),
//         BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, story1BackgroundSize);
//     story1Node.setBackground(new Background(story1Image));

//     //story2
//       //variable and attributes
//     Label story2Speaker;
//     story2Speaker = new Label("");
//       story2Speaker.setStyle("-fx-text-fill:white;-fx-font-size:200%;-fx-font-weight:bold;");
//       story2Speaker.setAlignment(Pos.CENTER_LEFT);
//     Label story2Label; // story array
//     story2Label = new Label(""); // blank space
//       story2Label.setMinWidth(550);
//       story2Label.setMaxWidth(550);
//       story2Label.setMinHeight(100);  
//       story2Label.setStyle("-fx-text-fill:black;-fx-font-size:120%;-fx-background-color:rgba(255,255,255,0.7);-fx-font-weight:bold;");
//       story2Label.setAlignment(Pos.CENTER_LEFT);
//     Label story2Blank;
//     story2Blank = new Label("");
//       story2Blank.setMinWidth(30);
//       story2Blank.setMinHeight(50); 
//       story2Blank.setStyle("-fx-background-color:transparent");
//     Label story2Blank1;
//     story2Blank1 = new Label("");
//       story2Blank1.setMinWidth(30);
//       story2Blank1.setMinHeight(100);
// story2Blank1.setStyle("-fx-background-color:rgba(255,255,255,0.7)");
     
//       //animation
// 	//text dialogue. Put /n if too long to split
//     final String story2Content = "Not noticing where you are hastily approaching, you don’t\nnotice the tree you are about to run into...";
//     final Text story2Text = new Text(10, 20, "");
    
//     final Animation story2Animation = new Transition() {
//         {
//             setCycleDuration(Duration.millis(3000));
//         }
    
//         protected void interpolate(double frac) {
//             final int story2Length = story2Content.length();
//             final int story2N = Math.round(story2Length * (float) frac);
//             story2Label.setText(story2Content.substring(0, story2N));
//         }
        
//     };

    
//       //1) gridpane intialization
//     story2Node = new GridPane();
//     story2Node.add(story2Speaker, 2, 2);
//     story2Node.add(story2Label, 2, 3);
//     story2Node.add(story2Blank, 1, 2, 1, 1);
//     story2Node.add(story2Blank1, 1, 3, 1, 1);
//       //2) row/column intialization
//     RowConstraints story2row1 = new RowConstraints();
//     story2row1.setMinHeight(50);
//     RowConstraints story2row2 = new RowConstraints();
//     story2row2.setMinHeight(200);
//     RowConstraints story2row3 = new RowConstraints();
//     story2row3.setMinHeight(50);
//     RowConstraints story2row4 = new RowConstraints();
//     story2row4.setMinHeight(100);
//     ColumnConstraints story2col1 = new ColumnConstraints();
//     story2col1.setMinWidth(50);
//     ColumnConstraints story2col2 = new ColumnConstraints();
//     story2col2.setMinWidth(30);
//     ColumnConstraints story2col3 = new ColumnConstraints();
//     story2col3.setMinWidth(550);
//     ColumnConstraints story2col4 = new ColumnConstraints();
//     story2col4.setMinWidth(50);
//     story2Node.getRowConstraints().addAll(story2row1,story2row2,story2row3,story2row4); 
//     story2Node.getColumnConstraints().addAll(story2col1, story2col2, story2col3,story2col4); 

//       //3) background image
//     BackgroundSize story2BackgroundSize = new BackgroundSize(900, 700, true, true, true, false);
// 	//image. Replace url
//     BackgroundImage story2Image = new BackgroundImage(
//         new Image("https://cdn.discordapp.com/attachments/1261210481721348159/1268252834948976731/IMG_4334.png?ex=66b79d7e&is=66b64bfe&hm=081886eeffab90a517461193663149a1d5eab499c7d06c016db6c13a643bead3&"),
//         BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, story2BackgroundSize);
//     story2Node.setBackground(new Background(story2Image));

//     //story3
//       //variable and attributes
//     Label story3Speaker;
//     story3Speaker = new Label("");
//     story3Speaker.textProperty().bind(Bindings.concat(tf1.textProperty(), " ") );
//       story3Speaker.setStyle("-fx-text-fill:white;-fx-font-size:200%;-fx-font-weight:bold;");
//       story3Speaker.setAlignment(Pos.CENTER_LEFT);
//     Label story3Label; // story array
//     story3Label = new Label(""); // blank space
//       story3Label.setMinWidth(550);
//       story3Label.setMaxWidth(550);
//       story3Label.setMinHeight(100);  
//       story3Label.setStyle("-fx-text-fill:black;-fx-font-size:140%;-fx-background-color:rgba(255,255,255,0.7);-fx-font-weight:bold");
//       story3Label.setAlignment(Pos.CENTER_LEFT);
//     Label story3Blank;
//     story3Blank = new Label("");
//       story3Blank.setMinWidth(30);
//       story3Blank.setMinHeight(50); 
//       story3Blank.setStyle("-fx-background-color:transparent");
//     Label story3Blank1;
//     story3Blank1 = new Label("");
//       story3Blank1.setMinWidth(30);
//       story3Blank1.setMinHeight(100);
// story3Blank1.setStyle("-fx-background-color:rgba(255,255,255,0.7)");
     
//       //animation
// 	//text dialogue. Put /n if too long to split
//     final String story3Content = "AAAAAAAAAHHFFFFFFDEAHKDWALHKLDD#ECSLDKEAQPQ";
//     final Text story3Text = new Text(10, 20, "");
    
//     final Animation story3Animation = new Transition() {
//         {
//             setCycleDuration(Duration.millis(1000));
//         }
    
//         protected void interpolate(double frac) {
//             final int story3Length = story3Content.length();
//             final int story3N = Math.round(story3Length * (float) frac);
//             story3Label.setText(story3Content.substring(0, story3N));
//         }
        
//     };

    
//       //1) gridpane intialization
//     story3Node = new GridPane();
//     story3Node.add(story3Speaker, 2, 2);
//     story3Node.add(story3Label, 2, 3);
//     story3Node.add(story3Blank, 1, 2, 1, 1);
//     story3Node.add(story3Blank1, 1, 3, 1, 1);
//       //2) row/column intialization
//     RowConstraints story3row1 = new RowConstraints();
//     story3row1.setMinHeight(50);
//     RowConstraints story3row2 = new RowConstraints();
//     story3row2.setMinHeight(200);
//     RowConstraints story3row3 = new RowConstraints();
//     story3row3.setMinHeight(50);
//     RowConstraints story3row4 = new RowConstraints();
//     story3row4.setMinHeight(100);
//     ColumnConstraints story3col1 = new ColumnConstraints();
//     story3col1.setMinWidth(50);
//     ColumnConstraints story3col2 = new ColumnConstraints();
//     story3col2.setMinWidth(30);
//     ColumnConstraints story3col3 = new ColumnConstraints();
//     story3col3.setMinWidth(550);
//     ColumnConstraints story3col4 = new ColumnConstraints();
//     story3col4.setMinWidth(50);
//     story3Node.getRowConstraints().addAll(story3row1,story3row2,story3row3,story3row4); 
//     story3Node.getColumnConstraints().addAll(story3col1, story3col2, story3col3,story3col4); 

//       //3) background image
//     BackgroundSize story3BackgroundSize = new BackgroundSize(900, 700, true, true, true, false);
// 	//image. Replace url
//     BackgroundImage story3Image = new BackgroundImage(
//         new Image("https://cdn.discordapp.com/attachments/1261210481721348159/1268252834948976731/IMG_4334.png?ex=66b79d7e&is=66b64bfe&hm=081886eeffab90a517461193663149a1d5eab499c7d06c016db6c13a643bead3&"),
//         BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, story3BackgroundSize);
//     story3Node.setBackground(new Background(story3Image));

//     //story4
//       //1) gridpane intialization
//     story4Node = new GridPane();
//       //2) background color
//     story4Node.setStyle("-fx-background-color:rgb(0,0,0);");
//       //3 fade transition
//     FadeTransition story4FT = new FadeTransition(Duration.millis(1500), story4Node);
//       story4FT.setFromValue(0.0);
//       story4FT.setToValue(1.0);

//     //story5
//       //1) gridpane intialization
//     story5Node = new GridPane();
//       //3 fade transition
//     FadeTransition story5FT = new FadeTransition(Duration.millis(1500), story5Node);
//       story5FT.setFromValue(0.0);
//       story5FT.setToValue(1.0);
//     //3) background image
//     BackgroundSize story5BackgroundSize = new BackgroundSize(900, 700, true, true, true, false);
// 	//image. Replace url
//     BackgroundImage story5Image = new BackgroundImage(
//         new Image("https://cdn.discordapp.com/attachments/1261210481721348159/1268252834948976731/IMG_4334.png?ex=66b79d7e&is=66b64bfe&hm=081886eeffab90a517461193663149a1d5eab499c7d06c016db6c13a643bead3&"),
//         BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, story5BackgroundSize);
//     story5Node.setBackground(new Background(story5Image));

//     //story6
//       //variable and attributes
//     Label story6Speaker;
//     story6Speaker = new Label("Mr. Enriquez");
//       story6Speaker.setStyle("-fx-text-fill:white;-fx-font-size:200%;-fx-font-weight:bold;");
//       story6Speaker.setAlignment(Pos.CENTER_LEFT);
//     Label story6Label; // story array
//     story6Label = new Label(""); // blank space
//       story6Label.setMinWidth(550);
//       story6Label.setMaxWidth(550);
//       story6Label.setMinHeight(100);  
//       story6Label.setStyle("-fx-text-fill:black;-fx-font-size:120%;-fx-background-color:rgba(255,255,255,0.7)");
//       story6Label.setAlignment(Pos.CENTER_LEFT);
//     Label story6Blank;
//     story6Blank = new Label("");
//       story6Blank.setMinWidth(30);
//       story6Blank.setMinHeight(50); 
//       story6Blank.setStyle("-fx-background-color:transparent");
//     Label story6Blank1;
//     story6Blank1 = new Label("");
//       story6Blank1.setMinWidth(30);
//       story6Blank1.setMinHeight(100);
// story6Blank1.setStyle("-fx-background-color:rgba(255,255,255,0.7)");
     
//       //animation
// 	//text dialogue. Put /n if too long to split
//     final String story6Content = "Are you alright?";
//     final Text story6Text = new Text(10, 20, "");
    
//     final Animation story6Animation = new Transition() {
//         {
//             setCycleDuration(Duration.millis(1000));
//         }
    
//         protected void interpolate(double frac) {
//             final int story6Length = story6Content.length();
//             final int story6N = Math.round(story6Length * (float) frac);
//             story6Label.setText(story6Content.substring(0, story6N));
//         }
        
//     };

    
//       //1) gridpane intialization
//     story6Node = new GridPane();
//     story6Node.add(story6Speaker, 2, 2);
//     story6Node.add(story6Label, 2, 3);
//     story6Node.add(story6Blank, 1, 2, 1, 1);
//     story6Node.add(story6Blank1, 1, 3, 1, 1);
//       //2) row/column intialization
//     RowConstraints story6row1 = new RowConstraints();
//     story6row1.setMinHeight(50);
//     RowConstraints story6row2 = new RowConstraints();
//     story6row2.setMinHeight(200);
//     RowConstraints story6row3 = new RowConstraints();
//     story6row3.setMinHeight(50);
//     RowConstraints story6row4 = new RowConstraints();
//     story6row4.setMinHeight(100);
//     ColumnConstraints story6col1 = new ColumnConstraints();
//     story6col1.setMinWidth(50);
//     ColumnConstraints story6col2 = new ColumnConstraints();
//     story6col2.setMinWidth(30);
//     ColumnConstraints story6col3 = new ColumnConstraints();
//     story6col3.setMinWidth(550);
//     ColumnConstraints story6col4 = new ColumnConstraints();
//     story6col4.setMinWidth(50);
//     story6Node.getRowConstraints().addAll(story6row1,story6row2,story6row3,story6row4); 
//     story6Node.getColumnConstraints().addAll(story6col1, story6col2, story6col3,story6col4); 

//       //3) background image
//     BackgroundSize story6BackgroundSize = new BackgroundSize(900, 700, true, true, true, false);
// 	//image. Replace url
//     BackgroundImage story6Image = new BackgroundImage(
//         new Image("https://cdn.discordapp.com/attachments/1261210481721348159/1268252834948976731/IMG_4334.png?ex=66b79d7e&is=66b64bfe&hm=081886eeffab90a517461193663149a1d5eab499c7d06c016db6c13a643bead3&"),
//         BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, story6BackgroundSize);
//     story6Node.setBackground(new Background(story6Image));

//     //story7
//       //variable and attributes
//     Button story7Option1;
//     story7Option1 = new Button("Take his hand");
//       story7Option1.setStyle("-fx-background-color:white;-fx-text-fill:black;-fx-font-size:200%;-fx-border-width:3px;-fx-border-color:#554646;-fx-border-radius:3px");
//       story7Option1.setFocusTraversable(false);
//       story7Option1.setMinWidth(300);
//       story7Option1.setMaxWidth(300);
//       story7Option1.setMinHeight(85);
//       story7Option1.setMaxHeight(85);
    
//     Button story7Option2;
//     story7Option2 = new Button("Reject it");
//       story7Option2.setStyle("-fx-background-color:white;-fx-text-fill:black;-fx-font-size:200%;-fx-border-width:3px;-fx-border-color:#554646;-fx-border-radius:3px");
//       story7Option2.setFocusTraversable(false);
//       story7Option2.setMinWidth(300);
//       story7Option2.setMaxWidth(300);
//       story7Option2.setMinHeight(85);

//       //1) gridpane intialization
//     story7Node = new GridPane();
//     story7Node.add(story7Option1, 1, 1);
//     story7Node.add(story7Option2, 1, 3);
//       //2) row/column intialization
//     RowConstraints story7row1 = new RowConstraints();
//     story7row1.setMinHeight(100);
//     RowConstraints story7row2 = new RowConstraints();
//     story7row2.setMinHeight(85);
//     RowConstraints story7row3 = new RowConstraints();
//     story7row3.setMinHeight(30);
//     RowConstraints story7row4 = new RowConstraints();
//     story7row4.setMinHeight(85);
//     RowConstraints story7row5 = new RowConstraints();
//     story7row5.setMinHeight(100);
//     ColumnConstraints story7col1 = new ColumnConstraints();
//     story7col1.setMinWidth(200);
//     ColumnConstraints story7col2 = new ColumnConstraints();
//     story7col2.setMinWidth(300);
//     ColumnConstraints story7col3 = new ColumnConstraints();
//     story7col3.setMinWidth(200);
//     story7Node.getRowConstraints().addAll(story7row1,story7row2,story7row3,story7row4, story7row5); 
//     story7Node.getColumnConstraints().addAll(story7col1, story7col2, story7col3); 
//       //3) background image
//     BackgroundSize story7BackgroundSize = new BackgroundSize(900, 700, true, true, true, false);
//     BackgroundImage story7Image = new BackgroundImage(
//         new Image("https://cdn.discordapp.com/attachments/1261210481721348159/1268252834948976731/IMG_4334.png?ex=66b79d7e&is=66b64bfe&hm=081886eeffab90a517461193663149a1d5eab499c7d06c016db6c13a643bead3&"),
//         BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, story7BackgroundSize);
//     story7Node.setBackground(new Background(story7Image));

//     //story8
//       //variable and attributes
//     Label story8Speaker;
//     story8Speaker = new Label("");
//     story8Speaker.textProperty().bind(Bindings.concat(tf1.textProperty(), " ") );
//       story8Speaker.setStyle("-fx-text-fill:white;-fx-font-size:200%;-fx-font-weight:bold;");
//       story8Speaker.setAlignment(Pos.CENTER_LEFT);
//     Label story8Label; // story array
//     story8Label = new Label(""); // blank space
//       story8Label.setMinWidth(550);
//       story8Label.setMaxWidth(550);
//       story8Label.setMinHeight(100);  
//       story8Label.setStyle("-fx-text-fill:black;-fx-font-size:120%;-fx-background-color:rgba(255,255,255,0.7);");
//       story8Label.setAlignment(Pos.CENTER_LEFT);
//     Label story8Blank;
//     story8Blank = new Label("");
//       story8Blank.setMinWidth(30);
//       story8Blank.setMinHeight(50); 
//       story8Blank.setStyle("-fx-background-color:transparent");
//     Label story8Blank1;
//     story8Blank1 = new Label("");
//       story8Blank1.setMinWidth(30);
//       story8Blank1.setMinHeight(100);
// story8Blank1.setStyle("-fx-background-color:rgba(255,255,255,0.7)");
     
//       //animation
//     final String story8Content = "S-Salamat.";
//     final Text story8Text = new Text(10, 20, "");
    
//     final Animation story8Animation = new Transition() {
//         {
//             setCycleDuration(Duration.millis(1000));
//         }
    
//         protected void interpolate(double frac) {
//             final int story8Length = story8Content.length();
//             final int story8N = Math.round(story8Length * (float) frac);
//             story8Label.setText(story8Content.substring(0, story8N));
//         }
        
//     };

//       //1) gridpane intialization
//     story8Node = new GridPane();
//     story8Node.add(story8Speaker, 2, 2);
//     story8Node.add(story8Label, 2, 3);
//     story8Node.add(story8Blank, 1, 2, 1, 1);
//     story8Node.add(story8Blank1, 1, 3, 1, 1);
//       //2) row/column intialization
//     RowConstraints story8row1 = new RowConstraints();
//     story8row1.setMinHeight(50);
//     RowConstraints story8row2 = new RowConstraints();
//     story8row2.setMinHeight(200);
//     RowConstraints story8row3 = new RowConstraints();
//     story8row3.setMinHeight(50);
//     RowConstraints story8row4 = new RowConstraints();
//     story8row4.setMinHeight(100);
//     ColumnConstraints story8col1 = new ColumnConstraints();
//     story8col1.setMinWidth(50);
//     ColumnConstraints story8col2 = new ColumnConstraints();
//     story8col2.setMinWidth(30);
//     ColumnConstraints story8col3 = new ColumnConstraints();
//     story8col3.setMinWidth(550);
//     ColumnConstraints story8col4 = new ColumnConstraints();
//     story8col4.setMinWidth(50);
//     story8Node.getRowConstraints().addAll(story8row1,story8row2,story8row3,story8row4); 
//     story8Node.getColumnConstraints().addAll(story8col1, story8col2, story8col3,story8col4); 

//       //3) background image
//     BackgroundSize story8BackgroundSize = new BackgroundSize(900, 700, true, true, true, false);
// 	//image. Replace url
//     BackgroundImage story8Image = new BackgroundImage(
//         new Image("https://cdn.discordapp.com/attachments/1261210481721348159/1268252834948976731/IMG_4334.png?ex=66b79d7e&is=66b64bfe&hm=081886eeffab90a517461193663149a1d5eab499c7d06c016db6c13a643bead3&"),
//         BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, story8BackgroundSize);
//     story8Node.setBackground(new Background(story8Image));

//     //story9
//       //variable and attributes
//    // Label story9Speaker;
//    // story9Speaker = new Label("Mr. Enriquez");
//     //  story9Speaker.setStyle("-fx-text-fill:white;-fx-font-size:200%;-fx-font-weight:bold;");
//     //  story9Speaker.setAlignment(Pos.CENTER_LEFT);
//  //   Label story9Label; // story array
//  //   story9Label = new Label(""); // blank space
//   //    story9Label.setMinWidth(550);
//   //   story9Label.setMaxWidth(550);
//   //   story9Label.setMinHeight(100);  
//    //   story9Label.setStyle("-fx-text-fill:black;-fx-font-size:120%;-fx-background-color:rgba(255,255,255,0.7);");
//     //  story9Label.setAlignment(Pos.CENTER_LEFT);
//     //Label story9Blank;
//  //   story9Blank = new Label("");
//   //    story9Blank.setMinWidth(30);
//    //   story9Blank.setMinHeight(50); 
//     //  story9Blank.setStyle("-fx-background-color:transparent");
//   //  Label story9Blank1;
//    // story9Blank1 = new Label("");
//     //  story9Blank1.setMinWidth(30);
//     //  story9Blank1.setMinHeight(100);
// //story9Blank1.setStyle("-fx-background-color:rgba(255,255,255,0.7)");
     
//       //animation
//     final String story9Content = "You’re welcome.";
//     final Text story9Text = new Text(10, 20, "");
    
//     final Animation story9Animation = new Transition() {
//         {
//             setCycleDuration(Duration.millis(1000));
//         }
    
//         protected void interpolate(double frac) {
//             final int story9Length = story9Content.length();
//             final int story9N = Math.round(story9Length * (float) frac);
//             //story9Label.setText(story9Content.substring(0, story9N));
//         }
        
//     };
    
//       //1) gridpane intialization
//     story9Node = new GridPane();
//    // story9Node.add(story9Speaker, 2, 2);
//   //  story9Node.add(story9Label, 2, 3);
//     //story9Node.add(story9Blank, 1, 2, 1, 1);
//     //story9Node.add(story9Blank1, 1, 3, 1, 1);
//       //2) row/column intialization
//     RowConstraints story9row1 = new RowConstraints();
//     story9row1.setMinHeight(50);
//     RowConstraints story9row2 = new RowConstraints();
//     story9row2.setMinHeight(200);
//     RowConstraints story9row3 = new RowConstraints();
//     story9row3.setMinHeight(50);
//     RowConstraints story9row4 = new RowConstraints();
//     story9row4.setMinHeight(100);
//     ColumnConstraints story9col1 = new ColumnConstraints();
//     story9col1.setMinWidth(50);
//     ColumnConstraints story9col2 = new ColumnConstraints();
//     story9col2.setMinWidth(30);
//     ColumnConstraints story9col3 = new ColumnConstraints();
//     story9col3.setMinWidth(550);
//     ColumnConstraints story9col4 = new ColumnConstraints();
//     story9col4.setMinWidth(50);
//     story9Node.getRowConstraints().addAll(story9row1,story9row2,story9row3,story9row4); 
//     story9Node.getColumnConstraints().addAll(story9col1, story9col2, story9col3,story9col4); 

//       //3) background image
//     BackgroundSize story9BackgroundSize = new BackgroundSize(900, 700, true, true, true, false);
// 	//image. Replace url
//     BackgroundImage story9Image = new BackgroundImage(
//         new Image("https://cdn.discordapp.com/attachments/1261210481721348159/1268252834948976731/IMG_4334.png?ex=66b79d7e&is=66b64bfe&hm=081886eeffab90a517461193663149a1d5eab499c7d06c016db6c13a643bead3&"),
//         BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, story9BackgroundSize);
//     story9Node.setBackground(new Background(story9Image));

//     //story10
//       //variable and attributes
//     Label story10Speaker;
//     story10Speaker = new Label("Mr. Enriquez");
//       story10Speaker.setStyle("-fx-text-fill:white;-fx-font-size:200%;-fx-font-weight:bold;");
//       story10Speaker.setAlignment(Pos.CENTER_LEFT);
//     Label story10Label; // story array
//     story10Label = new Label(""); // blank space
//       story10Label.setMinWidth(550);
//       story10Label.setMaxWidth(550);
//       story10Label.setMinHeight(100);  
//       story10Label.setStyle("-fx-text-fill:black;-fx-font-size:120%;-fx-background-color:rgba(255,255,255,0.7);");
//       story10Label.setAlignment(Pos.CENTER_LEFT);
//     Label story10Blank;
//     story10Blank = new Label("");
//       story10Blank.setMinWidth(30);
//       story10Blank.setMinHeight(50); 
//       story10Blank.setStyle("-fx-background-color:transparent");
//     Label story10Blank1;
//     story10Blank1 = new Label("");
//       story10Blank1.setMinWidth(30);
//       story10Blank1.setMinHeight(100);
// story10Blank1.setStyle("-fx-background-color:rgba(255,255,255,0.7)");
     
//       //animation
//     final String story10Content = "So… what do you think about the Calculus AP exams?";
//     final Text story10Text = new Text(10, 20, "");
    
//     final Animation story10Animation = new Transition() {
//         {
//             setCycleDuration(Duration.millis(2000));
//         }
    
//         protected void interpolate(double frac) {
//             final int story10Length = story10Content.length();
//             final int story10N = Math.round(story10Length * (float) frac);
//             story10Label.setText(story10Content.substring(0, story10N));
//         }
        
//     };
    
//       //1) gridpane intialization
//     story10Node = new GridPane();
//     story10Node.add(story10Speaker, 2, 2);
//     story10Node.add(story10Label, 2, 3);
//     story10Node.add(story10Blank, 1, 2, 1, 1);
//     story10Node.add(story10Blank1, 1, 3, 1, 1);
//       //2) row/column intialization
//     RowConstraints story10row1 = new RowConstraints();
//     story10row1.setMinHeight(50);
//     RowConstraints story10row2 = new RowConstraints();
//     story10row2.setMinHeight(200);
//     RowConstraints story10row3 = new RowConstraints();
//     story10row3.setMinHeight(50);
//     RowConstraints story10row4 = new RowConstraints();
//     story10row4.setMinHeight(100);
//     ColumnConstraints story10col1 = new ColumnConstraints();
//     story10col1.setMinWidth(50);
//     ColumnConstraints story10col2 = new ColumnConstraints();
//     story10col2.setMinWidth(30);
//     ColumnConstraints story10col3 = new ColumnConstraints();
//     story10col3.setMinWidth(550);
//     ColumnConstraints story10col4 = new ColumnConstraints();
//     story10col4.setMinWidth(50);
//     story10Node.getRowConstraints().addAll(story10row1,story10row2,story10row3,story10row4); 
//     story10Node.getColumnConstraints().addAll(story10col1, story10col2, story10col3,story10col4); 

//       //3) background image
//     BackgroundSize story10BackgroundSize = new BackgroundSize(900, 700, true, true, true, false);
// 	//image. Replace url
//     BackgroundImage story10Image = new BackgroundImage(
//         new Image("https://cdn.discordapp.com/attachments/1261210481721348159/1268252834948976731/IMG_4334.png?ex=66b79d7e&is=66b64bfe&hm=081886eeffab90a517461193663149a1d5eab499c7d06c016db6c13a643bead3&"),
//         BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, story10BackgroundSize);
//     story10Node.setBackground(new Background(story10Image));

//     //story11
//       //variable and attributes
//     Button story11Option1;
//     story11Option1 = new Button("Torture");
//       story11Option1.setStyle("-fx-background-color:white;-fx-text-fill:black;-fx-font-size:200%;-fx-font-weight:bold");
//       story11Option1.setFocusTraversable(false);
//       story11Option1.setMinWidth(300);
//       story11Option1.setMaxWidth(300);
//       story11Option1.setMinHeight(85);
//       story11Option1.setMaxHeight(85);
    
//     Button story11Option2;
//     story11Option2 = new Button("");
//       story11Option2.setStyle("-fx-background-color:white;-fx-text-fill:black;-fx-font-size:200%;-fx-font-weight:bold");
//       story11Option2.setFocusTraversable(false);
//       story11Option2.setMinWidth(300);
//       story11Option2.setMaxWidth(300);
//       story11Option2.setMinHeight(85);

//     Image newGame = new Image("https://cdn.discordapp.com/attachments/1261210481721348159/1268252834948976731/IMG_4334.png?ex=66b79d7e&is=66b64bfe&hm=081886eeffab90a517461193663149a1d5eab499c7d06c016db6c13a643bead3&");
//     BackgroundImage newGameBgr = new BackgroundImage(newGame, null, null, null, null);
//     story11Option2.setGraphic(new ImageView(newGame));

//     Image newGame1 = new Image("https://cdn.discordapp.com/attachments/1261210481721348159/1268252834948976731/IMG_4334.png?ex=66b79d7e&is=66b64bfe&hm=081886eeffab90a517461193663149a1d5eab499c7d06c016db6c13a643bead3&");
//     BackgroundImage newGameBgr1 = new BackgroundImage(newGame1, null, null, null, null);
//     story11Option1.setGraphic(new ImageView(newGame1));

//       //1) gridpane intialization
//     story11Node = new GridPane();
//     story11Node.add(story11Option1, 1, 1);
//     story11Node.add(story11Option2, 1, 3);
//       //2) row/column intialization
//     RowConstraints story11row1 = new RowConstraints();
//     story11row1.setMinHeight(100);
//     RowConstraints story11row2 = new RowConstraints();
//     story11row2.setMinHeight(85);
//     RowConstraints story11row3 = new RowConstraints();
//     story11row3.setMinHeight(30);
//     RowConstraints story11row4 = new RowConstraints();
//     story11row4.setMinHeight(85);
//     RowConstraints story11row5 = new RowConstraints();
//     story11row5.setMinHeight(100);
//     ColumnConstraints story11col1 = new ColumnConstraints();
//     story11col1.setMinWidth(200);
//     ColumnConstraints story11col2 = new ColumnConstraints();
//     story11col2.setMinWidth(300);
//     ColumnConstraints story11col3 = new ColumnConstraints();
//     story11col3.setMinWidth(200);
//     story11Node.getRowConstraints().addAll(story11row1,story11row2,story11row3,story11row4, story11row5); 
//     story11Node.getColumnConstraints().addAll(story11col1, story11col2, story11col3); 
//       //3) background image
//     BackgroundSize story11BackgroundSize = new BackgroundSize(900, 700, true, true, true, false);
//     BackgroundImage story11Image = new BackgroundImage(
//         new Image("https://cdn.discordapp.com/attachments/1261210481721348159/1268252834948976731/IMG_4334.png?ex=66b79d7e&is=66b64bfe&hm=081886eeffab90a517461193663149a1d5eab499c7d06c016db6c13a643bead3&"),
//         BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, story11BackgroundSize);
//     story11Node.setBackground(new Background(story11Image));

//     //story12
//       //variable and attributes
//     Label story12Speaker;
//     story12Speaker = new Label("");
//     story12Speaker.textProperty().bind(Bindings.concat(tf1.textProperty(), " ") );
//       story12Speaker.setStyle("-fx-text-fill:white;-fx-font-size:200%;-fx-font-weight:bold;");
//       story12Speaker.setAlignment(Pos.CENTER_LEFT);
//     Label story12Label; // story array
//     story12Label = new Label(""); // blank space
//       story12Label.setMinWidth(550);
//       story12Label.setMaxWidth(550);
//       story12Label.setMinHeight(100);  
//       story12Label.setStyle("-fx-text-fill:black;-fx-font-size:120%;-fx-background-color:rgba(255,255,255,0.7);");
//       story12Label.setAlignment(Pos.CENTER_LEFT);
//     Label story12Blank;
//     story12Blank = new Label("");
//       story12Blank.setMinWidth(30);
//       story12Blank.setMinHeight(50); 
//       story12Blank.setStyle("-fx-background-color:transparent");
//     Label story12Blank1;
//     story12Blank1 = new Label("");
//       story12Blank1.setMinWidth(30);
//       story12Blank1.setMinHeight(100);
// story12Blank1.setStyle("-fx-background-color:rgba(255,255,255,0.7)");
     
//       //animation
//     final String story12Content = "They are a great way to torture students.";
//     final Text story12Text = new Text(10, 20, "");
    
//     final Animation story12Animation = new Transition() {
//         {
//             setCycleDuration(Duration.millis(1400));
//         }
    
//         protected void interpolate(double frac) {
//             final int story12Length = story12Content.length();
//             final int story12N = Math.round(story12Length * (float) frac);
//             story12Label.setText(story12Content.substring(0, story12N));
//         }
        
//     };
    
//       //1) gridpane intialization
//     story12Node = new GridPane();
//     story12Node.add(story12Speaker, 2, 2);
//     story12Node.add(story12Label, 2, 3);
//     story12Node.add(story12Blank, 1, 2, 1, 1);
//     story12Node.add(story12Blank1, 1, 3, 1, 1);
//       //2) row/column intialization
//     RowConstraints story12row1 = new RowConstraints();
//     story12row1.setMinHeight(50);
//     RowConstraints story12row2 = new RowConstraints();
//     story12row2.setMinHeight(200);
//     RowConstraints story12row3 = new RowConstraints();
//     story12row3.setMinHeight(50);
//     RowConstraints story12row4 = new RowConstraints();
//     story12row4.setMinHeight(100);
//     ColumnConstraints story12col1 = new ColumnConstraints();
//     story12col1.setMinWidth(50);
//     ColumnConstraints story12col2 = new ColumnConstraints();
//     story12col2.setMinWidth(30);
//     ColumnConstraints story12col3 = new ColumnConstraints();
//     story12col3.setMinWidth(550);
//     ColumnConstraints story12col4 = new ColumnConstraints();
//     story12col4.setMinWidth(50);
//     story12Node.getRowConstraints().addAll(story12row1,story12row2,story12row3,story12row4); 
//     story12Node.getColumnConstraints().addAll(story12col1, story12col2, story12col3,story12col4); 

//       //3) background image
//     BackgroundSize story12BackgroundSize = new BackgroundSize(900, 700, true, true, true, false);
// 	//image. Replace url
//     BackgroundImage story12Image = new BackgroundImage(
//         new Image("https://cdn.discordapp.com/attachments/1261210481721348159/1268252834948976731/IMG_4334.png?ex=66b79d7e&is=66b64bfe&hm=081886eeffab90a517461193663149a1d5eab499c7d06c016db6c13a643bead3&"),
//         BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, story12BackgroundSize);
//     story12Node.setBackground(new Background(story12Image));

//     //story13
//       //variable and attributes
//     Label story13Speaker;
//     story13Speaker = new Label("");
//     story13Speaker.textProperty().bind(Bindings.concat(tf1.textProperty(), " ") );
//       story13Speaker.setStyle("-fx-text-fill:white;-fx-font-size:200%;-fx-font-weight:bold;");
//       story13Speaker.setAlignment(Pos.CENTER_LEFT);
//     Label story13Label; // story array
//     story13Label = new Label(""); // blank space
//       story13Label.setMinWidth(550);
//       story13Label.setMaxWidth(550);
//       story13Label.setMinHeight(100);  
//       story13Label.setStyle("-fx-text-fill:black;-fx-font-size:120%;-fx-background-color:rgba(255,255,255,0.7);");
//       story13Label.setAlignment(Pos.CENTER_LEFT);
//     Label story13Blank;
//     story13Blank = new Label("");
//       story13Blank.setMinWidth(30);
//       story13Blank.setMinHeight(50); 
//       story13Blank.setStyle("-fx-background-color:transparent");
//     Label story13Blank1;
//     story13Blank1 = new Label("");
//       story13Blank1.setMinWidth(30);
//       story13Blank1.setMinHeight(100);
// story13Blank1.setStyle("-fx-background-color:rgba(255,255,255,0.7)");
     
//       //animation
//     final String story13Content = "It is to a certain extent, inequitable in comparison to other STEM\nAP exams due to the fact that other APs allow formula sheets while\non the contrary, AP calculus, for some unknown reason, forces\nstudents to memorize the formulas instead. ";
//     final Text story13Text = new Text(10, 20, "");
    
//     final Animation story13Animation = new Transition() {
//         {
//             setCycleDuration(Duration.millis(3500));
//         }
    
//         protected void interpolate(double frac) {
//             final int story13Length = story13Content.length();
//             final int story13N = Math.round(story13Length * (float) frac);
//             story13Label.setText(story13Content.substring(0, story13N));
//         }
        
//     };
    
//       //1) gridpane intialization
//     story13Node = new GridPane();
//     story13Node.add(story13Speaker, 2, 2);
//     story13Node.add(story13Label, 2, 3);
//     story13Node.add(story13Blank, 1, 2, 1, 1);
//     story13Node.add(story13Blank1, 1, 3, 1, 1);
//       //2) row/column intialization
//     RowConstraints story13row1 = new RowConstraints();
//     story13row1.setMinHeight(50);
//     RowConstraints story13row2 = new RowConstraints();
//     story13row2.setMinHeight(200);
//     RowConstraints story13row3 = new RowConstraints();
//     story13row3.setMinHeight(50);
//     RowConstraints story13row4 = new RowConstraints();
//     story13row4.setMinHeight(100);
//     ColumnConstraints story13col1 = new ColumnConstraints();
//     story13col1.setMinWidth(50);
//     ColumnConstraints story13col2 = new ColumnConstraints();
//     story13col2.setMinWidth(30);
//     ColumnConstraints story13col3 = new ColumnConstraints();
//     story13col3.setMinWidth(550);
//     ColumnConstraints story13col4 = new ColumnConstraints();
//     story13col4.setMinWidth(50);
//     story13Node.getRowConstraints().addAll(story13row1,story13row2,story13row3,story13row4); 
//     story13Node.getColumnConstraints().addAll(story13col1, story13col2, story13col3,story13col4); 

//       //3) background image
//     BackgroundSize story13BackgroundSize = new BackgroundSize(900, 700, true, true, true, false);
// 	//image. Replace url
//     BackgroundImage story13Image = new BackgroundImage(
//         new Image("https://cdn.discordapp.com/attachments/1261210481721348159/1268252834948976731/IMG_4334.png?ex=66b79d7e&is=66b64bfe&hm=081886eeffab90a517461193663149a1d5eab499c7d06c016db6c13a643bead3&"),
//         BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, story13BackgroundSize);
//     story13Node.setBackground(new Background(story13Image));

//     //story14
//       //variable and attributes
//     Label story14Speaker;
//     story14Speaker = new Label("Mr. Enriquez");
//       story14Speaker.setStyle("-fx-text-fill:white;-fx-font-size:200%;-fx-font-weight:bold;");
//       story14Speaker.setAlignment(Pos.CENTER_LEFT);
//     Label story14Label; // story array
//     story14Label = new Label(""); // blank space
//       story14Label.setMinWidth(550);
//       story14Label.setMaxWidth(550);
//       story14Label.setMinHeight(100);  
//       story14Label.setStyle("-fx-text-fill:black;-fx-font-size:120%;-fx-background-color:rgba(255,255,255,0.7);");
//       story14Label.setAlignment(Pos.CENTER_LEFT);
//     Label story14Blank;
//     story14Blank = new Label("");
//       story14Blank.setMinWidth(30);
//       story14Blank.setMinHeight(50); 
//       story14Blank.setStyle("-fx-background-color:transparent");
//     Label story14Blank1;
//     story14Blank1 = new Label("");
//       story14Blank1.setMinWidth(30);
//       story14Blank1.setMinHeight(100);
// story14Blank1.setStyle("-fx-background-color:rgba(255,255,255,0.7)");
     
//       //animation
//     final String story14Content = "Haha! You're pretty funny!";
//     final Text story14Text = new Text(10, 20, "");
    
//     final Animation story14Animation = new Transition() {
//         {
//             setCycleDuration(Duration.millis(1000));
//         }
    
//         protected void interpolate(double frac) {
//             final int story14Length = story14Content.length();
//             final int story14N = Math.round(story14Length * (float) frac);
//             story14Label.setText(story14Content.substring(0, story14N));
//         }
        
//     };
    
//       //1) gridpane intialization
//     story14Node = new GridPane();
//     story14Node.add(story14Speaker, 2, 2);
//     story14Node.add(story14Label, 2, 3);
//     story14Node.add(story14Blank, 1, 2, 1, 1);
//     story14Node.add(story14Blank1, 1, 3, 1, 1);
//       //2) row/column intialization
//     RowConstraints story14row1 = new RowConstraints();
//     story14row1.setMinHeight(50);
//     RowConstraints story14row2 = new RowConstraints();
//     story14row2.setMinHeight(200);
//     RowConstraints story14row3 = new RowConstraints();
//     story14row3.setMinHeight(50);
//     RowConstraints story14row4 = new RowConstraints();
//     story14row4.setMinHeight(100);
//     ColumnConstraints story14col1 = new ColumnConstraints();
//     story14col1.setMinWidth(50);
//     ColumnConstraints story14col2 = new ColumnConstraints();
//     story14col2.setMinWidth(30);
//     ColumnConstraints story14col3 = new ColumnConstraints();
//     story14col3.setMinWidth(550);
//     ColumnConstraints story14col4 = new ColumnConstraints();
//     story14col4.setMinWidth(50);
//     story14Node.getRowConstraints().addAll(story14row1,story14row2,story14row3,story14row4); 
//     story14Node.getColumnConstraints().addAll(story14col1, story14col2, story14col3,story14col4); 

//       //3) background image
//     BackgroundSize story14BackgroundSize = new BackgroundSize(900, 700, true, true, true, false);
// 	//image. Replace url
//     BackgroundImage story14Image = new BackgroundImage(
//         new Image("https://cdn.discordapp.com/attachments/1261210481721348159/1268252834948976731/IMG_4334.png?ex=66b79d7e&is=66b64bfe&hm=081886eeffab90a517461193663149a1d5eab499c7d06c016db6c13a643bead3&"),
//         BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, story14BackgroundSize);
//     story14Node.setBackground(new Background(story14Image));

//     //story15
//       //variable and attributes
//     Label story15Speaker;
//     story15Speaker = new Label("Mr. Enriquez");
//       story15Speaker.setStyle("-fx-text-fill:white;-fx-font-size:200%;-fx-font-weight:bold;");
//       story15Speaker.setAlignment(Pos.CENTER_LEFT);
//     Label story15Label; // story array
//     story15Label = new Label(""); // blank space
//       story15Label.setMinWidth(550);
//       story15Label.setMaxWidth(550);
//       story15Label.setMinHeight(100);  
//       story15Label.setStyle("-fx-text-fill:black;-fx-font-size:120%;-fx-background-color:rgba(255,255,255,0.7);");
//       story15Label.setAlignment(Pos.CENTER_LEFT);
//     Label story15Blank;
//     story15Blank = new Label("");
//       story15Blank.setMinWidth(30);
//       story15Blank.setMinHeight(50); 
//       story15Blank.setStyle("-fx-background-color:transparent");
//     Label story15Blank1;
//     story15Blank1 = new Label("");
//       story15Blank1.setMinWidth(30);
//       story15Blank1.setMinHeight(100);
// story15Blank1.setStyle("-fx-background-color:rgba(255,255,255,0.7)");
     
//       //animation
//     final String story15Content = "Anyways, I lost my answer sheet for my recent worksheets. Can\nyou help me with some Calculus, please? ";
//     final Text story15Text = new Text(10, 20, "");
    
//     final Animation story15Animation = new Transition() {
//         {
//             setCycleDuration(Duration.millis(2000));
//         }
    
//         protected void interpolate(double frac) {
//             final int story15Length = story15Content.length();
//             final int story15N = Math.round(story15Length * (float) frac);
//             story15Label.setText(story15Content.substring(0, story15N));
//         }
        
//     };
    
//       //1) gridpane intialization
//     story15Node = new GridPane();
//     story15Node.add(story15Speaker, 2, 2);
//     story15Node.add(story15Label, 2, 3);
//     story15Node.add(story15Blank, 1, 2, 1, 1);
//     story15Node.add(story15Blank1, 1, 3, 1, 1);
//       //2) row/column intialization
//     RowConstraints story15row1 = new RowConstraints();
//     story15row1.setMinHeight(50);
//     RowConstraints story15row2 = new RowConstraints();
//     story15row2.setMinHeight(200);
//     RowConstraints story15row3 = new RowConstraints();
//     story15row3.setMinHeight(50);
//     RowConstraints story15row4 = new RowConstraints();
//     story15row4.setMinHeight(100);
//     ColumnConstraints story15col1 = new ColumnConstraints();
//     story15col1.setMinWidth(50);
//     ColumnConstraints story15col2 = new ColumnConstraints();
//     story15col2.setMinWidth(30);
//     ColumnConstraints story15col3 = new ColumnConstraints();
//     story15col3.setMinWidth(550);
//     ColumnConstraints story15col4 = new ColumnConstraints();
//     story15col4.setMinWidth(50);
//     story15Node.getRowConstraints().addAll(story15row1,story15row2,story15row3,story15row4); 
//     story15Node.getColumnConstraints().addAll(story15col1, story15col2, story15col3,story15col4); 

//       //3) background image
//     BackgroundSize story15BackgroundSize = new BackgroundSize(900, 700, true, true, true, false);
// 	//image. Replace url
//     BackgroundImage story15Image = new BackgroundImage(
//         new Image("https://cdn.discordapp.com/attachments/1261210481721348159/1268252834948976731/IMG_4334.png?ex=66b79d7e&is=66b64bfe&hm=081886eeffab90a517461193663149a1d5eab499c7d06c016db6c13a643bead3&"),
//         BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, story15BackgroundSize);
//     story15Node.setBackground(new Background(story15Image));

//     //story16
//       //variable and attributes
//     Label story16Speaker;
//     story16Speaker = new Label("");
//     story16Speaker.textProperty().bind(Bindings.concat(tf1.textProperty(), " ") );
//       story16Speaker.setStyle("-fx-text-fill:white;-fx-font-size:200%;-fx-font-weight:bold;");
//       story16Speaker.setAlignment(Pos.CENTER_LEFT);
//     Label story16Label; // story array
//     story16Label = new Label(""); // blank space
//       story16Label.setMinWidth(550);
//       story16Label.setMaxWidth(550);
//       story16Label.setMinHeight(100);  
//       story16Label.setStyle("-fx-text-fill:black;-fx-font-size:120%;-fx-background-color:rgba(255,255,255,0.7);");
//       story16Label.setAlignment(Pos.CENTER_LEFT);
//     Label story16Blank;
//     story16Blank = new Label("");
//       story16Blank.setMinWidth(30);
//       story16Blank.setMinHeight(50); 
//       story16Blank.setStyle("-fx-background-color:transparent");
//     Label story16Blank1;
//     story16Blank1 = new Label("");
//       story16Blank1.setMinWidth(30);
//       story16Blank1.setMinHeight(100);
// story16Blank1.setStyle("-fx-background-color:rgba(255,255,255,0.7)");
     
//       //animation
//     final String story16Content = "Yeah, sure.";
//     final Text story16Text = new Text(10, 20, "");
    
//     final Animation story16Animation = new Transition() {
//         {
//             setCycleDuration(Duration.millis(1000));
//         }
    
//         protected void interpolate(double frac) {
//             final int story16Length = story16Content.length();
//             final int story16N = Math.round(story16Length * (float) frac);
//             story16Label.setText(story16Content.substring(0, story16N));
//         }
        
//     };
    
//       //1) gridpane intialization
//     story16Node = new GridPane();
//     story16Node.add(story16Speaker, 2, 2);
//     story16Node.add(story16Label, 2, 3);
//     story16Node.add(story16Blank, 1, 2, 1, 1);
//     story16Node.add(story16Blank1, 1, 3, 1, 1);
//       //2) row/column intialization
//     RowConstraints story16row1 = new RowConstraints();
//     story16row1.setMinHeight(50);
//     RowConstraints story16row2 = new RowConstraints();
//     story16row2.setMinHeight(200);
//     RowConstraints story16row3 = new RowConstraints();
//     story16row3.setMinHeight(50);
//     RowConstraints story16row4 = new RowConstraints();
//     story16row4.setMinHeight(100);
//     ColumnConstraints story16col1 = new ColumnConstraints();
//     story16col1.setMinWidth(50);
//     ColumnConstraints story16col2 = new ColumnConstraints();
//     story16col2.setMinWidth(30);
//     ColumnConstraints story16col3 = new ColumnConstraints();
//     story16col3.setMinWidth(550);
//     ColumnConstraints story16col4 = new ColumnConstraints();
//     story16col4.setMinWidth(50);
//     story16Node.getRowConstraints().addAll(story16row1,story16row2,story16row3,story16row4); 
//     story16Node.getColumnConstraints().addAll(story16col1, story16col2, story16col3,story16col4); 

//       //3) background image
//     BackgroundSize story16BackgroundSize = new BackgroundSize(900, 700, true, true, true, false);
// 	//image. Replace url
//     BackgroundImage story16Image = new BackgroundImage(
//         new Image("https://cdn.discordapp.com/attachments/1261210481721348159/1268252834948976731/IMG_4334.png?ex=66b79d7e&is=66b64bfe&hm=081886eeffab90a517461193663149a1d5eab499c7d06c016db6c13a643bead3&"),
//         BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, story16BackgroundSize);
//     story16Node.setBackground(new Background(story16Image));

//     //story17
//       //variable and attributes
//     Label story17Question;
//     story17Question = new Label("What is the derivative of 12x^2 + 5x^2?");
//       story17Question.setMinWidth(700);
//       story17Question.setMaxWidth(700);
//       story17Question.setMinHeight(60); 
//       story17Question.setMaxHeight(60); 
//       story17Question.setStyle("-fx-background-color:transparent;-fx-font-size:140%;-fx-text-fill:black;-fx-font-weight:bold;");  
//       story17Question.setAlignment(Pos.CENTER);

//     Label story17Label; // story array
//     story17Label = new Label(""); // blank space
//       story17Label.setMinWidth(700);
//       story17Label.setMaxWidth(700);
//       story17Label.setMinHeight(40);  
//       story17Label.setMaxHeight(40);  
//       story17Label.setStyle("-fx-text-fill:white;-fx-font-size:120%;-fx-background-color:transparent");
//       story17Label.setAlignment(Pos.CENTER);

//     Button story17Button1; //play
//     story17Button1 = new Button("a) 24x^2 + 20x^2"); //play
//       story17Button1.setStyle("-fx-background-color:transparent;-fx-font-size:120%;-fx-border-width:1px");
//       story17Button1.setFocusTraversable(false);
//       story17Button1.setMinWidth(250);
//       story17Button1.setMinHeight(50);
//       story17Button1.setMaxWidth(250);
//       story17Button1.setMaxHeight(50);
//       story17Button1.setAlignment(Pos.CENTER_LEFT);

//     Button story17Button2; //play
//     story17Button2 = new Button("b) 36x^2 + 3x^2"); //play
//       story17Button2.setStyle("-fx-background-color:transparent;-fx-font-size:120%;-fx-border-width:1px");
//       story17Button2.setFocusTraversable(false);
//       story17Button2.setMinWidth(250);
//       story17Button2.setMinHeight(50);
//       story17Button2.setMaxWidth(250);
//       story17Button2.setMaxHeight(50);
//       story17Button2.setAlignment(Pos.CENTER_LEFT);

//     Button story17Button3; //play
//     story17Button3 = new Button("c) 24x + 10x"); //play
//       story17Button3.setStyle("-fx-background-color:transparent;-fx-font-size:120%;-fx-border-width:1px");
//       story17Button3.setFocusTraversable(false);
//       story17Button3.setMinWidth(250);
//       story17Button3.setMinHeight(50);
//       story17Button3.setMaxWidth(250);
//       story17Button3.setMaxHeight(50);
//       story17Button3.setAlignment(Pos.CENTER_LEFT);
    
     
//       //animation
//     final String story17Content = "Try double-checking your coefficients!";
//     final Text story17Text = new Text(10, 20, "");
    
//     final Animation story17Animation = new Transition() {
//         {
//             setCycleDuration(Duration.millis(4000));
//         }
    
//         protected void interpolate(double frac) {
//             final int story17Length = story17Content.length();
//             final int story17N = Math.round(story17Length * (float) frac);
//             story17Label.setText(story17Content.substring(0, story17N));
//         }
    
//     };
      
//       //1) gridpane intialization
//     story17Node = new GridPane();
//      story17Node.add(story17Question, 0, 1, 3, 1);
//         story17Node.add(story17Label, 0, 9, 3, 1);
//         story17Node.add(story17Button1, 1, 3);
//         story17Node.add(story17Button2, 1, 5);
//         story17Node.add(story17Button3, 1, 7);
//       //2) row/column intialization
//     RowConstraints story17row1 = new RowConstraints();
//     story17row1.setMinHeight(70);
//     RowConstraints story17row2 = new RowConstraints();
//     story17row2.setMinHeight(60);
//     RowConstraints story17row3 = new RowConstraints();
//     story17row3.setMinHeight(10);
//     RowConstraints story17row4 = new RowConstraints();
//     story17row4.setMinHeight(50);
//     RowConstraints story17row5 = new RowConstraints();
//     story17row5.setMinHeight(10);
//     RowConstraints story17row6 = new RowConstraints();
//     story17row6.setMinHeight(50);
//     RowConstraints story17row7 = new RowConstraints();
//     story17row7.setMinHeight(10);
//     RowConstraints story17row8 = new RowConstraints();
//     story17row8.setMinHeight(50);
//     RowConstraints story17row9 = new RowConstraints();
//     story17row9.setMinHeight(30);
//     RowConstraints story17row10 = new RowConstraints();
//     story17row10.setMinHeight(40);
//     story17row10.setMaxHeight(40);
//     RowConstraints story17row11 = new RowConstraints();
//     story17row11.setMinHeight(20);
//     story17row11.setMaxHeight(20);
//     ColumnConstraints story17col1 = new ColumnConstraints();
//     story17col1.setMinWidth(135);
//     story17col1.setMaxWidth(135);
//     ColumnConstraints story17col2 = new ColumnConstraints();
//     story17col2.setMinWidth(470);
//     ColumnConstraints story17col3 = new ColumnConstraints();
//     story17col3.setMinWidth(30);
//     story17Node.getRowConstraints().addAll(story17row1,story17row2,story17row3,story17row4,story17row5,story17row6,story17row7,story17row8,story17row9,story17row10,story17row11); 
//     story17Node.getColumnConstraints().addAll(story17col1, story17col2, story17col3); 
//       //3) background image
//     BackgroundSize story17BackgroundSize = new BackgroundSize(900, 700, true, true, true, false);
//     BackgroundImage story17Image = new BackgroundImage(
//         new Image("https://cdn.discordapp.com/attachments/1261210481721348159/1268252834948976731/IMG_4334.png?ex=66b79d7e&is=66b64bfe&hm=081886eeffab90a517461193663149a1d5eab499c7d06c016db6c13a643bead3&"),
//         BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, story17BackgroundSize);
//     story17Node.setBackground(new Background(story17Image));

//     //story18
//       //variable and attributes
//     Label story18Question;
//     story18Question = new Label("If f(x) = sec x + csc x, then f'(x) = ");
//       story18Question.setMinWidth(700);
//       story18Question.setMaxWidth(700);
//       story18Question.setMinHeight(60); 
//       story18Question.setMaxHeight(60); 
//       story18Question.setStyle("-fx-background-color:transparent;-fx-font-size:140%;-fx-text-fill:black;-fx-font-weight:bold;");  
//       story18Question.setAlignment(Pos.CENTER);

//     Label story18Label; // story array
//     story18Label = new Label(""); // blank space
//       story18Label.setMinWidth(700);
//       story18Label.setMaxWidth(700);
//       story18Label.setMinHeight(40);  
//       story18Label.setMaxHeight(40);  
//       story18Label.setStyle("-fx-text-fill:white;-fx-font-size:120%;-fx-background-color:transparent");
//       story18Label.setAlignment(Pos.CENTER);

//     Button story18Button1; //play
//     story18Button1 = new Button("a) sec x(tan x) - csc x(cot x)"); //play
//       story18Button1.setStyle("-fx-background-color:transparent;-fx-font-size:120%;-fx-border-width:1px");
//       story18Button1.setFocusTraversable(false);
//       story18Button1.setMinWidth(250);
//       story18Button1.setMinHeight(50);
//       story18Button1.setMaxWidth(250);
//       story18Button1.setMaxHeight(50);
//       story18Button1.setAlignment(Pos.CENTER_LEFT);

//     Button story18Button2; //play
//     story18Button2 = new Button("b) sec x(tan x) + csc x(cot x)"); //play
//       story18Button2.setStyle("-fx-background-color:transparent;-fx-font-size:120%;-fx-border-width:1px");
//       story18Button2.setFocusTraversable(false);
//       story18Button2.setMinWidth(250);
//       story18Button2.setMinHeight(50);
//       story18Button2.setMaxWidth(250);
//       story18Button2.setMaxHeight(50);
//       story18Button2.setAlignment(Pos.CENTER_LEFT);

//     Button story18Button3; //play
//     story18Button3 = new Button("c) csc x - sec x"); //play
//       story18Button3.setStyle("-fx-background-color:transparent;-fx-font-size:120%;-fx-border-width:1px");
//       story18Button3.setFocusTraversable(false);
//       story18Button3.setMinWidth(250);
//       story18Button3.setMinHeight(50);
//       story18Button3.setMaxWidth(250);
//       story18Button3.setMaxHeight(50);
//       story18Button3.setAlignment(Pos.CENTER_LEFT);
    
     
//       //animation
//     final String story18Content = "Do you know your trig derivatives?";
//     final Text story18Text = new Text(10, 20, "");
    
//     final Animation story18Animation = new Transition() {
//         {
//             setCycleDuration(Duration.millis(4000));
//         }
    
//         protected void interpolate(double frac) {
//             final int story18Length = story18Content.length();
//             final int story18N = Math.round(story18Length * (float) frac);
//             story18Label.setText(story18Content.substring(0, story18N));
//         }
    
//     };
      
//       //1) gridpane intialization
//     story18Node = new GridPane();
//      story18Node.add(story18Question, 0, 1, 3, 1);
//         story18Node.add(story18Label, 0, 9, 3, 1);
//         story18Node.add(story18Button1, 1, 3);
//         story18Node.add(story18Button2, 1, 5);
//         story18Node.add(story18Button3, 1, 7);
//       //2) row/column intialization
//     RowConstraints story18row1 = new RowConstraints();
//     story18row1.setMinHeight(70);
//     RowConstraints story18row2 = new RowConstraints();
//     story18row2.setMinHeight(60);
//     RowConstraints story18row3 = new RowConstraints();
//     story18row3.setMinHeight(10);
//     RowConstraints story18row4 = new RowConstraints();
//     story18row4.setMinHeight(50);
//     RowConstraints story18row5 = new RowConstraints();
//     story18row5.setMinHeight(10);
//     RowConstraints story18row6 = new RowConstraints();
//     story18row6.setMinHeight(50);
//     RowConstraints story18row7 = new RowConstraints();
//     story18row7.setMinHeight(10);
//     RowConstraints story18row8 = new RowConstraints();
//     story18row8.setMinHeight(50);
//     RowConstraints story18row9 = new RowConstraints();
//     story18row9.setMinHeight(30);
//     RowConstraints story18row10 = new RowConstraints();
//     story18row10.setMinHeight(40);
//     story18row10.setMaxHeight(40);
//     RowConstraints story18row11 = new RowConstraints();
//     story18row11.setMinHeight(20);
//     story18row11.setMaxHeight(20);
//     ColumnConstraints story18col1 = new ColumnConstraints();
//     story18col1.setMinWidth(135);
//     story18col1.setMaxWidth(135);
//     ColumnConstraints story18col2 = new ColumnConstraints();
//     story18col2.setMinWidth(470);
//     ColumnConstraints story18col3 = new ColumnConstraints();
//     story18col3.setMinWidth(30);
//     story18Node.getRowConstraints().addAll(story18row1,story18row2,story18row3,story18row4,story18row5,story18row6,story18row7,story18row8,story18row9,story18row10,story18row11); 
//     story18Node.getColumnConstraints().addAll(story18col1, story18col2, story18col3); 
//       //3) background image
//     BackgroundSize story18BackgroundSize = new BackgroundSize(900, 700, true, true, true, false);
//     BackgroundImage story18Image = new BackgroundImage(
//         new Image("https://cdn.discordapp.com/attachments/1261210481721348159/1268252834948976731/IMG_4334.png?ex=66b79d7e&is=66b64bfe&hm=081886eeffab90a517461193663149a1d5eab499c7d06c016db6c13a643bead3&"),
//         BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, story18BackgroundSize);
//     story18Node.setBackground(new Background(story18Image));

//     //story19
//       //variable and attributes
//     Label story19Question;
//     story19Question = new Label("Differentiate (6x^2 + 7x)^4");
//       story19Question.setMinWidth(700);
//       story19Question.setMaxWidth(700);
//       story19Question.setMinHeight(60); 
//       story19Question.setMaxHeight(60); 
//       story19Question.setStyle("-fx-background-color:transparent;-fx-font-size:140%;-fx-text-fill:black;-fx-font-weight:bold;");  
//       story19Question.setAlignment(Pos.CENTER);

//     Label story19Label; // story array
//     story19Label = new Label(""); // blank space
//       story19Label.setMinWidth(700);
//       story19Label.setMaxWidth(700);
//       story19Label.setMinHeight(40);  
//       story19Label.setMaxHeight(40);  
//       story19Label.setStyle("-fx-text-fill:white;-fx-font-size:120%;-fx-background-color:transparent");
//       story19Label.setAlignment(Pos.CENTER);

//     Button story19Button1; //play
//     story19Button1 = new Button("a) 4(24x+7)(2x^2+7x)^1"); //play
//       story19Button1.setStyle("-fx-background-color:transparent;-fx-font-size:120%;-fx-border-width:1px");
//       story19Button1.setFocusTraversable(false);
//       story19Button1.setMinWidth(250);
//       story19Button1.setMinHeight(50);
//       story19Button1.setMaxWidth(250);
//       story19Button1.setMaxHeight(50);
//       story19Button1.setAlignment(Pos.CENTER_LEFT);

//     Button story19Button2; //play
//     story19Button2 = new Button("b) 4(12x+7)(6x^2+7x)^3"); //play
//       story19Button2.setStyle("-fx-background-color:transparent;-fx-font-size:120%;-fx-border-width:1px");
//       story19Button2.setFocusTraversable(false);
//       story19Button2.setMinWidth(250);
//       story19Button2.setMinHeight(50);
//       story19Button2.setMaxWidth(250);
//       story19Button2.setMaxHeight(50);
//       story19Button2.setAlignment(Pos.CENTER_LEFT);

//     Button story19Button3; //play
//     story19Button3 = new Button("c) 8(12x+7)(6x^2+7x)^4"); //play
//       story19Button3.setStyle("-fx-background-color:transparent;-fx-font-size:120%;-fx-border-width:1px");
//       story19Button3.setFocusTraversable(false);
//       story19Button3.setMinWidth(250);
//       story19Button3.setMinHeight(50);
//       story19Button3.setMaxWidth(250);
//       story19Button3.setMaxHeight(50);
//       story19Button3.setAlignment(Pos.CENTER_LEFT);
    
     
//       //animation
//     final String story19Content = "Did you remember to do chain rule?";
//     final Text story19Text = new Text(10, 20, "");
    
//     final Animation story19Animation = new Transition() {
//         {
//             setCycleDuration(Duration.millis(4000));
//         }
    
//         protected void interpolate(double frac) {
//             final int story19Length = story19Content.length();
//             final int story19N = Math.round(story19Length * (float) frac);
//             story19Label.setText(story19Content.substring(0, story19N));
//         }
    
//     };
      
//       //1) gridpane intialization
//     story19Node = new GridPane();
//      story19Node.add(story19Question, 0, 1, 3, 1);
//         story19Node.add(story19Label, 0, 9, 3, 1);
//         story19Node.add(story19Button1, 1, 3);
//         story19Node.add(story19Button2, 1, 5);
//         story19Node.add(story19Button3, 1, 7);
//       //2) row/column intialization
//     RowConstraints story19row1 = new RowConstraints();
//     story19row1.setMinHeight(70);
//     RowConstraints story19row2 = new RowConstraints();
//     story19row2.setMinHeight(60);
//     RowConstraints story19row3 = new RowConstraints();
//     story19row3.setMinHeight(10);
//     RowConstraints story19row4 = new RowConstraints();
//     story19row4.setMinHeight(50);
//     RowConstraints story19row5 = new RowConstraints();
//     story19row5.setMinHeight(10);
//     RowConstraints story19row6 = new RowConstraints();
//     story19row6.setMinHeight(50);
//     RowConstraints story19row7 = new RowConstraints();
//     story19row7.setMinHeight(10);
//     RowConstraints story19row8 = new RowConstraints();
//     story19row8.setMinHeight(50);
//     RowConstraints story19row9 = new RowConstraints();
//     story19row9.setMinHeight(30);
//     RowConstraints story19row10 = new RowConstraints();
//     story19row10.setMinHeight(40);
//     story19row10.setMaxHeight(40);
//     RowConstraints story19row11 = new RowConstraints();
//     story19row11.setMinHeight(20);
//     story19row11.setMaxHeight(20);
//     ColumnConstraints story19col1 = new ColumnConstraints();
//     story19col1.setMinWidth(135);
//     story19col1.setMaxWidth(135);
//     ColumnConstraints story19col2 = new ColumnConstraints();
//     story19col2.setMinWidth(470);
//     ColumnConstraints story19col3 = new ColumnConstraints();
//     story19col3.setMinWidth(30);
//     story19Node.getRowConstraints().addAll(story19row1,story19row2,story19row3,story19row4,story19row5,story19row6,story19row7,story19row8,story19row9,story19row10,story19row11); 
//     story19Node.getColumnConstraints().addAll(story19col1, story19col2, story19col3); 
//       //3) background image
//     BackgroundSize story19BackgroundSize = new BackgroundSize(900, 700, true, true, true, false);
//     BackgroundImage story19Image = new BackgroundImage(
//         new Image("https://cdn.discordapp.com/attachments/1261210481721348159/1268252834948976731/IMG_4334.png?ex=66b79d7e&is=66b64bfe&hm=081886eeffab90a517461193663149a1d5eab499c7d06c016db6c13a643bead3&"),
//         BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, story19BackgroundSize);
//     story19Node.setBackground(new Background(story19Image));

//     //story20
//       //variable and attributes
//     Label story20Speaker;
//     story20Speaker = new Label("Mr. Enriquez");
//       story20Speaker.setStyle("-fx-text-fill:white;-fx-font-size:200%;-fx-font-weight:bold;");
//       story20Speaker.setAlignment(Pos.CENTER_LEFT);
//     Label story20Label; // story array
//     story20Label = new Label(""); // blank space
//       story20Label.setMinWidth(550);
//       story20Label.setMaxWidth(550);
//       story20Label.setMinHeight(100);  
//       story20Label.setStyle("-fx-text-fill:black;-fx-font-size:120%;-fx-background-color:rgba(255,255,255,0.7);");
//       story20Label.setAlignment(Pos.CENTER_LEFT);
//     Label story20Blank;
//     story20Blank = new Label("");
//       story20Blank.setMinWidth(30);
//       story20Blank.setMinHeight(50); 
//       story20Blank.setStyle("-fx-background-color:transparent");
//     Label story20Blank1;
//     story20Blank1 = new Label("");
//       story20Blank1.setMinWidth(30);
//       story20Blank1.setMinHeight(100);
// story20Blank1.setStyle("-fx-background-color:rgba(255,255,255,0.7)");
     
//       //animation
//     final String story20Content = "Salamat for your help. You should get going now. It’s almost time\nfor class.";
//     final Text story20Text = new Text(10, 20, "");
    
//     final Animation story20Animation = new Transition() {
//         {
//             setCycleDuration(Duration.millis(3000));
//         }
    
//         protected void interpolate(double frac) {
//             final int story20Length = story20Content.length();
//             final int story20N = Math.round(story20Length * (float) frac);
//             story20Label.setText(story20Content.substring(0, story20N));
//         }
        
//     };
    
//       //1) gridpane intialization
//     story20Node = new GridPane();
//     story20Node.add(story20Speaker, 2, 2);
//     story20Node.add(story20Label, 2, 3);
//     story20Node.add(story20Blank, 1, 2, 1, 1);
//     story20Node.add(story20Blank1, 1, 3, 1, 1);
//       //2) row/column intialization
//     RowConstraints story20row1 = new RowConstraints();
//     story20row1.setMinHeight(50);
//     RowConstraints story20row2 = new RowConstraints();
//     story20row2.setMinHeight(200);
//     RowConstraints story20row3 = new RowConstraints();
//     story20row3.setMinHeight(50);
//     RowConstraints story20row4 = new RowConstraints();
//     story20row4.setMinHeight(100);
//     ColumnConstraints story20col1 = new ColumnConstraints();
//     story20col1.setMinWidth(50);
//     ColumnConstraints story20col2 = new ColumnConstraints();
//     story20col2.setMinWidth(30);
//     ColumnConstraints story20col3 = new ColumnConstraints();
//     story20col3.setMinWidth(550);
//     ColumnConstraints story20col4 = new ColumnConstraints();
//     story20col4.setMinWidth(50);
//     story20Node.getRowConstraints().addAll(story20row1,story20row2,story20row3,story20row4); 
//     story20Node.getColumnConstraints().addAll(story20col1, story20col2, story20col3,story20col4); 

//       //3) background image
//     BackgroundSize story20BackgroundSize = new BackgroundSize(900, 700, true, true, true, false);
// 	//image. Replace url
//     BackgroundImage story20Image = new BackgroundImage(
//         new Image("https://cdn.discordapp.com/attachments/1261210481721348159/1268252834948976731/IMG_4334.png?ex=66b79d7e&is=66b64bfe&hm=081886eeffab90a517461193663149a1d5eab499c7d06c016db6c13a643bead3&"),
//         BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, story20BackgroundSize);
//     story20Node.setBackground(new Background(story20Image));
    
//     //story21
//       //variable and attributes
//     Label story21Speaker;
//     story21Speaker = new Label("");
//       story21Speaker.setStyle("-fx-text-fill:white;-fx-font-size:200%;-fx-font-weight:bold;");
//       story21Speaker.setAlignment(Pos.CENTER_LEFT);
//     Label story21Label; // story array
//     story21Label = new Label(""); // blank space
//       story21Label.setMinWidth(550);
//       story21Label.setMaxWidth(550);
//       story21Label.setMinHeight(100);  
//       story21Label.setStyle("-fx-text-fill:black;-fx-font-size:120%;-fx-background-color:rgba(255,255,255,0.7);-fx-font-weight:bold;");
//       story21Label.setAlignment(Pos.CENTER_LEFT);
//     Label story21Blank;
//     story21Blank = new Label("");
//       story21Blank.setMinWidth(30);
//       story21Blank.setMinHeight(50); 
//       story21Blank.setStyle("-fx-background-color:transparent");
//     Label story21Blank1;
//     story21Blank1 = new Label("");
//       story21Blank1.setMinWidth(30);
//       story21Blank1.setMinHeight(100);
// story21Blank1.setStyle("-fx-background-color:rgba(255,255,255,0.7)");
     
//       //animation
//     final String story21Content = "Third period comes, and you are walking around.";
//     final Text story21Text = new Text(10, 20, "");
    
//     final Animation story21Animation = new Transition() {
//         {
//             setCycleDuration(Duration.millis(2000));
//         }
    
//         protected void interpolate(double frac) {
//             final int story21Length = story21Content.length();
//             final int story21N = Math.round(story21Length * (float) frac);
//             story21Label.setText(story21Content.substring(0, story21N));
//         }
        
//     };
    
//       //1) gridpane intialization
//     story21Node = new GridPane();
//     story21Node.add(story21Speaker, 2, 2);
//     story21Node.add(story21Label, 2, 3);
//     story21Node.add(story21Blank, 1, 2, 1, 1);
//     story21Node.add(story21Blank1, 1, 3, 1, 1);
//       //2) row/column intialization
//     RowConstraints story21row1 = new RowConstraints();
//     story21row1.setMinHeight(50);
//     RowConstraints story21row2 = new RowConstraints();
//     story21row2.setMinHeight(200);
//     RowConstraints story21row3 = new RowConstraints();
//     story21row3.setMinHeight(50);
//     RowConstraints story21row4 = new RowConstraints();
//     story21row4.setMinHeight(100);
//     ColumnConstraints story21col1 = new ColumnConstraints();
//     story21col1.setMinWidth(50);
//     ColumnConstraints story21col2 = new ColumnConstraints();
//     story21col2.setMinWidth(30);
//     ColumnConstraints story21col3 = new ColumnConstraints();
//     story21col3.setMinWidth(550);
//     ColumnConstraints story21col4 = new ColumnConstraints();
//     story21col4.setMinWidth(50);
//     story21Node.getRowConstraints().addAll(story21row1,story21row2,story21row3,story21row4); 
//     story21Node.getColumnConstraints().addAll(story21col1, story21col2, story21col3,story21col4); 

//       //3) background image
//     BackgroundSize story21BackgroundSize = new BackgroundSize(900, 700, true, true, true, false);
// 	//image. Replace url
//     BackgroundImage story21Image = new BackgroundImage(
//         new Image("https://cdn.discordapp.com/attachments/1261210481721348159/1268252834948976731/IMG_4334.png?ex=66b79d7e&is=66b64bfe&hm=081886eeffab90a517461193663149a1d5eab499c7d06c016db6c13a643bead3&"),
//         BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, story21BackgroundSize);
//     story21Node.setBackground(new Background(story21Image));

//     //story22
//       //variable and attributes
//     Label story22Speaker;
//     story22Speaker = new Label("");
//       story22Speaker.setStyle("-fx-text-fill:white;-fx-font-size:200%;-fx-font-weight:bold;");
//       story22Speaker.setAlignment(Pos.CENTER_LEFT);
//     Label story22Label; // story array
//     story22Label = new Label(""); // blank space
//       story22Label.setMinWidth(550);
//       story22Label.setMaxWidth(550);
//       story22Label.setMinHeight(100);  
//       story22Label.setStyle("-fx-text-fill:black;-fx-font-size:120%;-fx-background-color:rgba(255,255,255,0.7);-fx-font-weight:bold;");
//       story22Label.setAlignment(Pos.CENTER_LEFT);
//     Label story22Blank;
//     story22Blank = new Label("");
//       story22Blank.setMinWidth(30);
//       story22Blank.setMinHeight(50); 
//       story22Blank.setStyle("-fx-background-color:transparent");
//     Label story22Blank1;
//     story22Blank1 = new Label("");
//       story22Blank1.setMinWidth(30);
//       story22Blank1.setMinHeight(100);
// story22Blank1.setStyle("-fx-background-color:rgba(255,255,255,0.7)");
     
//       //animation
//     final String story22Content = "You are on a task to deliver math worksheets.";
//     final Text story22Text = new Text(10, 20, "");
    
//     final Animation story22Animation = new Transition() {
//         {
//             setCycleDuration(Duration.millis(2000));
//         }
    
//         protected void interpolate(double frac) {
//             final int story22Length = story22Content.length();
//             final int story22N = Math.round(story22Length * (float) frac);
//             story22Label.setText(story22Content.substring(0, story22N));
//         }
        
//     };
    
//       //1) gridpane intialization
//     story22Node = new GridPane();
//     story22Node.add(story22Speaker, 2, 2);
//     story22Node.add(story22Label, 2, 3);
//     story22Node.add(story22Blank, 1, 2, 1, 1);
//     story22Node.add(story22Blank1, 1, 3, 1, 1);
//       //2) row/column intialization
//     RowConstraints story22row1 = new RowConstraints();
//     story22row1.setMinHeight(50);
//     RowConstraints story22row2 = new RowConstraints();
//     story22row2.setMinHeight(200);
//     RowConstraints story22row3 = new RowConstraints();
//     story22row3.setMinHeight(50);
//     RowConstraints story22row4 = new RowConstraints();
//     story22row4.setMinHeight(100);
//     ColumnConstraints story22col1 = new ColumnConstraints();
//     story22col1.setMinWidth(50);
//     ColumnConstraints story22col2 = new ColumnConstraints();
//     story22col2.setMinWidth(30);
//     ColumnConstraints story22col3 = new ColumnConstraints();
//     story22col3.setMinWidth(550);
//     ColumnConstraints story22col4 = new ColumnConstraints();
//     story22col4.setMinWidth(50);
//     story22Node.getRowConstraints().addAll(story22row1,story22row2,story22row3,story22row4); 
//     story22Node.getColumnConstraints().addAll(story22col1, story22col2, story22col3,story22col4); 

//       //3) background image
//     BackgroundSize story22BackgroundSize = new BackgroundSize(900, 700, true, true, true, false);
// 	//image. Replace url
//     BackgroundImage story22Image = new BackgroundImage(
//         new Image("https://cdn.discordapp.com/attachments/1261210481721348159/1268252834948976731/IMG_4334.png?ex=66b79d7e&is=66b64bfe&hm=081886eeffab90a517461193663149a1d5eab499c7d06c016db6c13a643bead3&"),
//         BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, story22BackgroundSize);
//     story22Node.setBackground(new Background(story22Image));

//     //story23
//       //variable and attributes
//     Label story23Speaker;
//     story23Speaker = new Label("");
//       story23Speaker.setStyle("-fx-text-fill:white;-fx-font-size:200%;-fx-font-weight:bold;");
//       story23Speaker.setAlignment(Pos.CENTER_LEFT);
//     Label story23Label; // story array
//     story23Label = new Label(""); // blank space
//       story23Label.setMinWidth(550);
//       story23Label.setMaxWidth(550);
//       story23Label.setMinHeight(100);  
//       story23Label.setStyle("-fx-text-fill:black;-fx-font-size:120%;-fx-background-color:rgba(255,255,255,0.7);-fx-font-weight:bold;");
//       story23Label.setAlignment(Pos.CENTER_LEFT);
//     Label story23Blank;
//     story23Blank = new Label("");
//       story23Blank.setMinWidth(30);
//       story23Blank.setMinHeight(50); 
//       story23Blank.setStyle("-fx-background-color:transparent");
//     Label story23Blank1;
//     story23Blank1 = new Label("");
//       story23Blank1.setMinWidth(30);
//       story23Blank1.setMinHeight(100);
// story23Blank1.setStyle("-fx-background-color:rgba(255,255,255,0.7)");
     
//       //animation
//     final String story23Content = "You scan over the problems and try to solve them because\nyou are a salty person.";
//     final Text story23Text = new Text(10, 20, "");
    
//     final Animation story23Animation = new Transition() {
//         {
//             setCycleDuration(Duration.millis(2000));
//         }
    
//         protected void interpolate(double frac) {
//             final int story23Length = story23Content.length();
//             final int story23N = Math.round(story23Length * (float) frac);
//             story23Label.setText(story23Content.substring(0, story23N));
//         }
        
//     };
    
//       //1) gridpane intialization
//     story23Node = new GridPane();
//     story23Node.add(story23Speaker, 2, 2);
//     story23Node.add(story23Label, 2, 3);
//     story23Node.add(story23Blank, 1, 2, 1, 1);
//     story23Node.add(story23Blank1, 1, 3, 1, 1);
//       //2) row/column intialization
//     RowConstraints story23row1 = new RowConstraints();
//     story23row1.setMinHeight(50);
//     RowConstraints story23row2 = new RowConstraints();
//     story23row2.setMinHeight(200);
//     RowConstraints story23row3 = new RowConstraints();
//     story23row3.setMinHeight(50);
//     RowConstraints story23row4 = new RowConstraints();
//     story23row4.setMinHeight(100);
//     ColumnConstraints story23col1 = new ColumnConstraints();
//     story23col1.setMinWidth(50);
//     ColumnConstraints story23col2 = new ColumnConstraints();
//     story23col2.setMinWidth(30);
//     ColumnConstraints story23col3 = new ColumnConstraints();
//     story23col3.setMinWidth(550);
//     ColumnConstraints story23col4 = new ColumnConstraints();
//     story23col4.setMinWidth(50);
//     story23Node.getRowConstraints().addAll(story23row1,story23row2,story23row3,story23row4); 
//     story23Node.getColumnConstraints().addAll(story23col1, story23col2, story23col3,story23col4); 

//       //3) background image
//     BackgroundSize story23BackgroundSize = new BackgroundSize(900, 700, true, true, true, false);
// 	//image. Replace url
//     BackgroundImage story23Image = new BackgroundImage(
//         new Image("https://cdn.discordapp.com/attachments/1261210481721348159/1268252834948976731/IMG_4334.png?ex=66b79d7e&is=66b64bfe&hm=081886eeffab90a517461193663149a1d5eab499c7d06c016db6c13a643bead3&"),
//         BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, story23BackgroundSize);
//     story23Node.setBackground(new Background(story23Image));

//     //story24
//       //variable and attributes
//     Label story24Question;
//     story24Question = new Label("What is the derivative of 2^(1-6z)?");
//       story24Question.setMinWidth(700);
//       story24Question.setMaxWidth(700);
//       story24Question.setMinHeight(60); 
//       story24Question.setMaxHeight(60); 
//       story24Question.setStyle("-fx-background-color:transparent;-fx-font-size:140%;-fx-text-fill:black;-fx-font-weight:bold;");  
//       story24Question.setAlignment(Pos.CENTER);

//     Label story24Label; // story array
//     story24Label = new Label(""); // blank space
//       story24Label.setMinWidth(700);
//       story24Label.setMaxWidth(700);
//       story24Label.setMinHeight(40);  
//       story24Label.setMaxHeight(40);  
//       story24Label.setStyle("-fx-text-fill:white;-fx-font-size:120%;-fx-background-color:transparent");
//       story24Label.setAlignment(Pos.CENTER);

//     Button story24Button1; //play
//     story24Button1 = new Button("a) 2^(1-6z)ln(2)"); //play
//       story24Button1.setStyle("-fx-background-color:transparent;-fx-font-size:120%;-fx-border-width:1px");
//       story24Button1.setFocusTraversable(false);
//       story24Button1.setMinWidth(250);
//       story24Button1.setMinHeight(50);
//       story24Button1.setMaxWidth(250);
//       story24Button1.setMaxHeight(50);
//       story24Button1.setAlignment(Pos.CENTER_LEFT);

//     Button story24Button2; //play
//     story24Button2 = new Button("b) -2(6^(1-6z))ln(4)"); //play
//       story24Button2.setStyle("-fx-background-color:transparent;-fx-font-size:120%;-fx-border-width:1px");
//       story24Button2.setFocusTraversable(false);
//       story24Button2.setMinWidth(250);
//       story24Button2.setMinHeight(50);
//       story24Button2.setMaxWidth(250);
//       story24Button2.setMaxHeight(50);
//       story24Button2.setAlignment(Pos.CENTER_LEFT);

//     Button story24Button3; //play
//     story24Button3 = new Button("c) -6(2^(1-6z))ln(2)"); //play
//       story24Button3.setStyle("-fx-background-color:transparent;-fx-font-size:120%;-fx-border-width:1px");
//       story24Button3.setFocusTraversable(false);
//       story24Button3.setMinWidth(250);
//       story24Button3.setMinHeight(50);
//       story24Button3.setMaxWidth(250);
//       story24Button3.setMaxHeight(50);
//       story24Button3.setAlignment(Pos.CENTER_LEFT);
    
     
//       //animation
//     final String story24Content = "Remember that the outside function is the exponential function itself!";
//     final Text story24Text = new Text(10, 20, "");
    
//     final Animation story24Animation = new Transition() {
//         {
//             setCycleDuration(Duration.millis(4000));
//         }
    
//         protected void interpolate(double frac) {
//             final int story24Length = story24Content.length();
//             final int story24N = Math.round(story24Length * (float) frac);
//             story24Label.setText(story24Content.substring(0, story24N));
//         }
    
//     };
      
//       //1) gridpane intialization
//     story24Node = new GridPane();
//      story24Node.add(story24Question, 0, 1, 3, 1);
//         story24Node.add(story24Label, 0, 9, 3, 1);
//         story24Node.add(story24Button1, 1, 3);
//         story24Node.add(story24Button2, 1, 5);
//         story24Node.add(story24Button3, 1, 7);
//       //2) row/column intialization
//     RowConstraints story24row1 = new RowConstraints();
//     story24row1.setMinHeight(70);
//     RowConstraints story24row2 = new RowConstraints();
//     story24row2.setMinHeight(60);
//     RowConstraints story24row3 = new RowConstraints();
//     story24row3.setMinHeight(10);
//     RowConstraints story24row4 = new RowConstraints();
//     story24row4.setMinHeight(50);
//     RowConstraints story24row5 = new RowConstraints();
//     story24row5.setMinHeight(10);
//     RowConstraints story24row6 = new RowConstraints();
//     story24row6.setMinHeight(50);
//     RowConstraints story24row7 = new RowConstraints();
//     story24row7.setMinHeight(10);
//     RowConstraints story24row8 = new RowConstraints();
//     story24row8.setMinHeight(50);
//     RowConstraints story24row9 = new RowConstraints();
//     story24row9.setMinHeight(30);
//     RowConstraints story24row10 = new RowConstraints();
//     story24row10.setMinHeight(40);
//     story24row10.setMaxHeight(40);
//     RowConstraints story24row11 = new RowConstraints();
//     story24row11.setMinHeight(20);
//     story24row11.setMaxHeight(20);
//     ColumnConstraints story24col1 = new ColumnConstraints();
//     story24col1.setMinWidth(135);
//     story24col1.setMaxWidth(135);
//     ColumnConstraints story24col2 = new ColumnConstraints();
//     story24col2.setMinWidth(470);
//     ColumnConstraints story24col3 = new ColumnConstraints();
//     story24col3.setMinWidth(30);
//     story24Node.getRowConstraints().addAll(story24row1,story24row2,story24row3,story24row4,story24row5,story24row6,story24row7,story24row8,story24row9,story24row10,story24row11); 
//     story24Node.getColumnConstraints().addAll(story24col1, story24col2, story24col3); 
//       //3) background image
//     BackgroundSize story24BackgroundSize = new BackgroundSize(900, 700, true, true, true, false);
//     BackgroundImage story24Image = new BackgroundImage(
//         new Image("https://cdn.discordapp.com/attachments/1261210481721348159/1268252834948976731/IMG_4334.png?ex=66b79d7e&is=66b64bfe&hm=081886eeffab90a517461193663149a1d5eab499c7d06c016db6c13a643bead3&"),
//         BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, story24BackgroundSize);
//     story24Node.setBackground(new Background(story24Image));

//     //story25
//       //variable and attributes
//     Label story25Question;
//     story25Question = new Label("What is the derivative of (1-8z)^1/3?");
//       story25Question.setMinWidth(700);
//       story25Question.setMaxWidth(700);
//       story25Question.setMinHeight(60); 
//       story25Question.setMaxHeight(60); 
//       story25Question.setStyle("-fx-background-color:transparent;-fx-font-size:140%;-fx-text-fill:black;-fx-font-weight:bold;");  
//       story25Question.setAlignment(Pos.CENTER);

//     Label story25Label; // story array
//     story25Label = new Label(""); // blank space
//       story25Label.setMinWidth(700);
//       story25Label.setMaxWidth(700);
//       story25Label.setMinHeight(40);  
//       story25Label.setMaxHeight(40);  
//       story25Label.setStyle("-fx-text-fill:white;-fx-font-size:120%;-fx-background-color:transparent");
//       story25Label.setAlignment(Pos.CENTER);

//     Button story25Button1; //play
//     story25Button1 = new Button("a) (-8/3)(1-8z)^-2/3"); //play
//       story25Button1.setStyle("-fx-background-color:transparent;-fx-font-size:120%;-fx-border-width:1px");
//       story25Button1.setFocusTraversable(false);
//       story25Button1.setMinWidth(250);
//       story25Button1.setMinHeight(50);
//       story25Button1.setMaxWidth(250);
//       story25Button1.setMaxHeight(50);
//       story25Button1.setAlignment(Pos.CENTER_LEFT);

//     Button story25Button2; //play
//     story25Button2 = new Button("b) (1-8z)^-2/3"); //play
//       story25Button2.setStyle("-fx-background-color:transparent;-fx-font-size:120%;-fx-border-width:1px");
//       story25Button2.setFocusTraversable(false);
//       story25Button2.setMinWidth(250);
//       story25Button2.setMinHeight(50);
//       story25Button2.setMaxWidth(250);
//       story25Button2.setMaxHeight(50);
//       story25Button2.setAlignment(Pos.CENTER_LEFT);

//     Button story25Button3; //play
//     story25Button3 = new Button("c) (-8/3)(1-8z)^-3/2"); //play
//       story25Button3.setStyle("-fx-background-color:transparent;-fx-font-size:120%;-fx-border-width:1px");
//       story25Button3.setFocusTraversable(false);
//       story25Button3.setMinWidth(250);
//       story25Button3.setMinHeight(50);
//       story25Button3.setMaxWidth(250);
//       story25Button3.setMaxHeight(50);
//       story25Button3.setAlignment(Pos.CENTER_LEFT);
    
     
//       //animation
//     final String story25Content = "Remember your chain rule!";
//     final Text story25Text = new Text(10, 20, "");
    
//     final Animation story25Animation = new Transition() {
//         {
//             setCycleDuration(Duration.millis(4000));
//         }
    
//         protected void interpolate(double frac) {
//             final int story25Length = story25Content.length();
//             final int story25N = Math.round(story25Length * (float) frac);
//             story25Label.setText(story25Content.substring(0, story25N));
//         }
    
//     };
      
//       //1) gridpane intialization
//     story25Node = new GridPane();
//      story25Node.add(story25Question, 0, 1, 3, 1);
//         story25Node.add(story25Label, 0, 9, 3, 1);
//         story25Node.add(story25Button1, 1, 3);
//         story25Node.add(story25Button2, 1, 5);
//         story25Node.add(story25Button3, 1, 7);
//       //2) row/column intialization
//     RowConstraints story25row1 = new RowConstraints();
//     story25row1.setMinHeight(70);
//     RowConstraints story25row2 = new RowConstraints();
//     story25row2.setMinHeight(60);
//     RowConstraints story25row3 = new RowConstraints();
//     story25row3.setMinHeight(10);
//     RowConstraints story25row4 = new RowConstraints();
//     story25row4.setMinHeight(50);
//     RowConstraints story25row5 = new RowConstraints();
//     story25row5.setMinHeight(10);
//     RowConstraints story25row6 = new RowConstraints();
//     story25row6.setMinHeight(50);
//     RowConstraints story25row7 = new RowConstraints();
//     story25row7.setMinHeight(10);
//     RowConstraints story25row8 = new RowConstraints();
//     story25row8.setMinHeight(50);
//     RowConstraints story25row9 = new RowConstraints();
//     story25row9.setMinHeight(30);
//     RowConstraints story25row10 = new RowConstraints();
//     story25row10.setMinHeight(40);
//     story25row10.setMaxHeight(40);
//     RowConstraints story25row11 = new RowConstraints();
//     story25row11.setMinHeight(20);
//     story25row11.setMaxHeight(20);
//     ColumnConstraints story25col1 = new ColumnConstraints();
//     story25col1.setMinWidth(135);
//     story25col1.setMaxWidth(135);
//     ColumnConstraints story25col2 = new ColumnConstraints();
//     story25col2.setMinWidth(470);
//     ColumnConstraints story25col3 = new ColumnConstraints();
//     story25col3.setMinWidth(30);
//     story25Node.getRowConstraints().addAll(story25row1,story25row2,story25row3,story25row4,story25row5,story25row6,story25row7,story25row8,story25row9,story25row10,story25row11); 
//     story25Node.getColumnConstraints().addAll(story25col1, story25col2, story25col3); 
//       //3) background image
//     BackgroundSize story25BackgroundSize = new BackgroundSize(900, 700, true, true, true, false);
//     BackgroundImage story25Image = new BackgroundImage(
//         new Image("https://cdn.discordapp.com/attachments/1261210481721348159/1268252834948976731/IMG_4334.png?ex=66b79d7e&is=66b64bfe&hm=081886eeffab90a517461193663149a1d5eab499c7d06c016db6c13a643bead3&"),
//         BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, story25BackgroundSize);
//     story25Node.setBackground(new Background(story25Image));

//     //story26
//       //variable and attributes
//     Label story26Question;
//     story26Question = new Label("What is the derivative of csc(7w)?");
//       story26Question.setMinWidth(700);
//       story26Question.setMaxWidth(700);
//       story26Question.setMinHeight(60); 
//       story26Question.setMaxHeight(60); 
//       story26Question.setStyle("-fx-background-color:transparent;-fx-font-size:140%;-fx-text-fill:black;-fx-font-weight:bold;");  
//       story26Question.setAlignment(Pos.CENTER);

//     Label story26Label; // story array
//     story26Label = new Label(""); // blank space
//       story26Label.setMinWidth(700);
//       story26Label.setMaxWidth(700);
//       story26Label.setMinHeight(40);  
//       story26Label.setMaxHeight(40);  
//       story26Label.setStyle("-fx-text-fill:white;-fx-font-size:120%;-fx-background-color:transparent");
//       story26Label.setAlignment(Pos.CENTER);

//     Button story26Button1; //play
//     story26Button1 = new Button("a) -7(csc(7w))tan(7w)"); //play
//       story26Button1.setStyle("-fx-background-color:transparent;-fx-font-size:120%;-fx-border-width:1px");
//       story26Button1.setFocusTraversable(false);
//       story26Button1.setMinWidth(250);
//       story26Button1.setMinHeight(50);
//       story26Button1.setMaxWidth(250);
//       story26Button1.setMaxHeight(50);
//       story26Button1.setAlignment(Pos.CENTER_LEFT);

//     Button story26Button2; //play
//     story26Button2 = new Button("b) -7(csc(7w))cot(7w)"); //play
//       story26Button2.setStyle("-fx-background-color:transparent;-fx-font-size:120%;-fx-border-width:1px");
//       story26Button2.setFocusTraversable(false);
//       story26Button2.setMinWidth(250);
//       story26Button2.setMinHeight(50);
//       story26Button2.setMaxWidth(250);
//       story26Button2.setMaxHeight(50);
//       story26Button2.setAlignment(Pos.CENTER_LEFT);

//     Button story26Button3; //play
//     story26Button3 = new Button("c) -7(csc(7w))cos(7w)"); //play
//       story26Button3.setStyle("-fx-background-color:transparent;-fx-font-size:120%;-fx-border-width:1px");
//       story26Button3.setFocusTraversable(false);
//       story26Button3.setMinWidth(250);
//       story26Button3.setMinHeight(50);
//       story26Button3.setMaxWidth(250);
//       story26Button3.setMaxHeight(50);
//       story26Button3.setAlignment(Pos.CENTER_LEFT);
    
     
//       //animation
//     final String story26Content = " Make sure that the inside function gets substituted.";
//     final Text story26Text = new Text(10, 20, "");
    
//     final Animation story26Animation = new Transition() {
//         {
//             setCycleDuration(Duration.millis(4000));
//         }
    
//         protected void interpolate(double frac) {
//             final int story26Length = story26Content.length();
//             final int story26N = Math.round(story26Length * (float) frac);
//             story26Label.setText(story26Content.substring(0, story26N));
//         }
    
//     };
      
//       //1) gridpane intialization
//     story26Node = new GridPane();
//      story26Node.add(story26Question, 0, 1, 3, 1);
//         story26Node.add(story26Label, 0, 9, 3, 1);
//         story26Node.add(story26Button1, 1, 3);
//         story26Node.add(story26Button2, 1, 5);
//         story26Node.add(story26Button3, 1, 7);
//       //2) row/column intialization
//     RowConstraints story26row1 = new RowConstraints();
//     story26row1.setMinHeight(70);
//     RowConstraints story26row2 = new RowConstraints();
//     story26row2.setMinHeight(60);
//     RowConstraints story26row3 = new RowConstraints();
//     story26row3.setMinHeight(10);
//     RowConstraints story26row4 = new RowConstraints();
//     story26row4.setMinHeight(50);
//     RowConstraints story26row5 = new RowConstraints();
//     story26row5.setMinHeight(10);
//     RowConstraints story26row6 = new RowConstraints();
//     story26row6.setMinHeight(50);
//     RowConstraints story26row7 = new RowConstraints();
//     story26row7.setMinHeight(10);
//     RowConstraints story26row8 = new RowConstraints();
//     story26row8.setMinHeight(50);
//     RowConstraints story26row9 = new RowConstraints();
//     story26row9.setMinHeight(30);
//     RowConstraints story26row10 = new RowConstraints();
//     story26row10.setMinHeight(40);
//     story26row10.setMaxHeight(40);
//     RowConstraints story26row11 = new RowConstraints();
//     story26row11.setMinHeight(20);
//     story26row11.setMaxHeight(20);
//     ColumnConstraints story26col1 = new ColumnConstraints();
//     story26col1.setMinWidth(135);
//     story26col1.setMaxWidth(135);
//     ColumnConstraints story26col2 = new ColumnConstraints();
//     story26col2.setMinWidth(470);
//     ColumnConstraints story26col3 = new ColumnConstraints();
//     story26col3.setMinWidth(30);
//     story26Node.getRowConstraints().addAll(story26row1,story26row2,story26row3,story26row4,story26row5,story26row6,story26row7,story26row8,story26row9,story26row10,story26row11); 
//     story26Node.getColumnConstraints().addAll(story26col1, story26col2, story26col3); 
//       //3) background image
//     BackgroundSize story26BackgroundSize = new BackgroundSize(900, 700, true, true, true, false);
//     BackgroundImage story26Image = new BackgroundImage(
//         new Image("https://cdn.discordapp.com/attachments/1261210481721348159/1268252834948976731/IMG_4334.png?ex=66b79d7e&is=66b64bfe&hm=081886eeffab90a517461193663149a1d5eab499c7d06c016db6c13a643bead3&"),
//         BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, story26BackgroundSize);
//     story26Node.setBackground(new Background(story26Image));

//     //story27
//       //variable and attributes
//     Label story27Speaker;
//     story27Speaker = new Label("");
//       story27Speaker.setStyle("-fx-text-fill:white;-fx-font-size:200%;-fx-font-weight:bold;");
//       story27Speaker.setAlignment(Pos.CENTER_LEFT);
//     Label story27Label; // story array
//     story27Label = new Label(""); // blank space
//       story27Label.setMinWidth(550);
//       story27Label.setMaxWidth(550);
//       story27Label.setMinHeight(100);  
//       story27Label.setStyle("-fx-text-fill:black;-fx-font-size:120%;-fx-background-color:rgba(255,255,255,0.7);-fx-font-weight:bold;");
//       story27Label.setAlignment(Pos.CENTER_LEFT);
//     Label story27Blank;
//     story27Blank = new Label("");
//       story27Blank.setMinWidth(30);
//       story27Blank.setMinHeight(50); 
//       story27Blank.setStyle("-fx-background-color:transparent");
//     Label story27Blank1;
//     story27Blank1 = new Label("");
//       story27Blank1.setMinWidth(30);
//       story27Blank1.setMinHeight(100);
// story27Blank1.setStyle("-fx-background-color:rgba(255,255,255,0.7)");
     
//       //animation
//     final String story27Content = "You intrude on Mr. Enriquez teaching Math 1.";
//     final Text story27Text = new Text(10, 20, "");
    
//     final Animation story27Animation = new Transition() {
//         {
//             setCycleDuration(Duration.millis(2000));
//         }
    
//         protected void interpolate(double frac) {
//             final int story27Length = story27Content.length();
//             final int story27N = Math.round(story27Length * (float) frac);
//             story27Label.setText(story27Content.substring(0, story27N));
//         }
        
//     };
    
//       //1) gridpane intialization
//     story27Node = new GridPane();
//     story27Node.add(story27Speaker, 2, 2);
//     story27Node.add(story27Label, 2, 3);
//     story27Node.add(story27Blank, 1, 2, 1, 1);
//     story27Node.add(story27Blank1, 1, 3, 1, 1);
//       //2) row/column intialization
//     RowConstraints story27row1 = new RowConstraints();
//     story27row1.setMinHeight(50);
//     RowConstraints story27row2 = new RowConstraints();
//     story27row2.setMinHeight(200);
//     RowConstraints story27row3 = new RowConstraints();
//     story27row3.setMinHeight(50);
//     RowConstraints story27row4 = new RowConstraints();
//     story27row4.setMinHeight(100);
//     ColumnConstraints story27col1 = new ColumnConstraints();
//     story27col1.setMinWidth(50);
//     ColumnConstraints story27col2 = new ColumnConstraints();
//     story27col2.setMinWidth(30);
//     ColumnConstraints story27col3 = new ColumnConstraints();
//     story27col3.setMinWidth(550);
//     ColumnConstraints story27col4 = new ColumnConstraints();
//     story27col4.setMinWidth(50);
//     story27Node.getRowConstraints().addAll(story27row1,story27row2,story27row3,story27row4); 
//     story27Node.getColumnConstraints().addAll(story27col1, story27col2, story27col3,story27col4); 

//       //3) background image
//     BackgroundSize story27BackgroundSize = new BackgroundSize(900, 700, true, true, true, false);
// 	//image. Replace url
//     BackgroundImage story27Image = new BackgroundImage(
//         new Image("https://cdn.discordapp.com/attachments/1261210481721348159/1268252834948976731/IMG_4334.png?ex=66b79d7e&is=66b64bfe&hm=081886eeffab90a517461193663149a1d5eab499c7d06c016db6c13a643bead3&"),
//         BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, story27BackgroundSize);
//     story27Node.setBackground(new Background(story27Image));

//     //story28
//       //variable and attributes
//     Label story28Speaker;
//     story28Speaker = new Label("");
//     story28Speaker.textProperty().bind(Bindings.concat(tf1.textProperty(), " ") );
//       story28Speaker.setStyle("-fx-text-fill:white;-fx-font-size:200%;-fx-font-weight:bold;");
//       story28Speaker.setAlignment(Pos.CENTER_LEFT);
//     Label story28Label; // story array
//     story28Label = new Label(""); // blank space
//       story28Label.setMinWidth(550);
//       story28Label.setMaxWidth(550);
//       story28Label.setMinHeight(100);  
//       story28Label.setStyle("-fx-text-fill:black;-fx-font-size:120%;-fx-background-color:rgba(255,255,255,0.7);");
//       story28Label.setAlignment(Pos.CENTER_LEFT);
//     Label story28Blank;
//     story28Blank = new Label("");
//       story28Blank.setMinWidth(30);
//       story28Blank.setMinHeight(50); 
//       story28Blank.setStyle("-fx-background-color:transparent");
//     Label story28Blank1;
//     story28Blank1 = new Label("");
//       story28Blank1.setMinWidth(30);
//       story28Blank1.setMinHeight(100);
// story28Blank1.setStyle("-fx-background-color:rgba(255,255,255,0.7)");
     
//       //animation
//     final String story28Content = "Sorry for the intrusion, here are the worksheets you needed.";
//     final Text story28Text = new Text(10, 20, "");
    
//     final Animation story28Animation = new Transition() {
//         {
//             setCycleDuration(Duration.millis(2000));
//         }
    
//         protected void interpolate(double frac) {
//             final int story28Length = story28Content.length();
//             final int story28N = Math.round(story28Length * (float) frac);
//             story28Label.setText(story28Content.substring(0, story28N));
//         }
        
//     };
    
//       //1) gridpane intialization
//     story28Node = new GridPane();
//     story28Node.add(story28Speaker, 2, 2);
//     story28Node.add(story28Label, 2, 3);
//     story28Node.add(story28Blank, 1, 2, 1, 1);
//     story28Node.add(story28Blank1, 1, 3, 1, 1);
//       //2) row/column intialization
//     RowConstraints story28row1 = new RowConstraints();
//     story28row1.setMinHeight(50);
//     RowConstraints story28row2 = new RowConstraints();
//     story28row2.setMinHeight(200);
//     RowConstraints story28row3 = new RowConstraints();
//     story28row3.setMinHeight(50);
//     RowConstraints story28row4 = new RowConstraints();
//     story28row4.setMinHeight(100);
//     ColumnConstraints story28col1 = new ColumnConstraints();
//     story28col1.setMinWidth(50);
//     ColumnConstraints story28col2 = new ColumnConstraints();
//     story28col2.setMinWidth(30);
//     ColumnConstraints story28col3 = new ColumnConstraints();
//     story28col3.setMinWidth(550);
//     ColumnConstraints story28col4 = new ColumnConstraints();
//     story28col4.setMinWidth(50);
//     story28Node.getRowConstraints().addAll(story28row1,story28row2,story28row3,story28row4); 
//     story28Node.getColumnConstraints().addAll(story28col1, story28col2, story28col3,story28col4); 

//       //3) background image
//     BackgroundSize story28BackgroundSize = new BackgroundSize(900, 700, true, true, true, false);
// 	//image. Replace url
//     BackgroundImage story28Image = new BackgroundImage(
//         new Image("https://cdn.discordapp.com/attachments/1261210481721348159/1268252834948976731/IMG_4334.png?ex=66b79d7e&is=66b64bfe&hm=081886eeffab90a517461193663149a1d5eab499c7d06c016db6c13a643bead3&"),
//         BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, story28BackgroundSize);
//     story28Node.setBackground(new Background(story28Image));

//     //story29
//       //variable and attributes
//     Label story29Speaker;
//     story29Speaker = new Label("Mr. Enriquez");
//       story29Speaker.setStyle("-fx-text-fill:white;-fx-font-size:200%;-fx-font-weight:bold");
//       story29Speaker.setAlignment(Pos.CENTER_LEFT);
//     Label story29Label; // story array
//     story29Label = new Label(""); // blank space
//       story29Label.setMinWidth(550);
//       story29Label.setMaxWidth(550);
//       story29Label.setMinHeight(100);  
//       story29Label.setStyle("-fx-text-fill:black;-fx-font-size:120%;-fx-background-color:rgba(255,255,255,0.7);");
//       story29Label.setAlignment(Pos.CENTER_LEFT);
//     Label story29Blank;
//     story29Blank = new Label("");
//       story29Blank.setMinWidth(30);
//       story29Blank.setMinHeight(50); 
//       story29Blank.setStyle("-fx-background-color:transparent");
//     Label story29Blank1;
//     story29Blank1 = new Label("");
//       story29Blank1.setMinWidth(30);
//       story29Blank1.setMinHeight(100);
// story29Blank1.setStyle("-fx-background-color:rgba(255,255,255,0.7)");
     
//       //animation
//     final String story29Content = "Oh. Salamat so much!";
//     final Text story29Text = new Text(10, 20, "");
    
//     final Animation story29Animation = new Transition() {
//         {
//             setCycleDuration(Duration.millis(1000));
//         }
    
//         protected void interpolate(double frac) {
//             final int story29Length = story29Content.length();
//             final int story29N = Math.round(story29Length * (float) frac);
//             story29Label.setText(story29Content.substring(0, story29N));
//         }
        
//     };
    
//       //1) gridpane intialization
//     story29Node = new GridPane();
//     story29Node.add(story29Speaker, 2, 2);
//     story29Node.add(story29Label, 2, 3);
//     story29Node.add(story29Blank, 1, 2, 1, 1);
//     story29Node.add(story29Blank1, 1, 3, 1, 1);
//       //2) row/column intialization
//     RowConstraints story29row1 = new RowConstraints();
//     story29row1.setMinHeight(50);
//     RowConstraints story29row2 = new RowConstraints();
//     story29row2.setMinHeight(200);
//     RowConstraints story29row3 = new RowConstraints();
//     story29row3.setMinHeight(50);
//     RowConstraints story29row4 = new RowConstraints();
//     story29row4.setMinHeight(100);
//     ColumnConstraints story29col1 = new ColumnConstraints();
//     story29col1.setMinWidth(50);
//     ColumnConstraints story29col2 = new ColumnConstraints();
//     story29col2.setMinWidth(30);
//     ColumnConstraints story29col3 = new ColumnConstraints();
//     story29col3.setMinWidth(550);
//     ColumnConstraints story29col4 = new ColumnConstraints();
//     story29col4.setMinWidth(50);
//     story29Node.getRowConstraints().addAll(story29row1,story29row2,story29row3,story29row4); 
//     story29Node.getColumnConstraints().addAll(story29col1, story29col2, story29col3,story29col4); 

//       //3) background image
//     BackgroundSize story29BackgroundSize = new BackgroundSize(900, 700, true, true, true, false);
// 	//image. Replace url
//     BackgroundImage story29Image = new BackgroundImage(
//         new Image("https://cdn.discordapp.com/attachments/1261210481721348159/1268252834948976731/IMG_4334.png?ex=66b79d7e&is=66b64bfe&hm=081886eeffab90a517461193663149a1d5eab499c7d06c016db6c13a643bead3&"),
//         BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, story29BackgroundSize);
//     story29Node.setBackground(new Background(story29Image));

//     //story30
//       //variable and attributes
//     Button story30Option1;
//     story30Option1 = new Button("Calculus joke");
//       story30Option1.setStyle("-fx-background-color:white;-fx-text-fill:black;-fx-font-size:200%;-fx-border-width:3px;-fx-border-color:#554646;-fx-border-radius:3px");
//       story30Option1.setFocusTraversable(false);
//       story30Option1.setMinWidth(300);
//       story30Option1.setMaxWidth(300);
//       story30Option1.setMinHeight(85);
//       story30Option1.setMaxHeight(85);
    
//     Button story30Option2;
//     story30Option2 = new Button("Java joke");
//       story30Option2.setStyle("-fx-background-color:white;-fx-text-fill:black;-fx-font-size:200%;-fx-border-width:3px;-fx-border-color:#554646;-fx-border-radius:3px");
//       story30Option2.setFocusTraversable(false);
//       story30Option2.setMinWidth(300);
//       story30Option2.setMaxWidth(300);
//       story30Option2.setMinHeight(85);

//       //1) gridpane intialization
//     story30Node = new GridPane();
//     story30Node.add(story30Option1, 1, 1);
//     story30Node.add(story30Option2, 1, 3);
//       //2) row/column intialization
//     RowConstraints story30row1 = new RowConstraints();
//     story30row1.setMinHeight(100);
//     RowConstraints story30row2 = new RowConstraints();
//     story30row2.setMinHeight(85);
//     RowConstraints story30row3 = new RowConstraints();
//     story30row3.setMinHeight(30);
//     RowConstraints story30row4 = new RowConstraints();
//     story30row4.setMinHeight(85);
//     RowConstraints story30row5 = new RowConstraints();
//     story30row5.setMinHeight(100);
//     ColumnConstraints story30col1 = new ColumnConstraints();
//     story30col1.setMinWidth(200);
//     ColumnConstraints story30col2 = new ColumnConstraints();
//     story30col2.setMinWidth(300);
//     ColumnConstraints story30col3 = new ColumnConstraints();
//     story30col3.setMinWidth(200);
//     story30Node.getRowConstraints().addAll(story30row1,story30row2,story30row3,story30row4, story30row5); 
//     story30Node.getColumnConstraints().addAll(story30col1, story30col2, story30col3); 
//       //3) background image
//     BackgroundSize story30BackgroundSize = new BackgroundSize(900, 700, true, true, true, false);
//     BackgroundImage story30Image = new BackgroundImage(
//         new Image("https://cdn.discordapp.com/attachments/1261210481721348159/1268252834948976731/IMG_4334.png?ex=66b79d7e&is=66b64bfe&hm=081886eeffab90a517461193663149a1d5eab499c7d06c016db6c13a643bead3&"),
//         BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, story30BackgroundSize);
//     story30Node.setBackground(new Background(story30Image));

//     //story31
//       //variable and attributes
//     Label story31Speaker;
//     story31Speaker = new Label("");
//     story31Speaker.textProperty().bind(Bindings.concat(tf1.textProperty(), " ") );
//       story31Speaker.setStyle("-fx-text-fill:white;-fx-font-size:200%;-fx-font-weight:bold;");
//       story31Speaker.setAlignment(Pos.CENTER_LEFT);
//     Label story31Label; // story array
//     story31Label = new Label(""); // blank space
//       story31Label.setMinWidth(550);
//       story31Label.setMaxWidth(550);
//       story31Label.setMinHeight(100);  
//       story31Label.setStyle("-fx-text-fill:black;-fx-font-size:120%;-fx-background-color:rgba(255,255,255,0.7);");
//       story31Label.setAlignment(Pos.CENTER_LEFT);
//     Label story31Blank;
//     story31Blank = new Label("");
//       story31Blank.setMinWidth(30);
//       story31Blank.setMinHeight(50); 
//       story31Blank.setStyle("-fx-background-color:transparent");
//     Label story31Blank1;
//     story31Blank1 = new Label("");
//       story31Blank1.setMinWidth(30);
//       story31Blank1.setMinHeight(100);
// story31Blank1.setStyle("-fx-background-color:rgba(255,255,255,0.7)");
     
//       //animation
//     final String story31Content = "You wanna know something…?";
//     final Text story31Text = new Text(10, 20, "");
    
//     final Animation story31Animation = new Transition() {
//         {
//             setCycleDuration(Duration.millis(1000));
//         }
    
//         protected void interpolate(double frac) {
//             final int story31Length = story31Content.length();
//             final int story31N = Math.round(story31Length * (float) frac);
//             story31Label.setText(story31Content.substring(0, story31N));
//         }
        
//     };
    
//       //1) gridpane intialization
//     story31Node = new GridPane();
//     story31Node.add(story31Speaker, 2, 2);
//     story31Node.add(story31Label, 2, 3);
//     story31Node.add(story31Blank, 1, 2, 1, 1);
//     story31Node.add(story31Blank1, 1, 3, 1, 1);
//       //2) row/column intialization
//     RowConstraints story31row1 = new RowConstraints();
//     story31row1.setMinHeight(50);
//     RowConstraints story31row2 = new RowConstraints();
//     story31row2.setMinHeight(200);
//     RowConstraints story31row3 = new RowConstraints();
//     story31row3.setMinHeight(50);
//     RowConstraints story31row4 = new RowConstraints();
//     story31row4.setMinHeight(100);
//     ColumnConstraints story31col1 = new ColumnConstraints();
//     story31col1.setMinWidth(50);
//     ColumnConstraints story31col2 = new ColumnConstraints();
//     story31col2.setMinWidth(30);
//     ColumnConstraints story31col3 = new ColumnConstraints();
//     story31col3.setMinWidth(550);
//     ColumnConstraints story31col4 = new ColumnConstraints();
//     story31col4.setMinWidth(50);
//     story31Node.getRowConstraints().addAll(story31row1,story31row2,story31row3,story31row4); 
//     story31Node.getColumnConstraints().addAll(story31col1, story31col2, story31col3,story31col4); 

//       //3) background image
//     BackgroundSize story31BackgroundSize = new BackgroundSize(900, 700, true, true, true, false);
// 	//image. Replace url
//     BackgroundImage story31Image = new BackgroundImage(
//         new Image("https://cdn.discordapp.com/attachments/1261210481721348159/1268252834948976731/IMG_4334.png?ex=66b79d7e&is=66b64bfe&hm=081886eeffab90a517461193663149a1d5eab499c7d06c016db6c13a643bead3&"),
//         BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, story31BackgroundSize);
//     story31Node.setBackground(new Background(story31Image));

//     //story32
//       //variable and attributes
//     Label story32Speaker;
//     story32Speaker = new Label("Mr. Enriquez");
//       story32Speaker.setStyle("-fx-text-fill:white;-fx-font-size:200%;-fx-font-weight:bold;");
//       story32Speaker.setAlignment(Pos.CENTER_LEFT);
//     Label story32Label; // story array
//     story32Label = new Label(""); // blank space
//       story32Label.setMinWidth(550);
//       story32Label.setMaxWidth(550);
//       story32Label.setMinHeight(100);  
//       story32Label.setStyle("-fx-text-fill:black;-fx-font-size:120%;-fx-background-color:rgba(255,255,255,0.7);");
//       story32Label.setAlignment(Pos.CENTER_LEFT);
//     Label story32Blank;
//     story32Blank = new Label("");
//       story32Blank.setMinWidth(30);
//       story32Blank.setMinHeight(50); 
//       story32Blank.setStyle("-fx-background-color:transparent");
//     Label story32Blank1;
//     story32Blank1 = new Label("");
//       story32Blank1.setMinWidth(30);
//       story32Blank1.setMinHeight(100);
// story32Blank1.setStyle("-fx-background-color:rgba(255,255,255,0.7)");
     
//       //animation
//     final String story32Content = "What?";
//     final Text story32Text = new Text(10, 20, "");
    
//     final Animation story32Animation = new Transition() {
//         {
//             setCycleDuration(Duration.millis(1000));
//         }
    
//         protected void interpolate(double frac) {
//             final int story32Length = story32Content.length();
//             final int story32N = Math.round(story32Length * (float) frac);
//             story32Label.setText(story32Content.substring(0, story32N));
//         }
        
//     };
    
//       //1) gridpane intialization
//     story32Node = new GridPane();
//     story32Node.add(story32Speaker, 2, 2);
//     story32Node.add(story32Label, 2, 3);
//     story32Node.add(story32Blank, 1, 2, 1, 1);
//     story32Node.add(story32Blank1, 1, 3, 1, 1);
//       //2) row/column intialization
//     RowConstraints story32row1 = new RowConstraints();
//     story32row1.setMinHeight(50);
//     RowConstraints story32row2 = new RowConstraints();
//     story32row2.setMinHeight(200);
//     RowConstraints story32row3 = new RowConstraints();
//     story32row3.setMinHeight(50);
//     RowConstraints story32row4 = new RowConstraints();
//     story32row4.setMinHeight(100);
//     ColumnConstraints story32col1 = new ColumnConstraints();
//     story32col1.setMinWidth(50);
//     ColumnConstraints story32col2 = new ColumnConstraints();
//     story32col2.setMinWidth(30);
//     ColumnConstraints story32col3 = new ColumnConstraints();
//     story32col3.setMinWidth(550);
//     ColumnConstraints story32col4 = new ColumnConstraints();
//     story32col4.setMinWidth(50);
//     story32Node.getRowConstraints().addAll(story32row1,story32row2,story32row3,story32row4); 
//     story32Node.getColumnConstraints().addAll(story32col1, story32col2, story32col3,story32col4); 

//       //3) background image
//     BackgroundSize story32BackgroundSize = new BackgroundSize(900, 700, true, true, true, false);
// 	//image. Replace url
//     BackgroundImage story32Image = new BackgroundImage(
//         new Image("https://cdn.discordapp.com/attachments/1261210481721348159/1268252834948976731/IMG_4334.png?ex=66b79d7e&is=66b64bfe&hm=081886eeffab90a517461193663149a1d5eab499c7d06c016db6c13a643bead3&"),
//         BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, story32BackgroundSize);
//     story32Node.setBackground(new Background(story32Image));

//     //story33
//       //variable and attributes
//     Label story33Speaker;
//     story33Speaker = new Label("");
//     story33Speaker.textProperty().bind(Bindings.concat(tf1.textProperty(), " ") );
//       story33Speaker.setStyle("-fx-text-fill:white;-fx-font-size:200%;-fx-font-weight:bold;");
//       story33Speaker.setAlignment(Pos.CENTER_LEFT);
//     Label story33Label; // story array
//     story33Label = new Label(""); // blank space
//       story33Label.setMinWidth(550);
//       story33Label.setMaxWidth(550);
//       story33Label.setMinHeight(100);  
//       story33Label.setStyle("-fx-text-fill:black;-fx-font-size:120%;-fx-background-color:rgba(255,255,255,0.7);");
//       story33Label.setAlignment(Pos.CENTER_LEFT);
//     Label story33Blank;
//     story33Blank = new Label("");
//       story33Blank.setMinWidth(30);
//       story33Blank.setMinHeight(50); 
//       story33Blank.setStyle("-fx-background-color:transparent");
//     Label story33Blank1;
//     story33Blank1 = new Label("");
//       story33Blank1.setMinWidth(30);
//       story33Blank1.setMinHeight(100);
// story33Blank1.setStyle("-fx-background-color:rgba(255,255,255,0.7)");
     
//       //animation
//     final String story33Content = "You derive me crazy!";
//     final Text story33Text = new Text(10, 20, "");
    
//     final Animation story33Animation = new Transition() {
//         {
//             setCycleDuration(Duration.millis(1000));
//         }
    
//         protected void interpolate(double frac) {
//             final int story33Length = story33Content.length();
//             final int story33N = Math.round(story33Length * (float) frac);
//             story33Label.setText(story33Content.substring(0, story33N));
//         }
        
//     };
    
//       //1) gridpane intialization
//     story33Node = new GridPane();
//     story33Node.add(story33Speaker, 2, 2);
//     story33Node.add(story33Label, 2, 3);
//     story33Node.add(story33Blank, 1, 2, 1, 1);
//     story33Node.add(story33Blank1, 1, 3, 1, 1);
//       //2) row/column intialization
//     RowConstraints story33row1 = new RowConstraints();
//     story33row1.setMinHeight(50);
//     RowConstraints story33row2 = new RowConstraints();
//     story33row2.setMinHeight(200);
//     RowConstraints story33row3 = new RowConstraints();
//     story33row3.setMinHeight(50);
//     RowConstraints story33row4 = new RowConstraints();
//     story33row4.setMinHeight(100);
//     ColumnConstraints story33col1 = new ColumnConstraints();
//     story33col1.setMinWidth(50);
//     ColumnConstraints story33col2 = new ColumnConstraints();
//     story33col2.setMinWidth(30);
//     ColumnConstraints story33col3 = new ColumnConstraints();
//     story33col3.setMinWidth(550);
//     ColumnConstraints story33col4 = new ColumnConstraints();
//     story33col4.setMinWidth(50);
//     story33Node.getRowConstraints().addAll(story33row1,story33row2,story33row3,story33row4); 
//     story33Node.getColumnConstraints().addAll(story33col1, story33col2, story33col3,story33col4); 

//       //3) background image
//     BackgroundSize story33BackgroundSize = new BackgroundSize(900, 700, true, true, true, false);
// 	//image. Replace url
//     BackgroundImage story33Image = new BackgroundImage(
//         new Image("https://cdn.discordapp.com/attachments/1261210481721348159/1268252834948976731/IMG_4334.png?ex=66b79d7e&is=66b64bfe&hm=081886eeffab90a517461193663149a1d5eab499c7d06c016db6c13a643bead3&"),
//         BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, story33BackgroundSize);
//     story33Node.setBackground(new Background(story33Image));

//     //story34
//       //variable and attributes
//     Label story34Speaker;
//     story34Speaker = new Label("Mr. Enriquez");
//       story34Speaker.setStyle("-fx-text-fill:white;-fx-font-size:200%;-fx-font-weight:bold;");
//       story34Speaker.setAlignment(Pos.CENTER_LEFT);
//     Label story34Label; // story array
//     story34Label = new Label(""); // blank space
//       story34Label.setMinWidth(550);
//       story34Label.setMaxWidth(550);
//       story34Label.setMinHeight(100);  
//       story34Label.setStyle("-fx-text-fill:black;-fx-font-size:120%;-fx-background-color:rgba(255,255,255,0.7);");
//       story34Label.setAlignment(Pos.CENTER_LEFT);
//     Label story34Blank;
//     story34Blank = new Label("");
//       story34Blank.setMinWidth(30);
//       story34Blank.setMinHeight(50); 
//       story34Blank.setStyle("-fx-background-color:transparent");
//     Label story34Blank1;
//     story34Blank1 = new Label("");
//       story34Blank1.setMinWidth(30);
//       story34Blank1.setMinHeight(100);
// story34Blank1.setStyle("-fx-background-color:rgba(255,255,255,0.7)");
     
//       //animation
//     final String story34Content = "...";
//     final Text story34Text = new Text(10, 20, "");
    
//     final Animation story34Animation = new Transition() {
//         {
//             setCycleDuration(Duration.millis(2000));
//         }
    
//         protected void interpolate(double frac) {
//             final int story34Length = story34Content.length();
//             final int story34N = Math.round(story34Length * (float) frac);
//             story34Label.setText(story34Content.substring(0, story34N));
//         }
        
//     };
    
//       //1) gridpane intialization
//     story34Node = new GridPane();
//     story34Node.add(story34Speaker, 2, 2);
//     story34Node.add(story34Label, 2, 3);
//     story34Node.add(story34Blank, 1, 2, 1, 1);
//     story34Node.add(story34Blank1, 1, 3, 1, 1);
//       //2) row/column intialization
//     RowConstraints story34row1 = new RowConstraints();
//     story34row1.setMinHeight(50);
//     RowConstraints story34row2 = new RowConstraints();
//     story34row2.setMinHeight(200);
//     RowConstraints story34row3 = new RowConstraints();
//     story34row3.setMinHeight(50);
//     RowConstraints story34row4 = new RowConstraints();
//     story34row4.setMinHeight(100);
//     ColumnConstraints story34col1 = new ColumnConstraints();
//     story34col1.setMinWidth(50);
//     ColumnConstraints story34col2 = new ColumnConstraints();
//     story34col2.setMinWidth(30);
//     ColumnConstraints story34col3 = new ColumnConstraints();
//     story34col3.setMinWidth(550);
//     ColumnConstraints story34col4 = new ColumnConstraints();
//     story34col4.setMinWidth(50);
//     story34Node.getRowConstraints().addAll(story34row1,story34row2,story34row3,story34row4); 
//     story34Node.getColumnConstraints().addAll(story34col1, story34col2, story34col3,story34col4); 

//       //3) background image
//     BackgroundSize story34BackgroundSize = new BackgroundSize(900, 700, true, true, true, false);
// 	//image. Replace url
//     BackgroundImage story34Image = new BackgroundImage(
//         new Image("https://cdn.discordapp.com/attachments/1261210481721348159/1268252834948976731/IMG_4334.png?ex=66b79d7e&is=66b64bfe&hm=081886eeffab90a517461193663149a1d5eab499c7d06c016db6c13a643bead3&"),
//         BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, story34BackgroundSize);
//     story34Node.setBackground(new Background(story34Image));

//     //story35
//       //variable and attributes
//     Label story35Speaker;
//     story35Speaker = new Label("");
//     story35Speaker.textProperty().bind(Bindings.concat(tf1.textProperty(), " ") );
//       story35Speaker.setStyle("-fx-text-fill:white;-fx-font-size:200%;-fx-font-weight:bold;");
//       story35Speaker.setAlignment(Pos.CENTER_LEFT);
//     Label story35Label; // story array
//     story35Label = new Label(""); // blank space
//       story35Label.setMinWidth(550);
//       story35Label.setMaxWidth(550);
//       story35Label.setMinHeight(100);  
//       story35Label.setStyle("-fx-text-fill:black;-fx-font-size:120%;-fx-background-color:rgba(255,255,255,0.7);");
//       story35Label.setAlignment(Pos.CENTER_LEFT);
//     Label story35Blank;
//     story35Blank = new Label("");
//       story35Blank.setMinWidth(30);
//       story35Blank.setMinHeight(50); 
//       story35Blank.setStyle("-fx-background-color:transparent");
//     Label story35Blank1;
//     story35Blank1 = new Label("");
//       story35Blank1.setMinWidth(30);
//       story35Blank1.setMinHeight(100);
// story35Blank1.setStyle("-fx-background-color:rgba(255,255,255,0.7)");
     
//       //animation
//     final String story35Content = "Wanna hear a joke?";
//     final Text story35Text = new Text(10, 20, "");
    
//     final Animation story35Animation = new Transition() {
//         {
//             setCycleDuration(Duration.millis(1000));
//         }
    
//         protected void interpolate(double frac) {
//             final int story35Length = story35Content.length();
//             final int story35N = Math.round(story35Length * (float) frac);
//             story35Label.setText(story35Content.substring(0, story35N));
//         }
        
//     };
    
//       //1) gridpane intialization
//     story35Node = new GridPane();
//     story35Node.add(story35Speaker, 2, 2);
//     story35Node.add(story35Label, 2, 3);
//     story35Node.add(story35Blank, 1, 2, 1, 1);
//     story35Node.add(story35Blank1, 1, 3, 1, 1);
//       //2) row/column intialization
//     RowConstraints story35row1 = new RowConstraints();
//     story35row1.setMinHeight(50);
//     RowConstraints story35row2 = new RowConstraints();
//     story35row2.setMinHeight(200);
//     RowConstraints story35row3 = new RowConstraints();
//     story35row3.setMinHeight(50);
//     RowConstraints story35row4 = new RowConstraints();
//     story35row4.setMinHeight(100);
//     ColumnConstraints story35col1 = new ColumnConstraints();
//     story35col1.setMinWidth(50);
//     ColumnConstraints story35col2 = new ColumnConstraints();
//     story35col2.setMinWidth(30);
//     ColumnConstraints story35col3 = new ColumnConstraints();
//     story35col3.setMinWidth(550);
//     ColumnConstraints story35col4 = new ColumnConstraints();
//     story35col4.setMinWidth(50);
//     story35Node.getRowConstraints().addAll(story35row1,story35row2,story35row3,story35row4); 
//     story35Node.getColumnConstraints().addAll(story35col1, story35col2, story35col3,story35col4); 

//       //3) background image
//     BackgroundSize story35BackgroundSize = new BackgroundSize(900, 700, true, true, true, false);
// 	//image. Replace url
//     BackgroundImage story35Image = new BackgroundImage(
//         new Image("https://cdn.discordapp.com/attachments/1261210481721348159/1268252834948976731/IMG_4334.png?ex=66b79d7e&is=66b64bfe&hm=081886eeffab90a517461193663149a1d5eab499c7d06c016db6c13a643bead3&"),
//         BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, story35BackgroundSize);
//     story35Node.setBackground(new Background(story35Image));

//     //story36
//       //variable and attributes
//     Label story36Speaker;
//     story36Speaker = new Label("Mr. Enriquez");
//       story36Speaker.setStyle("-fx-text-fill:white;-fx-font-size:200%;-fx-font-weight:bold;");
//       story36Speaker.setAlignment(Pos.CENTER_LEFT);
//     Label story36Label; // story array
//     story36Label = new Label(""); // blank space
//       story36Label.setMinWidth(550);
//       story36Label.setMaxWidth(550);
//       story36Label.setMinHeight(100);  
//       story36Label.setStyle("-fx-text-fill:black;-fx-font-size:120%;-fx-background-color:rgba(255,255,255,0.7);");
//       story36Label.setAlignment(Pos.CENTER_LEFT);
//     Label story36Blank;
//     story36Blank = new Label("");
//       story36Blank.setMinWidth(30);
//       story36Blank.setMinHeight(50); 
//       story36Blank.setStyle("-fx-background-color:transparent");
//     Label story36Blank1;
//     story36Blank1 = new Label("");
//       story36Blank1.setMinWidth(30);
//       story36Blank1.setMinHeight(100);
// story36Blank1.setStyle("-fx-background-color:rgba(255,255,255,0.7)");
     
//       //animation
//     final String story36Content = "Yes!";
//     final Text story36Text = new Text(10, 20, "");
    
//     final Animation story36Animation = new Transition() {
//         {
//             setCycleDuration(Duration.millis(500));
//         }
    
//         protected void interpolate(double frac) {
//             final int story36Length = story36Content.length();
//             final int story36N = Math.round(story36Length * (float) frac);
//             story36Label.setText(story36Content.substring(0, story36N));
//         }
        
//     };
    
//       //1) gridpane intialization
//     story36Node = new GridPane();
//     story36Node.add(story36Speaker, 2, 2);
//     story36Node.add(story36Label, 2, 3);
//     story36Node.add(story36Blank, 1, 2, 1, 1);
//     story36Node.add(story36Blank1, 1, 3, 1, 1);
//       //2) row/column intialization
//     RowConstraints story36row1 = new RowConstraints();
//     story36row1.setMinHeight(50);
//     RowConstraints story36row2 = new RowConstraints();
//     story36row2.setMinHeight(200);
//     RowConstraints story36row3 = new RowConstraints();
//     story36row3.setMinHeight(50);
//     RowConstraints story36row4 = new RowConstraints();
//     story36row4.setMinHeight(100);
//     ColumnConstraints story36col1 = new ColumnConstraints();
//     story36col1.setMinWidth(50);
//     ColumnConstraints story36col2 = new ColumnConstraints();
//     story36col2.setMinWidth(30);
//     ColumnConstraints story36col3 = new ColumnConstraints();
//     story36col3.setMinWidth(550);
//     ColumnConstraints story36col4 = new ColumnConstraints();
//     story36col4.setMinWidth(50);
//     story36Node.getRowConstraints().addAll(story36row1,story36row2,story36row3,story36row4); 
//     story36Node.getColumnConstraints().addAll(story36col1, story36col2, story36col3,story36col4); 

//       //3) background image
//     BackgroundSize story36BackgroundSize = new BackgroundSize(900, 700, true, true, true, false);
// 	//image. Replace url
//     BackgroundImage story36Image = new BackgroundImage(
//         new Image("https://cdn.discordapp.com/attachments/1261210481721348159/1268252834948976731/IMG_4334.png?ex=66b79d7e&is=66b64bfe&hm=081886eeffab90a517461193663149a1d5eab499c7d06c016db6c13a643bead3&"),
//         BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, story36BackgroundSize);
//     story36Node.setBackground(new Background(story36Image));

//     //story37
//       //variable and attributes
//     Label story37Speaker;
//     story37Speaker = new Label("");
//     story37Speaker.textProperty().bind(Bindings.concat(tf1.textProperty(), " ") );
//       story37Speaker.setStyle("-fx-text-fill:white;-fx-font-size:200%;-fx-font-weight:bold;");
//       story37Speaker.setAlignment(Pos.CENTER_LEFT);
//     Label story37Label; // story array
//     story37Label = new Label(""); // blank space
//       story37Label.setMinWidth(550);
//       story37Label.setMaxWidth(550);
//       story37Label.setMinHeight(100);  
//       story37Label.setStyle("-fx-text-fill:black;-fx-font-size:120%;-fx-background-color:rgba(255,255,255,0.7);");
//       story37Label.setAlignment(Pos.CENTER_LEFT);
//     Label story37Blank;
//     story37Blank = new Label("");
//       story37Blank.setMinWidth(30);
//       story37Blank.setMinHeight(50); 
//       story37Blank.setStyle("-fx-background-color:transparent");
//     Label story37Blank1;
//     story37Blank1 = new Label("");
//       story37Blank1.setMinWidth(30);
//       story37Blank1.setMinHeight(100);
// story37Blank1.setStyle("-fx-background-color:rgba(255,255,255,0.7)");
     
//       //animation
//     final String story37Content = "Yo mama’s SO FAT running her weight in Java results in an\nINTEGER OVERFLOW ERROR";
//     final Text story37Text = new Text(10, 20, "");
    
//     final Animation story37Animation = new Transition() {
//         {
//             setCycleDuration(Duration.millis(3000));
//         }
    
//         protected void interpolate(double frac) {
//             final int story37Length = story37Content.length();
//             final int story37N = Math.round(story37Length * (float) frac);
//             story37Label.setText(story37Content.substring(0, story37N));
//         }
        
//     };
    
//       //1) gridpane intialization
//     story37Node = new GridPane();
//     story37Node.add(story37Speaker, 2, 2);
//     story37Node.add(story37Label, 2, 3);
//     story37Node.add(story37Blank, 1, 2, 1, 1);
//     story37Node.add(story37Blank1, 1, 3, 1, 1);
//       //2) row/column intialization
//     RowConstraints story37row1 = new RowConstraints();
//     story37row1.setMinHeight(50);
//     RowConstraints story37row2 = new RowConstraints();
//     story37row2.setMinHeight(200);
//     RowConstraints story37row3 = new RowConstraints();
//     story37row3.setMinHeight(50);
//     RowConstraints story37row4 = new RowConstraints();
//     story37row4.setMinHeight(100);
//     ColumnConstraints story37col1 = new ColumnConstraints();
//     story37col1.setMinWidth(50);
//     ColumnConstraints story37col2 = new ColumnConstraints();
//     story37col2.setMinWidth(30);
//     ColumnConstraints story37col3 = new ColumnConstraints();
//     story37col3.setMinWidth(550);
//     ColumnConstraints story37col4 = new ColumnConstraints();
//     story37col4.setMinWidth(50);
//     story37Node.getRowConstraints().addAll(story37row1,story37row2,story37row3,story37row4); 
//     story37Node.getColumnConstraints().addAll(story37col1, story37col2, story37col3,story37col4); 

//       //3) background image
//     BackgroundSize story37BackgroundSize = new BackgroundSize(900, 700, true, true, true, false);
// 	//image. Replace url
//     BackgroundImage story37Image = new BackgroundImage(
//         new Image("https://cdn.discordapp.com/attachments/1261210481721348159/1268252834948976731/IMG_4334.png?ex=66b79d7e&is=66b64bfe&hm=081886eeffab90a517461193663149a1d5eab499c7d06c016db6c13a643bead3&"),
//         BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, story37BackgroundSize);
//     story37Node.setBackground(new Background(story37Image));

//     //story38
//       //variable and attributes
//     Label story38Speaker;
//     story38Speaker = new Label("Mr. Enriquez");
//       story38Speaker.setStyle("-fx-text-fill:white;-fx-font-size:200%;-fx-font-weight:bold;");
//       story38Speaker.setAlignment(Pos.CENTER_LEFT);
//     Label story38Label; // story array
//     story38Label = new Label(""); // blank space
//       story38Label.setMinWidth(550);
//       story38Label.setMaxWidth(550);
//       story38Label.setMinHeight(100);  
//       story38Label.setStyle("-fx-text-fill:black;-fx-font-size:120%;-fx-background-color:rgba(255,255,255,0.7);");
//       story38Label.setAlignment(Pos.CENTER_LEFT);
//     Label story38Blank;
//     story38Blank = new Label("");
//       story38Blank.setMinWidth(30);
//       story38Blank.setMinHeight(50); 
//       story38Blank.setStyle("-fx-background-color:transparent");
//     Label story38Blank1;
//     story38Blank1 = new Label("");
//       story38Blank1.setMinWidth(30);
//       story38Blank1.setMinHeight(100);
// story38Blank1.setStyle("-fx-background-color:rgba(255,255,255,0.7)");
     
//       //animation
//     final String story38Content = "That's a little offensive, isn't it...?";
//     final Text story38Text = new Text(10, 20, "");
    
//     final Animation story38Animation = new Transition() {
//         {
//             setCycleDuration(Duration.millis(2000));
//         }
    
//         protected void interpolate(double frac) {
//             final int story38Length = story38Content.length();
//             final int story38N = Math.round(story38Length * (float) frac);
//             story38Label.setText(story38Content.substring(0, story38N));
//         }
        
//     };
    
//       //1) gridpane intialization
//     story38Node = new GridPane();
//     story38Node.add(story38Speaker, 2, 2);
//     story38Node.add(story38Label, 2, 3);
//     story38Node.add(story38Blank, 1, 2, 1, 1);
//     story38Node.add(story38Blank1, 1, 3, 1, 1);
//       //2) row/column intialization
//     RowConstraints story38row1 = new RowConstraints();
//     story38row1.setMinHeight(50);
//     RowConstraints story38row2 = new RowConstraints();
//     story38row2.setMinHeight(200);
//     RowConstraints story38row3 = new RowConstraints();
//     story38row3.setMinHeight(50);
//     RowConstraints story38row4 = new RowConstraints();
//     story38row4.setMinHeight(100);
//     ColumnConstraints story38col1 = new ColumnConstraints();
//     story38col1.setMinWidth(50);
//     ColumnConstraints story38col2 = new ColumnConstraints();
//     story38col2.setMinWidth(30);
//     ColumnConstraints story38col3 = new ColumnConstraints();
//     story38col3.setMinWidth(550);
//     ColumnConstraints story38col4 = new ColumnConstraints();
//     story38col4.setMinWidth(50);
//     story38Node.getRowConstraints().addAll(story38row1,story38row2,story38row3,story38row4); 
//     story38Node.getColumnConstraints().addAll(story38col1, story38col2, story38col3,story38col4); 

//       //3) background image
//     BackgroundSize story38BackgroundSize = new BackgroundSize(900, 700, true, true, true, false);
// 	//image. Replace url
//     BackgroundImage story38Image = new BackgroundImage(
//         new Image("https://cdn.discordapp.com/attachments/1261210481721348159/1268252834948976731/IMG_4334.png?ex=66b79d7e&is=66b64bfe&hm=081886eeffab90a517461193663149a1d5eab499c7d06c016db6c13a643bead3&"),
//         BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, story38BackgroundSize);
//     story38Node.setBackground(new Background(story38Image));

//     //story39
//       //variable and attributes
//     Label story39Speaker;
//     story39Speaker = new Label("");
//     story39Speaker.textProperty().bind(Bindings.concat(tf1.textProperty(), " ") );
//       story39Speaker.setStyle("-fx-text-fill:white;-fx-font-size:200%;-fx-font-weight:bold;");
//       story39Speaker.setAlignment(Pos.CENTER_LEFT);
//     Label story39Label; // story array
//     story39Label = new Label(""); // blank space
//       story39Label.setMinWidth(550);
//       story39Label.setMaxWidth(550);
//       story39Label.setMinHeight(100);  
//       story39Label.setStyle("-fx-text-fill:black;-fx-font-size:120%;-fx-background-color:rgba(255,255,255,0.7);-fx-font-weight:bold;");
//       story39Label.setAlignment(Pos.CENTER_LEFT);
//     Label story39Blank;
//     story39Blank = new Label("");
//       story39Blank.setMinWidth(30);
//       story39Blank.setMinHeight(50); 
//       story39Blank.setStyle("-fx-background-color:transparent");
//     Label story39Blank1;
//     story39Blank1 = new Label("");
//       story39Blank1.setMinWidth(30);
//       story39Blank1.setMinHeight(100);
// story39Blank1.setStyle("-fx-background-color:rgba(255,255,255,0.7)");
     
//       //animation
//     final String story39Content = "Heck! My joke game wasn’t very #poggers it seems. Time\nto go watch K-Dramas and cry on my desk... ";
//     final Text story39Text = new Text(10, 20, "");
    
//     final Animation story39Animation = new Transition() {
//         {
//             setCycleDuration(Duration.millis(2700));
//         }
    
//         protected void interpolate(double frac) {
//             final int story39Length = story39Content.length();
//             final int story39N = Math.round(story39Length * (float) frac);
//             story39Label.setText(story39Content.substring(0, story39N));
//         }
        
//     };
    
//       //1) gridpane intialization
//     story39Node = new GridPane();
//     story39Node.add(story39Speaker, 2, 2);
//     story39Node.add(story39Label, 2, 3);
//     story39Node.add(story39Blank, 1, 2, 1, 1);
//     story39Node.add(story39Blank1, 1, 3, 1, 1);
//       //2) row/column intialization
//     RowConstraints story39row1 = new RowConstraints();
//     story39row1.setMinHeight(50);
//     RowConstraints story39row2 = new RowConstraints();
//     story39row2.setMinHeight(200);
//     RowConstraints story39row3 = new RowConstraints();
//     story39row3.setMinHeight(50);
//     RowConstraints story39row4 = new RowConstraints();
//     story39row4.setMinHeight(100);
//     ColumnConstraints story39col1 = new ColumnConstraints();
//     story39col1.setMinWidth(50);
//     ColumnConstraints story39col2 = new ColumnConstraints();
//     story39col2.setMinWidth(30);
//     ColumnConstraints story39col3 = new ColumnConstraints();
//     story39col3.setMinWidth(550);
//     ColumnConstraints story39col4 = new ColumnConstraints();
//     story39col4.setMinWidth(50);
//     story39Node.getRowConstraints().addAll(story39row1,story39row2,story39row3,story39row4); 
//     story39Node.getColumnConstraints().addAll(story39col1, story39col2, story39col3,story39col4); 

//       //3) background image
//     BackgroundSize story39BackgroundSize = new BackgroundSize(900, 700, true, true, true, false);
// 	//image. Replace url
//     BackgroundImage story39Image = new BackgroundImage(
//         new Image("https://cdn.discordapp.com/attachments/1261210481721348159/1268252834948976731/IMG_4334.png?ex=66b79d7e&is=66b64bfe&hm=081886eeffab90a517461193663149a1d5eab499c7d06c016db6c13a643bead3&"),
//         BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, story39BackgroundSize);
//     story39Node.setBackground(new Background(story39Image));

//     //story40
//       //variable and attributes
//     Label story40Speaker;
//     story40Speaker = new Label("");
//       story40Speaker.setStyle("-fx-text-fill:white;-fx-font-size:200%;-fx-font-weight:bold;");
//       story40Speaker.setAlignment(Pos.CENTER_LEFT);
//     Label story40Label; // story array
//     story40Label = new Label(""); // blank space
//       story40Label.setMinWidth(550);
//       story40Label.setMaxWidth(550);
//       story40Label.setMinHeight(100);  
//       story40Label.setStyle("-fx-text-fill:black;-fx-font-size:120%;-fx-background-color:rgba(255,255,255,0.7);-fx-font-weight:bold");
//       story40Label.setAlignment(Pos.CENTER_LEFT);
//     Label story40Blank;
//     story40Blank = new Label("");
//       story40Blank.setMinWidth(30);
//       story40Blank.setMinHeight(50); 
//       story40Blank.setStyle("-fx-background-color:transparent");
//     Label story40Blank1;
//     story40Blank1 = new Label("");
//       story40Blank1.setMinWidth(30);
//       story40Blank1.setMinHeight(100);
// story40Blank1.setStyle("-fx-background-color:rgba(255,255,255,0.7)");
     
//       //animation
//     final String story40Content = "You are reading your favorite manga, Demon Slayer.";
//     final Text story40Text = new Text(10, 20, "");
    
//     final Animation story40Animation = new Transition() {
//         {
//             setCycleDuration(Duration.millis(2000));
//         }
    
//         protected void interpolate(double frac) {
//             final int story40Length = story40Content.length();
//             final int story40N = Math.round(story40Length * (float) frac);
//             story40Label.setText(story40Content.substring(0, story40N));
//         }
        
//     };
    
//       //1) gridpane intialization
//     story40Node = new GridPane();
//     story40Node.add(story40Speaker, 2, 2);
//     story40Node.add(story40Label, 2, 3);
//     story40Node.add(story40Blank, 1, 2, 1, 1);
//     story40Node.add(story40Blank1, 1, 3, 1, 1);
//       //2) row/column intialization
//     RowConstraints story40row1 = new RowConstraints();
//     story40row1.setMinHeight(50);
//     RowConstraints story40row2 = new RowConstraints();
//     story40row2.setMinHeight(200);
//     RowConstraints story40row3 = new RowConstraints();
//     story40row3.setMinHeight(50);
//     RowConstraints story40row4 = new RowConstraints();
//     story40row4.setMinHeight(100);
//     ColumnConstraints story40col1 = new ColumnConstraints();
//     story40col1.setMinWidth(50);
//     ColumnConstraints story40col2 = new ColumnConstraints();
//     story40col2.setMinWidth(30);
//     ColumnConstraints story40col3 = new ColumnConstraints();
//     story40col3.setMinWidth(550);
//     ColumnConstraints story40col4 = new ColumnConstraints();
//     story40col4.setMinWidth(50);
//     story40Node.getRowConstraints().addAll(story40row1,story40row2,story40row3,story40row4); 
//     story40Node.getColumnConstraints().addAll(story40col1, story40col2, story40col3,story40col4); 

//       //3) background image
//     BackgroundSize story40BackgroundSize = new BackgroundSize(900, 700, true, true, true, false);
// 	//image. Replace url
//     BackgroundImage story40Image = new BackgroundImage(
//         new Image("https://cdn.discordapp.com/attachments/1261210481721348159/1268252834948976731/IMG_4334.png?ex=66b79d7e&is=66b64bfe&hm=081886eeffab90a517461193663149a1d5eab499c7d06c016db6c13a643bead3&"),
//         BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, story40BackgroundSize);
//     story40Node.setBackground(new Background(story40Image));

//     //story41
//       //variable and attributes
//     Label story41Speaker;
//     story41Speaker = new Label("");
//       story41Speaker.setStyle("-fx-text-fill:white;-fx-font-size:200%;-fx-font-weight:bold;");
//       story41Speaker.setAlignment(Pos.CENTER_LEFT);
//     Label story41Label; // story array
//     story41Label = new Label(""); // blank space
//       story41Label.setMinWidth(550);
//       story41Label.setMaxWidth(550);
//       story41Label.setMinHeight(100);  
//       story41Label.setStyle("-fx-text-fill:black;-fx-font-size:120%;-fx-background-color:rgba(255,255,255,0.7);-fx-font-weight:bold");
//       story41Label.setAlignment(Pos.CENTER_LEFT);
//     Label story41Blank;
//     story41Blank = new Label("");
//       story41Blank.setMinWidth(30);
//       story41Blank.setMinHeight(50); 
//       story41Blank.setStyle("-fx-background-color:transparent");
//     Label story41Blank1;
//     story41Blank1 = new Label("");
//       story41Blank1.setMinWidth(30);
//       story41Blank1.setMinHeight(100);
// story41Blank1.setStyle("-fx-background-color:rgba(255,255,255,0.7)");
     
//       //animation
//     final String story41Content = "Suddenly, the wifi cuts.... You are mad! RGRRH..!!! You\nwere getting to the best part!";
//     final Text story41Text = new Text(10, 20, "");
    
//     final Animation story41Animation = new Transition() {
//         {
//             setCycleDuration(Duration.millis(3200));
//         }
    
//         protected void interpolate(double frac) {
//             final int story41Length = story41Content.length();
//             final int story41N = Math.round(story41Length * (float) frac);
//             story41Label.setText(story41Content.substring(0, story41N));
//         }
        
//     };
    
//       //1) gridpane intialization
//     story41Node = new GridPane();
//     story41Node.add(story41Speaker, 2, 2);
//     story41Node.add(story41Label, 2, 3);
//     story41Node.add(story41Blank, 1, 2, 1, 1);
//     story41Node.add(story41Blank1, 1, 3, 1, 1);
//       //2) row/column intialization
//     RowConstraints story41row1 = new RowConstraints();
//     story41row1.setMinHeight(50);
//     RowConstraints story41row2 = new RowConstraints();
//     story41row2.setMinHeight(200);
//     RowConstraints story41row3 = new RowConstraints();
//     story41row3.setMinHeight(50);
//     RowConstraints story41row4 = new RowConstraints();
//     story41row4.setMinHeight(100);
//     ColumnConstraints story41col1 = new ColumnConstraints();
//     story41col1.setMinWidth(50);
//     ColumnConstraints story41col2 = new ColumnConstraints();
//     story41col2.setMinWidth(30);
//     ColumnConstraints story41col3 = new ColumnConstraints();
//     story41col3.setMinWidth(550);
//     ColumnConstraints story41col4 = new ColumnConstraints();
//     story41col4.setMinWidth(50);
//     story41Node.getRowConstraints().addAll(story41row1,story41row2,story41row3,story41row4); 
//     story41Node.getColumnConstraints().addAll(story41col1, story41col2, story41col3,story41col4); 

//       //3) background image
//     BackgroundSize story41BackgroundSize = new BackgroundSize(900, 700, true, true, true, false);
// 	//image. Replace url
//     BackgroundImage story41Image = new BackgroundImage(
//         new Image("https://cdn.discordapp.com/attachments/1261210481721348159/1268252834948976731/IMG_4334.png?ex=66b79d7e&is=66b64bfe&hm=081886eeffab90a517461193663149a1d5eab499c7d06c016db6c13a643bead3&"),
//         BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, story41BackgroundSize);
//     story41Node.setBackground(new Background(story41Image));

//     //story42
//       //variable and attributes
//     Label story42Speaker;
//     story42Speaker = new Label("");
//       story42Speaker.setStyle("-fx-text-fill:white;-fx-font-size:200%;-fx-font-weight:bold;");
//       story42Speaker.setAlignment(Pos.CENTER_LEFT);
//     Label story42Label; // story array
//     story42Label = new Label(""); // blank space
//       story42Label.setMinWidth(550);
//       story42Label.setMaxWidth(550);
//       story42Label.setMinHeight(100);  
//       story42Label.setStyle("-fx-text-fill:black;-fx-font-size:120%;-fx-background-color:rgba(255,255,255,0.7);-fx-font-weight:bold");
//       story42Label.setAlignment(Pos.CENTER_LEFT);
//     Label story42Blank;
//     story42Blank = new Label("");
//       story42Blank.setMinWidth(30);
//       story42Blank.setMinHeight(50); 
//       story42Blank.setStyle("-fx-background-color:transparent");
//     Label story42Blank1;
//     story42Blank1 = new Label("");
//       story42Blank1.setMinWidth(30);
//       story42Blank1.setMinHeight(100);
// story42Blank1.setStyle("-fx-background-color:rgba(255,255,255,0.7)");
     
//       //animation
//     final String story42Content = "You call Mr. Enriquez on the phone.";
//     final Text story42Text = new Text(10, 20, "");
    
//     final Animation story42Animation = new Transition() {
//         {
//             setCycleDuration(Duration.millis(1300));
//         }
    
//         protected void interpolate(double frac) {
//             final int story42Length = story42Content.length();
//             final int story42N = Math.round(story42Length * (float) frac);
//             story42Label.setText(story42Content.substring(0, story42N));
//         }
        
//     };
    
//       //1) gridpane intialization
//     story42Node = new GridPane();
//     story42Node.add(story42Speaker, 2, 2);
//     story42Node.add(story42Label, 2, 3);
//     story42Node.add(story42Blank, 1, 2, 1, 1);
//     story42Node.add(story42Blank1, 1, 3, 1, 1);
//       //2) row/column intialization
//     RowConstraints story42row1 = new RowConstraints();
//     story42row1.setMinHeight(50);
//     RowConstraints story42row2 = new RowConstraints();
//     story42row2.setMinHeight(200);
//     RowConstraints story42row3 = new RowConstraints();
//     story42row3.setMinHeight(50);
//     RowConstraints story42row4 = new RowConstraints();
//     story42row4.setMinHeight(100);
//     ColumnConstraints story42col1 = new ColumnConstraints();
//     story42col1.setMinWidth(50);
//     ColumnConstraints story42col2 = new ColumnConstraints();
//     story42col2.setMinWidth(30);
//     ColumnConstraints story42col3 = new ColumnConstraints();
//     story42col3.setMinWidth(550);
//     ColumnConstraints story42col4 = new ColumnConstraints();
//     story42col4.setMinWidth(50);
//     story42Node.getRowConstraints().addAll(story42row1,story42row2,story42row3,story42row4); 
//     story42Node.getColumnConstraints().addAll(story42col1, story42col2, story42col3,story42col4); 

//       //3) background image
//     BackgroundSize story42BackgroundSize = new BackgroundSize(900, 700, true, true, true, false);
// 	//image. Replace url
//     BackgroundImage story42Image = new BackgroundImage(
//         new Image("https://cdn.discordapp.com/attachments/1261210481721348159/1268252834948976731/IMG_4334.png?ex=66b79d7e&is=66b64bfe&hm=081886eeffab90a517461193663149a1d5eab499c7d06c016db6c13a643bead3&"),
//         BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, story42BackgroundSize);
//     story42Node.setBackground(new Background(story42Image));

//     //story43
//       //variable and attributes
//     Label story43Speaker;
//     story43Speaker = new Label("");
//     story43Speaker.textProperty().bind(Bindings.concat(tf1.textProperty(), " ") );
//       story43Speaker.setStyle("-fx-text-fill:white;-fx-font-size:200%;-fx-font-weight:bold;");
//       story43Speaker.setAlignment(Pos.CENTER_LEFT);
//     Label story43Label; // story array
//     story43Label = new Label(""); // blank space
//       story43Label.setMinWidth(550);
//       story43Label.setMaxWidth(550);
//       story43Label.setMinHeight(100);  
//       story43Label.setStyle("-fx-text-fill:black;-fx-font-size:120%;-fx-background-color:rgba(255,255,255,0.7);");
//       story43Label.setAlignment(Pos.CENTER_LEFT);
//     Label story43Blank;
//     story43Blank = new Label("");
//       story43Blank.setMinWidth(30);
//       story43Blank.setMinHeight(50); 
//       story43Blank.setStyle("-fx-background-color:transparent");
//     Label story43Blank1;
//     story43Blank1 = new Label("");
//       story43Blank1.setMinWidth(30);
//       story43Blank1.setMinHeight(100);
// story43Blank1.setStyle("-fx-background-color:rgba(255,255,255,0.7)");
     
//       //animation
//     final String story43Content = "K-Kamusta kuya Rey..! Uh-uh- erm.. w-what's the wifi password?";
//     final Text story43Text = new Text(10, 20, "");
    
//     final Animation story43Animation = new Transition() {
//         {
//             setCycleDuration(Duration.millis(2000));
//         }
    
//         protected void interpolate(double frac) {
//             final int story43Length = story43Content.length();
//             final int story43N = Math.round(story43Length * (float) frac);
//             story43Label.setText(story43Content.substring(0, story43N));
//         }
        
//     };
    
//       //1) gridpane intialization
//     story43Node = new GridPane();
//     story43Node.add(story43Speaker, 2, 2);
//     story43Node.add(story43Label, 2, 3);
//     story43Node.add(story43Blank, 1, 2, 1, 1);
//     story43Node.add(story43Blank1, 1, 3, 1, 1);
//       //2) row/column intialization
//     RowConstraints story43row1 = new RowConstraints();
//     story43row1.setMinHeight(50);
//     RowConstraints story43row2 = new RowConstraints();
//     story43row2.setMinHeight(200);
//     RowConstraints story43row3 = new RowConstraints();
//     story43row3.setMinHeight(50);
//     RowConstraints story43row4 = new RowConstraints();
//     story43row4.setMinHeight(100);
//     ColumnConstraints story43col1 = new ColumnConstraints();
//     story43col1.setMinWidth(50);
//     ColumnConstraints story43col2 = new ColumnConstraints();
//     story43col2.setMinWidth(30);
//     ColumnConstraints story43col3 = new ColumnConstraints();
//     story43col3.setMinWidth(550);
//     ColumnConstraints story43col4 = new ColumnConstraints();
//     story43col4.setMinWidth(50);
//     story43Node.getRowConstraints().addAll(story43row1,story43row2,story43row3,story43row4); 
//     story43Node.getColumnConstraints().addAll(story43col1, story43col2, story43col3,story43col4); 

//       //3) background image
//     BackgroundSize story43BackgroundSize = new BackgroundSize(900, 700, true, true, true, false);
// 	//image. Replace url
//     BackgroundImage story43Image = new BackgroundImage(
//         new Image("https://cdn.discordapp.com/attachments/1261210481721348159/1268252834948976731/IMG_4334.png?ex=66b79d7e&is=66b64bfe&hm=081886eeffab90a517461193663149a1d5eab499c7d06c016db6c13a643bead3&"),
//         BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, story43BackgroundSize);
//     story43Node.setBackground(new Background(story43Image));

//     //story44
//       //variable and attributes
//     Label story44Speaker;
//     story44Speaker = new Label("Mr. Enriquez");
//       story44Speaker.setStyle("-fx-text-fill:white;-fx-font-size:200%;-fx-font-weight:bold;");
//       story44Speaker.setAlignment(Pos.CENTER_LEFT);
//     Label story44Label; // story array
//     story44Label = new Label(""); // blank space
//       story44Label.setMinWidth(550);
//       story44Label.setMaxWidth(550);
//       story44Label.setMinHeight(100);  
//       story44Label.setStyle("-fx-text-fill:black;-fx-font-size:120%;-fx-background-color:rgba(255,255,255,0.7);");
//       story44Label.setAlignment(Pos.CENTER_LEFT);
//     Label story44Blank;
//     story44Blank = new Label("");
//       story44Blank.setMinWidth(30);
//       story44Blank.setMinHeight(50); 
//       story44Blank.setStyle("-fx-background-color:transparent");
//     Label story44Blank1;
//     story44Blank1 = new Label("");
//       story44Blank1.setMinWidth(30);
//       story44Blank1.setMinHeight(100);
// story44Blank1.setStyle("-fx-background-color:rgba(255,255,255,0.7)");
     
//       //animation
//     final String story44Content = "Kamusta. I’ll tell you if you can complete these three Calculus\nproblems.";
//     final Text story44Text = new Text(10, 20, "");
    
//     final Animation story44Animation = new Transition() {
//         {
//             setCycleDuration(Duration.millis(2400));
//         }
    
//         protected void interpolate(double frac) {
//             final int story44Length = story44Content.length();
//             final int story44N = Math.round(story44Length * (float) frac);
//             story44Label.setText(story44Content.substring(0, story44N));
//         }
        
//     };
    
//       //1) gridpane intialization
//     story44Node = new GridPane();
//     story44Node.add(story44Speaker, 2, 2);
//     story44Node.add(story44Label, 2, 3);
//     story44Node.add(story44Blank, 1, 2, 1, 1);
//     story44Node.add(story44Blank1, 1, 3, 1, 1);
//       //2) row/column intialization
//     RowConstraints story44row1 = new RowConstraints();
//     story44row1.setMinHeight(50);
//     RowConstraints story44row2 = new RowConstraints();
//     story44row2.setMinHeight(200);
//     RowConstraints story44row3 = new RowConstraints();
//     story44row3.setMinHeight(50);
//     RowConstraints story44row4 = new RowConstraints();
//     story44row4.setMinHeight(100);
//     ColumnConstraints story44col1 = new ColumnConstraints();
//     story44col1.setMinWidth(50);
//     ColumnConstraints story44col2 = new ColumnConstraints();
//     story44col2.setMinWidth(30);
//     ColumnConstraints story44col3 = new ColumnConstraints();
//     story44col3.setMinWidth(550);
//     ColumnConstraints story44col4 = new ColumnConstraints();
//     story44col4.setMinWidth(50);
//     story44Node.getRowConstraints().addAll(story44row1,story44row2,story44row3,story44row4); 
//     story44Node.getColumnConstraints().addAll(story44col1, story44col2, story44col3,story44col4); 

//       //3) background image
//     BackgroundSize story44BackgroundSize = new BackgroundSize(900, 700, true, true, true, false);
// 	//image. Replace url
//     BackgroundImage story44Image = new BackgroundImage(
//         new Image("https://cdn.discordapp.com/attachments/1261210481721348159/1268252834948976731/IMG_4334.png?ex=66b79d7e&is=66b64bfe&hm=081886eeffab90a517461193663149a1d5eab499c7d06c016db6c13a643bead3&"),
//         BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, story44BackgroundSize);
//     story44Node.setBackground(new Background(story44Image));

//     //story45
//       //variable and attributes
//     Label story45Speaker;
//     story45Speaker = new Label("");
//     story45Speaker.textProperty().bind(Bindings.concat(tf1.textProperty(), " ") );
//       story45Speaker.setStyle("-fx-text-fill:white;-fx-font-size:200%;-fx-font-weight:bold;");
//       story45Speaker.setAlignment(Pos.CENTER_LEFT);
//     Label story45Label; // story array
//     story45Label = new Label(""); // blank space
//       story45Label.setMinWidth(550);
//       story45Label.setMaxWidth(550);
//       story45Label.setMinHeight(100);  
//       story45Label.setStyle("-fx-text-fill:black;-fx-font-size:120%;-fx-background-color:rgba(255,255,255,0.7);-fx-font-weight:bold");
//       story45Label.setAlignment(Pos.CENTER_LEFT);
//     Label story45Blank;
//     story45Blank = new Label("");
//       story45Blank.setMinWidth(30);
//       story45Blank.setMinHeight(50); 
//       story45Blank.setStyle("-fx-background-color:transparent");
//     Label story45Blank1;
//     story45Blank1 = new Label("");
//       story45Blank1.setMinWidth(30);
//       story45Blank1.setMinHeight(100);
// story45Blank1.setStyle("-fx-background-color:rgba(255,255,255,0.7)");
     
//       //animation
//     final String story45Content = "Are we gatekeeping wifi passwords now? Ugh whatever..\nThe things I do for my favorite fellow math fan...";
//     final Text story45Text = new Text(10, 20, "");
    
//     final Animation story45Animation = new Transition() {
//         {
//             setCycleDuration(Duration.millis(4000));
//         }
    
//         protected void interpolate(double frac) {
//             final int story45Length = story45Content.length();
//             final int story45N = Math.round(story45Length * (float) frac);
//             story45Label.setText(story45Content.substring(0, story45N));
//         }
        
//     };
    
//       //1) gridpane intialization
//     story45Node = new GridPane();
//     story45Node.add(story45Speaker, 2, 2);
//     story45Node.add(story45Label, 2, 3);
//     story45Node.add(story45Blank, 1, 2, 1, 1);
//     story45Node.add(story45Blank1, 1, 3, 1, 1);
//       //2) row/column intialization
//     RowConstraints story45row1 = new RowConstraints();
//     story45row1.setMinHeight(50);
//     RowConstraints story45row2 = new RowConstraints();
//     story45row2.setMinHeight(200);
//     RowConstraints story45row3 = new RowConstraints();
//     story45row3.setMinHeight(50);
//     RowConstraints story45row4 = new RowConstraints();
//     story45row4.setMinHeight(100);
//     ColumnConstraints story45col1 = new ColumnConstraints();
//     story45col1.setMinWidth(50);
//     ColumnConstraints story45col2 = new ColumnConstraints();
//     story45col2.setMinWidth(30);
//     ColumnConstraints story45col3 = new ColumnConstraints();
//     story45col3.setMinWidth(550);
//     ColumnConstraints story45col4 = new ColumnConstraints();
//     story45col4.setMinWidth(50);
//     story45Node.getRowConstraints().addAll(story45row1,story45row2,story45row3,story45row4); 
//     story45Node.getColumnConstraints().addAll(story45col1, story45col2, story45col3,story45col4); 

//       //3) background image
//     BackgroundSize story45BackgroundSize = new BackgroundSize(900, 700, true, true, true, false);
// 	//image. Replace url
//     BackgroundImage story45Image = new BackgroundImage(
//         new Image("https://cdn.discordapp.com/attachments/1261210481721348159/1268252834948976731/IMG_4334.png?ex=66b79d7e&is=66b64bfe&hm=081886eeffab90a517461193663149a1d5eab499c7d06c016db6c13a643bead3&"),
//         BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, story45BackgroundSize);
//     story45Node.setBackground(new Background(story45Image));

//     //story46
//       //variable and attributes
//     Label story46Question;
//     story46Question = new Label("v(x) = x^3 - x^2 + x - 1, v^4(x) = ?");
//       story46Question.setMinWidth(700);
//       story46Question.setMaxWidth(700);
//       story46Question.setMinHeight(60); 
//       story46Question.setMaxHeight(60); 
//       story46Question.setStyle("-fx-background-color:transparent;-fx-font-size:140%;-fx-text-fill:black;-fx-font-weight:bold;");  
//       story46Question.setAlignment(Pos.CENTER);

//     Label story46Label; // story array
//     story46Label = new Label(""); // blank space
//       story46Label.setMinWidth(700);
//       story46Label.setMaxWidth(700);
//       story46Label.setMinHeight(40);  
//       story46Label.setMaxHeight(40);  
//       story46Label.setStyle("-fx-text-fill:white;-fx-font-size:120%;-fx-background-color:transparent");
//       story46Label.setAlignment(Pos.CENTER);

//     Button story46Button1; //play
//     story46Button1 = new Button("a) 2x"); //play
//       story46Button1.setStyle("-fx-background-color:transparent;-fx-font-size:120%;-fx-border-width:1px");
//       story46Button1.setFocusTraversable(false);
//       story46Button1.setMinWidth(250);
//       story46Button1.setMinHeight(50);
//       story46Button1.setMaxWidth(250);
//       story46Button1.setMaxHeight(50);
//       story46Button1.setAlignment(Pos.CENTER_LEFT);

//     Button story46Button2; //play
//     story46Button2 = new Button("b) 3x^2 + 2x + 1"); //play
//       story46Button2.setStyle("-fx-background-color:transparent;-fx-font-size:120%;-fx-border-width:1px");
//       story46Button2.setFocusTraversable(false);
//       story46Button2.setMinWidth(250);
//       story46Button2.setMinHeight(50);
//       story46Button2.setMaxWidth(250);
//       story46Button2.setMaxHeight(50);
//       story46Button2.setAlignment(Pos.CENTER_LEFT);

//     Button story46Button3; //play
//     story46Button3 = new Button("c) 0"); //play
//       story46Button3.setStyle("-fx-background-color:transparent;-fx-font-size:120%;-fx-border-width:1px");
//       story46Button3.setFocusTraversable(false);
//       story46Button3.setMinWidth(250);
//       story46Button3.setMinHeight(50);
//       story46Button3.setMaxWidth(250);
//       story46Button3.setMaxHeight(50);
//       story46Button3.setAlignment(Pos.CENTER_LEFT);
    
     
//       //animation
//     final String story46Content = "Remember to derive it four times!";
//     final Text story46Text = new Text(10, 20, "");
    
//     final Animation story46Animation = new Transition() {
//         {
//             setCycleDuration(Duration.millis(1000));
//         }
    
//         protected void interpolate(double frac) {
//             final int story46Length = story46Content.length();
//             final int story46N = Math.round(story46Length * (float) frac);
//             story46Label.setText(story46Content.substring(0, story46N));
//         }
    
//     };
      
//       //1) gridpane intialization
//     story46Node = new GridPane();
//      story46Node.add(story46Question, 0, 1, 3, 1);
//         story46Node.add(story46Label, 0, 9, 3, 1);
//         story46Node.add(story46Button1, 1, 3);
//         story46Node.add(story46Button2, 1, 5);
//         story46Node.add(story46Button3, 1, 7);
//       //2) row/column intialization
//     RowConstraints story46row1 = new RowConstraints();
//     story46row1.setMinHeight(70);
//     RowConstraints story46row2 = new RowConstraints();
//     story46row2.setMinHeight(60);
//     RowConstraints story46row3 = new RowConstraints();
//     story46row3.setMinHeight(10);
//     RowConstraints story46row4 = new RowConstraints();
//     story46row4.setMinHeight(50);
//     RowConstraints story46row5 = new RowConstraints();
//     story46row5.setMinHeight(10);
//     RowConstraints story46row6 = new RowConstraints();
//     story46row6.setMinHeight(50);
//     RowConstraints story46row7 = new RowConstraints();
//     story46row7.setMinHeight(10);
//     RowConstraints story46row8 = new RowConstraints();
//     story46row8.setMinHeight(50);
//     RowConstraints story46row9 = new RowConstraints();
//     story46row9.setMinHeight(30);
//     RowConstraints story46row10 = new RowConstraints();
//     story46row10.setMinHeight(40);
//     story46row10.setMaxHeight(40);
//     RowConstraints story46row11 = new RowConstraints();
//     story46row11.setMinHeight(20);
//     story46row11.setMaxHeight(20);
//     ColumnConstraints story46col1 = new ColumnConstraints();
//     story46col1.setMinWidth(135);
//     story46col1.setMaxWidth(135);
//     ColumnConstraints story46col2 = new ColumnConstraints();
//     story46col2.setMinWidth(470);
//     ColumnConstraints story46col3 = new ColumnConstraints();
//     story46col3.setMinWidth(30);
//     story46Node.getRowConstraints().addAll(story46row1,story46row2,story46row3,story46row4,story46row5,story46row6,story46row7,story46row8,story46row9,story46row10,story46row11); 
//     story46Node.getColumnConstraints().addAll(story46col1, story46col2, story46col3); 
//       //3) background image
//     BackgroundSize story46BackgroundSize = new BackgroundSize(900, 700, true, true, true, false);
//     BackgroundImage story46Image = new BackgroundImage(
//         new Image("https://cdn.discordapp.com/attachments/1261210481721348159/1268252834948976731/IMG_4334.png?ex=66b79d7e&is=66b64bfe&hm=081886eeffab90a517461193663149a1d5eab499c7d06c016db6c13a643bead3&"),
//         BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, story46BackgroundSize);
//     story46Node.setBackground(new Background(story46Image));

    
// //story47
//       //variable and attributes
//     Label story47Question;
//     story47Question = new Label("What is the second derivative of cos^2(7t)?");
//       story47Question.setMinWidth(700);
//       story47Question.setMaxWidth(700);
//       story47Question.setMinHeight(60); 
//       story47Question.setMaxHeight(60); 
//       story47Question.setStyle("-fx-background-color:transparent;-fx-font-size:140%;-fx-text-fill:black;-fx-font-weight:bold;");  
//       story47Question.setAlignment(Pos.CENTER);

//     Label story47Label; // story array
//     story47Label = new Label(""); // blank space
//       story47Label.setMinWidth(700);
//       story47Label.setMaxWidth(700);
//       story47Label.setMinHeight(40);  
//       story47Label.setMaxHeight(40);  
//       story47Label.setStyle("-fx-text-fill:white;-fx-font-size:120%;-fx-background-color:transparent");
//       story47Label.setAlignment(Pos.CENTER);

//     Button story47Button1; //play
//     story47Button1 = new Button("a) 98sin^2(7t) - 98cos^2(7t)"); //play
//       story47Button1.setStyle("-fx-background-color:transparent;-fx-font-size:120%;-fx-border-width:1px");
//       story47Button1.setFocusTraversable(false);
//       story47Button1.setMinWidth(250);
//       story47Button1.setMinHeight(50);
//       story47Button1.setMaxWidth(250);
//       story47Button1.setMaxHeight(50);
//       story47Button1.setAlignment(Pos.CENTER_LEFT);

//     Button story47Button2; //play
//     story47Button2 = new Button("b) 49sin^2(7t) - 49cos^2(7t)"); //play
//       story47Button2.setStyle("-fx-background-color:transparent;-fx-font-size:120%;-fx-border-width:1px");
//       story47Button2.setFocusTraversable(false);
//       story47Button2.setMinWidth(250);
//       story47Button2.setMinHeight(50);
//       story47Button2.setMaxWidth(250);
//       story47Button2.setMaxHeight(50);
//       story47Button2.setAlignment(Pos.CENTER_LEFT);

//     Button story47Button3; //play
//     story47Button3 = new Button("c) 98cos^2(7t) - 98sin^2(7t)"); //play
//       story47Button3.setStyle("-fx-background-color:transparent;-fx-font-size:120%;-fx-border-width:1px");
//       story47Button3.setFocusTraversable(false);
//       story47Button3.setMinWidth(250);
//       story47Button3.setMinHeight(50);
//       story47Button3.setMaxWidth(250);
//       story47Button3.setMaxHeight(50);
//       story47Button3.setAlignment(Pos.CENTER_LEFT);
    
     
//       //animation
//     final String story47Content = "Do you know your trig derivatives?";
//     final Text story47Text = new Text(10, 20, "");
    
//     final Animation story47Animation = new Transition() {
//         {
//             setCycleDuration(Duration.millis(4000));
//         }
    
//         protected void interpolate(double frac) {
//             final int story47Length = story47Content.length();
//             final int story47N = Math.round(story47Length * (float) frac);
//             story47Label.setText(story47Content.substring(0, story47N));
//         }
    
//     };
      
//       //1) gridpane intialization
//     story47Node = new GridPane();
//      story47Node.add(story47Question, 0, 1, 3, 1);
//         story47Node.add(story47Label, 0, 9, 3, 1);
//         story47Node.add(story47Button1, 1, 3);
//         story47Node.add(story47Button2, 1, 5);
//         story47Node.add(story47Button3, 1, 7);
//       //2) row/column intialization
//     RowConstraints story47row1 = new RowConstraints();
//     story47row1.setMinHeight(70);
//     RowConstraints story47row2 = new RowConstraints();
//     story47row2.setMinHeight(60);
//     RowConstraints story47row3 = new RowConstraints();
//     story47row3.setMinHeight(10);
//     RowConstraints story47row4 = new RowConstraints();
//     story47row4.setMinHeight(50);
//     RowConstraints story47row5 = new RowConstraints();
//     story47row5.setMinHeight(10);
//     RowConstraints story47row6 = new RowConstraints();
//     story47row6.setMinHeight(50);
//     RowConstraints story47row7 = new RowConstraints();
//     story47row7.setMinHeight(10);
//     RowConstraints story47row8 = new RowConstraints();
//     story47row8.setMinHeight(50);
//     RowConstraints story47row9 = new RowConstraints();
//     story47row9.setMinHeight(30);
//     RowConstraints story47row10 = new RowConstraints();
//     story47row10.setMinHeight(40);
//     story47row10.setMaxHeight(40);
//     RowConstraints story47row11 = new RowConstraints();
//     story47row11.setMinHeight(20);
//     story47row11.setMaxHeight(20);
//     ColumnConstraints story47col1 = new ColumnConstraints();
//     story47col1.setMinWidth(135);
//     story47col1.setMaxWidth(135);
//     ColumnConstraints story47col2 = new ColumnConstraints();
//     story47col2.setMinWidth(470);
//     ColumnConstraints story47col3 = new ColumnConstraints();
//     story47col3.setMinWidth(30);
//     story47Node.getRowConstraints().addAll(story47row1,story47row2,story47row3,story47row4,story47row5,story47row6,story47row7,story47row8,story47row9,story47row10,story47row11); 
//     story47Node.getColumnConstraints().addAll(story47col1, story47col2, story47col3); 
//       //3) background image
//     BackgroundSize story47BackgroundSize = new BackgroundSize(900, 700, true, true, true, false);
//     BackgroundImage story47Image = new BackgroundImage(
//         new Image("https://cdn.discordapp.com/attachments/1261210481721348159/1268252834948976731/IMG_4334.png?ex=66b79d7e&is=66b64bfe&hm=081886eeffab90a517461193663149a1d5eab499c7d06c016db6c13a643bead3&"),
//         BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, story47BackgroundSize);
//     story47Node.setBackground(new Background(story47Image));

//     //story48
//       //variable and attributes
//     Label story48Question;
//     story48Question = new Label("What is the second derivative of z = ln(7-x^3)?");
//       story48Question.setMinWidth(700);
//       story48Question.setMaxWidth(700);
//       story48Question.setMinHeight(60); 
//       story48Question.setMaxHeight(60); 
//       story48Question.setStyle("-fx-background-color:transparent;-fx-font-size:140%;-fx-text-fill:black;-fx-font-weight:bold;");  
//       story48Question.setAlignment(Pos.CENTER);

//     Label story48Label; // story array
//     story48Label = new Label(""); // blank space
//       story48Label.setMinWidth(700);
//       story48Label.setMaxWidth(700);
//       story48Label.setMinHeight(40);  
//       story48Label.setMaxHeight(40);  
//       story48Label.setStyle("-fx-text-fill:white;-fx-font-size:120%;-fx-background-color:transparent");
//       story48Label.setAlignment(Pos.CENTER);

//     Button story48Button1; //play
//     story48Button1 = new Button("a) -3x^2/(7-x^3)"); //play
//       story48Button1.setStyle("-fx-background-color:transparent;-fx-font-size:120%;-fx-border-width:1px");
//       story48Button1.setFocusTraversable(false);
//       story48Button1.setMinWidth(250);
//       story48Button1.setMinHeight(50);
//       story48Button1.setMaxWidth(250);
//       story48Button1.setMaxHeight(50);
//       story48Button1.setAlignment(Pos.CENTER_LEFT);

//     Button story48Button2; //play
//     story48Button2 = new Button("b) (-42x-3x^4)/(7-x^3)^2"); //play
//       story48Button2.setStyle("-fx-background-color:transparent;-fx-font-size:120%;-fx-border-width:1px");
//       story48Button2.setFocusTraversable(false);
//       story48Button2.setMinWidth(250);
//       story48Button2.setMinHeight(50);
//       story48Button2.setMaxWidth(250);
//       story48Button2.setMaxHeight(50);
//       story48Button2.setAlignment(Pos.CENTER_LEFT);

//     Button story48Button3; //play
//     story48Button3 = new Button("c) (7-x^2)/-3x^2"); //play
//       story48Button3.setStyle("-fx-background-color:transparent;-fx-font-size:120%;-fx-border-width:1px");
//       story48Button3.setFocusTraversable(false);
//       story48Button3.setMinWidth(250);
//       story48Button3.setMinHeight(50);
//       story48Button3.setMaxWidth(250);
//       story48Button3.setMaxHeight(50);
//       story48Button3.setAlignment(Pos.CENTER_LEFT);
    
     
//       //animation
//     final String story48Content = "Remember quotient rule?";
//     final Text story48Text = new Text(10, 20, "");
    
//     final Animation story48Animation = new Transition() {
//         {
//             setCycleDuration(Duration.millis(4000));
//         }
    
//         protected void interpolate(double frac) {
//             final int story48Length = story48Content.length();
//             final int story48N = Math.round(story48Length * (float) frac);
//             story48Label.setText(story48Content.substring(0, story48N));
//         }
    
//     };
      
//       //1) gridpane intialization
//     story48Node = new GridPane();
//      story48Node.add(story48Question, 0, 1, 3, 1);
//         story48Node.add(story48Label, 0, 9, 3, 1);
//         story48Node.add(story48Button1, 1, 3);
//         story48Node.add(story48Button2, 1, 5);
//         story48Node.add(story48Button3, 1, 7);
//       //2) row/column intialization
//     RowConstraints story48row1 = new RowConstraints();
//     story48row1.setMinHeight(70);
//     RowConstraints story48row2 = new RowConstraints();
//     story48row2.setMinHeight(60);
//     RowConstraints story48row3 = new RowConstraints();
//     story48row3.setMinHeight(10);
//     RowConstraints story48row4 = new RowConstraints();
//     story48row4.setMinHeight(50);
//     RowConstraints story48row5 = new RowConstraints();
//     story48row5.setMinHeight(10);
//     RowConstraints story48row6 = new RowConstraints();
//     story48row6.setMinHeight(50);
//     RowConstraints story48row7 = new RowConstraints();
//     story48row7.setMinHeight(10);
//     RowConstraints story48row8 = new RowConstraints();
//     story48row8.setMinHeight(50);
//     RowConstraints story48row9 = new RowConstraints();
//     story48row9.setMinHeight(30);
//     RowConstraints story48row10 = new RowConstraints();
//     story48row10.setMinHeight(40);
//     story48row10.setMaxHeight(40);
//     RowConstraints story48row11 = new RowConstraints();
//     story48row11.setMinHeight(20);
//     story48row11.setMaxHeight(20);
//     ColumnConstraints story48col1 = new ColumnConstraints();
//     story48col1.setMinWidth(135);
//     story48col1.setMaxWidth(135);
//     ColumnConstraints story48col2 = new ColumnConstraints();
//     story48col2.setMinWidth(470);
//     ColumnConstraints story48col3 = new ColumnConstraints();
//     story48col3.setMinWidth(30);
//     story48Node.getRowConstraints().addAll(story48row1,story48row2,story48row3,story48row4,story48row5,story48row6,story48row7,story48row8,story48row9,story48row10,story48row11); 
//     story48Node.getColumnConstraints().addAll(story48col1, story48col2, story48col3); 
//       //3) background image
//     BackgroundSize story48BackgroundSize = new BackgroundSize(900, 700, true, true, true, false);
//     BackgroundImage story48Image = new BackgroundImage(
//         new Image("https://cdn.discordapp.com/attachments/1261210481721348159/1268252834948976731/IMG_4334.png?ex=66b79d7e&is=66b64bfe&hm=081886eeffab90a517461193663149a1d5eab499c7d06c016db6c13a643bead3&"),
//         BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, story48BackgroundSize);
//     story48Node.setBackground(new Background(story48Image));

//     //story49
//       //variable and attributes
//     Label story49Speaker;
//     story49Speaker = new Label("Mr. Enriquez");
//       story49Speaker.setStyle("-fx-text-fill:white;-fx-font-size:200%;-fx-font-weight:bold;");
//       story49Speaker.setAlignment(Pos.CENTER_LEFT);
//     Label story49Label; // story array
//     story49Label = new Label(""); // blank space
//       story49Label.setMinWidth(550);
//       story49Label.setMaxWidth(550);
//       story49Label.setMinHeight(100);  
//       story49Label.setStyle("-fx-text-fill:black;-fx-font-size:120%;-fx-background-color:rgba(255,255,255,0.7);");
//       story49Label.setAlignment(Pos.CENTER_LEFT);
//     Label story49Blank;
//     story49Blank = new Label("");
//       story49Blank.setMinWidth(30);
//       story49Blank.setMinHeight(50); 
//       story49Blank.setStyle("-fx-background-color:transparent");
//     Label story49Blank1;
//     story49Blank1 = new Label("");
//       story49Blank1.setMinWidth(30);
//       story49Blank1.setMinHeight(100);
// story49Blank1.setStyle("-fx-background-color:rgba(255,255,255,0.7)");
     
//       //animation
//     final String story49Content = "Well done! The password is newtonEulerFan112358!";
//     final Text story49Text = new Text(10, 20, "");
    
//     final Animation story49Animation = new Transition() {
//         {
//             setCycleDuration(Duration.millis(2000));
//         }
    
//         protected void interpolate(double frac) {
//             final int story49Length = story49Content.length();
//             final int story49N = Math.round(story49Length * (float) frac);
//             story49Label.setText(story49Content.substring(0, story49N));
//         }
        
//     };
    
//       //1) gridpane intialization
//     story49Node = new GridPane();
//     story49Node.add(story49Speaker, 2, 2);
//     story49Node.add(story49Label, 2, 3);
//     story49Node.add(story49Blank, 1, 2, 1, 1);
//     story49Node.add(story49Blank1, 1, 3, 1, 1);
//       //2) row/column intialization
//     RowConstraints story49row1 = new RowConstraints();
//     story49row1.setMinHeight(50);
//     RowConstraints story49row2 = new RowConstraints();
//     story49row2.setMinHeight(200);
//     RowConstraints story49row3 = new RowConstraints();
//     story49row3.setMinHeight(50);
//     RowConstraints story49row4 = new RowConstraints();
//     story49row4.setMinHeight(100);
//     ColumnConstraints story49col1 = new ColumnConstraints();
//     story49col1.setMinWidth(50);
//     ColumnConstraints story49col2 = new ColumnConstraints();
//     story49col2.setMinWidth(30);
//     ColumnConstraints story49col3 = new ColumnConstraints();
//     story49col3.setMinWidth(550);
//     ColumnConstraints story49col4 = new ColumnConstraints();
//     story49col4.setMinWidth(50);
//     story49Node.getRowConstraints().addAll(story49row1,story49row2,story49row3,story49row4); 
//     story49Node.getColumnConstraints().addAll(story49col1, story49col2, story49col3,story49col4); 

//       //3) background image
//     BackgroundSize story49BackgroundSize = new BackgroundSize(900, 700, true, true, true, false);
// 	//image. Replace url
//     BackgroundImage story49Image = new BackgroundImage(
//         new Image("https://cdn.discordapp.com/attachments/1261210481721348159/1268252834948976731/IMG_4334.png?ex=66b79d7e&is=66b64bfe&hm=081886eeffab90a517461193663149a1d5eab499c7d06c016db6c13a643bead3&"),
//         BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, story49BackgroundSize);
//     story49Node.setBackground(new Background(story49Image));
    
//     //story50
//       //variable and attributes
//     Label story50Speaker;
//     story50Speaker = new Label("");
//     story50Speaker.textProperty().bind(Bindings.concat(tf1.textProperty(), " ") );
//       story50Speaker.setStyle("-fx-text-fill:white;-fx-font-size:200%;-fx-font-weight:bold;");
//       story50Speaker.setAlignment(Pos.CENTER_LEFT);
//     Label story50Label; // story array
//     story50Label = new Label(""); // blank space
//       story50Label.setMinWidth(550);
//       story50Label.setMaxWidth(550);
//       story50Label.setMinHeight(100);  
//       story50Label.setStyle("-fx-text-fill:black;-fx-font-size:120%;-fx-background-color:rgba(255,255,255,0.7);");
//       story50Label.setAlignment(Pos.CENTER_LEFT);
//     Label story50Blank;
//     story50Blank = new Label("");
//       story50Blank.setMinWidth(30);
//       story50Blank.setMinHeight(50); 
//       story50Blank.setStyle("-fx-background-color:transparent");
//     Label story50Blank1;
//     story50Blank1 = new Label("");
//       story50Blank1.setMinWidth(30);
//       story50Blank1.setMinHeight(100);
// story50Blank1.setStyle("-fx-background-color:rgba(255,255,255,0.7)");
     
//       //animation
//     final String story50Content = "Thanks...";
//     final Text story50Text = new Text(10, 20, "");
    
//     final Animation story50Animation = new Transition() {
//         {
//             setCycleDuration(Duration.millis(500));
//         }
    
//         protected void interpolate(double frac) {
//             final int story50Length = story50Content.length();
//             final int story50N = Math.round(story50Length * (float) frac);
//             story50Label.setText(story50Content.substring(0, story50N));
//         }
        
//     };
    
//       //1) gridpane intialization
//     story50Node = new GridPane();
//     story50Node.add(story50Speaker, 2, 2);
//     story50Node.add(story50Label, 2, 3);
//     story50Node.add(story50Blank, 1, 2, 1, 1);
//     story50Node.add(story50Blank1, 1, 3, 1, 1);
//       //2) row/column intialization
//     RowConstraints story50row1 = new RowConstraints();
//     story50row1.setMinHeight(50);
//     RowConstraints story50row2 = new RowConstraints();
//     story50row2.setMinHeight(200);
//     RowConstraints story50row3 = new RowConstraints();
//     story50row3.setMinHeight(50);
//     RowConstraints story50row4 = new RowConstraints();
//     story50row4.setMinHeight(100);
//     ColumnConstraints story50col1 = new ColumnConstraints();
//     story50col1.setMinWidth(50);
//     ColumnConstraints story50col2 = new ColumnConstraints();
//     story50col2.setMinWidth(30);
//     ColumnConstraints story50col3 = new ColumnConstraints();
//     story50col3.setMinWidth(550);
//     ColumnConstraints story50col4 = new ColumnConstraints();
//     story50col4.setMinWidth(50);
//     story50Node.getRowConstraints().addAll(story50row1,story50row2,story50row3,story50row4); 
//     story50Node.getColumnConstraints().addAll(story50col1, story50col2, story50col3,story50col4); 

//       //3) background image
//     BackgroundSize story50BackgroundSize = new BackgroundSize(900, 700, true, true, true, false);
// 	//image. Replace url
//     BackgroundImage story50Image = new BackgroundImage(
//         new Image("https://cdn.discordapp.com/attachments/1261210481721348159/1268252834948976731/IMG_4334.png?ex=66b79d7e&is=66b64bfe&hm=081886eeffab90a517461193663149a1d5eab499c7d06c016db6c13a643bead3&"),
//         BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, story50BackgroundSize);
//     story50Node.setBackground(new Background(story50Image));

//     //story51
//       //variable and attributes
//     Label story51Speaker;
//     story51Speaker = new Label("");
//       story51Speaker.setStyle("-fx-text-fill:white;-fx-font-size:200%;-fx-font-weight:bold;");
//       story51Speaker.setAlignment(Pos.CENTER_LEFT);
//     Label story51Label; // story array
//     story51Label = new Label(""); // blank space
//       story51Label.setMinWidth(550);
//       story51Label.setMaxWidth(550);
//       story51Label.setMinHeight(100);  
//       story51Label.setStyle("-fx-text-fill:black;-fx-font-size:120%;-fx-background-color:rgba(255,255,255,0.7);");
//       story51Label.setAlignment(Pos.CENTER_LEFT);
//     Label story51Blank;
//     story51Blank = new Label("");
//       story51Blank.setMinWidth(30);
//       story51Blank.setMinHeight(50); 
//       story51Blank.setStyle("-fx-background-color:transparent");
//     Label story51Blank1;
//     story51Blank1 = new Label("");
//       story51Blank1.setMinWidth(30);
//       story51Blank1.setMinHeight(100);
// story51Blank1.setStyle("-fx-background-color:rgba(255,255,255,0.7)");
     
//       //animation
//     final String story51Content = "You are packing up your backpack. You reflect on the day and the\namount of work you have to do after school.";
//     final Text story51Text = new Text(10, 20, "");
    
//     final Animation story51Animation = new Transition() {
//         {
//             setCycleDuration(Duration.millis(3000));
//         }
    
//         protected void interpolate(double frac) {
//             final int story51Length = story51Content.length();
//             final int story51N = Math.round(story51Length * (float) frac);
//             story51Label.setText(story51Content.substring(0, story51N));
//         }
        
//     };
    
//       //1) gridpane intialization
//     story51Node = new GridPane();
//     story51Node.add(story51Speaker, 2, 2);
//     story51Node.add(story51Label, 2, 3);
//     story51Node.add(story51Blank, 1, 2, 1, 1);
//     story51Node.add(story51Blank1, 1, 3, 1, 1);
//       //2) row/column intialization
//     RowConstraints story51row1 = new RowConstraints();
//     story51row1.setMinHeight(50);
//     RowConstraints story51row2 = new RowConstraints();
//     story51row2.setMinHeight(200);
//     RowConstraints story51row3 = new RowConstraints();
//     story51row3.setMinHeight(50);
//     RowConstraints story51row4 = new RowConstraints();
//     story51row4.setMinHeight(100);
//     ColumnConstraints story51col1 = new ColumnConstraints();
//     story51col1.setMinWidth(50);
//     ColumnConstraints story51col2 = new ColumnConstraints();
//     story51col2.setMinWidth(30);
//     ColumnConstraints story51col3 = new ColumnConstraints();
//     story51col3.setMinWidth(550);
//     ColumnConstraints story51col4 = new ColumnConstraints();
//     story51col4.setMinWidth(50);
//     story51Node.getRowConstraints().addAll(story51row1,story51row2,story51row3,story51row4); 
//     story51Node.getColumnConstraints().addAll(story51col1, story51col2, story51col3,story51col4); 

//       //3) background image
//     BackgroundSize story51BackgroundSize = new BackgroundSize(900, 700, true, true, true, false);
// 	//image. Replace url
//     BackgroundImage story51Image = new BackgroundImage(
//         new Image("https://cdn.discordapp.com/attachments/1261210481721348159/1268252834948976731/IMG_4334.png?ex=66b79d7e&is=66b64bfe&hm=081886eeffab90a517461193663149a1d5eab499c7d06c016db6c13a643bead3&"),
//         BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, story51BackgroundSize);
//     story51Node.setBackground(new Background(story51Image));

//     //story52
//       //variable and attributes
//     Label story52Speaker;
//     story52Speaker = new Label("");
//       story52Speaker.setStyle("-fx-text-fill:white;-fx-font-size:200%;-fx-font-weight:bold;");
//       story52Speaker.setAlignment(Pos.CENTER_LEFT);
//     Label story52Label; // story array
//     story52Label = new Label(""); // blank space
//       story52Label.setMinWidth(550);
//       story52Label.setMaxWidth(550);
//       story52Label.setMinHeight(100);  
//       story52Label.setStyle("-fx-text-fill:black;-fx-font-size:120%;-fx-background-color:rgba(255,255,255,0.7);");
//       story52Label.setAlignment(Pos.CENTER_LEFT);
//     Label story52Blank;
//     story52Blank = new Label("");
//       story52Blank.setMinWidth(30);
//       story52Blank.setMinHeight(50); 
//       story52Blank.setStyle("-fx-background-color:transparent");
//     Label story52Blank1;
//     story52Blank1 = new Label("");
//       story52Blank1.setMinWidth(30);
//       story52Blank1.setMinHeight(100);
// story52Blank1.setStyle("-fx-background-color:rgba(255,255,255,0.7)");
     
//       //animation
//     final String story52Content = "At least I got to speak to kuya Enriquez today.. he’s very\ninteresting… ";
//     final Text story52Text = new Text(10, 20, "");
    
//     final Animation story52Animation = new Transition() {
//         {
//             setCycleDuration(Duration.millis(2000));
//         }
    
//         protected void interpolate(double frac) {
//             final int story52Length = story52Content.length();
//             final int story52N = Math.round(story52Length * (float) frac);
//             story52Label.setText(story52Content.substring(0, story52N));
//         }
        
//     };
    
//       //1) gridpane intialization
//     story52Node = new GridPane();
//     story52Node.add(story52Speaker, 2, 2);
//     story52Node.add(story52Label, 2, 3);
//     story52Node.add(story52Blank, 1, 2, 1, 1);
//     story52Node.add(story52Blank1, 1, 3, 1, 1);
//       //2) row/column intialization
//     RowConstraints story52row1 = new RowConstraints();
//     story52row1.setMinHeight(50);
//     RowConstraints story52row2 = new RowConstraints();
//     story52row2.setMinHeight(200);
//     RowConstraints story52row3 = new RowConstraints();
//     story52row3.setMinHeight(50);
//     RowConstraints story52row4 = new RowConstraints();
//     story52row4.setMinHeight(100);
//     ColumnConstraints story52col1 = new ColumnConstraints();
//     story52col1.setMinWidth(50);
//     ColumnConstraints story52col2 = new ColumnConstraints();
//     story52col2.setMinWidth(30);
//     ColumnConstraints story52col3 = new ColumnConstraints();
//     story52col3.setMinWidth(550);
//     ColumnConstraints story52col4 = new ColumnConstraints();
//     story52col4.setMinWidth(50);
//     story52Node.getRowConstraints().addAll(story52row1,story52row2,story52row3,story52row4); 
//     story52Node.getColumnConstraints().addAll(story52col1, story52col2, story52col3,story52col4); 

//       //3) background image
//     BackgroundSize story52BackgroundSize = new BackgroundSize(900, 700, true, true, true, false);
// 	//image. Replace url
//     BackgroundImage story52Image = new BackgroundImage(
//         new Image("https://cdn.discordapp.com/attachments/1261210481721348159/1268252834948976731/IMG_4334.png?ex=66b79d7e&is=66b64bfe&hm=081886eeffab90a517461193663149a1d5eab499c7d06c016db6c13a643bead3&"),
//         BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, story52BackgroundSize);
//     story52Node.setBackground(new Background(story52Image));

//     //story53
//       //1) gridpane intialization
//     story53Node = new GridPane();
//       //3 fade transition
//     FadeTransition story53FT = new FadeTransition(Duration.millis(1500), story53Node);
//       story53FT.setFromValue(1.0);
//       story53FT.setToValue(0.0);
//     //3) background image
//     BackgroundSize story53BackgroundSize = new BackgroundSize(900, 700, true, true, true, false);
// 	//image. Replace url
//     BackgroundImage story53Image = new BackgroundImage(
//         new Image("https://cdn.discordapp.com/attachments/1261210481721348159/1268252834948976731/IMG_4334.png?ex=66b79d7e&is=66b64bfe&hm=081886eeffab90a517461193663149a1d5eab499c7d06c016db6c13a643bead3&"),
//         BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, story53BackgroundSize);
//     story53Node.setBackground(new Background(story53Image));

//     //story54
//       //variable and attributes
//     Label story54Speaker;
//     story54Speaker = new Label("");
//       story54Speaker.setStyle("-fx-text-fill:white;-fx-font-size:200%;-fx-font-weight:bold;");
//       story54Speaker.setAlignment(Pos.CENTER_LEFT);
//     Label story54Label; // story array
//     story54Label = new Label(""); // blank space
//       story54Label.setMinWidth(550);
//       story54Label.setMaxWidth(550);
//       story54Label.setMinHeight(100);  
//       story54Label.setStyle("-fx-text-fill:black;-fx-font-size:120%;-fx-background-color:rgba(255,255,255,0.7);-fx-font-weight:bold");
//       story54Label.setAlignment(Pos.CENTER_LEFT);
//     Label story54Blank;
//     story54Blank = new Label("");
//       story54Blank.setMinWidth(30);
//       story54Blank.setMinHeight(50); 
//       story54Blank.setStyle("-fx-background-color:transparent");
//     Label story54Blank1;
//     story54Blank1 = new Label("");
//       story54Blank1.setMinWidth(30);
//       story54Blank1.setMinHeight(100);
// story54Blank1.setStyle("-fx-background-color:rgba(255,255,255,0.7)");
     
//       //animation
//     final String story54Content = "You are very busy but would like an opportunity \n to talk to kuya Rey..";
//     final Text story54Text = new Text(10, 20, "");
    
//     final Animation story54Animation = new Transition() {
//         {
//             setCycleDuration(Duration.millis(3000));
//         }
    
//         protected void interpolate(double frac) {
//             final int story54Length = story54Content.length();
//             final int story54N = Math.round(story54Length * (float) frac);
//             story54Label.setText(story54Content.substring(0, story54N));
//         }
        
//     };
    
//       //1) gridpane intialization
//     story54Node = new GridPane();
//     story54Node.add(story54Speaker, 2, 2);
//     story54Node.add(story54Label, 2, 3);
//     story54Node.add(story54Blank, 1, 2, 1, 1);
//     story54Node.add(story54Blank1, 1, 3, 1, 1);
//       //2) row/column intialization
//     RowConstraints story54row1 = new RowConstraints();
//     story54row1.setMinHeight(50);
//     RowConstraints story54row2 = new RowConstraints();
//     story54row2.setMinHeight(200);
//     RowConstraints story54row3 = new RowConstraints();
//     story54row3.setMinHeight(50);
//     RowConstraints story54row4 = new RowConstraints();
//     story54row4.setMinHeight(100);
//     ColumnConstraints story54col1 = new ColumnConstraints();
//     story54col1.setMinWidth(50);
//     ColumnConstraints story54col2 = new ColumnConstraints();
//     story54col2.setMinWidth(30);
//     ColumnConstraints story54col3 = new ColumnConstraints();
//     story54col3.setMinWidth(550);
//     ColumnConstraints story54col4 = new ColumnConstraints();
//     story54col4.setMinWidth(50);
//     story54Node.getRowConstraints().addAll(story54row1,story54row2,story54row3,story54row4); 
//     story54Node.getColumnConstraints().addAll(story54col1, story54col2, story54col3,story54col4); 

//       //3) background image
//     BackgroundSize story54BackgroundSize = new BackgroundSize(900, 700, true, true, true, false);
// 	//image. Replace url
//     BackgroundImage story54Image = new BackgroundImage(
//         new Image("https://cdn.discordapp.com/attachments/1261210481721348159/1268252834948976731/IMG_4334.png?ex=66b79d7e&is=66b64bfe&hm=081886eeffab90a517461193663149a1d5eab499c7d06c016db6c13a643bead3&"),
//         BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, story54BackgroundSize);
//     story54Node.setBackground(new Background(story54Image));

//     //story55
//       //variable and attributes
//     Label story55Speaker;
//     story55Speaker = new Label("Mr. Sevilla");
//       story55Speaker.setStyle("-fx-text-fill:white;-fx-font-size:200%;-fx-font-weight:bold;");
//       story55Speaker.setAlignment(Pos.CENTER_LEFT);
//     Label story55Label; // story array
//     story55Label = new Label(""); // blank space
//       story55Label.setMinWidth(550);
//       story55Label.setMaxWidth(550);
//       story55Label.setMinHeight(100);  
//       story55Label.setStyle("-fx-text-fill:black;-fx-font-size:120%;-fx-background-color:rgba(255,255,255,0.7);");
//       story55Label.setAlignment(Pos.CENTER_LEFT);
//     Label story55Blank;
//     story55Blank = new Label("");
//       story55Blank.setMinWidth(30);
//       story55Blank.setMinHeight(50); 
//       story55Blank.setStyle("-fx-background-color:transparent");
//     Label story55Blank1;
//     story55Blank1 = new Label("");
//       story55Blank1.setMinWidth(30);
//       story55Blank1.setMinHeight(100);
// story55Blank1.setStyle("-fx-background-color:rgba(255,255,255,0.7)");
     
//       //animation
//     final String story55Content = "Rey, would you like to grade papers with me? My AP\nCalc AB classes suck.";
//     final Text story55Text = new Text(10, 20, "");
    
//     final Animation story55Animation = new Transition() {
//         {
//             setCycleDuration(Duration.millis(3000));
//         }
    
//         protected void interpolate(double frac) {
//             final int story55Length = story55Content.length();
//             final int story55N = Math.round(story55Length * (float) frac);
//             story55Label.setText(story55Content.substring(0, story55N));
//         }
        
//     };
    
//       //1) gridpane intialization
//     story55Node = new GridPane();
//     story55Node.add(story55Speaker, 2, 2);
//     story55Node.add(story55Label, 2, 3);
//     story55Node.add(story55Blank, 1, 2, 1, 1);
//     story55Node.add(story55Blank1, 1, 3, 1, 1);
//       //2) row/column intialization
//     RowConstraints story55row1 = new RowConstraints();
//     story55row1.setMinHeight(50);
//     RowConstraints story55row2 = new RowConstraints();
//     story55row2.setMinHeight(200);
//     RowConstraints story55row3 = new RowConstraints();
//     story55row3.setMinHeight(50);
//     RowConstraints story55row4 = new RowConstraints();
//     story55row4.setMinHeight(100);
//     ColumnConstraints story55col1 = new ColumnConstraints();
//     story55col1.setMinWidth(50);
//     ColumnConstraints story55col2 = new ColumnConstraints();
//     story55col2.setMinWidth(30);
//     ColumnConstraints story55col3 = new ColumnConstraints();
//     story55col3.setMinWidth(550);
//     ColumnConstraints story55col4 = new ColumnConstraints();
//     story55col4.setMinWidth(50);
//     story55Node.getRowConstraints().addAll(story55row1,story55row2,story55row3,story55row4); 
//     story55Node.getColumnConstraints().addAll(story55col1, story55col2, story55col3,story55col4); 

//       //3) background image
//     BackgroundSize story55BackgroundSize = new BackgroundSize(900, 700, true, true, true, false);
// 	//image. Replace url
//     BackgroundImage story55Image = new BackgroundImage(
//         new Image("https://cdn.discordapp.com/attachments/1261210481721348159/1268252834948976731/IMG_4334.png?ex=66b79d7e&is=66b64bfe&hm=081886eeffab90a517461193663149a1d5eab499c7d06c016db6c13a643bead3&"),
//         BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, story55BackgroundSize);
//     story55Node.setBackground(new Background(story55Image));

//     //story56
//       //variable and attributes
//     Label story56Speaker;
//     story56Speaker = new Label("Mr. Enriquez");
//       story56Speaker.setStyle("-fx-text-fill:white;-fx-font-size:200%;-fx-font-weight:bold;");
//       story56Speaker.setAlignment(Pos.CENTER_LEFT);
//     Label story56Label; // story array
//     story56Label = new Label(""); // blank space
//       story56Label.setMinWidth(550);
//       story56Label.setMaxWidth(550);
//       story56Label.setMinHeight(100);  
//       story56Label.setStyle("-fx-text-fill:black;-fx-font-size:120%;-fx-background-color:rgba(255,255,255,0.7);");
//       story56Label.setAlignment(Pos.CENTER_LEFT);
//     Label story56Blank;
//     story56Blank = new Label("");
//       story56Blank.setMinWidth(30);
//       story56Blank.setMinHeight(50); 
//       story56Blank.setStyle("-fx-background-color:transparent");
//     Label story56Blank1;
//     story56Blank1 = new Label("");
//       story56Blank1.setMinWidth(30);
//       story56Blank1.setMinHeight(100);
// story56Blank1.setStyle("-fx-background-color:rgba(255,255,255,0.7)");
     
//       //animation
//     final String story56Content = "Of course!! I love Calculus!";
//     final Text story56Text = new Text(10, 20, "");
    
//     final Animation story56Animation = new Transition() {
//         {
//             setCycleDuration(Duration.millis(3000));
//         }
    
//         protected void interpolate(double frac) {
//             final int story56Length = story56Content.length();
//             final int story56N = Math.round(story56Length * (float) frac);
//             story56Label.setText(story56Content.substring(0, story56N));
//         }
        
//     };
    
//       //1) gridpane intialization
//     story56Node = new GridPane();
//     story56Node.add(story56Speaker, 2, 2);
//     story56Node.add(story56Label, 2, 3);
//     story56Node.add(story56Blank, 1, 2, 1, 1);
//     story56Node.add(story56Blank1, 1, 3, 1, 1);
//       //2) row/column intialization
//     RowConstraints story56row1 = new RowConstraints();
//     story56row1.setMinHeight(50);
//     RowConstraints story56row2 = new RowConstraints();
//     story56row2.setMinHeight(200);
//     RowConstraints story56row3 = new RowConstraints();
//     story56row3.setMinHeight(50);
//     RowConstraints story56row4 = new RowConstraints();
//     story56row4.setMinHeight(100);
//     ColumnConstraints story56col1 = new ColumnConstraints();
//     story56col1.setMinWidth(50);
//     ColumnConstraints story56col2 = new ColumnConstraints();
//     story56col2.setMinWidth(30);
//     ColumnConstraints story56col3 = new ColumnConstraints();
//     story56col3.setMinWidth(550);
//     ColumnConstraints story56col4 = new ColumnConstraints();
//     story56col4.setMinWidth(50);
//     story56Node.getRowConstraints().addAll(story56row1,story56row2,story56row3,story56row4); 
//     story56Node.getColumnConstraints().addAll(story56col1, story56col2, story56col3,story56col4); 

//       //3) background image
//     BackgroundSize story56BackgroundSize = new BackgroundSize(900, 700, true, true, true, false);
// 	//image. Replace url
//     BackgroundImage story56Image = new BackgroundImage(
//         new Image("https://cdn.discordapp.com/attachments/1261210481721348159/1268252834948976731/IMG_4334.png?ex=66b79d7e&is=66b64bfe&hm=081886eeffab90a517461193663149a1d5eab499c7d06c016db6c13a643bead3&"),
//         BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, story56BackgroundSize);
//     story56Node.setBackground(new Background(story56Image));

//     //story57
//       //variable and attributes
//     Label story57Question;
//     story57Question = new Label("y=6y-xy^2-1, y'=?");
//       story57Question.setMinWidth(700);
//       story57Question.setMaxWidth(700);
//       story57Question.setMinHeight(60); 
//       story57Question.setMaxHeight(60); 
//       story57Question.setStyle("-fx-background-color:transparent;-fx-font-size:140%;-fx-text-fill:black;-fx-font-weight:bold;");  
//       story57Question.setAlignment(Pos.CENTER);

//     Label story57Label; // story array
//     story57Label = new Label(""); // blank space
//       story57Label.setMinWidth(700);
//       story57Label.setMaxWidth(700);
//       story57Label.setMinHeight(40);  
//       story57Label.setMaxHeight(40);  
//       story57Label.setStyle("-fx-text-fill:white;-fx-font-size:120%;-fx-background-color:transparent");
//       story57Label.setAlignment(Pos.CENTER);

//     Button story57Button1; //play
//     story57Button1 = new Button("a) y(6-xy)"); //play
//       story57Button1.setStyle("-fx-background-color:transparent;-fx-font-size:120%;-fx-border-width:1px");
//       story57Button1.setFocusTraversable(false);
//       story57Button1.setMinWidth(250);
//       story57Button1.setMinHeight(50);
//       story57Button1.setMaxWidth(250);
//       story57Button1.setMaxHeight(50);
//       story57Button1.setAlignment(Pos.CENTER_LEFT);

//     Button story57Button2; //play
//     story57Button2 = new Button("b) 6-2xy"); //play
//       story57Button2.setStyle("-fx-background-color:transparent;-fx-font-size:120%;-fx-border-width:1px");
//       story57Button2.setFocusTraversable(false);
//       story57Button2.setMinWidth(250);
//       story57Button2.setMinHeight(50);
//       story57Button2.setMaxWidth(250);
//       story57Button2.setMaxHeight(50);
//       story57Button2.setAlignment(Pos.CENTER_LEFT);

//     Button story57Button3; //play
//     story57Button3 = new Button("c) y^2(6-2xy)"); //play
//       story57Button3.setStyle("-fx-background-color:transparent;-fx-font-size:120%;-fx-border-width:1px");
//       story57Button3.setFocusTraversable(false);
//       story57Button3.setMinWidth(250);
//       story57Button3.setMinHeight(50);
//       story57Button3.setMaxWidth(250);
//       story57Button3.setMaxHeight(50);
//       story57Button3.setAlignment(Pos.CENTER_LEFT);
    
     
//       //animation
//     final String story57Content = "Check your coefficients!";
//     final Text story57Text = new Text(10, 20, "");
    
//     final Animation story57Animation = new Transition() {
//         {
//             setCycleDuration(Duration.millis(4000));
//         }
    
//         protected void interpolate(double frac) {
//             final int story57Length = story57Content.length();
//             final int story57N = Math.round(story57Length * (float) frac);
//             story57Label.setText(story57Content.substring(0, story57N));
//         }
    
//     };
      
//       //1) gridpane intialization
//     story57Node = new GridPane();
//      story57Node.add(story57Question, 0, 1, 3, 1);
//         story57Node.add(story57Label, 0, 9, 3, 1);
//         story57Node.add(story57Button1, 1, 3);
//         story57Node.add(story57Button2, 1, 5);
//         story57Node.add(story57Button3, 1, 7);
//       //2) row/column intialization
//     RowConstraints story57row1 = new RowConstraints();
//     story57row1.setMinHeight(70);
//     RowConstraints story57row2 = new RowConstraints();
//     story57row2.setMinHeight(60);
//     RowConstraints story57row3 = new RowConstraints();
//     story57row3.setMinHeight(10);
//     RowConstraints story57row4 = new RowConstraints();
//     story57row4.setMinHeight(50);
//     RowConstraints story57row5 = new RowConstraints();
//     story57row5.setMinHeight(10);
//     RowConstraints story57row6 = new RowConstraints();
//     story57row6.setMinHeight(50);
//     RowConstraints story57row7 = new RowConstraints();
//     story57row7.setMinHeight(10);
//     RowConstraints story57row8 = new RowConstraints();
//     story57row8.setMinHeight(50);
//     RowConstraints story57row9 = new RowConstraints();
//     story57row9.setMinHeight(30);
//     RowConstraints story57row10 = new RowConstraints();
//     story57row10.setMinHeight(40);
//     story57row10.setMaxHeight(40);
//     RowConstraints story57row11 = new RowConstraints();
//     story57row11.setMinHeight(20);
//     story57row11.setMaxHeight(20);
//     ColumnConstraints story57col1 = new ColumnConstraints();
//     story57col1.setMinWidth(135);
//     story57col1.setMaxWidth(135);
//     ColumnConstraints story57col2 = new ColumnConstraints();
//     story57col2.setMinWidth(470);
//     ColumnConstraints story57col3 = new ColumnConstraints();
//     story57col3.setMinWidth(30);
//     story57Node.getRowConstraints().addAll(story57row1,story57row2,story57row3,story57row4,story57row5,story57row6,story57row7,story57row8,story57row9,story57row10,story57row11); 
//     story57Node.getColumnConstraints().addAll(story57col1, story57col2, story57col3); 
//       //3) background image
//     BackgroundSize story57BackgroundSize = new BackgroundSize(900, 700, true, true, true, false);
//     BackgroundImage story57Image = new BackgroundImage(
//         new Image("https://cdn.discordapp.com/attachments/1261210481721348159/1268252834948976731/IMG_4334.png?ex=66b79d7e&is=66b64bfe&hm=081886eeffab90a517461193663149a1d5eab499c7d06c016db6c13a643bead3&"),
//         BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, story57BackgroundSize);
//     story57Node.setBackground(new Background(story57Image));
    
//     //story58
//       //variable and attributes
//     Label story58Question;
//     story58Question = new Label("f(x)=8x^3 + 4x^2");
//       story58Question.setMinWidth(700);
//       story58Question.setMaxWidth(700);
//       story58Question.setMinHeight(60); 
//       story58Question.setMaxHeight(60); 
//       story58Question.setStyle("-fx-background-color:transparent;-fx-font-size:140%;-fx-text-fill:black;-fx-font-weight:bold;");  
//       story58Question.setAlignment(Pos.CENTER);

//     Label story58Label; // story array
//     story58Label = new Label(""); // blank space
//       story58Label.setMinWidth(700);
//       story58Label.setMaxWidth(700);
//       story58Label.setMinHeight(40);  
//       story58Label.setMaxHeight(40);  
//       story58Label.setStyle("-fx-text-fill:white;-fx-font-size:120%;-fx-background-color:transparent");
//       story58Label.setAlignment(Pos.CENTER);

//     Button story58Button1; //play
//     story58Button1 = new Button("a) 24x^2 + 8x"); //play
//       story58Button1.setStyle("-fx-background-color:transparent;-fx-font-size:120%;-fx-border-width:1px");
//       story58Button1.setFocusTraversable(false);
//       story58Button1.setMinWidth(250);
//       story58Button1.setMinHeight(50);
//       story58Button1.setMaxWidth(250);
//       story58Button1.setMaxHeight(50);
//       story58Button1.setAlignment(Pos.CENTER_LEFT);

//     Button story58Button2; //play
//     story58Button2 = new Button("b) 4x^4 + 2x^3"); //play
//       story58Button2.setStyle("-fx-background-color:transparent;-fx-font-size:120%;-fx-border-width:1px");
//       story58Button2.setFocusTraversable(false);
//       story58Button2.setMinWidth(250);
//       story58Button2.setMinHeight(50);
//       story58Button2.setMaxWidth(250);
//       story58Button2.setMaxHeight(50);
//       story58Button2.setAlignment(Pos.CENTER_LEFT);

//     Button story58Button3; //play
//     story58Button3 = new Button("c) 48x + 8"); //play
//       story58Button3.setStyle("-fx-background-color:transparent;-fx-font-size:120%;-fx-border-width:1px");
//       story58Button3.setFocusTraversable(false);
//       story58Button3.setMinWidth(250);
//       story58Button3.setMinHeight(50);
//       story58Button3.setMaxWidth(250);
//       story58Button3.setMaxHeight(50);
//       story58Button3.setAlignment(Pos.CENTER_LEFT);
    
     
//       //animation
//     final String story58Content = "Have you checked your coefficients?";
//     final Text story58Text = new Text(10, 20, "");
    
//     final Animation story58Animation = new Transition() {
//         {
//             setCycleDuration(Duration.millis(4000));
//         }
    
//         protected void interpolate(double frac) {
//             final int story58Length = story58Content.length();
//             final int story58N = Math.round(story58Length * (float) frac);
//             story58Label.setText(story58Content.substring(0, story58N));
//         }
    
//     };
      
//       //1) gridpane intialization
//     story58Node = new GridPane();
//      story58Node.add(story58Question, 0, 1, 3, 1);
//         story58Node.add(story58Label, 0, 9, 3, 1);
//         story58Node.add(story58Button1, 1, 3);
//         story58Node.add(story58Button2, 1, 5);
//         story58Node.add(story58Button3, 1, 7);
//       //2) row/column intialization
//     RowConstraints story58row1 = new RowConstraints();
//     story58row1.setMinHeight(70);
//     RowConstraints story58row2 = new RowConstraints();
//     story58row2.setMinHeight(60);
//     RowConstraints story58row3 = new RowConstraints();
//     story58row3.setMinHeight(10);
//     RowConstraints story58row4 = new RowConstraints();
//     story58row4.setMinHeight(50);
//     RowConstraints story58row5 = new RowConstraints();
//     story58row5.setMinHeight(10);
//     RowConstraints story58row6 = new RowConstraints();
//     story58row6.setMinHeight(50);
//     RowConstraints story58row7 = new RowConstraints();
//     story58row7.setMinHeight(10);
//     RowConstraints story58row8 = new RowConstraints();
//     story58row8.setMinHeight(50);
//     RowConstraints story58row9 = new RowConstraints();
//     story58row9.setMinHeight(30);
//     RowConstraints story58row10 = new RowConstraints();
//     story58row10.setMinHeight(40);
//     story58row10.setMaxHeight(40);
//     RowConstraints story58row11 = new RowConstraints();
//     story58row11.setMinHeight(20);
//     story58row11.setMaxHeight(20);
//     ColumnConstraints story58col1 = new ColumnConstraints();
//     story58col1.setMinWidth(135);
//     story58col1.setMaxWidth(135);
//     ColumnConstraints story58col2 = new ColumnConstraints();
//     story58col2.setMinWidth(470);
//     ColumnConstraints story58col3 = new ColumnConstraints();
//     story58col3.setMinWidth(30);
//     story58Node.getRowConstraints().addAll(story58row1,story58row2,story58row3,story58row4,story58row5,story58row6,story58row7,story58row8,story58row9,story58row10,story58row11); 
//     story58Node.getColumnConstraints().addAll(story58col1, story58col2, story58col3); 
//       //3) background image
//     BackgroundSize story58BackgroundSize = new BackgroundSize(900, 700, true, true, true, false);
//     BackgroundImage story58Image = new BackgroundImage(
//         new Image("https://cdn.discordapp.com/attachments/1261210481721348159/1268252834948976731/IMG_4334.png?ex=66b79d7e&is=66b64bfe&hm=081886eeffab90a517461193663149a1d5eab499c7d06c016db6c13a643bead3&"),
//         BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, story58BackgroundSize);
//     story58Node.setBackground(new Background(story58Image));

//     //story59
//       //variable and attributes
//     Label story59Question;
//     story59Question = new Label("What is the derivative of 9x^7 + 4x^1/2?");
//       story59Question.setMinWidth(700);
//       story59Question.setMaxWidth(700);
//       story59Question.setMinHeight(60); 
//       story59Question.setMaxHeight(60); 
//       story59Question.setStyle("-fx-background-color:transparent;-fx-font-size:140%;-fx-text-fill:black;-fx-font-weight:bold;");  
//       story59Question.setAlignment(Pos.CENTER);

//     Label story59Label; // story array
//     story59Label = new Label(""); // blank space
//       story59Label.setMinWidth(700);
//       story59Label.setMaxWidth(700);
//       story59Label.setMinHeight(40);  
//       story59Label.setMaxHeight(40);  
//       story59Label.setStyle("-fx-text-fill:white;-fx-font-size:120%;-fx-background-color:transparent");
//       story59Label.setAlignment(Pos.CENTER);

//     Button story59Button1; //play
//     story59Button1 = new Button("a) 28x^3 + 4x"); //play
//       story59Button1.setStyle("-fx-background-color:transparent;-fx-font-size:120%;-fx-border-width:1px");
//       story59Button1.setFocusTraversable(false);
//       story59Button1.setMinWidth(250);
//       story59Button1.setMinHeight(50);
//       story59Button1.setMaxWidth(250);
//       story59Button1.setMaxHeight(50);
//       story59Button1.setAlignment(Pos.CENTER_LEFT);

//     Button story59Button2; //play
//     story59Button2 = new Button("b) 63x^6 + 2x^-1/2"); //play
//       story59Button2.setStyle("-fx-background-color:transparent;-fx-font-size:120%;-fx-border-width:1px");
//       story59Button2.setFocusTraversable(false);
//       story59Button2.setMinWidth(250);
//       story59Button2.setMinHeight(50);
//       story59Button2.setMaxWidth(250);
//       story59Button2.setMaxHeight(50);
//       story59Button2.setAlignment(Pos.CENTER_LEFT);

//     Button story59Button3; //play
//     story59Button3 = new Button("c) 63x^6 + 2x^1/2"); //play
//       story59Button3.setStyle("-fx-background-color:transparent;-fx-font-size:120%;-fx-border-width:1px");
//       story59Button3.setFocusTraversable(false);
//       story59Button3.setMinWidth(250);
//       story59Button3.setMinHeight(50);
//       story59Button3.setMaxWidth(250);
//       story59Button3.setMaxHeight(50);
//       story59Button3.setAlignment(Pos.CENTER_LEFT);
    
     
//       //animation
//     final String story59Content = "Remember to subtract 1 from your exponents.";
//     final Text story59Text = new Text(10, 20, "");
    
//     final Animation story59Animation = new Transition() {
//         {
//             setCycleDuration(Duration.millis(4000));
//         }
    
//         protected void interpolate(double frac) {
//             final int story59Length = story59Content.length();
//             final int story59N = Math.round(story59Length * (float) frac);
//             story59Label.setText(story59Content.substring(0, story59N));
//         }
    
//     };
      
//       //1) gridpane intialization
//     story59Node = new GridPane();
//      story59Node.add(story59Question, 0, 1, 3, 1);
//         story59Node.add(story59Label, 0, 9, 3, 1);
//         story59Node.add(story59Button1, 1, 3);
//         story59Node.add(story59Button2, 1, 5);
//         story59Node.add(story59Button3, 1, 7);
//       //2) row/column intialization
//     RowConstraints story59row1 = new RowConstraints();
//     story59row1.setMinHeight(70);
//     RowConstraints story59row2 = new RowConstraints();
//     story59row2.setMinHeight(60);
//     RowConstraints story59row3 = new RowConstraints();
//     story59row3.setMinHeight(10);
//     RowConstraints story59row4 = new RowConstraints();
//     story59row4.setMinHeight(50);
//     RowConstraints story59row5 = new RowConstraints();
//     story59row5.setMinHeight(10);
//     RowConstraints story59row6 = new RowConstraints();
//     story59row6.setMinHeight(50);
//     RowConstraints story59row7 = new RowConstraints();
//     story59row7.setMinHeight(10);
//     RowConstraints story59row8 = new RowConstraints();
//     story59row8.setMinHeight(50);
//     RowConstraints story59row9 = new RowConstraints();
//     story59row9.setMinHeight(30);
//     RowConstraints story59row10 = new RowConstraints();
//     story59row10.setMinHeight(40);
//     story59row10.setMaxHeight(40);
//     RowConstraints story59row11 = new RowConstraints();
//     story59row11.setMinHeight(20);
//     story59row11.setMaxHeight(20);
//     ColumnConstraints story59col1 = new ColumnConstraints();
//     story59col1.setMinWidth(135);
//     story59col1.setMaxWidth(135);
//     ColumnConstraints story59col2 = new ColumnConstraints();
//     story59col2.setMinWidth(470);
//     ColumnConstraints story59col3 = new ColumnConstraints();
//     story59col3.setMinWidth(30);
//     story59Node.getRowConstraints().addAll(story59row1,story59row2,story59row3,story59row4,story59row5,story59row6,story59row7,story59row8,story59row9,story59row10,story59row11); 
//     story59Node.getColumnConstraints().addAll(story59col1, story59col2, story59col3); 
//       //3) background image
//     BackgroundSize story59BackgroundSize = new BackgroundSize(900, 700, true, true, true, false);
//     BackgroundImage story59Image = new BackgroundImage(
//         new Image("https://cdn.discordapp.com/attachments/1261210481721348159/1268252834948976731/IMG_4334.png?ex=66b79d7e&is=66b64bfe&hm=081886eeffab90a517461193663149a1d5eab499c7d06c016db6c13a643bead3&"),
//         BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, story59BackgroundSize);
//     story59Node.setBackground(new Background(story59Image));
    
//     //story60
//       //variable and attributes
//     Label story60Question;
//     story60Question = new Label("What is the second derivative of 4x + 9?");
//       story60Question.setMinWidth(700);
//       story60Question.setMaxWidth(700);
//       story60Question.setMinHeight(60); 
//       story60Question.setMaxHeight(60); 
//       story60Question.setStyle("-fx-background-color:transparent;-fx-font-size:140%;-fx-text-fill:black;-fx-font-weight:bold;");  
//       story60Question.setAlignment(Pos.CENTER);

//     Label story60Label; // story array
//     story60Label = new Label(""); // blank space
//       story60Label.setMinWidth(700);
//       story60Label.setMaxWidth(700);
//       story60Label.setMinHeight(40);  
//       story60Label.setMaxHeight(40);  
//       story60Label.setStyle("-fx-text-fill:white;-fx-font-size:120%;-fx-background-color:transparent");
//       story60Label.setAlignment(Pos.CENTER);

//     Button story60Button1; //play
//     story60Button1 = new Button("a) 0"); //play
//       story60Button1.setStyle("-fx-background-color:transparent;-fx-font-size:120%;-fx-border-width:1px");
//       story60Button1.setFocusTraversable(false);
//       story60Button1.setMinWidth(250);
//       story60Button1.setMinHeight(50);
//       story60Button1.setMaxWidth(250);
//       story60Button1.setMaxHeight(50);
//       story60Button1.setAlignment(Pos.CENTER_LEFT);

//     Button story60Button2; //play
//     story60Button2 = new Button("b) 4"); //play
//       story60Button2.setStyle("-fx-background-color:transparent;-fx-font-size:120%;-fx-border-width:1px");
//       story60Button2.setFocusTraversable(false);
//       story60Button2.setMinWidth(250);
//       story60Button2.setMinHeight(50);
//       story60Button2.setMaxWidth(250);
//       story60Button2.setMaxHeight(50);
//       story60Button2.setAlignment(Pos.CENTER_LEFT);

//     Button story60Button3; //play
//     story60Button3 = new Button("c) 4x"); //play
//       story60Button3.setStyle("-fx-background-color:transparent;-fx-font-size:120%;-fx-border-width:1px");
//       story60Button3.setFocusTraversable(false);
//       story60Button3.setMinWidth(250);
//       story60Button3.setMinHeight(50);
//       story60Button3.setMaxWidth(250);
//       story60Button3.setMaxHeight(50);
//       story60Button3.setAlignment(Pos.CENTER_LEFT);
    
     
//       //animation
//     final String story60Content = "Remember to derive the function twice!";
//     final Text story60Text = new Text(10, 20, "");
    
//     final Animation story60Animation = new Transition() {
//         {
//             setCycleDuration(Duration.millis(4000));
//         }
    
//         protected void interpolate(double frac) {
//             final int story60Length = story60Content.length();
//             final int story60N = Math.round(story60Length * (float) frac);
//             story60Label.setText(story60Content.substring(0, story60N));
//         }
    
//     };
      
//       //1) gridpane intialization
//     story60Node = new GridPane();
//      story60Node.add(story60Question, 0, 1, 3, 1);
//         story60Node.add(story60Label, 0, 9, 3, 1);
//         story60Node.add(story60Button1, 1, 3);
//         story60Node.add(story60Button2, 1, 5);
//         story60Node.add(story60Button3, 1, 7);
//       //2) row/column intialization
//     RowConstraints story60row1 = new RowConstraints();
//     story60row1.setMinHeight(70);
//     RowConstraints story60row2 = new RowConstraints();
//     story60row2.setMinHeight(60);
//     RowConstraints story60row3 = new RowConstraints();
//     story60row3.setMinHeight(10);
//     RowConstraints story60row4 = new RowConstraints();
//     story60row4.setMinHeight(50);
//     RowConstraints story60row5 = new RowConstraints();
//     story60row5.setMinHeight(10);
//     RowConstraints story60row6 = new RowConstraints();
//     story60row6.setMinHeight(50);
//     RowConstraints story60row7 = new RowConstraints();
//     story60row7.setMinHeight(10);
//     RowConstraints story60row8 = new RowConstraints();
//     story60row8.setMinHeight(50);
//     RowConstraints story60row9 = new RowConstraints();
//     story60row9.setMinHeight(30);
//     RowConstraints story60row10 = new RowConstraints();
//     story60row10.setMinHeight(40);
//     story60row10.setMaxHeight(40);
//     RowConstraints story60row11 = new RowConstraints();
//     story60row11.setMinHeight(20);
//     story60row11.setMaxHeight(20);
//     ColumnConstraints story60col1 = new ColumnConstraints();
//     story60col1.setMinWidth(135);
//     story60col1.setMaxWidth(135);
//     ColumnConstraints story60col2 = new ColumnConstraints();
//     story60col2.setMinWidth(470);
//     ColumnConstraints story60col3 = new ColumnConstraints();
//     story60col3.setMinWidth(30);
//     story60Node.getRowConstraints().addAll(story60row1,story60row2,story60row3,story60row4,story60row5,story60row6,story60row7,story60row8,story60row9,story60row10,story60row11); 
//     story60Node.getColumnConstraints().addAll(story60col1, story60col2, story60col3); 
//       //3) background image
//     BackgroundSize story60BackgroundSize = new BackgroundSize(900, 700, true, true, true, false);
//     BackgroundImage story60Image = new BackgroundImage(
//         new Image("https://cdn.discordapp.com/attachments/1261210481721348159/1268252834948976731/IMG_4334.png?ex=66b79d7e&is=66b64bfe&hm=081886eeffab90a517461193663149a1d5eab499c7d06c016db6c13a643bead3&"),
//         BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, story60BackgroundSize);
//     story60Node.setBackground(new Background(story60Image));

//     //story61
//       //variable and attributes
//     Label story61Question;
//     story61Question = new Label("What is the fourth derivative of 9x^3+11x^2?");
//       story61Question.setMinWidth(700);
//       story61Question.setMaxWidth(700);
//       story61Question.setMinHeight(60); 
//       story61Question.setMaxHeight(60); 
//       story61Question.setStyle("-fx-background-color:transparent;-fx-font-size:140%;-fx-text-fill:black;-fx-font-weight:bold;");  
//       story61Question.setAlignment(Pos.CENTER);

//     Label story61Label; // story array
//     story61Label = new Label(""); // blank space
//       story61Label.setMinWidth(700);
//       story61Label.setMaxWidth(700);
//       story61Label.setMinHeight(40);  
//       story61Label.setMaxHeight(40);  
//       story61Label.setStyle("-fx-text-fill:white;-fx-font-size:120%;-fx-background-color:transparent");
//       story61Label.setAlignment(Pos.CENTER);

//     Button story61Button1; //play
//     story61Button1 = new Button("a) 27x^2 + 22x"); //play
//       story61Button1.setStyle("-fx-background-color:transparent;-fx-font-size:120%;-fx-border-width:1px");
//       story61Button1.setFocusTraversable(false);
//       story61Button1.setMinWidth(250);
//       story61Button1.setMinHeight(50);
//       story61Button1.setMaxWidth(250);
//       story61Button1.setMaxHeight(50);
//       story61Button1.setAlignment(Pos.CENTER_LEFT);

//     Button story61Button2; //play
//     story61Button2 = new Button("b) 0"); //play
//       story61Button2.setStyle("-fx-background-color:transparent;-fx-font-size:120%;-fx-border-width:1px");
//       story61Button2.setFocusTraversable(false);
//       story61Button2.setMinWidth(250);
//       story61Button2.setMinHeight(50);
//       story61Button2.setMaxWidth(250);
//       story61Button2.setMaxHeight(50);
//       story61Button2.setAlignment(Pos.CENTER_LEFT);

//     Button story61Button3; //play
//     story61Button3 = new Button("c) 54x + 22"); //play
//       story61Button3.setStyle("-fx-background-color:transparent;-fx-font-size:120%;-fx-border-width:1px");
//       story61Button3.setFocusTraversable(false);
//       story61Button3.setMinWidth(250);
//       story61Button3.setMinHeight(50);
//       story61Button3.setMaxWidth(250);
//       story61Button3.setMaxHeight(50);
//       story61Button3.setAlignment(Pos.CENTER_LEFT);
    
     
//       //animation
//     final String story61Content = "Remember to derive four times!";
//     final Text story61Text = new Text(10, 20, "");
    
//     final Animation story61Animation = new Transition() {
//         {
//             setCycleDuration(Duration.millis(1000));
//         }
    
//         protected void interpolate(double frac) {
//             final int story61Length = story61Content.length();
//             final int story61N = Math.round(story61Length * (float) frac);
//             story61Label.setText(story61Content.substring(0, story61N));
//         }
    
//     };
      
//       //1) gridpane intialization
//     story61Node = new GridPane();
//      story61Node.add(story61Question, 0, 1, 3, 1);
//         story61Node.add(story61Label, 0, 9, 3, 1);
//         story61Node.add(story61Button1, 1, 3);
//         story61Node.add(story61Button2, 1, 5);
//         story61Node.add(story61Button3, 1, 7);
//       //2) row/column intialization
//     RowConstraints story61row1 = new RowConstraints();
//     story61row1.setMinHeight(70);
//     RowConstraints story61row2 = new RowConstraints();
//     story61row2.setMinHeight(60);
//     RowConstraints story61row3 = new RowConstraints();
//     story61row3.setMinHeight(10);
//     RowConstraints story61row4 = new RowConstraints();
//     story61row4.setMinHeight(50);
//     RowConstraints story61row5 = new RowConstraints();
//     story61row5.setMinHeight(10);
//     RowConstraints story61row6 = new RowConstraints();
//     story61row6.setMinHeight(50);
//     RowConstraints story61row7 = new RowConstraints();
//     story61row7.setMinHeight(10);
//     RowConstraints story61row8 = new RowConstraints();
//     story61row8.setMinHeight(50);
//     RowConstraints story61row9 = new RowConstraints();
//     story61row9.setMinHeight(30);
//     RowConstraints story61row10 = new RowConstraints();
//     story61row10.setMinHeight(40);
//     story61row10.setMaxHeight(40);
//     RowConstraints story61row11 = new RowConstraints();
//     story61row11.setMinHeight(20);
//     story61row11.setMaxHeight(20);
//     ColumnConstraints story61col1 = new ColumnConstraints();
//     story61col1.setMinWidth(135);
//     story61col1.setMaxWidth(135);
//     ColumnConstraints story61col2 = new ColumnConstraints();
//     story61col2.setMinWidth(470);
//     ColumnConstraints story61col3 = new ColumnConstraints();
//     story61col3.setMinWidth(30);
//     story61Node.getRowConstraints().addAll(story61row1,story61row2,story61row3,story61row4,story61row5,story61row6,story61row7,story61row8,story61row9,story61row10,story61row11); 
//     story61Node.getColumnConstraints().addAll(story61col1, story61col2, story61col3); 
//       //3) background image
//     BackgroundSize story61BackgroundSize = new BackgroundSize(900, 700, true, true, true, false);
//     BackgroundImage story61Image = new BackgroundImage(
//         new Image("https://cdn.discordapp.com/attachments/1261210481721348159/1268252834948976731/IMG_4334.png?ex=66b79d7e&is=66b64bfe&hm=081886eeffab90a517461193663149a1d5eab499c7d06c016db6c13a643bead3&"),
//         BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, story61BackgroundSize);
//     story61Node.setBackground(new Background(story61Image));


   
    
//     //story63
//       //variable and attributes
//     Label story63Question;
//     story63Question = new Label("What is the second derivative of 12x^2 + 4x^1");
//       story63Question.setMinWidth(700);
//       story63Question.setMaxWidth(700);
//       story63Question.setMinHeight(60); 
//       story63Question.setMaxHeight(60); 
//       story63Question.setStyle("-fx-background-color:transparent;-fx-font-size:140%;-fx-text-fill:black;-fx-font-weight:bold;");  
//       story63Question.setAlignment(Pos.CENTER);

//     Label story63Label; // story array
//     story63Label = new Label(""); // blank space
//       story63Label.setMinWidth(700);
//       story63Label.setMaxWidth(700);
//       story63Label.setMinHeight(40);  
//       story63Label.setMaxHeight(40);  
//       story63Label.setStyle("-fx-text-fill:white;-fx-font-size:120%;-fx-background-color:transparent");
//       story63Label.setAlignment(Pos.CENTER);

//     Button story63Button1; //play
//     story63Button1 = new Button("a) 24"); //play
//       story63Button1.setStyle("-fx-background-color:transparent;-fx-font-size:120%;-fx-border-width:1px");
//       story63Button1.setFocusTraversable(false);
//       story63Button1.setMinWidth(250);
//       story63Button1.setMinHeight(50);
//       story63Button1.setMaxWidth(250);
//       story63Button1.setMaxHeight(50);
//       story63Button1.setAlignment(Pos.CENTER_LEFT);

//     Button story63Button2; //play
//     story63Button2 = new Button("b) 24x + 4"); //play
//       story63Button2.setStyle("-fx-background-color:transparent;-fx-font-size:120%;-fx-border-width:1px");
//       story63Button2.setFocusTraversable(false);
//       story63Button2.setMinWidth(250);
//       story63Button2.setMinHeight(50);
//       story63Button2.setMaxWidth(250);
//       story63Button2.setMaxHeight(50);
//       story63Button2.setAlignment(Pos.CENTER_LEFT);

//     Button story63Button3; //play
//     story63Button3 = new Button("c) 0"); //play
//       story63Button3.setStyle("-fx-background-color:transparent;-fx-font-size:120%;-fx-border-width:1px");
//       story63Button3.setFocusTraversable(false);
//       story63Button3.setMinWidth(250);
//       story63Button3.setMinHeight(50);
//       story63Button3.setMaxWidth(250);
//       story63Button3.setMaxHeight(50);
//       story63Button3.setAlignment(Pos.CENTER_LEFT);
    
     
//       //animation
//     final String story63Content = "Remember to derive twice!";
//     final Text story63Text = new Text(10, 20, "");
    
//     final Animation story63Animation = new Transition() {
//         {
//             setCycleDuration(Duration.millis(4000));
//         }
    
//         protected void interpolate(double frac) {
//             final int story63Length = story63Content.length();
//             final int story63N = Math.round(story63Length * (float) frac);
//             story63Label.setText(story63Content.substring(0, story63N));
//         }
    
//     };
      
//       //1) gridpane intialization
//     story63Node = new GridPane();
//      story63Node.add(story63Question, 0, 1, 3, 1);
//         story63Node.add(story63Label, 0, 9, 3, 1);
//         story63Node.add(story63Button1, 1, 3);
//         story63Node.add(story63Button2, 1, 5);
//         story63Node.add(story63Button3, 1, 7);
//       //2) row/column intialization
//     RowConstraints story63row1 = new RowConstraints();
//     story63row1.setMinHeight(70);
//     RowConstraints story63row2 = new RowConstraints();
//     story63row2.setMinHeight(60);
//     RowConstraints story63row3 = new RowConstraints();
//     story63row3.setMinHeight(10);
//     RowConstraints story63row4 = new RowConstraints();
//     story63row4.setMinHeight(50);
//     RowConstraints story63row5 = new RowConstraints();
//     story63row5.setMinHeight(10);
//     RowConstraints story63row6 = new RowConstraints();
//     story63row6.setMinHeight(50);
//     RowConstraints story63row7 = new RowConstraints();
//     story63row7.setMinHeight(10);
//     RowConstraints story63row8 = new RowConstraints();
//     story63row8.setMinHeight(50);
//     RowConstraints story63row9 = new RowConstraints();
//     story63row9.setMinHeight(30);
//     RowConstraints story63row10 = new RowConstraints();
//     story63row10.setMinHeight(40);
//     story63row10.setMaxHeight(40);
//     RowConstraints story63row11 = new RowConstraints();
//     story63row11.setMinHeight(20);
//     story63row11.setMaxHeight(20);
//     ColumnConstraints story63col1 = new ColumnConstraints();
//     story63col1.setMinWidth(135);
//     story63col1.setMaxWidth(135);
//     ColumnConstraints story63col2 = new ColumnConstraints();
//     story63col2.setMinWidth(470);
//     ColumnConstraints story63col3 = new ColumnConstraints();
//     story63col3.setMinWidth(30);
//     story63Node.getRowConstraints().addAll(story63row1,story63row2,story63row3,story63row4,story63row5,story63row6,story63row7,story63row8,story63row9,story63row10,story63row11); 
//     story63Node.getColumnConstraints().addAll(story63col1, story63col2, story63col3); 
//       //3) background image
//     BackgroundSize story63BackgroundSize = new BackgroundSize(900, 700, true, true, true, false);
//     BackgroundImage story63Image = new BackgroundImage(
//         new Image("https://cdn.discordapp.com/attachments/1261210481721348159/1268252834948976731/IMG_4334.png?ex=66b79d7e&is=66b64bfe&hm=081886eeffab90a517461193663149a1d5eab499c7d06c016db6c13a643bead3&"),
//         BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, story63BackgroundSize);
//     story63Node.setBackground(new Background(story63Image));

//     //story64
//       //variable and attributes
//     Label story64Question;
//     story64Question = new Label("What is the derivative of tan(4+10u)");
//       story64Question.setMinWidth(700);
//       story64Question.setMaxWidth(700);
//       story64Question.setMinHeight(60); 
//       story64Question.setMaxHeight(60); 
//       story64Question.setStyle("-fx-background-color:transparent;-fx-font-size:140%;-fx-text-fill:black;-fx-font-weight:bold;");  
//       story64Question.setAlignment(Pos.CENTER);

//     Label story64Label; // story array
//     story64Label = new Label(""); // blank space
//       story64Label.setMinWidth(700);
//       story64Label.setMaxWidth(700);
//       story64Label.setMinHeight(40);  
//       story64Label.setMaxHeight(40);  
//       story64Label.setStyle("-fx-text-fill:white;-fx-font-size:120%;-fx-background-color:transparent");
//       story64Label.setAlignment(Pos.CENTER);

//     Button story64Button1; //play
//     story64Button1 = new Button("a) 10sec^2(4+10u)"); //play
//       story64Button1.setStyle("-fx-background-color:transparent;-fx-font-size:120%;-fx-border-width:1px");
//       story64Button1.setFocusTraversable(false);
//       story64Button1.setMinWidth(250);
//       story64Button1.setMinHeight(50);
//       story64Button1.setMaxWidth(250);
//       story64Button1.setMaxHeight(50);
//       story64Button1.setAlignment(Pos.CENTER_LEFT);

//     Button story64Button2; //play
//     story64Button2 = new Button("b) 5cot^2(4+10u)"); //play
//       story64Button2.setStyle("-fx-background-color:transparent;-fx-font-size:120%;-fx-border-width:1px");
//       story64Button2.setFocusTraversable(false);
//       story64Button2.setMinWidth(250);
//       story64Button2.setMinHeight(50);
//       story64Button2.setMaxWidth(250);
//       story64Button2.setMaxHeight(50);
//       story64Button2.setAlignment(Pos.CENTER_LEFT);

//     Button story64Button3; //play
//     story64Button3 = new Button("c) 10tan^2(4+10u)"); //play
//       story64Button3.setStyle("-fx-background-color:transparent;-fx-font-size:120%;-fx-border-width:1px");
//       story64Button3.setFocusTraversable(false);
//       story64Button3.setMinWidth(250);
//       story64Button3.setMinHeight(50);
//       story64Button3.setMaxWidth(250);
//       story64Button3.setMaxHeight(50);
//       story64Button3.setAlignment(Pos.CENTER_LEFT);
    
     
//       //animation
//     final String story64Content = "Do you know your trig derivatives?";
//     final Text story64Text = new Text(10, 20, "");
    
//     final Animation story64Animation = new Transition() {
//         {
//             setCycleDuration(Duration.millis(4000));
//         }
    
//         protected void interpolate(double frac) {
//             final int story64Length = story64Content.length();
//             final int story64N = Math.round(story64Length * (float) frac);
//             story64Label.setText(story64Content.substring(0, story64N));
//         }
    
//     };
      
//       //1) gridpane intialization
//     story64Node = new GridPane();
//      story64Node.add(story64Question, 0, 1, 3, 1);
//         story64Node.add(story64Label, 0, 9, 3, 1);
//         story64Node.add(story64Button1, 1, 3);
//         story64Node.add(story64Button2, 1, 5);
//         story64Node.add(story64Button3, 1, 7);
//       //2) row/column intialization
//     RowConstraints story64row1 = new RowConstraints();
//     story64row1.setMinHeight(70);
//     RowConstraints story64row2 = new RowConstraints();
//     story64row2.setMinHeight(60);
//     RowConstraints story64row3 = new RowConstraints();
//     story64row3.setMinHeight(10);
//     RowConstraints story64row4 = new RowConstraints();
//     story64row4.setMinHeight(50);
//     RowConstraints story64row5 = new RowConstraints();
//     story64row5.setMinHeight(10);
//     RowConstraints story64row6 = new RowConstraints();
//     story64row6.setMinHeight(50);
//     RowConstraints story64row7 = new RowConstraints();
//     story64row7.setMinHeight(10);
//     RowConstraints story64row8 = new RowConstraints();
//     story64row8.setMinHeight(50);
//     RowConstraints story64row9 = new RowConstraints();
//     story64row9.setMinHeight(30);
//     RowConstraints story64row10 = new RowConstraints();
//     story64row10.setMinHeight(40);
//     story64row10.setMaxHeight(40);
//     RowConstraints story64row11 = new RowConstraints();
//     story64row11.setMinHeight(20);
//     story64row11.setMaxHeight(20);
//     ColumnConstraints story64col1 = new ColumnConstraints();
//     story64col1.setMinWidth(135);
//     story64col1.setMaxWidth(135);
//     ColumnConstraints story64col2 = new ColumnConstraints();
//     story64col2.setMinWidth(470);
//     ColumnConstraints story64col3 = new ColumnConstraints();
//     story64col3.setMinWidth(30);
//     story64Node.getRowConstraints().addAll(story64row1,story64row2,story64row3,story64row4,story64row5,story64row6,story64row7,story64row8,story64row9,story64row10,story64row11); 
//     story64Node.getColumnConstraints().addAll(story64col1, story64col2, story64col3); 
//       //3) background image
//     BackgroundSize story64BackgroundSize = new BackgroundSize(900, 700, true, true, true, false);
//     BackgroundImage story64Image = new BackgroundImage(
//         new Image("https://cdn.discordapp.com/attachments/1261210481721348159/1268252834948976731/IMG_4334.png?ex=66b79d7e&is=66b64bfe&hm=081886eeffab90a517461193663149a1d5eab499c7d06c016db6c13a643bead3&"),
//         BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, story64BackgroundSize);
//     story64Node.setBackground(new Background(story64Image));

//     //story65
//       //variable and attributes
//     Label story65Question;
//     story65Question = new Label("What is the derivative of 9x^3 + 8x?");
//       story65Question.setMinWidth(700);
//       story65Question.setMaxWidth(700);
//       story65Question.setMinHeight(60); 
//       story65Question.setMaxHeight(60); 
//       story65Question.setStyle("-fx-background-color:transparent;-fx-font-size:140%;-fx-text-fill:black;-fx-font-weight:bold;");  
//       story65Question.setAlignment(Pos.CENTER);

//     Label story65Label; // story array
//     story65Label = new Label(""); // blank space
//       story65Label.setMinWidth(700);
//       story65Label.setMaxWidth(700);
//       story65Label.setMinHeight(40);  
//       story65Label.setMaxHeight(40);  
//       story65Label.setStyle("-fx-text-fill:white;-fx-font-size:120%;-fx-background-color:transparent");
//       story65Label.setAlignment(Pos.CENTER);

//     Button story65Button1; //play
//     story65Button1 = new Button("a) 54x"); //play
//       story65Button1.setStyle("-fx-background-color:transparent;-fx-font-size:120%;-fx-border-width:1px");
//       story65Button1.setFocusTraversable(false);
//       story65Button1.setMinWidth(250);
//       story65Button1.setMinHeight(50);
//       story65Button1.setMaxWidth(250);
//       story65Button1.setMaxHeight(50);
//       story65Button1.setAlignment(Pos.CENTER_LEFT);

//     Button story65Button2; //play
//     story65Button2 = new Button("b) 27x^2 + 8"); //play
//       story65Button2.setStyle("-fx-background-color:transparent;-fx-font-size:120%;-fx-border-width:1px");
//       story65Button2.setFocusTraversable(false);
//       story65Button2.setMinWidth(250);
//       story65Button2.setMinHeight(50);
//       story65Button2.setMaxWidth(250);
//       story65Button2.setMaxHeight(50);
//       story65Button2.setAlignment(Pos.CENTER_LEFT);

//     Button story65Button3; //play
//     story65Button3 = new Button("c) 9x^2 + 8x"); //play
//       story65Button3.setStyle("-fx-background-color:transparent;-fx-font-size:120%;-fx-border-width:1px");
//       story65Button3.setFocusTraversable(false);
//       story65Button3.setMinWidth(250);
//       story65Button3.setMinHeight(50);
//       story65Button3.setMaxWidth(250);
//       story65Button3.setMaxHeight(50);
//       story65Button3.setAlignment(Pos.CENTER_LEFT);
    
     
//       //animation
//     final String story65Content = "Remember to check your coefficients!";
//     final Text story65Text = new Text(10, 20, "");
    
//     final Animation story65Animation = new Transition() {
//         {
//             setCycleDuration(Duration.millis(4000));
//         }
    
//         protected void interpolate(double frac) {
//             final int story65Length = story65Content.length();
//             final int story65N = Math.round(story65Length * (float) frac);
//             story65Label.setText(story65Content.substring(0, story65N));
//         }
    
//     };
      
//       //1) gridpane intialization
//     story65Node = new GridPane();
//      story65Node.add(story65Question, 0, 1, 3, 1);
//         story65Node.add(story65Label, 0, 9, 3, 1);
//         story65Node.add(story65Button1, 1, 3);
//         story65Node.add(story65Button2, 1, 5);
//         story65Node.add(story65Button3, 1, 7);
//       //2) row/column intialization
//     RowConstraints story65row1 = new RowConstraints();
//     story65row1.setMinHeight(70);
//     RowConstraints story65row2 = new RowConstraints();
//     story65row2.setMinHeight(60);
//     RowConstraints story65row3 = new RowConstraints();
//     story65row3.setMinHeight(10);
//     RowConstraints story65row4 = new RowConstraints();
//     story65row4.setMinHeight(50);
//     RowConstraints story65row5 = new RowConstraints();
//     story65row5.setMinHeight(10);
//     RowConstraints story65row6 = new RowConstraints();
//     story65row6.setMinHeight(50);
//     RowConstraints story65row7 = new RowConstraints();
//     story65row7.setMinHeight(10);
//     RowConstraints story65row8 = new RowConstraints();
//     story65row8.setMinHeight(50);
//     RowConstraints story65row9 = new RowConstraints();
//     story65row9.setMinHeight(30);
//     RowConstraints story65row10 = new RowConstraints();
//     story65row10.setMinHeight(40);
//     story65row10.setMaxHeight(40);
//     RowConstraints story65row11 = new RowConstraints();
//     story65row11.setMinHeight(20);
//     story65row11.setMaxHeight(20);
//     ColumnConstraints story65col1 = new ColumnConstraints();
//     story65col1.setMinWidth(135);
//     story65col1.setMaxWidth(135);
//     ColumnConstraints story65col2 = new ColumnConstraints();
//     story65col2.setMinWidth(470);
//     ColumnConstraints story65col3 = new ColumnConstraints();
//     story65col3.setMinWidth(30);
//     story65Node.getRowConstraints().addAll(story65row1,story65row2,story65row3,story65row4,story65row5,story65row6,story65row7,story65row8,story65row9,story65row10,story65row11); 
//     story65Node.getColumnConstraints().addAll(story65col1, story65col2, story65col3); 
//       //3) background image
//     BackgroundSize story65BackgroundSize = new BackgroundSize(900, 700, true, true, true, false);
//     BackgroundImage story65Image = new BackgroundImage(
//         new Image("https://cdn.discordapp.com/attachments/1261210481721348159/1268252834948976731/IMG_4334.png?ex=66b79d7e&is=66b64bfe&hm=081886eeffab90a517461193663149a1d5eab499c7d06c016db6c13a643bead3&"),
//         BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, story65BackgroundSize);
//     story65Node.setBackground(new Background(story65Image));

//     //story66
//       //variable and attributes
//     Label story66Question;
//     story66Question = new Label("g(x)=e^1-cos(x), g'(x)=?");
//       story66Question.setMinWidth(700);
//       story66Question.setMaxWidth(700);
//       story66Question.setMinHeight(60); 
//       story66Question.setMaxHeight(60); 
//       story66Question.setStyle("-fx-background-color:transparent;-fx-font-size:140%;-fx-text-fill:black;-fx-font-weight:bold;");  
//       story66Question.setAlignment(Pos.CENTER);

//     Label story66Label; // story array
//     story66Label = new Label(""); // blank space
//       story66Label.setMinWidth(700);
//       story66Label.setMaxWidth(700);
//       story66Label.setMinHeight(40);  
//       story66Label.setMaxHeight(40);  
//       story66Label.setStyle("-fx-text-fill:white;-fx-font-size:120%;-fx-background-color:transparent");
//       story66Label.setAlignment(Pos.CENTER);

//     Button story66Button1; //play
//     story66Button1 = new Button("a) sin(x)e^1-cos(x)"); //play
//       story66Button1.setStyle("-fx-background-color:transparent;-fx-font-size:120%;-fx-border-width:1px");
//       story66Button1.setFocusTraversable(false);
//       story66Button1.setMinWidth(250);
//       story66Button1.setMinHeight(50);
//       story66Button1.setMaxWidth(250);
//       story66Button1.setMaxHeight(50);
//       story66Button1.setAlignment(Pos.CENTER_LEFT);

//     Button story66Button2; //play
//     story66Button2 = new Button("b) cos(x)e^1-cos(x)"); //play
//       story66Button2.setStyle("-fx-background-color:transparent;-fx-font-size:120%;-fx-border-width:1px");
//       story66Button2.setFocusTraversable(false);
//       story66Button2.setMinWidth(250);
//       story66Button2.setMinHeight(50);
//       story66Button2.setMaxWidth(250);
//       story66Button2.setMaxHeight(50);
//       story66Button2.setAlignment(Pos.CENTER_LEFT);

//     Button story66Button3; //play
//     story66Button3 = new Button("c) sin(x)e^1-sin(x)"); //play
//       story66Button3.setStyle("-fx-background-color:transparent;-fx-font-size:120%;-fx-border-width:1px");
//       story66Button3.setFocusTraversable(false);
//       story66Button3.setMinWidth(250);
//       story66Button3.setMinHeight(50);
//       story66Button3.setMaxWidth(250);
//       story66Button3.setMaxHeight(50);
//       story66Button3.setAlignment(Pos.CENTER_LEFT);
    
     
//       //animation
//     final String story66Content = "Do you know your trig derivatives?";
//     final Text story66Text = new Text(10, 20, "");
    
//     final Animation story66Animation = new Transition() {
//         {
//             setCycleDuration(Duration.millis(4000));
//         }
    
//         protected void interpolate(double frac) {
//             final int story66Length = story66Content.length();
//             final int story66N = Math.round(story66Length * (float) frac);
//             story66Label.setText(story66Content.substring(0, story66N));
//         }
    
//     };
      
//       //1) gridpane intialization
//     story66Node = new GridPane();
//      story66Node.add(story66Question, 0, 1, 3, 1);
//         story66Node.add(story66Label, 0, 9, 3, 1);
//         story66Node.add(story66Button1, 1, 3);
//         story66Node.add(story66Button2, 1, 5);
//         story66Node.add(story66Button3, 1, 7);
//       //2) row/column intialization
//     RowConstraints story66row1 = new RowConstraints();
//     story66row1.setMinHeight(70);
//     RowConstraints story66row2 = new RowConstraints();
//     story66row2.setMinHeight(60);
//     RowConstraints story66row3 = new RowConstraints();
//     story66row3.setMinHeight(10);
//     RowConstraints story66row4 = new RowConstraints();
//     story66row4.setMinHeight(50);
//     RowConstraints story66row5 = new RowConstraints();
//     story66row5.setMinHeight(10);
//     RowConstraints story66row6 = new RowConstraints();
//     story66row6.setMinHeight(50);
//     RowConstraints story66row7 = new RowConstraints();
//     story66row7.setMinHeight(10);
//     RowConstraints story66row8 = new RowConstraints();
//     story66row8.setMinHeight(50);
//     RowConstraints story66row9 = new RowConstraints();
//     story66row9.setMinHeight(30);
//     RowConstraints story66row10 = new RowConstraints();
//     story66row10.setMinHeight(40);
//     story66row10.setMaxHeight(40);
//     RowConstraints story66row11 = new RowConstraints();
//     story66row11.setMinHeight(20);
//     story66row11.setMaxHeight(20);
//     ColumnConstraints story66col1 = new ColumnConstraints();
//     story66col1.setMinWidth(135);
//     story66col1.setMaxWidth(135);
//     ColumnConstraints story66col2 = new ColumnConstraints();
//     story66col2.setMinWidth(470);
//     ColumnConstraints story66col3 = new ColumnConstraints();
//     story66col3.setMinWidth(30);
//     story66Node.getRowConstraints().addAll(story66row1,story66row2,story66row3,story66row4,story66row5,story66row6,story66row7,story66row8,story66row9,story66row10,story66row11); 
//     story66Node.getColumnConstraints().addAll(story66col1, story66col2, story66col3); 
//       //3) background image
//     BackgroundSize story66BackgroundSize = new BackgroundSize(900, 700, true, true, true, false);
//     BackgroundImage story66Image = new BackgroundImage(
//         new Image("https://cdn.discordapp.com/attachments/1261210481721348159/1268252834948976731/IMG_4334.png?ex=66b79d7e&is=66b64bfe&hm=081886eeffab90a517461193663149a1d5eab499c7d06c016db6c13a643bead3&"),
//         BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, story66BackgroundSize);
//     story66Node.setBackground(new Background(story66Image));

//     //story67
//       //variable and attributes
//     Label story67Speaker;
//     story67Speaker = new Label("Mr. Sevilla");
//       story67Speaker.setStyle("-fx-text-fill:white;-fx-font-size:200%;-fx-font-weight:bold;");
//       story67Speaker.setAlignment(Pos.CENTER_LEFT);
//     Label story67Label; // story array
//     story67Label = new Label(""); // blank space
//       story67Label.setMinWidth(550);
//       story67Label.setMaxWidth(550);
//       story67Label.setMinHeight(100);  
//       story67Label.setStyle("-fx-text-fill:black;-fx-font-size:120%;-fx-background-color:rgba(255,255,255,0.7);");
//       story67Label.setAlignment(Pos.CENTER_LEFT);
//     Label story67Blank;
//     story67Blank = new Label("");
//       story67Blank.setMinWidth(30);
//       story67Blank.setMinHeight(50); 
//       story67Blank.setStyle("-fx-background-color:transparent");
//     Label story67Blank1;
//     story67Blank1 = new Label("");
//       story67Blank1.setMinWidth(30);
//       story67Blank1.setMinHeight(100);
// story67Blank1.setStyle("-fx-background-color:rgba(255,255,255,0.7)");
     
//       //animation
//     final String story67Content = "*sigh* My students are such a pain. Lower life forms are such a\nhandful. But, *you* must like your students, huh?";
//     final Text story67Text = new Text(10, 20, "");
    
//     final Animation story67Animation = new Transition() {
//         {
//             setCycleDuration(Duration.millis(3300));
//         }
    
//         protected void interpolate(double frac) {
//             final int story67Length = story67Content.length();
//             final int story67N = Math.round(story67Length * (float) frac);
//             story67Label.setText(story67Content.substring(0, story67N));
//         }
        
//     };
    
//       //1) gridpane intialization
//     story67Node = new GridPane();
//     story67Node.add(story67Speaker, 2, 2);
//     story67Node.add(story67Label, 2, 3);
//     story67Node.add(story67Blank, 1, 2, 1, 1);
//     story67Node.add(story67Blank1, 1, 3, 1, 1);
//       //2) row/column intialization
//     RowConstraints story67row1 = new RowConstraints();
//     story67row1.setMinHeight(50);
//     RowConstraints story67row2 = new RowConstraints();
//     story67row2.setMinHeight(200);
//     RowConstraints story67row3 = new RowConstraints();
//     story67row3.setMinHeight(50);
//     RowConstraints story67row4 = new RowConstraints();
//     story67row4.setMinHeight(100);
//     ColumnConstraints story67col1 = new ColumnConstraints();
//     story67col1.setMinWidth(50);
//     ColumnConstraints story67col2 = new ColumnConstraints();
//     story67col2.setMinWidth(30);
//     ColumnConstraints story67col3 = new ColumnConstraints();
//     story67col3.setMinWidth(550);
//     ColumnConstraints story67col4 = new ColumnConstraints();
//     story67col4.setMinWidth(50);
//     story67Node.getRowConstraints().addAll(story67row1,story67row2,story67row3,story67row4); 
//     story67Node.getColumnConstraints().addAll(story67col1, story67col2, story67col3,story67col4); 

//       //3) background image
//     BackgroundSize story67BackgroundSize = new BackgroundSize(900, 700, true, true, true, false);
// 	//image. Replace url
//     BackgroundImage story67Image = new BackgroundImage(
//         new Image("https://cdn.discordapp.com/attachments/1261210481721348159/1268252834948976731/IMG_4334.png?ex=66b79d7e&is=66b64bfe&hm=081886eeffab90a517461193663149a1d5eab499c7d06c016db6c13a643bead3&"),
//         BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, story67BackgroundSize);
//     story67Node.setBackground(new Background(story67Image));

//     //story68
//       //variable and attributes
//     Label story68Speaker;
//     story68Speaker = new Label("Mr. Enriquez");
//       story68Speaker.setStyle("-fx-text-fill:white;-fx-font-size:200%;-fx-font-weight:bold;");
//       story68Speaker.setAlignment(Pos.CENTER_LEFT);
//     Label story68Label; // story array
//     story68Label = new Label(""); // blank space
//       story68Label.setMinWidth(550);
//       story68Label.setMaxWidth(550);
//       story68Label.setMinHeight(100);  
//       story68Label.setStyle("-fx-text-fill:black;-fx-font-size:120%;-fx-background-color:rgba(255,255,255,0.7);");
//       story68Label.setAlignment(Pos.CENTER_LEFT);
//     Label story68Blank;
//     story68Blank = new Label("");
//       story68Blank.setMinWidth(30);
//       story68Blank.setMinHeight(50); 
//       story68Blank.setStyle("-fx-background-color:transparent");
//     Label story68Blank1;
//     story68Blank1 = new Label("");
//       story68Blank1.setMinWidth(30);
//       story68Blank1.setMinHeight(100);
// story68Blank1.setStyle("-fx-background-color:rgba(255,255,255,0.7)");
     
//       //animation
//     final String story68Content = "Oh no, not at all. I made sure to give all my students very hard\nproblems on their tests.";
//     final Text story68Text = new Text(10, 20, "");
    
//     final Animation story68Animation = new Transition() {
//         {
//             setCycleDuration(Duration.millis(3000));
//         }
    
//         protected void interpolate(double frac) {
//             final int story68Length = story68Content.length();
//             final int story68N = Math.round(story68Length * (float) frac);
//             story68Label.setText(story68Content.substring(0, story68N));
//         }
        
//     };
    
//       //1) gridpane intialization
//     story68Node = new GridPane();
//     story68Node.add(story68Speaker, 2, 2);
//     story68Node.add(story68Label, 2, 3);
//     story68Node.add(story68Blank, 1, 2, 1, 1);
//     story68Node.add(story68Blank1, 1, 3, 1, 1);
//       //2) row/column intialization
//     RowConstraints story68row1 = new RowConstraints();
//     story68row1.setMinHeight(50);
//     RowConstraints story68row2 = new RowConstraints();
//     story68row2.setMinHeight(200);
//     RowConstraints story68row3 = new RowConstraints();
//     story68row3.setMinHeight(50);
//     RowConstraints story68row4 = new RowConstraints();
//     story68row4.setMinHeight(100);
//     ColumnConstraints story68col1 = new ColumnConstraints();
//     story68col1.setMinWidth(50);
//     ColumnConstraints story68col2 = new ColumnConstraints();
//     story68col2.setMinWidth(30);
//     ColumnConstraints story68col3 = new ColumnConstraints();
//     story68col3.setMinWidth(550);
//     ColumnConstraints story68col4 = new ColumnConstraints();
//     story68col4.setMinWidth(50);
//     story68Node.getRowConstraints().addAll(story68row1,story68row2,story68row3,story68row4); 
//     story68Node.getColumnConstraints().addAll(story68col1, story68col2, story68col3,story68col4); 

//       //3) background image
//     BackgroundSize story68BackgroundSize = new BackgroundSize(900, 700, true, true, true, false);
// 	//image. Replace url
//     BackgroundImage story68Image = new BackgroundImage(
//         new Image("https://cdn.discordapp.com/attachments/1261210481721348159/1268252834948976731/IMG_4334.png?ex=66b79d7e&is=66b64bfe&hm=081886eeffab90a517461193663149a1d5eab499c7d06c016db6c13a643bead3&"),
//         BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, story68BackgroundSize);
//     story68Node.setBackground(new Background(story68Image));

//     //story69
//       //variable and attributes
//     Label story69Speaker;
//     story69Speaker = new Label("Mr. Sevilla");
//       story69Speaker.setStyle("-fx-text-fill:white;-fx-font-size:200%;-fx-font-weight:bold;");
//       story69Speaker.setAlignment(Pos.CENTER_LEFT);
//     Label story69Label; // story array
//     story69Label = new Label(""); // blank space
//       story69Label.setMinWidth(550);
//       story69Label.setMaxWidth(550);
//       story69Label.setMinHeight(100);  
//       story69Label.setStyle("-fx-text-fill:black;-fx-font-size:120%;-fx-background-color:rgba(255,255,255,0.7);");
//       story69Label.setAlignment(Pos.CENTER_LEFT);
//     Label story69Blank;
//     story69Blank = new Label("");
//       story69Blank.setMinWidth(30);
//       story69Blank.setMinHeight(50); 
//       story69Blank.setStyle("-fx-background-color:transparent");
//     Label story69Blank1;
//     story69Blank1 = new Label("");
//       story69Blank1.setMinWidth(30);
//       story69Blank1.setMinHeight(100);
// story69Blank1.setStyle("-fx-background-color:rgba(255,255,255,0.7)");
     
//       //animation
//     final String story69Content = "O-oh yeah? Give me an example.";
//     final Text story69Text = new Text(10, 20, "");
    
//     final Animation story69Animation = new Transition() {
//         {
//             setCycleDuration(Duration.millis(2000));
//         }
    
//         protected void interpolate(double frac) {
//             final int story69Length = story69Content.length();
//             final int story69N = Math.round(story69Length * (float) frac);
//             story69Label.setText(story69Content.substring(0, story69N));
//         }
        
//     };
    
//       //1) gridpane intialization
//     story69Node = new GridPane();
//     story69Node.add(story69Speaker, 2, 2);
//     story69Node.add(story69Label, 2, 3);
//     story69Node.add(story69Blank, 1, 2, 1, 1);
//     story69Node.add(story69Blank1, 1, 3, 1, 1);
//       //2) row/column intialization
//     RowConstraints story69row1 = new RowConstraints();
//     story69row1.setMinHeight(50);
//     RowConstraints story69row2 = new RowConstraints();
//     story69row2.setMinHeight(200);
//     RowConstraints story69row3 = new RowConstraints();
//     story69row3.setMinHeight(50);
//     RowConstraints story69row4 = new RowConstraints();
//     story69row4.setMinHeight(100);
//     ColumnConstraints story69col1 = new ColumnConstraints();
//     story69col1.setMinWidth(50);
//     ColumnConstraints story69col2 = new ColumnConstraints();
//     story69col2.setMinWidth(30);
//     ColumnConstraints story69col3 = new ColumnConstraints();
//     story69col3.setMinWidth(550);
//     ColumnConstraints story69col4 = new ColumnConstraints();
//     story69col4.setMinWidth(50);
//     story69Node.getRowConstraints().addAll(story69row1,story69row2,story69row3,story69row4); 
//     story69Node.getColumnConstraints().addAll(story69col1, story69col2, story69col3,story69col4); 

//       //3) background image
//     BackgroundSize story69BackgroundSize = new BackgroundSize(900, 700, true, true, true, false);
// 	//image. Replace url
//     BackgroundImage story69Image = new BackgroundImage(
//         new Image("https://cdn.discordapp.com/attachments/1261210481721348159/1268252834948976731/IMG_4334.png?ex=66b79d7e&is=66b64bfe&hm=081886eeffab90a517461193663149a1d5eab499c7d06c016db6c13a643bead3&"),
//         BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, story69BackgroundSize);
//     story69Node.setBackground(new Background(story69Image));

//     //story70
//       //variable and attributes
//     Label story70Speaker;
//     story70Speaker = new Label("Mr. Enriquez");
//       story70Speaker.setStyle("-fx-text-fill:white;-fx-font-size:200%;-fx-font-weight:bold;");
//       story70Speaker.setAlignment(Pos.CENTER_LEFT);
//     Label story70Label; // story array
//     story70Label = new Label(""); // blank space
//       story70Label.setMinWidth(550);
//       story70Label.setMaxWidth(550);
//       story70Label.setMinHeight(100);  
//       story70Label.setStyle("-fx-text-fill:black;-fx-font-size:120%;-fx-background-color:rgba(255,255,255,0.7);");
//       story70Label.setAlignment(Pos.CENTER_LEFT);
//     Label story70Blank;
//     story70Blank = new Label("");
//       story70Blank.setMinWidth(30);
//       story70Blank.setMinHeight(50); 
//       story70Blank.setStyle("-fx-background-color:transparent");
//     Label story70Blank1;
//     story70Blank1 = new Label("");
//       story70Blank1.setMinWidth(30);
//       story70Blank1.setMinHeight(100);
// story70Blank1.setStyle("-fx-background-color:rgba(255,255,255,0.7)");
     
//       //animation
//     final String story70Content = "One time, i gave them a TRICK question in order to ensure\nthey failed. I TOLD THEM TO COUNT RECURSIONS but there\nWERE NO recursions!!";
//     final Text story70Text = new Text(10, 20, "");
    
//     final Animation story70Animation = new Transition() {
//         {
//             setCycleDuration(Duration.millis(2000));
//         }
    
//         protected void interpolate(double frac) {
//             final int story70Length = story70Content.length();
//             final int story70N = Math.round(story70Length * (float) frac);
//             story70Label.setText(story70Content.substring(0, story70N));
//         }
        
//     };
    
//       //1) gridpane intialization
//     story70Node = new GridPane();
//     story70Node.add(story70Speaker, 2, 2);
//     story70Node.add(story70Label, 2, 3);
//     story70Node.add(story70Blank, 1, 2, 1, 1);
//     story70Node.add(story70Blank1, 1, 3, 1, 1);
//       //2) row/column intialization
//     RowConstraints story70row1 = new RowConstraints();
//     story70row1.setMinHeight(50);
//     RowConstraints story70row2 = new RowConstraints();
//     story70row2.setMinHeight(200);
//     RowConstraints story70row3 = new RowConstraints();
//     story70row3.setMinHeight(50);
//     RowConstraints story70row4 = new RowConstraints();
//     story70row4.setMinHeight(100);
//     ColumnConstraints story70col1 = new ColumnConstraints();
//     story70col1.setMinWidth(50);
//     ColumnConstraints story70col2 = new ColumnConstraints();
//     story70col2.setMinWidth(30);
//     ColumnConstraints story70col3 = new ColumnConstraints();
//     story70col3.setMinWidth(550);
//     ColumnConstraints story70col4 = new ColumnConstraints();
//     story70col4.setMinWidth(50);
//     story70Node.getRowConstraints().addAll(story70row1,story70row2,story70row3,story70row4); 
//     story70Node.getColumnConstraints().addAll(story70col1, story70col2, story70col3,story70col4); 

//       //3) background image
//     BackgroundSize story70BackgroundSize = new BackgroundSize(900, 700, true, true, true, false);
// 	//image. Replace url
//     BackgroundImage story70Image = new BackgroundImage(
//         new Image("https://cdn.discordapp.com/attachments/1261210481721348159/1268252834948976731/IMG_4334.png?ex=66b79d7e&is=66b64bfe&hm=081886eeffab90a517461193663149a1d5eab499c7d06c016db6c13a643bead3&"),
//         BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, story70BackgroundSize);
//     story70Node.setBackground(new Background(story70Image));

//     //story71
//       //variable and attributes
//     Label story71Speaker;
//     story71Speaker = new Label("Mr. Sevilla");
//       story71Speaker.setStyle("-fx-text-fill:white;-fx-font-size:200%;-fx-font-weight:bold;");
//       story71Speaker.setAlignment(Pos.CENTER_LEFT);
//     Label story71Label; // story array
//     story71Label = new Label(""); // blank space
//       story71Label.setMinWidth(550);
//       story71Label.setMaxWidth(550);
//       story71Label.setMinHeight(100);  
//       story71Label.setStyle("-fx-text-fill:black;-fx-font-size:120%;-fx-background-color:rgba(255,255,255,0.7);");
//       story71Label.setAlignment(Pos.CENTER_LEFT);
//     Label story71Blank;
//     story71Blank = new Label("");
//       story71Blank.setMinWidth(30);
//       story71Blank.setMinHeight(50); 
//       story71Blank.setStyle("-fx-background-color:transparent");
//     Label story71Blank1;
//     story71Blank1 = new Label("");
//       story71Blank1.setMinWidth(30);
//       story71Blank1.setMinHeight(100);
// story71Blank1.setStyle("-fx-background-color:rgba(255,255,255,0.7)");
     
//       //animation
//     final String story71Content = "WHAT n-n-no fair!!! I have a reputation to hold as the most difficult\nteacher in the math department!!!! IM LEAVING!!! CONSIDER\n OUR RELATIONSHIP #OVER!";
//     final Text story71Text = new Text(10, 20, "");
    
//     final Animation story71Animation = new Transition() {
//         {
//             setCycleDuration(Duration.millis(2000));
//         }
    
//         protected void interpolate(double frac) {
//             final int story71Length = story71Content.length();
//             final int story71N = Math.round(story71Length * (float) frac);
//             story71Label.setText(story71Content.substring(0, story71N));
//         }
        
//     };
    
//       //1) gridpane intialization
//     story71Node = new GridPane();
//     story71Node.add(story71Speaker, 2, 2);
//     story71Node.add(story71Label, 2, 3);
//     story71Node.add(story71Blank, 1, 2, 1, 1);
//     story71Node.add(story71Blank1, 1, 3, 1, 1);
//       //2) row/column intialization
//     RowConstraints story71row1 = new RowConstraints();
//     story71row1.setMinHeight(50);
//     RowConstraints story71row2 = new RowConstraints();
//     story71row2.setMinHeight(200);
//     RowConstraints story71row3 = new RowConstraints();
//     story71row3.setMinHeight(50);
//     RowConstraints story71row4 = new RowConstraints();
//     story71row4.setMinHeight(100);
//     ColumnConstraints story71col1 = new ColumnConstraints();
//     story71col1.setMinWidth(50);
//     ColumnConstraints story71col2 = new ColumnConstraints();
//     story71col2.setMinWidth(30);
//     ColumnConstraints story71col3 = new ColumnConstraints();
//     story71col3.setMinWidth(550);
//     ColumnConstraints story71col4 = new ColumnConstraints();
//     story71col4.setMinWidth(50);
//     story71Node.getRowConstraints().addAll(story71row1,story71row2,story71row3,story71row4); 
//     story71Node.getColumnConstraints().addAll(story71col1, story71col2, story71col3,story71col4); 

//       //3) background image
//     BackgroundSize story71BackgroundSize = new BackgroundSize(900, 700, true, true, true, false);
// 	//image. Replace url
//     BackgroundImage story71Image = new BackgroundImage(
//         new Image("https://cdn.discordapp.com/attachments/1261210481721348159/1268252834948976731/IMG_4334.png?ex=66b79d7e&is=66b64bfe&hm=081886eeffab90a517461193663149a1d5eab499c7d06c016db6c13a643bead3&"),
//         BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, story71BackgroundSize);
//     story71Node.setBackground(new Background(story71Image));
    
//     //story72
//       //variable and attributes
//     Label story72Speaker;
//     story72Speaker = new Label("Mr. Enriquez");
//       story72Speaker.setStyle("-fx-text-fill:white;-fx-font-size:200%;-fx-font-weight:bold;");
//       story72Speaker.setAlignment(Pos.CENTER_LEFT);
//     Label story72Label; // story array
//     story72Label = new Label(""); // blank space
//       story72Label.setMinWidth(550);
//       story72Label.setMaxWidth(550);
//       story72Label.setMinHeight(100);  
//       story72Label.setStyle("-fx-text-fill:black;-fx-font-size:120%;-fx-background-color:rgba(255,255,255,0.7);");
//       story72Label.setAlignment(Pos.CENTER_LEFT);
//     Label story72Blank;
//     story72Blank = new Label("");
//       story72Blank.setMinWidth(30);
//       story72Blank.setMinHeight(50); 
//       story72Blank.setStyle("-fx-background-color:transparent");
//     Label story72Blank1;
//     story72Blank1 = new Label("");
//       story72Blank1.setMinWidth(30);
//       story72Blank1.setMinHeight(100);
// story72Blank1.setStyle("-fx-background-color:rgba(255,255,255,0.7)");
     
//       //animation
//     final String story72Content = "Wait..! Don’t go…";
//     final Text story72Text = new Text(10, 20, "");
    
//     final Animation story72Animation = new Transition() {
//         {
//             setCycleDuration(Duration.millis(1000));
//         }
    
//         protected void interpolate(double frac) {
//             final int story72Length = story72Content.length();
//             final int story72N = Math.round(story72Length * (float) frac);
//             story72Label.setText(story72Content.substring(0, story72N));
//         }
        
//     };
    
//       //1) gridpane intialization
//     story72Node = new GridPane();
//     story72Node.add(story72Speaker, 2, 2);
//     story72Node.add(story72Label, 2, 3);
//     story72Node.add(story72Blank, 1, 2, 1, 1);
//     story72Node.add(story72Blank1, 1, 3, 1, 1);
//       //2) row/column intialization
//     RowConstraints story72row1 = new RowConstraints();
//     story72row1.setMinHeight(50);
//     RowConstraints story72row2 = new RowConstraints();
//     story72row2.setMinHeight(200);
//     RowConstraints story72row3 = new RowConstraints();
//     story72row3.setMinHeight(50);
//     RowConstraints story72row4 = new RowConstraints();
//     story72row4.setMinHeight(100);
//     ColumnConstraints story72col1 = new ColumnConstraints();
//     story72col1.setMinWidth(50);
//     ColumnConstraints story72col2 = new ColumnConstraints();
//     story72col2.setMinWidth(30);
//     ColumnConstraints story72col3 = new ColumnConstraints();
//     story72col3.setMinWidth(550);
//     ColumnConstraints story72col4 = new ColumnConstraints();
//     story72col4.setMinWidth(50);
//     story72Node.getRowConstraints().addAll(story72row1,story72row2,story72row3,story72row4); 
//     story72Node.getColumnConstraints().addAll(story72col1, story72col2, story72col3,story72col4); 

//       //3) background image
//     BackgroundSize story72BackgroundSize = new BackgroundSize(900, 700, true, true, true, false);
// 	//image. Replace url
//     BackgroundImage story72Image = new BackgroundImage(
//         new Image("https://cdn.discordapp.com/attachments/1261210481721348159/1268252834948976731/IMG_4334.png?ex=66b79d7e&is=66b64bfe&hm=081886eeffab90a517461193663149a1d5eab499c7d06c016db6c13a643bead3&"),
//         BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, story72BackgroundSize);
//     story72Node.setBackground(new Background(story72Image));

//     //story73
//       //variable and attributes
//     Label story73Speaker;
//     story73Speaker = new Label("Mr. Sevilla");
//       story73Speaker.setStyle("-fx-text-fill:white;-fx-font-size:200%;-fx-font-weight:bold;");
//       story73Speaker.setAlignment(Pos.CENTER_LEFT);
//     Label story73Label; // story array
//     story73Label = new Label(""); // blank space
//       story73Label.setMinWidth(550);
//       story73Label.setMaxWidth(550);
//       story73Label.setMinHeight(100);  
//       story73Label.setStyle("-fx-text-fill:black;-fx-font-size:120%;-fx-background-color:rgba(255,255,255,0.7);");
//       story73Label.setAlignment(Pos.CENTER_LEFT);
//     Label story73Blank;
//     story73Blank = new Label("");
//       story73Blank.setMinWidth(30);
//       story73Blank.setMinHeight(50); 
//       story73Blank.setStyle("-fx-background-color:transparent");
//     Label story73Blank1;
//     story73Blank1 = new Label("");
//       story73Blank1.setMinWidth(30);
//       story73Blank1.setMinHeight(100);
// story73Blank1.setStyle("-fx-background-color:rgba(255,255,255,0.7)");
     
//       //animation
//     final String story73Content = "What!? What do you want! Stupid!";
//     final Text story73Text = new Text(10, 20, "");
    
//     final Animation story73Animation = new Transition() {
//         {
//             setCycleDuration(Duration.millis(2000));
//         }
    
//         protected void interpolate(double frac) {
//             final int story73Length = story73Content.length();
//             final int story73N = Math.round(story73Length * (float) frac);
//             story73Label.setText(story73Content.substring(0, story73N));
//         }
        
//     };
    
//       //1) gridpane intialization
//     story73Node = new GridPane();
//     story73Node.add(story73Speaker, 2, 2);
//     story73Node.add(story73Label, 2, 3);
//     story73Node.add(story73Blank, 1, 2, 1, 1);
//     story73Node.add(story73Blank1, 1, 3, 1, 1);
//       //2) row/column intialization
//     RowConstraints story73row1 = new RowConstraints();
//     story73row1.setMinHeight(50);
//     RowConstraints story73row2 = new RowConstraints();
//     story73row2.setMinHeight(200);
//     RowConstraints story73row3 = new RowConstraints();
//     story73row3.setMinHeight(50);
//     RowConstraints story73row4 = new RowConstraints();
//     story73row4.setMinHeight(100);
//     ColumnConstraints story73col1 = new ColumnConstraints();
//     story73col1.setMinWidth(50);
//     ColumnConstraints story73col2 = new ColumnConstraints();
//     story73col2.setMinWidth(30);
//     ColumnConstraints story73col3 = new ColumnConstraints();
//     story73col3.setMinWidth(550);
//     ColumnConstraints story73col4 = new ColumnConstraints();
//     story73col4.setMinWidth(50);
//     story73Node.getRowConstraints().addAll(story73row1,story73row2,story73row3,story73row4); 
//     story73Node.getColumnConstraints().addAll(story73col1, story73col2, story73col3,story73col4); 

//       //3) background image
//     BackgroundSize story73BackgroundSize = new BackgroundSize(900, 700, true, true, true, false);
// 	//image. Replace url
//     BackgroundImage story73Image = new BackgroundImage(
//         new Image("https://cdn.discordapp.com/attachments/1261210481721348159/1268252834948976731/IMG_4334.png?ex=66b79d7e&is=66b64bfe&hm=081886eeffab90a517461193663149a1d5eab499c7d06c016db6c13a643bead3&"),
//         BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, story73BackgroundSize);
//     story73Node.setBackground(new Background(story73Image));

//     //story74
//       //variable and attributes
//     Label story74Speaker;
//     story74Speaker = new Label("Mr. Enriquez");
//       story74Speaker.setStyle("-fx-text-fill:white;-fx-font-size:200%;-fx-font-weight:bold;");
//       story74Speaker.setAlignment(Pos.CENTER_LEFT);
//     Label story74Label; // story array
//     story74Label = new Label(""); // blank space
//       story74Label.setMinWidth(550);
//       story74Label.setMaxWidth(550);
//       story74Label.setMinHeight(100);  
//       story74Label.setStyle("-fx-text-fill:black;-fx-font-size:120%;-fx-background-color:rgba(255,255,255,0.7);");
//       story74Label.setAlignment(Pos.CENTER_LEFT);
//     Label story74Blank;
//     story74Blank = new Label("");
//       story74Blank.setMinWidth(30);
//       story74Blank.setMinHeight(50); 
//       story74Blank.setStyle("-fx-background-color:transparent");
//     Label story74Blank1;
//     story74Blank1 = new Label("");
//       story74Blank1.setMinWidth(30);
//       story74Blank1.setMinHeight(100);
// story74Blank1.setStyle("-fx-background-color:rgba(255,255,255,0.7)");
     
//       //animation
//     final String story74Content = "We can’t end our friendship like this.. You’re one of the few\nteachers I can rant about math theorems with… i’m sorry...\nplease forgive me?";
//     final Text story74Text = new Text(10, 20, "");
    
//     final Animation story74Animation = new Transition() {
//         {
//             setCycleDuration(Duration.millis(4000));
//         }
    
//         protected void interpolate(double frac) {
//             final int story74Length = story74Content.length();
//             final int story74N = Math.round(story74Length * (float) frac);
//             story74Label.setText(story74Content.substring(0, story74N));
//         }
        
//     };
    
//       //1) gridpane intialization
//     story74Node = new GridPane();
//     story74Node.add(story74Speaker, 2, 2);
//     story74Node.add(story74Label, 2, 3);
//     story74Node.add(story74Blank, 1, 2, 1, 1);
//     story74Node.add(story74Blank1, 1, 3, 1, 1);
//       //2) row/column intialization
//     RowConstraints story74row1 = new RowConstraints();
//     story74row1.setMinHeight(50);
//     RowConstraints story74row2 = new RowConstraints();
//     story74row2.setMinHeight(200);
//     RowConstraints story74row3 = new RowConstraints();
//     story74row3.setMinHeight(50);
//     RowConstraints story74row4 = new RowConstraints();
//     story74row4.setMinHeight(100);
//     ColumnConstraints story74col1 = new ColumnConstraints();
//     story74col1.setMinWidth(50);
//     ColumnConstraints story74col2 = new ColumnConstraints();
//     story74col2.setMinWidth(30);
//     ColumnConstraints story74col3 = new ColumnConstraints();
//     story74col3.setMinWidth(550);
//     ColumnConstraints story74col4 = new ColumnConstraints();
//     story74col4.setMinWidth(50);
//     story74Node.getRowConstraints().addAll(story74row1,story74row2,story74row3,story74row4); 
//     story74Node.getColumnConstraints().addAll(story74col1, story74col2, story74col3,story74col4); 

//       //3) background image
//     BackgroundSize story74BackgroundSize = new BackgroundSize(900, 700, true, true, true, false);
// 	//image. Replace url
//     BackgroundImage story74Image = new BackgroundImage(
//         new Image("https://cdn.discordapp.com/attachments/1261210481721348159/1268252834948976731/IMG_4334.png?ex=66b79d7e&is=66b64bfe&hm=081886eeffab90a517461193663149a1d5eab499c7d06c016db6c13a643bead3&"),
//         BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, story74BackgroundSize);
//     story74Node.setBackground(new Background(story74Image));

//     //story75
//       //variable and attributes
//     Label story75Speaker;
//     story75Speaker = new Label("Mr. Sevilla");
//       story75Speaker.setStyle("-fx-text-fill:white;-fx-font-size:200%;-fx-font-weight:bold;");
//       story75Speaker.setAlignment(Pos.CENTER_LEFT);
//     Label story75Label; // story array
//     story75Label = new Label(""); // blank space
//       story75Label.setMinWidth(550);
//       story75Label.setMaxWidth(550);
//       story75Label.setMinHeight(100);  
//       story75Label.setStyle("-fx-text-fill:black;-fx-font-size:120%;-fx-background-color:rgba(255,255,255,0.7);");
//       story75Label.setAlignment(Pos.CENTER_LEFT);
//     Label story75Blank;
//     story75Blank = new Label("");
//       story75Blank.setMinWidth(30);
//       story75Blank.setMinHeight(50); 
//       story75Blank.setStyle("-fx-background-color:transparent");
//     Label story75Blank1;
//     story75Blank1 = new Label("");
//       story75Blank1.setMinWidth(30);
//       story75Blank1.setMinHeight(100);
// story75Blank1.setStyle("-fx-background-color:rgba(255,255,255,0.7)");
     
//       //animation
//     final String story75Content = "I guess I let my ego get to me again, didn’t I? Ugh, you know\nwhat? Screw this! let’s take out our anger on our students and make\ntheir finals impossible!";
//     final Text story75Text = new Text(10, 20, "");
    
//     final Animation story75Animation = new Transition() {
//         {
//             setCycleDuration(Duration.millis(4000));
//         }
    
//         protected void interpolate(double frac) {
//             final int story75Length = story75Content.length();
//             final int story75N = Math.round(story75Length * (float) frac);
//             story75Label.setText(story75Content.substring(0, story75N));
//         }
        
//     };
    
//       //1) gridpane intialization
//     story75Node = new GridPane();
//     story75Node.add(story75Speaker, 2, 2);
//     story75Node.add(story75Label, 2, 3);
//     story75Node.add(story75Blank, 1, 2, 1, 1);
//     story75Node.add(story75Blank1, 1, 3, 1, 1);
//       //2) row/column intialization
//     RowConstraints story75row1 = new RowConstraints();
//     story75row1.setMinHeight(50);
//     RowConstraints story75row2 = new RowConstraints();
//     story75row2.setMinHeight(200);
//     RowConstraints story75row3 = new RowConstraints();
//     story75row3.setMinHeight(50);
//     RowConstraints story75row4 = new RowConstraints();
//     story75row4.setMinHeight(100);
//     ColumnConstraints story75col1 = new ColumnConstraints();
//     story75col1.setMinWidth(50);
//     ColumnConstraints story75col2 = new ColumnConstraints();
//     story75col2.setMinWidth(30);
//     ColumnConstraints story75col3 = new ColumnConstraints();
//     story75col3.setMinWidth(550);
//     ColumnConstraints story75col4 = new ColumnConstraints();
//     story75col4.setMinWidth(50);
//     story75Node.getRowConstraints().addAll(story75row1,story75row2,story75row3,story75row4); 
//     story75Node.getColumnConstraints().addAll(story75col1, story75col2, story75col3,story75col4); 

//       //3) background image
//     BackgroundSize story75BackgroundSize = new BackgroundSize(900, 700, true, true, true, false);
// 	//image. Replace url
//     BackgroundImage story75Image = new BackgroundImage(
//         new Image("https://cdn.discordapp.com/attachments/1261210481721348159/1268252834948976731/IMG_4334.png?ex=66b79d7e&is=66b64bfe&hm=081886eeffab90a517461193663149a1d5eab499c7d06c016db6c13a643bead3&"),
//         BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, story75BackgroundSize);
//     story75Node.setBackground(new Background(story75Image));

//     //story76
//       //variable and attributes
//     Label story76Speaker;
//     story76Speaker = new Label("Mr. Enriquez");
//       story76Speaker.setStyle("-fx-text-fill:white;-fx-font-size:200%;-fx-font-weight:bold;");
//       story76Speaker.setAlignment(Pos.CENTER_LEFT);
//     Label story76Label; // story array
//     story76Label = new Label(""); // blank space
//       story76Label.setMinWidth(550);
//       story76Label.setMaxWidth(550);
//       story76Label.setMinHeight(100);  
//       story76Label.setStyle("-fx-text-fill:black;-fx-font-size:120%;-fx-background-color:rgba(255,255,255,0.7);");
//       story76Label.setAlignment(Pos.CENTER_LEFT);
//     Label story76Blank;
//     story76Blank = new Label("");
//       story76Blank.setMinWidth(30);
//       story76Blank.setMinHeight(50); 
//       story76Blank.setStyle("-fx-background-color:transparent");
//     Label story76Blank1;
//     story76Blank1 = new Label("");
//       story76Blank1.setMinWidth(30);
//       story76Blank1.setMinHeight(100);
// story76Blank1.setStyle("-fx-background-color:rgba(255,255,255,0.7)");
     
//       //animation
//     final String story76Content = "Yeah! Let’s see who can bring their class average closest to 0.\nLoser has to buy the winner a limited edition Ron Larson calc book!";
//     final Text story76Text = new Text(10, 20, "");
    
//     final Animation story76Animation = new Transition() {
//         {
//             setCycleDuration(Duration.millis(4000));
//         }
    
//         protected void interpolate(double frac) {
//             final int story76Length = story76Content.length();
//             final int story76N = Math.round(story76Length * (float) frac);
//             story76Label.setText(story76Content.substring(0, story76N));
//         }
        
//     };
    
//       //1) gridpane intialization
//     story76Node = new GridPane();
//     story76Node.add(story76Speaker, 2, 2);
//     story76Node.add(story76Label, 2, 3);
//     story76Node.add(story76Blank, 1, 2, 1, 1);
//     story76Node.add(story76Blank1, 1, 3, 1, 1);
//       //2) row/column intialization
//     RowConstraints story76row1 = new RowConstraints();
//     story76row1.setMinHeight(50);
//     RowConstraints story76row2 = new RowConstraints();
//     story76row2.setMinHeight(200);
//     RowConstraints story76row3 = new RowConstraints();
//     story76row3.setMinHeight(50);
//     RowConstraints story76row4 = new RowConstraints();
//     story76row4.setMinHeight(100);
//     ColumnConstraints story76col1 = new ColumnConstraints();
//     story76col1.setMinWidth(50);
//     ColumnConstraints story76col2 = new ColumnConstraints();
//     story76col2.setMinWidth(30);
//     ColumnConstraints story76col3 = new ColumnConstraints();
//     story76col3.setMinWidth(550);
//     ColumnConstraints story76col4 = new ColumnConstraints();
//     story76col4.setMinWidth(50);
//     story76Node.getRowConstraints().addAll(story76row1,story76row2,story76row3,story76row4); 
//     story76Node.getColumnConstraints().addAll(story76col1, story76col2, story76col3,story76col4); 

//       //3) background image
//     BackgroundSize story76BackgroundSize = new BackgroundSize(900, 700, true, true, true, false);
// 	//image. Replace url
//     BackgroundImage story76Image = new BackgroundImage(
//         new Image("https://cdn.discordapp.com/attachments/1261210481721348159/1268252834948976731/IMG_4334.png?ex=66b79d7e&is=66b64bfe&hm=081886eeffab90a517461193663149a1d5eab499c7d06c016db6c13a643bead3&"),
//         BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, story76BackgroundSize);
//     story76Node.setBackground(new Background(story76Image));

//     //story77
//       //variable and attributes
//     Label story77Speaker;
//     story77Speaker = new Label("Mr. Sevilla");
//       story77Speaker.setStyle("-fx-text-fill:white;-fx-font-size:200%;-fx-font-weight:bold;");
//       story77Speaker.setAlignment(Pos.CENTER_LEFT);
//     Label story77Label; // story array
//     story77Label = new Label(""); // blank space
//       story77Label.setMinWidth(550);
//       story77Label.setMaxWidth(550);
//       story77Label.setMinHeight(100);  
//       story77Label.setStyle("-fx-text-fill:black;-fx-font-size:120%;-fx-background-color:rgba(255,255,255,0.7);");
//       story77Label.setAlignment(Pos.CENTER_LEFT);
//     Label story77Blank;
//     story77Blank = new Label("");
//       story77Blank.setMinWidth(30);
//       story77Blank.setMinHeight(50); 
//       story77Blank.setStyle("-fx-background-color:transparent");
//     Label story77Blank1;
//     story77Blank1 = new Label("");
//       story77Blank1.setMinWidth(30);
//       story77Blank1.setMinHeight(100);
// story77Blank1.setStyle("-fx-background-color:rgba(255,255,255,0.7)");
     
//       //animation
//     final String story77Content = "Deal!";
//     final Text story77Text = new Text(10, 20, "");
    
//     final Animation story77Animation = new Transition() {
//         {
//             setCycleDuration(Duration.millis(800));
//         }
    
//         protected void interpolate(double frac) {
//             final int story77Length = story77Content.length();
//             final int story77N = Math.round(story77Length * (float) frac);
//             story77Label.setText(story77Content.substring(0, story77N));
//         }
        
//     };
    
//       //1) gridpane intialization
//     story77Node = new GridPane();
//     story77Node.add(story77Speaker, 2, 2);
//     story77Node.add(story77Label, 2, 3);
//     story77Node.add(story77Blank, 1, 2, 1, 1);
//     story77Node.add(story77Blank1, 1, 3, 1, 1);
//       //2) row/column intialization
//     RowConstraints story77row1 = new RowConstraints();
//     story77row1.setMinHeight(50);
//     RowConstraints story77row2 = new RowConstraints();
//     story77row2.setMinHeight(200);
//     RowConstraints story77row3 = new RowConstraints();
//     story77row3.setMinHeight(50);
//     RowConstraints story77row4 = new RowConstraints();
//     story77row4.setMinHeight(100);
//     ColumnConstraints story77col1 = new ColumnConstraints();
//     story77col1.setMinWidth(50);
//     ColumnConstraints story77col2 = new ColumnConstraints();
//     story77col2.setMinWidth(30);
//     ColumnConstraints story77col3 = new ColumnConstraints();
//     story77col3.setMinWidth(550);
//     ColumnConstraints story77col4 = new ColumnConstraints();
//     story77col4.setMinWidth(50);
//     story77Node.getRowConstraints().addAll(story77row1,story77row2,story77row3,story77row4); 
//     story77Node.getColumnConstraints().addAll(story77col1, story77col2, story77col3,story77col4); 

//       //3) background image
//     BackgroundSize story77BackgroundSize = new BackgroundSize(900, 700, true, true, true, false);
// 	//image. Replace url
//     BackgroundImage story77Image = new BackgroundImage(
//         new Image("https://cdn.discordapp.com/attachments/1261210481721348159/1268252834948976731/IMG_4334.png?ex=66b79d7e&is=66b64bfe&hm=081886eeffab90a517461193663149a1d5eab499c7d06c016db6c13a643bead3&"),
//         BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, story77BackgroundSize);
//     story77Node.setBackground(new Background(story77Image));

//     //story78
//       //1) gridpane intialization
//     story78Node = new GridPane();
//       //3 fade transition
//     FadeTransition story78FT = new FadeTransition(Duration.millis(1500), story78Node);
//       story78FT.setFromValue(0.0);
//       story78FT.setToValue(1.0);
//     //3) background image
//     BackgroundSize story78BackgroundSize = new BackgroundSize(900, 700, true, true, true, false);
// 	//image. Replace url
//     BackgroundImage story78Image = new BackgroundImage(
//         new Image("https://cdn.discordapp.com/attachments/1261210481721348159/1268252834948976731/IMG_4334.png?ex=66b79d7e&is=66b64bfe&hm=081886eeffab90a517461193663149a1d5eab499c7d06c016db6c13a643bead3&"),
//         BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, story78BackgroundSize);
//     story78Node.setBackground(new Background(story78Image));

    
//     //scenes
//     opening = new Scene(openingNode, 700, 400, Color.TRANSPARENT);
//     name = new Scene(nameNode, 700, 400, Color.TRANSPARENT);
//     story1 = new Scene(story1Node, 700, 400, Color.TRANSPARENT);
//     story2 = new Scene(story2Node, 700, 400, Color.TRANSPARENT);
//     story3 = new Scene(story3Node, 700, 400, Color.TRANSPARENT);
//     story4 = new Scene(story4Node, 700, 400, Color.TRANSPARENT);
//     story5 = new Scene(story5Node, 700, 400, Color.BLACK);
//     story6 = new Scene(story6Node, 700, 400, Color.TRANSPARENT);
//     story7 = new Scene(story7Node, 700, 400, Color.TRANSPARENT);
//     story8 = new Scene(story8Node, 700, 400, Color.TRANSPARENT);
//     story9 = new Scene(story9Node, 700, 400, Color.TRANSPARENT);
//     story10 = new Scene(story10Node, 700, 400, Color.TRANSPARENT);
//     story11 = new Scene(story11Node, 700, 400, Color.TRANSPARENT);
//     story12 = new Scene(story12Node, 700, 400, Color.TRANSPARENT);
//     story13 = new Scene(story13Node, 700, 400, Color.TRANSPARENT);
//     story14 = new Scene(story14Node, 700, 400, Color.TRANSPARENT);
//     story15 = new Scene(story15Node, 700, 400, Color.TRANSPARENT);
//     story16 = new Scene(story16Node, 700, 400, Color.TRANSPARENT);
//     story17 = new Scene(story17Node, 700, 400, Color.TRANSPARENT);
//     story18 = new Scene(story18Node, 700, 400, Color.TRANSPARENT);
//     story19 = new Scene(story19Node, 700, 400, Color.TRANSPARENT);
//     story20 = new Scene(story20Node, 700, 400, Color.TRANSPARENT);
//     story21 = new Scene(story21Node, 700, 400, Color.TRANSPARENT);
//     story22 = new Scene(story22Node, 700, 400, Color.TRANSPARENT);
//     story23 = new Scene(story23Node, 700, 400, Color.TRANSPARENT);
//     story24 = new Scene(story24Node, 700, 400, Color.TRANSPARENT);
//     story25 = new Scene(story25Node, 700, 400, Color.TRANSPARENT);
//     story26 = new Scene(story26Node, 700, 400, Color.TRANSPARENT);
//     story27 = new Scene(story27Node, 700, 400, Color.TRANSPARENT);
//     story28 = new Scene(story28Node, 700, 400, Color.TRANSPARENT);
//     story29 = new Scene(story29Node, 700, 400, Color.TRANSPARENT);
//     story30 = new Scene(story30Node, 700, 400, Color.TRANSPARENT);
//     story31 = new Scene(story31Node, 700, 400, Color.TRANSPARENT);
//     story32 = new Scene(story32Node, 700, 400, Color.TRANSPARENT);
//     story33 = new Scene(story33Node, 700, 400, Color.TRANSPARENT);
//     story34 = new Scene(story34Node, 700, 400, Color.TRANSPARENT);
//     story35 = new Scene(story35Node, 700, 400, Color.TRANSPARENT);
//     story36 = new Scene(story36Node, 700, 400, Color.TRANSPARENT);
//     story37 = new Scene(story37Node, 700, 400, Color.TRANSPARENT);
//     story38 = new Scene(story38Node, 700, 400, Color.TRANSPARENT);
//     story39 = new Scene(story39Node, 700, 400, Color.TRANSPARENT);
//     story40 = new Scene(story40Node, 700, 400, Color.TRANSPARENT);
//     story41 = new Scene(story41Node, 700, 400, Color.TRANSPARENT);
//     story42 = new Scene(story42Node, 700, 400, Color.TRANSPARENT);
//     story43 = new Scene(story43Node, 700, 400, Color.TRANSPARENT);
//     story44 = new Scene(story44Node, 700, 400, Color.TRANSPARENT);
//     story45 = new Scene(story45Node, 700, 400, Color.TRANSPARENT);
//     story46 = new Scene(story46Node, 700, 400, Color.TRANSPARENT);
//     story47 = new Scene(story47Node, 700, 400, Color.TRANSPARENT);
//     story48 = new Scene(story48Node, 700, 400, Color.TRANSPARENT);
//     story49 = new Scene(story49Node, 700, 400, Color.TRANSPARENT);
//     story50 = new Scene(story50Node, 700, 400, Color.TRANSPARENT);
//     story51 = new Scene(story51Node, 700, 400, Color.TRANSPARENT);
//     story52 = new Scene(story52Node, 700, 400, Color.TRANSPARENT);
//     story53 = new Scene(story53Node, 700, 400, Color.BLACK);
//     story54 = new Scene(story54Node, 700, 400, Color.TRANSPARENT);
//     story55 = new Scene(story55Node, 700, 400, Color.TRANSPARENT);
//     story56 = new Scene(story56Node, 700, 400, Color.TRANSPARENT);
//     story57 = new Scene(story57Node, 700, 400, Color.TRANSPARENT);
//     story58 = new Scene(story58Node, 700, 400, Color.TRANSPARENT);
//     story59 = new Scene(story59Node, 700, 400, Color.TRANSPARENT);
//     story60 = new Scene(story60Node, 700, 400, Color.TRANSPARENT);
//     story61 = new Scene(story61Node, 700, 400, Color.TRANSPARENT);
//    // story62 = new Scene(story62Node, 700, 400, Color.TRANSPARENT);
//     story63 = new Scene(story63Node, 700, 400, Color.TRANSPARENT);
//     story64 = new Scene(story64Node, 700, 400, Color.TRANSPARENT);
//     story65 = new Scene(story65Node, 700, 400, Color.TRANSPARENT);
//     story66 = new Scene(story66Node, 700, 400, Color.TRANSPARENT);
//     story67 = new Scene(story67Node, 700, 400, Color.TRANSPARENT);
//     story68 = new Scene(story68Node, 700, 400, Color.TRANSPARENT);
//     story69 = new Scene(story69Node, 700, 400, Color.TRANSPARENT);
//     story70 = new Scene(story70Node, 700, 400, Color.TRANSPARENT);
//     story71 = new Scene(story71Node, 700, 400, Color.TRANSPARENT);
//     story72 = new Scene(story72Node, 700, 400, Color.TRANSPARENT);
//     story73 = new Scene(story73Node, 700, 400, Color.TRANSPARENT);
//     story74 = new Scene(story74Node, 700, 400, Color.TRANSPARENT);
//     story75 = new Scene(story75Node, 700, 400, Color.TRANSPARENT);
//     story76 = new Scene(story76Node, 700, 400, Color.TRANSPARENT);
//     story77 = new Scene(story77Node, 700, 400, Color.TRANSPARENT);
//     story78 = new Scene(story78Node, 700, 400, Color.BLACK);
    
    

//     //opening methods
//     playButton.setOnMouseEntered(new EventHandler<MouseEvent>() {
//       // on event mouse is hovered over PLAY button
//       @Override
//       public void handle(MouseEvent t) {
//         playButton.setGraphic(new ImageView(play1));
//         playButton.setMinWidth(130);
//         playButton.setMinHeight(50);
//         playButton.setMaxWidth(130);
//         playButton.setMaxHeight(50);
//       }
//     });
//     playButton.setOnMouseExited(new EventHandler<MouseEvent>() {
//       // on event mouse is NO LONGER hovered over PLAY playButton
//       @Override
//       public void handle(MouseEvent t) {
//         playButton.setGraphic(new ImageView(play));
//         playButton.setMinWidth(130);
//         playButton.setMinHeight(50);
//         playButton.setMaxWidth(130);
//         playButton.setMaxHeight(50);
        
//       }
//     });

//     exitButton.setOnMouseEntered(new EventHandler<MouseEvent>() {
//       // on event mouse is hovered over PLAY button
//       @Override
//       public void handle(MouseEvent t) {
//         exitButton.setGraphic(new ImageView(exit1));
//         exitButton.setMinWidth(130);
//         exitButton.setMinHeight(50);
//         exitButton.setMaxWidth(130);
//         exitButton.setMaxHeight(50);
//       }
//     });
//     exitButton.setOnMouseExited(new EventHandler<MouseEvent>() {
//       // on event mouse is NO LONGER hovered over PLAY button
//       @Override
//       public void handle(MouseEvent t) {
//         exitButton.setGraphic(new ImageView(exit));
//         exitButton.setMinWidth(130);
//         exitButton.setMinHeight(50);
//         exitButton.setMaxWidth(130);
//         exitButton.setMaxHeight(50);
//       }
//     });

//     // on event u press button (play), change scene to scene2 (enter name screen)
//     playButton.setOnAction(new EventHandler<ActionEvent>() {
//       @Override
//       public void handle(ActionEvent e) {
//         primaryStage.setScene(name);
//         primaryStage.show();
//       }
//     });

//     button3.setOnAction(new EventHandler<ActionEvent>() {
//       // on event u click button 3
//       @Override
//       public void handle(ActionEvent e) {
//         // if there is no text or
//         if (tf1.getText().isBlank()) {
//           label3.setText("You must insert a nickname");
//           label3.setStyle("-fx-text-fill:red;-fx-font-size:200%;-fx-font-weight:bold");
//         } else if (tf1.getText().matches("\\d+")) {
//           label3.setText("You must use alphabetical characters");
//           label3.setStyle("-fx-text-fill:red;-fx-font-size:200%;-fx-font-weight:bold");
//         } else {
//           primaryStage.setScene(story1);
//           primaryStage.show();
//           story1Animation.play();
//         }
//       }
//     });

//    //press escape or press enter
//     name.setOnKeyPressed(e -> {
//       if (e.getCode() == KeyCode.ESCAPE) {
//         primaryStage.setScene(opening);
//         primaryStage.show();
//       } else if (e.getCode() == KeyCode.ENTER) {
//         if (tf1.getText().isBlank()) {
//           label3.setText("You must insert a nickname");
//           label3.setStyle("-fx-text-fill:red;-fx-font-size:200%;-fx-font-weight:bold");
//         } else if (tf1.getText().matches("\\d+")) {
//           label3.setText("You must use alphabetical characters");
//           label3.setStyle("-fx-text-fill:red;-fx-font-size:200%;-fx-font-weight:bold");
//         } else {
//           primaryStage.setScene(story1);
//           primaryStage.show();
//           story1Animation.play();
//         }

//       }
//     });

//     //story1 methods
//     story1.setOnKeyPressed(e -> {
//       if (e.getCode() == KeyCode.ESCAPE) {
//         primaryStage.setScene(opening);
//         primaryStage.show();
//       } else if (e.getCode() == KeyCode.ENTER) {
//           primaryStage.setScene(story2);
//           primaryStage.show();
//           story2Animation.play();
//         } else {
//           primaryStage.setScene(story1);
//           primaryStage.show();
//         }
//     });

//  //story2 methods
//     story2.setOnKeyPressed(e -> {
//       if (e.getCode() == KeyCode.ESCAPE) {
//         primaryStage.setScene(opening);
//         primaryStage.show();
//       } else if (e.getCode() == KeyCode.ENTER) {
//           primaryStage.setScene(story3);
//           primaryStage.show();
//           story3Animation.play();
//         } else {
//           primaryStage.setScene(story2);
//           primaryStage.show();
//         }
//     });

//     //story3 methods
//     story3.setOnKeyPressed(e -> {
//       if (e.getCode() == KeyCode.ESCAPE) {
//         primaryStage.setScene(opening);
//         primaryStage.show();
//       } else if (e.getCode() == KeyCode.ENTER) {
//           primaryStage.setScene(story4);
//           primaryStage.show();
//           story4FT.play();
//         } else {
//           primaryStage.setScene(story3);
//           primaryStage.show();
//         }
//     });

//     //story4 methods
//     story4.setOnKeyPressed(e -> {
//       if (e.getCode() == KeyCode.ESCAPE) {
//         primaryStage.setScene(opening);
//         primaryStage.show();
//       } else if (e.getCode() == KeyCode.ENTER) {
//           primaryStage.setScene(story5);
//           primaryStage.show();
//           story5FT.play();
//         } else {
//           primaryStage.setScene(story4);
//           primaryStage.show();
//         }
//     });

//     //story5 methods
//     story5.setOnKeyPressed(e -> {
//       if (e.getCode() == KeyCode.ESCAPE) {
//         primaryStage.setScene(opening);
//         primaryStage.show();
//       } else if (e.getCode() == KeyCode.ENTER) {
//           primaryStage.setScene(story6);
//           primaryStage.show();
//           story6Animation.play();
//         } else {
//           primaryStage.setScene(story5);
//           primaryStage.show();
//         }
//     });
    
//     //story6 methods
//     story6.setOnKeyPressed(e -> {
//       if (e.getCode() == KeyCode.ESCAPE) {
//         primaryStage.setScene(opening);
//         primaryStage.show();
//       } else if (e.getCode() == KeyCode.ENTER) {
//           primaryStage.setScene(story7); //story 7 is options, no need for animation
//           primaryStage.show();
//         } else {
//           primaryStage.setScene(story6);
//           primaryStage.show();
//         }
//     });
    
//     //story7 methods
//     story7.setOnKeyPressed(e -> {
//       if (e.getCode() == KeyCode.ESCAPE) {
//         primaryStage.setScene(opening);
//         primaryStage.show();
//       } else {
//           primaryStage.setScene(story7);
//           primaryStage.show();
//         }
//     });

//     story7Option1.setOnAction(new EventHandler<ActionEvent>() {
//       @Override
//       public void handle(ActionEvent e) {
//         primaryStage.setScene(story8);
//         primaryStage.show();
//         story8Animation.play();
//       }
//     });

//     story7Option2.setOnAction(new EventHandler<ActionEvent>() {
//       @Override
//       public void handle(ActionEvent e) {
//         primaryStage.setScene(story10);
//         primaryStage.show();
//         story10Animation.play();
//       }
//     });

// //story8methods
// story8.setOnKeyPressed(e -> {
//  if (e.getCode() == KeyCode.ESCAPE) {
//  primaryStage.setScene(opening);
//  primaryStage.show();
// } else if (e.getCode() == KeyCode.ENTER) {
//  primaryStage.setScene(story9);
//  story10Animation.play();
//  primaryStage.show();
//  } else {
//  primaryStage.setScene(story8);
//  primaryStage.show();
// }
// });

// //story9methods
// story9.setOnKeyPressed(e -> {
//  if (e.getCode() == KeyCode.ESCAPE) {
//  primaryStage.setScene(opening);
//  primaryStage.show();
// } else if (e.getCode() == KeyCode.ENTER) {
//  primaryStage.setScene(story10);
//  story10Animation.play();
//  primaryStage.show();
//  } else {
//  primaryStage.setScene(story9);
//  primaryStage.show();
// }
// });

// //story10methods
// story10.setOnKeyPressed(e -> {
//  if (e.getCode() == KeyCode.ESCAPE) {
//  primaryStage.setScene(opening);
//  primaryStage.show();
// } else if (e.getCode() == KeyCode.ENTER) {
//  primaryStage.setScene(story11);
//  primaryStage.show();
//  } else {
//  primaryStage.setScene(story10);
//  primaryStage.show();
// }
// });


//     //story11 methods
//     story11.setOnKeyPressed(e -> {
//       if (e.getCode() == KeyCode.ESCAPE) {
//         primaryStage.setScene(opening);
//         primaryStage.show();
//       }
//     });

//     story11Option1.setOnAction(new EventHandler<ActionEvent>() {
//       @Override
//       public void handle(ActionEvent e) {
//         primaryStage.setScene(story12);
//         primaryStage.show();
//         story12Animation.play();
//       }
//     });

//     story11Option2.setOnAction(new EventHandler<ActionEvent>() {
//       @Override
//       public void handle(ActionEvent e) {
//         primaryStage.setScene(story13);
//         primaryStage.show();
//         story13Animation.play();
//       }
//     });

//   //story12methods
//     story12.setOnKeyPressed(e -> {
//      if (e.getCode() == KeyCode.ESCAPE) {
//      primaryStage.setScene(opening);
//      primaryStage.show();
//     } else if (e.getCode() == KeyCode.ENTER) {
//      primaryStage.setScene(story13);
//      story13Animation.play();
//      primaryStage.show();
//      } else {
//      primaryStage.setScene(story12);
//      primaryStage.show();
//     }
//     });

//     //story13methods
//     story13.setOnKeyPressed(e -> {
//      if (e.getCode() == KeyCode.ESCAPE) {
//      primaryStage.setScene(opening);
//      primaryStage.show();
//     } else if (e.getCode() == KeyCode.ENTER) {
//      primaryStage.setScene(story14);
//      story14Animation.play();
//      primaryStage.show();
//      } else {
//      primaryStage.setScene(story13);
//      primaryStage.show();
//     }
//     });

//     //story14methods
//     story14.setOnKeyPressed(e -> {
//      if (e.getCode() == KeyCode.ESCAPE) {
//      primaryStage.setScene(opening);
//      primaryStage.show();
//     } else if (e.getCode() == KeyCode.ENTER) {
//      primaryStage.setScene(story15);
//      story15Animation.play();
//      primaryStage.show();
//      } else {
//      primaryStage.setScene(story14);
//      primaryStage.show();
//     }
//     });

//     //story15methods
//     story15.setOnKeyPressed(e -> {
//      if (e.getCode() == KeyCode.ESCAPE) {
//      primaryStage.setScene(opening);
//      primaryStage.show();
//     } else if (e.getCode() == KeyCode.ENTER) {
//      primaryStage.setScene(story16);
//      story16Animation.play();
//      primaryStage.show();
//      } else {
//      primaryStage.setScene(story15);
//      primaryStage.show();
//     }
//     });

//     //story16methods
//     story16.setOnKeyPressed(e -> {
//      if (e.getCode() == KeyCode.ESCAPE) {
//      primaryStage.setScene(opening);
//      primaryStage.show();
//     } else if (e.getCode() == KeyCode.ENTER) {
//      primaryStage.setScene(story17);
//      primaryStage.show();
//      } else {
//      primaryStage.setScene(story16);
//      primaryStage.show();
//     }
//     });

//     //story17 methods
//     story17.setOnKeyPressed(e -> {
//       if (e.getCode() == KeyCode.ESCAPE) {
//         primaryStage.setScene(opening);
//         primaryStage.show();
//       }
//     });

//     story17Button1.setOnAction(new EventHandler<ActionEvent>() {
//       @Override
//       public void handle(ActionEvent e) {
//         story17Label.setStyle("-fx-text-fill:white;-fx-font-size:120%;-fx-background-color:rgba(0,0,0,0.8)");
//         story17Animation.play();
//       }
//     });

//     story17Button2.setOnAction(new EventHandler<ActionEvent>() {
//       @Override
//       public void handle(ActionEvent e) {
//         story17Label.setStyle("-fx-text-fill:white;-fx-font-size:120%;-fx-background-color:rgba(0,0,0,0.8)");
//         story17Animation.play();
//       }
//     });

//     story17Button3.setOnAction(new EventHandler<ActionEvent>() {
//       @Override
//       public void handle(ActionEvent e) {
//         primaryStage.setScene(story18);
//         primaryStage.show();
//       }
//     });

//     //story18 methods
//     story18.setOnKeyPressed(e -> {
//       if (e.getCode() == KeyCode.ESCAPE) {
//         primaryStage.setScene(opening);
//         primaryStage.show();
//       }
//     });
    
//     story18Button2.setOnAction(new EventHandler<ActionEvent>() {
//       @Override
//       public void handle(ActionEvent e) {
//         story18Label.setStyle("-fx-text-fill:white;-fx-font-size:120%;-fx-background-color:rgba(0,0,0,0.8)");
//         story18Animation.play();
//       }
//     });

//     story18Button3.setOnAction(new EventHandler<ActionEvent>() {
//       @Override
//       public void handle(ActionEvent e) {
//         story18Label.setStyle("-fx-text-fill:white;-fx-font-size:120%;-fx-background-color:rgba(0,0,0,0.8)");
//         story18Animation.play();
//       }
//     });

//     story18Button1.setOnAction(new EventHandler<ActionEvent>() {
//       @Override
//       public void handle(ActionEvent e) {
//         primaryStage.setScene(story19);
//         primaryStage.show();
//       }
//     });
    
//     //story19 methods
//     story19.setOnKeyPressed(e -> {
//       if (e.getCode() == KeyCode.ESCAPE) {
//         primaryStage.setScene(opening);
//         primaryStage.show();
//       }
//     });
    
//     story19Button1.setOnAction(new EventHandler<ActionEvent>() {
//       @Override
//       public void handle(ActionEvent e) {
//         story19Label.setStyle("-fx-text-fill:white;-fx-font-size:120%;-fx-background-color:rgba(0,0,0,0.8)");
//         story19Animation.play();
//       }
//     });

//     story19Button3.setOnAction(new EventHandler<ActionEvent>() {
//       @Override
//       public void handle(ActionEvent e) {
//         story19Label.setStyle("-fx-text-fill:white;-fx-font-size:120%;-fx-background-color:rgba(0,0,0,0.8)");
//         story19Animation.play();
//       }
//     });

//     story19Button2.setOnAction(new EventHandler<ActionEvent>() {
//       @Override
//       public void handle(ActionEvent e) {
//         primaryStage.setScene(story20);
//         primaryStage.show();
//         story20Animation.play();
//       }
//     });

//   //story20methods
//     story20.setOnKeyPressed(e -> {
//      if (e.getCode() == KeyCode.ESCAPE) {
//      primaryStage.setScene(opening);
//      primaryStage.show();
//     } else if (e.getCode() == KeyCode.ENTER) {
//      primaryStage.setScene(story21);
//      story21Animation.play();
//      primaryStage.show();
//      } else {
//      primaryStage.setScene(story20);
//      primaryStage.show();
//     }
//     });

//     //story21methods
//     story21.setOnKeyPressed(e -> {
//      if (e.getCode() == KeyCode.ESCAPE) {
//      primaryStage.setScene(opening);
//      primaryStage.show();
//     } else if (e.getCode() == KeyCode.ENTER) {
//      primaryStage.setScene(story22);
//      story22Animation.play();
//      primaryStage.show();
//      } else {
//      primaryStage.setScene(story21);
//      primaryStage.show();
//     }
//     });

//     //story22methods
//     story22.setOnKeyPressed(e -> {
//      if (e.getCode() == KeyCode.ESCAPE) {
//      primaryStage.setScene(opening);
//      primaryStage.show();
//     } else if (e.getCode() == KeyCode.ENTER) {
//      primaryStage.setScene(story23);
//      story23Animation.play();
//      primaryStage.show();
//      } else {
//      primaryStage.setScene(story22);
//      primaryStage.show();
//     }
//     });

//     //story23methods
//     story23.setOnKeyPressed(e -> {
//      if (e.getCode() == KeyCode.ESCAPE) {
//      primaryStage.setScene(opening);
//      primaryStage.show();
//     } else if (e.getCode() == KeyCode.ENTER) {
//      primaryStage.setScene(story24);
//      primaryStage.show();
//      } else {
//      primaryStage.setScene(story23);
//      primaryStage.show();
//     }
//     });
    
//     //story24 methods
//     story24.setOnKeyPressed(e -> {
//       if (e.getCode() == KeyCode.ESCAPE) {
//         primaryStage.setScene(opening);
//         primaryStage.show();
//       }
//     });
    
//     story24Button1.setOnAction(new EventHandler<ActionEvent>() {
//       @Override
//       public void handle(ActionEvent e) {
//         story24Label.setStyle("-fx-text-fill:white;-fx-font-size:120%;-fx-background-color:rgba(0,0,0,0.8)");
//         story24Animation.play();
//       }
//     });

//     story24Button2.setOnAction(new EventHandler<ActionEvent>() {
//       @Override
//       public void handle(ActionEvent e) {
//         story24Label.setStyle("-fx-text-fill:white;-fx-font-size:120%;-fx-background-color:rgba(0,0,0,0.8)");
//         story24Animation.play();
//       }
//     });

//     story24Button3.setOnAction(new EventHandler<ActionEvent>() {
//       @Override
//       public void handle(ActionEvent e) {
//         primaryStage.setScene(story25);
//         primaryStage.show();
//       }
//     });

//     //story25 methods
//     story25.setOnKeyPressed(e -> {
//       if (e.getCode() == KeyCode.ESCAPE) {
//         primaryStage.setScene(opening);
//         primaryStage.show();
//       }
//     });
    
//     story25Button2.setOnAction(new EventHandler<ActionEvent>() {
//       @Override
//       public void handle(ActionEvent e) {
//         story25Label.setStyle("-fx-text-fill:white;-fx-font-size:120%;-fx-background-color:rgba(0,0,0,0.8)");
//         story25Animation.play();
//       }
//     });

//     story25Button3.setOnAction(new EventHandler<ActionEvent>() {
//       @Override
//       public void handle(ActionEvent e) {
//         story25Label.setStyle("-fx-text-fill:white;-fx-font-size:120%;-fx-background-color:rgba(0,0,0,0.8)");
//         story25Animation.play();
//       }
//     });

//     story25Button1.setOnAction(new EventHandler<ActionEvent>() {
//       @Override
//       public void handle(ActionEvent e) {
//         primaryStage.setScene(story26);
//         primaryStage.show();
//       }
//     });

//     //story26 methods
//     story26.setOnKeyPressed(e -> {
//       if (e.getCode() == KeyCode.ESCAPE) {
//         primaryStage.setScene(opening);
//         primaryStage.show();
//       }
//     });

//     story26Button1.setOnAction(new EventHandler<ActionEvent>() {
//       @Override
//       public void handle(ActionEvent e) {
//         story26Label.setStyle("-fx-text-fill:white;-fx-font-size:120%;-fx-background-color:rgba(0,0,0,0.8)");
//         story26Animation.play();
//       }
//     });

//     story26Button3.setOnAction(new EventHandler<ActionEvent>() {
//       @Override
//       public void handle(ActionEvent e) {
//         story26Label.setStyle("-fx-text-fill:white;-fx-font-size:120%;-fx-background-color:rgba(0,0,0,0.8)");
//         story26Animation.play();
//       }
//     });

//     story26Button2.setOnAction(new EventHandler<ActionEvent>() {
//       @Override
//       public void handle(ActionEvent e) {
//         primaryStage.setScene(story27);
//         primaryStage.show();
//         story27Animation.play();
//       }
//     });

//   //story27methods
//     story27.setOnKeyPressed(e -> {
//      if (e.getCode() == KeyCode.ESCAPE) {
//      primaryStage.setScene(opening);
//      primaryStage.show();
//     } else if (e.getCode() == KeyCode.ENTER) {
//      primaryStage.setScene(story28);
//      story28Animation.play();
//      primaryStage.show();
//      } else {
//      primaryStage.setScene(story27);
//      primaryStage.show();
//     }
//     });

//     //story28methods
//     story28.setOnKeyPressed(e -> {
//      if (e.getCode() == KeyCode.ESCAPE) {
//      primaryStage.setScene(opening);
//      primaryStage.show();
//     } else if (e.getCode() == KeyCode.ENTER) {
//      primaryStage.setScene(story29);
//      story29Animation.play();
//      primaryStage.show();
//      } else {
//      primaryStage.setScene(story28);
//      primaryStage.show();
//     }
//     });

//     //story29methods
//     story29.setOnKeyPressed(e -> {
//      if (e.getCode() == KeyCode.ESCAPE) {
//      primaryStage.setScene(opening);
//      primaryStage.show();
//     } else if (e.getCode() == KeyCode.ENTER) {
//      primaryStage.setScene(story30);
//      primaryStage.show();
//      } else {
//      primaryStage.setScene(story29);
//      primaryStage.show();
//     }
//     });
    
//     //story30 methods
//     story30.setOnKeyPressed(e -> {
//       if (e.getCode() == KeyCode.ESCAPE) {
//         primaryStage.setScene(opening);
//         primaryStage.show();
//       }
//     });

//     story30Option1.setOnAction(new EventHandler<ActionEvent>() {
//       @Override
//       public void handle(ActionEvent e) {
//         primaryStage.setScene(story31);
//         primaryStage.show();
//         story31Animation.play();
//       }
//     });

//     story30Option2.setOnAction(new EventHandler<ActionEvent>() {
//       @Override
//       public void handle(ActionEvent e) {
//         primaryStage.setScene(story35);
//         primaryStage.show();
//         story35Animation.play();
//       }
//     });

//   //story31methods
//   story31.setOnKeyPressed(e -> {
//    if (e.getCode() == KeyCode.ESCAPE) {
//    primaryStage.setScene(opening);
//    primaryStage.show();
//   } else if (e.getCode() == KeyCode.ENTER) {
//    primaryStage.setScene(story32);
//    story32Animation.play();
//    primaryStage.show();
//    } else {
//    primaryStage.setScene(story31);
//    primaryStage.show();
//   }
//   });

//   //story32methods
//   story32.setOnKeyPressed(e -> {
//    if (e.getCode() == KeyCode.ESCAPE) {
//    primaryStage.setScene(opening);
//    primaryStage.show();
//   } else if (e.getCode() == KeyCode.ENTER) {
//    primaryStage.setScene(story33);
//    story33Animation.play();
//    primaryStage.show();
//    } else {
//    primaryStage.setScene(story32);
//    primaryStage.show();
//   }
//   });

//   //story33methods
//   story33.setOnKeyPressed(e -> {
//    if (e.getCode() == KeyCode.ESCAPE) {
//    primaryStage.setScene(opening);
//    primaryStage.show();
//   } else if (e.getCode() == KeyCode.ENTER) {
//    primaryStage.setScene(story34);
//    story34Animation.play();
//    primaryStage.show();
//    } else {
//    primaryStage.setScene(story33);
//    primaryStage.show();
//   }
//   });

//   //story34methods
//   story34.setOnKeyPressed(e -> {
//    if (e.getCode() == KeyCode.ESCAPE) {
//    primaryStage.setScene(opening);
//    primaryStage.show();
//   } else if (e.getCode() == KeyCode.ENTER) {
//    primaryStage.setScene(story39);
//    story39Animation.play();
//    primaryStage.show();
//    } else {
//    primaryStage.setScene(story34);
//    primaryStage.show();
//   }
//   });

//   //story35methods
//   story35.setOnKeyPressed(e -> {
//    if (e.getCode() == KeyCode.ESCAPE) {
//    primaryStage.setScene(opening);
//    primaryStage.show();
//   } else if (e.getCode() == KeyCode.ENTER) {
//    primaryStage.setScene(story36);
//    story36Animation.play();
//    primaryStage.show();
//    } else {
//    primaryStage.setScene(story35);
//    primaryStage.show();
//   }
//   });

//   //story36methods
//   story36.setOnKeyPressed(e -> {
//    if (e.getCode() == KeyCode.ESCAPE) {
//    primaryStage.setScene(opening);
//    primaryStage.show();
//   } else if (e.getCode() == KeyCode.ENTER) {
//    primaryStage.setScene(story37);
//    story37Animation.play();
//    primaryStage.show();
//    } else {
//    primaryStage.setScene(story36);
//    primaryStage.show();
//   }
//   });

//   //story37methods
//   story37.setOnKeyPressed(e -> {
//    if (e.getCode() == KeyCode.ESCAPE) {
//    primaryStage.setScene(opening);
//    primaryStage.show();
//   } else if (e.getCode() == KeyCode.ENTER) {
//    primaryStage.setScene(story38);
//    story38Animation.play();
//    primaryStage.show();
//    } else {
//    primaryStage.setScene(story37);
//    primaryStage.show();
//   }
//   });

//   //story38methods
//   story38.setOnKeyPressed(e -> {
//    if (e.getCode() == KeyCode.ESCAPE) {
//    primaryStage.setScene(opening);
//    primaryStage.show();
//   } else if (e.getCode() == KeyCode.ENTER) {
//    primaryStage.setScene(story39);
//    story39Animation.play();
//    primaryStage.show();
//    } else {
//    primaryStage.setScene(story38);
//    primaryStage.show();
//   }
//   });

//   //story39methods
//   story39.setOnKeyPressed(e -> {
//    if (e.getCode() == KeyCode.ESCAPE) {
//    primaryStage.setScene(opening);
//    primaryStage.show();
//   } else if (e.getCode() == KeyCode.ENTER) {
//    primaryStage.setScene(story40);
//    story40Animation.play();
//    primaryStage.show();
//    } else {
//    primaryStage.setScene(story39);
//    primaryStage.show();
//   }
//   });

//   //story40methods
//   story40.setOnKeyPressed(e -> {
//    if (e.getCode() == KeyCode.ESCAPE) {
//    primaryStage.setScene(opening);
//    primaryStage.show();
//   } else if (e.getCode() == KeyCode.ENTER) {
//    primaryStage.setScene(story41);
//    story41Animation.play();
//    primaryStage.show();
//    } else {
//    primaryStage.setScene(story40);
//    primaryStage.show();
//   }
//   });

//   //story41methods
//   story41.setOnKeyPressed(e -> {
//    if (e.getCode() == KeyCode.ESCAPE) {
//    primaryStage.setScene(opening);
//    primaryStage.show();
//   } else if (e.getCode() == KeyCode.ENTER) {
//    primaryStage.setScene(story42);
//    story42Animation.play();
//    primaryStage.show();
//    } else {
//    primaryStage.setScene(story41);
//    primaryStage.show();
//   }
//   });

//   //story42methods
//   story42.setOnKeyPressed(e -> {
//    if (e.getCode() == KeyCode.ESCAPE) {
//    primaryStage.setScene(opening);
//    primaryStage.show();
//   } else if (e.getCode() == KeyCode.ENTER) {
//    primaryStage.setScene(story43);
//    story43Animation.play();
//    primaryStage.show();
//    } else {
//    primaryStage.setScene(story42);
//    primaryStage.show();
//   }
//   });

//   //story43methods
//   story43.setOnKeyPressed(e -> {
//    if (e.getCode() == KeyCode.ESCAPE) {
//    primaryStage.setScene(opening);
//    primaryStage.show();
//   } else if (e.getCode() == KeyCode.ENTER) {
//    primaryStage.setScene(story44);
//    story44Animation.play();
//    primaryStage.show();
//    } else {
//    primaryStage.setScene(story43);
//    primaryStage.show();
//   }
//   });

//   //story44methods
//   story44.setOnKeyPressed(e -> {
//    if (e.getCode() == KeyCode.ESCAPE) {
//    primaryStage.setScene(opening);
//    primaryStage.show();
//   } else if (e.getCode() == KeyCode.ENTER) {
//    primaryStage.setScene(story45);
//    story45Animation.play();
//    primaryStage.show();
//    } else {
//    primaryStage.setScene(story44);
//    primaryStage.show();
//   }
//   });

//   //story45methods
//   story45.setOnKeyPressed(e -> {
//    if (e.getCode() == KeyCode.ESCAPE) {
//    primaryStage.setScene(opening);
//    primaryStage.show();
//   } else if (e.getCode() == KeyCode.ENTER) {
//    primaryStage.setScene(story46);
//    primaryStage.show();
//    } else {
//    primaryStage.setScene(story45);
//    primaryStage.show();
//   }
//   });

//     //story46 methods
//      story46.setOnKeyPressed(e -> {
//       if (e.getCode() == KeyCode.ESCAPE) {
//         primaryStage.setScene(opening);
//         primaryStage.show();
//       }
//     });
    
//     story46Button1.setOnAction(new EventHandler<ActionEvent>() {
//       @Override
//       public void handle(ActionEvent e) {
//         story46Label.setStyle("-fx-text-fill:white;-fx-font-size:120%;-fx-background-color:rgba(0,0,0,0.8)");
//         story46Animation.play();
//       }
//     });

//     story46Button2.setOnAction(new EventHandler<ActionEvent>() {
//       @Override
//       public void handle(ActionEvent e) {
//         story46Label.setStyle("-fx-text-fill:white;-fx-font-size:120%;-fx-background-color:rgba(0,0,0,0.8)");
//         story46Animation.play();
//       }
//     });

//     story46Button3.setOnAction(new EventHandler<ActionEvent>() {
//       @Override
//       public void handle(ActionEvent e) {
//         primaryStage.setScene(story47);
//         primaryStage.show();
//       }
//     });

//     //story47 methods
//     story47.setOnKeyPressed(e -> {
//       if (e.getCode() == KeyCode.ESCAPE) {
//         primaryStage.setScene(opening);
//         primaryStage.show();
//       }
//     });
    
//     story47Button2.setOnAction(new EventHandler<ActionEvent>() {
//       @Override
//       public void handle(ActionEvent e) {
//         story47Label.setStyle("-fx-text-fill:white;-fx-font-size:120%;-fx-background-color:rgba(0,0,0,0.8)");
//         story47Animation.play();
//       }
//     });

//     story47Button3.setOnAction(new EventHandler<ActionEvent>() {
//       @Override
//       public void handle(ActionEvent e) {
//         story47Label.setStyle("-fx-text-fill:white;-fx-font-size:120%;-fx-background-color:rgba(0,0,0,0.8)");
//         story47Animation.play();
//       }
//     });

//     story47Button1.setOnAction(new EventHandler<ActionEvent>() {
//       @Override
//       public void handle(ActionEvent e) {
//         primaryStage.setScene(story48);
//         primaryStage.show();
//       }
//     });

//     //story48 methods
//     story48.setOnKeyPressed(e -> {
//       if (e.getCode() == KeyCode.ESCAPE) {
//         primaryStage.setScene(opening);
//         primaryStage.show();
//       }
//     });

//     story48Button1.setOnAction(new EventHandler<ActionEvent>() {
//       @Override
//       public void handle(ActionEvent e) {
//         story48Label.setStyle("-fx-text-fill:white;-fx-font-size:120%;-fx-background-color:rgba(0,0,0,0.8)");
//         story48Animation.play();
//       }
//     });

//     story48Button3.setOnAction(new EventHandler<ActionEvent>() {
//       @Override
//       public void handle(ActionEvent e) {
//         story48Label.setStyle("-fx-text-fill:white;-fx-font-size:120%;-fx-background-color:rgba(0,0,0,0.8)");
//         story48Animation.play();
//       }
//     });

//     story48Button2.setOnAction(new EventHandler<ActionEvent>() {
//       @Override
//       public void handle(ActionEvent e) {
//         primaryStage.setScene(story49);
//         primaryStage.show();
//         story49Animation.play();
//       }
//     });

//   //story49methods
//     story49.setOnKeyPressed(e -> {
//      if (e.getCode() == KeyCode.ESCAPE) {
//      primaryStage.setScene(opening);
//      primaryStage.show();
//     } else if (e.getCode() == KeyCode.ENTER) {
//      primaryStage.setScene(story50);
//      story50Animation.play();
//      primaryStage.show();
//      } else {
//      primaryStage.setScene(story49);
//      primaryStage.show();
//     }
//     });

//     //story50methods
//     story50.setOnKeyPressed(e -> {
//      if (e.getCode() == KeyCode.ESCAPE) {
//      primaryStage.setScene(opening);
//      primaryStage.show();
//     } else if (e.getCode() == KeyCode.ENTER) {
//      primaryStage.setScene(story51);
//      story51Animation.play();
//      primaryStage.show();
//      } else {
//      primaryStage.setScene(story50);
//      primaryStage.show();
//     }
//     });

//     //story51methods
//     story51.setOnKeyPressed(e -> {
//      if (e.getCode() == KeyCode.ESCAPE) {
//      primaryStage.setScene(opening);
//      primaryStage.show();
//     } else if (e.getCode() == KeyCode.ENTER) {
//      primaryStage.setScene(story52);
//      story52Animation.play();
//      primaryStage.show();
//      } else {
//      primaryStage.setScene(story51);
//      primaryStage.show();
//     }
//     });

//     //story52methods
//     story52.setOnKeyPressed(e -> {
//      if (e.getCode() == KeyCode.ESCAPE) {
//      primaryStage.setScene(opening);
//      primaryStage.show();
//     } else if (e.getCode() == KeyCode.ENTER) {
//      primaryStage.setScene(story53);
//      primaryStage.show();
//      story53FT.play();
//      } else {
//      primaryStage.setScene(story52);
//      primaryStage.show();
//     }
//     });

//     //story53methods
//     story53.setOnKeyPressed(e -> {
//      if (e.getCode() == KeyCode.ESCAPE) {
//      primaryStage.setScene(opening);
//      primaryStage.show();
//     } else if (e.getCode() == KeyCode.ENTER) {
//      primaryStage.setScene(story54);
//      story54Animation.play();
//      primaryStage.show();
//      } else {
//      primaryStage.setScene(story53);
//      primaryStage.show();
//     }
//     });

//     //story54methods
//     story54.setOnKeyPressed(e -> {
//      if (e.getCode() == KeyCode.ESCAPE) {
//      primaryStage.setScene(opening);
//      primaryStage.show();
//     } else if (e.getCode() == KeyCode.ENTER) {
//      primaryStage.setScene(story55);
//      story55Animation.play();
//      primaryStage.show();
//      } else {
//      primaryStage.setScene(story54);
//      primaryStage.show();
//     }
//     });

//     //story55methods
//     story55.setOnKeyPressed(e -> {
//      if (e.getCode() == KeyCode.ESCAPE) {
//      primaryStage.setScene(opening);
//      primaryStage.show();
//     } else if (e.getCode() == KeyCode.ENTER) {
//      primaryStage.setScene(story56);
//      story56Animation.play();
//      primaryStage.show();
//      } else {
//      primaryStage.setScene(story55);
//      primaryStage.show();
//     }
//     });

//     //story56methods
//     story56.setOnKeyPressed(e -> {
//      if (e.getCode() == KeyCode.ESCAPE) {
//      primaryStage.setScene(opening);
//      primaryStage.show();
//     } else if (e.getCode() == KeyCode.ENTER) {
//      primaryStage.setScene(story57);
//      primaryStage.show();
//      } else {
//      primaryStage.setScene(story56);
//      primaryStage.show();
//     }
//     });

//     //story57 methods
//     story57.setOnKeyPressed(e -> {
//       if (e.getCode() == KeyCode.ESCAPE) {
//         primaryStage.setScene(opening);
//         primaryStage.show();
//       }
//     });
    
//     story57Button1.setOnAction(new EventHandler<ActionEvent>() {
//       @Override
//       public void handle(ActionEvent e) {
//         story57Label.setStyle("-fx-text-fill:white;-fx-font-size:120%;-fx-background-color:rgba(0,0,0,0.8)");
//         story57Animation.play();
//       }
//     });

//     story57Button2.setOnAction(new EventHandler<ActionEvent>() {
//       @Override
//       public void handle(ActionEvent e) {
//         story57Label.setStyle("-fx-text-fill:white;-fx-font-size:120%;-fx-background-color:rgba(0,0,0,0.8)");
//         story57Animation.play();
//       }
//     });

//     story57Button3.setOnAction(new EventHandler<ActionEvent>() {
//       @Override
//       public void handle(ActionEvent e) {
//         primaryStage.setScene(story58);
//         primaryStage.show();
//       }
//     });

//     //story58 methods
//     story58.setOnKeyPressed(e -> {
//       if (e.getCode() == KeyCode.ESCAPE) {
//         primaryStage.setScene(opening);
//         primaryStage.show();
//       }
//     });
//     story58Button2.setOnAction(new EventHandler<ActionEvent>() {
//       @Override
//       public void handle(ActionEvent e) {
//         story58Label.setStyle("-fx-text-fill:white;-fx-font-size:120%;-fx-background-color:rgba(0,0,0,0.8)");
//         story58Animation.play();
//       }
//     });

//     story58Button3.setOnAction(new EventHandler<ActionEvent>() {
//       @Override
//       public void handle(ActionEvent e) {
//         story58Label.setStyle("-fx-text-fill:white;-fx-font-size:120%;-fx-background-color:rgba(0,0,0,0.8)");
//         story58Animation.play();
//       }
//     });
//     story58Button1.setOnAction(new EventHandler<ActionEvent>() {
//       @Override
//       public void handle(ActionEvent e) {
//         primaryStage.setScene(story59);
//         primaryStage.show();
//       }
//     });

//     //story59 methods
//     story59.setOnKeyPressed(e -> {
//       if (e.getCode() == KeyCode.ESCAPE) {
//         primaryStage.setScene(opening);
//         primaryStage.show();
//       }
//     });

//     story59Button1.setOnAction(new EventHandler<ActionEvent>() {
//       @Override
//       public void handle(ActionEvent e) {
//         story59Label.setStyle("-fx-text-fill:white;-fx-font-size:120%;-fx-background-color:rgba(0,0,0,0.8)");
//         story59Animation.play();
//       }
//     });

//     story59Button3.setOnAction(new EventHandler<ActionEvent>() {
//       @Override
//       public void handle(ActionEvent e) {
//         story59Label.setStyle("-fx-text-fill:white;-fx-font-size:120%;-fx-background-color:rgba(0,0,0,0.8)");
//         story59Animation.play();
//       }
//     });
//     story59Button2.setOnAction(new EventHandler<ActionEvent>() {
//       @Override
//       public void handle(ActionEvent e) {
//         primaryStage.setScene(story60);
//         primaryStage.show();
//       }
//     });

//     //story60 methods
//     story60.setOnKeyPressed(e -> {
//       if (e.getCode() == KeyCode.ESCAPE) {
//         primaryStage.setScene(opening);
//         primaryStage.show();
//       }
//     });
//     story60Button2.setOnAction(new EventHandler<ActionEvent>() {
//       @Override
//       public void handle(ActionEvent e) {
//         story60Label.setStyle("-fx-text-fill:white;-fx-font-size:120%;-fx-background-color:rgba(0,0,0,0.8)");
//         story60Animation.play();
//       }
//     });

//     story60Button3.setOnAction(new EventHandler<ActionEvent>() {
//       @Override
//       public void handle(ActionEvent e) {
//         story60Label.setStyle("-fx-text-fill:white;-fx-font-size:120%;-fx-background-color:rgba(0,0,0,0.8)");
//         story60Animation.play();
//       }
//     });
//     story60Button1.setOnAction(new EventHandler<ActionEvent>() {
//       @Override
//       public void handle(ActionEvent e) {
//         primaryStage.setScene(story61);
//         primaryStage.show();
//       }
//     });
    
//     //story61 methods
//     story61.setOnKeyPressed(e -> {
//       if (e.getCode() == KeyCode.ESCAPE) {
//         primaryStage.setScene(opening);
//         primaryStage.show();
//       }
//     });
//     story61Button1.setOnAction(new EventHandler<ActionEvent>() {
//       @Override
//       public void handle(ActionEvent e) {
//         story61Label.setStyle("-fx-text-fill:white;-fx-font-size:120%;-fx-background-color:rgba(0,0,0,0.8)");
//         story61Animation.play();
//       }
//     });

//     story61Button3.setOnAction(new EventHandler<ActionEvent>() {
//       @Override
//       public void handle(ActionEvent e) {
//         story61Label.setStyle("-fx-text-fill:white;-fx-font-size:120%;-fx-background-color:rgba(0,0,0,0.8)");
//         story61Animation.play();
//       }
//     });
//     story61Button2.setOnAction(new EventHandler<ActionEvent>() {
//       @Override
//       public void handle(ActionEvent e) {
//         primaryStage.setScene(story63); //edited to not include 62
//         primaryStage.show();
//       }
//     });
    
//     //story62 methods
//   //  story62.setOnKeyPressed(e -> {
//    //   if (e.getCode() == KeyCode.ESCAPE) {
//  //       primaryStage.setScene(opening);
//   //      primaryStage.show();
//  //     }
// //    });

//   //    story62Button1.setOnAction(new EventHandler<ActionEvent>() {
//   //    @Override
//   //    public void handle(ActionEvent e) {
//     //    story62Label.setStyle("-fx-text-fill:white;-fx-font-size:120%;-fx-background-color:rgba(0,0,0,0.8)");
//    //     story62Animation.play();
//  //     }
// //    });

//   //  story62Button3.setOnAction(new EventHandler<ActionEvent>() {
//   //    @Override
// //      public void handle(ActionEvent e) {
//     //    story62Label.setStyle("-fx-text-fill:white;-fx-font-size:120%;-fx-background-color:rgba(0,0,0,0.8)");
//    //     story62Animation.play();
//    //   }
//   //  });

//  //   story62Button2.setOnAction(new EventHandler<ActionEvent>() {
//     //  @Override
//    //   public void handle(ActionEvent e) {
//    //     primaryStage.setScene(story63);
//    //     primaryStage.show();
//   //    }
//  //   });

//     //story63 methods
//     story63.setOnKeyPressed(e -> {
//       if (e.getCode() == KeyCode.ESCAPE) {
//         primaryStage.setScene(opening);
//         primaryStage.show();
//       }
//     });
//     story63Button2.setOnAction(new EventHandler<ActionEvent>() {
//       @Override
//       public void handle(ActionEvent e) {
//         story63Label.setStyle("-fx-text-fill:white;-fx-font-size:120%;-fx-background-color:rgba(0,0,0,0.8)");
//         story63Animation.play();
//       }
//     });

//     story63Button3.setOnAction(new EventHandler<ActionEvent>() {
//       @Override
//       public void handle(ActionEvent e) {
//         story63Label.setStyle("-fx-text-fill:white;-fx-font-size:120%;-fx-background-color:rgba(0,0,0,0.8)");
//         story63Animation.play();
//       }
//     });
//     story63Button1.setOnAction(new EventHandler<ActionEvent>() {
//       @Override
//       public void handle(ActionEvent e) {
//         primaryStage.setScene(story64);
//         primaryStage.show();
//       }
//     });

//     //story64 methods
//     story64.setOnKeyPressed(e -> {
//       if (e.getCode() == KeyCode.ESCAPE) {
//         primaryStage.setScene(opening);
//         primaryStage.show();
//       }
//     });
//     story64Button1.setOnAction(new EventHandler<ActionEvent>() {
//       @Override
//       public void handle(ActionEvent e) {
//         primaryStage.setScene(story65);
//         primaryStage.show();
//       }
//     });
//     story64Button2.setOnAction(new EventHandler<ActionEvent>() {
//       @Override
//       public void handle(ActionEvent e) {
//         story64Label.setStyle("-fx-text-fill:white;-fx-font-size:120%;-fx-background-color:rgba(0,0,0,0.8)");
//         story64Animation.play();
//       }
//     });

//     story64Button3.setOnAction(new EventHandler<ActionEvent>() {
//       @Override
//       public void handle(ActionEvent e) {
//         story64Label.setStyle("-fx-text-fill:white;-fx-font-size:120%;-fx-background-color:rgba(0,0,0,0.8)");
//         story64Animation.play();
//       }
//     });

//     //story65 methods
//     story65.setOnKeyPressed(e -> {
//       if (e.getCode() == KeyCode.ESCAPE) {
//         primaryStage.setScene(opening);
//         primaryStage.show();
//       }
//     });
//     story65Button1.setOnAction(new EventHandler<ActionEvent>() {
//       @Override
//       public void handle(ActionEvent e) {
//         story65Label.setStyle("-fx-text-fill:white;-fx-font-size:120%;-fx-background-color:rgba(0,0,0,0.8)");
//         story65Animation.play();
//       }
//     });
//     story65Button2.setOnAction(new EventHandler<ActionEvent>() {
//       @Override
//       public void handle(ActionEvent e) {
//         primaryStage.setScene(story66);
//         primaryStage.show();
//       }
//     });
//     story65Button3.setOnAction(new EventHandler<ActionEvent>() {
//       @Override
//       public void handle(ActionEvent e) {
//         story65Label.setStyle("-fx-text-fill:white;-fx-font-size:120%;-fx-background-color:rgba(0,0,0,0.8)");
//         story65Animation.play();
//       }
//     });
//     //story66 methods
//     story66.setOnKeyPressed(e -> {
//       if (e.getCode() == KeyCode.ESCAPE) {
//         primaryStage.setScene(opening);
//         primaryStage.show();
//       }
//     });
//     story66Button2.setOnAction(new EventHandler<ActionEvent>() {
//       @Override
//       public void handle(ActionEvent e) {
//         story66Label.setStyle("-fx-text-fill:white;-fx-font-size:120%;-fx-background-color:rgba(0,0,0,0.8)");
//         story66Animation.play();
//       }
//     });

//     story66Button3.setOnAction(new EventHandler<ActionEvent>() {
//       @Override
//       public void handle(ActionEvent e) {
//         story66Label.setStyle("-fx-text-fill:white;-fx-font-size:120%;-fx-background-color:rgba(0,0,0,0.8)");
//         story66Animation.play();
//       }
//     });
//     story66Button1.setOnAction(new EventHandler<ActionEvent>() {
//       @Override
//       public void handle(ActionEvent e) {
//         primaryStage.setScene(story67);
//         primaryStage.show();
//         story67Animation.play();
//       }
//     });

//   //story67methods
//     story67.setOnKeyPressed(e -> {
//      if (e.getCode() == KeyCode.ESCAPE) {
//      primaryStage.setScene(opening);
//      primaryStage.show();
//     } else if (e.getCode() == KeyCode.ENTER) {
//      primaryStage.setScene(story68);
//      story68Animation.play();
//      primaryStage.show();
//      } else {
//      primaryStage.setScene(story67);
//      primaryStage.show();
//     }
//     });

//     //story68methods
//     story68.setOnKeyPressed(e -> {
//      if (e.getCode() == KeyCode.ESCAPE) {
//      primaryStage.setScene(opening);
//      primaryStage.show();
//     } else if (e.getCode() == KeyCode.ENTER) {
//      primaryStage.setScene(story69);
//      story69Animation.play();
//      primaryStage.show();
//      } else {
//      primaryStage.setScene(story68);
//      primaryStage.show();
//     }
//     });

//     //story69methods
//     story69.setOnKeyPressed(e -> {
//      if (e.getCode() == KeyCode.ESCAPE) {
//      primaryStage.setScene(opening);
//      primaryStage.show();
//     } else if (e.getCode() == KeyCode.ENTER) {
//      primaryStage.setScene(story70);
//      story70Animation.play();
//      primaryStage.show();
//      } else {
//      primaryStage.setScene(story69);
//      primaryStage.show();
//     }
//     });

//     //story70methods
//     story70.setOnKeyPressed(e -> {
//      if (e.getCode() == KeyCode.ESCAPE) {
//      primaryStage.setScene(opening);
//      primaryStage.show();
//     } else if (e.getCode() == KeyCode.ENTER) {
//      primaryStage.setScene(story71);
//      story71Animation.play();
//      primaryStage.show();
//      } else {
//      primaryStage.setScene(story70);
//      primaryStage.show();
//     }
//     });

//     //story71methods
//     story71.setOnKeyPressed(e -> {
//      if (e.getCode() == KeyCode.ESCAPE) {
//      primaryStage.setScene(opening);
//      primaryStage.show();
//     } else if (e.getCode() == KeyCode.ENTER) {
//      primaryStage.setScene(story72);
//      story72Animation.play();
//      primaryStage.show();
//      } else {
//      primaryStage.setScene(story71);
//      primaryStage.show();
//     }
//     });

//     //story72methods
//     story72.setOnKeyPressed(e -> {
//      if (e.getCode() == KeyCode.ESCAPE) {
//      primaryStage.setScene(opening);
//      primaryStage.show();
//     } else if (e.getCode() == KeyCode.ENTER) {
//      primaryStage.setScene(story73);
//      story73Animation.play();
//      primaryStage.show();
//      } else {
//      primaryStage.setScene(story72);
//      primaryStage.show();
//     }
//     });

//     //story73methods
//     story73.setOnKeyPressed(e -> {
//      if (e.getCode() == KeyCode.ESCAPE) {
//      primaryStage.setScene(opening);
//      primaryStage.show();
//     } else if (e.getCode() == KeyCode.ENTER) {
//      primaryStage.setScene(story74);
//      story74Animation.play();
//      primaryStage.show();
//      } else {
//      primaryStage.setScene(story73);
//      primaryStage.show();
//     }
//     });

//     //story74methods
//     story74.setOnKeyPressed(e -> {
//      if (e.getCode() == KeyCode.ESCAPE) {
//      primaryStage.setScene(opening);
//      primaryStage.show();
//     } else if (e.getCode() == KeyCode.ENTER) {
//      primaryStage.setScene(story75);
//      story75Animation.play();
//      primaryStage.show();
//      } else {
//      primaryStage.setScene(story74);
//      primaryStage.show();
//     }
//     });

//     //story75methods
//     story75.setOnKeyPressed(e -> {
//      if (e.getCode() == KeyCode.ESCAPE) {
//      primaryStage.setScene(opening);
//      primaryStage.show();
//     } else if (e.getCode() == KeyCode.ENTER) {
//      primaryStage.setScene(story76);
//      story76Animation.play();
//      primaryStage.show();
//      } else {
//      primaryStage.setScene(story75);
//      primaryStage.show();
//     }
//     });

//     //story76methods
//     story76.setOnKeyPressed(e -> {
//      if (e.getCode() == KeyCode.ESCAPE) {
//      primaryStage.setScene(opening);
//      primaryStage.show();
//     } else if (e.getCode() == KeyCode.ENTER) {
//      primaryStage.setScene(story77);
//      story77Animation.play();
//      primaryStage.show();
//      } else {
//      primaryStage.setScene(story76);
//      primaryStage.show();
//     }
//     });

//   //story77methods
//     story77.setOnKeyPressed(e -> {
//      if (e.getCode() == KeyCode.ESCAPE) {
//      primaryStage.setScene(opening);
//      primaryStage.show();
//     } else if (e.getCode() == KeyCode.ENTER) {
//      primaryStage.setScene(story78);
//      primaryStage.show();
//      story78FT.play();
//      } else {
//      primaryStage.setScene(story77);
//      primaryStage.show();
//     }
//     });

  
    
//     //exits platform
//     exitButton.setOnAction(e -> {
//       System.out.println("Exiting the most awesome project you've ever seen in your life");
//       Platform.exit();
//     });

//     primaryStage.setResizable(false);
//     primaryStage.setTitle("APCSA PROJECT");
//     primaryStage.setScene(opening);
//     primaryStage.show();
    
//   } 
    
//   public static void main(String[] args) {
//     launch(args);
//   }
// } 

// // package com.example;

// // import java.io.IOException;

// // import javafx.application.Application;
// // import javafx.fxml.FXMLLoader;
// // import javafx.scene.Parent;
// // import javafx.scene.Scene;
// // import javafx.stage.Stage;

// // /**
// //  * JavaFX App
// //  */
// // public class App extends Application {

// //     private static Scene scene;

// //     @Override
// //     public void start(Stage stage) throws IOException {
// //         scene = new Scene(loadFXML("primary"), 640, 480);
// //         stage.setScene(scene);
// //         stage.show();
// //     }

// //     static void setRoot(String fxml) throws IOException {
// //         scene.setRoot(loadFXML(fxml));
// //     }

// //     private static Parent loadFXML(String fxml) throws IOException {
// //         FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
// //         return fxmlLoader.load();
// //     }

// //     public static void main(String[] args) {
// //         launch();
// //     }

// // }