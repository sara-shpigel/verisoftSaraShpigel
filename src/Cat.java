public class Cat extends Animal implements Land{
    private static final int numberOfLegs = 4;

    public Cat(){
        super(true, true, Animal.MOOD_HAPPY);
    }

    @Override
    public void sayHello(){
        System.out.println("meow~");
        sayHello(this.getMood());
    }

    @Override
    public void sayHello(int mood){
        if(mood == Animal.MOOD_HAPPY){
            System.out.println("The cat is happy and he say purr, purr");
        } else if (mood == Animal.MOOD_SCARE) {
            System.out.println("The cat is scare and he hiss");
        }

    }

    @Override
    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    @Override
    public String toString() {
        return "Cat";
    }
}
