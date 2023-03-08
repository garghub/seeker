/*
 * This file was automatically generated by EvoSuite
 * Thu May 12 15:03:57 GMT 2022
 */

package DataStructures;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import DataStructures.QueueAr;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class QueueAr_ESTest extends QueueAr_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      QueueAr queueAr0 = new QueueAr(2285);
      assertTrue(queueAr0.isEmpty());
      
      queueAr0.enqueue((Object) null);
      queueAr0.enqueue("\"G|,L,?");
      queueAr0.dequeue();
      assertFalse(queueAr0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      QueueAr queueAr0 = null;
      try {
        queueAr0 = new QueueAr((-1084));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("DataStructures.QueueAr", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      QueueAr queueAr0 = new QueueAr(965);
      boolean boolean0 = queueAr0.isFull();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      QueueAr queueAr0 = new QueueAr(0);
      boolean boolean0 = queueAr0.isFull();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      QueueAr queueAr0 = new QueueAr(0);
      boolean boolean0 = queueAr0.isEmpty();
      assertTrue(boolean0);
      assertTrue(queueAr0.isFull());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      QueueAr queueAr0 = new QueueAr(1);
      queueAr0.enqueue("TE]");
      boolean boolean0 = queueAr0.isEmpty();
      assertTrue(queueAr0.isFull());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      QueueAr queueAr0 = new QueueAr(1);
      queueAr0.enqueue(queueAr0);
      assertTrue(queueAr0.isFull());
      
      queueAr0.dequeueAll();
      assertFalse(queueAr0.isFull());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      QueueAr queueAr0 = new QueueAr(394);
      queueAr0.enqueue("");
      assertFalse(queueAr0.isEmpty());
      
      queueAr0.dequeue();
      assertTrue(queueAr0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      QueueAr queueAr0 = new QueueAr(1);
      queueAr0.dequeue();
      assertTrue(queueAr0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      QueueAr queueAr0 = new QueueAr(1);
      queueAr0.getFront();
      assertTrue(queueAr0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      QueueAr queueAr0 = new QueueAr(1);
      queueAr0.enqueue(queueAr0);
      queueAr0.getFront();
      assertTrue(queueAr0.isFull());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      QueueAr queueAr0 = new QueueAr(0);
      try { 
        queueAr0.enqueue("");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("DataStructures.QueueAr", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      QueueAr queueAr0 = new QueueAr(1);
      queueAr0.enqueue((Object) null);
      assertFalse(queueAr0.isEmpty());
      
      queueAr0.dequeue();
      assertFalse(queueAr0.isFull());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      QueueAr queueAr0 = new QueueAr(0);
      queueAr0.makeEmpty();
      assertTrue(queueAr0.isFull());
  }
}