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
        org.apache.commons.math3.util.ArithmeticUtilsNew arithmeticUtilsNew0 = new org.apache.commons.math3.util.ArithmeticUtilsNew();
        java.lang.Class<?> wildcardClass1 = arithmeticUtilsNew0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        org.apache.commons.math3.util.ArithmeticUtilsNew arithmeticUtilsNew0 = new org.apache.commons.math3.util.ArithmeticUtilsNew();
        long long3 = arithmeticUtilsNew0.subAndCheck(100L, 0L);
        java.lang.Class<?> wildcardClass4 = arithmeticUtilsNew0.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        org.apache.commons.math3.util.ArithmeticUtilsNew arithmeticUtilsNew0 = new org.apache.commons.math3.util.ArithmeticUtilsNew();
        long long3 = arithmeticUtilsNew0.subAndCheck((long) (short) 100, (long) (short) -1);
        long long6 = arithmeticUtilsNew0.subAndCheck((long) ' ', (long) (byte) 10);
        java.lang.Class<?> wildcardClass7 = arithmeticUtilsNew0.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 101L + "'", long3 == 101L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 22L + "'", long6 == 22L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        org.apache.commons.math3.util.ArithmeticUtilsNew arithmeticUtilsNew0 = new org.apache.commons.math3.util.ArithmeticUtilsNew();
        long long3 = arithmeticUtilsNew0.subAndCheck((long) (short) 100, (long) (short) -1);
        long long6 = arithmeticUtilsNew0.subAndCheck((long) ' ', (long) (byte) 10);
        long long9 = arithmeticUtilsNew0.subAndCheck((long) ' ', (long) ' ');
        java.lang.Class<?> wildcardClass10 = arithmeticUtilsNew0.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 101L + "'", long3 == 101L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 22L + "'", long6 == 22L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        org.apache.commons.math3.util.ArithmeticUtilsNew arithmeticUtilsNew0 = new org.apache.commons.math3.util.ArithmeticUtilsNew();
        long long3 = arithmeticUtilsNew0.subAndCheck((long) (short) 100, (long) (short) -1);
        java.lang.Class<?> wildcardClass4 = arithmeticUtilsNew0.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 101L + "'", long3 == 101L);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        org.apache.commons.math3.util.ArithmeticUtilsNew arithmeticUtilsNew0 = new org.apache.commons.math3.util.ArithmeticUtilsNew();
        long long3 = arithmeticUtilsNew0.subAndCheck((long) (byte) 1, (long) (short) 100);
        java.lang.Class<?> wildcardClass4 = arithmeticUtilsNew0.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-99L) + "'", long3 == (-99L));
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        org.apache.commons.math3.util.ArithmeticUtilsNew arithmeticUtilsNew0 = new org.apache.commons.math3.util.ArithmeticUtilsNew();
        long long3 = arithmeticUtilsNew0.subAndCheck((long) (short) 100, (long) (short) -1);
        long long6 = arithmeticUtilsNew0.subAndCheck((long) ' ', (long) (byte) 10);
        long long9 = arithmeticUtilsNew0.subAndCheck(0L, (long) (short) 0);
        long long12 = arithmeticUtilsNew0.subAndCheck((long) '#', (long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 101L + "'", long3 == 101L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 22L + "'", long6 == 22L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 36L + "'", long12 == 36L);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        org.apache.commons.math3.util.ArithmeticUtilsNew arithmeticUtilsNew0 = new org.apache.commons.math3.util.ArithmeticUtilsNew();
        long long3 = arithmeticUtilsNew0.subAndCheck((long) (short) 100, (long) (short) -1);
        long long6 = arithmeticUtilsNew0.subAndCheck((long) '4', (long) (byte) -1);
        java.lang.Class<?> wildcardClass7 = arithmeticUtilsNew0.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 101L + "'", long3 == 101L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 53L + "'", long6 == 53L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        org.apache.commons.math3.util.ArithmeticUtilsNew arithmeticUtilsNew0 = new org.apache.commons.math3.util.ArithmeticUtilsNew();
        long long3 = arithmeticUtilsNew0.subAndCheck((long) (short) 1, (long) (byte) 10);
        java.lang.Class<?> wildcardClass4 = arithmeticUtilsNew0.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-9L) + "'", long3 == (-9L));
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        org.apache.commons.math3.util.ArithmeticUtilsNew arithmeticUtilsNew0 = new org.apache.commons.math3.util.ArithmeticUtilsNew();
        long long3 = arithmeticUtilsNew0.subAndCheck((long) (short) 100, (long) (short) -1);
        long long6 = arithmeticUtilsNew0.subAndCheck((long) ' ', (long) (byte) 10);
        long long9 = arithmeticUtilsNew0.subAndCheck(0L, (long) (short) 0);
        long long12 = arithmeticUtilsNew0.subAndCheck((long) (byte) 10, (long) (short) 10);
        java.lang.Class<?> wildcardClass13 = arithmeticUtilsNew0.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 101L + "'", long3 == 101L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 22L + "'", long6 == 22L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        org.apache.commons.math3.util.ArithmeticUtilsNew arithmeticUtilsNew0 = new org.apache.commons.math3.util.ArithmeticUtilsNew();
        long long3 = arithmeticUtilsNew0.subAndCheck((long) (short) 100, (long) (short) -1);
        long long6 = arithmeticUtilsNew0.subAndCheck((long) ' ', (long) (byte) 10);
        long long9 = arithmeticUtilsNew0.subAndCheck(0L, (long) (short) 0);
        long long12 = arithmeticUtilsNew0.subAndCheck((long) 'a', (long) (byte) -1);
        long long15 = arithmeticUtilsNew0.subAndCheck((-1L), 98L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 101L + "'", long3 == 101L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 22L + "'", long6 == 22L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 98L + "'", long12 == 98L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-99L) + "'", long15 == (-99L));
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        org.apache.commons.math3.util.ArithmeticUtilsNew arithmeticUtilsNew0 = new org.apache.commons.math3.util.ArithmeticUtilsNew();
        long long3 = arithmeticUtilsNew0.subAndCheck((long) (short) 100, (long) (short) -1);
        long long6 = arithmeticUtilsNew0.subAndCheck(22L, (long) 100);
        long long9 = arithmeticUtilsNew0.subAndCheck((-9L), 1L);
        long long12 = arithmeticUtilsNew0.subAndCheck(101L, 98L);
        java.lang.Class<?> wildcardClass13 = arithmeticUtilsNew0.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 101L + "'", long3 == 101L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-78L) + "'", long6 == (-78L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-10L) + "'", long9 == (-10L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        org.apache.commons.math3.util.ArithmeticUtilsNew arithmeticUtilsNew0 = new org.apache.commons.math3.util.ArithmeticUtilsNew();
        long long3 = arithmeticUtilsNew0.subAndCheck((long) (short) 100, (long) (short) -1);
        long long6 = arithmeticUtilsNew0.subAndCheck((long) ' ', (long) (byte) 10);
        long long9 = arithmeticUtilsNew0.subAndCheck(0L, (long) (short) 0);
        long long12 = arithmeticUtilsNew0.subAndCheck((long) 'a', (long) (byte) -1);
        long long15 = arithmeticUtilsNew0.subAndCheck((long) (byte) 0, (long) (short) 0);
        java.lang.Class<?> wildcardClass16 = arithmeticUtilsNew0.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 101L + "'", long3 == 101L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 22L + "'", long6 == 22L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 98L + "'", long12 == 98L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        org.apache.commons.math3.util.ArithmeticUtilsNew arithmeticUtilsNew0 = new org.apache.commons.math3.util.ArithmeticUtilsNew();
        long long3 = arithmeticUtilsNew0.subAndCheck((long) (short) 100, (long) (short) -1);
        long long6 = arithmeticUtilsNew0.subAndCheck((long) ' ', (long) (byte) 10);
        long long9 = arithmeticUtilsNew0.subAndCheck(0L, (long) (short) 0);
        long long12 = arithmeticUtilsNew0.subAndCheck((long) (byte) 10, (long) (short) 10);
        long long15 = arithmeticUtilsNew0.subAndCheck(101L, (-9L));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 101L + "'", long3 == 101L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 22L + "'", long6 == 22L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 110L + "'", long15 == 110L);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        org.apache.commons.math3.util.ArithmeticUtilsNew arithmeticUtilsNew0 = new org.apache.commons.math3.util.ArithmeticUtilsNew();
        long long3 = arithmeticUtilsNew0.subAndCheck((long) (short) 100, (long) (short) -1);
        long long6 = arithmeticUtilsNew0.subAndCheck(22L, (long) 100);
        long long9 = arithmeticUtilsNew0.subAndCheck((-78L), (-9L));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 101L + "'", long3 == 101L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-78L) + "'", long6 == (-78L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-69L) + "'", long9 == (-69L));
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        org.apache.commons.math3.util.ArithmeticUtilsNew arithmeticUtilsNew0 = new org.apache.commons.math3.util.ArithmeticUtilsNew();
        long long3 = arithmeticUtilsNew0.subAndCheck((long) (short) 1, (long) (byte) 10);
        long long6 = arithmeticUtilsNew0.subAndCheck((long) 10, (long) '4');
        java.lang.Class<?> wildcardClass7 = arithmeticUtilsNew0.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-9L) + "'", long3 == (-9L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-42L) + "'", long6 == (-42L));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        org.apache.commons.math3.util.ArithmeticUtilsNew arithmeticUtilsNew0 = new org.apache.commons.math3.util.ArithmeticUtilsNew();
        long long3 = arithmeticUtilsNew0.subAndCheck((long) (short) 100, (long) (short) -1);
        long long6 = arithmeticUtilsNew0.subAndCheck(22L, (long) 100);
        java.lang.Class<?> wildcardClass7 = arithmeticUtilsNew0.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 101L + "'", long3 == 101L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-78L) + "'", long6 == (-78L));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        org.apache.commons.math3.util.ArithmeticUtilsNew arithmeticUtilsNew0 = new org.apache.commons.math3.util.ArithmeticUtilsNew();
        long long3 = arithmeticUtilsNew0.subAndCheck((long) (short) 1, (long) (byte) 10);
        long long6 = arithmeticUtilsNew0.subAndCheck((-1L), (-78L));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-9L) + "'", long3 == (-9L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 77L + "'", long6 == 77L);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        org.apache.commons.math3.util.ArithmeticUtilsNew arithmeticUtilsNew0 = new org.apache.commons.math3.util.ArithmeticUtilsNew();
        long long3 = arithmeticUtilsNew0.subAndCheck((long) (short) 100, (long) (short) -1);
        long long6 = arithmeticUtilsNew0.subAndCheck((long) ' ', (long) (byte) 10);
        long long9 = arithmeticUtilsNew0.subAndCheck(0L, (long) (short) 0);
        java.lang.Class<?> wildcardClass10 = arithmeticUtilsNew0.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 101L + "'", long3 == 101L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 22L + "'", long6 == 22L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        org.apache.commons.math3.util.ArithmeticUtilsNew arithmeticUtilsNew0 = new org.apache.commons.math3.util.ArithmeticUtilsNew();
        long long3 = arithmeticUtilsNew0.subAndCheck((long) (short) 100, (long) (short) -1);
        long long6 = arithmeticUtilsNew0.subAndCheck((long) ' ', (long) (byte) 10);
        long long9 = arithmeticUtilsNew0.subAndCheck(0L, (long) (short) 0);
        long long12 = arithmeticUtilsNew0.subAndCheck((long) 'a', (long) ' ');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 101L + "'", long3 == 101L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 22L + "'", long6 == 22L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 65L + "'", long12 == 65L);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        org.apache.commons.math3.util.ArithmeticUtilsNew arithmeticUtilsNew0 = new org.apache.commons.math3.util.ArithmeticUtilsNew();
        long long3 = arithmeticUtilsNew0.subAndCheck((long) (byte) 1, (long) (short) 100);
        long long6 = arithmeticUtilsNew0.subAndCheck((long) (byte) 1, 1L);
        long long9 = arithmeticUtilsNew0.subAndCheck((-1L), 77L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-99L) + "'", long3 == (-99L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-78L) + "'", long9 == (-78L));
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        org.apache.commons.math3.util.ArithmeticUtilsNew arithmeticUtilsNew0 = new org.apache.commons.math3.util.ArithmeticUtilsNew();
        long long3 = arithmeticUtilsNew0.subAndCheck((long) (short) 100, (long) (short) -1);
        long long6 = arithmeticUtilsNew0.subAndCheck((long) ' ', (long) (byte) 10);
        long long9 = arithmeticUtilsNew0.subAndCheck((long) ' ', (long) ' ');
        long long12 = arithmeticUtilsNew0.subAndCheck(100L, (long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 101L + "'", long3 == 101L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 22L + "'", long6 == 22L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 99L + "'", long12 == 99L);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        org.apache.commons.math3.util.ArithmeticUtilsNew arithmeticUtilsNew0 = new org.apache.commons.math3.util.ArithmeticUtilsNew();
        long long3 = arithmeticUtilsNew0.subAndCheck((long) (short) 100, (long) (short) -1);
        long long6 = arithmeticUtilsNew0.subAndCheck((long) ' ', (long) (byte) 10);
        long long9 = arithmeticUtilsNew0.subAndCheck(0L, (long) (short) 0);
        long long12 = arithmeticUtilsNew0.subAndCheck((long) 'a', (long) (byte) -1);
        java.lang.Class<?> wildcardClass13 = arithmeticUtilsNew0.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 101L + "'", long3 == 101L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 22L + "'", long6 == 22L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 98L + "'", long12 == 98L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        org.apache.commons.math3.util.ArithmeticUtilsNew arithmeticUtilsNew0 = new org.apache.commons.math3.util.ArithmeticUtilsNew();
        long long3 = arithmeticUtilsNew0.subAndCheck((long) (short) 1, (long) (byte) 10);
        long long6 = arithmeticUtilsNew0.subAndCheck((long) 10, (long) '4');
        long long9 = arithmeticUtilsNew0.subAndCheck((long) (short) -1, 22L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-9L) + "'", long3 == (-9L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-42L) + "'", long6 == (-42L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-23L) + "'", long9 == (-23L));
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        org.apache.commons.math3.util.ArithmeticUtilsNew arithmeticUtilsNew0 = new org.apache.commons.math3.util.ArithmeticUtilsNew();
        long long3 = arithmeticUtilsNew0.subAndCheck((long) (short) 100, (long) (short) -1);
        long long6 = arithmeticUtilsNew0.subAndCheck((long) ' ', (long) (byte) 10);
        long long9 = arithmeticUtilsNew0.subAndCheck(0L, (long) (short) 0);
        long long12 = arithmeticUtilsNew0.subAndCheck((long) (byte) 10, (long) (short) 10);
        long long15 = arithmeticUtilsNew0.subAndCheck(100L, (long) (short) 10);
        long long18 = arithmeticUtilsNew0.subAndCheck(90L, (-23L));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 101L + "'", long3 == 101L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 22L + "'", long6 == 22L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 90L + "'", long15 == 90L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 113L + "'", long18 == 113L);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        org.apache.commons.math3.util.ArithmeticUtilsNew arithmeticUtilsNew0 = new org.apache.commons.math3.util.ArithmeticUtilsNew();
        long long3 = arithmeticUtilsNew0.subAndCheck((long) (byte) 1, (long) (short) 100);
        long long6 = arithmeticUtilsNew0.subAndCheck((-2L), (long) 'a');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-99L) + "'", long3 == (-99L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-99L) + "'", long6 == (-99L));
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        org.apache.commons.math3.util.ArithmeticUtilsNew arithmeticUtilsNew0 = new org.apache.commons.math3.util.ArithmeticUtilsNew();
        long long3 = arithmeticUtilsNew0.subAndCheck((long) (short) 100, (long) (short) -1);
        long long6 = arithmeticUtilsNew0.subAndCheck((long) ' ', (long) (byte) 10);
        long long9 = arithmeticUtilsNew0.subAndCheck((long) (short) 0, 10L);
        long long12 = arithmeticUtilsNew0.subAndCheck((-9L), 99L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 101L + "'", long3 == 101L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 22L + "'", long6 == 22L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-10L) + "'", long9 == (-10L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-108L) + "'", long12 == (-108L));
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        org.apache.commons.math3.util.ArithmeticUtilsNew arithmeticUtilsNew0 = new org.apache.commons.math3.util.ArithmeticUtilsNew();
        long long3 = arithmeticUtilsNew0.subAndCheck((long) (short) 100, (long) (short) -1);
        long long6 = arithmeticUtilsNew0.subAndCheck((long) ' ', (long) (byte) 10);
        long long9 = arithmeticUtilsNew0.subAndCheck(0L, (long) (short) 0);
        long long12 = arithmeticUtilsNew0.subAndCheck((long) (byte) 10, (long) (short) 10);
        long long15 = arithmeticUtilsNew0.subAndCheck((-1L), (long) (short) 1);
        java.lang.Class<?> wildcardClass16 = arithmeticUtilsNew0.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 101L + "'", long3 == 101L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 22L + "'", long6 == 22L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-2L) + "'", long15 == (-2L));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        org.apache.commons.math3.util.ArithmeticUtilsNew arithmeticUtilsNew0 = new org.apache.commons.math3.util.ArithmeticUtilsNew();
        long long3 = arithmeticUtilsNew0.subAndCheck(100L, 0L);
        long long6 = arithmeticUtilsNew0.subAndCheck(3L, 22L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-19L) + "'", long6 == (-19L));
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        org.apache.commons.math3.util.ArithmeticUtilsNew arithmeticUtilsNew0 = new org.apache.commons.math3.util.ArithmeticUtilsNew();
        long long3 = arithmeticUtilsNew0.subAndCheck((long) (short) 100, (long) (short) -1);
        long long6 = arithmeticUtilsNew0.subAndCheck((long) '4', (long) (byte) -1);
        long long9 = arithmeticUtilsNew0.subAndCheck(0L, 36L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 101L + "'", long3 == 101L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 53L + "'", long6 == 53L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-36L) + "'", long9 == (-36L));
    }
}

