package Assignment_10;

public class Main 
{
    public static void main(String[] args) 
    {
        System.out.println("Main Thread Started");

        // Creating thread objects
        NumberThread numberThread = new NumberThread();
        CharacterThread characterThread = new CharacterThread();
        SquareThread squareThread = new SquareThread();

        // Starting threads
        numberThread.start();
        characterThread.start();
        squareThread.start();

        System.out.println("Main Thread Ended");
    }
}
