package test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestPassword {

    @Test
    public void TestPasswordLength() {
        Assert.assertEquals(true, PasswordValidator.isValid("Abc123"));
    }
}
