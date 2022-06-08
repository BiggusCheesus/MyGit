import java.util.Scanner;
import java.util.ArrayList;

public class TreeHelper{

    private static ArrayList<String> questions = new ArrayList<String>();

    public static AttributeTreeNode buildTree(Scanner scan){
        String temp = scan.nextLine();
        if(temp.contains("?")){
            questions.add(temp);
            return new AttributeTreeNode(temp, buildTree(scan), buildTree(scan));
        }else{
            return new AttributeTreeNode(temp);
        }
    }

    public static void printTree(AttributeTreeNode root, int level){
        if(root != null){
            printTree(root.getYes(), level + 1);
            for(int i = 0; i < level; i++){
                System.out.print("        ");
            }
            System.out.println(root.getAttribute());
            printTree(root.getNo(), level + 1);
        }
    }

    public static ArrayList<String> getQuestions(){
        return questions;
    }
}
