import java.util.Scanner;
import java.util.ArrayList;

public class Main{
  static ArrayList<String> inputChoices = new ArrayList<String>();
  static Pet guy = new Pet();
  public static void main(String args[]){
    System.out.print("\033[H\033[2J"); 
    System.out.flush();  //clears console
    setup();
    inputChoices.add("step");
    inputChoices.add("play");
    inputChoices.add("exit");
    while(true){
      step();
      collectInput();
    }
  }

  public static void step(){
    guy.setFood(guy.getFood() - 1);
    guy.updateStatus();
    guy.print();
    if(guy.getFood() <= 0){
      inputChoices.add(1,"feed");
      System.out.println(guy.getName() + " is hungry");
      System.out.println("(that means you should take your pills or whatever)");
    }
  }
  
  public static String collectInput(){
    Scanner input = new Scanner(System.in);
    for(int x = 0; x < inputChoices.size(); x++){System.out.println(inputChoices.get(x));}
    String choice = "";
    while(!inputChoices.contains(choice)){
      choice = input.nextLine();
    }
    if(choice.equals("exit")){System.exit(0);}
    if(choice.equals("feed")){guy.setFood(11);}
    if(choice.equals("play")){play();}
    return choice;
  }
  public static void setup(){
    Scanner input = new Scanner(System.in);
    System.out.println("How often do you have to take your pills? (Every x hours)");
    int max = input.nextInt();
    guy.setMax(max);
    System.out.println("How long ago did you take your last pill? (x hours ago)");
    int food = input.nextInt();
    guy.setFood(food+1);
    guy.updateStatus();
    guy.print();
  }
  public static void play(){
    System.out.println("You play with " + guy.getName());
  }
}
