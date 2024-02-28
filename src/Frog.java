public class Frog extends Animal implements Land, Water{
    private static final int numberOfLegs = 4;

    public Frog(){
        super(false, false, Animal.MOOD_HAPPY);
    }

    @Override
    protected void sayHello() {
        sayHello(this.getMood());
    }

    @Override
    public void sayHello(int mood){
        if(mood == Animal.MOOD_HAPPY){
            System.out.println("The frog is happy and she say quack quack quack");
        } else if (mood == Animal.MOOD_SCARE) {
            System.out.println("The frog is scare and she plop into the water");
        }
    }

    @Override
    public boolean hasGills() {
        return true;
    }

    @Override
    public boolean hasLaysEggs() {
        return true;
    }

    @Override
    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    @Override
    public String toString() {
        return "Frog";
    }
}
