package Assignment_10;

// Thread to print squares of numbers from 1 to 5
public class SquareThread extends Thread 
{

    // Logic to calculate and print squares
    public void run(){
        printSquares();
    }

    private void printSquares() 
    {
        System.out.println("SquareThread Started");
        for(int i = 1; i <= 5; i++) 
        {
            System.out.println("SquareThread: " + i + "^2 = " + (i * i));
            try {
                Thread.sleep(600); // Pause for 600ms
            } catch(InterruptedException e){
                System.out.println("SquareThread Interrupted");
            }
        }

        System.out.println("SquareThread Ended");
    }
}
