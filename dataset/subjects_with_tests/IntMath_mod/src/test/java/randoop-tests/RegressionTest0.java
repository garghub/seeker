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
        math.IntMath intMath0 = new math.IntMath();
        java.lang.Class<?> wildcardClass1 = intMath0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        math.IntMath intMath0 = new math.IntMath();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = intMath0.mod((int) (byte) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus 0 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) 1, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = intMath0.mod((int) (short) 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -1 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) -1, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int6 = intMath0.mod(0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -1 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 96 + "'", int3 == 96);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) -1, (int) 'a');
        java.lang.Class<?> wildcardClass4 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 96 + "'", int3 == 96);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) 10, (int) (short) 1);
        java.lang.Class<?> wildcardClass4 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) -1, (int) 'a');
        int int6 = intMath0.mod((int) (short) 10, (int) '4');
        java.lang.Class<?> wildcardClass7 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 96 + "'", int3 == 96);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) 1, (int) (byte) 10);
        int int6 = intMath0.mod((int) (short) 0, (int) (byte) 1);
        java.lang.Class<?> wildcardClass7 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) 10, (int) (short) 1);
        int int6 = intMath0.mod((int) (byte) 10, (int) (byte) 10);
        java.lang.Class<?> wildcardClass7 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) -1, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int6 = intMath0.mod((int) (byte) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus 0 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 96 + "'", int3 == 96);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (byte) 10, (int) '4');
        java.lang.Class<?> wildcardClass4 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) 1, (int) (byte) 10);
        int int6 = intMath0.mod((int) (short) 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = intMath0.mod((int) 'a', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus 0 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) 10, (int) (short) 1);
        int int6 = intMath0.mod((int) (byte) 10, (int) (byte) 10);
        int int9 = intMath0.mod((int) (short) -1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = intMath0.mod(0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus 0 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) -1, (int) 'a');
        int int6 = intMath0.mod((int) (short) 10, (int) '4');
        int int9 = intMath0.mod((int) (byte) 1, (int) (short) 10);
        java.lang.Class<?> wildcardClass10 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 96 + "'", int3 == 96);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) 10, (int) (short) 1);
        int int6 = intMath0.mod((int) (byte) 10, (int) (byte) 10);
        int int9 = intMath0.mod(96, (int) (short) 10);
        java.lang.Class<?> wildcardClass10 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 6 + "'", int9 == 6);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) 1, (int) (byte) 10);
        int int6 = intMath0.mod((int) (short) 0, (int) (byte) 1);
        int int9 = intMath0.mod((int) (byte) 1, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) 10, (int) (short) 1);
        int int6 = intMath0.mod((int) (byte) 10, (int) (byte) 10);
        int int9 = intMath0.mod((int) (short) -1, (int) (short) 1);
        java.lang.Class<?> wildcardClass10 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) -1, (int) 'a');
        int int6 = intMath0.mod((int) '#', 1);
        java.lang.Class<?> wildcardClass7 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 96 + "'", int3 == 96);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) 10, (int) (short) 1);
        int int6 = intMath0.mod((-1), (int) (byte) 10);
        java.lang.Class<?> wildcardClass7 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) 1, (int) (byte) 10);
        java.lang.Class<?> wildcardClass4 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) 1, (int) (byte) 10);
        int int6 = intMath0.mod((int) (short) 0, (int) (byte) 1);
        int int9 = intMath0.mod((int) 'a', (int) (byte) 1);
        java.lang.Class<?> wildcardClass10 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) 10, (int) (short) 1);
        int int6 = intMath0.mod((int) (byte) 10, (int) (byte) 10);
        int int9 = intMath0.mod(96, (int) (short) 10);
        int int12 = intMath0.mod((int) (byte) 0, 6);
        java.lang.Class<?> wildcardClass13 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 6 + "'", int9 == 6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) 1, (int) (byte) 10);
        int int6 = intMath0.mod((int) (byte) 100, 1);
        java.lang.Class<?> wildcardClass7 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) -1, (int) 'a');
        int int6 = intMath0.mod((int) (short) 10, (int) '4');
        int int9 = intMath0.mod((int) (byte) 1, (int) (short) 10);
        int int12 = intMath0.mod((int) (short) 1, 96);
        java.lang.Class<?> wildcardClass13 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 96 + "'", int3 == 96);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) -1, (int) 'a');
        int int6 = intMath0.mod((int) '#', 1);
        int int9 = intMath0.mod(10, 52);
        java.lang.Class<?> wildcardClass10 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 96 + "'", int3 == 96);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) 10, (int) (short) 1);
        int int6 = intMath0.mod((-1), (int) (byte) 10);
        int int9 = intMath0.mod(6, 96);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 6 + "'", int9 == 6);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) 10, (int) (short) 1);
        int int6 = intMath0.mod((-1), (int) (byte) 10);
        int int9 = intMath0.mod((int) (short) 0, 96);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (byte) 10, (int) '4');
        int int6 = intMath0.mod(6, (int) (short) 100);
        java.lang.Class<?> wildcardClass7 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) 10, (int) (short) 1);
        int int6 = intMath0.mod((int) (byte) 10, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = intMath0.mod((int) (short) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -1 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) 1, (int) (byte) 10);
        int int6 = intMath0.mod((int) (short) 0, (int) (byte) 1);
        int int9 = intMath0.mod(9, (int) ' ');
        java.lang.Class<?> wildcardClass10 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) -1, (int) 'a');
        int int6 = intMath0.mod((int) '#', 1);
        int int9 = intMath0.mod((int) (byte) 100, (int) (byte) 1);
        java.lang.Class<?> wildcardClass10 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 96 + "'", int3 == 96);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) 1, (int) (byte) 10);
        int int6 = intMath0.mod((int) (short) 0, (int) (byte) 1);
        int int9 = intMath0.mod((int) 'a', (int) (byte) 1);
        int int12 = intMath0.mod((int) (byte) -1, 2);
        int int15 = intMath0.mod((int) '4', 96);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = intMath0.mod((int) (short) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -1 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) 1, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = intMath0.mod((int) (short) 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -1 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) 1, (int) (byte) 10);
        int int6 = intMath0.mod(52, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = intMath0.mod((int) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus 0 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (byte) 10, (int) '4');
        int int6 = intMath0.mod((int) '#', (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) 1, (int) (byte) 10);
        int int6 = intMath0.mod((int) (short) 0, (int) (byte) 1);
        int int9 = intMath0.mod((int) (short) 0, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (byte) 10, (int) '4');
        int int6 = intMath0.mod((int) '#', (int) (short) 1);
        int int9 = intMath0.mod((int) ' ', 2);
        int int12 = intMath0.mod(0, 52);
        java.lang.Class<?> wildcardClass13 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) -1, (int) 'a');
        int int6 = intMath0.mod((int) (short) 10, (int) '4');
        int int9 = intMath0.mod((int) (byte) 1, (int) (short) 10);
        int int12 = intMath0.mod(10, (int) (short) 100);
        int int15 = intMath0.mod((int) '4', 96);
        java.lang.Class<?> wildcardClass16 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 96 + "'", int3 == 96);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) -1, (int) 'a');
        int int6 = intMath0.mod((int) (short) 10, (int) '4');
        int int9 = intMath0.mod((int) (byte) 1, (int) (short) 10);
        int int12 = intMath0.mod((int) (short) 1, 96);
        int int15 = intMath0.mod((int) (byte) 0, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 96 + "'", int3 == 96);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) 1, (int) (byte) 10);
        int int6 = intMath0.mod((int) (short) 0, (int) (byte) 1);
        int int9 = intMath0.mod((int) '4', (int) (byte) 10);
        int int12 = intMath0.mod((int) '#', (int) (short) 1);
        java.lang.Class<?> wildcardClass13 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) 1, (int) (byte) 10);
        int int6 = intMath0.mod((int) (short) 0, (int) (byte) 1);
        int int9 = intMath0.mod((int) '4', (int) (byte) 10);
        java.lang.Class<?> wildcardClass10 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) 1, (int) (byte) 10);
        int int6 = intMath0.mod((int) (short) 0, (int) (byte) 1);
        int int9 = intMath0.mod((int) 'a', (int) (byte) 1);
        int int12 = intMath0.mod(1, 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) 1, (int) (byte) 10);
        int int6 = intMath0.mod((int) (short) 0, (int) (byte) 1);
        int int9 = intMath0.mod(9, (int) ' ');
        int int12 = intMath0.mod(0, (int) ' ');
        java.lang.Class<?> wildcardClass13 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) -1, (int) 'a');
        int int6 = intMath0.mod((int) (short) 10, (int) '4');
        int int9 = intMath0.mod((int) (byte) 1, (int) (short) 10);
        int int12 = intMath0.mod((int) (short) 1, 96);
        int int15 = intMath0.mod((int) (byte) 0, 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 96 + "'", int3 == 96);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) -1, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int6 = intMath0.mod((int) (byte) 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus 0 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 96 + "'", int3 == 96);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) 1, (int) (byte) 10);
        int int6 = intMath0.mod(52, (int) (byte) 1);
        java.lang.Class<?> wildcardClass7 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) 1, (int) (byte) 10);
        int int6 = intMath0.mod((int) (short) 0, (int) (byte) 1);
        int int9 = intMath0.mod((int) 'a', (int) (byte) 1);
        int int12 = intMath0.mod((int) (byte) 0, (int) (byte) 100);
        java.lang.Class<?> wildcardClass13 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) 10, (int) (short) 1);
        int int6 = intMath0.mod((int) (byte) 10, (int) (byte) 10);
        int int9 = intMath0.mod(96, (int) (short) 10);
        int int12 = intMath0.mod((int) (byte) 0, 6);
        int int15 = intMath0.mod((-1), 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 6 + "'", int9 == 6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 34 + "'", int15 == 34);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) 1, (int) (byte) 10);
        int int6 = intMath0.mod((int) (short) 0, (int) (byte) 1);
        int int9 = intMath0.mod((int) 'a', (int) (byte) 1);
        int int12 = intMath0.mod((int) (byte) -1, 2);
        java.lang.Class<?> wildcardClass13 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (byte) 10, (int) '4');
        int int6 = intMath0.mod((int) '4', 52);
        java.lang.Class<?> wildcardClass7 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) 1, (int) (byte) 10);
        int int6 = intMath0.mod((int) (short) 0, (int) (byte) 1);
        int int9 = intMath0.mod((int) 'a', (int) (byte) 1);
        int int12 = intMath0.mod((int) (byte) -1, 2);
        int int15 = intMath0.mod((int) '4', 96);
        int int18 = intMath0.mod((int) (byte) -1, (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 96 + "'", int18 == 96);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test53");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (byte) 10, (int) '4');
        int int6 = intMath0.mod((int) '#', (int) (short) 1);
        int int9 = intMath0.mod((int) ' ', 2);
        java.lang.Class<?> wildcardClass10 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test54");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) -1, (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 31 + "'", int3 == 31);
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test55");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (byte) 10, (int) '4');
        int int6 = intMath0.mod((int) '4', 52);
        int int9 = intMath0.mod(100, 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test56");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (byte) 10, (int) '4');
        int int6 = intMath0.mod((int) '#', (int) (short) 1);
        int int9 = intMath0.mod((int) (byte) 1, 34);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test57");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) 0, (int) (short) 10);
        java.lang.Class<?> wildcardClass4 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test58");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) 1, (int) (byte) 10);
        int int6 = intMath0.mod((int) (short) 0, (int) (byte) 1);
        int int9 = intMath0.mod(9, (int) ' ');
        int int12 = intMath0.mod(0, (int) ' ');
        int int15 = intMath0.mod((-1), (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 51 + "'", int15 == 51);
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test59");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) 1, (int) (byte) 10);
        int int6 = intMath0.mod((int) (short) 0, (int) (byte) 1);
        int int9 = intMath0.mod(9, (int) ' ');
        int int12 = intMath0.mod((int) (byte) -1, 10);
        java.lang.Class<?> wildcardClass13 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test60");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) 1, (int) (byte) 10);
        int int6 = intMath0.mod(52, (int) (byte) 1);
        int int9 = intMath0.mod(35, 2);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = intMath0.mod(2, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus 0 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test61");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (byte) 10, (int) '4');
        int int6 = intMath0.mod((int) '#', (int) (short) 1);
        int int9 = intMath0.mod((int) ' ', 2);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = intMath0.mod(31, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -1 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }
}

