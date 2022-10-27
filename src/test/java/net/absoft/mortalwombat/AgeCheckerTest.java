package net.absoft.mortalwombat;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AgeCheckerTest {
    @Test
    public void TestAgedUserCanPlay () {
        AgeChecker ageChecker = new AgeChecker();
        Assert.assertTrue(ageChecker.CanPlayGame(19), "User's age is lower than minimal");
    }
    @Test
    public void TooYoungToPlay () {
        AgeChecker ageChecker = new AgeChecker();
        Assert.assertTrue(ageChecker.CanPlayGame(17), "too young");
    }
}
