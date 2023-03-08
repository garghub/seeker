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
            System.out.format("%n%s%n", "RegressionTest0.test002");
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
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
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
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
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
            System.out.format("%n%s%n", "RegressionTest0.test005");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        int int4 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", strComparable3);
        java.lang.Class<?> wildcardClass5 = strComparableMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
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
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
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
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
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
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int2 = strComparableMap0.count();
        int int3 = strComparableMap0.count();
        java.lang.Class<?> wildcardClass4 = strComparableMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        examples.Map<java.lang.CharSequence, java.io.Serializable> charSequenceMap0 = new examples.Map<java.lang.CharSequence, java.io.Serializable>();
        java.lang.Class<?> wildcardClass1 = charSequenceMap0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
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
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable4 = strComparableMap0.item((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass3 = strComparableMap0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = strComparableMap0.remove((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass5 = strComparableMap0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
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
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        boolean boolean3 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass4 = strComparableMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
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
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass6 = strComparableMap0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
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
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int2 = strComparableMap0.count();
        boolean boolean4 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass5 = strComparableMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
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
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
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
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        boolean boolean3 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass7 = strComparableMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int5 = strComparableMap0.count();
        boolean boolean7 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int10 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass11 = strComparableMap0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
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
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
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
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
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
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
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
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
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
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
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
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
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
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int5 = strComparableMap0.count();
        boolean boolean7 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int8 = strComparableMap0.count();
        java.lang.Class<?> wildcardClass9 = strComparableMap0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int2 = strComparableMap0.count();
        int int5 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableMap0.item((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + strComparable7 + "' != '" + "hi!" + "'", strComparable7, "hi!");
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean11 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int14 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass15 = strComparableMap0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
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
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int4 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        int int8 = strComparableMap0.count();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
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
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "hi!" + "'", strComparable9, "hi!");
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass8 = strComparableMap0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass10 = strComparableMap0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int2 = strComparableMap0.count();
        int int5 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int12 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        examples.Map<java.lang.reflect.Type, java.lang.String> typeMap0 = new examples.Map<java.lang.reflect.Type, java.lang.String>();
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int4 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass5 = strComparableMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int4 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        int int9 = strComparableMap0.remove((java.lang.Comparable<java.lang.String>) "");
        int int10 = strComparableMap0.count();
        int int11 = strComparableMap0.count();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int3 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
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
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int4 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        int int9 = strComparableMap0.remove((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass10 = strComparableMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        int int11 = strComparableMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass12 = strComparableMap0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "hi!" + "'", strComparable9, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
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
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
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
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
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
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean8 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
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
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int2 = strComparableMap0.count();
        int int3 = strComparableMap0.count();
        int int4 = strComparableMap0.count();
        int int5 = strComparableMap0.count();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int2 = strComparableMap0.count();
        int int5 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable6 = null;
        int int8 = strComparableMap0.extend(strComparable6, (java.lang.Comparable<java.lang.String>) "");
        int int10 = strComparableMap0.remove((java.lang.Comparable<java.lang.String>) "");
        boolean boolean12 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        int int8 = strComparableMap0.count();
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableMap0.item((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass11 = strComparable10.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + strComparable10 + "' != '" + "" + "'", strComparable10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
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
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int2 = strComparableMap0.count();
        boolean boolean4 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int8 = strComparableMap0.count();
        int int9 = strComparableMap0.count();
        int int10 = strComparableMap0.count();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        java.lang.Class<?> wildcardClass2 = strComparableMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
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
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
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
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
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
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int2 = strComparableMap0.count();
        int int5 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean13 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        boolean boolean3 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableMap0.count();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass10 = strComparable9.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "hi!" + "'", strComparable9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableMap0.count();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int4 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean8 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass9 = strComparableMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
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
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        int int11 = strComparableMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
        int int12 = strComparableMap0.count();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "hi!" + "'", strComparable9, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int5 = strComparableMap0.count();
        boolean boolean7 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int8 = strComparableMap0.count();
        boolean boolean10 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
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
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int2 = strComparableMap0.count();
        int int5 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableMap0.count();
        boolean boolean8 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int4 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        int int9 = strComparableMap0.remove((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        boolean boolean11 = strComparableMap0.hasKey(strComparable10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        boolean boolean3 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableMap0.count();
        boolean boolean9 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        examples.Map<examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>, java.lang.CharSequence> strComparableMapMap0 = new examples.Map<examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>, java.lang.CharSequence>();
        java.lang.Class<?> wildcardClass1 = strComparableMapMap0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int4 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean8 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int11 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
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
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        boolean boolean3 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + strComparable8 + "' != '" + "hi!" + "'", strComparable8, "hi!");
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int4 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        int int13 = strComparableMap0.remove((java.lang.Comparable<java.lang.String>) "");
        int int14 = strComparableMap0.count();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + strComparable11 + "' != '" + "" + "'", strComparable11, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int2 = strComparableMap0.count();
        boolean boolean4 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int8 = strComparableMap0.count();
        java.lang.Class<?> wildcardClass9 = strComparableMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int4 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
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
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        examples.Map<java.lang.String, java.lang.CharSequence> strMap0 = new examples.Map<java.lang.String, java.lang.CharSequence>();
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        boolean boolean3 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableMap0.count();
        boolean boolean9 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int4 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        int int13 = strComparableMap0.remove((java.lang.Comparable<java.lang.String>) "");
        boolean boolean15 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + strComparable11 + "' != '" + "" + "'", strComparable11, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
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
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int3 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean8 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
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
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        examples.Map<java.lang.reflect.GenericDeclaration, java.lang.String> genericDeclarationMap0 = new examples.Map<java.lang.reflect.GenericDeclaration, java.lang.String>();
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int2 = strComparableMap0.count();
        int int5 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableMap0.remove((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int2 = strComparableMap0.count();
        int int3 = strComparableMap0.count();
        boolean boolean5 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean7 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int5 = strComparableMap0.count();
        boolean boolean7 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int8 = strComparableMap0.count();
        int int11 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean8 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean10 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass11 = strComparableMap0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        examples.Map<java.lang.Object, java.lang.String> objMap0 = new examples.Map<java.lang.Object, java.lang.String>();
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        examples.Map<java.lang.Object, examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>> objMap0 = new examples.Map<java.lang.Object, examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>>();
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
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
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int2 = strComparableMap0.count();
        int int5 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        int int13 = strComparableMap0.remove((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
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
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int2 = strComparableMap0.count();
        int int5 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        int int14 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
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
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
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
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "hi!" + "'", strComparable9, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        int int8 = strComparableMap0.count();
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableMap0.item((java.lang.Comparable<java.lang.String>) "");
        boolean boolean12 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + strComparable10 + "' != '" + "" + "'", strComparable10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
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
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int12 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        int int4 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", strComparable3);
        int int7 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + strComparable11 + "' != '" + "" + "'", strComparable11, "");
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int2 = strComparableMap0.count();
        int int5 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable6 = null;
        int int8 = strComparableMap0.extend(strComparable6, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass9 = strComparableMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        boolean boolean3 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableMap0.count();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        int int10 = strComparableMap0.count();
        int int11 = strComparableMap0.count();
        int int12 = strComparableMap0.count();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "hi!" + "'", strComparable9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
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
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        int int4 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", strComparable3);
        int int5 = strComparableMap0.count();
        java.lang.Comparable<java.lang.String> strComparable6 = null;
        boolean boolean7 = strComparableMap0.hasKey(strComparable6);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
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
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean11 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        int int14 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        int int17 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int4 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean8 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int10 = strComparableMap0.remove((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int2 = strComparableMap0.count();
        int int5 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        int int8 = strComparableMap0.count();
        int int9 = strComparableMap0.count();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }
}

