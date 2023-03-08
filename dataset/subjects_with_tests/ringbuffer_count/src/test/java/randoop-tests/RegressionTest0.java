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
        // The following exception was thrown during execution in test generation
        try {
            examples.RingBuffer<java.lang.Comparable<java.lang.String>> strComparableRingBuffer1 = new examples.RingBuffer<java.lang.Comparable<java.lang.String>>((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
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
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        examples.RingBuffer<java.lang.String> strRingBuffer1 = new examples.RingBuffer<java.lang.String>((int) (short) 1);
        int int2 = strRingBuffer1.count();
        int int3 = strRingBuffer1.capacity();
        java.lang.Class<?> wildcardClass4 = strRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
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
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
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
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
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
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
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
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
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
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        examples.RingBuffer<java.lang.Class<?>> wildcardClassRingBuffer1 = new examples.RingBuffer<java.lang.Class<?>>((int) '#');
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
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
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        examples.RingBuffer<java.lang.String> strRingBuffer1 = new examples.RingBuffer<java.lang.String>((int) (short) 1);
        int int2 = strRingBuffer1.count();
        java.lang.Class<?> wildcardClass3 = strRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
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
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        examples.RingBuffer<java.lang.String> strRingBuffer1 = new examples.RingBuffer<java.lang.String>((int) (short) 1);
        int int2 = strRingBuffer1.dataCount();
        java.lang.Class<?> wildcardClass3 = strRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        examples.RingBuffer<java.lang.Class<?>> wildcardClassRingBuffer1 = new examples.RingBuffer<java.lang.Class<?>>(33);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        // The following exception was thrown during execution in test generation
        try {
            examples.RingBuffer<java.lang.String> strRingBuffer1 = new examples.RingBuffer<java.lang.String>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
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
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
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
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
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
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
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
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
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
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
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
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
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
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
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
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        examples.RingBuffer<java.lang.String> strRingBuffer1 = new examples.RingBuffer<java.lang.String>((int) (short) 1);
        strRingBuffer1.wipeOut();
        int int3 = strRingBuffer1.count();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        // The following exception was thrown during execution in test generation
        try {
            examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
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
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        examples.RingBuffer<java.lang.String> strRingBuffer1 = new examples.RingBuffer<java.lang.String>((int) (byte) 100);
        int int2 = strRingBuffer1.count();
        boolean boolean3 = strRingBuffer1.isEmpty();
        java.lang.Class<?> wildcardClass4 = strRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        examples.RingBuffer<examples.RingBuffer<java.lang.String>> strRingBufferRingBuffer1 = new examples.RingBuffer<examples.RingBuffer<java.lang.String>>((int) (short) 1);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
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
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        examples.RingBuffer<java.lang.String> strRingBuffer1 = new examples.RingBuffer<java.lang.String>((int) (short) 1);
        boolean boolean2 = strRingBuffer1.isEmpty();
        int int3 = strRingBuffer1.capacity();
        int int4 = strRingBuffer1.dataCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>((int) 'a');
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
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
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
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
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
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
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
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
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
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
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
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
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        examples.RingBuffer<java.lang.String> strRingBuffer1 = new examples.RingBuffer<java.lang.String>((int) (short) 1);
        int int2 = strRingBuffer1.dataCount();
        boolean boolean3 = strRingBuffer1.isFull();
        java.lang.Class<?> wildcardClass4 = strRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
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
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
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
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        examples.RingBuffer<java.lang.String> strRingBuffer1 = new examples.RingBuffer<java.lang.String>((int) (short) 1);
        int int2 = strRingBuffer1.capacity();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
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
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
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

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        examples.RingBuffer<java.lang.String> strRingBuffer1 = new examples.RingBuffer<java.lang.String>((int) (short) 1);
        int int2 = strRingBuffer1.count();
        int int3 = strRingBuffer1.capacity();
        strRingBuffer1.wipeOut();
        strRingBuffer1.wipeOut();
        strRingBuffer1.extend("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        examples.RingBuffer<java.lang.String> strRingBuffer1 = new examples.RingBuffer<java.lang.String>((int) ' ');
        int int2 = strRingBuffer1.dataCount();
        int int3 = strRingBuffer1.capacity();
        int int4 = strRingBuffer1.capacity();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 33 + "'", int2 == 33);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        examples.RingBuffer<java.lang.String> strRingBuffer1 = new examples.RingBuffer<java.lang.String>((int) (short) 1);
        int int2 = strRingBuffer1.count();
        int int3 = strRingBuffer1.capacity();
        strRingBuffer1.wipeOut();
        boolean boolean5 = strRingBuffer1.isFull();
        int int6 = strRingBuffer1.capacity();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        examples.RingBuffer<java.lang.String> strRingBuffer1 = new examples.RingBuffer<java.lang.String>((int) (byte) 100);
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
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        examples.RingBuffer<java.lang.String> strRingBuffer1 = new examples.RingBuffer<java.lang.String>((int) ' ');
        int int2 = strRingBuffer1.dataCount();
        int int3 = strRingBuffer1.capacity();
        java.lang.Class<?> wildcardClass4 = strRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 33 + "'", int2 == 33);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        examples.RingBuffer<java.lang.String> strRingBuffer1 = new examples.RingBuffer<java.lang.String>((int) (short) 1);
        int int2 = strRingBuffer1.count();
        int int3 = strRingBuffer1.capacity();
        strRingBuffer1.wipeOut();
        boolean boolean5 = strRingBuffer1.isFull();
        strRingBuffer1.wipeOut();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        examples.RingBuffer<java.lang.String> strRingBuffer1 = new examples.RingBuffer<java.lang.String>((int) (byte) 1);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        examples.RingBuffer<java.lang.String> strRingBuffer1 = new examples.RingBuffer<java.lang.String>((int) ' ');
        int int2 = strRingBuffer1.dataCount();
        strRingBuffer1.wipeOut();
        strRingBuffer1.extend("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 33 + "'", int2 == 33);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        examples.RingBuffer<java.lang.String> strRingBuffer1 = new examples.RingBuffer<java.lang.String>((int) (short) 1);
        boolean boolean2 = strRingBuffer1.isEmpty();
        int int3 = strRingBuffer1.capacity();
        java.lang.Class<?> wildcardClass4 = strRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        examples.RingBuffer<java.lang.String> strRingBuffer1 = new examples.RingBuffer<java.lang.String>(100);
        boolean boolean2 = strRingBuffer1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        examples.RingBuffer<java.lang.String> strRingBuffer1 = new examples.RingBuffer<java.lang.String>((int) (short) 1);
        int int2 = strRingBuffer1.count();
        int int3 = strRingBuffer1.capacity();
        strRingBuffer1.wipeOut();
        int int5 = strRingBuffer1.dataCount();
        int int6 = strRingBuffer1.capacity();
        int int7 = strRingBuffer1.dataCount();
        boolean boolean8 = strRingBuffer1.isFull();
        boolean boolean9 = strRingBuffer1.isFull();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        examples.RingBuffer<java.lang.String> strRingBuffer1 = new examples.RingBuffer<java.lang.String>((int) (byte) 100);
        int int2 = strRingBuffer1.count();
        boolean boolean3 = strRingBuffer1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = strRingBuffer1.item();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: empty buffer");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        examples.RingBuffer<java.lang.String> strRingBuffer1 = new examples.RingBuffer<java.lang.String>((int) (short) 1);
        int int2 = strRingBuffer1.count();
        int int3 = strRingBuffer1.capacity();
        strRingBuffer1.wipeOut();
        int int5 = strRingBuffer1.dataCount();
        int int6 = strRingBuffer1.dataCount();
        boolean boolean7 = strRingBuffer1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = strRingBuffer1.item();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: empty buffer");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        // The following exception was thrown during execution in test generation
        try {
            examples.RingBuffer<java.lang.Object> objRingBuffer1 = new examples.RingBuffer<java.lang.Object>((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        examples.RingBuffer<java.lang.String> strRingBuffer1 = new examples.RingBuffer<java.lang.String>((int) (short) 1);
        boolean boolean2 = strRingBuffer1.isEmpty();
        strRingBuffer1.extend("hi!");
        boolean boolean5 = strRingBuffer1.isEmpty();
        strRingBuffer1.remove();
        int int7 = strRingBuffer1.capacity();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        examples.RingBuffer<java.lang.String> strRingBuffer1 = new examples.RingBuffer<java.lang.String>((int) (short) 1);
        int int2 = strRingBuffer1.dataCount();
        boolean boolean3 = strRingBuffer1.isFull();
        int int4 = strRingBuffer1.capacity();
        java.lang.Class<?> wildcardClass5 = strRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        examples.RingBuffer<java.lang.String> strRingBuffer1 = new examples.RingBuffer<java.lang.String>((int) (short) 1);
        boolean boolean2 = strRingBuffer1.isEmpty();
        int int3 = strRingBuffer1.dataCount();
        boolean boolean4 = strRingBuffer1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        examples.RingBuffer<java.lang.String> strRingBuffer1 = new examples.RingBuffer<java.lang.String>((int) ' ');
        int int2 = strRingBuffer1.count();
        boolean boolean3 = strRingBuffer1.isEmpty();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        examples.RingBuffer<java.lang.Comparable<java.lang.String>> strComparableRingBuffer1 = new examples.RingBuffer<java.lang.Comparable<java.lang.String>>((int) ' ');
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        examples.RingBuffer<java.lang.String> strRingBuffer1 = new examples.RingBuffer<java.lang.String>((int) (short) 1);
        int int2 = strRingBuffer1.count();
        int int3 = strRingBuffer1.capacity();
        strRingBuffer1.wipeOut();
        int int5 = strRingBuffer1.dataCount();
        int int6 = strRingBuffer1.count();
        int int7 = strRingBuffer1.dataCount();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        examples.RingBuffer<java.lang.String> strRingBuffer1 = new examples.RingBuffer<java.lang.String>((int) (short) 1);
        int int2 = strRingBuffer1.count();
        int int3 = strRingBuffer1.capacity();
        int int4 = strRingBuffer1.dataCount();
        int int5 = strRingBuffer1.dataCount();
        int int6 = strRingBuffer1.dataCount();
        int int7 = strRingBuffer1.count();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        examples.RingBuffer<java.lang.String> strRingBuffer1 = new examples.RingBuffer<java.lang.String>((int) (short) 1);
        int int2 = strRingBuffer1.dataCount();
        boolean boolean3 = strRingBuffer1.isEmpty();
        boolean boolean4 = strRingBuffer1.isFull();
        boolean boolean5 = strRingBuffer1.isFull();
        int int6 = strRingBuffer1.dataCount();
        // The following exception was thrown during execution in test generation
        try {
            strRingBuffer1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: buffer is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        examples.RingBuffer<java.lang.String> strRingBuffer1 = new examples.RingBuffer<java.lang.String>((int) (short) 1);
        int int2 = strRingBuffer1.dataCount();
        boolean boolean3 = strRingBuffer1.isFull();
        int int4 = strRingBuffer1.capacity();
        boolean boolean5 = strRingBuffer1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = strRingBuffer1.item();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: empty buffer");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        // The following exception was thrown during execution in test generation
        try {
            examples.RingBuffer<java.lang.String> strRingBuffer1 = new examples.RingBuffer<java.lang.String>((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        examples.RingBuffer<java.lang.String> strRingBuffer1 = new examples.RingBuffer<java.lang.String>((int) (short) 1);
        int int2 = strRingBuffer1.dataCount();
        boolean boolean3 = strRingBuffer1.isEmpty();
        boolean boolean4 = strRingBuffer1.isFull();
        strRingBuffer1.wipeOut();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        examples.RingBuffer<java.lang.String> strRingBuffer1 = new examples.RingBuffer<java.lang.String>((int) (short) 1);
        int int2 = strRingBuffer1.count();
        int int3 = strRingBuffer1.capacity();
        strRingBuffer1.wipeOut();
        int int5 = strRingBuffer1.dataCount();
        int int6 = strRingBuffer1.capacity();
        boolean boolean7 = strRingBuffer1.isFull();
        int int8 = strRingBuffer1.dataCount();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        examples.RingBuffer<java.lang.String> strRingBuffer1 = new examples.RingBuffer<java.lang.String>((int) (byte) 100);
        int int2 = strRingBuffer1.capacity();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        examples.RingBuffer<java.lang.reflect.Type> typeRingBuffer1 = new examples.RingBuffer<java.lang.reflect.Type>((int) (short) 100);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        examples.RingBuffer<java.lang.String> strRingBuffer1 = new examples.RingBuffer<java.lang.String>((int) (short) 1);
        boolean boolean2 = strRingBuffer1.isEmpty();
        int int3 = strRingBuffer1.dataCount();
        int int4 = strRingBuffer1.capacity();
        boolean boolean5 = strRingBuffer1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        examples.RingBuffer<java.lang.String> strRingBuffer1 = new examples.RingBuffer<java.lang.String>((int) (short) 1);
        int int2 = strRingBuffer1.count();
        int int3 = strRingBuffer1.capacity();
        strRingBuffer1.wipeOut();
        int int5 = strRingBuffer1.dataCount();
        int int6 = strRingBuffer1.dataCount();
        boolean boolean7 = strRingBuffer1.isEmpty();
        boolean boolean8 = strRingBuffer1.isFull();
        int int9 = strRingBuffer1.capacity();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        examples.RingBuffer<java.lang.String> strRingBuffer1 = new examples.RingBuffer<java.lang.String>((int) (short) 1);
        int int2 = strRingBuffer1.dataCount();
        boolean boolean3 = strRingBuffer1.isEmpty();
        boolean boolean4 = strRingBuffer1.isFull();
        strRingBuffer1.extend("");
        java.lang.Object obj7 = strRingBuffer1.item();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + "" + "'", obj7, "");
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        examples.RingBuffer<java.lang.String> strRingBuffer1 = new examples.RingBuffer<java.lang.String>((int) (short) 1);
        int int2 = strRingBuffer1.dataCount();
        boolean boolean3 = strRingBuffer1.isEmpty();
        boolean boolean4 = strRingBuffer1.isEmpty();
        java.lang.Class<?> wildcardClass5 = strRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        examples.RingBuffer<java.lang.String> strRingBuffer1 = new examples.RingBuffer<java.lang.String>((int) ' ');
        int int2 = strRingBuffer1.count();
        int int3 = strRingBuffer1.capacity();
        boolean boolean4 = strRingBuffer1.isEmpty();
        boolean boolean5 = strRingBuffer1.isEmpty();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        examples.RingBuffer<java.lang.String> strRingBuffer1 = new examples.RingBuffer<java.lang.String>((int) (short) 1);
        int int2 = strRingBuffer1.dataCount();
        boolean boolean3 = strRingBuffer1.isFull();
        int int4 = strRingBuffer1.capacity();
        boolean boolean5 = strRingBuffer1.isEmpty();
        int int6 = strRingBuffer1.capacity();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        examples.RingBuffer<java.lang.String> strRingBuffer1 = new examples.RingBuffer<java.lang.String>((int) (short) 1);
        int int2 = strRingBuffer1.count();
        int int3 = strRingBuffer1.capacity();
        strRingBuffer1.wipeOut();
        int int5 = strRingBuffer1.dataCount();
        int int6 = strRingBuffer1.dataCount();
        strRingBuffer1.wipeOut();
        // The following exception was thrown during execution in test generation
        try {
            strRingBuffer1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: buffer is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        examples.RingBuffer<java.lang.String> strRingBuffer1 = new examples.RingBuffer<java.lang.String>((int) (byte) 100);
        int int2 = strRingBuffer1.count();
        boolean boolean3 = strRingBuffer1.isFull();
        int int4 = strRingBuffer1.count();
        int int5 = strRingBuffer1.count();
        // The following exception was thrown during execution in test generation
        try {
            strRingBuffer1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: buffer is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        examples.RingBuffer<java.lang.String> strRingBuffer1 = new examples.RingBuffer<java.lang.String>((int) (short) 1);
        strRingBuffer1.wipeOut();
        boolean boolean3 = strRingBuffer1.isEmpty();
        int int4 = strRingBuffer1.dataCount();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        examples.RingBuffer<java.lang.String> strRingBuffer1 = new examples.RingBuffer<java.lang.String>((int) ' ');
        int int2 = strRingBuffer1.capacity();
        strRingBuffer1.extend("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        examples.RingBuffer<java.lang.String> strRingBuffer1 = new examples.RingBuffer<java.lang.String>(32);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        examples.RingBuffer<java.lang.String> strRingBuffer1 = new examples.RingBuffer<java.lang.String>((int) (short) 1);
        boolean boolean2 = strRingBuffer1.isEmpty();
        strRingBuffer1.extend("hi!");
        boolean boolean5 = strRingBuffer1.isEmpty();
        java.lang.Object obj6 = strRingBuffer1.item();
        int int7 = strRingBuffer1.count();
        int int8 = strRingBuffer1.capacity();
        int int9 = strRingBuffer1.dataCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "hi!" + "'", obj6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        examples.RingBuffer<java.lang.String> strRingBuffer1 = new examples.RingBuffer<java.lang.String>((int) (short) 1);
        int int2 = strRingBuffer1.count();
        int int3 = strRingBuffer1.capacity();
        strRingBuffer1.wipeOut();
        int int5 = strRingBuffer1.dataCount();
        int int6 = strRingBuffer1.dataCount();
        strRingBuffer1.wipeOut();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = strRingBuffer1.item();
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
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        examples.RingBuffer<java.lang.String> strRingBuffer1 = new examples.RingBuffer<java.lang.String>((int) (short) 1);
        int int2 = strRingBuffer1.count();
        int int3 = strRingBuffer1.capacity();
        strRingBuffer1.wipeOut();
        int int5 = strRingBuffer1.dataCount();
        int int6 = strRingBuffer1.dataCount();
        strRingBuffer1.wipeOut();
        int int8 = strRingBuffer1.dataCount();
        java.lang.Class<?> wildcardClass9 = strRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        examples.RingBuffer<java.lang.String> strRingBuffer1 = new examples.RingBuffer<java.lang.String>((int) (short) 1);
        strRingBuffer1.wipeOut();
        strRingBuffer1.wipeOut();
        strRingBuffer1.wipeOut();
        // The following exception was thrown during execution in test generation
        try {
            strRingBuffer1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: buffer is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        examples.RingBuffer<java.lang.String> strRingBuffer1 = new examples.RingBuffer<java.lang.String>((int) (short) 1);
        int int2 = strRingBuffer1.count();
        int int3 = strRingBuffer1.capacity();
        int int4 = strRingBuffer1.dataCount();
        int int5 = strRingBuffer1.dataCount();
        int int6 = strRingBuffer1.dataCount();
        strRingBuffer1.wipeOut();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        examples.RingBuffer<java.lang.String> strRingBuffer1 = new examples.RingBuffer<java.lang.String>((int) ' ');
        java.lang.Class<?> wildcardClass2 = strRingBuffer1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        examples.RingBuffer<java.lang.String> strRingBuffer1 = new examples.RingBuffer<java.lang.String>((int) (short) 1);
        int int2 = strRingBuffer1.dataCount();
        boolean boolean3 = strRingBuffer1.isEmpty();
        boolean boolean4 = strRingBuffer1.isFull();
        boolean boolean5 = strRingBuffer1.isFull();
        int int6 = strRingBuffer1.dataCount();
        strRingBuffer1.wipeOut();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        // The following exception was thrown during execution in test generation
        try {
            examples.RingBuffer<examples.RingBuffer<java.lang.String>> strRingBufferRingBuffer1 = new examples.RingBuffer<examples.RingBuffer<java.lang.String>>(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter must be positive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        examples.RingBuffer<java.lang.String> strRingBuffer1 = new examples.RingBuffer<java.lang.String>((int) (short) 1);
        int int2 = strRingBuffer1.count();
        int int3 = strRingBuffer1.capacity();
        strRingBuffer1.wipeOut();
        int int5 = strRingBuffer1.dataCount();
        int int6 = strRingBuffer1.dataCount();
        strRingBuffer1.wipeOut();
        strRingBuffer1.extend("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        examples.RingBuffer<java.lang.String> strRingBuffer1 = new examples.RingBuffer<java.lang.String>((int) (short) 1);
        boolean boolean2 = strRingBuffer1.isEmpty();
        int int3 = strRingBuffer1.dataCount();
        int int4 = strRingBuffer1.capacity();
        java.lang.Class<?> wildcardClass5 = strRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        examples.RingBuffer<java.lang.String> strRingBuffer1 = new examples.RingBuffer<java.lang.String>((int) (short) 1);
        int int2 = strRingBuffer1.count();
        int int3 = strRingBuffer1.capacity();
        strRingBuffer1.wipeOut();
        int int5 = strRingBuffer1.dataCount();
        int int6 = strRingBuffer1.dataCount();
        boolean boolean7 = strRingBuffer1.isEmpty();
        boolean boolean8 = strRingBuffer1.isFull();
        strRingBuffer1.wipeOut();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        examples.RingBuffer<java.lang.String> strRingBuffer1 = new examples.RingBuffer<java.lang.String>((int) (short) 1);
        int int2 = strRingBuffer1.count();
        int int3 = strRingBuffer1.capacity();
        strRingBuffer1.wipeOut();
        int int5 = strRingBuffer1.dataCount();
        strRingBuffer1.extend("hi!");
        int int8 = strRingBuffer1.capacity();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        examples.RingBuffer<java.lang.String> strRingBuffer1 = new examples.RingBuffer<java.lang.String>((int) (short) 1);
        int int2 = strRingBuffer1.count();
        int int3 = strRingBuffer1.capacity();
        int int4 = strRingBuffer1.dataCount();
        int int5 = strRingBuffer1.dataCount();
        int int6 = strRingBuffer1.dataCount();
        int int7 = strRingBuffer1.capacity();
        boolean boolean8 = strRingBuffer1.isFull();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        examples.RingBuffer<java.lang.String> strRingBuffer1 = new examples.RingBuffer<java.lang.String>((int) (short) 1);
        int int2 = strRingBuffer1.count();
        int int3 = strRingBuffer1.capacity();
        int int4 = strRingBuffer1.dataCount();
        // The following exception was thrown during execution in test generation
        try {
            strRingBuffer1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: buffer is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        examples.RingBuffer<java.lang.String> strRingBuffer1 = new examples.RingBuffer<java.lang.String>((int) (short) 1);
        int int2 = strRingBuffer1.count();
        int int3 = strRingBuffer1.capacity();
        int int4 = strRingBuffer1.dataCount();
        int int5 = strRingBuffer1.dataCount();
        strRingBuffer1.wipeOut();
        int int7 = strRingBuffer1.count();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        examples.RingBuffer<java.lang.String> strRingBuffer1 = new examples.RingBuffer<java.lang.String>((int) (short) 1);
        int int2 = strRingBuffer1.count();
        int int3 = strRingBuffer1.capacity();
        strRingBuffer1.wipeOut();
        int int5 = strRingBuffer1.dataCount();
        int int6 = strRingBuffer1.dataCount();
        strRingBuffer1.wipeOut();
        int int8 = strRingBuffer1.dataCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = strRingBuffer1.item();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: empty buffer");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        examples.RingBuffer<java.lang.String> strRingBuffer1 = new examples.RingBuffer<java.lang.String>((int) (short) 1);
        int int2 = strRingBuffer1.count();
        boolean boolean3 = strRingBuffer1.isFull();
        boolean boolean4 = strRingBuffer1.isEmpty();
        boolean boolean5 = strRingBuffer1.isFull();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        examples.RingBuffer<java.lang.String> strRingBuffer1 = new examples.RingBuffer<java.lang.String>((int) (short) 1);
        int int2 = strRingBuffer1.count();
        int int3 = strRingBuffer1.capacity();
        int int4 = strRingBuffer1.dataCount();
        int int5 = strRingBuffer1.count();
        int int6 = strRingBuffer1.dataCount();
        boolean boolean7 = strRingBuffer1.isEmpty();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        examples.RingBuffer<java.lang.String> strRingBuffer1 = new examples.RingBuffer<java.lang.String>((int) (byte) 100);
        boolean boolean2 = strRingBuffer1.isFull();
        boolean boolean3 = strRingBuffer1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        examples.RingBuffer<java.lang.String> strRingBuffer1 = new examples.RingBuffer<java.lang.String>((int) (short) 1);
        int int2 = strRingBuffer1.count();
        int int3 = strRingBuffer1.capacity();
        strRingBuffer1.wipeOut();
        int int5 = strRingBuffer1.dataCount();
        int int6 = strRingBuffer1.capacity();
        boolean boolean7 = strRingBuffer1.isFull();
        int int8 = strRingBuffer1.capacity();
        int int9 = strRingBuffer1.dataCount();
        int int10 = strRingBuffer1.dataCount();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        examples.RingBuffer<java.lang.String> strRingBuffer1 = new examples.RingBuffer<java.lang.String>((int) (short) 1);
        int int2 = strRingBuffer1.dataCount();
        boolean boolean3 = strRingBuffer1.isFull();
        int int4 = strRingBuffer1.capacity();
        boolean boolean5 = strRingBuffer1.isEmpty();
        int int6 = strRingBuffer1.dataCount();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        examples.RingBuffer<java.lang.String> strRingBuffer1 = new examples.RingBuffer<java.lang.String>((int) (short) 1);
        boolean boolean2 = strRingBuffer1.isEmpty();
        int int3 = strRingBuffer1.capacity();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = strRingBuffer1.item();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: empty buffer");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        examples.RingBuffer<java.lang.String> strRingBuffer1 = new examples.RingBuffer<java.lang.String>((int) (short) 1);
        int int2 = strRingBuffer1.count();
        int int3 = strRingBuffer1.capacity();
        int int4 = strRingBuffer1.dataCount();
        int int5 = strRingBuffer1.dataCount();
        int int6 = strRingBuffer1.dataCount();
        strRingBuffer1.extend("");
        int int9 = strRingBuffer1.count();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        examples.RingBuffer<java.lang.String> strRingBuffer1 = new examples.RingBuffer<java.lang.String>((int) (byte) 100);
        int int2 = strRingBuffer1.count();
        boolean boolean3 = strRingBuffer1.isEmpty();
        int int4 = strRingBuffer1.capacity();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        examples.RingBuffer<java.lang.String> strRingBuffer1 = new examples.RingBuffer<java.lang.String>((int) (short) 1);
        int int2 = strRingBuffer1.dataCount();
        boolean boolean3 = strRingBuffer1.isEmpty();
        int int4 = strRingBuffer1.count();
        int int5 = strRingBuffer1.dataCount();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        examples.RingBuffer<java.lang.reflect.GenericDeclaration> genericDeclarationRingBuffer1 = new examples.RingBuffer<java.lang.reflect.GenericDeclaration>((int) 'a');
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        examples.RingBuffer<java.lang.String> strRingBuffer1 = new examples.RingBuffer<java.lang.String>((int) (short) 1);
        strRingBuffer1.wipeOut();
        strRingBuffer1.wipeOut();
        int int4 = strRingBuffer1.capacity();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        examples.RingBuffer<java.lang.String> strRingBuffer1 = new examples.RingBuffer<java.lang.String>((int) (byte) 100);
        boolean boolean2 = strRingBuffer1.isEmpty();
        strRingBuffer1.extend("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        examples.RingBuffer<java.lang.String> strRingBuffer1 = new examples.RingBuffer<java.lang.String>((int) (short) 1);
        int int2 = strRingBuffer1.dataCount();
        boolean boolean3 = strRingBuffer1.isEmpty();
        boolean boolean4 = strRingBuffer1.isFull();
        strRingBuffer1.extend("");
        java.lang.Class<?> wildcardClass7 = strRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        examples.RingBuffer<java.lang.String> strRingBuffer1 = new examples.RingBuffer<java.lang.String>((int) (short) 1);
        int int2 = strRingBuffer1.count();
        int int3 = strRingBuffer1.capacity();
        int int4 = strRingBuffer1.dataCount();
        int int5 = strRingBuffer1.dataCount();
        strRingBuffer1.wipeOut();
        strRingBuffer1.extend("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        examples.RingBuffer<java.lang.String> strRingBuffer1 = new examples.RingBuffer<java.lang.String>((int) (short) 1);
        int int2 = strRingBuffer1.dataCount();
        boolean boolean3 = strRingBuffer1.isEmpty();
        boolean boolean4 = strRingBuffer1.isFull();
        strRingBuffer1.extend("");
        int int7 = strRingBuffer1.capacity();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        examples.RingBuffer<java.lang.String> strRingBuffer1 = new examples.RingBuffer<java.lang.String>(100);
        // The following exception was thrown during execution in test generation
        try {
            strRingBuffer1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: buffer is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        examples.RingBuffer<java.lang.String> strRingBuffer1 = new examples.RingBuffer<java.lang.String>((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            strRingBuffer1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: buffer is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        examples.RingBuffer<java.lang.String> strRingBuffer1 = new examples.RingBuffer<java.lang.String>((int) (short) 100);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        examples.RingBuffer<java.lang.String> strRingBuffer1 = new examples.RingBuffer<java.lang.String>((int) (short) 1);
        int int2 = strRingBuffer1.count();
        int int3 = strRingBuffer1.capacity();
        strRingBuffer1.wipeOut();
        int int5 = strRingBuffer1.dataCount();
        int int6 = strRingBuffer1.dataCount();
        boolean boolean7 = strRingBuffer1.isEmpty();
        strRingBuffer1.extend("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        examples.RingBuffer<java.lang.String> strRingBuffer1 = new examples.RingBuffer<java.lang.String>((int) (short) 1);
        int int2 = strRingBuffer1.count();
        boolean boolean3 = strRingBuffer1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            strRingBuffer1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: buffer is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        examples.RingBuffer<java.lang.String> strRingBuffer1 = new examples.RingBuffer<java.lang.String>((int) (short) 1);
        int int2 = strRingBuffer1.dataCount();
        int int3 = strRingBuffer1.count();
        java.lang.Class<?> wildcardClass4 = strRingBuffer1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        examples.RingBuffer<java.lang.String> strRingBuffer1 = new examples.RingBuffer<java.lang.String>((int) '#');
        int int2 = strRingBuffer1.count();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        examples.RingBuffer<java.lang.String> strRingBuffer1 = new examples.RingBuffer<java.lang.String>((int) (short) 1);
        int int2 = strRingBuffer1.dataCount();
        boolean boolean3 = strRingBuffer1.isFull();
        int int4 = strRingBuffer1.dataCount();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        examples.RingBuffer<java.lang.String> strRingBuffer1 = new examples.RingBuffer<java.lang.String>((int) (short) 1);
        boolean boolean2 = strRingBuffer1.isEmpty();
        strRingBuffer1.extend("hi!");
        boolean boolean5 = strRingBuffer1.isEmpty();
        int int6 = strRingBuffer1.capacity();
        java.lang.Object obj7 = strRingBuffer1.item();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + "hi!" + "'", obj7, "hi!");
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        examples.RingBuffer<java.lang.String> strRingBuffer1 = new examples.RingBuffer<java.lang.String>((int) (short) 1);
        int int2 = strRingBuffer1.count();
        int int3 = strRingBuffer1.capacity();
        int int4 = strRingBuffer1.dataCount();
        int int5 = strRingBuffer1.dataCount();
        strRingBuffer1.wipeOut();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = strRingBuffer1.item();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: empty buffer");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        examples.RingBuffer<java.lang.String> strRingBuffer1 = new examples.RingBuffer<java.lang.String>((int) (short) 1);
        int int2 = strRingBuffer1.count();
        int int3 = strRingBuffer1.capacity();
        int int4 = strRingBuffer1.dataCount();
        int int5 = strRingBuffer1.dataCount();
        int int6 = strRingBuffer1.dataCount();
        int int7 = strRingBuffer1.capacity();
        int int8 = strRingBuffer1.dataCount();
        boolean boolean9 = strRingBuffer1.isFull();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        examples.RingBuffer<java.lang.String> strRingBuffer1 = new examples.RingBuffer<java.lang.String>((int) (short) 1);
        int int2 = strRingBuffer1.count();
        int int3 = strRingBuffer1.capacity();
        strRingBuffer1.wipeOut();
        int int5 = strRingBuffer1.dataCount();
        int int6 = strRingBuffer1.capacity();
        strRingBuffer1.wipeOut();
        strRingBuffer1.wipeOut();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        examples.RingBuffer<java.lang.String> strRingBuffer1 = new examples.RingBuffer<java.lang.String>((int) (byte) 100);
        int int2 = strRingBuffer1.count();
        boolean boolean3 = strRingBuffer1.isEmpty();
        strRingBuffer1.wipeOut();
        int int5 = strRingBuffer1.count();
        int int6 = strRingBuffer1.count();
        strRingBuffer1.extend("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        examples.RingBuffer<java.lang.String> strRingBuffer1 = new examples.RingBuffer<java.lang.String>((int) (short) 1);
        int int2 = strRingBuffer1.count();
        int int3 = strRingBuffer1.capacity();
        strRingBuffer1.wipeOut();
        int int5 = strRingBuffer1.dataCount();
        int int6 = strRingBuffer1.capacity();
        boolean boolean7 = strRingBuffer1.isFull();
        int int8 = strRingBuffer1.capacity();
        strRingBuffer1.extend("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        examples.RingBuffer<java.lang.CharSequence> charSequenceRingBuffer1 = new examples.RingBuffer<java.lang.CharSequence>(2);
    }
}

