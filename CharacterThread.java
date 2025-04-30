package Assignment_10;

// Thread to print characters from A to E
public class CharacterThread extends Thread 
{
    // Logic to print characters
    public void run(){
        printCharacters();
    }

    private void printCharacters()
    {
        System.out.println("CharacterThread Started");
        for(char ch = 'A'; ch <= 'E'; ch++)
        {
            System.out.println("CharacterThread: " + ch);

            try{
                Thread.sleep(700); // Pause for 700ms
            } catch(InterruptedException e){
                System.out.println("CharacterThread Interrupted");
            }
        }

        System.out.println("CharacterThread Ended");
    }
}
