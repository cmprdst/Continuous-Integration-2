import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PrimeCheckTest {
  // --------------------------------------------------------------- //
  @Test
  public void TestNegativeNumbers() {
    for (int i = -10; i < 0; ++i) {
      assertEquals("Test negative number " + i, false, PrimeCheck.isPrime(i));
    }
  }

  // --------------------------------------------------------------- //
  @Test
  public void TestEdgeCases() {
    assertEquals("Test 0", false, PrimeCheck.isPrime(0));
    assertEquals("Test 1", false, PrimeCheck.isPrime(1));
    assertEquals("Test 2", true, PrimeCheck.isPrime(2));
  }

  // --------------------------------------------------------------- //
  @Test
  public void testPrimes() {
    /* ToDo: insert a test here */
    assertEquals("Test 3", true, PrimeCheck.isPrime(3));
    assertEquals("Test 131.071", true, PrimeCheck.isPrime(131071));
    assertEquals("Test 2.147.483.647", true, PrimeCheck.isPrime(2147483647));
  }

  // --------------------------------------------------------------- //
  @Test
  public void testNonPrimes() {
    /* ToDo: insert a test here */
    assertEquals("Test 4", true, PrimeCheck.isPrime(4)); // % 2 == 0
    assertEquals("Test 131.073", true, PrimeCheck.isPrime(131073)); // % 3 == 0
    assertEquals("Test 2.147.483.639", true, PrimeCheck.isPrime(2147483639)); // % 7 == 0
  }
}
