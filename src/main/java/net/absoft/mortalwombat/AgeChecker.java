package net.absoft.mortalwombat;

public class AgeChecker {
    private final int Min_Age = 18;
    public boolean CanPlayGame(int age) {
        return age >= Min_Age;
    }
}
