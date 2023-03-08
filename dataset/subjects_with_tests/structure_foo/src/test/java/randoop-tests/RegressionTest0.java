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
        examples.Structure structure1 = new examples.Structure(100);
        int int2 = structure1.foo();
        java.lang.Class<?> wildcardClass3 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        examples.Structure structure1 = new examples.Structure(100);
        java.lang.Class<?> wildcardClass2 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        examples.Structure structure0 = new examples.Structure();
        int int1 = structure0.foo();
        int int2 = structure0.foo();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        examples.Structure structure1 = new examples.Structure(100);
        structure1.setX((int) (byte) 10);
        java.lang.Class<?> wildcardClass4 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        examples.Structure structure1 = new examples.Structure(0);
        structure1.setX(0);
        structure1.clear();
        int int5 = structure1.foo();
        int int6 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        examples.Structure structure1 = new examples.Structure(0);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.setX(100);
        structure1.setX((int) (short) 100);
        int int10 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 101 + "'", int10 == 101);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        examples.Structure structure1 = new examples.Structure(0);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.setX(100);
        structure1.clear();
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        examples.Structure structure1 = new examples.Structure(0);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.setX(100);
        structure1.setX((int) (short) 100);
        java.lang.Class<?> wildcardClass10 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        examples.Structure structure1 = new examples.Structure((int) (byte) 100);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        examples.Structure structure1 = new examples.Structure(1);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        examples.Structure structure1 = new examples.Structure(10);
        java.lang.Class<?> wildcardClass2 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        examples.Structure structure1 = new examples.Structure((int) (short) 1);
        structure1.clear();
        structure1.clear();
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        examples.Structure structure1 = new examples.Structure((int) (short) 1);
        structure1.clear();
        structure1.setX((int) (byte) 1);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        examples.Structure structure1 = new examples.Structure(100);
        structure1.setX((int) (byte) 10);
        structure1.setX(100);
        structure1.setX((int) (short) 0);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        examples.Structure structure1 = new examples.Structure(0);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.setX(100);
        structure1.setX((int) (short) 100);
        structure1.clear();
        structure1.clear();
        structure1.setX((int) 'a');
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        examples.Structure structure1 = new examples.Structure(100);
        int int2 = structure1.foo();
        structure1.clear();
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        examples.Structure structure1 = new examples.Structure(0);
        structure1.setX(0);
        java.lang.Class<?> wildcardClass4 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        examples.Structure structure1 = new examples.Structure(100);
        structure1.setX((int) (byte) 10);
        structure1.clear();
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        examples.Structure structure1 = new examples.Structure(0);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.setX(100);
        structure1.setX((int) (short) 100);
        structure1.clear();
        structure1.setX((int) '4');
        structure1.clear();
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        examples.Structure structure1 = new examples.Structure(0);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.setX((int) (byte) 100);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        examples.Structure structure0 = new examples.Structure();
        structure0.setX((int) 'a');
        java.lang.Class<?> wildcardClass3 = structure0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        examples.Structure structure1 = new examples.Structure(100);
        structure1.setX((int) (byte) 10);
        int int4 = structure1.foo();
        structure1.clear();
        structure1.setX((int) (short) 0);
        structure1.setX((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        examples.Structure structure1 = new examples.Structure(100);
        structure1.setX((int) (byte) 10);
        int int4 = structure1.foo();
        structure1.clear();
        structure1.clear();
        int int7 = structure1.foo();
        structure1.clear();
        structure1.setX((int) '#');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        examples.Structure structure1 = new examples.Structure(0);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.setX(100);
        structure1.setX((int) (short) 100);
        structure1.clear();
        structure1.setX(10);
        int int13 = structure1.foo();
        java.lang.Class<?> wildcardClass14 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 11 + "'", int13 == 11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        examples.Structure structure1 = new examples.Structure((int) 'a');
        int int2 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 98 + "'", int2 == 98);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        examples.Structure structure1 = new examples.Structure(98);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        examples.Structure structure1 = new examples.Structure(11);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        examples.Structure structure1 = new examples.Structure((int) 'a');
        structure1.clear();
        java.lang.Class<?> wildcardClass3 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        examples.Structure structure1 = new examples.Structure(0);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.setX(100);
        structure1.setX((int) (short) 100);
        structure1.clear();
        structure1.clear();
        int int12 = structure1.foo();
        java.lang.Class<?> wildcardClass13 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        examples.Structure structure1 = new examples.Structure(100);
        structure1.setX((int) (byte) 10);
        int int4 = structure1.foo();
        structure1.clear();
        structure1.setX((int) (short) 0);
        structure1.setX((int) (short) -1);
        structure1.setX((-1));
        structure1.setX(1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        examples.Structure structure1 = new examples.Structure((int) '4');
        structure1.clear();
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        examples.Structure structure1 = new examples.Structure((int) (short) 100);
        java.lang.Class<?> wildcardClass2 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        examples.Structure structure1 = new examples.Structure((int) (short) 0);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        examples.Structure structure1 = new examples.Structure((int) (short) -1);
        structure1.clear();
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        examples.Structure structure1 = new examples.Structure(100);
        structure1.setX((int) (byte) 10);
        int int4 = structure1.foo();
        structure1.clear();
        structure1.clear();
        int int7 = structure1.foo();
        structure1.clear();
        structure1.clear();
        structure1.setX(1);
        structure1.setX((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        examples.Structure structure1 = new examples.Structure(100);
        structure1.setX((int) (byte) 10);
        int int4 = structure1.foo();
        structure1.clear();
        structure1.clear();
        int int7 = structure1.foo();
        structure1.clear();
        structure1.clear();
        java.lang.Class<?> wildcardClass10 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        examples.Structure structure1 = new examples.Structure(0);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.setX(100);
        structure1.setX((int) (short) 100);
        structure1.clear();
        structure1.setX(10);
        int int13 = structure1.foo();
        int int14 = structure1.foo();
        structure1.setX((int) (byte) 0);
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 11 + "'", int13 == 11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 11 + "'", int14 == 11);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        examples.Structure structure1 = new examples.Structure(100);
        structure1.setX((int) (byte) 10);
        int int4 = structure1.foo();
        structure1.clear();
        structure1.clear();
        int int7 = structure1.foo();
        structure1.clear();
        structure1.clear();
        structure1.setX(1);
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        examples.Structure structure1 = new examples.Structure(100);
        structure1.setX((int) (byte) 10);
        int int4 = structure1.foo();
        structure1.clear();
        structure1.clear();
        int int7 = structure1.foo();
        int int8 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        examples.Structure structure1 = new examples.Structure((int) (byte) 1);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        examples.Structure structure1 = new examples.Structure(100);
        structure1.setX((int) (byte) 10);
        structure1.setX(100);
        structure1.clear();
        structure1.clear();
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        examples.Structure structure1 = new examples.Structure(100);
        structure1.setX((int) (byte) 10);
        int int4 = structure1.foo();
        structure1.clear();
        structure1.setX((int) (short) 0);
        structure1.setX((int) (short) -1);
        structure1.setX((-1));
        structure1.clear();
        int int13 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        examples.Structure structure1 = new examples.Structure(0);
        structure1.setX(0);
        structure1.clear();
        int int5 = structure1.foo();
        structure1.clear();
        structure1.setX(1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        examples.Structure structure1 = new examples.Structure(0);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.setX(100);
        structure1.setX((int) (short) 100);
        structure1.clear();
        java.lang.Class<?> wildcardClass11 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        examples.Structure structure1 = new examples.Structure((int) (short) -1);
        java.lang.Class<?> wildcardClass2 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        examples.Structure structure1 = new examples.Structure(100);
        structure1.setX((int) (byte) 10);
        int int4 = structure1.foo();
        structure1.clear();
        structure1.clear();
        int int7 = structure1.foo();
        structure1.clear();
        structure1.clear();
        structure1.setX(1);
        structure1.setX(1);
        java.lang.Class<?> wildcardClass14 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        examples.Structure structure1 = new examples.Structure(0);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.setX(100);
        structure1.setX((int) (short) 100);
        structure1.clear();
        structure1.setX(10);
        structure1.setX((int) (short) 100);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        examples.Structure structure1 = new examples.Structure(10);
        int int2 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 11 + "'", int2 == 11);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        examples.Structure structure1 = new examples.Structure((int) 'a');
        structure1.clear();
        structure1.setX((int) (short) 0);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        examples.Structure structure1 = new examples.Structure(101);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
        examples.Structure structure1 = new examples.Structure(100);
        structure1.clear();
        structure1.setX((int) (short) 10);
    }
}

