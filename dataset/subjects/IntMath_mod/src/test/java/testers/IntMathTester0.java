package testers;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class IntMathTester0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test001");
        math.IntMath intMath0 = new math.IntMath();
        java.lang.Class<?> wildcardClass1 = intMath0.getClass();
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test002");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod(100, (int) 'a');
        java.lang.Class<?> wildcardClass4 = intMath0.getClass();
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test003");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        java.lang.Class<?> wildcardClass7 = intMath0.getClass();
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test004");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(9, (int) (byte) 10);
        java.lang.Class<?> wildcardClass10 = intMath0.getClass();
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test005");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = intMath0.mod((int) (short) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus 0 must be > 0");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test006");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-3), 6);
        java.lang.Class<?> wildcardClass4 = intMath0.getClass();
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test007");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        java.lang.Class<?> wildcardClass10 = intMath0.getClass();
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test008");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(9, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = intMath0.mod(100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus 0 must be > 0");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test009");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        java.lang.Class<?> wildcardClass4 = intMath0.getClass();
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test010");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = intMath0.mod(6, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -1 must be > 0");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test011");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = intMath0.mod((-3), (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -1 must be > 0");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test012");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(9, (int) (byte) 10);
        int int12 = intMath0.mod((-9), (int) '#');
        int int15 = intMath0.mod((-7), (int) ' ');
        java.lang.Class<?> wildcardClass16 = intMath0.getClass();
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test013");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-3), 6);
        int int6 = intMath0.mod((int) (byte) 1, 10);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = intMath0.mod((int) (byte) 1, (-6));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -6 must be > 0");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test014");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(9, (int) (byte) 10);
        int int12 = intMath0.mod((-9), (int) '#');
        java.lang.Class<?> wildcardClass13 = intMath0.getClass();
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test015");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test016");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(9, (int) (byte) 10);
        int int12 = intMath0.mod((-9), (int) '#');
        int int15 = intMath0.mod((-7), (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int18 = intMath0.mod((int) (byte) 0, (-10));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -10 must be > 0");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test017");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(9, (int) (byte) 10);
        int int12 = intMath0.mod(0, (int) '4');
        java.lang.Class<?> wildcardClass13 = intMath0.getClass();
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test018");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod(100, (int) 'a');
        int int6 = intMath0.mod((-4), 99);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = intMath0.mod((-7), (-7));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -7 must be > 0");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test019");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        java.lang.Class<?> wildcardClass16 = intMath0.getClass();
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test020");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = intMath0.mod((int) (byte) 10, (-3));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -3 must be > 0");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test021");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((-9), 9);
        java.lang.Class<?> wildcardClass10 = intMath0.getClass();
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test022");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = intMath0.mod((-1), (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus 0 must be > 0");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test023");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod(5, 25);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = intMath0.mod((-9), (-6));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -6 must be > 0");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test024");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-3), 6);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = intMath0.mod(26, (-9));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -9 must be > 0");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test025");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-3), 6);
        int int6 = intMath0.mod((int) (byte) 1, 10);
        java.lang.Class<?> wildcardClass7 = intMath0.getClass();
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test026");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod((int) '4', (int) (byte) 10);
        java.lang.Class<?> wildcardClass13 = intMath0.getClass();
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test027");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        java.lang.Class<?> wildcardClass13 = intMath0.getClass();
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test028");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod(5, 25);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = intMath0.mod((-9), (-7));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -7 must be > 0");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test029");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) 10, (int) (short) 1);
        java.lang.Class<?> wildcardClass4 = intMath0.getClass();
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test030");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(9, (int) (byte) 10);
        int int12 = intMath0.mod(0, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            int int15 = intMath0.mod(100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus 0 must be > 0");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test031");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-3), 6);
        int int6 = intMath0.mod((int) (byte) 1, 10);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = intMath0.mod((-9), (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -1 must be > 0");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test032");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((-9), 9);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = intMath0.mod((-100), (-9));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -9 must be > 0");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test033");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((-3), 4);
        java.lang.Class<?> wildcardClass7 = intMath0.getClass();
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test034");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod(100, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int6 = intMath0.mod((-7), (-100));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -100 must be > 0");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test035");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod((-6), (int) (short) 10);
        int int21 = intMath0.mod(0, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = intMath0.mod(0, (-5));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -5 must be > 0");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test036");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = intMath0.mod((-3), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus 0 must be > 0");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test037");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        java.lang.Class<?> wildcardClass7 = intMath0.getClass();
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test038");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (byte) 0, 7);
        java.lang.Class<?> wildcardClass7 = intMath0.getClass();
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test039");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-3), 6);
        int int6 = intMath0.mod((int) ' ', (int) ' ');
        java.lang.Class<?> wildcardClass7 = intMath0.getClass();
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test040");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-3), 6);
        int int6 = intMath0.mod((int) ' ', (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int9 = intMath0.mod((int) '#', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -1 must be > 0");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test041");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod((-6), (int) (short) 10);
        java.lang.Class<?> wildcardClass19 = intMath0.getClass();
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test042");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod(100, (int) 'a');
        int int6 = intMath0.mod((-4), 99);
        java.lang.Class<?> wildcardClass7 = intMath0.getClass();
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test043");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(9, (int) (byte) 10);
        int int12 = intMath0.mod((-9), (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int15 = intMath0.mod((int) (byte) -1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -1 must be > 0");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test044");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(10, 1);
        java.lang.Class<?> wildcardClass13 = intMath0.getClass();
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test045");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(1, 100);
        java.lang.Class<?> wildcardClass10 = intMath0.getClass();
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test046");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(9, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = intMath0.mod(3, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus 0 must be > 0");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test047");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-3), 6);
        int int6 = intMath0.mod((int) (byte) 1, 10);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = intMath0.mod((int) ' ', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus 0 must be > 0");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test048");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod(5, 25);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = intMath0.mod((int) (byte) -1, (-8));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -8 must be > 0");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test049");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod((-6), (int) (short) 10);
        int int21 = intMath0.mod((-7), 10);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = intMath0.mod((-3), (-6));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -6 must be > 0");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test050");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod((-6), (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = intMath0.mod((int) (byte) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -1 must be > 0");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test051");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = intMath0.mod((int) (byte) 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -1 must be > 0");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test052");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod((-7), 95);
        java.lang.Class<?> wildcardClass13 = intMath0.getClass();
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test053");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod((-6), (int) (short) 10);
        int int21 = intMath0.mod(0, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = intMath0.mod((int) '#', (-3));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -3 must be > 0");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test054");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod((-100), 1);
        java.lang.Class<?> wildcardClass10 = intMath0.getClass();
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test055");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod((-6), (int) (short) 10);
        int int21 = intMath0.mod(0, (int) (byte) 10);
        java.lang.Class<?> wildcardClass22 = intMath0.getClass();
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test056");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(7, (int) (byte) 1);
        java.lang.Class<?> wildcardClass10 = intMath0.getClass();
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test057");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) 10, (int) (short) 1);
        int int6 = intMath0.mod(100, 99);
        java.lang.Class<?> wildcardClass7 = intMath0.getClass();
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test058");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod(5, 25);
        int int21 = intMath0.mod((int) (byte) 10, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = intMath0.mod((-6), (-100));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -100 must be > 0");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test059");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((-9), 9);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = intMath0.mod(25, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus 0 must be > 0");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test060");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod((-6), (int) (short) 10);
        int int21 = intMath0.mod((-7), 10);
        java.lang.Class<?> wildcardClass22 = intMath0.getClass();
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test061");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod((-100), 1);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = intMath0.mod(100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus 0 must be > 0");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test062");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(10, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = intMath0.mod(0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -1 must be > 0");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test063");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod((-2), 5);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = intMath0.mod(9, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -1 must be > 0");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test064");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = intMath0.mod((-7), (-100));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -100 must be > 0");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test065");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod((-2), 5);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = intMath0.mod(0, (-4));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -4 must be > 0");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test066");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(8, (int) '4');
        int int12 = intMath0.mod((int) (short) 10, 5);
        java.lang.Class<?> wildcardClass13 = intMath0.getClass();
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test067");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(10, 9);
        java.lang.Class<?> wildcardClass7 = intMath0.getClass();
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test068");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod(100, (int) 'a');
        int int6 = intMath0.mod((-4), 99);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = intMath0.mod((int) (short) 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus 0 must be > 0");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test069");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = intMath0.mod(4, (-10));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -10 must be > 0");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test070");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod((-8), 5);
        java.lang.Class<?> wildcardClass7 = intMath0.getClass();
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test071");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod((-6), (int) (short) 10);
        int int21 = intMath0.mod((-5), 3);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = intMath0.mod((-9), (-3));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -3 must be > 0");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test072");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod((-6), (int) (short) 10);
        int int21 = intMath0.mod((-7), 10);
        int int24 = intMath0.mod((int) ' ', (int) (byte) 1);
        java.lang.Class<?> wildcardClass25 = intMath0.getClass();
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test073");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((int) (short) -1, (int) '4');
        int int12 = intMath0.mod((int) '#', (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = intMath0.mod(25, (-7));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -7 must be > 0");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test074");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod(100, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int6 = intMath0.mod((-8), (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -1 must be > 0");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test075");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod((-6), (int) (short) 10);
        int int21 = intMath0.mod((-7), 10);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = intMath0.mod((-8), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus 0 must be > 0");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test076");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = intMath0.mod(25, (-8));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -8 must be > 0");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test077");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) 10, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = intMath0.mod((int) (short) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -1 must be > 0");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test078");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod(100, 8);
        java.lang.Class<?> wildcardClass19 = intMath0.getClass();
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test079");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod(5, 25);
        java.lang.Class<?> wildcardClass19 = intMath0.getClass();
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test080");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (byte) 0, 7);
        int int9 = intMath0.mod((int) '#', 3);
        java.lang.Class<?> wildcardClass10 = intMath0.getClass();
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test081");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(8, (int) '4');
        java.lang.Class<?> wildcardClass10 = intMath0.getClass();
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test082");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(7, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = intMath0.mod((int) (byte) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus 0 must be > 0");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test083");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod(5, 25);
        int int21 = intMath0.mod((int) (byte) -1, 88);
        int int24 = intMath0.mod(4, 10);
        java.lang.Class<?> wildcardClass25 = intMath0.getClass();
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test084");
        math.IntMath intMath0 = new math.IntMath();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = intMath0.mod(88, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus 0 must be > 0");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test085");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod((-6), (int) (short) 10);
        int int21 = intMath0.mod(0, (int) (byte) 10);
        int int24 = intMath0.mod(10, (int) '#');
        java.lang.Class<?> wildcardClass25 = intMath0.getClass();
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test086");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod(100, (int) 'a');
        int int6 = intMath0.mod((-100), (int) (byte) 10);
        java.lang.Class<?> wildcardClass7 = intMath0.getClass();
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test087");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((-9), 9);
        int int12 = intMath0.mod(25, (int) (short) 10);
        java.lang.Class<?> wildcardClass13 = intMath0.getClass();
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test088");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        java.lang.Class<?> wildcardClass7 = intMath0.getClass();
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test089");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(8, (int) '4');
        int int12 = intMath0.mod((int) (short) 10, 5);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = intMath0.mod((-9), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus 0 must be > 0");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test090");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(1, 100);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = intMath0.mod((-9), (-5));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -5 must be > 0");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test091");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) 10, (int) (short) 1);
        int int6 = intMath0.mod(100, 99);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = intMath0.mod(9, (-6));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -6 must be > 0");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test092");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(8, (int) '4');
        int int12 = intMath0.mod((int) (short) 10, 5);
        int int15 = intMath0.mod((int) (byte) 10, 4);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = intMath0.mod((-4), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus 0 must be > 0");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test093");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(8, (int) '4');
        int int12 = intMath0.mod((-5), 10);
        java.lang.Class<?> wildcardClass13 = intMath0.getClass();
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test094");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod((-6), (int) (short) 10);
        int int21 = intMath0.mod((-7), 10);
        int int24 = intMath0.mod((int) ' ', (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = intMath0.mod((int) (short) 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus 0 must be > 0");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test095");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod(5, 25);
        int int21 = intMath0.mod((int) (byte) 10, (int) (byte) 100);
        java.lang.Class<?> wildcardClass22 = intMath0.getClass();
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test096");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(10, 9);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = intMath0.mod((-4), (-3));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -3 must be > 0");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test097");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod((-2), 5);
        java.lang.Class<?> wildcardClass7 = intMath0.getClass();
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test098");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(9, (int) (byte) 10);
        int int12 = intMath0.mod((-9), (int) '#');
        int int15 = intMath0.mod(51, 10);
        int int18 = intMath0.mod(87, (int) (short) 100);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test099");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((int) (short) -1, (int) '4');
        int int12 = intMath0.mod((int) '#', (int) (byte) 100);
        int int15 = intMath0.mod(2, (int) (short) 100);
        java.lang.Class<?> wildcardClass16 = intMath0.getClass();
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test100");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod((int) (short) -1, 4);
        java.lang.Class<?> wildcardClass10 = intMath0.getClass();
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test101");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod((-6), (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = intMath0.mod((int) (byte) -1, (-10));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -10 must be > 0");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test102");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod((-8), 5);
        int int9 = intMath0.mod((int) (short) 1, 28);
        java.lang.Class<?> wildcardClass10 = intMath0.getClass();
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test103");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((-9), 9);
        int int12 = intMath0.mod(25, (int) (short) 10);
        int int15 = intMath0.mod((-4), (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int18 = intMath0.mod((-9), (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus 0 must be > 0");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test104");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((int) (short) -1, (int) '4');
        int int12 = intMath0.mod((int) '#', (int) (byte) 100);
        java.lang.Class<?> wildcardClass13 = intMath0.getClass();
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test105");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod(100, 8);
        int int21 = intMath0.mod(0, 3);
        java.lang.Class<?> wildcardClass22 = intMath0.getClass();
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test106");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod((-6), (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = intMath0.mod(6, (-8));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -8 must be > 0");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test107");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(5, (int) (byte) 10);
        java.lang.Class<?> wildcardClass13 = intMath0.getClass();
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test108");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod(5, 25);
        int int21 = intMath0.mod(9, 3);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = intMath0.mod(6, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -1 must be > 0");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test109");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod(5, 25);
        int int21 = intMath0.mod((int) (short) 100, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = intMath0.mod(2, (-7));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -7 must be > 0");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test110");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod((-100), 1);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = intMath0.mod((int) (byte) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus 0 must be > 0");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test111");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod(5, 25);
        int int21 = intMath0.mod((int) (short) 100, (int) (short) 10);
        java.lang.Class<?> wildcardClass22 = intMath0.getClass();
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test112");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((-1), (int) (byte) 100);
        java.lang.Class<?> wildcardClass16 = intMath0.getClass();
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test113");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(8, (int) '4');
        int int12 = intMath0.mod((int) (short) 10, 5);
        int int15 = intMath0.mod((int) '4', (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = intMath0.mod(100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -1 must be > 0");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test114");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod(5, 25);
        int int21 = intMath0.mod((int) '#', 1);
        java.lang.Class<?> wildcardClass22 = intMath0.getClass();
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test115");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(9, (int) (byte) 10);
        int int12 = intMath0.mod((-9), (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int15 = intMath0.mod(51, (-4));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -4 must be > 0");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test116");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod((-6), (int) (short) 10);
        int int21 = intMath0.mod((-5), 3);
        java.lang.Class<?> wildcardClass22 = intMath0.getClass();
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test117");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod((-6), (int) (short) 10);
        int int21 = intMath0.mod((-7), 10);
        int int24 = intMath0.mod((int) 'a', 26);
        int int27 = intMath0.mod(5, 3);
        java.lang.Class<?> wildcardClass28 = intMath0.getClass();
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test118");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = intMath0.mod((int) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus 0 must be > 0");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test119");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-3), 6);
        int int6 = intMath0.mod(3, (int) (byte) 1);
        java.lang.Class<?> wildcardClass7 = intMath0.getClass();
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test120");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod((int) (short) 0, 28);
        java.lang.Class<?> wildcardClass10 = intMath0.getClass();
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test121");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod((-3), 10);
        java.lang.Class<?> wildcardClass10 = intMath0.getClass();
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test122");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((-9), 9);
        int int12 = intMath0.mod(25, (int) (short) 10);
        int int15 = intMath0.mod((-8), 87);
        java.lang.Class<?> wildcardClass16 = intMath0.getClass();
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test123");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod((int) (short) -1, 87);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test124");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(0, 10);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = intMath0.mod((int) (byte) 0, (-10));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -10 must be > 0");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test125");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = intMath0.mod(3, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -1 must be > 0");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test126");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(0, 10);
        java.lang.Class<?> wildcardClass7 = intMath0.getClass();
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test127");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod((-4), (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = intMath0.mod((-100), (-10));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -10 must be > 0");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test128");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) 10, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = intMath0.mod(9, (-8));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -8 must be > 0");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test129");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod((-3), 10);
        int int12 = intMath0.mod(6, 79);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test130");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(9, (int) (byte) 10);
        int int12 = intMath0.mod((-9), (int) '#');
        int int15 = intMath0.mod((-5), 6);
        java.lang.Class<?> wildcardClass16 = intMath0.getClass();
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test131");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(8, (int) '4');
        int int12 = intMath0.mod((int) (short) 10, 5);
        int int15 = intMath0.mod((int) (short) 0, (int) (short) 1);
        java.lang.Class<?> wildcardClass16 = intMath0.getClass();
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test132");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, 5);
        int int9 = intMath0.mod((int) (short) 10, 99);
        int int12 = intMath0.mod(27, 28);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = intMath0.mod(88, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus 0 must be > 0");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test133");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod(5, 25);
        int int21 = intMath0.mod(9, 3);
        int int24 = intMath0.mod(95, 3);
        int int27 = intMath0.mod((-2), (int) (short) 100);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test134");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod((-7), 95);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = intMath0.mod((int) (byte) 0, (-7));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -7 must be > 0");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test135");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod((-8), 5);
        int int9 = intMath0.mod(0, 1);
        java.lang.Class<?> wildcardClass10 = intMath0.getClass();
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test136");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) 10, (int) (short) 1);
        int int6 = intMath0.mod(100, 99);
        int int9 = intMath0.mod(4, 26);
        java.lang.Class<?> wildcardClass10 = intMath0.getClass();
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test137");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(8, (int) '4');
        int int12 = intMath0.mod((int) (short) 10, 5);
        int int15 = intMath0.mod((int) '4', (int) (byte) 1);
        java.lang.Class<?> wildcardClass16 = intMath0.getClass();
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test138");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod(100, 8);
        int int21 = intMath0.mod(0, 3);
        int int24 = intMath0.mod((int) '4', (int) '#');
        java.lang.Class<?> wildcardClass25 = intMath0.getClass();
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test139");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod((-4), (int) (byte) 1);
        java.lang.Class<?> wildcardClass19 = intMath0.getClass();
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test140");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((-9), 9);
        int int12 = intMath0.mod(25, (int) (short) 10);
        int int15 = intMath0.mod(4, 1);
        java.lang.Class<?> wildcardClass16 = intMath0.getClass();
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test141");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (byte) 0, 7);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = intMath0.mod((int) (byte) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus 0 must be > 0");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test142");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((int) (short) -1, (int) '4');
        int int12 = intMath0.mod((int) '#', (int) (byte) 100);
        int int15 = intMath0.mod((-4), 1);
        java.lang.Class<?> wildcardClass16 = intMath0.getClass();
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test143");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod(5, 25);
        int int21 = intMath0.mod((int) '#', 1);
        int int24 = intMath0.mod(5, (int) (byte) 1);
        int int27 = intMath0.mod(99, 19);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test144");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(9, (int) (byte) 10);
        int int12 = intMath0.mod(0, (int) '4');
        int int15 = intMath0.mod(7, 7);
        java.lang.Class<?> wildcardClass16 = intMath0.getClass();
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test145");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((-1), (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = intMath0.mod(1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus 0 must be > 0");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test146");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, 5);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = intMath0.mod(1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus 0 must be > 0");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test147");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(5, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = intMath0.mod((-2), (-6));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -6 must be > 0");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test148");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod(5, 25);
        int int21 = intMath0.mod((int) '#', 1);
        int int24 = intMath0.mod(5, (int) (byte) 1);
        java.lang.Class<?> wildcardClass25 = intMath0.getClass();
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test149");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(1, 100);
        int int12 = intMath0.mod(0, 100);
        int int15 = intMath0.mod(35, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = intMath0.mod(26, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -1 must be > 0");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test150");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod(5, 25);
        int int21 = intMath0.mod(99, 3);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test151");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod(5, 25);
        int int21 = intMath0.mod(9, 3);
        int int24 = intMath0.mod(7, 99);
        int int27 = intMath0.mod(8, 2);
        java.lang.Class<?> wildcardClass28 = intMath0.getClass();
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test152");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(2, 88);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = intMath0.mod((-2), (-7));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -7 must be > 0");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test153");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(2, 88);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = intMath0.mod(25, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -1 must be > 0");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test154");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod((-6), (int) (short) 10);
        int int21 = intMath0.mod(0, (int) (byte) 10);
        int int24 = intMath0.mod(10, (int) '#');
        int int27 = intMath0.mod(99, (int) (byte) 100);
        java.lang.Class<?> wildcardClass28 = intMath0.getClass();
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test155");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod(100, (int) 'a');
        int int6 = intMath0.mod((-4), 99);
        int int9 = intMath0.mod(0, 88);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = intMath0.mod(88, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus 0 must be > 0");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test156");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((int) (short) -1, (int) '4');
        int int12 = intMath0.mod((int) '#', (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = intMath0.mod(25, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -1 must be > 0");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test157");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod(5, 25);
        int int21 = intMath0.mod((int) (byte) 10, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = intMath0.mod(17, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus 0 must be > 0");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test158");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, 5);
        int int9 = intMath0.mod((int) (short) 10, 99);
        int int12 = intMath0.mod(27, 28);
        java.lang.Class<?> wildcardClass13 = intMath0.getClass();
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test159");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = intMath0.mod((int) (byte) 10, (-6));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -6 must be > 0");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test160");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod((-8), 5);
        int int9 = intMath0.mod(0, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = intMath0.mod((-4), (-7));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -7 must be > 0");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test161");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod(5, 25);
        int int21 = intMath0.mod((int) (byte) -1, 88);
        java.lang.Class<?> wildcardClass22 = intMath0.getClass();
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test162");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(10, 1);
        int int15 = intMath0.mod((-7), 88);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test163");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod(100, 8);
        int int21 = intMath0.mod((int) (short) 10, 6);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = intMath0.mod((-6), (-9));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -9 must be > 0");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test164");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-3), 6);
        int int6 = intMath0.mod((int) (byte) 1, 10);
        int int9 = intMath0.mod((int) ' ', 3);
        java.lang.Class<?> wildcardClass10 = intMath0.getClass();
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test165");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, 5);
        java.lang.Class<?> wildcardClass7 = intMath0.getClass();
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test166");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod((-3), 10);
        int int12 = intMath0.mod(10, 99);
        java.lang.Class<?> wildcardClass13 = intMath0.getClass();
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test167");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(9, (int) (byte) 10);
        int int12 = intMath0.mod((-9), (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int15 = intMath0.mod((int) (short) 1, (-4));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -4 must be > 0");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test168");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(10, 1);
        int int15 = intMath0.mod(0, (int) (byte) 1);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test169");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-3), 6);
        int int6 = intMath0.mod((int) (byte) 1, 10);
        int int9 = intMath0.mod((int) ' ', 3);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = intMath0.mod(0, (-7));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -7 must be > 0");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test170");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, 5);
        int int9 = intMath0.mod((int) (short) 10, 99);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = intMath0.mod(4, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -1 must be > 0");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test171");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod(5, 25);
        int int21 = intMath0.mod((int) (byte) -1, 88);
        int int24 = intMath0.mod(4, 10);
        int int27 = intMath0.mod(1, 79);
        java.lang.Class<?> wildcardClass28 = intMath0.getClass();
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test172");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(8, (int) '4');
        int int12 = intMath0.mod((int) (short) 10, 5);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = intMath0.mod(4, (-10));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -10 must be > 0");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test173");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(8, (int) '4');
        int int12 = intMath0.mod((int) (short) 10, 5);
        int int15 = intMath0.mod((int) (short) 0, (int) (short) 1);
        int int18 = intMath0.mod(9, (int) (byte) 1);
        java.lang.Class<?> wildcardClass19 = intMath0.getClass();
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test174");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod((-6), (int) (short) 10);
        int int21 = intMath0.mod((-7), 10);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = intMath0.mod(100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus 0 must be > 0");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test175");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod(5, 25);
        int int21 = intMath0.mod((int) (byte) 10, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = intMath0.mod((int) (byte) -1, (-3));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -3 must be > 0");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test176");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(86, 10);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test177");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(1, 100);
        int int12 = intMath0.mod(0, 100);
        int int15 = intMath0.mod((int) (short) 10, 28);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test178");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((-9), 9);
        int int12 = intMath0.mod(25, (int) (short) 10);
        int int15 = intMath0.mod(25, 51);
        int int18 = intMath0.mod(4, 8);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = intMath0.mod(25, (-10));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -10 must be > 0");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test179");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(8, (int) '4');
        int int12 = intMath0.mod((int) (short) 10, 5);
        int int15 = intMath0.mod((int) (short) 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = intMath0.mod((int) '4', (-5));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -5 must be > 0");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test180");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((int) (short) -1, (int) '4');
        int int12 = intMath0.mod((int) '#', (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) 10, 10);
        java.lang.Class<?> wildcardClass16 = intMath0.getClass();
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test181");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((int) (byte) -1, 8);
        java.lang.Class<?> wildcardClass10 = intMath0.getClass();
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test182");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(10, 9);
        int int9 = intMath0.mod((int) '4', 1);
        int int12 = intMath0.mod(79, 1);
        java.lang.Class<?> wildcardClass13 = intMath0.getClass();
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test183");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((int) (short) -1, (int) '4');
        int int12 = intMath0.mod((int) '#', (int) (byte) 100);
        int int15 = intMath0.mod((-4), 1);
        int int18 = intMath0.mod(17, 26);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test184");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((int) (short) -1, (int) '4');
        int int12 = intMath0.mod((int) '#', (int) (byte) 100);
        int int15 = intMath0.mod(2, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = intMath0.mod((int) (byte) 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -1 must be > 0");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test185");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = intMath0.mod((int) (short) 10, (-9));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -9 must be > 0");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test186");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-3), 6);
        int int6 = intMath0.mod((int) (byte) 1, 10);
        int int9 = intMath0.mod((int) (short) -1, 6);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test187");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((int) (short) -1, (int) '4');
        int int12 = intMath0.mod((int) '#', (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) 10, 10);
        int int18 = intMath0.mod(79, 10);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = intMath0.mod(77, (-3));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -3 must be > 0");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test188");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) 10, (int) (short) 1);
        int int6 = intMath0.mod(100, 99);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = intMath0.mod((-2), (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -1 must be > 0");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test189");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((-9), 9);
        int int12 = intMath0.mod(25, (int) (short) 10);
        int int15 = intMath0.mod((-4), 4);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = intMath0.mod(0, (-8));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -8 must be > 0");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test190");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((-9), 9);
        int int12 = intMath0.mod(25, (int) (short) 10);
        int int15 = intMath0.mod(25, 51);
        int int18 = intMath0.mod(4, 8);
        java.lang.Class<?> wildcardClass19 = intMath0.getClass();
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test191");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod(5, 25);
        int int21 = intMath0.mod(9, 3);
        int int24 = intMath0.mod(95, 3);
        java.lang.Class<?> wildcardClass25 = intMath0.getClass();
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test192");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(1, 100);
        int int12 = intMath0.mod(0, 100);
        int int15 = intMath0.mod(2, (int) (short) 100);
        int int18 = intMath0.mod((-3), 1);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test193");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod(5, 25);
        int int21 = intMath0.mod(9, 3);
        java.lang.Class<?> wildcardClass22 = intMath0.getClass();
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test194");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod(100, (int) 'a');
        int int6 = intMath0.mod((-100), (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = intMath0.mod((-6), (-7));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -7 must be > 0");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test195");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod(100, 8);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = intMath0.mod(95, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus 0 must be > 0");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test196");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod(5, 25);
        int int21 = intMath0.mod(9, 3);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = intMath0.mod((-10), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus 0 must be > 0");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test197");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(10, 1);
        int int15 = intMath0.mod(7, 6);
        java.lang.Class<?> wildcardClass16 = intMath0.getClass();
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test198");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod(5, 25);
        int int21 = intMath0.mod((int) (byte) -1, 88);
        int int24 = intMath0.mod(4, 10);
        int int27 = intMath0.mod(1, 79);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = intMath0.mod(3, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus 0 must be > 0");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test199");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-3), 6);
        int int6 = intMath0.mod((int) (byte) 1, 10);
        int int9 = intMath0.mod(51, 77);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test200");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((-1), (int) (byte) 100);
        int int18 = intMath0.mod(79, 79);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test201");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod((-6), (int) (short) 10);
        int int21 = intMath0.mod(0, (int) (byte) 10);
        int int24 = intMath0.mod(8, 81);
        java.lang.Class<?> wildcardClass25 = intMath0.getClass();
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test202");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(1, 100);
        int int12 = intMath0.mod(0, 100);
        int int15 = intMath0.mod((int) (short) 0, 4);
        int int18 = intMath0.mod(51, 26);
        int int21 = intMath0.mod(74, 5);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test203");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(5, 17);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test204");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((-3), 4);
        int int9 = intMath0.mod((int) (byte) 10, 7);
        java.lang.Class<?> wildcardClass10 = intMath0.getClass();
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test205");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) 10, (int) (short) 1);
        int int6 = intMath0.mod(100, 99);
        int int9 = intMath0.mod((int) (byte) 0, (int) '#');
        int int12 = intMath0.mod(0, 95);
        int int15 = intMath0.mod(79, 10);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test206");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod(100, (int) 'a');
        int int6 = intMath0.mod((-4), 99);
        int int9 = intMath0.mod((-8), 9);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = intMath0.mod(4, (-10));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -10 must be > 0");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test207");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod((int) (short) -1, 4);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = intMath0.mod(9, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -1 must be > 0");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test208");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((-9), 9);
        int int12 = intMath0.mod(25, (int) (short) 10);
        int int15 = intMath0.mod(4, 1);
        int int18 = intMath0.mod((-10), 10);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test209");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(10, 9);
        int int9 = intMath0.mod((int) 'a', 4);
        java.lang.Class<?> wildcardClass10 = intMath0.getClass();
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test210");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(8, (int) '4');
        int int12 = intMath0.mod((int) (short) 10, 5);
        int int15 = intMath0.mod((int) (short) 0, (int) (short) 1);
        int int18 = intMath0.mod(9, (int) (byte) 1);
        int int21 = intMath0.mod((int) (short) 0, 87);
        java.lang.Class<?> wildcardClass22 = intMath0.getClass();
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test211");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod(5, 25);
        int int21 = intMath0.mod((int) '#', 1);
        int int24 = intMath0.mod(5, (int) (byte) 1);
        int int27 = intMath0.mod(0, 87);
        java.lang.Class<?> wildcardClass28 = intMath0.getClass();
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test212");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod((-6), (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = intMath0.mod(0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus 0 must be > 0");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test213");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-3), 6);
        int int6 = intMath0.mod((-3), 3);
        java.lang.Class<?> wildcardClass7 = intMath0.getClass();
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test214");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(0, 10);
        int int9 = intMath0.mod((-3), 1);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test215");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((-3), 4);
        int int9 = intMath0.mod(7, 2);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test216");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((-3), 4);
        int int9 = intMath0.mod(0, 54);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test217");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-3), 6);
        int int6 = intMath0.mod((int) (byte) 1, 10);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = intMath0.mod((-8), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus 0 must be > 0");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test218");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (byte) 0, 7);
        int int9 = intMath0.mod((int) '#', 3);
        int int12 = intMath0.mod(1, (int) '4');
        java.lang.Class<?> wildcardClass13 = intMath0.getClass();
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test219");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod(100, (int) 'a');
        int int6 = intMath0.mod((-4), 99);
        int int9 = intMath0.mod(0, 88);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = intMath0.mod((-1), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus 0 must be > 0");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test220");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((int) (short) -1, (int) '4');
        int int12 = intMath0.mod((-6), 95);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test221");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(1, 100);
        int int12 = intMath0.mod(0, 100);
        int int15 = intMath0.mod(0, 28);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = intMath0.mod((int) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus 0 must be > 0");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test222");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(9, (int) (byte) 10);
        int int12 = intMath0.mod((-9), (int) '#');
        int int15 = intMath0.mod(51, 10);
        java.lang.Class<?> wildcardClass16 = intMath0.getClass();
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test223");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((-9), 9);
        int int12 = intMath0.mod(25, (int) (short) 10);
        int int15 = intMath0.mod((-4), 4);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = intMath0.mod(0, (-9));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -9 must be > 0");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test224");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, 5);
        int int9 = intMath0.mod((int) (short) 10, 99);
        int int12 = intMath0.mod(27, 28);
        int int15 = intMath0.mod((-2), 1);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test225");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(10, 9);
        int int9 = intMath0.mod((int) '4', 1);
        int int12 = intMath0.mod(79, 1);
        int int15 = intMath0.mod(0, 10);
        java.lang.Class<?> wildcardClass16 = intMath0.getClass();
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test226");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(10, 9);
        int int9 = intMath0.mod((int) 'a', 4);
        int int12 = intMath0.mod((-100), 77);
        java.lang.Class<?> wildcardClass13 = intMath0.getClass();
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test227");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(8, (int) '4');
        int int12 = intMath0.mod((int) (short) 10, 5);
        int int15 = intMath0.mod((int) '4', (int) (byte) 1);
        int int18 = intMath0.mod((-100), 100);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test228");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(9, (int) (byte) 10);
        int int12 = intMath0.mod((-9), (int) '#');
        int int15 = intMath0.mod(87, 4);
        int int18 = intMath0.mod(95, 19);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test229");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod(100, (int) 'a');
        int int6 = intMath0.mod((-4), 99);
        int int9 = intMath0.mod(0, 88);
        java.lang.Class<?> wildcardClass10 = intMath0.getClass();
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test230");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod((-8), 5);
        int int9 = intMath0.mod((int) (short) 1, 28);
        int int12 = intMath0.mod(95, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = intMath0.mod((-2), (-100));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -100 must be > 0");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test231");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(1, 100);
        int int12 = intMath0.mod(0, 100);
        int int15 = intMath0.mod(0, 28);
        java.lang.Class<?> wildcardClass16 = intMath0.getClass();
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test232");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(7, (int) (byte) 1);
        int int12 = intMath0.mod(100, 9);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = intMath0.mod(35, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus 0 must be > 0");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test233");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        java.lang.Class<?> wildcardClass4 = intMath0.getClass();
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test234");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(1, 100);
        int int12 = intMath0.mod(0, 100);
        int int15 = intMath0.mod(2, (int) (short) 100);
        int int18 = intMath0.mod(54, 4);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test235");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) 10, (int) (short) 1);
        int int6 = intMath0.mod((-2), 100);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = intMath0.mod(95, (-2));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -2 must be > 0");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test236");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-3), 6);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = intMath0.mod(54, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -1 must be > 0");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test237");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(9, (int) (byte) 10);
        int int12 = intMath0.mod((-9), (int) '#');
        int int15 = intMath0.mod((-7), (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int18 = intMath0.mod((int) '#', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -1 must be > 0");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test238");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(8, (int) '4');
        int int12 = intMath0.mod((int) (short) 10, 5);
        int int15 = intMath0.mod((int) (byte) 10, 4);
        int int18 = intMath0.mod((int) (byte) 0, (int) '4');
        java.lang.Class<?> wildcardClass19 = intMath0.getClass();
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test239");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((int) (short) -1, (int) '4');
        int int12 = intMath0.mod((int) '#', (int) (byte) 100);
        int int15 = intMath0.mod(9, 7);
        int int18 = intMath0.mod((int) (short) 10, 88);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test240");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod((-2), 5);
        int int9 = intMath0.mod(28, 77);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = intMath0.mod(6, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus 0 must be > 0");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test241");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(2, 88);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = intMath0.mod((-3), (-4));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -4 must be > 0");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test242");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(9, (int) (byte) 10);
        int int12 = intMath0.mod((-9), (int) '#');
        int int15 = intMath0.mod(51, 10);
        int int18 = intMath0.mod(54, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = intMath0.mod(89, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -1 must be > 0");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test243");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(8, (int) '4');
        int int12 = intMath0.mod((int) (short) 10, 5);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = intMath0.mod(0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -1 must be > 0");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test244");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(1, 100);
        int int12 = intMath0.mod(0, 100);
        int int15 = intMath0.mod((int) (short) 0, 4);
        java.lang.Class<?> wildcardClass16 = intMath0.getClass();
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test245");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) 10, (int) (short) 1);
        int int6 = intMath0.mod(100, 99);
        int int9 = intMath0.mod((int) (byte) 100, 100);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = intMath0.mod(26, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -1 must be > 0");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test246");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod((-3), 10);
        int int12 = intMath0.mod(10, 99);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = intMath0.mod((int) (short) 1, (-4));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -4 must be > 0");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test247");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod((-6), (int) (short) 10);
        int int21 = intMath0.mod((-5), 3);
        int int24 = intMath0.mod(10, (int) (short) 10);
        java.lang.Class<?> wildcardClass25 = intMath0.getClass();
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test248");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = intMath0.mod(7, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -1 must be > 0");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test249");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((-9), 9);
        int int12 = intMath0.mod(25, (int) (short) 10);
        int int15 = intMath0.mod(25, 51);
        int int18 = intMath0.mod((int) (byte) 1, (int) (short) 1);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test250");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((-9), 9);
        int int12 = intMath0.mod(25, (int) (short) 10);
        int int15 = intMath0.mod(25, 6);
        int int18 = intMath0.mod(54, 98);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test251");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, 5);
        int int9 = intMath0.mod((int) (short) 10, 99);
        int int12 = intMath0.mod(27, 28);
        int int15 = intMath0.mod(6, 99);
        java.lang.Class<?> wildcardClass16 = intMath0.getClass();
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test252");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod((-8), 5);
        int int9 = intMath0.mod(0, 1);
        int int12 = intMath0.mod((int) '4', 17);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test253");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod((-6), (int) (short) 10);
        int int21 = intMath0.mod((-5), 3);
        int int24 = intMath0.mod(98, 3);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test254");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (byte) 0, 7);
        int int9 = intMath0.mod((int) '#', 3);
        int int12 = intMath0.mod(0, (int) (short) 1);
        int int15 = intMath0.mod(19, 98);
        int int18 = intMath0.mod(1, 86);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test255");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod((-8), 5);
        int int9 = intMath0.mod((int) (short) 1, 28);
        int int12 = intMath0.mod(95, (int) (byte) 1);
        int int15 = intMath0.mod(6, 8);
        java.lang.Class<?> wildcardClass16 = intMath0.getClass();
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test256");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) 10, (int) (short) 1);
        int int6 = intMath0.mod(100, 99);
        int int9 = intMath0.mod((int) (byte) 0, (int) '#');
        java.lang.Class<?> wildcardClass10 = intMath0.getClass();
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test257");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod(5, 25);
        int int21 = intMath0.mod((int) (byte) -1, 88);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = intMath0.mod((int) (short) 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus 0 must be > 0");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test258");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) 10, (int) (short) 1);
        int int6 = intMath0.mod((-2), 100);
        java.lang.Class<?> wildcardClass7 = intMath0.getClass();
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test259");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(35, (int) (short) 10);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test260");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod((-6), (int) (short) 10);
        int int21 = intMath0.mod((-5), 3);
        int int24 = intMath0.mod(10, (int) (short) 10);
        int int27 = intMath0.mod(0, (int) (short) 10);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test261");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod(100, (int) 'a');
        int int6 = intMath0.mod(0, 5);
        int int9 = intMath0.mod(5, 99);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test262");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, 5);
        int int9 = intMath0.mod((int) (short) 10, 99);
        int int12 = intMath0.mod(51, 2);
        java.lang.Class<?> wildcardClass13 = intMath0.getClass();
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test263");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod((-6), (int) (short) 10);
        int int21 = intMath0.mod(0, (int) (byte) 10);
        int int24 = intMath0.mod(4, 27);
        java.lang.Class<?> wildcardClass25 = intMath0.getClass();
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test264");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((int) (short) -1, (int) '4');
        int int12 = intMath0.mod((int) '#', (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = intMath0.mod(9, (-10));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -10 must be > 0");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test265");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((-9), 9);
        int int12 = intMath0.mod(25, (int) (short) 10);
        int int15 = intMath0.mod((-4), 4);
        int int18 = intMath0.mod(86, 99);
        java.lang.Class<?> wildcardClass19 = intMath0.getClass();
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test266");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod(9, 3);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test267");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((-9), 9);
        int int12 = intMath0.mod(25, (int) (short) 10);
        int int15 = intMath0.mod(25, 6);
        int int18 = intMath0.mod(86, 7);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = intMath0.mod(88, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus 0 must be > 0");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test268");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(1, 100);
        int int12 = intMath0.mod(0, 100);
        int int15 = intMath0.mod(0, 28);
        int int18 = intMath0.mod((-100), 35);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test269");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(7, (int) (byte) 1);
        int int12 = intMath0.mod(100, 9);
        int int15 = intMath0.mod(26, 27);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test270");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, 5);
        int int9 = intMath0.mod((int) (short) 10, 99);
        int int12 = intMath0.mod(51, 2);
        int int15 = intMath0.mod((int) (byte) 0, (int) (byte) 100);
        java.lang.Class<?> wildcardClass16 = intMath0.getClass();
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test271");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((-9), 9);
        int int12 = intMath0.mod(25, (int) (short) 10);
        int int15 = intMath0.mod(4, 1);
        int int18 = intMath0.mod(35, (int) (byte) 10);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test272");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod(100, 8);
        int int21 = intMath0.mod(79, (int) (byte) 10);
        int int24 = intMath0.mod(1, 77);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test273");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, 5);
        int int9 = intMath0.mod((int) (short) 10, 99);
        int int12 = intMath0.mod(27, 28);
        int int15 = intMath0.mod(6, 99);
        int int18 = intMath0.mod(86, 88);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = intMath0.mod(100, (-5));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -5 must be > 0");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test274");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod(100, (int) 'a');
        int int6 = intMath0.mod((-4), 99);
        int int9 = intMath0.mod((-8), 9);
        int int12 = intMath0.mod((int) (short) 100, (int) (byte) 100);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test275");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(8, (int) '4');
        int int12 = intMath0.mod((-9), 81);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test276");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-3), 6);
        int int6 = intMath0.mod((int) (byte) 1, 10);
        int int9 = intMath0.mod(17, 5);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test277");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(9, (int) (byte) 10);
        int int12 = intMath0.mod((-9), (int) '#');
        int int15 = intMath0.mod(51, 10);
        int int18 = intMath0.mod(54, (int) (short) 100);
        java.lang.Class<?> wildcardClass19 = intMath0.getClass();
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test278");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(8, (int) '4');
        int int12 = intMath0.mod((int) (short) 10, 5);
        int int15 = intMath0.mod((int) (short) 0, (int) (short) 1);
        int int18 = intMath0.mod(9, (int) (byte) 1);
        int int21 = intMath0.mod(95, 19);
        int int24 = intMath0.mod(89, 77);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test279");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod((-7), 95);
        int int15 = intMath0.mod(35, (int) 'a');
        int int18 = intMath0.mod((int) '4', 95);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test280");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(10, 1);
        int int15 = intMath0.mod(7, 6);
        int int18 = intMath0.mod(0, 27);
        java.lang.Class<?> wildcardClass19 = intMath0.getClass();
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test281");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = intMath0.mod(0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -1 must be > 0");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test282");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((-9), 9);
        int int12 = intMath0.mod(25, (int) (short) 10);
        int int15 = intMath0.mod(87, 3);
        java.lang.Class<?> wildcardClass16 = intMath0.getClass();
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test283");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod((-6), (int) (short) 10);
        int int21 = intMath0.mod(0, (int) (byte) 10);
        int int24 = intMath0.mod(4, 27);
        int int27 = intMath0.mod((-1), 35);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test284");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, 5);
        int int9 = intMath0.mod(0, 12);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test285");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod(4, 32);
        int int21 = intMath0.mod(100, (int) '#');
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test286");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((-3), 4);
        int int9 = intMath0.mod(87, (int) (byte) 100);
        java.lang.Class<?> wildcardClass10 = intMath0.getClass();
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test287");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((int) (byte) -1, 8);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = intMath0.mod((int) (short) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus 0 must be > 0");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test288");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(9, (int) (byte) 10);
        int int12 = intMath0.mod((-9), (int) '#');
        int int15 = intMath0.mod((-7), (int) ' ');
        int int18 = intMath0.mod(0, 26);
        int int21 = intMath0.mod(100, 3);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test289");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod(100, 8);
        int int21 = intMath0.mod(79, (int) (byte) 10);
        int int24 = intMath0.mod(1, (int) (byte) 100);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test290");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(10, 9);
        int int9 = intMath0.mod((int) '4', 1);
        java.lang.Class<?> wildcardClass10 = intMath0.getClass();
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test291");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (byte) 0, 7);
        int int9 = intMath0.mod((int) '#', 3);
        int int12 = intMath0.mod(0, (int) (short) 1);
        int int15 = intMath0.mod(4, 8);
        int int18 = intMath0.mod(1, 51);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test292");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(9, (int) (byte) 10);
        int int12 = intMath0.mod((-9), (int) '#');
        int int15 = intMath0.mod((-7), (int) ' ');
        int int18 = intMath0.mod(0, 26);
        int int21 = intMath0.mod(8, (int) (byte) 10);
        java.lang.Class<?> wildcardClass22 = intMath0.getClass();
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test293");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((-9), 9);
        int int12 = intMath0.mod(25, (int) (short) 10);
        int int15 = intMath0.mod(25, 51);
        int int18 = intMath0.mod(4, 8);
        int int21 = intMath0.mod((-100), 87);
        int int24 = intMath0.mod(17, 72);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test294");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod((int) '4', (int) (byte) 10);
        int int15 = intMath0.mod((-6), 8);
        java.lang.Class<?> wildcardClass16 = intMath0.getClass();
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test295");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (byte) 0, 7);
        int int9 = intMath0.mod((int) '#', 3);
        int int12 = intMath0.mod(0, (int) (short) 1);
        int int15 = intMath0.mod(19, 98);
        java.lang.Class<?> wildcardClass16 = intMath0.getClass();
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test296");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(9, (int) (byte) 10);
        int int12 = intMath0.mod((-9), (int) '#');
        int int15 = intMath0.mod((-7), (int) ' ');
        int int18 = intMath0.mod((int) ' ', (int) (byte) 100);
        int int21 = intMath0.mod((int) '#', 100);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test297");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(10, 9);
        int int9 = intMath0.mod((int) '4', 1);
        int int12 = intMath0.mod((int) (byte) 0, 32);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test298");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod(5, 25);
        int int21 = intMath0.mod((int) (short) 100, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = intMath0.mod((-9), (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -1 must be > 0");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test299");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod(0, 26);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test300");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod(5, 25);
        int int21 = intMath0.mod((int) (byte) -1, 88);
        int int24 = intMath0.mod(4, 10);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = intMath0.mod(30, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus 0 must be > 0");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test301");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod(5, 25);
        int int21 = intMath0.mod(9, 3);
        int int24 = intMath0.mod(7, 99);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = intMath0.mod((-9), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus 0 must be > 0");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test302");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (byte) 0, 7);
        int int9 = intMath0.mod((-10), 87);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = intMath0.mod((-3), (-100));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -100 must be > 0");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test303");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod((int) (short) -1, 4);
        int int12 = intMath0.mod((-1), 8);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = intMath0.mod((-2), (-4));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -4 must be > 0");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test304");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod((-2), 5);
        int int9 = intMath0.mod(79, 86);
        java.lang.Class<?> wildcardClass10 = intMath0.getClass();
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test305");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((int) (short) -1, (int) '4');
        int int12 = intMath0.mod((int) '#', (int) (byte) 100);
        int int15 = intMath0.mod(2, (int) (short) 100);
        int int18 = intMath0.mod((int) (short) 0, 17);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test306");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod(5, 25);
        int int21 = intMath0.mod((int) '#', 1);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = intMath0.mod((int) '#', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus 0 must be > 0");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test307");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod((-6), (int) (short) 10);
        int int21 = intMath0.mod(32, 8);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test308");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod((-8), 5);
        int int9 = intMath0.mod(0, 1);
        int int12 = intMath0.mod(77, 77);
        java.lang.Class<?> wildcardClass13 = intMath0.getClass();
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test309");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod((-6), (int) (short) 10);
        int int21 = intMath0.mod((-7), 10);
        int int24 = intMath0.mod((int) 'a', 26);
        int int27 = intMath0.mod(72, 27);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test310");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod((int) (short) 0, 2);
        int int15 = intMath0.mod(17, 51);
        java.lang.Class<?> wildcardClass16 = intMath0.getClass();
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test311");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 35);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test312");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) 10, (int) (short) 1);
        int int6 = intMath0.mod((-2), 100);
        int int9 = intMath0.mod((-6), 52);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test313");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) 10, (int) (short) 1);
        int int6 = intMath0.mod((-2), 100);
        int int9 = intMath0.mod((int) (short) 1, (int) ' ');
        java.lang.Class<?> wildcardClass10 = intMath0.getClass();
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test314");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod((-8), 5);
        int int9 = intMath0.mod(0, 1);
        int int12 = intMath0.mod((-8), 19);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test315");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(9, (int) (byte) 10);
        int int12 = intMath0.mod((-9), (int) '#');
        int int15 = intMath0.mod(51, 10);
        int int18 = intMath0.mod(54, (int) (short) 100);
        int int21 = intMath0.mod((-1), 100);
        java.lang.Class<?> wildcardClass22 = intMath0.getClass();
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test316");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((-9), 9);
        int int12 = intMath0.mod(25, (int) (short) 10);
        int int15 = intMath0.mod((-8), 87);
        int int18 = intMath0.mod(0, 12);
        int int21 = intMath0.mod((int) (byte) 1, 87);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test317");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((-9), 9);
        int int12 = intMath0.mod(25, (int) (short) 10);
        int int15 = intMath0.mod(25, 51);
        int int18 = intMath0.mod(4, 8);
        int int21 = intMath0.mod((-100), 87);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = intMath0.mod(17, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -1 must be > 0");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test318");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (byte) 0, 7);
        int int9 = intMath0.mod((-10), 87);
        java.lang.Class<?> wildcardClass10 = intMath0.getClass();
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test319");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = intMath0.mod((int) ' ', (-9));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -9 must be > 0");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test320");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, 5);
        int int9 = intMath0.mod((int) (short) 10, 99);
        int int12 = intMath0.mod(27, 28);
        int int15 = intMath0.mod((-6), 54);
        int int18 = intMath0.mod(86, 17);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test321");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((int) (short) -1, (int) '4');
        int int12 = intMath0.mod((int) '#', (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) 10, 10);
        int int18 = intMath0.mod((int) 'a', 4);
        int int21 = intMath0.mod(35, 10);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test322");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-3), 6);
        int int6 = intMath0.mod(3, (int) (byte) 1);
        int int9 = intMath0.mod((-1), 3);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = intMath0.mod((int) (byte) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus 0 must be > 0");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test323");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod(5, 25);
        int int21 = intMath0.mod((int) (short) 100, (int) (short) 10);
        int int24 = intMath0.mod((int) '4', 8);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = intMath0.mod((int) (short) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus 0 must be > 0");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test324");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod(5, 25);
        int int21 = intMath0.mod((int) '#', 1);
        int int24 = intMath0.mod(25, 6);
        int int27 = intMath0.mod((int) (byte) 1, 25);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test325");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(35, (int) (short) 1);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test326");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(9, (int) (byte) 10);
        int int12 = intMath0.mod((-9), (int) '#');
        int int15 = intMath0.mod((-7), (int) ' ');
        int int18 = intMath0.mod(99, (int) ' ');
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test327");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((int) (byte) -1, 8);
        int int12 = intMath0.mod(32, 10);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "IntMathTester0.test328");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((-9), 9);
        int int12 = intMath0.mod(25, (int) (short) 10);
        int int15 = intMath0.mod(4, 1);
        int int18 = intMath0.mod((int) 'a', 35);
        java.lang.Class<?> wildcardClass19 = intMath0.getClass();
    }
}

