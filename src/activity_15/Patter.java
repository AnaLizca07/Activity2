package activity_15;

public class Patter {
    public int numLines = 10;
    public void patt(){
        for (int i = 0; i < numLines; i++) {
            if(i%2 ==0){
                System.out.println("* * * * * * ==================================");
            } else{
                System.out.println(" * * * * * ==================================");
            }
        }
    }
}
