package testers;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class QueueArTester0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test001");
        // The following exception was thrown during execution in test generation
        try {
            DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((-3));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test002");
        // The following exception was thrown during execution in test generation
        try {
            DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((-7));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test003");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(4);
        boolean boolean2 = queueAr1.isFull();
        queueAr1.makeEmpty();
        boolean boolean4 = queueAr1.isEmpty();
        java.lang.Class<?> wildcardClass5 = queueAr1.getClass();
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test004");
        // The following exception was thrown during execution in test generation
        try {
            DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((-9));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test005");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) '#');
        queueAr1.makeEmpty();
        java.lang.Object obj3 = new java.lang.Object();
        queueAr1.enqueue(obj3);
        java.lang.Object obj5 = null;
        queueAr1.enqueue(obj5);
        DataStructures.QueueAr queueAr8 = new DataStructures.QueueAr((int) '#');
        queueAr8.makeEmpty();
        java.lang.Object obj10 = new java.lang.Object();
        queueAr8.enqueue(obj10);
        boolean boolean12 = queueAr8.isEmpty();
        queueAr1.enqueue((java.lang.Object) queueAr8);
        queueAr1.makeEmpty();
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test006");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(4);
        queueAr1.enqueue((java.lang.Object) (-10));
        boolean boolean4 = queueAr1.isEmpty();
        queueAr1.makeEmpty();
        boolean boolean6 = queueAr1.isEmpty();
        java.lang.Object obj7 = queueAr1.dequeue();
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test007");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(4);
        queueAr1.enqueue((java.lang.Object) (-10));
        boolean boolean4 = queueAr1.isEmpty();
        boolean boolean5 = queueAr1.isFull();
        boolean boolean6 = queueAr1.isFull();
        java.lang.Class<?> wildcardClass7 = queueAr1.getClass();
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test008");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(4);
        queueAr1.enqueue((java.lang.Object) (-10));
        boolean boolean4 = queueAr1.isEmpty();
        java.lang.Object obj5 = queueAr1.getFront();
        java.lang.Class<?> wildcardClass6 = queueAr1.getClass();
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test009");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(1);
        java.lang.Object obj2 = queueAr1.dequeue();
        boolean boolean3 = queueAr1.isFull();
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test010");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) '#');
        queueAr1.makeEmpty();
        java.lang.Object obj3 = new java.lang.Object();
        queueAr1.enqueue(obj3);
        java.lang.Object obj5 = null;
        queueAr1.enqueue(obj5);
        queueAr1.dequeueAll();
        boolean boolean8 = queueAr1.isFull();
        java.lang.Object obj9 = queueAr1.dequeue();
        java.lang.Class<?> wildcardClass10 = queueAr1.getClass();
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test011");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) '#');
        boolean boolean2 = queueAr1.isFull();
        DataStructures.QueueAr queueAr4 = new DataStructures.QueueAr((int) '#');
        queueAr4.makeEmpty();
        java.lang.Object obj6 = new java.lang.Object();
        queueAr4.enqueue(obj6);
        java.lang.Object obj8 = null;
        queueAr4.enqueue(obj8);
        DataStructures.QueueAr queueAr11 = new DataStructures.QueueAr((int) '#');
        queueAr11.makeEmpty();
        java.lang.Object obj13 = new java.lang.Object();
        queueAr11.enqueue(obj13);
        boolean boolean15 = queueAr11.isEmpty();
        queueAr4.enqueue((java.lang.Object) queueAr11);
        queueAr1.enqueue((java.lang.Object) queueAr4);
        java.lang.Class<?> wildcardClass18 = queueAr4.getClass();
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test012");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) '#');
        queueAr1.makeEmpty();
        java.lang.Object obj3 = new java.lang.Object();
        queueAr1.enqueue(obj3);
        java.lang.Object obj5 = null;
        queueAr1.enqueue(obj5);
        queueAr1.dequeueAll();
        java.lang.Class<?> wildcardClass8 = queueAr1.getClass();
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test013");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) '#');
        boolean boolean2 = queueAr1.isFull();
        DataStructures.QueueAr queueAr4 = new DataStructures.QueueAr((int) '#');
        queueAr4.makeEmpty();
        java.lang.Object obj6 = new java.lang.Object();
        queueAr4.enqueue(obj6);
        java.lang.Object obj8 = null;
        queueAr4.enqueue(obj8);
        DataStructures.QueueAr queueAr11 = new DataStructures.QueueAr((int) '#');
        queueAr11.makeEmpty();
        java.lang.Object obj13 = new java.lang.Object();
        queueAr11.enqueue(obj13);
        boolean boolean15 = queueAr11.isEmpty();
        queueAr4.enqueue((java.lang.Object) queueAr11);
        queueAr1.enqueue((java.lang.Object) queueAr4);
        java.lang.Class<?> wildcardClass18 = queueAr1.getClass();
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test014");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(4);
        queueAr1.enqueue((java.lang.Object) (-10));
        boolean boolean4 = queueAr1.isEmpty();
        java.lang.Object obj5 = queueAr1.getFront();
        queueAr1.makeEmpty();
        boolean boolean7 = queueAr1.isEmpty();
        queueAr1.dequeueAll();
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test015");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) (short) 100);
        java.lang.Object obj2 = queueAr1.getFront();
        java.lang.Class<?> wildcardClass3 = queueAr1.getClass();
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test016");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) ' ');
        queueAr1.makeEmpty();
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test017");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(4);
        queueAr1.enqueue((java.lang.Object) (-10));
        boolean boolean4 = queueAr1.isEmpty();
        java.lang.Object obj5 = queueAr1.getFront();
        java.lang.Object obj6 = queueAr1.dequeue();
        queueAr1.makeEmpty();
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test018");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) '#');
        queueAr1.makeEmpty();
        java.lang.Object obj3 = new java.lang.Object();
        queueAr1.enqueue(obj3);
        java.lang.Object obj5 = null;
        queueAr1.enqueue(obj5);
        queueAr1.dequeueAll();
        java.lang.Object obj8 = queueAr1.dequeue();
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test019");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(4);
        java.lang.Object obj2 = queueAr1.dequeue();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = obj2.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test020");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(4);
        queueAr1.enqueue((java.lang.Object) (-10));
        boolean boolean4 = queueAr1.isEmpty();
        boolean boolean5 = queueAr1.isFull();
        boolean boolean6 = queueAr1.isEmpty();
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test021");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(1);
        boolean boolean2 = queueAr1.isEmpty();
        queueAr1.makeEmpty();
        boolean boolean4 = queueAr1.isFull();
        java.lang.Class<?> wildcardClass5 = queueAr1.getClass();
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test022");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) 'a');
        queueAr1.makeEmpty();
        java.lang.Class<?> wildcardClass3 = queueAr1.getClass();
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test023");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(4);
        queueAr1.enqueue((java.lang.Object) (-10));
        boolean boolean4 = queueAr1.isFull();
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test024");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(4);
        queueAr1.enqueue((java.lang.Object) (-10));
        boolean boolean4 = queueAr1.isEmpty();
        boolean boolean5 = queueAr1.isFull();
        java.lang.Object obj6 = queueAr1.getFront();
        boolean boolean7 = queueAr1.isFull();
        java.lang.Object obj8 = queueAr1.dequeue();
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test025");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(4);
        boolean boolean2 = queueAr1.isFull();
        queueAr1.makeEmpty();
        java.lang.Object obj4 = queueAr1.dequeue();
        queueAr1.dequeueAll();
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test026");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) '#');
        queueAr1.makeEmpty();
        queueAr1.dequeueAll();
        boolean boolean4 = queueAr1.isEmpty();
        java.lang.Object obj5 = queueAr1.dequeue();
        boolean boolean6 = queueAr1.isFull();
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test027");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) '#');
        boolean boolean2 = queueAr1.isFull();
        DataStructures.QueueAr queueAr4 = new DataStructures.QueueAr((int) '#');
        queueAr4.makeEmpty();
        java.lang.Object obj6 = new java.lang.Object();
        queueAr4.enqueue(obj6);
        java.lang.Object obj8 = null;
        queueAr4.enqueue(obj8);
        DataStructures.QueueAr queueAr11 = new DataStructures.QueueAr((int) '#');
        queueAr11.makeEmpty();
        java.lang.Object obj13 = new java.lang.Object();
        queueAr11.enqueue(obj13);
        boolean boolean15 = queueAr11.isEmpty();
        queueAr4.enqueue((java.lang.Object) queueAr11);
        queueAr1.enqueue((java.lang.Object) queueAr4);
        java.lang.Object obj18 = queueAr4.dequeue();
        queueAr4.dequeueAll();
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test028");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(4);
        queueAr1.enqueue((java.lang.Object) (-10));
        boolean boolean4 = queueAr1.isEmpty();
        queueAr1.makeEmpty();
        java.lang.Class<?> wildcardClass6 = queueAr1.getClass();
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test029");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) '#');
        queueAr1.makeEmpty();
        queueAr1.dequeueAll();
        queueAr1.enqueue((java.lang.Object) (-8));
        boolean boolean6 = queueAr1.isFull();
        boolean boolean7 = queueAr1.isFull();
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test030");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(7);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test031");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) ' ');
        boolean boolean2 = queueAr1.isEmpty();
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test032");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(4);
        queueAr1.enqueue((java.lang.Object) (-10));
        boolean boolean4 = queueAr1.isEmpty();
        java.lang.Object obj5 = queueAr1.dequeue();
        queueAr1.makeEmpty();
        boolean boolean7 = queueAr1.isEmpty();
        java.lang.Class<?> wildcardClass8 = queueAr1.getClass();
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test033");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(4);
        queueAr1.enqueue((java.lang.Object) (-10));
        queueAr1.makeEmpty();
        java.lang.Object obj5 = queueAr1.getFront();
        queueAr1.dequeueAll();
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test034");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) '#');
        boolean boolean2 = queueAr1.isFull();
        queueAr1.makeEmpty();
        java.lang.Object obj4 = queueAr1.dequeue();
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test035");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) '#');
        queueAr1.makeEmpty();
        java.lang.Object obj3 = new java.lang.Object();
        queueAr1.enqueue(obj3);
        java.lang.Object obj5 = null;
        queueAr1.enqueue(obj5);
        DataStructures.QueueAr queueAr8 = new DataStructures.QueueAr((int) '#');
        queueAr8.makeEmpty();
        java.lang.Object obj10 = new java.lang.Object();
        queueAr8.enqueue(obj10);
        boolean boolean12 = queueAr8.isEmpty();
        queueAr1.enqueue((java.lang.Object) queueAr8);
        queueAr8.makeEmpty();
        java.lang.Object obj15 = queueAr8.getFront();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass16 = obj15.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test036");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(4);
        queueAr1.enqueue((java.lang.Object) (-10));
        queueAr1.dequeueAll();
        DataStructures.QueueAr queueAr6 = new DataStructures.QueueAr((int) '#');
        queueAr6.makeEmpty();
        queueAr6.dequeueAll();
        java.lang.Class<?> wildcardClass9 = queueAr6.getClass();
        queueAr1.enqueue((java.lang.Object) queueAr6);
        queueAr1.makeEmpty();
        java.lang.Class<?> wildcardClass12 = queueAr1.getClass();
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test037");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(2);
        java.lang.Class<?> wildcardClass2 = queueAr1.getClass();
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test038");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(8);
        boolean boolean2 = queueAr1.isFull();
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test039");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(4);
        queueAr1.enqueue((java.lang.Object) (-10));
        boolean boolean4 = queueAr1.isEmpty();
        java.lang.Object obj5 = queueAr1.getFront();
        queueAr1.dequeueAll();
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test040");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(4);
        java.lang.Object obj2 = queueAr1.dequeue();
        queueAr1.enqueue((java.lang.Object) 7);
        java.lang.Object obj5 = queueAr1.getFront();
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test041");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) (short) 0);
        java.lang.Class<?> wildcardClass2 = queueAr1.getClass();
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test042");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(4);
        queueAr1.enqueue((java.lang.Object) (-10));
        queueAr1.dequeueAll();
        DataStructures.QueueAr queueAr6 = new DataStructures.QueueAr((int) '#');
        queueAr6.makeEmpty();
        queueAr6.dequeueAll();
        java.lang.Class<?> wildcardClass9 = queueAr6.getClass();
        queueAr1.enqueue((java.lang.Object) queueAr6);
        java.lang.Class<?> wildcardClass11 = queueAr1.getClass();
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test043");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) '#');
        queueAr1.makeEmpty();
        java.lang.Object obj3 = new java.lang.Object();
        queueAr1.enqueue(obj3);
        boolean boolean5 = queueAr1.isEmpty();
        queueAr1.makeEmpty();
        queueAr1.makeEmpty();
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test044");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) '#');
        boolean boolean2 = queueAr1.isFull();
        DataStructures.QueueAr queueAr4 = new DataStructures.QueueAr((int) '#');
        queueAr4.makeEmpty();
        java.lang.Object obj6 = new java.lang.Object();
        queueAr4.enqueue(obj6);
        java.lang.Object obj8 = null;
        queueAr4.enqueue(obj8);
        DataStructures.QueueAr queueAr11 = new DataStructures.QueueAr((int) '#');
        queueAr11.makeEmpty();
        java.lang.Object obj13 = new java.lang.Object();
        queueAr11.enqueue(obj13);
        boolean boolean15 = queueAr11.isEmpty();
        queueAr4.enqueue((java.lang.Object) queueAr11);
        queueAr1.enqueue((java.lang.Object) queueAr4);
        queueAr4.dequeueAll();
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test045");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) '#');
        boolean boolean2 = queueAr1.isEmpty();
        queueAr1.enqueue((java.lang.Object) 2);
        boolean boolean5 = queueAr1.isFull();
        DataStructures.QueueAr queueAr7 = new DataStructures.QueueAr(1);
        boolean boolean8 = queueAr7.isFull();
        boolean boolean9 = queueAr7.isFull();
        queueAr1.enqueue((java.lang.Object) queueAr7);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test046");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) (byte) 100);
        queueAr1.dequeueAll();
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test047");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) '#');
        boolean boolean2 = queueAr1.isEmpty();
        java.lang.Class<?> wildcardClass3 = queueAr1.getClass();
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test048");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(1);
        java.lang.Object obj2 = queueAr1.dequeue();
        java.lang.Object obj3 = queueAr1.getFront();
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test049");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) '#');
        queueAr1.makeEmpty();
        java.lang.Object obj3 = new java.lang.Object();
        queueAr1.enqueue(obj3);
        java.lang.Object obj5 = null;
        queueAr1.enqueue(obj5);
        queueAr1.dequeueAll();
        boolean boolean8 = queueAr1.isFull();
        java.lang.Object obj9 = queueAr1.dequeue();
        queueAr1.enqueue((java.lang.Object) '4');
        java.lang.Class<?> wildcardClass12 = queueAr1.getClass();
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test050");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) '#');
        queueAr1.makeEmpty();
        queueAr1.dequeueAll();
        boolean boolean4 = queueAr1.isEmpty();
        DataStructures.QueueAr queueAr6 = new DataStructures.QueueAr((int) (short) 0);
        boolean boolean7 = queueAr6.isEmpty();
        queueAr1.enqueue((java.lang.Object) queueAr6);
        queueAr1.dequeueAll();
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test051");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) '#');
        java.lang.Object obj2 = queueAr1.dequeue();
        java.lang.Class<?> wildcardClass3 = queueAr1.getClass();
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test052");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) '#');
        boolean boolean2 = queueAr1.isFull();
        DataStructures.QueueAr queueAr4 = new DataStructures.QueueAr((int) '#');
        queueAr4.makeEmpty();
        java.lang.Object obj6 = new java.lang.Object();
        queueAr4.enqueue(obj6);
        java.lang.Object obj8 = null;
        queueAr4.enqueue(obj8);
        DataStructures.QueueAr queueAr11 = new DataStructures.QueueAr((int) '#');
        queueAr11.makeEmpty();
        java.lang.Object obj13 = new java.lang.Object();
        queueAr11.enqueue(obj13);
        boolean boolean15 = queueAr11.isEmpty();
        queueAr4.enqueue((java.lang.Object) queueAr11);
        queueAr1.enqueue((java.lang.Object) queueAr4);
        java.lang.Object obj18 = queueAr1.dequeue();
        java.lang.Object obj19 = queueAr1.dequeue();
        queueAr1.makeEmpty();
        java.lang.Class<?> wildcardClass21 = queueAr1.getClass();
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test053");
        // The following exception was thrown during execution in test generation
        try {
            DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        // Expected exception.
        }
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test054");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(4);
        boolean boolean2 = queueAr1.isFull();
        java.lang.Object obj3 = queueAr1.getFront();
        java.lang.Object obj4 = queueAr1.getFront();
        boolean boolean5 = queueAr1.isFull();
        boolean boolean6 = queueAr1.isFull();
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test055");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) (short) 0);
        DataStructures.QueueAr queueAr3 = new DataStructures.QueueAr((int) '#');
        queueAr3.makeEmpty();
        queueAr3.dequeueAll();
        boolean boolean6 = queueAr3.isEmpty();
        java.lang.Object obj7 = queueAr3.dequeue();
        // The following exception was thrown during execution in test generation
        try {
            queueAr1.enqueue(obj7);
            org.junit.Assert.fail("Expected exception of type DataStructures.Overflow; message: null");
        } catch (DataStructures.Overflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test056");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) '#');
        queueAr1.makeEmpty();
        queueAr1.dequeueAll();
        boolean boolean4 = queueAr1.isFull();
        queueAr1.enqueue((java.lang.Object) 1L);
        queueAr1.makeEmpty();
        queueAr1.makeEmpty();
        queueAr1.dequeueAll();
        java.lang.Object obj10 = queueAr1.getFront();
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test057");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(0);
        DataStructures.QueueAr queueAr3 = new DataStructures.QueueAr(5);
        // The following exception was thrown during execution in test generation
        try {
            queueAr1.enqueue((java.lang.Object) queueAr3);
            org.junit.Assert.fail("Expected exception of type DataStructures.Overflow; message: null");
        } catch (DataStructures.Overflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test058");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(4);
        queueAr1.enqueue((java.lang.Object) (-10));
        boolean boolean4 = queueAr1.isEmpty();
        queueAr1.makeEmpty();
        java.lang.Object obj6 = queueAr1.dequeue();
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test059");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(1);
        boolean boolean2 = queueAr1.isEmpty();
        queueAr1.enqueue((java.lang.Object) 0.0f);
        java.lang.Class<?> wildcardClass5 = queueAr1.getClass();
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test060");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) '#');
        boolean boolean2 = queueAr1.isFull();
        queueAr1.makeEmpty();
        queueAr1.makeEmpty();
        java.lang.Class<?> wildcardClass5 = queueAr1.getClass();
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test061");
        // The following exception was thrown during execution in test generation
        try {
            DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((-2));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        // Expected exception.
        }
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test062");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(1);
        boolean boolean2 = queueAr1.isEmpty();
        queueAr1.makeEmpty();
        boolean boolean4 = queueAr1.isFull();
        boolean boolean5 = queueAr1.isFull();
        java.lang.Object obj6 = queueAr1.dequeue();
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test063");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(1);
        boolean boolean2 = queueAr1.isEmpty();
        queueAr1.enqueue((java.lang.Object) 0.0f);
        queueAr1.dequeueAll();
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test064");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(4);
        boolean boolean2 = queueAr1.isFull();
        queueAr1.makeEmpty();
        queueAr1.makeEmpty();
        java.lang.Object obj5 = queueAr1.dequeue();
        java.lang.Object obj6 = queueAr1.getFront();
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test065");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) '#');
        boolean boolean2 = queueAr1.isEmpty();
        queueAr1.makeEmpty();
        queueAr1.dequeueAll();
        boolean boolean5 = queueAr1.isFull();
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test066");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) '#');
        queueAr1.makeEmpty();
        java.lang.Object obj3 = new java.lang.Object();
        queueAr1.enqueue(obj3);
        java.lang.Object obj5 = null;
        queueAr1.enqueue(obj5);
        queueAr1.dequeueAll();
        boolean boolean8 = queueAr1.isFull();
        java.lang.Object obj9 = queueAr1.dequeue();
        boolean boolean10 = queueAr1.isFull();
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test067");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(4);
        queueAr1.enqueue((java.lang.Object) (-10));
        boolean boolean4 = queueAr1.isEmpty();
        java.lang.Object obj5 = queueAr1.getFront();
        java.lang.Object obj6 = queueAr1.dequeue();
        boolean boolean7 = queueAr1.isEmpty();
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test068");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) '#');
        queueAr1.dequeueAll();
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test069");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(4);
        boolean boolean2 = queueAr1.isFull();
        java.lang.Object obj3 = queueAr1.getFront();
        java.lang.Object obj4 = queueAr1.getFront();
        java.lang.Object obj5 = queueAr1.dequeue();
        java.lang.Object obj6 = queueAr1.getFront();
        DataStructures.QueueAr queueAr8 = new DataStructures.QueueAr(4);
        java.lang.Object obj9 = queueAr8.getFront();
        DataStructures.QueueAr queueAr11 = new DataStructures.QueueAr(2);
        queueAr8.enqueue((java.lang.Object) queueAr11);
        java.lang.Object obj13 = queueAr8.dequeue();
        queueAr1.enqueue((java.lang.Object) queueAr8);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test070");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(4);
        boolean boolean2 = queueAr1.isFull();
        queueAr1.makeEmpty();
        boolean boolean4 = queueAr1.isEmpty();
        DataStructures.QueueAr queueAr6 = new DataStructures.QueueAr(1);
        java.lang.Object obj7 = queueAr6.dequeue();
        queueAr1.enqueue(obj7);
        java.lang.Class<?> wildcardClass9 = queueAr1.getClass();
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test071");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) (byte) 10);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test072");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(4);
        queueAr1.enqueue((java.lang.Object) (-10));
        boolean boolean4 = queueAr1.isEmpty();
        java.lang.Object obj5 = queueAr1.getFront();
        queueAr1.enqueue((java.lang.Object) "hi!");
        DataStructures.QueueAr queueAr9 = new DataStructures.QueueAr((int) '#');
        queueAr9.makeEmpty();
        java.lang.Object obj11 = new java.lang.Object();
        queueAr9.enqueue(obj11);
        java.lang.Object obj13 = null;
        queueAr9.enqueue(obj13);
        queueAr9.dequeueAll();
        boolean boolean16 = queueAr9.isFull();
        queueAr1.enqueue((java.lang.Object) boolean16);
        java.lang.Object obj18 = queueAr1.getFront();
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test073");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(4);
        boolean boolean2 = queueAr1.isFull();
        java.lang.Class<?> wildcardClass3 = queueAr1.getClass();
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test074");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(4);
        queueAr1.enqueue((java.lang.Object) (-10));
        boolean boolean4 = queueAr1.isEmpty();
        queueAr1.makeEmpty();
        boolean boolean6 = queueAr1.isEmpty();
        queueAr1.enqueue((java.lang.Object) 100);
        java.lang.Object obj9 = queueAr1.getFront();
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test075");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) '#');
        queueAr1.makeEmpty();
        java.lang.Object obj3 = new java.lang.Object();
        queueAr1.enqueue(obj3);
        java.lang.Object obj5 = null;
        queueAr1.enqueue(obj5);
        queueAr1.dequeueAll();
        java.lang.Object obj8 = queueAr1.getFront();
        java.lang.Class<?> wildcardClass9 = queueAr1.getClass();
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test076");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(0);
        java.lang.Object obj2 = queueAr1.getFront();
        java.lang.Class<?> wildcardClass3 = queueAr1.getClass();
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test077");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(8);
        java.lang.Object obj2 = queueAr1.getFront();
        boolean boolean3 = queueAr1.isFull();
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test078");
        // The following exception was thrown during execution in test generation
        try {
            DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        // Expected exception.
        }
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test079");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) '#');
        queueAr1.makeEmpty();
        queueAr1.dequeueAll();
        queueAr1.enqueue((java.lang.Object) (-8));
        DataStructures.QueueAr queueAr7 = new DataStructures.QueueAr((int) (short) 100);
        queueAr1.enqueue((java.lang.Object) queueAr7);
        queueAr1.makeEmpty();
        boolean boolean10 = queueAr1.isEmpty();
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test080");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) (short) 100);
        queueAr1.dequeueAll();
        java.lang.Object obj3 = queueAr1.getFront();
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test081");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) '#');
        queueAr1.makeEmpty();
        java.lang.Object obj3 = new java.lang.Object();
        queueAr1.enqueue(obj3);
        java.lang.Object obj5 = null;
        queueAr1.enqueue(obj5);
        queueAr1.dequeueAll();
        boolean boolean8 = queueAr1.isFull();
        java.lang.Class<?> wildcardClass9 = queueAr1.getClass();
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test082");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(4);
        boolean boolean2 = queueAr1.isFull();
        java.lang.Object obj3 = queueAr1.getFront();
        java.lang.Object obj4 = queueAr1.getFront();
        java.lang.Object obj5 = queueAr1.dequeue();
        java.lang.Class<?> wildcardClass6 = queueAr1.getClass();
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test083");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(4);
        queueAr1.enqueue((java.lang.Object) (-10));
        boolean boolean4 = queueAr1.isEmpty();
        java.lang.Object obj5 = queueAr1.dequeue();
        java.lang.Object obj6 = queueAr1.dequeue();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = obj6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test084");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) '#');
        queueAr1.makeEmpty();
        queueAr1.dequeueAll();
        boolean boolean4 = queueAr1.isFull();
        queueAr1.enqueue((java.lang.Object) 1L);
        queueAr1.makeEmpty();
        queueAr1.makeEmpty();
        queueAr1.dequeueAll();
        java.lang.Object obj10 = queueAr1.dequeue();
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test085");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(4);
        queueAr1.enqueue((java.lang.Object) (-10));
        boolean boolean4 = queueAr1.isEmpty();
        queueAr1.makeEmpty();
        boolean boolean6 = queueAr1.isEmpty();
        queueAr1.enqueue((java.lang.Object) 100);
        DataStructures.QueueAr queueAr10 = new DataStructures.QueueAr((int) '#');
        queueAr10.makeEmpty();
        queueAr10.dequeueAll();
        boolean boolean13 = queueAr10.isFull();
        queueAr10.enqueue((java.lang.Object) 1L);
        queueAr10.makeEmpty();
        queueAr10.makeEmpty();
        queueAr1.enqueue((java.lang.Object) queueAr10);
        DataStructures.QueueAr queueAr20 = new DataStructures.QueueAr((int) '#');
        queueAr20.makeEmpty();
        java.lang.Object obj22 = new java.lang.Object();
        queueAr20.enqueue(obj22);
        queueAr1.enqueue(obj22);
        java.lang.Object obj25 = queueAr1.dequeue();
        java.lang.Object obj26 = queueAr1.dequeue();
        java.lang.Class<?> wildcardClass27 = queueAr1.getClass();
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test086");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) '#');
        queueAr1.makeEmpty();
        queueAr1.dequeueAll();
        boolean boolean4 = queueAr1.isFull();
        queueAr1.enqueue((java.lang.Object) 1L);
        queueAr1.makeEmpty();
        queueAr1.makeEmpty();
        boolean boolean9 = queueAr1.isEmpty();
        boolean boolean10 = queueAr1.isEmpty();
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test087");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) (byte) 0);
        queueAr1.makeEmpty();
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test088");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) '#');
        queueAr1.makeEmpty();
        queueAr1.dequeueAll();
        boolean boolean4 = queueAr1.isEmpty();
        java.lang.Object obj5 = queueAr1.dequeue();
        queueAr1.dequeueAll();
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test089");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(4);
        java.lang.Object obj2 = queueAr1.dequeue();
        queueAr1.enqueue((java.lang.Object) 7);
        DataStructures.QueueAr queueAr6 = new DataStructures.QueueAr((int) '#');
        queueAr6.makeEmpty();
        java.lang.Object obj8 = new java.lang.Object();
        queueAr6.enqueue(obj8);
        java.lang.Object obj10 = null;
        queueAr6.enqueue(obj10);
        queueAr6.dequeueAll();
        boolean boolean13 = queueAr6.isFull();
        java.lang.Object obj14 = queueAr6.dequeue();
        queueAr1.enqueue(obj14);
        boolean boolean16 = queueAr1.isEmpty();
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test090");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(4);
        queueAr1.enqueue((java.lang.Object) (-10));
        boolean boolean4 = queueAr1.isEmpty();
        boolean boolean5 = queueAr1.isFull();
        boolean boolean6 = queueAr1.isFull();
        queueAr1.dequeueAll();
        boolean boolean8 = queueAr1.isFull();
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test091");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(4);
        queueAr1.enqueue((java.lang.Object) (-10));
        boolean boolean4 = queueAr1.isEmpty();
        queueAr1.makeEmpty();
        boolean boolean6 = queueAr1.isEmpty();
        queueAr1.enqueue((java.lang.Object) 100);
        DataStructures.QueueAr queueAr10 = new DataStructures.QueueAr((int) '#');
        queueAr10.makeEmpty();
        queueAr10.dequeueAll();
        boolean boolean13 = queueAr10.isFull();
        queueAr10.enqueue((java.lang.Object) 1L);
        queueAr10.makeEmpty();
        queueAr10.makeEmpty();
        queueAr1.enqueue((java.lang.Object) queueAr10);
        DataStructures.QueueAr queueAr20 = new DataStructures.QueueAr((int) '#');
        queueAr20.makeEmpty();
        java.lang.Object obj22 = new java.lang.Object();
        queueAr20.enqueue(obj22);
        queueAr1.enqueue(obj22);
        java.lang.Object obj25 = queueAr1.dequeue();
        boolean boolean26 = queueAr1.isEmpty();
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test092");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(4);
        queueAr1.enqueue((java.lang.Object) (-10));
        boolean boolean4 = queueAr1.isEmpty();
        boolean boolean5 = queueAr1.isFull();
        java.lang.Object obj6 = queueAr1.getFront();
        boolean boolean7 = queueAr1.isFull();
        java.lang.Class<?> wildcardClass8 = queueAr1.getClass();
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test093");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) '#');
        queueAr1.makeEmpty();
        queueAr1.dequeueAll();
        boolean boolean4 = queueAr1.isFull();
        queueAr1.enqueue((java.lang.Object) 1L);
        queueAr1.makeEmpty();
        queueAr1.makeEmpty();
        boolean boolean9 = queueAr1.isEmpty();
        queueAr1.makeEmpty();
        DataStructures.QueueAr queueAr12 = new DataStructures.QueueAr(4);
        boolean boolean13 = queueAr12.isFull();
        java.lang.Object obj14 = queueAr12.getFront();
        queueAr12.dequeueAll();
        queueAr1.enqueue((java.lang.Object) queueAr12);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test094");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(4);
        boolean boolean2 = queueAr1.isFull();
        queueAr1.makeEmpty();
        boolean boolean4 = queueAr1.isFull();
        DataStructures.QueueAr queueAr6 = new DataStructures.QueueAr(4);
        queueAr6.enqueue((java.lang.Object) (-10));
        boolean boolean9 = queueAr6.isEmpty();
        java.lang.Object obj10 = queueAr6.getFront();
        java.lang.Object obj11 = queueAr6.dequeue();
        queueAr1.enqueue(obj11);
        queueAr1.enqueue((java.lang.Object) (byte) 10);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test095");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(4);
        queueAr1.enqueue((java.lang.Object) (-10));
        boolean boolean4 = queueAr1.isEmpty();
        boolean boolean5 = queueAr1.isFull();
        boolean boolean6 = queueAr1.isFull();
        queueAr1.dequeueAll();
        DataStructures.QueueAr queueAr9 = new DataStructures.QueueAr((int) '#');
        boolean boolean10 = queueAr9.isFull();
        DataStructures.QueueAr queueAr12 = new DataStructures.QueueAr((int) '#');
        queueAr12.makeEmpty();
        java.lang.Object obj14 = new java.lang.Object();
        queueAr12.enqueue(obj14);
        java.lang.Object obj16 = null;
        queueAr12.enqueue(obj16);
        DataStructures.QueueAr queueAr19 = new DataStructures.QueueAr((int) '#');
        queueAr19.makeEmpty();
        java.lang.Object obj21 = new java.lang.Object();
        queueAr19.enqueue(obj21);
        boolean boolean23 = queueAr19.isEmpty();
        queueAr12.enqueue((java.lang.Object) queueAr19);
        queueAr9.enqueue((java.lang.Object) queueAr12);
        java.lang.Object obj26 = queueAr12.dequeue();
        boolean boolean27 = queueAr12.isFull();
        queueAr1.enqueue((java.lang.Object) queueAr12);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test096");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) '#');
        boolean boolean2 = queueAr1.isEmpty();
        queueAr1.dequeueAll();
        java.lang.Object obj4 = queueAr1.dequeue();
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test097");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(100);
        java.lang.Object obj2 = queueAr1.dequeue();
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test098");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(4);
        queueAr1.enqueue((java.lang.Object) (-10));
        boolean boolean4 = queueAr1.isEmpty();
        java.lang.Object obj5 = queueAr1.getFront();
        queueAr1.makeEmpty();
        boolean boolean7 = queueAr1.isEmpty();
        queueAr1.makeEmpty();
        java.lang.Object obj9 = queueAr1.dequeue();
        boolean boolean10 = queueAr1.isEmpty();
        queueAr1.makeEmpty();
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test099");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(4);
        boolean boolean2 = queueAr1.isFull();
        java.lang.Object obj3 = queueAr1.getFront();
        queueAr1.makeEmpty();
        boolean boolean5 = queueAr1.isEmpty();
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test100");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(4);
        queueAr1.enqueue((java.lang.Object) (-10));
        boolean boolean4 = queueAr1.isEmpty();
        queueAr1.makeEmpty();
        boolean boolean6 = queueAr1.isEmpty();
        queueAr1.dequeueAll();
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test101");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(1);
        boolean boolean2 = queueAr1.isEmpty();
        DataStructures.QueueAr queueAr4 = new DataStructures.QueueAr(4);
        boolean boolean5 = queueAr4.isEmpty();
        java.lang.Object obj6 = queueAr4.dequeue();
        queueAr1.enqueue((java.lang.Object) queueAr4);
        java.lang.Object obj8 = queueAr4.dequeue();
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test102");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) '#');
        queueAr1.makeEmpty();
        java.lang.Object obj3 = new java.lang.Object();
        queueAr1.enqueue(obj3);
        boolean boolean5 = queueAr1.isEmpty();
        boolean boolean6 = queueAr1.isEmpty();
        boolean boolean7 = queueAr1.isFull();
        DataStructures.QueueAr queueAr9 = new DataStructures.QueueAr(1);
        java.lang.Object obj10 = queueAr9.dequeue();
        queueAr1.enqueue(obj10);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test103");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) (byte) 1);
        boolean boolean2 = queueAr1.isFull();
        queueAr1.makeEmpty();
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test104");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) '#');
        queueAr1.makeEmpty();
        java.lang.Object obj3 = new java.lang.Object();
        queueAr1.enqueue(obj3);
        java.lang.Object obj5 = null;
        queueAr1.enqueue(obj5);
        boolean boolean7 = queueAr1.isEmpty();
        java.lang.Object obj8 = queueAr1.getFront();
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test105");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(4);
        queueAr1.enqueue((java.lang.Object) (-10));
        boolean boolean4 = queueAr1.isEmpty();
        java.lang.Object obj5 = queueAr1.getFront();
        java.lang.Object obj6 = queueAr1.getFront();
        java.lang.Class<?> wildcardClass7 = queueAr1.getClass();
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test106");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(4);
        queueAr1.enqueue((java.lang.Object) (-10));
        java.lang.Object obj4 = queueAr1.getFront();
        queueAr1.enqueue((java.lang.Object) (-9));
        java.lang.Object obj7 = queueAr1.dequeue();
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test107");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) '#');
        boolean boolean2 = queueAr1.isEmpty();
        DataStructures.QueueAr queueAr4 = new DataStructures.QueueAr((int) (byte) 100);
        java.lang.Class<?> wildcardClass5 = queueAr4.getClass();
        queueAr1.enqueue((java.lang.Object) queueAr4);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test108");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(1);
        boolean boolean2 = queueAr1.isEmpty();
        queueAr1.makeEmpty();
        boolean boolean4 = queueAr1.isFull();
        boolean boolean5 = queueAr1.isFull();
        java.lang.Object obj6 = null;
        queueAr1.enqueue(obj6);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test109");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(4);
        queueAr1.enqueue((java.lang.Object) (-10));
        boolean boolean4 = queueAr1.isEmpty();
        boolean boolean5 = queueAr1.isFull();
        java.lang.Object obj6 = queueAr1.getFront();
        boolean boolean7 = queueAr1.isFull();
        boolean boolean8 = queueAr1.isEmpty();
        queueAr1.enqueue((java.lang.Object) (-7));
        queueAr1.dequeueAll();
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test110");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) '#');
        queueAr1.makeEmpty();
        java.lang.Object obj3 = new java.lang.Object();
        queueAr1.enqueue(obj3);
        java.lang.Object obj5 = null;
        queueAr1.enqueue(obj5);
        DataStructures.QueueAr queueAr8 = new DataStructures.QueueAr((int) '#');
        queueAr8.makeEmpty();
        java.lang.Object obj10 = new java.lang.Object();
        queueAr8.enqueue(obj10);
        boolean boolean12 = queueAr8.isEmpty();
        queueAr1.enqueue((java.lang.Object) queueAr8);
        queueAr8.makeEmpty();
        java.lang.Object obj15 = queueAr8.getFront();
        queueAr8.makeEmpty();
        queueAr8.makeEmpty();
        java.lang.Object obj18 = queueAr8.getFront();
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test111");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(4);
        boolean boolean2 = queueAr1.isFull();
        queueAr1.makeEmpty();
        queueAr1.makeEmpty();
        java.lang.Object obj5 = queueAr1.dequeue();
        DataStructures.QueueAr queueAr7 = new DataStructures.QueueAr((int) '#');
        queueAr7.makeEmpty();
        queueAr7.dequeueAll();
        boolean boolean10 = queueAr7.isFull();
        queueAr7.enqueue((java.lang.Object) 1L);
        queueAr7.makeEmpty();
        queueAr7.makeEmpty();
        boolean boolean15 = queueAr7.isEmpty();
        java.lang.Class<?> wildcardClass16 = queueAr7.getClass();
        queueAr1.enqueue((java.lang.Object) wildcardClass16);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test112");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) '#');
        queueAr1.makeEmpty();
        queueAr1.dequeueAll();
        queueAr1.enqueue((java.lang.Object) (-8));
        queueAr1.dequeueAll();
        java.lang.Object obj7 = queueAr1.dequeue();
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test113");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(4);
        java.lang.Object obj2 = queueAr1.getFront();
        DataStructures.QueueAr queueAr4 = new DataStructures.QueueAr(2);
        queueAr1.enqueue((java.lang.Object) queueAr4);
        queueAr4.makeEmpty();
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test114");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) (byte) 1);
        queueAr1.dequeueAll();
        queueAr1.makeEmpty();
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test115");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) '#');
        queueAr1.makeEmpty();
        queueAr1.dequeueAll();
        queueAr1.enqueue((java.lang.Object) (-8));
        DataStructures.QueueAr queueAr7 = new DataStructures.QueueAr((int) (short) 100);
        queueAr1.enqueue((java.lang.Object) queueAr7);
        java.lang.Class<?> wildcardClass9 = queueAr1.getClass();
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test116");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(4);
        queueAr1.enqueue((java.lang.Object) (-10));
        queueAr1.makeEmpty();
        queueAr1.makeEmpty();
        java.lang.Object obj6 = queueAr1.dequeue();
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test117");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) (byte) 1);
        java.lang.Object obj2 = queueAr1.dequeue();
        queueAr1.makeEmpty();
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test118");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(4);
        boolean boolean2 = queueAr1.isFull();
        queueAr1.makeEmpty();
        boolean boolean4 = queueAr1.isEmpty();
        DataStructures.QueueAr queueAr6 = new DataStructures.QueueAr(1);
        java.lang.Object obj7 = queueAr6.dequeue();
        queueAr1.enqueue(obj7);
        boolean boolean9 = queueAr1.isEmpty();
        queueAr1.makeEmpty();
        java.lang.Object obj11 = queueAr1.getFront();
        boolean boolean12 = queueAr1.isFull();
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test119");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(5);
        queueAr1.makeEmpty();
        queueAr1.makeEmpty();
        boolean boolean4 = queueAr1.isFull();
        boolean boolean5 = queueAr1.isFull();
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test120");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) '#');
        queueAr1.makeEmpty();
        queueAr1.dequeueAll();
        boolean boolean4 = queueAr1.isEmpty();
        boolean boolean5 = queueAr1.isFull();
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test121");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(4);
        java.lang.Object obj2 = queueAr1.getFront();
        java.lang.Object obj3 = queueAr1.dequeue();
        queueAr1.makeEmpty();
        boolean boolean5 = queueAr1.isFull();
        java.lang.Object obj6 = queueAr1.getFront();
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test122");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(4);
        boolean boolean2 = queueAr1.isFull();
        java.lang.Object obj3 = queueAr1.getFront();
        java.lang.Object obj4 = queueAr1.getFront();
        java.lang.Object obj5 = queueAr1.dequeue();
        queueAr1.dequeueAll();
        queueAr1.makeEmpty();
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test123");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(4);
        boolean boolean2 = queueAr1.isFull();
        java.lang.Object obj3 = queueAr1.getFront();
        java.lang.Object obj4 = queueAr1.getFront();
        boolean boolean5 = queueAr1.isEmpty();
        queueAr1.dequeueAll();
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test124");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) 'a');
        DataStructures.QueueAr queueAr3 = new DataStructures.QueueAr((int) '#');
        boolean boolean4 = queueAr3.isFull();
        queueAr3.makeEmpty();
        queueAr1.enqueue((java.lang.Object) queueAr3);
        java.lang.Class<?> wildcardClass7 = queueAr3.getClass();
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test125");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) '#');
        queueAr1.makeEmpty();
        java.lang.Object obj3 = new java.lang.Object();
        queueAr1.enqueue(obj3);
        java.lang.Object obj5 = null;
        queueAr1.enqueue(obj5);
        DataStructures.QueueAr queueAr8 = new DataStructures.QueueAr((int) '#');
        queueAr8.makeEmpty();
        java.lang.Object obj10 = new java.lang.Object();
        queueAr8.enqueue(obj10);
        boolean boolean12 = queueAr8.isEmpty();
        queueAr1.enqueue((java.lang.Object) queueAr8);
        boolean boolean14 = queueAr8.isFull();
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test126");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(4);
        queueAr1.enqueue((java.lang.Object) (-10));
        boolean boolean4 = queueAr1.isEmpty();
        boolean boolean5 = queueAr1.isFull();
        java.lang.Object obj6 = queueAr1.getFront();
        boolean boolean7 = queueAr1.isFull();
        queueAr1.makeEmpty();
        queueAr1.dequeueAll();
        boolean boolean10 = queueAr1.isEmpty();
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test127");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(4);
        java.lang.Object obj2 = queueAr1.dequeue();
        queueAr1.enqueue((java.lang.Object) 7);
        DataStructures.QueueAr queueAr6 = new DataStructures.QueueAr((int) '#');
        queueAr6.makeEmpty();
        java.lang.Object obj8 = new java.lang.Object();
        queueAr6.enqueue(obj8);
        java.lang.Object obj10 = null;
        queueAr6.enqueue(obj10);
        queueAr6.dequeueAll();
        boolean boolean13 = queueAr6.isFull();
        java.lang.Object obj14 = queueAr6.dequeue();
        queueAr1.enqueue(obj14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass16 = obj14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test128");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(4);
        queueAr1.enqueue((java.lang.Object) (-10));
        queueAr1.dequeueAll();
        DataStructures.QueueAr queueAr6 = new DataStructures.QueueAr((int) '#');
        queueAr6.makeEmpty();
        queueAr6.dequeueAll();
        java.lang.Class<?> wildcardClass9 = queueAr6.getClass();
        queueAr1.enqueue((java.lang.Object) queueAr6);
        queueAr1.makeEmpty();
        queueAr1.dequeueAll();
        boolean boolean13 = queueAr1.isFull();
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test129");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(4);
        queueAr1.enqueue((java.lang.Object) (-10));
        boolean boolean4 = queueAr1.isEmpty();
        java.lang.Object obj5 = queueAr1.getFront();
        DataStructures.QueueAr queueAr7 = new DataStructures.QueueAr(4);
        queueAr7.enqueue((java.lang.Object) (-10));
        boolean boolean10 = queueAr7.isEmpty();
        queueAr7.dequeueAll();
        queueAr7.dequeueAll();
        queueAr1.enqueue((java.lang.Object) queueAr7);
        boolean boolean14 = queueAr1.isEmpty();
        java.lang.Object obj15 = queueAr1.getFront();
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test130");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) '#');
        queueAr1.makeEmpty();
        queueAr1.dequeueAll();
        boolean boolean4 = queueAr1.isFull();
        queueAr1.enqueue((java.lang.Object) 1L);
        queueAr1.makeEmpty();
        queueAr1.makeEmpty();
        java.lang.Object obj9 = queueAr1.dequeue();
        java.lang.Object obj10 = queueAr1.dequeue();
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test131");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) '#');
        boolean boolean2 = queueAr1.isEmpty();
        queueAr1.enqueue((java.lang.Object) 2);
        boolean boolean5 = queueAr1.isFull();
        queueAr1.makeEmpty();
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test132");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) (short) 100);
        DataStructures.QueueAr queueAr3 = new DataStructures.QueueAr(1);
        boolean boolean4 = queueAr3.isEmpty();
        java.lang.Class<?> wildcardClass5 = queueAr3.getClass();
        queueAr1.enqueue((java.lang.Object) wildcardClass5);
        java.lang.Object obj7 = queueAr1.getFront();
        boolean boolean8 = queueAr1.isEmpty();
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test133");
        // The following exception was thrown during execution in test generation
        try {
            DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((-10));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        // Expected exception.
        }
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test134");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(4);
        queueAr1.enqueue((java.lang.Object) (-10));
        boolean boolean4 = queueAr1.isEmpty();
        java.lang.Object obj5 = queueAr1.getFront();
        java.lang.Object obj6 = queueAr1.dequeue();
        java.lang.Object obj7 = queueAr1.getFront();
        DataStructures.QueueAr queueAr9 = new DataStructures.QueueAr((int) '#');
        boolean boolean10 = queueAr9.isEmpty();
        queueAr9.makeEmpty();
        queueAr1.enqueue((java.lang.Object) queueAr9);
        boolean boolean13 = queueAr9.isFull();
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test135");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(4);
        boolean boolean2 = queueAr1.isFull();
        queueAr1.makeEmpty();
        boolean boolean4 = queueAr1.isEmpty();
        DataStructures.QueueAr queueAr6 = new DataStructures.QueueAr((int) '#');
        queueAr6.makeEmpty();
        java.lang.Object obj8 = new java.lang.Object();
        queueAr6.enqueue(obj8);
        queueAr1.enqueue((java.lang.Object) queueAr6);
        DataStructures.QueueAr queueAr12 = new DataStructures.QueueAr(4);
        queueAr12.enqueue((java.lang.Object) (-10));
        boolean boolean15 = queueAr12.isEmpty();
        queueAr12.makeEmpty();
        boolean boolean17 = queueAr12.isEmpty();
        queueAr12.enqueue((java.lang.Object) 100);
        queueAr1.enqueue((java.lang.Object) 100);
        java.lang.Object obj21 = queueAr1.dequeue();
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test136");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(4);
        queueAr1.enqueue((java.lang.Object) (-10));
        java.lang.Object obj4 = queueAr1.getFront();
        queueAr1.dequeueAll();
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test137");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(4);
        queueAr1.enqueue((java.lang.Object) (-10));
        boolean boolean4 = queueAr1.isEmpty();
        java.lang.Object obj5 = queueAr1.getFront();
        java.lang.Object obj6 = queueAr1.getFront();
        java.lang.Object obj7 = queueAr1.getFront();
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test138");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) 'a');
        queueAr1.makeEmpty();
        boolean boolean3 = queueAr1.isFull();
        java.lang.Object obj4 = queueAr1.dequeue();
        boolean boolean5 = queueAr1.isEmpty();
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test139");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(4);
        queueAr1.enqueue((java.lang.Object) (-10));
        boolean boolean4 = queueAr1.isEmpty();
        queueAr1.dequeueAll();
        java.lang.Object obj6 = queueAr1.getFront();
        java.lang.Object obj7 = queueAr1.dequeue();
        java.lang.Object obj8 = queueAr1.dequeue();
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test140");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) '#');
        queueAr1.makeEmpty();
        java.lang.Object obj3 = new java.lang.Object();
        queueAr1.enqueue(obj3);
        java.lang.Object obj5 = null;
        queueAr1.enqueue(obj5);
        queueAr1.dequeueAll();
        boolean boolean8 = queueAr1.isFull();
        java.lang.Object obj9 = queueAr1.getFront();
        queueAr1.makeEmpty();
        java.lang.Object obj11 = queueAr1.dequeue();
        queueAr1.dequeueAll();
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test141");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) '#');
        queueAr1.makeEmpty();
        queueAr1.dequeueAll();
        queueAr1.enqueue((java.lang.Object) (-8));
        boolean boolean6 = queueAr1.isFull();
        boolean boolean7 = queueAr1.isEmpty();
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test142");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) '#');
        queueAr1.makeEmpty();
        java.lang.Object obj3 = new java.lang.Object();
        queueAr1.enqueue(obj3);
        java.lang.Object obj5 = null;
        queueAr1.enqueue(obj5);
        queueAr1.dequeueAll();
        boolean boolean8 = queueAr1.isEmpty();
        queueAr1.dequeueAll();
        queueAr1.makeEmpty();
        boolean boolean11 = queueAr1.isEmpty();
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test143");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) (short) 0);
        boolean boolean2 = queueAr1.isEmpty();
        queueAr1.makeEmpty();
        DataStructures.QueueAr queueAr5 = new DataStructures.QueueAr((int) '#');
        queueAr5.makeEmpty();
        java.lang.Object obj7 = new java.lang.Object();
        queueAr5.enqueue(obj7);
        java.lang.Object obj9 = null;
        queueAr5.enqueue(obj9);
        boolean boolean11 = queueAr5.isEmpty();
        java.lang.Object obj12 = queueAr5.getFront();
        // The following exception was thrown during execution in test generation
        try {
            queueAr1.enqueue(obj12);
            org.junit.Assert.fail("Expected exception of type DataStructures.Overflow; message: null");
        } catch (DataStructures.Overflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test144");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) '#');
        boolean boolean2 = queueAr1.isEmpty();
        queueAr1.enqueue((java.lang.Object) 2);
        boolean boolean5 = queueAr1.isFull();
        boolean boolean6 = queueAr1.isFull();
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test145");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) '#');
        queueAr1.makeEmpty();
        queueAr1.dequeueAll();
        boolean boolean4 = queueAr1.isFull();
        queueAr1.enqueue((java.lang.Object) 1L);
        queueAr1.makeEmpty();
        queueAr1.makeEmpty();
        queueAr1.dequeueAll();
        boolean boolean10 = queueAr1.isFull();
        java.lang.Object obj11 = queueAr1.getFront();
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test146");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(4);
        boolean boolean2 = queueAr1.isFull();
        queueAr1.makeEmpty();
        boolean boolean4 = queueAr1.isEmpty();
        DataStructures.QueueAr queueAr6 = new DataStructures.QueueAr((int) '#');
        queueAr6.makeEmpty();
        java.lang.Object obj8 = new java.lang.Object();
        queueAr6.enqueue(obj8);
        queueAr1.enqueue((java.lang.Object) queueAr6);
        DataStructures.QueueAr queueAr12 = new DataStructures.QueueAr(4);
        queueAr12.enqueue((java.lang.Object) (-10));
        boolean boolean15 = queueAr12.isEmpty();
        queueAr12.makeEmpty();
        boolean boolean17 = queueAr12.isEmpty();
        queueAr12.enqueue((java.lang.Object) 100);
        queueAr1.enqueue((java.lang.Object) 100);
        DataStructures.QueueAr queueAr22 = new DataStructures.QueueAr(4);
        queueAr22.enqueue((java.lang.Object) (-10));
        boolean boolean25 = queueAr22.isEmpty();
        java.lang.Object obj26 = queueAr22.getFront();
        queueAr1.enqueue((java.lang.Object) queueAr22);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test147");
        // The following exception was thrown during execution in test generation
        try {
            DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((-6));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        // Expected exception.
        }
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test148");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) '#');
        queueAr1.makeEmpty();
        java.lang.Object obj3 = new java.lang.Object();
        queueAr1.enqueue(obj3);
        java.lang.Object obj5 = null;
        queueAr1.enqueue(obj5);
        queueAr1.dequeueAll();
        boolean boolean8 = queueAr1.isFull();
        java.lang.Object obj9 = queueAr1.dequeue();
        java.lang.Object obj10 = null;
        queueAr1.enqueue(obj10);
        boolean boolean12 = queueAr1.isFull();
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test149");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) (short) 100);
        queueAr1.dequeueAll();
        queueAr1.dequeueAll();
        java.lang.Class<?> wildcardClass4 = queueAr1.getClass();
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test150");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(4);
        queueAr1.enqueue((java.lang.Object) (-10));
        java.lang.Object obj4 = queueAr1.getFront();
        queueAr1.makeEmpty();
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test151");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(4);
        queueAr1.enqueue((java.lang.Object) (-10));
        queueAr1.makeEmpty();
        boolean boolean5 = queueAr1.isFull();
        queueAr1.dequeueAll();
        queueAr1.dequeueAll();
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test152");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) '#');
        queueAr1.makeEmpty();
        queueAr1.dequeueAll();
        boolean boolean4 = queueAr1.isFull();
        boolean boolean5 = queueAr1.isEmpty();
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test153");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(1);
        boolean boolean2 = queueAr1.isEmpty();
        DataStructures.QueueAr queueAr4 = new DataStructures.QueueAr(4);
        boolean boolean5 = queueAr4.isEmpty();
        java.lang.Object obj6 = queueAr4.dequeue();
        queueAr1.enqueue((java.lang.Object) queueAr4);
        boolean boolean8 = queueAr1.isEmpty();
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test154");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) '#');
        queueAr1.makeEmpty();
        java.lang.Object obj3 = new java.lang.Object();
        queueAr1.enqueue(obj3);
        java.lang.Object obj5 = queueAr1.getFront();
        queueAr1.enqueue((java.lang.Object) (byte) 0);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test155");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) '#');
        queueAr1.makeEmpty();
        java.lang.Object obj3 = new java.lang.Object();
        queueAr1.enqueue(obj3);
        java.lang.Object obj5 = null;
        queueAr1.enqueue(obj5);
        queueAr1.dequeueAll();
        boolean boolean8 = queueAr1.isEmpty();
        queueAr1.dequeueAll();
        queueAr1.makeEmpty();
        queueAr1.dequeueAll();
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test156");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(4);
        queueAr1.enqueue((java.lang.Object) (-10));
        boolean boolean4 = queueAr1.isEmpty();
        java.lang.Object obj5 = queueAr1.getFront();
        java.lang.Object obj6 = queueAr1.getFront();
        boolean boolean7 = queueAr1.isFull();
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test157");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) '#');
        queueAr1.makeEmpty();
        queueAr1.dequeueAll();
        boolean boolean4 = queueAr1.isFull();
        queueAr1.enqueue((java.lang.Object) 1L);
        queueAr1.makeEmpty();
        queueAr1.makeEmpty();
        queueAr1.dequeueAll();
        queueAr1.dequeueAll();
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test158");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) '#');
        boolean boolean2 = queueAr1.isEmpty();
        queueAr1.makeEmpty();
        java.lang.Object obj4 = queueAr1.dequeue();
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test159");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(4);
        queueAr1.enqueue((java.lang.Object) (-10));
        boolean boolean4 = queueAr1.isEmpty();
        boolean boolean5 = queueAr1.isFull();
        java.lang.Object obj6 = queueAr1.getFront();
        boolean boolean7 = queueAr1.isFull();
        queueAr1.makeEmpty();
        queueAr1.makeEmpty();
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test160");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(4);
        queueAr1.enqueue((java.lang.Object) (-10));
        boolean boolean4 = queueAr1.isEmpty();
        java.lang.Object obj5 = queueAr1.dequeue();
        queueAr1.makeEmpty();
        boolean boolean7 = queueAr1.isEmpty();
        queueAr1.makeEmpty();
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test161");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) 'a');
        queueAr1.dequeueAll();
        boolean boolean3 = queueAr1.isEmpty();
        queueAr1.dequeueAll();
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test162");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(4);
        queueAr1.enqueue((java.lang.Object) (-10));
        queueAr1.makeEmpty();
        java.lang.Object obj5 = queueAr1.getFront();
        boolean boolean6 = queueAr1.isFull();
        java.lang.Object obj7 = queueAr1.getFront();
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test163");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(1);
        boolean boolean2 = queueAr1.isFull();
        DataStructures.QueueAr queueAr4 = new DataStructures.QueueAr(4);
        queueAr4.enqueue((java.lang.Object) (-10));
        boolean boolean7 = queueAr4.isEmpty();
        java.lang.Object obj8 = queueAr4.getFront();
        queueAr4.makeEmpty();
        boolean boolean10 = queueAr4.isEmpty();
        DataStructures.QueueAr queueAr12 = new DataStructures.QueueAr(4);
        boolean boolean13 = queueAr12.isFull();
        java.lang.Object obj14 = queueAr12.getFront();
        java.lang.Object obj15 = queueAr12.getFront();
        java.lang.Object obj16 = queueAr12.dequeue();
        java.lang.Object obj17 = queueAr12.getFront();
        queueAr4.enqueue(obj17);
        java.lang.Object obj19 = queueAr4.dequeue();
        boolean boolean20 = queueAr4.isFull();
        queueAr1.enqueue((java.lang.Object) boolean20);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test164");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) '#');
        queueAr1.makeEmpty();
        queueAr1.dequeueAll();
        queueAr1.enqueue((java.lang.Object) (-8));
        queueAr1.makeEmpty();
        boolean boolean7 = queueAr1.isEmpty();
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test165");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(10);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test166");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) '#');
        queueAr1.makeEmpty();
        java.lang.Object obj3 = new java.lang.Object();
        queueAr1.enqueue(obj3);
        java.lang.Object obj5 = null;
        queueAr1.enqueue(obj5);
        DataStructures.QueueAr queueAr8 = new DataStructures.QueueAr((int) '#');
        queueAr8.makeEmpty();
        java.lang.Object obj10 = new java.lang.Object();
        queueAr8.enqueue(obj10);
        boolean boolean12 = queueAr8.isEmpty();
        queueAr1.enqueue((java.lang.Object) queueAr8);
        java.lang.Object obj14 = queueAr8.getFront();
        queueAr8.dequeueAll();
        java.lang.Object obj16 = queueAr8.getFront();
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test167");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) '#');
        boolean boolean2 = queueAr1.isEmpty();
        queueAr1.enqueue((java.lang.Object) 2);
        java.lang.Object obj5 = queueAr1.dequeue();
        java.lang.Object obj6 = queueAr1.getFront();
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test168");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) (byte) 1);
        boolean boolean2 = queueAr1.isFull();
        java.lang.Class<?> wildcardClass3 = queueAr1.getClass();
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test169");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) '#');
        java.lang.Object obj2 = queueAr1.dequeue();
        boolean boolean3 = queueAr1.isEmpty();
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test170");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(5);
        queueAr1.makeEmpty();
        queueAr1.makeEmpty();
        boolean boolean4 = queueAr1.isFull();
        java.lang.Object obj5 = queueAr1.getFront();
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test171");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(4);
        queueAr1.enqueue((java.lang.Object) (-10));
        boolean boolean4 = queueAr1.isEmpty();
        queueAr1.makeEmpty();
        boolean boolean6 = queueAr1.isEmpty();
        queueAr1.enqueue((java.lang.Object) 100);
        DataStructures.QueueAr queueAr10 = new DataStructures.QueueAr((int) '#');
        queueAr10.makeEmpty();
        queueAr10.dequeueAll();
        boolean boolean13 = queueAr10.isFull();
        queueAr10.enqueue((java.lang.Object) 1L);
        queueAr10.makeEmpty();
        queueAr10.makeEmpty();
        queueAr1.enqueue((java.lang.Object) queueAr10);
        boolean boolean19 = queueAr1.isFull();
        boolean boolean20 = queueAr1.isEmpty();
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test172");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) (short) 100);
        queueAr1.dequeueAll();
        queueAr1.dequeueAll();
        queueAr1.dequeueAll();
        boolean boolean5 = queueAr1.isFull();
        boolean boolean6 = queueAr1.isFull();
        boolean boolean7 = queueAr1.isEmpty();
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test173");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) '#');
        boolean boolean2 = queueAr1.isFull();
        DataStructures.QueueAr queueAr4 = new DataStructures.QueueAr((int) '#');
        queueAr4.makeEmpty();
        java.lang.Object obj6 = new java.lang.Object();
        queueAr4.enqueue(obj6);
        java.lang.Object obj8 = null;
        queueAr4.enqueue(obj8);
        DataStructures.QueueAr queueAr11 = new DataStructures.QueueAr((int) '#');
        queueAr11.makeEmpty();
        java.lang.Object obj13 = new java.lang.Object();
        queueAr11.enqueue(obj13);
        boolean boolean15 = queueAr11.isEmpty();
        queueAr4.enqueue((java.lang.Object) queueAr11);
        queueAr1.enqueue((java.lang.Object) queueAr4);
        java.lang.Object obj18 = queueAr1.dequeue();
        java.lang.Object obj19 = queueAr1.dequeue();
        queueAr1.makeEmpty();
        java.lang.Object obj21 = queueAr1.dequeue();
        boolean boolean22 = queueAr1.isFull();
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test174");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) '#');
        queueAr1.makeEmpty();
        java.lang.Object obj3 = new java.lang.Object();
        queueAr1.enqueue(obj3);
        java.lang.Object obj5 = null;
        queueAr1.enqueue(obj5);
        queueAr1.dequeueAll();
        boolean boolean8 = queueAr1.isFull();
        java.lang.Object obj9 = queueAr1.getFront();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = obj9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test175");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) (short) 0);
        boolean boolean2 = queueAr1.isEmpty();
        DataStructures.QueueAr queueAr4 = new DataStructures.QueueAr((int) '#');
        queueAr4.makeEmpty();
        java.lang.Object obj6 = new java.lang.Object();
        queueAr4.enqueue(obj6);
        java.lang.Object obj8 = null;
        queueAr4.enqueue(obj8);
        queueAr4.dequeueAll();
        boolean boolean11 = queueAr4.isFull();
        java.lang.Object obj12 = queueAr4.dequeue();
        queueAr4.enqueue((java.lang.Object) '4');
        boolean boolean15 = queueAr4.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            queueAr1.enqueue((java.lang.Object) boolean15);
            org.junit.Assert.fail("Expected exception of type DataStructures.Overflow; message: null");
        } catch (DataStructures.Overflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test176");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(4);
        queueAr1.enqueue((java.lang.Object) (-10));
        boolean boolean4 = queueAr1.isEmpty();
        queueAr1.makeEmpty();
        boolean boolean6 = queueAr1.isEmpty();
        queueAr1.enqueue((java.lang.Object) 100);
        DataStructures.QueueAr queueAr10 = new DataStructures.QueueAr((int) '#');
        queueAr10.makeEmpty();
        queueAr10.dequeueAll();
        boolean boolean13 = queueAr10.isFull();
        queueAr10.enqueue((java.lang.Object) 1L);
        queueAr10.makeEmpty();
        queueAr10.makeEmpty();
        queueAr1.enqueue((java.lang.Object) queueAr10);
        DataStructures.QueueAr queueAr20 = new DataStructures.QueueAr((int) '#');
        queueAr20.makeEmpty();
        java.lang.Object obj22 = new java.lang.Object();
        queueAr20.enqueue(obj22);
        queueAr1.enqueue(obj22);
        java.lang.Object obj25 = queueAr1.dequeue();
        java.lang.Object obj26 = queueAr1.dequeue();
        boolean boolean27 = queueAr1.isEmpty();
        boolean boolean28 = queueAr1.isFull();
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test177");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) '#');
        boolean boolean2 = queueAr1.isEmpty();
        queueAr1.enqueue((java.lang.Object) 2);
        boolean boolean5 = queueAr1.isEmpty();
        queueAr1.dequeueAll();
        DataStructures.QueueAr queueAr8 = new DataStructures.QueueAr((int) '#');
        queueAr8.makeEmpty();
        queueAr8.dequeueAll();
        boolean boolean11 = queueAr8.isFull();
        queueAr8.enqueue((java.lang.Object) 1L);
        queueAr8.makeEmpty();
        queueAr8.makeEmpty();
        queueAr1.enqueue((java.lang.Object) queueAr8);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test178");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) '#');
        boolean boolean2 = queueAr1.isFull();
        queueAr1.makeEmpty();
        queueAr1.makeEmpty();
        java.lang.Object obj5 = queueAr1.getFront();
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test179");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) '#');
        boolean boolean2 = queueAr1.isEmpty();
        queueAr1.makeEmpty();
        queueAr1.dequeueAll();
        queueAr1.makeEmpty();
        java.lang.Class<?> wildcardClass6 = queueAr1.getClass();
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test180");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) (byte) 0);
        java.lang.Class<?> wildcardClass2 = queueAr1.getClass();
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test181");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) '#');
        java.lang.Object obj2 = queueAr1.getFront();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = obj2.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test182");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) (short) 0);
        boolean boolean2 = queueAr1.isEmpty();
        java.lang.Class<?> wildcardClass3 = queueAr1.getClass();
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test183");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(8);
        java.lang.Object obj2 = queueAr1.getFront();
        java.lang.Object obj3 = queueAr1.dequeue();
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test184");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) '#');
        queueAr1.makeEmpty();
        queueAr1.dequeueAll();
        boolean boolean4 = queueAr1.isFull();
        queueAr1.enqueue((java.lang.Object) 1L);
        queueAr1.makeEmpty();
        queueAr1.makeEmpty();
        boolean boolean9 = queueAr1.isEmpty();
        DataStructures.QueueAr queueAr11 = new DataStructures.QueueAr((int) (short) 0);
        queueAr1.enqueue((java.lang.Object) (short) 0);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test185");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(4);
        queueAr1.enqueue((java.lang.Object) (-10));
        boolean boolean4 = queueAr1.isEmpty();
        java.lang.Object obj5 = queueAr1.dequeue();
        boolean boolean6 = queueAr1.isFull();
        queueAr1.makeEmpty();
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test186");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) '#');
        queueAr1.makeEmpty();
        java.lang.Object obj3 = new java.lang.Object();
        queueAr1.enqueue(obj3);
        java.lang.Object obj5 = null;
        queueAr1.enqueue(obj5);
        queueAr1.dequeueAll();
        boolean boolean8 = queueAr1.isFull();
        java.lang.Object obj9 = queueAr1.getFront();
        queueAr1.makeEmpty();
        queueAr1.dequeueAll();
        boolean boolean12 = queueAr1.isFull();
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test187");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) (short) 0);
        java.lang.Object obj2 = queueAr1.dequeue();
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test188");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(4);
        queueAr1.enqueue((java.lang.Object) (-10));
        boolean boolean4 = queueAr1.isEmpty();
        boolean boolean5 = queueAr1.isFull();
        java.lang.Object obj6 = queueAr1.getFront();
        boolean boolean7 = queueAr1.isFull();
        queueAr1.makeEmpty();
        boolean boolean9 = queueAr1.isFull();
        java.lang.Object obj10 = queueAr1.getFront();
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test189");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(0);
        queueAr1.dequeueAll();
        java.lang.Class<?> wildcardClass3 = queueAr1.getClass();
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test190");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) (short) 100);
        queueAr1.dequeueAll();
        queueAr1.makeEmpty();
        boolean boolean4 = queueAr1.isFull();
        boolean boolean5 = queueAr1.isFull();
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test191");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) '#');
        queueAr1.makeEmpty();
        java.lang.Object obj3 = new java.lang.Object();
        queueAr1.enqueue(obj3);
        java.lang.Object obj5 = null;
        queueAr1.enqueue(obj5);
        queueAr1.dequeueAll();
        boolean boolean8 = queueAr1.isFull();
        queueAr1.dequeueAll();
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test192");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) '#');
        queueAr1.makeEmpty();
        java.lang.Object obj3 = new java.lang.Object();
        queueAr1.enqueue(obj3);
        java.lang.Object obj5 = null;
        queueAr1.enqueue(obj5);
        DataStructures.QueueAr queueAr8 = new DataStructures.QueueAr((int) '#');
        queueAr8.makeEmpty();
        java.lang.Object obj10 = new java.lang.Object();
        queueAr8.enqueue(obj10);
        boolean boolean12 = queueAr8.isEmpty();
        queueAr1.enqueue((java.lang.Object) queueAr8);
        queueAr8.makeEmpty();
        java.lang.Object obj15 = queueAr8.getFront();
        queueAr8.makeEmpty();
        java.lang.Object obj17 = queueAr8.dequeue();
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test193");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) '#');
        queueAr1.makeEmpty();
        queueAr1.dequeueAll();
        boolean boolean4 = queueAr1.isFull();
        queueAr1.enqueue((java.lang.Object) 1L);
        queueAr1.makeEmpty();
        queueAr1.makeEmpty();
        queueAr1.dequeueAll();
        DataStructures.QueueAr queueAr11 = new DataStructures.QueueAr(4);
        queueAr11.enqueue((java.lang.Object) (-10));
        boolean boolean14 = queueAr11.isEmpty();
        java.lang.Object obj15 = queueAr11.getFront();
        queueAr1.enqueue(obj15);
        queueAr1.makeEmpty();
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test194");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) '#');
        queueAr1.makeEmpty();
        queueAr1.dequeueAll();
        boolean boolean4 = queueAr1.isFull();
        queueAr1.enqueue((java.lang.Object) 1L);
        queueAr1.makeEmpty();
        queueAr1.makeEmpty();
        java.lang.Object obj9 = queueAr1.dequeue();
        java.lang.Object obj10 = queueAr1.getFront();
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test195");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(4);
        java.lang.Object obj2 = queueAr1.getFront();
        DataStructures.QueueAr queueAr4 = new DataStructures.QueueAr(2);
        queueAr1.enqueue((java.lang.Object) queueAr4);
        java.lang.Class<?> wildcardClass6 = queueAr1.getClass();
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test196");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(4);
        queueAr1.enqueue((java.lang.Object) (-10));
        boolean boolean4 = queueAr1.isEmpty();
        boolean boolean5 = queueAr1.isFull();
        java.lang.Object obj6 = queueAr1.getFront();
        boolean boolean7 = queueAr1.isFull();
        queueAr1.makeEmpty();
        queueAr1.dequeueAll();
        queueAr1.dequeueAll();
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test197");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(4);
        boolean boolean2 = queueAr1.isFull();
        java.lang.Object obj3 = queueAr1.getFront();
        java.lang.Object obj4 = queueAr1.getFront();
        java.lang.Object obj5 = queueAr1.dequeue();
        java.lang.Object obj6 = queueAr1.getFront();
        boolean boolean7 = queueAr1.isFull();
        boolean boolean8 = queueAr1.isFull();
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test198");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(4);
        boolean boolean2 = queueAr1.isFull();
        queueAr1.makeEmpty();
        boolean boolean4 = queueAr1.isFull();
        DataStructures.QueueAr queueAr6 = new DataStructures.QueueAr(4);
        queueAr6.enqueue((java.lang.Object) (-10));
        boolean boolean9 = queueAr6.isEmpty();
        java.lang.Object obj10 = queueAr6.getFront();
        java.lang.Object obj11 = queueAr6.dequeue();
        queueAr1.enqueue(obj11);
        java.lang.Object obj13 = queueAr1.dequeue();
        queueAr1.dequeueAll();
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test199");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(4);
        queueAr1.enqueue((java.lang.Object) (-10));
        boolean boolean4 = queueAr1.isEmpty();
        java.lang.Object obj5 = queueAr1.dequeue();
        boolean boolean6 = queueAr1.isFull();
        java.lang.Object obj7 = queueAr1.dequeue();
        DataStructures.QueueAr queueAr9 = new DataStructures.QueueAr((int) '#');
        queueAr9.makeEmpty();
        java.lang.Object obj11 = new java.lang.Object();
        queueAr9.enqueue(obj11);
        java.lang.Object obj13 = null;
        queueAr9.enqueue(obj13);
        queueAr9.dequeueAll();
        queueAr1.enqueue((java.lang.Object) queueAr9);
        java.lang.Object obj17 = queueAr1.dequeue();
        java.lang.Object obj18 = queueAr1.getFront();
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test200");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) (short) 10);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test201");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) '#');
        queueAr1.makeEmpty();
        java.lang.Object obj3 = new java.lang.Object();
        queueAr1.enqueue(obj3);
        java.lang.Object obj5 = null;
        queueAr1.enqueue(obj5);
        queueAr1.dequeueAll();
        boolean boolean8 = queueAr1.isEmpty();
        queueAr1.dequeueAll();
        queueAr1.makeEmpty();
        DataStructures.QueueAr queueAr12 = new DataStructures.QueueAr(4);
        queueAr12.enqueue((java.lang.Object) (-10));
        boolean boolean15 = queueAr12.isEmpty();
        java.lang.Object obj16 = queueAr12.getFront();
        java.lang.Object obj17 = queueAr12.dequeue();
        java.lang.Object obj18 = queueAr12.getFront();
        DataStructures.QueueAr queueAr20 = new DataStructures.QueueAr((int) '#');
        boolean boolean21 = queueAr20.isEmpty();
        queueAr20.makeEmpty();
        queueAr12.enqueue((java.lang.Object) queueAr20);
        queueAr1.enqueue((java.lang.Object) queueAr12);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test202");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(4);
        queueAr1.enqueue((java.lang.Object) (-10));
        boolean boolean4 = queueAr1.isEmpty();
        java.lang.Object obj5 = queueAr1.getFront();
        java.lang.Object obj6 = queueAr1.dequeue();
        java.lang.Object obj7 = queueAr1.dequeue();
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test203");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(4);
        queueAr1.enqueue((java.lang.Object) (-10));
        boolean boolean4 = queueAr1.isEmpty();
        boolean boolean5 = queueAr1.isFull();
        boolean boolean6 = queueAr1.isFull();
        java.lang.Object obj7 = queueAr1.getFront();
        boolean boolean8 = queueAr1.isFull();
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test204");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) '#');
        queueAr1.makeEmpty();
        java.lang.Object obj3 = new java.lang.Object();
        queueAr1.enqueue(obj3);
        java.lang.Object obj5 = null;
        queueAr1.enqueue(obj5);
        queueAr1.dequeueAll();
        boolean boolean8 = queueAr1.isFull();
        java.lang.Object obj9 = queueAr1.dequeue();
        queueAr1.dequeueAll();
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test205");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) (short) 100);
        java.lang.Object obj2 = queueAr1.getFront();
        boolean boolean3 = queueAr1.isFull();
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test206");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(4);
        boolean boolean2 = queueAr1.isFull();
        queueAr1.makeEmpty();
        java.lang.Object obj4 = queueAr1.getFront();
        queueAr1.dequeueAll();
        java.lang.Object obj6 = queueAr1.getFront();
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test207");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) '#');
        queueAr1.makeEmpty();
        java.lang.Object obj3 = new java.lang.Object();
        queueAr1.enqueue(obj3);
        boolean boolean5 = queueAr1.isEmpty();
        queueAr1.dequeueAll();
        boolean boolean7 = queueAr1.isFull();
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test208");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) '#');
        queueAr1.makeEmpty();
        queueAr1.dequeueAll();
        boolean boolean4 = queueAr1.isFull();
        queueAr1.enqueue((java.lang.Object) 1L);
        queueAr1.makeEmpty();
        boolean boolean8 = queueAr1.isFull();
        java.lang.Object obj9 = queueAr1.dequeue();
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test209");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(4);
        queueAr1.enqueue((java.lang.Object) (-10));
        boolean boolean4 = queueAr1.isEmpty();
        java.lang.Object obj5 = queueAr1.getFront();
        DataStructures.QueueAr queueAr7 = new DataStructures.QueueAr(4);
        queueAr7.enqueue((java.lang.Object) (-10));
        boolean boolean10 = queueAr7.isEmpty();
        queueAr7.dequeueAll();
        queueAr7.dequeueAll();
        queueAr1.enqueue((java.lang.Object) queueAr7);
        java.lang.Class<?> wildcardClass14 = queueAr7.getClass();
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test210");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(4);
        queueAr1.enqueue((java.lang.Object) (-10));
        boolean boolean4 = queueAr1.isEmpty();
        boolean boolean5 = queueAr1.isFull();
        java.lang.Object obj6 = queueAr1.getFront();
        boolean boolean7 = queueAr1.isFull();
        boolean boolean8 = queueAr1.isEmpty();
        queueAr1.enqueue((java.lang.Object) (-7));
        DataStructures.QueueAr queueAr12 = new DataStructures.QueueAr(0);
        queueAr1.enqueue((java.lang.Object) 0);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test211");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) '#');
        boolean boolean2 = queueAr1.isFull();
        queueAr1.makeEmpty();
        java.lang.Object obj4 = queueAr1.getFront();
        queueAr1.dequeueAll();
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test212");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(1);
        java.lang.Object obj2 = queueAr1.dequeue();
        queueAr1.makeEmpty();
        boolean boolean4 = queueAr1.isFull();
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test213");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) '#');
        boolean boolean2 = queueAr1.isEmpty();
        java.lang.Object obj3 = queueAr1.getFront();
        java.lang.Object obj4 = null;
        queueAr1.enqueue(obj4);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test214");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(4);
        queueAr1.enqueue((java.lang.Object) (-10));
        boolean boolean4 = queueAr1.isEmpty();
        boolean boolean5 = queueAr1.isFull();
        java.lang.Object obj6 = queueAr1.getFront();
        queueAr1.dequeueAll();
        java.lang.Class<?> wildcardClass8 = queueAr1.getClass();
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test215");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(4);
        java.lang.Object obj2 = queueAr1.getFront();
        boolean boolean3 = queueAr1.isEmpty();
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test216");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) 'a');
        queueAr1.makeEmpty();
        java.lang.Object obj3 = queueAr1.dequeue();
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test217");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(4);
        boolean boolean2 = queueAr1.isFull();
        queueAr1.makeEmpty();
        java.lang.Object obj4 = queueAr1.getFront();
        boolean boolean5 = queueAr1.isFull();
        java.lang.Object obj6 = queueAr1.dequeue();
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test218");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) (short) 100);
        queueAr1.dequeueAll();
        queueAr1.makeEmpty();
        boolean boolean4 = queueAr1.isFull();
        queueAr1.makeEmpty();
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test219");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(4);
        boolean boolean2 = queueAr1.isFull();
        queueAr1.makeEmpty();
        java.lang.Object obj4 = queueAr1.dequeue();
        java.lang.Object obj5 = queueAr1.getFront();
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test220");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) '#');
        boolean boolean2 = queueAr1.isFull();
        DataStructures.QueueAr queueAr4 = new DataStructures.QueueAr((int) '#');
        queueAr4.makeEmpty();
        java.lang.Object obj6 = new java.lang.Object();
        queueAr4.enqueue(obj6);
        java.lang.Object obj8 = null;
        queueAr4.enqueue(obj8);
        DataStructures.QueueAr queueAr11 = new DataStructures.QueueAr((int) '#');
        queueAr11.makeEmpty();
        java.lang.Object obj13 = new java.lang.Object();
        queueAr11.enqueue(obj13);
        boolean boolean15 = queueAr11.isEmpty();
        queueAr4.enqueue((java.lang.Object) queueAr11);
        queueAr1.enqueue((java.lang.Object) queueAr4);
        boolean boolean18 = queueAr1.isEmpty();
        queueAr1.makeEmpty();
        queueAr1.makeEmpty();
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test221");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) '#');
        queueAr1.makeEmpty();
        java.lang.Object obj3 = new java.lang.Object();
        queueAr1.enqueue(obj3);
        boolean boolean5 = queueAr1.isEmpty();
        boolean boolean6 = queueAr1.isEmpty();
        boolean boolean7 = queueAr1.isFull();
        queueAr1.dequeueAll();
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test222");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(4);
        queueAr1.enqueue((java.lang.Object) (-10));
        boolean boolean4 = queueAr1.isEmpty();
        java.lang.Object obj5 = queueAr1.dequeue();
        boolean boolean6 = queueAr1.isFull();
        java.lang.Object obj7 = queueAr1.dequeue();
        queueAr1.dequeueAll();
        queueAr1.makeEmpty();
        boolean boolean10 = queueAr1.isFull();
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test223");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(4);
        boolean boolean2 = queueAr1.isFull();
        queueAr1.makeEmpty();
        boolean boolean4 = queueAr1.isEmpty();
        DataStructures.QueueAr queueAr6 = new DataStructures.QueueAr((int) '#');
        queueAr6.makeEmpty();
        java.lang.Object obj8 = new java.lang.Object();
        queueAr6.enqueue(obj8);
        queueAr1.enqueue((java.lang.Object) queueAr6);
        boolean boolean11 = queueAr1.isEmpty();
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test224");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(4);
        DataStructures.QueueAr queueAr3 = new DataStructures.QueueAr((int) '#');
        queueAr3.makeEmpty();
        queueAr3.dequeueAll();
        boolean boolean6 = queueAr3.isFull();
        queueAr3.enqueue((java.lang.Object) 1L);
        queueAr3.makeEmpty();
        queueAr3.makeEmpty();
        queueAr1.enqueue((java.lang.Object) queueAr3);
        boolean boolean12 = queueAr1.isFull();
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test225");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(4);
        boolean boolean2 = queueAr1.isFull();
        queueAr1.makeEmpty();
        boolean boolean4 = queueAr1.isEmpty();
        DataStructures.QueueAr queueAr6 = new DataStructures.QueueAr(1);
        java.lang.Object obj7 = queueAr6.dequeue();
        queueAr1.enqueue(obj7);
        boolean boolean9 = queueAr1.isEmpty();
        queueAr1.dequeueAll();
        DataStructures.QueueAr queueAr12 = new DataStructures.QueueAr((int) '#');
        queueAr12.makeEmpty();
        java.lang.Object obj14 = new java.lang.Object();
        queueAr12.enqueue(obj14);
        java.lang.Object obj16 = null;
        queueAr12.enqueue(obj16);
        boolean boolean18 = queueAr12.isEmpty();
        java.lang.Object obj19 = queueAr12.dequeue();
        java.lang.Object obj20 = queueAr12.getFront();
        queueAr1.enqueue((java.lang.Object) queueAr12);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test226");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(4);
        boolean boolean2 = queueAr1.isFull();
        java.lang.Object obj3 = queueAr1.getFront();
        java.lang.Object obj4 = queueAr1.getFront();
        java.lang.Object obj5 = queueAr1.dequeue();
        queueAr1.makeEmpty();
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test227");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) '#');
        queueAr1.makeEmpty();
        queueAr1.dequeueAll();
        boolean boolean4 = queueAr1.isEmpty();
        DataStructures.QueueAr queueAr6 = new DataStructures.QueueAr((int) (short) 0);
        boolean boolean7 = queueAr6.isEmpty();
        queueAr1.enqueue((java.lang.Object) queueAr6);
        java.lang.Class<?> wildcardClass9 = queueAr6.getClass();
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test228");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(4);
        java.lang.Object obj2 = queueAr1.getFront();
        boolean boolean3 = queueAr1.isFull();
        queueAr1.makeEmpty();
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test229");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) '#');
        boolean boolean2 = queueAr1.isEmpty();
        java.lang.Object obj3 = queueAr1.getFront();
        DataStructures.QueueAr queueAr5 = new DataStructures.QueueAr((int) '#');
        queueAr5.makeEmpty();
        queueAr5.dequeueAll();
        boolean boolean8 = queueAr5.isFull();
        queueAr1.enqueue((java.lang.Object) boolean8);
        java.lang.Object obj10 = queueAr1.getFront();
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test230");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(4);
        queueAr1.enqueue((java.lang.Object) (-10));
        boolean boolean4 = queueAr1.isEmpty();
        queueAr1.dequeueAll();
        DataStructures.QueueAr queueAr7 = new DataStructures.QueueAr(4);
        boolean boolean8 = queueAr7.isFull();
        java.lang.Object obj9 = queueAr7.getFront();
        java.lang.Object obj10 = queueAr7.getFront();
        queueAr1.enqueue((java.lang.Object) queueAr7);
        java.lang.Object obj12 = queueAr7.getFront();
        DataStructures.QueueAr queueAr14 = new DataStructures.QueueAr(5);
        queueAr14.makeEmpty();
        queueAr14.makeEmpty();
        boolean boolean17 = queueAr14.isFull();
        queueAr7.enqueue((java.lang.Object) queueAr14);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test231");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(4);
        boolean boolean2 = queueAr1.isFull();
        java.lang.Object obj3 = queueAr1.getFront();
        queueAr1.dequeueAll();
        queueAr1.dequeueAll();
        boolean boolean6 = queueAr1.isFull();
        queueAr1.dequeueAll();
        queueAr1.makeEmpty();
        java.lang.Class<?> wildcardClass9 = queueAr1.getClass();
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test232");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(1);
        boolean boolean2 = queueAr1.isFull();
        boolean boolean3 = queueAr1.isEmpty();
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test233");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(4);
        queueAr1.enqueue((java.lang.Object) (-10));
        boolean boolean4 = queueAr1.isEmpty();
        boolean boolean5 = queueAr1.isFull();
        java.lang.Object obj6 = queueAr1.getFront();
        boolean boolean7 = queueAr1.isFull();
        queueAr1.makeEmpty();
        boolean boolean9 = queueAr1.isEmpty();
        DataStructures.QueueAr queueAr11 = new DataStructures.QueueAr(4);
        boolean boolean12 = queueAr11.isFull();
        queueAr11.makeEmpty();
        boolean boolean14 = queueAr11.isEmpty();
        DataStructures.QueueAr queueAr16 = new DataStructures.QueueAr(1);
        java.lang.Object obj17 = queueAr16.dequeue();
        queueAr11.enqueue(obj17);
        boolean boolean19 = queueAr11.isEmpty();
        queueAr11.makeEmpty();
        java.lang.Object obj21 = queueAr11.getFront();
        queueAr1.enqueue(obj21);
        java.lang.Object obj23 = queueAr1.getFront();
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test234");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(4);
        queueAr1.enqueue((java.lang.Object) (-10));
        boolean boolean4 = queueAr1.isEmpty();
        queueAr1.makeEmpty();
        boolean boolean6 = queueAr1.isEmpty();
        queueAr1.enqueue((java.lang.Object) 100);
        DataStructures.QueueAr queueAr10 = new DataStructures.QueueAr((int) '#');
        queueAr10.makeEmpty();
        queueAr10.dequeueAll();
        boolean boolean13 = queueAr10.isFull();
        queueAr10.enqueue((java.lang.Object) 1L);
        queueAr10.makeEmpty();
        queueAr10.makeEmpty();
        queueAr1.enqueue((java.lang.Object) queueAr10);
        java.lang.Object obj19 = queueAr10.dequeue();
        queueAr10.dequeueAll();
        java.lang.Object obj21 = queueAr10.getFront();
        DataStructures.QueueAr queueAr23 = new DataStructures.QueueAr(4);
        queueAr23.enqueue((java.lang.Object) (-10));
        boolean boolean26 = queueAr23.isEmpty();
        java.lang.Object obj27 = queueAr23.dequeue();
        boolean boolean28 = queueAr23.isFull();
        java.lang.Object obj29 = queueAr23.dequeue();
        queueAr10.enqueue((java.lang.Object) queueAr23);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test235");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) '#');
        boolean boolean2 = queueAr1.isEmpty();
        queueAr1.enqueue((java.lang.Object) 2);
        boolean boolean5 = queueAr1.isEmpty();
        queueAr1.makeEmpty();
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test236");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(4);
        boolean boolean2 = queueAr1.isFull();
        queueAr1.makeEmpty();
        boolean boolean4 = queueAr1.isFull();
        DataStructures.QueueAr queueAr6 = new DataStructures.QueueAr(4);
        queueAr6.enqueue((java.lang.Object) (-10));
        boolean boolean9 = queueAr6.isEmpty();
        java.lang.Object obj10 = queueAr6.getFront();
        java.lang.Object obj11 = queueAr6.dequeue();
        queueAr1.enqueue(obj11);
        java.lang.Object obj13 = queueAr1.dequeue();
        java.lang.Object obj14 = queueAr1.dequeue();
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test237");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(4);
        java.lang.Object obj2 = queueAr1.getFront();
        java.lang.Object obj3 = queueAr1.dequeue();
        java.lang.Object obj4 = queueAr1.getFront();
        queueAr1.makeEmpty();
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test238");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) 'a');
        queueAr1.makeEmpty();
        boolean boolean3 = queueAr1.isFull();
        queueAr1.dequeueAll();
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test239");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) '#');
        java.lang.Object obj2 = queueAr1.dequeue();
        java.lang.Object obj3 = queueAr1.dequeue();
        java.lang.Class<?> wildcardClass4 = queueAr1.getClass();
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test240");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) '#');
        java.lang.Object obj2 = queueAr1.dequeue();
        java.lang.Object obj3 = queueAr1.dequeue();
        queueAr1.dequeueAll();
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "QueueArTester0.test241");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) (byte) 1);
        queueAr1.dequeueAll();
        java.lang.Object obj3 = queueAr1.dequeue();
    }
}

