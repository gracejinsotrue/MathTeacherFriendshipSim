package com.example;

import javafx.animation.Animation;
import javafx.animation.FadeTransition;
import javafx.animation.Transition;
import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.RowConstraints;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.util.Duration;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create the main layout pane
        BorderPane mainLayout = new BorderPane();

        // Load the background image
        Image backgroundImage = new Image(getClass().getResourceAsStream("/images/background_image.png"));
        ImageView backgroundImageView = new ImageView(backgroundImage);
        backgroundImageView.setFitWidth(1280); // Adjust width as needed
        backgroundImageView.setFitHeight(720); // Adjust height as needed

        // Create a StackPane to hold the background image and image views
        StackPane stackPane = new StackPane();
        stackPane.getChildren().add(backgroundImageView);
        // Load images for Play and Exit
        Image playImage = new Image(getClass().getResourceAsStream("/images/play.png"));
        Image exitImage = new Image(getClass().getResourceAsStream("/images/exit.png"));

        // Create ImageViews for the Play and Exit images
        ImageView playImageView = new ImageView(playImage);
        playImageView.setFitWidth(150); // Adjust width as needed
        playImageView.setFitHeight(100); // Adjust height as needed
        playImageView.setOnMouseClicked(e -> switchToNextScene1(primaryStage));
   
        ImageView exitImageView = new ImageView(exitImage);
        exitImageView.setFitWidth(150); // Adjust width as needed
        exitImageView.setFitHeight(100); // Adjust height as needed
        exitImageView.setOnMouseClicked(e -> System.exit(0));

        // Create a VBox for positioning image views
        VBox imageBox = new VBox();
        imageBox.setPadding(new javafx.geometry.Insets(0, 0, 350, 80)); // 50 pixels from the bottom and left
        imageBox.setSpacing(10); // Space between images
        imageBox.setAlignment(javafx.geometry.Pos.BOTTOM_LEFT);

        // Add ImageViews to VBox
        imageBox.getChildren().addAll(playImageView, exitImageView);

        // Add VBox with image views to StackPane
        stackPane.getChildren().add(imageBox);

        // Set the layout to the scene
        mainLayout.setCenter(stackPane);

        // Create and set the scene
        Scene scene = new Scene(mainLayout, 1280, 720);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Math Teacher Friendship Sim");
        primaryStage.show();
  }

   private void switchToNextScene1(Stage primaryStage) {
        // Create a GridPane for the new scene
        GridPane story1Node = new GridPane();
        story1Node.setPadding(new Insets(20));
        story1Node.setHgap(10);
        story1Node.setVgap(10);

        // Load and set the background image
        Image storyBackgroundImage = new Image(getClass().getResourceAsStream("/images/portablebg.png"));
        BackgroundImage background = new BackgroundImage(storyBackgroundImage, BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, new BackgroundSize(1280, 720, true, true, false, true));
        story1Node.setBackground(new Background(background));

        // Create a Label for the speaker
        Label story1Speaker = new Label();
        story1Speaker.setText("???");
        story1Speaker.setStyle("-fx-text-fill: white; -fx-font-size: 250%; -fx-font-weight: bold;");
        
        story1Speaker.setAlignment(Pos.CENTER_LEFT);

        // Create a Label for the story text
        Label story1Label = new Label();
        story1Label.setWrapText(true);
        story1Label.setMinWidth(1140);
        story1Label.setMaxWidth(1140);
        story1Label.setMinHeight(150);
        story1Label.setStyle("-fx-text-fill: black; -fx-font-size: 200%; -fx-background-color: rgba(255,255,255,0.7);");
        story1Label.setAlignment(Pos.CENTER_LEFT);

        // Create blank labels for spacing
        Label story1Blank = new Label();
        story1Blank.setMinWidth(100);
        story1Blank.setMinHeight(0);
        story1Blank.setStyle("-fx-background-color: transparent");

        Label story1Blank1 = new Label();
        story1Blank1.setMinWidth(0);
        story1Blank1.setMinHeight(100);
        story1Blank1.setStyle("-fx-background-color: rgba(255,255,255,0.7)");

        // Animation for text dialogue
        final String story1Content = "          Oh no! I’m late to class!! Sighhh… why did I wake up so late today?";
        final int instantCharactersCount = 10; // Number of characters to show instantly

        final Animation story1Animation = new Transition() {
            {
                setCycleDuration(Duration.millis(3000)); // Total duration for the animated part
            }

            protected void interpolate(double frac) {
                int totalLength = story1Content.length();
                int remainingCharacters = totalLength - instantCharactersCount;
                if (remainingCharacters > 0) {
                    // Calculate the index of the last character to be shown for the current fraction
                    int index = instantCharactersCount + Math.round(remainingCharacters * (float) frac);
                    story1Label.setText(story1Content.substring(0, index));
            }else {
                // If the content is shorter than the number of instant characters, show it all instantly
                story1Label.setText(story1Content);
            }
        };
    };


        story1Animation.play();
      //  story1Animation.setOnFinished(e -> switchToNextScene2(primaryStage));
        

        // Add elements to GridPane
        story1Node.add(story1Speaker, 2, 2);
        story1Node.add(story1Label, 2, 3);
        story1Node.add(story1Blank, 1, 2, 1, 1);
        story1Node.add(story1Blank1, 1, 3, 1, 1);

        // Define row and column constraints
 
        RowConstraints story1row1 = new RowConstraints();
        story1row1.setMinHeight(210);
        RowConstraints story1row2 = new RowConstraints();
        story1row2.setMinHeight(210);
        RowConstraints story1row3 = new RowConstraints();
        story1row3.setMinHeight(0);
        RowConstraints story1row4 = new RowConstraints();
        story1row4.setMinHeight(0);

        
        ColumnConstraints story1col1 = new ColumnConstraints();
        story1col1.setMinWidth(0); // Increase left margin
        ColumnConstraints story1col2 = new ColumnConstraints();
        story1col2.setMinWidth(20); // Spacer or small content
        ColumnConstraints story1col3 = new ColumnConstraints();
        story1col3.setMinWidth(800); // Increase width for main text content
        ColumnConstraints story1col4 = new ColumnConstraints();
        story1col4.setMinWidth(800); // Adjust right padding

       
        story1Node.getRowConstraints().addAll(story1row1, story1row2, story1row3, story1row4);
        story1Node.getColumnConstraints().addAll(story1col1, story1col2, story1col3, story1col4);

        // Create and set the new scene
        Scene newScene = new Scene(story1Node, 1280, 720);
        primaryStage.setScene(newScene);

        // Add key event listener for arrow keys to navigate scenes
        newScene.setOnKeyPressed(event -> {
            if (event.getCode() == KeyCode.RIGHT) {
                switchToNextScene2(primaryStage);
            } else if (event.getCode() == KeyCode.LEFT) {
                start(primaryStage);
            }
        });
    
    }
     private void switchToNextScene2(Stage primaryStage) {
           // Create a GridPane for the new scene
           GridPane story2Node = new GridPane();
           story2Node.setPadding(new Insets(20));
           story2Node.setHgap(10);
           story2Node.setVgap(10);
   
           // Load and set the background image
           Image storyBackgroundImage = new Image(getClass().getResourceAsStream("/images/portabletree.png"));
           BackgroundImage background = new BackgroundImage(storyBackgroundImage, BackgroundRepeat.NO_REPEAT,
                   BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, new BackgroundSize(1280, 720, true, true, false, true));
           story2Node.setBackground(new Background(background));
              // Create a Label for the speaker
        Label story2Speaker = new Label();
        story2Speaker.setText("Narrator");
        story2Speaker.setStyle("-fx-text-fill: white; -fx-font-size: 250%; -fx-font-weight: bold;");
        
        story2Speaker.setAlignment(Pos.CENTER_LEFT);
        story2Speaker.setAlignment(Pos.CENTER_LEFT);

        // Create a Label for the story text
        Label story2Label = new Label();
        story2Label.setWrapText(true);
        story2Label.setMinWidth(1140);
        story2Label.setMaxWidth(1140);
        story2Label.setMinHeight(150);
        story2Label.setStyle("-fx-text-fill: black; -fx-font-size: 200%; -fx-background-color: rgba(255,255,255,0.7);");
        story2Label.setAlignment(Pos.CENTER_LEFT);

        // Create blank labels for spacing
        Label story2Blank = new Label();
        story2Blank.setMinWidth(100);
        story2Blank.setMinHeight(0);
        story2Blank.setStyle("-fx-background-color: transparent");

        Label story2Blank1 = new Label();
        story2Blank1.setMinWidth(0);
        story2Blank1.setMinHeight(100);
        story2Blank1.setStyle("-fx-background-color: rgba(255,255,255,0.7)");

        // Animation for text dialogue
        final String story2Content = "         Not noticing where you are hastily approaching, you don’t notice the tree you are about to run into...";
        final int instantCharactersCount = 10; // Number of characters to show instantly

        final Animation story2Animation = new Transition() {
            {
                setCycleDuration(Duration.millis(3000)); // Total duration for the animated part
            }

            protected void interpolate(double frac) {
                int totalLength = story2Content.length();
                int remainingCharacters = totalLength - instantCharactersCount;
                if (remainingCharacters > 0) {
                    // Calculate the index of the last character to be shown for the current fraction
                    int index = instantCharactersCount + Math.round(remainingCharacters * (float) frac);
                    story2Label.setText(story2Content.substring(0, index));
            }else {
                // If the content is shorter than the number of instant characters, show it all instantly
                story2Label.setText(story2Content);
            }
        };
    };
        story2Animation.play();

        // Add elements to GridPane
        story2Node.add(story2Speaker, 2, 2);
        story2Node.add(story2Label, 2, 3);
        story2Node.add(story2Blank, 1, 2, 1, 1);
        story2Node.add(story2Blank1, 1, 3, 1, 1);

        // Define row and column constraints

        RowConstraints story2row1 = new RowConstraints();
        story2row1.setMinHeight(210);
        RowConstraints story2row2 = new RowConstraints();
        story2row2.setMinHeight(210);
        RowConstraints story2row3 = new RowConstraints();
        story2row3.setMinHeight(0);
        RowConstraints story2row4 = new RowConstraints();
        story2row4.setMinHeight(0);

        
        ColumnConstraints story2col1 = new ColumnConstraints();
        story2col1.setMinWidth(0); // Increase left margin
        ColumnConstraints story2col2 = new ColumnConstraints();
        story2col2.setMinWidth(20); // Spacer or small content
        ColumnConstraints story2col3 = new ColumnConstraints();
        story2col3.setMinWidth(800); // Increase width for main text content
        ColumnConstraints story2col4 = new ColumnConstraints();
        story2col4.setMinWidth(800); // Adjust right padding

    
        story2Node.getRowConstraints().addAll(story2row1, story2row2, story2row3, story2row4);
        story2Node.getColumnConstraints().addAll(story2col1, story2col2, story2col3, story2col4);

        // Create and set the new scene
        Scene newScene = new Scene(story2Node, 1280, 720);
        primaryStage.setScene(newScene);
         // Add key event listener for arrow keys to navigate scenes
         newScene.setOnKeyPressed(event -> {
            if (event.getCode() == KeyCode.RIGHT) {
                switchToNextScene3(primaryStage);
            } else if (event.getCode() == KeyCode.LEFT) {
                switchToNextScene1(primaryStage);
            }
        });



    }   private void switchToNextScene3(Stage primaryStage) {
        GridPane story3Node = new GridPane();
           story3Node.setPadding(new Insets(20));
           story3Node.setHgap(10);
           story3Node.setVgap(10);
   
           // Load and set the background image
           Image storyBackgroundImage = new Image(getClass().getResourceAsStream("/images/portabletree.png"));
           BackgroundImage background = new BackgroundImage(storyBackgroundImage, BackgroundRepeat.NO_REPEAT,
                   BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, new BackgroundSize(1280, 720, true, true, false, true));
           story3Node.setBackground(new Background(background));
              // Create a Label for the speaker
        Label story3Speaker = new Label();
        story3Speaker.setText("Narrator");
        story3Speaker.setStyle("-fx-text-fill: white; -fx-font-size: 250%; -fx-font-weight: bold;");
        
        story3Speaker.setAlignment(Pos.CENTER_LEFT);
        story3Speaker.setAlignment(Pos.CENTER_LEFT);

        // Create a Label for the story text
        Label story3Label = new Label();
        story3Label.setWrapText(true);
        story3Label.setMinWidth(1140);
        story3Label.setMaxWidth(1140);
        story3Label.setMinHeight(150);
        story3Label.setStyle("-fx-text-fill: black; -fx-font-size: 200%; -fx-background-color: rgba(255,255,255,0.7);");
        story3Label.setAlignment(Pos.CENTER_LEFT);

        // Create blank labels for spacing
        Label story3Blank = new Label();
        story3Blank.setMinWidth(100);
        story3Blank.setMinHeight(0);
        story3Blank.setStyle("-fx-background-color: transparent");

        Label story3Blank1 = new Label();
        story3Blank1.setMinWidth(0);
        story3Blank1.setMinHeight(100);
        story3Blank1.setStyle("-fx-background-color: rgba(255,255,255,0.7)");

        // Animation for text dialogue
        final String story2Content = "         AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAFFHHFFFFFFDEAHKDWALHKLDD#ECSLDKEAQPQ";
        final int instantCharactersCount = 10; // Number of characters to show instantly

        final Animation story2Animation = new Transition() {
            {
                setCycleDuration(Duration.millis(3000)); // Total duration for the animated part
            }

            protected void interpolate(double frac) {
                int totalLength = story2Content.length();
                int remainingCharacters = totalLength - instantCharactersCount;
                if (remainingCharacters > 0) {
                    // Calculate the index of the last character to be shown for the current fraction
                    int index = instantCharactersCount + Math.round(remainingCharacters * (float) frac);
                    story3Label.setText(story2Content.substring(0, index));
            }else {
                // If the content is shorter than the number of instant characters, show it all instantly
                story3Label.setText(story2Content);
            }
        };
    };
        
        story2Animation.play();
     

        // Add elements to GridPane
        story3Node.add(story3Speaker, 2, 2);
        story3Node.add(story3Label, 2, 3);
        story3Node.add(story3Blank, 1, 2, 1, 1);
        story3Node.add(story3Blank1, 1, 3, 1, 1);

        // Define row and column constraints

        RowConstraints story3row1 = new RowConstraints();
        story3row1.setMinHeight(210);
        RowConstraints story3row2 = new RowConstraints();
        story3row2.setMinHeight(210);
        RowConstraints story3row3 = new RowConstraints();
        story3row3.setMinHeight(0);
        RowConstraints story3row4 = new RowConstraints();
        story3row4.setMinHeight(0);

        
        ColumnConstraints story3col1 = new ColumnConstraints();
        story3col1.setMinWidth(0); // Increase left margin
        ColumnConstraints story3col2 = new ColumnConstraints();
        story3col2.setMinWidth(20); // Spacer or small content
        ColumnConstraints story3col3 = new ColumnConstraints();
        story3col3.setMinWidth(800); // Increase width for main text content
        ColumnConstraints story3col4 = new ColumnConstraints();
        story3col4.setMinWidth(800); // Adjust right padding

    
        story3Node.getRowConstraints().addAll(story3row1, story3row2, story3row3, story3row4);
        story3Node.getColumnConstraints().addAll(story3col1, story3col2, story3col3, story3col4);

        // Create and set the new scene
        Scene newScene = new Scene(story3Node, 1280, 720);
        primaryStage.setScene(newScene);
         // Add key event listener for arrow keys to navigate scenes
         newScene.setOnKeyPressed(event -> {
            if (event.getCode() == KeyCode.RIGHT) {
        
                switchToNextScene4(primaryStage);
            } else if (event.getCode() == KeyCode.LEFT) {
                switchToNextScene2(primaryStage);
            }
        });
    

        

    }     private void switchToNextScene4(Stage primaryStage) {
        GridPane story4Node = new GridPane();
           story4Node.setPadding(new Insets(20));
           story4Node.setHgap(10);
           story4Node.setVgap(10);
           applyFadeTransition(story4Node);
          
   
           // Load and set the background image
           Image storyBackgroundImage = new Image(getClass().getResourceAsStream("/images/treenofeet.png"));
           BackgroundImage background = new BackgroundImage(storyBackgroundImage, BackgroundRepeat.NO_REPEAT,
                   BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, new BackgroundSize(1280, 720, true, true, false, true));
           story4Node.setBackground(new Background(background));
              // Create a Label for the speaker
        Label story2Speaker = new Label();
        story2Speaker.setText("???");
        story2Speaker.setStyle("-fx-text-fill: white; -fx-font-size: 250%; -fx-font-weight: bold;");
        
        story2Speaker.setAlignment(Pos.CENTER_LEFT);
        story2Speaker.setAlignment(Pos.CENTER_LEFT);

        // Create a Label for the story text
        Label story2Label = new Label();
        story2Label.setWrapText(true);
        story2Label.setMinWidth(1140);
        story2Label.setMaxWidth(1140);
        story2Label.setMinHeight(150);
        story2Label.setStyle("-fx-text-fill: black; -fx-font-size: 200%; -fx-background-color: rgba(255,255,255,0.7);");
        story2Label.setAlignment(Pos.CENTER_LEFT);

        // Create blank labels for spacing
        Label story2Blank = new Label();
        story2Blank.setMinWidth(100);
        story2Blank.setMinHeight(0);
        story2Blank.setStyle("-fx-background-color: transparent");

        Label story2Blank1 = new Label();
        story2Blank1.setMinWidth(0);
        story2Blank1.setMinHeight(100);
        story2Blank1.setStyle("-fx-background-color: rgba(255,255,255,0.7)");

        // Animation for text dialogue
        final String story2Content = "         ughh......";
        final int instantCharactersCount = 10; // Number of characters to show instantly

        final Animation story2Animation = new Transition() {
            {
                setCycleDuration(Duration.millis(4000)); // Total duration for the animated part
            }

            protected void interpolate(double frac) {
                int totalLength = story2Content.length();
                int remainingCharacters = totalLength - instantCharactersCount;
                if (remainingCharacters > 0) {
                    // Calculate the index of the last character to be shown for the current fraction
                    int index = instantCharactersCount + Math.round(remainingCharacters * (float) frac);
                    story2Label.setText(story2Content.substring(0, index));
            }else {
                // If the content is shorter than the number of instant characters, show it all instantly
                story2Label.setText(story2Content);
            }
        };
    };
        
        story2Animation.play();
     

        // Add elements to GridPane
        story4Node.add(story2Speaker, 2, 2);
        story4Node.add(story2Label, 2, 3);
        story4Node.add(story2Blank, 1, 2, 1, 1);
        story4Node.add(story2Blank1, 1, 3, 1, 1);

        // Define row and column constraints

        RowConstraints story2row1 = new RowConstraints();
        story2row1.setMinHeight(210);
        RowConstraints story2row2 = new RowConstraints();
        story2row2.setMinHeight(210);
        RowConstraints story2row3 = new RowConstraints();
        story2row3.setMinHeight(0);
        RowConstraints story2row4 = new RowConstraints();
        story2row4.setMinHeight(0);

        
        ColumnConstraints story2col1 = new ColumnConstraints();
        story2col1.setMinWidth(0); // Increase left margin
        ColumnConstraints story2col2 = new ColumnConstraints();
        story2col2.setMinWidth(20); // Spacer or small content
        ColumnConstraints story2col3 = new ColumnConstraints();
        story2col3.setMinWidth(800); // Increase width for main text content
        ColumnConstraints story2col4 = new ColumnConstraints();
        story2col4.setMinWidth(800); // Adjust right padding

    
        story4Node.getRowConstraints().addAll(story2row1, story2row2, story2row3, story2row4);
        story4Node.getColumnConstraints().addAll(story2col1, story2col2, story2col3, story2col4);

        // Create and set the new scene
        Scene newScene = new Scene(story4Node, 1280, 720);
        primaryStage.setScene(newScene);
         // Add key event listener for arrow keys to navigate scenes
         newScene.setOnKeyPressed(event -> {
            if (event.getCode() == KeyCode.RIGHT) {
                switchToNextScene5(primaryStage);//this the bigger number bae
            } else if (event.getCode() == KeyCode.LEFT) {
                switchToNextScene3(primaryStage);
            }
        });



    }   private void switchToNextScene5(Stage primaryStage) {
        GridPane story4Node = new GridPane();
           story4Node.setPadding(new Insets(20));
           story4Node.setHgap(10);
           story4Node.setVgap(10); 
           applyFadeTransitionFast(story4Node);
   
           // Load and set the background image
           Image storyBackgroundImage = new Image(getClass().getResourceAsStream("/images/treewithfeet.png"));
           BackgroundImage background = new BackgroundImage(storyBackgroundImage, BackgroundRepeat.NO_REPEAT,
                   BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, new BackgroundSize(1280, 720, true, true, false, true));
           story4Node.setBackground(new Background(background));
              // Create a Label for the speaker
        Label story2Speaker = new Label();
        story2Speaker.setText("???");
        story2Speaker.setStyle("-fx-text-fill: white; -fx-font-size: 250%; -fx-font-weight: bold;");
        
        story2Speaker.setAlignment(Pos.CENTER_LEFT);
        story2Speaker.setAlignment(Pos.CENTER_LEFT);

        // Create a Label for the story text
        Label story2Label = new Label();
        story2Label.setWrapText(true);
        story2Label.setMinWidth(1140);
        story2Label.setMaxWidth(1140);
        story2Label.setMinHeight(150);
        story2Label.setStyle("-fx-text-fill: black; -fx-font-size: 200%; -fx-background-color: rgba(255,255,255,0.7);");
        story2Label.setAlignment(Pos.CENTER_LEFT);

        // Create blank labels for spacing
        Label story2Blank = new Label();
        story2Blank.setMinWidth(100);
        story2Blank.setMinHeight(0);
        story2Blank.setStyle("-fx-background-color: transparent");

        Label story2Blank1 = new Label();
        story2Blank1.setMinWidth(0);
        story2Blank1.setMinHeight(100);
        story2Blank1.setStyle("-fx-background-color: rgba(255,255,255,0.7)");

        // Animation for text dialogue
        final String story2Content = "          huh...?";
        final int instantCharactersCount = 10; // Number of characters to show instantly

        final Animation story2Animation = new Transition() {
            {
                setCycleDuration(Duration.millis(4000)); // Total duration for the animated part
            }

            protected void interpolate(double frac) {
                int totalLength = story2Content.length();
                int remainingCharacters = totalLength - instantCharactersCount;
                if (remainingCharacters > 0) {
                    // Calculate the index of the last character to be shown for the current fraction
                    int index = instantCharactersCount + Math.round(remainingCharacters * (float) frac);
                    story2Label.setText(story2Content.substring(0, index));
            }else {
                // If the content is shorter than the number of instant characters, show it all instantly
                story2Label.setText(story2Content);
            }
        };
    };
        
        story2Animation.play();
     

        // Add elements to GridPane
        story4Node.add(story2Speaker, 2, 2);
        story4Node.add(story2Label, 2, 3);
        story4Node.add(story2Blank, 1, 2, 1, 1);
        story4Node.add(story2Blank1, 1, 3, 1, 1);

        // Define row and column constraints

        RowConstraints story2row1 = new RowConstraints();
        story2row1.setMinHeight(210);
        RowConstraints story2row2 = new RowConstraints();
        story2row2.setMinHeight(210);
        RowConstraints story2row3 = new RowConstraints();
        story2row3.setMinHeight(0);
        RowConstraints story2row4 = new RowConstraints();
        story2row4.setMinHeight(0);

        
        ColumnConstraints story2col1 = new ColumnConstraints();
        story2col1.setMinWidth(0); // Increase left margin
        ColumnConstraints story2col2 = new ColumnConstraints();
        story2col2.setMinWidth(20); // Spacer or small content
        ColumnConstraints story2col3 = new ColumnConstraints();
        story2col3.setMinWidth(800); // Increase width for main text content
        ColumnConstraints story2col4 = new ColumnConstraints();
        story2col4.setMinWidth(800); // Adjust right padding

    
        story4Node.getRowConstraints().addAll(story2row1, story2row2, story2row3, story2row4);
        story4Node.getColumnConstraints().addAll(story2col1, story2col2, story2col3, story2col4);

        // Create and set the new scene
        Scene newScene = new Scene(story4Node, 1280, 720);
        primaryStage.setScene(newScene);
         // Add key event listener for arrow keys to navigate scenes
         newScene.setOnKeyPressed(event -> {
            if (event.getCode() == KeyCode.RIGHT) {
                switchToNextScene6(primaryStage);//always the bigger number
            } else if (event.getCode() == KeyCode.LEFT) {
                switchToNextScene4(primaryStage);
            }
        });




    }   private void switchToNextScene6(Stage primaryStage) {
        GridPane story4Node = new GridPane();
           story4Node.setPadding(new Insets(20));
           story4Node.setHgap(10);
           story4Node.setVgap(10); 
   
           // Load and set the background image
           Image storyBackgroundImage = new Image(getClass().getResourceAsStream("/images/enriquehand.png"));
           BackgroundImage background = new BackgroundImage(storyBackgroundImage, BackgroundRepeat.NO_REPEAT,
                   BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, new BackgroundSize(1280, 720, true, true, false, true));
           story4Node.setBackground(new Background(background));
              // Create a Label for the speaker
        Label story2Speaker = new Label();
        story2Speaker.setText("Mr.Enriquez");
        story2Speaker.setStyle("-fx-text-fill: white; -fx-font-size: 250%; -fx-font-weight: bold;");
        
        story2Speaker.setAlignment(Pos.CENTER_LEFT);
        story2Speaker.setAlignment(Pos.CENTER_LEFT);

        // Create a Label for the story text
        Label story2Label = new Label();
        story2Label.setWrapText(true);
        story2Label.setMinWidth(1140);
        story2Label.setMaxWidth(1140);
        story2Label.setMinHeight(150);
        story2Label.setStyle("-fx-text-fill: black; -fx-font-size: 200%; -fx-background-color: rgba(255,255,255,0.7);");
        story2Label.setAlignment(Pos.CENTER_LEFT);

        // Create blank labels for spacing
        Label story2Blank = new Label();
        story2Blank.setMinWidth(100);
        story2Blank.setMinHeight(0);
        story2Blank.setStyle("-fx-background-color: transparent");

        Label story2Blank1 = new Label();
        story2Blank1.setMinWidth(0);
        story2Blank1.setMinHeight(100);
        story2Blank1.setStyle("-fx-background-color: rgba(255,255,255,0.7)");

        // Animation for text dialogue
        final String story2Content = "          Are you alright?";
        final int instantCharactersCount = 10; // Number of characters to show instantly

        final Animation story2Animation = new Transition() {
            {
                setCycleDuration(Duration.millis(3000)); // Total duration for the animated part
            }

            protected void interpolate(double frac) {
                int totalLength = story2Content.length();
                int remainingCharacters = totalLength - instantCharactersCount;
                if (remainingCharacters > 0) {
                    // Calculate the index of the last character to be shown for the current fraction
                    int index = instantCharactersCount + Math.round(remainingCharacters * (float) frac);
                    story2Label.setText(story2Content.substring(0, index));
            }else {
                // If the content is shorter than the number of instant characters, show it all instantly
                story2Label.setText(story2Content);
            }
        };
    };
        
        story2Animation.play();
     

        // Add elements to GridPane
        story4Node.add(story2Speaker, 2, 2);
        story4Node.add(story2Label, 2, 3);
        story4Node.add(story2Blank, 1, 2, 1, 1);
        story4Node.add(story2Blank1, 1, 3, 1, 1);

        // Define row and column constraints

        RowConstraints story2row1 = new RowConstraints();
        story2row1.setMinHeight(210);
        RowConstraints story2row2 = new RowConstraints();
        story2row2.setMinHeight(210);
        RowConstraints story2row3 = new RowConstraints();
        story2row3.setMinHeight(0);
        RowConstraints story2row4 = new RowConstraints();
        story2row4.setMinHeight(0);

        
        ColumnConstraints story2col1 = new ColumnConstraints();
        story2col1.setMinWidth(0); // Increase left margin
        ColumnConstraints story2col2 = new ColumnConstraints();
        story2col2.setMinWidth(20); // Spacer or small content
        ColumnConstraints story2col3 = new ColumnConstraints();
        story2col3.setMinWidth(800); // Increase width for main text content
        ColumnConstraints story2col4 = new ColumnConstraints();
        story2col4.setMinWidth(800); // Adjust right padding

    
        story4Node.getRowConstraints().addAll(story2row1, story2row2, story2row3, story2row4);
        story4Node.getColumnConstraints().addAll(story2col1, story2col2, story2col3, story2col4);

        // Create and set the new scene
        Scene newScene = new Scene(story4Node, 1280, 720);
        primaryStage.setScene(newScene);
         // Add key event listener for arrow keys to navigate scenes
         newScene.setOnKeyPressed(event -> {
            if (event.getCode() == KeyCode.RIGHT) {
                switchToNextScene7(primaryStage);//always the bigger number
            } else if (event.getCode() == KeyCode.LEFT) {
                switchToNextScene5(primaryStage);
            }
        });


        

    }   private void switchToNextScene7(Stage primaryStage) {
        GridPane story4Node = new GridPane();
           story4Node.setPadding(new Insets(20));
           story4Node.setHgap(10);
           story4Node.setVgap(10); 
   
           // Load and set the background image
           Image storyBackgroundImage = new Image(getClass().getResourceAsStream("/images/enriquehandstretch.png"));
           BackgroundImage background = new BackgroundImage(storyBackgroundImage, BackgroundRepeat.NO_REPEAT,
                   BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, new BackgroundSize(1280, 720, true, true, false, true));
           story4Node.setBackground(new Background(background));
              // Create a Label for the speaker
        Label story2Speaker = new Label();
        story2Speaker.setText("Mr.Enriquez");
        story2Speaker.setStyle("-fx-text-fill: white; -fx-font-size: 250%; -fx-font-weight: bold;");
        
        story2Speaker.setAlignment(Pos.CENTER_LEFT);
        story2Speaker.setAlignment(Pos.CENTER_LEFT);

        // Create a Label for the story text
        Label story2Label = new Label();
        story2Label.setWrapText(true);
        story2Label.setMinWidth(1140);
        story2Label.setMaxWidth(1140);
        story2Label.setMinHeight(150);
        story2Label.setStyle("-fx-text-fill: black; -fx-font-size: 200%; -fx-background-color: rgba(255,255,255,0.7);");
        story2Label.setAlignment(Pos.CENTER_LEFT);

        // Create blank labels for spacing
        Label story2Blank = new Label();
        story2Blank.setMinWidth(100);
        story2Blank.setMinHeight(0);
        story2Blank.setStyle("-fx-background-color: transparent");

        Label story2Blank1 = new Label();
        story2Blank1.setMinWidth(0);
        story2Blank1.setMinHeight(100);
        story2Blank1.setStyle("-fx-background-color: rgba(255,255,255,0.7)");

        // Animation for text dialogue
        final String story2Content = "          Here, let me help you up.";
        final int instantCharactersCount = 10; // Number of characters to show instantly

        final Animation story2Animation = new Transition() {
            {
                setCycleDuration(Duration.millis(3000)); // Total duration for the animated part
            }

            protected void interpolate(double frac) {
                int totalLength = story2Content.length();
                int remainingCharacters = totalLength - instantCharactersCount;
                if (remainingCharacters > 0) {
                    // Calculate the index of the last character to be shown for the current fraction
                    int index = instantCharactersCount + Math.round(remainingCharacters * (float) frac);
                    story2Label.setText(story2Content.substring(0, index));
            }else {
                // If the content is shorter than the number of instant characters, show it all instantly
                story2Label.setText(story2Content);
            }
        };
    };
        
        story2Animation.play();
     

        // Add elements to GridPane
        story4Node.add(story2Speaker, 2, 2);
        story4Node.add(story2Label, 2, 3);
        story4Node.add(story2Blank, 1, 2, 1, 1);
        story4Node.add(story2Blank1, 1, 3, 1, 1);

        // Define row and column constraints

        RowConstraints story2row1 = new RowConstraints();
        story2row1.setMinHeight(210);
        RowConstraints story2row2 = new RowConstraints();
        story2row2.setMinHeight(210);
        RowConstraints story2row3 = new RowConstraints();
        story2row3.setMinHeight(0);
        RowConstraints story2row4 = new RowConstraints();
        story2row4.setMinHeight(0);

        
        ColumnConstraints story2col1 = new ColumnConstraints();
        story2col1.setMinWidth(0); // Increase left margin
        ColumnConstraints story2col2 = new ColumnConstraints();
        story2col2.setMinWidth(20); // Spacer or small content
        ColumnConstraints story2col3 = new ColumnConstraints();
        story2col3.setMinWidth(800); // Increase width for main text content
        ColumnConstraints story2col4 = new ColumnConstraints();
        story2col4.setMinWidth(800); // Adjust right padding

    
        story4Node.getRowConstraints().addAll(story2row1, story2row2, story2row3, story2row4);
        story4Node.getColumnConstraints().addAll(story2col1, story2col2, story2col3, story2col4);

        // Create and set the new scene
        Scene newScene = new Scene(story4Node, 1280, 720);
        primaryStage.setScene(newScene);
         // Add key event listener for arrow keys to navigate scenes
         newScene.setOnKeyPressed(event -> {
            if (event.getCode() == KeyCode.RIGHT) {
                switchToNextScene8(primaryStage);//always the bigger number
            } else if (event.getCode() == KeyCode.LEFT) {
                switchToNextScene6(primaryStage);
            }
        });




    }  private void switchToNextScene8(Stage primaryStage) {
         // Initialize GridPane for the scene
    GridPane story7Node = new GridPane();

    // Define buttons
    Button story7Option1 = new Button("Take his hand <3");
    story7Option1.setStyle("-fx-background-color:white;-fx-text-fill:black;-fx-font-size:200%;-fx-border-width:3px;-fx-border-color:#554646;-fx-border-radius:3px");
    story7Option1.setFocusTraversable(false);
    story7Option1.setMinWidth(300);
    story7Option1.setMaxWidth(300);
    story7Option1.setMinHeight(100);

    Button story7Option2 = new Button("Reject it :(");
    story7Option2.setStyle("-fx-background-color:white;-fx-text-fill:black;-fx-font-size:200%;-fx-border-width:3px;-fx-border-color:#554646;-fx-border-radius:3px");
    story7Option2.setFocusTraversable(false);
    story7Option2.setMinWidth(300);
    story7Option2.setMaxWidth(300);
    story7Option2.setMinHeight(100);

    // Add buttons to GridPane
    story7Node.add(story7Option1, 2, 3);
    story7Node.add(story7Option2, 2, 5);

    // Set row and column constraints
    RowConstraints row1 = new RowConstraints();
    row1.setMinHeight(100);
    RowConstraints row2 = new RowConstraints();
    row2.setMinHeight(100);
    RowConstraints row3 = new RowConstraints();
    row3.setMinHeight(40);
    RowConstraints row4 = new RowConstraints();
    row4.setMinHeight(90);
    RowConstraints row5 = new RowConstraints();
    row5.setMinHeight(110);

    ColumnConstraints col1 = new ColumnConstraints();
    col1.setMinWidth(200);
    ColumnConstraints col2 = new ColumnConstraints();
    col2.setMinWidth(300);
    ColumnConstraints col3 = new ColumnConstraints();
    col3.setMinWidth(200);

    story7Node.getRowConstraints().addAll(row1, row2, row3, row4, row5);
    story7Node.getColumnConstraints().addAll(col1, col2, col3);

    // Set background image
    Image storyBackgroundImage = new Image(getClass().getResourceAsStream("/images/enriquehandstretch.png"));

   
    BackgroundImage background = new BackgroundImage(storyBackgroundImage, BackgroundRepeat.NO_REPEAT,
    BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, new BackgroundSize(1280, 720, true, true, false, true));
    story7Node.setBackground(new Background(background));

    // Create and set the new scene
    Scene newScene = new Scene(story7Node, 1280, 720);
        primaryStage.setScene(newScene);
    newScene.setOnKeyPressed(event->{
        if(event.getCode()==KeyCode.LEFT){
            switchToNextScene7(primaryStage);
        }
    });
    

    // Optionally add event handlers to buttons
    story7Option1.setOnAction(event->{
        switchToNextScene9(primaryStage);

    });

    story7Option2.setOnAction(event->{
        switchToNextScene10(primaryStage);

    });

}  


private void switchToNextScene9(Stage primaryStage) {
    //this the take hand scene
    GridPane story4Node = new GridPane();
           story4Node.setPadding(new Insets(20));
           story4Node.setHgap(10);
           story4Node.setVgap(10); 
   
           // Load and set the background image
           Image storyBackgroundImage = new Image(getClass().getResourceAsStream("/images/takehand.png"));
           BackgroundImage background = new BackgroundImage(storyBackgroundImage, BackgroundRepeat.NO_REPEAT,
                   BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, new BackgroundSize(1280, 720, true, true, false, true));
           story4Node.setBackground(new Background(background));
              // Create a Label for the speaker
        Label story2Speaker = new Label();
        story2Speaker.setText("???");
        story2Speaker.setStyle("-fx-text-fill: white; -fx-font-size: 250%; -fx-font-weight: bold;");
        
        story2Speaker.setAlignment(Pos.CENTER_LEFT);
        story2Speaker.setAlignment(Pos.CENTER_LEFT);

        // Create a Label for the story text
        Label story2Label = new Label();
        story2Label.setWrapText(true);
        story2Label.setMinWidth(1140);
        story2Label.setMaxWidth(1140);
        story2Label.setMinHeight(150);
        story2Label.setStyle("-fx-text-fill: black; -fx-font-size: 200%; -fx-background-color: rgba(255,255,255,0.7);");
        story2Label.setAlignment(Pos.CENTER_LEFT);

        // Create blank labels for spacing
        Label story2Blank = new Label();
        story2Blank.setMinWidth(100);
        story2Blank.setMinHeight(0);
        story2Blank.setStyle("-fx-background-color: transparent");

        Label story2Blank1 = new Label();
        story2Blank1.setMinWidth(0);
        story2Blank1.setMinHeight(100);
        story2Blank1.setStyle("-fx-background-color: rgba(255,255,255,0.7)");

        // Animation for text dialogue
        final String story2Content = "          S-Salamat.";
        final int instantCharactersCount = 10; // Number of characters to show instantly

        final Animation story2Animation = new Transition() {
            {
                setCycleDuration(Duration.millis(3000)); // Total duration for the animated part
            }

            protected void interpolate(double frac) {
                int totalLength = story2Content.length();
                int remainingCharacters = totalLength - instantCharactersCount;
                if (remainingCharacters > 0) {
                    // Calculate the index of the last character to be shown for the current fraction
                    int index = instantCharactersCount + Math.round(remainingCharacters * (float) frac);
                    story2Label.setText(story2Content.substring(0, index));
            }else {
                // If the content is shorter than the number of instant characters, show it all instantly
                story2Label.setText(story2Content);
            }
        };
    };
        
        story2Animation.play();
     

        // Add elements to GridPane
        story4Node.add(story2Speaker, 2, 2);
        story4Node.add(story2Label, 2, 3);
        story4Node.add(story2Blank, 1, 2, 1, 1);
        story4Node.add(story2Blank1, 1, 3, 1, 1);

        // Define row and column constraints

        RowConstraints story2row1 = new RowConstraints();
        story2row1.setMinHeight(210);
        RowConstraints story2row2 = new RowConstraints();
        story2row2.setMinHeight(210);
        RowConstraints story2row3 = new RowConstraints();
        story2row3.setMinHeight(0);
        RowConstraints story2row4 = new RowConstraints();
        story2row4.setMinHeight(0);

        
        ColumnConstraints story2col1 = new ColumnConstraints();
        story2col1.setMinWidth(0); // Increase left margin
        ColumnConstraints story2col2 = new ColumnConstraints();
        story2col2.setMinWidth(20); // Spacer or small content
        ColumnConstraints story2col3 = new ColumnConstraints();
        story2col3.setMinWidth(800); // Increase width for main text content
        ColumnConstraints story2col4 = new ColumnConstraints();
        story2col4.setMinWidth(800); // Adjust right padding

    
        story4Node.getRowConstraints().addAll(story2row1, story2row2, story2row3, story2row4);
        story4Node.getColumnConstraints().addAll(story2col1, story2col2, story2col3, story2col4);

        // Create and set the new scene
        Scene newScene = new Scene(story4Node, 1280, 720);
        primaryStage.setScene(newScene);
         // Add key event listener for arrow keys to navigate scenes
         newScene.setOnKeyPressed(event -> {
            if (event.getCode() == KeyCode.RIGHT) {
                switchToNextScene10(primaryStage);//always the bigger number
            } else if (event.getCode() == KeyCode.LEFT) {
                switchToNextScene8(primaryStage);
            }
        });

}
  
private void switchToNextScene10(Stage primaryStage) {
 
    GridPane story4Node = new GridPane();
           story4Node.setPadding(new Insets(20));
           story4Node.setHgap(10);
           story4Node.setVgap(10); 
   
           // Load and set the background image
           Image storyBackgroundImage = new Image(getClass().getResourceAsStream("/images/askenrique.png"));
           BackgroundImage background = new BackgroundImage(storyBackgroundImage, BackgroundRepeat.NO_REPEAT,
                   BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, new BackgroundSize(1280, 720, true, true, false, true));
           story4Node.setBackground(new Background(background));
              // Create a Label for the speaker
        Label story2Speaker = new Label();
        story2Speaker.setText("Mr.Enriquez");
        story2Speaker.setStyle("-fx-text-fill: white; -fx-font-size: 250%; -fx-font-weight: bold;");
        
        story2Speaker.setAlignment(Pos.CENTER_LEFT);
        story2Speaker.setAlignment(Pos.CENTER_LEFT);

        // Create a Label for the story text
        Label story2Label = new Label();
        story2Label.setWrapText(true);
        story2Label.setMinWidth(1140);
        story2Label.setMaxWidth(1140);
        story2Label.setMinHeight(150);
        story2Label.setStyle("-fx-text-fill: black; -fx-font-size: 200%; -fx-background-color: rgba(255,255,255,0.7);");
        story2Label.setAlignment(Pos.CENTER_LEFT);

        // Create blank labels for spacing
        Label story2Blank = new Label();
        story2Blank.setMinWidth(100);
        story2Blank.setMinHeight(0);
        story2Blank.setStyle("-fx-background-color: transparent");

        Label story2Blank1 = new Label();
        story2Blank1.setMinWidth(0);
        story2Blank1.setMinHeight(100);
        story2Blank1.setStyle("-fx-background-color: rgba(255,255,255,0.7)");

        // Animation for text dialogue
        final String story2Content = "         So… what do you think about the Calculus AP exams?";
        final int instantCharactersCount = 10; // Number of characters to show instantly

        final Animation story2Animation = new Transition() {
            {
                setCycleDuration(Duration.millis(3000)); // Total duration for the animated part
            }

            protected void interpolate(double frac) {
                int totalLength = story2Content.length();
                int remainingCharacters = totalLength - instantCharactersCount;
                if (remainingCharacters > 0) {
                    // Calculate the index of the last character to be shown for the current fraction
                    int index = instantCharactersCount + Math.round(remainingCharacters * (float) frac);
                    story2Label.setText(story2Content.substring(0, index));
            }else {
                // If the content is shorter than the number of instant characters, show it all instantly
                story2Label.setText(story2Content);
            }
        };};
        
        story2Animation.play();
     

        // Add elements to GridPane
        story4Node.add(story2Speaker, 2, 2);
        story4Node.add(story2Label, 2, 3);
        story4Node.add(story2Blank, 1, 2, 1, 1);
        story4Node.add(story2Blank1, 1, 3, 1, 1);

        // Define row and column constraints

        RowConstraints story2row1 = new RowConstraints();
        story2row1.setMinHeight(210);
        RowConstraints story2row2 = new RowConstraints();
        story2row2.setMinHeight(210);
        RowConstraints story2row3 = new RowConstraints();
        story2row3.setMinHeight(0);
        RowConstraints story2row4 = new RowConstraints();
        story2row4.setMinHeight(0);

        
        ColumnConstraints story2col1 = new ColumnConstraints();
        story2col1.setMinWidth(0); // Increase left margin
        ColumnConstraints story2col2 = new ColumnConstraints();
        story2col2.setMinWidth(20); // Spacer or small content
        ColumnConstraints story2col3 = new ColumnConstraints();
        story2col3.setMinWidth(800); // Increase width for main text content
        ColumnConstraints story2col4 = new ColumnConstraints();
        story2col4.setMinWidth(800); // Adjust right padding

    
        story4Node.getRowConstraints().addAll(story2row1, story2row2, story2row3, story2row4);
        story4Node.getColumnConstraints().addAll(story2col1, story2col2, story2col3, story2col4);

        // Create and set the new scene
        Scene newScene = new Scene(story4Node, 1280, 720);
        primaryStage.setScene(newScene);
         // Add key event listener for arrow keys to navigate scenes
         newScene.setOnKeyPressed(event -> {
            if (event.getCode() == KeyCode.RIGHT) {
                switchToNextScene11(primaryStage);//always the bigger number
            } else if (event.getCode() == KeyCode.LEFT) {
                switchToNextScene8(primaryStage);
            }
        });




    }private void switchToNextScene11(Stage primaryStage) {
    // Initialize GridPane for the scene
    GridPane story7Node = new GridPane();

    // Define buttons
    Button story7Option1 = new Button("Torture");
    story7Option1.setStyle("-fx-background-color:white;-fx-text-fill:black;-fx-font-size:200%;-fx-border-width:3px;-fx-border-color:#554646;-fx-border-radius:3px");
    story7Option1.setFocusTraversable(false);
    story7Option1.setMinWidth(300);
    story7Option1.setMaxWidth(300);
    story7Option1.setMinHeight(100);

    Button story7Option2 = new Button("Inequitable");
    story7Option2.setStyle("-fx-background-color:white;-fx-text-fill:black;-fx-font-size:200%;-fx-border-width:3px;-fx-border-color:#554646;-fx-border-radius:3px");
    story7Option2.setFocusTraversable(false);
    story7Option2.setMinWidth(300);
    story7Option2.setMaxWidth(300);
    story7Option2.setMinHeight(100);

    // Add buttons to GridPane
    story7Node.add(story7Option1, 2, 3);
    story7Node.add(story7Option2, 2, 5);

    // Set row and column constraints
    RowConstraints row1 = new RowConstraints();
    row1.setMinHeight(100);
    RowConstraints row2 = new RowConstraints();
    row2.setMinHeight(100);
    RowConstraints row3 = new RowConstraints();
    row3.setMinHeight(40);
    RowConstraints row4 = new RowConstraints();
    row4.setMinHeight(90);
    RowConstraints row5 = new RowConstraints();
    row5.setMinHeight(110);

    ColumnConstraints col1 = new ColumnConstraints();
    col1.setMinWidth(200);
    ColumnConstraints col2 = new ColumnConstraints();
    col2.setMinWidth(300);
    ColumnConstraints col3 = new ColumnConstraints();
    col3.setMinWidth(200);

    story7Node.getRowConstraints().addAll(row1, row2, row3, row4, row5);
    story7Node.getColumnConstraints().addAll(col1, col2, col3);

    // Set background image
    Image storyBackgroundImage = new Image(getClass().getResourceAsStream("/images/soromanticwoohoo.png"));

   
    BackgroundImage background = new BackgroundImage(storyBackgroundImage, BackgroundRepeat.NO_REPEAT,
    BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, new BackgroundSize(1280, 720, true, true, false, true));
    story7Node.setBackground(new Background(background));

    // Create and set the new scene
    Scene newScene = new Scene(story7Node, 1280, 720);
        primaryStage.setScene(newScene);
    newScene.setOnKeyPressed(event->{
        if(event.getCode()==KeyCode.LEFT){
            switchToNextScene10(primaryStage);
        }
    });
    

    // Optionally add event handlers to buttons
    story7Option1.setOnAction(event->{
        switchToNextScene12(primaryStage); 

    });

    story7Option2.setOnAction(event->{
        switchToNextScene13(primaryStage); 

    });


}  
private void switchToNextScene12(Stage primaryStage) {
    GridPane story4Node = new GridPane();
    story4Node.setPadding(new Insets(20));
    story4Node.setHgap(10);
    story4Node.setVgap(10); 

    // Load and set the background image
    Image storyBackgroundImage = new Image(getClass().getResourceAsStream("/images/listeningenrique.png"));
    BackgroundImage background = new BackgroundImage(storyBackgroundImage, BackgroundRepeat.NO_REPEAT,
            BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, new BackgroundSize(1280, 720, true, true, false, true));
    story4Node.setBackground(new Background(background));
       // Create a Label for the speaker
    Label story2Speaker = new Label();
    story2Speaker.setText("???");
    story2Speaker.setStyle("-fx-text-fill: white; -fx-font-size: 250%; -fx-font-weight: bold;");
    
    story2Speaker.setAlignment(Pos.CENTER_LEFT);
    story2Speaker.setAlignment(Pos.CENTER_LEFT);

    // Create a Label for the story text
    Label story2Label = new Label();
    story2Label.setWrapText(true);
    story2Label.setMinWidth(1140);
    story2Label.setMaxWidth(1140);
    story2Label.setMinHeight(150);
    story2Label.setStyle("-fx-text-fill: black; -fx-font-size: 200%; -fx-background-color: rgba(255,255,255,0.7);");
    story2Label.setAlignment(Pos.CENTER_LEFT);

    // Create blank labels for spacing
    Label story2Blank = new Label();
    story2Blank.setMinWidth(100);
    story2Blank.setMinHeight(0);
    story2Blank.setStyle("-fx-background-color: transparent");

    Label story2Blank1 = new Label();
    story2Blank1.setMinWidth(0);
    story2Blank1.setMinHeight(100);
    story2Blank1.setStyle("-fx-background-color: rgba(255,255,255,0.7)");

    // Animation for text dialogue
    final String story2Content = "         They are a great way to torture students.";
    final int instantCharactersCount = 10; // Number of characters to show instantly

    final Animation story2Animation = new Transition() {
        {
            setCycleDuration(Duration.millis(3000)); // Total duration for the animated part
        }

        protected void interpolate(double frac) {
            int totalLength = story2Content.length();
            int remainingCharacters = totalLength - instantCharactersCount;
            if (remainingCharacters > 0) {
                // Calculate the index of the last character to be shown for the current fraction
                int index = instantCharactersCount + Math.round(remainingCharacters * (float) frac);
                story2Label.setText(story2Content.substring(0, index));
        }else {
            // If the content is shorter than the number of instant characters, show it all instantly
            story2Label.setText(story2Content);
        }
    };};
    
    story2Animation.play();


    // Add elements to GridPane
    story4Node.add(story2Speaker, 2, 2);
    story4Node.add(story2Label, 2, 3);
    story4Node.add(story2Blank, 1, 2, 1, 1);
    story4Node.add(story2Blank1, 1, 3, 1, 1);

    // Define row and column constraints

    RowConstraints story2row1 = new RowConstraints();
    story2row1.setMinHeight(210);
    RowConstraints story2row2 = new RowConstraints();
    story2row2.setMinHeight(210);
    RowConstraints story2row3 = new RowConstraints();
    story2row3.setMinHeight(0);
    RowConstraints story2row4 = new RowConstraints();
    story2row4.setMinHeight(0);

    
    ColumnConstraints story2col1 = new ColumnConstraints();
    story2col1.setMinWidth(0); // Increase left margin
    ColumnConstraints story2col2 = new ColumnConstraints();
    story2col2.setMinWidth(20); // Spacer or small content
    ColumnConstraints story2col3 = new ColumnConstraints();
    story2col3.setMinWidth(800); // Increase width for main text content
    ColumnConstraints story2col4 = new ColumnConstraints();
    story2col4.setMinWidth(800); // Adjust right padding


    story4Node.getRowConstraints().addAll(story2row1, story2row2, story2row3, story2row4);
    story4Node.getColumnConstraints().addAll(story2col1, story2col2, story2col3, story2col4);

    // Create and set the new scene
    Scene newScene = new Scene(story4Node, 1280, 720);
    primaryStage.setScene(newScene);
    // Add key event listener for arrow keys to navigate scenes
    newScene.setOnKeyPressed(event -> {
        if (event.getCode() == KeyCode.RIGHT) {
            switchToNextScene14(primaryStage);//always the bigger number
        } 
    });
    }



    private void switchToNextScene13(Stage primaryStage) {
        GridPane story4Node = new GridPane();
        story4Node.setPadding(new Insets(20));
        story4Node.setHgap(10);
        story4Node.setVgap(10); 
    
        // Load and set the background image
        Image storyBackgroundImage = new Image(getClass().getResourceAsStream("/images/listeningenrique.png"));
        BackgroundImage background = new BackgroundImage(storyBackgroundImage, BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, new BackgroundSize(1280, 720, true, true, false, true));
        story4Node.setBackground(new Background(background));
           // Create a Label for the speaker
        Label story2Speaker = new Label();
        story2Speaker.setText("???");
        story2Speaker.setStyle("-fx-text-fill: white; -fx-font-size: 250%; -fx-font-weight: bold;");
        
        story2Speaker.setAlignment(Pos.CENTER_LEFT);
        story2Speaker.setAlignment(Pos.CENTER_LEFT);
    
        // Create a Label for the story text
        Label story2Label = new Label();
        story2Label.setWrapText(true);
        story2Label.setMinWidth(1140);
        story2Label.setMaxWidth(1140);
        story2Label.setMinHeight(150);
        story2Label.setStyle("-fx-text-fill: black; -fx-font-size: 200%; -fx-background-color: rgba(255,255,255,0.7);");
        story2Label.setAlignment(Pos.CENTER_LEFT);
    
        // Create blank labels for spacing
        Label story2Blank = new Label();
        story2Blank.setMinWidth(100);
        story2Blank.setMinHeight(0);
        story2Blank.setStyle("-fx-background-color: transparent");
    
        Label story2Blank1 = new Label();
        story2Blank1.setMinWidth(0);
        story2Blank1.setMinHeight(100);
        story2Blank1.setStyle("-fx-background-color: rgba(255,255,255,0.7)");
    
        // Animation for text dialogue
        final String story2Content = "         It is to a certain extent, inequitable in comparison to other STEM AP exams " + //
                        "due to the fact that other APs allow formula sheets while one the contrary," + //
                        " AP calculus, for some unknown reason, forces students to memorize the formulas instead." ;
        final int instantCharactersCount = 10; // Number of characters to show instantly
    
        final Animation story2Animation = new Transition() {
            {
                setCycleDuration(Duration.millis(3000)); // Total duration for the animated part
            }
    
            protected void interpolate(double frac) {
                int totalLength = story2Content.length();
                int remainingCharacters = totalLength - instantCharactersCount;
                if (remainingCharacters > 0) {
                    // Calculate the index of the last character to be shown for the current fraction
                    int index = instantCharactersCount + Math.round(remainingCharacters * (float) frac);
                    story2Label.setText(story2Content.substring(0, index));
            }else {
                // If the content is shorter than the number of instant characters, show it all instantly
                story2Label.setText(story2Content);
            }
        };};
        
        story2Animation.play();
    
    
        // Add elements to GridPane
        story4Node.add(story2Speaker, 2, 2);
        story4Node.add(story2Label, 2, 3);
        story4Node.add(story2Blank, 1, 2, 1, 1);
        story4Node.add(story2Blank1, 1, 3, 1, 1);
    
        // Define row and column constraints
    
        RowConstraints story2row1 = new RowConstraints();
        story2row1.setMinHeight(210);
        RowConstraints story2row2 = new RowConstraints();
        story2row2.setMinHeight(210);
        RowConstraints story2row3 = new RowConstraints();
        story2row3.setMinHeight(0);
        RowConstraints story2row4 = new RowConstraints();
        story2row4.setMinHeight(0);
    
        
        ColumnConstraints story2col1 = new ColumnConstraints();
        story2col1.setMinWidth(0); // Increase left margin
        ColumnConstraints story2col2 = new ColumnConstraints();
        story2col2.setMinWidth(20); // Spacer or small content
        ColumnConstraints story2col3 = new ColumnConstraints();
        story2col3.setMinWidth(800); // Increase width for main text content
        ColumnConstraints story2col4 = new ColumnConstraints();
        story2col4.setMinWidth(800); // Adjust right padding
    
    
        story4Node.getRowConstraints().addAll(story2row1, story2row2, story2row3, story2row4);
        story4Node.getColumnConstraints().addAll(story2col1, story2col2, story2col3, story2col4);
    
        // Create and set the new scene
        Scene newScene = new Scene(story4Node, 1280, 720);
        primaryStage.setScene(newScene);
        // Add key event listener for arrow keys to navigate scenes
        newScene.setOnKeyPressed(event -> {
            if (event.getCode() == KeyCode.RIGHT) {
                switchToNextScene14(primaryStage);//always the bigger number
            } else if (event.getCode() == KeyCode.LEFT) {
                switchToNextScene12(primaryStage);
            }
        });
        }
 
 
 
        private void switchToNextScene14(Stage primaryStage) { //haha you funny
        GridPane story4Node = new GridPane();
        story4Node.setPadding(new Insets(20));
        story4Node.setHgap(10);
        story4Node.setVgap(10); 
    
        // Load and set the background image
        Image storyBackgroundImage = new Image(getClass().getResourceAsStream("/images/enriquelaugh.png"));
        BackgroundImage background = new BackgroundImage(storyBackgroundImage, BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, new BackgroundSize(1280, 720, true, true, false, true));
        story4Node.setBackground(new Background(background));
           // Create a Label for the speaker
        Label story2Speaker = new Label();
        story2Speaker.setText("Mr. Enriquez");
        story2Speaker.setStyle("-fx-text-fill: white; -fx-font-size: 250%; -fx-font-weight: bold;");
        
        story2Speaker.setAlignment(Pos.CENTER_LEFT);
        story2Speaker.setAlignment(Pos.CENTER_LEFT);
    
        // Create a Label for the story text
        Label story2Label = new Label();
        story2Label.setWrapText(true);
        story2Label.setMinWidth(1140);
        story2Label.setMaxWidth(1140);
        story2Label.setMinHeight(150);
        story2Label.setStyle("-fx-text-fill: black; -fx-font-size: 200%; -fx-background-color: rgba(255,255,255,0.7);");
        story2Label.setAlignment(Pos.CENTER_LEFT);
    
        // Create blank labels for spacing
        Label story2Blank = new Label();
        story2Blank.setMinWidth(100);
        story2Blank.setMinHeight(0);
        story2Blank.setStyle("-fx-background-color: transparent");
    
        Label story2Blank1 = new Label();
        story2Blank1.setMinWidth(0);
        story2Blank1.setMinHeight(100);
        story2Blank1.setStyle("-fx-background-color: rgba(255,255,255,0.7)");
    
        // Animation for text dialogue
        final String story2Content = "           Haha! You're pretty funny!";
        final int instantCharactersCount = 10; // Number of characters to show instantly
    
        final Animation story2Animation = new Transition() {
            {
                setCycleDuration(Duration.millis(3000)); // Total duration for the animated part
            }
    
            protected void interpolate(double frac) {
                int totalLength = story2Content.length();
                int remainingCharacters = totalLength - instantCharactersCount;
                if (remainingCharacters > 0) {
                    // Calculate the index of the last character to be shown for the current fraction
                    int index = instantCharactersCount + Math.round(remainingCharacters * (float) frac);
                    story2Label.setText(story2Content.substring(0, index));
            }else {
                // If the content is shorter than the number of instant characters, show it all instantly
                story2Label.setText(story2Content);
            }
        };};
        
        story2Animation.play();
    
    
        // Add elements to GridPane
        story4Node.add(story2Speaker, 2, 2);
        story4Node.add(story2Label, 2, 3);
        story4Node.add(story2Blank, 1, 2, 1, 1);
        story4Node.add(story2Blank1, 1, 3, 1, 1);
    
        // Define row and column constraints
    
        RowConstraints story2row1 = new RowConstraints();
        story2row1.setMinHeight(210);
        RowConstraints story2row2 = new RowConstraints();
        story2row2.setMinHeight(210);
        RowConstraints story2row3 = new RowConstraints();
        story2row3.setMinHeight(0);
        RowConstraints story2row4 = new RowConstraints();
        story2row4.setMinHeight(0);
    
        
        ColumnConstraints story2col1 = new ColumnConstraints();
        story2col1.setMinWidth(0); // Increase left margin
        ColumnConstraints story2col2 = new ColumnConstraints();
        story2col2.setMinWidth(20); // Spacer or small content
        ColumnConstraints story2col3 = new ColumnConstraints();
        story2col3.setMinWidth(800); // Increase width for main text content
        ColumnConstraints story2col4 = new ColumnConstraints();
        story2col4.setMinWidth(800); // Adjust right padding
    
    
        story4Node.getRowConstraints().addAll(story2row1, story2row2, story2row3, story2row4);
        story4Node.getColumnConstraints().addAll(story2col1, story2col2, story2col3, story2col4);
    
        // Create and set the new scene
        Scene newScene = new Scene(story4Node, 1280, 720);
        primaryStage.setScene(newScene);
        // Add key event listener for arrow keys to navigate scenes
        newScene.setOnKeyPressed(event -> {
            if (event.getCode() == KeyCode.RIGHT) {
                switchToNextScene15(primaryStage);//always the bigger number
            } else if (event.getCode() == KeyCode.LEFT) {
                switchToNextScene11(primaryStage);
            }
        });



    }  private void switchToNextScene15(Stage primaryStage) { //calculus
        GridPane story4Node = new GridPane();
        story4Node.setPadding(new Insets(20));
        story4Node.setHgap(10);
        story4Node.setVgap(10); 
    
        // Load and set the background image
        Image storyBackgroundImage = new Image(getClass().getResourceAsStream("/images/askenrique.png"));
        BackgroundImage background = new BackgroundImage(storyBackgroundImage, BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, new BackgroundSize(1280, 720, true, true, false, true));
        story4Node.setBackground(new Background(background));
           // Create a Label for the speaker
        Label story2Speaker = new Label();
        story2Speaker.setText("Mr. Enriquez");
        story2Speaker.setStyle("-fx-text-fill: white; -fx-font-size: 250%; -fx-font-weight: bold;");
        
        story2Speaker.setAlignment(Pos.CENTER_LEFT);
        story2Speaker.setAlignment(Pos.CENTER_LEFT);
    
        // Create a Label for the story text
        Label story2Label = new Label();
        story2Label.setWrapText(true);
        story2Label.setMinWidth(1140);
        story2Label.setMaxWidth(1140);
        story2Label.setMinHeight(150);
        story2Label.setStyle("-fx-text-fill: black; -fx-font-size: 200%; -fx-background-color: rgba(255,255,255,0.7);");
        story2Label.setAlignment(Pos.CENTER_LEFT);
    
        // Create blank labels for spacing
        Label story2Blank = new Label();
        story2Blank.setMinWidth(100);
        story2Blank.setMinHeight(0);
        story2Blank.setStyle("-fx-background-color: transparent");
    
        Label story2Blank1 = new Label();
        story2Blank1.setMinWidth(0);
        story2Blank1.setMinHeight(100);
        story2Blank1.setStyle("-fx-background-color: rgba(255,255,255,0.7)");
    
        // Animation for text dialogue
        final String story2Content = "           Anyways, I lost my answer sheet for my recent worksheets. Can you help me with some Calculus, please?";
        final int instantCharactersCount = 10; // Number of characters to show instantly
    
        final Animation story2Animation = new Transition() {
            {
                setCycleDuration(Duration.millis(3000)); // Total duration for the animated part
            }
    
            protected void interpolate(double frac) {
                int totalLength = story2Content.length();
                int remainingCharacters = totalLength - instantCharactersCount;
                if (remainingCharacters > 0) {
                    // Calculate the index of the last character to be shown for the current fraction
                    int index = instantCharactersCount + Math.round(remainingCharacters * (float) frac);
                    story2Label.setText(story2Content.substring(0, index));
            }else {
                // If the content is shorter than the number of instant characters, show it all instantly
                story2Label.setText(story2Content);
            }
        };};
        
        story2Animation.play();
    
    
        // Add elements to GridPane
        story4Node.add(story2Speaker, 2, 2);
        story4Node.add(story2Label, 2, 3);
        story4Node.add(story2Blank, 1, 2, 1, 1);
        story4Node.add(story2Blank1, 1, 3, 1, 1);
    
        // Define row and column constraints
    
        RowConstraints story2row1 = new RowConstraints();
        story2row1.setMinHeight(210);
        RowConstraints story2row2 = new RowConstraints();
        story2row2.setMinHeight(210);
        RowConstraints story2row3 = new RowConstraints();
        story2row3.setMinHeight(0);
        RowConstraints story2row4 = new RowConstraints();
        story2row4.setMinHeight(0);
    
        
        ColumnConstraints story2col1 = new ColumnConstraints();
        story2col1.setMinWidth(0); // Increase left margin
        ColumnConstraints story2col2 = new ColumnConstraints();
        story2col2.setMinWidth(20); // Spacer or small content
        ColumnConstraints story2col3 = new ColumnConstraints();
        story2col3.setMinWidth(800); // Increase width for main text content
        ColumnConstraints story2col4 = new ColumnConstraints();
        story2col4.setMinWidth(800); // Adjust right padding
    
    
        story4Node.getRowConstraints().addAll(story2row1, story2row2, story2row3, story2row4);
        story4Node.getColumnConstraints().addAll(story2col1, story2col2, story2col3, story2col4);
    
        // Create and set the new scene
        Scene newScene = new Scene(story4Node, 1280, 720);
        primaryStage.setScene(newScene);
        // Add key event listener for arrow keys to navigate scenes
        newScene.setOnKeyPressed(event -> {
            if (event.getCode() == KeyCode.RIGHT) {
                switchToNextScene16(primaryStage);//always the bigger number
            } else if (event.getCode() == KeyCode.LEFT) {
                switchToNextScene14(primaryStage);
            }
        });
        
    }

        private void switchToNextScene16(Stage primaryStage) { // calculus
            GridPane story16Node = new GridPane();
            
            // Load and set the background image
            Image storyBackgroundImage = new Image(getClass().getResourceAsStream("/images/paper.png"));
            BackgroundImage background = new BackgroundImage(storyBackgroundImage, BackgroundRepeat.NO_REPEAT,
                    BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, new BackgroundSize(1280, 720, true, true, false, true));
            story16Node.setBackground(new Background(background));
        
            // Create the question label
            Label story16Question = new Label("What is the derivative of 12x^2 + 5x^2?");
            story16Question.setMinWidth(700);
            story16Question.setMaxWidth(700);
            story16Question.setMinHeight(60);
            story16Question.setMaxHeight(60);
            story16Question.setStyle("-fx-background-color:transparent;-fx-font-size:200%;-fx-text-fill:black;-fx-font-weight:bold;");
            story16Question.setAlignment(Pos.CENTER);
        
            // Create the feedback label
            Label story16Label = new Label("");
            story16Label.setMinWidth(700);
            story16Label.setMaxWidth(700);
            story16Label.setMinHeight(40);
            story16Label.setMaxHeight(40);
            story16Label.setStyle("-fx-text-fill:black;-fx-font-size:200%;-fx-background-color:transparent");
            story16Label.setAlignment(Pos.BOTTOM_CENTER); // Align at the bottom center
        
            // Define buttons for answer options
            Button story16Button1 = new Button("            a) 24x^2 + 20x^2");
            Button story16Button2 = new Button("            b) 36x^2 + 3x^2");
            Button story16Button3 = new Button("            c) 24x + 10x");
        
            // Styling buttons
            String buttonStyle = "-fx-background-color:transparent;-fx-font-size:200%;-fx-border-width:1px";
            story16Button1.setStyle(buttonStyle);
            story16Button2.setStyle(buttonStyle);
            story16Button3.setStyle(buttonStyle);
        
            story16Button1.setFocusTraversable(false);
            story16Button2.setFocusTraversable(false);
            story16Button3.setFocusTraversable(false);
        
            story16Button1.setMinSize(500, 150);
            story16Button2.setMinSize(500, 150);
            story16Button3.setMinSize(500, 150);
        
            story16Button1.setMaxSize(500, 150);
            story16Button2.setMaxSize(500, 150);
            story16Button3.setMaxSize(500, 150);
        
            story16Button1.setAlignment(Pos.CENTER);
            story16Button2.setAlignment(Pos.CENTER);
            story16Button3.setAlignment(Pos.CENTER);
        
            // Set up the animation for wrong answers
            final Animation story16Animation = new Transition() {
                final String story16Content = "Try double-checking your coefficients!";
                {
                    setCycleDuration(Duration.millis(4000));
                }
        
                protected void interpolate(double frac) {
                    final int story16Length = story16Content.length();
                    final int story16N = Math.round(story16Length * (float) frac);
                    story16Label.setText(story16Content.substring(0, story16N));
                }
            };
        
            // Event handlers for buttons
            story16Button1.setOnAction(event -> {
                // Incorrect answer
                story16Animation.playFromStart();
            });
        
            story16Button2.setOnAction(event -> {
                // Incorrect answer
                story16Animation.playFromStart();
            });
        
            story16Button3.setOnAction(event -> {
                // Correct answer - move to the next scene
                switchToNextScene17(primaryStage); 
            });
        
            // Add components to the GridPane
            story16Node.add(story16Question, 1, 1, 1, 1);
            story16Node.add(story16Button1, 1, 2);
            story16Node.add(story16Button2, 1, 3);
            story16Node.add(story16Button3, 1, 4);
            story16Node.add(story16Label, 1, 5, 1, 1); // Add the feedback label to the last row
        
            // Set row and column constraints
            story16Node.getRowConstraints().addAll(
                new RowConstraints(70),  // Question
                new RowConstraints(150), // Button 1
                new RowConstraints(150), // Button 2
                new RowConstraints(150), // Button 3
                new RowConstraints(60)   // Feedback Label
            );
        
            story16Node.getColumnConstraints().addAll(
                new ColumnConstraints(270, 270, 270, Priority.ALWAYS, HPos.CENTER, true), // center column
                new ColumnConstraints(500) // make this larger to push elements to center
            );
        
            // Create and set the scene
            Scene story16Scene = new Scene(story16Node, 1280, 720);
            primaryStage.setScene(story16Scene);
            primaryStage.show();
        }



        private void switchToNextScene17(Stage primaryStage) { // calculus
            GridPane story16Node = new GridPane();
            
            // Load and set the background image
            Image storyBackgroundImage = new Image(getClass().getResourceAsStream("/images/paper.png"));
            BackgroundImage background = new BackgroundImage(storyBackgroundImage, BackgroundRepeat.NO_REPEAT,
                    BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, new BackgroundSize(1280, 720, true, true, false, true));
            story16Node.setBackground(new Background(background));
        
            // Create the question label
            Label story16Question = new Label("If f(x) = sec x + csc x, then f'(x) = ");
            story16Question.setMinWidth(700);
            story16Question.setMaxWidth(700);
            story16Question.setMinHeight(60);
            story16Question.setMaxHeight(60);
            story16Question.setStyle("-fx-background-color:transparent;-fx-font-size:200%;-fx-text-fill:black;-fx-font-weight:bold;");
            story16Question.setAlignment(Pos.CENTER);
        
            // Create the feedback label
            Label story16Label = new Label("");
            story16Label.setMinWidth(700);
            story16Label.setMaxWidth(700);
            story16Label.setMinHeight(40);
            story16Label.setMaxHeight(40);
            story16Label.setStyle("-fx-text-fill:black;-fx-font-size:200%;-fx-background-color:transparent");
            story16Label.setAlignment(Pos.BOTTOM_CENTER); // Align at the bottom center
        
            // Define buttons for answer options
            Button story16Button1 = new Button("            a) sec x(tan x) - csc x(cot x)");
            Button story16Button2 = new Button("            b) sec x(tan x) + csc x(cot x)");
            Button story16Button3 = new Button("            c) csc x - sec x");
        
            // Styling buttons
            String buttonStyle = "-fx-background-color:transparent;-fx-font-size:200%;-fx-border-width:1px";
            story16Button1.setStyle(buttonStyle);
            story16Button2.setStyle(buttonStyle);
            story16Button3.setStyle(buttonStyle);
        
            story16Button1.setFocusTraversable(false);
            story16Button2.setFocusTraversable(false);
            story16Button3.setFocusTraversable(false);
        
            story16Button1.setMinSize(500, 150);
            story16Button2.setMinSize(500, 150);
            story16Button3.setMinSize(500, 150);
        
            story16Button1.setMaxSize(500, 150);
            story16Button2.setMaxSize(500, 150);
            story16Button3.setMaxSize(500, 150);
        
            story16Button1.setAlignment(Pos.CENTER);
            story16Button2.setAlignment(Pos.CENTER);
            story16Button3.setAlignment(Pos.CENTER);
        
            // Set up the animation for wrong answers
            final Animation story16Animation = new Transition() {
                final String story16Content = "Do you know your trig derivatives?";
                {
                    setCycleDuration(Duration.millis(4000));
                }
        
                protected void interpolate(double frac) {
                    final int story16Length = story16Content.length();
                    final int story16N = Math.round(story16Length * (float) frac);
                    story16Label.setText(story16Content.substring(0, story16N));
                }
            };
        
            // Event handlers for buttons 
            //a is correct so
            story16Button1.setOnAction(event -> {
                switchToNextScene18(primaryStage); 
               
                
            });
        
            story16Button2.setOnAction(event -> {
                // Incorrect answer
                story16Animation.playFromStart();
            });
        
            story16Button3.setOnAction(event -> {
                // Correct answer - move to the next scene
                story16Animation.playFromStart();
            });
        
            // Add components to the GridPane
            story16Node.add(story16Question, 1, 1, 1, 1);
            story16Node.add(story16Button1, 1, 2);
            story16Node.add(story16Button2, 1, 3);
            story16Node.add(story16Button3, 1, 4);
            story16Node.add(story16Label, 1, 5, 1, 1); // Add the feedback label to the last row
        
            // Set row and column constraints
            story16Node.getRowConstraints().addAll(
                new RowConstraints(70),  // Question
                new RowConstraints(150), // Button 1
                new RowConstraints(150), // Button 2
                new RowConstraints(150), // Button 3
                new RowConstraints(60)   // Feedback Label
            );
        
            story16Node.getColumnConstraints().addAll(
                new ColumnConstraints(270, 270, 270, Priority.ALWAYS, HPos.CENTER, true), // center column
                new ColumnConstraints(500) // make this larger to push elements to center
            );
        
            // Create and set the scene
            Scene story16Scene = new Scene(story16Node, 1280, 720);
            primaryStage.setScene(story16Scene);
            primaryStage.show();
        }



        private void switchToNextScene18(Stage primaryStage) { // calculus
            GridPane story16Node = new GridPane();
            
            // Load and set the background image
            Image storyBackgroundImage = new Image(getClass().getResourceAsStream("/images/paper.png"));
            BackgroundImage background = new BackgroundImage(storyBackgroundImage, BackgroundRepeat.NO_REPEAT,
                    BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, new BackgroundSize(1280, 720, true, true, false, true));
            story16Node.setBackground(new Background(background));
        
            // Create the question label
            Label story16Question = new Label("Differentiate (6x^2 + 7x)^4");
            story16Question.setMinWidth(700);
            story16Question.setMaxWidth(700);
            story16Question.setMinHeight(60);
            story16Question.setMaxHeight(60);
            story16Question.setStyle("-fx-background-color:transparent;-fx-font-size:200%;-fx-text-fill:black;-fx-font-weight:bold;");
            story16Question.setAlignment(Pos.CENTER);
        
            // Create the feedback label
            Label story16Label = new Label("");
            story16Label.setMinWidth(700);
            story16Label.setMaxWidth(700);
            story16Label.setMinHeight(40);
            story16Label.setMaxHeight(40);
            story16Label.setStyle("-fx-text-fill:black;-fx-font-size:200%;-fx-background-color:transparent");
            story16Label.setAlignment(Pos.BOTTOM_CENTER); // Align at the bottom center
        
            // Define buttons for answer options
            Button story16Button1 = new Button("            a) 4(24x+7)(2x^2+7x)^1");
            Button story16Button2 = new Button("            b) 4(12x+7)(6x^2+7x)^3");
            Button story16Button3 = new Button("            c) 8(12x+7)(6x^2+7x)^4");
        
            // Styling buttons
            String buttonStyle = "-fx-background-color:transparent;-fx-font-size:200%;-fx-border-width:1px";
            story16Button1.setStyle(buttonStyle);
            story16Button2.setStyle(buttonStyle);
            story16Button3.setStyle(buttonStyle);
        
            story16Button1.setFocusTraversable(false);
            story16Button2.setFocusTraversable(false);
            story16Button3.setFocusTraversable(false);
        
            story16Button1.setMinSize(500, 150);
            story16Button2.setMinSize(500, 150);
            story16Button3.setMinSize(500, 150);
        
            story16Button1.setMaxSize(500, 150);
            story16Button2.setMaxSize(500, 150);
            story16Button3.setMaxSize(500, 150);
        
            story16Button1.setAlignment(Pos.CENTER);
            story16Button2.setAlignment(Pos.CENTER);
            story16Button3.setAlignment(Pos.CENTER);
        
            // Set up the animation for wrong answers
            final Animation story16Animation = new Transition() {
                final String story16Content = "Try double-checking your coefficients!";
                {
                    setCycleDuration(Duration.millis(4000));
                }
        
                protected void interpolate(double frac) {
                    final int story16Length = story16Content.length();
                    final int story16N = Math.round(story16Length * (float) frac);
                    story16Label.setText(story16Content.substring(0, story16N));
                }
            };
        
            // Event handlers for buttons 
            //a is correct so
            story16Button1.setOnAction(event -> {
                story16Animation.playFromStart();
               
                
            });
        
            story16Button2.setOnAction(event -> {
                switchToNextScene19(primaryStage); 
                // Incorrect answer
                
            });
        
            story16Button3.setOnAction(event -> {
                // Correct answer - move to the next scene
                story16Animation.playFromStart();
            });
        
            // Add components to the GridPane
            story16Node.add(story16Question, 1, 1, 1, 1);
            story16Node.add(story16Button1, 1, 2);
            story16Node.add(story16Button2, 1, 3);
            story16Node.add(story16Button3, 1, 4);
            story16Node.add(story16Label, 1, 5, 1, 1); // Add the feedback label to the last row
        
            // Set row and column constraints
            story16Node.getRowConstraints().addAll(
                new RowConstraints(70),  // Question
                new RowConstraints(150), // Button 1
                new RowConstraints(150), // Button 2
                new RowConstraints(150), // Button 3
                new RowConstraints(60)   // Feedback Label
            );
        
            story16Node.getColumnConstraints().addAll(
                new ColumnConstraints(270, 270, 270, Priority.ALWAYS, HPos.CENTER, true), // center column
                new ColumnConstraints(500) // make this larger to push elements to center
            );
        
            // Create and set the scene
            Scene story16Scene = new Scene(story16Node, 1280, 720);
            primaryStage.setScene(story16Scene);
            primaryStage.show();
        }


                
        private void switchToNextScene19(Stage primaryStage) { // back to normal
            GridPane story4Node = new GridPane();
            story4Node.setPadding(new Insets(20));
            story4Node.setHgap(10);
            story4Node.setVgap(10); 
        
            // Load and set the background image
            Image storyBackgroundImage = new Image(getClass().getResourceAsStream("/images/enriquelaugh.png"));
            BackgroundImage background = new BackgroundImage(storyBackgroundImage, BackgroundRepeat.NO_REPEAT,
                    BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, new BackgroundSize(1280, 720, true, true, false, true));
            story4Node.setBackground(new Background(background));
               // Create a Label for the speaker
            Label story2Speaker = new Label();
            story2Speaker.setText("Mr. Enriquez");
            story2Speaker.setStyle("-fx-text-fill: white; -fx-font-size: 250%; -fx-font-weight: bold;");
            
            story2Speaker.setAlignment(Pos.CENTER_LEFT);
            story2Speaker.setAlignment(Pos.CENTER_LEFT);
        
            // Create a Label for the story text
            Label story2Label = new Label();
            story2Label.setWrapText(true);
            story2Label.setMinWidth(1140);
            story2Label.setMaxWidth(1140);
            story2Label.setMinHeight(150);
            story2Label.setStyle("-fx-text-fill: black; -fx-font-size: 200%; -fx-background-color: rgba(255,255,255,0.7);");
            story2Label.setAlignment(Pos.CENTER_LEFT);
        
            // Create blank labels for spacing
            Label story2Blank = new Label();
            story2Blank.setMinWidth(100);
            story2Blank.setMinHeight(0);
            story2Blank.setStyle("-fx-background-color: transparent");
        
            Label story2Blank1 = new Label();
            story2Blank1.setMinWidth(0);
            story2Blank1.setMinHeight(100);
            story2Blank1.setStyle("-fx-background-color: rgba(255,255,255,0.7)");
        
            // Animation for text dialogue
            final String story2Content = "         Salamat for your help. You should get going now. It’s almost time for class";
            final int instantCharactersCount = 10; // Number of characters to show instantly
        
            final Animation story2Animation = new Transition() {
                {
                    setCycleDuration(Duration.millis(3000)); // Total duration for the animated part
                }
        
                protected void interpolate(double frac) {
                    int totalLength = story2Content.length();
                    int remainingCharacters = totalLength - instantCharactersCount;
                    if (remainingCharacters > 0) {
                        // Calculate the index of the last character to be shown for the current fraction
                        int index = instantCharactersCount + Math.round(remainingCharacters * (float) frac);
                        story2Label.setText(story2Content.substring(0, index));
                }else {
                    // If the content is shorter than the number of instant characters, show it all instantly
                    story2Label.setText(story2Content);
                }
            };};
            
            story2Animation.play();
        
        
            // Add elements to GridPane
            story4Node.add(story2Speaker, 2, 2);
            story4Node.add(story2Label, 2, 3);
            story4Node.add(story2Blank, 1, 2, 1, 1);
            story4Node.add(story2Blank1, 1, 3, 1, 1);
        
            // Define row and column constraints
        
            RowConstraints story2row1 = new RowConstraints();
            story2row1.setMinHeight(210);
            RowConstraints story2row2 = new RowConstraints();
            story2row2.setMinHeight(210);
            RowConstraints story2row3 = new RowConstraints();
            story2row3.setMinHeight(0);
            RowConstraints story2row4 = new RowConstraints();
            story2row4.setMinHeight(0);
        
            
            ColumnConstraints story2col1 = new ColumnConstraints();
            story2col1.setMinWidth(0); // Increase left margin
            ColumnConstraints story2col2 = new ColumnConstraints();
            story2col2.setMinWidth(20); // Spacer or small content
            ColumnConstraints story2col3 = new ColumnConstraints();
            story2col3.setMinWidth(800); // Increase width for main text content
            ColumnConstraints story2col4 = new ColumnConstraints();
            story2col4.setMinWidth(800); // Adjust right padding
        
        
            story4Node.getRowConstraints().addAll(story2row1, story2row2, story2row3, story2row4);
            story4Node.getColumnConstraints().addAll(story2col1, story2col2, story2col3, story2col4);
        
            // Create and set the new scene
            Scene newScene = new Scene(story4Node, 1280, 720);
            primaryStage.setScene(newScene);
            // Add key event listener for arrow keys to navigate scenes
            newScene.setOnKeyPressed(event -> {
                if (event.getCode() == KeyCode.RIGHT) {
                    switchToNextScene20(primaryStage);//always the bigger number
                } 
            });
        }

        private void switchToNextScene20(Stage primaryStage) { // back to normal
            GridPane story4Node = new GridPane();
            story4Node.setPadding(new Insets(20));
            story4Node.setHgap(10);
            story4Node.setVgap(10); 
        
            // Load and set the background image
            Image storyBackgroundImage = new Image(getClass().getResourceAsStream("/images/listeningenrique.png"));
            BackgroundImage background = new BackgroundImage(storyBackgroundImage, BackgroundRepeat.NO_REPEAT,
                    BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, new BackgroundSize(1280, 720, true, true, false, true));
            story4Node.setBackground(new Background(background));
               // Create a Label for the speaker
            Label story2Speaker = new Label();
            story2Speaker.setText("???");
            story2Speaker.setStyle("-fx-text-fill: white; -fx-font-size: 250%; -fx-font-weight: bold;");
            
            story2Speaker.setAlignment(Pos.CENTER_LEFT);
            story2Speaker.setAlignment(Pos.CENTER_LEFT);
        
            // Create a Label for the story text
            Label story2Label = new Label();
            story2Label.setWrapText(true);
            story2Label.setMinWidth(1140);
            story2Label.setMaxWidth(1140);
            story2Label.setMinHeight(150);
            story2Label.setStyle("-fx-text-fill: black; -fx-font-size: 200%; -fx-background-color: rgba(255,255,255,0.7);");
            story2Label.setAlignment(Pos.CENTER_LEFT);
        
            // Create blank labels for spacing
            Label story2Blank = new Label();
            story2Blank.setMinWidth(100);
            story2Blank.setMinHeight(0);
            story2Blank.setStyle("-fx-background-color: transparent");
        
            Label story2Blank1 = new Label();
            story2Blank1.setMinWidth(0);
            story2Blank1.setMinHeight(100);
            story2Blank1.setStyle("-fx-background-color: rgba(255,255,255,0.7)");
        
            // Animation for text dialogue
            final String story2Content = "         Oh... he's pretty cool.";
            final int instantCharactersCount = 10; // Number of characters to show instantly
        
            final Animation story2Animation = new Transition() {
                {
                    setCycleDuration(Duration.millis(3000)); // Total duration for the animated part
                }
        
                protected void interpolate(double frac) {
                    int totalLength = story2Content.length();
                    int remainingCharacters = totalLength - instantCharactersCount;
                    if (remainingCharacters > 0) {
                        // Calculate the index of the last character to be shown for the current fraction
                        int index = instantCharactersCount + Math.round(remainingCharacters * (float) frac);
                        story2Label.setText(story2Content.substring(0, index));
                }else {
                    // If the content is shorter than the number of instant characters, show it all instantly
                    story2Label.setText(story2Content);
                }
            };};
            
            story2Animation.play();
        
        
            // Add elements to GridPane
            story4Node.add(story2Speaker, 2, 2);
            story4Node.add(story2Label, 2, 3);
            story4Node.add(story2Blank, 1, 2, 1, 1);
            story4Node.add(story2Blank1, 1, 3, 1, 1);
        
            // Define row and column constraints
        
            RowConstraints story2row1 = new RowConstraints();
            story2row1.setMinHeight(210);
            RowConstraints story2row2 = new RowConstraints();
            story2row2.setMinHeight(210);
            RowConstraints story2row3 = new RowConstraints();
            story2row3.setMinHeight(0);
            RowConstraints story2row4 = new RowConstraints();
            story2row4.setMinHeight(0);
        
            
            ColumnConstraints story2col1 = new ColumnConstraints();
            story2col1.setMinWidth(0); // Increase left margin
            ColumnConstraints story2col2 = new ColumnConstraints();
            story2col2.setMinWidth(20); // Spacer or small content
            ColumnConstraints story2col3 = new ColumnConstraints();
            story2col3.setMinWidth(800); // Increase width for main text content
            ColumnConstraints story2col4 = new ColumnConstraints();
            story2col4.setMinWidth(800); // Adjust right padding
        
        
            story4Node.getRowConstraints().addAll(story2row1, story2row2, story2row3, story2row4);
            story4Node.getColumnConstraints().addAll(story2col1, story2col2, story2col3, story2col4);
        
            // Create and set the new scene
            Scene newScene = new Scene(story4Node, 1280, 720);
            primaryStage.setScene(newScene);
            // Add key event listener for arrow keys to navigate scenes
            newScene.setOnKeyPressed(event -> {
                if (event.getCode() == KeyCode.RIGHT) {
                    switchToNextScene21(primaryStage);//always the bigger number
                } else if (event.getCode() == KeyCode.LEFT) {
                    switchToNextScene19(primaryStage);
    
                } 
            });


        } private void switchToNextScene21(Stage primaryStage) { // back to normal
            GridPane story4Node = new GridPane();
            story4Node.setPadding(new Insets(20));
            story4Node.setHgap(10);
            story4Node.setVgap(10); 
        
            // Load and set the background image
            Image storyBackgroundImage = new Image(getClass().getResourceAsStream("/images/listeningenrique.png"));
            BackgroundImage background = new BackgroundImage(storyBackgroundImage, BackgroundRepeat.NO_REPEAT,
                    BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, new BackgroundSize(1280, 720, true, true, false, true));
            story4Node.setBackground(new Background(background));
               // Create a Label for the speaker
            Label story2Speaker = new Label();
            story2Speaker.setText("???");
            story2Speaker.setStyle("-fx-text-fill: white; -fx-font-size: 250%; -fx-font-weight: bold;");
            
            story2Speaker.setAlignment(Pos.CENTER_LEFT);
            story2Speaker.setAlignment(Pos.CENTER_LEFT);
        
            // Create a Label for the story text
            Label story2Label = new Label();
            story2Label.setWrapText(true);
            story2Label.setMinWidth(1140);
            story2Label.setMaxWidth(1140);
            story2Label.setMinHeight(150);
            story2Label.setStyle("-fx-text-fill: black; -fx-font-size: 200%; -fx-background-color: rgba(255,255,255,0.7);");
            story2Label.setAlignment(Pos.CENTER_LEFT);
        
            // Create blank labels for spacing
            Label story2Blank = new Label();
            story2Blank.setMinWidth(100);
            story2Blank.setMinHeight(0);
            story2Blank.setStyle("-fx-background-color: transparent");
        
            Label story2Blank1 = new Label();
            story2Blank1.setMinWidth(0);
            story2Blank1.setMinHeight(100);
            story2Blank1.setStyle("-fx-background-color: rgba(255,255,255,0.7)");
        
            // Animation for text dialogue
            final String story2Content = "         I wonder if I will see him again...";
            final int instantCharactersCount = 10; // Number of characters to show instantly
        
            final Animation story2Animation = new Transition() {
                {
                    setCycleDuration(Duration.millis(3000)); // Total duration for the animated part
                }
        
                protected void interpolate(double frac) {
                    int totalLength = story2Content.length();
                    int remainingCharacters = totalLength - instantCharactersCount;
                    if (remainingCharacters > 0) {
                        // Calculate the index of the last character to be shown for the current fraction
                        int index = instantCharactersCount + Math.round(remainingCharacters * (float) frac);
                        story2Label.setText(story2Content.substring(0, index));
                }else {
                    // If the content is shorter than the number of instant characters, show it all instantly
                    story2Label.setText(story2Content);
                }
            };};
            
            story2Animation.play();
        
        
            // Add elements to GridPane
            story4Node.add(story2Speaker, 2, 2);
            story4Node.add(story2Label, 2, 3);
            story4Node.add(story2Blank, 1, 2, 1, 1);
            story4Node.add(story2Blank1, 1, 3, 1, 1);
        
            // Define row and column constraints
        
            RowConstraints story2row1 = new RowConstraints();
            story2row1.setMinHeight(210);
            RowConstraints story2row2 = new RowConstraints();
            story2row2.setMinHeight(210);
            RowConstraints story2row3 = new RowConstraints();
            story2row3.setMinHeight(0);
            RowConstraints story2row4 = new RowConstraints();
            story2row4.setMinHeight(0);
        
            
            ColumnConstraints story2col1 = new ColumnConstraints();
            story2col1.setMinWidth(0); // Increase left margin
            ColumnConstraints story2col2 = new ColumnConstraints();
            story2col2.setMinWidth(20); // Spacer or small content
            ColumnConstraints story2col3 = new ColumnConstraints();
            story2col3.setMinWidth(800); // Increase width for main text content
            ColumnConstraints story2col4 = new ColumnConstraints();
            story2col4.setMinWidth(800); // Adjust right padding
        
        
            story4Node.getRowConstraints().addAll(story2row1, story2row2, story2row3, story2row4);
            story4Node.getColumnConstraints().addAll(story2col1, story2col2, story2col3, story2col4);
        
            // Create and set the new scene
            Scene newScene = new Scene(story4Node, 1280, 720);
            primaryStage.setScene(newScene);
            // Add key event listener for arrow keys to navigate scenes
            newScene.setOnKeyPressed(event -> {
                if (event.getCode() == KeyCode.RIGHT) {
                    switchToNextScene22(primaryStage);//always the bigger number
                } else if (event.getCode() == KeyCode.LEFT) {
                    switchToNextScene20(primaryStage);
    
                } 
            });
        }

    private void switchToNextScene22(Stage primaryStage) { // you are delivering papers because you are a salty person...
        GridPane story4Node = new GridPane();
        story4Node.setPadding(new Insets(20));
        story4Node.setHgap(10);
        story4Node.setVgap(10); 
        applyFadeTransition(story4Node);
          
    
        // Load and set the background image
        Image storyBackgroundImage = new Image(getClass().getResourceAsStream("/images/hallway.png"));
        BackgroundImage background = new BackgroundImage(storyBackgroundImage, BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, new BackgroundSize(1280, 720, true, true, false, true));
        story4Node.setBackground(new Background(background));
           // Create a Label for the speaker
        Label story2Speaker = new Label();
        story2Speaker.setText("Narrator");
        story2Speaker.setStyle("-fx-text-fill: white; -fx-font-size: 250%; -fx-font-weight: bold;");
        
        story2Speaker.setAlignment(Pos.CENTER_LEFT);
        story2Speaker.setAlignment(Pos.CENTER_LEFT);
    
        // Create a Label for the story text
        Label story2Label = new Label();
        story2Label.setWrapText(true);
        story2Label.setMinWidth(1140);
        story2Label.setMaxWidth(1140);
        story2Label.setMinHeight(150);
        story2Label.setStyle("-fx-text-fill: black; -fx-font-size: 200%; -fx-background-color: rgba(255,255,255,0.7);");
        story2Label.setAlignment(Pos.CENTER_LEFT);
    
        // Create blank labels for spacing
        Label story2Blank = new Label();
        story2Blank.setMinWidth(100);
        story2Blank.setMinHeight(0);
        story2Blank.setStyle("-fx-background-color: transparent");
    
        Label story2Blank1 = new Label();
        story2Blank1.setMinWidth(0);
        story2Blank1.setMinHeight(100);
        story2Blank1.setStyle("-fx-background-color: rgba(255,255,255,0.7)");
    
        // Animation for text dialogue
        final String story2Content = "         You are on a task to deliver math worksheets.";
        final int instantCharactersCount = 10; // Number of characters to show instantly
    
        final Animation story2Animation = new Transition() {
            {
                setCycleDuration(Duration.millis(3000)); // Total duration for the animated part
            }
    
            protected void interpolate(double frac) {
                int totalLength = story2Content.length();
                int remainingCharacters = totalLength - instantCharactersCount;
                if (remainingCharacters > 0) {
                    // Calculate the index of the last character to be shown for the current fraction
                    int index = instantCharactersCount + Math.round(remainingCharacters * (float) frac);
                    story2Label.setText(story2Content.substring(0, index));
            }else {
                // If the content is shorter than the number of instant characters, show it all instantly
                story2Label.setText(story2Content);
            }
        };};
        
        story2Animation.play();
    
    
        // Add elements to GridPane
        story4Node.add(story2Speaker, 2, 2);
        story4Node.add(story2Label, 2, 3);
        story4Node.add(story2Blank, 1, 2, 1, 1);
        story4Node.add(story2Blank1, 1, 3, 1, 1);
    
        // Define row and column constraints
    
        RowConstraints story2row1 = new RowConstraints();
        story2row1.setMinHeight(210);
        RowConstraints story2row2 = new RowConstraints();
        story2row2.setMinHeight(210);
        RowConstraints story2row3 = new RowConstraints();
        story2row3.setMinHeight(0);
        RowConstraints story2row4 = new RowConstraints();
        story2row4.setMinHeight(0);
    
        
        ColumnConstraints story2col1 = new ColumnConstraints();
        story2col1.setMinWidth(0); // Increase left margin
        ColumnConstraints story2col2 = new ColumnConstraints();
        story2col2.setMinWidth(20); // Spacer or small content
        ColumnConstraints story2col3 = new ColumnConstraints();
        story2col3.setMinWidth(800); // Increase width for main text content
        ColumnConstraints story2col4 = new ColumnConstraints();
        story2col4.setMinWidth(800); // Adjust right padding
    
    
        story4Node.getRowConstraints().addAll(story2row1, story2row2, story2row3, story2row4);
        story4Node.getColumnConstraints().addAll(story2col1, story2col2, story2col3, story2col4);
    
        // Create and set the new scene
        Scene newScene = new Scene(story4Node, 1280, 720);
        primaryStage.setScene(newScene);
        // Add key event listener for arrow keys to navigate scenes
        newScene.setOnKeyPressed(event -> {
            if (event.getCode() == KeyCode.RIGHT) {
                switchToNextScene23(primaryStage);//always the bigger number
            } else if (event.getCode() == KeyCode.LEFT) {
                switchToNextScene21(primaryStage);

            } 
        });
    }

    //
    private void switchToNextScene23(Stage primaryStage) { // 
        GridPane story4Node = new GridPane();
        story4Node.setPadding(new Insets(20));
        story4Node.setHgap(10);
        story4Node.setVgap(10); 
       
    
        // Load and set the background image
        Image storyBackgroundImage = new Image(getClass().getResourceAsStream("/images/hallway.png"));
        BackgroundImage background = new BackgroundImage(storyBackgroundImage, BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, new BackgroundSize(1280, 720, true, true, false, true));
        story4Node.setBackground(new Background(background));
           // Create a Label for the speaker
        Label story2Speaker = new Label();
        story2Speaker.setText("Narrator");
        story2Speaker.setStyle("-fx-text-fill: white; -fx-font-size: 250%; -fx-font-weight: bold;");
        
        story2Speaker.setAlignment(Pos.CENTER_LEFT);
        story2Speaker.setAlignment(Pos.CENTER_LEFT);
    
        // Create a Label for the story text
        Label story2Label = new Label();
        story2Label.setWrapText(true);
        story2Label.setMinWidth(1140);
        story2Label.setMaxWidth(1140);
        story2Label.setMinHeight(150);
        story2Label.setStyle("-fx-text-fill: black; -fx-font-size: 200%; -fx-background-color: rgba(255,255,255,0.7);");
        story2Label.setAlignment(Pos.CENTER_LEFT);
    
        // Create blank labels for spacing
        Label story2Blank = new Label();
        story2Blank.setMinWidth(100);
        story2Blank.setMinHeight(0);
        story2Blank.setStyle("-fx-background-color: transparent");
    
        Label story2Blank1 = new Label();
        story2Blank1.setMinWidth(0);
        story2Blank1.setMinHeight(100);
        story2Blank1.setStyle("-fx-background-color: rgba(255,255,255,0.7)");
    
        // Animation for text dialogue
        final String story2Content = "         You scan over the problems and try to solve them because you are a salty person.";
        final int instantCharactersCount = 10; // Number of characters to show instantly
    
        final Animation story2Animation = new Transition() {
            {
                setCycleDuration(Duration.millis(3000)); // Total duration for the animated part
            }
    
            protected void interpolate(double frac) {
                int totalLength = story2Content.length();
                int remainingCharacters = totalLength - instantCharactersCount;
                if (remainingCharacters > 0) {
                    // Calculate the index of the last character to be shown for the current fraction
                    int index = instantCharactersCount + Math.round(remainingCharacters * (float) frac);
                    story2Label.setText(story2Content.substring(0, index));
            }else {
                // If the content is shorter than the number of instant characters, show it all instantly
                story2Label.setText(story2Content);
            }
        };};
        
        story2Animation.play();
    
    
        // Add elements to GridPane
        story4Node.add(story2Speaker, 2, 2);
        story4Node.add(story2Label, 2, 3);
        story4Node.add(story2Blank, 1, 2, 1, 1);
        story4Node.add(story2Blank1, 1, 3, 1, 1);
    
        // Define row and column constraints
    
        RowConstraints story2row1 = new RowConstraints();
        story2row1.setMinHeight(210);
        RowConstraints story2row2 = new RowConstraints();
        story2row2.setMinHeight(210);
        RowConstraints story2row3 = new RowConstraints();
        story2row3.setMinHeight(0);
        RowConstraints story2row4 = new RowConstraints();
        story2row4.setMinHeight(0);
    
        
        ColumnConstraints story2col1 = new ColumnConstraints();
        story2col1.setMinWidth(0); // Increase left margin
        ColumnConstraints story2col2 = new ColumnConstraints();
        story2col2.setMinWidth(20); // Spacer or small content
        ColumnConstraints story2col3 = new ColumnConstraints();
        story2col3.setMinWidth(800); // Increase width for main text content
        ColumnConstraints story2col4 = new ColumnConstraints();
        story2col4.setMinWidth(800); // Adjust right padding
    
    
        story4Node.getRowConstraints().addAll(story2row1, story2row2, story2row3, story2row4);
        story4Node.getColumnConstraints().addAll(story2col1, story2col2, story2col3, story2col4);
    
        // Create and set the new scene
        Scene newScene = new Scene(story4Node, 1280, 720);
        primaryStage.setScene(newScene);
        // Add key event listener for arrow keys to navigate scenes
        newScene.setOnKeyPressed(event -> {
            if (event.getCode() == KeyCode.RIGHT) {
                switchToNextScene24(primaryStage);//always the bigger number
            } else if (event.getCode() == KeyCode.LEFT) {
                switchToNextScene12(primaryStage);

            } 
        });
    }

    private void switchToNextScene24(Stage primaryStage) { // calculus
        GridPane story16Node = new GridPane();
        
        // Load and set the background image
        Image storyBackgroundImage = new Image(getClass().getResourceAsStream("/images/paper.png"));
        BackgroundImage background = new BackgroundImage(storyBackgroundImage, BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, new BackgroundSize(1280, 720, true, true, false, true));
        story16Node.setBackground(new Background(background));
    
        // Create the question label
        Label story16Question = new Label("What is the derivative of 2^(1-6z)??");
        story16Question.setMinWidth(700);
        story16Question.setMaxWidth(700);
        story16Question.setMinHeight(60);
        story16Question.setMaxHeight(60);
        story16Question.setStyle("-fx-background-color:transparent;-fx-font-size:200%;-fx-text-fill:black;-fx-font-weight:bold;");
        story16Question.setAlignment(Pos.CENTER);
    
        // Create the feedback label
        Label story16Label = new Label("");
        story16Label.setMinWidth(700);
        story16Label.setMaxWidth(700);
        story16Label.setMinHeight(40);
        story16Label.setMaxHeight(40);
        story16Label.setStyle("-fx-text-fill:black;-fx-font-size:200%;-fx-background-color:transparent");
        story16Label.setAlignment(Pos.BOTTOM_CENTER); // Align at the bottom center
    
        // Define buttons for answer options
        Button story16Button1 = new Button("            a) 2^(1-6z)ln(2)");
        Button story16Button2 = new Button("            b) -2(6^(1-6z))ln(4)");
        Button story16Button3 = new Button("            c) -3(2^(2-6z))ln(2)");
    
        // Styling buttons
        String buttonStyle = "-fx-background-color:transparent;-fx-font-size:200%;-fx-border-width:1px";
        story16Button1.setStyle(buttonStyle);
        story16Button2.setStyle(buttonStyle);
        story16Button3.setStyle(buttonStyle);
    
        story16Button1.setFocusTraversable(false);
        story16Button2.setFocusTraversable(false);
        story16Button3.setFocusTraversable(false);
    
        story16Button1.setMinSize(500, 150);
        story16Button2.setMinSize(500, 150);
        story16Button3.setMinSize(500, 150);
    
        story16Button1.setMaxSize(500, 150);
        story16Button2.setMaxSize(500, 150);
        story16Button3.setMaxSize(500, 150);
    
        story16Button1.setAlignment(Pos.CENTER);
        story16Button2.setAlignment(Pos.CENTER);
        story16Button3.setAlignment(Pos.CENTER);
    
        // Set up the animation for wrong answers
        final Animation story16Animation = new Transition() {
            final String story16Content = "Try double-checking your math!";
            {
                setCycleDuration(Duration.millis(4000));
            }
    
            protected void interpolate(double frac) {
                final int story16Length = story16Content.length();
                final int story16N = Math.round(story16Length * (float) frac);
                story16Label.setText(story16Content.substring(0, story16N));
            }
        };
    
        // Event handlers for buttons
        story16Button1.setOnAction(event -> {
            // Incorrect answer
            story16Animation.playFromStart();
        });
    
        story16Button2.setOnAction(event -> {
            // Incorrect answer
            story16Animation.playFromStart();
        });
    
        story16Button3.setOnAction(event -> {
            // Correct answer - move to the next scene
            switchToNextScene25(primaryStage); 
        });
    
        // Add components to the GridPane
        story16Node.add(story16Question, 1, 1, 1, 1);
        story16Node.add(story16Button1, 1, 2);
        story16Node.add(story16Button2, 1, 3);
        story16Node.add(story16Button3, 1, 4);
        story16Node.add(story16Label, 1, 5, 1, 1); // Add the feedback label to the last row
    
        // Set row and column constraints
        story16Node.getRowConstraints().addAll(
            new RowConstraints(70),  // Question
            new RowConstraints(150), // Button 1
            new RowConstraints(150), // Button 2
            new RowConstraints(150), // Button 3
            new RowConstraints(60)   // Feedback Label
        );
    
        story16Node.getColumnConstraints().addAll(
            new ColumnConstraints(270, 270, 270, Priority.ALWAYS, HPos.CENTER, true), // center column
            new ColumnConstraints(500) // make this larger to push elements to center
        );
    
        // Create and set the scene
        Scene story16Scene = new Scene(story16Node, 1280, 720);
        primaryStage.setScene(story16Scene);
        primaryStage.show();
    }



    private void switchToNextScene25(Stage primaryStage) { // calculus
        GridPane story16Node = new GridPane();
        
        // Load and set the background image
        Image storyBackgroundImage = new Image(getClass().getResourceAsStream("/images/paper.png"));
        BackgroundImage background = new BackgroundImage(storyBackgroundImage, BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, new BackgroundSize(1280, 720, true, true, false, true));
        story16Node.setBackground(new Background(background));
    
        // Create the question label
        Label story16Question = new Label("         What is the derivative of (1-8z)^1/3?");
        story16Question.setMinWidth(700);
        story16Question.setMaxWidth(700);
        story16Question.setMinHeight(60);
        story16Question.setMaxHeight(60);
        story16Question.setStyle("-fx-background-color:transparent;-fx-font-size:200%;-fx-text-fill:black;-fx-font-weight:bold;");
        story16Question.setAlignment(Pos.CENTER);
    
        // Create the feedback label
        Label story16Label = new Label("");
        story16Label.setMinWidth(700);
        story16Label.setMaxWidth(700);
        story16Label.setMinHeight(40);
        story16Label.setMaxHeight(40);
        story16Label.setStyle("-fx-text-fill:black;-fx-font-size:200%;-fx-background-color:transparent");
        story16Label.setAlignment(Pos.BOTTOM_CENTER); // Align at the bottom center
    
        // Define buttons for answer options
        Button story16Button1 = new Button("            a) (-8/3)(1-8z)^-2/3");
        Button story16Button2 = new Button("            b) (1-8z)^-2/3");
        Button story16Button3 = new Button("            c) (-8/3)(1-8z)^-3/2");
    
        // Styling buttons
        String buttonStyle = "-fx-background-color:transparent;-fx-font-size:200%;-fx-border-width:1px";
        story16Button1.setStyle(buttonStyle);
        story16Button2.setStyle(buttonStyle);
        story16Button3.setStyle(buttonStyle);
    
        story16Button1.setFocusTraversable(false);
        story16Button2.setFocusTraversable(false);
        story16Button3.setFocusTraversable(false);
    
        story16Button1.setMinSize(500, 150);
        story16Button2.setMinSize(500, 150);
        story16Button3.setMinSize(500, 150);
    
        story16Button1.setMaxSize(500, 150);
        story16Button2.setMaxSize(500, 150);
        story16Button3.setMaxSize(500, 150);
    
        story16Button1.setAlignment(Pos.CENTER);
        story16Button2.setAlignment(Pos.CENTER);
        story16Button3.setAlignment(Pos.CENTER);
    
        // Set up the animation for wrong answers
        final Animation story16Animation = new Transition() {
            final String story16Content = "Try double-checking your math!";
            {
                setCycleDuration(Duration.millis(4000));
            }
    
            protected void interpolate(double frac) {
                final int story16Length = story16Content.length();
                final int story16N = Math.round(story16Length * (float) frac);
                story16Label.setText(story16Content.substring(0, story16N));
            }
        };
    
        // Event handlers for buttons
        story16Button1.setOnAction(event -> {
             // Correct answer - move to the next scene
            switchToNextScene26(primaryStage); 
        });
    
        story16Button2.setOnAction(event -> {
            // Incorrect answer
            story16Animation.playFromStart();
        });
    
        story16Button3.setOnAction(event -> {
           
            story16Animation.playFromStart();
           
        });
    
        // Add components to the GridPane
        story16Node.add(story16Question, 1, 1, 1, 1);
        story16Node.add(story16Button1, 1, 2);
        story16Node.add(story16Button2, 1, 3);
        story16Node.add(story16Button3, 1, 4);
        story16Node.add(story16Label, 1, 5, 1, 1); // Add the feedback label to the last row
    
        // Set row and column constraints
        story16Node.getRowConstraints().addAll(
            new RowConstraints(70),  // Question
            new RowConstraints(150), // Button 1
            new RowConstraints(150), // Button 2
            new RowConstraints(150), // Button 3
            new RowConstraints(60)   // Feedback Label
        );
    
        story16Node.getColumnConstraints().addAll(
            new ColumnConstraints(270, 270, 270, Priority.ALWAYS, HPos.CENTER, true), // center column
            new ColumnConstraints(500) // make this larger to push elements to center
        );
    
        // Create and set the scene
        Scene story16Scene = new Scene(story16Node, 1280, 720);
        primaryStage.setScene(story16Scene);
        primaryStage.show();
    }

    private void switchToNextScene26(Stage primaryStage) { // calculus
        GridPane story16Node = new GridPane();
        
        // Load and set the background image
        Image storyBackgroundImage = new Image(getClass().getResourceAsStream("/images/paper.png"));
        BackgroundImage background = new BackgroundImage(storyBackgroundImage, BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, new BackgroundSize(1280, 720, true, true, false, true));
        story16Node.setBackground(new Background(background));
    
        // Create the question label
        Label story16Question = new Label("        What is the derivative of csc(7w)?");
        story16Question.setMinWidth(700);
        story16Question.setMaxWidth(700);
        story16Question.setMinHeight(60);
        story16Question.setMaxHeight(60);
        story16Question.setStyle("-fx-background-color:transparent;-fx-font-size:200%;-fx-text-fill:black;-fx-font-weight:bold;");
        story16Question.setAlignment(Pos.CENTER);
    
        // Create the feedback label
        Label story16Label = new Label("");
        story16Label.setMinWidth(700);
        story16Label.setMaxWidth(700);
        story16Label.setMinHeight(40);
        story16Label.setMaxHeight(40);
        story16Label.setStyle("-fx-text-fill:black;-fx-font-size:200%;-fx-background-color:transparent");
        story16Label.setAlignment(Pos.BOTTOM_CENTER); // Align at the bottom center
    
        // Define buttons for answer options
        Button story16Button1 = new Button("            a) -7(csc(7w))tan(7w)");
        Button story16Button2 = new Button("            b) -7(csc(7w))cot(7w)");
        Button story16Button3 = new Button("            c) -7(csc(7w))cos(7w)");
    
        // Styling buttons
        String buttonStyle = "-fx-background-color:transparent;-fx-font-size:200%;-fx-border-width:1px";
        story16Button1.setStyle(buttonStyle);
        story16Button2.setStyle(buttonStyle);
        story16Button3.setStyle(buttonStyle);
    
        story16Button1.setFocusTraversable(false);
        story16Button2.setFocusTraversable(false);
        story16Button3.setFocusTraversable(false);
    
        story16Button1.setMinSize(500, 150);
        story16Button2.setMinSize(500, 150);
        story16Button3.setMinSize(500, 150);
    
        story16Button1.setMaxSize(500, 150);
        story16Button2.setMaxSize(500, 150);
        story16Button3.setMaxSize(500, 150);
    
        story16Button1.setAlignment(Pos.CENTER);
        story16Button2.setAlignment(Pos.CENTER);
        story16Button3.setAlignment(Pos.CENTER);
    
        // Set up the animation for wrong answers
        final Animation story16Animation = new Transition() {
            final String story16Content = "Do you remember your trig derivatives?";
            {
                setCycleDuration(Duration.millis(4000));
            }
    
            protected void interpolate(double frac) {
                final int story16Length = story16Content.length();
                final int story16N = Math.round(story16Length * (float) frac);
                story16Label.setText(story16Content.substring(0, story16N));
            }
        };
    
        // Event handlers for buttons
        story16Button1.setOnAction(event -> {
             // Correct answer - move to the next scene
             story16Animation.playFromStart();
        });
    
        story16Button2.setOnAction(event -> {
            // Incorrect answer
            
            switchToNextScene27(primaryStage); 
        });
    
        story16Button3.setOnAction(event -> {
           
            story16Animation.playFromStart();
           
        });
    
        // Add components to the GridPane
        story16Node.add(story16Question, 1, 1, 1, 1);
        story16Node.add(story16Button1, 1, 2);
        story16Node.add(story16Button2, 1, 3);
        story16Node.add(story16Button3, 1, 4);
        story16Node.add(story16Label, 1, 5, 1, 1); // Add the feedback label to the last row
    
        // Set row and column constraints
        story16Node.getRowConstraints().addAll(
            new RowConstraints(70),  // Question
            new RowConstraints(150), // Button 1
            new RowConstraints(150), // Button 2
            new RowConstraints(150), // Button 3
            new RowConstraints(60)   // Feedback Label
        );
    
        story16Node.getColumnConstraints().addAll(
            new ColumnConstraints(270, 270, 270, Priority.ALWAYS, HPos.CENTER, true), // center column
            new ColumnConstraints(500) // make this larger to push elements to center
        );
    
        // Create and set the scene
        Scene story16Scene = new Scene(story16Node, 1280, 720);
        primaryStage.setScene(story16Scene);
        primaryStage.show();
    }


    private void switchToNextScene27(Stage primaryStage) { 
        GridPane story4Node = new GridPane();
        story4Node.setPadding(new Insets(20));
        story4Node.setHgap(10);
        story4Node.setVgap(10); 
        applyFadeTransition(story4Node);
          
    
        // Load and set the background image
        Image storyBackgroundImage = new Image(getClass().getResourceAsStream("/images/classroom.png"));
        BackgroundImage background = new BackgroundImage(storyBackgroundImage, BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, new BackgroundSize(1280, 720, true, true, false, true));
        story4Node.setBackground(new Background(background));
           // Create a Label for the speaker
        Label story2Speaker = new Label();
        story2Speaker.setText("Narrator");
        story2Speaker.setStyle("-fx-text-fill: white; -fx-font-size: 250%; -fx-font-weight: bold;");
        
        story2Speaker.setAlignment(Pos.CENTER_LEFT);
        story2Speaker.setAlignment(Pos.CENTER_LEFT);
    
        // Create a Label for the story text
        Label story2Label = new Label();
        story2Label.setWrapText(true);
        story2Label.setMinWidth(1140);
        story2Label.setMaxWidth(1140);
        story2Label.setMinHeight(150);
        story2Label.setStyle("-fx-text-fill: black; -fx-font-size: 200%; -fx-background-color: rgba(255,255,255,0.7);");
        story2Label.setAlignment(Pos.CENTER_LEFT);
    
        // Create blank labels for spacing
        Label story2Blank = new Label();
        story2Blank.setMinWidth(100);
        story2Blank.setMinHeight(0);
        story2Blank.setStyle("-fx-background-color: transparent");
    
        Label story2Blank1 = new Label();
        story2Blank1.setMinWidth(0);
        story2Blank1.setMinHeight(100);
        story2Blank1.setStyle("-fx-background-color: rgba(255,255,255,0.7)");
    
        // Animation for text dialogue
        final String story2Content = "         You intrude on Mr. Enriquez teaching Math 1."; //replace bg with classroom?
        final int instantCharactersCount = 10; // Number of characters to show instantly
    
        final Animation story2Animation = new Transition() {
            {
                setCycleDuration(Duration.millis(3000)); // Total duration for the animated part
            }
    
            protected void interpolate(double frac) {
                int totalLength = story2Content.length();
                int remainingCharacters = totalLength - instantCharactersCount;
                if (remainingCharacters > 0) {
                    // Calculate the index of the last character to be shown for the current fraction
                    int index = instantCharactersCount + Math.round(remainingCharacters * (float) frac);
                    story2Label.setText(story2Content.substring(0, index));
            }else {
                // If the content is shorter than the number of instant characters, show it all instantly
                story2Label.setText(story2Content);
            }
        };};
        
        story2Animation.play();
    
    
        // Add elements to GridPane
        story4Node.add(story2Speaker, 2, 2);
        story4Node.add(story2Label, 2, 3);
        story4Node.add(story2Blank, 1, 2, 1, 1);
        story4Node.add(story2Blank1, 1, 3, 1, 1);
    
        // Define row and column constraints
    
        RowConstraints story2row1 = new RowConstraints();
        story2row1.setMinHeight(210);
        RowConstraints story2row2 = new RowConstraints();
        story2row2.setMinHeight(210);
        RowConstraints story2row3 = new RowConstraints();
        story2row3.setMinHeight(0);
        RowConstraints story2row4 = new RowConstraints();
        story2row4.setMinHeight(0);
    
        
        ColumnConstraints story2col1 = new ColumnConstraints();
        story2col1.setMinWidth(0); // Increase left margin
        ColumnConstraints story2col2 = new ColumnConstraints();
        story2col2.setMinWidth(20); // Spacer or small content
        ColumnConstraints story2col3 = new ColumnConstraints();
        story2col3.setMinWidth(800); // Increase width for main text content
        ColumnConstraints story2col4 = new ColumnConstraints();
        story2col4.setMinWidth(800); // Adjust right padding
    
    
        story4Node.getRowConstraints().addAll(story2row1, story2row2, story2row3, story2row4);
        story4Node.getColumnConstraints().addAll(story2col1, story2col2, story2col3, story2col4);
    
        // Create and set the new scene
        Scene newScene = new Scene(story4Node, 1280, 720);
        primaryStage.setScene(newScene);
        // Add key event listener for arrow keys to navigate scenes
        newScene.setOnKeyPressed(event -> {
            if (event.getCode() == KeyCode.RIGHT) {
                switchToNextScene29(primaryStage);//always the bigger number
            } else if (event.getCode() == KeyCode.LEFT) {
                switchToNextScene26(primaryStage);

            } 
        });
    }

   



    private void switchToNextScene29(Stage primaryStage) { 
        GridPane story4Node = new GridPane();
        story4Node.setPadding(new Insets(20));
        story4Node.setHgap(10);
        story4Node.setVgap(10); 
      
          
    
        // Load and set the background image
        Image storyBackgroundImage = new Image(getClass().getResourceAsStream("/images/classroom.png"));
        BackgroundImage background = new BackgroundImage(storyBackgroundImage, BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, new BackgroundSize(1280, 720, true, true, false, true));
        story4Node.setBackground(new Background(background));
           // Create a Label for the speaker
        Label story2Speaker = new Label();
        story2Speaker.setText("???");
        story2Speaker.setStyle("-fx-text-fill: white; -fx-font-size: 250%; -fx-font-weight: bold;");
        
        story2Speaker.setAlignment(Pos.CENTER_LEFT);
        story2Speaker.setAlignment(Pos.CENTER_LEFT);
    
        // Create a Label for the story text
        Label story2Label = new Label();
        story2Label.setWrapText(true);
        story2Label.setMinWidth(1140);
        story2Label.setMaxWidth(1140);
        story2Label.setMinHeight(150);
        story2Label.setStyle("-fx-text-fill: black; -fx-font-size: 200%; -fx-background-color: rgba(255,255,255,0.7);");
        story2Label.setAlignment(Pos.CENTER_LEFT);
    
        // Create blank labels for spacing
        Label story2Blank = new Label();
        story2Blank.setMinWidth(100);
        story2Blank.setMinHeight(0);
        story2Blank.setStyle("-fx-background-color: transparent");
    
        Label story2Blank1 = new Label();
        story2Blank1.setMinWidth(0);
        story2Blank1.setMinHeight(100);
        story2Blank1.setStyle("-fx-background-color: rgba(255,255,255,0.7)");
    
        // Animation for text dialogue
        final String story2Content = "         Sorry for the intrusion, here are the worksheets you needed.";
        final int instantCharactersCount = 10; // Number of characters to show instantly
    
        final Animation story2Animation = new Transition() {
            {
                setCycleDuration(Duration.millis(3000)); // Total duration for the animated part
            }
    
            protected void interpolate(double frac) {
                int totalLength = story2Content.length();
                int remainingCharacters = totalLength - instantCharactersCount;
                if (remainingCharacters > 0) {
                    // Calculate the index of the last character to be shown for the current fraction
                    int index = instantCharactersCount + Math.round(remainingCharacters * (float) frac);
                    story2Label.setText(story2Content.substring(0, index));
            }else {
                // If the content is shorter than the number of instant characters, show it all instantly
                story2Label.setText(story2Content);
            }
        };};
        
        story2Animation.play();
    
    
        // Add elements to GridPane
        story4Node.add(story2Speaker, 2, 2);
        story4Node.add(story2Label, 2, 3);
        story4Node.add(story2Blank, 1, 2, 1, 1);
        story4Node.add(story2Blank1, 1, 3, 1, 1);
    
        // Define row and column constraints
    
        RowConstraints story2row1 = new RowConstraints();
        story2row1.setMinHeight(210);
        RowConstraints story2row2 = new RowConstraints();
        story2row2.setMinHeight(210);
        RowConstraints story2row3 = new RowConstraints();
        story2row3.setMinHeight(0);
        RowConstraints story2row4 = new RowConstraints();
        story2row4.setMinHeight(0);
    
        
        ColumnConstraints story2col1 = new ColumnConstraints();
        story2col1.setMinWidth(0); // Increase left margin
        ColumnConstraints story2col2 = new ColumnConstraints();
        story2col2.setMinWidth(20); // Spacer or small content
        ColumnConstraints story2col3 = new ColumnConstraints();
        story2col3.setMinWidth(800); // Increase width for main text content
        ColumnConstraints story2col4 = new ColumnConstraints();
        story2col4.setMinWidth(800); // Adjust right padding
    
    
        story4Node.getRowConstraints().addAll(story2row1, story2row2, story2row3, story2row4);
        story4Node.getColumnConstraints().addAll(story2col1, story2col2, story2col3, story2col4);
    
        // Create and set the new scene
        Scene newScene = new Scene(story4Node, 1280, 720);
        primaryStage.setScene(newScene);
        // Add key event listener for arrow keys to navigate scenes
        newScene.setOnKeyPressed(event -> {
            if (event.getCode() == KeyCode.RIGHT) {
                switchToNextScene30(primaryStage);//always the bigger number
            } else if (event.getCode() == KeyCode.LEFT) {
                switchToNextScene27(primaryStage);

            } 
        });
    }

    private void switchToNextScene30(Stage primaryStage) { 
        GridPane story4Node = new GridPane();
        story4Node.setPadding(new Insets(20));
        story4Node.setHgap(10);
        story4Node.setVgap(10); 
        
          
    
        // Load and set the background image
        Image storyBackgroundImage = new Image(getClass().getResourceAsStream("/images/classroomenriquehappy.png"));
        BackgroundImage background = new BackgroundImage(storyBackgroundImage, BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, new BackgroundSize(1280, 720, true, true, false, true));
        story4Node.setBackground(new Background(background));
           // Create a Label for the speaker
        Label story2Speaker = new Label();
        story2Speaker.setText("Mr. Enriquez");
        story2Speaker.setStyle("-fx-text-fill: white; -fx-font-size: 250%; -fx-font-weight: bold;");
        
        story2Speaker.setAlignment(Pos.CENTER_LEFT);
        story2Speaker.setAlignment(Pos.CENTER_LEFT);
    
        // Create a Label for the story text
        Label story2Label = new Label();
        story2Label.setWrapText(true);
        story2Label.setMinWidth(1140);
        story2Label.setMaxWidth(1140);
        story2Label.setMinHeight(150);
        story2Label.setStyle("-fx-text-fill: black; -fx-font-size: 200%; -fx-background-color: rgba(255,255,255,0.7);");
        story2Label.setAlignment(Pos.CENTER_LEFT);
    
        // Create blank labels for spacing
        Label story2Blank = new Label();
        story2Blank.setMinWidth(100);
        story2Blank.setMinHeight(0);
        story2Blank.setStyle("-fx-background-color: transparent");
    
        Label story2Blank1 = new Label();
        story2Blank1.setMinWidth(0);
        story2Blank1.setMinHeight(100);
        story2Blank1.setStyle("-fx-background-color: rgba(255,255,255,0.7)");
    
        // Animation for text dialogue
        final String story2Content = "         Oh. Salamat so much!";
        final int instantCharactersCount = 10; // Number of characters to show instantly
    
        final Animation story2Animation = new Transition() {
            {
                setCycleDuration(Duration.millis(3000)); // Total duration for the animated part
            }
    
            protected void interpolate(double frac) {
                int totalLength = story2Content.length();
                int remainingCharacters = totalLength - instantCharactersCount;
                if (remainingCharacters > 0) {
                    // Calculate the index of the last character to be shown for the current fraction
                    int index = instantCharactersCount + Math.round(remainingCharacters * (float) frac);
                    story2Label.setText(story2Content.substring(0, index));
            }else {
                // If the content is shorter than the number of instant characters, show it all instantly
                story2Label.setText(story2Content);
            }
        };};
        
        story2Animation.play();
    
    
        // Add elements to GridPane
        story4Node.add(story2Speaker, 2, 2);
        story4Node.add(story2Label, 2, 3);
        story4Node.add(story2Blank, 1, 2, 1, 1);
        story4Node.add(story2Blank1, 1, 3, 1, 1);
    
        // Define row and column constraints
    
        RowConstraints story2row1 = new RowConstraints();
        story2row1.setMinHeight(210);
        RowConstraints story2row2 = new RowConstraints();
        story2row2.setMinHeight(210);
        RowConstraints story2row3 = new RowConstraints();
        story2row3.setMinHeight(0);
        RowConstraints story2row4 = new RowConstraints();
        story2row4.setMinHeight(0);
    
        
        ColumnConstraints story2col1 = new ColumnConstraints();
        story2col1.setMinWidth(0); // Increase left margin
        ColumnConstraints story2col2 = new ColumnConstraints();
        story2col2.setMinWidth(20); // Spacer or small content
        ColumnConstraints story2col3 = new ColumnConstraints();
        story2col3.setMinWidth(800); // Increase width for main text content
        ColumnConstraints story2col4 = new ColumnConstraints();
        story2col4.setMinWidth(800); // Adjust right padding
    
    
        story4Node.getRowConstraints().addAll(story2row1, story2row2, story2row3, story2row4);
        story4Node.getColumnConstraints().addAll(story2col1, story2col2, story2col3, story2col4);
    
        // Create and set the new scene
        Scene newScene = new Scene(story4Node, 1280, 720);
        primaryStage.setScene(newScene);
        // Add key event listener for arrow keys to navigate scenes
        newScene.setOnKeyPressed(event -> {
            if (event.getCode() == KeyCode.RIGHT) {
                switchToNextScene31(primaryStage);//always the bigger number
            } else if (event.getCode() == KeyCode.LEFT) {
                switchToNextScene29(primaryStage);

            } 
        });
    }

    private void switchToNextScene31(Stage primaryStage) { 
        GridPane story4Node = new GridPane();
        story4Node.setPadding(new Insets(20));
        story4Node.setHgap(10);
        story4Node.setVgap(10); 
    
          
    
        // Load and set the background image
        Image storyBackgroundImage = new Image(getClass().getResourceAsStream("/images/classroom.png"));
        BackgroundImage background = new BackgroundImage(storyBackgroundImage, BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, new BackgroundSize(1280, 720, true, true, false, true));
        story4Node.setBackground(new Background(background));
           // Create a Label for the speaker
        Label story2Speaker = new Label();
        story2Speaker.setText("???");
        story2Speaker.setStyle("-fx-text-fill: white; -fx-font-size: 250%; -fx-font-weight: bold;");
        
        story2Speaker.setAlignment(Pos.CENTER_LEFT);
        story2Speaker.setAlignment(Pos.CENTER_LEFT);
    
        // Create a Label for the story text
        Label story2Label = new Label();
        story2Label.setWrapText(true);
        story2Label.setMinWidth(1140);
        story2Label.setMaxWidth(1140);
        story2Label.setMinHeight(150);
        story2Label.setStyle("-fx-text-fill: black; -fx-font-size: 200%; -fx-background-color: rgba(255,255,255,0.7);");
        story2Label.setAlignment(Pos.CENTER_LEFT);
    
        // Create blank labels for spacing
        Label story2Blank = new Label();
        story2Blank.setMinWidth(100);
        story2Blank.setMinHeight(0);
        story2Blank.setStyle("-fx-background-color: transparent");
    
        Label story2Blank1 = new Label();
        story2Blank1.setMinWidth(0);
        story2Blank1.setMinHeight(100);
        story2Blank1.setStyle("-fx-background-color: rgba(255,255,255,0.7)");
    
        // Animation for text dialogue
        final String story2Content = "         You wanna know something...?";
        final int instantCharactersCount = 10; // Number of characters to show instantly
    
        final Animation story2Animation = new Transition() {
            {
                setCycleDuration(Duration.millis(3000)); // Total duration for the animated part
            }
    
            protected void interpolate(double frac) {
                int totalLength = story2Content.length();
                int remainingCharacters = totalLength - instantCharactersCount;
                if (remainingCharacters > 0) {
                    // Calculate the index of the last character to be shown for the current fraction
                    int index = instantCharactersCount + Math.round(remainingCharacters * (float) frac);
                    story2Label.setText(story2Content.substring(0, index));
            }else {
                // If the content is shorter than the number of instant characters, show it all instantly
                story2Label.setText(story2Content);
            }
        };};
        
        story2Animation.play();
    
    
        // Add elements to GridPane
        story4Node.add(story2Speaker, 2, 2);
        story4Node.add(story2Label, 2, 3);
        story4Node.add(story2Blank, 1, 2, 1, 1);
        story4Node.add(story2Blank1, 1, 3, 1, 1);
    
        // Define row and column constraints
    
        RowConstraints story2row1 = new RowConstraints();
        story2row1.setMinHeight(210);
        RowConstraints story2row2 = new RowConstraints();
        story2row2.setMinHeight(210);
        RowConstraints story2row3 = new RowConstraints();
        story2row3.setMinHeight(0);
        RowConstraints story2row4 = new RowConstraints();
        story2row4.setMinHeight(0);
    
        
        ColumnConstraints story2col1 = new ColumnConstraints();
        story2col1.setMinWidth(0); // Increase left margin
        ColumnConstraints story2col2 = new ColumnConstraints();
        story2col2.setMinWidth(20); // Spacer or small content
        ColumnConstraints story2col3 = new ColumnConstraints();
        story2col3.setMinWidth(800); // Increase width for main text content
        ColumnConstraints story2col4 = new ColumnConstraints();
        story2col4.setMinWidth(800); // Adjust right padding
    
    
        story4Node.getRowConstraints().addAll(story2row1, story2row2, story2row3, story2row4);
        story4Node.getColumnConstraints().addAll(story2col1, story2col2, story2col3, story2col4);
    
        // Create and set the new scene
        Scene newScene = new Scene(story4Node, 1280, 720);
        primaryStage.setScene(newScene);
        // Add key event listener for arrow keys to navigate scenes
        newScene.setOnKeyPressed(event -> {
            if (event.getCode() == KeyCode.RIGHT) {
                switchToNextScene32(primaryStage);//always the bigger number
            } else if (event.getCode() == KeyCode.LEFT) {
                switchToNextScene30(primaryStage);

            } 
        });
    }

    private void switchToNextScene32(Stage primaryStage) { 
        GridPane story4Node = new GridPane();
        story4Node.setPadding(new Insets(20));
        story4Node.setHgap(10);
        story4Node.setVgap(10); 
     
    
        // Load and set the background image
        Image storyBackgroundImage = new Image(getClass().getResourceAsStream("/images/classroomenriquehappy.png"));
        BackgroundImage background = new BackgroundImage(storyBackgroundImage, BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, new BackgroundSize(1280, 720, true, true, false, true));
        story4Node.setBackground(new Background(background));
           // Create a Label for the speaker
        Label story2Speaker = new Label();
        story2Speaker.setText("Mr. Enriquez");
        story2Speaker.setStyle("-fx-text-fill: white; -fx-font-size: 250%; -fx-font-weight: bold;");
        
        story2Speaker.setAlignment(Pos.CENTER_LEFT);
        story2Speaker.setAlignment(Pos.CENTER_LEFT);
    
        // Create a Label for the story text
        Label story2Label = new Label();
        story2Label.setWrapText(true);
        story2Label.setMinWidth(1140);
        story2Label.setMaxWidth(1140);
        story2Label.setMinHeight(150);
        story2Label.setStyle("-fx-text-fill: black; -fx-font-size: 200%; -fx-background-color: rgba(255,255,255,0.7);");
        story2Label.setAlignment(Pos.CENTER_LEFT);
    
        // Create blank labels for spacing
        Label story2Blank = new Label();
        story2Blank.setMinWidth(100);
        story2Blank.setMinHeight(0);
        story2Blank.setStyle("-fx-background-color: transparent");
    
        Label story2Blank1 = new Label();
        story2Blank1.setMinWidth(0);
        story2Blank1.setMinHeight(100);
        story2Blank1.setStyle("-fx-background-color: rgba(255,255,255,0.7)");
    
        // Animation for text dialogue
        final String story2Content = "         What?";
        final int instantCharactersCount = 10; // Number of characters to show instantly
    
        final Animation story2Animation = new Transition() {
            {
                setCycleDuration(Duration.millis(3000)); // Total duration for the animated part
            }
    
            protected void interpolate(double frac) {
                int totalLength = story2Content.length();
                int remainingCharacters = totalLength - instantCharactersCount;
                if (remainingCharacters > 0) {
                    // Calculate the index of the last character to be shown for the current fraction
                    int index = instantCharactersCount + Math.round(remainingCharacters * (float) frac);
                    story2Label.setText(story2Content.substring(0, index));
            }else {
                // If the content is shorter than the number of instant characters, show it all instantly
                story2Label.setText(story2Content);
            }
        };};
        
        story2Animation.play();
    
    
        // Add elements to GridPane
        story4Node.add(story2Speaker, 2, 2);
        story4Node.add(story2Label, 2, 3);
        story4Node.add(story2Blank, 1, 2, 1, 1);
        story4Node.add(story2Blank1, 1, 3, 1, 1);
    
        // Define row and column constraints
    
        RowConstraints story2row1 = new RowConstraints();
        story2row1.setMinHeight(210);
        RowConstraints story2row2 = new RowConstraints();
        story2row2.setMinHeight(210);
        RowConstraints story2row3 = new RowConstraints();
        story2row3.setMinHeight(0);
        RowConstraints story2row4 = new RowConstraints();
        story2row4.setMinHeight(0);
    
        
        ColumnConstraints story2col1 = new ColumnConstraints();
        story2col1.setMinWidth(0); // Increase left margin
        ColumnConstraints story2col2 = new ColumnConstraints();
        story2col2.setMinWidth(20); // Spacer or small content
        ColumnConstraints story2col3 = new ColumnConstraints();
        story2col3.setMinWidth(800); // Increase width for main text content
        ColumnConstraints story2col4 = new ColumnConstraints();
        story2col4.setMinWidth(800); // Adjust right padding
    
    
        story4Node.getRowConstraints().addAll(story2row1, story2row2, story2row3, story2row4);
        story4Node.getColumnConstraints().addAll(story2col1, story2col2, story2col3, story2col4);
    
        // Create and set the new scene
        Scene newScene = new Scene(story4Node, 1280, 720);
        primaryStage.setScene(newScene);
        // Add key event listener for arrow keys to navigate scenes
        newScene.setOnKeyPressed(event -> {
            if (event.getCode() == KeyCode.RIGHT) {
                switchToNextScene33(primaryStage);//always the bigger number
            } else if (event.getCode() == KeyCode.LEFT) {
                switchToNextScene31(primaryStage);

            } 
        });
    }

    //calculus joke or java joke
private void switchToNextScene33(Stage primaryStage) {
    // Initialize GridPane for the scene
    GridPane story7Node = new GridPane();

    // Define buttons
    Button story7Option1 = new Button("Calculus Joke");
    story7Option1.setStyle("-fx-background-color:white;-fx-text-fill:black;-fx-font-size:200%;-fx-border-width:3px;-fx-border-color:#554646;-fx-border-radius:3px");
    story7Option1.setFocusTraversable(false);
    story7Option1.setMinWidth(300);
    story7Option1.setMaxWidth(300);
    story7Option1.setMinHeight(100);

    Button story7Option2 = new Button("Java Joke");
    story7Option2.setStyle("-fx-background-color:white;-fx-text-fill:black;-fx-font-size:200%;-fx-border-width:3px;-fx-border-color:#554646;-fx-border-radius:3px");
    story7Option2.setFocusTraversable(false);
    story7Option2.setMinWidth(300);
    story7Option2.setMaxWidth(300);
    story7Option2.setMinHeight(100);

    // Add buttons to GridPane
    story7Node.add(story7Option1, 2, 3);
    story7Node.add(story7Option2, 2, 5);

    // Set row and column constraints
    RowConstraints row1 = new RowConstraints();
    row1.setMinHeight(100);
    RowConstraints row2 = new RowConstraints();
    row2.setMinHeight(100);
    RowConstraints row3 = new RowConstraints();
    row3.setMinHeight(40);
    RowConstraints row4 = new RowConstraints();
    row4.setMinHeight(90);
    RowConstraints row5 = new RowConstraints();
    row5.setMinHeight(110);

    ColumnConstraints col1 = new ColumnConstraints();
    col1.setMinWidth(200);
    ColumnConstraints col2 = new ColumnConstraints();
    col2.setMinWidth(300);
    ColumnConstraints col3 = new ColumnConstraints();
    col3.setMinWidth(200);

    story7Node.getRowConstraints().addAll(row1, row2, row3, row4, row5);
    story7Node.getColumnConstraints().addAll(col1, col2, col3);

    // Set background image
    Image storyBackgroundImage = new Image(getClass().getResourceAsStream("/images/soromanticwoohoo.png"));

   
    BackgroundImage background = new BackgroundImage(storyBackgroundImage, BackgroundRepeat.NO_REPEAT,
    BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, new BackgroundSize(1280, 720, true, true, false, true));
    story7Node.setBackground(new Background(background));

    // Create and set the new scene
    Scene newScene = new Scene(story7Node, 1280, 720);
        primaryStage.setScene(newScene);
    newScene.setOnKeyPressed(event->{
        if(event.getCode()==KeyCode.LEFT){
            switchToNextScene32(primaryStage);
        }
    });
    

    // Optionally add event handlers to buttons
    story7Option1.setOnAction(event->{
        switchToNextScene34(primaryStage);  //calculus joke

    });

    story7Option2.setOnAction(event->{
        switchToNextScene35(primaryStage);  //java joke, and then scene 36 branches back to where Enrqieuz says "oh... that is not so funny" either way

    });
}


private void switchToNextScene34(Stage primaryStage) { 
    GridPane story4Node = new GridPane();
    story4Node.setPadding(new Insets(20));
    story4Node.setHgap(10);
    story4Node.setVgap(10); 
   
      

    // Load and set the background image
    Image storyBackgroundImage = new Image(getClass().getResourceAsStream("/images/classroomenriquehappy.png"));
    BackgroundImage background = new BackgroundImage(storyBackgroundImage, BackgroundRepeat.NO_REPEAT,
            BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, new BackgroundSize(1280, 720, true, true, false, true));
    story4Node.setBackground(new Background(background));
       // Create a Label for the speaker
    Label story2Speaker = new Label();
    story2Speaker.setText("???");
    story2Speaker.setStyle("-fx-text-fill: white; -fx-font-size: 250%; -fx-font-weight: bold;");
    
    story2Speaker.setAlignment(Pos.CENTER_LEFT);
    story2Speaker.setAlignment(Pos.CENTER_LEFT);

    // Create a Label for the story text
    Label story2Label = new Label();
    story2Label.setWrapText(true);
    story2Label.setMinWidth(1140);
    story2Label.setMaxWidth(1140);
    story2Label.setMinHeight(150);
    story2Label.setStyle("-fx-text-fill: black; -fx-font-size: 200%; -fx-background-color: rgba(255,255,255,0.7);");
    story2Label.setAlignment(Pos.CENTER_LEFT);

    // Create blank labels for spacing
    Label story2Blank = new Label();
    story2Blank.setMinWidth(100);
    story2Blank.setMinHeight(0);
    story2Blank.setStyle("-fx-background-color: transparent");

    Label story2Blank1 = new Label();
    story2Blank1.setMinWidth(0);
    story2Blank1.setMinHeight(100);
    story2Blank1.setStyle("-fx-background-color: rgba(255,255,255,0.7)");

    // Animation for text dialogue
    final String story2Content = "         You derive me crazy!";
    final int instantCharactersCount = 10; // Number of characters to show instantly

    final Animation story2Animation = new Transition() {
        {
            setCycleDuration(Duration.millis(3000)); // Total duration for the animated part
        }

        protected void interpolate(double frac) {
            int totalLength = story2Content.length();
            int remainingCharacters = totalLength - instantCharactersCount;
            if (remainingCharacters > 0) {
                // Calculate the index of the last character to be shown for the current fraction
                int index = instantCharactersCount + Math.round(remainingCharacters * (float) frac);
                story2Label.setText(story2Content.substring(0, index));
        }else {
            // If the content is shorter than the number of instant characters, show it all instantly
            story2Label.setText(story2Content);
        }
    };};
    
    story2Animation.play();


    // Add elements to GridPane
    story4Node.add(story2Speaker, 2, 2);
    story4Node.add(story2Label, 2, 3);
    story4Node.add(story2Blank, 1, 2, 1, 1);
    story4Node.add(story2Blank1, 1, 3, 1, 1);

    // Define row and column constraints

    RowConstraints story2row1 = new RowConstraints();
    story2row1.setMinHeight(210);
    RowConstraints story2row2 = new RowConstraints();
    story2row2.setMinHeight(210);
    RowConstraints story2row3 = new RowConstraints();
    story2row3.setMinHeight(0);
    RowConstraints story2row4 = new RowConstraints();
    story2row4.setMinHeight(0);

    
    ColumnConstraints story2col1 = new ColumnConstraints();
    story2col1.setMinWidth(0); // Increase left margin
    ColumnConstraints story2col2 = new ColumnConstraints();
    story2col2.setMinWidth(20); // Spacer or small content
    ColumnConstraints story2col3 = new ColumnConstraints();
    story2col3.setMinWidth(800); // Increase width for main text content
    ColumnConstraints story2col4 = new ColumnConstraints();
    story2col4.setMinWidth(800); // Adjust right padding


    story4Node.getRowConstraints().addAll(story2row1, story2row2, story2row3, story2row4);
    story4Node.getColumnConstraints().addAll(story2col1, story2col2, story2col3, story2col4);

    // Create and set the new scene
    Scene newScene = new Scene(story4Node, 1280, 720);
    primaryStage.setScene(newScene);
    // Add key event listener for arrow keys to navigate scenes
    newScene.setOnKeyPressed(event -> {
        if (event.getCode() == KeyCode.RIGHT) {
            switchToNextScene36(primaryStage);//always the bigger number
        } else if (event.getCode() == KeyCode.LEFT) {
            switchToNextScene34(primaryStage);

        } 
    });
}


private void switchToNextScene35(Stage primaryStage) { 
    GridPane story4Node = new GridPane();
    story4Node.setPadding(new Insets(20));
    story4Node.setHgap(10);
    story4Node.setVgap(10); 
    
      

    // Load and set the background image
    Image storyBackgroundImage = new Image(getClass().getResourceAsStream("/images/classroomenriquehappy.png"));
    BackgroundImage background = new BackgroundImage(storyBackgroundImage, BackgroundRepeat.NO_REPEAT,
            BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, new BackgroundSize(1280, 720, true, true, false, true));
    story4Node.setBackground(new Background(background));
       // Create a Label for the speaker
    Label story2Speaker = new Label();
    story2Speaker.setText("???");
    story2Speaker.setStyle("-fx-text-fill: white; -fx-font-size: 250%; -fx-font-weight: bold;");
    
    story2Speaker.setAlignment(Pos.CENTER_LEFT);
    story2Speaker.setAlignment(Pos.CENTER_LEFT);

    // Create a Label for the story text
    Label story2Label = new Label();
    story2Label.setWrapText(true);
    story2Label.setMinWidth(1140);
    story2Label.setMaxWidth(1140);
    story2Label.setMinHeight(150);
    story2Label.setStyle("-fx-text-fill: black; -fx-font-size: 200%; -fx-background-color: rgba(255,255,255,0.7);");
    story2Label.setAlignment(Pos.CENTER_LEFT);

    // Create blank labels for spacing
    Label story2Blank = new Label();
    story2Blank.setMinWidth(100);
    story2Blank.setMinHeight(0);
    story2Blank.setStyle("-fx-background-color: transparent");

    Label story2Blank1 = new Label();
    story2Blank1.setMinWidth(0);
    story2Blank1.setMinHeight(100);
    story2Blank1.setStyle("-fx-background-color: rgba(255,255,255,0.7)");

    // Animation for text dialogue
    final String story2Content = "         Yo mama’s SO FAT running her weight in Java results in an INTEGER OVERFLOW ERROR";
    final int instantCharactersCount = 10; // Number of characters to show instantly

    final Animation story2Animation = new Transition() {
        {
            setCycleDuration(Duration.millis(3000)); // Total duration for the animated part
        }

        protected void interpolate(double frac) {
            int totalLength = story2Content.length();
            int remainingCharacters = totalLength - instantCharactersCount;
            if (remainingCharacters > 0) {
                // Calculate the index of the last character to be shown for the current fraction
                int index = instantCharactersCount + Math.round(remainingCharacters * (float) frac);
                story2Label.setText(story2Content.substring(0, index));
        }else {
            // If the content is shorter than the number of instant characters, show it all instantly
            story2Label.setText(story2Content);
        }
    };};
    
    story2Animation.play();


    // Add elements to GridPane
    story4Node.add(story2Speaker, 2, 2);
    story4Node.add(story2Label, 2, 3);
    story4Node.add(story2Blank, 1, 2, 1, 1);
    story4Node.add(story2Blank1, 1, 3, 1, 1);

    // Define row and column constraints

    RowConstraints story2row1 = new RowConstraints();
    story2row1.setMinHeight(210);
    RowConstraints story2row2 = new RowConstraints();
    story2row2.setMinHeight(210);
    RowConstraints story2row3 = new RowConstraints();
    story2row3.setMinHeight(0);
    RowConstraints story2row4 = new RowConstraints();
    story2row4.setMinHeight(0);

    
    ColumnConstraints story2col1 = new ColumnConstraints();
    story2col1.setMinWidth(0); // Increase left margin
    ColumnConstraints story2col2 = new ColumnConstraints();
    story2col2.setMinWidth(20); // Spacer or small content
    ColumnConstraints story2col3 = new ColumnConstraints();
    story2col3.setMinWidth(800); // Increase width for main text content
    ColumnConstraints story2col4 = new ColumnConstraints();
    story2col4.setMinWidth(800); // Adjust right padding


    story4Node.getRowConstraints().addAll(story2row1, story2row2, story2row3, story2row4);
    story4Node.getColumnConstraints().addAll(story2col1, story2col2, story2col3, story2col4);

    // Create and set the new scene
    Scene newScene = new Scene(story4Node, 1280, 720);
    primaryStage.setScene(newScene);
    // Add key event listener for arrow keys to navigate scenes
    newScene.setOnKeyPressed(event -> {
        if (event.getCode() == KeyCode.RIGHT) {
            switchToNextScene36(primaryStage);//always the bigger number
        } else if (event.getCode() == KeyCode.LEFT) {
            switchToNextScene34(primaryStage);

        } 
    });
}





private void switchToNextScene36(Stage primaryStage) { 
    GridPane story4Node = new GridPane();
    story4Node.setPadding(new Insets(20));
    story4Node.setHgap(10);
    story4Node.setVgap(10); 
   
      

    // Load and set the background image
    Image storyBackgroundImage = new Image(getClass().getResourceAsStream("/images/surprisedenrique.png"));
    BackgroundImage background = new BackgroundImage(storyBackgroundImage, BackgroundRepeat.NO_REPEAT,
            BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, new BackgroundSize(1280, 720, true, true, false, true));
    story4Node.setBackground(new Background(background));
       // Create a Label for the speaker
    Label story2Speaker = new Label();
    story2Speaker.setText("Mr. Enriquez");
    story2Speaker.setStyle("-fx-text-fill: white; -fx-font-size: 250%; -fx-font-weight: bold;");
    
    story2Speaker.setAlignment(Pos.CENTER_LEFT);
    story2Speaker.setAlignment(Pos.CENTER_LEFT);

    // Create a Label for the story text
    Label story2Label = new Label();
    story2Label.setWrapText(true);
    story2Label.setMinWidth(1140);
    story2Label.setMaxWidth(1140);
    story2Label.setMinHeight(150);
    story2Label.setStyle("-fx-text-fill: black; -fx-font-size: 200%; -fx-background-color: rgba(255,255,255,0.7);");
    story2Label.setAlignment(Pos.CENTER_LEFT);

    // Create blank labels for spacing
    Label story2Blank = new Label();
    story2Blank.setMinWidth(100);
    story2Blank.setMinHeight(0);
    story2Blank.setStyle("-fx-background-color: transparent");

    Label story2Blank1 = new Label();
    story2Blank1.setMinWidth(0);
    story2Blank1.setMinHeight(100);
    story2Blank1.setStyle("-fx-background-color: rgba(255,255,255,0.7)");

    // Animation for text dialogue
    final String story2Content = "         ..............................";
    final int instantCharactersCount = 10; // Number of characters to show instantly

    final Animation story2Animation = new Transition() {
        {
            setCycleDuration(Duration.millis(3000)); // Total duration for the animated part
        }

        protected void interpolate(double frac) {
            int totalLength = story2Content.length();
            int remainingCharacters = totalLength - instantCharactersCount;
            if (remainingCharacters > 0) {
                // Calculate the index of the last character to be shown for the current fraction
                int index = instantCharactersCount + Math.round(remainingCharacters * (float) frac);
                story2Label.setText(story2Content.substring(0, index));
        }else {
            // If the content is shorter than the number of instant characters, show it all instantly
            story2Label.setText(story2Content);
        }
    };};
    
    story2Animation.play();


    // Add elements to GridPane
    story4Node.add(story2Speaker, 2, 2);
    story4Node.add(story2Label, 2, 3);
    story4Node.add(story2Blank, 1, 2, 1, 1);
    story4Node.add(story2Blank1, 1, 3, 1, 1);

    // Define row and column constraints

    RowConstraints story2row1 = new RowConstraints();
    story2row1.setMinHeight(210);
    RowConstraints story2row2 = new RowConstraints();
    story2row2.setMinHeight(210);
    RowConstraints story2row3 = new RowConstraints();
    story2row3.setMinHeight(0);
    RowConstraints story2row4 = new RowConstraints();
    story2row4.setMinHeight(0);

    
    ColumnConstraints story2col1 = new ColumnConstraints();
    story2col1.setMinWidth(0); // Increase left margin
    ColumnConstraints story2col2 = new ColumnConstraints();
    story2col2.setMinWidth(20); // Spacer or small content
    ColumnConstraints story2col3 = new ColumnConstraints();
    story2col3.setMinWidth(800); // Increase width for main text content
    ColumnConstraints story2col4 = new ColumnConstraints();
    story2col4.setMinWidth(800); // Adjust right padding


    story4Node.getRowConstraints().addAll(story2row1, story2row2, story2row3, story2row4);
    story4Node.getColumnConstraints().addAll(story2col1, story2col2, story2col3, story2col4);

    // Create and set the new scene
    Scene newScene = new Scene(story4Node, 1280, 720);
    primaryStage.setScene(newScene);
    // Add key event listener for arrow keys to navigate scenes
    newScene.setOnKeyPressed(event -> {
        if (event.getCode() == KeyCode.RIGHT) {
            switchToNextScene37(primaryStage);//always the bigger number
        } else if (event.getCode() == KeyCode.LEFT) {
            switchToNextScene32(primaryStage);

        } 
    });
}




private void switchToNextScene37(Stage primaryStage) { 
    GridPane story4Node = new GridPane();
    story4Node.setPadding(new Insets(20));
    story4Node.setHgap(10);
    story4Node.setVgap(10); 
    

    // Load and set the background image
    Image storyBackgroundImage = new Image(getClass().getResourceAsStream("/images/surprisedenrique.png"));
    BackgroundImage background = new BackgroundImage(storyBackgroundImage, BackgroundRepeat.NO_REPEAT,
            BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, new BackgroundSize(1280, 720, true, true, false, true));
    story4Node.setBackground(new Background(background));
       // Create a Label for the speaker
    Label story2Speaker = new Label();
    story2Speaker.setText("Mr. Enriquez");
    story2Speaker.setStyle("-fx-text-fill: white; -fx-font-size: 250%; -fx-font-weight: bold;");
    
    story2Speaker.setAlignment(Pos.CENTER_LEFT);
    story2Speaker.setAlignment(Pos.CENTER_LEFT);

    // Create a Label for the story text
    Label story2Label = new Label();
    story2Label.setWrapText(true);
    story2Label.setMinWidth(1140);
    story2Label.setMaxWidth(1140);
    story2Label.setMinHeight(150);
    story2Label.setStyle("-fx-text-fill: black; -fx-font-size: 200%; -fx-background-color: rgba(255,255,255,0.7);");
    story2Label.setAlignment(Pos.CENTER_LEFT);

    // Create blank labels for spacing
    Label story2Blank = new Label();
    story2Blank.setMinWidth(100);
    story2Blank.setMinHeight(0);
    story2Blank.setStyle("-fx-background-color: transparent");

    Label story2Blank1 = new Label();
    story2Blank1.setMinWidth(0);
    story2Blank1.setMinHeight(100);
    story2Blank1.setStyle("-fx-background-color: rgba(255,255,255,0.7)");

    // Animation for text dialogue
    final String story2Content = "         That's a little offensive, isn't it...";
    final int instantCharactersCount = 10; // Number of characters to show instantly

    final Animation story2Animation = new Transition() {
        {
            setCycleDuration(Duration.millis(3000)); // Total duration for the animated part
        }

        protected void interpolate(double frac) {
            int totalLength = story2Content.length();
            int remainingCharacters = totalLength - instantCharactersCount;
            if (remainingCharacters > 0) {
                // Calculate the index of the last character to be shown for the current fraction
                int index = instantCharactersCount + Math.round(remainingCharacters * (float) frac);
                story2Label.setText(story2Content.substring(0, index));
        }else {
            // If the content is shorter than the number of instant characters, show it all instantly
            story2Label.setText(story2Content);
        }
    };};
    
    story2Animation.play();


    // Add elements to GridPane
    story4Node.add(story2Speaker, 2, 2);
    story4Node.add(story2Label, 2, 3);
    story4Node.add(story2Blank, 1, 2, 1, 1);
    story4Node.add(story2Blank1, 1, 3, 1, 1);

    // Define row and column constraints

    RowConstraints story2row1 = new RowConstraints();
    story2row1.setMinHeight(210);
    RowConstraints story2row2 = new RowConstraints();
    story2row2.setMinHeight(210);
    RowConstraints story2row3 = new RowConstraints();
    story2row3.setMinHeight(0);
    RowConstraints story2row4 = new RowConstraints();
    story2row4.setMinHeight(0);

    
    ColumnConstraints story2col1 = new ColumnConstraints();
    story2col1.setMinWidth(0); // Increase left margin
    ColumnConstraints story2col2 = new ColumnConstraints();
    story2col2.setMinWidth(20); // Spacer or small content
    ColumnConstraints story2col3 = new ColumnConstraints();
    story2col3.setMinWidth(800); // Increase width for main text content
    ColumnConstraints story2col4 = new ColumnConstraints();
    story2col4.setMinWidth(800); // Adjust right padding


    story4Node.getRowConstraints().addAll(story2row1, story2row2, story2row3, story2row4);
    story4Node.getColumnConstraints().addAll(story2col1, story2col2, story2col3, story2col4);

    // Create and set the new scene
    Scene newScene = new Scene(story4Node, 1280, 720);
    primaryStage.setScene(newScene);
    // Add key event listener for arrow keys to navigate scenes
    newScene.setOnKeyPressed(event -> {
        if (event.getCode() == KeyCode.RIGHT) {
            switchToNextScene38(primaryStage);//always the bigger number
        } else if (event.getCode() == KeyCode.LEFT) {
            switchToNextScene36(primaryStage);

        } 
    });
}





private void switchToNextScene38(Stage primaryStage) { 
    GridPane story4Node = new GridPane();
    story4Node.setPadding(new Insets(20));
    story4Node.setHgap(10);
    story4Node.setVgap(10); 

      

    // Load and set the background image
    Image storyBackgroundImage = new Image(getClass().getResourceAsStream("/images/surprisedenrique.png"));
    BackgroundImage background = new BackgroundImage(storyBackgroundImage, BackgroundRepeat.NO_REPEAT,
            BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, new BackgroundSize(1280, 720, true, true, false, true));
    story4Node.setBackground(new Background(background));
       // Create a Label for the speaker
    Label story2Speaker = new Label();
    story2Speaker.setText("???");
    story2Speaker.setStyle("-fx-text-fill: white; -fx-font-size: 250%; -fx-font-weight: bold;");
    
    story2Speaker.setAlignment(Pos.CENTER_LEFT);
    story2Speaker.setAlignment(Pos.CENTER_LEFT);

    // Create a Label for the story text
    Label story2Label = new Label();
    story2Label.setWrapText(true);
    story2Label.setMinWidth(1140);
    story2Label.setMaxWidth(1140);
    story2Label.setMinHeight(150);
    story2Label.setStyle("-fx-text-fill: black; -fx-font-size: 200%; -fx-background-color: rgba(255,255,255,0.7);");
    story2Label.setAlignment(Pos.CENTER_LEFT);

    // Create blank labels for spacing
    Label story2Blank = new Label();
    story2Blank.setMinWidth(100);
    story2Blank.setMinHeight(0);
    story2Blank.setStyle("-fx-background-color: transparent");

    Label story2Blank1 = new Label();
    story2Blank1.setMinWidth(0);
    story2Blank1.setMinHeight(100);
    story2Blank1.setStyle("-fx-background-color: rgba(255,255,255,0.7)");

    // Animation for text dialogue
    final String story2Content = "         Heck! My joke game wasn’t very #poggers it seems. Time to go watch K-Dramas and cry on my desk...";
    final int instantCharactersCount = 10; // Number of characters to show instantly

    final Animation story2Animation = new Transition() {
        {
            setCycleDuration(Duration.millis(3000)); // Total duration for the animated part
        }

        protected void interpolate(double frac) {
            int totalLength = story2Content.length();
            int remainingCharacters = totalLength - instantCharactersCount;
            if (remainingCharacters > 0) {
                // Calculate the index of the last character to be shown for the current fraction
                int index = instantCharactersCount + Math.round(remainingCharacters * (float) frac);
                story2Label.setText(story2Content.substring(0, index));
        }else {
            // If the content is shorter than the number of instant characters, show it all instantly
            story2Label.setText(story2Content);
        }
    };};
    
    story2Animation.play();


    // Add elements to GridPane
    story4Node.add(story2Speaker, 2, 2);
    story4Node.add(story2Label, 2, 3);
    story4Node.add(story2Blank, 1, 2, 1, 1);
    story4Node.add(story2Blank1, 1, 3, 1, 1);

    // Define row and column constraints

    RowConstraints story2row1 = new RowConstraints();
    story2row1.setMinHeight(210);
    RowConstraints story2row2 = new RowConstraints();
    story2row2.setMinHeight(210);
    RowConstraints story2row3 = new RowConstraints();
    story2row3.setMinHeight(0);
    RowConstraints story2row4 = new RowConstraints();
    story2row4.setMinHeight(0);

    
    ColumnConstraints story2col1 = new ColumnConstraints();
    story2col1.setMinWidth(0); // Increase left margin
    ColumnConstraints story2col2 = new ColumnConstraints();
    story2col2.setMinWidth(20); // Spacer or small content
    ColumnConstraints story2col3 = new ColumnConstraints();
    story2col3.setMinWidth(800); // Increase width for main text content
    ColumnConstraints story2col4 = new ColumnConstraints();
    story2col4.setMinWidth(800); // Adjust right padding


    story4Node.getRowConstraints().addAll(story2row1, story2row2, story2row3, story2row4);
    story4Node.getColumnConstraints().addAll(story2col1, story2col2, story2col3, story2col4);

    // Create and set the new scene
    Scene newScene = new Scene(story4Node, 1280, 720);
    primaryStage.setScene(newScene);
    // Add key event listener for arrow keys to navigate scenes
    newScene.setOnKeyPressed(event -> {
        if (event.getCode() == KeyCode.RIGHT) {
            switchToNextScene39(primaryStage);//always the bigger number
        } else if (event.getCode() == KeyCode.LEFT) {
            switchToNextScene37(primaryStage);

        } 
    });
}


//rememebr to fade scnee 

private void switchToNextScene39(Stage primaryStage) { 
    GridPane story4Node = new GridPane();
    story4Node.setPadding(new Insets(20));
    story4Node.setHgap(10);
    story4Node.setVgap(10); 
    applyFadeTransition(story4Node);
      

    // Load and set the background image
    Image storyBackgroundImage = new Image(getClass().getResourceAsStream("/images/demonslayer.png"));
    BackgroundImage background = new BackgroundImage(storyBackgroundImage, BackgroundRepeat.NO_REPEAT,
            BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, new BackgroundSize(1280, 720, true, true, false, true));
    story4Node.setBackground(new Background(background));
       // Create a Label for the speaker
    Label story2Speaker = new Label();
    story2Speaker.setText("Narrator");
    story2Speaker.setStyle("-fx-text-fill: white; -fx-font-size: 250%; -fx-font-weight: bold;");
    
    story2Speaker.setAlignment(Pos.CENTER_LEFT);
    story2Speaker.setAlignment(Pos.CENTER_LEFT);

    // Create a Label for the story text
    Label story2Label = new Label();
    story2Label.setWrapText(true);
    story2Label.setMinWidth(1140);
    story2Label.setMaxWidth(1140);
    story2Label.setMinHeight(150);
    story2Label.setStyle("-fx-text-fill: black; -fx-font-size: 200%; -fx-background-color: rgba(255,255,255,0.7);");
    story2Label.setAlignment(Pos.CENTER_LEFT);

    // Create blank labels for spacing
    Label story2Blank = new Label();
    story2Blank.setMinWidth(100);
    story2Blank.setMinHeight(0);
    story2Blank.setStyle("-fx-background-color: transparent");

    Label story2Blank1 = new Label();
    story2Blank1.setMinWidth(0);
    story2Blank1.setMinHeight(100);
    story2Blank1.setStyle("-fx-background-color: rgba(255,255,255,0.7)");

    // Animation for text dialogue
    final String story2Content = "         You are reading your favorite manga, Demon Slayer.";
    final int instantCharactersCount = 10; // Number of characters to show instantly

    final Animation story2Animation = new Transition() {
        {
            setCycleDuration(Duration.millis(3000)); // Total duration for the animated part
        }

        protected void interpolate(double frac) {
            int totalLength = story2Content.length();
            int remainingCharacters = totalLength - instantCharactersCount;
            if (remainingCharacters > 0) {
                // Calculate the index of the last character to be shown for the current fraction
                int index = instantCharactersCount + Math.round(remainingCharacters * (float) frac);
                story2Label.setText(story2Content.substring(0, index));
        }else {
            // If the content is shorter than the number of instant characters, show it all instantly
            story2Label.setText(story2Content);
        }
    };};
    
    story2Animation.play();


    // Add elements to GridPane
    story4Node.add(story2Speaker, 2, 2);
    story4Node.add(story2Label, 2, 3);
    story4Node.add(story2Blank, 1, 2, 1, 1);
    story4Node.add(story2Blank1, 1, 3, 1, 1);

    // Define row and column constraints

    RowConstraints story2row1 = new RowConstraints();
    story2row1.setMinHeight(210);
    RowConstraints story2row2 = new RowConstraints();
    story2row2.setMinHeight(210);
    RowConstraints story2row3 = new RowConstraints();
    story2row3.setMinHeight(0);
    RowConstraints story2row4 = new RowConstraints();
    story2row4.setMinHeight(0);

    
    ColumnConstraints story2col1 = new ColumnConstraints();
    story2col1.setMinWidth(0); // Increase left margin
    ColumnConstraints story2col2 = new ColumnConstraints();
    story2col2.setMinWidth(20); // Spacer or small content
    ColumnConstraints story2col3 = new ColumnConstraints();
    story2col3.setMinWidth(800); // Increase width for main text content
    ColumnConstraints story2col4 = new ColumnConstraints();
    story2col4.setMinWidth(800); // Adjust right padding


    story4Node.getRowConstraints().addAll(story2row1, story2row2, story2row3, story2row4);
    story4Node.getColumnConstraints().addAll(story2col1, story2col2, story2col3, story2col4);

    // Create and set the new scene
    Scene newScene = new Scene(story4Node, 1280, 720);
    primaryStage.setScene(newScene);
    // Add key event listener for arrow keys to navigate scenes
    newScene.setOnKeyPressed(event -> {
        if (event.getCode() == KeyCode.RIGHT) {
            switchToNextScene40(primaryStage);//always the bigger number
        } else if (event.getCode() == KeyCode.LEFT) {
            switchToNextScene38(primaryStage);

        } 
    });
}


private void switchToNextScene40(Stage primaryStage) { 
    GridPane story4Node = new GridPane();
    story4Node.setPadding(new Insets(20));
    story4Node.setHgap(10);
    story4Node.setVgap(10); 
   
      

    // Load and set the background image
    Image storyBackgroundImage = new Image(getClass().getResourceAsStream("/images/wificut.png"));
    BackgroundImage background = new BackgroundImage(storyBackgroundImage, BackgroundRepeat.NO_REPEAT,
            BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, new BackgroundSize(1280, 720, true, true, false, true));
    story4Node.setBackground(new Background(background));
       // Create a Label for the speaker
    Label story2Speaker = new Label();
    story2Speaker.setText("Narrator");
    story2Speaker.setStyle("-fx-text-fill: white; -fx-font-size: 250%; -fx-font-weight: bold;");
    
    story2Speaker.setAlignment(Pos.CENTER_LEFT);
    story2Speaker.setAlignment(Pos.CENTER_LEFT);

    // Create a Label for the story text
    Label story2Label = new Label();
    story2Label.setWrapText(true);
    story2Label.setMinWidth(1140);
    story2Label.setMaxWidth(1140);
    story2Label.setMinHeight(150);
    story2Label.setStyle("-fx-text-fill: black; -fx-font-size: 200%; -fx-background-color: rgba(255,255,255,0.7);");
    story2Label.setAlignment(Pos.CENTER_LEFT);

    // Create blank labels for spacing
    Label story2Blank = new Label();
    story2Blank.setMinWidth(100);
    story2Blank.setMinHeight(0);
    story2Blank.setStyle("-fx-background-color: transparent");

    Label story2Blank1 = new Label();
    story2Blank1.setMinWidth(0);
    story2Blank1.setMinHeight(100);
    story2Blank1.setStyle("-fx-background-color: rgba(255,255,255,0.7)");

    // Animation for text dialogue
    final String story2Content = "         Suddenly, the wifi cuts.... You are mad! RGRRH..!!! You were getting to the best part!";
    final int instantCharactersCount = 10; // Number of characters to show instantly

    final Animation story2Animation = new Transition() {
        {
            setCycleDuration(Duration.millis(3000)); // Total duration for the animated part
        }

        protected void interpolate(double frac) {
            int totalLength = story2Content.length();
            int remainingCharacters = totalLength - instantCharactersCount;
            if (remainingCharacters > 0) {
                // Calculate the index of the last character to be shown for the current fraction
                int index = instantCharactersCount + Math.round(remainingCharacters * (float) frac);
                story2Label.setText(story2Content.substring(0, index));
        }else {
            // If the content is shorter than the number of instant characters, show it all instantly
            story2Label.setText(story2Content);
        }
    };};
    
    story2Animation.play();


    // Add elements to GridPane
    story4Node.add(story2Speaker, 2, 2);
    story4Node.add(story2Label, 2, 3);
    story4Node.add(story2Blank, 1, 2, 1, 1);
    story4Node.add(story2Blank1, 1, 3, 1, 1);

    // Define row and column constraints

    RowConstraints story2row1 = new RowConstraints();
    story2row1.setMinHeight(210);
    RowConstraints story2row2 = new RowConstraints();
    story2row2.setMinHeight(210);
    RowConstraints story2row3 = new RowConstraints();
    story2row3.setMinHeight(0);
    RowConstraints story2row4 = new RowConstraints();
    story2row4.setMinHeight(0);

    
    ColumnConstraints story2col1 = new ColumnConstraints();
    story2col1.setMinWidth(0); // Increase left margin
    ColumnConstraints story2col2 = new ColumnConstraints();
    story2col2.setMinWidth(20); // Spacer or small content
    ColumnConstraints story2col3 = new ColumnConstraints();
    story2col3.setMinWidth(800); // Increase width for main text content
    ColumnConstraints story2col4 = new ColumnConstraints();
    story2col4.setMinWidth(800); // Adjust right padding


    story4Node.getRowConstraints().addAll(story2row1, story2row2, story2row3, story2row4);
    story4Node.getColumnConstraints().addAll(story2col1, story2col2, story2col3, story2col4);

    // Create and set the new scene
    Scene newScene = new Scene(story4Node, 1280, 720);
    primaryStage.setScene(newScene);
    // Add key event listener for arrow keys to navigate scenes
    newScene.setOnKeyPressed(event -> {
        if (event.getCode() == KeyCode.RIGHT) {
            switchToNextScene41(primaryStage);//always the bigger number
        } else if (event.getCode() == KeyCode.LEFT) {
            switchToNextScene39(primaryStage);

        } 
    });
}



private void switchToNextScene41(Stage primaryStage) { 
    GridPane story4Node = new GridPane();
    story4Node.setPadding(new Insets(20));
    story4Node.setHgap(10);
    story4Node.setVgap(10); 
    
      

    // Load and set the background image
    Image storyBackgroundImage = new Image(getClass().getResourceAsStream("/images/phone.png"));
    BackgroundImage background = new BackgroundImage(storyBackgroundImage, BackgroundRepeat.NO_REPEAT,
            BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, new BackgroundSize(1280, 720, true, true, false, true));
    story4Node.setBackground(new Background(background));
       // Create a Label for the speaker
    Label story2Speaker = new Label();
    story2Speaker.setText("Narrator");
    story2Speaker.setStyle("-fx-text-fill: white; -fx-font-size: 250%; -fx-font-weight: bold;");
    
    story2Speaker.setAlignment(Pos.CENTER_LEFT);
    story2Speaker.setAlignment(Pos.CENTER_LEFT);

    // Create a Label for the story text
    Label story2Label = new Label();
    story2Label.setWrapText(true);
    story2Label.setMinWidth(1140);
    story2Label.setMaxWidth(1140);
    story2Label.setMinHeight(150);
    story2Label.setStyle("-fx-text-fill: black; -fx-font-size: 200%; -fx-background-color: rgba(255,255,255,0.7);");
    story2Label.setAlignment(Pos.CENTER_LEFT);

    // Create blank labels for spacing
    Label story2Blank = new Label();
    story2Blank.setMinWidth(100);
    story2Blank.setMinHeight(0);
    story2Blank.setStyle("-fx-background-color: transparent");

    Label story2Blank1 = new Label();
    story2Blank1.setMinWidth(0);
    story2Blank1.setMinHeight(100);
    story2Blank1.setStyle("-fx-background-color: rgba(255,255,255,0.7)");

    // Animation for text dialogue
    final String story2Content = "         You call Mr. Enriquez on the phone.";
    final int instantCharactersCount = 10; // Number of characters to show instantly

    final Animation story2Animation = new Transition() {
        {
            setCycleDuration(Duration.millis(3000)); // Total duration for the animated part
        }

        protected void interpolate(double frac) {
            int totalLength = story2Content.length();
            int remainingCharacters = totalLength - instantCharactersCount;
            if (remainingCharacters > 0) {
                // Calculate the index of the last character to be shown for the current fraction
                int index = instantCharactersCount + Math.round(remainingCharacters * (float) frac);
                story2Label.setText(story2Content.substring(0, index));
        }else {
            // If the content is shorter than the number of instant characters, show it all instantly
            story2Label.setText(story2Content);
        }
    };};
    
    story2Animation.play();


    // Add elements to GridPane
    story4Node.add(story2Speaker, 2, 2);
    story4Node.add(story2Label, 2, 3);
    story4Node.add(story2Blank, 1, 2, 1, 1);
    story4Node.add(story2Blank1, 1, 3, 1, 1);

    // Define row and column constraints

    RowConstraints story2row1 = new RowConstraints();
    story2row1.setMinHeight(210);
    RowConstraints story2row2 = new RowConstraints();
    story2row2.setMinHeight(210);
    RowConstraints story2row3 = new RowConstraints();
    story2row3.setMinHeight(0);
    RowConstraints story2row4 = new RowConstraints();
    story2row4.setMinHeight(0);

    
    ColumnConstraints story2col1 = new ColumnConstraints();
    story2col1.setMinWidth(0); // Increase left margin
    ColumnConstraints story2col2 = new ColumnConstraints();
    story2col2.setMinWidth(20); // Spacer or small content
    ColumnConstraints story2col3 = new ColumnConstraints();
    story2col3.setMinWidth(800); // Increase width for main text content
    ColumnConstraints story2col4 = new ColumnConstraints();
    story2col4.setMinWidth(800); // Adjust right padding


    story4Node.getRowConstraints().addAll(story2row1, story2row2, story2row3, story2row4);
    story4Node.getColumnConstraints().addAll(story2col1, story2col2, story2col3, story2col4);

    // Create and set the new scene
    Scene newScene = new Scene(story4Node, 1280, 720);
    primaryStage.setScene(newScene);
    // Add key event listener for arrow keys to navigate scenes
    newScene.setOnKeyPressed(event -> {
        if (event.getCode() == KeyCode.RIGHT) {
            switchToNextScene42(primaryStage);//always the bigger number
        } else if (event.getCode() == KeyCode.LEFT) {
            switchToNextScene40(primaryStage);

        } 
    });
}


private void switchToNextScene42(Stage primaryStage) { 
    GridPane story4Node = new GridPane();
    story4Node.setPadding(new Insets(20));
    story4Node.setHgap(10);
    story4Node.setVgap(10); 
  
      

    // Load and set the background image
    Image storyBackgroundImage = new Image(getClass().getResourceAsStream("/images/phonewithguy.png"));
    BackgroundImage background = new BackgroundImage(storyBackgroundImage, BackgroundRepeat.NO_REPEAT,
            BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, new BackgroundSize(1280, 720, true, true, false, true));
    story4Node.setBackground(new Background(background));
       // Create a Label for the speaker
    Label story2Speaker = new Label();
    story2Speaker.setText("???");
    story2Speaker.setStyle("-fx-text-fill: white; -fx-font-size: 250%; -fx-font-weight: bold;");
    
    story2Speaker.setAlignment(Pos.CENTER_LEFT);
    story2Speaker.setAlignment(Pos.CENTER_LEFT);

    // Create a Label for the story text
    Label story2Label = new Label();
    story2Label.setWrapText(true);
    story2Label.setMinWidth(1140);
    story2Label.setMaxWidth(1140);
    story2Label.setMinHeight(150);
    story2Label.setStyle("-fx-text-fill: black; -fx-font-size: 200%; -fx-background-color: rgba(255,255,255,0.7);");
    story2Label.setAlignment(Pos.CENTER_LEFT);

    // Create blank labels for spacing
    Label story2Blank = new Label();
    story2Blank.setMinWidth(100);
    story2Blank.setMinHeight(0);
    story2Blank.setStyle("-fx-background-color: transparent");

    Label story2Blank1 = new Label();
    story2Blank1.setMinWidth(0);
    story2Blank1.setMinHeight(100);
    story2Blank1.setStyle("-fx-background-color: rgba(255,255,255,0.7)");

    // Animation for text dialogue
    final String story2Content = "         K-Kamusta kuya Rey..! Uh-uh- erm.. w-what's the wifi password?";
    final int instantCharactersCount = 10; // Number of characters to show instantly

    final Animation story2Animation = new Transition() {
        {
            setCycleDuration(Duration.millis(3000)); // Total duration for the animated part
        }

        protected void interpolate(double frac) {
            int totalLength = story2Content.length();
            int remainingCharacters = totalLength - instantCharactersCount;
            if (remainingCharacters > 0) {
                // Calculate the index of the last character to be shown for the current fraction
                int index = instantCharactersCount + Math.round(remainingCharacters * (float) frac);
                story2Label.setText(story2Content.substring(0, index));
        }else {
            // If the content is shorter than the number of instant characters, show it all instantly
            story2Label.setText(story2Content);
        }
    };};
    
    story2Animation.play();


    // Add elements to GridPane
    story4Node.add(story2Speaker, 2, 2);
    story4Node.add(story2Label, 2, 3);
    story4Node.add(story2Blank, 1, 2, 1, 1);
    story4Node.add(story2Blank1, 1, 3, 1, 1);

    // Define row and column constraints

    RowConstraints story2row1 = new RowConstraints();
    story2row1.setMinHeight(210);
    RowConstraints story2row2 = new RowConstraints();
    story2row2.setMinHeight(210);
    RowConstraints story2row3 = new RowConstraints();
    story2row3.setMinHeight(0);
    RowConstraints story2row4 = new RowConstraints();
    story2row4.setMinHeight(0);

    
    ColumnConstraints story2col1 = new ColumnConstraints();
    story2col1.setMinWidth(0); // Increase left margin
    ColumnConstraints story2col2 = new ColumnConstraints();
    story2col2.setMinWidth(20); // Spacer or small content
    ColumnConstraints story2col3 = new ColumnConstraints();
    story2col3.setMinWidth(800); // Increase width for main text content
    ColumnConstraints story2col4 = new ColumnConstraints();
    story2col4.setMinWidth(800); // Adjust right padding


    story4Node.getRowConstraints().addAll(story2row1, story2row2, story2row3, story2row4);
    story4Node.getColumnConstraints().addAll(story2col1, story2col2, story2col3, story2col4);

    // Create and set the new scene
    Scene newScene = new Scene(story4Node, 1280, 720);
    primaryStage.setScene(newScene);
    // Add key event listener for arrow keys to navigate scenes
    newScene.setOnKeyPressed(event -> {
        if (event.getCode() == KeyCode.RIGHT) {
            switchToNextScene43(primaryStage);//always the bigger number
        } else if (event.getCode() == KeyCode.LEFT) {
            switchToNextScene41(primaryStage);

        } 
    });
}




private void switchToNextScene43(Stage primaryStage) { 
    GridPane story4Node = new GridPane();
    story4Node.setPadding(new Insets(20));
    story4Node.setHgap(10);
    story4Node.setVgap(10); 
  
      

    // Load and set the background image
    Image storyBackgroundImage = new Image(getClass().getResourceAsStream("/images/phonewithguysurprise.png"));
    BackgroundImage background = new BackgroundImage(storyBackgroundImage, BackgroundRepeat.NO_REPEAT,
            BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, new BackgroundSize(1280, 720, true, true, false, true));
    story4Node.setBackground(new Background(background));
       // Create a Label for the speaker
    Label story2Speaker = new Label();
    story2Speaker.setText("Mr. Enriquez");
    story2Speaker.setStyle("-fx-text-fill: white; -fx-font-size: 250%; -fx-font-weight: bold;");
    
    story2Speaker.setAlignment(Pos.CENTER_LEFT);
    story2Speaker.setAlignment(Pos.CENTER_LEFT);

    // Create a Label for the story text
    Label story2Label = new Label();
    story2Label.setWrapText(true);
    story2Label.setMinWidth(1140);
    story2Label.setMaxWidth(1140);
    story2Label.setMinHeight(150);
    story2Label.setStyle("-fx-text-fill: black; -fx-font-size: 200%; -fx-background-color: rgba(255,255,255,0.7);");
    story2Label.setAlignment(Pos.CENTER_LEFT);

    // Create blank labels for spacing
    Label story2Blank = new Label();
    story2Blank.setMinWidth(100);
    story2Blank.setMinHeight(0);
    story2Blank.setStyle("-fx-background-color: transparent");

    Label story2Blank1 = new Label();
    story2Blank1.setMinWidth(0);
    story2Blank1.setMinHeight(100);
    story2Blank1.setStyle("-fx-background-color: rgba(255,255,255,0.7)");

    // Animation for text dialogue
    final String story2Content = "         Kamusta. I’ll tell you if you can complete these three Calculus problems.";
    final int instantCharactersCount = 10; // Number of characters to show instantly

    final Animation story2Animation = new Transition() {
        {
            setCycleDuration(Duration.millis(3000)); // Total duration for the animated part
        }

        protected void interpolate(double frac) {
            int totalLength = story2Content.length();
            int remainingCharacters = totalLength - instantCharactersCount;
            if (remainingCharacters > 0) {
                // Calculate the index of the last character to be shown for the current fraction
                int index = instantCharactersCount + Math.round(remainingCharacters * (float) frac);
                story2Label.setText(story2Content.substring(0, index));
        }else {
            // If the content is shorter than the number of instant characters, show it all instantly
            story2Label.setText(story2Content);
        }
    };};
    
    story2Animation.play();


    // Add elements to GridPane
    story4Node.add(story2Speaker, 2, 2);
    story4Node.add(story2Label, 2, 3);
    story4Node.add(story2Blank, 1, 2, 1, 1);
    story4Node.add(story2Blank1, 1, 3, 1, 1);

    // Define row and column constraints

    RowConstraints story2row1 = new RowConstraints();
    story2row1.setMinHeight(210);
    RowConstraints story2row2 = new RowConstraints();
    story2row2.setMinHeight(210);
    RowConstraints story2row3 = new RowConstraints();
    story2row3.setMinHeight(0);
    RowConstraints story2row4 = new RowConstraints();
    story2row4.setMinHeight(0);

    
    ColumnConstraints story2col1 = new ColumnConstraints();
    story2col1.setMinWidth(0); // Increase left margin
    ColumnConstraints story2col2 = new ColumnConstraints();
    story2col2.setMinWidth(20); // Spacer or small content
    ColumnConstraints story2col3 = new ColumnConstraints();
    story2col3.setMinWidth(800); // Increase width for main text content
    ColumnConstraints story2col4 = new ColumnConstraints();
    story2col4.setMinWidth(800); // Adjust right padding


    story4Node.getRowConstraints().addAll(story2row1, story2row2, story2row3, story2row4);
    story4Node.getColumnConstraints().addAll(story2col1, story2col2, story2col3, story2col4);

    // Create and set the new scene
    Scene newScene = new Scene(story4Node, 1280, 720);
    primaryStage.setScene(newScene);
    // Add key event listener for arrow keys to navigate scenes
    newScene.setOnKeyPressed(event -> {
        if (event.getCode() == KeyCode.RIGHT) {
            switchToNextScene44(primaryStage);//always the bigger number
        } else if (event.getCode() == KeyCode.LEFT) {
            switchToNextScene42(primaryStage);

        } 
    });
}




private void switchToNextScene44(Stage primaryStage) { 
    GridPane story4Node = new GridPane();
    story4Node.setPadding(new Insets(20));
    story4Node.setHgap(10);
    story4Node.setVgap(10); 
    
      

    // Load and set the background image
    Image storyBackgroundImage = new Image(getClass().getResourceAsStream("/images/phonewithguysurprise.png"));
    BackgroundImage background = new BackgroundImage(storyBackgroundImage, BackgroundRepeat.NO_REPEAT,
            BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, new BackgroundSize(1280, 720, true, true, false, true));
    story4Node.setBackground(new Background(background));
       // Create a Label for the speaker
    Label story2Speaker = new Label();
    story2Speaker.setText("???");
    story2Speaker.setStyle("-fx-text-fill: white; -fx-font-size: 250%; -fx-font-weight: bold;");
    
    story2Speaker.setAlignment(Pos.CENTER_LEFT);
    story2Speaker.setAlignment(Pos.CENTER_LEFT);

    // Create a Label for the story text
    Label story2Label = new Label();
    story2Label.setWrapText(true);
    story2Label.setMinWidth(1140);
    story2Label.setMaxWidth(1140);
    story2Label.setMinHeight(150);
    story2Label.setStyle("-fx-text-fill: black; -fx-font-size: 200%; -fx-background-color: rgba(255,255,255,0.7);");
    story2Label.setAlignment(Pos.CENTER_LEFT);

    // Create blank labels for spacing
    Label story2Blank = new Label();
    story2Blank.setMinWidth(100);
    story2Blank.setMinHeight(0);
    story2Blank.setStyle("-fx-background-color: transparent");

    Label story2Blank1 = new Label();
    story2Blank1.setMinWidth(0);
    story2Blank1.setMinHeight(100);
    story2Blank1.setStyle("-fx-background-color: rgba(255,255,255,0.7)");

    // Animation for text dialogue
    final String story2Content = "         Are we gatekeeping wifi passwords now? Ugh whatever..The things I do for my favorite fellow math fan....";
    final int instantCharactersCount = 10; // Number of characters to show instantly

    final Animation story2Animation = new Transition() {
        {
            setCycleDuration(Duration.millis(3000)); // Total duration for the animated part
        }

        protected void interpolate(double frac) {
            int totalLength = story2Content.length();
            int remainingCharacters = totalLength - instantCharactersCount;
            if (remainingCharacters > 0) {
                // Calculate the index of the last character to be shown for the current fraction
                int index = instantCharactersCount + Math.round(remainingCharacters * (float) frac);
                story2Label.setText(story2Content.substring(0, index));
        }else {
            // If the content is shorter than the number of instant characters, show it all instantly
            story2Label.setText(story2Content);
        }
    };};
    
    story2Animation.play();


    // Add elements to GridPane
    story4Node.add(story2Speaker, 2, 2);
    story4Node.add(story2Label, 2, 3);
    story4Node.add(story2Blank, 1, 2, 1, 1);
    story4Node.add(story2Blank1, 1, 3, 1, 1);

    // Define row and column constraints

    RowConstraints story2row1 = new RowConstraints();
    story2row1.setMinHeight(210);
    RowConstraints story2row2 = new RowConstraints();
    story2row2.setMinHeight(210);
    RowConstraints story2row3 = new RowConstraints();
    story2row3.setMinHeight(0);
    RowConstraints story2row4 = new RowConstraints();
    story2row4.setMinHeight(0);

    
    ColumnConstraints story2col1 = new ColumnConstraints();
    story2col1.setMinWidth(0); // Increase left margin
    ColumnConstraints story2col2 = new ColumnConstraints();
    story2col2.setMinWidth(20); // Spacer or small content
    ColumnConstraints story2col3 = new ColumnConstraints();
    story2col3.setMinWidth(800); // Increase width for main text content
    ColumnConstraints story2col4 = new ColumnConstraints();
    story2col4.setMinWidth(800); // Adjust right padding


    story4Node.getRowConstraints().addAll(story2row1, story2row2, story2row3, story2row4);
    story4Node.getColumnConstraints().addAll(story2col1, story2col2, story2col3, story2col4);

    // Create and set the new scene
    Scene newScene = new Scene(story4Node, 1280, 720);
    primaryStage.setScene(newScene);
    // Add key event listener for arrow keys to navigate scenes
    newScene.setOnKeyPressed(event -> {
        if (event.getCode() == KeyCode.RIGHT) {
            switchToNextScene45(primaryStage);//always the bigger number
        } else if (event.getCode() == KeyCode.LEFT) {
            switchToNextScene43(primaryStage);

        } 
    });
}


private void switchToNextScene45(Stage primaryStage) { // calculus
    GridPane story16Node = new GridPane();
    
    // Load and set the background image
    Image storyBackgroundImage = new Image(getClass().getResourceAsStream("/images/paper.png"));
    BackgroundImage background = new BackgroundImage(storyBackgroundImage, BackgroundRepeat.NO_REPEAT,
            BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, new BackgroundSize(1280, 720, true, true, false, true));
    story16Node.setBackground(new Background(background));

    // Create the question label
    Label story16Question = new Label("            v(x) = x^3 - x^2 + x - 1, v^4(x) = ?");
    story16Question.setMinWidth(700);
    story16Question.setMaxWidth(700);
    story16Question.setMinHeight(60);
    story16Question.setMaxHeight(60);
    story16Question.setStyle("-fx-background-color:transparent;-fx-font-size:200%;-fx-text-fill:black;-fx-font-weight:bold;");
    story16Question.setAlignment(Pos.CENTER);

    // Create the feedback label
    Label story16Label = new Label("");
    story16Label.setMinWidth(700);
    story16Label.setMaxWidth(700);
    story16Label.setMinHeight(40);
    story16Label.setMaxHeight(40);
    story16Label.setStyle("-fx-text-fill:black;-fx-font-size:200%;-fx-background-color:transparent");
    story16Label.setAlignment(Pos.BOTTOM_CENTER); // Align at the bottom center

    // Define buttons for answer options
    Button story16Button1 = new Button("            a) 2x");
    Button story16Button2 = new Button("            b) 3x^2 + 2x + 1");
    Button story16Button3 = new Button("            c) 0");

    // Styling buttons
    String buttonStyle = "-fx-background-color:transparent;-fx-font-size:200%;-fx-border-width:1px";
    story16Button1.setStyle(buttonStyle);
    story16Button2.setStyle(buttonStyle);
    story16Button3.setStyle(buttonStyle);

    story16Button1.setFocusTraversable(false);
    story16Button2.setFocusTraversable(false);
    story16Button3.setFocusTraversable(false);

    story16Button1.setMinSize(500, 150);
    story16Button2.setMinSize(500, 150);
    story16Button3.setMinSize(500, 150);

    story16Button1.setMaxSize(500, 150);
    story16Button2.setMaxSize(500, 150);
    story16Button3.setMaxSize(500, 150);

    story16Button1.setAlignment(Pos.CENTER);
    story16Button2.setAlignment(Pos.CENTER);
    story16Button3.setAlignment(Pos.CENTER);

    // Set up the animation for wrong answers
    final Animation story16Animation = new Transition() {
        final String story16Content = "Remember to derive it four times!";
        {
            setCycleDuration(Duration.millis(4000));
        }

        protected void interpolate(double frac) {
            final int story16Length = story16Content.length();
            final int story16N = Math.round(story16Length * (float) frac);
            story16Label.setText(story16Content.substring(0, story16N));
        }
    };

    // Event handlers for buttons
    story16Button1.setOnAction(event -> {
        // Incorrect answer
        story16Animation.playFromStart();
    });

    story16Button2.setOnAction(event -> {
        // Incorrect answer
        story16Animation.playFromStart();
    });

    story16Button3.setOnAction(event -> {
        // Correct answer - move to the next scene
        switchToNextScene46(primaryStage); 
    });

    // Add components to the GridPane
    story16Node.add(story16Question, 1, 1, 1, 1);
    story16Node.add(story16Button1, 1, 2);
    story16Node.add(story16Button2, 1, 3);
    story16Node.add(story16Button3, 1, 4);
    story16Node.add(story16Label, 1, 5, 1, 1); // Add the feedback label to the last row

    // Set row and column constraints
    story16Node.getRowConstraints().addAll(
        new RowConstraints(70),  // Question
        new RowConstraints(150), // Button 1
        new RowConstraints(150), // Button 2
        new RowConstraints(150), // Button 3
        new RowConstraints(60)   // Feedback Label
    );

    story16Node.getColumnConstraints().addAll(
        new ColumnConstraints(270, 270, 270, Priority.ALWAYS, HPos.CENTER, true), // center column
        new ColumnConstraints(500) // make this larger to push elements to center
    );

    // Create and set the scene
    Scene story16Scene = new Scene(story16Node, 1280, 720);
    primaryStage.setScene(story16Scene);
    primaryStage.show();
}


private void switchToNextScene46(Stage primaryStage) { // calculus
    GridPane story16Node = new GridPane();
    
    // Load and set the background image
    Image storyBackgroundImage = new Image(getClass().getResourceAsStream("/images/paper.png"));
    BackgroundImage background = new BackgroundImage(storyBackgroundImage, BackgroundRepeat.NO_REPEAT,
            BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, new BackgroundSize(1280, 720, true, true, false, true));
    story16Node.setBackground(new Background(background));

    // Create the question label
    Label story16Question = new Label("            What is the second derivative of cos^2(7t)?");
    story16Question.setMinWidth(700);
    story16Question.setMaxWidth(700);
    story16Question.setMinHeight(60);
    story16Question.setMaxHeight(60);
    story16Question.setStyle("-fx-background-color:transparent;-fx-font-size:200%;-fx-text-fill:black;-fx-font-weight:bold;");
    story16Question.setAlignment(Pos.CENTER);

    // Create the feedback label
    Label story16Label = new Label("");
    story16Label.setMinWidth(700);
    story16Label.setMaxWidth(700);
    story16Label.setMinHeight(40);
    story16Label.setMaxHeight(40);
    story16Label.setStyle("-fx-text-fill:black;-fx-font-size:200%;-fx-background-color:transparent");
    story16Label.setAlignment(Pos.BOTTOM_CENTER); // Align at the bottom center

    // Define buttons for answer options
    Button story16Button1 = new Button("            a) 98sin^2(7t) - 98cos^2(7t)");
    Button story16Button2 = new Button("            b) 49sin^2(7t) - 49cos^2(7t)");
    Button story16Button3 = new Button("            c) 98cos^2(7t) - 98sin^2(7t)");

    // Styling buttons
    String buttonStyle = "-fx-background-color:transparent;-fx-font-size:200%;-fx-border-width:1px";
    story16Button1.setStyle(buttonStyle);
    story16Button2.setStyle(buttonStyle);
    story16Button3.setStyle(buttonStyle);

    story16Button1.setFocusTraversable(false);
    story16Button2.setFocusTraversable(false);
    story16Button3.setFocusTraversable(false);

    story16Button1.setMinSize(500, 150);
    story16Button2.setMinSize(500, 150);
    story16Button3.setMinSize(500, 150);

    story16Button1.setMaxSize(500, 150);
    story16Button2.setMaxSize(500, 150);
    story16Button3.setMaxSize(500, 150);

    story16Button1.setAlignment(Pos.CENTER);
    story16Button2.setAlignment(Pos.CENTER);
    story16Button3.setAlignment(Pos.CENTER);

    // Set up the animation for wrong answers
    final Animation story16Animation = new Transition() {
        final String story16Content = "Do you remember your trig derivatives?";
        {
            setCycleDuration(Duration.millis(4000));
        }

        protected void interpolate(double frac) {
            final int story16Length = story16Content.length();
            final int story16N = Math.round(story16Length * (float) frac);
            story16Label.setText(story16Content.substring(0, story16N));
        }
    };

    // Event handlers for buttons
    story16Button1.setOnAction(event -> {
        // correct, move on
        switchToNextScene47(primaryStage);
        
    });

    story16Button2.setOnAction(event -> {
        // Incorrect answer
        story16Animation.playFromStart();
    });

    story16Button3.setOnAction(event -> {
        // incorrect
        story16Animation.playFromStart();
         
    });

    // Add components to the GridPane
    story16Node.add(story16Question, 1, 1, 1, 1);
    story16Node.add(story16Button1, 1, 2);
    story16Node.add(story16Button2, 1, 3);
    story16Node.add(story16Button3, 1, 4);
    story16Node.add(story16Label, 1, 5, 1, 1); // Add the feedback label to the last row

    // Set row and column constraints
    story16Node.getRowConstraints().addAll(
        new RowConstraints(70),  // Question
        new RowConstraints(150), // Button 1
        new RowConstraints(150), // Button 2
        new RowConstraints(150), // Button 3
        new RowConstraints(60)   // Feedback Label
    );

    story16Node.getColumnConstraints().addAll(
        new ColumnConstraints(270, 270, 270, Priority.ALWAYS, HPos.CENTER, true), // center column
        new ColumnConstraints(500) // make this larger to push elements to center
    );

    // Create and set the scene
    Scene story16Scene = new Scene(story16Node, 1280, 720);
    primaryStage.setScene(story16Scene);
    primaryStage.show();
}



private void switchToNextScene47(Stage primaryStage) { // calculus
    GridPane story16Node = new GridPane();
    
    // Load and set the background image
    Image storyBackgroundImage = new Image(getClass().getResourceAsStream("/images/paper.png"));
    BackgroundImage background = new BackgroundImage(storyBackgroundImage, BackgroundRepeat.NO_REPEAT,
            BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, new BackgroundSize(1280, 720, true, true, false, true));
    story16Node.setBackground(new Background(background));

    // Create the question label
    Label story16Question = new Label("What is the second derivative of y = ln(7-x^3)?");
    story16Question.setMinWidth(700);
    story16Question.setMaxWidth(700);
    story16Question.setMinHeight(60);
    story16Question.setMaxHeight(60);
    story16Question.setStyle("-fx-background-color:transparent;-fx-font-size:200%;-fx-text-fill:black;-fx-font-weight:bold;");
    story16Question.setAlignment(Pos.CENTER);

    // Create the feedback label
    Label story16Label = new Label("");
    story16Label.setMinWidth(700);
    story16Label.setMaxWidth(700);
    story16Label.setMinHeight(40);
    story16Label.setMaxHeight(40);
    story16Label.setStyle("-fx-text-fill:black;-fx-font-size:200%;-fx-background-color:transparent");
    story16Label.setAlignment(Pos.BOTTOM_CENTER); // Align at the bottom center

    // Define buttons for answer options
    Button story16Button1 = new Button("            a) -3x^2/(7-x^3))");
    Button story16Button2 = new Button("            b) (-42x-3x^4)/(7-x^3)^2");
    Button story16Button3 = new Button("            c) (7-x^2)/-3x^2");

    // Styling buttons
    String buttonStyle = "-fx-background-color:transparent;-fx-font-size:200%;-fx-border-width:1px";
    story16Button1.setStyle(buttonStyle);
    story16Button2.setStyle(buttonStyle);
    story16Button3.setStyle(buttonStyle);

    story16Button1.setFocusTraversable(false);
    story16Button2.setFocusTraversable(false);
    story16Button3.setFocusTraversable(false);

    story16Button1.setMinSize(500, 150);
    story16Button2.setMinSize(500, 150);
    story16Button3.setMinSize(500, 150);

    story16Button1.setMaxSize(500, 150);
    story16Button2.setMaxSize(500, 150);
    story16Button3.setMaxSize(500, 150);

    story16Button1.setAlignment(Pos.CENTER);
    story16Button2.setAlignment(Pos.CENTER);
    story16Button3.setAlignment(Pos.CENTER);

    // Set up the animation for wrong answers
    final Animation story16Animation = new Transition() {
        final String story16Content = "Do you remember your trig derivatives?";
        {
            setCycleDuration(Duration.millis(4000));
        }

        protected void interpolate(double frac) {
            final int story16Length = story16Content.length();
            final int story16N = Math.round(story16Length * (float) frac);
            story16Label.setText(story16Content.substring(0, story16N));
        }
    };

    // Event handlers for buttons
    story16Button1.setOnAction(event -> {
        // Incorrect answer
        story16Animation.playFromStart();
        
    });

    story16Button2.setOnAction(event -> {
        // correct, move on
        switchToNextScene48(primaryStage);
        
    });

    story16Button3.setOnAction(event -> {
        // incorrect
        story16Animation.playFromStart();
         
    });

    // Add components to the GridPane
    story16Node.add(story16Question, 1, 1, 1, 1);
    story16Node.add(story16Button1, 1, 2);
    story16Node.add(story16Button2, 1, 3);
    story16Node.add(story16Button3, 1, 4);
    story16Node.add(story16Label, 1, 5, 1, 1); // Add the feedback label to the last row

    // Set row and column constraints
    story16Node.getRowConstraints().addAll(
        new RowConstraints(70),  // Question
        new RowConstraints(150), // Button 1
        new RowConstraints(150), // Button 2
        new RowConstraints(150), // Button 3
        new RowConstraints(60)   // Feedback Label
    );

    story16Node.getColumnConstraints().addAll(
        new ColumnConstraints(270, 270, 270, Priority.ALWAYS, HPos.CENTER, true), // center column
        new ColumnConstraints(500) // make this larger to push elements to center
    );

    // Create and set the scene
    Scene story16Scene = new Scene(story16Node, 1280, 720);
    primaryStage.setScene(story16Scene);
    primaryStage.show();
}


private void switchToNextScene48(Stage primaryStage) { 
    GridPane story4Node = new GridPane();
    story4Node.setPadding(new Insets(20));
    story4Node.setHgap(10);
    story4Node.setVgap(10); 
    
      

    // Load and set the background image
    Image storyBackgroundImage = new Image(getClass().getResourceAsStream("/images/phonewithguy.png"));
    BackgroundImage background = new BackgroundImage(storyBackgroundImage, BackgroundRepeat.NO_REPEAT,
            BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, new BackgroundSize(1280, 720, true, true, false, true));
    story4Node.setBackground(new Background(background));
       // Create a Label for the speaker
    Label story2Speaker = new Label();
    story2Speaker.setText("Mr. Enriquez");
    story2Speaker.setStyle("-fx-text-fill: white; -fx-font-size: 250%; -fx-font-weight: bold;");
    
    story2Speaker.setAlignment(Pos.CENTER_LEFT);
    story2Speaker.setAlignment(Pos.CENTER_LEFT);

    // Create a Label for the story text
    Label story2Label = new Label();
    story2Label.setWrapText(true);
    story2Label.setMinWidth(1140);
    story2Label.setMaxWidth(1140);
    story2Label.setMinHeight(150);
    story2Label.setStyle("-fx-text-fill: black; -fx-font-size: 200%; -fx-background-color: rgba(255,255,255,0.7);");
    story2Label.setAlignment(Pos.CENTER_LEFT);

    // Create blank labels for spacing
    Label story2Blank = new Label();
    story2Blank.setMinWidth(100);
    story2Blank.setMinHeight(0);
    story2Blank.setStyle("-fx-background-color: transparent");

    Label story2Blank1 = new Label();
    story2Blank1.setMinWidth(0);
    story2Blank1.setMinHeight(100);
    story2Blank1.setStyle("-fx-background-color: rgba(255,255,255,0.7)");

    // Animation for text dialogue
    final String story2Content = "         Well done! The password is newtonEulerFan112358!";
    final int instantCharactersCount = 10; // Number of characters to show instantly

    final Animation story2Animation = new Transition() {
        {
            setCycleDuration(Duration.millis(3000)); // Total duration for the animated part
        }

        protected void interpolate(double frac) {
            int totalLength = story2Content.length();
            int remainingCharacters = totalLength - instantCharactersCount;
            if (remainingCharacters > 0) {
                // Calculate the index of the last character to be shown for the current fraction
                int index = instantCharactersCount + Math.round(remainingCharacters * (float) frac);
                story2Label.setText(story2Content.substring(0, index));
        }else {
            // If the content is shorter than the number of instant characters, show it all instantly
            story2Label.setText(story2Content);
        }
    };};
    
    story2Animation.play();


    // Add elements to GridPane
    story4Node.add(story2Speaker, 2, 2);
    story4Node.add(story2Label, 2, 3);
    story4Node.add(story2Blank, 1, 2, 1, 1);
    story4Node.add(story2Blank1, 1, 3, 1, 1);

    // Define row and column constraints

    RowConstraints story2row1 = new RowConstraints();
    story2row1.setMinHeight(210);
    RowConstraints story2row2 = new RowConstraints();
    story2row2.setMinHeight(210);
    RowConstraints story2row3 = new RowConstraints();
    story2row3.setMinHeight(0);
    RowConstraints story2row4 = new RowConstraints();
    story2row4.setMinHeight(0);

    
    ColumnConstraints story2col1 = new ColumnConstraints();
    story2col1.setMinWidth(0); // Increase left margin
    ColumnConstraints story2col2 = new ColumnConstraints();
    story2col2.setMinWidth(20); // Spacer or small content
    ColumnConstraints story2col3 = new ColumnConstraints();
    story2col3.setMinWidth(800); // Increase width for main text content
    ColumnConstraints story2col4 = new ColumnConstraints();
    story2col4.setMinWidth(800); // Adjust right padding


    story4Node.getRowConstraints().addAll(story2row1, story2row2, story2row3, story2row4);
    story4Node.getColumnConstraints().addAll(story2col1, story2col2, story2col3, story2col4);

    // Create and set the new scene
    Scene newScene = new Scene(story4Node, 1280, 720);
    primaryStage.setScene(newScene);
    // Add key event listener for arrow keys to navigate scenes
    newScene.setOnKeyPressed(event -> {
        if (event.getCode() == KeyCode.RIGHT) {
            switchToNextScene49(primaryStage);//always the bigger number
        } else if (event.getCode() == KeyCode.LEFT) {
            switchToNextScene45(primaryStage);

        } 
    });
}


private void switchToNextScene49(Stage primaryStage) { 
    GridPane story4Node = new GridPane();
    story4Node.setPadding(new Insets(20));
    story4Node.setHgap(10);
    story4Node.setVgap(10); 
    
    

    // Load and set the background image
    Image storyBackgroundImage = new Image(getClass().getResourceAsStream("/images/phonewithguysurprise.png"));
    BackgroundImage background = new BackgroundImage(storyBackgroundImage, BackgroundRepeat.NO_REPEAT,
            BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, new BackgroundSize(1280, 720, true, true, false, true));
    story4Node.setBackground(new Background(background));
       // Create a Label for the speaker
    Label story2Speaker = new Label();
    story2Speaker.setText("???");
    story2Speaker.setStyle("-fx-text-fill: white; -fx-font-size: 250%; -fx-font-weight: bold;");
    
    story2Speaker.setAlignment(Pos.CENTER_LEFT);
    story2Speaker.setAlignment(Pos.CENTER_LEFT);

    // Create a Label for the story text
    Label story2Label = new Label();
    story2Label.setWrapText(true);
    story2Label.setMinWidth(1140);
    story2Label.setMaxWidth(1140);
    story2Label.setMinHeight(150);
    story2Label.setStyle("-fx-text-fill: black; -fx-font-size: 200%; -fx-background-color: rgba(255,255,255,0.7);");
    story2Label.setAlignment(Pos.CENTER_LEFT);

    // Create blank labels for spacing
    Label story2Blank = new Label();
    story2Blank.setMinWidth(100);
    story2Blank.setMinHeight(0);
    story2Blank.setStyle("-fx-background-color: transparent");

    Label story2Blank1 = new Label();
    story2Blank1.setMinWidth(0);
    story2Blank1.setMinHeight(100);
    story2Blank1.setStyle("-fx-background-color: rgba(255,255,255,0.7)");

    // Animation for text dialogue
    final String story2Content = "         Thanks...";
    final int instantCharactersCount = 10; // Number of characters to show instantly

    final Animation story2Animation = new Transition() {
        {
            setCycleDuration(Duration.millis(3000)); // Total duration for the animated part
        }

        protected void interpolate(double frac) {
            int totalLength = story2Content.length();
            int remainingCharacters = totalLength - instantCharactersCount;
            if (remainingCharacters > 0) {
                // Calculate the index of the last character to be shown for the current fraction
                int index = instantCharactersCount + Math.round(remainingCharacters * (float) frac);
                story2Label.setText(story2Content.substring(0, index));
        }else {
            // If the content is shorter than the number of instant characters, show it all instantly
            story2Label.setText(story2Content);
        }
    };};
    
    story2Animation.play();


    // Add elements to GridPane
    story4Node.add(story2Speaker, 2, 2);
    story4Node.add(story2Label, 2, 3);
    story4Node.add(story2Blank, 1, 2, 1, 1);
    story4Node.add(story2Blank1, 1, 3, 1, 1);

    // Define row and column constraints

    RowConstraints story2row1 = new RowConstraints();
    story2row1.setMinHeight(210);
    RowConstraints story2row2 = new RowConstraints();
    story2row2.setMinHeight(210);
    RowConstraints story2row3 = new RowConstraints();
    story2row3.setMinHeight(0);
    RowConstraints story2row4 = new RowConstraints();
    story2row4.setMinHeight(0);

    
    ColumnConstraints story2col1 = new ColumnConstraints();
    story2col1.setMinWidth(0); // Increase left margin
    ColumnConstraints story2col2 = new ColumnConstraints();
    story2col2.setMinWidth(20); // Spacer or small content
    ColumnConstraints story2col3 = new ColumnConstraints();
    story2col3.setMinWidth(800); // Increase width for main text content
    ColumnConstraints story2col4 = new ColumnConstraints();
    story2col4.setMinWidth(800); // Adjust right padding


    story4Node.getRowConstraints().addAll(story2row1, story2row2, story2row3, story2row4);
    story4Node.getColumnConstraints().addAll(story2col1, story2col2, story2col3, story2col4);

    // Create and set the new scene
    Scene newScene = new Scene(story4Node, 1280, 720);
    primaryStage.setScene(newScene);
    // Add key event listener for arrow keys to navigate scenes
    newScene.setOnKeyPressed(event -> {
        if (event.getCode() == KeyCode.RIGHT) {
            switchToNextScene50(primaryStage);//always the bigger number
        } else if (event.getCode() == KeyCode.LEFT) {
            switchToNextScene48(primaryStage);

        } 
    });
}



private void switchToNextScene50(Stage primaryStage) { 
    GridPane story4Node = new GridPane();
    story4Node.setPadding(new Insets(20));
    story4Node.setHgap(10);
    story4Node.setVgap(10); 
    
    

    // Load and set the background image
    Image storyBackgroundImage = new Image(getClass().getResourceAsStream("/images/packingup.png"));
    BackgroundImage background = new BackgroundImage(storyBackgroundImage, BackgroundRepeat.NO_REPEAT,
            BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, new BackgroundSize(1280, 720, true, true, false, true));
    story4Node.setBackground(new Background(background));
       // Create a Label for the speaker
    Label story2Speaker = new Label();
    story2Speaker.setText("Narrator");
    story2Speaker.setStyle("-fx-text-fill: white; -fx-font-size: 250%; -fx-font-weight: bold;");
    
    story2Speaker.setAlignment(Pos.CENTER_LEFT);
    story2Speaker.setAlignment(Pos.CENTER_LEFT);

    // Create a Label for the story text
    Label story2Label = new Label();
    story2Label.setWrapText(true);
    story2Label.setMinWidth(1140);
    story2Label.setMaxWidth(1140);
    story2Label.setMinHeight(150);
    story2Label.setStyle("-fx-text-fill: black; -fx-font-size: 200%; -fx-background-color: rgba(255,255,255,0.7);");
    story2Label.setAlignment(Pos.CENTER_LEFT);

    // Create blank labels for spacing
    Label story2Blank = new Label();
    story2Blank.setMinWidth(100);
    story2Blank.setMinHeight(0);
    story2Blank.setStyle("-fx-background-color: transparent");

    Label story2Blank1 = new Label();
    story2Blank1.setMinWidth(0);
    story2Blank1.setMinHeight(100);
    story2Blank1.setStyle("-fx-background-color: rgba(255,255,255,0.7)");

    // Animation for text dialogue
    final String story2Content = "         You are packing up your backpack. You reflect on the day and the amount of work you have to do after school";
    final int instantCharactersCount = 10; // Number of characters to show instantly

    final Animation story2Animation = new Transition() {
        {
            setCycleDuration(Duration.millis(3000)); // Total duration for the animated part
        }

        protected void interpolate(double frac) {
            int totalLength = story2Content.length();
            int remainingCharacters = totalLength - instantCharactersCount;
            if (remainingCharacters > 0) {
                // Calculate the index of the last character to be shown for the current fraction
                int index = instantCharactersCount + Math.round(remainingCharacters * (float) frac);
                story2Label.setText(story2Content.substring(0, index));
        }else {
            // If the content is shorter than the number of instant characters, show it all instantly
            story2Label.setText(story2Content);
        }
    };};
    
    story2Animation.play();


    // Add elements to GridPane
    story4Node.add(story2Speaker, 2, 2);
    story4Node.add(story2Label, 2, 3);
    story4Node.add(story2Blank, 1, 2, 1, 1);
    story4Node.add(story2Blank1, 1, 3, 1, 1);

    // Define row and column constraints

    RowConstraints story2row1 = new RowConstraints();
    story2row1.setMinHeight(210);
    RowConstraints story2row2 = new RowConstraints();
    story2row2.setMinHeight(210);
    RowConstraints story2row3 = new RowConstraints();
    story2row3.setMinHeight(0);
    RowConstraints story2row4 = new RowConstraints();
    story2row4.setMinHeight(0);

    
    ColumnConstraints story2col1 = new ColumnConstraints();
    story2col1.setMinWidth(0); // Increase left margin
    ColumnConstraints story2col2 = new ColumnConstraints();
    story2col2.setMinWidth(20); // Spacer or small content
    ColumnConstraints story2col3 = new ColumnConstraints();
    story2col3.setMinWidth(800); // Increase width for main text content
    ColumnConstraints story2col4 = new ColumnConstraints();
    story2col4.setMinWidth(800); // Adjust right padding


    story4Node.getRowConstraints().addAll(story2row1, story2row2, story2row3, story2row4);
    story4Node.getColumnConstraints().addAll(story2col1, story2col2, story2col3, story2col4);

    // Create and set the new scene
    Scene newScene = new Scene(story4Node, 1280, 720);
    primaryStage.setScene(newScene);
    // Add key event listener for arrow keys to navigate scenes
    newScene.setOnKeyPressed(event -> {
        if (event.getCode() == KeyCode.RIGHT) {
            switchToNextScene51(primaryStage);//always the bigger number
        } else if (event.getCode() == KeyCode.LEFT) {
            switchToNextScene49(primaryStage);

        } 
    });
}

private void switchToNextScene51(Stage primaryStage) { 
    GridPane story4Node = new GridPane();
    story4Node.setPadding(new Insets(20));
    story4Node.setHgap(10);
    story4Node.setVgap(10); 
    
    

    // Load and set the background image
    Image storyBackgroundImage = new Image(getClass().getResourceAsStream("/images/packingupenrique.png"));
    BackgroundImage background = new BackgroundImage(storyBackgroundImage, BackgroundRepeat.NO_REPEAT,
            BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, new BackgroundSize(1280, 720, true, true, false, true));
    story4Node.setBackground(new Background(background));
       // Create a Label for the speaker
    Label story2Speaker = new Label();
    story2Speaker.setText("???");
    story2Speaker.setStyle("-fx-text-fill: white; -fx-font-size: 250%; -fx-font-weight: bold;");
    
    story2Speaker.setAlignment(Pos.CENTER_LEFT);
    story2Speaker.setAlignment(Pos.CENTER_LEFT);

    // Create a Label for the story text
    Label story2Label = new Label();
    story2Label.setWrapText(true);
    story2Label.setMinWidth(1140);
    story2Label.setMaxWidth(1140);
    story2Label.setMinHeight(150);
    story2Label.setStyle("-fx-text-fill: black; -fx-font-size: 200%; -fx-background-color: rgba(255,255,255,0.7);");
    story2Label.setAlignment(Pos.CENTER_LEFT);

    // Create blank labels for spacing
    Label story2Blank = new Label();
    story2Blank.setMinWidth(100);
    story2Blank.setMinHeight(0);
    story2Blank.setStyle("-fx-background-color: transparent");

    Label story2Blank1 = new Label();
    story2Blank1.setMinWidth(0);
    story2Blank1.setMinHeight(100);
    story2Blank1.setStyle("-fx-background-color: rgba(255,255,255,0.7)");

    // Animation for text dialogue
    final String story2Content = "         At least I got to speak to kuya Enriquez today.. he’s very interesting… ";
    final int instantCharactersCount = 10; // Number of characters to show instantly

    final Animation story2Animation = new Transition() {
        {
            setCycleDuration(Duration.millis(3000)); // Total duration for the animated part
        }

        protected void interpolate(double frac) {
            int totalLength = story2Content.length();
            int remainingCharacters = totalLength - instantCharactersCount;
            if (remainingCharacters > 0) {
                // Calculate the index of the last character to be shown for the current fraction
                int index = instantCharactersCount + Math.round(remainingCharacters * (float) frac);
                story2Label.setText(story2Content.substring(0, index));
        }else {
            // If the content is shorter than the number of instant characters, show it all instantly
            story2Label.setText(story2Content);
        }
    };};
    
    story2Animation.play();


    // Add elements to GridPane
    story4Node.add(story2Speaker, 2, 2);
    story4Node.add(story2Label, 2, 3);
    story4Node.add(story2Blank, 1, 2, 1, 1);
    story4Node.add(story2Blank1, 1, 3, 1, 1);

    // Define row and column constraints

    RowConstraints story2row1 = new RowConstraints();
    story2row1.setMinHeight(210);
    RowConstraints story2row2 = new RowConstraints();
    story2row2.setMinHeight(210);
    RowConstraints story2row3 = new RowConstraints();
    story2row3.setMinHeight(0);
    RowConstraints story2row4 = new RowConstraints();
    story2row4.setMinHeight(0);

    
    ColumnConstraints story2col1 = new ColumnConstraints();
    story2col1.setMinWidth(0); // Increase left margin
    ColumnConstraints story2col2 = new ColumnConstraints();
    story2col2.setMinWidth(20); // Spacer or small content
    ColumnConstraints story2col3 = new ColumnConstraints();
    story2col3.setMinWidth(800); // Increase width for main text content
    ColumnConstraints story2col4 = new ColumnConstraints();
    story2col4.setMinWidth(800); // Adjust right padding


    story4Node.getRowConstraints().addAll(story2row1, story2row2, story2row3, story2row4);
    story4Node.getColumnConstraints().addAll(story2col1, story2col2, story2col3, story2col4);

    // Create and set the new scene
    Scene newScene = new Scene(story4Node, 1280, 720);
    primaryStage.setScene(newScene);
    // Add key event listener for arrow keys to navigate scenes
    newScene.setOnKeyPressed(event -> {
        if (event.getCode() == KeyCode.RIGHT) {
            switchToNextScene52(primaryStage);//always the bigger number
        } else if (event.getCode() == KeyCode.LEFT) {
            switchToNextScene50(primaryStage);

        } 
    });
}



private void switchToNextScene52(Stage primaryStage) { 
    GridPane story4Node = new GridPane();
    story4Node.setPadding(new Insets(20));
    story4Node.setHgap(10);
    story4Node.setVgap(10); 
    applyFadeTransition(story4Node);
    
    
    

    // Load and set the background image
    Image storyBackgroundImage = new Image(getClass().getResourceAsStream("/images/sevillapeek.png"));
    BackgroundImage background = new BackgroundImage(storyBackgroundImage, BackgroundRepeat.NO_REPEAT,
            BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, new BackgroundSize(1280, 720, true, true, false, true));
    story4Node.setBackground(new Background(background));
       // Create a Label for the speaker
    Label story2Speaker = new Label();
    story2Speaker.setText("Narrator");
    story2Speaker.setStyle("-fx-text-fill: white; -fx-font-size: 250%; -fx-font-weight: bold;");
    
    story2Speaker.setAlignment(Pos.CENTER_LEFT);
    story2Speaker.setAlignment(Pos.CENTER_LEFT);

    // Create a Label for the story text
    Label story2Label = new Label();
    story2Label.setWrapText(true);
    story2Label.setMinWidth(1140);
    story2Label.setMaxWidth(1140);
    story2Label.setMinHeight(150);
    story2Label.setStyle("-fx-text-fill: black; -fx-font-size: 200%; -fx-background-color: rgba(255,255,255,0.7);");
    story2Label.setAlignment(Pos.CENTER_LEFT);

    // Create blank labels for spacing
    Label story2Blank = new Label();
    story2Blank.setMinWidth(100);
    story2Blank.setMinHeight(0);
    story2Blank.setStyle("-fx-background-color: transparent");

    Label story2Blank1 = new Label();
    story2Blank1.setMinWidth(0);
    story2Blank1.setMinHeight(100);
    story2Blank1.setStyle("-fx-background-color: rgba(255,255,255,0.7)");

    // Animation for text dialogue
    final String story2Content = "         You are very busy but would like an opportunity to talk to kuya Rey.. ";
    final int instantCharactersCount = 10; // Number of characters to show instantly

    final Animation story2Animation = new Transition() {
        {
            setCycleDuration(Duration.millis(3000)); // Total duration for the animated part
        }

        protected void interpolate(double frac) {
            int totalLength = story2Content.length();
            int remainingCharacters = totalLength - instantCharactersCount;
            if (remainingCharacters > 0) {
                // Calculate the index of the last character to be shown for the current fraction
                int index = instantCharactersCount + Math.round(remainingCharacters * (float) frac);
                story2Label.setText(story2Content.substring(0, index));
        }else {
            // If the content is shorter than the number of instant characters, show it all instantly
            story2Label.setText(story2Content);
        }
    };};
    
    story2Animation.play();


    // Add elements to GridPane
    story4Node.add(story2Speaker, 2, 2);
    story4Node.add(story2Label, 2, 3);
    story4Node.add(story2Blank, 1, 2, 1, 1);
    story4Node.add(story2Blank1, 1, 3, 1, 1);

    // Define row and column constraints

    RowConstraints story2row1 = new RowConstraints();
    story2row1.setMinHeight(210);
    RowConstraints story2row2 = new RowConstraints();
    story2row2.setMinHeight(210);
    RowConstraints story2row3 = new RowConstraints();
    story2row3.setMinHeight(0);
    RowConstraints story2row4 = new RowConstraints();
    story2row4.setMinHeight(0);

    
    ColumnConstraints story2col1 = new ColumnConstraints();
    story2col1.setMinWidth(0); // Increase left margin
    ColumnConstraints story2col2 = new ColumnConstraints();
    story2col2.setMinWidth(20); // Spacer or small content
    ColumnConstraints story2col3 = new ColumnConstraints();
    story2col3.setMinWidth(800); // Increase width for main text content
    ColumnConstraints story2col4 = new ColumnConstraints();
    story2col4.setMinWidth(800); // Adjust right padding


    story4Node.getRowConstraints().addAll(story2row1, story2row2, story2row3, story2row4);
    story4Node.getColumnConstraints().addAll(story2col1, story2col2, story2col3, story2col4);

    // Create and set the new scene
    Scene newScene = new Scene(story4Node, 1280, 720);
    primaryStage.setScene(newScene);
    // Add key event listener for arrow keys to navigate scenes
    newScene.setOnKeyPressed(event -> {
        if (event.getCode() == KeyCode.RIGHT) {
            switchToNextScene53(primaryStage);//always the bigger number
        } else if (event.getCode() == KeyCode.LEFT) {
            switchToNextScene51(primaryStage);

        } 
    });
}



private void switchToNextScene53(Stage primaryStage) { 
    GridPane story4Node = new GridPane();
    story4Node.setPadding(new Insets(20));
    story4Node.setHgap(10);
    story4Node.setVgap(10); 
    

    // Load and set the background image
    Image storyBackgroundImage = new Image(getClass().getResourceAsStream("/images/sevillaclassroom.png"));
    BackgroundImage background = new BackgroundImage(storyBackgroundImage, BackgroundRepeat.NO_REPEAT,
            BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, new BackgroundSize(1280, 720, true, true, false, true));
    story4Node.setBackground(new Background(background));
       // Create a Label for the speaker
    Label story2Speaker = new Label();
    story2Speaker.setText("Mr. Sevilla");
    story2Speaker.setStyle("-fx-text-fill: white; -fx-font-size: 250%; -fx-font-weight: bold;");
    
    story2Speaker.setAlignment(Pos.CENTER_LEFT);
    story2Speaker.setAlignment(Pos.CENTER_LEFT);

    // Create a Label for the story text
    Label story2Label = new Label();
    story2Label.setWrapText(true);
    story2Label.setMinWidth(1140);
    story2Label.setMaxWidth(1140);
    story2Label.setMinHeight(150);
    story2Label.setStyle("-fx-text-fill: black; -fx-font-size: 200%; -fx-background-color: rgba(255,255,255,0.7);");
    story2Label.setAlignment(Pos.CENTER_LEFT);

    // Create blank labels for spacing
    Label story2Blank = new Label();
    story2Blank.setMinWidth(100);
    story2Blank.setMinHeight(0);
    story2Blank.setStyle("-fx-background-color: transparent");

    Label story2Blank1 = new Label();
    story2Blank1.setMinWidth(0);
    story2Blank1.setMinHeight(100);
    story2Blank1.setStyle("-fx-background-color: rgba(255,255,255,0.7)");

    // Animation for text dialogue
    final String story2Content = "         Rey, would you like to grade papers with me? My AP Calc AB classes suck. ";
    final int instantCharactersCount = 10; // Number of characters to show instantly

    final Animation story2Animation = new Transition() {
        {
            setCycleDuration(Duration.millis(3000)); // Total duration for the animated part
        }

        protected void interpolate(double frac) {
            int totalLength = story2Content.length();
            int remainingCharacters = totalLength - instantCharactersCount;
            if (remainingCharacters > 0) {
                // Calculate the index of the last character to be shown for the current fraction
                int index = instantCharactersCount + Math.round(remainingCharacters * (float) frac);
                story2Label.setText(story2Content.substring(0, index));
        }else {
            // If the content is shorter than the number of instant characters, show it all instantly
            story2Label.setText(story2Content);
        }
    };};
    
    story2Animation.play();


    // Add elements to GridPane
    story4Node.add(story2Speaker, 2, 2);
    story4Node.add(story2Label, 2, 3);
    story4Node.add(story2Blank, 1, 2, 1, 1);
    story4Node.add(story2Blank1, 1, 3, 1, 1);

    // Define row and column constraints

    RowConstraints story2row1 = new RowConstraints();
    story2row1.setMinHeight(210);
    RowConstraints story2row2 = new RowConstraints();
    story2row2.setMinHeight(210);
    RowConstraints story2row3 = new RowConstraints();
    story2row3.setMinHeight(0);
    RowConstraints story2row4 = new RowConstraints();
    story2row4.setMinHeight(0);

    
    ColumnConstraints story2col1 = new ColumnConstraints();
    story2col1.setMinWidth(0); // Increase left margin
    ColumnConstraints story2col2 = new ColumnConstraints();
    story2col2.setMinWidth(20); // Spacer or small content
    ColumnConstraints story2col3 = new ColumnConstraints();
    story2col3.setMinWidth(800); // Increase width for main text content
    ColumnConstraints story2col4 = new ColumnConstraints();
    story2col4.setMinWidth(800); // Adjust right padding


    story4Node.getRowConstraints().addAll(story2row1, story2row2, story2row3, story2row4);
    story4Node.getColumnConstraints().addAll(story2col1, story2col2, story2col3, story2col4);

    // Create and set the new scene
    Scene newScene = new Scene(story4Node, 1280, 720);
    primaryStage.setScene(newScene);
    // Add key event listener for arrow keys to navigate scenes
    newScene.setOnKeyPressed(event -> {
        if (event.getCode() == KeyCode.RIGHT) {
            switchToNextScene54(primaryStage);//always the bigger number
        } else if (event.getCode() == KeyCode.LEFT) {
            switchToNextScene52(primaryStage);

        } 
    });
}

private void switchToNextScene54(Stage primaryStage) { 
    GridPane story4Node = new GridPane();
    story4Node.setPadding(new Insets(20));
    story4Node.setHgap(10);
    story4Node.setVgap(10); 

    
    

    // Load and set the background image
    Image storyBackgroundImage = new Image(getClass().getResourceAsStream("/images/sevillaclassroomsmileenriquez.png"));
    BackgroundImage background = new BackgroundImage(storyBackgroundImage, BackgroundRepeat.NO_REPEAT,
            BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, new BackgroundSize(1280, 720, true, true, false, true));
    story4Node.setBackground(new Background(background));
       // Create a Label for the speaker
    Label story2Speaker = new Label();
    story2Speaker.setText("Mr.Enriquez");
    story2Speaker.setStyle("-fx-text-fill: white; -fx-font-size: 250%; -fx-font-weight: bold;");
    
    story2Speaker.setAlignment(Pos.CENTER_LEFT);
    story2Speaker.setAlignment(Pos.CENTER_LEFT);

    // Create a Label for the story text
    Label story2Label = new Label();
    story2Label.setWrapText(true);
    story2Label.setMinWidth(1140);
    story2Label.setMaxWidth(1140);
    story2Label.setMinHeight(150);
    story2Label.setStyle("-fx-text-fill: black; -fx-font-size: 200%; -fx-background-color: rgba(255,255,255,0.7);");
    story2Label.setAlignment(Pos.CENTER_LEFT);

    // Create blank labels for spacing
    Label story2Blank = new Label();
    story2Blank.setMinWidth(100);
    story2Blank.setMinHeight(0);
    story2Blank.setStyle("-fx-background-color: transparent");

    Label story2Blank1 = new Label();
    story2Blank1.setMinWidth(0);
    story2Blank1.setMinHeight(100);
    story2Blank1.setStyle("-fx-background-color: rgba(255,255,255,0.7)");

    // Animation for text dialogue
    final String story2Content = "         Of course!! I love Calculus! ";
    final int instantCharactersCount = 10; // Number of characters to show instantly

    final Animation story2Animation = new Transition() {
        {
            setCycleDuration(Duration.millis(3000)); // Total duration for the animated part
        }

        protected void interpolate(double frac) {
            int totalLength = story2Content.length();
            int remainingCharacters = totalLength - instantCharactersCount;
            if (remainingCharacters > 0) {
                // Calculate the index of the last character to be shown for the current fraction
                int index = instantCharactersCount + Math.round(remainingCharacters * (float) frac);
                story2Label.setText(story2Content.substring(0, index));
        }else {
            // If the content is shorter than the number of instant characters, show it all instantly
            story2Label.setText(story2Content);
        }
    };};
    
    story2Animation.play();


    // Add elements to GridPane
    story4Node.add(story2Speaker, 2, 2);
    story4Node.add(story2Label, 2, 3);
    story4Node.add(story2Blank, 1, 2, 1, 1);
    story4Node.add(story2Blank1, 1, 3, 1, 1);

    // Define row and column constraints

    RowConstraints story2row1 = new RowConstraints();
    story2row1.setMinHeight(210);
    RowConstraints story2row2 = new RowConstraints();
    story2row2.setMinHeight(210);
    RowConstraints story2row3 = new RowConstraints();
    story2row3.setMinHeight(0);
    RowConstraints story2row4 = new RowConstraints();
    story2row4.setMinHeight(0);

    
    ColumnConstraints story2col1 = new ColumnConstraints();
    story2col1.setMinWidth(0); // Increase left margin
    ColumnConstraints story2col2 = new ColumnConstraints();
    story2col2.setMinWidth(20); // Spacer or small content
    ColumnConstraints story2col3 = new ColumnConstraints();
    story2col3.setMinWidth(800); // Increase width for main text content
    ColumnConstraints story2col4 = new ColumnConstraints();
    story2col4.setMinWidth(800); // Adjust right padding


    story4Node.getRowConstraints().addAll(story2row1, story2row2, story2row3, story2row4);
    story4Node.getColumnConstraints().addAll(story2col1, story2col2, story2col3, story2col4);

    // Create and set the new scene
    Scene newScene = new Scene(story4Node, 1280, 720);
    primaryStage.setScene(newScene);
    // Add key event listener for arrow keys to navigate scenes
    newScene.setOnKeyPressed(event -> {
        if (event.getCode() == KeyCode.RIGHT) {
            switchToNextScene55(primaryStage);//always the bigger number
        } else if (event.getCode() == KeyCode.LEFT) {
            switchToNextScene53(primaryStage);

        } 
    });
}

private void switchToNextScene55(Stage primaryStage) { // calculus
    GridPane story16Node = new GridPane();
    
    // Load and set the background image
    Image storyBackgroundImage = new Image(getClass().getResourceAsStream("/images/paper.png"));
    BackgroundImage background = new BackgroundImage(storyBackgroundImage, BackgroundRepeat.NO_REPEAT,
            BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, new BackgroundSize(1280, 720, true, true, false, true));
    story16Node.setBackground(new Background(background));

    // Create the question label
    Label story16Question = new Label("y=6y-xy^2-1, y'=?");
    story16Question.setMinWidth(700);
    story16Question.setMaxWidth(700);
    story16Question.setMinHeight(60);
    story16Question.setMaxHeight(60);
    story16Question.setStyle("-fx-background-color:transparent;-fx-font-size:200%;-fx-text-fill:black;-fx-font-weight:bold;");
    story16Question.setAlignment(Pos.CENTER);

    // Create the feedback label
    Label story16Label = new Label("");
    story16Label.setMinWidth(700);
    story16Label.setMaxWidth(700);
    story16Label.setMinHeight(40);
    story16Label.setMaxHeight(40);
    story16Label.setStyle("-fx-text-fill:black;-fx-font-size:200%;-fx-background-color:transparent");
    story16Label.setAlignment(Pos.BOTTOM_CENTER); // Align at the bottom center

    // Define buttons for answer options
    Button story16Button1 = new Button("            a) y(6-xy)");
    Button story16Button2 = new Button("            b) 6-2xy");
    Button story16Button3 = new Button("            c) y^2(6-2xy)");

    // Styling buttons
    String buttonStyle = "-fx-background-color:transparent;-fx-font-size:200%;-fx-border-width:1px";
    story16Button1.setStyle(buttonStyle);
    story16Button2.setStyle(buttonStyle);
    story16Button3.setStyle(buttonStyle);

    story16Button1.setFocusTraversable(false);
    story16Button2.setFocusTraversable(false);
    story16Button3.setFocusTraversable(false);

    story16Button1.setMinSize(500, 150);
    story16Button2.setMinSize(500, 150);
    story16Button3.setMinSize(500, 150);

    story16Button1.setMaxSize(500, 150);
    story16Button2.setMaxSize(500, 150);
    story16Button3.setMaxSize(500, 150);

    story16Button1.setAlignment(Pos.CENTER);
    story16Button2.setAlignment(Pos.CENTER);
    story16Button3.setAlignment(Pos.CENTER);

    // Set up the animation for wrong answers
    final Animation story16Animation = new Transition() {
        final String story16Content = "Try double-checking your coefficients!";
        {
            setCycleDuration(Duration.millis(4000));
        }

        protected void interpolate(double frac) {
            final int story16Length = story16Content.length();
            final int story16N = Math.round(story16Length * (float) frac);
            story16Label.setText(story16Content.substring(0, story16N));
        }
    };

    // Event handlers for buttons
    story16Button1.setOnAction(event -> {
        // Incorrect answer
        story16Animation.playFromStart();
    });

    story16Button2.setOnAction(event -> {
        
         // Correct answer - move to the next scene
         switchToNextScene56(primaryStage);
    });

    story16Button3.setOnAction(event -> {
        // Incorrect answer
        story16Animation.playFromStart();
    });

    // Add components to the GridPane
    story16Node.add(story16Question, 1, 1, 1, 1);
    story16Node.add(story16Button1, 1, 2);
    story16Node.add(story16Button2, 1, 3);
    story16Node.add(story16Button3, 1, 4);
    story16Node.add(story16Label, 1, 5, 1, 1); // Add the feedback label to the last row

    // Set row and column constraints
    story16Node.getRowConstraints().addAll(
        new RowConstraints(70),  // Question
        new RowConstraints(150), // Button 1
        new RowConstraints(150), // Button 2
        new RowConstraints(150), // Button 3
        new RowConstraints(60)   // Feedback Label
    );

    story16Node.getColumnConstraints().addAll(
        new ColumnConstraints(270, 270, 270, Priority.ALWAYS, HPos.CENTER, true), // center column
        new ColumnConstraints(500) // make this larger to push elements to center
    );

    // Create and set the scene
    Scene story16Scene = new Scene(story16Node, 1280, 720);
    primaryStage.setScene(story16Scene);
    primaryStage.show();
}



private void switchToNextScene56(Stage primaryStage) { // calculus
    GridPane story16Node = new GridPane();
    
    // Load and set the background image
    Image storyBackgroundImage = new Image(getClass().getResourceAsStream("/images/paper.png"));
    BackgroundImage background = new BackgroundImage(storyBackgroundImage, BackgroundRepeat.NO_REPEAT,
            BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, new BackgroundSize(1280, 720, true, true, false, true));
    story16Node.setBackground(new Background(background));

    // Create the question label
    Label story16Question = new Label("f(x)=8x^3 + 4x^2");
    story16Question.setMinWidth(700);
    story16Question.setMaxWidth(700);
    story16Question.setMinHeight(60);
    story16Question.setMaxHeight(60);
    story16Question.setStyle("-fx-background-color:transparent;-fx-font-size:200%;-fx-text-fill:black;-fx-font-weight:bold;");
    story16Question.setAlignment(Pos.CENTER);

    // Create the feedback label
    Label story16Label = new Label("");
    story16Label.setMinWidth(700);
    story16Label.setMaxWidth(700);
    story16Label.setMinHeight(40);
    story16Label.setMaxHeight(40);
    story16Label.setStyle("-fx-text-fill:black;-fx-font-size:200%;-fx-background-color:transparent");
    story16Label.setAlignment(Pos.BOTTOM_CENTER); // Align at the bottom center

    // Define buttons for answer options
    Button story16Button1 = new Button("            a) 24x^2 + 8x");
    Button story16Button2 = new Button("            b) 4x^4 + 2x^3");
    Button story16Button3 = new Button("            c) 48x + 8");

    // Styling buttons
    String buttonStyle = "-fx-background-color:transparent;-fx-font-size:200%;-fx-border-width:1px";
    story16Button1.setStyle(buttonStyle);
    story16Button2.setStyle(buttonStyle);
    story16Button3.setStyle(buttonStyle);

    story16Button1.setFocusTraversable(false);
    story16Button2.setFocusTraversable(false);
    story16Button3.setFocusTraversable(false);

    story16Button1.setMinSize(500, 150);
    story16Button2.setMinSize(500, 150);
    story16Button3.setMinSize(500, 150);

    story16Button1.setMaxSize(500, 150);
    story16Button2.setMaxSize(500, 150);
    story16Button3.setMaxSize(500, 150);

    story16Button1.setAlignment(Pos.CENTER);
    story16Button2.setAlignment(Pos.CENTER);
    story16Button3.setAlignment(Pos.CENTER);

    // Set up the animation for wrong answers
    final Animation story16Animation = new Transition() {
        final String story16Content = "Try double-checking your coefficients!";
        {
            setCycleDuration(Duration.millis(4000));
        }

        protected void interpolate(double frac) {
            final int story16Length = story16Content.length();
            final int story16N = Math.round(story16Length * (float) frac);
            story16Label.setText(story16Content.substring(0, story16N));
        }
    };

    // Event handlers for buttons
    story16Button1.setOnAction(event -> {
        
         // Correct answer - move to the next scene
         switchToNextScene57(primaryStage);
        
    });

    story16Button2.setOnAction(event -> {
        // Incorrect answer
        story16Animation.playFromStart();
    });

    story16Button3.setOnAction(event -> {
        // Incorrect answer
        story16Animation.playFromStart();
    });

    // Add components to the GridPane
    story16Node.add(story16Question, 1, 1, 1, 1);
    story16Node.add(story16Button1, 1, 2);
    story16Node.add(story16Button2, 1, 3);
    story16Node.add(story16Button3, 1, 4);
    story16Node.add(story16Label, 1, 5, 1, 1); // Add the feedback label to the last row

    // Set row and column constraints
    story16Node.getRowConstraints().addAll(
        new RowConstraints(70),  // Question
        new RowConstraints(150), // Button 1
        new RowConstraints(150), // Button 2
        new RowConstraints(150), // Button 3
        new RowConstraints(60)   // Feedback Label
    );

    story16Node.getColumnConstraints().addAll(
        new ColumnConstraints(270, 270, 270, Priority.ALWAYS, HPos.CENTER, true), // center column
        new ColumnConstraints(500) // make this larger to push elements to center
    );

    // Create and set the scene
    Scene story16Scene = new Scene(story16Node, 1280, 720);
    primaryStage.setScene(story16Scene);
    primaryStage.show();
}



private void switchToNextScene57(Stage primaryStage) { // calculus
    GridPane story16Node = new GridPane();
    
    // Load and set the background image
    Image storyBackgroundImage = new Image(getClass().getResourceAsStream("/images/paper.png"));
    BackgroundImage background = new BackgroundImage(storyBackgroundImage, BackgroundRepeat.NO_REPEAT,
            BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, new BackgroundSize(1280, 720, true, true, false, true));
    story16Node.setBackground(new Background(background));

    // Create the question label
    Label story16Question = new Label("What is the derivative of 9x^7 + 4x^1/2?");
    story16Question.setMinWidth(700);
    story16Question.setMaxWidth(700);
    story16Question.setMinHeight(60);
    story16Question.setMaxHeight(60);
    story16Question.setStyle("-fx-background-color:transparent;-fx-font-size:200%;-fx-text-fill:black;-fx-font-weight:bold;");
    story16Question.setAlignment(Pos.CENTER);

    // Create the feedback label
    Label story16Label = new Label("");
    story16Label.setMinWidth(700);
    story16Label.setMaxWidth(700);
    story16Label.setMinHeight(40);
    story16Label.setMaxHeight(40);
    story16Label.setStyle("-fx-text-fill:black;-fx-font-size:200%;-fx-background-color:transparent");
    story16Label.setAlignment(Pos.BOTTOM_CENTER); // Align at the bottom center

    // Define buttons for answer options
    Button story16Button1 = new Button("            a) 28x^3 + 4x");
    Button story16Button2 = new Button("            b) 63x^6 + 2x^-1/2");
    Button story16Button3 = new Button("            c) 63x^6 + 2x^1/2");

    // Styling buttons
    String buttonStyle = "-fx-background-color:transparent;-fx-font-size:200%;-fx-border-width:1px";
    story16Button1.setStyle(buttonStyle);
    story16Button2.setStyle(buttonStyle);
    story16Button3.setStyle(buttonStyle);

    story16Button1.setFocusTraversable(false);
    story16Button2.setFocusTraversable(false);
    story16Button3.setFocusTraversable(false);

    story16Button1.setMinSize(500, 150);
    story16Button2.setMinSize(500, 150);
    story16Button3.setMinSize(500, 150);

    story16Button1.setMaxSize(500, 150);
    story16Button2.setMaxSize(500, 150);
    story16Button3.setMaxSize(500, 150);

    story16Button1.setAlignment(Pos.CENTER);
    story16Button2.setAlignment(Pos.CENTER);
    story16Button3.setAlignment(Pos.CENTER);

    // Set up the animation for wrong answers
    final Animation story16Animation = new Transition() {
        final String story16Content = "Try double-checking your coefficients!";
        {
            setCycleDuration(Duration.millis(4000));
        }

        protected void interpolate(double frac) {
            final int story16Length = story16Content.length();
            final int story16N = Math.round(story16Length * (float) frac);
            story16Label.setText(story16Content.substring(0, story16N));
        }
    };

    // Event handlers for buttons
    story16Button1.setOnAction(event -> {
        // Incorrect answer
        story16Animation.playFromStart();

               
    });

    story16Button2.setOnAction(event -> {
 
        
         // Correct answer - move to the next scene
         switchToNextScene58(primaryStage);
        
    });

    story16Button3.setOnAction(event -> {
        // Incorrect answer
        story16Animation.playFromStart();
    });

    // Add components to the GridPane
    story16Node.add(story16Question, 1, 1, 1, 1);
    story16Node.add(story16Button1, 1, 2);
    story16Node.add(story16Button2, 1, 3);
    story16Node.add(story16Button3, 1, 4);
    story16Node.add(story16Label, 1, 5, 1, 1); // Add the feedback label to the last row

    // Set row and column constraints
    story16Node.getRowConstraints().addAll(
        new RowConstraints(70),  // Question
        new RowConstraints(150), // Button 1
        new RowConstraints(150), // Button 2
        new RowConstraints(150), // Button 3
        new RowConstraints(60)   // Feedback Label
    );

    story16Node.getColumnConstraints().addAll(
        new ColumnConstraints(270, 270, 270, Priority.ALWAYS, HPos.CENTER, true), // center column
        new ColumnConstraints(500) // make this larger to push elements to center
    );

    // Create and set the scene
    Scene story16Scene = new Scene(story16Node, 1280, 720);
    primaryStage.setScene(story16Scene);
    primaryStage.show();
}


private void switchToNextScene58(Stage primaryStage) { // calculus
    GridPane story16Node = new GridPane();
    
    // Load and set the background image
    Image storyBackgroundImage = new Image(getClass().getResourceAsStream("/images/paper.png"));
    BackgroundImage background = new BackgroundImage(storyBackgroundImage, BackgroundRepeat.NO_REPEAT,
            BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, new BackgroundSize(1280, 720, true, true, false, true));
    story16Node.setBackground(new Background(background));

    // Create the question label
    Label story16Question = new Label("What is the second derivative of 4x + 9?");
    story16Question.setMinWidth(700);
    story16Question.setMaxWidth(700);
    story16Question.setMinHeight(60);
    story16Question.setMaxHeight(60);
    story16Question.setStyle("-fx-background-color:transparent;-fx-font-size:200%;-fx-text-fill:black;-fx-font-weight:bold;");
    story16Question.setAlignment(Pos.CENTER);

    // Create the feedback label
    Label story16Label = new Label("");
    story16Label.setMinWidth(700);
    story16Label.setMaxWidth(700);
    story16Label.setMinHeight(40);
    story16Label.setMaxHeight(40);
    story16Label.setStyle("-fx-text-fill:black;-fx-font-size:200%;-fx-background-color:transparent");
    story16Label.setAlignment(Pos.BOTTOM_CENTER); // Align at the bottom center

    // Define buttons for answer options
    Button story16Button1 = new Button("            a) 0");
    Button story16Button2 = new Button("            b) 4");
    Button story16Button3 = new Button("            c) 4x");

    // Styling buttons
    String buttonStyle = "-fx-background-color:transparent;-fx-font-size:200%;-fx-border-width:1px";
    story16Button1.setStyle(buttonStyle);
    story16Button2.setStyle(buttonStyle);
    story16Button3.setStyle(buttonStyle);

    story16Button1.setFocusTraversable(false);
    story16Button2.setFocusTraversable(false);
    story16Button3.setFocusTraversable(false);

    story16Button1.setMinSize(500, 150);
    story16Button2.setMinSize(500, 150);
    story16Button3.setMinSize(500, 150);

    story16Button1.setMaxSize(500, 150);
    story16Button2.setMaxSize(500, 150);
    story16Button3.setMaxSize(500, 150);

    story16Button1.setAlignment(Pos.CENTER);
    story16Button2.setAlignment(Pos.CENTER);
    story16Button3.setAlignment(Pos.CENTER);

    // Set up the animation for wrong answers
    final Animation story16Animation = new Transition() {
        final String story16Content = "Remember to derive twice!";
        {
            setCycleDuration(Duration.millis(4000));
        }

        protected void interpolate(double frac) {
            final int story16Length = story16Content.length();
            final int story16N = Math.round(story16Length * (float) frac);
            story16Label.setText(story16Content.substring(0, story16N));
        }
    };

    // Event handlers for buttons
    story16Button1.setOnAction(event -> {
        
         // Correct answer - move to the next scene
         switchToNextScene59(primaryStage);

               
    });

    story16Button2.setOnAction(event -> {
        // Incorrect answer
        story16Animation.playFromStart();
        
        
    });

    story16Button3.setOnAction(event -> {
        // Incorrect answer
        story16Animation.playFromStart();
    });

    // Add components to the GridPane
    story16Node.add(story16Question, 1, 1, 1, 1);
    story16Node.add(story16Button1, 1, 2);
    story16Node.add(story16Button2, 1, 3);
    story16Node.add(story16Button3, 1, 4);
    story16Node.add(story16Label, 1, 5, 1, 1); // Add the feedback label to the last row

    // Set row and column constraints
    story16Node.getRowConstraints().addAll(
        new RowConstraints(70),  // Question
        new RowConstraints(150), // Button 1
        new RowConstraints(150), // Button 2
        new RowConstraints(150), // Button 3
        new RowConstraints(60)   // Feedback Label
    );

    story16Node.getColumnConstraints().addAll(
        new ColumnConstraints(270, 270, 270, Priority.ALWAYS, HPos.CENTER, true), // center column
        new ColumnConstraints(500) // make this larger to push elements to center
    );

    // Create and set the scene
    Scene story16Scene = new Scene(story16Node, 1280, 720);
    primaryStage.setScene(story16Scene);
    primaryStage.show();
}


private void switchToNextScene59(Stage primaryStage) { // calculus
    GridPane story16Node = new GridPane();
    
    // Load and set the background image
    Image storyBackgroundImage = new Image(getClass().getResourceAsStream("/images/paper.png"));
    BackgroundImage background = new BackgroundImage(storyBackgroundImage, BackgroundRepeat.NO_REPEAT,
            BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, new BackgroundSize(1280, 720, true, true, false, true));
    story16Node.setBackground(new Background(background));

    // Create the question label
    Label story16Question = new Label("What is the fourth derivative of 9x^3+11x^2?");
    story16Question.setMinWidth(700);
    story16Question.setMaxWidth(700);
    story16Question.setMinHeight(60);
    story16Question.setMaxHeight(60);
    story16Question.setStyle("-fx-background-color:transparent;-fx-font-size:200%;-fx-text-fill:black;-fx-font-weight:bold;");
    story16Question.setAlignment(Pos.CENTER);

    // Create the feedback label
    Label story16Label = new Label("");
    story16Label.setMinWidth(700);
    story16Label.setMaxWidth(700);
    story16Label.setMinHeight(40);
    story16Label.setMaxHeight(40);
    story16Label.setStyle("-fx-text-fill:black;-fx-font-size:200%;-fx-background-color:transparent");
    story16Label.setAlignment(Pos.BOTTOM_CENTER); // Align at the bottom center

    // Define buttons for answer options
    Button story16Button1 = new Button("            a) 27x^2 + 22");
    Button story16Button2 = new Button("            b) 0");
    Button story16Button3 = new Button("            c) 54x + 22");

    // Styling buttons
    String buttonStyle = "-fx-background-color:transparent;-fx-font-size:200%;-fx-border-width:1px";
    story16Button1.setStyle(buttonStyle);
    story16Button2.setStyle(buttonStyle);
    story16Button3.setStyle(buttonStyle);

    story16Button1.setFocusTraversable(false);
    story16Button2.setFocusTraversable(false);
    story16Button3.setFocusTraversable(false);

    story16Button1.setMinSize(500, 150);
    story16Button2.setMinSize(500, 150);
    story16Button3.setMinSize(500, 150);

    story16Button1.setMaxSize(500, 150);
    story16Button2.setMaxSize(500, 150);
    story16Button3.setMaxSize(500, 150);

    story16Button1.setAlignment(Pos.CENTER);
    story16Button2.setAlignment(Pos.CENTER);
    story16Button3.setAlignment(Pos.CENTER);

    // Set up the animation for wrong answers
    final Animation story16Animation = new Transition() {
        final String story16Content = "Remember to derive four times!";
        {
            setCycleDuration(Duration.millis(4000));
        }

        protected void interpolate(double frac) {
            final int story16Length = story16Content.length();
            final int story16N = Math.round(story16Length * (float) frac);
            story16Label.setText(story16Content.substring(0, story16N));
        }
    };

    // Event handlers for buttons
    story16Button1.setOnAction(event -> {
         // Incorrect answer
         story16Animation.playFromStart();
       
               
    });

    story16Button2.setOnAction(event -> {
       
          // Correct answer - move to the next scene
          switchToNextScene60(primaryStage);

        
        
    });

    story16Button3.setOnAction(event -> {
        // Incorrect answer
        story16Animation.playFromStart();
    });

    // Add components to the GridPane
    story16Node.add(story16Question, 1, 1, 1, 1);
    story16Node.add(story16Button1, 1, 2);
    story16Node.add(story16Button2, 1, 3);
    story16Node.add(story16Button3, 1, 4);
    story16Node.add(story16Label, 1, 5, 1, 1); // Add the feedback label to the last row

    // Set row and column constraints
    story16Node.getRowConstraints().addAll(
        new RowConstraints(70),  // Question
        new RowConstraints(150), // Button 1
        new RowConstraints(150), // Button 2
        new RowConstraints(150), // Button 3
        new RowConstraints(60)   // Feedback Label
    );

    story16Node.getColumnConstraints().addAll(
        new ColumnConstraints(270, 270, 270, Priority.ALWAYS, HPos.CENTER, true), // center column
        new ColumnConstraints(500) // make this larger to push elements to center
    );

    // Create and set the scene
    Scene story16Scene = new Scene(story16Node, 1280, 720);
    primaryStage.setScene(story16Scene);
    primaryStage.show();
}



private void switchToNextScene60(Stage primaryStage) { // calculus
    GridPane story16Node = new GridPane();
    
    // Load and set the background image
    Image storyBackgroundImage = new Image(getClass().getResourceAsStream("/images/paper.png"));
    BackgroundImage background = new BackgroundImage(storyBackgroundImage, BackgroundRepeat.NO_REPEAT,
            BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, new BackgroundSize(1280, 720, true, true, false, true));
    story16Node.setBackground(new Background(background));

    // Create the question label
    Label story16Question = new Label("What is the second derivative of 12x^2 + 4x^1?");
    story16Question.setMinWidth(700);
    story16Question.setMaxWidth(700);
    story16Question.setMinHeight(60);
    story16Question.setMaxHeight(60);
    story16Question.setStyle("-fx-background-color:transparent;-fx-font-size:200%;-fx-text-fill:black;-fx-font-weight:bold;");
    story16Question.setAlignment(Pos.CENTER);

    // Create the feedback label
    Label story16Label = new Label("");
    story16Label.setMinWidth(700);
    story16Label.setMaxWidth(700);
    story16Label.setMinHeight(40);
    story16Label.setMaxHeight(40);
    story16Label.setStyle("-fx-text-fill:black;-fx-font-size:200%;-fx-background-color:transparent");
    story16Label.setAlignment(Pos.BOTTOM_CENTER); // Align at the bottom center

    // Define buttons for answer options
    Button story16Button1 = new Button("            a) 24");
    Button story16Button2 = new Button("            b) 24x + 4");
    Button story16Button3 = new Button("            c) 0");

    // Styling buttons
    String buttonStyle = "-fx-background-color:transparent;-fx-font-size:200%;-fx-border-width:1px";
    story16Button1.setStyle(buttonStyle);
    story16Button2.setStyle(buttonStyle);
    story16Button3.setStyle(buttonStyle);

    story16Button1.setFocusTraversable(false);
    story16Button2.setFocusTraversable(false);
    story16Button3.setFocusTraversable(false);

    story16Button1.setMinSize(500, 150);
    story16Button2.setMinSize(500, 150);
    story16Button3.setMinSize(500, 150);

    story16Button1.setMaxSize(500, 150);
    story16Button2.setMaxSize(500, 150);
    story16Button3.setMaxSize(500, 150);

    story16Button1.setAlignment(Pos.CENTER);
    story16Button2.setAlignment(Pos.CENTER);
    story16Button3.setAlignment(Pos.CENTER);

    // Set up the animation for wrong answers
    final Animation story16Animation = new Transition() {
        final String story16Content = "Remember to derive twice!";
        {
            setCycleDuration(Duration.millis(4000));
        }

        protected void interpolate(double frac) {
            final int story16Length = story16Content.length();
            final int story16N = Math.round(story16Length * (float) frac);
            story16Label.setText(story16Content.substring(0, story16N));
        }
    };

    // Event handlers for buttons
    story16Button1.setOnAction(event -> {
        // Correct answer - move to the next scene
        switchToNextScene61(primaryStage);
         
               
    });

    story16Button2.setOnAction(event -> {
       // Incorrect answer
       story16Animation.playFromStart();
        
    });

    story16Button3.setOnAction(event -> {
        // Incorrect answer
        story16Animation.playFromStart();
    });

    // Add components to the GridPane
    story16Node.add(story16Question, 1, 1, 1, 1);
    story16Node.add(story16Button1, 1, 2);
    story16Node.add(story16Button2, 1, 3);
    story16Node.add(story16Button3, 1, 4);
    story16Node.add(story16Label, 1, 5, 1, 1); // Add the feedback label to the last row

    // Set row and column constraints
    story16Node.getRowConstraints().addAll(
        new RowConstraints(70),  // Question
        new RowConstraints(150), // Button 1
        new RowConstraints(150), // Button 2
        new RowConstraints(150), // Button 3
        new RowConstraints(60)   // Feedback Label
    );

    story16Node.getColumnConstraints().addAll(
        new ColumnConstraints(270, 270, 270, Priority.ALWAYS, HPos.CENTER, true), // center column
        new ColumnConstraints(500) // make this larger to push elements to center
    );

    // Create and set the scene
    Scene story16Scene = new Scene(story16Node, 1280, 720);
    primaryStage.setScene(story16Scene);
    primaryStage.show();
}



private void switchToNextScene61(Stage primaryStage) { 
    GridPane story4Node = new GridPane();
    story4Node.setPadding(new Insets(20));
    story4Node.setHgap(10);
    story4Node.setVgap(10); 

    
    

    // Load and set the background image
    Image storyBackgroundImage = new Image(getClass().getResourceAsStream("/images/sevillaclassroom.png"));
    BackgroundImage background = new BackgroundImage(storyBackgroundImage, BackgroundRepeat.NO_REPEAT,
            BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, new BackgroundSize(1280, 720, true, true, false, true));
    story4Node.setBackground(new Background(background));
       // Create a Label for the speaker
    Label story2Speaker = new Label();
    story2Speaker.setText("Mr.Sevilla");
    story2Speaker.setStyle("-fx-text-fill: white; -fx-font-size: 250%; -fx-font-weight: bold;");
    
    story2Speaker.setAlignment(Pos.CENTER_LEFT);
    story2Speaker.setAlignment(Pos.CENTER_LEFT);

    // Create a Label for the story text
    Label story2Label = new Label();
    story2Label.setWrapText(true);
    story2Label.setMinWidth(1140);
    story2Label.setMaxWidth(1140);
    story2Label.setMinHeight(150);
    story2Label.setStyle("-fx-text-fill: black; -fx-font-size: 200%; -fx-background-color: rgba(255,255,255,0.7);");
    story2Label.setAlignment(Pos.CENTER_LEFT);

    // Create blank labels for spacing
    Label story2Blank = new Label();
    story2Blank.setMinWidth(100);
    story2Blank.setMinHeight(0);
    story2Blank.setStyle("-fx-background-color: transparent");

    Label story2Blank1 = new Label();
    story2Blank1.setMinWidth(0);
    story2Blank1.setMinHeight(100);
    story2Blank1.setStyle("-fx-background-color: rgba(255,255,255,0.7)");

    // Animation for text dialogue
    final String story2Content = "         *sigh* My students are such a pain. Lower life forms are such handful. But, *you* must like your students, huh? ";
    final int instantCharactersCount = 10; // Number of characters to show instantly

    final Animation story2Animation = new Transition() {
        {
            setCycleDuration(Duration.millis(3000)); // Total duration for the animated part
        }

        protected void interpolate(double frac) {
            int totalLength = story2Content.length();
            int remainingCharacters = totalLength - instantCharactersCount;
            if (remainingCharacters > 0) {
                // Calculate the index of the last character to be shown for the current fraction
                int index = instantCharactersCount + Math.round(remainingCharacters * (float) frac);
                story2Label.setText(story2Content.substring(0, index));
        }else {
            // If the content is shorter than the number of instant characters, show it all instantly
            story2Label.setText(story2Content);
        }
    };};
    
    story2Animation.play();


    // Add elements to GridPane
    story4Node.add(story2Speaker, 2, 2);
    story4Node.add(story2Label, 2, 3);
    story4Node.add(story2Blank, 1, 2, 1, 1);
    story4Node.add(story2Blank1, 1, 3, 1, 1);

    // Define row and column constraints

    RowConstraints story2row1 = new RowConstraints();
    story2row1.setMinHeight(210);
    RowConstraints story2row2 = new RowConstraints();
    story2row2.setMinHeight(210);
    RowConstraints story2row3 = new RowConstraints();
    story2row3.setMinHeight(0);
    RowConstraints story2row4 = new RowConstraints();
    story2row4.setMinHeight(0);

    
    ColumnConstraints story2col1 = new ColumnConstraints();
    story2col1.setMinWidth(0); // Increase left margin
    ColumnConstraints story2col2 = new ColumnConstraints();
    story2col2.setMinWidth(20); // Spacer or small content
    ColumnConstraints story2col3 = new ColumnConstraints();
    story2col3.setMinWidth(800); // Increase width for main text content
    ColumnConstraints story2col4 = new ColumnConstraints();
    story2col4.setMinWidth(800); // Adjust right padding


    story4Node.getRowConstraints().addAll(story2row1, story2row2, story2row3, story2row4);
    story4Node.getColumnConstraints().addAll(story2col1, story2col2, story2col3, story2col4);

    // Create and set the new scene
    Scene newScene = new Scene(story4Node, 1280, 720);
    primaryStage.setScene(newScene);
    // Add key event listener for arrow keys to navigate scenes
    newScene.setOnKeyPressed(event -> {
        if (event.getCode() == KeyCode.RIGHT) {
            switchToNextScene62(primaryStage);//always the bigger number
        } else if (event.getCode() == KeyCode.LEFT) {
            switchToNextScene60(primaryStage);

        } 
    });
}


private void switchToNextScene62(Stage primaryStage) { 
    GridPane story4Node = new GridPane();
    story4Node.setPadding(new Insets(20));
    story4Node.setHgap(10);
    story4Node.setVgap(10); 

    
    

    // Load and set the background image
    Image storyBackgroundImage = new Image(getClass().getResourceAsStream("/images/shockedsevilla.png"));
    BackgroundImage background = new BackgroundImage(storyBackgroundImage, BackgroundRepeat.NO_REPEAT,
            BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, new BackgroundSize(1280, 720, true, true, false, true));
    story4Node.setBackground(new Background(background));
       // Create a Label for the speaker
    Label story2Speaker = new Label();
    story2Speaker.setText("Mr.Enriquez");
    story2Speaker.setStyle("-fx-text-fill: white; -fx-font-size: 250%; -fx-font-weight: bold;");
    
    story2Speaker.setAlignment(Pos.CENTER_LEFT);
    story2Speaker.setAlignment(Pos.CENTER_LEFT);

    // Create a Label for the story text
    Label story2Label = new Label();
    story2Label.setWrapText(true);
    story2Label.setMinWidth(1140);
    story2Label.setMaxWidth(1140);
    story2Label.setMinHeight(150);
    story2Label.setStyle("-fx-text-fill: black; -fx-font-size: 200%; -fx-background-color: rgba(255,255,255,0.7);");
    story2Label.setAlignment(Pos.CENTER_LEFT);

    // Create blank labels for spacing
    Label story2Blank = new Label();
    story2Blank.setMinWidth(100);
    story2Blank.setMinHeight(0);
    story2Blank.setStyle("-fx-background-color: transparent");

    Label story2Blank1 = new Label();
    story2Blank1.setMinWidth(0);
    story2Blank1.setMinHeight(100);
    story2Blank1.setStyle("-fx-background-color: rgba(255,255,255,0.7)");

    // Animation for text dialogue
    final String story2Content = "         Oh no, not at all. I made sure to give all my students very hard problems on their tests. ";
    final int instantCharactersCount = 10; // Number of characters to show instantly

    final Animation story2Animation = new Transition() {
        {
            setCycleDuration(Duration.millis(3000)); // Total duration for the animated part
        }

        protected void interpolate(double frac) {
            int totalLength = story2Content.length();
            int remainingCharacters = totalLength - instantCharactersCount;
            if (remainingCharacters > 0) {
                // Calculate the index of the last character to be shown for the current fraction
                int index = instantCharactersCount + Math.round(remainingCharacters * (float) frac);
                story2Label.setText(story2Content.substring(0, index));
        }else {
            // If the content is shorter than the number of instant characters, show it all instantly
            story2Label.setText(story2Content);
        }
    };};
    
    story2Animation.play();


    // Add elements to GridPane
    story4Node.add(story2Speaker, 2, 2);
    story4Node.add(story2Label, 2, 3);
    story4Node.add(story2Blank, 1, 2, 1, 1);
    story4Node.add(story2Blank1, 1, 3, 1, 1);

    // Define row and column constraints

    RowConstraints story2row1 = new RowConstraints();
    story2row1.setMinHeight(210);
    RowConstraints story2row2 = new RowConstraints();
    story2row2.setMinHeight(210);
    RowConstraints story2row3 = new RowConstraints();
    story2row3.setMinHeight(0);
    RowConstraints story2row4 = new RowConstraints();
    story2row4.setMinHeight(0);

    
    ColumnConstraints story2col1 = new ColumnConstraints();
    story2col1.setMinWidth(0); // Increase left margin
    ColumnConstraints story2col2 = new ColumnConstraints();
    story2col2.setMinWidth(20); // Spacer or small content
    ColumnConstraints story2col3 = new ColumnConstraints();
    story2col3.setMinWidth(800); // Increase width for main text content
    ColumnConstraints story2col4 = new ColumnConstraints();
    story2col4.setMinWidth(800); // Adjust right padding


    story4Node.getRowConstraints().addAll(story2row1, story2row2, story2row3, story2row4);
    story4Node.getColumnConstraints().addAll(story2col1, story2col2, story2col3, story2col4);

    // Create and set the new scene
    Scene newScene = new Scene(story4Node, 1280, 720);
    primaryStage.setScene(newScene);
    // Add key event listener for arrow keys to navigate scenes
    newScene.setOnKeyPressed(event -> {
        if (event.getCode() == KeyCode.RIGHT) {
            switchToNextScene63(primaryStage);//always the bigger number
        } else if (event.getCode() == KeyCode.LEFT) {
            switchToNextScene61(primaryStage);

        } 
    });
}




private void switchToNextScene63(Stage primaryStage) { 
    GridPane story4Node = new GridPane();
    story4Node.setPadding(new Insets(20));
    story4Node.setHgap(10);
    story4Node.setVgap(10); 

    
    

    // Load and set the background image
    Image storyBackgroundImage = new Image(getClass().getResourceAsStream("/images/shockedsevilla.png"));
    BackgroundImage background = new BackgroundImage(storyBackgroundImage, BackgroundRepeat.NO_REPEAT,
            BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, new BackgroundSize(1280, 720, true, true, false, true));
    story4Node.setBackground(new Background(background));
       // Create a Label for the speaker
    Label story2Speaker = new Label();
    story2Speaker.setText("Mr.Sevilla");
    story2Speaker.setStyle("-fx-text-fill: white; -fx-font-size: 250%; -fx-font-weight: bold;");
    
    story2Speaker.setAlignment(Pos.CENTER_LEFT);
    story2Speaker.setAlignment(Pos.CENTER_LEFT);

    // Create a Label for the story text
    Label story2Label = new Label();
    story2Label.setWrapText(true);
    story2Label.setMinWidth(1140);
    story2Label.setMaxWidth(1140);
    story2Label.setMinHeight(150);
    story2Label.setStyle("-fx-text-fill: black; -fx-font-size: 200%; -fx-background-color: rgba(255,255,255,0.7);");
    story2Label.setAlignment(Pos.CENTER_LEFT);

    // Create blank labels for spacing
    Label story2Blank = new Label();
    story2Blank.setMinWidth(100);
    story2Blank.setMinHeight(0);
    story2Blank.setStyle("-fx-background-color: transparent");

    Label story2Blank1 = new Label();
    story2Blank1.setMinWidth(0);
    story2Blank1.setMinHeight(100);
    story2Blank1.setStyle("-fx-background-color: rgba(255,255,255,0.7)");

    // Animation for text dialogue
    final String story2Content = "         O-oh yeah? Give me an example. ";
    final int instantCharactersCount = 10; // Number of characters to show instantly

    final Animation story2Animation = new Transition() {
        {
            setCycleDuration(Duration.millis(3000)); // Total duration for the animated part
        }

        protected void interpolate(double frac) {
            int totalLength = story2Content.length();
            int remainingCharacters = totalLength - instantCharactersCount;
            if (remainingCharacters > 0) {
                // Calculate the index of the last character to be shown for the current fraction
                int index = instantCharactersCount + Math.round(remainingCharacters * (float) frac);
                story2Label.setText(story2Content.substring(0, index));
        }else {
            // If the content is shorter than the number of instant characters, show it all instantly
            story2Label.setText(story2Content);
        }
    };};
    
    story2Animation.play();


    // Add elements to GridPane
    story4Node.add(story2Speaker, 2, 2);
    story4Node.add(story2Label, 2, 3);
    story4Node.add(story2Blank, 1, 2, 1, 1);
    story4Node.add(story2Blank1, 1, 3, 1, 1);

    // Define row and column constraints

    RowConstraints story2row1 = new RowConstraints();
    story2row1.setMinHeight(210);
    RowConstraints story2row2 = new RowConstraints();
    story2row2.setMinHeight(210);
    RowConstraints story2row3 = new RowConstraints();
    story2row3.setMinHeight(0);
    RowConstraints story2row4 = new RowConstraints();
    story2row4.setMinHeight(0);

    
    ColumnConstraints story2col1 = new ColumnConstraints();
    story2col1.setMinWidth(0); // Increase left margin
    ColumnConstraints story2col2 = new ColumnConstraints();
    story2col2.setMinWidth(20); // Spacer or small content
    ColumnConstraints story2col3 = new ColumnConstraints();
    story2col3.setMinWidth(800); // Increase width for main text content
    ColumnConstraints story2col4 = new ColumnConstraints();
    story2col4.setMinWidth(800); // Adjust right padding


    story4Node.getRowConstraints().addAll(story2row1, story2row2, story2row3, story2row4);
    story4Node.getColumnConstraints().addAll(story2col1, story2col2, story2col3, story2col4);

    // Create and set the new scene
    Scene newScene = new Scene(story4Node, 1280, 720);
    primaryStage.setScene(newScene);
    // Add key event listener for arrow keys to navigate scenes
    newScene.setOnKeyPressed(event -> {
        if (event.getCode() == KeyCode.RIGHT) {
            switchToNextScene64(primaryStage);//always the bigger number
        } else if (event.getCode() == KeyCode.LEFT) {
            switchToNextScene62(primaryStage);

        } 
    });
}






private void switchToNextScene64(Stage primaryStage) { 
    GridPane story4Node = new GridPane();
    story4Node.setPadding(new Insets(20));
    story4Node.setHgap(10);
    story4Node.setVgap(10); 

    
    

    // Load and set the background image
    Image storyBackgroundImage = new Image(getClass().getResourceAsStream("/images/shockedsevillaenriquetal.png"));
    BackgroundImage background = new BackgroundImage(storyBackgroundImage, BackgroundRepeat.NO_REPEAT,
            BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, new BackgroundSize(1280, 720, true, true, false, true));
    story4Node.setBackground(new Background(background));
       // Create a Label for the speaker
    Label story2Speaker = new Label();
    story2Speaker.setText("Mr.Enriquez");
    story2Speaker.setStyle("-fx-text-fill: white; -fx-font-size: 250%; -fx-font-weight: bold;");
    
    story2Speaker.setAlignment(Pos.CENTER_LEFT);
    story2Speaker.setAlignment(Pos.CENTER_LEFT);

    // Create a Label for the story text
    Label story2Label = new Label();
    story2Label.setWrapText(true);
    story2Label.setMinWidth(1140);
    story2Label.setMaxWidth(1140);
    story2Label.setMinHeight(150);
    story2Label.setStyle("-fx-text-fill: black; -fx-font-size: 200%; -fx-background-color: rgba(255,255,255,0.7);");
    story2Label.setAlignment(Pos.CENTER_LEFT);

    // Create blank labels for spacing
    Label story2Blank = new Label();
    story2Blank.setMinWidth(100);
    story2Blank.setMinHeight(0);
    story2Blank.setStyle("-fx-background-color: transparent");

    Label story2Blank1 = new Label();
    story2Blank1.setMinWidth(0);
    story2Blank1.setMinHeight(100);
    story2Blank1.setStyle("-fx-background-color: rgba(255,255,255,0.7)");

    // Animation for text dialogue
    final String story2Content = "         One time, i gave them a TRICK question in order to ensure they failed. I TOLD THEM TO COUNT RECURSIONS but there WERE NO recursions!! ";
    final int instantCharactersCount = 10; // Number of characters to show instantly

    final Animation story2Animation = new Transition() {
        {
            setCycleDuration(Duration.millis(3000)); // Total duration for the animated part
        }

        protected void interpolate(double frac) {
            int totalLength = story2Content.length();
            int remainingCharacters = totalLength - instantCharactersCount;
            if (remainingCharacters > 0) {
                // Calculate the index of the last character to be shown for the current fraction
                int index = instantCharactersCount + Math.round(remainingCharacters * (float) frac);
                story2Label.setText(story2Content.substring(0, index));
        }else {
            // If the content is shorter than the number of instant characters, show it all instantly
            story2Label.setText(story2Content);
        }
    };};
    
    story2Animation.play();


    // Add elements to GridPane
    story4Node.add(story2Speaker, 2, 2);
    story4Node.add(story2Label, 2, 3);
    story4Node.add(story2Blank, 1, 2, 1, 1);
    story4Node.add(story2Blank1, 1, 3, 1, 1);

    // Define row and column constraints

    RowConstraints story2row1 = new RowConstraints();
    story2row1.setMinHeight(210);
    RowConstraints story2row2 = new RowConstraints();
    story2row2.setMinHeight(210);
    RowConstraints story2row3 = new RowConstraints();
    story2row3.setMinHeight(0);
    RowConstraints story2row4 = new RowConstraints();
    story2row4.setMinHeight(0);

    
    ColumnConstraints story2col1 = new ColumnConstraints();
    story2col1.setMinWidth(0); // Increase left margin
    ColumnConstraints story2col2 = new ColumnConstraints();
    story2col2.setMinWidth(20); // Spacer or small content
    ColumnConstraints story2col3 = new ColumnConstraints();
    story2col3.setMinWidth(800); // Increase width for main text content
    ColumnConstraints story2col4 = new ColumnConstraints();
    story2col4.setMinWidth(800); // Adjust right padding


    story4Node.getRowConstraints().addAll(story2row1, story2row2, story2row3, story2row4);
    story4Node.getColumnConstraints().addAll(story2col1, story2col2, story2col3, story2col4);

    // Create and set the new scene
    Scene newScene = new Scene(story4Node, 1280, 720);
    primaryStage.setScene(newScene);
    // Add key event listener for arrow keys to navigate scenes
    newScene.setOnKeyPressed(event -> {
        if (event.getCode() == KeyCode.RIGHT) {
            switchToNextScene65(primaryStage);//always the bigger number
        } else if (event.getCode() == KeyCode.LEFT) {
            switchToNextScene63(primaryStage);

        } 
    });
}



private void switchToNextScene65(Stage primaryStage) { 
    GridPane story4Node = new GridPane();
    story4Node.setPadding(new Insets(20));
    story4Node.setHgap(10);
    story4Node.setVgap(10); 

    
    

    // Load and set the background image
    Image storyBackgroundImage = new Image(getClass().getResourceAsStream("/images/shockedsevilla.png"));
    BackgroundImage background = new BackgroundImage(storyBackgroundImage, BackgroundRepeat.NO_REPEAT,
            BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, new BackgroundSize(1280, 720, true, true, false, true));
    story4Node.setBackground(new Background(background));
       // Create a Label for the speaker
    Label story2Speaker = new Label();
    story2Speaker.setText("Mr.Sevilla");
    story2Speaker.setStyle("-fx-text-fill: white; -fx-font-size: 250%; -fx-font-weight: bold;");
    
    story2Speaker.setAlignment(Pos.CENTER_LEFT);
    story2Speaker.setAlignment(Pos.CENTER_LEFT);

    // Create a Label for the story text
    Label story2Label = new Label();
    story2Label.setWrapText(true);
    story2Label.setMinWidth(1140);
    story2Label.setMaxWidth(1140);
    story2Label.setMinHeight(150);
    story2Label.setStyle("-fx-text-fill: black; -fx-font-size: 200%; -fx-background-color: rgba(255,255,255,0.7);");
    story2Label.setAlignment(Pos.CENTER_LEFT);

    // Create blank labels for spacing
    Label story2Blank = new Label();
    story2Blank.setMinWidth(100);
    story2Blank.setMinHeight(0);
    story2Blank.setStyle("-fx-background-color: transparent");

    Label story2Blank1 = new Label();
    story2Blank1.setMinWidth(0);
    story2Blank1.setMinHeight(100);
    story2Blank1.setStyle("-fx-background-color: rgba(255,255,255,0.7)");

    // Animation for text dialogue
    final String story2Content = "         WHAT n-n-no fair!!! I have a reputation to hold as the most difficult teacher in the math department!!!! IM LEAVING!!! CONSIDE OUR RELATIONSHIP #OVER!! ";
    final int instantCharactersCount = 10; // Number of characters to show instantly

    final Animation story2Animation = new Transition() {
        {
            setCycleDuration(Duration.millis(3000)); // Total duration for the animated part
        }

        protected void interpolate(double frac) {
            int totalLength = story2Content.length();
            int remainingCharacters = totalLength - instantCharactersCount;
            if (remainingCharacters > 0) {
                // Calculate the index of the last character to be shown for the current fraction
                int index = instantCharactersCount + Math.round(remainingCharacters * (float) frac);
                story2Label.setText(story2Content.substring(0, index));
        }else {
            // If the content is shorter than the number of instant characters, show it all instantly
            story2Label.setText(story2Content);
        }
    };};
    
    story2Animation.play();


    // Add elements to GridPane
    story4Node.add(story2Speaker, 2, 2);
    story4Node.add(story2Label, 2, 3);
    story4Node.add(story2Blank, 1, 2, 1, 1);
    story4Node.add(story2Blank1, 1, 3, 1, 1);

    // Define row and column constraints

    RowConstraints story2row1 = new RowConstraints();
    story2row1.setMinHeight(210);
    RowConstraints story2row2 = new RowConstraints();
    story2row2.setMinHeight(210);
    RowConstraints story2row3 = new RowConstraints();
    story2row3.setMinHeight(0);
    RowConstraints story2row4 = new RowConstraints();
    story2row4.setMinHeight(0);

    
    ColumnConstraints story2col1 = new ColumnConstraints();
    story2col1.setMinWidth(0); // Increase left margin
    ColumnConstraints story2col2 = new ColumnConstraints();
    story2col2.setMinWidth(20); // Spacer or small content
    ColumnConstraints story2col3 = new ColumnConstraints();
    story2col3.setMinWidth(800); // Increase width for main text content
    ColumnConstraints story2col4 = new ColumnConstraints();
    story2col4.setMinWidth(800); // Adjust right padding


    story4Node.getRowConstraints().addAll(story2row1, story2row2, story2row3, story2row4);
    story4Node.getColumnConstraints().addAll(story2col1, story2col2, story2col3, story2col4);

    // Create and set the new scene
    Scene newScene = new Scene(story4Node, 1280, 720);
    primaryStage.setScene(newScene);
    // Add key event listener for arrow keys to navigate scenes
    newScene.setOnKeyPressed(event -> {
        if (event.getCode() == KeyCode.RIGHT) {
            switchToNextScene66(primaryStage);//always the bigger number
        } else if (event.getCode() == KeyCode.LEFT) {
            switchToNextScene64(primaryStage);

        } 
    });
}




private void switchToNextScene66(Stage primaryStage) { 
    GridPane story4Node = new GridPane();
    story4Node.setPadding(new Insets(20));
    story4Node.setHgap(10);
    story4Node.setVgap(10); 

    
    

    // Load and set the background image
    Image storyBackgroundImage = new Image(getClass().getResourceAsStream("/images/shockedsevillasurprisedenriquez.png"));
    BackgroundImage background = new BackgroundImage(storyBackgroundImage, BackgroundRepeat.NO_REPEAT,
            BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, new BackgroundSize(1280, 720, true, true, false, true));
    story4Node.setBackground(new Background(background));
       // Create a Label for the speaker
    Label story2Speaker = new Label();
    story2Speaker.setText("Mr.Enriquez");
    story2Speaker.setStyle("-fx-text-fill: white; -fx-font-size: 250%; -fx-font-weight: bold;");
    
    story2Speaker.setAlignment(Pos.CENTER_LEFT);
    story2Speaker.setAlignment(Pos.CENTER_LEFT);

    // Create a Label for the story text
    Label story2Label = new Label();
    story2Label.setWrapText(true);
    story2Label.setMinWidth(1140);
    story2Label.setMaxWidth(1140);
    story2Label.setMinHeight(150);
    story2Label.setStyle("-fx-text-fill: black; -fx-font-size: 200%; -fx-background-color: rgba(255,255,255,0.7);");
    story2Label.setAlignment(Pos.CENTER_LEFT);

    // Create blank labels for spacing
    Label story2Blank = new Label();
    story2Blank.setMinWidth(100);
    story2Blank.setMinHeight(0);
    story2Blank.setStyle("-fx-background-color: transparent");

    Label story2Blank1 = new Label();
    story2Blank1.setMinWidth(0);
    story2Blank1.setMinHeight(100);
    story2Blank1.setStyle("-fx-background-color: rgba(255,255,255,0.7)");

    // Animation for text dialogue
    final String story2Content = "         Wait..! Don’t go… ";
    final int instantCharactersCount = 10; // Number of characters to show instantly

    final Animation story2Animation = new Transition() {
        {
            setCycleDuration(Duration.millis(3000)); // Total duration for the animated part
        }

        protected void interpolate(double frac) {
            int totalLength = story2Content.length();
            int remainingCharacters = totalLength - instantCharactersCount;
            if (remainingCharacters > 0) {
                // Calculate the index of the last character to be shown for the current fraction
                int index = instantCharactersCount + Math.round(remainingCharacters * (float) frac);
                story2Label.setText(story2Content.substring(0, index));
        }else {
            // If the content is shorter than the number of instant characters, show it all instantly
            story2Label.setText(story2Content);
        }
    };};
    
    story2Animation.play();


    // Add elements to GridPane
    story4Node.add(story2Speaker, 2, 2);
    story4Node.add(story2Label, 2, 3);
    story4Node.add(story2Blank, 1, 2, 1, 1);
    story4Node.add(story2Blank1, 1, 3, 1, 1);

    // Define row and column constraints

    RowConstraints story2row1 = new RowConstraints();
    story2row1.setMinHeight(210);
    RowConstraints story2row2 = new RowConstraints();
    story2row2.setMinHeight(210);
    RowConstraints story2row3 = new RowConstraints();
    story2row3.setMinHeight(0);
    RowConstraints story2row4 = new RowConstraints();
    story2row4.setMinHeight(0);

    
    ColumnConstraints story2col1 = new ColumnConstraints();
    story2col1.setMinWidth(0); // Increase left margin
    ColumnConstraints story2col2 = new ColumnConstraints();
    story2col2.setMinWidth(20); // Spacer or small content
    ColumnConstraints story2col3 = new ColumnConstraints();
    story2col3.setMinWidth(800); // Increase width for main text content
    ColumnConstraints story2col4 = new ColumnConstraints();
    story2col4.setMinWidth(800); // Adjust right padding


    story4Node.getRowConstraints().addAll(story2row1, story2row2, story2row3, story2row4);
    story4Node.getColumnConstraints().addAll(story2col1, story2col2, story2col3, story2col4);

    // Create and set the new scene
    Scene newScene = new Scene(story4Node, 1280, 720);
    primaryStage.setScene(newScene);
    // Add key event listener for arrow keys to navigate scenes
    newScene.setOnKeyPressed(event -> {
        if (event.getCode() == KeyCode.RIGHT) {
            switchToNextScene67(primaryStage);//always the bigger number
        } else if (event.getCode() == KeyCode.LEFT) {
            switchToNextScene65(primaryStage);

        } 
    });
}


private void switchToNextScene67(Stage primaryStage) { 
    GridPane story4Node = new GridPane();
    story4Node.setPadding(new Insets(20));
    story4Node.setHgap(10);
    story4Node.setVgap(10); 

    
    

    // Load and set the background image
    Image storyBackgroundImage = new Image(getClass().getResourceAsStream("/images/shockedsevillasurprisedenriquez.png"));
    BackgroundImage background = new BackgroundImage(storyBackgroundImage, BackgroundRepeat.NO_REPEAT,
            BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, new BackgroundSize(1280, 720, true, true, false, true));
    story4Node.setBackground(new Background(background));
       // Create a Label for the speaker
    Label story2Speaker = new Label();
    story2Speaker.setText("Mr.Sevilla");
    story2Speaker.setStyle("-fx-text-fill: white; -fx-font-size: 250%; -fx-font-weight: bold;");
    
    story2Speaker.setAlignment(Pos.CENTER_LEFT);
    story2Speaker.setAlignment(Pos.CENTER_LEFT);

    // Create a Label for the story text
    Label story2Label = new Label();
    story2Label.setWrapText(true);
    story2Label.setMinWidth(1140);
    story2Label.setMaxWidth(1140);
    story2Label.setMinHeight(150);
    story2Label.setStyle("-fx-text-fill: black; -fx-font-size: 200%; -fx-background-color: rgba(255,255,255,0.7);");
    story2Label.setAlignment(Pos.CENTER_LEFT);

    // Create blank labels for spacing
    Label story2Blank = new Label();
    story2Blank.setMinWidth(100);
    story2Blank.setMinHeight(0);
    story2Blank.setStyle("-fx-background-color: transparent");

    Label story2Blank1 = new Label();
    story2Blank1.setMinWidth(0);
    story2Blank1.setMinHeight(100);
    story2Blank1.setStyle("-fx-background-color: rgba(255,255,255,0.7)");

    // Animation for text dialogue
    final String story2Content = "         What!? What do you want! Stupid! ";
    final int instantCharactersCount = 10; // Number of characters to show instantly

    final Animation story2Animation = new Transition() {
        {
            setCycleDuration(Duration.millis(3000)); // Total duration for the animated part
        }

        protected void interpolate(double frac) {
            int totalLength = story2Content.length();
            int remainingCharacters = totalLength - instantCharactersCount;
            if (remainingCharacters > 0) {
                // Calculate the index of the last character to be shown for the current fraction
                int index = instantCharactersCount + Math.round(remainingCharacters * (float) frac);
                story2Label.setText(story2Content.substring(0, index));
        }else {
            // If the content is shorter than the number of instant characters, show it all instantly
            story2Label.setText(story2Content);
        }
    };};
    
    story2Animation.play();


    // Add elements to GridPane
    story4Node.add(story2Speaker, 2, 2);
    story4Node.add(story2Label, 2, 3);
    story4Node.add(story2Blank, 1, 2, 1, 1);
    story4Node.add(story2Blank1, 1, 3, 1, 1);

    // Define row and column constraints

    RowConstraints story2row1 = new RowConstraints();
    story2row1.setMinHeight(210);
    RowConstraints story2row2 = new RowConstraints();
    story2row2.setMinHeight(210);
    RowConstraints story2row3 = new RowConstraints();
    story2row3.setMinHeight(0);
    RowConstraints story2row4 = new RowConstraints();
    story2row4.setMinHeight(0);

    
    ColumnConstraints story2col1 = new ColumnConstraints();
    story2col1.setMinWidth(0); // Increase left margin
    ColumnConstraints story2col2 = new ColumnConstraints();
    story2col2.setMinWidth(20); // Spacer or small content
    ColumnConstraints story2col3 = new ColumnConstraints();
    story2col3.setMinWidth(800); // Increase width for main text content
    ColumnConstraints story2col4 = new ColumnConstraints();
    story2col4.setMinWidth(800); // Adjust right padding


    story4Node.getRowConstraints().addAll(story2row1, story2row2, story2row3, story2row4);
    story4Node.getColumnConstraints().addAll(story2col1, story2col2, story2col3, story2col4);

    // Create and set the new scene
    Scene newScene = new Scene(story4Node, 1280, 720);
    primaryStage.setScene(newScene);
    // Add key event listener for arrow keys to navigate scenes
    newScene.setOnKeyPressed(event -> {
        if (event.getCode() == KeyCode.RIGHT) {
            switchToNextScene68(primaryStage);//always the bigger number
        } else if (event.getCode() == KeyCode.LEFT) {
            switchToNextScene66(primaryStage);

        } 
    });
}

private void switchToNextScene68(Stage primaryStage) { 
    GridPane story4Node = new GridPane();
    story4Node.setPadding(new Insets(20));
    story4Node.setHgap(10);
    story4Node.setVgap(10); 

    
    

    // Load and set the background image
    Image storyBackgroundImage = new Image(getClass().getResourceAsStream("/images/sevillaclassroomsmileenriquez.png"));
    BackgroundImage background = new BackgroundImage(storyBackgroundImage, BackgroundRepeat.NO_REPEAT,
            BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, new BackgroundSize(1280, 720, true, true, false, true));
    story4Node.setBackground(new Background(background));
       // Create a Label for the speaker
    Label story2Speaker = new Label();
    story2Speaker.setText("Mr.Enriquez");
    story2Speaker.setStyle("-fx-text-fill: white; -fx-font-size: 250%; -fx-font-weight: bold;");
    
    story2Speaker.setAlignment(Pos.CENTER_LEFT);
    story2Speaker.setAlignment(Pos.CENTER_LEFT);

    // Create a Label for the story text
    Label story2Label = new Label();
    story2Label.setWrapText(true);
    story2Label.setMinWidth(1140);
    story2Label.setMaxWidth(1140);
    story2Label.setMinHeight(150);
    story2Label.setStyle("-fx-text-fill: black; -fx-font-size: 200%; -fx-background-color: rgba(255,255,255,0.7);");
    story2Label.setAlignment(Pos.CENTER_LEFT);

    // Create blank labels for spacing
    Label story2Blank = new Label();
    story2Blank.setMinWidth(100);
    story2Blank.setMinHeight(0);
    story2Blank.setStyle("-fx-background-color: transparent");

    Label story2Blank1 = new Label();
    story2Blank1.setMinWidth(0);
    story2Blank1.setMinHeight(100);
    story2Blank1.setStyle("-fx-background-color: rgba(255,255,255,0.7)");

    // Animation for text dialogue
    final String story2Content = "         We can’t end our friendship like this.. You’re one of the few teachers I can rant about math theorems with… i’m sorry...please forgive me? ";
    final int instantCharactersCount = 10; // Number of characters to show instantly

    final Animation story2Animation = new Transition() {
        {
            setCycleDuration(Duration.millis(3000)); // Total duration for the animated part
        }

        protected void interpolate(double frac) {
            int totalLength = story2Content.length();
            int remainingCharacters = totalLength - instantCharactersCount;
            if (remainingCharacters > 0) {
                // Calculate the index of the last character to be shown for the current fraction
                int index = instantCharactersCount + Math.round(remainingCharacters * (float) frac);
                story2Label.setText(story2Content.substring(0, index));
        }else {
            // If the content is shorter than the number of instant characters, show it all instantly
            story2Label.setText(story2Content);
        }
    };};
    
    story2Animation.play();


    // Add elements to GridPane
    story4Node.add(story2Speaker, 2, 2);
    story4Node.add(story2Label, 2, 3);
    story4Node.add(story2Blank, 1, 2, 1, 1);
    story4Node.add(story2Blank1, 1, 3, 1, 1);

    // Define row and column constraints

    RowConstraints story2row1 = new RowConstraints();
    story2row1.setMinHeight(210);
    RowConstraints story2row2 = new RowConstraints();
    story2row2.setMinHeight(210);
    RowConstraints story2row3 = new RowConstraints();
    story2row3.setMinHeight(0);
    RowConstraints story2row4 = new RowConstraints();
    story2row4.setMinHeight(0);

    
    ColumnConstraints story2col1 = new ColumnConstraints();
    story2col1.setMinWidth(0); // Increase left margin
    ColumnConstraints story2col2 = new ColumnConstraints();
    story2col2.setMinWidth(20); // Spacer or small content
    ColumnConstraints story2col3 = new ColumnConstraints();
    story2col3.setMinWidth(800); // Increase width for main text content
    ColumnConstraints story2col4 = new ColumnConstraints();
    story2col4.setMinWidth(800); // Adjust right padding


    story4Node.getRowConstraints().addAll(story2row1, story2row2, story2row3, story2row4);
    story4Node.getColumnConstraints().addAll(story2col1, story2col2, story2col3, story2col4);

    // Create and set the new scene
    Scene newScene = new Scene(story4Node, 1280, 720);
    primaryStage.setScene(newScene);
    // Add key event listener for arrow keys to navigate scenes
    newScene.setOnKeyPressed(event -> {
        if (event.getCode() == KeyCode.RIGHT) {
            switchToNextScene69(primaryStage);//always the bigger number
        } else if (event.getCode() == KeyCode.LEFT) {
            switchToNextScene67(primaryStage);

        } 
    });
}



private void switchToNextScene69(Stage primaryStage) { 
    GridPane story4Node = new GridPane();
    story4Node.setPadding(new Insets(20));
    story4Node.setHgap(10);
    story4Node.setVgap(10); 

    
    

    // Load and set the background image
    Image storyBackgroundImage = new Image(getClass().getResourceAsStream("/images/sevillaclassroom.png"));
    BackgroundImage background = new BackgroundImage(storyBackgroundImage, BackgroundRepeat.NO_REPEAT,
            BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, new BackgroundSize(1280, 720, true, true, false, true));
    story4Node.setBackground(new Background(background));
       // Create a Label for the speaker
    Label story2Speaker = new Label();
    story2Speaker.setText("Mr. Sevilla");
    story2Speaker.setStyle("-fx-text-fill: white; -fx-font-size: 250%; -fx-font-weight: bold;");
    
    story2Speaker.setAlignment(Pos.CENTER_LEFT);
    story2Speaker.setAlignment(Pos.CENTER_LEFT);

    // Create a Label for the story text
    Label story2Label = new Label();
    story2Label.setWrapText(true);
    story2Label.setMinWidth(1140);
    story2Label.setMaxWidth(1140);
    story2Label.setMinHeight(150);
    story2Label.setStyle("-fx-text-fill: black; -fx-font-size: 200%; -fx-background-color: rgba(255,255,255,0.7);");
    story2Label.setAlignment(Pos.CENTER_LEFT);

    // Create blank labels for spacing
    Label story2Blank = new Label();
    story2Blank.setMinWidth(100);
    story2Blank.setMinHeight(0);
    story2Blank.setStyle("-fx-background-color: transparent");

    Label story2Blank1 = new Label();
    story2Blank1.setMinWidth(0);
    story2Blank1.setMinHeight(100);
    story2Blank1.setStyle("-fx-background-color: rgba(255,255,255,0.7)");

    // Animation for text dialogue
    final String story2Content = "         I guess I let my ego get to me again, didn’t I? Ugh, you know what? Screw this! let’s take out our anger on our students and make their finals impossible! ";
    final int instantCharactersCount = 10; // Number of characters to show instantly

    final Animation story2Animation = new Transition() {
        {
            setCycleDuration(Duration.millis(3000)); // Total duration for the animated part
        }

        protected void interpolate(double frac) {
            int totalLength = story2Content.length();
            int remainingCharacters = totalLength - instantCharactersCount;
            if (remainingCharacters > 0) {
                // Calculate the index of the last character to be shown for the current fraction
                int index = instantCharactersCount + Math.round(remainingCharacters * (float) frac);
                story2Label.setText(story2Content.substring(0, index));
        }else {
            // If the content is shorter than the number of instant characters, show it all instantly
            story2Label.setText(story2Content);
        }
    };};
    
    story2Animation.play();


    // Add elements to GridPane
    story4Node.add(story2Speaker, 2, 2);
    story4Node.add(story2Label, 2, 3);
    story4Node.add(story2Blank, 1, 2, 1, 1);
    story4Node.add(story2Blank1, 1, 3, 1, 1);

    // Define row and column constraints

    RowConstraints story2row1 = new RowConstraints();
    story2row1.setMinHeight(210);
    RowConstraints story2row2 = new RowConstraints();
    story2row2.setMinHeight(210);
    RowConstraints story2row3 = new RowConstraints();
    story2row3.setMinHeight(0);
    RowConstraints story2row4 = new RowConstraints();
    story2row4.setMinHeight(0);

    
    ColumnConstraints story2col1 = new ColumnConstraints();
    story2col1.setMinWidth(0); // Increase left margin
    ColumnConstraints story2col2 = new ColumnConstraints();
    story2col2.setMinWidth(20); // Spacer or small content
    ColumnConstraints story2col3 = new ColumnConstraints();
    story2col3.setMinWidth(800); // Increase width for main text content
    ColumnConstraints story2col4 = new ColumnConstraints();
    story2col4.setMinWidth(800); // Adjust right padding


    story4Node.getRowConstraints().addAll(story2row1, story2row2, story2row3, story2row4);
    story4Node.getColumnConstraints().addAll(story2col1, story2col2, story2col3, story2col4);

    // Create and set the new scene
    Scene newScene = new Scene(story4Node, 1280, 720);
    primaryStage.setScene(newScene);
    // Add key event listener for arrow keys to navigate scenes
    newScene.setOnKeyPressed(event -> {
        if (event.getCode() == KeyCode.RIGHT) {
            switchToNextScene70(primaryStage);//always the bigger number
        } else if (event.getCode() == KeyCode.LEFT) {
            switchToNextScene68(primaryStage);

        } 
    });
}

private void switchToNextScene70(Stage primaryStage) { 
    GridPane story4Node = new GridPane();
    story4Node.setPadding(new Insets(20));
    story4Node.setHgap(10);
    story4Node.setVgap(10); 

    
    

    // Load and set the background image
    Image storyBackgroundImage = new Image(getClass().getResourceAsStream("/images/sevillaclassroomsmileenriquez.png"));
    BackgroundImage background = new BackgroundImage(storyBackgroundImage, BackgroundRepeat.NO_REPEAT,
            BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, new BackgroundSize(1280, 720, true, true, false, true));
    story4Node.setBackground(new Background(background));
       // Create a Label for the speaker
    Label story2Speaker = new Label();
    story2Speaker.setText("Mr. Enriquez");
    story2Speaker.setStyle("-fx-text-fill: white; -fx-font-size: 250%; -fx-font-weight: bold;");
    
    story2Speaker.setAlignment(Pos.CENTER_LEFT);
    story2Speaker.setAlignment(Pos.CENTER_LEFT);

    // Create a Label for the story text
    Label story2Label = new Label();
    story2Label.setWrapText(true);
    story2Label.setMinWidth(1140);
    story2Label.setMaxWidth(1140);
    story2Label.setMinHeight(150);
    story2Label.setStyle("-fx-text-fill: black; -fx-font-size: 200%; -fx-background-color: rgba(255,255,255,0.7);");
    story2Label.setAlignment(Pos.CENTER_LEFT);

    // Create blank labels for spacing
    Label story2Blank = new Label();
    story2Blank.setMinWidth(100);
    story2Blank.setMinHeight(0);
    story2Blank.setStyle("-fx-background-color: transparent");

    Label story2Blank1 = new Label();
    story2Blank1.setMinWidth(0);
    story2Blank1.setMinHeight(100);
    story2Blank1.setStyle("-fx-background-color: rgba(255,255,255,0.7)");

    // Animation for text dialogue
    final String story2Content = "         Yeah! Let’s see who can bring their class average closest to 0. Loser has to buy the winner a limited edition Ron Larson calc book! ";
    final int instantCharactersCount = 10; // Number of characters to show instantly

    final Animation story2Animation = new Transition() {
        {
            setCycleDuration(Duration.millis(3000)); // Total duration for the animated part
        }

        protected void interpolate(double frac) {
            int totalLength = story2Content.length();
            int remainingCharacters = totalLength - instantCharactersCount;
            if (remainingCharacters > 0) {
                // Calculate the index of the last character to be shown for the current fraction
                int index = instantCharactersCount + Math.round(remainingCharacters * (float) frac);
                story2Label.setText(story2Content.substring(0, index));
        }else {
            // If the content is shorter than the number of instant characters, show it all instantly
            story2Label.setText(story2Content);
        }
    };};
    
    story2Animation.play();


    // Add elements to GridPane
    story4Node.add(story2Speaker, 2, 2);
    story4Node.add(story2Label, 2, 3);
    story4Node.add(story2Blank, 1, 2, 1, 1);
    story4Node.add(story2Blank1, 1, 3, 1, 1);

    // Define row and column constraints

    RowConstraints story2row1 = new RowConstraints();
    story2row1.setMinHeight(210);
    RowConstraints story2row2 = new RowConstraints();
    story2row2.setMinHeight(210);
    RowConstraints story2row3 = new RowConstraints();
    story2row3.setMinHeight(0);
    RowConstraints story2row4 = new RowConstraints();
    story2row4.setMinHeight(0);

    
    ColumnConstraints story2col1 = new ColumnConstraints();
    story2col1.setMinWidth(0); // Increase left margin
    ColumnConstraints story2col2 = new ColumnConstraints();
    story2col2.setMinWidth(20); // Spacer or small content
    ColumnConstraints story2col3 = new ColumnConstraints();
    story2col3.setMinWidth(800); // Increase width for main text content
    ColumnConstraints story2col4 = new ColumnConstraints();
    story2col4.setMinWidth(800); // Adjust right padding


    story4Node.getRowConstraints().addAll(story2row1, story2row2, story2row3, story2row4);
    story4Node.getColumnConstraints().addAll(story2col1, story2col2, story2col3, story2col4);

    // Create and set the new scene
    Scene newScene = new Scene(story4Node, 1280, 720);
    primaryStage.setScene(newScene);
    // Add key event listener for arrow keys to navigate scenes
    newScene.setOnKeyPressed(event -> {
        if (event.getCode() == KeyCode.RIGHT) {
            switchToNextScene71(primaryStage);//always the bigger number
        } else if (event.getCode() == KeyCode.LEFT) {
            switchToNextScene69(primaryStage);

        } 
    });
}

private void switchToNextScene71(Stage primaryStage) { 
    GridPane story4Node = new GridPane();
    story4Node.setPadding(new Insets(20));
    story4Node.setHgap(10);
    story4Node.setVgap(10); 

    
    

    // Load and set the background image
    Image storyBackgroundImage = new Image(getClass().getResourceAsStream("/images/sevillaclassroomsmileenriquez.png")); //replace this image with sevilla smiling
    BackgroundImage background = new BackgroundImage(storyBackgroundImage, BackgroundRepeat.NO_REPEAT,
            BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, new BackgroundSize(1280, 720, true, true, false, true));
    story4Node.setBackground(new Background(background));
       // Create a Label for the speaker
    Label story2Speaker = new Label();
    story2Speaker.setText("Mr. Sevilla");
    story2Speaker.setStyle("-fx-text-fill: white; -fx-font-size: 250%; -fx-font-weight: bold;");
    
    story2Speaker.setAlignment(Pos.CENTER_LEFT);
    story2Speaker.setAlignment(Pos.CENTER_LEFT);

    // Create a Label for the story text
    Label story2Label = new Label();
    story2Label.setWrapText(true);
    story2Label.setMinWidth(1140);
    story2Label.setMaxWidth(1140);
    story2Label.setMinHeight(150);
    story2Label.setStyle("-fx-text-fill: black; -fx-font-size: 200%; -fx-background-color: rgba(255,255,255,0.7);");
    story2Label.setAlignment(Pos.CENTER_LEFT);

    // Create blank labels for spacing
    Label story2Blank = new Label();
    story2Blank.setMinWidth(100);
    story2Blank.setMinHeight(0);
    story2Blank.setStyle("-fx-background-color: transparent");

    Label story2Blank1 = new Label();
    story2Blank1.setMinWidth(0);
    story2Blank1.setMinHeight(100);
    story2Blank1.setStyle("-fx-background-color: rgba(255,255,255,0.7)");

    // Animation for text dialogue
    final String story2Content = "        Deal!";
    final int instantCharactersCount = 10; // Number of characters to show instantly

    final Animation story2Animation = new Transition() {
        {
            setCycleDuration(Duration.millis(3000)); // Total duration for the animated part
        }

        protected void interpolate(double frac) {
            int totalLength = story2Content.length();
            int remainingCharacters = totalLength - instantCharactersCount;
            if (remainingCharacters > 0) {
                // Calculate the index of the last character to be shown for the current fraction
                int index = instantCharactersCount + Math.round(remainingCharacters * (float) frac);
                story2Label.setText(story2Content.substring(0, index));
        }else {
            // If the content is shorter than the number of instant characters, show it all instantly
            story2Label.setText(story2Content);
        }
    };};
    
    story2Animation.play();


    // Add elements to GridPane
    story4Node.add(story2Speaker, 2, 2);
    story4Node.add(story2Label, 2, 3);
    story4Node.add(story2Blank, 1, 2, 1, 1);
    story4Node.add(story2Blank1, 1, 3, 1, 1);

    // Define row and column constraints

    RowConstraints story2row1 = new RowConstraints();
    story2row1.setMinHeight(210);
    RowConstraints story2row2 = new RowConstraints();
    story2row2.setMinHeight(210);
    RowConstraints story2row3 = new RowConstraints();
    story2row3.setMinHeight(0);
    RowConstraints story2row4 = new RowConstraints();
    story2row4.setMinHeight(0);

    
    ColumnConstraints story2col1 = new ColumnConstraints();
    story2col1.setMinWidth(0); // Increase left margin
    ColumnConstraints story2col2 = new ColumnConstraints();
    story2col2.setMinWidth(20); // Spacer or small content
    ColumnConstraints story2col3 = new ColumnConstraints();
    story2col3.setMinWidth(800); // Increase width for main text content
    ColumnConstraints story2col4 = new ColumnConstraints();
    story2col4.setMinWidth(800); // Adjust right padding


    story4Node.getRowConstraints().addAll(story2row1, story2row2, story2row3, story2row4);
    story4Node.getColumnConstraints().addAll(story2col1, story2col2, story2col3, story2col4);

    // Create and set the new scene
    Scene newScene = new Scene(story4Node, 1280, 720);
    primaryStage.setScene(newScene);
    // Add key event listener for arrow keys to navigate scenes
    newScene.setOnKeyPressed(event -> {
        if (event.getCode() == KeyCode.RIGHT) {
            switchToNextScene72(primaryStage);//always the bigger number
        } else if (event.getCode() == KeyCode.LEFT) {
            switchToNextScene70(primaryStage);

        } 
    });
}

private void switchToNextScene72(Stage primaryStage) { 
    GridPane story4Node = new GridPane();
    story4Node.setPadding(new Insets(20));
    story4Node.setHgap(10);
    story4Node.setVgap(10); 
    applyFadeTransition(story4Node);

    

    // Load and set the background image
    Image storyBackgroundImage = new Image(getClass().getResourceAsStream("/images/endscreen.png")); //replace this image with sevilla smiling
    BackgroundImage background = new BackgroundImage(storyBackgroundImage, BackgroundRepeat.NO_REPEAT,
            BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, new BackgroundSize(1280, 720, true, true, false, true));
    story4Node.setBackground(new Background(background));
       // Create a Label for the speaker
    Label story2Speaker = new Label();
    story2Speaker.setText("");
    story2Speaker.setStyle("-fx-text-fill: white; -fx-font-size: 250%; -fx-font-weight: bold;");
    
    story2Speaker.setAlignment(Pos.CENTER_LEFT);
    story2Speaker.setAlignment(Pos.CENTER_LEFT);

    // Create a Label for the story text
    Label story2Label = new Label();
    story2Label.setWrapText(true);
    story2Label.setMinWidth(1140);
    story2Label.setMaxWidth(1140);
    story2Label.setMinHeight(150);
    story2Label.setStyle("-fx-text-fill: black; -fx-font-size: 200%; -fx-background-color: rgba(255,255,255,0.7);");
    story2Label.setAlignment(Pos.CENTER_LEFT);

    // Create blank labels for spacing
    Label story2Blank = new Label();
    story2Blank.setMinWidth(100);
    story2Blank.setMinHeight(0);
    story2Blank.setStyle("-fx-background-color: transparent");

    Label story2Blank1 = new Label();
    story2Blank1.setMinWidth(0);
    story2Blank1.setMinHeight(100);
    story2Blank1.setStyle("-fx-background-color: rgba(255,255,255,0.7)");

    // Animation for text dialogue
    final String story2Content = "        LMFAOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO";
    final int instantCharactersCount = 10; // Number of characters to show instantly

    final Animation story2Animation = new Transition() {
        {
            setCycleDuration(Duration.millis(3000)); // Total duration for the animated part
        }

        protected void interpolate(double frac) {
            int totalLength = story2Content.length();
            int remainingCharacters = totalLength - instantCharactersCount;
            if (remainingCharacters > 0) {
                // Calculate the index of the last character to be shown for the current fraction
                int index = instantCharactersCount + Math.round(remainingCharacters * (float) frac);
                story2Label.setText(story2Content.substring(0, index));
        }else {
            // If the content is shorter than the number of instant characters, show it all instantly
            story2Label.setText(story2Content);
        }
    };};
    
    story2Animation.play();


    // Add elements to GridPane
    story4Node.add(story2Speaker, 2, 2);
    story4Node.add(story2Label, 2, 3);
    story4Node.add(story2Blank, 1, 2, 1, 1);
    story4Node.add(story2Blank1, 1, 3, 1, 1);

    // Define row and column constraints

    RowConstraints story2row1 = new RowConstraints();
    story2row1.setMinHeight(210);
    RowConstraints story2row2 = new RowConstraints();
    story2row2.setMinHeight(210);
    RowConstraints story2row3 = new RowConstraints();
    story2row3.setMinHeight(0);
    RowConstraints story2row4 = new RowConstraints();
    story2row4.setMinHeight(0);

    
    ColumnConstraints story2col1 = new ColumnConstraints();
    story2col1.setMinWidth(0); // Increase left margin
    ColumnConstraints story2col2 = new ColumnConstraints();
    story2col2.setMinWidth(20); // Spacer or small content
    ColumnConstraints story2col3 = new ColumnConstraints();
    story2col3.setMinWidth(800); // Increase width for main text content
    ColumnConstraints story2col4 = new ColumnConstraints();
    story2col4.setMinWidth(800); // Adjust right padding


    story4Node.getRowConstraints().addAll(story2row1, story2row2, story2row3, story2row4);
    story4Node.getColumnConstraints().addAll(story2col1, story2col2, story2col3, story2col4);

    // Create and set the new scene
    Scene newScene = new Scene(story4Node, 1280, 720);
    primaryStage.setScene(newScene);
    // Add key event listener for arrow keys to navigate scenes
    newScene.setOnKeyPressed(event -> {
        if (event.getCode() == KeyCode.RIGHT) {
            switchToNextScene72(primaryStage);//always the bigger number
        } else if (event.getCode() == KeyCode.LEFT) {
            switchToNextScene70(primaryStage);

        } 
    });
}
        
    

    
    
    //if i want on event key i can bind that later

    private void switchToStartScene(Stage primaryStage) {
        start(primaryStage);
    }

    private void applyFadeTransition(StackPane stackPane) {
        FadeTransition fadeIn = new FadeTransition(Duration.seconds(2), stackPane);
        fadeIn.setFromValue(0);
        fadeIn.setToValue(1);
        fadeIn.play();
    }

    private void applyFadeTransition(GridPane gridPane) {
        FadeTransition fadeIn = new FadeTransition(Duration.seconds(2), gridPane);
        fadeIn.setFromValue(0);
        fadeIn.setToValue(1);
        fadeIn.play();
    }

    private void applyFadeTransitionFast(GridPane gridPane) {
        FadeTransition fadeIn = new FadeTransition(Duration.seconds(0.5), gridPane);
        fadeIn.setFromValue(0);
        fadeIn.setToValue(1);
        fadeIn.play();
    }
    
    
    
    public static void main(String[] args) {
        launch(args);
    }
}
