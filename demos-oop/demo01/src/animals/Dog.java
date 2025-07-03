package animals;

public class Dog extends Pet implements IDog {

    public Dog(String name, int age) {
        super(name, age);
    };

    public Dog(String name) {
        super(name);
    };

    @Override
    public void eat() {
        super.eat();
        String message = "Como comida para perros";
        System.out.println(message);

    }

    @Override
    public String makeSounds() {
        String message = "Guau";
       System.out.println(message);
       return message;   
    }

}
