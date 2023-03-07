package testers;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class StackArTester0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test001");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        // The following exception was thrown during execution in test generation
        try {
            stackAr0.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test002");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        boolean boolean1 = stackAr0.isEmpty();
        boolean boolean2 = stackAr0.isFull();
        java.lang.Class<?> wildcardClass3 = stackAr0.getClass();
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test003");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        stackAr0.push((java.lang.Object) (-1L));
        java.lang.Class<?> wildcardClass3 = stackAr0.getClass();
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test004");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        stackAr0.push((java.lang.Object) (-1L));
        boolean boolean3 = stackAr0.isFull();
        stackAr0.push((java.lang.Object) 10);
        java.lang.Class<?> wildcardClass6 = stackAr0.getClass();
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test005");
        // The following exception was thrown during execution in test generation
        try {
            DataStructures.StackAr stackAr1 = new DataStructures.StackAr((-6));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        // Expected exception.
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test006");
        // The following exception was thrown during execution in test generation
        try {
            DataStructures.StackAr stackAr1 = new DataStructures.StackAr((-9));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        // Expected exception.
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test007");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        stackAr0.push((java.lang.Object) (-1L));
        boolean boolean3 = stackAr0.isFull();
        stackAr0.push((java.lang.Object) 10);
        boolean boolean6 = stackAr0.isEmpty();
        boolean boolean7 = stackAr0.isFull();
        java.lang.Class<?> wildcardClass8 = stackAr0.getClass();
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test008");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        stackAr0.push((java.lang.Object) (-1L));
        stackAr0.makeEmpty();
        java.lang.Object obj4 = stackAr0.top();
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test009");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        stackAr0.push((java.lang.Object) (-1L));
        java.lang.Object obj3 = stackAr0.top();
        java.lang.Object obj4 = null;
        stackAr0.push(obj4);
        java.lang.Class<?> wildcardClass6 = stackAr0.getClass();
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test010");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        stackAr0.push((java.lang.Object) '#');
        stackAr0.makeEmpty();
        // The following exception was thrown during execution in test generation
        try {
            stackAr0.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test011");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        stackAr0.push((java.lang.Object) (-1L));
        boolean boolean3 = stackAr0.isFull();
        stackAr0.pop();
        java.lang.Class<?> wildcardClass5 = stackAr0.getClass();
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test012");
        // The following exception was thrown during execution in test generation
        try {
            DataStructures.StackAr stackAr1 = new DataStructures.StackAr((-10));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        // Expected exception.
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test013");
        // The following exception was thrown during execution in test generation
        try {
            DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        // Expected exception.
        }
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test014");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        stackAr0.push((java.lang.Object) (-1L));
        java.lang.Object obj3 = stackAr0.top();
        stackAr0.makeEmpty();
        java.lang.Class<?> wildcardClass5 = stackAr0.getClass();
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test015");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        boolean boolean1 = stackAr0.isEmpty();
        stackAr0.push((java.lang.Object) 0.0f);
        stackAr0.pop();
        java.lang.Class<?> wildcardClass5 = stackAr0.getClass();
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test016");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test017");
        // The following exception was thrown during execution in test generation
        try {
            DataStructures.StackAr stackAr1 = new DataStructures.StackAr((-100));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        // Expected exception.
        }
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test018");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        stackAr0.push((java.lang.Object) (-1L));
        stackAr0.makeEmpty();
        java.lang.Class<?> wildcardClass4 = stackAr0.getClass();
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test019");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        boolean boolean1 = stackAr0.isEmpty();
        boolean boolean2 = stackAr0.isFull();
        boolean boolean3 = stackAr0.isFull();
        // The following exception was thrown during execution in test generation
        try {
            stackAr0.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test020");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) (short) 1);
        java.lang.Class<?> wildcardClass2 = stackAr1.getClass();
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test021");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        stackAr0.push((java.lang.Object) (-1L));
        boolean boolean3 = stackAr0.isFull();
        boolean boolean4 = stackAr0.isFull();
        stackAr0.pop();
        // The following exception was thrown during execution in test generation
        try {
            stackAr0.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test022");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) (byte) 0);
        boolean boolean2 = stackAr1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push((java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type DataStructures.Overflow; message: null");
        } catch (DataStructures.Overflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test023");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(100);
        java.lang.Class<?> wildcardClass2 = stackAr1.getClass();
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test024");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) (byte) 0);
        java.lang.Object obj2 = stackAr1.top();
        boolean boolean3 = stackAr1.isFull();
        DataStructures.StackAr stackAr4 = new DataStructures.StackAr();
        stackAr4.push((java.lang.Object) '#');
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push((java.lang.Object) stackAr4);
            org.junit.Assert.fail("Expected exception of type DataStructures.Overflow; message: null");
        } catch (DataStructures.Overflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test025");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(2);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test026");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        stackAr0.push((java.lang.Object) (-1L));
        stackAr0.makeEmpty();
        boolean boolean4 = stackAr0.isFull();
        stackAr0.makeEmpty();
        // The following exception was thrown during execution in test generation
        try {
            stackAr0.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test027");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        stackAr0.push((java.lang.Object) (-1L));
        boolean boolean3 = stackAr0.isFull();
        stackAr0.pop();
        // The following exception was thrown during execution in test generation
        try {
            stackAr0.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test028");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        boolean boolean1 = stackAr0.isEmpty();
        stackAr0.push((java.lang.Object) 0.0f);
        stackAr0.pop();
        // The following exception was thrown during execution in test generation
        try {
            stackAr0.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test029");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(5);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test030");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        stackAr0.push((java.lang.Object) (-1L));
        stackAr0.makeEmpty();
        boolean boolean4 = stackAr0.isFull();
        java.lang.Class<?> wildcardClass5 = stackAr0.getClass();
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test031");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        boolean boolean1 = stackAr0.isEmpty();
        boolean boolean2 = stackAr0.isFull();
        // The following exception was thrown during execution in test generation
        try {
            stackAr0.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test032");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) '4');
        boolean boolean2 = stackAr1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test033");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test034");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(8);
        java.lang.Class<?> wildcardClass2 = stackAr1.getClass();
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test035");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) (byte) 0);
        boolean boolean2 = stackAr1.isEmpty();
        boolean boolean3 = stackAr1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test036");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) (byte) 0);
        boolean boolean2 = stackAr1.isEmpty();
        boolean boolean3 = stackAr1.isEmpty();
        java.lang.Class<?> wildcardClass4 = stackAr1.getClass();
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test037");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        stackAr0.push((java.lang.Object) (-1L));
        java.lang.Object obj3 = stackAr0.top();
        stackAr0.makeEmpty();
        java.lang.Object obj5 = stackAr0.top();
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test038");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        boolean boolean1 = stackAr0.isEmpty();
        stackAr0.push((java.lang.Object) 0.0f);
        stackAr0.push((java.lang.Object) 9);
        java.lang.Class<?> wildcardClass6 = stackAr0.getClass();
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test039");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        stackAr0.push((java.lang.Object) (-1L));
        stackAr0.makeEmpty();
        boolean boolean4 = stackAr0.isFull();
        stackAr0.makeEmpty();
        stackAr0.makeEmpty();
        // The following exception was thrown during execution in test generation
        try {
            stackAr0.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test040");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) (byte) 0);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Class<?> wildcardClass3 = stackAr1.getClass();
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test041");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) (short) 0);
        boolean boolean2 = stackAr1.isEmpty();
        DataStructures.StackAr stackAr3 = new DataStructures.StackAr();
        stackAr3.push((java.lang.Object) (-1L));
        java.lang.Object obj6 = stackAr3.top();
        stackAr3.makeEmpty();
        stackAr3.push((java.lang.Object) 6);
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push((java.lang.Object) 6);
            org.junit.Assert.fail("Expected exception of type DataStructures.Overflow; message: null");
        } catch (DataStructures.Overflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test042");
        // The following exception was thrown during execution in test generation
        try {
            DataStructures.StackAr stackAr1 = new DataStructures.StackAr((-4));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        // Expected exception.
        }
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test043");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        stackAr0.push((java.lang.Object) (-1L));
        stackAr0.pop();
        java.lang.Class<?> wildcardClass4 = stackAr0.getClass();
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test044");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        boolean boolean1 = stackAr0.isEmpty();
        java.lang.Object obj2 = stackAr0.top();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = obj2.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test045");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(7);
        boolean boolean2 = stackAr1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test046");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) (byte) 0);
        boolean boolean2 = stackAr1.isEmpty();
        boolean boolean3 = stackAr1.isFull();
        DataStructures.StackAr stackAr5 = new DataStructures.StackAr((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push((java.lang.Object) (byte) 100);
            org.junit.Assert.fail("Expected exception of type DataStructures.Overflow; message: null");
        } catch (DataStructures.Overflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test047");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        stackAr0.push((java.lang.Object) '#');
        stackAr0.makeEmpty();
        boolean boolean4 = stackAr0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            stackAr0.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test048");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        java.lang.Object obj1 = stackAr0.top();
        boolean boolean2 = stackAr0.isEmpty();
        boolean boolean3 = stackAr0.isEmpty();
        java.lang.Class<?> wildcardClass4 = stackAr0.getClass();
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test049");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        boolean boolean1 = stackAr0.isEmpty();
        stackAr0.push((java.lang.Object) 0.0f);
        java.lang.Object obj4 = stackAr0.top();
        boolean boolean5 = stackAr0.isFull();
        stackAr0.push((java.lang.Object) '4');
        boolean boolean8 = stackAr0.isFull();
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test050");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        stackAr0.push((java.lang.Object) (-1L));
        java.lang.Object obj3 = stackAr0.top();
        boolean boolean4 = stackAr0.isFull();
        boolean boolean5 = stackAr0.isEmpty();
        java.lang.Object obj6 = stackAr0.top();
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test051");
        // The following exception was thrown during execution in test generation
        try {
            DataStructures.StackAr stackAr1 = new DataStructures.StackAr((-2));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        // Expected exception.
        }
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test052");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        boolean boolean1 = stackAr0.isEmpty();
        boolean boolean2 = stackAr0.isFull();
        java.lang.Object obj3 = stackAr0.top();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass4 = obj3.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test053");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(100);
        boolean boolean2 = stackAr1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test054");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        stackAr0.push((java.lang.Object) (-1L));
        boolean boolean3 = stackAr0.isFull();
        boolean boolean4 = stackAr0.isEmpty();
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test055");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        stackAr0.push((java.lang.Object) (-1L));
        java.lang.Object obj3 = stackAr0.top();
        stackAr0.pop();
        java.lang.Class<?> wildcardClass5 = stackAr0.getClass();
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test056");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        stackAr0.push((java.lang.Object) (-1L));
        java.lang.Object obj3 = stackAr0.top();
        stackAr0.pop();
        java.lang.Object obj5 = stackAr0.top();
        DataStructures.StackAr stackAr6 = new DataStructures.StackAr();
        stackAr6.push((java.lang.Object) (-1L));
        java.lang.Object obj9 = stackAr6.top();
        boolean boolean10 = stackAr6.isFull();
        stackAr0.push((java.lang.Object) stackAr6);
        boolean boolean12 = stackAr6.isFull();
        stackAr6.makeEmpty();
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test057");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        stackAr0.push((java.lang.Object) (-1L));
        java.lang.Object obj3 = stackAr0.top();
        java.lang.Object obj4 = null;
        stackAr0.push(obj4);
        stackAr0.pop();
        stackAr0.pop();
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test058");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) 'a');
        boolean boolean2 = stackAr1.isEmpty();
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test059");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        java.lang.Object obj1 = stackAr0.top();
        boolean boolean2 = stackAr0.isEmpty();
        boolean boolean3 = stackAr0.isEmpty();
        stackAr0.makeEmpty();
        stackAr0.makeEmpty();
        // The following exception was thrown during execution in test generation
        try {
            stackAr0.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test060");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(8);
        boolean boolean2 = stackAr1.isFull();
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test061");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        stackAr0.push((java.lang.Object) (-1L));
        java.lang.Object obj3 = stackAr0.top();
        boolean boolean4 = stackAr0.isFull();
        stackAr0.makeEmpty();
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test062");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        stackAr0.push((java.lang.Object) (-1L));
        java.lang.Object obj3 = stackAr0.top();
        stackAr0.pop();
        java.lang.Object obj5 = stackAr0.top();
        DataStructures.StackAr stackAr6 = new DataStructures.StackAr();
        stackAr6.push((java.lang.Object) (-1L));
        java.lang.Object obj9 = stackAr6.top();
        boolean boolean10 = stackAr6.isFull();
        stackAr0.push((java.lang.Object) stackAr6);
        stackAr0.pop();
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test063");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) '4');
        java.lang.Class<?> wildcardClass2 = stackAr1.getClass();
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test064");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        boolean boolean1 = stackAr0.isEmpty();
        java.lang.Object obj2 = stackAr0.top();
        // The following exception was thrown during execution in test generation
        try {
            stackAr0.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test065");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(100);
        boolean boolean2 = stackAr1.isEmpty();
        boolean boolean3 = stackAr1.isFull();
        java.lang.Class<?> wildcardClass4 = stackAr1.getClass();
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test066");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        java.lang.Object obj1 = stackAr0.top();
        stackAr0.makeEmpty();
        // The following exception was thrown during execution in test generation
        try {
            stackAr0.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test067");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        stackAr0.push((java.lang.Object) (-1L));
        java.lang.Object obj3 = stackAr0.top();
        stackAr0.makeEmpty();
        DataStructures.StackAr stackAr6 = new DataStructures.StackAr(4);
        stackAr0.push((java.lang.Object) 4);
        boolean boolean8 = stackAr0.isEmpty();
        stackAr0.makeEmpty();
        java.lang.Class<?> wildcardClass10 = stackAr0.getClass();
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test068");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        boolean boolean1 = stackAr0.isEmpty();
        stackAr0.push((java.lang.Object) 0.0f);
        stackAr0.pop();
        stackAr0.push((java.lang.Object) 1.0f);
        stackAr0.push((java.lang.Object) 2);
        boolean boolean9 = stackAr0.isEmpty();
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test069");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(100);
        boolean boolean2 = stackAr1.isFull();
        boolean boolean3 = stackAr1.isFull();
        boolean boolean4 = stackAr1.isFull();
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test070");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        stackAr0.push((java.lang.Object) (-1L));
        boolean boolean3 = stackAr0.isFull();
        DataStructures.StackAr stackAr4 = new DataStructures.StackAr();
        stackAr4.push((java.lang.Object) (-1L));
        java.lang.Object obj7 = stackAr4.top();
        java.lang.Object obj8 = null;
        stackAr4.push(obj8);
        DataStructures.StackAr stackAr10 = new DataStructures.StackAr();
        boolean boolean11 = stackAr10.isEmpty();
        boolean boolean12 = stackAr10.isFull();
        stackAr4.push((java.lang.Object) boolean12);
        stackAr4.pop();
        stackAr0.push((java.lang.Object) stackAr4);
        stackAr4.makeEmpty();
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test071");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        stackAr0.push((java.lang.Object) (-1L));
        java.lang.Object obj3 = stackAr0.top();
        stackAr0.makeEmpty();
        DataStructures.StackAr stackAr6 = new DataStructures.StackAr(4);
        stackAr0.push((java.lang.Object) 4);
        boolean boolean8 = stackAr0.isEmpty();
        boolean boolean9 = stackAr0.isFull();
        DataStructures.StackAr stackAr10 = new DataStructures.StackAr();
        stackAr10.push((java.lang.Object) (-1L));
        boolean boolean13 = stackAr10.isFull();
        stackAr0.push((java.lang.Object) boolean13);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test072");
        // The following exception was thrown during execution in test generation
        try {
            DataStructures.StackAr stackAr1 = new DataStructures.StackAr((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        // Expected exception.
        }
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test073");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) (byte) 0);
        java.lang.Object obj2 = stackAr1.top();
        boolean boolean3 = stackAr1.isFull();
        java.lang.Object obj4 = stackAr1.top();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push((java.lang.Object) (byte) 100);
            org.junit.Assert.fail("Expected exception of type DataStructures.Overflow; message: null");
        } catch (DataStructures.Overflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test074");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        stackAr0.push((java.lang.Object) (-1L));
        stackAr0.makeEmpty();
        boolean boolean4 = stackAr0.isFull();
        boolean boolean5 = stackAr0.isFull();
        stackAr0.push((java.lang.Object) (-1.0d));
        java.lang.Class<?> wildcardClass8 = stackAr0.getClass();
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test075");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        stackAr0.push((java.lang.Object) '#');
        stackAr0.makeEmpty();
        boolean boolean4 = stackAr0.isEmpty();
        java.lang.Class<?> wildcardClass5 = stackAr0.getClass();
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test076");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(3);
        boolean boolean2 = stackAr1.isFull();
        java.lang.Object obj3 = stackAr1.top();
        java.lang.Class<?> wildcardClass4 = stackAr1.getClass();
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test077");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        stackAr0.push((java.lang.Object) (-1L));
        java.lang.Object obj3 = stackAr0.top();
        java.lang.Object obj4 = stackAr0.top();
        java.lang.Object obj5 = stackAr0.top();
        boolean boolean6 = stackAr0.isEmpty();
        stackAr0.pop();
        boolean boolean8 = stackAr0.isFull();
        stackAr0.makeEmpty();
        // The following exception was thrown during execution in test generation
        try {
            stackAr0.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test078");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        stackAr0.push((java.lang.Object) (-1L));
        stackAr0.makeEmpty();
        boolean boolean4 = stackAr0.isFull();
        stackAr0.makeEmpty();
        stackAr0.makeEmpty();
        java.lang.Object obj7 = stackAr0.top();
        boolean boolean8 = stackAr0.isEmpty();
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test079");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) (byte) 0);
        boolean boolean2 = stackAr1.isEmpty();
        boolean boolean3 = stackAr1.isFull();
        java.lang.Class<?> wildcardClass4 = stackAr1.getClass();
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test080");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        stackAr0.push((java.lang.Object) (-1L));
        boolean boolean3 = stackAr0.isFull();
        stackAr0.pop();
        boolean boolean5 = stackAr0.isEmpty();
        boolean boolean6 = stackAr0.isFull();
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test081");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        java.lang.Object obj1 = stackAr0.top();
        boolean boolean2 = stackAr0.isEmpty();
        boolean boolean3 = stackAr0.isEmpty();
        stackAr0.makeEmpty();
        java.lang.Object obj5 = stackAr0.top();
        // The following exception was thrown during execution in test generation
        try {
            stackAr0.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test082");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) (byte) 0);
        boolean boolean2 = stackAr1.isEmpty();
        boolean boolean3 = stackAr1.isFull();
        boolean boolean4 = stackAr1.isFull();
        java.lang.Object obj5 = stackAr1.top();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test083");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) ' ');
        stackAr1.makeEmpty();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test084");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        stackAr0.push((java.lang.Object) (-1L));
        stackAr0.makeEmpty();
        boolean boolean4 = stackAr0.isFull();
        stackAr0.makeEmpty();
        boolean boolean6 = stackAr0.isFull();
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test085");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        stackAr0.push((java.lang.Object) (-1L));
        java.lang.Object obj3 = stackAr0.top();
        stackAr0.pop();
        stackAr0.push((java.lang.Object) 10L);
        boolean boolean7 = stackAr0.isFull();
        boolean boolean8 = stackAr0.isEmpty();
        stackAr0.pop();
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test086");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        stackAr0.push((java.lang.Object) (-1L));
        boolean boolean3 = stackAr0.isFull();
        java.lang.Object obj4 = stackAr0.top();
        boolean boolean5 = stackAr0.isEmpty();
        java.lang.Object obj6 = stackAr0.top();
        java.lang.Object obj7 = stackAr0.top();
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test087");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        stackAr0.push((java.lang.Object) (-1L));
        boolean boolean3 = stackAr0.isFull();
        stackAr0.pop();
        boolean boolean5 = stackAr0.isFull();
        boolean boolean6 = stackAr0.isFull();
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test088");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        stackAr0.push((java.lang.Object) (-1L));
        stackAr0.makeEmpty();
        boolean boolean4 = stackAr0.isFull();
        stackAr0.makeEmpty();
        stackAr0.makeEmpty();
        java.lang.Object obj7 = stackAr0.top();
        java.lang.Object obj8 = stackAr0.top();
        boolean boolean9 = stackAr0.isEmpty();
        java.lang.Class<?> wildcardClass10 = stackAr0.getClass();
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test089");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        stackAr0.push((java.lang.Object) (-1L));
        boolean boolean3 = stackAr0.isFull();
        stackAr0.push((java.lang.Object) 10);
        DataStructures.StackAr stackAr6 = new DataStructures.StackAr();
        stackAr6.push((java.lang.Object) (-1L));
        boolean boolean9 = stackAr6.isFull();
        java.lang.Object obj10 = stackAr6.top();
        boolean boolean11 = stackAr6.isEmpty();
        stackAr0.push((java.lang.Object) stackAr6);
        java.lang.Object obj13 = stackAr0.top();
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test090");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        boolean boolean2 = stackAr1.isFull();
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test091");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        boolean boolean1 = stackAr0.isEmpty();
        stackAr0.push((java.lang.Object) 0.0f);
        boolean boolean4 = stackAr0.isEmpty();
        java.lang.Object obj5 = stackAr0.top();
        boolean boolean6 = stackAr0.isFull();
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test092");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        boolean boolean1 = stackAr0.isEmpty();
        stackAr0.push((java.lang.Object) 0.0f);
        java.lang.Object obj4 = stackAr0.top();
        boolean boolean5 = stackAr0.isFull();
        stackAr0.makeEmpty();
        // The following exception was thrown during execution in test generation
        try {
            stackAr0.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test093");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        boolean boolean1 = stackAr0.isEmpty();
        stackAr0.push((java.lang.Object) 0.0f);
        boolean boolean4 = stackAr0.isEmpty();
        stackAr0.makeEmpty();
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test094");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        stackAr0.push((java.lang.Object) (-1L));
        java.lang.Object obj3 = stackAr0.top();
        java.lang.Object obj4 = stackAr0.top();
        stackAr0.push((java.lang.Object) (-6));
        java.lang.Object obj7 = stackAr0.top();
        java.lang.Class<?> wildcardClass8 = obj7.getClass();
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test095");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        boolean boolean1 = stackAr0.isEmpty();
        stackAr0.push((java.lang.Object) 0.0f);
        DataStructures.StackAr stackAr4 = new DataStructures.StackAr();
        stackAr4.push((java.lang.Object) (-1L));
        java.lang.Object obj7 = stackAr4.top();
        java.lang.Object obj8 = null;
        stackAr4.push(obj8);
        stackAr4.pop();
        java.lang.Class<?> wildcardClass11 = stackAr4.getClass();
        stackAr0.push((java.lang.Object) wildcardClass11);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test096");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(7);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test097");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(1);
        DataStructures.StackAr stackAr2 = new DataStructures.StackAr();
        java.lang.Object obj3 = stackAr2.top();
        boolean boolean4 = stackAr2.isEmpty();
        boolean boolean5 = stackAr2.isEmpty();
        stackAr2.makeEmpty();
        java.lang.Object obj7 = stackAr2.top();
        stackAr2.push((java.lang.Object) (-10));
        boolean boolean10 = stackAr2.isEmpty();
        boolean boolean11 = stackAr2.isEmpty();
        stackAr1.push((java.lang.Object) stackAr2);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test098");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        boolean boolean1 = stackAr0.isEmpty();
        java.lang.Object obj2 = stackAr0.top();
        stackAr0.makeEmpty();
        java.lang.Object obj4 = stackAr0.top();
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test099");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        boolean boolean1 = stackAr0.isEmpty();
        java.lang.Object obj2 = stackAr0.top();
        boolean boolean3 = stackAr0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            stackAr0.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test100");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        boolean boolean1 = stackAr0.isEmpty();
        stackAr0.push((java.lang.Object) 0.0f);
        java.lang.Object obj4 = stackAr0.top();
        boolean boolean5 = stackAr0.isFull();
        stackAr0.makeEmpty();
        java.lang.Class<?> wildcardClass7 = stackAr0.getClass();
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test101");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) (byte) 0);
        boolean boolean2 = stackAr1.isEmpty();
        boolean boolean3 = stackAr1.isFull();
        boolean boolean4 = stackAr1.isEmpty();
        boolean boolean5 = stackAr1.isFull();
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test102");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) ' ');
        stackAr1.makeEmpty();
        java.lang.Class<?> wildcardClass3 = stackAr1.getClass();
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test103");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) '4');
        boolean boolean2 = stackAr1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test104");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) '4');
        boolean boolean2 = stackAr1.isFull();
        DataStructures.StackAr stackAr3 = new DataStructures.StackAr();
        stackAr3.push((java.lang.Object) (-1L));
        java.lang.Object obj6 = stackAr3.top();
        stackAr3.pop();
        java.lang.Object obj8 = stackAr3.top();
        stackAr1.push((java.lang.Object) stackAr3);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test105");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        boolean boolean2 = stackAr1.isEmpty();
        stackAr1.makeEmpty();
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test106");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) ' ');
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test107");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        boolean boolean1 = stackAr0.isEmpty();
        boolean boolean2 = stackAr0.isEmpty();
        DataStructures.StackAr stackAr3 = new DataStructures.StackAr();
        boolean boolean4 = stackAr3.isEmpty();
        stackAr3.push((java.lang.Object) 0.0f);
        stackAr0.push((java.lang.Object) stackAr3);
        DataStructures.StackAr stackAr8 = new DataStructures.StackAr();
        boolean boolean9 = stackAr8.isEmpty();
        stackAr0.push((java.lang.Object) boolean9);
        boolean boolean11 = stackAr0.isEmpty();
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test108");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        stackAr0.push((java.lang.Object) (-1L));
        stackAr0.makeEmpty();
        boolean boolean4 = stackAr0.isFull();
        boolean boolean5 = stackAr0.isFull();
        stackAr0.push((java.lang.Object) (-1.0d));
        stackAr0.makeEmpty();
        java.lang.Class<?> wildcardClass9 = stackAr0.getClass();
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test109");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        stackAr0.push((java.lang.Object) (-1L));
        boolean boolean3 = stackAr0.isFull();
        java.lang.Object obj4 = stackAr0.top();
        boolean boolean5 = stackAr0.isEmpty();
        java.lang.Object obj6 = stackAr0.top();
        boolean boolean7 = stackAr0.isEmpty();
        stackAr0.pop();
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test110");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        stackAr0.push((java.lang.Object) (-1L));
        java.lang.Object obj3 = stackAr0.top();
        stackAr0.makeEmpty();
        DataStructures.StackAr stackAr6 = new DataStructures.StackAr(4);
        stackAr0.push((java.lang.Object) 4);
        boolean boolean8 = stackAr0.isEmpty();
        boolean boolean9 = stackAr0.isFull();
        boolean boolean10 = stackAr0.isEmpty();
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test111");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) (short) 100);
        java.lang.Object obj2 = stackAr1.top();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test112");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(7);
        boolean boolean2 = stackAr1.isEmpty();
        boolean boolean3 = stackAr1.isFull();
        boolean boolean4 = stackAr1.isEmpty();
        java.lang.Class<?> wildcardClass5 = stackAr1.getClass();
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test113");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        boolean boolean2 = stackAr1.isFull();
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test114");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) (short) 0);
        stackAr1.makeEmpty();
        boolean boolean3 = stackAr1.isEmpty();
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test115");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        stackAr0.push((java.lang.Object) (-1L));
        java.lang.Object obj3 = stackAr0.top();
        stackAr0.pop();
        stackAr0.push((java.lang.Object) 10L);
        boolean boolean7 = stackAr0.isFull();
        DataStructures.StackAr stackAr9 = new DataStructures.StackAr((int) (byte) 0);
        boolean boolean10 = stackAr9.isEmpty();
        boolean boolean11 = stackAr9.isEmpty();
        boolean boolean12 = stackAr9.isEmpty();
        stackAr0.push((java.lang.Object) stackAr9);
        stackAr0.makeEmpty();
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test116");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        stackAr0.push((java.lang.Object) (-1L));
        java.lang.Object obj3 = stackAr0.top();
        java.lang.Object obj4 = stackAr0.top();
        stackAr0.push((java.lang.Object) (-6));
        java.lang.Object obj7 = stackAr0.top();
        stackAr0.makeEmpty();
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test117");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) (byte) 0);
        boolean boolean2 = stackAr1.isEmpty();
        boolean boolean3 = stackAr1.isFull();
        boolean boolean4 = stackAr1.isFull();
        boolean boolean5 = stackAr1.isFull();
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test118");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) '4');
        stackAr1.push((java.lang.Object) 8);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test119");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        boolean boolean1 = stackAr0.isEmpty();
        boolean boolean2 = stackAr0.isFull();
        boolean boolean3 = stackAr0.isEmpty();
        boolean boolean4 = stackAr0.isEmpty();
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test120");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        stackAr0.push((java.lang.Object) (-1L));
        boolean boolean3 = stackAr0.isFull();
        DataStructures.StackAr stackAr4 = new DataStructures.StackAr();
        stackAr4.push((java.lang.Object) (-1L));
        java.lang.Object obj7 = stackAr4.top();
        java.lang.Object obj8 = null;
        stackAr4.push(obj8);
        DataStructures.StackAr stackAr10 = new DataStructures.StackAr();
        boolean boolean11 = stackAr10.isEmpty();
        boolean boolean12 = stackAr10.isFull();
        stackAr4.push((java.lang.Object) boolean12);
        stackAr4.pop();
        stackAr0.push((java.lang.Object) stackAr4);
        stackAr0.pop();
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test121");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        stackAr0.push((java.lang.Object) (-1L));
        java.lang.Object obj3 = stackAr0.top();
        stackAr0.pop();
        java.lang.Object obj5 = stackAr0.top();
        DataStructures.StackAr stackAr6 = new DataStructures.StackAr();
        stackAr6.push((java.lang.Object) (-1L));
        java.lang.Object obj9 = stackAr6.top();
        boolean boolean10 = stackAr6.isFull();
        stackAr0.push((java.lang.Object) stackAr6);
        java.lang.Object obj12 = stackAr0.top();
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test122");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) (byte) 0);
        java.lang.Object obj2 = stackAr1.top();
        DataStructures.StackAr stackAr3 = new DataStructures.StackAr();
        stackAr3.push((java.lang.Object) (-1L));
        boolean boolean6 = stackAr3.isFull();
        stackAr3.push((java.lang.Object) 10);
        stackAr3.push((java.lang.Object) 9);
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push((java.lang.Object) 9);
            org.junit.Assert.fail("Expected exception of type DataStructures.Overflow; message: null");
        } catch (DataStructures.Overflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test123");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        stackAr0.push((java.lang.Object) (-1L));
        boolean boolean3 = stackAr0.isFull();
        stackAr0.pop();
        stackAr0.makeEmpty();
        java.lang.Object obj6 = stackAr0.top();
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test124");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        stackAr0.push((java.lang.Object) (-1L));
        java.lang.Object obj3 = stackAr0.top();
        stackAr0.pop();
        java.lang.Object obj5 = stackAr0.top();
        DataStructures.StackAr stackAr6 = new DataStructures.StackAr();
        stackAr6.push((java.lang.Object) (-1L));
        java.lang.Object obj9 = stackAr6.top();
        boolean boolean10 = stackAr6.isFull();
        stackAr0.push((java.lang.Object) stackAr6);
        java.lang.Class<?> wildcardClass12 = stackAr0.getClass();
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test125");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test126");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        boolean boolean1 = stackAr0.isEmpty();
        stackAr0.push((java.lang.Object) 0.0f);
        stackAr0.pop();
        stackAr0.push((java.lang.Object) 1.0f);
        stackAr0.pop();
        DataStructures.StackAr stackAr8 = new DataStructures.StackAr();
        stackAr8.push((java.lang.Object) (-1L));
        java.lang.Object obj11 = stackAr8.top();
        java.lang.Object obj12 = stackAr8.top();
        stackAr0.push(obj12);
        DataStructures.StackAr stackAr14 = new DataStructures.StackAr();
        stackAr14.push((java.lang.Object) (-1L));
        boolean boolean17 = stackAr14.isFull();
        stackAr14.pop();
        boolean boolean19 = stackAr14.isEmpty();
        stackAr0.push((java.lang.Object) stackAr14);
        boolean boolean21 = stackAr0.isFull();
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test127");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(8);
        stackAr1.makeEmpty();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test128");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) 'a');
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test129");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) (byte) 0);
        boolean boolean2 = stackAr1.isEmpty();
        boolean boolean3 = stackAr1.isFull();
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test130");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        boolean boolean1 = stackAr0.isEmpty();
        stackAr0.push((java.lang.Object) 0.0f);
        stackAr0.pop();
        boolean boolean5 = stackAr0.isEmpty();
        DataStructures.StackAr stackAr6 = new DataStructures.StackAr();
        boolean boolean7 = stackAr6.isEmpty();
        boolean boolean8 = stackAr6.isFull();
        java.lang.Object obj9 = stackAr6.top();
        java.lang.Class<?> wildcardClass10 = stackAr6.getClass();
        stackAr0.push((java.lang.Object) wildcardClass10);
        boolean boolean12 = stackAr0.isFull();
        stackAr0.makeEmpty();
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test131");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(100);
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test132");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        boolean boolean1 = stackAr0.isEmpty();
        boolean boolean2 = stackAr0.isFull();
        boolean boolean3 = stackAr0.isEmpty();
        stackAr0.makeEmpty();
        // The following exception was thrown during execution in test generation
        try {
            stackAr0.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test133");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        boolean boolean1 = stackAr0.isEmpty();
        stackAr0.push((java.lang.Object) 0.0f);
        java.lang.Object obj4 = stackAr0.top();
        boolean boolean5 = stackAr0.isEmpty();
        stackAr0.pop();
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test134");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        boolean boolean1 = stackAr0.isEmpty();
        stackAr0.push((java.lang.Object) 0.0f);
        stackAr0.pop();
        stackAr0.push((java.lang.Object) 1.0f);
        boolean boolean7 = stackAr0.isEmpty();
        java.lang.Class<?> wildcardClass8 = stackAr0.getClass();
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test135");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        stackAr0.push((java.lang.Object) (-1L));
        stackAr0.makeEmpty();
        boolean boolean4 = stackAr0.isFull();
        boolean boolean5 = stackAr0.isFull();
        stackAr0.push((java.lang.Object) (-1.0d));
        stackAr0.makeEmpty();
        // The following exception was thrown during execution in test generation
        try {
            stackAr0.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test136");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        stackAr0.push((java.lang.Object) (-1L));
        java.lang.Object obj3 = stackAr0.top();
        stackAr0.pop();
        stackAr0.push((java.lang.Object) 10L);
        boolean boolean7 = stackAr0.isFull();
        DataStructures.StackAr stackAr9 = new DataStructures.StackAr((int) (byte) 0);
        boolean boolean10 = stackAr9.isEmpty();
        boolean boolean11 = stackAr9.isEmpty();
        boolean boolean12 = stackAr9.isEmpty();
        stackAr0.push((java.lang.Object) stackAr9);
        // The following exception was thrown during execution in test generation
        try {
            stackAr9.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test137");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        stackAr0.push((java.lang.Object) (-1L));
        java.lang.Object obj3 = stackAr0.top();
        java.lang.Object obj4 = null;
        stackAr0.push(obj4);
        boolean boolean6 = stackAr0.isFull();
        DataStructures.StackAr stackAr7 = new DataStructures.StackAr();
        boolean boolean8 = stackAr7.isEmpty();
        boolean boolean9 = stackAr7.isFull();
        boolean boolean10 = stackAr7.isEmpty();
        stackAr0.push((java.lang.Object) stackAr7);
        java.lang.Object obj12 = stackAr7.top();
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test138");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        boolean boolean1 = stackAr0.isEmpty();
        stackAr0.push((java.lang.Object) 0.0f);
        java.lang.Object obj4 = stackAr0.top();
        DataStructures.StackAr stackAr5 = new DataStructures.StackAr();
        stackAr5.push((java.lang.Object) (-1L));
        java.lang.Object obj8 = stackAr5.top();
        boolean boolean9 = stackAr5.isFull();
        stackAr5.push((java.lang.Object) 1.0d);
        stackAr0.push((java.lang.Object) stackAr5);
        java.lang.Object obj13 = stackAr0.top();
        java.lang.Class<?> wildcardClass14 = stackAr0.getClass();
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test139");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        boolean boolean1 = stackAr0.isEmpty();
        stackAr0.push((java.lang.Object) 0.0f);
        boolean boolean4 = stackAr0.isEmpty();
        boolean boolean5 = stackAr0.isEmpty();
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test140");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        java.lang.Object obj1 = stackAr0.top();
        boolean boolean2 = stackAr0.isEmpty();
        boolean boolean3 = stackAr0.isEmpty();
        stackAr0.makeEmpty();
        java.lang.Object obj5 = stackAr0.top();
        java.lang.Object obj6 = stackAr0.top();
        stackAr0.makeEmpty();
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test141");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) (byte) 0);
        boolean boolean2 = stackAr1.isEmpty();
        boolean boolean3 = stackAr1.isFull();
        boolean boolean4 = stackAr1.isFull();
        java.lang.Class<?> wildcardClass5 = stackAr1.getClass();
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test142");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        stackAr0.push((java.lang.Object) (-1L));
        java.lang.Object obj3 = stackAr0.top();
        java.lang.Object obj4 = null;
        stackAr0.push(obj4);
        boolean boolean6 = stackAr0.isFull();
        DataStructures.StackAr stackAr7 = new DataStructures.StackAr();
        boolean boolean8 = stackAr7.isEmpty();
        boolean boolean9 = stackAr7.isFull();
        boolean boolean10 = stackAr7.isEmpty();
        stackAr0.push((java.lang.Object) stackAr7);
        DataStructures.StackAr stackAr12 = new DataStructures.StackAr();
        stackAr12.push((java.lang.Object) (-1L));
        stackAr12.makeEmpty();
        boolean boolean16 = stackAr12.isFull();
        boolean boolean17 = stackAr12.isFull();
        stackAr12.push((java.lang.Object) (-1.0d));
        stackAr12.makeEmpty();
        stackAr0.push((java.lang.Object) stackAr12);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test143");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        boolean boolean1 = stackAr0.isEmpty();
        boolean boolean2 = stackAr0.isEmpty();
        stackAr0.makeEmpty();
        stackAr0.makeEmpty();
        boolean boolean5 = stackAr0.isEmpty();
        DataStructures.StackAr stackAr6 = new DataStructures.StackAr();
        boolean boolean7 = stackAr6.isEmpty();
        stackAr6.push((java.lang.Object) 0.0f);
        stackAr6.push((java.lang.Object) 9);
        stackAr0.push((java.lang.Object) stackAr6);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test144");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(1);
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test145");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(6);
        boolean boolean2 = stackAr1.isEmpty();
        boolean boolean3 = stackAr1.isFull();
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test146");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        boolean boolean1 = stackAr0.isEmpty();
        boolean boolean2 = stackAr0.isEmpty();
        stackAr0.makeEmpty();
        stackAr0.makeEmpty();
        stackAr0.makeEmpty();
        java.lang.Object obj6 = stackAr0.top();
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test147");
        // The following exception was thrown during execution in test generation
        try {
            DataStructures.StackAr stackAr1 = new DataStructures.StackAr((-8));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        // Expected exception.
        }
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test148");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test149");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        java.lang.Object obj1 = stackAr0.top();
        boolean boolean2 = stackAr0.isEmpty();
        boolean boolean3 = stackAr0.isEmpty();
        stackAr0.makeEmpty();
        java.lang.Object obj5 = stackAr0.top();
        stackAr0.push((java.lang.Object) (-10));
        boolean boolean8 = stackAr0.isEmpty();
        DataStructures.StackAr stackAr9 = new DataStructures.StackAr();
        stackAr9.push((java.lang.Object) (-1L));
        java.lang.Object obj12 = stackAr9.top();
        boolean boolean13 = stackAr9.isFull();
        boolean boolean14 = stackAr9.isEmpty();
        stackAr0.push((java.lang.Object) boolean14);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test150");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        boolean boolean1 = stackAr0.isEmpty();
        stackAr0.push((java.lang.Object) 0.0f);
        stackAr0.pop();
        stackAr0.push((java.lang.Object) 1.0f);
        stackAr0.pop();
        DataStructures.StackAr stackAr8 = new DataStructures.StackAr();
        stackAr8.push((java.lang.Object) (-1L));
        java.lang.Object obj11 = stackAr8.top();
        java.lang.Object obj12 = stackAr8.top();
        stackAr0.push(obj12);
        stackAr0.pop();
        // The following exception was thrown during execution in test generation
        try {
            stackAr0.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test151");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        java.lang.Object obj1 = stackAr0.top();
        boolean boolean2 = stackAr0.isEmpty();
        boolean boolean3 = stackAr0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            stackAr0.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test152");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        stackAr0.push((java.lang.Object) (-1L));
        stackAr0.makeEmpty();
        boolean boolean4 = stackAr0.isFull();
        stackAr0.makeEmpty();
        stackAr0.makeEmpty();
        stackAr0.makeEmpty();
        java.lang.Class<?> wildcardClass8 = stackAr0.getClass();
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test153");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) (byte) 0);
        boolean boolean2 = stackAr1.isEmpty();
        boolean boolean3 = stackAr1.isEmpty();
        boolean boolean4 = stackAr1.isEmpty();
        stackAr1.makeEmpty();
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test154");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) (byte) 100);
        DataStructures.StackAr stackAr2 = new DataStructures.StackAr();
        stackAr2.push((java.lang.Object) (-1L));
        java.lang.Object obj5 = stackAr2.top();
        stackAr1.push(obj5);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test155");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        boolean boolean1 = stackAr0.isEmpty();
        stackAr0.push((java.lang.Object) 0.0f);
        stackAr0.pop();
        stackAr0.push((java.lang.Object) 1.0f);
        stackAr0.pop();
        DataStructures.StackAr stackAr8 = new DataStructures.StackAr();
        stackAr8.push((java.lang.Object) (-1L));
        java.lang.Object obj11 = stackAr8.top();
        java.lang.Object obj12 = stackAr8.top();
        stackAr0.push(obj12);
        stackAr0.makeEmpty();
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test156");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        boolean boolean1 = stackAr0.isEmpty();
        boolean boolean2 = stackAr0.isEmpty();
        stackAr0.makeEmpty();
        java.lang.Class<?> wildcardClass4 = stackAr0.getClass();
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test157");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        stackAr0.push((java.lang.Object) (-1L));
        java.lang.Object obj3 = stackAr0.top();
        java.lang.Object obj4 = null;
        stackAr0.push(obj4);
        stackAr0.pop();
        boolean boolean7 = stackAr0.isFull();
        DataStructures.StackAr stackAr8 = new DataStructures.StackAr();
        stackAr8.push((java.lang.Object) (-1L));
        java.lang.Object obj11 = stackAr8.top();
        stackAr8.pop();
        boolean boolean13 = stackAr8.isFull();
        java.lang.Class<?> wildcardClass14 = stackAr8.getClass();
        stackAr0.push((java.lang.Object) stackAr8);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test158");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        boolean boolean1 = stackAr0.isEmpty();
        boolean boolean2 = stackAr0.isEmpty();
        stackAr0.makeEmpty();
        java.lang.Object obj4 = stackAr0.top();
        boolean boolean5 = stackAr0.isFull();
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test159");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) ' ');
        DataStructures.StackAr stackAr2 = new DataStructures.StackAr();
        stackAr2.push((java.lang.Object) (-1L));
        java.lang.Object obj5 = stackAr2.top();
        java.lang.Object obj6 = null;
        stackAr2.push(obj6);
        DataStructures.StackAr stackAr8 = new DataStructures.StackAr();
        boolean boolean9 = stackAr8.isEmpty();
        boolean boolean10 = stackAr8.isFull();
        stackAr2.push((java.lang.Object) boolean10);
        boolean boolean12 = stackAr2.isEmpty();
        stackAr2.pop();
        stackAr1.push((java.lang.Object) stackAr2);
        boolean boolean15 = stackAr2.isFull();
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test160");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        stackAr0.push((java.lang.Object) (-1L));
        java.lang.Object obj3 = stackAr0.top();
        java.lang.Object obj4 = null;
        stackAr0.push(obj4);
        DataStructures.StackAr stackAr6 = new DataStructures.StackAr();
        boolean boolean7 = stackAr6.isEmpty();
        boolean boolean8 = stackAr6.isFull();
        stackAr0.push((java.lang.Object) boolean8);
        stackAr0.pop();
        java.lang.Class<?> wildcardClass11 = stackAr0.getClass();
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test161");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        stackAr0.push((java.lang.Object) (-1L));
        java.lang.Object obj3 = stackAr0.top();
        java.lang.Object obj4 = stackAr0.top();
        java.lang.Object obj5 = stackAr0.top();
        boolean boolean6 = stackAr0.isEmpty();
        stackAr0.pop();
        boolean boolean8 = stackAr0.isFull();
        stackAr0.makeEmpty();
        boolean boolean10 = stackAr0.isEmpty();
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test162");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        stackAr0.push((java.lang.Object) (-1L));
        java.lang.Object obj3 = stackAr0.top();
        java.lang.Object obj4 = null;
        stackAr0.push(obj4);
        DataStructures.StackAr stackAr6 = new DataStructures.StackAr();
        boolean boolean7 = stackAr6.isEmpty();
        boolean boolean8 = stackAr6.isFull();
        stackAr0.push((java.lang.Object) boolean8);
        boolean boolean10 = stackAr0.isEmpty();
        stackAr0.makeEmpty();
        stackAr0.push((java.lang.Object) (-5));
        stackAr0.makeEmpty();
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test163");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(100);
        boolean boolean2 = stackAr1.isFull();
        boolean boolean3 = stackAr1.isFull();
        DataStructures.StackAr stackAr4 = new DataStructures.StackAr();
        boolean boolean5 = stackAr4.isEmpty();
        stackAr4.push((java.lang.Object) 0.0f);
        stackAr4.pop();
        stackAr4.push((java.lang.Object) 1.0f);
        stackAr4.pop();
        DataStructures.StackAr stackAr12 = new DataStructures.StackAr();
        stackAr12.push((java.lang.Object) (-1L));
        java.lang.Object obj15 = stackAr12.top();
        java.lang.Object obj16 = stackAr12.top();
        stackAr4.push(obj16);
        DataStructures.StackAr stackAr18 = new DataStructures.StackAr();
        stackAr18.push((java.lang.Object) (-1L));
        boolean boolean21 = stackAr18.isFull();
        stackAr18.pop();
        boolean boolean23 = stackAr18.isEmpty();
        stackAr4.push((java.lang.Object) stackAr18);
        java.lang.Object obj25 = stackAr4.top();
        stackAr1.push(obj25);
        boolean boolean27 = stackAr1.isEmpty();
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test164");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        stackAr0.push((java.lang.Object) (-1L));
        boolean boolean3 = stackAr0.isFull();
        java.lang.Object obj4 = stackAr0.top();
        boolean boolean5 = stackAr0.isEmpty();
        java.lang.Object obj6 = stackAr0.top();
        boolean boolean7 = stackAr0.isFull();
        DataStructures.StackAr stackAr9 = new DataStructures.StackAr(8);
        stackAr0.push((java.lang.Object) stackAr9);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test165");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        boolean boolean1 = stackAr0.isEmpty();
        boolean boolean2 = stackAr0.isEmpty();
        DataStructures.StackAr stackAr4 = new DataStructures.StackAr(7);
        boolean boolean5 = stackAr4.isEmpty();
        boolean boolean6 = stackAr4.isFull();
        stackAr0.push((java.lang.Object) boolean6);
        DataStructures.StackAr stackAr9 = new DataStructures.StackAr(100);
        boolean boolean10 = stackAr9.isEmpty();
        boolean boolean11 = stackAr9.isFull();
        stackAr0.push((java.lang.Object) stackAr9);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test166");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        stackAr0.push((java.lang.Object) (-1L));
        boolean boolean3 = stackAr0.isFull();
        stackAr0.push((java.lang.Object) 10);
        stackAr0.pop();
        java.lang.Object obj7 = stackAr0.top();
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test167");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(3);
        boolean boolean2 = stackAr1.isEmpty();
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test168");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        stackAr0.push((java.lang.Object) (-1L));
        java.lang.Object obj3 = stackAr0.top();
        stackAr0.pop();
        stackAr0.push((java.lang.Object) 10L);
        boolean boolean7 = stackAr0.isFull();
        java.lang.Class<?> wildcardClass8 = stackAr0.getClass();
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test169");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        stackAr0.push((java.lang.Object) (-1L));
        java.lang.Object obj3 = stackAr0.top();
        stackAr0.makeEmpty();
        DataStructures.StackAr stackAr6 = new DataStructures.StackAr(4);
        stackAr0.push((java.lang.Object) 4);
        boolean boolean8 = stackAr0.isEmpty();
        stackAr0.makeEmpty();
        // The following exception was thrown during execution in test generation
        try {
            stackAr0.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test170");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(4);
        stackAr1.push((java.lang.Object) (-2));
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test171");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) (byte) 0);
        boolean boolean2 = stackAr1.isEmpty();
        boolean boolean3 = stackAr1.isFull();
        boolean boolean4 = stackAr1.isFull();
        java.lang.Object obj5 = stackAr1.top();
        java.lang.Class<?> wildcardClass6 = stackAr1.getClass();
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test172");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        stackAr0.push((java.lang.Object) (-1L));
        stackAr0.makeEmpty();
        boolean boolean4 = stackAr0.isFull();
        stackAr0.makeEmpty();
        boolean boolean6 = stackAr0.isEmpty();
        DataStructures.StackAr stackAr7 = new DataStructures.StackAr();
        stackAr7.push((java.lang.Object) (-1L));
        java.lang.Object obj10 = stackAr7.top();
        stackAr7.makeEmpty();
        DataStructures.StackAr stackAr13 = new DataStructures.StackAr(4);
        stackAr7.push((java.lang.Object) 4);
        stackAr0.push((java.lang.Object) stackAr7);
        stackAr0.makeEmpty();
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test173");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        stackAr0.push((java.lang.Object) (-1L));
        java.lang.Object obj3 = stackAr0.top();
        java.lang.Object obj4 = null;
        stackAr0.push(obj4);
        boolean boolean6 = stackAr0.isFull();
        DataStructures.StackAr stackAr7 = new DataStructures.StackAr();
        boolean boolean8 = stackAr7.isEmpty();
        boolean boolean9 = stackAr7.isFull();
        boolean boolean10 = stackAr7.isEmpty();
        stackAr0.push((java.lang.Object) stackAr7);
        DataStructures.StackAr stackAr12 = new DataStructures.StackAr();
        stackAr12.push((java.lang.Object) (-1L));
        boolean boolean15 = stackAr12.isFull();
        stackAr12.push((java.lang.Object) 10);
        boolean boolean18 = stackAr12.isEmpty();
        stackAr12.makeEmpty();
        boolean boolean20 = stackAr12.isFull();
        stackAr0.push((java.lang.Object) stackAr12);
        java.lang.Object obj22 = stackAr0.top();
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test174");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        boolean boolean1 = stackAr0.isEmpty();
        boolean boolean2 = stackAr0.isEmpty();
        DataStructures.StackAr stackAr3 = new DataStructures.StackAr();
        boolean boolean4 = stackAr3.isEmpty();
        stackAr3.push((java.lang.Object) 0.0f);
        stackAr0.push((java.lang.Object) stackAr3);
        stackAr0.makeEmpty();
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test175");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        stackAr0.push((java.lang.Object) (-1L));
        boolean boolean3 = stackAr0.isFull();
        boolean boolean4 = stackAr0.isFull();
        stackAr0.pop();
        java.lang.Object obj6 = stackAr0.top();
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test176");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) (byte) 0);
        boolean boolean2 = stackAr1.isEmpty();
        boolean boolean3 = stackAr1.isFull();
        boolean boolean4 = stackAr1.isFull();
        java.lang.Object obj5 = stackAr1.top();
        DataStructures.StackAr stackAr6 = new DataStructures.StackAr();
        stackAr6.push((java.lang.Object) (-1L));
        boolean boolean9 = stackAr6.isFull();
        stackAr6.push((java.lang.Object) 10);
        boolean boolean12 = stackAr6.isEmpty();
        stackAr6.makeEmpty();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push((java.lang.Object) stackAr6);
            org.junit.Assert.fail("Expected exception of type DataStructures.Overflow; message: null");
        } catch (DataStructures.Overflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test177");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        stackAr0.push((java.lang.Object) (-1L));
        boolean boolean3 = stackAr0.isFull();
        java.lang.Object obj4 = stackAr0.top();
        stackAr0.pop();
        boolean boolean6 = stackAr0.isEmpty();
        boolean boolean7 = stackAr0.isFull();
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test178");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        java.lang.Object obj1 = stackAr0.top();
        boolean boolean2 = stackAr0.isEmpty();
        boolean boolean3 = stackAr0.isEmpty();
        stackAr0.makeEmpty();
        java.lang.Object obj5 = stackAr0.top();
        java.lang.Object obj6 = stackAr0.top();
        java.lang.Object obj7 = stackAr0.top();
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test179");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) '#');
        boolean boolean2 = stackAr1.isFull();
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test180");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        stackAr0.push((java.lang.Object) (-1L));
        java.lang.Object obj3 = stackAr0.top();
        java.lang.Object obj4 = null;
        stackAr0.push(obj4);
        DataStructures.StackAr stackAr6 = new DataStructures.StackAr();
        boolean boolean7 = stackAr6.isEmpty();
        boolean boolean8 = stackAr6.isFull();
        stackAr0.push((java.lang.Object) boolean8);
        boolean boolean10 = stackAr0.isEmpty();
        stackAr0.pop();
        boolean boolean12 = stackAr0.isFull();
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test181");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        stackAr0.push((java.lang.Object) (-1L));
        java.lang.Object obj3 = stackAr0.top();
        boolean boolean4 = stackAr0.isFull();
        stackAr0.push((java.lang.Object) 1.0d);
        java.lang.Class<?> wildcardClass7 = stackAr0.getClass();
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test182");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        boolean boolean1 = stackAr0.isEmpty();
        stackAr0.push((java.lang.Object) 0.0f);
        java.lang.Object obj4 = stackAr0.top();
        boolean boolean5 = stackAr0.isFull();
        stackAr0.makeEmpty();
        DataStructures.StackAr stackAr8 = new DataStructures.StackAr((int) '#');
        stackAr0.push((java.lang.Object) '#');
        java.lang.Class<?> wildcardClass10 = stackAr0.getClass();
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test183");
        // The following exception was thrown during execution in test generation
        try {
            DataStructures.StackAr stackAr1 = new DataStructures.StackAr((-5));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        // Expected exception.
        }
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test184");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(7);
        boolean boolean2 = stackAr1.isEmpty();
        boolean boolean3 = stackAr1.isFull();
        boolean boolean4 = stackAr1.isEmpty();
        stackAr1.push((java.lang.Object) (-6));
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test185");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(100);
        boolean boolean2 = stackAr1.isFull();
        boolean boolean3 = stackAr1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test186");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(100);
        boolean boolean2 = stackAr1.isEmpty();
        boolean boolean3 = stackAr1.isFull();
        boolean boolean4 = stackAr1.isFull();
        java.lang.Object obj5 = stackAr1.top();
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test187");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) (short) 0);
        boolean boolean2 = stackAr1.isEmpty();
        boolean boolean3 = stackAr1.isEmpty();
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test188");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        stackAr0.push((java.lang.Object) (-1L));
        java.lang.Object obj3 = stackAr0.top();
        java.lang.Object obj4 = stackAr0.top();
        java.lang.Object obj5 = stackAr0.top();
        stackAr0.makeEmpty();
        stackAr0.push((java.lang.Object) 0);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test189");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        stackAr0.push((java.lang.Object) (-1L));
        java.lang.Object obj3 = stackAr0.top();
        java.lang.Object obj4 = stackAr0.top();
        java.lang.Object obj5 = stackAr0.top();
        boolean boolean6 = stackAr0.isEmpty();
        stackAr0.pop();
        boolean boolean8 = stackAr0.isFull();
        java.lang.Class<?> wildcardClass9 = stackAr0.getClass();
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test190");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        boolean boolean1 = stackAr0.isEmpty();
        boolean boolean2 = stackAr0.isFull();
        java.lang.Object obj3 = stackAr0.top();
        stackAr0.makeEmpty();
        java.lang.Object obj5 = stackAr0.top();
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test191");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(8);
        java.lang.Object obj2 = stackAr1.top();
        boolean boolean3 = stackAr1.isEmpty();
        boolean boolean4 = stackAr1.isFull();
        java.lang.Class<?> wildcardClass5 = stackAr1.getClass();
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test192");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        boolean boolean1 = stackAr0.isEmpty();
        stackAr0.push((java.lang.Object) 0.0f);
        stackAr0.pop();
        stackAr0.push((java.lang.Object) 1.0f);
        boolean boolean7 = stackAr0.isEmpty();
        DataStructures.StackAr stackAr8 = new DataStructures.StackAr();
        boolean boolean9 = stackAr8.isEmpty();
        stackAr8.push((java.lang.Object) 0.0f);
        java.lang.Object obj12 = stackAr8.top();
        boolean boolean13 = stackAr8.isEmpty();
        stackAr0.push((java.lang.Object) boolean13);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test193");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        boolean boolean1 = stackAr0.isEmpty();
        boolean boolean2 = stackAr0.isEmpty();
        stackAr0.makeEmpty();
        java.lang.Object obj4 = stackAr0.top();
        // The following exception was thrown during execution in test generation
        try {
            stackAr0.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test194");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        java.lang.Object obj1 = stackAr0.top();
        boolean boolean2 = stackAr0.isEmpty();
        boolean boolean3 = stackAr0.isEmpty();
        stackAr0.makeEmpty();
        java.lang.Object obj5 = stackAr0.top();
        stackAr0.makeEmpty();
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test195");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        stackAr0.push((java.lang.Object) (-1L));
        boolean boolean3 = stackAr0.isFull();
        java.lang.Object obj4 = stackAr0.top();
        stackAr0.pop();
        boolean boolean6 = stackAr0.isEmpty();
        java.lang.Class<?> wildcardClass7 = stackAr0.getClass();
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test196");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        stackAr0.push((java.lang.Object) (-1L));
        java.lang.Object obj3 = stackAr0.top();
        stackAr0.makeEmpty();
        stackAr0.push((java.lang.Object) 6);
        boolean boolean7 = stackAr0.isFull();
        java.lang.Class<?> wildcardClass8 = stackAr0.getClass();
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test197");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        stackAr0.push((java.lang.Object) (-1L));
        java.lang.Object obj3 = stackAr0.top();
        java.lang.Object obj4 = null;
        stackAr0.push(obj4);
        stackAr0.makeEmpty();
        java.lang.Object obj7 = stackAr0.top();
        DataStructures.StackAr stackAr8 = new DataStructures.StackAr();
        stackAr8.push((java.lang.Object) '#');
        java.lang.Class<?> wildcardClass11 = stackAr8.getClass();
        stackAr0.push((java.lang.Object) stackAr8);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test198");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        java.lang.Object obj1 = stackAr0.top();
        boolean boolean2 = stackAr0.isEmpty();
        boolean boolean3 = stackAr0.isEmpty();
        stackAr0.makeEmpty();
        java.lang.Object obj5 = stackAr0.top();
        stackAr0.push((java.lang.Object) (-10));
        boolean boolean8 = stackAr0.isEmpty();
        boolean boolean9 = stackAr0.isEmpty();
        java.lang.Object obj10 = stackAr0.top();
        stackAr0.pop();
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test199");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        stackAr0.push((java.lang.Object) (-1L));
        stackAr0.makeEmpty();
        boolean boolean4 = stackAr0.isFull();
        stackAr0.makeEmpty();
        stackAr0.makeEmpty();
        java.lang.Object obj7 = stackAr0.top();
        java.lang.Object obj8 = stackAr0.top();
        boolean boolean9 = stackAr0.isFull();
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test200");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        stackAr0.push((java.lang.Object) (-1L));
        java.lang.Object obj3 = stackAr0.top();
        boolean boolean4 = stackAr0.isFull();
        boolean boolean5 = stackAr0.isEmpty();
        boolean boolean6 = stackAr0.isFull();
        stackAr0.pop();
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test201");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        stackAr0.push((java.lang.Object) (-1L));
        java.lang.Object obj3 = stackAr0.top();
        java.lang.Object obj4 = null;
        stackAr0.push(obj4);
        boolean boolean6 = stackAr0.isFull();
        DataStructures.StackAr stackAr7 = new DataStructures.StackAr();
        boolean boolean8 = stackAr7.isEmpty();
        boolean boolean9 = stackAr7.isFull();
        boolean boolean10 = stackAr7.isEmpty();
        stackAr0.push((java.lang.Object) stackAr7);
        DataStructures.StackAr stackAr12 = new DataStructures.StackAr();
        stackAr12.push((java.lang.Object) (-1L));
        boolean boolean15 = stackAr12.isFull();
        stackAr12.push((java.lang.Object) 10);
        boolean boolean18 = stackAr12.isEmpty();
        stackAr12.makeEmpty();
        boolean boolean20 = stackAr12.isFull();
        stackAr0.push((java.lang.Object) stackAr12);
        boolean boolean22 = stackAr12.isEmpty();
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test202");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        stackAr0.push((java.lang.Object) (-1L));
        java.lang.Object obj3 = stackAr0.top();
        java.lang.Object obj4 = stackAr0.top();
        java.lang.Object obj5 = stackAr0.top();
        java.lang.Class<?> wildcardClass6 = stackAr0.getClass();
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test203");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        stackAr0.push((java.lang.Object) (-1L));
        boolean boolean3 = stackAr0.isFull();
        stackAr0.push((java.lang.Object) 10);
        boolean boolean6 = stackAr0.isEmpty();
        stackAr0.makeEmpty();
        boolean boolean8 = stackAr0.isEmpty();
        java.lang.Object obj9 = stackAr0.top();
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test204");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        stackAr0.push((java.lang.Object) (-1L));
        stackAr0.makeEmpty();
        boolean boolean4 = stackAr0.isFull();
        stackAr0.makeEmpty();
        stackAr0.makeEmpty();
        java.lang.Object obj7 = stackAr0.top();
        // The following exception was thrown during execution in test generation
        try {
            stackAr0.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test205");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        stackAr0.push((java.lang.Object) (-1L));
        java.lang.Object obj3 = stackAr0.top();
        stackAr0.pop();
        stackAr0.push((java.lang.Object) 10L);
        java.lang.Object obj7 = stackAr0.top();
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test206");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) (byte) 0);
        java.lang.Object obj2 = stackAr1.top();
        boolean boolean3 = stackAr1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test207");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        stackAr0.push((java.lang.Object) (-1L));
        boolean boolean3 = stackAr0.isFull();
        stackAr0.pop();
        java.lang.Object obj5 = stackAr0.top();
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test208");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        stackAr0.push((java.lang.Object) (-1L));
        java.lang.Object obj3 = stackAr0.top();
        stackAr0.pop();
        stackAr0.push((java.lang.Object) 10L);
        boolean boolean7 = stackAr0.isEmpty();
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test209");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) (byte) 0);
        boolean boolean2 = stackAr1.isEmpty();
        boolean boolean3 = stackAr1.isFull();
        boolean boolean4 = stackAr1.isEmpty();
        stackAr1.makeEmpty();
        java.lang.Object obj6 = stackAr1.top();
        boolean boolean7 = stackAr1.isEmpty();
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test210");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        boolean boolean1 = stackAr0.isEmpty();
        stackAr0.push((java.lang.Object) 0.0f);
        stackAr0.push((java.lang.Object) 1);
        java.lang.Object obj6 = stackAr0.top();
        boolean boolean7 = stackAr0.isEmpty();
        DataStructures.StackAr stackAr9 = new DataStructures.StackAr((int) (byte) 0);
        boolean boolean10 = stackAr9.isEmpty();
        boolean boolean11 = stackAr9.isFull();
        boolean boolean12 = stackAr9.isFull();
        java.lang.Object obj13 = stackAr9.top();
        stackAr0.push((java.lang.Object) stackAr9);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test211");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        stackAr0.push((java.lang.Object) (-1L));
        java.lang.Object obj3 = stackAr0.top();
        java.lang.Object obj4 = new java.lang.Object();
        stackAr0.push(obj4);
        boolean boolean6 = stackAr0.isFull();
        stackAr0.pop();
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test212");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        boolean boolean1 = stackAr0.isEmpty();
        stackAr0.push((java.lang.Object) 0.0f);
        java.lang.Object obj4 = stackAr0.top();
        boolean boolean5 = stackAr0.isFull();
        boolean boolean6 = stackAr0.isFull();
        stackAr0.pop();
        java.lang.Object obj8 = stackAr0.top();
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test213");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        boolean boolean1 = stackAr0.isEmpty();
        boolean boolean2 = stackAr0.isFull();
        java.lang.Object obj3 = stackAr0.top();
        boolean boolean4 = stackAr0.isEmpty();
        stackAr0.makeEmpty();
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test214");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        boolean boolean1 = stackAr0.isEmpty();
        stackAr0.push((java.lang.Object) 0.0f);
        java.lang.Object obj4 = stackAr0.top();
        boolean boolean5 = stackAr0.isEmpty();
        java.lang.Class<?> wildcardClass6 = stackAr0.getClass();
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test215");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        boolean boolean1 = stackAr0.isEmpty();
        boolean boolean2 = stackAr0.isEmpty();
        DataStructures.StackAr stackAr3 = new DataStructures.StackAr();
        boolean boolean4 = stackAr3.isEmpty();
        stackAr3.push((java.lang.Object) 0.0f);
        stackAr0.push((java.lang.Object) stackAr3);
        boolean boolean8 = stackAr3.isFull();
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test216");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) (byte) 0);
        DataStructures.StackAr stackAr2 = new DataStructures.StackAr();
        boolean boolean3 = stackAr2.isEmpty();
        boolean boolean4 = stackAr2.isEmpty();
        DataStructures.StackAr stackAr6 = new DataStructures.StackAr(7);
        boolean boolean7 = stackAr6.isEmpty();
        boolean boolean8 = stackAr6.isFull();
        stackAr2.push((java.lang.Object) boolean8);
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push((java.lang.Object) boolean8);
            org.junit.Assert.fail("Expected exception of type DataStructures.Overflow; message: null");
        } catch (DataStructures.Overflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test217");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        stackAr0.push((java.lang.Object) (-1L));
        boolean boolean3 = stackAr0.isFull();
        DataStructures.StackAr stackAr4 = new DataStructures.StackAr();
        stackAr4.push((java.lang.Object) (-1L));
        java.lang.Object obj7 = stackAr4.top();
        java.lang.Object obj8 = null;
        stackAr4.push(obj8);
        DataStructures.StackAr stackAr10 = new DataStructures.StackAr();
        boolean boolean11 = stackAr10.isEmpty();
        boolean boolean12 = stackAr10.isFull();
        stackAr4.push((java.lang.Object) boolean12);
        stackAr4.pop();
        stackAr0.push((java.lang.Object) stackAr4);
        java.lang.Object obj16 = stackAr4.top();
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test218");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(100);
        boolean boolean2 = stackAr1.isFull();
        boolean boolean3 = stackAr1.isFull();
        DataStructures.StackAr stackAr5 = new DataStructures.StackAr(6);
        stackAr1.push((java.lang.Object) stackAr5);
        DataStructures.StackAr stackAr7 = new DataStructures.StackAr();
        boolean boolean8 = stackAr7.isEmpty();
        boolean boolean9 = stackAr7.isEmpty();
        DataStructures.StackAr stackAr10 = new DataStructures.StackAr();
        boolean boolean11 = stackAr10.isEmpty();
        stackAr10.push((java.lang.Object) 0.0f);
        stackAr7.push((java.lang.Object) stackAr10);
        stackAr1.push((java.lang.Object) stackAr10);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test219");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        stackAr0.push((java.lang.Object) (-1L));
        java.lang.Object obj3 = stackAr0.top();
        boolean boolean4 = stackAr0.isFull();
        stackAr0.push((java.lang.Object) 1.0d);
        java.lang.Object obj7 = stackAr0.top();
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test220");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        boolean boolean1 = stackAr0.isEmpty();
        stackAr0.push((java.lang.Object) 0.0f);
        stackAr0.pop();
        stackAr0.push((java.lang.Object) 1.0f);
        stackAr0.pop();
        DataStructures.StackAr stackAr8 = new DataStructures.StackAr();
        stackAr8.push((java.lang.Object) (-1L));
        java.lang.Object obj11 = stackAr8.top();
        java.lang.Object obj12 = stackAr8.top();
        stackAr0.push(obj12);
        stackAr0.pop();
        java.lang.Object obj15 = stackAr0.top();
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test221");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        stackAr0.push((java.lang.Object) (-1L));
        stackAr0.makeEmpty();
        DataStructures.StackAr stackAr4 = new DataStructures.StackAr();
        stackAr4.push((java.lang.Object) (-1L));
        boolean boolean7 = stackAr4.isFull();
        java.lang.Object obj8 = stackAr4.top();
        boolean boolean9 = stackAr4.isEmpty();
        boolean boolean10 = stackAr4.isEmpty();
        boolean boolean11 = stackAr4.isFull();
        stackAr0.push((java.lang.Object) stackAr4);
        java.lang.Object obj13 = stackAr4.top();
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test222");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        java.lang.Object obj1 = stackAr0.top();
        boolean boolean2 = stackAr0.isEmpty();
        boolean boolean3 = stackAr0.isEmpty();
        boolean boolean4 = stackAr0.isFull();
        boolean boolean5 = stackAr0.isFull();
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test223");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        boolean boolean1 = stackAr0.isEmpty();
        stackAr0.push((java.lang.Object) 0.0f);
        java.lang.Object obj4 = stackAr0.top();
        boolean boolean5 = stackAr0.isEmpty();
        stackAr0.makeEmpty();
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test224");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        boolean boolean1 = stackAr0.isEmpty();
        boolean boolean2 = stackAr0.isEmpty();
        DataStructures.StackAr stackAr4 = new DataStructures.StackAr((int) ' ');
        DataStructures.StackAr stackAr5 = new DataStructures.StackAr();
        stackAr5.push((java.lang.Object) (-1L));
        java.lang.Object obj8 = stackAr5.top();
        java.lang.Object obj9 = null;
        stackAr5.push(obj9);
        DataStructures.StackAr stackAr11 = new DataStructures.StackAr();
        boolean boolean12 = stackAr11.isEmpty();
        boolean boolean13 = stackAr11.isFull();
        stackAr5.push((java.lang.Object) boolean13);
        boolean boolean15 = stackAr5.isEmpty();
        stackAr5.pop();
        stackAr4.push((java.lang.Object) stackAr5);
        stackAr0.push((java.lang.Object) stackAr4);
        java.lang.Object obj19 = stackAr4.top();
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test225");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        stackAr0.push((java.lang.Object) '#');
        boolean boolean3 = stackAr0.isFull();
        DataStructures.StackAr stackAr5 = new DataStructures.StackAr(7);
        java.lang.Object obj6 = stackAr5.top();
        java.lang.Object obj7 = stackAr5.top();
        boolean boolean8 = stackAr5.isEmpty();
        stackAr0.push((java.lang.Object) boolean8);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test226");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(100);
        boolean boolean2 = stackAr1.isFull();
        boolean boolean3 = stackAr1.isFull();
        DataStructures.StackAr stackAr5 = new DataStructures.StackAr(6);
        stackAr1.push((java.lang.Object) stackAr5);
        java.lang.Class<?> wildcardClass7 = stackAr1.getClass();
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test227");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        stackAr0.push((java.lang.Object) (-1L));
        java.lang.Object obj3 = stackAr0.top();
        stackAr0.pop();
        stackAr0.makeEmpty();
        // The following exception was thrown during execution in test generation
        try {
            stackAr0.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test228");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        stackAr0.push((java.lang.Object) (-1L));
        java.lang.Object obj3 = stackAr0.top();
        java.lang.Object obj4 = null;
        stackAr0.push(obj4);
        DataStructures.StackAr stackAr6 = new DataStructures.StackAr();
        boolean boolean7 = stackAr6.isEmpty();
        boolean boolean8 = stackAr6.isFull();
        stackAr0.push((java.lang.Object) boolean8);
        boolean boolean10 = stackAr0.isFull();
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test229");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        boolean boolean1 = stackAr0.isEmpty();
        stackAr0.push((java.lang.Object) 0.0f);
        java.lang.Object obj4 = stackAr0.top();
        stackAr0.pop();
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test230");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        boolean boolean1 = stackAr0.isEmpty();
        boolean boolean2 = stackAr0.isEmpty();
        stackAr0.makeEmpty();
        boolean boolean4 = stackAr0.isEmpty();
        java.lang.Class<?> wildcardClass5 = stackAr0.getClass();
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test231");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(100);
        boolean boolean2 = stackAr1.isEmpty();
        boolean boolean3 = stackAr1.isFull();
        DataStructures.StackAr stackAr4 = new DataStructures.StackAr();
        stackAr4.push((java.lang.Object) (-1L));
        boolean boolean7 = stackAr4.isFull();
        java.lang.Object obj8 = stackAr4.top();
        boolean boolean9 = stackAr4.isEmpty();
        java.lang.Object obj10 = stackAr4.top();
        boolean boolean11 = stackAr4.isFull();
        stackAr1.push((java.lang.Object) boolean11);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test232");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        stackAr0.push((java.lang.Object) (-1L));
        java.lang.Object obj3 = stackAr0.top();
        stackAr0.makeEmpty();
        DataStructures.StackAr stackAr6 = new DataStructures.StackAr(4);
        stackAr0.push((java.lang.Object) 4);
        boolean boolean8 = stackAr0.isEmpty();
        boolean boolean9 = stackAr0.isFull();
        boolean boolean10 = stackAr0.isFull();
        DataStructures.StackAr stackAr11 = new DataStructures.StackAr();
        stackAr11.push((java.lang.Object) (-1L));
        boolean boolean14 = stackAr11.isFull();
        boolean boolean15 = stackAr11.isFull();
        stackAr11.pop();
        stackAr0.push((java.lang.Object) stackAr11);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test233");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        stackAr0.push((java.lang.Object) (-1L));
        boolean boolean3 = stackAr0.isFull();
        java.lang.Object obj4 = stackAr0.top();
        stackAr0.pop();
        stackAr0.makeEmpty();
        DataStructures.StackAr stackAr7 = new DataStructures.StackAr();
        boolean boolean8 = stackAr7.isEmpty();
        stackAr7.push((java.lang.Object) 0.0f);
        stackAr7.pop();
        boolean boolean12 = stackAr7.isEmpty();
        stackAr0.push((java.lang.Object) stackAr7);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test234");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(9);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test235");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) ' ');
        DataStructures.StackAr stackAr2 = new DataStructures.StackAr();
        stackAr2.push((java.lang.Object) (-1L));
        java.lang.Object obj5 = stackAr2.top();
        java.lang.Object obj6 = null;
        stackAr2.push(obj6);
        DataStructures.StackAr stackAr8 = new DataStructures.StackAr();
        boolean boolean9 = stackAr8.isEmpty();
        boolean boolean10 = stackAr8.isFull();
        stackAr2.push((java.lang.Object) boolean10);
        boolean boolean12 = stackAr2.isEmpty();
        stackAr2.pop();
        stackAr1.push((java.lang.Object) stackAr2);
        stackAr2.makeEmpty();
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test236");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        stackAr0.push((java.lang.Object) (-1L));
        java.lang.Object obj3 = stackAr0.top();
        stackAr0.makeEmpty();
        DataStructures.StackAr stackAr6 = new DataStructures.StackAr(4);
        stackAr0.push((java.lang.Object) 4);
        boolean boolean8 = stackAr0.isEmpty();
        boolean boolean9 = stackAr0.isEmpty();
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test237");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        boolean boolean1 = stackAr0.isEmpty();
        stackAr0.push((java.lang.Object) 0.0f);
        java.lang.Object obj4 = stackAr0.top();
        DataStructures.StackAr stackAr5 = new DataStructures.StackAr();
        stackAr5.push((java.lang.Object) (-1L));
        java.lang.Object obj8 = stackAr5.top();
        boolean boolean9 = stackAr5.isFull();
        stackAr5.push((java.lang.Object) 1.0d);
        stackAr0.push((java.lang.Object) stackAr5);
        boolean boolean13 = stackAr0.isEmpty();
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test238");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        boolean boolean1 = stackAr0.isEmpty();
        boolean boolean2 = stackAr0.isFull();
        DataStructures.StackAr stackAr3 = new DataStructures.StackAr();
        stackAr3.push((java.lang.Object) (-1L));
        java.lang.Object obj6 = stackAr3.top();
        stackAr3.pop();
        stackAr3.push((java.lang.Object) 10L);
        boolean boolean10 = stackAr3.isFull();
        boolean boolean11 = stackAr3.isEmpty();
        boolean boolean12 = stackAr3.isFull();
        stackAr0.push((java.lang.Object) stackAr3);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test239");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        stackAr0.push((java.lang.Object) (-1L));
        java.lang.Object obj3 = stackAr0.top();
        java.lang.Object obj4 = stackAr0.top();
        java.lang.Object obj5 = stackAr0.top();
        stackAr0.makeEmpty();
        boolean boolean7 = stackAr0.isFull();
        boolean boolean8 = stackAr0.isEmpty();
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test240");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) 'a');
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        boolean boolean4 = stackAr1.isEmpty();
        boolean boolean5 = stackAr1.isFull();
        java.lang.Object obj6 = stackAr1.top();
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test241");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        boolean boolean1 = stackAr0.isEmpty();
        boolean boolean2 = stackAr0.isEmpty();
        stackAr0.makeEmpty();
        stackAr0.makeEmpty();
        boolean boolean5 = stackAr0.isFull();
        java.lang.Object obj6 = stackAr0.top();
        java.lang.Class<?> wildcardClass7 = stackAr0.getClass();
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test242");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        stackAr0.push((java.lang.Object) (-1L));
        java.lang.Object obj3 = stackAr0.top();
        java.lang.Object obj4 = null;
        stackAr0.push(obj4);
        stackAr0.makeEmpty();
        boolean boolean7 = stackAr0.isEmpty();
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test243");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        stackAr0.push((java.lang.Object) (-1L));
        stackAr0.makeEmpty();
        boolean boolean4 = stackAr0.isFull();
        stackAr0.makeEmpty();
        boolean boolean6 = stackAr0.isEmpty();
        java.lang.Object obj7 = stackAr0.top();
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test244");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        boolean boolean1 = stackAr0.isEmpty();
        boolean boolean2 = stackAr0.isEmpty();
        DataStructures.StackAr stackAr4 = new DataStructures.StackAr((int) (byte) 0);
        java.lang.Object obj5 = stackAr4.top();
        stackAr0.push(obj5);
        stackAr0.makeEmpty();
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test245");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        stackAr0.push((java.lang.Object) (-1L));
        java.lang.Object obj3 = stackAr0.top();
        java.lang.Object obj4 = null;
        stackAr0.push(obj4);
        boolean boolean6 = stackAr0.isFull();
        DataStructures.StackAr stackAr7 = new DataStructures.StackAr();
        boolean boolean8 = stackAr7.isEmpty();
        boolean boolean9 = stackAr7.isFull();
        boolean boolean10 = stackAr7.isEmpty();
        stackAr0.push((java.lang.Object) stackAr7);
        DataStructures.StackAr stackAr12 = new DataStructures.StackAr();
        stackAr12.push((java.lang.Object) (-1L));
        boolean boolean15 = stackAr12.isFull();
        stackAr12.push((java.lang.Object) 10);
        boolean boolean18 = stackAr12.isEmpty();
        stackAr12.makeEmpty();
        boolean boolean20 = stackAr12.isFull();
        stackAr0.push((java.lang.Object) stackAr12);
        boolean boolean22 = stackAr0.isEmpty();
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test246");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        stackAr0.push((java.lang.Object) (-1L));
        java.lang.Object obj3 = stackAr0.top();
        java.lang.Object obj4 = null;
        stackAr0.push(obj4);
        stackAr0.makeEmpty();
        java.lang.Object obj7 = stackAr0.top();
        stackAr0.makeEmpty();
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test247");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        stackAr0.push((java.lang.Object) (-1L));
        java.lang.Object obj3 = stackAr0.top();
        java.lang.Object obj4 = null;
        stackAr0.push(obj4);
        DataStructures.StackAr stackAr6 = new DataStructures.StackAr();
        boolean boolean7 = stackAr6.isEmpty();
        boolean boolean8 = stackAr6.isFull();
        stackAr0.push((java.lang.Object) boolean8);
        boolean boolean10 = stackAr0.isEmpty();
        stackAr0.makeEmpty();
        DataStructures.StackAr stackAr12 = new DataStructures.StackAr();
        boolean boolean13 = stackAr12.isEmpty();
        java.lang.Object obj14 = null;
        stackAr12.push(obj14);
        stackAr0.push(obj14);
        boolean boolean17 = stackAr0.isFull();
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test248");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) (byte) 10);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test249");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        stackAr0.push((java.lang.Object) (-1L));
        java.lang.Object obj3 = stackAr0.top();
        stackAr0.pop();
        stackAr0.push((java.lang.Object) 10L);
        boolean boolean7 = stackAr0.isFull();
        java.lang.Object obj8 = stackAr0.top();
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test250");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        stackAr0.push((java.lang.Object) (-1L));
        boolean boolean3 = stackAr0.isFull();
        boolean boolean4 = stackAr0.isFull();
        DataStructures.StackAr stackAr6 = new DataStructures.StackAr((int) (short) 1);
        java.lang.Object obj7 = stackAr6.top();
        boolean boolean8 = stackAr6.isEmpty();
        stackAr0.push((java.lang.Object) stackAr6);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test251");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) (byte) 0);
        java.lang.Object obj2 = stackAr1.top();
        boolean boolean3 = stackAr1.isFull();
        java.lang.Object obj4 = stackAr1.top();
        boolean boolean5 = stackAr1.isFull();
        stackAr1.makeEmpty();
        boolean boolean7 = stackAr1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test252");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) (byte) 0);
        boolean boolean2 = stackAr1.isFull();
        DataStructures.StackAr stackAr3 = new DataStructures.StackAr();
        stackAr3.push((java.lang.Object) (-1L));
        boolean boolean6 = stackAr3.isFull();
        java.lang.Object obj7 = stackAr3.top();
        java.lang.Object obj8 = stackAr3.top();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push(obj8);
            org.junit.Assert.fail("Expected exception of type DataStructures.Overflow; message: null");
        } catch (DataStructures.Overflow e) {
        // Expected exception.
        }
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test253");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) (byte) 0);
        boolean boolean2 = stackAr1.isEmpty();
        boolean boolean3 = stackAr1.isEmpty();
        boolean boolean4 = stackAr1.isEmpty();
        boolean boolean5 = stackAr1.isEmpty();
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test254");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        boolean boolean1 = stackAr0.isEmpty();
        stackAr0.push((java.lang.Object) 0.0f);
        stackAr0.pop();
        stackAr0.push((java.lang.Object) 1.0f);
        stackAr0.pop();
        DataStructures.StackAr stackAr8 = new DataStructures.StackAr();
        stackAr8.push((java.lang.Object) (-1L));
        java.lang.Object obj11 = stackAr8.top();
        java.lang.Object obj12 = stackAr8.top();
        stackAr0.push(obj12);
        DataStructures.StackAr stackAr14 = new DataStructures.StackAr();
        stackAr14.push((java.lang.Object) (-1L));
        boolean boolean17 = stackAr14.isFull();
        stackAr14.pop();
        boolean boolean19 = stackAr14.isEmpty();
        stackAr0.push((java.lang.Object) stackAr14);
        java.lang.Object obj21 = stackAr0.top();
        stackAr0.pop();
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test255");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        boolean boolean1 = stackAr0.isEmpty();
        boolean boolean2 = stackAr0.isEmpty();
        stackAr0.makeEmpty();
        boolean boolean4 = stackAr0.isEmpty();
        boolean boolean5 = stackAr0.isEmpty();
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test256");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        java.lang.Class<?> wildcardClass1 = stackAr0.getClass();
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test257");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        stackAr0.push((java.lang.Object) (-1L));
        java.lang.Object obj3 = stackAr0.top();
        stackAr0.pop();
        java.lang.Object obj5 = stackAr0.top();
        boolean boolean6 = stackAr0.isEmpty();
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test258");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        stackAr0.push((java.lang.Object) (-1L));
        boolean boolean3 = stackAr0.isFull();
        stackAr0.pop();
        stackAr0.makeEmpty();
        boolean boolean6 = stackAr0.isFull();
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StackArTester0.test259");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        boolean boolean1 = stackAr0.isEmpty();
        stackAr0.push((java.lang.Object) 0.0f);
        stackAr0.pop();
        boolean boolean5 = stackAr0.isEmpty();
        DataStructures.StackAr stackAr6 = new DataStructures.StackAr();
        boolean boolean7 = stackAr6.isEmpty();
        boolean boolean8 = stackAr6.isFull();
        java.lang.Object obj9 = stackAr6.top();
        java.lang.Class<?> wildcardClass10 = stackAr6.getClass();
        stackAr0.push((java.lang.Object) wildcardClass10);
        java.lang.Object obj12 = stackAr0.top();
    }
}

