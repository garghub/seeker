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
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        java.lang.Class<?> wildcardClass1 = booleanUtils0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass4 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass7 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass10 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass4 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass10 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass13 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass13 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass13 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass19 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass16 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass19 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, false);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, false);
        int int6 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass7 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass25 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass22 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass7 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass13 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass19 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass7 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(false, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass16 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, false);
        int int6 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass7 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass7 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(true, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, false);
        int int6 = booleanUtils0.compare(true, false);
        int int9 = booleanUtils0.compare(true, false);
        int int12 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass13 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(true, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(false, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(true, false);
        int int27 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass28 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, false);
        int int6 = booleanUtils0.compare(true, false);
        int int9 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass10 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(true, false);
        int int9 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass10 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(false, true);
        java.lang.Class<?> wildcardClass10 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(false, true);
        int int27 = booleanUtils0.compare(false, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass10 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, false);
        int int6 = booleanUtils0.compare(true, false);
        int int9 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass10 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(false, false);
        java.lang.Class<?> wildcardClass16 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(true, false);
        int int27 = booleanUtils0.compare(false, true);
        int int30 = booleanUtils0.compare(false, true);
        int int33 = booleanUtils0.compare(true, false);
        int int36 = booleanUtils0.compare(true, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(true, false);
        int int27 = booleanUtils0.compare(false, true);
        int int30 = booleanUtils0.compare(false, true);
        int int33 = booleanUtils0.compare(false, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass16 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(false, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(true, true);
        int int15 = booleanUtils0.compare(false, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(false, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(false, true);
        int int12 = booleanUtils0.compare(true, false);
        java.lang.Class<?> wildcardClass13 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(true, true);
        int int24 = booleanUtils0.compare(true, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(false, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(true, false);
        int int27 = booleanUtils0.compare(false, true);
        int int30 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass31 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(false, false);
        int int18 = booleanUtils0.compare(true, true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(false, false);
        int int6 = booleanUtils0.compare(false, true);
        int int9 = booleanUtils0.compare(true, true);
        java.lang.Class<?> wildcardClass10 = booleanUtils0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(true, true);
        int int12 = booleanUtils0.compare(true, false);
        int int15 = booleanUtils0.compare(false, true);
        int int18 = booleanUtils0.compare(true, false);
        int int21 = booleanUtils0.compare(false, false);
        int int24 = booleanUtils0.compare(true, false);
        int int27 = booleanUtils0.compare(false, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test53");
        lang3.BooleanUtils booleanUtils0 = new lang3.BooleanUtils();
        int int3 = booleanUtils0.compare(true, true);
        int int6 = booleanUtils0.compare(true, true);
        int int9 = booleanUtils0.compare(false, false);
        int int12 = booleanUtils0.compare(false, true);
        int int15 = booleanUtils0.compare(true, false);
        int int18 = booleanUtils0.compare(true, true);
        int int21 = booleanUtils0.compare(true, false);
        int int24 = booleanUtils0.compare(false, false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }
}

