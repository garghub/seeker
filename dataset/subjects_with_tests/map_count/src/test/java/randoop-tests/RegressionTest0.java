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
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
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
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
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
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
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
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
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
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
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
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
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
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
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
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
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
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        examples.Map<java.lang.CharSequence, java.io.Serializable> charSequenceMap0 = new examples.Map<java.lang.CharSequence, java.io.Serializable>();
        java.lang.Class<?> wildcardClass1 = charSequenceMap0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
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
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
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
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass3 = strComparableMap0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
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
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass5 = strComparableMap0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
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
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int4 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        boolean boolean3 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass4 = strComparableMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
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
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass6 = strComparableMap0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
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
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
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
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
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
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
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
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
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
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
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
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
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
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
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
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
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
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int2 = strComparableMap0.count();
        int int5 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableMap0.count();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
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
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
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
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int5 = strComparableMap0.count();
        int int8 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean10 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
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
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
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
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
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
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
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
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
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
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
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
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
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
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int2 = strComparableMap0.count();
        boolean boolean4 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean6 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int9 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
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
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
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
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
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
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        int int5 = strComparableMap0.count();
        boolean boolean7 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        int int4 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", strComparable3);
        int int7 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int2 = strComparableMap0.count();
        int int5 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        int int8 = strComparableMap0.count();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
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
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        boolean boolean3 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int9 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int2 = strComparableMap0.count();
        int int3 = strComparableMap0.count();
        boolean boolean5 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test53");
        examples.Map<java.lang.reflect.Type, java.lang.String> typeMap0 = new examples.Map<java.lang.reflect.Type, java.lang.String>();
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test54");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int4 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass5 = strComparableMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test55");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int4 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "");
        boolean boolean8 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test56");
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
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test57");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int3 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test58");
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
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test59");
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
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test60");
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
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test61");
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
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test62");
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
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test63");
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
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test64");
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
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test65");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int3 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test66");
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
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test67");
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
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test68");
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
    public void test69() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test69");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        int int4 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        int int13 = strComparableMap0.remove((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + strComparable11 + "' != '" + "" + "'", strComparable11, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test70() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test70");
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
    public void test71() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test71");
        examples.Map<examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>, java.lang.CharSequence> strComparableMapMap0 = new examples.Map<examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>, java.lang.CharSequence>();
    }

    @Test
    public void test72() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test72");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        boolean boolean3 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableMap0.count();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        int int10 = strComparableMap0.count();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "hi!" + "'", strComparable9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test73() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test73");
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
    public void test74() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test74");
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
    public void test75() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test75");
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
    public void test76() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test76");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        java.lang.Class<?> wildcardClass2 = strComparableMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test77() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test77");
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
    public void test78() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test78");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean8 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "");
        boolean boolean10 = strComparableMap0.hasKey((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test79() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test79");
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
    public void test80() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test80");
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
    public void test81() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test81");
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
    public void test82() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test82");
        examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableMap0 = new examples.Map<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableMap0.count();
        boolean boolean3 = strComparableMap0.hasValue((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableMap0.count();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableMap0.item((java.lang.Comparable<java.lang.String>) "hi!");
        int int12 = strComparableMap0.extend((java.lang.Comparable<java.lang.String>) "", (java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "hi!" + "'", strComparable9, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test83() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test83");
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
    public void test84() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test84");
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
}

