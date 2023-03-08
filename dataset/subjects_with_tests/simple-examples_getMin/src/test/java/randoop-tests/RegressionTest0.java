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
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.lang.Class<?> wildcardClass1 = simpleMethods0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        java.lang.Class<?> wildcardClass4 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', 0);
        int int6 = simpleMethods0.getMin(1, 0);
        java.lang.Class<?> wildcardClass7 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', 0);
        int int6 = simpleMethods0.getMin((int) 'a', (-1));
        java.lang.Class<?> wildcardClass7 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) ' ', (int) '#');
        int int9 = simpleMethods0.getMin(32, 10);
        java.lang.Class<?> wildcardClass10 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', 0);
        java.lang.Class<?> wildcardClass4 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) ' ', (int) '#');
        java.lang.Class<?> wildcardClass7 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) '4', 0);
        int int9 = simpleMethods0.getMin((int) (byte) 10, 100);
        java.lang.Class<?> wildcardClass10 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) '4', 0);
        int int9 = simpleMethods0.getMin((int) '4', (int) ' ');
        java.lang.Class<?> wildcardClass10 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) '4', 0);
        java.lang.Class<?> wildcardClass7 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', 0);
        int int6 = simpleMethods0.getMin(1, 0);
        int int9 = simpleMethods0.getMin((int) '4', (int) (byte) 0);
        int int12 = simpleMethods0.getMin((int) '4', (int) '#');
        int int15 = simpleMethods0.getMin((int) (short) 1, (-1));
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', 0);
        int int6 = simpleMethods0.getMin(1, 0);
        int int9 = simpleMethods0.getMin((int) '4', (int) (byte) 0);
        int int12 = simpleMethods0.getMin((int) '4', (int) '#');
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (short) 100, 100);
        int int6 = simpleMethods0.getMin(0, (int) (short) 0);
        java.lang.Class<?> wildcardClass7 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) '4', 0);
        int int9 = simpleMethods0.getMin((int) '4', (int) ' ');
        int int12 = simpleMethods0.getMin((int) (byte) 1, 0);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', 0);
        int int6 = simpleMethods0.getMin((int) 'a', (-1));
        int int9 = simpleMethods0.getMin((int) (byte) -1, (int) (byte) 1);
        java.lang.Class<?> wildcardClass10 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin((int) (short) 1, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) '4', 0);
        int int9 = simpleMethods0.getMin((int) '4', (int) ' ');
        int int12 = simpleMethods0.getMin((int) ' ', 0);
        int int15 = simpleMethods0.getMin((int) (short) 100, (int) (short) 100);
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) (short) 1, (int) ' ');
        int int9 = simpleMethods0.getMin(10, (int) (byte) 0);
        java.lang.Class<?> wildcardClass10 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin((int) (byte) 1, (int) (byte) 0);
        int int9 = simpleMethods0.getMin((int) 'a', (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', 0);
        int int6 = simpleMethods0.getMin(1, 0);
        int int9 = simpleMethods0.getMin((int) '4', (int) (byte) 0);
        int int12 = simpleMethods0.getMin((int) '4', (int) '#');
        int int15 = simpleMethods0.getMin(0, (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) (short) 1, (int) ' ');
        int int9 = simpleMethods0.getMin(10, 35);
        java.lang.Class<?> wildcardClass10 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) (short) 1, (int) ' ');
        int int9 = simpleMethods0.getMin(10, 35);
        int int12 = simpleMethods0.getMin((int) (short) -1, 1);
        int int15 = simpleMethods0.getMin(0, 35);
        int int18 = simpleMethods0.getMin((int) (short) -1, (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', 0);
        int int6 = simpleMethods0.getMin((int) 'a', (-1));
        int int9 = simpleMethods0.getMin((int) (byte) -1, (int) (byte) 1);
        int int12 = simpleMethods0.getMin((int) (short) 0, (int) (byte) 0);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) (short) 1, (int) ' ');
        int int9 = simpleMethods0.getMin(10, 35);
        int int12 = simpleMethods0.getMin((int) (short) -1, 1);
        int int15 = simpleMethods0.getMin(97, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', 0);
        int int6 = simpleMethods0.getMin((int) (short) 100, 10);
        java.lang.Class<?> wildcardClass7 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) '4', 0);
        int int9 = simpleMethods0.getMin((int) '4', (int) ' ');
        int int12 = simpleMethods0.getMin((int) ' ', 0);
        int int15 = simpleMethods0.getMin((int) (short) 100, (int) (short) 100);
        int int18 = simpleMethods0.getMin(32, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) ' ', (int) '#');
        int int9 = simpleMethods0.getMin(32, 10);
        int int12 = simpleMethods0.getMin((int) (short) 10, 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin((int) (byte) 1, (int) (byte) 0);
        int int9 = simpleMethods0.getMin(10, 100);
        java.lang.Class<?> wildcardClass10 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (short) 0, 0);
        int int6 = simpleMethods0.getMin((int) (byte) 100, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', 0);
        int int6 = simpleMethods0.getMin((int) 'a', (-1));
        int int9 = simpleMethods0.getMin((int) (byte) -1, (int) (byte) 1);
        int int12 = simpleMethods0.getMin(0, 0);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', 0);
        int int6 = simpleMethods0.getMin(1, 0);
        int int9 = simpleMethods0.getMin(10, 97);
        java.lang.Class<?> wildcardClass10 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (short) 100, 100);
        int int6 = simpleMethods0.getMin(0, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (short) -1, 10);
        int int12 = simpleMethods0.getMin((int) (byte) 1, 0);
        int int15 = simpleMethods0.getMin((-1), (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(97, (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (short) 100, 100);
        int int6 = simpleMethods0.getMin(0, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (short) -1, 10);
        int int12 = simpleMethods0.getMin((int) (byte) 1, 0);
        int int15 = simpleMethods0.getMin(97, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', 0);
        int int6 = simpleMethods0.getMin(1, 0);
        int int9 = simpleMethods0.getMin((int) '4', (int) (byte) 0);
        int int12 = simpleMethods0.getMin((int) '4', (int) '#');
        int int15 = simpleMethods0.getMin((int) (short) 1, (-1));
        int int18 = simpleMethods0.getMin(1, (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (short) 100, 100);
        int int6 = simpleMethods0.getMin(0, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (byte) 0, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) '4', 0);
        int int9 = simpleMethods0.getMin((int) '4', (int) ' ');
        int int12 = simpleMethods0.getMin((-1), (int) (short) 100);
        int int15 = simpleMethods0.getMin((int) '4', 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) '4', 0);
        int int9 = simpleMethods0.getMin(32, (int) (short) 1);
        int int12 = simpleMethods0.getMin((int) (byte) -1, 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', 0);
        int int6 = simpleMethods0.getMin((int) (short) 1, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', 0);
        int int6 = simpleMethods0.getMin(1, 0);
        int int9 = simpleMethods0.getMin((int) '4', (int) (byte) 0);
        int int12 = simpleMethods0.getMin((int) (short) 10, (int) (byte) -1);
        int int15 = simpleMethods0.getMin((int) (byte) 0, 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) (short) 1, (int) ' ');
        int int9 = simpleMethods0.getMin(10, 35);
        int int12 = simpleMethods0.getMin((int) (short) -1, 1);
        int int15 = simpleMethods0.getMin(0, 35);
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) (short) 1, (int) ' ');
        int int9 = simpleMethods0.getMin(10, 35);
        int int12 = simpleMethods0.getMin((int) (short) -1, 1);
        int int15 = simpleMethods0.getMin(0, 35);
        int int18 = simpleMethods0.getMin((int) '4', 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (short) 100, 100);
        int int6 = simpleMethods0.getMin(0, 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) '4', 0);
        int int9 = simpleMethods0.getMin((int) '4', (int) ' ');
        int int12 = simpleMethods0.getMin((int) ' ', 0);
        int int15 = simpleMethods0.getMin((int) (short) 100, (int) (short) 100);
        int int18 = simpleMethods0.getMin((int) '4', (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', 0);
        int int6 = simpleMethods0.getMin(1, 0);
        int int9 = simpleMethods0.getMin((int) '4', (int) (byte) 0);
        int int12 = simpleMethods0.getMin((int) '4', (int) '#');
        int int15 = simpleMethods0.getMin((int) (short) 1, (-1));
        int int18 = simpleMethods0.getMin((int) (short) 1, 35);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) (short) 1, (int) ' ');
        int int9 = simpleMethods0.getMin(10, 35);
        int int12 = simpleMethods0.getMin((int) (short) -1, 1);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', 0);
        int int6 = simpleMethods0.getMin((int) 'a', (-1));
        int int9 = simpleMethods0.getMin((int) (short) 10, 32);
        int int12 = simpleMethods0.getMin((int) (byte) 10, (int) (byte) 1);
        int int15 = simpleMethods0.getMin((int) (byte) 10, (int) (byte) 1);
        int int18 = simpleMethods0.getMin((int) (short) -1, (int) (short) 1);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) '4', 0);
        int int9 = simpleMethods0.getMin((int) '4', (int) ' ');
        int int12 = simpleMethods0.getMin((-1), (int) (short) 100);
        int int15 = simpleMethods0.getMin(35, 32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) (short) 1, (int) ' ');
        int int9 = simpleMethods0.getMin(10, 35);
        int int12 = simpleMethods0.getMin((int) (short) -1, 1);
        int int15 = simpleMethods0.getMin(97, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin((int) (byte) 1, (int) (byte) 0);
        java.lang.Class<?> wildcardClass7 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test53");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', 0);
        int int6 = simpleMethods0.getMin((int) 'a', (-1));
        int int9 = simpleMethods0.getMin((int) (short) 10, 32);
        int int12 = simpleMethods0.getMin((int) (byte) 10, (int) (byte) 1);
        int int15 = simpleMethods0.getMin((int) (byte) 10, (int) (byte) 1);
        int int18 = simpleMethods0.getMin((int) (short) 0, 32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test54");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-1), (int) '#');
        java.lang.Class<?> wildcardClass4 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass4);
    }
}

