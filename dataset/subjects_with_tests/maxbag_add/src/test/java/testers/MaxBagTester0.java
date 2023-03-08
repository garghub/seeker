package testers;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MaxBagTester0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test001");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test002");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        java.lang.Integer int1 = maxBag0.getMax();
        java.lang.Class<?> wildcardClass2 = maxBag0.getClass();
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test003");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        java.lang.Class<?> wildcardClass1 = maxBag0.getClass();
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test004");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.add((java.lang.Integer) (-6));
        java.lang.Class<?> wildcardClass3 = maxBag0.getClass();
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test005");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.remove((java.lang.Integer) (-1));
        maxBag0.clear();
        maxBag0.add((java.lang.Integer) 10);
        java.lang.Class<?> wildcardClass6 = maxBag0.getClass();
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test006");
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { (-10), (-100), (-7), (-7), 6, 0, (-10), (-9), (-9), 1, 10, 1, (-2), (-8), 100, 2, 4, 2, 0, (-100), (-100), 1, 9, (-6), (-3), (-6) };
        java.util.ArrayList<java.lang.Integer> intList27 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        examples.MaxBag maxBag29 = new examples.MaxBag(intList27);
        java.lang.Class<?> wildcardClass30 = intList27.getClass();
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test007");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.remove((java.lang.Integer) (-1));
        maxBag0.clear();
        java.lang.Integer int4 = maxBag0.getMax();
        java.lang.Class<?> wildcardClass5 = maxBag0.getClass();
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test008");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        java.lang.Integer int1 = maxBag0.getMax();
        maxBag0.add((java.lang.Integer) 0);
        java.lang.Integer int4 = maxBag0.getMax();
        maxBag0.remove((java.lang.Integer) 8);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test009");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.remove((java.lang.Integer) (-1));
        maxBag0.clear();
        java.lang.Integer int4 = maxBag0.getMax();
        maxBag0.clear();
        java.lang.Class<?> wildcardClass6 = maxBag0.getClass();
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test010");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        java.lang.Integer int1 = maxBag0.getMax();
        java.lang.Integer int2 = maxBag0.getMax();
        maxBag0.remove((java.lang.Integer) (-5));
        maxBag0.add((java.lang.Integer) 9);
        java.lang.Integer int7 = maxBag0.getMax();
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test011");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.remove((java.lang.Integer) (-1));
        maxBag0.clear();
        java.lang.Integer int4 = maxBag0.getMax();
        maxBag0.remove((java.lang.Integer) 4);
        java.lang.Integer int7 = maxBag0.getMax();
        java.lang.Class<?> wildcardClass8 = maxBag0.getClass();
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test012");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        java.lang.Integer int1 = maxBag0.getMax();
        maxBag0.remove((java.lang.Integer) 100);
        java.lang.Class<?> wildcardClass4 = maxBag0.getClass();
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test013");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 0, 100, 10, 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3 };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        java.lang.Class<?> wildcardClass21 = intList18.getClass();
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test014");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.remove((java.lang.Integer) (-1));
        maxBag0.clear();
        maxBag0.remove((java.lang.Integer) (-3));
        java.lang.Integer int6 = maxBag0.getMax();
        java.lang.Integer int7 = maxBag0.getMax();
        java.lang.Class<?> wildcardClass8 = maxBag0.getClass();
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test015");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 0, 100, 10, 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3 };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        java.lang.Class<?> wildcardClass21 = maxBag20.getClass();
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test016");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        java.lang.Integer int1 = maxBag0.getMax();
        java.lang.Integer int2 = maxBag0.getMax();
        maxBag0.remove((java.lang.Integer) (-5));
        java.lang.Integer int5 = maxBag0.getMax();
        java.lang.Class<?> wildcardClass6 = maxBag0.getClass();
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test017");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.clear();
        java.lang.Class<?> wildcardClass2 = maxBag0.getClass();
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test018");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        java.lang.Integer int1 = maxBag0.getMax();
        java.lang.Integer int2 = maxBag0.getMax();
        maxBag0.clear();
        maxBag0.add((java.lang.Integer) 0);
        java.lang.Class<?> wildcardClass6 = maxBag0.getClass();
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test019");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.remove((java.lang.Integer) (-1));
        maxBag0.clear();
        java.lang.Integer int4 = maxBag0.getMax();
        maxBag0.clear();
        java.lang.Integer int6 = maxBag0.getMax();
        maxBag0.remove((java.lang.Integer) (-9));
        java.lang.Integer int9 = maxBag0.getMax();
        java.lang.Integer int10 = maxBag0.getMax();
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test020");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        java.lang.Integer int1 = maxBag0.getMax();
        java.lang.Integer int2 = maxBag0.getMax();
        maxBag0.add((java.lang.Integer) 10);
        maxBag0.remove((java.lang.Integer) (-1));
        java.lang.Integer int7 = maxBag0.getMax();
        java.lang.Class<?> wildcardClass8 = maxBag0.getClass();
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test021");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        java.lang.Integer int1 = maxBag0.getMax();
        maxBag0.add((java.lang.Integer) 0);
        java.lang.Integer int4 = maxBag0.getMax();
        maxBag0.remove((java.lang.Integer) 2);
        maxBag0.remove((java.lang.Integer) 100);
        java.lang.Class<?> wildcardClass9 = maxBag0.getClass();
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test022");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 9, (-1), 7, (-2), (-10), (-1), 9, 8, (-9), 100, 9, (-6), 4, (-1), (-5), 0, (-5) };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        java.lang.Class<?> wildcardClass21 = intList18.getClass();
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test023");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        java.lang.Integer int1 = maxBag0.getMax();
        java.lang.Integer int2 = maxBag0.getMax();
        maxBag0.remove((java.lang.Integer) (-5));
        maxBag0.remove((java.lang.Integer) 1);
        java.lang.Class<?> wildcardClass7 = maxBag0.getClass();
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test024");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.remove((java.lang.Integer) (-1));
        maxBag0.clear();
        java.lang.Integer int4 = maxBag0.getMax();
        maxBag0.clear();
        maxBag0.remove((java.lang.Integer) (-100));
        java.lang.Class<?> wildcardClass8 = maxBag0.getClass();
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test025");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.remove((java.lang.Integer) (-1));
        maxBag0.clear();
        java.lang.Integer int4 = maxBag0.getMax();
        maxBag0.remove((java.lang.Integer) 4);
        java.lang.Integer int7 = maxBag0.getMax();
        maxBag0.remove((java.lang.Integer) (-9));
        java.lang.Integer int10 = maxBag0.getMax();
        java.lang.Class<?> wildcardClass11 = maxBag0.getClass();
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test026");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.remove((java.lang.Integer) (-1));
        maxBag0.clear();
        java.lang.Integer int4 = maxBag0.getMax();
        maxBag0.clear();
        java.lang.Integer int6 = maxBag0.getMax();
        java.lang.Integer int7 = maxBag0.getMax();
        maxBag0.add((java.lang.Integer) 10);
        java.lang.Integer int10 = maxBag0.getMax();
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test027");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        java.lang.Integer int1 = maxBag0.getMax();
        maxBag0.add((java.lang.Integer) 0);
        java.lang.Integer int4 = maxBag0.getMax();
        maxBag0.remove((java.lang.Integer) 4);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test028");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        java.lang.Integer int1 = maxBag0.getMax();
        java.lang.Integer int2 = maxBag0.getMax();
        maxBag0.clear();
        maxBag0.clear();
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test029");
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { (-10), (-100), (-7), (-7), 6, 0, (-10), (-9), (-9), 1, 10, 1, (-2), (-8), 100, 2, 4, 2, 0, (-100), (-100), 1, 9, (-6), (-3), (-6) };
        java.util.ArrayList<java.lang.Integer> intList27 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        examples.MaxBag maxBag29 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag30 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag31 = new examples.MaxBag(intList27);
        java.lang.Class<?> wildcardClass32 = maxBag31.getClass();
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test030");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.remove((java.lang.Integer) (-1));
        maxBag0.clear();
        java.lang.Integer int4 = maxBag0.getMax();
        maxBag0.clear();
        java.lang.Integer int6 = maxBag0.getMax();
        maxBag0.add((java.lang.Integer) (-2));
        maxBag0.remove((java.lang.Integer) 100);
        maxBag0.clear();
        java.lang.Integer int12 = maxBag0.getMax();
        java.lang.Integer int13 = maxBag0.getMax();
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test031");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 0, 100, 10, 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3 };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        maxBag20.add((java.lang.Integer) (-8));
        java.lang.Integer int23 = maxBag20.getMax();
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test032");
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { (-10), (-100), (-7), (-7), 6, 0, (-10), (-9), (-9), 1, 10, 1, (-2), (-8), 100, 2, 4, 2, 0, (-100), (-100), 1, 9, (-6), (-3), (-6) };
        java.util.ArrayList<java.lang.Integer> intList27 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        examples.MaxBag maxBag29 = new examples.MaxBag(intList27);
        maxBag29.clear();
        java.lang.Class<?> wildcardClass31 = maxBag29.getClass();
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test033");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.remove((java.lang.Integer) (-1));
        maxBag0.clear();
        java.lang.Integer int4 = maxBag0.getMax();
        maxBag0.remove((java.lang.Integer) (-3));
        java.lang.Integer int7 = maxBag0.getMax();
        java.lang.Integer int8 = maxBag0.getMax();
        java.lang.Class<?> wildcardClass9 = maxBag0.getClass();
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test034");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.remove((java.lang.Integer) (-1));
        maxBag0.clear();
        java.lang.Integer int4 = maxBag0.getMax();
        maxBag0.remove((java.lang.Integer) 4);
        java.lang.Integer int7 = maxBag0.getMax();
        maxBag0.remove((java.lang.Integer) (-9));
        maxBag0.remove((java.lang.Integer) 2);
        maxBag0.remove((java.lang.Integer) 8);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test035");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.remove((java.lang.Integer) (-1));
        maxBag0.clear();
        maxBag0.add((java.lang.Integer) 10);
        maxBag0.clear();
        maxBag0.clear();
        java.lang.Class<?> wildcardClass8 = maxBag0.getClass();
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test036");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.remove((java.lang.Integer) (-1));
        maxBag0.clear();
        java.lang.Integer int4 = maxBag0.getMax();
        maxBag0.clear();
        java.lang.Integer int6 = maxBag0.getMax();
        maxBag0.remove((java.lang.Integer) (-9));
        java.lang.Integer int9 = maxBag0.getMax();
        maxBag0.clear();
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test037");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.remove((java.lang.Integer) (-1));
        maxBag0.clear();
        java.lang.Integer int4 = maxBag0.getMax();
        maxBag0.clear();
        java.lang.Integer int6 = maxBag0.getMax();
        maxBag0.add((java.lang.Integer) (-2));
        maxBag0.add((java.lang.Integer) 10);
        maxBag0.add((java.lang.Integer) 1);
        java.lang.Class<?> wildcardClass13 = maxBag0.getClass();
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test038");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.remove((java.lang.Integer) (-1));
        maxBag0.clear();
        java.lang.Integer int4 = maxBag0.getMax();
        maxBag0.remove((java.lang.Integer) 7);
        maxBag0.add((java.lang.Integer) 2);
        java.lang.Class<?> wildcardClass9 = maxBag0.getClass();
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test039");
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { (-10), (-100), (-7), (-7), 6, 0, (-10), (-9), (-9), 1, 10, 1, (-2), (-8), 100, 2, 4, 2, 0, (-100), (-100), 1, 9, (-6), (-3), (-6) };
        java.util.ArrayList<java.lang.Integer> intList27 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        examples.MaxBag maxBag29 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag30 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag31 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag32 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag33 = new examples.MaxBag(intList27);
        java.lang.Class<?> wildcardClass34 = intList27.getClass();
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test040");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.remove((java.lang.Integer) (-1));
        maxBag0.clear();
        java.lang.Integer int4 = maxBag0.getMax();
        maxBag0.remove((java.lang.Integer) 4);
        java.lang.Integer int7 = maxBag0.getMax();
        maxBag0.add((java.lang.Integer) (-1));
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test041");
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { (-10), (-100), (-7), (-7), 6, 0, (-10), (-9), (-9), 1, 10, 1, (-2), (-8), 100, 2, 4, 2, 0, (-100), (-100), 1, 9, (-6), (-3), (-6) };
        java.util.ArrayList<java.lang.Integer> intList27 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        examples.MaxBag maxBag29 = new examples.MaxBag(intList27);
        java.lang.Class<?> wildcardClass30 = maxBag29.getClass();
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test042");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.remove((java.lang.Integer) (-1));
        maxBag0.clear();
        java.lang.Integer int4 = maxBag0.getMax();
        maxBag0.remove((java.lang.Integer) 4);
        java.lang.Integer int7 = maxBag0.getMax();
        maxBag0.remove((java.lang.Integer) (-9));
        maxBag0.remove((java.lang.Integer) 2);
        java.lang.Integer int12 = maxBag0.getMax();
        java.lang.Class<?> wildcardClass13 = maxBag0.getClass();
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test043");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.remove((java.lang.Integer) (-1));
        maxBag0.clear();
        java.lang.Integer int4 = maxBag0.getMax();
        maxBag0.remove((java.lang.Integer) 4);
        java.lang.Integer int7 = maxBag0.getMax();
        maxBag0.remove((java.lang.Integer) (-9));
        maxBag0.remove((java.lang.Integer) 2);
        java.lang.Class<?> wildcardClass12 = maxBag0.getClass();
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test044");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 0, 100, 10, 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3 };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag22 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag23 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag24 = new examples.MaxBag(intList18);
        java.lang.Class<?> wildcardClass25 = intList18.getClass();
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test045");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 0, 100, 10, 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3 };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        maxBag20.remove((java.lang.Integer) 8);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test046");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        java.lang.Integer int1 = maxBag0.getMax();
        java.lang.Integer int2 = maxBag0.getMax();
        maxBag0.remove((java.lang.Integer) (-5));
        maxBag0.add((java.lang.Integer) 9);
        maxBag0.remove((java.lang.Integer) 1);
        maxBag0.remove((java.lang.Integer) (-10));
        maxBag0.add((java.lang.Integer) (-10));
        maxBag0.remove((java.lang.Integer) 1);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test047");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.remove((java.lang.Integer) (-1));
        maxBag0.clear();
        maxBag0.remove((java.lang.Integer) (-3));
        java.lang.Class<?> wildcardClass6 = maxBag0.getClass();
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test048");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.remove((java.lang.Integer) (-1));
        maxBag0.clear();
        java.lang.Integer int4 = maxBag0.getMax();
        maxBag0.clear();
        java.lang.Integer int6 = maxBag0.getMax();
        maxBag0.remove((java.lang.Integer) (-9));
        maxBag0.clear();
        java.lang.Integer int10 = maxBag0.getMax();
        maxBag0.clear();
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test049");
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 5, 3, (-5), (-8), 0, (-5), (-5), (-3), 4, 6, (-1), 10, (-1), 10, 8, 7, 1, (-3), (-100), 0, 10, 5, 0, 100, 2, (-10), (-2), (-5) };
        java.util.ArrayList<java.lang.Integer> intList29 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList29, intArray28);
        examples.MaxBag maxBag31 = new examples.MaxBag(intList29);
        maxBag31.add((java.lang.Integer) 9);
        java.lang.Class<?> wildcardClass34 = maxBag31.getClass();
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test050");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 9, (-1), 7, (-2), (-10), (-1), 9, 8, (-9), 100, 9, (-6), 4, (-1), (-5), 0, (-5) };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList18);
        maxBag21.remove((java.lang.Integer) 8);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test051");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.remove((java.lang.Integer) (-1));
        maxBag0.clear();
        java.lang.Integer int4 = maxBag0.getMax();
        maxBag0.clear();
        java.lang.Integer int6 = maxBag0.getMax();
        maxBag0.remove((java.lang.Integer) (-9));
        java.lang.Integer int9 = maxBag0.getMax();
        maxBag0.add((java.lang.Integer) 0);
        java.lang.Class<?> wildcardClass12 = maxBag0.getClass();
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test052");
        java.util.ArrayList<java.lang.Integer> intList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            examples.MaxBag maxBag1 = new examples.MaxBag(intList0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test053");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 0, 100, 10, 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3 };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        maxBag20.add((java.lang.Integer) 2);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test054");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.remove((java.lang.Integer) (-1));
        maxBag0.clear();
        java.lang.Integer int4 = maxBag0.getMax();
        maxBag0.remove((java.lang.Integer) 7);
        maxBag0.remove((java.lang.Integer) 2);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test055");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 0, 100, 10, 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3 };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList18);
        maxBag21.clear();
        java.lang.Class<?> wildcardClass23 = maxBag21.getClass();
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test056");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        java.lang.Integer int1 = maxBag0.getMax();
        java.lang.Integer int2 = maxBag0.getMax();
        maxBag0.clear();
        maxBag0.add((java.lang.Integer) (-7));
        java.lang.Integer int6 = maxBag0.getMax();
        java.lang.Class<?> wildcardClass7 = maxBag0.getClass();
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test057");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        java.lang.Integer int1 = maxBag0.getMax();
        maxBag0.add((java.lang.Integer) 0);
        java.lang.Integer int4 = maxBag0.getMax();
        maxBag0.remove((java.lang.Integer) 2);
        maxBag0.remove((java.lang.Integer) 0);
        java.lang.Integer int9 = maxBag0.getMax();
        java.lang.Integer int10 = maxBag0.getMax();
        java.lang.Class<?> wildcardClass11 = maxBag0.getClass();
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test058");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.remove((java.lang.Integer) (-1));
        maxBag0.clear();
        java.lang.Integer int4 = maxBag0.getMax();
        maxBag0.clear();
        java.lang.Integer int6 = maxBag0.getMax();
        maxBag0.add((java.lang.Integer) (-2));
        maxBag0.add((java.lang.Integer) 10);
        maxBag0.remove((java.lang.Integer) (-100));
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test059");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        java.lang.Integer int1 = maxBag0.getMax();
        maxBag0.add((java.lang.Integer) 0);
        java.lang.Integer int4 = maxBag0.getMax();
        java.lang.Class<?> wildcardClass5 = maxBag0.getClass();
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test060");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.remove((java.lang.Integer) (-1));
        maxBag0.clear();
        java.lang.Integer int4 = maxBag0.getMax();
        maxBag0.remove((java.lang.Integer) (-3));
        java.lang.Class<?> wildcardClass7 = maxBag0.getClass();
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test061");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 9, (-1), 7, (-2), (-10), (-1), 9, 8, (-9), 100, 9, (-6), 4, (-1), (-5), 0, (-5) };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        maxBag20.remove((java.lang.Integer) 8);
        java.lang.Integer int23 = maxBag20.getMax();
        java.lang.Class<?> wildcardClass24 = maxBag20.getClass();
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test062");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.remove((java.lang.Integer) (-1));
        maxBag0.clear();
        maxBag0.remove((java.lang.Integer) (-3));
        java.lang.Integer int6 = maxBag0.getMax();
        maxBag0.remove((java.lang.Integer) 0);
        java.lang.Class<?> wildcardClass9 = maxBag0.getClass();
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test063");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        java.lang.Integer int1 = maxBag0.getMax();
        maxBag0.add((java.lang.Integer) 0);
        maxBag0.remove((java.lang.Integer) (-8));
        maxBag0.remove((java.lang.Integer) 100);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test064");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.remove((java.lang.Integer) (-1));
        maxBag0.clear();
        java.lang.Integer int4 = maxBag0.getMax();
        maxBag0.clear();
        java.lang.Integer int6 = maxBag0.getMax();
        maxBag0.remove((java.lang.Integer) (-9));
        java.lang.Integer int9 = maxBag0.getMax();
        maxBag0.add((java.lang.Integer) 0);
        maxBag0.clear();
        java.lang.Integer int13 = maxBag0.getMax();
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test065");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        java.lang.Integer int1 = maxBag0.getMax();
        java.lang.Integer int2 = maxBag0.getMax();
        maxBag0.add((java.lang.Integer) 10);
        maxBag0.remove((java.lang.Integer) (-1));
        java.lang.Integer int7 = maxBag0.getMax();
        java.lang.Integer int8 = maxBag0.getMax();
        java.lang.Class<?> wildcardClass9 = maxBag0.getClass();
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test066");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.remove((java.lang.Integer) (-1));
        maxBag0.clear();
        maxBag0.remove((java.lang.Integer) (-3));
        java.lang.Integer int6 = maxBag0.getMax();
        maxBag0.remove((java.lang.Integer) 0);
        java.lang.Integer int9 = maxBag0.getMax();
        java.lang.Integer int10 = maxBag0.getMax();
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test067");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        java.lang.Integer int1 = maxBag0.getMax();
        maxBag0.add((java.lang.Integer) 0);
        java.lang.Integer int4 = maxBag0.getMax();
        maxBag0.remove((java.lang.Integer) 2);
        maxBag0.remove((java.lang.Integer) 0);
        maxBag0.clear();
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test068");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 9, (-1), 7, (-2), (-10), (-1), 9, 8, (-9), 100, 9, (-6), 4, (-1), (-5), 0, (-5) };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        maxBag20.remove((java.lang.Integer) 8);
        maxBag20.remove((java.lang.Integer) (-7));
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test069");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        java.lang.Integer int1 = maxBag0.getMax();
        java.lang.Integer int2 = maxBag0.getMax();
        maxBag0.remove((java.lang.Integer) (-5));
        maxBag0.remove((java.lang.Integer) (-7));
        java.lang.Integer int7 = maxBag0.getMax();
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test070");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 0, 100, 10, 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3 };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag22 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag23 = new examples.MaxBag(intList18);
        java.lang.Class<?> wildcardClass24 = maxBag23.getClass();
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test071");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.add((java.lang.Integer) (-6));
        maxBag0.add((java.lang.Integer) 100);
        java.lang.Integer int5 = maxBag0.getMax();
        maxBag0.clear();
        maxBag0.clear();
        maxBag0.remove((java.lang.Integer) 3);
        maxBag0.remove((java.lang.Integer) 100);
        java.lang.Class<?> wildcardClass12 = maxBag0.getClass();
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test072");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.remove((java.lang.Integer) (-1));
        maxBag0.clear();
        java.lang.Integer int4 = maxBag0.getMax();
        maxBag0.clear();
        java.lang.Integer int6 = maxBag0.getMax();
        maxBag0.remove((java.lang.Integer) (-9));
        maxBag0.clear();
        maxBag0.add((java.lang.Integer) 5);
        java.lang.Integer int12 = maxBag0.getMax();
        java.lang.Integer int13 = maxBag0.getMax();
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test073");
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 5, 3, (-5), (-8), 0, (-5), (-5), (-3), 4, 6, (-1), 10, (-1), 10, 8, 7, 1, (-3), (-100), 0, 10, 5, 0, 100, 2, (-10), (-2), (-5) };
        java.util.ArrayList<java.lang.Integer> intList29 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList29, intArray28);
        examples.MaxBag maxBag31 = new examples.MaxBag(intList29);
        maxBag31.add((java.lang.Integer) 9);
        maxBag31.add((java.lang.Integer) 0);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test074");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        java.lang.Integer int1 = maxBag0.getMax();
        maxBag0.add((java.lang.Integer) 0);
        java.lang.Integer int4 = maxBag0.getMax();
        maxBag0.remove((java.lang.Integer) 2);
        maxBag0.remove((java.lang.Integer) 100);
        maxBag0.remove((java.lang.Integer) 3);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test075");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.remove((java.lang.Integer) (-1));
        maxBag0.clear();
        java.lang.Integer int4 = maxBag0.getMax();
        maxBag0.clear();
        maxBag0.remove((java.lang.Integer) (-100));
        java.lang.Integer int8 = maxBag0.getMax();
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test076");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        java.lang.Integer int1 = maxBag0.getMax();
        java.lang.Integer int2 = maxBag0.getMax();
        maxBag0.add((java.lang.Integer) 10);
        maxBag0.add((java.lang.Integer) (-6));
        maxBag0.add((java.lang.Integer) 5);
        java.lang.Class<?> wildcardClass9 = maxBag0.getClass();
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test077");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.remove((java.lang.Integer) (-1));
        maxBag0.clear();
        java.lang.Integer int4 = maxBag0.getMax();
        maxBag0.clear();
        java.lang.Integer int6 = maxBag0.getMax();
        java.lang.Integer int7 = maxBag0.getMax();
        java.lang.Integer int8 = maxBag0.getMax();
        maxBag0.add((java.lang.Integer) 0);
        maxBag0.add((java.lang.Integer) (-5));
        maxBag0.clear();
        maxBag0.remove((java.lang.Integer) 4);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test078");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.remove((java.lang.Integer) (-1));
        maxBag0.clear();
        java.lang.Integer int4 = maxBag0.getMax();
        maxBag0.clear();
        java.lang.Integer int6 = maxBag0.getMax();
        java.lang.Integer int7 = maxBag0.getMax();
        java.lang.Integer int8 = maxBag0.getMax();
        maxBag0.add((java.lang.Integer) 0);
        maxBag0.add((java.lang.Integer) (-5));
        java.lang.Integer int13 = maxBag0.getMax();
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test079");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.remove((java.lang.Integer) (-1));
        maxBag0.clear();
        java.lang.Integer int4 = maxBag0.getMax();
        maxBag0.clear();
        java.lang.Integer int6 = maxBag0.getMax();
        maxBag0.remove((java.lang.Integer) (-9));
        maxBag0.clear();
        java.lang.Integer int10 = maxBag0.getMax();
        maxBag0.add((java.lang.Integer) (-100));
        maxBag0.remove((java.lang.Integer) 100);
        java.lang.Integer int15 = maxBag0.getMax();
        maxBag0.remove((java.lang.Integer) 0);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test080");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.remove((java.lang.Integer) (-1));
        maxBag0.clear();
        maxBag0.remove((java.lang.Integer) (-3));
        java.lang.Integer int6 = maxBag0.getMax();
        java.lang.Class<?> wildcardClass7 = maxBag0.getClass();
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test081");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.remove((java.lang.Integer) (-1));
        maxBag0.clear();
        maxBag0.remove((java.lang.Integer) (-3));
        java.lang.Integer int6 = maxBag0.getMax();
        maxBag0.remove((java.lang.Integer) 0);
        java.lang.Integer int9 = maxBag0.getMax();
        maxBag0.clear();
        java.lang.Class<?> wildcardClass11 = maxBag0.getClass();
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test082");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        java.lang.Integer int1 = maxBag0.getMax();
        java.lang.Integer int2 = maxBag0.getMax();
        maxBag0.remove((java.lang.Integer) (-5));
        java.lang.Class<?> wildcardClass5 = maxBag0.getClass();
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test083");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.remove((java.lang.Integer) (-1));
        maxBag0.clear();
        java.lang.Integer int4 = maxBag0.getMax();
        maxBag0.clear();
        java.lang.Integer int6 = maxBag0.getMax();
        maxBag0.remove((java.lang.Integer) (-9));
        maxBag0.clear();
        maxBag0.add((java.lang.Integer) 5);
        maxBag0.remove((java.lang.Integer) 9);
        java.lang.Integer int14 = maxBag0.getMax();
        maxBag0.add((java.lang.Integer) (-1));
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test084");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 9, (-1), 7, (-2), (-10), (-1), 9, 8, (-9), 100, 9, (-6), 4, (-1), (-5), 0, (-5) };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag22 = new examples.MaxBag(intList18);
        java.lang.Class<?> wildcardClass23 = intList18.getClass();
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test085");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.remove((java.lang.Integer) (-1));
        maxBag0.clear();
        java.lang.Integer int4 = maxBag0.getMax();
        maxBag0.clear();
        java.lang.Integer int6 = maxBag0.getMax();
        maxBag0.remove((java.lang.Integer) (-9));
        maxBag0.clear();
        maxBag0.add((java.lang.Integer) 5);
        maxBag0.remove((java.lang.Integer) 9);
        java.lang.Class<?> wildcardClass14 = maxBag0.getClass();
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test086");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.remove((java.lang.Integer) (-1));
        maxBag0.clear();
        maxBag0.add((java.lang.Integer) 10);
        maxBag0.clear();
        maxBag0.clear();
        java.lang.Integer int8 = maxBag0.getMax();
        maxBag0.add((java.lang.Integer) 5);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test087");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.remove((java.lang.Integer) (-1));
        maxBag0.clear();
        java.lang.Integer int4 = maxBag0.getMax();
        maxBag0.remove((java.lang.Integer) 7);
        maxBag0.clear();
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test088");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.remove((java.lang.Integer) (-1));
        maxBag0.clear();
        java.lang.Integer int4 = maxBag0.getMax();
        maxBag0.remove((java.lang.Integer) 4);
        java.lang.Integer int7 = maxBag0.getMax();
        maxBag0.remove((java.lang.Integer) (-9));
        maxBag0.remove((java.lang.Integer) 5);
        java.lang.Class<?> wildcardClass12 = maxBag0.getClass();
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test089");
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { (-10), (-100), (-7), (-7), 6, 0, (-10), (-9), (-9), 1, 10, 1, (-2), (-8), 100, 2, 4, 2, 0, (-100), (-100), 1, 9, (-6), (-3), (-6) };
        java.util.ArrayList<java.lang.Integer> intList27 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        examples.MaxBag maxBag29 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag30 = new examples.MaxBag(intList27);
        maxBag30.remove((java.lang.Integer) 0);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test090");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        java.lang.Integer int1 = maxBag0.getMax();
        maxBag0.add((java.lang.Integer) 0);
        java.lang.Integer int4 = maxBag0.getMax();
        maxBag0.remove((java.lang.Integer) 2);
        maxBag0.clear();
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test091");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.remove((java.lang.Integer) (-1));
        maxBag0.clear();
        java.lang.Integer int4 = maxBag0.getMax();
        maxBag0.clear();
        maxBag0.clear();
        java.lang.Class<?> wildcardClass7 = maxBag0.getClass();
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test092");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.remove((java.lang.Integer) (-1));
        maxBag0.clear();
        java.lang.Integer int4 = maxBag0.getMax();
        maxBag0.clear();
        java.lang.Integer int6 = maxBag0.getMax();
        maxBag0.remove((java.lang.Integer) (-9));
        maxBag0.clear();
        maxBag0.add((java.lang.Integer) 5);
        maxBag0.clear();
        maxBag0.remove((java.lang.Integer) (-1));
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test093");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.add((java.lang.Integer) (-6));
        maxBag0.add((java.lang.Integer) 100);
        java.lang.Integer int5 = maxBag0.getMax();
        maxBag0.clear();
        maxBag0.clear();
        maxBag0.remove((java.lang.Integer) 3);
        java.lang.Class<?> wildcardClass10 = maxBag0.getClass();
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test094");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 0, 100, 10, 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3 };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList18);
        maxBag21.clear();
        java.lang.Integer int23 = maxBag21.getMax();
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test095");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.remove((java.lang.Integer) (-1));
        maxBag0.add((java.lang.Integer) (-7));
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test096");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.remove((java.lang.Integer) (-1));
        maxBag0.clear();
        java.lang.Integer int4 = maxBag0.getMax();
        maxBag0.clear();
        java.lang.Integer int6 = maxBag0.getMax();
        maxBag0.add((java.lang.Integer) (-2));
        maxBag0.remove((java.lang.Integer) 100);
        maxBag0.clear();
        java.lang.Integer int12 = maxBag0.getMax();
        maxBag0.remove((java.lang.Integer) 10);
        maxBag0.clear();
        java.lang.Class<?> wildcardClass16 = maxBag0.getClass();
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test097");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        java.lang.Integer int1 = maxBag0.getMax();
        maxBag0.remove((java.lang.Integer) 3);
        maxBag0.remove((java.lang.Integer) 100);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test098");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.add((java.lang.Integer) (-6));
        maxBag0.add((java.lang.Integer) 100);
        java.lang.Integer int5 = maxBag0.getMax();
        java.lang.Integer int6 = maxBag0.getMax();
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test099");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.remove((java.lang.Integer) (-1));
        maxBag0.clear();
        java.lang.Integer int4 = maxBag0.getMax();
        maxBag0.clear();
        java.lang.Integer int6 = maxBag0.getMax();
        maxBag0.remove((java.lang.Integer) (-9));
        maxBag0.clear();
        maxBag0.add((java.lang.Integer) 5);
        maxBag0.remove((java.lang.Integer) 9);
        java.lang.Integer int14 = maxBag0.getMax();
        java.lang.Integer int15 = maxBag0.getMax();
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test100");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        java.lang.Integer int1 = maxBag0.getMax();
        java.lang.Integer int2 = maxBag0.getMax();
        maxBag0.clear();
        maxBag0.remove((java.lang.Integer) 10);
        java.lang.Integer int6 = maxBag0.getMax();
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test101");
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { (-10), (-100), (-7), (-7), 6, 0, (-10), (-9), (-9), 1, 10, 1, (-2), (-8), 100, 2, 4, 2, 0, (-100), (-100), 1, 9, (-6), (-3), (-6) };
        java.util.ArrayList<java.lang.Integer> intList27 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        examples.MaxBag maxBag29 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag30 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag31 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag32 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag33 = new examples.MaxBag(intList27);
        maxBag33.remove((java.lang.Integer) 0);
        maxBag33.add((java.lang.Integer) (-9));
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test102");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.remove((java.lang.Integer) (-1));
        maxBag0.clear();
        maxBag0.add((java.lang.Integer) 10);
        maxBag0.clear();
        maxBag0.clear();
        java.lang.Integer int8 = maxBag0.getMax();
        java.lang.Integer int9 = maxBag0.getMax();
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test103");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.remove((java.lang.Integer) (-1));
        maxBag0.clear();
        java.lang.Integer int4 = maxBag0.getMax();
        maxBag0.remove((java.lang.Integer) (-3));
        java.lang.Integer int7 = maxBag0.getMax();
        java.lang.Class<?> wildcardClass8 = maxBag0.getClass();
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test104");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 0, 100, 10, 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3 };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag22 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag23 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag24 = new examples.MaxBag(intList18);
        java.lang.Integer int25 = maxBag24.getMax();
        java.lang.Class<?> wildcardClass26 = maxBag24.getClass();
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test105");
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { (-10), (-100), (-7), (-7), 6, 0, (-10), (-9), (-9), 1, 10, 1, (-2), (-8), 100, 2, 4, 2, 0, (-100), (-100), 1, 9, (-6), (-3), (-6) };
        java.util.ArrayList<java.lang.Integer> intList27 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        examples.MaxBag maxBag29 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag30 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag31 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag32 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag33 = new examples.MaxBag(intList27);
        java.lang.Class<?> wildcardClass34 = maxBag33.getClass();
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test106");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.add((java.lang.Integer) (-6));
        maxBag0.add((java.lang.Integer) 100);
        java.lang.Integer int5 = maxBag0.getMax();
        maxBag0.clear();
        maxBag0.remove((java.lang.Integer) (-5));
        java.lang.Class<?> wildcardClass9 = maxBag0.getClass();
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test107");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        java.lang.Integer int1 = maxBag0.getMax();
        java.lang.Integer int2 = maxBag0.getMax();
        maxBag0.add((java.lang.Integer) 10);
        maxBag0.remove((java.lang.Integer) (-100));
        maxBag0.remove((java.lang.Integer) (-6));
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test108");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.add((java.lang.Integer) (-6));
        maxBag0.remove((java.lang.Integer) 5);
        maxBag0.add((java.lang.Integer) 0);
        maxBag0.add((java.lang.Integer) (-1));
        java.lang.Class<?> wildcardClass9 = maxBag0.getClass();
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test109");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.remove((java.lang.Integer) (-1));
        maxBag0.clear();
        java.lang.Integer int4 = maxBag0.getMax();
        maxBag0.clear();
        java.lang.Integer int6 = maxBag0.getMax();
        maxBag0.remove((java.lang.Integer) (-9));
        java.lang.Class<?> wildcardClass9 = maxBag0.getClass();
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test110");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.remove((java.lang.Integer) (-1));
        maxBag0.clear();
        java.lang.Integer int4 = maxBag0.getMax();
        maxBag0.remove((java.lang.Integer) (-3));
        maxBag0.remove((java.lang.Integer) 4);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test111");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.remove((java.lang.Integer) (-1));
        maxBag0.clear();
        java.lang.Integer int4 = maxBag0.getMax();
        maxBag0.clear();
        java.lang.Integer int6 = maxBag0.getMax();
        maxBag0.remove((java.lang.Integer) (-9));
        maxBag0.clear();
        java.lang.Integer int10 = maxBag0.getMax();
        maxBag0.add((java.lang.Integer) (-100));
        java.lang.Integer int13 = maxBag0.getMax();
        java.lang.Integer int14 = maxBag0.getMax();
        java.lang.Integer int15 = maxBag0.getMax();
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test112");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        java.lang.Integer int1 = maxBag0.getMax();
        java.lang.Integer int2 = maxBag0.getMax();
        maxBag0.clear();
        maxBag0.add((java.lang.Integer) (-9));
        maxBag0.add((java.lang.Integer) (-9));
        maxBag0.add((java.lang.Integer) 10);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test113");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 0, 100, 10, 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3 };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        maxBag20.add((java.lang.Integer) 100);
        maxBag20.clear();
        java.lang.Integer int24 = maxBag20.getMax();
        maxBag20.clear();
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test114");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        java.lang.Integer int1 = maxBag0.getMax();
        java.lang.Integer int2 = maxBag0.getMax();
        maxBag0.add((java.lang.Integer) 10);
        maxBag0.add((java.lang.Integer) (-6));
        maxBag0.clear();
        java.lang.Class<?> wildcardClass8 = maxBag0.getClass();
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test115");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        java.lang.Integer int1 = maxBag0.getMax();
        java.lang.Integer int2 = maxBag0.getMax();
        maxBag0.remove((java.lang.Integer) (-5));
        maxBag0.remove((java.lang.Integer) 0);
        java.lang.Integer int7 = maxBag0.getMax();
        java.lang.Class<?> wildcardClass8 = maxBag0.getClass();
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test116");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 9, (-1), 7, (-2), (-10), (-1), 9, 8, (-9), 100, 9, (-6), 4, (-1), (-5), 0, (-5) };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList18);
        maxBag21.remove((java.lang.Integer) 1);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test117");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.remove((java.lang.Integer) (-1));
        maxBag0.clear();
        java.lang.Integer int4 = maxBag0.getMax();
        maxBag0.remove((java.lang.Integer) (-1));
        maxBag0.remove((java.lang.Integer) 6);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test118");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        java.lang.Integer int1 = maxBag0.getMax();
        java.lang.Integer int2 = maxBag0.getMax();
        maxBag0.add((java.lang.Integer) 10);
        maxBag0.remove((java.lang.Integer) (-1));
        java.lang.Integer int7 = maxBag0.getMax();
        maxBag0.add((java.lang.Integer) 2);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test119");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.remove((java.lang.Integer) (-1));
        maxBag0.clear();
        java.lang.Integer int4 = maxBag0.getMax();
        maxBag0.clear();
        java.lang.Integer int6 = maxBag0.getMax();
        java.lang.Integer int7 = maxBag0.getMax();
        java.lang.Integer int8 = maxBag0.getMax();
        maxBag0.add((java.lang.Integer) 10);
        maxBag0.remove((java.lang.Integer) 4);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test120");
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { (-10), (-100), (-7), (-7), 6, 0, (-10), (-9), (-9), 1, 10, 1, (-2), (-8), 100, 2, 4, 2, 0, (-100), (-100), 1, 9, (-6), (-3), (-6) };
        java.util.ArrayList<java.lang.Integer> intList27 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        examples.MaxBag maxBag29 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag30 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag31 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag32 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag33 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag34 = new examples.MaxBag(intList27);
        java.lang.Integer int35 = maxBag34.getMax();
        java.lang.Integer int36 = maxBag34.getMax();
        maxBag34.add((java.lang.Integer) 0);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test121");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        java.lang.Integer int1 = maxBag0.getMax();
        maxBag0.add((java.lang.Integer) 0);
        java.lang.Integer int4 = maxBag0.getMax();
        maxBag0.remove((java.lang.Integer) 2);
        maxBag0.remove((java.lang.Integer) 0);
        java.lang.Integer int9 = maxBag0.getMax();
        java.lang.Integer int10 = maxBag0.getMax();
        maxBag0.add((java.lang.Integer) (-9));
        maxBag0.remove((java.lang.Integer) (-6));
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test122");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.clear();
        maxBag0.clear();
        maxBag0.remove((java.lang.Integer) 100);
        maxBag0.add((java.lang.Integer) 0);
        maxBag0.add((java.lang.Integer) 8);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test123");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        java.lang.Integer int1 = maxBag0.getMax();
        java.lang.Integer int2 = maxBag0.getMax();
        maxBag0.remove((java.lang.Integer) (-5));
        maxBag0.remove((java.lang.Integer) 0);
        maxBag0.remove((java.lang.Integer) 2);
        maxBag0.clear();
        java.lang.Class<?> wildcardClass10 = maxBag0.getClass();
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test124");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        java.lang.Integer int1 = maxBag0.getMax();
        java.lang.Integer int2 = maxBag0.getMax();
        maxBag0.clear();
        maxBag0.add((java.lang.Integer) 0);
        maxBag0.clear();
        maxBag0.clear();
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test125");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.remove((java.lang.Integer) (-1));
        maxBag0.clear();
        java.lang.Integer int4 = maxBag0.getMax();
        maxBag0.remove((java.lang.Integer) 7);
        java.lang.Integer int7 = maxBag0.getMax();
        java.lang.Class<?> wildcardClass8 = maxBag0.getClass();
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test126");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.remove((java.lang.Integer) (-1));
        maxBag0.clear();
        java.lang.Integer int4 = maxBag0.getMax();
        maxBag0.clear();
        java.lang.Integer int6 = maxBag0.getMax();
        maxBag0.add((java.lang.Integer) (-2));
        maxBag0.add((java.lang.Integer) (-100));
        maxBag0.clear();
        java.lang.Class<?> wildcardClass12 = maxBag0.getClass();
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test127");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        java.lang.Integer int1 = maxBag0.getMax();
        java.lang.Integer int2 = maxBag0.getMax();
        maxBag0.add((java.lang.Integer) 10);
        maxBag0.remove((java.lang.Integer) (-1));
        java.lang.Class<?> wildcardClass7 = maxBag0.getClass();
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test128");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.remove((java.lang.Integer) (-1));
        maxBag0.clear();
        java.lang.Integer int4 = maxBag0.getMax();
        maxBag0.clear();
        java.lang.Integer int6 = maxBag0.getMax();
        java.lang.Class<?> wildcardClass7 = maxBag0.getClass();
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test129");
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { (-10), (-100), (-7), (-7), 6, 0, (-10), (-9), (-9), 1, 10, 1, (-2), (-8), 100, 2, 4, 2, 0, (-100), (-100), 1, 9, (-6), (-3), (-6) };
        java.util.ArrayList<java.lang.Integer> intList27 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        examples.MaxBag maxBag29 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag30 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag31 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag32 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag33 = new examples.MaxBag(intList27);
        maxBag33.remove((java.lang.Integer) 0);
        maxBag33.add((java.lang.Integer) 3);
        maxBag33.remove((java.lang.Integer) (-5));
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test130");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.remove((java.lang.Integer) (-1));
        maxBag0.clear();
        java.lang.Integer int4 = maxBag0.getMax();
        maxBag0.clear();
        java.lang.Integer int6 = maxBag0.getMax();
        java.lang.Integer int7 = maxBag0.getMax();
        java.lang.Integer int8 = maxBag0.getMax();
        maxBag0.add((java.lang.Integer) 0);
        maxBag0.add((java.lang.Integer) (-5));
        maxBag0.clear();
        maxBag0.clear();
        java.lang.Class<?> wildcardClass15 = maxBag0.getClass();
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test131");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 0, 100, 10, 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3 };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag22 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag23 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag24 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag25 = new examples.MaxBag(intList18);
        java.lang.Class<?> wildcardClass26 = intList18.getClass();
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test132");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        java.lang.Integer int1 = maxBag0.getMax();
        java.lang.Integer int2 = maxBag0.getMax();
        maxBag0.add((java.lang.Integer) 10);
        maxBag0.add((java.lang.Integer) (-6));
        maxBag0.clear();
        java.lang.Integer int8 = maxBag0.getMax();
        maxBag0.remove((java.lang.Integer) (-1));
        maxBag0.remove((java.lang.Integer) 10);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test133");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        java.lang.Integer int1 = maxBag0.getMax();
        maxBag0.add((java.lang.Integer) 0);
        java.lang.Class<?> wildcardClass4 = maxBag0.getClass();
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test134");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.remove((java.lang.Integer) (-1));
        maxBag0.clear();
        java.lang.Integer int4 = maxBag0.getMax();
        maxBag0.remove((java.lang.Integer) 7);
        java.lang.Integer int7 = maxBag0.getMax();
        java.lang.Integer int8 = maxBag0.getMax();
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test135");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.remove((java.lang.Integer) (-1));
        maxBag0.clear();
        java.lang.Integer int4 = maxBag0.getMax();
        maxBag0.clear();
        java.lang.Integer int6 = maxBag0.getMax();
        maxBag0.remove((java.lang.Integer) (-9));
        maxBag0.clear();
        maxBag0.add((java.lang.Integer) 5);
        maxBag0.remove((java.lang.Integer) 4);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test136");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        java.lang.Integer int1 = maxBag0.getMax();
        maxBag0.remove((java.lang.Integer) 3);
        maxBag0.clear();
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test137");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        java.lang.Integer int1 = maxBag0.getMax();
        java.lang.Integer int2 = maxBag0.getMax();
        maxBag0.clear();
        maxBag0.remove((java.lang.Integer) 10);
        maxBag0.remove((java.lang.Integer) 7);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test138");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.remove((java.lang.Integer) (-1));
        maxBag0.clear();
        java.lang.Integer int4 = maxBag0.getMax();
        maxBag0.remove((java.lang.Integer) 4);
        java.lang.Integer int7 = maxBag0.getMax();
        maxBag0.remove((java.lang.Integer) (-9));
        java.lang.Class<?> wildcardClass10 = maxBag0.getClass();
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test139");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.remove((java.lang.Integer) (-1));
        maxBag0.clear();
        java.lang.Integer int4 = maxBag0.getMax();
        maxBag0.clear();
        java.lang.Integer int6 = maxBag0.getMax();
        maxBag0.add((java.lang.Integer) (-2));
        maxBag0.add((java.lang.Integer) 10);
        maxBag0.clear();
        java.lang.Integer int12 = maxBag0.getMax();
        maxBag0.clear();
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test140");
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { (-10), (-100), (-7), (-7), 6, 0, (-10), (-9), (-9), 1, 10, 1, (-2), (-8), 100, 2, 4, 2, 0, (-100), (-100), 1, 9, (-6), (-3), (-6) };
        java.util.ArrayList<java.lang.Integer> intList27 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        examples.MaxBag maxBag29 = new examples.MaxBag(intList27);
        java.lang.Integer int30 = maxBag29.getMax();
        maxBag29.add((java.lang.Integer) (-1));
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test141");
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 0, 100, (-3), 3, 10, (-8), 2, 10, 9, 5 };
        java.util.ArrayList<java.lang.Integer> intList11 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        examples.MaxBag maxBag13 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag14 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag15 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag16 = new examples.MaxBag(intList11);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test142");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.remove((java.lang.Integer) (-1));
        maxBag0.clear();
        maxBag0.add((java.lang.Integer) 10);
        maxBag0.clear();
        maxBag0.clear();
        java.lang.Integer int8 = maxBag0.getMax();
        maxBag0.remove((java.lang.Integer) 100);
        java.lang.Class<?> wildcardClass11 = maxBag0.getClass();
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test143");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        java.lang.Integer int1 = maxBag0.getMax();
        maxBag0.add((java.lang.Integer) 0);
        java.lang.Integer int4 = maxBag0.getMax();
        maxBag0.remove((java.lang.Integer) 2);
        maxBag0.remove((java.lang.Integer) 0);
        maxBag0.remove((java.lang.Integer) 0);
        maxBag0.clear();
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test144");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.remove((java.lang.Integer) (-1));
        maxBag0.clear();
        java.lang.Integer int4 = maxBag0.getMax();
        maxBag0.remove((java.lang.Integer) 4);
        maxBag0.add((java.lang.Integer) 1);
        maxBag0.add((java.lang.Integer) 0);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test145");
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { (-10), (-100), (-7), (-7), 6, 0, (-10), (-9), (-9), 1, 10, 1, (-2), (-8), 100, 2, 4, 2, 0, (-100), (-100), 1, 9, (-6), (-3), (-6) };
        java.util.ArrayList<java.lang.Integer> intList27 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        examples.MaxBag maxBag29 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag30 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag31 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag32 = new examples.MaxBag(intList27);
        maxBag32.remove((java.lang.Integer) 3);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test146");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        java.lang.Integer int1 = maxBag0.getMax();
        maxBag0.remove((java.lang.Integer) 100);
        maxBag0.clear();
        java.lang.Integer int5 = maxBag0.getMax();
        java.lang.Class<?> wildcardClass6 = maxBag0.getClass();
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test147");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.remove((java.lang.Integer) (-1));
        maxBag0.clear();
        java.lang.Integer int4 = maxBag0.getMax();
        maxBag0.remove((java.lang.Integer) 4);
        java.lang.Integer int7 = maxBag0.getMax();
        maxBag0.remove((java.lang.Integer) (-9));
        maxBag0.remove((java.lang.Integer) 2);
        java.lang.Integer int12 = maxBag0.getMax();
        maxBag0.remove((java.lang.Integer) (-4));
        maxBag0.clear();
        java.lang.Class<?> wildcardClass16 = maxBag0.getClass();
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test148");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.remove((java.lang.Integer) (-1));
        maxBag0.clear();
        java.lang.Integer int4 = maxBag0.getMax();
        maxBag0.remove((java.lang.Integer) 4);
        java.lang.Integer int7 = maxBag0.getMax();
        maxBag0.remove((java.lang.Integer) (-9));
        maxBag0.remove((java.lang.Integer) 2);
        java.lang.Integer int12 = maxBag0.getMax();
        maxBag0.remove((java.lang.Integer) (-4));
        maxBag0.clear();
        maxBag0.clear();
        maxBag0.remove((java.lang.Integer) 1);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test149");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 0, 100, 10, 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3 };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag22 = new examples.MaxBag(intList18);
        java.lang.Integer int23 = maxBag22.getMax();
        java.lang.Class<?> wildcardClass24 = maxBag22.getClass();
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test150");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 9, (-1), 7, (-2), (-10), (-1), 9, 8, (-9), 100, 9, (-6), 4, (-1), (-5), 0, (-5) };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList18);
        java.lang.Class<?> wildcardClass22 = maxBag21.getClass();
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test151");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        java.lang.Integer int1 = maxBag0.getMax();
        java.lang.Integer int2 = maxBag0.getMax();
        maxBag0.remove((java.lang.Integer) (-5));
        maxBag0.add((java.lang.Integer) 9);
        maxBag0.remove((java.lang.Integer) 1);
        maxBag0.remove((java.lang.Integer) (-10));
        maxBag0.add((java.lang.Integer) (-10));
        java.lang.Integer int13 = maxBag0.getMax();
        java.lang.Integer int14 = maxBag0.getMax();
        java.lang.Integer int15 = maxBag0.getMax();
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test152");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.remove((java.lang.Integer) (-1));
        maxBag0.clear();
        java.lang.Integer int4 = maxBag0.getMax();
        maxBag0.clear();
        java.lang.Integer int6 = maxBag0.getMax();
        maxBag0.add((java.lang.Integer) (-2));
        maxBag0.add((java.lang.Integer) (-100));
        maxBag0.clear();
        maxBag0.remove((java.lang.Integer) 9);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test153");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.remove((java.lang.Integer) (-1));
        maxBag0.clear();
        maxBag0.remove((java.lang.Integer) (-3));
        java.lang.Integer int6 = maxBag0.getMax();
        java.lang.Integer int7 = maxBag0.getMax();
        java.lang.Integer int8 = maxBag0.getMax();
        java.lang.Integer int9 = maxBag0.getMax();
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test154");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.remove((java.lang.Integer) (-1));
        maxBag0.clear();
        java.lang.Integer int4 = maxBag0.getMax();
        maxBag0.clear();
        java.lang.Integer int6 = maxBag0.getMax();
        maxBag0.remove((java.lang.Integer) (-9));
        maxBag0.clear();
        java.lang.Integer int10 = maxBag0.getMax();
        maxBag0.add((java.lang.Integer) (-100));
        maxBag0.remove((java.lang.Integer) 100);
        java.lang.Class<?> wildcardClass15 = maxBag0.getClass();
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test155");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 9, (-1), 7, (-2), (-10), (-1), 9, 8, (-9), 100, 9, (-6), 4, (-1), (-5), 0, (-5) };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag22 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag23 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag24 = new examples.MaxBag(intList18);
        maxBag24.remove((java.lang.Integer) 7);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test156");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        java.lang.Integer int1 = maxBag0.getMax();
        maxBag0.add((java.lang.Integer) 0);
        java.lang.Integer int4 = maxBag0.getMax();
        maxBag0.remove((java.lang.Integer) 2);
        maxBag0.add((java.lang.Integer) 2);
        maxBag0.remove((java.lang.Integer) 100);
        maxBag0.remove((java.lang.Integer) (-100));
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test157");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.remove((java.lang.Integer) (-1));
        maxBag0.clear();
        java.lang.Integer int4 = maxBag0.getMax();
        maxBag0.remove((java.lang.Integer) 7);
        maxBag0.add((java.lang.Integer) 7);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test158");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 0, 100, 10, 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3 };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag22 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag23 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag24 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag25 = new examples.MaxBag(intList18);
        maxBag25.add((java.lang.Integer) 100);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test159");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.remove((java.lang.Integer) (-1));
        maxBag0.clear();
        java.lang.Integer int4 = maxBag0.getMax();
        maxBag0.clear();
        java.lang.Integer int6 = maxBag0.getMax();
        maxBag0.remove((java.lang.Integer) (-9));
        maxBag0.clear();
        java.lang.Integer int10 = maxBag0.getMax();
        java.lang.Class<?> wildcardClass11 = maxBag0.getClass();
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test160");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.remove((java.lang.Integer) (-1));
        maxBag0.clear();
        maxBag0.add((java.lang.Integer) 10);
        maxBag0.clear();
        maxBag0.clear();
        maxBag0.remove((java.lang.Integer) (-8));
        java.lang.Integer int10 = maxBag0.getMax();
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test161");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.add((java.lang.Integer) (-6));
        maxBag0.add((java.lang.Integer) 100);
        java.lang.Integer int5 = maxBag0.getMax();
        java.lang.Class<?> wildcardClass6 = maxBag0.getClass();
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test162");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        java.lang.Integer int1 = maxBag0.getMax();
        java.lang.Integer int2 = maxBag0.getMax();
        maxBag0.clear();
        maxBag0.add((java.lang.Integer) 0);
        maxBag0.clear();
        java.lang.Class<?> wildcardClass7 = maxBag0.getClass();
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test163");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.remove((java.lang.Integer) (-1));
        maxBag0.clear();
        java.lang.Integer int4 = maxBag0.getMax();
        maxBag0.remove((java.lang.Integer) 4);
        java.lang.Integer int7 = maxBag0.getMax();
        maxBag0.remove((java.lang.Integer) (-9));
        maxBag0.remove((java.lang.Integer) 2);
        maxBag0.remove((java.lang.Integer) 1);
        maxBag0.remove((java.lang.Integer) 100);
        java.lang.Integer int16 = maxBag0.getMax();
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test164");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.remove((java.lang.Integer) (-1));
        maxBag0.clear();
        java.lang.Integer int4 = maxBag0.getMax();
        maxBag0.clear();
        java.lang.Integer int6 = maxBag0.getMax();
        maxBag0.add((java.lang.Integer) (-2));
        maxBag0.remove((java.lang.Integer) 100);
        maxBag0.clear();
        java.lang.Integer int12 = maxBag0.getMax();
        java.lang.Class<?> wildcardClass13 = maxBag0.getClass();
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test165");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        java.lang.Integer int1 = maxBag0.getMax();
        maxBag0.add((java.lang.Integer) 0);
        java.lang.Integer int4 = maxBag0.getMax();
        maxBag0.remove((java.lang.Integer) 2);
        maxBag0.remove((java.lang.Integer) 0);
        java.lang.Integer int9 = maxBag0.getMax();
        java.lang.Integer int10 = maxBag0.getMax();
        maxBag0.remove((java.lang.Integer) (-5));
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test166");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        java.lang.Integer int1 = maxBag0.getMax();
        java.lang.Integer int2 = maxBag0.getMax();
        maxBag0.remove((java.lang.Integer) (-5));
        maxBag0.add((java.lang.Integer) 9);
        maxBag0.clear();
        maxBag0.remove((java.lang.Integer) 0);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test167");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.remove((java.lang.Integer) (-1));
        maxBag0.clear();
        maxBag0.remove((java.lang.Integer) (-3));
        maxBag0.clear();
        java.lang.Class<?> wildcardClass7 = maxBag0.getClass();
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test168");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.remove((java.lang.Integer) (-1));
        maxBag0.clear();
        java.lang.Integer int4 = maxBag0.getMax();
        maxBag0.clear();
        java.lang.Integer int6 = maxBag0.getMax();
        maxBag0.remove((java.lang.Integer) (-9));
        maxBag0.clear();
        maxBag0.remove((java.lang.Integer) (-5));
        java.lang.Integer int12 = maxBag0.getMax();
        maxBag0.add((java.lang.Integer) (-6));
        maxBag0.remove((java.lang.Integer) 100);
        maxBag0.remove((java.lang.Integer) (-5));
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test169");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.add((java.lang.Integer) (-6));
        maxBag0.remove((java.lang.Integer) 5);
        maxBag0.add((java.lang.Integer) 0);
        maxBag0.add((java.lang.Integer) (-1));
        maxBag0.remove((java.lang.Integer) (-6));
        java.lang.Class<?> wildcardClass11 = maxBag0.getClass();
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test170");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        java.lang.Integer int1 = maxBag0.getMax();
        java.lang.Integer int2 = maxBag0.getMax();
        maxBag0.remove((java.lang.Integer) (-5));
        maxBag0.remove((java.lang.Integer) 7);
        maxBag0.clear();
        maxBag0.clear();
        java.lang.Class<?> wildcardClass9 = maxBag0.getClass();
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test171");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        java.lang.Integer int1 = maxBag0.getMax();
        maxBag0.add((java.lang.Integer) 0);
        java.lang.Integer int4 = maxBag0.getMax();
        maxBag0.remove((java.lang.Integer) 2);
        maxBag0.remove((java.lang.Integer) 0);
        java.lang.Integer int9 = maxBag0.getMax();
        java.lang.Integer int10 = maxBag0.getMax();
        java.lang.Integer int11 = maxBag0.getMax();
        maxBag0.add((java.lang.Integer) 0);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test172");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        java.lang.Integer int1 = maxBag0.getMax();
        java.lang.Integer int2 = maxBag0.getMax();
        maxBag0.remove((java.lang.Integer) (-5));
        maxBag0.add((java.lang.Integer) 9);
        maxBag0.clear();
        maxBag0.remove((java.lang.Integer) 5);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test173");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        java.lang.Integer int1 = maxBag0.getMax();
        java.lang.Integer int2 = maxBag0.getMax();
        maxBag0.add((java.lang.Integer) 10);
        maxBag0.remove((java.lang.Integer) 10);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test174");
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { (-10), (-100), (-7), (-7), 6, 0, (-10), (-9), (-9), 1, 10, 1, (-2), (-8), 100, 2, 4, 2, 0, (-100), (-100), 1, 9, (-6), (-3), (-6) };
        java.util.ArrayList<java.lang.Integer> intList27 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        examples.MaxBag maxBag29 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag30 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag31 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag32 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag33 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag34 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag35 = new examples.MaxBag(intList27);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test175");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        java.lang.Integer int1 = maxBag0.getMax();
        maxBag0.remove((java.lang.Integer) 100);
        maxBag0.clear();
        java.lang.Integer int5 = maxBag0.getMax();
        java.lang.Integer int6 = maxBag0.getMax();
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test176");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.clear();
        maxBag0.clear();
        maxBag0.remove((java.lang.Integer) 100);
        java.lang.Integer int5 = maxBag0.getMax();
        maxBag0.remove((java.lang.Integer) 1);
        maxBag0.add((java.lang.Integer) 9);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test177");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.remove((java.lang.Integer) (-1));
        maxBag0.clear();
        java.lang.Integer int4 = maxBag0.getMax();
        java.lang.Integer int5 = maxBag0.getMax();
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test178");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.remove((java.lang.Integer) (-1));
        maxBag0.clear();
        java.lang.Integer int4 = maxBag0.getMax();
        maxBag0.clear();
        java.lang.Integer int6 = maxBag0.getMax();
        java.lang.Integer int7 = maxBag0.getMax();
        maxBag0.add((java.lang.Integer) 10);
        maxBag0.add((java.lang.Integer) 3);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test179");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        java.lang.Integer int1 = maxBag0.getMax();
        java.lang.Integer int2 = maxBag0.getMax();
        maxBag0.clear();
        maxBag0.add((java.lang.Integer) 0);
        maxBag0.clear();
        maxBag0.add((java.lang.Integer) (-5));
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test180");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        java.lang.Integer int1 = maxBag0.getMax();
        maxBag0.remove((java.lang.Integer) 3);
        maxBag0.remove((java.lang.Integer) (-10));
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test181");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.add((java.lang.Integer) (-6));
        maxBag0.remove((java.lang.Integer) 5);
        maxBag0.add((java.lang.Integer) 0);
        java.lang.Integer int7 = maxBag0.getMax();
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test182");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.remove((java.lang.Integer) (-1));
        maxBag0.clear();
        java.lang.Integer int4 = maxBag0.getMax();
        maxBag0.clear();
        java.lang.Integer int6 = maxBag0.getMax();
        maxBag0.remove((java.lang.Integer) (-9));
        maxBag0.clear();
        maxBag0.add((java.lang.Integer) 5);
        java.lang.Integer int12 = maxBag0.getMax();
        java.lang.Class<?> wildcardClass13 = maxBag0.getClass();
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test183");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.remove((java.lang.Integer) (-1));
        maxBag0.clear();
        java.lang.Integer int4 = maxBag0.getMax();
        maxBag0.remove((java.lang.Integer) (-1));
        java.lang.Integer int7 = maxBag0.getMax();
        maxBag0.clear();
        maxBag0.clear();
        maxBag0.add((java.lang.Integer) (-1));
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test184");
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 5, 3, (-5), (-8), 0, (-5), (-5), (-3), 4, 6, (-1), 10, (-1), 10, 8, 7, 1, (-3), (-100), 0, 10, 5, 0, 100, 2, (-10), (-2), (-5) };
        java.util.ArrayList<java.lang.Integer> intList29 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList29, intArray28);
        examples.MaxBag maxBag31 = new examples.MaxBag(intList29);
        examples.MaxBag maxBag32 = new examples.MaxBag(intList29);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test185");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 0, 100, 10, 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3 };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList18);
        maxBag21.remove((java.lang.Integer) 3);
        maxBag21.remove((java.lang.Integer) 8);
        maxBag21.clear();
        maxBag21.remove((java.lang.Integer) (-2));
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test186");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.remove((java.lang.Integer) (-1));
        maxBag0.clear();
        java.lang.Integer int4 = maxBag0.getMax();
        maxBag0.remove((java.lang.Integer) 4);
        java.lang.Integer int7 = maxBag0.getMax();
        maxBag0.remove((java.lang.Integer) (-9));
        maxBag0.remove((java.lang.Integer) 2);
        java.lang.Integer int12 = maxBag0.getMax();
        maxBag0.remove((java.lang.Integer) (-4));
        maxBag0.add((java.lang.Integer) 2);
        java.lang.Class<?> wildcardClass17 = maxBag0.getClass();
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test187");
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { (-10), (-100), (-7), (-7), 6, 0, (-10), (-9), (-9), 1, 10, 1, (-2), (-8), 100, 2, 4, 2, 0, (-100), (-100), 1, 9, (-6), (-3), (-6) };
        java.util.ArrayList<java.lang.Integer> intList27 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        examples.MaxBag maxBag29 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag30 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag31 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag32 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag33 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag34 = new examples.MaxBag(intList27);
        maxBag34.add((java.lang.Integer) (-6));
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test188");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 0, 100, 10, 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3 };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag22 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag23 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag24 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag25 = new examples.MaxBag(intList18);
        java.lang.Class<?> wildcardClass26 = maxBag25.getClass();
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test189");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        java.lang.Integer int1 = maxBag0.getMax();
        maxBag0.add((java.lang.Integer) 0);
        java.lang.Integer int4 = maxBag0.getMax();
        maxBag0.remove((java.lang.Integer) 2);
        maxBag0.add((java.lang.Integer) 5);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test190");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        java.lang.Integer int1 = maxBag0.getMax();
        maxBag0.add((java.lang.Integer) 0);
        java.lang.Integer int4 = maxBag0.getMax();
        maxBag0.remove((java.lang.Integer) 2);
        maxBag0.add((java.lang.Integer) 2);
        maxBag0.remove((java.lang.Integer) 100);
        java.lang.Class<?> wildcardClass11 = maxBag0.getClass();
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test191");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.remove((java.lang.Integer) (-1));
        maxBag0.clear();
        maxBag0.add((java.lang.Integer) 10);
        java.lang.Integer int6 = maxBag0.getMax();
        maxBag0.add((java.lang.Integer) 0);
        maxBag0.remove((java.lang.Integer) 0);
        maxBag0.add((java.lang.Integer) 100);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test192");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.remove((java.lang.Integer) (-1));
        maxBag0.clear();
        java.lang.Integer int4 = maxBag0.getMax();
        maxBag0.remove((java.lang.Integer) 4);
        java.lang.Integer int7 = maxBag0.getMax();
        maxBag0.remove((java.lang.Integer) (-9));
        maxBag0.remove((java.lang.Integer) 2);
        java.lang.Integer int12 = maxBag0.getMax();
        maxBag0.remove((java.lang.Integer) (-4));
        maxBag0.add((java.lang.Integer) 3);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test193");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        java.lang.Integer int1 = maxBag0.getMax();
        java.lang.Integer int2 = maxBag0.getMax();
        maxBag0.clear();
        maxBag0.add((java.lang.Integer) (-7));
        java.lang.Integer int6 = maxBag0.getMax();
        java.lang.Integer int7 = maxBag0.getMax();
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test194");
        java.lang.Integer[] intArray28 = new java.lang.Integer[] { 5, 3, (-5), (-8), 0, (-5), (-5), (-3), 4, 6, (-1), 10, (-1), 10, 8, 7, 1, (-3), (-100), 0, 10, 5, 0, 100, 2, (-10), (-2), (-5) };
        java.util.ArrayList<java.lang.Integer> intList29 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList29, intArray28);
        examples.MaxBag maxBag31 = new examples.MaxBag(intList29);
        maxBag31.add((java.lang.Integer) 9);
        maxBag31.remove((java.lang.Integer) (-7));
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test195");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.remove((java.lang.Integer) (-1));
        maxBag0.clear();
        java.lang.Integer int4 = maxBag0.getMax();
        maxBag0.clear();
        java.lang.Integer int6 = maxBag0.getMax();
        maxBag0.remove((java.lang.Integer) (-9));
        java.lang.Integer int9 = maxBag0.getMax();
        maxBag0.add((java.lang.Integer) 7);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test196");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.remove((java.lang.Integer) (-1));
        maxBag0.clear();
        java.lang.Integer int4 = maxBag0.getMax();
        maxBag0.clear();
        java.lang.Integer int6 = maxBag0.getMax();
        maxBag0.remove((java.lang.Integer) (-9));
        maxBag0.clear();
        maxBag0.add((java.lang.Integer) 5);
        maxBag0.remove((java.lang.Integer) 9);
        maxBag0.remove((java.lang.Integer) 5);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test197");
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { (-10), (-100), (-7), (-7), 6, 0, (-10), (-9), (-9), 1, 10, 1, (-2), (-8), 100, 2, 4, 2, 0, (-100), (-100), 1, 9, (-6), (-3), (-6) };
        java.util.ArrayList<java.lang.Integer> intList27 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        examples.MaxBag maxBag29 = new examples.MaxBag(intList27);
        java.lang.Integer int30 = maxBag29.getMax();
        maxBag29.add((java.lang.Integer) (-7));
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test198");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.remove((java.lang.Integer) (-1));
        maxBag0.clear();
        java.lang.Integer int4 = maxBag0.getMax();
        maxBag0.clear();
        java.lang.Integer int6 = maxBag0.getMax();
        maxBag0.add((java.lang.Integer) (-2));
        maxBag0.remove((java.lang.Integer) 100);
        maxBag0.clear();
        java.lang.Integer int12 = maxBag0.getMax();
        maxBag0.remove((java.lang.Integer) 10);
        maxBag0.clear();
        maxBag0.remove((java.lang.Integer) 0);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test199");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.remove((java.lang.Integer) (-1));
        maxBag0.clear();
        java.lang.Integer int4 = maxBag0.getMax();
        maxBag0.clear();
        java.lang.Integer int6 = maxBag0.getMax();
        java.lang.Integer int7 = maxBag0.getMax();
        java.lang.Integer int8 = maxBag0.getMax();
        maxBag0.add((java.lang.Integer) 0);
        maxBag0.remove((java.lang.Integer) (-10));
        java.lang.Integer int13 = maxBag0.getMax();
        maxBag0.clear();
        maxBag0.add((java.lang.Integer) 9);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test200");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.remove((java.lang.Integer) (-1));
        maxBag0.clear();
        java.lang.Integer int4 = maxBag0.getMax();
        maxBag0.clear();
        java.lang.Integer int6 = maxBag0.getMax();
        maxBag0.remove((java.lang.Integer) (-9));
        maxBag0.clear();
        maxBag0.remove((java.lang.Integer) (-5));
        java.lang.Class<?> wildcardClass12 = maxBag0.getClass();
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test201");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.remove((java.lang.Integer) (-1));
        maxBag0.clear();
        java.lang.Integer int4 = maxBag0.getMax();
        maxBag0.clear();
        java.lang.Integer int6 = maxBag0.getMax();
        maxBag0.remove((java.lang.Integer) (-9));
        maxBag0.clear();
        maxBag0.remove((java.lang.Integer) (-5));
        maxBag0.remove((java.lang.Integer) (-5));
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test202");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 9, (-1), 7, (-2), (-10), (-1), 9, 8, (-9), 100, 9, (-6), 4, (-1), (-5), 0, (-5) };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList18);
        maxBag21.clear();
        maxBag21.clear();
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test203");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 0, 100, 10, 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3 };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList18);
        maxBag21.clear();
        maxBag21.clear();
        maxBag21.add((java.lang.Integer) 0);
        java.lang.Class<?> wildcardClass26 = maxBag21.getClass();
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test204");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 0, 100, 10, 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3 };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList18);
        maxBag21.add((java.lang.Integer) (-8));
        java.lang.Class<?> wildcardClass24 = maxBag21.getClass();
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test205");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 0, 6, (-5), 9, 0, 1, 8, 0, (-7), 1, 4, 100, 0, (-5), 5, (-8), (-2) };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag22 = new examples.MaxBag(intList18);
        java.lang.Integer int23 = maxBag22.getMax();
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test206");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        java.lang.Integer int1 = maxBag0.getMax();
        java.lang.Integer int2 = maxBag0.getMax();
        maxBag0.remove((java.lang.Integer) (-5));
        maxBag0.add((java.lang.Integer) 9);
        maxBag0.remove((java.lang.Integer) 1);
        maxBag0.remove((java.lang.Integer) (-10));
        maxBag0.add((java.lang.Integer) (-10));
        java.lang.Integer int13 = maxBag0.getMax();
        maxBag0.add((java.lang.Integer) 0);
        java.lang.Integer int16 = maxBag0.getMax();
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test207");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.remove((java.lang.Integer) (-1));
        maxBag0.clear();
        java.lang.Integer int4 = maxBag0.getMax();
        maxBag0.clear();
        java.lang.Integer int6 = maxBag0.getMax();
        maxBag0.remove((java.lang.Integer) (-9));
        java.lang.Integer int9 = maxBag0.getMax();
        maxBag0.add((java.lang.Integer) 0);
        maxBag0.clear();
        maxBag0.add((java.lang.Integer) 0);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test208");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        java.lang.Integer int1 = maxBag0.getMax();
        java.lang.Integer int2 = maxBag0.getMax();
        maxBag0.clear();
        maxBag0.add((java.lang.Integer) 0);
        maxBag0.clear();
        java.lang.Integer int7 = maxBag0.getMax();
        maxBag0.clear();
        java.lang.Class<?> wildcardClass9 = maxBag0.getClass();
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test209");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.remove((java.lang.Integer) (-1));
        maxBag0.clear();
        java.lang.Integer int4 = maxBag0.getMax();
        maxBag0.clear();
        java.lang.Integer int6 = maxBag0.getMax();
        maxBag0.add((java.lang.Integer) (-2));
        maxBag0.remove((java.lang.Integer) 100);
        java.lang.Integer int11 = maxBag0.getMax();
        maxBag0.add((java.lang.Integer) 6);
        maxBag0.remove((java.lang.Integer) 8);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test210");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.add((java.lang.Integer) (-6));
        maxBag0.add((java.lang.Integer) (-1));
        java.lang.Integer int5 = maxBag0.getMax();
        maxBag0.remove((java.lang.Integer) 3);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test211");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        java.lang.Integer int1 = maxBag0.getMax();
        java.lang.Integer int2 = maxBag0.getMax();
        maxBag0.add((java.lang.Integer) 10);
        maxBag0.add((java.lang.Integer) (-6));
        maxBag0.clear();
        java.lang.Integer int8 = maxBag0.getMax();
        maxBag0.remove((java.lang.Integer) 0);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test212");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 9, (-1), 7, (-2), (-10), (-1), 9, 8, (-9), 100, 9, (-6), 4, (-1), (-5), 0, (-5) };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList18);
        java.lang.Integer int22 = maxBag21.getMax();
        java.lang.Integer int23 = maxBag21.getMax();
        java.lang.Class<?> wildcardClass24 = maxBag21.getClass();
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test213");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 0, 100, 10, 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3 };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag22 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag23 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag24 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag25 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag26 = new examples.MaxBag(intList18);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test214");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.add((java.lang.Integer) (-6));
        maxBag0.remove((java.lang.Integer) 5);
        maxBag0.add((java.lang.Integer) 0);
        maxBag0.add((java.lang.Integer) (-1));
        maxBag0.remove((java.lang.Integer) (-6));
        maxBag0.add((java.lang.Integer) 2);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test215");
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { (-10), (-100), (-7), (-7), 6, 0, (-10), (-9), (-9), 1, 10, 1, (-2), (-8), 100, 2, 4, 2, 0, (-100), (-100), 1, 9, (-6), (-3), (-6) };
        java.util.ArrayList<java.lang.Integer> intList27 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        examples.MaxBag maxBag29 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag30 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag31 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag32 = new examples.MaxBag(intList27);
        examples.MaxBag maxBag33 = new examples.MaxBag(intList27);
        maxBag33.remove((java.lang.Integer) 0);
        java.lang.Class<?> wildcardClass36 = maxBag33.getClass();
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test216");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 0, 100, 10, 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3 };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList18);
        maxBag21.clear();
        maxBag21.clear();
        maxBag21.add((java.lang.Integer) 0);
        maxBag21.remove((java.lang.Integer) (-7));
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test217");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 0, 6, (-5), 9, 0, 1, 8, 0, (-7), 1, 4, 100, 0, (-5), 5, (-8), (-2) };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag22 = new examples.MaxBag(intList18);
        maxBag22.remove((java.lang.Integer) 10);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test218");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        java.lang.Integer int1 = maxBag0.getMax();
        java.lang.Integer int2 = maxBag0.getMax();
        maxBag0.clear();
        java.lang.Integer int4 = maxBag0.getMax();
        java.lang.Class<?> wildcardClass5 = maxBag0.getClass();
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test219");
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 0, 100, (-3), 3, 10, (-8), 2, 10, 9, 5 };
        java.util.ArrayList<java.lang.Integer> intList11 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        examples.MaxBag maxBag13 = new examples.MaxBag(intList11);
        examples.MaxBag maxBag14 = new examples.MaxBag(intList11);
        maxBag14.remove((java.lang.Integer) 100);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test220");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 9, (-1), 7, (-2), (-10), (-1), 9, 8, (-9), 100, 9, (-6), 4, (-1), (-5), 0, (-5) };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        java.lang.Integer int21 = maxBag20.getMax();
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test221");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.remove((java.lang.Integer) (-1));
        maxBag0.clear();
        java.lang.Integer int4 = maxBag0.getMax();
        maxBag0.remove((java.lang.Integer) 4);
        java.lang.Integer int7 = maxBag0.getMax();
        maxBag0.remove((java.lang.Integer) (-9));
        maxBag0.remove((java.lang.Integer) 2);
        java.lang.Integer int12 = maxBag0.getMax();
        maxBag0.remove((java.lang.Integer) (-4));
        maxBag0.clear();
        maxBag0.remove((java.lang.Integer) 10);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test222");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.clear();
        maxBag0.clear();
        maxBag0.clear();
        maxBag0.clear();
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test223");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 9, (-1), 7, (-2), (-10), (-1), 9, 8, (-9), 100, 9, (-6), 4, (-1), (-5), 0, (-5) };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList18);
        maxBag21.clear();
        maxBag21.add((java.lang.Integer) (-1));
        maxBag21.clear();
        maxBag21.clear();
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test224");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.remove((java.lang.Integer) (-1));
        maxBag0.clear();
        java.lang.Integer int4 = maxBag0.getMax();
        maxBag0.clear();
        java.lang.Integer int6 = maxBag0.getMax();
        java.lang.Integer int7 = maxBag0.getMax();
        maxBag0.clear();
        maxBag0.remove((java.lang.Integer) 5);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test225");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.remove((java.lang.Integer) (-1));
        maxBag0.clear();
        java.lang.Integer int4 = maxBag0.getMax();
        maxBag0.remove((java.lang.Integer) 4);
        java.lang.Integer int7 = maxBag0.getMax();
        java.lang.Integer int8 = maxBag0.getMax();
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test226");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 0, 100, 10, 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3 };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag22 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag23 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag24 = new examples.MaxBag(intList18);
        java.lang.Integer int25 = maxBag24.getMax();
        maxBag24.remove((java.lang.Integer) (-1));
        java.lang.Integer int28 = maxBag24.getMax();
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test227");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.remove((java.lang.Integer) (-1));
        maxBag0.clear();
        java.lang.Integer int4 = maxBag0.getMax();
        maxBag0.clear();
        java.lang.Integer int6 = maxBag0.getMax();
        maxBag0.remove((java.lang.Integer) (-9));
        maxBag0.clear();
        maxBag0.remove((java.lang.Integer) (-5));
        java.lang.Integer int12 = maxBag0.getMax();
        maxBag0.add((java.lang.Integer) 2);
        java.lang.Integer int15 = maxBag0.getMax();
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test228");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.add((java.lang.Integer) (-6));
        maxBag0.remove((java.lang.Integer) 5);
        maxBag0.add((java.lang.Integer) 0);
        maxBag0.add((java.lang.Integer) (-1));
        maxBag0.remove((java.lang.Integer) (-6));
        maxBag0.clear();
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test229");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.clear();
        maxBag0.clear();
        java.lang.Class<?> wildcardClass3 = maxBag0.getClass();
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test230");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.remove((java.lang.Integer) (-1));
        maxBag0.clear();
        java.lang.Integer int4 = maxBag0.getMax();
        maxBag0.clear();
        java.lang.Integer int6 = maxBag0.getMax();
        maxBag0.remove((java.lang.Integer) (-9));
        maxBag0.clear();
        java.lang.Integer int10 = maxBag0.getMax();
        maxBag0.add((java.lang.Integer) (-100));
        java.lang.Integer int13 = maxBag0.getMax();
        java.lang.Class<?> wildcardClass14 = maxBag0.getClass();
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test231");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.remove((java.lang.Integer) (-1));
        maxBag0.clear();
        maxBag0.remove((java.lang.Integer) (-3));
        maxBag0.add((java.lang.Integer) 0);
        maxBag0.remove((java.lang.Integer) 1);
        java.lang.Integer int10 = maxBag0.getMax();
        java.lang.Integer int11 = maxBag0.getMax();
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test232");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        java.lang.Integer int1 = maxBag0.getMax();
        java.lang.Integer int2 = maxBag0.getMax();
        maxBag0.remove((java.lang.Integer) (-5));
        maxBag0.add((java.lang.Integer) 9);
        maxBag0.remove((java.lang.Integer) 1);
        maxBag0.remove((java.lang.Integer) (-10));
        maxBag0.add((java.lang.Integer) (-10));
        java.lang.Integer int13 = maxBag0.getMax();
        maxBag0.add((java.lang.Integer) 0);
        maxBag0.add((java.lang.Integer) (-6));
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test233");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        java.lang.Integer int1 = maxBag0.getMax();
        java.lang.Integer int2 = maxBag0.getMax();
        maxBag0.remove((java.lang.Integer) (-5));
        maxBag0.add((java.lang.Integer) 9);
        maxBag0.remove((java.lang.Integer) 1);
        maxBag0.remove((java.lang.Integer) (-10));
        maxBag0.clear();
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test234");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.remove((java.lang.Integer) (-1));
        maxBag0.clear();
        java.lang.Integer int4 = maxBag0.getMax();
        maxBag0.clear();
        java.lang.Integer int6 = maxBag0.getMax();
        maxBag0.remove((java.lang.Integer) (-9));
        maxBag0.clear();
        maxBag0.remove((java.lang.Integer) 1);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test235");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.remove((java.lang.Integer) (-1));
        maxBag0.clear();
        java.lang.Integer int4 = maxBag0.getMax();
        maxBag0.clear();
        java.lang.Integer int6 = maxBag0.getMax();
        maxBag0.remove((java.lang.Integer) (-9));
        java.lang.Integer int9 = maxBag0.getMax();
        maxBag0.add((java.lang.Integer) 0);
        maxBag0.clear();
        maxBag0.clear();
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test236");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.remove((java.lang.Integer) (-1));
        maxBag0.clear();
        java.lang.Integer int4 = maxBag0.getMax();
        maxBag0.remove((java.lang.Integer) 4);
        java.lang.Integer int7 = maxBag0.getMax();
        maxBag0.remove((java.lang.Integer) (-9));
        java.lang.Integer int10 = maxBag0.getMax();
        maxBag0.add((java.lang.Integer) (-10));
        maxBag0.remove((java.lang.Integer) 7);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test237");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.remove((java.lang.Integer) (-1));
        maxBag0.clear();
        maxBag0.add((java.lang.Integer) 10);
        maxBag0.clear();
        java.lang.Integer int7 = maxBag0.getMax();
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test238");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        java.lang.Integer int1 = maxBag0.getMax();
        java.lang.Integer int2 = maxBag0.getMax();
        maxBag0.remove((java.lang.Integer) (-5));
        maxBag0.remove((java.lang.Integer) 1);
        maxBag0.add((java.lang.Integer) (-6));
        maxBag0.clear();
        java.lang.Class<?> wildcardClass10 = maxBag0.getClass();
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test239");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 0, 100, 10, 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3 };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag22 = new examples.MaxBag(intList18);
        maxBag22.clear();
        maxBag22.remove((java.lang.Integer) 8);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test240");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 9, (-1), 7, (-2), (-10), (-1), 9, 8, (-9), 100, 9, (-6), 4, (-1), (-5), 0, (-5) };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag22 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag23 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag24 = new examples.MaxBag(intList18);
        java.lang.Integer int25 = maxBag24.getMax();
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test241");
        java.lang.Integer[] intArray10 = new java.lang.Integer[] { 0, 100, (-3), 3, 10, (-8), 2, 10, 9, 5 };
        java.util.ArrayList<java.lang.Integer> intList11 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList11, intArray10);
        examples.MaxBag maxBag13 = new examples.MaxBag(intList11);
        maxBag13.add((java.lang.Integer) 2);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test242");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.remove((java.lang.Integer) (-1));
        maxBag0.clear();
        maxBag0.add((java.lang.Integer) 0);
        java.lang.Class<?> wildcardClass6 = maxBag0.getClass();
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test243");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        java.lang.Integer int1 = maxBag0.getMax();
        java.lang.Integer int2 = maxBag0.getMax();
        maxBag0.remove((java.lang.Integer) (-5));
        maxBag0.remove((java.lang.Integer) (-7));
        java.lang.Class<?> wildcardClass7 = maxBag0.getClass();
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test244");
        java.lang.Integer[] intArray26 = new java.lang.Integer[] { (-10), (-100), (-7), (-7), 6, 0, (-10), (-9), (-9), 1, 10, 1, (-2), (-8), 100, 2, 4, 2, 0, (-100), (-100), 1, 9, (-6), (-3), (-6) };
        java.util.ArrayList<java.lang.Integer> intList27 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList27, intArray26);
        examples.MaxBag maxBag29 = new examples.MaxBag(intList27);
        java.lang.Integer int30 = maxBag29.getMax();
        maxBag29.clear();
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test245");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.remove((java.lang.Integer) (-1));
        maxBag0.clear();
        maxBag0.add((java.lang.Integer) 10);
        maxBag0.clear();
        maxBag0.clear();
        java.lang.Integer int8 = maxBag0.getMax();
        maxBag0.remove((java.lang.Integer) 100);
        maxBag0.remove((java.lang.Integer) 1);
        maxBag0.remove((java.lang.Integer) (-7));
        java.lang.Class<?> wildcardClass15 = maxBag0.getClass();
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test246");
        java.lang.Integer[] intArray17 = new java.lang.Integer[] { 0, 100, 10, 0, 100, 5, 1, (-7), (-9), 2, (-6), 1, 5, (-6), (-1), (-1), 3 };
        java.util.ArrayList<java.lang.Integer> intList18 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList18, intArray17);
        examples.MaxBag maxBag20 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag21 = new examples.MaxBag(intList18);
        examples.MaxBag maxBag22 = new examples.MaxBag(intList18);
        maxBag22.add((java.lang.Integer) 4);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test247");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        java.lang.Integer int1 = maxBag0.getMax();
        java.lang.Integer int2 = maxBag0.getMax();
        maxBag0.remove((java.lang.Integer) (-5));
        maxBag0.add((java.lang.Integer) 9);
        maxBag0.remove((java.lang.Integer) 1);
        maxBag0.add((java.lang.Integer) 4);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test248");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        java.lang.Integer int1 = maxBag0.getMax();
        java.lang.Integer int2 = maxBag0.getMax();
        maxBag0.remove((java.lang.Integer) (-5));
        maxBag0.add((java.lang.Integer) 9);
        maxBag0.remove((java.lang.Integer) 1);
        maxBag0.remove((java.lang.Integer) (-10));
        maxBag0.add((java.lang.Integer) 100);
        maxBag0.remove((java.lang.Integer) 3);
        maxBag0.remove((java.lang.Integer) 3);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test249");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.remove((java.lang.Integer) (-1));
        maxBag0.clear();
        java.lang.Integer int4 = maxBag0.getMax();
        maxBag0.remove((java.lang.Integer) (-3));
        java.lang.Integer int7 = maxBag0.getMax();
        java.lang.Integer int8 = maxBag0.getMax();
        maxBag0.remove((java.lang.Integer) 10);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test250");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.remove((java.lang.Integer) (-1));
        maxBag0.clear();
        maxBag0.remove((java.lang.Integer) (-3));
        maxBag0.add((java.lang.Integer) 6);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test251");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.remove((java.lang.Integer) (-1));
        maxBag0.clear();
        java.lang.Integer int4 = maxBag0.getMax();
        maxBag0.clear();
        maxBag0.add((java.lang.Integer) 1);
        java.lang.Integer int8 = maxBag0.getMax();
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test252");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        java.lang.Integer int1 = maxBag0.getMax();
        java.lang.Integer int2 = maxBag0.getMax();
        maxBag0.clear();
        maxBag0.remove((java.lang.Integer) 10);
        maxBag0.remove((java.lang.Integer) (-3));
        java.lang.Integer int8 = maxBag0.getMax();
        maxBag0.clear();
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test253");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.add((java.lang.Integer) (-6));
        maxBag0.add((java.lang.Integer) 100);
        java.lang.Integer int5 = maxBag0.getMax();
        maxBag0.clear();
        maxBag0.clear();
        java.lang.Integer int8 = maxBag0.getMax();
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test254");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        java.lang.Integer int1 = maxBag0.getMax();
        java.lang.Integer int2 = maxBag0.getMax();
        maxBag0.remove((java.lang.Integer) (-5));
        maxBag0.remove((java.lang.Integer) 1);
        maxBag0.remove((java.lang.Integer) (-8));
        maxBag0.remove((java.lang.Integer) 5);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test255");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        java.lang.Integer int1 = maxBag0.getMax();
        java.lang.Integer int2 = maxBag0.getMax();
        maxBag0.remove((java.lang.Integer) (-5));
        maxBag0.add((java.lang.Integer) 9);
        maxBag0.remove((java.lang.Integer) 1);
        maxBag0.remove((java.lang.Integer) (-10));
        maxBag0.add((java.lang.Integer) (-10));
        java.lang.Integer int13 = maxBag0.getMax();
        java.lang.Integer int14 = maxBag0.getMax();
        java.lang.Class<?> wildcardClass15 = maxBag0.getClass();
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MaxBagTester0.test256");
        examples.MaxBag maxBag0 = new examples.MaxBag();
        maxBag0.remove((java.lang.Integer) (-1));
        maxBag0.clear();
        java.lang.Integer int4 = maxBag0.getMax();
        maxBag0.remove((java.lang.Integer) 6);
    }
}

