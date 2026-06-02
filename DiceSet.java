public class DiceSet {
    private Die[] dice = new Die[5];
    public void rollAll(){
        for(Die die : dice){
            die.roll();
        }
    }
    public void rollSelected(){
        for (Die die : dice) {
            if (die.isHeld() == false) {
                die.roll();
            }
        }
    }
    public Die[] getDice(){
        return dice;
    }
    public void resetHolds(){
        for (Die die : dice) {
            die.release();
        }
    }
}