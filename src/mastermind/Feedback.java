package mastermind;

// this  method should check and compare if the colors are all in right spot  and vice versa

public class Feedback {
    public int blackCount = 0; 
    public int whiteCount = 0; 
    public Feedback(int white ,int black){
        this.blackCount=black;
        this.whiteCount=white;
    }
    public String toString(){
        return "white Marks: "+ whiteCount+ "  Black Marks: "+ blackCount;
    }
    
}   



