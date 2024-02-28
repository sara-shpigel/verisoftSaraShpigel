public abstract class Animal {
    public static final int MOOD_HAPPY = 0;
    public static final int MOOD_SCARE = 1;
    private boolean mammals;
    private boolean carnivorous;
    private int mood;

    protected Animal(boolean isMammals, boolean isCarnivorous, int mood) {
        this.mammals = isMammals;
        this.carnivorous = isCarnivorous;
        this.mood = mood;
    }

    protected abstract void sayHello();
    protected abstract void sayHello(int mood);

    public boolean isMammals(){
        return mammals;
    }

    public void setMammals(boolean mammals) {
        this.mammals = mammals;
    }

    public boolean isCarnivorous(){
        return carnivorous;
    }

    public void setCarnivorous(boolean carnivorous) {
        this.carnivorous = carnivorous;
    }

    public int getMood() {
        return mood;
    }

    public void setMood(int mood) {
        this.mood = mood;
    }
}
