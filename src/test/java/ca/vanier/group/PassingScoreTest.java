package ca.vanier.group;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Zhen
 * @description
 * @create 2023-01-05-22:00
 */
public class PassingScoreTest {

    @Test
    public  void testIsPassed(){
        PassingScore passingScore = new PassingScore();

        Assert.assertFalse(passingScore.isPassed(4));

    }
}