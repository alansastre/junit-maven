package factory.error;

public class FiguraNotFoundException extends Exception {

    public FiguraNotFoundException(){
        super("Shape not found.");
    }
}
