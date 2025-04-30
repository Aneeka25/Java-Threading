package Assignment_10;

//Thread to print numbers from 1 to 5
public class NumberThread extends Thread 
{

    //Logic to print numbers
    public void run(){
        printNumbers();
    }

    private void printNumbers() 
{
        System.out.println("NumberThread Started");
        for(int i = 1; i <= 5; i++)
        {
            System.out.println("NumberThread: " + i);

            try{
                Thread.sleep(500); // Pause for 500ms
            } catch(InterruptedException e){
                System.out.println("NumberThread Interrupted");
            }
        }

        System.out.println("NumberThread Ended");
    }
}
