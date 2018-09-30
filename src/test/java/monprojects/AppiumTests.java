package monprojects;

import org.testng.annotations.Test;

public class AppiumTests {

    @Test (groups = { "smoke"})
    public void nativApp(){
        System.out.println("NativeApp");

    }

    @Test
    public void ioSApp(){
        System.out.println("IOS APP");

    }
}
