package testers;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MapTester0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test001");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable2 = strComparableMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test002");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable6 = strComparableMap0.item((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test003");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        boolean boolean3 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable5 = strComparableMap0.item((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test004");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        // The following exception was thrown during execution in test generation
        try {
            int int2 = strComparableMap0.remove((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test005");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        int int4 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", strComparable3);
        java.lang.Class<?> wildcardClass5 = strComparableMap0.getClass();
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test006");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        boolean boolean3 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable5 = strComparableMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test007");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int2 = strComparableMap0.count();
        boolean boolean4 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = strComparableMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test008");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int2 = strComparableMap0.count();
        int int3 = strComparableMap0.count();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable5 = strComparableMap0.item((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test009");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int2 = strComparableMap0.count();
        int int3 = strComparableMap0.count();
        java.lang.Class<?> wildcardClass4 = strComparableMap0.getClass();
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test010");
        examples.Map<java.lang.CharSequence, java.io.Serializable> charSequenceMap0 = new examples.Map<java.lang.CharSequence, java.io.Serializable>();
        java.lang.Class<?> wildcardClass1 = charSequenceMap0.getClass();
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test011");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int5 = strComparableMap0.count();
        boolean boolean7 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int9 = strComparableMap0.remove((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test012");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable4 = strComparableMap0.item((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test013");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass3 = strComparableMap0.getClass();
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test014");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = strComparableMap0.remove((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test015");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass5 = strComparableMap0.getClass();
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test016");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int2 = strComparableMap0.count();
        int int3 = strComparableMap0.count();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable5 = strComparableMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test017");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        boolean boolean3 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass4 = strComparableMap0.getClass();
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test018");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int2 = strComparableMap0.count();
        boolean boolean4 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable6 = strComparableMap0.item((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test019");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass6 = strComparableMap0.getClass();
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test020");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int4 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable9 = strComparableMap0.item(strComparable8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test021");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int2 = strComparableMap0.count();
        boolean boolean4 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass5 = strComparableMap0.getClass();
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test022");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int2 = strComparableMap0.count();
        boolean boolean4 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = strComparableMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test023");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int5 = strComparableMap0.count();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable7 = strComparableMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test024");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        boolean boolean3 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass7 = strComparableMap0.getClass();
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test025");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int5 = strComparableMap0.count();
        boolean boolean7 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int10 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass11 = strComparableMap0.getClass();
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test026");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int2 = strComparableMap0.count();
        int int5 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = strComparableMap0.remove(strComparable6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test027");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test028");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable9 = strComparableMap0.item((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test029");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        boolean boolean3 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int4 = strComparableMap0.count();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = strComparableMap0.remove((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test030");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int2 = strComparableMap0.count();
        boolean boolean4 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable9 = strComparableMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test031");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int5 = strComparableMap0.count();
        boolean boolean7 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable9 = strComparableMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test032");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int5 = strComparableMap0.count();
        boolean boolean7 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable9 = strComparableMap0.item(strComparable8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test033");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int5 = strComparableMap0.count();
        boolean boolean7 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int8 = strComparableMap0.count();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = strComparableMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test034");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int5 = strComparableMap0.count();
        boolean boolean7 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int8 = strComparableMap0.count();
        java.lang.Class<?> wildcardClass9 = strComparableMap0.getClass();
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test035");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean11 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int14 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass15 = strComparableMap0.getClass();
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test036");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int2 = strComparableMap0.count();
        int int5 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable6 = null;
        int int8 = strComparableMap0.extend(strComparable6, (java.lang.Comparable<java.lang.String>) "");
        int int10 = strComparableMap0.remove((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            int int12 = strComparableMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test037");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int4 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        int int8 = strComparableMap0.count();
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test038");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int11 = strComparableMap0.remove((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test039");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass8 = strComparableMap0.getClass();
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test040");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass10 = strComparableMap0.getClass();
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test041");
        examples.Map<java.lang.reflect.Type, java.lang.String> typeMap0 = new examples.Map<java.lang.reflect.Type, java.lang.String>();
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test042");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int4 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass5 = strComparableMap0.getClass();
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test043");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int2 = strComparableMap0.count();
        int int5 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable6 = null;
        int int8 = strComparableMap0.extend(strComparable6, (java.lang.Comparable<java.lang.String>) "");
        int int10 = strComparableMap0.remove((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable12 = strComparableMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test044");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int4 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        int int9 = strComparableMap0.remove((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass10 = strComparableMap0.getClass();
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test045");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        int int11 = strComparableMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass12 = strComparableMap0.getClass();
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test046");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int2 = strComparableMap0.count();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable4 = strComparableMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test047");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        boolean boolean3 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int4 = strComparableMap0.count();
        int int5 = strComparableMap0.count();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = strComparableMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test048");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int2 = strComparableMap0.count();
        int int5 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable9 = strComparableMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test049");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable9 = strComparableMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test050");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        int int8 = strComparableMap0.count();
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableMap0.item((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass11 = strComparable10.getClass();
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test051");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable6 = strComparableMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test052");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test053");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        java.lang.Class<?> wildcardClass2 = strComparableMap0.getClass();
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test054");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int2 = strComparableMap0.count();
        int int5 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable11 = strComparableMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test055");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        boolean boolean3 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableMap0.count();
        boolean boolean9 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            int int11 = strComparableMap0.remove((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test056");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        int int4 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", strComparable3);
        int int5 = strComparableMap0.count();
        int int8 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            int int10 = strComparableMap0.remove((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test057");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        boolean boolean3 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableMap0.count();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass10 = strComparable9.getClass();
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test058");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int4 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean8 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass9 = strComparableMap0.getClass();
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test059");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        boolean boolean3 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int9 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = strComparableMap0.remove(strComparable10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test060");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int2 = strComparableMap0.count();
        boolean boolean4 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable9 = strComparableMap0.item((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test061");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int4 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        int int9 = strComparableMap0.remove((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        boolean boolean11 = strComparableMap0.hasKey(strComparable10);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test062");
        examples.Map<examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>, java.lang.CharSequence> strComparableMapMap0 = new examples.Map<examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>, java.lang.CharSequence>();
        java.lang.Class<?> wildcardClass1 = strComparableMapMap0.getClass();
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test063");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int2 = strComparableMap0.count();
        boolean boolean4 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int9 = strComparableMap0.remove((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test064");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int2 = strComparableMap0.count();
        boolean boolean4 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int8 = strComparableMap0.count();
        java.lang.Class<?> wildcardClass9 = strComparableMap0.getClass();
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test065");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int2 = strComparableMap0.count();
        int int3 = strComparableMap0.count();
        int int4 = strComparableMap0.count();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = strComparableMap0.remove((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test066");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int5 = strComparableMap0.count();
        boolean boolean7 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            int int11 = strComparableMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test067");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int4 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        int int9 = strComparableMap0.remove((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable11 = strComparableMap0.item((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test068");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int5 = strComparableMap0.count();
        boolean boolean7 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int8 = strComparableMap0.count();
        int int11 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test069");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean8 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean10 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass11 = strComparableMap0.getClass();
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test070");
        examples.Map<java.lang.Object, java.lang.String> objMap0 = new examples.Map<java.lang.Object, java.lang.String>();
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test071");
        examples.Map<java.lang.Object, examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>> objMap0 = new examples.Map<java.lang.Object, examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>>();
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test072");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int5 = strComparableMap0.count();
        int int8 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean10 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable12 = strComparableMap0.item((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test073");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int2 = strComparableMap0.count();
        int int3 = strComparableMap0.count();
        boolean boolean5 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable7 = strComparableMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test074");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int2 = strComparableMap0.count();
        int int5 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        int int14 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test075");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int2 = strComparableMap0.count();
        boolean boolean4 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean6 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable8 = strComparableMap0.item((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test076");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        boolean boolean3 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableMap0.count();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        int int12 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable14 = strComparableMap0.item(strComparable13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test077");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        int int8 = strComparableMap0.count();
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableMap0.item((java.lang.Comparable<java.lang.String>) "");
        boolean boolean12 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test078");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            int int9 = strComparableMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test079");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int2 = strComparableMap0.count();
        int int5 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable6 = null;
        int int8 = strComparableMap0.extend(strComparable6, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass9 = strComparableMap0.getClass();
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test080");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        boolean boolean3 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int4 = strComparableMap0.count();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = strComparableMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test081");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        int int4 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", strComparable3);
        int int5 = strComparableMap0.count();
        java.lang.Comparable<java.lang.String> strComparable6 = null;
        boolean boolean7 = strComparableMap0.hasKey(strComparable6);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test082");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int2 = strComparableMap0.count();
        boolean boolean4 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean6 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int9 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean11 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean13 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable15 = strComparableMap0.item((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test083");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int4 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean8 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int10 = strComparableMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test084");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int2 = strComparableMap0.count();
        int int5 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        int int8 = strComparableMap0.count();
        int int9 = strComparableMap0.count();
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test085");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int2 = strComparableMap0.count();
        int int5 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass10 = strComparableMap0.getClass();
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test086");
        examples.Map<java.lang.Object, java.lang.Comparable<java.lang.String>> objMap0 = new examples.Map<java.lang.Object, java.lang.Comparable<java.lang.String>>();
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test087");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int4 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass7 = strComparableMap0.getClass();
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test088");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable3 = strComparableMap0.item((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test089");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int2 = strComparableMap0.count();
        boolean boolean4 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int8 = strComparableMap0.count();
        int int9 = strComparableMap0.count();
        java.lang.Class<?> wildcardClass10 = strComparableMap0.getClass();
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test090");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int5 = strComparableMap0.count();
        boolean boolean7 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int8 = strComparableMap0.count();
        boolean boolean10 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            int int12 = strComparableMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test091");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int3 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean8 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass9 = strComparableMap0.getClass();
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test092");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int2 = strComparableMap0.count();
        boolean boolean4 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int8 = strComparableMap0.count();
        boolean boolean10 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test093");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean8 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable10 = strComparableMap0.item((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test094");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        int int11 = strComparableMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
        int int12 = strComparableMap0.count();
        // The following exception was thrown during execution in test generation
        try {
            int int14 = strComparableMap0.remove((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test095");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int2 = strComparableMap0.count();
        boolean boolean4 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass8 = strComparableMap0.getClass();
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test096");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        boolean boolean3 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableMap0.count();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        int int10 = strComparableMap0.count();
        int int11 = strComparableMap0.count();
        int int12 = strComparableMap0.count();
        java.lang.Comparable<java.lang.String> strComparable13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable14 = strComparableMap0.item(strComparable13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test097");
        examples.Map<examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>, java.lang.reflect.AnnotatedElement> strComparableMapMap0 = new examples.Map<examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>, java.lang.reflect.AnnotatedElement>();
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test098");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int5 = strComparableMap0.count();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable7 = strComparableMap0.item((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test099");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        boolean boolean3 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int4 = strComparableMap0.count();
        int int5 = strComparableMap0.count();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = strComparableMap0.remove((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test100");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        boolean boolean3 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int4 = strComparableMap0.count();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable6 = strComparableMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test101");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        int int11 = strComparableMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable13 = strComparableMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test102");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int3 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable8 = strComparableMap0.item(strComparable7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test103");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int5 = strComparableMap0.count();
        boolean boolean7 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean11 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test104");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int2 = strComparableMap0.count();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable4 = strComparableMap0.item((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test105");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int2 = strComparableMap0.count();
        int int5 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableMap0.count();
        boolean boolean8 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean10 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int11 = strComparableMap0.count();
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test106");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int2 = strComparableMap0.count();
        int int3 = strComparableMap0.count();
        int int4 = strComparableMap0.count();
        int int5 = strComparableMap0.count();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = strComparableMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test107");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int2 = strComparableMap0.count();
        int int5 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableMap0.count();
        boolean boolean8 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test108");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        boolean boolean3 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableMap0.count();
        boolean boolean9 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass10 = strComparableMap0.getClass();
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test109");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int4 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test110");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int2 = strComparableMap0.count();
        boolean boolean4 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass8 = strComparableMap0.getClass();
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test111");
        examples.Map<java.lang.reflect.GenericDeclaration, java.lang.String> genericDeclarationMap0 = new examples.Map<java.lang.reflect.GenericDeclaration, java.lang.String>();
        java.lang.Class<?> wildcardClass1 = genericDeclarationMap0.getClass();
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test112");
        examples.Map<java.lang.Class<?>, java.lang.CharSequence> wildcardClassMap0 = new examples.Map<java.lang.Class<?>, java.lang.CharSequence>();
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test113");
        examples.Map<java.lang.reflect.GenericDeclaration, java.lang.Class<?>> genericDeclarationMap0 = new examples.Map<java.lang.reflect.GenericDeclaration, java.lang.Class<?>>();
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test114");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int2 = strComparableMap0.count();
        int int5 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        int int13 = strComparableMap0.remove((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable14 = null;
        boolean boolean15 = strComparableMap0.hasValue(strComparable14);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test115");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int2 = strComparableMap0.count();
        int int5 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        int int8 = strComparableMap0.count();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable10 = strComparableMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test116");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int2 = strComparableMap0.count();
        int int5 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableMap0.remove((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int11 = strComparableMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test117");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int4 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableMap0.count();
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test118");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        int int4 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", strComparable3);
        int int7 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean13 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test119");
        examples.Map<java.lang.Class<?>, java.lang.Object> wildcardClassMap0 = new examples.Map<java.lang.Class<?>, java.lang.Object>();
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test120");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int2 = strComparableMap0.count();
        int int5 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int7 = strComparableMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test121");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int5 = strComparableMap0.count();
        boolean boolean7 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable9 = strComparableMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test122");
        examples.Map<examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>, java.io.Serializable> strComparableMapMap0 = new examples.Map<examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>, java.io.Serializable>();
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test123");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int2 = strComparableMap0.count();
        int int5 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableMap0.count();
        boolean boolean8 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        int int9 = strComparableMap0.count();
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test124");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int3 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable7 = null;
        boolean boolean8 = strComparableMap0.hasValue(strComparable7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable10 = strComparableMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test125");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int2 = strComparableMap0.count();
        int int5 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable6 = null;
        int int8 = strComparableMap0.extend(strComparable6, (java.lang.Comparable<java.lang.String>) "");
        int int10 = strComparableMap0.remove((java.lang.Comparable<java.lang.String>) "");
        int int11 = strComparableMap0.count();
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test126");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int2 = strComparableMap0.count();
        int int5 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableMap0.count();
        java.lang.Class<?> wildcardClass7 = strComparableMap0.getClass();
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test127");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int2 = strComparableMap0.count();
        int int5 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableMap0.item((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            int int9 = strComparableMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test128");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int2 = strComparableMap0.count();
        int int3 = strComparableMap0.count();
        boolean boolean5 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean7 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass10 = strComparableMap0.getClass();
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test129");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int2 = strComparableMap0.count();
        int int3 = strComparableMap0.count();
        int int4 = strComparableMap0.count();
        int int5 = strComparableMap0.count();
        int int8 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = strComparableMap0.remove(strComparable9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test130");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int2 = strComparableMap0.count();
        int int5 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableMap0.remove((java.lang.Comparable<java.lang.String>) "");
        int int8 = strComparableMap0.count();
        java.lang.Class<?> wildcardClass9 = strComparableMap0.getClass();
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test131");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int5 = strComparableMap0.count();
        boolean boolean7 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int10 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        int int12 = strComparableMap0.remove((java.lang.Comparable<java.lang.String>) "");
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test132");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int2 = strComparableMap0.count();
        int int5 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable6 = null;
        int int8 = strComparableMap0.extend(strComparable6, (java.lang.Comparable<java.lang.String>) "");
        int int10 = strComparableMap0.remove((java.lang.Comparable<java.lang.String>) "");
        boolean boolean12 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable14 = strComparableMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test133");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass5 = strComparableMap0.getClass();
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test134");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int2 = strComparableMap0.count();
        int int5 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableMap0.count();
        boolean boolean8 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean10 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean12 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test135");
        examples.Map<java.lang.Object, java.lang.Class<?>> objMap0 = new examples.Map<java.lang.Object, java.lang.Class<?>>();
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test136");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        boolean boolean3 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableMap0.count();
        boolean boolean9 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int12 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test137");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int2 = strComparableMap0.count();
        int int5 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        int int13 = strComparableMap0.remove((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable14 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int15 = strComparableMap0.remove(strComparable14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test138");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int2 = strComparableMap0.count();
        int int3 = strComparableMap0.count();
        boolean boolean5 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean7 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable9 = strComparableMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test139");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int3 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMap0.count();
        java.lang.Class<?> wildcardClass8 = strComparableMap0.getClass();
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test140");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int5 = strComparableMap0.count();
        boolean boolean7 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable11 = strComparableMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test141");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int5 = strComparableMap0.count();
        boolean boolean7 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test142");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Object> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Object>();
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test143");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean8 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int10 = strComparableMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test144");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int2 = strComparableMap0.count();
        // The following exception was thrown during execution in test generation
        try {
            int int4 = strComparableMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test145");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int5 = strComparableMap0.count();
        boolean boolean7 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int8 = strComparableMap0.count();
        boolean boolean10 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test146");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        boolean boolean3 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableMap0.count();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        int int10 = strComparableMap0.count();
        int int11 = strComparableMap0.count();
        int int12 = strComparableMap0.count();
        boolean boolean14 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test147");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        int int4 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", strComparable3);
        int int7 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int12 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test148");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int2 = strComparableMap0.count();
        boolean boolean4 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        int int9 = strComparableMap0.remove((java.lang.Comparable<java.lang.String>) "");
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test149");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int4 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        int int13 = strComparableMap0.remove((java.lang.Comparable<java.lang.String>) "");
        int int14 = strComparableMap0.count();
        java.lang.Class<?> wildcardClass15 = strComparableMap0.getClass();
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test150");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int2 = strComparableMap0.count();
        boolean boolean4 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test151");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int2 = strComparableMap0.count();
        int int5 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int10 = strComparableMap0.count();
        int int13 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean15 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test152");
        examples.Map<examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>, java.lang.Comparable<java.lang.String>> strComparableMapMap0 = new examples.Map<examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>, java.lang.Comparable<java.lang.String>>();
        java.lang.Class<?> wildcardClass1 = strComparableMapMap0.getClass();
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test153");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int2 = strComparableMap0.count();
        int int5 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test154");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableMap0.count();
        int int10 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test155");
        examples.Map<java.lang.String, java.lang.CharSequence> strMap0 = new examples.Map<java.lang.String, java.lang.CharSequence>();
        java.lang.Class<?> wildcardClass1 = strMap0.getClass();
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test156");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int2 = strComparableMap0.count();
        int int5 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int12 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean14 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test157");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int4 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        int int9 = strComparableMap0.remove((java.lang.Comparable<java.lang.String>) "");
        int int10 = strComparableMap0.count();
        int int11 = strComparableMap0.count();
        int int12 = strComparableMap0.count();
        int int13 = strComparableMap0.count();
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test158");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int4 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean8 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean10 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int11 = strComparableMap0.count();
        java.lang.Class<?> wildcardClass12 = strComparableMap0.getClass();
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test159");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int2 = strComparableMap0.count();
        int int5 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int12 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int14 = strComparableMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test160");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int4 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean8 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int11 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean13 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean15 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable17 = strComparableMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        int int19 = strComparableMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int21 = strComparableMap0.remove((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test161");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableMap0.count();
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test162");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        int int4 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", strComparable3);
        int int5 = strComparableMap0.count();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable7 = strComparableMap0.item((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test163");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int5 = strComparableMap0.count();
        boolean boolean7 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            int int9 = strComparableMap0.remove((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test164");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable7 = strComparableMap0.item((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test165");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int4 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        int int9 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test166");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        int int10 = strComparableMap0.count();
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test167");
        examples.Map<java.lang.reflect.Type, java.lang.Comparable<java.lang.String>> typeMap0 = new examples.Map<java.lang.reflect.Type, java.lang.Comparable<java.lang.String>>();
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test168");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int2 = strComparableMap0.count();
        int int5 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        int int13 = strComparableMap0.remove((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable15 = strComparableMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test169");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int5 = strComparableMap0.count();
        boolean boolean7 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean11 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test170");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int2 = strComparableMap0.count();
        int int5 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int12 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int13 = strComparableMap0.count();
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test171");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int4 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean8 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int9 = strComparableMap0.count();
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test172");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int2 = strComparableMap0.count();
        int int5 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean13 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int14 = strComparableMap0.count();
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test173");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int3 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean8 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int9 = strComparableMap0.count();
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test174");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int2 = strComparableMap0.count();
        int int5 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableMap0.remove((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test175");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int4 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMap0.count();
        java.lang.Class<?> wildcardClass8 = strComparableMap0.getClass();
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test176");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int2 = strComparableMap0.count();
        int int3 = strComparableMap0.count();
        boolean boolean5 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean7 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            int int13 = strComparableMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test177");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableMap0.count();
        java.lang.Comparable<java.lang.String> strComparable8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = strComparableMap0.remove(strComparable8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test178");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int8 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass9 = strComparableMap0.getClass();
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test179");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int2 = strComparableMap0.count();
        boolean boolean4 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean6 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int9 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean11 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean13 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int16 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean18 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test180");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int8 = strComparableMap0.count();
        int int11 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test181");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int2 = strComparableMap0.count();
        int int5 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int12 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean14 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test182");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int4 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean8 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int11 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean13 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int16 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test183");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int4 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        int int9 = strComparableMap0.remove((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        int int12 = strComparableMap0.extend(strComparable10, (java.lang.Comparable<java.lang.String>) "");
        int int15 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test184");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean8 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            int int10 = strComparableMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test185");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = null;
        int int10 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", strComparable9);
        java.lang.Class<?> wildcardClass11 = strComparableMap0.getClass();
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test186");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int2 = strComparableMap0.count();
        int int3 = strComparableMap0.count();
        boolean boolean5 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean7 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable11 = strComparableMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test187");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int2 = strComparableMap0.count();
        int int3 = strComparableMap0.count();
        int int4 = strComparableMap0.count();
        int int5 = strComparableMap0.count();
        int int8 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableMap0.item((java.lang.Comparable<java.lang.String>) "");
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test188");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int2 = strComparableMap0.count();
        boolean boolean4 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int8 = strComparableMap0.count();
        int int11 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable13 = strComparableMap0.item((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test189");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean6 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test190");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int4 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean8 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean10 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int11 = strComparableMap0.count();
        int int12 = strComparableMap0.count();
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test191");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int3 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int5 = strComparableMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test192");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int2 = strComparableMap0.count();
        int int5 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable9 = strComparableMap0.item(strComparable8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test193");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int2 = strComparableMap0.count();
        int int5 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int11 = strComparableMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test194");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int2 = strComparableMap0.count();
        int int5 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        int int8 = strComparableMap0.count();
        int int11 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable13 = strComparableMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test195");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int2 = strComparableMap0.count();
        boolean boolean4 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int8 = strComparableMap0.count();
        int int9 = strComparableMap0.count();
        boolean boolean11 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test196");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int5 = strComparableMap0.count();
        int int8 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean10 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean12 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test197");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int4 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        int int13 = strComparableMap0.remove((java.lang.Comparable<java.lang.String>) "");
        boolean boolean15 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass16 = strComparableMap0.getClass();
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test198");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        boolean boolean3 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int9 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int14 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test199");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean11 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int14 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        int int17 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable19 = null;
        int int20 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", strComparable19);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test200");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int2 = strComparableMap0.count();
        int int5 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        int int13 = strComparableMap0.remove((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable14 = null;
        boolean boolean15 = strComparableMap0.hasKey(strComparable14);
        int int18 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test201");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int12 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        int int17 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test202");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int4 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable11 = strComparableMap0.item(strComparable10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test203");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int12 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int16 = strComparableMap0.remove((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test204");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int2 = strComparableMap0.count();
        boolean boolean4 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test205");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int4 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean8 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int9 = strComparableMap0.count();
        java.lang.Class<?> wildcardClass10 = strComparableMap0.getClass();
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test206");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int4 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        int int10 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int11 = strComparableMap0.count();
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test207");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean11 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int14 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        int int16 = strComparableMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test208");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int2 = strComparableMap0.count();
        int int5 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable6 = null;
        int int8 = strComparableMap0.extend(strComparable6, (java.lang.Comparable<java.lang.String>) "");
        boolean boolean10 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test209");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int2 = strComparableMap0.count();
        int int5 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test210");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        boolean boolean3 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableMap0.count();
        boolean boolean9 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass10 = strComparableMap0.getClass();
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test211");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int2 = strComparableMap0.count();
        int int5 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableMap0.remove((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass8 = strComparableMap0.getClass();
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test212");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        int int4 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", strComparable3);
        int int7 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int8 = strComparableMap0.count();
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test213");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int4 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        int int13 = strComparableMap0.remove((java.lang.Comparable<java.lang.String>) "");
        int int14 = strComparableMap0.count();
        int int16 = strComparableMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test214");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int3 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMap0.count();
        int int10 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test215");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int4 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        int int9 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableMap0.item((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass12 = strComparableMap0.getClass();
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test216");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int12 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass15 = strComparable14.getClass();
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test217");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int2 = strComparableMap0.count();
        int int5 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean13 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableMap0.item((java.lang.Comparable<java.lang.String>) "");
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test218");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int2 = strComparableMap0.count();
        int int5 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass10 = strComparableMap0.getClass();
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test219");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int2 = strComparableMap0.count();
        int int5 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableMap0.item((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableMap0.item((java.lang.Comparable<java.lang.String>) "");
        int int11 = strComparableMap0.remove((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable13 = strComparableMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test220");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean11 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int14 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        int int17 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int18 = strComparableMap0.count();
        int int20 = strComparableMap0.remove((java.lang.Comparable<java.lang.String>) "");
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test221");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int2 = strComparableMap0.count();
        int int5 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean13 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean15 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test222");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableMap0.item((java.lang.Comparable<java.lang.String>) "");
        boolean boolean11 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test223");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        int int11 = strComparableMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean13 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test224");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.String>();
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test225");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int2 = strComparableMap0.count();
        int int5 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableMap0.count();
        boolean boolean8 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int9 = strComparableMap0.count();
        int int10 = strComparableMap0.count();
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test226");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int4 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean13 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test227");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int2 = strComparableMap0.count();
        int int5 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableMap0.count();
        boolean boolean8 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean10 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test228");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        boolean boolean3 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableMap0.count();
        boolean boolean9 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable11 = strComparableMap0.item((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test229");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int2 = strComparableMap0.count();
        int int3 = strComparableMap0.count();
        boolean boolean5 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean7 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int11 = strComparableMap0.remove((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test230");
        examples.Map<java.lang.reflect.GenericDeclaration, java.io.Serializable> genericDeclarationMap0 = new examples.Map<java.lang.reflect.GenericDeclaration, java.io.Serializable>();
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test231");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int4 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean13 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int14 = strComparableMap0.count();
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test232");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int2 = strComparableMap0.count();
        int int3 = strComparableMap0.count();
        boolean boolean5 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean7 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test233");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int4 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        int int10 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int12 = strComparableMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int14 = strComparableMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test234");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableMap0.item((java.lang.Comparable<java.lang.String>) "");
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test235");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int2 = strComparableMap0.count();
        boolean boolean4 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test236");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int2 = strComparableMap0.count();
        int int5 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable6 = null;
        int int8 = strComparableMap0.extend(strComparable6, (java.lang.Comparable<java.lang.String>) "");
        int int9 = strComparableMap0.count();
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test237");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int4 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean8 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test238");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int10 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int11 = strComparableMap0.count();
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test239");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int2 = strComparableMap0.count();
        int int5 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableMap0.item((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable9 = strComparableMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test240");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        boolean boolean3 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableMap0.count();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        int int10 = strComparableMap0.count();
        int int11 = strComparableMap0.count();
        int int12 = strComparableMap0.count();
        java.lang.Class<?> wildcardClass13 = strComparableMap0.getClass();
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test241");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean8 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean10 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test242");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int2 = strComparableMap0.count();
        int int5 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableMap0.item((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableMap0.item((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            int int11 = strComparableMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test243");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass10 = strComparableMap0.getClass();
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test244");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int5 = strComparableMap0.count();
        boolean boolean7 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int8 = strComparableMap0.count();
        boolean boolean10 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        int int11 = strComparableMap0.count();
        int int12 = strComparableMap0.count();
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test245");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int4 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        int int13 = strComparableMap0.remove((java.lang.Comparable<java.lang.String>) "");
        int int14 = strComparableMap0.count();
        boolean boolean16 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int17 = strComparableMap0.count();
        boolean boolean19 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test246");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int2 = strComparableMap0.count();
        boolean boolean4 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass10 = strComparableMap0.getClass();
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test247");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int4 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        int int9 = strComparableMap0.remove((java.lang.Comparable<java.lang.String>) "");
        int int10 = strComparableMap0.count();
        int int11 = strComparableMap0.count();
        int int12 = strComparableMap0.count();
        int int15 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test248");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int4 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean8 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int11 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean13 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean15 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable17 = strComparableMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        int int19 = strComparableMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int21 = strComparableMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test249");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int2 = strComparableMap0.count();
        boolean boolean4 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int8 = strComparableMap0.count();
        int int11 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean13 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass14 = strComparableMap0.getClass();
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test250");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int2 = strComparableMap0.count();
        int int3 = strComparableMap0.count();
        int int4 = strComparableMap0.count();
        int int7 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test251");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int4 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean13 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int16 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test252");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int8 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean10 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean12 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test253");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean8 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean10 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test254");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean8 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean10 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean12 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test255");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            int int9 = strComparableMap0.remove((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test256");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean11 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int14 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable16 = strComparableMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test257");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        int int4 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", strComparable3);
        int int5 = strComparableMap0.count();
        int int8 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable10 = strComparableMap0.item((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test258");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean11 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean13 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int16 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int17 = strComparableMap0.count();
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test259");
        examples.Map<java.lang.reflect.AnnotatedElement, java.lang.String> annotatedElementMap0 = new examples.Map<java.lang.reflect.AnnotatedElement, java.lang.String>();
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test260");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int8 = strComparableMap0.count();
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test261");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        boolean boolean3 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test262");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int4 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean8 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        int int11 = strComparableMap0.count();
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test263");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int12 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean14 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test264");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int4 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        int int9 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int10 = strComparableMap0.count();
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test265");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        boolean boolean3 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableMap0.count();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int13 = strComparableMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable15 = strComparableMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test266");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int2 = strComparableMap0.count();
        int int5 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableMap0.item((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test267");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int4 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        int int13 = strComparableMap0.remove((java.lang.Comparable<java.lang.String>) "");
        int int14 = strComparableMap0.count();
        boolean boolean16 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean18 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test268");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int2 = strComparableMap0.count();
        boolean boolean4 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int8 = strComparableMap0.count();
        int int10 = strComparableMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test269");
        examples.Map<java.lang.String, java.io.Serializable> strMap0 = new examples.Map<java.lang.String, java.io.Serializable>();
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test270");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int2 = strComparableMap0.count();
        boolean boolean4 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int8 = strComparableMap0.count();
        int int9 = strComparableMap0.count();
        int int10 = strComparableMap0.count();
        boolean boolean12 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        int int13 = strComparableMap0.count();
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test271");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        boolean boolean3 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableMap0.count();
        boolean boolean9 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int12 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test272");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int2 = strComparableMap0.count();
        boolean boolean4 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int8 = strComparableMap0.count();
        int int9 = strComparableMap0.count();
        int int10 = strComparableMap0.count();
        int int11 = strComparableMap0.count();
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test273");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int11 = strComparableMap0.remove((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test274");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int4 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean13 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int15 = strComparableMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test275");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int4 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int10 = strComparableMap0.count();
        int int12 = strComparableMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean14 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test276");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int4 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        int int9 = strComparableMap0.remove((java.lang.Comparable<java.lang.String>) "");
        int int10 = strComparableMap0.count();
        int int11 = strComparableMap0.count();
        int int12 = strComparableMap0.count();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable14 = strComparableMap0.item((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test277");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int4 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean8 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        int int11 = strComparableMap0.count();
        boolean boolean13 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test278");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.reflect.AnnotatedElement> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.reflect.AnnotatedElement>();
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test279");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int4 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test280");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int5 = strComparableMap0.count();
        boolean boolean7 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int10 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable11 = null;
        boolean boolean12 = strComparableMap0.hasKey(strComparable11);
        boolean boolean14 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test281");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int2 = strComparableMap0.count();
        int int5 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        int int13 = strComparableMap0.remove((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            int int15 = strComparableMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test282");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        int int4 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", strComparable3);
        int int7 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        int int12 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test283");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        int int4 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", strComparable3);
        int int7 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean13 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int16 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass17 = strComparableMap0.getClass();
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test284");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int4 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        int int13 = strComparableMap0.remove((java.lang.Comparable<java.lang.String>) "");
        boolean boolean15 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            int int17 = strComparableMap0.remove((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test285");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration>();
        java.lang.Class<?> wildcardClass1 = strComparableMap0.getClass();
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test286");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int4 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean8 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass11 = strComparableMap0.getClass();
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test287");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int4 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean8 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass11 = strComparable10.getClass();
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test288");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int2 = strComparableMap0.count();
        boolean boolean4 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean6 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int9 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean11 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean13 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int16 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int19 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test289");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int3 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable7 = null;
        boolean boolean8 = strComparableMap0.hasValue(strComparable7);
        boolean boolean10 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int13 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test290");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        boolean boolean3 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int9 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass12 = strComparableMap0.getClass();
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test291");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int4 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean8 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean10 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int11 = strComparableMap0.count();
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass14 = strComparable13.getClass();
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test292");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean8 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        int int11 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass12 = strComparableMap0.getClass();
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test293");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int5 = strComparableMap0.count();
        boolean boolean7 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass10 = strComparableMap0.getClass();
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test294");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int4 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int5 = strComparableMap0.count();
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test295");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean8 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean10 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int11 = strComparableMap0.count();
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test296");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean11 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean13 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int16 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test297");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int2 = strComparableMap0.count();
        int int5 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        int int8 = strComparableMap0.count();
        int int11 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test298");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        int int4 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", strComparable3);
        int int7 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean13 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test299");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean8 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean10 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test300");
        examples.Map<examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>, java.lang.Class<?>> strComparableMapMap0 = new examples.Map<examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>, java.lang.Class<?>>();
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test301");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int4 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test302");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int5 = strComparableMap0.count();
        boolean boolean7 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int8 = strComparableMap0.count();
        int int11 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test303");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        int int11 = strComparableMap0.remove((java.lang.Comparable<java.lang.String>) "");
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test304");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int10 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int13 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test305");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int4 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean6 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test306");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int2 = strComparableMap0.count();
        boolean boolean4 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean6 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int9 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean11 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean13 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean15 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable17 = strComparableMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean19 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MapTester0.test307");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int2 = strComparableMap0.count();
        int int5 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int10 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
    }
}

