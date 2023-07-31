public class Dog extends Animal implements Pet{

    @Override
    public void makeNoise() {
        System.out.println("Woof Woof");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void lickOwner() {
        System.out.println("Lick lick lick");
    }

    @Override
    public void askForFood() {
        System.out.println("Woof woof woof woof gimme some canned food!");
    }
}
