package utils;

import org.testng.annotations.Test;

public class TC_1_Cat {
    @Test
    public void  tc01Cat() {
        Cat cat = new Cat();
        assert(cat.sayName("Hannah") == 11);
    }
    
}
