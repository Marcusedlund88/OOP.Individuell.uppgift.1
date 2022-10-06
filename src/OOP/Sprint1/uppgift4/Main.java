package OOP.uppgift4;

public class Main {
    Main(){
        Höna Agdda = new Höna();
        Hund Kiro = new Hund();
        Djur[] allaDjur = {Kiro,Agdda};
        for (Djur djur:allaDjur) {
            djur.läte();

        }
    }

    public static void main(String[] args){
        Main main = new Main();
    }

}
