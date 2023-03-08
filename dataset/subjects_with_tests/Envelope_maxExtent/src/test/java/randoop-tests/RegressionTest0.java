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
        jts.Envelope envelope4 = new jts.Envelope((double) (byte) 0, (double) 'a', (-1.0d), 0.0d);
        double double5 = envelope4.maxExtent();
        envelope4.init((double) (byte) 10, 0.0d, (double) (byte) -1, (double) 100L);
        java.lang.Class<?> wildcardClass11 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        jts.Envelope envelope4 = new jts.Envelope((double) (byte) 0, (double) 'a', (-1.0d), 0.0d);
        double double5 = envelope4.maxExtent();
        java.lang.Class<?> wildcardClass6 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        jts.Envelope envelope4 = new jts.Envelope((double) ' ', (double) 10, (double) 10, 0.0d);
        double double5 = envelope4.getHeight();
        double double6 = envelope4.getWidth();
        java.lang.Class<?> wildcardClass7 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 22.0d + "'", double6 == 22.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        jts.Envelope envelope4 = new jts.Envelope((double) (short) -1, (double) (-1L), 22.0d, (double) (-1));
        boolean boolean5 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        jts.Envelope envelope4 = new jts.Envelope((double) (byte) 0, (double) 'a', (-1.0d), 0.0d);
        envelope4.init((double) 0L, (double) 1, 0.0d, (double) (byte) 1);
        double double10 = envelope4.getWidth();
        double double11 = envelope4.maxExtent();
        double double12 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        jts.Envelope envelope4 = new jts.Envelope((double) (byte) 0, (double) 'a', (-1.0d), 0.0d);
        java.lang.Class<?> wildcardClass5 = envelope4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        jts.Envelope envelope4 = new jts.Envelope((double) (byte) 0, (double) 'a', (-1.0d), 0.0d);
        envelope4.init((double) 0L, (double) 1, 0.0d, (double) (byte) 1);
        java.lang.Class<?> wildcardClass10 = envelope4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        jts.Envelope envelope4 = new jts.Envelope((double) (byte) 0, (double) 'a', (-1.0d), 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.getWidth();
        envelope4.init((double) 0, (double) 1.0f, 97.0d, (double) (short) 100);
        double double13 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 97.0d + "'", double7 == 97.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        jts.Envelope envelope4 = new jts.Envelope((double) (byte) 0, (double) 'a', (-1.0d), 0.0d);
        envelope4.init((double) 0L, (double) 1, 0.0d, (double) (byte) 1);
        double double10 = envelope4.maxExtent();
        double double11 = envelope4.maxExtent();
        boolean boolean12 = envelope4.isEnvelopeNull();
        java.lang.Class<?> wildcardClass13 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        jts.Envelope envelope4 = new jts.Envelope((double) (-1L), (double) (byte) 0, (double) (byte) 100, 97.0d);
        envelope4.init((double) 1, (double) 100.0f, (double) (-1), (double) (short) -1);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        jts.Envelope envelope4 = new jts.Envelope((double) (short) -1, (double) (-1L), 22.0d, (double) (-1));
        double double5 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 23.0d + "'", double5 == 23.0d);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        jts.Envelope envelope4 = new jts.Envelope((-1.0d), (-1.0d), (double) 1, 22.0d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        jts.Envelope envelope4 = new jts.Envelope((double) '#', (double) (-1), (double) 10L, (double) 1L);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        jts.Envelope envelope4 = new jts.Envelope((double) (byte) 0, (double) 'a', (-1.0d), 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.maxExtent();
        boolean boolean7 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        jts.Envelope envelope4 = new jts.Envelope((double) ' ', (double) 10, (double) 10, 0.0d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        jts.Envelope envelope4 = new jts.Envelope((double) ' ', (double) 10, (double) 10, 0.0d);
        double double5 = envelope4.getHeight();
        boolean boolean6 = envelope4.isEnvelopeNull();
        double double7 = envelope4.maxExtent();
        boolean boolean8 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 22.0d + "'", double7 == 22.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        jts.Envelope envelope4 = new jts.Envelope((double) (byte) 0, (double) 'a', (-1.0d), 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.getWidth();
        envelope4.init((double) 0, (double) 1.0f, 97.0d, (double) (short) 100);
        double double13 = envelope4.getHeight();
        double double14 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 97.0d + "'", double7 == 97.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 3.0d + "'", double13 == 3.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 3.0d + "'", double14 == 3.0d);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        jts.Envelope envelope4 = new jts.Envelope((double) ' ', (double) 10, (double) 10, 0.0d);
        double double5 = envelope4.getHeight();
        boolean boolean6 = envelope4.isEnvelopeNull();
        double double7 = envelope4.maxExtent();
        double double8 = envelope4.getHeight();
        double double9 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 22.0d + "'", double7 == 22.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 22.0d + "'", double9 == 22.0d);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        jts.Envelope envelope4 = new jts.Envelope((double) (short) 1, 3.0d, 1.0d, (double) (byte) 10);
        boolean boolean5 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        jts.Envelope envelope4 = new jts.Envelope((double) (byte) 0, (double) 'a', (-1.0d), 0.0d);
        envelope4.init((double) 0L, (double) 1, 0.0d, (double) (byte) 1);
        double double10 = envelope4.getWidth();
        double double11 = envelope4.maxExtent();
        boolean boolean12 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        jts.Envelope envelope4 = new jts.Envelope((double) (byte) 0, (double) 'a', (-1.0d), 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.getWidth();
        envelope4.init((double) 0, (double) 1.0f, 97.0d, (double) (short) 100);
        double double13 = envelope4.getHeight();
        java.lang.Class<?> wildcardClass14 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 97.0d + "'", double7 == 97.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 3.0d + "'", double13 == 3.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        jts.Envelope envelope4 = new jts.Envelope((double) (byte) 0, (double) 'a', (-1.0d), 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.getWidth();
        envelope4.init((double) 0, (double) 1.0f, 97.0d, (double) (short) 100);
        boolean boolean13 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 97.0d + "'", double7 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        jts.Envelope envelope4 = new jts.Envelope((double) (byte) 0, (double) 'a', (-1.0d), 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.maxExtent();
        envelope4.init((-1.0d), 0.0d, (double) (short) 0, (double) (byte) 1);
        double double12 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        jts.Envelope envelope4 = new jts.Envelope((double) (byte) 0, (double) 'a', (-1.0d), 0.0d);
        double double5 = envelope4.maxExtent();
        envelope4.init((double) (byte) 10, 0.0d, (double) (byte) -1, (double) 100L);
        envelope4.init(0.0d, 0.0d, (double) 10.0f, (double) '4');
        boolean boolean16 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        jts.Envelope envelope4 = new jts.Envelope((double) (byte) 0, (double) 'a', (-1.0d), 0.0d);
        envelope4.init((double) 0L, (double) 1, 0.0d, (double) (byte) 1);
        double double10 = envelope4.getWidth();
        boolean boolean11 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        jts.Envelope envelope4 = new jts.Envelope((double) ' ', (double) 10, (double) 10, 0.0d);
        double double5 = envelope4.getHeight();
        boolean boolean6 = envelope4.isEnvelopeNull();
        envelope4.init(100.0d, (double) 'a', (double) (byte) 10, (double) (byte) -1);
        boolean boolean12 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        jts.Envelope envelope4 = new jts.Envelope((double) (byte) 0, (double) 'a', (-1.0d), 0.0d);
        envelope4.init((double) 0L, (double) 1, 0.0d, (double) (byte) 1);
        double double10 = envelope4.maxExtent();
        double double11 = envelope4.getHeight();
        java.lang.Class<?> wildcardClass12 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        jts.Envelope envelope4 = new jts.Envelope((double) (byte) 0, (double) 'a', (-1.0d), 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.getHeight();
        double double7 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        jts.Envelope envelope4 = new jts.Envelope((double) (byte) 1, (-1.0d), (double) 0L, (double) 0.0f);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        jts.Envelope envelope4 = new jts.Envelope((double) (-1L), (double) (short) 10, (double) (-1L), (double) (short) 1);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        jts.Envelope envelope4 = new jts.Envelope((double) (short) 1, 3.0d, 1.0d, (double) (byte) 10);
        envelope4.init((double) (short) 1, 22.0d, 23.0d, (double) 100);
        java.lang.Class<?> wildcardClass10 = envelope4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        jts.Envelope envelope4 = new jts.Envelope((double) (byte) 0, (double) 'a', (-1.0d), 0.0d);
        envelope4.init((double) 0L, (double) 1, 0.0d, (double) (byte) 1);
        double double10 = envelope4.getWidth();
        double double11 = envelope4.getWidth();
        java.lang.Class<?> wildcardClass12 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        jts.Envelope envelope4 = new jts.Envelope((double) (short) 1, 3.0d, 1.0d, (double) (byte) 10);
        double double5 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 2.0d + "'", double5 == 2.0d);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        jts.Envelope envelope4 = new jts.Envelope((double) (byte) 0, (double) 'a', (-1.0d), 0.0d);
        double double5 = envelope4.maxExtent();
        envelope4.init((double) (byte) 10, 0.0d, (double) (byte) -1, (double) 100L);
        envelope4.init(22.0d, 0.0d, (double) (byte) 0, (double) ' ');
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        jts.Envelope envelope4 = new jts.Envelope((double) ' ', (double) 10, (double) 10, 0.0d);
        double double5 = envelope4.getHeight();
        double double6 = envelope4.getWidth();
        double double7 = envelope4.getHeight();
        double double8 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 22.0d + "'", double6 == 22.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        jts.Envelope envelope4 = new jts.Envelope((double) (byte) 0, (double) 'a', (-1.0d), 0.0d);
        double double5 = envelope4.maxExtent();
        double double6 = envelope4.maxExtent();
        double double7 = envelope4.getWidth();
        boolean boolean8 = envelope4.isEnvelopeNull();
        double double9 = envelope4.getWidth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 97.0d + "'", double7 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 97.0d + "'", double9 == 97.0d);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        jts.Envelope envelope4 = new jts.Envelope((double) 10, (double) 10.0f, (double) 1.0f, (double) 1L);
        double double5 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        jts.Envelope envelope4 = new jts.Envelope((double) (byte) 0, (double) 'a', (-1.0d), 0.0d);
        double double5 = envelope4.maxExtent();
        envelope4.init((double) (byte) 10, 0.0d, (double) (byte) -1, (double) 100L);
        double double11 = envelope4.maxExtent();
        double double12 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 101.0d + "'", double11 == 101.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 101.0d + "'", double12 == 101.0d);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        jts.Envelope envelope4 = new jts.Envelope((double) (byte) 0, (double) 'a', (-1.0d), 0.0d);
        envelope4.init((double) 0L, (double) 1, 0.0d, (double) (byte) 1);
        double double10 = envelope4.maxExtent();
        double double11 = envelope4.maxExtent();
        double double12 = envelope4.getWidth();
        envelope4.init((double) (-1L), 1.0d, (double) ' ', (double) 1);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        jts.Envelope envelope4 = new jts.Envelope(101.0d, 3.0d, (double) (short) 100, (double) (-1));
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        jts.Envelope envelope4 = new jts.Envelope((double) (byte) 0, (double) 'a', (-1.0d), 0.0d);
        double double5 = envelope4.maxExtent();
        envelope4.init((double) (byte) 10, 0.0d, (double) (byte) -1, (double) 100L);
        envelope4.init((double) (short) 0, (double) ' ', 10.0d, (double) (-1.0f));
        double double16 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 32.0d + "'", double16 == 32.0d);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        jts.Envelope envelope4 = new jts.Envelope((double) (byte) 0, (double) 'a', (-1.0d), 0.0d);
        boolean boolean5 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        jts.Envelope envelope4 = new jts.Envelope((double) (-1L), (double) (byte) 0, (double) (byte) 100, 97.0d);
        envelope4.init((double) (short) 0, (double) (byte) 10, (double) 0, (double) 10.0f);
        java.lang.Class<?> wildcardClass10 = envelope4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        jts.Envelope envelope4 = new jts.Envelope((double) ' ', (double) 10, (double) 10, 0.0d);
        double double5 = envelope4.getHeight();
        double double6 = envelope4.getWidth();
        double double7 = envelope4.getHeight();
        java.lang.Class<?> wildcardClass8 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 22.0d + "'", double6 == 22.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        jts.Envelope envelope4 = new jts.Envelope((double) 'a', 3.0d, 10.0d, 10.0d);
        double double5 = envelope4.getHeight();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        jts.Envelope envelope4 = new jts.Envelope((double) ' ', (double) 10, (double) 10, 0.0d);
        double double5 = envelope4.getHeight();
        boolean boolean6 = envelope4.isEnvelopeNull();
        double double7 = envelope4.maxExtent();
        double double8 = envelope4.getHeight();
        double double9 = envelope4.getHeight();
        java.lang.Class<?> wildcardClass10 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 22.0d + "'", double7 == 22.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        jts.Envelope envelope4 = new jts.Envelope((double) (byte) 0, (double) 'a', (-1.0d), 0.0d);
        double double5 = envelope4.maxExtent();
        envelope4.init((double) (byte) 10, 0.0d, (double) (byte) -1, (double) 100L);
        envelope4.init(0.0d, 0.0d, (double) 10.0f, (double) '4');
        double double16 = envelope4.getWidth();
        double double17 = envelope4.maxExtent();
        double double18 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 42.0d + "'", double17 == 42.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 42.0d + "'", double18 == 42.0d);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        jts.Envelope envelope4 = new jts.Envelope((double) (byte) 0, (double) 'a', (-1.0d), 0.0d);
        double double5 = envelope4.maxExtent();
        envelope4.init((double) (byte) 10, 0.0d, (double) (byte) -1, (double) 100L);
        envelope4.init(0.0d, 0.0d, (double) 10.0f, (double) '4');
        java.lang.Class<?> wildcardClass16 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        jts.Envelope envelope4 = new jts.Envelope((double) (byte) 0, (double) 'a', (-1.0d), 0.0d);
        envelope4.init((double) 0L, (double) 1, 0.0d, (double) (byte) 1);
        double double10 = envelope4.getWidth();
        double double11 = envelope4.maxExtent();
        double double12 = envelope4.getWidth();
        boolean boolean13 = envelope4.isEnvelopeNull();
        java.lang.Class<?> wildcardClass14 = envelope4.getClass();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        jts.Envelope envelope4 = new jts.Envelope((double) 'a', 0.0d, (double) (byte) 1, 1.0d);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        jts.Envelope envelope4 = new jts.Envelope((double) 0.0f, (double) 100.0f, (double) 0, (double) 1L);
        boolean boolean5 = envelope4.isEnvelopeNull();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
        jts.Envelope envelope4 = new jts.Envelope((double) ' ', (double) 10, (double) 10, 0.0d);
        double double5 = envelope4.getHeight();
        double double6 = envelope4.getWidth();
        double double7 = envelope4.maxExtent();
        double double8 = envelope4.maxExtent();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 22.0d + "'", double6 == 22.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 22.0d + "'", double7 == 22.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 22.0d + "'", double8 == 22.0d);
    }
}

