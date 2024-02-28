public class Dog extends Animal implements Land{
    private static final int numberOfLegs = 4;

    public Dog(){
        super(true, true, Animal.MOOD_HAPPY);
    }

    @Override
    public void sayHello(){
        System.out.println("tail wading...");
        sayHello(this.getMood());
    }

    @Override
    public void sayHello(int mood){
        if(mood == Animal.MOOD_HAPPY){
            System.out.println("The dog is happy and he bark loudly");
        } else if (mood == Animal.MOOD_SCARE) {
            System.out.println("The dog is scare and he whooping");
        }
    }
    @Override
    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    @Override
    public String toString() {
        return "Dog";
    }
}
