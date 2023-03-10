/*
 * This file was automatically generated by EvoSuite
 * Thu May 12 14:40:01 GMT 2022
 */

package examples;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import examples.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Map_ESTest extends Map_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Map<String, String> map0 = new Map<String, String>();
      map0.extend("?D-80*mW1?p=I", "invalid key");
      // Undeclared exception!
      try { 
        map0.remove("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("examples.Map", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Map<String, String> map0 = new Map<String, String>();
      map0.extend("", "{s8/cvQ'k0[ 0j");
      map0.extend(":,,", ":,,");
      int int0 = map0.extend(":,,", "");
      assertEquals(2, map0.count());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Map<Object, String> map0 = new Map<Object, String>();
      Object object0 = new Object();
      int int0 = map0.extend(object0, "|uY|DO-g{])");
      //  // Unstable assertion: assertEquals(0, int0);
      
      boolean boolean0 = map0.hasValue("|uY|DO-g{])");
      //  // Unstable assertion: assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Map<Object, Object> map0 = new Map<Object, Object>();
      Integer integer0 = new Integer(0);
      map0.extend("", integer0);
      map0.extend((Object) null, integer0);
      int int0 = map0.remove((Object) null);
      assertEquals(1, map0.count());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Map<String, String> map0 = new Map<String, String>();
      map0.extend((String) null, (String) null);
      String string0 = map0.item((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Map<String, String> map0 = new Map<String, String>();
      map0.extend("", "#R@Kn'`");
      int int0 = map0.count();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Map<Object, Object> map0 = new Map<Object, Object>();
      boolean boolean0 = map0.hasKey((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Map<String, Object> map0 = new Map<String, Object>();
      map0.extend("@xZv9A#_(<-Z^Vi", "@xZv9A#_(<-Z^Vi");
      boolean boolean0 = map0.hasKey("@xZv9A#_(<-Z^Vi");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Map<String, Object> map0 = new Map<String, Object>();
      map0.extend("@xZv9A#_(<-Z^Vi", "@xZv9A#_(<-Z^Vi");
      int int0 = map0.extend("@xZv9A#_(<-Z^Vi", "@xZv9A#_(<-Z^Vi");
      assertEquals(1, map0.count());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Map<String, Object> map0 = new Map<String, Object>();
      int int0 = map0.extend("@xZv9A#_(<-Z^Vi", "@xZv9A#_(<-Z^Vi");
      assertEquals(0, int0);
      
      Map<Object, Object> map1 = new Map<Object, Object>();
      boolean boolean0 = map0.hasValue(map1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Map<String, String> map0 = new Map<String, String>();
      map0.extend("n", "n");
      int int0 = map0.remove("n");
      assertEquals(0, map0.count());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Map<String, String> map0 = new Map<String, String>();
      // Undeclared exception!
      try { 
        map0.remove("n");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("examples.Map", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Map<Object, Object> map0 = new Map<Object, Object>();
      Map<Object, String> map1 = new Map<Object, String>();
      // Undeclared exception!
      try { 
        map1.item(map0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // invalid key
         //
         verifyException("examples.Map", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Map<String, String> map0 = new Map<String, String>();
      map0.extend("n", "n");
      String string0 = map0.item("n");
      assertEquals("n", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Map<Object, Object> map0 = new Map<Object, Object>();
      int int0 = map0.count();
      assertEquals(0, int0);
  }
}
