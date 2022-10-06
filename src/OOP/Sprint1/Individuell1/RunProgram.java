package OOP.Sprint1.Individuell1;

import javax.swing.*;
import java.util.ArrayList;

public class RunProgram {

    public RunProgram(){

            String[] options = {"Continue", "Exit"};
            int choice = JOptionPane.showOptionDialog(null,"What would you like to do?", "Options",
                    JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options,0);

            switch(choice){
                case 1 : System.exit(1);
                case 0 :
                    String input = JOptionPane.showInputDialog("Type the name of your " +
                            "plant or exit the program by typing \"exit\"");
                    runProgram(input);
            }
    }
    public void runProgram(String input) {
        Actions actions = new Actions();
        ArrayList<Plant> a = actions.getInitialArraylist();

            int counter = 0;

            for (Plant p : a) {

                if (input.equalsIgnoreCase(p.name)) {
                    p.printMethod();
                }
                else{
                    counter++;
                }
            }
            if (counter == a.size()){
                JOptionPane.showMessageDialog(null, "Name not found.");
            }
            new RunProgram();
    }
}
