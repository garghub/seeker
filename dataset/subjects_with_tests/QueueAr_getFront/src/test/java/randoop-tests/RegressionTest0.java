import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(0);
        java.lang.Object obj2 = queueAr1.dequeue();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = obj2.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(0);
        java.lang.Object obj2 = queueAr1.dequeue();
        queueAr1.makeEmpty();
        queueAr1.dequeueAll();
        java.lang.Object obj5 = queueAr1.getFront();
        // The following exception was thrown during execution in test generation
        try {
            queueAr1.enqueue((java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type DataStructures.Overflow; message: null");
        } catch (DataStructures.Overflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(0);
        java.lang.Object obj2 = queueAr1.dequeue();
        queueAr1.makeEmpty();
        queueAr1.dequeueAll();
        java.lang.Object obj5 = queueAr1.getFront();
        boolean boolean6 = queueAr1.isEmpty();
        queueAr1.dequeueAll();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(0);
        java.lang.Object obj2 = queueAr1.dequeue();
        queueAr1.makeEmpty();
        queueAr1.dequeueAll();
        // The following exception was thrown during execution in test generation
        try {
            queueAr1.enqueue((java.lang.Object) 100.0f);
            org.junit.Assert.fail("Expected exception of type DataStructures.Overflow; message: null");
        } catch (DataStructures.Overflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(0);
        boolean boolean2 = queueAr1.isEmpty();
        queueAr1.makeEmpty();
        boolean boolean4 = queueAr1.isFull();
        java.lang.Object obj5 = null;
        // The following exception was thrown during execution in test generation
        try {
            queueAr1.enqueue(obj5);
            org.junit.Assert.fail("Expected exception of type DataStructures.Overflow; message: null");
        } catch (DataStructures.Overflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(0);
        java.lang.Object obj2 = queueAr1.dequeue();
        queueAr1.makeEmpty();
        boolean boolean4 = queueAr1.isEmpty();
        boolean boolean5 = queueAr1.isFull();
        DataStructures.QueueAr queueAr7 = new DataStructures.QueueAr(0);
        java.lang.Object obj8 = queueAr7.dequeue();
        queueAr7.makeEmpty();
        boolean boolean10 = queueAr7.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            queueAr1.enqueue((java.lang.Object) boolean10);
            org.junit.Assert.fail("Expected exception of type DataStructures.Overflow; message: null");
        } catch (DataStructures.Overflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(0);
        java.lang.Object obj2 = queueAr1.dequeue();
        queueAr1.makeEmpty();
        queueAr1.makeEmpty();
        java.lang.Class<?> wildcardClass5 = queueAr1.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(0);
        boolean boolean2 = queueAr1.isEmpty();
        queueAr1.makeEmpty();
        java.lang.Class<?> wildcardClass4 = queueAr1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(0);
        java.lang.Object obj2 = queueAr1.dequeue();
        queueAr1.makeEmpty();
        boolean boolean4 = queueAr1.isEmpty();
        boolean boolean5 = queueAr1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            queueAr1.enqueue((java.lang.Object) (byte) -1);
            org.junit.Assert.fail("Expected exception of type DataStructures.Overflow; message: null");
        } catch (DataStructures.Overflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(0);
        boolean boolean2 = queueAr1.isEmpty();
        DataStructures.QueueAr queueAr4 = new DataStructures.QueueAr(0);
        boolean boolean5 = queueAr4.isEmpty();
        queueAr4.makeEmpty();
        boolean boolean7 = queueAr4.isFull();
        java.lang.Object obj8 = queueAr4.getFront();
        queueAr4.makeEmpty();
        queueAr4.makeEmpty();
        // The following exception was thrown during execution in test generation
        try {
            queueAr1.enqueue((java.lang.Object) queueAr4);
            org.junit.Assert.fail("Expected exception of type DataStructures.Overflow; message: null");
        } catch (DataStructures.Overflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        // The following exception was thrown during execution in test generation
        try {
            DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(0);
        boolean boolean2 = queueAr1.isEmpty();
        queueAr1.makeEmpty();
        boolean boolean4 = queueAr1.isFull();
        java.lang.Object obj5 = queueAr1.getFront();
        queueAr1.makeEmpty();
        DataStructures.QueueAr queueAr8 = new DataStructures.QueueAr(0);
        boolean boolean9 = queueAr8.isEmpty();
        queueAr8.makeEmpty();
        boolean boolean11 = queueAr8.isFull();
        java.lang.Object obj12 = queueAr8.getFront();
        // The following exception was thrown during execution in test generation
        try {
            queueAr1.enqueue((java.lang.Object) queueAr8);
            org.junit.Assert.fail("Expected exception of type DataStructures.Overflow; message: null");
        } catch (DataStructures.Overflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(0);
        java.lang.Object obj2 = queueAr1.dequeue();
        queueAr1.makeEmpty();
        queueAr1.dequeueAll();
        java.lang.Object obj5 = queueAr1.getFront();
        java.lang.Object obj6 = queueAr1.getFront();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(0);
        boolean boolean2 = queueAr1.isEmpty();
        queueAr1.makeEmpty();
        boolean boolean4 = queueAr1.isFull();
        java.lang.Object obj5 = queueAr1.getFront();
        queueAr1.makeEmpty();
        boolean boolean7 = queueAr1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) (byte) 1);
        boolean boolean2 = queueAr1.isEmpty();
        java.lang.Object obj3 = queueAr1.dequeue();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj3);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(0);
        java.lang.Object obj2 = queueAr1.dequeue();
        queueAr1.makeEmpty();
        boolean boolean4 = queueAr1.isEmpty();
        boolean boolean5 = queueAr1.isFull();
        queueAr1.makeEmpty();
        java.lang.Object obj7 = queueAr1.getFront();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(0);
        boolean boolean2 = queueAr1.isEmpty();
        queueAr1.makeEmpty();
        boolean boolean4 = queueAr1.isFull();
        queueAr1.dequeueAll();
        queueAr1.makeEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) ' ');
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(0);
        boolean boolean2 = queueAr1.isEmpty();
        queueAr1.makeEmpty();
        boolean boolean4 = queueAr1.isFull();
        java.lang.Object obj5 = queueAr1.getFront();
        queueAr1.makeEmpty();
        queueAr1.makeEmpty();
        java.lang.Class<?> wildcardClass8 = queueAr1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(0);
        java.lang.Object obj2 = queueAr1.dequeue();
        queueAr1.makeEmpty();
        queueAr1.dequeueAll();
        java.lang.Object obj5 = queueAr1.getFront();
        boolean boolean6 = queueAr1.isEmpty();
        boolean boolean7 = queueAr1.isEmpty();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(0);
        java.lang.Object obj2 = queueAr1.getFront();
        java.lang.Object obj3 = queueAr1.getFront();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(0);
        boolean boolean2 = queueAr1.isEmpty();
        queueAr1.makeEmpty();
        boolean boolean4 = queueAr1.isFull();
        java.lang.Object obj5 = queueAr1.getFront();
        queueAr1.dequeueAll();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) '#');
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(0);
        boolean boolean2 = queueAr1.isEmpty();
        queueAr1.makeEmpty();
        boolean boolean4 = queueAr1.isFull();
        java.lang.Object obj5 = queueAr1.getFront();
        boolean boolean6 = queueAr1.isEmpty();
        boolean boolean7 = queueAr1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(0);
        java.lang.Object obj2 = queueAr1.dequeue();
        queueAr1.makeEmpty();
        boolean boolean4 = queueAr1.isEmpty();
        boolean boolean5 = queueAr1.isEmpty();
        queueAr1.dequeueAll();
        DataStructures.QueueAr queueAr8 = new DataStructures.QueueAr(0);
        java.lang.Object obj9 = queueAr8.dequeue();
        queueAr8.dequeueAll();
        java.lang.Object obj11 = queueAr8.getFront();
        java.lang.Object obj12 = queueAr8.dequeue();
        // The following exception was thrown during execution in test generation
        try {
            queueAr1.enqueue((java.lang.Object) queueAr8);
            org.junit.Assert.fail("Expected exception of type DataStructures.Overflow; message: null");
        } catch (DataStructures.Overflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(0);
        boolean boolean2 = queueAr1.isEmpty();
        java.lang.Object obj3 = queueAr1.getFront();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj3);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(10);
        boolean boolean2 = queueAr1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(0);
        boolean boolean2 = queueAr1.isEmpty();
        queueAr1.makeEmpty();
        boolean boolean4 = queueAr1.isFull();
        queueAr1.dequeueAll();
        java.lang.Object obj6 = queueAr1.getFront();
        java.lang.Class<?> wildcardClass7 = queueAr1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(0);
        boolean boolean2 = queueAr1.isEmpty();
        queueAr1.makeEmpty();
        boolean boolean4 = queueAr1.isFull();
        java.lang.Object obj5 = queueAr1.getFront();
        queueAr1.makeEmpty();
        java.lang.Object obj7 = queueAr1.getFront();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(0);
        java.lang.Object obj2 = queueAr1.dequeue();
        queueAr1.makeEmpty();
        queueAr1.dequeueAll();
        queueAr1.makeEmpty();
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) (short) 0);
        boolean boolean2 = queueAr1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(0);
        java.lang.Object obj2 = queueAr1.dequeue();
        queueAr1.makeEmpty();
        boolean boolean4 = queueAr1.isEmpty();
        boolean boolean5 = queueAr1.isFull();
        queueAr1.makeEmpty();
        boolean boolean7 = queueAr1.isEmpty();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(0);
        boolean boolean2 = queueAr1.isEmpty();
        queueAr1.makeEmpty();
        boolean boolean4 = queueAr1.isFull();
        queueAr1.dequeueAll();
        java.lang.Object obj6 = queueAr1.getFront();
        boolean boolean7 = queueAr1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(0);
        java.lang.Object obj2 = queueAr1.dequeue();
        queueAr1.makeEmpty();
        queueAr1.makeEmpty();
        java.lang.Object obj5 = queueAr1.dequeue();
        boolean boolean6 = queueAr1.isEmpty();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) (byte) 1);
        java.lang.Object obj2 = queueAr1.getFront();
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((int) (byte) 10);
        java.lang.Object obj2 = null;
        queueAr1.enqueue(obj2);
        queueAr1.dequeueAll();
        DataStructures.QueueAr queueAr6 = new DataStructures.QueueAr(0);
        java.lang.Object obj7 = queueAr6.dequeue();
        queueAr1.enqueue(obj7);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(0);
        java.lang.Object obj2 = queueAr1.dequeue();
        queueAr1.dequeueAll();
        java.lang.Object obj4 = queueAr1.getFront();
        // The following exception was thrown during execution in test generation
        try {
            queueAr1.enqueue((java.lang.Object) 0.0d);
            org.junit.Assert.fail("Expected exception of type DataStructures.Overflow; message: null");
        } catch (DataStructures.Overflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(0);
        java.lang.Object obj2 = queueAr1.dequeue();
        queueAr1.makeEmpty();
        boolean boolean4 = queueAr1.isEmpty();
        queueAr1.makeEmpty();
        boolean boolean6 = queueAr1.isFull();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(0);
        queueAr1.dequeueAll();
        java.lang.Object obj3 = queueAr1.dequeue();
        org.junit.Assert.assertNull(obj3);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(0);
        java.lang.Object obj2 = queueAr1.dequeue();
        queueAr1.makeEmpty();
        queueAr1.makeEmpty();
        boolean boolean5 = queueAr1.isEmpty();
        queueAr1.makeEmpty();
        java.lang.Object obj7 = queueAr1.dequeue();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(10);
        boolean boolean2 = queueAr1.isEmpty();
        java.lang.Class<?> wildcardClass3 = queueAr1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(0);
        boolean boolean2 = queueAr1.isEmpty();
        java.lang.Object obj3 = queueAr1.dequeue();
        java.lang.Object obj4 = queueAr1.getFront();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr(0);
        java.lang.Object obj2 = queueAr1.dequeue();
        queueAr1.makeEmpty();
        queueAr1.dequeueAll();
        java.lang.Object obj5 = queueAr1.getFront();
        boolean boolean6 = queueAr1.isEmpty();
        java.lang.Object obj7 = queueAr1.getFront();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        // The following exception was thrown during execution in test generation
        try {
            DataStructures.QueueAr queueAr1 = new DataStructures.QueueAr((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }
}

