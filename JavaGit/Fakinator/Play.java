import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;

public class Play{
    public static AttributeTreeNode tracker;
    public static Scanner SCAN = new Scanner(System.in);
    public static String guess;
    public static FileWriter myWriter;
    public static String[] questions;
    public static boolean guessed = false;

    public static void setup()throws FileNotFoundException, IOException{
        File file = new File("/Users/biggycheese/MyGit/JavaGit/Fakinator/data.txt");
        Scanner scan = new Scanner(file);
        tracker = TreeHelper.buildTree(scan);
        scan.close();
        myWriter = new FileWriter(file, true);
        questions = new String[TreeHelper.getQuestions().size()];
        for(int i = 0; i < TreeHelper.getQuestions().size(); i++){
            questions[i] = TreeHelper.getQuestions().get(i);
        }
        TreeHelper.printTree(tracker, 0);

    }

    public static boolean check(){
        if(tracker.getNo() == null && tracker.getYes() == null){
            guess = tracker.getAttribute(); 
            return true;
        }
        return false;
    }

    public static void answer(){
        String input = SCAN.nextLine();
        if(input.equals("yes")){
            tracker = tracker.getYes();
        }else{
            tracker = tracker.getNo();
        }
        if(check()){
            guessed = true;
        }
    }
    public static void game(){
        for(int i = 0; i < questions.length; i++){
            System.out.println("Is your character " + questions[i] +"?");
            answer();
            if(guessed){
                break;
            }
        }
        System.out.println("Is your character " + guess + "?");
        String input = SCAN.nextLine();
        if(input.equals("no")){
            System.out.println("What is the name of your character?");
            input = SCAN.nextLine();
            try{
                myWriter.write("\n" + input);
            } catch ( IOException e){
                System.out.println("shit");
            }
            System.out.println("What question would help identify your character?");
            input = SCAN.nextLine();
            try{
                myWriter.write("\n" + input);
                myWriter.close();
            } catch ( IOException e){
                System.out.println("shit");
            }
        }

    }
    public static void main(String[] args) throws FileNotFoundException, IOException{
        setup();
        game();
    }
}
