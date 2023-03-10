class ArrayStrings extends Thread implements Runnable{
    String myStrings[];
    
    public ArrayStrings(String x[]){
        myStrings = x;
    }
    public void run(){
        try {
            for(int i=0;i<myStrings.length;i++){
                System.out.println(myStrings[i]);
                Thread.sleep(3000); //Sleep for three seconds
            }
        }
        catch (args==[0]) {
            // Throwing an exception
            System.out.println("Exception has occurred!No arguemnts Exception");
    }
}
public class Main
{
        public static void main(String[] args) {
            String myStrings[] = {"Hello", "Java", "This", "Is", "A", "Thread", "Program"};
            
            ArrayStrings as = new ArrayStrings(myStrings); //Create an object of class ArrayStrings.
            
            as.start();
        }
}