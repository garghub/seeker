/*
 * This file was automatically generated by EvoSuite
 * Thu May 12 15:19:29 GMT 2022
 */

package examples;

import org.junit.Test;
import static org.junit.Assert.*;
import examples.SimpleMethods;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SimpleMethods_ESTest extends SimpleMethods_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SimpleMethods simpleMethods0 = new SimpleMethods();
      int int0 = simpleMethods0.abs((-4356));
      assertEquals(4356, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SimpleMethods simpleMethods0 = new SimpleMethods();
      int int0 = simpleMethods0.abs(0);
      assertEquals(0, int0);
  }
}
