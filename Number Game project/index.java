import java.util.*;
public class index{
  public static void main(String[] args) {
    RdGen rd = new RdGen();
    System.out.println();
    System.out.println("WELCOME TO NUMBER GAME!!");
    System.out.println("-----------------------------------------------------------------------");
    System.out.println("The GAME IS ABOUT GUESSING A RANDOM NUMBER UNTILL YOU ARE CORRECT!!");    
    System.out.println("-----------------------------------------------------------------------");
    System.out.println("YOUR ARE GIVEN A SPECIFIC NUMBER IF CHANCES DEPENDING ON LEVEL OF DIFFICULTY CHOSEN!!");
    System.out.println("--------------------------------------------------------------------------------------------");
    System.out.println("PLEASE CHOSE THE NUMBER OF ROUNDS YOU WANT TO PLAY!!.. LETS BEGIN..!!");  
    System.out.print("Available from (1-5):  ");
      Scanner inp = new Scanner(System.in);
      int rounds = inp.nextInt();
      System.out.println();
      

      for(int i = 0;i<rounds;i++){
        int res = rd.rnd();
        System.out.println("Random Number is generated!!");
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("Please chose the level of difficulty!!");
        System.out.println("1 -> Easy ..(Gives unlimited attempts)");
        System.out.println("2 -> Hard ..(Gives 10 attempts)");

        int level = inp.nextInt();
        System.out.println();
        if(level==1){
          int c = 0;
          System.out.println("You are chosen easy level!!");
          System.out.print("Enter your Guess!!: ");
          int guess = inp.nextInt();
          if(guess == res){
            System.out.println("Congrats You guess in 1st attempt");
            System.out.printf("Your scores is %d/%d",20,20);
          }else{
            while(guess!=res){
              c++;
              if(guess<res){
                System.out.println("Your guess is Lower!!");
              }
              else if(guess>res){
                System.out.println("Your guess is HIGHER!!");
              }
              System.out.print("Guess again!!: ");
              guess = inp.nextInt();
            }
            System.out.println("Congrats Your guess is correct!!!");
            System.out.printf("Your score is %d/%d",10-c,10);
            System.out.println();
          }
        }
        if(level==2){
          int c = 0;
          System.out.println("You are chosen Hard level!!");
          System.out.print("Enter your Guess!!: ");
          int guess = inp.nextInt();
          if(guess == res){
            System.out.println("Congrats You guess in 1st attempt");
            System.out.printf("Your scores is %d/%d",20,20);
          }else{
            while(guess!=res && c!=10){
              c++;
              if(guess<res){
                System.out.println("Your guess is Lower!!");
              }
              else if(guess>res){
                System.out.println("Your guess is HIGHER!!");
              }
              System.out.print("Guess again!!: ");
              guess = inp.nextInt();
            }
            System.out.println("Congrats Your guess is correct!!!");
            System.out.printf("Your score is %d/%d",10-c-1,10);
            System.out.println();
          }
        }
        System.out.println();
        System.out.println("Round Ended!!!");
        System.out.println("----------------------------------------------------------------");

      }
  }
}