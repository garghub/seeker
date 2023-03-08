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
        // The following exception was thrown during execution in test generation
        try {
            examples.RingBuffer<java.lang.Comparable<java.lang.String>> strComparableRingBuffer1 = new examples.RingBuffer<java.lang.Comparable<java.lang.String>>((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        examples.RingBuffer<java.lang.String> strRingBuffer1 = new examples.RingBuffer<java.lang.String>((int) (short) 1);
        int int2 = strRingBuffer1.count();
        // The following exception was thrown during execution in test generation
        try {
            strRingBuffer1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: buffer is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        examples.RingBuffer<java.lang.String> strRingBuffer1 = new examples.RingBuffer<java.lang.String>((int) (short) 1);
        int int2 = strRingBuffer1.count();
        int int3 = strRingBuffer1.capacity();
        java.lang.Class<?> wildcardClass4 = strRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        examples.RingBuffer<java.lang.String> strRingBuffer1 = new examples.RingBuffer<java.lang.String>((int) (short) 1);
        boolean boolean2 = strRingBuffer1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            strRingBuffer1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: buffer is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        examples.RingBuffer<java.lang.String> strRingBuffer1 = new examples.RingBuffer<java.lang.String>((int) (short) 1);
        boolean boolean2 = strRingBuffer1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = strRingBuffer1.item();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: empty buffer");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        examples.RingBuffer<java.lang.String> strRingBuffer1 = new examples.RingBuffer<java.lang.String>((int) (short) 1);
        int int2 = strRingBuffer1.dataCount();
        // The following exception was thrown during execution in test generation
        try {
            strRingBuffer1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: buffer is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        examples.RingBuffer<java.lang.String> strRingBuffer1 = new examples.RingBuffer<java.lang.String>((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            strRingBuffer1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: buffer is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        examples.RingBuffer<java.lang.String> strRingBuffer1 = new examples.RingBuffer<java.lang.String>((int) (short) 1);
        int int2 = strRingBuffer1.count();
        int int3 = strRingBuffer1.capacity();
        // The following exception was thrown during execution in test generation
        try {
            strRingBuffer1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: buffer is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        examples.RingBuffer<java.lang.Class<?>> wildcardClassRingBuffer1 = new examples.RingBuffer<java.lang.Class<?>>((int) '#');
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        examples.RingBuffer<java.lang.String> strRingBuffer1 = new examples.RingBuffer<java.lang.String>((int) (short) 1);
        int int2 = strRingBuffer1.dataCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = strRingBuffer1.item();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: empty buffer");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        examples.RingBuffer<java.lang.String> strRingBuffer1 = new examples.RingBuffer<java.lang.String>((int) (short) 1);
        int int2 = strRingBuffer1.count();
        java.lang.Class<?> wildcardClass3 = strRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        examples.RingBuffer<java.lang.String> strRingBuffer1 = new examples.RingBuffer<java.lang.String>((int) ' ');
        int int2 = strRingBuffer1.dataCount();
        // The following exception was thrown during execution in test generation
        try {
            strRingBuffer1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: buffer is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 33 + "'", int2 == 33);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        examples.RingBuffer<java.lang.String> strRingBuffer1 = new examples.RingBuffer<java.lang.String>((int) (short) 1);
        int int2 = strRingBuffer1.dataCount();
        java.lang.Class<?> wildcardClass3 = strRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        examples.RingBuffer<java.lang.Class<?>> wildcardClassRingBuffer1 = new examples.RingBuffer<java.lang.Class<?>>(33);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        examples.RingBuffer<java.lang.String> strRingBuffer1 = new examples.RingBuffer<java.lang.String>((int) (short) 1);
        int int2 = strRingBuffer1.count();
        int int3 = strRingBuffer1.capacity();
        strRingBuffer1.wipeOut();
        int int5 = strRingBuffer1.dataCount();
        int int6 = strRingBuffer1.count();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        // The following exception was thrown during execution in test generation
        try {
            examples.RingBuffer<java.lang.String> strRingBuffer1 = new examples.RingBuffer<java.lang.String>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        examples.RingBuffer<java.lang.String> strRingBuffer1 = new examples.RingBuffer<java.lang.String>((int) (short) 1);
        int int2 = strRingBuffer1.count();
        int int3 = strRingBuffer1.capacity();
        strRingBuffer1.wipeOut();
        int int5 = strRingBuffer1.dataCount();
        int int6 = strRingBuffer1.capacity();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = strRingBuffer1.item();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: empty buffer");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        examples.RingBuffer<java.lang.String> strRingBuffer1 = new examples.RingBuffer<java.lang.String>((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = strRingBuffer1.item();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: empty buffer");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        examples.RingBuffer<java.lang.String> strRingBuffer1 = new examples.RingBuffer<java.lang.String>((int) (short) 1);
        int int2 = strRingBuffer1.count();
        int int3 = strRingBuffer1.capacity();
        int int4 = strRingBuffer1.dataCount();
        boolean boolean5 = strRingBuffer1.isEmpty();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        examples.RingBuffer<java.lang.String> strRingBuffer1 = new examples.RingBuffer<java.lang.String>((int) (short) 1);
        int int2 = strRingBuffer1.count();
        int int3 = strRingBuffer1.capacity();
        strRingBuffer1.wipeOut();
        int int5 = strRingBuffer1.dataCount();
        int int6 = strRingBuffer1.dataCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = strRingBuffer1.item();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: empty buffer");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        examples.RingBuffer<java.lang.String> strRingBuffer1 = new examples.RingBuffer<java.lang.String>((int) (short) 1);
        strRingBuffer1.wipeOut();
        boolean boolean3 = strRingBuffer1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        examples.RingBuffer<java.lang.String> strRingBuffer1 = new examples.RingBuffer<java.lang.String>((int) (short) 1);
        int int2 = strRingBuffer1.count();
        int int3 = strRingBuffer1.capacity();
        strRingBuffer1.wipeOut();
        int int5 = strRingBuffer1.dataCount();
        int int6 = strRingBuffer1.dataCount();
        strRingBuffer1.wipeOut();
        java.lang.Class<?> wildcardClass8 = strRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        examples.RingBuffer<java.lang.String> strRingBuffer1 = new examples.RingBuffer<java.lang.String>((int) (short) 1);
        int int2 = strRingBuffer1.count();
        int int3 = strRingBuffer1.capacity();
        strRingBuffer1.wipeOut();
        boolean boolean5 = strRingBuffer1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = strRingBuffer1.item();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: empty buffer");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        examples.RingBuffer<java.lang.String> strRingBuffer1 = new examples.RingBuffer<java.lang.String>((int) (short) 1);
        int int2 = strRingBuffer1.dataCount();
        boolean boolean3 = strRingBuffer1.isEmpty();
        boolean boolean4 = strRingBuffer1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = strRingBuffer1.item();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: empty buffer");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        examples.RingBuffer<java.lang.String> strRingBuffer1 = new examples.RingBuffer<java.lang.String>((int) (short) 1);
        int int2 = strRingBuffer1.dataCount();
        boolean boolean3 = strRingBuffer1.isEmpty();
        boolean boolean4 = strRingBuffer1.isFull();
        int int5 = strRingBuffer1.count();
        java.lang.Class<?> wildcardClass6 = strRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        examples.RingBuffer<java.lang.String> strRingBuffer1 = new examples.RingBuffer<java.lang.String>((int) (byte) 100);
        int int2 = strRingBuffer1.count();
        boolean boolean3 = strRingBuffer1.isEmpty();
        strRingBuffer1.wipeOut();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        examples.RingBuffer<java.lang.String> strRingBuffer1 = new examples.RingBuffer<java.lang.String>((int) (short) 1);
        strRingBuffer1.wipeOut();
        int int3 = strRingBuffer1.count();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        examples.RingBuffer<java.lang.String> strRingBuffer1 = new examples.RingBuffer<java.lang.String>((int) ' ');
        int int2 = strRingBuffer1.capacity();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        examples.RingBuffer<java.lang.String> strRingBuffer1 = new examples.RingBuffer<java.lang.String>((int) (short) 1);
        int int2 = strRingBuffer1.dataCount();
        boolean boolean3 = strRingBuffer1.isEmpty();
        boolean boolean4 = strRingBuffer1.isEmpty();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        // The following exception was thrown during execution in test generation
        try {
            examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        examples.RingBuffer<java.lang.String> strRingBuffer1 = new examples.RingBuffer<java.lang.String>((int) (short) 1);
        int int2 = strRingBuffer1.count();
        int int3 = strRingBuffer1.capacity();
        int int4 = strRingBuffer1.dataCount();
        int int5 = strRingBuffer1.dataCount();
        strRingBuffer1.wipeOut();
        int int7 = strRingBuffer1.capacity();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        examples.RingBuffer<java.lang.String> strRingBuffer1 = new examples.RingBuffer<java.lang.String>((int) (short) 1);
        int int2 = strRingBuffer1.count();
        int int3 = strRingBuffer1.capacity();
        int int4 = strRingBuffer1.dataCount();
        int int5 = strRingBuffer1.dataCount();
        int int6 = strRingBuffer1.dataCount();
        int int7 = strRingBuffer1.capacity();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        examples.RingBuffer<java.lang.String> strRingBuffer1 = new examples.RingBuffer<java.lang.String>((int) (byte) 100);
        int int2 = strRingBuffer1.count();
        boolean boolean3 = strRingBuffer1.isEmpty();
        java.lang.Class<?> wildcardClass4 = strRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        examples.RingBuffer<java.lang.String> strRingBuffer1 = new examples.RingBuffer<java.lang.String>((int) (short) 1);
        int int2 = strRingBuffer1.dataCount();
        boolean boolean3 = strRingBuffer1.isEmpty();
        boolean boolean4 = strRingBuffer1.isFull();
        boolean boolean5 = strRingBuffer1.isFull();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        examples.RingBuffer<examples.RingBuffer<java.lang.String>> strRingBufferRingBuffer1 = new examples.RingBuffer<examples.RingBuffer<java.lang.String>>((int) (short) 1);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        examples.RingBuffer<java.lang.String> strRingBuffer1 = new examples.RingBuffer<java.lang.String>((int) (short) 1);
        int int2 = strRingBuffer1.count();
        int int3 = strRingBuffer1.capacity();
        strRingBuffer1.wipeOut();
        int int5 = strRingBuffer1.dataCount();
        int int6 = strRingBuffer1.capacity();
        int int7 = strRingBuffer1.dataCount();
        boolean boolean8 = strRingBuffer1.isFull();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        examples.RingBuffer<java.lang.String> strRingBuffer1 = new examples.RingBuffer<java.lang.String>((int) (short) 1);
        int int2 = strRingBuffer1.count();
        int int3 = strRingBuffer1.capacity();
        int int4 = strRingBuffer1.dataCount();
        int int5 = strRingBuffer1.count();
        int int6 = strRingBuffer1.count();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        examples.RingBuffer<java.lang.String> strRingBuffer1 = new examples.RingBuffer<java.lang.String>((int) (short) 1);
        boolean boolean2 = strRingBuffer1.isEmpty();
        int int3 = strRingBuffer1.capacity();
        int int4 = strRingBuffer1.dataCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        examples.RingBuffer<java.lang.String> strRingBuffer1 = new examples.RingBuffer<java.lang.String>((int) (short) 1);
        boolean boolean2 = strRingBuffer1.isEmpty();
        int int3 = strRingBuffer1.dataCount();
        int int4 = strRingBuffer1.capacity();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        examples.RingBuffer<java.lang.String> strRingBuffer1 = new examples.RingBuffer<java.lang.String>((int) (byte) 100);
        int int2 = strRingBuffer1.count();
        boolean boolean3 = strRingBuffer1.isFull();
        int int4 = strRingBuffer1.count();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) 'a');
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        examples.RingBuffer<java.lang.String> strRingBuffer1 = new examples.RingBuffer<java.lang.String>((int) (short) 1);
        boolean boolean2 = strRingBuffer1.isEmpty();
        strRingBuffer1.extend("hi!");
        boolean boolean5 = strRingBuffer1.isEmpty();
        strRingBuffer1.remove();
        int int7 = strRingBuffer1.dataCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        examples.RingBuffer<java.lang.String> strRingBuffer1 = new examples.RingBuffer<java.lang.String>((int) ' ');
        int int2 = strRingBuffer1.dataCount();
        strRingBuffer1.wipeOut();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = strRingBuffer1.item();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: empty buffer");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 33 + "'", int2 == 33);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        examples.RingBuffer<java.lang.String> strRingBuffer1 = new examples.RingBuffer<java.lang.String>((int) (short) 1);
        int int2 = strRingBuffer1.count();
        int int3 = strRingBuffer1.capacity();
        int int4 = strRingBuffer1.dataCount();
        int int5 = strRingBuffer1.dataCount();
        int int6 = strRingBuffer1.dataCount();
        strRingBuffer1.extend("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        examples.RingBuffer<java.lang.String> strRingBuffer1 = new examples.RingBuffer<java.lang.String>((int) (short) 1);
        int int2 = strRingBuffer1.dataCount();
        boolean boolean3 = strRingBuffer1.isEmpty();
        boolean boolean4 = strRingBuffer1.isFull();
        strRingBuffer1.extend("");
        boolean boolean7 = strRingBuffer1.isFull();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        examples.RingBuffer<java.lang.String> strRingBuffer1 = new examples.RingBuffer<java.lang.String>((int) (short) 1);
        int int2 = strRingBuffer1.count();
        int int3 = strRingBuffer1.capacity();
        strRingBuffer1.wipeOut();
        int int5 = strRingBuffer1.dataCount();
        int int6 = strRingBuffer1.dataCount();
        int int7 = strRingBuffer1.dataCount();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        examples.RingBuffer<java.lang.String> strRingBuffer1 = new examples.RingBuffer<java.lang.String>((int) (short) 1);
        int int2 = strRingBuffer1.count();
        int int3 = strRingBuffer1.capacity();
        int int4 = strRingBuffer1.dataCount();
        int int5 = strRingBuffer1.count();
        int int6 = strRingBuffer1.dataCount();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        examples.RingBuffer<java.lang.String> strRingBuffer1 = new examples.RingBuffer<java.lang.String>((int) (short) 1);
        boolean boolean2 = strRingBuffer1.isEmpty();
        strRingBuffer1.extend("hi!");
        boolean boolean5 = strRingBuffer1.isEmpty();
        java.lang.Object obj6 = strRingBuffer1.item();
        int int7 = strRingBuffer1.count();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "hi!" + "'", obj6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        examples.RingBuffer<java.lang.String> strRingBuffer1 = new examples.RingBuffer<java.lang.String>((int) (short) 1);
        int int2 = strRingBuffer1.count();
        int int3 = strRingBuffer1.capacity();
        int int4 = strRingBuffer1.dataCount();
        int int5 = strRingBuffer1.dataCount();
        int int6 = strRingBuffer1.dataCount();
        boolean boolean7 = strRingBuffer1.isFull();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        examples.RingBuffer<java.lang.String> strRingBuffer1 = new examples.RingBuffer<java.lang.String>((int) (short) 1);
        int int2 = strRingBuffer1.count();
        int int3 = strRingBuffer1.capacity();
        strRingBuffer1.wipeOut();
        int int5 = strRingBuffer1.dataCount();
        int int6 = strRingBuffer1.dataCount();
        strRingBuffer1.wipeOut();
        int int8 = strRingBuffer1.dataCount();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
        examples.RingBuffer<java.lang.String> strRingBuffer1 = new examples.RingBuffer<java.lang.String>((int) (short) 1);
        boolean boolean2 = strRingBuffer1.isEmpty();
        strRingBuffer1.extend("hi!");
        boolean boolean5 = strRingBuffer1.isEmpty();
        java.lang.Class<?> wildcardClass6 = strRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test53");
        examples.RingBuffer<java.lang.String> strRingBuffer1 = new examples.RingBuffer<java.lang.String>((int) (short) 1);
        int int2 = strRingBuffer1.dataCount();
        boolean boolean3 = strRingBuffer1.isFull();
        java.lang.Class<?> wildcardClass4 = strRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test54");
        examples.RingBuffer<java.lang.String> strRingBuffer1 = new examples.RingBuffer<java.lang.String>((int) (short) 1);
        int int2 = strRingBuffer1.count();
        int int3 = strRingBuffer1.capacity();
        int int4 = strRingBuffer1.dataCount();
        int int5 = strRingBuffer1.dataCount();
        strRingBuffer1.wipeOut();
        java.lang.Class<?> wildcardClass7 = strRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test55");
        examples.RingBuffer<java.lang.String> strRingBuffer1 = new examples.RingBuffer<java.lang.String>((int) (short) 1);
        int int2 = strRingBuffer1.count();
        boolean boolean3 = strRingBuffer1.isFull();
        boolean boolean4 = strRingBuffer1.isEmpty();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test56");
        examples.RingBuffer<java.lang.String> strRingBuffer1 = new examples.RingBuffer<java.lang.String>((int) ' ');
        int int2 = strRingBuffer1.count();
        int int3 = strRingBuffer1.capacity();
        boolean boolean4 = strRingBuffer1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = strRingBuffer1.item();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: empty buffer");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test57");
        examples.RingBuffer<java.lang.String> strRingBuffer1 = new examples.RingBuffer<java.lang.String>((int) ' ');
        int int2 = strRingBuffer1.dataCount();
        int int3 = strRingBuffer1.capacity();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 33 + "'", int2 == 33);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test58");
        examples.RingBuffer<java.lang.String> strRingBuffer1 = new examples.RingBuffer<java.lang.String>((int) (short) 1);
        int int2 = strRingBuffer1.capacity();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test59");
        examples.RingBuffer<java.lang.String> strRingBuffer1 = new examples.RingBuffer<java.lang.String>((int) (short) 1);
        int int2 = strRingBuffer1.count();
        int int3 = strRingBuffer1.capacity();
        strRingBuffer1.wipeOut();
        strRingBuffer1.wipeOut();
        java.lang.Class<?> wildcardClass6 = strRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test60");
        examples.RingBuffer<java.lang.String> strRingBuffer1 = new examples.RingBuffer<java.lang.String>((int) (short) 1);
        int int2 = strRingBuffer1.count();
        int int3 = strRingBuffer1.capacity();
        strRingBuffer1.wipeOut();
        int int5 = strRingBuffer1.dataCount();
        int int6 = strRingBuffer1.dataCount();
        strRingBuffer1.extend("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
    }
}

