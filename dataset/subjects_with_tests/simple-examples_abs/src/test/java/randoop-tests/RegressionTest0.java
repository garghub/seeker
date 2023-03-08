import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.lang.Class<?> wildcardClass1 = simpleMethods0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs((int) '4');
        int int4 = simpleMethods0.abs((int) (short) 10);
        java.lang.Class<?> wildcardClass5 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs((int) '4');
        int int4 = simpleMethods0.abs((int) (short) 10);
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs(0);
        java.lang.Class<?> wildcardClass9 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs((int) '4');
        int int4 = simpleMethods0.abs((int) (short) 10);
        int int6 = simpleMethods0.abs((int) (short) -1);
        java.lang.Class<?> wildcardClass7 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs((int) '4');
        int int4 = simpleMethods0.abs((int) (short) 0);
        java.lang.Class<?> wildcardClass5 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs((int) '4');
        int int4 = simpleMethods0.abs((int) (short) 10);
        int int6 = simpleMethods0.abs((int) (short) -1);
        int int8 = simpleMethods0.abs((int) (short) 1);
        java.lang.Class<?> wildcardClass9 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs((int) '4');
        int int4 = simpleMethods0.abs((int) (short) 10);
        int int6 = simpleMethods0.abs((int) (byte) 10);
        java.lang.Class<?> wildcardClass7 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs((int) '4');
        int int4 = simpleMethods0.abs((int) (short) 10);
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs((int) ' ');
        int int12 = simpleMethods0.abs((int) '#');
        int int14 = simpleMethods0.abs((int) (byte) 10);
        int int16 = simpleMethods0.abs((int) 'a');
        int int18 = simpleMethods0.abs(97);
        int int20 = simpleMethods0.abs(1);
        java.lang.Class<?> wildcardClass21 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs((int) '4');
        int int4 = simpleMethods0.abs((int) (short) 10);
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs((int) ' ');
        int int12 = simpleMethods0.abs((int) '#');
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs((int) '4');
        int int4 = simpleMethods0.abs((int) (short) 10);
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs((int) ' ');
        java.lang.Class<?> wildcardClass11 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs((int) '4');
        int int4 = simpleMethods0.abs((int) (short) 10);
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs((int) ' ');
        int int12 = simpleMethods0.abs((int) '#');
        int int14 = simpleMethods0.abs((int) (byte) 10);
        int int16 = simpleMethods0.abs((int) 'a');
        int int18 = simpleMethods0.abs(97);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs((int) '4');
        int int4 = simpleMethods0.abs((int) (short) 10);
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs((int) ' ');
        int int12 = simpleMethods0.abs((int) (short) 100);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs((int) '4');
        int int4 = simpleMethods0.abs((int) (short) 10);
        int int6 = simpleMethods0.abs((int) (short) 100);
        java.lang.Class<?> wildcardClass7 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs((int) '4');
        int int4 = simpleMethods0.abs((int) (short) 10);
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs((int) ' ');
        int int12 = simpleMethods0.abs((int) '#');
        int int14 = simpleMethods0.abs((int) (byte) 10);
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs((int) ' ');
        java.lang.Class<?> wildcardClass3 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs((int) '4');
        java.lang.Class<?> wildcardClass3 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs((int) '4');
        int int4 = simpleMethods0.abs((int) (short) 10);
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs((int) ' ');
        int int12 = simpleMethods0.abs((int) '#');
        int int14 = simpleMethods0.abs((int) (byte) 10);
        int int16 = simpleMethods0.abs((int) 'a');
        int int18 = simpleMethods0.abs(97);
        int int20 = simpleMethods0.abs(1);
        int int22 = simpleMethods0.abs((int) (short) -1);
        int int24 = simpleMethods0.abs((int) 'a');
        int int26 = simpleMethods0.abs(32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 97 + "'", int24 == 97);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 32 + "'", int26 == 32);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs((int) '4');
        int int4 = simpleMethods0.abs((int) (short) 10);
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs((int) ' ');
        int int12 = simpleMethods0.abs((int) '#');
        int int14 = simpleMethods0.abs((int) (byte) 10);
        int int16 = simpleMethods0.abs((int) 'a');
        int int18 = simpleMethods0.abs(97);
        int int20 = simpleMethods0.abs(1);
        int int22 = simpleMethods0.abs((int) (short) -1);
        int int24 = simpleMethods0.abs((int) 'a');
        int int26 = simpleMethods0.abs((int) ' ');
        java.lang.Class<?> wildcardClass27 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 97 + "'", int24 == 97);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 32 + "'", int26 == 32);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs((int) '4');
        int int4 = simpleMethods0.abs((int) (short) 10);
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs((int) ' ');
        int int12 = simpleMethods0.abs((int) '#');
        int int14 = simpleMethods0.abs((int) (byte) 10);
        int int16 = simpleMethods0.abs((int) 'a');
        int int18 = simpleMethods0.abs(97);
        int int20 = simpleMethods0.abs(1);
        int int22 = simpleMethods0.abs((int) (short) -1);
        int int24 = simpleMethods0.abs((int) (short) 10);
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs((int) '4');
        int int4 = simpleMethods0.abs((int) (short) 10);
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs((int) ' ');
        int int12 = simpleMethods0.abs((int) '#');
        int int14 = simpleMethods0.abs((int) (byte) 10);
        int int16 = simpleMethods0.abs((int) 'a');
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs((int) '4');
        int int4 = simpleMethods0.abs((int) (byte) 100);
        java.lang.Class<?> wildcardClass5 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs((int) '4');
        int int4 = simpleMethods0.abs((int) (short) 10);
        int int6 = simpleMethods0.abs((int) (short) -1);
        int int8 = simpleMethods0.abs(32);
        int int10 = simpleMethods0.abs((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs((int) '4');
        int int4 = simpleMethods0.abs((int) (short) 10);
        int int6 = simpleMethods0.abs(100);
        int int8 = simpleMethods0.abs(35);
        java.lang.Class<?> wildcardClass9 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs((int) '4');
        int int4 = simpleMethods0.abs((int) (short) 10);
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs((int) ' ');
        int int12 = simpleMethods0.abs((int) '#');
        int int14 = simpleMethods0.abs((int) (byte) 10);
        int int16 = simpleMethods0.abs((int) 'a');
        int int18 = simpleMethods0.abs(97);
        int int20 = simpleMethods0.abs(1);
        int int22 = simpleMethods0.abs((int) (short) -1);
        int int24 = simpleMethods0.abs((int) 'a');
        int int26 = simpleMethods0.abs((int) ' ');
        int int28 = simpleMethods0.abs(0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 97 + "'", int24 == 97);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 32 + "'", int26 == 32);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs((int) (byte) 1);
        int int4 = simpleMethods0.abs((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs((int) '4');
        int int4 = simpleMethods0.abs((int) (short) -1);
        int int6 = simpleMethods0.abs(0);
        java.lang.Class<?> wildcardClass7 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs((int) (byte) 1);
        java.lang.Class<?> wildcardClass3 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs((int) '4');
        int int4 = simpleMethods0.abs((int) (short) -1);
        int int6 = simpleMethods0.abs((int) (byte) 0);
        java.lang.Class<?> wildcardClass7 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs((int) '4');
        int int4 = simpleMethods0.abs((int) (short) 10);
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs((int) ' ');
        int int12 = simpleMethods0.abs((int) '#');
        int int14 = simpleMethods0.abs((int) (byte) 10);
        int int16 = simpleMethods0.abs((int) (byte) 1);
        int int18 = simpleMethods0.abs(10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs((int) '4');
        int int4 = simpleMethods0.abs((int) (short) 10);
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs((int) ' ');
        int int12 = simpleMethods0.abs((int) '#');
        int int14 = simpleMethods0.abs((int) (byte) 10);
        int int16 = simpleMethods0.abs((int) 'a');
        int int18 = simpleMethods0.abs(97);
        int int20 = simpleMethods0.abs(1);
        int int22 = simpleMethods0.abs(100);
        java.lang.Class<?> wildcardClass23 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs((int) '4');
        int int4 = simpleMethods0.abs((int) (short) 10);
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs((int) ' ');
        int int12 = simpleMethods0.abs((int) '#');
        int int14 = simpleMethods0.abs((int) (byte) 10);
        int int16 = simpleMethods0.abs(10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(35);
        java.lang.Class<?> wildcardClass3 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs((int) '4');
        int int4 = simpleMethods0.abs((int) (short) 10);
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs((int) ' ');
        int int12 = simpleMethods0.abs((int) '#');
        int int14 = simpleMethods0.abs((int) (byte) 10);
        int int16 = simpleMethods0.abs((int) 'a');
        int int18 = simpleMethods0.abs(97);
        int int20 = simpleMethods0.abs(1);
        int int22 = simpleMethods0.abs((int) (byte) 0);
        int int24 = simpleMethods0.abs(1);
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs((int) '4');
        int int4 = simpleMethods0.abs((int) (short) 10);
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs((int) ' ');
        int int12 = simpleMethods0.abs((int) (short) 100);
        int int14 = simpleMethods0.abs((-1));
        int int16 = simpleMethods0.abs((int) (short) 100);
        int int18 = simpleMethods0.abs(97);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs((int) '4');
        int int4 = simpleMethods0.abs((int) (short) 10);
        int int6 = simpleMethods0.abs((int) (short) -1);
        int int8 = simpleMethods0.abs((int) (short) 1);
        int int10 = simpleMethods0.abs((int) (byte) 10);
        int int12 = simpleMethods0.abs(32);
        int int14 = simpleMethods0.abs((int) ' ');
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs((int) '4');
        int int4 = simpleMethods0.abs((int) (short) 0);
        int int6 = simpleMethods0.abs(0);
        int int8 = simpleMethods0.abs(10);
        java.lang.Class<?> wildcardClass9 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs((int) '4');
        int int4 = simpleMethods0.abs((int) (short) 10);
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs((int) ' ');
        int int12 = simpleMethods0.abs((int) '#');
        int int14 = simpleMethods0.abs((int) (byte) 10);
        int int16 = simpleMethods0.abs((int) 'a');
        int int18 = simpleMethods0.abs(97);
        int int20 = simpleMethods0.abs(1);
        int int22 = simpleMethods0.abs((int) (short) -1);
        int int24 = simpleMethods0.abs((int) 'a');
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 97 + "'", int24 == 97);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs((int) '4');
        int int4 = simpleMethods0.abs((int) (short) 10);
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs((int) ' ');
        int int12 = simpleMethods0.abs((int) '#');
        int int14 = simpleMethods0.abs((int) (byte) 10);
        int int16 = simpleMethods0.abs((int) (byte) 1);
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs((int) '4');
        int int4 = simpleMethods0.abs((int) (short) -1);
        int int6 = simpleMethods0.abs((int) (byte) 0);
        int int8 = simpleMethods0.abs((-1));
        java.lang.Class<?> wildcardClass9 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs((int) '4');
        int int4 = simpleMethods0.abs((int) (short) 10);
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs((int) ' ');
        int int12 = simpleMethods0.abs((int) '#');
        int int14 = simpleMethods0.abs((int) (byte) 10);
        int int16 = simpleMethods0.abs((int) 'a');
        int int18 = simpleMethods0.abs(97);
        int int20 = simpleMethods0.abs(1);
        int int22 = simpleMethods0.abs((int) (byte) 0);
        java.lang.Class<?> wildcardClass23 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs((int) '4');
        int int4 = simpleMethods0.abs((int) (short) 10);
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs((int) ' ');
        int int12 = simpleMethods0.abs((int) (short) 100);
        int int14 = simpleMethods0.abs((-1));
        int int16 = simpleMethods0.abs((int) (short) 100);
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs((int) (byte) 1);
        int int4 = simpleMethods0.abs((int) (short) 0);
        int int6 = simpleMethods0.abs((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs((int) '4');
        int int4 = simpleMethods0.abs((int) (short) 10);
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs((int) ' ');
        int int12 = simpleMethods0.abs((int) (short) 100);
        int int14 = simpleMethods0.abs(0);
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs((int) '4');
        int int4 = simpleMethods0.abs((int) (short) 10);
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs((int) ' ');
        int int12 = simpleMethods0.abs((int) '#');
        int int14 = simpleMethods0.abs((int) (byte) 10);
        int int16 = simpleMethods0.abs((int) 'a');
        int int18 = simpleMethods0.abs(97);
        int int20 = simpleMethods0.abs(1);
        int int22 = simpleMethods0.abs((int) (short) -1);
        int int24 = simpleMethods0.abs((int) 'a');
        int int26 = simpleMethods0.abs((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 97 + "'", int24 == 97);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs((int) '4');
        int int4 = simpleMethods0.abs((int) (short) 10);
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs((int) ' ');
        int int12 = simpleMethods0.abs((int) (short) 100);
        int int14 = simpleMethods0.abs((-1));
        int int16 = simpleMethods0.abs((int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs((int) '4');
        int int4 = simpleMethods0.abs((int) (byte) 100);
        int int6 = simpleMethods0.abs((-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs((int) '4');
        int int4 = simpleMethods0.abs((int) (short) 10);
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs((int) ' ');
        int int12 = simpleMethods0.abs((int) (short) 100);
        int int14 = simpleMethods0.abs((-1));
        int int16 = simpleMethods0.abs((int) (short) 100);
        int int18 = simpleMethods0.abs((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs((int) '4');
        int int4 = simpleMethods0.abs((int) (short) 10);
        int int6 = simpleMethods0.abs((int) (short) -1);
        int int8 = simpleMethods0.abs((int) (short) 1);
        int int10 = simpleMethods0.abs((int) (byte) 10);
        int int12 = simpleMethods0.abs(32);
        int int14 = simpleMethods0.abs(10);
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs((int) '4');
        int int4 = simpleMethods0.abs((int) (byte) 1);
        java.lang.Class<?> wildcardClass5 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs((int) '4');
        int int4 = simpleMethods0.abs((int) (short) 0);
        int int6 = simpleMethods0.abs((int) (short) 10);
        int int8 = simpleMethods0.abs((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs((int) '4');
        int int4 = simpleMethods0.abs((int) (short) 0);
        int int6 = simpleMethods0.abs((int) (short) 10);
        java.lang.Class<?> wildcardClass7 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs((int) '4');
        int int4 = simpleMethods0.abs((int) (short) 10);
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs((int) ' ');
        int int12 = simpleMethods0.abs((int) '#');
        int int14 = simpleMethods0.abs((int) (byte) 10);
        int int16 = simpleMethods0.abs((int) 'a');
        int int18 = simpleMethods0.abs(97);
        int int20 = simpleMethods0.abs(0);
        int int22 = simpleMethods0.abs((int) (byte) -1);
        java.lang.Class<?> wildcardClass23 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs((int) '4');
        int int4 = simpleMethods0.abs((int) (short) 10);
        int int6 = simpleMethods0.abs((int) (short) -1);
        int int8 = simpleMethods0.abs((int) (short) 1);
        int int10 = simpleMethods0.abs((int) (byte) 10);
        int int12 = simpleMethods0.abs((int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs((int) '4');
        int int4 = simpleMethods0.abs((int) (short) 10);
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs((int) ' ');
        int int12 = simpleMethods0.abs((int) '#');
        int int14 = simpleMethods0.abs((int) (byte) 10);
        int int16 = simpleMethods0.abs((int) 'a');
        int int18 = simpleMethods0.abs(97);
        int int20 = simpleMethods0.abs(0);
        java.lang.Class<?> wildcardClass21 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs((int) '4');
        int int4 = simpleMethods0.abs((int) (short) 10);
        int int6 = simpleMethods0.abs(100);
        int int8 = simpleMethods0.abs((int) (byte) -1);
        int int10 = simpleMethods0.abs(0);
        java.lang.Class<?> wildcardClass11 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs((int) '4');
        int int4 = simpleMethods0.abs((int) (short) 10);
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs((int) ' ');
        int int12 = simpleMethods0.abs((int) (short) 100);
        int int14 = simpleMethods0.abs(0);
        int int16 = simpleMethods0.abs(0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs((int) '4');
        int int4 = simpleMethods0.abs((int) (short) -1);
        int int6 = simpleMethods0.abs(52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs((int) (byte) 1);
        int int4 = simpleMethods0.abs((int) (short) 0);
        java.lang.Class<?> wildcardClass5 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs((int) '4');
        int int4 = simpleMethods0.abs((int) (short) 10);
        int int6 = simpleMethods0.abs(100);
        int int8 = simpleMethods0.abs((int) (byte) -1);
        java.lang.Class<?> wildcardClass9 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs((int) '4');
        int int4 = simpleMethods0.abs((int) (short) 10);
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs((int) ' ');
        int int12 = simpleMethods0.abs((int) '#');
        int int14 = simpleMethods0.abs((int) (byte) 10);
        int int16 = simpleMethods0.abs((int) (short) 0);
        int int18 = simpleMethods0.abs(0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs((int) '4');
        int int4 = simpleMethods0.abs((int) (short) 0);
        int int6 = simpleMethods0.abs((int) (short) 10);
        int int8 = simpleMethods0.abs((int) (byte) 0);
        java.lang.Class<?> wildcardClass9 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs((int) '4');
        int int4 = simpleMethods0.abs((int) (short) 0);
        int int6 = simpleMethods0.abs(0);
        int int8 = simpleMethods0.abs((int) '4');
        java.lang.Class<?> wildcardClass9 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs((int) '4');
        int int4 = simpleMethods0.abs((int) (short) 10);
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs((int) ' ');
        int int12 = simpleMethods0.abs((int) '#');
        int int14 = simpleMethods0.abs((int) (byte) 10);
        int int16 = simpleMethods0.abs((int) (byte) 1);
        int int18 = simpleMethods0.abs((-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs((int) '4');
        int int4 = simpleMethods0.abs((int) (short) 10);
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs((int) ' ');
        int int12 = simpleMethods0.abs((int) '#');
        int int14 = simpleMethods0.abs((int) (byte) 10);
        int int16 = simpleMethods0.abs((int) 'a');
        int int18 = simpleMethods0.abs(97);
        int int20 = simpleMethods0.abs((int) 'a');
        int int22 = simpleMethods0.abs(35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 35 + "'", int22 == 35);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs((int) '4');
        int int4 = simpleMethods0.abs((int) (short) 10);
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs((int) ' ');
        int int12 = simpleMethods0.abs((int) '#');
        int int14 = simpleMethods0.abs((int) (byte) 10);
        int int16 = simpleMethods0.abs((int) (byte) 1);
        int int18 = simpleMethods0.abs(0);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(35);
        int int4 = simpleMethods0.abs((int) (short) 100);
        java.lang.Class<?> wildcardClass5 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs((int) '4');
        int int4 = simpleMethods0.abs((int) (short) 10);
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs((int) ' ');
        int int12 = simpleMethods0.abs((int) '#');
        int int14 = simpleMethods0.abs((int) (byte) 10);
        int int16 = simpleMethods0.abs((int) 'a');
        int int18 = simpleMethods0.abs(97);
        int int20 = simpleMethods0.abs(1);
        int int22 = simpleMethods0.abs((int) (byte) 0);
        int int24 = simpleMethods0.abs((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(35);
        int int4 = simpleMethods0.abs((int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs((int) '4');
        int int4 = simpleMethods0.abs((int) (short) 10);
        int int6 = simpleMethods0.abs((int) (short) -1);
        int int8 = simpleMethods0.abs((int) (short) 1);
        int int10 = simpleMethods0.abs((int) (byte) 10);
        int int12 = simpleMethods0.abs(32);
        int int14 = simpleMethods0.abs((int) (byte) 10);
        int int16 = simpleMethods0.abs((int) (byte) 10);
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs((int) '4');
        int int4 = simpleMethods0.abs((int) (byte) 100);
        int int6 = simpleMethods0.abs(10);
        java.lang.Class<?> wildcardClass7 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs((int) '4');
        int int4 = simpleMethods0.abs((int) (short) 10);
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs((int) ' ');
        int int12 = simpleMethods0.abs((int) '#');
        int int14 = simpleMethods0.abs((int) (byte) 10);
        int int16 = simpleMethods0.abs((int) 'a');
        int int18 = simpleMethods0.abs(97);
        int int20 = simpleMethods0.abs(1);
        int int22 = simpleMethods0.abs((int) (byte) 0);
        int int24 = simpleMethods0.abs(1);
        int int26 = simpleMethods0.abs(1);
        java.lang.Class<?> wildcardClass27 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs((int) '4');
        int int4 = simpleMethods0.abs((int) (short) -1);
        int int6 = simpleMethods0.abs(0);
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs((int) (byte) 1);
        java.lang.Class<?> wildcardClass11 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs((int) ' ');
        int int4 = simpleMethods0.abs(0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs((int) '4');
        int int4 = simpleMethods0.abs((int) (short) -1);
        int int6 = simpleMethods0.abs(0);
        int int8 = simpleMethods0.abs((int) (short) 100);
        int int10 = simpleMethods0.abs(0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs((int) '4');
        int int4 = simpleMethods0.abs((int) (short) 10);
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs((int) ' ');
        int int12 = simpleMethods0.abs((int) '#');
        int int14 = simpleMethods0.abs((int) (byte) 10);
        int int16 = simpleMethods0.abs((int) 'a');
        int int18 = simpleMethods0.abs(97);
        int int20 = simpleMethods0.abs(1);
        int int22 = simpleMethods0.abs((int) (byte) 0);
        int int24 = simpleMethods0.abs(1);
        int int26 = simpleMethods0.abs(1);
        int int28 = simpleMethods0.abs(0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs((int) '4');
        int int4 = simpleMethods0.abs((int) (short) 0);
        int int6 = simpleMethods0.abs(0);
        int int8 = simpleMethods0.abs((int) '4');
        int int10 = simpleMethods0.abs((int) (short) 100);
        java.lang.Class<?> wildcardClass11 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs((int) '4');
        int int4 = simpleMethods0.abs((int) (short) 10);
        int int6 = simpleMethods0.abs(100);
        int int8 = simpleMethods0.abs(35);
        int int10 = simpleMethods0.abs(100);
        java.lang.Class<?> wildcardClass11 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs((int) '4');
        int int4 = simpleMethods0.abs((int) (short) 10);
        int int6 = simpleMethods0.abs((-1));
        java.lang.Class<?> wildcardClass7 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs((int) '4');
        int int4 = simpleMethods0.abs((int) (short) 10);
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs(32);
        java.lang.Class<?> wildcardClass9 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs((int) '4');
        int int4 = simpleMethods0.abs((int) (short) 10);
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs((int) ' ');
        int int12 = simpleMethods0.abs((int) '#');
        int int14 = simpleMethods0.abs((int) (byte) 10);
        int int16 = simpleMethods0.abs((int) 'a');
        int int18 = simpleMethods0.abs(97);
        int int20 = simpleMethods0.abs(0);
        int int22 = simpleMethods0.abs((int) (short) -1);
        java.lang.Class<?> wildcardClass23 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs((int) '4');
        int int4 = simpleMethods0.abs((int) (short) 10);
        int int6 = simpleMethods0.abs((int) (short) -1);
        int int8 = simpleMethods0.abs((int) (short) 1);
        int int10 = simpleMethods0.abs((int) (byte) 10);
        int int12 = simpleMethods0.abs((int) (byte) 100);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs((int) '4');
        int int4 = simpleMethods0.abs((int) (short) 10);
        int int6 = simpleMethods0.abs(100);
        int int8 = simpleMethods0.abs((int) (byte) -1);
        int int10 = simpleMethods0.abs((int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs((int) '4');
        int int4 = simpleMethods0.abs((int) (short) -1);
        int int6 = simpleMethods0.abs(0);
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs((int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs((int) '4');
        int int4 = simpleMethods0.abs((int) (short) 10);
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs((int) ' ');
        int int12 = simpleMethods0.abs((int) '#');
        int int14 = simpleMethods0.abs((int) (byte) 10);
        int int16 = simpleMethods0.abs((int) (short) 0);
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs((int) '4');
        int int4 = simpleMethods0.abs((int) (short) 10);
        int int6 = simpleMethods0.abs((int) (short) -1);
        int int8 = simpleMethods0.abs(32);
        int int10 = simpleMethods0.abs((int) 'a');
        java.lang.Class<?> wildcardClass11 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs((int) '4');
        int int4 = simpleMethods0.abs((int) (short) -1);
        int int6 = simpleMethods0.abs((int) (byte) 0);
        int int8 = simpleMethods0.abs(0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs((int) '4');
        int int4 = simpleMethods0.abs((int) (short) 10);
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs((int) ' ');
        int int12 = simpleMethods0.abs((int) (short) 100);
        int int14 = simpleMethods0.abs((-1));
        int int16 = simpleMethods0.abs((int) (short) 100);
        int int18 = simpleMethods0.abs(97);
        int int20 = simpleMethods0.abs((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs((int) '4');
        int int4 = simpleMethods0.abs((int) (short) 0);
        int int6 = simpleMethods0.abs((int) (short) 10);
        int int8 = simpleMethods0.abs((int) (byte) 0);
        int int10 = simpleMethods0.abs(35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs((int) '4');
        int int4 = simpleMethods0.abs((int) (short) 10);
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs((int) ' ');
        int int12 = simpleMethods0.abs((int) '#');
        int int14 = simpleMethods0.abs((int) (byte) 10);
        int int16 = simpleMethods0.abs((int) (short) 1);
        int int18 = simpleMethods0.abs(100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs((int) '4');
        int int4 = simpleMethods0.abs((int) (short) -1);
        int int6 = simpleMethods0.abs((int) (byte) 0);
        int int8 = simpleMethods0.abs((-1));
        int int10 = simpleMethods0.abs(0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs((int) '4');
        int int4 = simpleMethods0.abs((int) (byte) 1);
        int int6 = simpleMethods0.abs(0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs((int) '4');
        int int4 = simpleMethods0.abs((int) (short) 10);
        int int6 = simpleMethods0.abs((int) (short) -1);
        int int8 = simpleMethods0.abs(100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs((int) '4');
        int int4 = simpleMethods0.abs((int) (short) -1);
        int int6 = simpleMethods0.abs(0);
        int int8 = simpleMethods0.abs((int) (byte) 10);
        java.lang.Class<?> wildcardClass9 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs((int) '4');
        int int4 = simpleMethods0.abs((int) (short) -1);
        int int6 = simpleMethods0.abs(0);
        int int8 = simpleMethods0.abs((int) (short) 100);
        int int10 = simpleMethods0.abs((int) (byte) -1);
        java.lang.Class<?> wildcardClass11 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs((int) '4');
        int int4 = simpleMethods0.abs((int) (short) 10);
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs((int) ' ');
        int int12 = simpleMethods0.abs((int) (short) 100);
        int int14 = simpleMethods0.abs((-1));
        int int16 = simpleMethods0.abs((int) (short) 100);
        int int18 = simpleMethods0.abs(97);
        int int20 = simpleMethods0.abs(1);
        int int22 = simpleMethods0.abs(10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs((int) '4');
        int int4 = simpleMethods0.abs((int) (short) 10);
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs((int) ' ');
        int int12 = simpleMethods0.abs((int) (short) 100);
        int int14 = simpleMethods0.abs((-1));
        int int16 = simpleMethods0.abs((int) (short) 100);
        int int18 = simpleMethods0.abs(10);
        int int20 = simpleMethods0.abs((int) (short) 10);
        int int22 = simpleMethods0.abs((int) 'a');
        java.lang.Class<?> wildcardClass23 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97 + "'", int22 == 97);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs((int) '4');
        int int4 = simpleMethods0.abs((int) (short) 10);
        int int6 = simpleMethods0.abs(100);
        java.lang.Class<?> wildcardClass7 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs((int) '4');
        int int4 = simpleMethods0.abs((int) (short) 10);
        int int6 = simpleMethods0.abs((int) (short) -1);
        int int8 = simpleMethods0.abs((int) (short) 1);
        int int10 = simpleMethods0.abs((int) (byte) 10);
        int int12 = simpleMethods0.abs(100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs((int) (byte) 1);
        int int4 = simpleMethods0.abs((int) (short) 0);
        int int6 = simpleMethods0.abs(52);
        java.lang.Class<?> wildcardClass7 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs((int) '4');
        int int4 = simpleMethods0.abs((int) (short) 10);
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs((int) ' ');
        int int12 = simpleMethods0.abs((int) (short) 100);
        int int14 = simpleMethods0.abs((-1));
        int int16 = simpleMethods0.abs((int) (short) 100);
        int int18 = simpleMethods0.abs(97);
        int int20 = simpleMethods0.abs((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(35);
        int int4 = simpleMethods0.abs((int) (short) -1);
        java.lang.Class<?> wildcardClass5 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs((int) '4');
        int int4 = simpleMethods0.abs((int) (short) 10);
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs((int) ' ');
        int int12 = simpleMethods0.abs((int) '#');
        int int14 = simpleMethods0.abs((int) (byte) 10);
        int int16 = simpleMethods0.abs((int) 'a');
        int int18 = simpleMethods0.abs(97);
        int int20 = simpleMethods0.abs(1);
        int int22 = simpleMethods0.abs((int) (byte) 0);
        int int24 = simpleMethods0.abs(1);
        int int26 = simpleMethods0.abs((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs((int) '4');
        int int4 = simpleMethods0.abs((int) (short) 10);
        int int6 = simpleMethods0.abs((int) (short) -1);
        int int8 = simpleMethods0.abs((int) (short) 1);
        int int10 = simpleMethods0.abs((int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs((int) '4');
        int int4 = simpleMethods0.abs((int) (short) 10);
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs((int) ' ');
        int int12 = simpleMethods0.abs((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs((int) '4');
        int int4 = simpleMethods0.abs((int) (short) 10);
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs((int) ' ');
        int int12 = simpleMethods0.abs((int) '#');
        int int14 = simpleMethods0.abs((int) (byte) 10);
        int int16 = simpleMethods0.abs((int) 'a');
        int int18 = simpleMethods0.abs(97);
        int int20 = simpleMethods0.abs(1);
        int int22 = simpleMethods0.abs(32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 32 + "'", int22 == 32);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs((int) '4');
        int int4 = simpleMethods0.abs((int) (byte) 1);
        int int6 = simpleMethods0.abs((int) (short) -1);
        java.lang.Class<?> wildcardClass7 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs((int) '4');
        int int4 = simpleMethods0.abs((int) (short) 10);
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs((int) ' ');
        int int12 = simpleMethods0.abs((int) '#');
        int int14 = simpleMethods0.abs((int) (byte) 10);
        int int16 = simpleMethods0.abs((int) 'a');
        int int18 = simpleMethods0.abs((int) (short) 1);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs((int) '4');
        int int4 = simpleMethods0.abs((int) (short) 10);
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs(100);
        java.lang.Class<?> wildcardClass9 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs((int) '4');
        int int4 = simpleMethods0.abs((int) (short) 10);
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs((int) ' ');
        int int12 = simpleMethods0.abs((int) (short) 100);
        int int14 = simpleMethods0.abs((-1));
        int int16 = simpleMethods0.abs((int) (short) 100);
        int int18 = simpleMethods0.abs(10);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs((int) ' ');
        int int4 = simpleMethods0.abs((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs((int) '4');
        int int4 = simpleMethods0.abs((int) (short) 0);
        int int6 = simpleMethods0.abs(0);
        int int8 = simpleMethods0.abs((int) '4');
        int int10 = simpleMethods0.abs((int) (short) 100);
        int int12 = simpleMethods0.abs((int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs((int) '4');
        int int4 = simpleMethods0.abs((int) (short) 10);
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs(100);
        int int10 = simpleMethods0.abs((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs((int) '4');
        int int4 = simpleMethods0.abs((int) (short) 10);
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs((-1));
        java.lang.Class<?> wildcardClass11 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs((int) '4');
        int int4 = simpleMethods0.abs((int) (short) 10);
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs((int) ' ');
        int int12 = simpleMethods0.abs((int) '#');
        int int14 = simpleMethods0.abs((int) (byte) 10);
        int int16 = simpleMethods0.abs((int) 'a');
        int int18 = simpleMethods0.abs(97);
        int int20 = simpleMethods0.abs(1);
        int int22 = simpleMethods0.abs((int) (byte) 0);
        int int24 = simpleMethods0.abs(1);
        int int26 = simpleMethods0.abs((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs((int) '4');
        int int4 = simpleMethods0.abs((int) (short) 10);
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs((int) ' ');
        int int12 = simpleMethods0.abs((int) (short) 100);
        int int14 = simpleMethods0.abs((-1));
        int int16 = simpleMethods0.abs((int) (short) 100);
        int int18 = simpleMethods0.abs(10);
        int int20 = simpleMethods0.abs((int) (short) 10);
        int int22 = simpleMethods0.abs((int) 'a');
        int int24 = simpleMethods0.abs((int) (short) 0);
        int int26 = simpleMethods0.abs(32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97 + "'", int22 == 97);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 32 + "'", int26 == 32);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(35);
        int int4 = simpleMethods0.abs((int) (short) 100);
        int int6 = simpleMethods0.abs((int) (short) 100);
        java.lang.Class<?> wildcardClass7 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs((int) '4');
        int int4 = simpleMethods0.abs((int) (short) 10);
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs((-1));
        int int12 = simpleMethods0.abs(35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs((int) '4');
        int int4 = simpleMethods0.abs((int) (short) 10);
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs((int) ' ');
        int int12 = simpleMethods0.abs((int) '#');
        int int14 = simpleMethods0.abs((int) (byte) 10);
        int int16 = simpleMethods0.abs((int) 'a');
        int int18 = simpleMethods0.abs(97);
        int int20 = simpleMethods0.abs(1);
        int int22 = simpleMethods0.abs((int) (short) -1);
        int int24 = simpleMethods0.abs((int) 'a');
        int int26 = simpleMethods0.abs((int) ' ');
        int int28 = simpleMethods0.abs(1);
        int int30 = simpleMethods0.abs((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 97 + "'", int24 == 97);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 32 + "'", int26 == 32);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs((int) '4');
        int int4 = simpleMethods0.abs((int) (short) 10);
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs((int) ' ');
        int int12 = simpleMethods0.abs((int) '#');
        int int14 = simpleMethods0.abs((int) (byte) 10);
        int int16 = simpleMethods0.abs((int) 'a');
        int int18 = simpleMethods0.abs(97);
        int int20 = simpleMethods0.abs(0);
        int int22 = simpleMethods0.abs(0);
        java.lang.Class<?> wildcardClass23 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs((int) '4');
        int int4 = simpleMethods0.abs((int) (short) 10);
        int int6 = simpleMethods0.abs((int) (short) -1);
        int int8 = simpleMethods0.abs((int) (short) 1);
        int int10 = simpleMethods0.abs((int) (byte) 10);
        int int12 = simpleMethods0.abs(35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs((int) '4');
        int int4 = simpleMethods0.abs((int) (short) 10);
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs((int) ' ');
        int int12 = simpleMethods0.abs((int) '#');
        int int14 = simpleMethods0.abs((int) (byte) 10);
        int int16 = simpleMethods0.abs((int) 'a');
        int int18 = simpleMethods0.abs(97);
        int int20 = simpleMethods0.abs(0);
        int int22 = simpleMethods0.abs(0);
        int int24 = simpleMethods0.abs((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs((int) '4');
        int int4 = simpleMethods0.abs((int) (short) -1);
        int int6 = simpleMethods0.abs(0);
        int int8 = simpleMethods0.abs((int) (short) 100);
        int int10 = simpleMethods0.abs((int) (byte) -1);
        int int12 = simpleMethods0.abs((int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs((int) '4');
        int int4 = simpleMethods0.abs((int) (short) 10);
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs((int) ' ');
        int int12 = simpleMethods0.abs((int) '#');
        int int14 = simpleMethods0.abs((int) (byte) 10);
        int int16 = simpleMethods0.abs((int) 'a');
        int int18 = simpleMethods0.abs(97);
        int int20 = simpleMethods0.abs((int) 'a');
        int int22 = simpleMethods0.abs((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs((int) '4');
        int int4 = simpleMethods0.abs((int) (short) 10);
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs((int) ' ');
        int int12 = simpleMethods0.abs((int) '#');
        int int14 = simpleMethods0.abs((int) (byte) 10);
        int int16 = simpleMethods0.abs((int) 'a');
        int int18 = simpleMethods0.abs(97);
        int int20 = simpleMethods0.abs(1);
        int int22 = simpleMethods0.abs((int) (byte) 0);
        int int24 = simpleMethods0.abs(1);
        int int26 = simpleMethods0.abs(52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 52 + "'", int26 == 52);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs((int) '4');
        int int4 = simpleMethods0.abs((int) (short) 10);
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs((int) ' ');
        int int12 = simpleMethods0.abs((int) '#');
        int int14 = simpleMethods0.abs((int) (byte) 10);
        int int16 = simpleMethods0.abs((int) 'a');
        int int18 = simpleMethods0.abs(97);
        int int20 = simpleMethods0.abs((int) (short) 10);
        int int22 = simpleMethods0.abs(97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97 + "'", int22 == 97);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs((int) '4');
        int int4 = simpleMethods0.abs((int) (short) 10);
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs((int) ' ');
        int int12 = simpleMethods0.abs((int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs((int) '4');
        int int4 = simpleMethods0.abs((int) (short) 10);
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs((int) ' ');
        int int12 = simpleMethods0.abs((int) '#');
        int int14 = simpleMethods0.abs((int) (byte) 10);
        int int16 = simpleMethods0.abs((int) 'a');
        int int18 = simpleMethods0.abs(97);
        int int20 = simpleMethods0.abs(1);
        int int22 = simpleMethods0.abs(100);
        int int24 = simpleMethods0.abs(32);
        int int26 = simpleMethods0.abs(35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 32 + "'", int24 == 32);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 35 + "'", int26 == 35);
    }
}

