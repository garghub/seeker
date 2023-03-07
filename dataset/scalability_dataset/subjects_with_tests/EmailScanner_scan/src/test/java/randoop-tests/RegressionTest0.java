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
        org.nibor.autolink.internal.EmailScanner emailScanner1 = new org.nibor.autolink.internal.EmailScanner(true);
        java.lang.Class<?> wildcardClass2 = emailScanner1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
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
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        org.nibor.autolink.internal.EmailScanner emailScanner1 = new org.nibor.autolink.internal.EmailScanner(true);
        org.nibor.autolink.LinkSpan linkSpan5 = emailScanner1.scan((java.lang.CharSequence) "hi!", 1, 1);
        java.lang.Class<?> wildcardClass6 = emailScanner1.getClass();
        org.junit.Assert.assertNull(linkSpan5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
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
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
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
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        org.nibor.autolink.internal.EmailScanner emailScanner1 = new org.nibor.autolink.internal.EmailScanner(false);
        java.lang.Class<?> wildcardClass2 = emailScanner1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
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
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
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
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        org.nibor.autolink.internal.EmailScanner emailScanner1 = new org.nibor.autolink.internal.EmailScanner(true);
        org.nibor.autolink.LinkSpan linkSpan5 = emailScanner1.scan((java.lang.CharSequence) "hi!", 1, 1);
        org.nibor.autolink.LinkSpan linkSpan9 = emailScanner1.scan((java.lang.CharSequence) "", (-1), (int) (short) 0);
        java.lang.Class<?> wildcardClass10 = emailScanner1.getClass();
        org.junit.Assert.assertNull(linkSpan5);
        org.junit.Assert.assertNull(linkSpan9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
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
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
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
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
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
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        org.nibor.autolink.internal.EmailScanner emailScanner1 = new org.nibor.autolink.internal.EmailScanner(true);
        org.nibor.autolink.LinkSpan linkSpan5 = emailScanner1.scan((java.lang.CharSequence) "hi!", 1, 1);
        org.nibor.autolink.LinkSpan linkSpan9 = emailScanner1.scan((java.lang.CharSequence) "", (-1), (int) (short) 0);
        org.nibor.autolink.LinkSpan linkSpan13 = emailScanner1.scan((java.lang.CharSequence) "", 0, 100);
        org.junit.Assert.assertNull(linkSpan5);
        org.junit.Assert.assertNull(linkSpan9);
        org.junit.Assert.assertNull(linkSpan13);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
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
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        org.nibor.autolink.internal.EmailScanner emailScanner1 = new org.nibor.autolink.internal.EmailScanner(true);
        org.nibor.autolink.LinkSpan linkSpan5 = emailScanner1.scan((java.lang.CharSequence) "hi!", 1, 1);
        org.nibor.autolink.LinkSpan linkSpan9 = emailScanner1.scan((java.lang.CharSequence) "hi!", (int) (byte) 1, (int) '4');
        java.lang.Class<?> wildcardClass10 = emailScanner1.getClass();
        org.junit.Assert.assertNull(linkSpan5);
        org.junit.Assert.assertNull(linkSpan9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        org.nibor.autolink.internal.EmailScanner emailScanner1 = new org.nibor.autolink.internal.EmailScanner(true);
        org.nibor.autolink.LinkSpan linkSpan5 = emailScanner1.scan((java.lang.CharSequence) "hi!", 1, 1);
        org.nibor.autolink.LinkSpan linkSpan9 = emailScanner1.scan((java.lang.CharSequence) "", (int) (byte) -1, (int) (short) 1);
        org.junit.Assert.assertNull(linkSpan5);
        org.junit.Assert.assertNull(linkSpan9);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
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
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
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
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
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
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        org.nibor.autolink.internal.EmailScanner emailScanner1 = new org.nibor.autolink.internal.EmailScanner(false);
        org.nibor.autolink.LinkSpan linkSpan5 = emailScanner1.scan((java.lang.CharSequence) "", (int) (short) 100, 100);
        org.nibor.autolink.LinkSpan linkSpan9 = emailScanner1.scan((java.lang.CharSequence) "", 10, (int) 'a');
        java.lang.Class<?> wildcardClass10 = emailScanner1.getClass();
        org.junit.Assert.assertNull(linkSpan5);
        org.junit.Assert.assertNull(linkSpan9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        org.nibor.autolink.internal.EmailScanner emailScanner1 = new org.nibor.autolink.internal.EmailScanner(false);
        org.nibor.autolink.LinkSpan linkSpan5 = emailScanner1.scan((java.lang.CharSequence) "hi!", (int) (byte) 0, (int) (short) 100);
        java.lang.Class<?> wildcardClass6 = emailScanner1.getClass();
        org.junit.Assert.assertNull(linkSpan5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
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
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        org.nibor.autolink.internal.EmailScanner emailScanner1 = new org.nibor.autolink.internal.EmailScanner(true);
        org.nibor.autolink.LinkSpan linkSpan5 = emailScanner1.scan((java.lang.CharSequence) "hi!", 1, 1);
        org.nibor.autolink.LinkSpan linkSpan9 = emailScanner1.scan((java.lang.CharSequence) "hi!", 0, (int) ' ');
        java.lang.Class<?> wildcardClass10 = emailScanner1.getClass();
        org.junit.Assert.assertNull(linkSpan5);
        org.junit.Assert.assertNull(linkSpan9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }
}

