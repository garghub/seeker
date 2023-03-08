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
        examples.MaxBag maxBag0 = new examples.MaxBag();
        java.lang.Class<?> wildcardClass1 = maxBag0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { (-1), 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList4 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        examples.MaxBag maxBag6 = new examples.MaxBag(intList4);
        java.lang.Class<?> wildcardClass7 = intList4.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.remove((java.lang.Integer) 10);
        java.lang.Class<?> wildcardClass3 = maxBag0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.add((java.lang.Integer) 0);
        java.lang.Class<?> wildcardClass3 = maxBag0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { (-1), 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList4 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        examples.MaxBag maxBag6 = new examples.MaxBag(intList4);
        examples.MaxBag maxBag7 = new examples.MaxBag(intList4);
        maxBag7.clear();
        java.lang.Class<?> wildcardClass9 = maxBag7.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 0, 0, (-1) };
        java.util.ArrayList<java.lang.Integer> intList4 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        examples.MaxBag maxBag6 = new examples.MaxBag(intList4);
        examples.MaxBag maxBag7 = new examples.MaxBag(intList4);
        java.lang.Class<?> wildcardClass8 = maxBag7.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 0, 0, (-1) };
        java.util.ArrayList<java.lang.Integer> intList4 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        examples.MaxBag maxBag6 = new examples.MaxBag(intList4);
        java.lang.Class<?> wildcardClass7 = maxBag6.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 0, 0, (-1) };
        java.util.ArrayList<java.lang.Integer> intList4 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        examples.MaxBag maxBag6 = new examples.MaxBag(intList4);
        examples.MaxBag maxBag7 = new examples.MaxBag(intList4);
        maxBag7.remove((java.lang.Integer) 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { (-1), 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList4 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        examples.MaxBag maxBag6 = new examples.MaxBag(intList4);
        maxBag6.clear();
        maxBag6.add((java.lang.Integer) 1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 0, 0, (-1) };
        java.util.ArrayList<java.lang.Integer> intList4 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        examples.MaxBag maxBag6 = new examples.MaxBag(intList4);
        maxBag6.remove((java.lang.Integer) 0);
        maxBag6.remove((java.lang.Integer) (-1));
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { (-1), 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList4 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        examples.MaxBag maxBag6 = new examples.MaxBag(intList4);
        examples.MaxBag maxBag7 = new examples.MaxBag(intList4);
        examples.MaxBag maxBag8 = new examples.MaxBag(intList4);
        java.lang.Class<?> wildcardClass9 = maxBag8.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { (-1), 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList4 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        examples.MaxBag maxBag6 = new examples.MaxBag(intList4);
        examples.MaxBag maxBag7 = new examples.MaxBag(intList4);
        examples.MaxBag maxBag8 = new examples.MaxBag(intList4);
        maxBag8.clear();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { (-1), 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList4 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        examples.MaxBag maxBag6 = new examples.MaxBag(intList4);
        maxBag6.clear();
        maxBag6.clear();
        java.lang.Class<?> wildcardClass9 = maxBag6.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 0, 0, (-1) };
        java.util.ArrayList<java.lang.Integer> intList4 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        examples.MaxBag maxBag6 = new examples.MaxBag(intList4);
        examples.MaxBag maxBag7 = new examples.MaxBag(intList4);
        examples.MaxBag maxBag8 = new examples.MaxBag(intList4);
        examples.MaxBag maxBag9 = new examples.MaxBag(intList4);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { (-1), 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList4 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        examples.MaxBag maxBag6 = new examples.MaxBag(intList4);
        maxBag6.add((java.lang.Integer) 10);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { (-1), 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList4 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        examples.MaxBag maxBag6 = new examples.MaxBag(intList4);
        examples.MaxBag maxBag7 = new examples.MaxBag(intList4);
        examples.MaxBag maxBag8 = new examples.MaxBag(intList4);
        examples.MaxBag maxBag9 = new examples.MaxBag(intList4);
        maxBag9.add((java.lang.Integer) 100);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { (-1), 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList4 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        examples.MaxBag maxBag6 = new examples.MaxBag(intList4);
        examples.MaxBag maxBag7 = new examples.MaxBag(intList4);
        examples.MaxBag maxBag8 = new examples.MaxBag(intList4);
        examples.MaxBag maxBag9 = new examples.MaxBag(intList4);
        examples.MaxBag maxBag10 = new examples.MaxBag(intList4);
        examples.MaxBag maxBag11 = new examples.MaxBag(intList4);
        maxBag11.add((java.lang.Integer) 1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 0, 0, (-1) };
        java.util.ArrayList<java.lang.Integer> intList4 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        examples.MaxBag maxBag6 = new examples.MaxBag(intList4);
        maxBag6.remove((java.lang.Integer) 0);
        java.lang.Class<?> wildcardClass9 = maxBag6.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { (-1), 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList4 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        examples.MaxBag maxBag6 = new examples.MaxBag(intList4);
        examples.MaxBag maxBag7 = new examples.MaxBag(intList4);
        examples.MaxBag maxBag8 = new examples.MaxBag(intList4);
        examples.MaxBag maxBag9 = new examples.MaxBag(intList4);
        examples.MaxBag maxBag10 = new examples.MaxBag(intList4);
        examples.MaxBag maxBag11 = new examples.MaxBag(intList4);
        examples.MaxBag maxBag12 = new examples.MaxBag(intList4);
        examples.MaxBag maxBag13 = new examples.MaxBag(intList4);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 0, 0, (-1) };
        java.util.ArrayList<java.lang.Integer> intList4 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        examples.MaxBag maxBag6 = new examples.MaxBag(intList4);
        examples.MaxBag maxBag7 = new examples.MaxBag(intList4);
        examples.MaxBag maxBag8 = new examples.MaxBag(intList4);
        java.lang.Class<?> wildcardClass9 = maxBag8.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { (-1), 10, 1 };
        java.util.ArrayList<java.lang.Integer> intList4 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        examples.MaxBag maxBag6 = new examples.MaxBag(intList4);
        examples.MaxBag maxBag7 = new examples.MaxBag(intList4);
        examples.MaxBag maxBag8 = new examples.MaxBag(intList4);
        examples.MaxBag maxBag9 = new examples.MaxBag(intList4);
        examples.MaxBag maxBag10 = new examples.MaxBag(intList4);
        examples.MaxBag maxBag11 = new examples.MaxBag(intList4);
        maxBag11.clear();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 0, 0, (-1) };
        java.util.ArrayList<java.lang.Integer> intList4 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        examples.MaxBag maxBag6 = new examples.MaxBag(intList4);
        examples.MaxBag maxBag7 = new examples.MaxBag(intList4);
        maxBag7.add((java.lang.Integer) 0);
        maxBag7.remove((java.lang.Integer) 100);
        java.lang.Class<?> wildcardClass12 = maxBag7.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        java.lang.Integer[] intArray5 = new java.lang.Integer[] { (-1), 1, (-1), 0, 100 };
        java.util.ArrayList<java.lang.Integer> intList6 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList6, intArray5);
        examples.MaxBag maxBag8 = new examples.MaxBag(intList6);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 0, 0, (-1) };
        java.util.ArrayList<java.lang.Integer> intList4 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        examples.MaxBag maxBag6 = new examples.MaxBag(intList4);
        examples.MaxBag maxBag7 = new examples.MaxBag(intList4);
        maxBag7.add((java.lang.Integer) 0);
        maxBag7.remove((java.lang.Integer) 100);
        maxBag7.remove((java.lang.Integer) 0);
        maxBag7.clear();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        java.lang.Integer[] intArray3 = new java.lang.Integer[] { 100, 10, 10 };
        java.util.ArrayList<java.lang.Integer> intList4 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList4, intArray3);
        examples.MaxBag maxBag6 = new examples.MaxBag(intList4);
        examples.MaxBag maxBag7 = new examples.MaxBag(intList4);
        examples.MaxBag maxBag8 = new examples.MaxBag(intList4);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        java.lang.Integer[] intArray1 = new java.lang.Integer[] { 0 };
        java.util.ArrayList<java.lang.Integer> intList2 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList2, intArray1);
        examples.MaxBag maxBag4 = new examples.MaxBag(intList2);
        maxBag4.remove((java.lang.Integer) (-1));
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.remove((java.lang.Integer) 1);
        maxBag0.add((java.lang.Integer) 0);
        java.lang.Class<?> wildcardClass5 = maxBag0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }
}

