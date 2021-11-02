package ucf.assignment;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import org.controlsfx.control.action.Action;
//import ucf.assignment.HelloApplication.ItemDetails;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.io.IOException;

/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Dynie Mesoneuvre
 */
class Item {
    /*
    //initialize variables to be used in Item class
    String title;//title of the item
    String description;//description of the item
    String date;//date of the item
    String completed;//if the item was completed

    //constructor of the Item class
    public Item(String title, String description, String date, String completed) {
     this.title = title; //setting Item class title variable to title variable
     this.description = description; //setting Item class description variable  to description variable
     this.date = date; //setting Item class date variable to date variable
     this.completed = completed; //setting Item class completed variable to completed variable
    }
    //retrieves Item title
    public String getTitle() {
        return title;
    }

    //retrieves Item description
    public String getDescription() {
        return description;
    }

    //retrieves Item date
    public String getDate() {
        return date;
    }

    //retrieves Item completed variable
    public String getCompleted() {
        return completed;
    }

    //uses this.(object) to take user input and place into the title variable
    public void setTitle(String title)
    {
     this.title = title;
    }

    //uses this.(object) to take user input and place into the description variable
    public void setDescription(String description)
    {
        this.description = description;
    }

    //uses this.(object) to take user input and place into the date variable
    public void setDate(String date)
    {
        this.date = date;
    }

    //uses this.(object) to take user input and place into the completed variable
    public void setCompleted(String completed)
    {
        this.completed = completed;
    }
} */
    class Functions
    {
        /*
        //Initialize arraylist, hashmaps, and string variables
        ArrayList<Item> itemParts = new ArrayList();
        HashMap<String, HashMap<String, ArrayList<Item> itemParts>> List = new HashMap<>();
        HashMap<String, ArrayList<Item> itemParts> itemsInList = new HashMap<>();
        String currentTitle, newTitle, currentItemTitle, newItemTitle, Date;
        String currentItemDescription, newItemDescription, Completed;

        public static void editListTitle( String currentTitle, String newTitle, HashMap<String, HashMap<String, ArrayList<Item> itemParts> List)
        {
         Use the String newTitle to replace the String currentTitle within the HashMap List using the replace method.
        }
        public static void addToDoList(String listTitle, HashMap<String, HashMap<String, ArrayList<Item> itemParts> List)
        {
         Using the nested hashmap and the arraylist, add the components of item (date, description, completed)
          from the Item class into the Hashmap this will create a full item that you can then put into a list.
        }
         */
        /*
        public static void deleteToDoList(HashMap<String, HashMap<String, ArrayList<Item> itemParts>  itemsInList)
        {
            Using the Hashmap itemsInList and the arraylist itemParts, remove the specific list from
            the list by removing the key from Hashmap List using the remove method.
        }
         */
        /*
        public static void addItem(HashMap<String, ArrayList<Item> itemParts> itemsInList)
        {
           Using the HashMap itemsInList and the ArrayList itemParts, add the item to the Hashmap by using the put method for
           HashMap itemsInList.
        }
        */
        /*
        public static void deleteItem(HashMap<String, ArrayList<Item> itemParts> itemsInList)
        {
          Using the HashMap itemsInList and the ArrayList itemParts, use the remove method to delete the key
            from the HashMap itemsInList.
        }
        */
        /*
        public static void editItemTitle(String currentItemTitle, String newItemTitleArrayList<Item> itemParts> itemsInList)
        {
          String newItemTitle will be set by user input. Using the replace method for the
          HashMap itemsInList, replace String currentItemTitle with String newItemTitle.
        }
        */
        /*
        public static void editItemDate(String currentItemTitle, String Date, String newItemTitleArrayList<Item> itemParts> itemsInList)
        {
         Update the due date String date with what the user input. Using the HashMap itemsInList, put the new date into it
            by replacing the value in currentItemTitle with the new date.
        }
        */
        /*
        public static void editItemDescription(String currentItemDescription, String newItemDescription, String newItemTitleArrayList<Item> itemParts> itemsInList)
        {
         Update currentItemDescription by setting it to newItemDescription which will contain the user input.
                Once currentItemDescription is updated, use the replace method for the HashMsp itemsInList.
        }
        */
        /*
        public static void itemCompleted(String completed, String newItemTitleArrayList<Item> itemParts> itemsInList)
        {
         Use the put method for the HashMap itemsInList to add in String completed which receives user input.
        }
        */
        /*
        public static void saveToExternalFile(String newItemTitleArrayList<Item> itemParts> itemsInList, HashMap<String, HashMap<String, ArrayList<Item> itemParts> List)
        {
            Save all items in HashMap List into an external text file as storage. Go through item components in HashMap itemsInList so that they are all saved.
        }*/
        /*
        public static void loadToExternalFile( HashMap<String, HashMap<String, ArrayList<Item> itemParts> List)
        {
            Use HashMap List to load every list into an external text file as storage.
        }*/
        /*
        public static void displayItems(String newItemTitleArrayList<Item> itemParts> itemsInList)
        {
         Using HashMap itemsInList, display to user all of the items in a chosen list.
        }
        /*
         /*
        public static void displayCompletedItems(String completed, String newItemTitleArrayList<Item> itemParts> itemsInList)
        {
         Using the string completed, if the item is indicated as completed (like a boolean)
          go through the HashMap itemsInList and display completed items to user.

        }*/
        /*
        public static void displayIncompleteItems(String completed, String newItemTitleArrayList<Item> itemParts> itemsInList)
        {
            Using the string completed, if the item is NOT indicated as completed (like a boolean)
            go through the HashMap itemsInList and display incompleted items to user.
        }*/

    }
public class HelloController {
        @FXML
        private Label welcomeText;


    //USER-INTERACTIONS
    /*
    These are functions that enable the user to interact with the application
        @FXML

        protected void onHelloButtonClick() {

            welcomeText.setText("Welcome to JavaFX Application!");
        }

        @FXML
        private Label buttonResponses;

        @FXML
         void createList() {
         When user clicks on the "create list" button, the create List screen will pop up
        }

         @FXML
       void deleteList() {
          When user clicks on the "delete list" button,
          the option to choose a list will occur, and the chosen list will be removed.
        }


       @FXML
        void saveList() {
            When user clicks on the "save list" button, the chosen list will be saved.
        }

        @FXML
       void loadList() {
           When user clicks on the "load list" button, the chosen list will be loaded.
        }



        @FXML
      void createItem() {
            When user clicks on the "create item" button, the create item screen will pop up
        }


       @FXML
        void deleteItem() {
            When user clicks on the "delete item" button, the chosen item will be removed.
        }

        @FXML
       void editItem() {
           When user clicks on an item, an edit item screen will appear.
        }


        @FXML
       void completedItems() {
        When user clicks on "completed items" button, a list of completed items will appear.
        }

        @FXML
         void uncompletedItems() {
        When user clicks on "uncompleted items" button, a list of incomplete items will appear.
        }



    @Override
    public void start(Stage primaryStage) {

    } */}}
