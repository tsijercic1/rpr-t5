package ba.unsa.etf.rpr.tutorijal05;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
//https://www.geeksforgeeks.org/java-tricks-competitive-programming-java-8/
    //  DATUM : https://docs.oracle.com/javase/7/docs/api/java/util/Date.html
    // ARRAY : https://docs.oracle.com/javase/7/docs/api/java/util/Arrays.html
    // WRAPPERI : https://docs.oracle.com/javase/8/docs/api/java/util/Random.html
    // POINT2D : https://docs.oracle.com/javase/8/javafx/api/javafx/geometry/Point2D.html
    // GENERALNI PREGLED JAVA KLASA : https://docs.oracle.com/javase/10/docs/api/overview-summary.html
    // KOLEKCIJE : https://docs.oracle.com/javase/10/docs/api/java/util/Collection.html
    //  SETOVI : https://docs.oracle.com/javase/10/docs/api/java/util/Set.html
    //  DEKOVI : https://docs.oracle.com/javase/10/docs/api/java/util/Deque.html
    // REDOVI : https://docs.oracle.com/javase/10/docs/api/java/util/Queue.html
    // LISTE : https://docs.oracle.com/javase/10/docs/api/java/util/List.html
    // ARRAY LIST : https://docs.oracle.com/javase/10/docs/api/java/util/ArrayList.html
    // ITERATORI : https://docs.oracle.com/javase/10/docs/api/java/util/Iterator.html
    // LINKEDLIST ITERATOR : https://docs.oracle.com/javase/10/docs/api/java/util/ListIterator.html
    // LINKED LISTA: https://docs.oracle.com/javase/10/docs/api/java/util/LinkedList.html
    // SET: https://docs.oracle.com/javase/10/docs/api/java/util/Set.html
    // TREESET: https://docs.oracle.com/javase/10/docs/api/java/util/TreeSet.html
    //  HASH SET: https://docs.oracle.com/javase/10/docs/api/java/util/HashSet.html --hashcode
    // LINKED HASH SET: https://docs.oracle.com/javase/10/docs/api/java/util/LinkedHashSet.html
    //  TREE MAP: https://docs.oracle.com/javase/10/docs/api/java/util/TreeMap.html
    // HASH MAP : https://docs.oracle.com/javase/10/docs/api/java/util/HashMap.html
    // HASHTABLE: https://docs.oracle.com/javase/10/docs/api/java/util/Hashtable.html
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("digitron.fxml"));
        primaryStage.setTitle("Digitron");
        primaryStage.setScene(new Scene(root, 200, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
