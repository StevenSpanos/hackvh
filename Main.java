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
      while(!collectInput().equals("step")){
        guy.print();
      }
    }
  }

  public static void step(){
    guy.setFood(guy.getFood() - 1);
    guy.updateStatus();
    guy.print();
    if(guy.getFood() < 0){
      System.out.println("You missed your pills!");
      System.out.println(guy.getName() + " died...");
      System.exit(0);
    }
    if(guy.getFood() < 1){
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
    if(choice.equals("feed")){guy.setFood((int) guy.getMax()); inputChoices.remove(1);}
    if(choice.equals("play")){play();}
    guy.updateStatus();
    return choice;
  }
  public static void setup(){
    Scanner input = new Scanner(System.in);
    System.out.println("How often do you have to take your pills? (Every x hours)");
    int max = input.nextInt();
    guy.setMax(max);
    System.out.println("How long ago did you take your last pill? (x hours ago)");
    int food = input.nextInt();
    guy.setFood((max-food)+1);
    guy.updateStatus();
    guy.print();
  }
  public static void play(){
    System.out.println("You play with " + guy.getName());
    Scanner input = new Scanner(System.in);
    System.out.println("Pick a game: ");
    System.out.println("1. Blackjack");
    System.out.println("2. Stargazer");
    int choice = 3;
    while(!(choice <= 2)){
    choice = input.nextInt();
    if(choice == 1)
      blackjack();
    if(choice == 2)
      stargazer();
    }
    guy.setFriendship(guy.getFriendship()+((int) (Math.random() * 10)));
    System.out.println(guy.getName() + "'s friendship is now " + guy.getFriendship());
    guy.updateStatus();
  }

  public static void blackjack(){
    Scanner input = new Scanner(System.in);
    String choice = "";
    System.out.print("\033[H\033[2J"); 
    System.out.flush();  //clears console

    System.out.println("bet: ");
    double bet = input.nextDouble();
    int house = (int) (Math.random()*21) + 1;
    int total = (int) (Math.random()*21) + 1;

    while(!choice.equals("stand")){

      System.out.print("\033[H\033[2J"); 
      System.out.flush();  //clears console
      
    System.out.println("Total: " + total);
    if(total > 21){System.out.println("You Lose!"); break;}
    else{
      System.out.print("Hit or Stand? "); choice = input.nextLine();
      System.out.println();
      while(!choice.equals("hit") && !choice.equals("stand")){
        System.out.print("Hit or Stand? "); choice = input.nextLine();
        System.out.println();
      }
      if(choice.equals("hit")){
        total += ((int) (Math.random()*11) + 1);
      }
    }
  }
  System.out.println("The House had: " + house);
  if(total == 21 || total > house){
    System.out.println("You Win!");
  }
  else{
    System.out.println("You Lose...");
  }
  System.out.println("Play Again? y/n");
  while(!choice.equals("y") && !choice.equals("n")){
    choice = input.nextLine();
  }
  if(choice.equals("y")){blackjack();}
  }

  public static void stargazer(){
    System.out.println("High noon, oh I'd sell my soul for water"); System.out.println("Nine years worth of breakin' my back"); System.out.println("There's no sun in the shadow of the wizard"); System.out.println("See how he glides, why he's lighter than air?"); System.out.println("Oh, I see his face"); System.out.println("Where is your star?"); System.out.println("Is it far, is it far, is it far?"); System.out.println("When do we leave?"); System.out.println("I believe, yes, I believe"); System.out.println("In the heat and the rain"); System.out.println("With whips and chains"); System.out.println("To see him fly"); System.out.println("So many died"); System.out.println("We build a tower of stone"); System.out.println("With our flesh and bone"); System.out.println("Just to see him fly"); System.out.println("But don't know why"); System.out.println("Now where do we go?"); System.out.println("Hot wind, moving fast across the desert"); System.out.println("We feel that our time has arrived"); System.out.println("The world spins, while we put his dream together"); System.out.println("A tower of stone to take him straight to the sky"); System.out.println("Oh, I see his face"); System.out.println("Where is your star?"); System.out.println("Is it far, is it far, far?"); System.out.println("When do we leave?"); System.out.println("Hey, I believe, I believe"); System.out.println("In the heat and the rain"); System.out.println("With whips and chains"); System.out.println("Just to see him fly"); System.out.println("Too many died"); System.out.println("We build a tower of stone"); System.out.println("With our flesh and bone"); System.out.println("To see him fly"); System.out.println("But we don't know why"); System.out.println("Ooh, now where do we go"); System.out.println("All eyes see the figure of the wizard"); System.out.println("As he climbs to the top of the world"); System.out.println("No sound, as he falls instead of rising"); System.out.println("Time standing still, then there's blood on the sand"); System.out.println("Oh, I see his face"); System.out.println("Where was your star?"); System.out.println("Was it far, was it far?"); System.out.println("When did we leave?"); System.out.println("We believed, we believed, we believed"); System.out.println("In heat and rain"); System.out.println("With whips and chains"); System.out.println("To see him fly"); System.out.println("So many died"); System.out.println("We built a tower of stone"); System.out.println("With our flesh and bone"); System.out.println("To see him fly"); System.out.println("But why"); System.out.println("In all the rain"); System.out.println("With all the chains"); System.out.println("Did so many die"); System.out.println("Just to see him fly"); System.out.println("Look at my flesh and bone"); System.out.println("Now, look, look, look, look"); System.out.println("Look at his tower of stone"); System.out.println("I see a rainbow rising"); System.out.println("Look there, on the horizon"); System.out.println("And I'm coming home, I'm coming home, I'm coming home"); System.out.println("Time is standing still"); System.out.println("He gave me back my will"); System.out.println("Ooh, ooh, ooh, ooh"); System.out.println("Going home"); System.out.println("I'm going home"); System.out.println("My eyes are bleeding"); System.out.println("And my heart is leaving here"); System.out.println("The place I've known"); System.out.println("But it's not home"); System.out.println("Ooh"); System.out.println("Take me back"); System.out.println("He gave me back my will");System.out.println("Ooh, ooh, ooh, ooh");System.out.println("Going home");System.out.println("I'm going home");System.out.println("My eyes are bleeding");System.out.println("And my heart is leaving here");System.out.println("The place I've known"); System.out.println("But it's not home"); System.out.println("Ooh"); System.out.println("Take me back, take me back"); System.out.println("Back to my home ooh, ooh, ooh");
    Scanner input = new Scanner(System.in);
    System.out.println("Press enter to continue");
    String amogus = input.nextLine();
  }
}
