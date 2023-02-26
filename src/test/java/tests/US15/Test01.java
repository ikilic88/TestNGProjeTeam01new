package tests.US15;


import org.testng.annotations.Test;

public class Test01 {

    @Test
    public void test01() throws InterruptedException {
        Login login = new Login();
        login.login();

    }


}
