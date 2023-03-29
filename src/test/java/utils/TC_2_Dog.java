package utils;

public class TC_2_Dog {

    public void testDog() {
        Dog dog = new Dog();
        assert(dog.age(12) == "I'm 12 years");
    }
}
