import java.util.Random;
import java.util.Scanner;

public class PiPaTx {

    private static final byte STONE = 1;
    private static final byte PAPER = 2;
    private static final byte SCISSORS = 3;

    private static final String[] dices = {    
        "None", "PIEDRA", "PAPEL", "TIJERA"
    };


    private static final byte EQUALS = 0;
    private static final byte USER = 1;
    private static final byte MACHINE = 2;


    private static final String[] diceResult = {    
        "Empate", "Has ganado", "Ha ganado la máquina"
    };


    private static final byte[][] RESULTS = {
        {EQUALS,   USER,     MACHINE},
        {MACHINE,  EQUALS,   USER},
        {USER,     MACHINE, EQUALS},
    }; 


    private static byte userDice;
    private static byte machineDice;

    private static void askUserDice() {
        String message = "Indica tu tirada: (PI, PA, TI)";
        Scanner scanner = new Scanner(System.in);
        userDice = 0;
        while (userDice == 0) {
            System.out.println(message);
            String answer = scanner.nextLine();
            switch (answer.toUpperCase()) {
                case "PI":
                    userDice = STONE;
                    break;
                case "PA":
                    userDice = PAPER;
                    break;
                case "TI":
                    userDice = SCISSORS;
                    break;
            }
        }
    }

    private static void generateMachineDice() {
        Random random = new Random();
        machineDice = (byte)random.nextInt(1,3);
    }

    private static void showResult() {
        System.out.println("Jugada de la máquina " + dices[machineDice]);
        System.out.println("Tu jugada " + dices[userDice]);

        byte winner = RESULTS[machineDice-1][userDice-1];
        System.out.println("Resultado " + diceResult[winner]);
    } 

    private static void askContinue() {
        Scanner scanner = new Scanner(System.in);
        boolean wantContinue = true;

        String[] messages = {
                "¿Quieres continuar (S/N)?",
                "Gracias por todo"
        };

        while (wantContinue) {
            askUserDice();
            generateMachineDice();
            showResult();
          
            System.out.println(messages[0]);
            String answer = scanner.nextLine();
            if (answer.toLowerCase().equals("n") ||
                    answer.toLowerCase().equals("no")) {
                wantContinue = false;
            }
        }

        scanner.close();
        System.out.println(messages[1]);
    }

    public static void main(String[] args) {
        askContinue();
    }
}
