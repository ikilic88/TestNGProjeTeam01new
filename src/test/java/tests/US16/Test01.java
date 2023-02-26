package tests.US16;

import org.testng.annotations.Test;
import tests.US15.Login;

public class Test01 {
        @Test
        public void test01() throws InterruptedException {
            Login01 login01 = new Login01();
            login01.login01();

        }
    }

