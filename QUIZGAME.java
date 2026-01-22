import java.util.Scanner;
public class QUIZGAME{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        boolean play = true;
        Fraction randomNum = new Fraction();
        Fraction randomDen = new Fraction();      
        int correctcount = 0;
        int incorrectcount = 0;
        System.out.println("Quiz Begin");
        while(play){
            
            int random = (int)(Math.random()*4);
            String symbol = "-";
            if(random == 0){
                symbol = "+";
            }else if(random == 1){
                symbol = "/";
            }else if(random == 2){
                symbol = "*";
            }else if(random == 3){
                symbol = "-";
            }
            System.out.println(randomNum + " " + symbol + " " + randomDen);
            String player = scan.nextLine();
            if(player.equalsIgnoreCase("quit")){
                play = false;
                int total = correctcount + incorrectcount;
                int percent = (correctcount/total)*100;
                Fraction winratio = new Fraction(correctcount, total);
                winratio.reduce();
                System.out.println("YOUR WIN RATIO IS " + winratio + ", " + percent + "%");
            }else{
                Fraction USER = new Fraction(player);
                Fraction answer;
                if(symbol == "+"){
                    answer = Fraction.add(randomNum, randomDen);
                }else if(symbol == "/"){
                    answer = Fraction.divide(randomNum, randomDen);
                }else if (symbol == "*"){
                    answer = Fraction.multiply(randomNum, randomDen);
                }else {
                    answer = Fraction.subtract(randomNum, randomDen);
                }
                answer.reduce();
                USER.reduce();
            
            if(USER.equals(answer)){
                System.out.println("GOOD BOY!");
                correctcount++;
            }else{
                System.out.println("BAD BOY! ANSWER IS " + answer);
                incorrectcount++;
            }
            }
        }
        
    }
}