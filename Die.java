import java.util.Random;
public class Die {
    private int value;
    private boolean isHeld;
    public void roll(){
        value = new Random().nextInt(6) + 1;
    }
    public void hold(){
        isHeld = true;
    }
    public void release(){
        isHeld = false;
    }
    public int getValue(){
        return value;
    }
    public boolean isHeld(){
        return isHeld;
    }
}