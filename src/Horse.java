public class Horse extends Animal implements Pet{

    //Constructor to initialize our pet with age and name.
    public Horse(int age, String name){
        setAge(age);
        setName(name);
    }

    @Override
    public void makeNoise() {
        System.out.println("Neighhhh");
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
        System.out.println("Yo, anybody got an apple or some horse feed round here?");
    }
}
