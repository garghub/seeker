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
        org.nibor.autolink.internal.EmailScanner emailScanner1 = new org.nibor.autolink.internal.EmailScanner(true);
        java.lang.Class<?> wildcardClass2 = emailScanner1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        org.nibor.autolink.internal.EmailScanner emailScanner1 = new org.nibor.autolink.internal.EmailScanner(true);
        // The following exception was thrown during execution in test generation
        try {
            org.nibor.autolink.LinkSpan linkSpan5 = emailScanner1.scan((java.lang.CharSequence) "hi!", (int) 'a', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 96");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        org.nibor.autolink.internal.EmailScanner emailScanner1 = new org.nibor.autolink.internal.EmailScanner(true);
        org.nibor.autolink.LinkSpan linkSpan5 = emailScanner1.scan((java.lang.CharSequence) "hi!", 1, 1);
        java.lang.Class<?> wildcardClass6 = emailScanner1.getClass();
        org.junit.Assert.assertNull(linkSpan5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        org.nibor.autolink.internal.EmailScanner emailScanner1 = new org.nibor.autolink.internal.EmailScanner(false);
        // The following exception was thrown during execution in test generation
        try {
            org.nibor.autolink.LinkSpan linkSpan5 = emailScanner1.scan((java.lang.CharSequence) "", 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        org.nibor.autolink.internal.EmailScanner emailScanner1 = new org.nibor.autolink.internal.EmailScanner(true);
        // The following exception was thrown during execution in test generation
        try {
            org.nibor.autolink.LinkSpan linkSpan5 = emailScanner1.scan((java.lang.CharSequence) "", 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 99");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        org.nibor.autolink.internal.EmailScanner emailScanner1 = new org.nibor.autolink.internal.EmailScanner(false);
        java.lang.Class<?> wildcardClass2 = emailScanner1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        org.nibor.autolink.internal.EmailScanner emailScanner1 = new org.nibor.autolink.internal.EmailScanner(false);
        org.nibor.autolink.LinkSpan linkSpan5 = emailScanner1.scan((java.lang.CharSequence) "hi!", (int) (byte) 0, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.nibor.autolink.LinkSpan linkSpan9 = emailScanner1.scan((java.lang.CharSequence) "hi!", (int) ' ', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 31");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(linkSpan5);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        org.nibor.autolink.internal.EmailScanner emailScanner1 = new org.nibor.autolink.internal.EmailScanner(false);
        org.nibor.autolink.LinkSpan linkSpan5 = emailScanner1.scan((java.lang.CharSequence) "", (int) (short) 100, 100);
        // The following exception was thrown during execution in test generation
        try {
            org.nibor.autolink.LinkSpan linkSpan9 = emailScanner1.scan((java.lang.CharSequence) "hi!", (int) (byte) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 99");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(linkSpan5);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        org.nibor.autolink.internal.EmailScanner emailScanner1 = new org.nibor.autolink.internal.EmailScanner(true);
        org.nibor.autolink.LinkSpan linkSpan5 = emailScanner1.scan((java.lang.CharSequence) "hi!", 1, 1);
        org.nibor.autolink.LinkSpan linkSpan9 = emailScanner1.scan((java.lang.CharSequence) "", (-1), (int) (short) 0);
        java.lang.Class<?> wildcardClass10 = emailScanner1.getClass();
        org.junit.Assert.assertNull(linkSpan5);
        org.junit.Assert.assertNull(linkSpan9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        org.nibor.autolink.internal.EmailScanner emailScanner1 = new org.nibor.autolink.internal.EmailScanner(false);
        // The following exception was thrown during execution in test generation
        try {
            org.nibor.autolink.LinkSpan linkSpan5 = emailScanner1.scan((java.lang.CharSequence) "hi!", (int) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 99");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        org.nibor.autolink.internal.EmailScanner emailScanner1 = new org.nibor.autolink.internal.EmailScanner(true);
        org.nibor.autolink.LinkSpan linkSpan5 = emailScanner1.scan((java.lang.CharSequence) "", (int) (short) -1, 10);
        // The following exception was thrown during execution in test generation
        try {
            org.nibor.autolink.LinkSpan linkSpan9 = emailScanner1.scan((java.lang.CharSequence) "hi!", (int) ' ', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 31");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(linkSpan5);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        org.nibor.autolink.internal.EmailScanner emailScanner1 = new org.nibor.autolink.internal.EmailScanner(true);
        org.nibor.autolink.LinkSpan linkSpan5 = emailScanner1.scan((java.lang.CharSequence) "hi!", 1, 1);
        org.nibor.autolink.LinkSpan linkSpan9 = emailScanner1.scan((java.lang.CharSequence) "hi!", (int) (byte) 1, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.nibor.autolink.LinkSpan linkSpan13 = emailScanner1.scan((java.lang.CharSequence) "", (int) 'a', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 96");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(linkSpan5);
        org.junit.Assert.assertNull(linkSpan9);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        org.nibor.autolink.internal.EmailScanner emailScanner1 = new org.nibor.autolink.internal.EmailScanner(false);
        org.nibor.autolink.LinkSpan linkSpan5 = emailScanner1.scan((java.lang.CharSequence) "", (int) (short) 100, 100);
        // The following exception was thrown during execution in test generation
        try {
            org.nibor.autolink.LinkSpan linkSpan9 = emailScanner1.scan((java.lang.CharSequence) "hi!", (int) '#', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 34");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(linkSpan5);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        org.nibor.autolink.internal.EmailScanner emailScanner1 = new org.nibor.autolink.internal.EmailScanner(true);
        org.nibor.autolink.LinkSpan linkSpan5 = emailScanner1.scan((java.lang.CharSequence) "hi!", 1, 1);
        org.nibor.autolink.LinkSpan linkSpan9 = emailScanner1.scan((java.lang.CharSequence) "hi!", (int) (byte) 1, (int) '4');
        java.lang.Class<?> wildcardClass10 = emailScanner1.getClass();
        org.junit.Assert.assertNull(linkSpan5);
        org.junit.Assert.assertNull(linkSpan9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        org.nibor.autolink.internal.EmailScanner emailScanner1 = new org.nibor.autolink.internal.EmailScanner(false);
        org.nibor.autolink.LinkSpan linkSpan5 = emailScanner1.scan((java.lang.CharSequence) "hi!", (int) (byte) 0, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = linkSpan5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(linkSpan5);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        org.nibor.autolink.internal.EmailScanner emailScanner1 = new org.nibor.autolink.internal.EmailScanner(true);
        org.nibor.autolink.LinkSpan linkSpan5 = emailScanner1.scan((java.lang.CharSequence) "hi!", 1, 1);
        org.nibor.autolink.LinkSpan linkSpan9 = emailScanner1.scan((java.lang.CharSequence) "", (-1), (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = linkSpan9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(linkSpan5);
        org.junit.Assert.assertNull(linkSpan9);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        org.nibor.autolink.internal.EmailScanner emailScanner1 = new org.nibor.autolink.internal.EmailScanner(false);
        org.nibor.autolink.LinkSpan linkSpan5 = emailScanner1.scan((java.lang.CharSequence) "hi!", (int) (byte) 0, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.nibor.autolink.LinkSpan linkSpan9 = emailScanner1.scan((java.lang.CharSequence) "hi!", (int) (short) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 9");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(linkSpan5);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        org.nibor.autolink.internal.EmailScanner emailScanner1 = new org.nibor.autolink.internal.EmailScanner(false);
        org.nibor.autolink.LinkSpan linkSpan5 = emailScanner1.scan((java.lang.CharSequence) "", (int) (short) 100, 100);
        org.nibor.autolink.LinkSpan linkSpan9 = emailScanner1.scan((java.lang.CharSequence) "", 10, (int) 'a');
        java.lang.Class<?> wildcardClass10 = emailScanner1.getClass();
        org.junit.Assert.assertNull(linkSpan5);
        org.junit.Assert.assertNull(linkSpan9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        org.nibor.autolink.internal.EmailScanner emailScanner1 = new org.nibor.autolink.internal.EmailScanner(false);
        org.nibor.autolink.LinkSpan linkSpan5 = emailScanner1.scan((java.lang.CharSequence) "hi!", (int) (byte) 0, (int) (short) 100);
        java.lang.Class<?> wildcardClass6 = emailScanner1.getClass();
        org.junit.Assert.assertNull(linkSpan5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        org.nibor.autolink.internal.EmailScanner emailScanner1 = new org.nibor.autolink.internal.EmailScanner(true);
        org.nibor.autolink.LinkSpan linkSpan5 = emailScanner1.scan((java.lang.CharSequence) "hi!", 1, 1);
        org.nibor.autolink.LinkSpan linkSpan9 = emailScanner1.scan((java.lang.CharSequence) "hi!", 0, (int) ' ');
        org.nibor.autolink.LinkSpan linkSpan13 = emailScanner1.scan((java.lang.CharSequence) "", 1, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = linkSpan13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(linkSpan5);
        org.junit.Assert.assertNull(linkSpan9);
        org.junit.Assert.assertNull(linkSpan13);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        org.nibor.autolink.internal.EmailScanner emailScanner1 = new org.nibor.autolink.internal.EmailScanner(true);
        org.nibor.autolink.LinkSpan linkSpan5 = emailScanner1.scan((java.lang.CharSequence) "hi!", 1, 1);
        org.nibor.autolink.LinkSpan linkSpan9 = emailScanner1.scan((java.lang.CharSequence) "hi!", 0, (int) ' ');
        java.lang.Class<?> wildcardClass10 = emailScanner1.getClass();
        org.junit.Assert.assertNull(linkSpan5);
        org.junit.Assert.assertNull(linkSpan9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        org.nibor.autolink.internal.EmailScanner emailScanner1 = new org.nibor.autolink.internal.EmailScanner(true);
        org.nibor.autolink.LinkSpan linkSpan5 = emailScanner1.scan((java.lang.CharSequence) "hi!", 1, 1);
        org.nibor.autolink.LinkSpan linkSpan9 = emailScanner1.scan((java.lang.CharSequence) "", (-1), (int) (short) 0);
        org.nibor.autolink.LinkSpan linkSpan13 = emailScanner1.scan((java.lang.CharSequence) "", 0, 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = linkSpan13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(linkSpan5);
        org.junit.Assert.assertNull(linkSpan9);
        org.junit.Assert.assertNull(linkSpan13);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        org.nibor.autolink.internal.EmailScanner emailScanner1 = new org.nibor.autolink.internal.EmailScanner(true);
        org.nibor.autolink.LinkSpan linkSpan5 = emailScanner1.scan((java.lang.CharSequence) "hi!", 1, 1);
        org.nibor.autolink.LinkSpan linkSpan9 = emailScanner1.scan((java.lang.CharSequence) "", (-1), (int) (short) 0);
        org.nibor.autolink.LinkSpan linkSpan13 = emailScanner1.scan((java.lang.CharSequence) "", 0, 100);
        // The following exception was thrown during execution in test generation
        try {
            org.nibor.autolink.LinkSpan linkSpan17 = emailScanner1.scan((java.lang.CharSequence) "hi!", (int) '#', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 34");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(linkSpan5);
        org.junit.Assert.assertNull(linkSpan9);
        org.junit.Assert.assertNull(linkSpan13);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        org.nibor.autolink.internal.EmailScanner emailScanner1 = new org.nibor.autolink.internal.EmailScanner(false);
        org.nibor.autolink.LinkSpan linkSpan5 = emailScanner1.scan((java.lang.CharSequence) "", (int) (short) 100, 100);
        java.lang.Class<?> wildcardClass6 = emailScanner1.getClass();
        org.junit.Assert.assertNull(linkSpan5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        org.nibor.autolink.internal.EmailScanner emailScanner1 = new org.nibor.autolink.internal.EmailScanner(true);
        org.nibor.autolink.LinkSpan linkSpan5 = emailScanner1.scan((java.lang.CharSequence) "hi!", 1, 1);
        org.nibor.autolink.LinkSpan linkSpan9 = emailScanner1.scan((java.lang.CharSequence) "", (int) (byte) -1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = linkSpan9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(linkSpan5);
        org.junit.Assert.assertNull(linkSpan9);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        org.nibor.autolink.internal.EmailScanner emailScanner1 = new org.nibor.autolink.internal.EmailScanner(true);
        org.nibor.autolink.LinkSpan linkSpan5 = emailScanner1.scan((java.lang.CharSequence) "hi!", 1, 1);
        org.nibor.autolink.LinkSpan linkSpan9 = emailScanner1.scan((java.lang.CharSequence) "", (int) (byte) -1, (int) (short) 1);
        java.lang.Class<?> wildcardClass10 = emailScanner1.getClass();
        org.junit.Assert.assertNull(linkSpan5);
        org.junit.Assert.assertNull(linkSpan9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        org.nibor.autolink.internal.EmailScanner emailScanner1 = new org.nibor.autolink.internal.EmailScanner(true);
        org.nibor.autolink.LinkSpan linkSpan5 = emailScanner1.scan((java.lang.CharSequence) "", (int) (short) -1, 10);
        // The following exception was thrown during execution in test generation
        try {
            org.nibor.autolink.LinkSpan linkSpan9 = emailScanner1.scan((java.lang.CharSequence) "hi!", (int) ' ', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 31");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(linkSpan5);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        org.nibor.autolink.internal.EmailScanner emailScanner1 = new org.nibor.autolink.internal.EmailScanner(false);
        org.nibor.autolink.LinkSpan linkSpan5 = emailScanner1.scan((java.lang.CharSequence) "hi!", (int) (byte) 0, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.nibor.autolink.LinkSpan linkSpan9 = emailScanner1.scan((java.lang.CharSequence) "hi!", (int) ' ', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 31");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(linkSpan5);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        org.nibor.autolink.internal.EmailScanner emailScanner1 = new org.nibor.autolink.internal.EmailScanner(true);
        org.nibor.autolink.LinkSpan linkSpan5 = emailScanner1.scan((java.lang.CharSequence) "hi!", 1, 1);
        org.nibor.autolink.LinkSpan linkSpan9 = emailScanner1.scan((java.lang.CharSequence) "hi!", (int) (byte) 1, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = linkSpan9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(linkSpan5);
        org.junit.Assert.assertNull(linkSpan9);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        org.nibor.autolink.internal.EmailScanner emailScanner1 = new org.nibor.autolink.internal.EmailScanner(false);
        org.nibor.autolink.LinkSpan linkSpan5 = emailScanner1.scan((java.lang.CharSequence) "hi!", (int) (byte) 0, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.nibor.autolink.LinkSpan linkSpan9 = emailScanner1.scan((java.lang.CharSequence) "", 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 99");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(linkSpan5);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        org.nibor.autolink.internal.EmailScanner emailScanner1 = new org.nibor.autolink.internal.EmailScanner(true);
        org.nibor.autolink.LinkSpan linkSpan5 = emailScanner1.scan((java.lang.CharSequence) "", (int) (short) -1, 10);
        java.lang.Class<?> wildcardClass6 = emailScanner1.getClass();
        org.junit.Assert.assertNull(linkSpan5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        org.nibor.autolink.internal.EmailScanner emailScanner1 = new org.nibor.autolink.internal.EmailScanner(true);
        // The following exception was thrown during execution in test generation
        try {
            org.nibor.autolink.LinkSpan linkSpan5 = emailScanner1.scan((java.lang.CharSequence) "", 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 99");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        org.nibor.autolink.internal.EmailScanner emailScanner1 = new org.nibor.autolink.internal.EmailScanner(false);
        org.nibor.autolink.LinkSpan linkSpan5 = emailScanner1.scan((java.lang.CharSequence) "", (int) (short) 100, 100);
        // The following exception was thrown during execution in test generation
        try {
            org.nibor.autolink.LinkSpan linkSpan9 = emailScanner1.scan((java.lang.CharSequence) "hi!", 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(linkSpan5);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        org.nibor.autolink.internal.EmailScanner emailScanner1 = new org.nibor.autolink.internal.EmailScanner(true);
        org.nibor.autolink.LinkSpan linkSpan5 = emailScanner1.scan((java.lang.CharSequence) "hi!", 1, 1);
        org.nibor.autolink.LinkSpan linkSpan9 = emailScanner1.scan((java.lang.CharSequence) "hi!", 1, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = linkSpan9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(linkSpan5);
        org.junit.Assert.assertNull(linkSpan9);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        org.nibor.autolink.internal.EmailScanner emailScanner1 = new org.nibor.autolink.internal.EmailScanner(false);
        org.nibor.autolink.LinkSpan linkSpan5 = emailScanner1.scan((java.lang.CharSequence) "hi!", (int) (byte) 0, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.nibor.autolink.LinkSpan linkSpan9 = emailScanner1.scan((java.lang.CharSequence) "", 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 99");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(linkSpan5);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        org.nibor.autolink.internal.EmailScanner emailScanner1 = new org.nibor.autolink.internal.EmailScanner(true);
        org.nibor.autolink.LinkSpan linkSpan5 = emailScanner1.scan((java.lang.CharSequence) "hi!", 1, 1);
        org.nibor.autolink.LinkSpan linkSpan9 = emailScanner1.scan((java.lang.CharSequence) "hi!", 1, (int) (byte) 100);
        java.lang.Class<?> wildcardClass10 = emailScanner1.getClass();
        org.junit.Assert.assertNull(linkSpan5);
        org.junit.Assert.assertNull(linkSpan9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        org.nibor.autolink.internal.EmailScanner emailScanner1 = new org.nibor.autolink.internal.EmailScanner(true);
        org.nibor.autolink.LinkSpan linkSpan5 = emailScanner1.scan((java.lang.CharSequence) "hi!", 1, 1);
        org.nibor.autolink.LinkSpan linkSpan9 = emailScanner1.scan((java.lang.CharSequence) "hi!", (int) (byte) 1, (int) '4');
        org.nibor.autolink.LinkSpan linkSpan13 = emailScanner1.scan((java.lang.CharSequence) "hi!", (-1), (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.nibor.autolink.LinkSpan linkSpan17 = emailScanner1.scan((java.lang.CharSequence) "hi!", 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 99");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(linkSpan5);
        org.junit.Assert.assertNull(linkSpan9);
        org.junit.Assert.assertNull(linkSpan13);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        org.nibor.autolink.internal.EmailScanner emailScanner1 = new org.nibor.autolink.internal.EmailScanner(true);
        org.nibor.autolink.LinkSpan linkSpan5 = emailScanner1.scan((java.lang.CharSequence) "hi!", 1, 1);
        org.nibor.autolink.LinkSpan linkSpan9 = emailScanner1.scan((java.lang.CharSequence) "hi!", (int) (byte) 1, (int) '4');
        org.nibor.autolink.LinkSpan linkSpan13 = emailScanner1.scan((java.lang.CharSequence) "hi!", (-1), (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = linkSpan13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(linkSpan5);
        org.junit.Assert.assertNull(linkSpan9);
        org.junit.Assert.assertNull(linkSpan13);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        org.nibor.autolink.internal.EmailScanner emailScanner1 = new org.nibor.autolink.internal.EmailScanner(true);
        org.nibor.autolink.LinkSpan linkSpan5 = emailScanner1.scan((java.lang.CharSequence) "hi!", 1, 1);
        org.nibor.autolink.LinkSpan linkSpan9 = emailScanner1.scan((java.lang.CharSequence) "hi!", 0, (int) ' ');
        org.nibor.autolink.LinkSpan linkSpan13 = emailScanner1.scan((java.lang.CharSequence) "", 1, (int) '4');
        org.nibor.autolink.LinkSpan linkSpan17 = emailScanner1.scan((java.lang.CharSequence) "hi!", (int) (short) 1, 100);
        java.lang.CharSequence charSequence18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.nibor.autolink.LinkSpan linkSpan21 = emailScanner1.scan(charSequence18, (int) '#', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(linkSpan5);
        org.junit.Assert.assertNull(linkSpan9);
        org.junit.Assert.assertNull(linkSpan13);
        org.junit.Assert.assertNull(linkSpan17);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        org.nibor.autolink.internal.EmailScanner emailScanner1 = new org.nibor.autolink.internal.EmailScanner(true);
        org.nibor.autolink.LinkSpan linkSpan5 = emailScanner1.scan((java.lang.CharSequence) "hi!", 1, 1);
        org.nibor.autolink.LinkSpan linkSpan9 = emailScanner1.scan((java.lang.CharSequence) "hi!", 0, (int) ' ');
        org.nibor.autolink.LinkSpan linkSpan13 = emailScanner1.scan((java.lang.CharSequence) "", (int) (short) -1, 1);
        org.nibor.autolink.LinkSpan linkSpan17 = emailScanner1.scan((java.lang.CharSequence) "", 1, 1);
        org.junit.Assert.assertNull(linkSpan5);
        org.junit.Assert.assertNull(linkSpan9);
        org.junit.Assert.assertNull(linkSpan13);
        org.junit.Assert.assertNull(linkSpan17);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        org.nibor.autolink.internal.EmailScanner emailScanner1 = new org.nibor.autolink.internal.EmailScanner(false);
        org.nibor.autolink.LinkSpan linkSpan5 = emailScanner1.scan((java.lang.CharSequence) "", (int) (short) 100, 100);
        org.nibor.autolink.LinkSpan linkSpan9 = emailScanner1.scan((java.lang.CharSequence) "", 10, (int) 'a');
        org.nibor.autolink.LinkSpan linkSpan13 = emailScanner1.scan((java.lang.CharSequence) "", (int) ' ', (int) '4');
        java.lang.Class<?> wildcardClass14 = emailScanner1.getClass();
        org.junit.Assert.assertNull(linkSpan5);
        org.junit.Assert.assertNull(linkSpan9);
        org.junit.Assert.assertNull(linkSpan13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        org.nibor.autolink.internal.EmailScanner emailScanner1 = new org.nibor.autolink.internal.EmailScanner(true);
        org.nibor.autolink.LinkSpan linkSpan5 = emailScanner1.scan((java.lang.CharSequence) "hi!", 1, 1);
        java.lang.CharSequence charSequence6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.nibor.autolink.LinkSpan linkSpan9 = emailScanner1.scan(charSequence6, (int) (short) 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(linkSpan5);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        org.nibor.autolink.internal.EmailScanner emailScanner1 = new org.nibor.autolink.internal.EmailScanner(true);
        org.nibor.autolink.LinkSpan linkSpan5 = emailScanner1.scan((java.lang.CharSequence) "hi!", 1, 1);
        org.nibor.autolink.LinkSpan linkSpan9 = emailScanner1.scan((java.lang.CharSequence) "hi!", 0, (int) ' ');
        org.nibor.autolink.LinkSpan linkSpan13 = emailScanner1.scan((java.lang.CharSequence) "", 1, (int) '4');
        org.nibor.autolink.LinkSpan linkSpan17 = emailScanner1.scan((java.lang.CharSequence) "hi!", (int) (short) 1, 100);
        // The following exception was thrown during execution in test generation
        try {
            org.nibor.autolink.LinkSpan linkSpan21 = emailScanner1.scan((java.lang.CharSequence) "", (int) (short) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 99");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(linkSpan5);
        org.junit.Assert.assertNull(linkSpan9);
        org.junit.Assert.assertNull(linkSpan13);
        org.junit.Assert.assertNull(linkSpan17);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        org.nibor.autolink.internal.EmailScanner emailScanner1 = new org.nibor.autolink.internal.EmailScanner(false);
        org.nibor.autolink.LinkSpan linkSpan5 = emailScanner1.scan((java.lang.CharSequence) "", (int) (short) 100, 100);
        // The following exception was thrown during execution in test generation
        try {
            org.nibor.autolink.LinkSpan linkSpan9 = emailScanner1.scan((java.lang.CharSequence) "", 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 99");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(linkSpan5);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        org.nibor.autolink.internal.EmailScanner emailScanner1 = new org.nibor.autolink.internal.EmailScanner(true);
        org.nibor.autolink.LinkSpan linkSpan5 = emailScanner1.scan((java.lang.CharSequence) "", (int) (short) -1, 10);
        org.nibor.autolink.LinkSpan linkSpan9 = emailScanner1.scan((java.lang.CharSequence) "hi!", 1, 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = linkSpan9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(linkSpan5);
        org.junit.Assert.assertNull(linkSpan9);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        org.nibor.autolink.internal.EmailScanner emailScanner1 = new org.nibor.autolink.internal.EmailScanner(true);
        org.nibor.autolink.LinkSpan linkSpan5 = emailScanner1.scan((java.lang.CharSequence) "hi!", 1, 1);
        org.nibor.autolink.LinkSpan linkSpan9 = emailScanner1.scan((java.lang.CharSequence) "hi!", 0, (int) ' ');
        org.nibor.autolink.LinkSpan linkSpan13 = emailScanner1.scan((java.lang.CharSequence) "", (int) (short) -1, 1);
        org.nibor.autolink.LinkSpan linkSpan17 = emailScanner1.scan((java.lang.CharSequence) "", (int) (short) -1, (int) (byte) 1);
        java.lang.Class<?> wildcardClass18 = emailScanner1.getClass();
        org.junit.Assert.assertNull(linkSpan5);
        org.junit.Assert.assertNull(linkSpan9);
        org.junit.Assert.assertNull(linkSpan13);
        org.junit.Assert.assertNull(linkSpan17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        org.nibor.autolink.internal.EmailScanner emailScanner1 = new org.nibor.autolink.internal.EmailScanner(true);
        org.nibor.autolink.LinkSpan linkSpan5 = emailScanner1.scan((java.lang.CharSequence) "hi!", 1, 1);
        org.nibor.autolink.LinkSpan linkSpan9 = emailScanner1.scan((java.lang.CharSequence) "hi!", 0, (int) ' ');
        org.nibor.autolink.LinkSpan linkSpan13 = emailScanner1.scan((java.lang.CharSequence) "", 1, (int) '4');
        org.nibor.autolink.LinkSpan linkSpan17 = emailScanner1.scan((java.lang.CharSequence) "hi!", (int) (short) 1, 100);
        java.lang.Class<?> wildcardClass18 = emailScanner1.getClass();
        org.junit.Assert.assertNull(linkSpan5);
        org.junit.Assert.assertNull(linkSpan9);
        org.junit.Assert.assertNull(linkSpan13);
        org.junit.Assert.assertNull(linkSpan17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        org.nibor.autolink.internal.EmailScanner emailScanner1 = new org.nibor.autolink.internal.EmailScanner(false);
        org.nibor.autolink.LinkSpan linkSpan5 = emailScanner1.scan((java.lang.CharSequence) "", (int) (short) 100, 100);
        org.nibor.autolink.LinkSpan linkSpan9 = emailScanner1.scan((java.lang.CharSequence) "", 10, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = linkSpan9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(linkSpan5);
        org.junit.Assert.assertNull(linkSpan9);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        org.nibor.autolink.internal.EmailScanner emailScanner1 = new org.nibor.autolink.internal.EmailScanner(true);
        org.nibor.autolink.LinkSpan linkSpan5 = emailScanner1.scan((java.lang.CharSequence) "hi!", 1, 1);
        org.nibor.autolink.LinkSpan linkSpan9 = emailScanner1.scan((java.lang.CharSequence) "hi!", 0, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.nibor.autolink.LinkSpan linkSpan13 = emailScanner1.scan((java.lang.CharSequence) "hi!", (int) (byte) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 9");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(linkSpan5);
        org.junit.Assert.assertNull(linkSpan9);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        org.nibor.autolink.internal.EmailScanner emailScanner1 = new org.nibor.autolink.internal.EmailScanner(true);
        org.nibor.autolink.LinkSpan linkSpan5 = emailScanner1.scan((java.lang.CharSequence) "hi!", 1, 1);
        org.nibor.autolink.LinkSpan linkSpan9 = emailScanner1.scan((java.lang.CharSequence) "hi!", 0, (int) ' ');
        org.nibor.autolink.LinkSpan linkSpan13 = emailScanner1.scan((java.lang.CharSequence) "", (int) (short) -1, 1);
        java.lang.Class<?> wildcardClass14 = emailScanner1.getClass();
        org.junit.Assert.assertNull(linkSpan5);
        org.junit.Assert.assertNull(linkSpan9);
        org.junit.Assert.assertNull(linkSpan13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        org.nibor.autolink.internal.EmailScanner emailScanner1 = new org.nibor.autolink.internal.EmailScanner(false);
        // The following exception was thrown during execution in test generation
        try {
            org.nibor.autolink.LinkSpan linkSpan5 = emailScanner1.scan((java.lang.CharSequence) "", (int) '4', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 51");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        org.nibor.autolink.internal.EmailScanner emailScanner1 = new org.nibor.autolink.internal.EmailScanner(true);
        org.nibor.autolink.LinkSpan linkSpan5 = emailScanner1.scan((java.lang.CharSequence) "hi!", 1, 1);
        org.nibor.autolink.LinkSpan linkSpan9 = emailScanner1.scan((java.lang.CharSequence) "hi!", 0, (int) ' ');
        org.nibor.autolink.LinkSpan linkSpan13 = emailScanner1.scan((java.lang.CharSequence) "", 1, (int) '4');
        java.lang.Class<?> wildcardClass14 = emailScanner1.getClass();
        org.junit.Assert.assertNull(linkSpan5);
        org.junit.Assert.assertNull(linkSpan9);
        org.junit.Assert.assertNull(linkSpan13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        org.nibor.autolink.internal.EmailScanner emailScanner1 = new org.nibor.autolink.internal.EmailScanner(false);
        org.nibor.autolink.LinkSpan linkSpan5 = emailScanner1.scan((java.lang.CharSequence) "hi!", (int) (byte) 0, (int) (short) 100);
        org.nibor.autolink.LinkSpan linkSpan9 = emailScanner1.scan((java.lang.CharSequence) "hi!", (int) (short) 10, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = linkSpan9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(linkSpan5);
        org.junit.Assert.assertNull(linkSpan9);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        org.nibor.autolink.internal.EmailScanner emailScanner1 = new org.nibor.autolink.internal.EmailScanner(false);
        org.nibor.autolink.LinkSpan linkSpan5 = emailScanner1.scan((java.lang.CharSequence) "", (int) '#', (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = linkSpan5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(linkSpan5);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        org.nibor.autolink.internal.EmailScanner emailScanner1 = new org.nibor.autolink.internal.EmailScanner(true);
        org.nibor.autolink.LinkSpan linkSpan5 = emailScanner1.scan((java.lang.CharSequence) "", (int) (short) -1, 10);
        org.nibor.autolink.LinkSpan linkSpan9 = emailScanner1.scan((java.lang.CharSequence) "hi!", 1, 100);
        org.nibor.autolink.LinkSpan linkSpan13 = emailScanner1.scan((java.lang.CharSequence) "hi!", (int) (short) 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            org.nibor.autolink.LinkSpan linkSpan17 = emailScanner1.scan((java.lang.CharSequence) "hi!", (int) 'a', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 96");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(linkSpan5);
        org.junit.Assert.assertNull(linkSpan9);
        org.junit.Assert.assertNull(linkSpan13);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        org.nibor.autolink.internal.EmailScanner emailScanner1 = new org.nibor.autolink.internal.EmailScanner(true);
        org.nibor.autolink.LinkSpan linkSpan5 = emailScanner1.scan((java.lang.CharSequence) "", (int) (short) -1, 10);
        java.lang.CharSequence charSequence6 = null;
        org.nibor.autolink.LinkSpan linkSpan9 = emailScanner1.scan(charSequence6, (int) '#', (int) (byte) 100);
        org.nibor.autolink.LinkSpan linkSpan13 = emailScanner1.scan((java.lang.CharSequence) "", (int) (byte) 1, 10);
        org.junit.Assert.assertNull(linkSpan5);
        org.junit.Assert.assertNull(linkSpan9);
        org.junit.Assert.assertNull(linkSpan13);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        org.nibor.autolink.internal.EmailScanner emailScanner1 = new org.nibor.autolink.internal.EmailScanner(false);
        org.nibor.autolink.LinkSpan linkSpan5 = emailScanner1.scan((java.lang.CharSequence) "hi!", 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = linkSpan5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(linkSpan5);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        org.nibor.autolink.internal.EmailScanner emailScanner1 = new org.nibor.autolink.internal.EmailScanner(true);
        org.nibor.autolink.LinkSpan linkSpan5 = emailScanner1.scan((java.lang.CharSequence) "hi!", 1, 1);
        org.nibor.autolink.LinkSpan linkSpan9 = emailScanner1.scan((java.lang.CharSequence) "hi!", 0, (int) ' ');
        org.nibor.autolink.LinkSpan linkSpan13 = emailScanner1.scan((java.lang.CharSequence) "", 1, (int) '4');
        org.nibor.autolink.LinkSpan linkSpan17 = emailScanner1.scan((java.lang.CharSequence) "hi!", (int) (short) 1, 100);
        // The following exception was thrown during execution in test generation
        try {
            org.nibor.autolink.LinkSpan linkSpan21 = emailScanner1.scan((java.lang.CharSequence) "", (int) (byte) 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(linkSpan5);
        org.junit.Assert.assertNull(linkSpan9);
        org.junit.Assert.assertNull(linkSpan13);
        org.junit.Assert.assertNull(linkSpan17);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        org.nibor.autolink.internal.EmailScanner emailScanner1 = new org.nibor.autolink.internal.EmailScanner(true);
        org.nibor.autolink.LinkSpan linkSpan5 = emailScanner1.scan((java.lang.CharSequence) "hi!", 1, 1);
        org.nibor.autolink.LinkSpan linkSpan9 = emailScanner1.scan((java.lang.CharSequence) "hi!", 0, (int) ' ');
        org.nibor.autolink.LinkSpan linkSpan13 = emailScanner1.scan((java.lang.CharSequence) "", (int) (short) -1, 1);
        // The following exception was thrown during execution in test generation
        try {
            org.nibor.autolink.LinkSpan linkSpan17 = emailScanner1.scan((java.lang.CharSequence) "", 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 9");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(linkSpan5);
        org.junit.Assert.assertNull(linkSpan9);
        org.junit.Assert.assertNull(linkSpan13);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        org.nibor.autolink.internal.EmailScanner emailScanner1 = new org.nibor.autolink.internal.EmailScanner(false);
        org.nibor.autolink.LinkSpan linkSpan5 = emailScanner1.scan((java.lang.CharSequence) "hi!", (int) (byte) 0, (int) (short) 100);
        org.nibor.autolink.LinkSpan linkSpan9 = emailScanner1.scan((java.lang.CharSequence) "hi!", (int) (short) 10, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.nibor.autolink.LinkSpan linkSpan13 = emailScanner1.scan((java.lang.CharSequence) "hi!", (int) (byte) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 99");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(linkSpan5);
        org.junit.Assert.assertNull(linkSpan9);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        org.nibor.autolink.internal.EmailScanner emailScanner1 = new org.nibor.autolink.internal.EmailScanner(true);
        org.nibor.autolink.LinkSpan linkSpan5 = emailScanner1.scan((java.lang.CharSequence) "hi!", 1, 1);
        org.nibor.autolink.LinkSpan linkSpan9 = emailScanner1.scan((java.lang.CharSequence) "hi!", 0, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.nibor.autolink.LinkSpan linkSpan13 = emailScanner1.scan((java.lang.CharSequence) "hi!", (int) 'a', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 96");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(linkSpan5);
        org.junit.Assert.assertNull(linkSpan9);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        org.nibor.autolink.internal.EmailScanner emailScanner1 = new org.nibor.autolink.internal.EmailScanner(true);
        org.nibor.autolink.LinkSpan linkSpan5 = emailScanner1.scan((java.lang.CharSequence) "hi!", 1, 1);
        org.nibor.autolink.LinkSpan linkSpan9 = emailScanner1.scan((java.lang.CharSequence) "hi!", 0, (int) ' ');
        org.nibor.autolink.LinkSpan linkSpan13 = emailScanner1.scan((java.lang.CharSequence) "", (int) (short) -1, 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = linkSpan13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(linkSpan5);
        org.junit.Assert.assertNull(linkSpan9);
        org.junit.Assert.assertNull(linkSpan13);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        org.nibor.autolink.internal.EmailScanner emailScanner1 = new org.nibor.autolink.internal.EmailScanner(true);
        org.nibor.autolink.LinkSpan linkSpan5 = emailScanner1.scan((java.lang.CharSequence) "", (int) (short) -1, 10);
        java.lang.CharSequence charSequence6 = null;
        org.nibor.autolink.LinkSpan linkSpan9 = emailScanner1.scan(charSequence6, (int) '#', (int) (byte) 100);
        java.lang.Class<?> wildcardClass10 = emailScanner1.getClass();
        org.junit.Assert.assertNull(linkSpan5);
        org.junit.Assert.assertNull(linkSpan9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        org.nibor.autolink.internal.EmailScanner emailScanner1 = new org.nibor.autolink.internal.EmailScanner(false);
        org.nibor.autolink.LinkSpan linkSpan5 = emailScanner1.scan((java.lang.CharSequence) "hi!", (int) (byte) 0, (int) (short) 100);
        org.nibor.autolink.LinkSpan linkSpan9 = emailScanner1.scan((java.lang.CharSequence) "hi!", (int) (byte) 1, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = linkSpan9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(linkSpan5);
        org.junit.Assert.assertNull(linkSpan9);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        org.nibor.autolink.internal.EmailScanner emailScanner1 = new org.nibor.autolink.internal.EmailScanner(true);
        org.nibor.autolink.LinkSpan linkSpan5 = emailScanner1.scan((java.lang.CharSequence) "hi!", 1, 1);
        org.nibor.autolink.LinkSpan linkSpan9 = emailScanner1.scan((java.lang.CharSequence) "", (-1), (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.nibor.autolink.LinkSpan linkSpan13 = emailScanner1.scan((java.lang.CharSequence) "hi!", 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 99");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(linkSpan5);
        org.junit.Assert.assertNull(linkSpan9);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        org.nibor.autolink.internal.EmailScanner emailScanner1 = new org.nibor.autolink.internal.EmailScanner(true);
        org.nibor.autolink.LinkSpan linkSpan5 = emailScanner1.scan((java.lang.CharSequence) "hi!", 1, 1);
        org.nibor.autolink.LinkSpan linkSpan9 = emailScanner1.scan((java.lang.CharSequence) "", (-1), (int) (short) 0);
        org.nibor.autolink.LinkSpan linkSpan13 = emailScanner1.scan((java.lang.CharSequence) "", 0, 100);
        org.nibor.autolink.LinkSpan linkSpan17 = emailScanner1.scan((java.lang.CharSequence) "", (int) '4', (int) '4');
        java.lang.Class<?> wildcardClass18 = emailScanner1.getClass();
        org.junit.Assert.assertNull(linkSpan5);
        org.junit.Assert.assertNull(linkSpan9);
        org.junit.Assert.assertNull(linkSpan13);
        org.junit.Assert.assertNull(linkSpan17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        org.nibor.autolink.internal.EmailScanner emailScanner1 = new org.nibor.autolink.internal.EmailScanner(false);
        org.nibor.autolink.LinkSpan linkSpan5 = emailScanner1.scan((java.lang.CharSequence) "hi!", (-1), (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = linkSpan5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(linkSpan5);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        org.nibor.autolink.internal.EmailScanner emailScanner1 = new org.nibor.autolink.internal.EmailScanner(true);
        org.nibor.autolink.LinkSpan linkSpan5 = emailScanner1.scan((java.lang.CharSequence) "hi!", 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = linkSpan5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(linkSpan5);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        org.nibor.autolink.internal.EmailScanner emailScanner1 = new org.nibor.autolink.internal.EmailScanner(false);
        org.nibor.autolink.LinkSpan linkSpan5 = emailScanner1.scan((java.lang.CharSequence) "", (int) (short) 100, 100);
        org.nibor.autolink.LinkSpan linkSpan9 = emailScanner1.scan((java.lang.CharSequence) "", 10, (int) 'a');
        org.nibor.autolink.LinkSpan linkSpan13 = emailScanner1.scan((java.lang.CharSequence) "hi!", (int) (byte) 1, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = linkSpan13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(linkSpan5);
        org.junit.Assert.assertNull(linkSpan9);
        org.junit.Assert.assertNull(linkSpan13);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        org.nibor.autolink.internal.EmailScanner emailScanner1 = new org.nibor.autolink.internal.EmailScanner(false);
        org.nibor.autolink.LinkSpan linkSpan5 = emailScanner1.scan((java.lang.CharSequence) "hi!", (int) (byte) 0, (int) (short) 100);
        org.nibor.autolink.LinkSpan linkSpan9 = emailScanner1.scan((java.lang.CharSequence) "hi!", (int) (short) 10, (int) ' ');
        org.nibor.autolink.LinkSpan linkSpan13 = emailScanner1.scan((java.lang.CharSequence) "hi!", (int) (byte) 0, 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = linkSpan13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(linkSpan5);
        org.junit.Assert.assertNull(linkSpan9);
        org.junit.Assert.assertNull(linkSpan13);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        org.nibor.autolink.internal.EmailScanner emailScanner1 = new org.nibor.autolink.internal.EmailScanner(false);
        org.nibor.autolink.LinkSpan linkSpan5 = emailScanner1.scan((java.lang.CharSequence) "", (int) (short) 100, 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = linkSpan5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(linkSpan5);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        org.nibor.autolink.internal.EmailScanner emailScanner1 = new org.nibor.autolink.internal.EmailScanner(true);
        org.nibor.autolink.LinkSpan linkSpan5 = emailScanner1.scan((java.lang.CharSequence) "hi!", 1, 1);
        org.nibor.autolink.LinkSpan linkSpan9 = emailScanner1.scan((java.lang.CharSequence) "hi!", 0, (int) ' ');
        org.nibor.autolink.LinkSpan linkSpan13 = emailScanner1.scan((java.lang.CharSequence) "", 1, (int) '4');
        org.nibor.autolink.LinkSpan linkSpan17 = emailScanner1.scan((java.lang.CharSequence) "hi!", 0, (int) ' ');
        org.junit.Assert.assertNull(linkSpan5);
        org.junit.Assert.assertNull(linkSpan9);
        org.junit.Assert.assertNull(linkSpan13);
        org.junit.Assert.assertNull(linkSpan17);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        org.nibor.autolink.internal.EmailScanner emailScanner1 = new org.nibor.autolink.internal.EmailScanner(true);
        org.nibor.autolink.LinkSpan linkSpan5 = emailScanner1.scan((java.lang.CharSequence) "hi!", (int) (short) -1, (int) (short) 10);
        org.junit.Assert.assertNull(linkSpan5);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        org.nibor.autolink.internal.EmailScanner emailScanner1 = new org.nibor.autolink.internal.EmailScanner(true);
        org.nibor.autolink.LinkSpan linkSpan5 = emailScanner1.scan((java.lang.CharSequence) "hi!", 1, 1);
        org.nibor.autolink.LinkSpan linkSpan9 = emailScanner1.scan((java.lang.CharSequence) "hi!", 0, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.nibor.autolink.LinkSpan linkSpan13 = emailScanner1.scan((java.lang.CharSequence) "hi!", (int) 'a', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 96");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(linkSpan5);
        org.junit.Assert.assertNull(linkSpan9);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        org.nibor.autolink.internal.EmailScanner emailScanner1 = new org.nibor.autolink.internal.EmailScanner(false);
        org.nibor.autolink.LinkSpan linkSpan5 = emailScanner1.scan((java.lang.CharSequence) "hi!", (-1), (int) (short) 100);
        java.lang.Class<?> wildcardClass6 = emailScanner1.getClass();
        org.junit.Assert.assertNull(linkSpan5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        org.nibor.autolink.internal.EmailScanner emailScanner1 = new org.nibor.autolink.internal.EmailScanner(true);
        org.nibor.autolink.LinkSpan linkSpan5 = emailScanner1.scan((java.lang.CharSequence) "hi!", 1, 1);
        org.nibor.autolink.LinkSpan linkSpan9 = emailScanner1.scan((java.lang.CharSequence) "hi!", 0, (int) ' ');
        org.nibor.autolink.LinkSpan linkSpan13 = emailScanner1.scan((java.lang.CharSequence) "", (int) (short) -1, 1);
        org.nibor.autolink.LinkSpan linkSpan17 = emailScanner1.scan((java.lang.CharSequence) "", (int) (short) -1, (int) (byte) 1);
        org.nibor.autolink.LinkSpan linkSpan21 = emailScanner1.scan((java.lang.CharSequence) "hi!", (int) (byte) -1, 1);
        java.lang.Class<?> wildcardClass22 = emailScanner1.getClass();
        org.junit.Assert.assertNull(linkSpan5);
        org.junit.Assert.assertNull(linkSpan9);
        org.junit.Assert.assertNull(linkSpan13);
        org.junit.Assert.assertNull(linkSpan17);
        org.junit.Assert.assertNull(linkSpan21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        org.nibor.autolink.internal.EmailScanner emailScanner1 = new org.nibor.autolink.internal.EmailScanner(true);
        org.nibor.autolink.LinkSpan linkSpan5 = emailScanner1.scan((java.lang.CharSequence) "hi!", 1, 1);
        org.nibor.autolink.LinkSpan linkSpan9 = emailScanner1.scan((java.lang.CharSequence) "hi!", (int) (byte) 1, (int) '4');
        org.nibor.autolink.LinkSpan linkSpan13 = emailScanner1.scan((java.lang.CharSequence) "hi!", (-1), (int) (byte) -1);
        java.lang.Class<?> wildcardClass14 = emailScanner1.getClass();
        org.junit.Assert.assertNull(linkSpan5);
        org.junit.Assert.assertNull(linkSpan9);
        org.junit.Assert.assertNull(linkSpan13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        org.nibor.autolink.internal.EmailScanner emailScanner1 = new org.nibor.autolink.internal.EmailScanner(false);
        // The following exception was thrown during execution in test generation
        try {
            org.nibor.autolink.LinkSpan linkSpan5 = emailScanner1.scan((java.lang.CharSequence) "hi!", 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 9");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        org.nibor.autolink.internal.EmailScanner emailScanner1 = new org.nibor.autolink.internal.EmailScanner(true);
        org.nibor.autolink.LinkSpan linkSpan5 = emailScanner1.scan((java.lang.CharSequence) "hi!", 1, 1);
        org.nibor.autolink.LinkSpan linkSpan9 = emailScanner1.scan((java.lang.CharSequence) "", (-1), (int) (short) 0);
        org.nibor.autolink.LinkSpan linkSpan13 = emailScanner1.scan((java.lang.CharSequence) "", 0, 100);
        // The following exception was thrown during execution in test generation
        try {
            org.nibor.autolink.LinkSpan linkSpan17 = emailScanner1.scan((java.lang.CharSequence) "", (int) 'a', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 96");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(linkSpan5);
        org.junit.Assert.assertNull(linkSpan9);
        org.junit.Assert.assertNull(linkSpan13);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        org.nibor.autolink.internal.EmailScanner emailScanner1 = new org.nibor.autolink.internal.EmailScanner(false);
        org.nibor.autolink.LinkSpan linkSpan5 = emailScanner1.scan((java.lang.CharSequence) "", (int) (short) 100, 100);
        org.nibor.autolink.LinkSpan linkSpan9 = emailScanner1.scan((java.lang.CharSequence) "", 10, (int) 'a');
        org.nibor.autolink.LinkSpan linkSpan13 = emailScanner1.scan((java.lang.CharSequence) "hi!", (int) (byte) 1, (int) (short) 100);
        java.lang.Class<?> wildcardClass14 = emailScanner1.getClass();
        org.junit.Assert.assertNull(linkSpan5);
        org.junit.Assert.assertNull(linkSpan9);
        org.junit.Assert.assertNull(linkSpan13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        org.nibor.autolink.internal.EmailScanner emailScanner1 = new org.nibor.autolink.internal.EmailScanner(true);
        org.nibor.autolink.LinkSpan linkSpan5 = emailScanner1.scan((java.lang.CharSequence) "hi!", 1, 1);
        org.nibor.autolink.LinkSpan linkSpan9 = emailScanner1.scan((java.lang.CharSequence) "", (-1), (int) (short) 0);
        org.nibor.autolink.LinkSpan linkSpan13 = emailScanner1.scan((java.lang.CharSequence) "", 0, 100);
        org.nibor.autolink.LinkSpan linkSpan17 = emailScanner1.scan((java.lang.CharSequence) "", (int) '4', (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.nibor.autolink.LinkSpan linkSpan21 = emailScanner1.scan((java.lang.CharSequence) "", (int) '4', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 51");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(linkSpan5);
        org.junit.Assert.assertNull(linkSpan9);
        org.junit.Assert.assertNull(linkSpan13);
        org.junit.Assert.assertNull(linkSpan17);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        org.nibor.autolink.internal.EmailScanner emailScanner1 = new org.nibor.autolink.internal.EmailScanner(true);
        org.nibor.autolink.LinkSpan linkSpan5 = emailScanner1.scan((java.lang.CharSequence) "", (int) (short) -1, 10);
        org.nibor.autolink.LinkSpan linkSpan9 = emailScanner1.scan((java.lang.CharSequence) "hi!", 1, 100);
        org.nibor.autolink.LinkSpan linkSpan13 = emailScanner1.scan((java.lang.CharSequence) "hi!", (int) (short) 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            org.nibor.autolink.LinkSpan linkSpan17 = emailScanner1.scan((java.lang.CharSequence) "hi!", 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 99");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(linkSpan5);
        org.junit.Assert.assertNull(linkSpan9);
        org.junit.Assert.assertNull(linkSpan13);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        org.nibor.autolink.internal.EmailScanner emailScanner1 = new org.nibor.autolink.internal.EmailScanner(false);
        org.nibor.autolink.LinkSpan linkSpan5 = emailScanner1.scan((java.lang.CharSequence) "", (int) (short) 100, 100);
        org.nibor.autolink.LinkSpan linkSpan9 = emailScanner1.scan((java.lang.CharSequence) "", 10, (int) 'a');
        org.nibor.autolink.LinkSpan linkSpan13 = emailScanner1.scan((java.lang.CharSequence) "", (int) ' ', (int) '4');
        org.nibor.autolink.LinkSpan linkSpan17 = emailScanner1.scan((java.lang.CharSequence) "", (int) (short) 100, 100);
        java.lang.Class<?> wildcardClass18 = emailScanner1.getClass();
        org.junit.Assert.assertNull(linkSpan5);
        org.junit.Assert.assertNull(linkSpan9);
        org.junit.Assert.assertNull(linkSpan13);
        org.junit.Assert.assertNull(linkSpan17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        org.nibor.autolink.internal.EmailScanner emailScanner1 = new org.nibor.autolink.internal.EmailScanner(false);
        org.nibor.autolink.LinkSpan linkSpan5 = emailScanner1.scan((java.lang.CharSequence) "", (int) (short) 100, 100);
        org.nibor.autolink.LinkSpan linkSpan9 = emailScanner1.scan((java.lang.CharSequence) "", 10, (int) 'a');
        org.nibor.autolink.LinkSpan linkSpan13 = emailScanner1.scan((java.lang.CharSequence) "", (int) ' ', (int) '4');
        org.nibor.autolink.LinkSpan linkSpan17 = emailScanner1.scan((java.lang.CharSequence) "", (int) ' ', (int) ' ');
        org.nibor.autolink.LinkSpan linkSpan21 = emailScanner1.scan((java.lang.CharSequence) "hi!", (int) (short) 0, (int) 'a');
        org.junit.Assert.assertNull(linkSpan5);
        org.junit.Assert.assertNull(linkSpan9);
        org.junit.Assert.assertNull(linkSpan13);
        org.junit.Assert.assertNull(linkSpan17);
        org.junit.Assert.assertNull(linkSpan21);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        org.nibor.autolink.internal.EmailScanner emailScanner1 = new org.nibor.autolink.internal.EmailScanner(false);
        org.nibor.autolink.LinkSpan linkSpan5 = emailScanner1.scan((java.lang.CharSequence) "hi!", (-1), (int) (short) 100);
        org.nibor.autolink.LinkSpan linkSpan9 = emailScanner1.scan((java.lang.CharSequence) "hi!", (int) (byte) -1, 100);
        org.junit.Assert.assertNull(linkSpan5);
        org.junit.Assert.assertNull(linkSpan9);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        org.nibor.autolink.internal.EmailScanner emailScanner1 = new org.nibor.autolink.internal.EmailScanner(false);
        org.nibor.autolink.LinkSpan linkSpan5 = emailScanner1.scan((java.lang.CharSequence) "hi!", 1, 1);
        org.nibor.autolink.LinkSpan linkSpan9 = emailScanner1.scan((java.lang.CharSequence) "", (int) '#', (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = linkSpan9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(linkSpan5);
        org.junit.Assert.assertNull(linkSpan9);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        org.nibor.autolink.internal.EmailScanner emailScanner1 = new org.nibor.autolink.internal.EmailScanner(true);
        org.nibor.autolink.LinkSpan linkSpan5 = emailScanner1.scan((java.lang.CharSequence) "hi!", 1, 1);
        org.nibor.autolink.LinkSpan linkSpan9 = emailScanner1.scan((java.lang.CharSequence) "hi!", 1, (int) (byte) 100);
        org.nibor.autolink.LinkSpan linkSpan13 = emailScanner1.scan((java.lang.CharSequence) "", (int) (short) 1, (int) (byte) 1);
        org.nibor.autolink.LinkSpan linkSpan17 = emailScanner1.scan((java.lang.CharSequence) "", (int) (short) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass18 = linkSpan17.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(linkSpan5);
        org.junit.Assert.assertNull(linkSpan9);
        org.junit.Assert.assertNull(linkSpan13);
        org.junit.Assert.assertNull(linkSpan17);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        org.nibor.autolink.internal.EmailScanner emailScanner1 = new org.nibor.autolink.internal.EmailScanner(true);
        org.nibor.autolink.LinkSpan linkSpan5 = emailScanner1.scan((java.lang.CharSequence) "hi!", 1, 1);
        org.nibor.autolink.LinkSpan linkSpan9 = emailScanner1.scan((java.lang.CharSequence) "", (-1), (int) (short) 0);
        org.nibor.autolink.LinkSpan linkSpan13 = emailScanner1.scan((java.lang.CharSequence) "", 0, 100);
        org.nibor.autolink.LinkSpan linkSpan17 = emailScanner1.scan((java.lang.CharSequence) "", (int) '4', (int) '4');
        org.nibor.autolink.LinkSpan linkSpan21 = emailScanner1.scan((java.lang.CharSequence) "", (int) (short) 0, (int) (short) 1);
        org.junit.Assert.assertNull(linkSpan5);
        org.junit.Assert.assertNull(linkSpan9);
        org.junit.Assert.assertNull(linkSpan13);
        org.junit.Assert.assertNull(linkSpan17);
        org.junit.Assert.assertNull(linkSpan21);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        org.nibor.autolink.internal.EmailScanner emailScanner1 = new org.nibor.autolink.internal.EmailScanner(false);
        org.nibor.autolink.LinkSpan linkSpan5 = emailScanner1.scan((java.lang.CharSequence) "hi!", (int) (byte) 0, (int) (short) 100);
        org.nibor.autolink.LinkSpan linkSpan9 = emailScanner1.scan((java.lang.CharSequence) "hi!", (int) (byte) 1, (int) (byte) 100);
        org.nibor.autolink.LinkSpan linkSpan13 = emailScanner1.scan((java.lang.CharSequence) "", (int) (short) 1, (int) 'a');
        org.junit.Assert.assertNull(linkSpan5);
        org.junit.Assert.assertNull(linkSpan9);
        org.junit.Assert.assertNull(linkSpan13);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        org.nibor.autolink.internal.EmailScanner emailScanner1 = new org.nibor.autolink.internal.EmailScanner(true);
        org.nibor.autolink.LinkSpan linkSpan5 = emailScanner1.scan((java.lang.CharSequence) "hi!", 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            org.nibor.autolink.LinkSpan linkSpan9 = emailScanner1.scan((java.lang.CharSequence) "", 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(linkSpan5);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        org.nibor.autolink.internal.EmailScanner emailScanner1 = new org.nibor.autolink.internal.EmailScanner(true);
        org.nibor.autolink.LinkSpan linkSpan5 = emailScanner1.scan((java.lang.CharSequence) "hi!", 1, 1);
        org.nibor.autolink.LinkSpan linkSpan9 = emailScanner1.scan((java.lang.CharSequence) "hi!", (int) (byte) 1, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.nibor.autolink.LinkSpan linkSpan13 = emailScanner1.scan((java.lang.CharSequence) "hi!", 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 99");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(linkSpan5);
        org.junit.Assert.assertNull(linkSpan9);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        org.nibor.autolink.internal.EmailScanner emailScanner1 = new org.nibor.autolink.internal.EmailScanner(false);
        org.nibor.autolink.LinkSpan linkSpan5 = emailScanner1.scan((java.lang.CharSequence) "", (int) (short) 100, 100);
        org.nibor.autolink.LinkSpan linkSpan9 = emailScanner1.scan((java.lang.CharSequence) "", 10, (int) 'a');
        org.nibor.autolink.LinkSpan linkSpan13 = emailScanner1.scan((java.lang.CharSequence) "hi!", (int) (byte) 1, (int) (short) 100);
        org.nibor.autolink.LinkSpan linkSpan17 = emailScanner1.scan((java.lang.CharSequence) "", (int) (byte) 0, 1);
        org.nibor.autolink.LinkSpan linkSpan21 = emailScanner1.scan((java.lang.CharSequence) "", (int) (byte) 0, (int) (short) 1);
        org.junit.Assert.assertNull(linkSpan5);
        org.junit.Assert.assertNull(linkSpan9);
        org.junit.Assert.assertNull(linkSpan13);
        org.junit.Assert.assertNull(linkSpan17);
        org.junit.Assert.assertNull(linkSpan21);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        org.nibor.autolink.internal.EmailScanner emailScanner1 = new org.nibor.autolink.internal.EmailScanner(false);
        org.nibor.autolink.LinkSpan linkSpan5 = emailScanner1.scan((java.lang.CharSequence) "hi!", 1, 1);
        org.nibor.autolink.LinkSpan linkSpan9 = emailScanner1.scan((java.lang.CharSequence) "", (int) 'a', (int) (short) 100);
        org.nibor.autolink.LinkSpan linkSpan13 = emailScanner1.scan((java.lang.CharSequence) "", (int) (byte) -1, 10);
        org.junit.Assert.assertNull(linkSpan5);
        org.junit.Assert.assertNull(linkSpan9);
        org.junit.Assert.assertNull(linkSpan13);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        org.nibor.autolink.internal.EmailScanner emailScanner1 = new org.nibor.autolink.internal.EmailScanner(false);
        org.nibor.autolink.LinkSpan linkSpan5 = emailScanner1.scan((java.lang.CharSequence) "", (int) (short) 100, 100);
        org.nibor.autolink.LinkSpan linkSpan9 = emailScanner1.scan((java.lang.CharSequence) "", (int) 'a', (int) (byte) 100);
        org.junit.Assert.assertNull(linkSpan5);
        org.junit.Assert.assertNull(linkSpan9);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        org.nibor.autolink.internal.EmailScanner emailScanner1 = new org.nibor.autolink.internal.EmailScanner(true);
        org.nibor.autolink.LinkSpan linkSpan5 = emailScanner1.scan((java.lang.CharSequence) "hi!", 1, 1);
        org.nibor.autolink.LinkSpan linkSpan9 = emailScanner1.scan((java.lang.CharSequence) "hi!", 0, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.nibor.autolink.LinkSpan linkSpan13 = emailScanner1.scan((java.lang.CharSequence) "hi!", (int) ' ', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 31");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(linkSpan5);
        org.junit.Assert.assertNull(linkSpan9);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        org.nibor.autolink.internal.EmailScanner emailScanner1 = new org.nibor.autolink.internal.EmailScanner(true);
        org.nibor.autolink.LinkSpan linkSpan5 = emailScanner1.scan((java.lang.CharSequence) "hi!", 1, 1);
        org.nibor.autolink.LinkSpan linkSpan9 = emailScanner1.scan((java.lang.CharSequence) "", (int) (byte) -1, (int) (short) 1);
        org.nibor.autolink.LinkSpan linkSpan13 = emailScanner1.scan((java.lang.CharSequence) "", (int) (byte) -1, (int) (short) 0);
        org.junit.Assert.assertNull(linkSpan5);
        org.junit.Assert.assertNull(linkSpan9);
        org.junit.Assert.assertNull(linkSpan13);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        org.nibor.autolink.internal.EmailScanner emailScanner1 = new org.nibor.autolink.internal.EmailScanner(true);
        org.nibor.autolink.LinkSpan linkSpan5 = emailScanner1.scan((java.lang.CharSequence) "hi!", 1, 1);
        org.nibor.autolink.LinkSpan linkSpan9 = emailScanner1.scan((java.lang.CharSequence) "", (int) (byte) -1, (int) (short) 1);
        org.nibor.autolink.LinkSpan linkSpan13 = emailScanner1.scan((java.lang.CharSequence) "hi!", 0, 0);
        org.junit.Assert.assertNull(linkSpan5);
        org.junit.Assert.assertNull(linkSpan9);
        org.junit.Assert.assertNull(linkSpan13);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        org.nibor.autolink.internal.EmailScanner emailScanner1 = new org.nibor.autolink.internal.EmailScanner(false);
        org.nibor.autolink.LinkSpan linkSpan5 = emailScanner1.scan((java.lang.CharSequence) "hi!", 1, 1);
        java.lang.Class<?> wildcardClass6 = emailScanner1.getClass();
        org.junit.Assert.assertNull(linkSpan5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        org.nibor.autolink.internal.EmailScanner emailScanner1 = new org.nibor.autolink.internal.EmailScanner(false);
        org.nibor.autolink.LinkSpan linkSpan5 = emailScanner1.scan((java.lang.CharSequence) "", (int) (short) 100, 100);
        org.nibor.autolink.LinkSpan linkSpan9 = emailScanner1.scan((java.lang.CharSequence) "", 10, (int) 'a');
        org.nibor.autolink.LinkSpan linkSpan13 = emailScanner1.scan((java.lang.CharSequence) "", (int) ' ', (int) '4');
        org.nibor.autolink.LinkSpan linkSpan17 = emailScanner1.scan((java.lang.CharSequence) "", (int) ' ', (int) ' ');
        org.nibor.autolink.LinkSpan linkSpan21 = emailScanner1.scan((java.lang.CharSequence) "", (-1), (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.nibor.autolink.LinkSpan linkSpan25 = emailScanner1.scan((java.lang.CharSequence) "", 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 99");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(linkSpan5);
        org.junit.Assert.assertNull(linkSpan9);
        org.junit.Assert.assertNull(linkSpan13);
        org.junit.Assert.assertNull(linkSpan17);
        org.junit.Assert.assertNull(linkSpan21);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        org.nibor.autolink.internal.EmailScanner emailScanner1 = new org.nibor.autolink.internal.EmailScanner(true);
        org.nibor.autolink.LinkSpan linkSpan5 = emailScanner1.scan((java.lang.CharSequence) "hi!", 1, 1);
        org.nibor.autolink.LinkSpan linkSpan9 = emailScanner1.scan((java.lang.CharSequence) "hi!", 0, (int) ' ');
        org.nibor.autolink.LinkSpan linkSpan13 = emailScanner1.scan((java.lang.CharSequence) "", (int) (short) -1, 1);
        org.nibor.autolink.LinkSpan linkSpan17 = emailScanner1.scan((java.lang.CharSequence) "", (int) (short) -1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.nibor.autolink.LinkSpan linkSpan21 = emailScanner1.scan((java.lang.CharSequence) "hi!", 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(linkSpan5);
        org.junit.Assert.assertNull(linkSpan9);
        org.junit.Assert.assertNull(linkSpan13);
        org.junit.Assert.assertNull(linkSpan17);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        org.nibor.autolink.internal.EmailScanner emailScanner1 = new org.nibor.autolink.internal.EmailScanner(false);
        org.nibor.autolink.LinkSpan linkSpan5 = emailScanner1.scan((java.lang.CharSequence) "hi!", 1, 1);
        org.nibor.autolink.LinkSpan linkSpan9 = emailScanner1.scan((java.lang.CharSequence) "", (int) '#', (int) '#');
        org.nibor.autolink.LinkSpan linkSpan13 = emailScanner1.scan((java.lang.CharSequence) "hi!", (-1), (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.nibor.autolink.LinkSpan linkSpan17 = emailScanner1.scan((java.lang.CharSequence) "hi!", (int) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 51");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(linkSpan5);
        org.junit.Assert.assertNull(linkSpan9);
        org.junit.Assert.assertNull(linkSpan13);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        org.nibor.autolink.internal.EmailScanner emailScanner1 = new org.nibor.autolink.internal.EmailScanner(true);
        org.nibor.autolink.LinkSpan linkSpan5 = emailScanner1.scan((java.lang.CharSequence) "hi!", 1, 1);
        org.nibor.autolink.LinkSpan linkSpan9 = emailScanner1.scan((java.lang.CharSequence) "", (int) (byte) -1, (int) (short) 1);
        org.nibor.autolink.LinkSpan linkSpan13 = emailScanner1.scan((java.lang.CharSequence) "hi!", (int) '#', (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.nibor.autolink.LinkSpan linkSpan17 = emailScanner1.scan((java.lang.CharSequence) "hi!", (int) (short) 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(linkSpan5);
        org.junit.Assert.assertNull(linkSpan9);
        org.junit.Assert.assertNull(linkSpan13);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        org.nibor.autolink.internal.EmailScanner emailScanner1 = new org.nibor.autolink.internal.EmailScanner(false);
        org.nibor.autolink.LinkSpan linkSpan5 = emailScanner1.scan((java.lang.CharSequence) "", (int) (short) 100, 100);
        org.nibor.autolink.LinkSpan linkSpan9 = emailScanner1.scan((java.lang.CharSequence) "", 10, (int) 'a');
        org.nibor.autolink.LinkSpan linkSpan13 = emailScanner1.scan((java.lang.CharSequence) "", (int) ' ', (int) '4');
        org.nibor.autolink.LinkSpan linkSpan17 = emailScanner1.scan((java.lang.CharSequence) "", (int) (short) 100, 100);
        org.nibor.autolink.LinkSpan linkSpan21 = emailScanner1.scan((java.lang.CharSequence) "", (int) (byte) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.nibor.autolink.LinkSpan linkSpan25 = emailScanner1.scan((java.lang.CharSequence) "", (int) (short) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(linkSpan5);
        org.junit.Assert.assertNull(linkSpan9);
        org.junit.Assert.assertNull(linkSpan13);
        org.junit.Assert.assertNull(linkSpan17);
        org.junit.Assert.assertNull(linkSpan21);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        org.nibor.autolink.internal.EmailScanner emailScanner1 = new org.nibor.autolink.internal.EmailScanner(false);
        org.nibor.autolink.LinkSpan linkSpan5 = emailScanner1.scan((java.lang.CharSequence) "hi!", (int) (byte) 0, (int) (short) 100);
        org.nibor.autolink.LinkSpan linkSpan9 = emailScanner1.scan((java.lang.CharSequence) "hi!", (int) (short) 10, (int) ' ');
        org.nibor.autolink.LinkSpan linkSpan13 = emailScanner1.scan((java.lang.CharSequence) "hi!", (int) (short) 0, (int) (short) 0);
        org.junit.Assert.assertNull(linkSpan5);
        org.junit.Assert.assertNull(linkSpan9);
        org.junit.Assert.assertNull(linkSpan13);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        org.nibor.autolink.internal.EmailScanner emailScanner1 = new org.nibor.autolink.internal.EmailScanner(false);
        org.nibor.autolink.LinkSpan linkSpan5 = emailScanner1.scan((java.lang.CharSequence) "hi!", (int) (byte) 0, (int) (short) 100);
        org.nibor.autolink.LinkSpan linkSpan9 = emailScanner1.scan((java.lang.CharSequence) "hi!", (int) (short) 10, (int) ' ');
        org.nibor.autolink.LinkSpan linkSpan13 = emailScanner1.scan((java.lang.CharSequence) "hi!", (int) (byte) 0, 10);
        org.nibor.autolink.LinkSpan linkSpan17 = emailScanner1.scan((java.lang.CharSequence) "hi!", (int) (byte) -1, (int) ' ');
        java.lang.Class<?> wildcardClass18 = emailScanner1.getClass();
        org.junit.Assert.assertNull(linkSpan5);
        org.junit.Assert.assertNull(linkSpan9);
        org.junit.Assert.assertNull(linkSpan13);
        org.junit.Assert.assertNull(linkSpan17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        org.nibor.autolink.internal.EmailScanner emailScanner1 = new org.nibor.autolink.internal.EmailScanner(false);
        org.nibor.autolink.LinkSpan linkSpan5 = emailScanner1.scan((java.lang.CharSequence) "", (int) (short) 100, 100);
        org.nibor.autolink.LinkSpan linkSpan9 = emailScanner1.scan((java.lang.CharSequence) "", 10, (int) 'a');
        org.nibor.autolink.LinkSpan linkSpan13 = emailScanner1.scan((java.lang.CharSequence) "hi!", (int) (byte) 1, (int) (short) 100);
        org.nibor.autolink.LinkSpan linkSpan17 = emailScanner1.scan((java.lang.CharSequence) "", (int) (byte) 0, 1);
        java.lang.Class<?> wildcardClass18 = emailScanner1.getClass();
        org.junit.Assert.assertNull(linkSpan5);
        org.junit.Assert.assertNull(linkSpan9);
        org.junit.Assert.assertNull(linkSpan13);
        org.junit.Assert.assertNull(linkSpan17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        org.nibor.autolink.internal.EmailScanner emailScanner1 = new org.nibor.autolink.internal.EmailScanner(false);
        org.nibor.autolink.LinkSpan linkSpan5 = emailScanner1.scan((java.lang.CharSequence) "", (int) (short) 100, 100);
        org.nibor.autolink.LinkSpan linkSpan9 = emailScanner1.scan((java.lang.CharSequence) "", 10, (int) 'a');
        org.nibor.autolink.LinkSpan linkSpan13 = emailScanner1.scan((java.lang.CharSequence) "", (int) ' ', (int) '4');
        org.nibor.autolink.LinkSpan linkSpan17 = emailScanner1.scan((java.lang.CharSequence) "", (int) (short) 100, 100);
        org.nibor.autolink.LinkSpan linkSpan21 = emailScanner1.scan((java.lang.CharSequence) "", (int) (byte) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.nibor.autolink.LinkSpan linkSpan25 = emailScanner1.scan((java.lang.CharSequence) "hi!", (int) '#', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 34");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(linkSpan5);
        org.junit.Assert.assertNull(linkSpan9);
        org.junit.Assert.assertNull(linkSpan13);
        org.junit.Assert.assertNull(linkSpan17);
        org.junit.Assert.assertNull(linkSpan21);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        org.nibor.autolink.internal.EmailScanner emailScanner1 = new org.nibor.autolink.internal.EmailScanner(false);
        org.nibor.autolink.LinkSpan linkSpan5 = emailScanner1.scan((java.lang.CharSequence) "", (int) (short) 100, 100);
        org.nibor.autolink.LinkSpan linkSpan9 = emailScanner1.scan((java.lang.CharSequence) "", 10, (int) 'a');
        org.nibor.autolink.LinkSpan linkSpan13 = emailScanner1.scan((java.lang.CharSequence) "", (int) ' ', (int) '4');
        org.nibor.autolink.LinkSpan linkSpan17 = emailScanner1.scan((java.lang.CharSequence) "", (int) (short) 100, 100);
        org.nibor.autolink.LinkSpan linkSpan21 = emailScanner1.scan((java.lang.CharSequence) "", 1, 10);
        java.lang.Class<?> wildcardClass22 = emailScanner1.getClass();
        org.junit.Assert.assertNull(linkSpan5);
        org.junit.Assert.assertNull(linkSpan9);
        org.junit.Assert.assertNull(linkSpan13);
        org.junit.Assert.assertNull(linkSpan17);
        org.junit.Assert.assertNull(linkSpan21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        org.nibor.autolink.internal.EmailScanner emailScanner1 = new org.nibor.autolink.internal.EmailScanner(false);
        org.nibor.autolink.LinkSpan linkSpan5 = emailScanner1.scan((java.lang.CharSequence) "hi!", (int) (byte) 0, (int) (short) 100);
        org.nibor.autolink.LinkSpan linkSpan9 = emailScanner1.scan((java.lang.CharSequence) "hi!", (int) (short) 10, (int) ' ');
        org.nibor.autolink.LinkSpan linkSpan13 = emailScanner1.scan((java.lang.CharSequence) "hi!", (int) (byte) 0, 10);
        org.nibor.autolink.LinkSpan linkSpan17 = emailScanner1.scan((java.lang.CharSequence) "hi!", (int) (byte) -1, (int) ' ');
        org.nibor.autolink.LinkSpan linkSpan21 = emailScanner1.scan((java.lang.CharSequence) "hi!", (int) (short) 10, (int) '#');
        org.junit.Assert.assertNull(linkSpan5);
        org.junit.Assert.assertNull(linkSpan9);
        org.junit.Assert.assertNull(linkSpan13);
        org.junit.Assert.assertNull(linkSpan17);
        org.junit.Assert.assertNull(linkSpan21);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        org.nibor.autolink.internal.EmailScanner emailScanner1 = new org.nibor.autolink.internal.EmailScanner(true);
        org.nibor.autolink.LinkSpan linkSpan5 = emailScanner1.scan((java.lang.CharSequence) "hi!", 1, 1);
        org.nibor.autolink.LinkSpan linkSpan9 = emailScanner1.scan((java.lang.CharSequence) "hi!", 0, (int) ' ');
        org.nibor.autolink.LinkSpan linkSpan13 = emailScanner1.scan((java.lang.CharSequence) "", (int) (short) -1, 1);
        org.nibor.autolink.LinkSpan linkSpan17 = emailScanner1.scan((java.lang.CharSequence) "", (int) (short) -1, (int) (byte) 1);
        org.nibor.autolink.LinkSpan linkSpan21 = emailScanner1.scan((java.lang.CharSequence) "hi!", (int) (byte) 1, 10);
        org.junit.Assert.assertNull(linkSpan5);
        org.junit.Assert.assertNull(linkSpan9);
        org.junit.Assert.assertNull(linkSpan13);
        org.junit.Assert.assertNull(linkSpan17);
        org.junit.Assert.assertNull(linkSpan21);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        org.nibor.autolink.internal.EmailScanner emailScanner1 = new org.nibor.autolink.internal.EmailScanner(true);
        org.nibor.autolink.LinkSpan linkSpan5 = emailScanner1.scan((java.lang.CharSequence) "", (int) (short) -1, 10);
        org.nibor.autolink.LinkSpan linkSpan9 = emailScanner1.scan((java.lang.CharSequence) "hi!", 1, 100);
        java.lang.Class<?> wildcardClass10 = emailScanner1.getClass();
        org.junit.Assert.assertNull(linkSpan5);
        org.junit.Assert.assertNull(linkSpan9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }
}

