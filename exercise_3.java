import java.util.Scanner;
import java.util.Random;

class game{
    public int usernumber;
    public int pcnumber;
    public int noofcounts;
    
    public game(){
        Random rand=new Random();
        this.pcnumber=rand.nextInt(100);
    }
    
    public void input(){
        Scanner obj=new Scanner(System.in);
        
        System.out.print("enmter num:");
        this.usernumber=obj.nextInt();
    }
    
    public void check(){
        noofcounts++;
        
        if (usernumber==pcnumber){
            System.out.println("congratulations you guessed right in "+noofcounts+" attemps.");
        } 
        else if(usernumber>pcnumber){
            System.out.println("please enter lower number...");
        }
        else{
            System.out.println("please enter higher number...");
        }
    }
    
}
class exercise_3
{
	public static void main(String[] args) {
	game G=new game();
	
	while(true){
	    G.input();
	    G.check();
	}
	}
}
