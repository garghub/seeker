/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 12 16:12:46 GMT 2022
 */

package examples;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import examples.MaxBag;
import examples._Type328393;
import java.util.ArrayList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MaxBag_ESTest extends MaxBag_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      MaxBag maxBag0 = new MaxBag(arrayList0);
      Integer integer0 = maxBag0._var5992;
      MaxBag maxBag1 = new MaxBag(arrayList0);
      maxBag1.add(integer0);
      _Type328393 _Type328393_0 = maxBag0._var4384;
      maxBag1._var4384 = _Type328393_0;
      // Undeclared exception!
      try { 
        maxBag1.add(integer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("examples.MaxBag", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MaxBag maxBag0 = new MaxBag();
      maxBag0.add((Integer) null);
      Integer integer0 = maxBag0.getMax();
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      MaxBag maxBag0 = new MaxBag(arrayList0);
      assertEquals(0, (int)maxBag0.getMax());
      
      Integer integer0 = new Integer(1);
      maxBag0.add(integer0);
      maxBag0.getMax();
      assertEquals(1, (int)maxBag0.getMax());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      MaxBag maxBag0 = new MaxBag(arrayList0);
      Integer integer0 = new Integer((-810));
      maxBag0.add(integer0);
      maxBag0.getMax();
      assertEquals((-810), (int)maxBag0.getMax());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MaxBag maxBag0 = new MaxBag();
      Integer integer0 = maxBag0._var5992;
      maxBag0._var4384 = null;
      // Undeclared exception!
      try { 
        maxBag0.remove(integer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("examples.MaxBag", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MaxBag maxBag0 = null;
      try {
        maxBag0 = new MaxBag((ArrayList<Integer>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("examples.MaxBag", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      MaxBag maxBag0 = new MaxBag(arrayList0);
      maxBag0.clear();
      assertEquals(0, (int)maxBag0.getMax());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MaxBag maxBag0 = new MaxBag();
      Integer integer0 = new Integer(1366);
      maxBag0._var5992 = integer0;
      maxBag0.remove(maxBag0._var5992);
      assertEquals(0, (int)maxBag0.getMax());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MaxBag maxBag0 = new MaxBag();
      Integer integer0 = maxBag0._var5992;
      maxBag0.add(integer0);
      Integer[] integerArray0 = new Integer[1];
      Integer integer1 = maxBag0._var5992;
      maxBag0._var587 = integer1;
      integerArray0[0] = integer0;
      _Type328393 _Type328393_0 = new _Type328393(integer0, integerArray0);
      maxBag0._var4384 = _Type328393_0;
      maxBag0.add(_Type328393_0._0);
      maxBag0.add(maxBag0._var587);
      maxBag0.add(_Type328393_0._0);
      maxBag0.remove(maxBag0._var587);
      assertEquals(1, (int)maxBag0.getMax());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      MaxBag maxBag0 = new MaxBag(arrayList0);
      Integer integer0 = new Integer((-810));
      maxBag0.add(integer0);
      Integer[] integerArray0 = new Integer[2];
      integerArray0[0] = integer0;
      _Type328393 _Type328393_0 = new _Type328393(integer0, integerArray0);
      maxBag0.add(_Type328393_0._0);
      maxBag0.add(integerArray0[0]);
      maxBag0.remove(integer0);
      assertEquals((-810), (int)maxBag0.getMax());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      MaxBag maxBag0 = new MaxBag(arrayList0);
      Integer integer0 = new Integer((-810));
      maxBag0.add(integer0);
      Integer[] integerArray0 = new Integer[2];
      integerArray0[1] = integer0;
      _Type328393 _Type328393_0 = new _Type328393(integer0, integerArray0);
      maxBag0._var4384 = _Type328393_0;
      // Undeclared exception!
      try { 
        maxBag0.remove(integerArray0[1]);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
         verifyException("examples.MaxBag", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      MaxBag maxBag0 = new MaxBag(arrayList0);
      Integer integer0 = maxBag0._var587;
      maxBag0.add(integer0);
      maxBag0.remove(integer0);
      assertEquals(0, (int)maxBag0.getMax());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      MaxBag maxBag0 = new MaxBag(arrayList0);
      Integer integer0 = maxBag0._var587;
      maxBag0.remove(integer0);
      assertEquals(0, (int)maxBag0.getMax());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MaxBag maxBag0 = new MaxBag();
      Integer integer0 = new Integer((-1435));
      maxBag0._var5992 = integer0;
      // Undeclared exception!
      try { 
        maxBag0.add(integer0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1435
         //
         verifyException("examples.MaxBag", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      MaxBag maxBag0 = new MaxBag(arrayList0);
      Integer integer0 = maxBag0._var587;
      assertNotNull(integer0);
      
      maxBag0.add(integer0);
      Integer integer1 = new Integer((-810));
      maxBag0.add(integer1);
      maxBag0.add(integer0);
      maxBag0.add(integer1);
      maxBag0.remove(integer0);
      assertEquals(0, (int)maxBag0.getMax());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      MaxBag maxBag0 = new MaxBag(arrayList0);
      Integer integer0 = new Integer(1);
      maxBag0.add(integer0);
      maxBag0.add(integer0);
      maxBag0.remove(integer0);
      assertEquals(1, (int)maxBag0.getMax());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      Integer integer0 = new Integer(0);
      arrayList0.add(integer0);
      arrayList0.add(integer0);
      MaxBag maxBag0 = new MaxBag(arrayList0);
      assertEquals(0, (int)maxBag0.getMax());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      MaxBag maxBag0 = new MaxBag(arrayList0);
      Integer integer0 = maxBag0._var5992;
      Integer integer1 = new Integer((-124));
      arrayList0.add(integer1);
      arrayList0.add(integer0);
      assertEquals(0, (int)maxBag0.getMax());
      
      MaxBag maxBag1 = new MaxBag(arrayList0);
      assertEquals(0, (int)maxBag1.getMax());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      MaxBag maxBag0 = new MaxBag();
      Integer integer0 = maxBag0.getMax();
      assertEquals(0, (int)integer0);
      assertNotNull(integer0);
  }
}
