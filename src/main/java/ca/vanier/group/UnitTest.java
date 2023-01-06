package ca.vanier.group;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author wei
 * @description
 * @create 2023-01-05-20:37
 */
public class UnitTest {

	@Test
	public void test() {

		PassingScore passingScore = new PassingScore();

		Assert.assertTrue(passingScore.isPassed(6));
		Assert.assertTrue(passingScore.isPassed(7));
		Assert.assertTrue(passingScore.isPassed(10));
		Assert.assertFalse(passingScore.isPassed(5));
		Assert.assertFalse(passingScore.isPassed(4));
	}
}
