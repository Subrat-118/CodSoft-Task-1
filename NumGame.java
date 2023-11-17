import java.util.*;
public class NumGame {
    public static void main(String[] args) {
        int guess,number;
		String str;
        do{
            Scanner sc=new Scanner(System.in);
			Random rndm=new Random();
			number=rndm.nextInt(100)+1;
	 		System.out.println("\nA number choosen Between 1 to 100.");
            System.out.println("You have only 5 attempts to guess the number.\n");
            int count=0;
            while(true){
				if(count!=5){
					System.out.print("Guess the number:");
					guess=sc.nextInt();
					if(guess==number){ 
						System.out.println("\nGreat job !!");
						int z=count+1;
                        if(z==1){
                            System.out.println("You have got the number "+number+" in your 1st attempt.");
						    break;
                        }
                        else if(z==2){
                            System.out.println("You have got the number "+number+" in your 2nd attempt.");
						    break; 
                        }
                        else if(z==3){
                            System.out.println("You have got the number "+number+" in your 3rd attempt.");
						    break; 
                        }
                        else if(z==4){
                            System.out.println("You have got the number "+number+" in your 4th attempt.");
						    break; 
                        }
                        else if(z==5){
                            System.out.println("You have got the number "+number+" in your 5th attempt.");
						    break; 
                        }
                    }
                    else if(guess>number){
						System.out.println("Sorry, Your guess is wrong !!!");
						System.out.println("The number is smaller than "+guess+" ."+"\n");
						count++;
						int x=5-count;
						System.out.println("*** Now You have only "+x+" attempts left.***\n");
					}
					else if(guess<number){
						System.out.println("Sorry, Your guess is wrong !!!");
						System.out.println("The number is greater than "+guess+" ."+"\n");
						count++;
						int y=5-count;
						System.out.println("*** Now You have only "+y+" attempts left.***\n");
					}
				}
				else{
					System.out.println("\nOops !! You don't have more attempts left.");
					System.out.println("The number was "+number);
					break;
				}
            }
            System.out.print("\nDo You want to play again ? Please press (y/Y) : ");
			Scanner sp=new Scanner(System.in);
			str=sp.nextLine();
        }
        while(str.equals("y") ||str.equals("Y"));
    }
}
