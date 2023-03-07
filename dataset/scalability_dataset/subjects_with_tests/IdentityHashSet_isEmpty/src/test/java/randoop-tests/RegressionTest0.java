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
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet0 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>();
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet1 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Object[] objArray2 = strComparableSet1.toArray();
        strComparableSet1.clear();
        boolean boolean5 = strComparableSet1.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream6 = strComparableSet1.parallelStream();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor7 = strComparableSet1.iterator();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strComparableStream6);
        org.junit.Assert.assertNotNull(strComparableItor7);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet1 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Object[] objArray2 = strComparableSet1.toArray();
        strComparableSet1.clear();
        boolean boolean5 = strComparableSet1.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream6 = strComparableSet1.parallelStream();
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet8 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean9 = strComparableSet8.isEmpty();
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet11 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Object obj12 = strComparableSet11.clone();
        boolean boolean13 = strComparableSet8.equals(obj12);
        boolean boolean14 = strComparableSet1.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet8);
        java.lang.Class<?> wildcardClass15 = strComparableSet1.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strComparableStream6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet1 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Object[] objArray2 = strComparableSet1.toArray();
        strComparableSet1.clear();
        boolean boolean5 = strComparableSet1.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream6 = strComparableSet1.parallelStream();
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet8 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean9 = strComparableSet8.isEmpty();
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet11 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Object obj12 = strComparableSet11.clone();
        boolean boolean13 = strComparableSet8.equals(obj12);
        boolean boolean14 = strComparableSet1.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet8);
        java.util.stream.BaseStream<java.lang.Comparable<java.lang.String>, java.util.stream.Stream<java.lang.Comparable<java.lang.String>>>[] strComparableBaseStreamArray15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.BaseStream<java.lang.Comparable<java.lang.String>, java.util.stream.Stream<java.lang.Comparable<java.lang.String>>>[] strComparableBaseStreamArray16 = strComparableSet1.toArray(strComparableBaseStreamArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strComparableStream6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        org.leplus.ristretto.util.IdentityHashSet<java.lang.AutoCloseable> autoCloseableSet0 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.AutoCloseable>();
        java.lang.Class<?> wildcardClass1 = autoCloseableSet0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet1 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Object[] objArray2 = strComparableSet1.toArray();
        strComparableSet1.clear();
        boolean boolean5 = strComparableSet1.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream6 = strComparableSet1.parallelStream();
        java.lang.Class<?> wildcardClass7 = strComparableStream6.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strComparableStream6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet1 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Object[] objArray2 = strComparableSet1.toArray();
        strComparableSet1.clear();
        boolean boolean5 = strComparableSet1.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream6 = strComparableSet1.parallelStream();
        strComparableSet1.clear();
        boolean boolean9 = strComparableSet1.equals((java.lang.Object) 'a');
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strComparableStream6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet1 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Object[] objArray2 = strComparableSet1.toArray();
        strComparableSet1.clear();
        boolean boolean5 = strComparableSet1.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream6 = strComparableSet1.parallelStream();
        int int7 = strComparableSet1.size();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strComparableStream6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet1 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Object[] objArray2 = strComparableSet1.toArray();
        strComparableSet1.clear();
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet5 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean6 = strComparableSet5.isEmpty();
        boolean boolean7 = strComparableSet1.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet5);
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet9 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Object[] objArray10 = strComparableSet9.toArray();
        boolean boolean11 = strComparableSet1.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet9);
        boolean boolean13 = strComparableSet1.add((java.lang.Comparable<java.lang.String>) "hi!");
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet15 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Object[] objArray16 = strComparableSet15.toArray();
        strComparableSet15.clear();
        boolean boolean19 = strComparableSet15.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream20 = strComparableSet15.parallelStream();
        strComparableSet15.clear();
        boolean boolean22 = strComparableSet1.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet15);
        boolean boolean24 = strComparableSet15.add((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(strComparableStream20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet1 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Object[] objArray2 = strComparableSet1.toArray();
        strComparableSet1.clear();
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet5 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean6 = strComparableSet5.isEmpty();
        boolean boolean7 = strComparableSet1.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet5);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream8 = strComparableSet1.stream();
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet10 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Object[] objArray11 = strComparableSet10.toArray();
        strComparableSet10.clear();
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet14 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean15 = strComparableSet14.isEmpty();
        boolean boolean16 = strComparableSet10.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet14);
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet18 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Object[] objArray19 = strComparableSet18.toArray();
        boolean boolean20 = strComparableSet10.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet18);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet22 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean23 = strComparableSet22.add((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator24 = strComparableSet22.spliterator();
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet26 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean27 = strComparableSet26.add((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator28 = strComparableSet26.spliterator();
        java.util.HashSet[] hashSetArray30 = new java.util.HashSet[2];
        @SuppressWarnings("unchecked")
        java.util.HashSet<java.lang.Comparable<java.lang.String>>[] strComparableSetArray31 = (java.util.HashSet<java.lang.Comparable<java.lang.String>>[]) hashSetArray30;
        strComparableSetArray31[0] = strComparableSet22;
        strComparableSetArray31[1] = strComparableSet26;
        java.util.HashSet<java.lang.Comparable<java.lang.String>>[] strComparableSetArray36 = strComparableSet18.toArray(strComparableSetArray31);
        boolean boolean37 = strComparableSet1.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet18);
        java.lang.String str38 = strComparableSet18.toString();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strComparableStream8);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator28);
        org.junit.Assert.assertNotNull(hashSetArray30);
        org.junit.Assert.assertNotNull(strComparableSetArray31);
        org.junit.Assert.assertNotNull(strComparableSetArray36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "[]" + "'", str38, "[]");
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        // The following exception was thrown during execution in test generation
        try {
            org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet1 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: expectedMaxSize is negative: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet1 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Object[] objArray2 = strComparableSet1.toArray();
        strComparableSet1.clear();
        boolean boolean5 = strComparableSet1.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream6 = strComparableSet1.parallelStream();
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet8 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean9 = strComparableSet8.isEmpty();
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet11 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Object obj12 = strComparableSet11.clone();
        boolean boolean13 = strComparableSet8.equals(obj12);
        boolean boolean14 = strComparableSet1.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet8);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream15 = strComparableSet1.stream();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strComparableStream6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strComparableStream15);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet1 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Object obj2 = strComparableSet1.clone();
        boolean boolean4 = strComparableSet1.remove((java.lang.Object) (short) -1);
        boolean boolean5 = strComparableSet1.isEmpty();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Object> objSet1 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Object>((int) ' ');
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet1 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean2 = strComparableSet1.isEmpty();
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet4 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Object obj5 = strComparableSet4.clone();
        boolean boolean6 = strComparableSet1.equals(obj5);
        java.lang.String str7 = strComparableSet1.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet1 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Object[] objArray2 = strComparableSet1.toArray();
        java.lang.Class<?> wildcardClass3 = strComparableSet1.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet1 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>(100);
        java.lang.Object[] objArray2 = strComparableSet1.toArray();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet1 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Object[] objArray2 = strComparableSet1.toArray();
        strComparableSet1.clear();
        boolean boolean5 = strComparableSet1.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Object[] objArray6 = strComparableSet1.toArray();
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet8 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Object[] objArray9 = strComparableSet8.toArray();
        strComparableSet8.clear();
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet12 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean13 = strComparableSet12.isEmpty();
        boolean boolean14 = strComparableSet8.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet12);
        java.lang.String str15 = strComparableSet12.toString();
        boolean boolean16 = strComparableSet1.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet12);
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet18 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Object[] objArray19 = strComparableSet18.toArray();
        strComparableSet18.clear();
        boolean boolean22 = strComparableSet18.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Object[] objArray23 = strComparableSet18.toArray();
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet25 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Object[] objArray26 = strComparableSet25.toArray();
        strComparableSet25.clear();
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet29 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean30 = strComparableSet29.isEmpty();
        boolean boolean31 = strComparableSet25.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet29);
        java.lang.String str32 = strComparableSet29.toString();
        boolean boolean33 = strComparableSet18.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet29);
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet35 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean36 = strComparableSet35.isEmpty();
        boolean boolean38 = strComparableSet35.remove((java.lang.Object) '4');
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream39 = strComparableSet35.parallelStream();
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet41 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Object obj42 = strComparableSet41.clone();
        boolean boolean43 = strComparableSet41.isEmpty();
        boolean boolean44 = strComparableSet35.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet41);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream45 = strComparableSet41.parallelStream();
        boolean boolean46 = strComparableSet18.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet41);
        boolean boolean47 = strComparableSet1.equals((java.lang.Object) strComparableSet18);
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList51 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean52 = strComparableList51.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean53 = strComparableList51.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean54 = strComparableList51.add((java.lang.Comparable<java.lang.String>) "[]");
        boolean boolean55 = strComparableSet1.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableList51);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[hi!]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[]" + "'", str15, "[]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[hi!]");
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "[]" + "'", str32, "[]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(strComparableStream39);
        org.junit.Assert.assertNotNull(obj42);
        org.junit.Assert.assertEquals(obj42.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj42), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj42), "[]");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(strComparableStream45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet1 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Object[] objArray2 = strComparableSet1.toArray();
        strComparableSet1.clear();
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet5 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean6 = strComparableSet5.isEmpty();
        boolean boolean7 = strComparableSet1.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet5);
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet9 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Object[] objArray10 = strComparableSet9.toArray();
        boolean boolean11 = strComparableSet1.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet9);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet13 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean14 = strComparableSet13.add((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator15 = strComparableSet13.spliterator();
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet17 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean18 = strComparableSet17.add((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator19 = strComparableSet17.spliterator();
        java.util.HashSet[] hashSetArray21 = new java.util.HashSet[2];
        @SuppressWarnings("unchecked")
        java.util.HashSet<java.lang.Comparable<java.lang.String>>[] strComparableSetArray22 = (java.util.HashSet<java.lang.Comparable<java.lang.String>>[]) hashSetArray21;
        strComparableSetArray22[0] = strComparableSet13;
        strComparableSetArray22[1] = strComparableSet17;
        java.util.HashSet<java.lang.Comparable<java.lang.String>>[] strComparableSetArray27 = strComparableSet9.toArray(strComparableSetArray22);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator28 = strComparableSet9.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator29 = strComparableSet9.spliterator();
        java.lang.Class<?> wildcardClass30 = strComparableSpliterator29.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator19);
        org.junit.Assert.assertNotNull(hashSetArray21);
        org.junit.Assert.assertNotNull(strComparableSetArray22);
        org.junit.Assert.assertNotNull(strComparableSetArray27);
        org.junit.Assert.assertNotNull(strComparableSpliterator28);
        org.junit.Assert.assertNotNull(strComparableSpliterator29);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet1 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Object[] objArray2 = strComparableSet1.toArray();
        strComparableSet1.clear();
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet5 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean6 = strComparableSet5.isEmpty();
        boolean boolean7 = strComparableSet1.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet5);
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet9 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Object[] objArray10 = strComparableSet9.toArray();
        boolean boolean11 = strComparableSet1.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet9);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet13 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean14 = strComparableSet13.add((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator15 = strComparableSet13.spliterator();
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet17 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean18 = strComparableSet17.add((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator19 = strComparableSet17.spliterator();
        java.util.HashSet[] hashSetArray21 = new java.util.HashSet[2];
        @SuppressWarnings("unchecked")
        java.util.HashSet<java.lang.Comparable<java.lang.String>>[] strComparableSetArray22 = (java.util.HashSet<java.lang.Comparable<java.lang.String>>[]) hashSetArray21;
        strComparableSetArray22[0] = strComparableSet13;
        strComparableSetArray22[1] = strComparableSet17;
        java.util.HashSet<java.lang.Comparable<java.lang.String>>[] strComparableSetArray27 = strComparableSet9.toArray(strComparableSetArray22);
        int int28 = strComparableSet9.size();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator19);
        org.junit.Assert.assertNotNull(hashSetArray21);
        org.junit.Assert.assertNotNull(strComparableSetArray22);
        org.junit.Assert.assertNotNull(strComparableSetArray27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet1 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Object[] objArray2 = strComparableSet1.toArray();
        strComparableSet1.clear();
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet5 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean6 = strComparableSet5.isEmpty();
        boolean boolean7 = strComparableSet1.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet5);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream8 = strComparableSet1.stream();
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet10 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Object[] objArray11 = strComparableSet10.toArray();
        strComparableSet10.clear();
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet14 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean15 = strComparableSet14.isEmpty();
        boolean boolean16 = strComparableSet10.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet14);
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet18 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Object[] objArray19 = strComparableSet18.toArray();
        boolean boolean20 = strComparableSet10.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet18);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet22 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean23 = strComparableSet22.add((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator24 = strComparableSet22.spliterator();
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet26 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean27 = strComparableSet26.add((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator28 = strComparableSet26.spliterator();
        java.util.HashSet[] hashSetArray30 = new java.util.HashSet[2];
        @SuppressWarnings("unchecked")
        java.util.HashSet<java.lang.Comparable<java.lang.String>>[] strComparableSetArray31 = (java.util.HashSet<java.lang.Comparable<java.lang.String>>[]) hashSetArray30;
        strComparableSetArray31[0] = strComparableSet22;
        strComparableSetArray31[1] = strComparableSet26;
        java.util.HashSet<java.lang.Comparable<java.lang.String>>[] strComparableSetArray36 = strComparableSet18.toArray(strComparableSetArray31);
        boolean boolean37 = strComparableSet1.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet18);
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet39 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Object obj40 = strComparableSet39.clone();
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet42 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Object[] objArray43 = strComparableSet42.toArray();
        boolean boolean44 = strComparableSet39.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet42);
        boolean boolean45 = strComparableSet42.isEmpty();
        strComparableSet42.clear();
        boolean boolean47 = strComparableSet18.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet42);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strComparableStream8);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator28);
        org.junit.Assert.assertNotNull(hashSetArray30);
        org.junit.Assert.assertNotNull(strComparableSetArray31);
        org.junit.Assert.assertNotNull(strComparableSetArray36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertEquals(obj40.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj40), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj40), "[]");
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray43), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray43), "[]");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet1 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Object[] objArray2 = strComparableSet1.toArray();
        strComparableSet1.clear();
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet5 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean6 = strComparableSet5.isEmpty();
        boolean boolean7 = strComparableSet1.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet5);
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet9 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Object[] objArray10 = strComparableSet9.toArray();
        strComparableSet9.clear();
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet13 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean14 = strComparableSet13.isEmpty();
        boolean boolean15 = strComparableSet9.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet13);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream16 = strComparableSet9.stream();
        boolean boolean17 = strComparableSet1.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet9);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(strComparableStream16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet1 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean2 = strComparableSet1.isEmpty();
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet4 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Object[] objArray5 = strComparableSet4.toArray();
        strComparableSet4.clear();
        boolean boolean8 = strComparableSet4.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream9 = strComparableSet4.parallelStream();
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet11 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean12 = strComparableSet11.isEmpty();
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet14 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Object obj15 = strComparableSet14.clone();
        boolean boolean16 = strComparableSet11.equals(obj15);
        boolean boolean17 = strComparableSet4.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet11);
        boolean boolean18 = strComparableSet1.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet11);
        java.lang.Class<?> wildcardClass19 = strComparableSet1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strComparableStream9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "[]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet1 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.util.List[] listArray3 = new java.util.List[0];
        @SuppressWarnings("unchecked")
        java.util.List<java.lang.Comparable<java.lang.String>>[] strComparableListArray4 = (java.util.List<java.lang.Comparable<java.lang.String>>[]) listArray3;
        java.util.List<java.lang.Comparable<java.lang.String>>[] strComparableListArray5 = strComparableSet1.toArray((java.util.List<java.lang.Comparable<java.lang.String>>[]) listArray3);
        org.junit.Assert.assertNotNull(listArray3);
        org.junit.Assert.assertNotNull(strComparableListArray4);
        org.junit.Assert.assertNotNull(strComparableListArray5);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet1 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Object[] objArray2 = strComparableSet1.toArray();
        strComparableSet1.clear();
        boolean boolean5 = strComparableSet1.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Object[] objArray6 = strComparableSet1.toArray();
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet8 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Object[] objArray9 = strComparableSet8.toArray();
        strComparableSet8.clear();
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet12 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean13 = strComparableSet12.isEmpty();
        boolean boolean14 = strComparableSet8.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet12);
        java.lang.String str15 = strComparableSet12.toString();
        boolean boolean16 = strComparableSet1.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet12);
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet18 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean19 = strComparableSet18.isEmpty();
        boolean boolean21 = strComparableSet18.remove((java.lang.Object) '4');
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream22 = strComparableSet18.parallelStream();
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet24 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Object obj25 = strComparableSet24.clone();
        boolean boolean26 = strComparableSet24.isEmpty();
        boolean boolean27 = strComparableSet18.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet24);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream28 = strComparableSet24.parallelStream();
        boolean boolean29 = strComparableSet1.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet24);
        java.lang.Class<?> wildcardClass30 = strComparableSet1.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[hi!]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[]" + "'", str15, "[]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strComparableStream22);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertEquals(obj25.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj25), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj25), "[]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(strComparableStream28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet1 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Object[] objArray2 = strComparableSet1.toArray();
        strComparableSet1.clear();
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet5 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean6 = strComparableSet5.isEmpty();
        boolean boolean7 = strComparableSet1.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet5);
        boolean boolean9 = strComparableSet5.add((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Object[]> objArraySet1 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Object[]>((int) (short) 1);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet1 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Object obj2 = strComparableSet1.clone();
        boolean boolean3 = strComparableSet1.isEmpty();
        org.leplus.ristretto.util.IdentityHashSet<java.util.AbstractSet<java.lang.Comparable<java.lang.String>>> strComparableSetSet5 = new org.leplus.ristretto.util.IdentityHashSet<java.util.AbstractSet<java.lang.Comparable<java.lang.String>>>(0);
        boolean boolean6 = strComparableSet1.equals((java.lang.Object) 0);
        strComparableSet1.clear();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet1 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>(10);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet1 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Object obj2 = strComparableSet1.clone();
        boolean boolean3 = strComparableSet1.isEmpty();
        org.leplus.ristretto.util.IdentityHashSet<java.util.AbstractSet<java.lang.Comparable<java.lang.String>>> strComparableSetSet5 = new org.leplus.ristretto.util.IdentityHashSet<java.util.AbstractSet<java.lang.Comparable<java.lang.String>>>(0);
        boolean boolean6 = strComparableSet1.equals((java.lang.Object) 0);
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet8 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Object[] objArray9 = strComparableSet8.toArray();
        strComparableSet8.clear();
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet12 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean13 = strComparableSet12.isEmpty();
        boolean boolean14 = strComparableSet8.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet12);
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet16 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Object[] objArray17 = strComparableSet16.toArray();
        boolean boolean18 = strComparableSet8.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet16);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet20 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean21 = strComparableSet20.add((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator22 = strComparableSet20.spliterator();
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet24 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean25 = strComparableSet24.add((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator26 = strComparableSet24.spliterator();
        java.util.HashSet[] hashSetArray28 = new java.util.HashSet[2];
        @SuppressWarnings("unchecked")
        java.util.HashSet<java.lang.Comparable<java.lang.String>>[] strComparableSetArray29 = (java.util.HashSet<java.lang.Comparable<java.lang.String>>[]) hashSetArray28;
        strComparableSetArray29[0] = strComparableSet20;
        strComparableSetArray29[1] = strComparableSet24;
        java.util.HashSet<java.lang.Comparable<java.lang.String>>[] strComparableSetArray34 = strComparableSet16.toArray(strComparableSetArray29);
        java.util.Collection<java.lang.Comparable<java.lang.String>>[] strComparableCollectionArray35 = strComparableSet1.toArray((java.util.Collection<java.lang.Comparable<java.lang.String>>[]) strComparableSetArray29);
        java.lang.Object[] objArray36 = strComparableSet1.toArray();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator26);
        org.junit.Assert.assertNotNull(hashSetArray28);
        org.junit.Assert.assertNotNull(strComparableSetArray29);
        org.junit.Assert.assertNotNull(strComparableSetArray34);
        org.junit.Assert.assertNotNull(strComparableCollectionArray35);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[]");
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet2 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableSet2.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableSet2.add((java.lang.Comparable<java.lang.String>) "[]");
        boolean boolean6 = strComparableSet2.add((java.lang.Comparable<java.lang.String>) "");
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet8 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Object[] objArray9 = strComparableSet8.toArray();
        boolean boolean10 = strComparableSet2.contains((java.lang.Object) objArray9);
        java.lang.Object obj11 = strComparableSet2.clone();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(obj11);
// flaky:         org.junit.Assert.assertEquals(obj11.toString(), "[, []]");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "[, []]");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "[, []]");
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet1 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean2 = strComparableSet1.isEmpty();
        boolean boolean4 = strComparableSet1.remove((java.lang.Object) '4');
        boolean boolean6 = strComparableSet1.equals((java.lang.Object) (short) -1);
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet7 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet1);
        java.lang.Class<?> wildcardClass8 = strComparableSet1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet1 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Object obj2 = strComparableSet1.clone();
        boolean boolean3 = strComparableSet1.isEmpty();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor4 = strComparableSet1.iterator();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strComparableItor4);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet1 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Object[] objArray2 = strComparableSet1.toArray();
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet4 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Object[] objArray5 = strComparableSet4.toArray();
        strComparableSet4.clear();
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet8 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean9 = strComparableSet8.isEmpty();
        boolean boolean10 = strComparableSet4.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet8);
        java.lang.String str11 = strComparableSet8.toString();
        strComparableSet8.clear();
        boolean boolean13 = strComparableSet1.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet8);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet1 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Object obj2 = strComparableSet1.clone();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream3 = strComparableSet1.stream();
        boolean boolean4 = strComparableSet1.isEmpty();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "[]");
        org.junit.Assert.assertNotNull(strComparableStream3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet1 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Object[] objArray2 = strComparableSet1.toArray();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor3 = strComparableSet1.iterator();
        strComparableSet1.clear();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(strComparableItor3);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet1 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Object[] objArray2 = strComparableSet1.toArray();
        strComparableSet1.clear();
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet5 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean6 = strComparableSet5.isEmpty();
        boolean boolean7 = strComparableSet1.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet5);
        boolean boolean9 = strComparableSet5.contains((java.lang.Object) "hi!");
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet11 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Object[] objArray12 = strComparableSet11.toArray();
        strComparableSet11.clear();
        boolean boolean15 = strComparableSet11.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Object[] objArray16 = strComparableSet11.toArray();
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet18 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Object[] objArray19 = strComparableSet18.toArray();
        strComparableSet18.clear();
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet22 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean23 = strComparableSet22.isEmpty();
        boolean boolean24 = strComparableSet18.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet22);
        java.lang.String str25 = strComparableSet22.toString();
        boolean boolean26 = strComparableSet11.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet22);
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet28 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Object[] objArray29 = strComparableSet28.toArray();
        strComparableSet28.clear();
        boolean boolean32 = strComparableSet28.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Object[] objArray33 = strComparableSet28.toArray();
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet35 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Object[] objArray36 = strComparableSet35.toArray();
        strComparableSet35.clear();
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet39 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean40 = strComparableSet39.isEmpty();
        boolean boolean41 = strComparableSet35.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet39);
        java.lang.String str42 = strComparableSet39.toString();
        boolean boolean43 = strComparableSet28.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet39);
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet45 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean46 = strComparableSet45.isEmpty();
        boolean boolean48 = strComparableSet45.remove((java.lang.Object) '4');
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream49 = strComparableSet45.parallelStream();
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet51 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Object obj52 = strComparableSet51.clone();
        boolean boolean53 = strComparableSet51.isEmpty();
        boolean boolean54 = strComparableSet45.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet51);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream55 = strComparableSet51.parallelStream();
        boolean boolean56 = strComparableSet28.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet51);
        boolean boolean57 = strComparableSet11.equals((java.lang.Object) strComparableSet28);
        boolean boolean58 = strComparableSet5.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet11);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[hi!]");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "[]" + "'", str25, "[]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[hi!]");
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "[]" + "'", str42, "[]");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(strComparableStream49);
        org.junit.Assert.assertNotNull(obj52);
        org.junit.Assert.assertEquals(obj52.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj52), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj52), "[]");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(strComparableStream55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet1 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Object[] objArray2 = strComparableSet1.toArray();
        strComparableSet1.clear();
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet5 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean6 = strComparableSet5.isEmpty();
        boolean boolean7 = strComparableSet1.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet5);
        boolean boolean8 = strComparableSet5.isEmpty();
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet10 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Object[] objArray11 = strComparableSet10.toArray();
        strComparableSet10.clear();
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet14 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean15 = strComparableSet14.isEmpty();
        boolean boolean16 = strComparableSet10.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet14);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream17 = strComparableSet10.stream();
        java.lang.Object obj18 = strComparableSet10.clone();
        boolean boolean19 = strComparableSet5.equals(obj18);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator20 = strComparableSet5.spliterator();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strComparableStream17);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertEquals(obj18.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj18), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj18), "[]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator20);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        // The following exception was thrown during execution in test generation
        try {
            org.leplus.ristretto.util.IdentityHashSet<java.util.AbstractList<java.lang.Comparable<java.lang.String>>> strComparableListSet1 = new org.leplus.ristretto.util.IdentityHashSet<java.util.AbstractList<java.lang.Comparable<java.lang.String>>>((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: expectedMaxSize is negative: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet1 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean2 = strComparableSet1.isEmpty();
        boolean boolean4 = strComparableSet1.remove((java.lang.Object) '4');
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream5 = strComparableSet1.parallelStream();
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet7 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Object obj8 = strComparableSet7.clone();
        boolean boolean9 = strComparableSet7.isEmpty();
        boolean boolean10 = strComparableSet1.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet7);
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet12 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Object[] objArray13 = strComparableSet12.toArray();
        strComparableSet12.clear();
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet16 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean17 = strComparableSet16.isEmpty();
        boolean boolean18 = strComparableSet12.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet16);
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet20 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Object[] objArray21 = strComparableSet20.toArray();
        boolean boolean22 = strComparableSet12.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet20);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet24 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean25 = strComparableSet24.add((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator26 = strComparableSet24.spliterator();
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet28 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean29 = strComparableSet28.add((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator30 = strComparableSet28.spliterator();
        java.util.HashSet[] hashSetArray32 = new java.util.HashSet[2];
        @SuppressWarnings("unchecked")
        java.util.HashSet<java.lang.Comparable<java.lang.String>>[] strComparableSetArray33 = (java.util.HashSet<java.lang.Comparable<java.lang.String>>[]) hashSetArray32;
        strComparableSetArray33[0] = strComparableSet24;
        strComparableSetArray33[1] = strComparableSet28;
        java.util.HashSet<java.lang.Comparable<java.lang.String>>[] strComparableSetArray38 = strComparableSet20.toArray(strComparableSetArray33);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator39 = strComparableSet20.spliterator();
        boolean boolean40 = strComparableSet7.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet20);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream41 = strComparableSet20.stream();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strComparableStream5);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator30);
        org.junit.Assert.assertNotNull(hashSetArray32);
        org.junit.Assert.assertNotNull(strComparableSetArray33);
        org.junit.Assert.assertNotNull(strComparableSetArray38);
        org.junit.Assert.assertNotNull(strComparableSpliterator39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(strComparableStream41);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet3 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean4 = strComparableSet3.add((java.lang.Comparable<java.lang.String>) "[]");
        boolean boolean5 = strComparableSet3.add((java.lang.Comparable<java.lang.String>) "[]");
        boolean boolean6 = strComparableSet3.add((java.lang.Comparable<java.lang.String>) "hi!");
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet8 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Object[] objArray9 = strComparableSet8.toArray();
        strComparableSet8.clear();
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet12 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean13 = strComparableSet12.isEmpty();
        boolean boolean14 = strComparableSet8.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet12);
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet16 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Object[] objArray17 = strComparableSet16.toArray();
        strComparableSet16.clear();
        boolean boolean20 = strComparableSet16.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream21 = strComparableSet16.parallelStream();
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet23 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean24 = strComparableSet23.isEmpty();
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet26 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Object obj27 = strComparableSet26.clone();
        boolean boolean28 = strComparableSet23.equals(obj27);
        boolean boolean29 = strComparableSet16.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet23);
        boolean boolean30 = strComparableSet8.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet16);
        boolean boolean31 = strComparableSet3.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet8);
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet33 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Object[] objArray34 = strComparableSet33.toArray();
        strComparableSet33.clear();
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet37 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean38 = strComparableSet37.isEmpty();
        boolean boolean39 = strComparableSet33.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet37);
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet41 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Object[] objArray42 = strComparableSet41.toArray();
        boolean boolean43 = strComparableSet33.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet41);
        boolean boolean45 = strComparableSet33.add((java.lang.Comparable<java.lang.String>) "hi!");
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet47 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Object[] objArray48 = strComparableSet47.toArray();
        strComparableSet47.clear();
        boolean boolean51 = strComparableSet47.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream52 = strComparableSet47.parallelStream();
        strComparableSet47.clear();
        boolean boolean54 = strComparableSet33.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet47);
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet56 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Object[] objArray57 = strComparableSet56.toArray();
        strComparableSet56.clear();
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet60 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean61 = strComparableSet60.isEmpty();
        boolean boolean62 = strComparableSet56.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet60);
        java.lang.String str63 = strComparableSet60.toString();
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet64 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet60);
        boolean boolean65 = strComparableSet47.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet60);
        boolean boolean66 = strComparableSet8.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet60);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(strComparableStream21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertEquals(obj27.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj27), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj27), "[]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[]");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray48), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray48), "[]");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(strComparableStream52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray57), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray57), "[]");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "[]" + "'", str63, "[]");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet1 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Object[] objArray2 = strComparableSet1.toArray();
        strComparableSet1.clear();
        boolean boolean5 = strComparableSet1.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream6 = strComparableSet1.parallelStream();
        java.lang.Object obj7 = strComparableSet1.clone();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strComparableStream6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "[hi!]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "[hi!]");
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet1 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Object[] objArray2 = strComparableSet1.toArray();
        strComparableSet1.clear();
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet5 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean6 = strComparableSet5.isEmpty();
        boolean boolean7 = strComparableSet1.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet5);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream8 = strComparableSet1.stream();
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet10 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Object[] objArray11 = strComparableSet10.toArray();
        strComparableSet10.clear();
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet14 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean15 = strComparableSet14.isEmpty();
        boolean boolean16 = strComparableSet10.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet14);
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet18 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Object[] objArray19 = strComparableSet18.toArray();
        boolean boolean20 = strComparableSet10.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet18);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet22 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean23 = strComparableSet22.add((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator24 = strComparableSet22.spliterator();
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet26 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean27 = strComparableSet26.add((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator28 = strComparableSet26.spliterator();
        java.util.HashSet[] hashSetArray30 = new java.util.HashSet[2];
        @SuppressWarnings("unchecked")
        java.util.HashSet<java.lang.Comparable<java.lang.String>>[] strComparableSetArray31 = (java.util.HashSet<java.lang.Comparable<java.lang.String>>[]) hashSetArray30;
        strComparableSetArray31[0] = strComparableSet22;
        strComparableSetArray31[1] = strComparableSet26;
        java.util.HashSet<java.lang.Comparable<java.lang.String>>[] strComparableSetArray36 = strComparableSet18.toArray(strComparableSetArray31);
        boolean boolean37 = strComparableSet1.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet18);
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet38 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet1);
        java.lang.Object[] objArray39 = strComparableSet1.toArray();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strComparableStream8);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator28);
        org.junit.Assert.assertNotNull(hashSetArray30);
        org.junit.Assert.assertNotNull(strComparableSetArray31);
        org.junit.Assert.assertNotNull(strComparableSetArray36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[]");
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet1 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Object[] objArray2 = strComparableSet1.toArray();
        strComparableSet1.clear();
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet5 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean6 = strComparableSet5.isEmpty();
        boolean boolean7 = strComparableSet1.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet5);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream8 = strComparableSet1.stream();
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet10 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Object[] objArray11 = strComparableSet10.toArray();
        strComparableSet10.clear();
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet14 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean15 = strComparableSet14.isEmpty();
        boolean boolean16 = strComparableSet10.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet14);
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet18 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Object[] objArray19 = strComparableSet18.toArray();
        boolean boolean20 = strComparableSet10.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet18);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet22 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean23 = strComparableSet22.add((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator24 = strComparableSet22.spliterator();
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet26 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean27 = strComparableSet26.add((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator28 = strComparableSet26.spliterator();
        java.util.HashSet[] hashSetArray30 = new java.util.HashSet[2];
        @SuppressWarnings("unchecked")
        java.util.HashSet<java.lang.Comparable<java.lang.String>>[] strComparableSetArray31 = (java.util.HashSet<java.lang.Comparable<java.lang.String>>[]) hashSetArray30;
        strComparableSetArray31[0] = strComparableSet22;
        strComparableSetArray31[1] = strComparableSet26;
        java.util.HashSet<java.lang.Comparable<java.lang.String>>[] strComparableSetArray36 = strComparableSet18.toArray(strComparableSetArray31);
        boolean boolean37 = strComparableSet1.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet18);
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet38 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet1);
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet40 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Object obj41 = strComparableSet40.clone();
        boolean boolean42 = strComparableSet40.isEmpty();
        org.leplus.ristretto.util.IdentityHashSet<java.util.AbstractSet<java.lang.Comparable<java.lang.String>>> strComparableSetSet44 = new org.leplus.ristretto.util.IdentityHashSet<java.util.AbstractSet<java.lang.Comparable<java.lang.String>>>(0);
        boolean boolean45 = strComparableSet40.equals((java.lang.Object) 0);
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet47 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Object[] objArray48 = strComparableSet47.toArray();
        strComparableSet47.clear();
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet51 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean52 = strComparableSet51.isEmpty();
        boolean boolean53 = strComparableSet47.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet51);
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet55 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Object[] objArray56 = strComparableSet55.toArray();
        boolean boolean57 = strComparableSet47.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet55);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet59 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean60 = strComparableSet59.add((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator61 = strComparableSet59.spliterator();
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet63 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean64 = strComparableSet63.add((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator65 = strComparableSet63.spliterator();
        java.util.HashSet[] hashSetArray67 = new java.util.HashSet[2];
        @SuppressWarnings("unchecked")
        java.util.HashSet<java.lang.Comparable<java.lang.String>>[] strComparableSetArray68 = (java.util.HashSet<java.lang.Comparable<java.lang.String>>[]) hashSetArray67;
        strComparableSetArray68[0] = strComparableSet59;
        strComparableSetArray68[1] = strComparableSet63;
        java.util.HashSet<java.lang.Comparable<java.lang.String>>[] strComparableSetArray73 = strComparableSet55.toArray(strComparableSetArray68);
        java.util.Collection<java.lang.Comparable<java.lang.String>>[] strComparableCollectionArray74 = strComparableSet40.toArray((java.util.Collection<java.lang.Comparable<java.lang.String>>[]) strComparableSetArray68);
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet76 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Object obj77 = strComparableSet76.clone();
        boolean boolean78 = strComparableSet40.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet76);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream79 = strComparableSet76.stream();
        boolean boolean80 = strComparableSet1.contains((java.lang.Object) strComparableStream79);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strComparableStream8);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator28);
        org.junit.Assert.assertNotNull(hashSetArray30);
        org.junit.Assert.assertNotNull(strComparableSetArray31);
        org.junit.Assert.assertNotNull(strComparableSetArray36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertEquals(obj41.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj41), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj41), "[]");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray48), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray48), "[]");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray56), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray56), "[]");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator61);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator65);
        org.junit.Assert.assertNotNull(hashSetArray67);
        org.junit.Assert.assertNotNull(strComparableSetArray68);
        org.junit.Assert.assertNotNull(strComparableSetArray73);
        org.junit.Assert.assertNotNull(strComparableCollectionArray74);
        org.junit.Assert.assertNotNull(obj77);
        org.junit.Assert.assertEquals(obj77.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj77), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj77), "[]");
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(strComparableStream79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet2 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean3 = strComparableSet2.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableSet2.add((java.lang.Comparable<java.lang.String>) "[]");
        boolean boolean6 = strComparableSet2.add((java.lang.Comparable<java.lang.String>) "");
        strComparableSet2.clear();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet1 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Object[] objArray2 = strComparableSet1.toArray();
        strComparableSet1.clear();
        boolean boolean5 = strComparableSet1.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean6 = strComparableSet1.isEmpty();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet1 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Object[] objArray2 = strComparableSet1.toArray();
        strComparableSet1.clear();
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet5 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean6 = strComparableSet5.isEmpty();
        boolean boolean7 = strComparableSet1.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet5);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream8 = strComparableSet1.stream();
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet10 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Object[] objArray11 = strComparableSet10.toArray();
        strComparableSet10.clear();
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet14 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean15 = strComparableSet14.isEmpty();
        boolean boolean16 = strComparableSet10.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet14);
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet18 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Object[] objArray19 = strComparableSet18.toArray();
        boolean boolean20 = strComparableSet10.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet18);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet22 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean23 = strComparableSet22.add((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator24 = strComparableSet22.spliterator();
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet26 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean27 = strComparableSet26.add((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator28 = strComparableSet26.spliterator();
        java.util.HashSet[] hashSetArray30 = new java.util.HashSet[2];
        @SuppressWarnings("unchecked")
        java.util.HashSet<java.lang.Comparable<java.lang.String>>[] strComparableSetArray31 = (java.util.HashSet<java.lang.Comparable<java.lang.String>>[]) hashSetArray30;
        strComparableSetArray31[0] = strComparableSet22;
        strComparableSetArray31[1] = strComparableSet26;
        java.util.HashSet<java.lang.Comparable<java.lang.String>>[] strComparableSetArray36 = strComparableSet18.toArray(strComparableSetArray31);
        boolean boolean37 = strComparableSet1.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet18);
        java.lang.Object obj38 = null;
        boolean boolean39 = strComparableSet18.contains(obj38);
        boolean boolean40 = strComparableSet18.isEmpty();
        java.lang.String str41 = strComparableSet18.toString();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strComparableStream8);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator28);
        org.junit.Assert.assertNotNull(hashSetArray30);
        org.junit.Assert.assertNotNull(strComparableSetArray31);
        org.junit.Assert.assertNotNull(strComparableSetArray36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "[]" + "'", str41, "[]");
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet1 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Object[] objArray2 = strComparableSet1.toArray();
        strComparableSet1.clear();
        boolean boolean5 = strComparableSet1.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Object[] objArray6 = strComparableSet1.toArray();
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet8 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Object[] objArray9 = strComparableSet8.toArray();
        strComparableSet8.clear();
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet12 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean13 = strComparableSet12.isEmpty();
        boolean boolean14 = strComparableSet8.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet12);
        java.lang.String str15 = strComparableSet12.toString();
        boolean boolean16 = strComparableSet1.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet12);
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet18 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Object[] objArray19 = strComparableSet18.toArray();
        strComparableSet18.clear();
        boolean boolean22 = strComparableSet18.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Object[] objArray23 = strComparableSet18.toArray();
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet25 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Object[] objArray26 = strComparableSet25.toArray();
        strComparableSet25.clear();
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet29 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean30 = strComparableSet29.isEmpty();
        boolean boolean31 = strComparableSet25.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet29);
        java.lang.String str32 = strComparableSet29.toString();
        boolean boolean33 = strComparableSet18.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet29);
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet35 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean36 = strComparableSet35.isEmpty();
        boolean boolean38 = strComparableSet35.remove((java.lang.Object) '4');
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream39 = strComparableSet35.parallelStream();
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet41 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Object obj42 = strComparableSet41.clone();
        boolean boolean43 = strComparableSet41.isEmpty();
        boolean boolean44 = strComparableSet35.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet41);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream45 = strComparableSet41.parallelStream();
        boolean boolean46 = strComparableSet18.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet41);
        boolean boolean47 = strComparableSet1.equals((java.lang.Object) strComparableSet18);
        boolean boolean49 = strComparableSet18.contains((java.lang.Object) (byte) 10);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[hi!]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[]" + "'", str15, "[]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[hi!]");
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "[]" + "'", str32, "[]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(strComparableStream39);
        org.junit.Assert.assertNotNull(obj42);
        org.junit.Assert.assertEquals(obj42.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj42), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj42), "[]");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(strComparableStream45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet1 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Object[] objArray2 = strComparableSet1.toArray();
        strComparableSet1.clear();
        boolean boolean5 = strComparableSet1.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream6 = strComparableSet1.parallelStream();
        strComparableSet1.clear();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream8 = strComparableSet1.parallelStream();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strComparableStream6);
        org.junit.Assert.assertNotNull(strComparableStream8);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet1 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Object[] objArray2 = strComparableSet1.toArray();
        strComparableSet1.clear();
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet5 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean6 = strComparableSet5.isEmpty();
        boolean boolean7 = strComparableSet1.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet5);
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet9 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Object[] objArray10 = strComparableSet9.toArray();
        boolean boolean11 = strComparableSet1.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet9);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet13 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean14 = strComparableSet13.add((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator15 = strComparableSet13.spliterator();
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet17 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean18 = strComparableSet17.add((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator19 = strComparableSet17.spliterator();
        java.util.HashSet[] hashSetArray21 = new java.util.HashSet[2];
        @SuppressWarnings("unchecked")
        java.util.HashSet<java.lang.Comparable<java.lang.String>>[] strComparableSetArray22 = (java.util.HashSet<java.lang.Comparable<java.lang.String>>[]) hashSetArray21;
        strComparableSetArray22[0] = strComparableSet13;
        strComparableSetArray22[1] = strComparableSet17;
        java.util.HashSet<java.lang.Comparable<java.lang.String>>[] strComparableSetArray27 = strComparableSet9.toArray(strComparableSetArray22);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator28 = strComparableSet9.spliterator();
        java.lang.Class<?> wildcardClass29 = strComparableSpliterator28.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator19);
        org.junit.Assert.assertNotNull(hashSetArray21);
        org.junit.Assert.assertNotNull(strComparableSetArray22);
        org.junit.Assert.assertNotNull(strComparableSetArray27);
        org.junit.Assert.assertNotNull(strComparableSpliterator28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet1 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean2 = strComparableSet1.isEmpty();
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet4 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Object obj5 = strComparableSet4.clone();
        boolean boolean6 = strComparableSet1.equals(obj5);
        int int7 = strComparableSet1.size();
        java.lang.String str8 = strComparableSet1.toString();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream9 = strComparableSet1.stream();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertNotNull(strComparableStream9);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet1 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean2 = strComparableSet1.isEmpty();
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet4 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Object obj5 = strComparableSet4.clone();
        boolean boolean6 = strComparableSet1.equals(obj5);
        int int7 = strComparableSet1.size();
        java.lang.String str8 = strComparableSet1.toString();
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet10 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Object obj11 = strComparableSet10.clone();
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet13 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Object[] objArray14 = strComparableSet13.toArray();
        boolean boolean15 = strComparableSet10.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet13);
        boolean boolean16 = strComparableSet13.isEmpty();
        boolean boolean17 = strComparableSet1.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet13);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "[]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test53");
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet1 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean2 = strComparableSet1.isEmpty();
        boolean boolean4 = strComparableSet1.remove((java.lang.Object) '4');
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet6 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Object obj7 = strComparableSet6.clone();
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet9 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Object[] objArray10 = strComparableSet9.toArray();
        boolean boolean11 = strComparableSet6.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet9);
        boolean boolean12 = strComparableSet9.isEmpty();
        strComparableSet9.clear();
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet15 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean16 = strComparableSet15.add((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator17 = strComparableSet15.spliterator();
        boolean boolean18 = strComparableSet9.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet15);
        boolean boolean19 = strComparableSet1.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet9);
        java.lang.String str20 = strComparableSet9.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "[]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[]" + "'", str20, "[]");
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test54");
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet1 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Object[] objArray2 = strComparableSet1.toArray();
        strComparableSet1.clear();
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet5 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean6 = strComparableSet5.isEmpty();
        boolean boolean7 = strComparableSet1.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet5);
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet9 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Object[] objArray10 = strComparableSet9.toArray();
        boolean boolean11 = strComparableSet1.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet9);
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet13 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Object obj14 = strComparableSet13.clone();
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet16 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Object[] objArray17 = strComparableSet16.toArray();
        boolean boolean18 = strComparableSet13.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet16);
        boolean boolean19 = strComparableSet16.isEmpty();
        strComparableSet16.clear();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream21 = strComparableSet16.stream();
        boolean boolean22 = strComparableSet1.remove((java.lang.Object) strComparableSet16);
        boolean boolean23 = strComparableSet1.isEmpty();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "[]");
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(strComparableStream21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test55");
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet1 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean2 = strComparableSet1.isEmpty();
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet4 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Object[] objArray5 = strComparableSet4.toArray();
        strComparableSet4.clear();
        boolean boolean8 = strComparableSet4.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream9 = strComparableSet4.parallelStream();
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet11 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean12 = strComparableSet11.isEmpty();
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet14 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Object obj15 = strComparableSet14.clone();
        boolean boolean16 = strComparableSet11.equals(obj15);
        boolean boolean17 = strComparableSet4.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet11);
        boolean boolean18 = strComparableSet1.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet11);
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet20 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Object[] objArray21 = strComparableSet20.toArray();
        strComparableSet20.clear();
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet24 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean25 = strComparableSet24.isEmpty();
        boolean boolean26 = strComparableSet20.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet24);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream27 = strComparableSet20.stream();
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet29 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Object[] objArray30 = strComparableSet29.toArray();
        strComparableSet29.clear();
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet33 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean34 = strComparableSet33.isEmpty();
        boolean boolean35 = strComparableSet29.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet33);
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet37 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Object[] objArray38 = strComparableSet37.toArray();
        boolean boolean39 = strComparableSet29.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet37);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet41 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean42 = strComparableSet41.add((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator43 = strComparableSet41.spliterator();
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet45 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean46 = strComparableSet45.add((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator47 = strComparableSet45.spliterator();
        java.util.HashSet[] hashSetArray49 = new java.util.HashSet[2];
        @SuppressWarnings("unchecked")
        java.util.HashSet<java.lang.Comparable<java.lang.String>>[] strComparableSetArray50 = (java.util.HashSet<java.lang.Comparable<java.lang.String>>[]) hashSetArray49;
        strComparableSetArray50[0] = strComparableSet41;
        strComparableSetArray50[1] = strComparableSet45;
        java.util.HashSet<java.lang.Comparable<java.lang.String>>[] strComparableSetArray55 = strComparableSet37.toArray(strComparableSetArray50);
        boolean boolean56 = strComparableSet20.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet37);
        boolean boolean57 = strComparableSet11.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet37);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strComparableStream9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "[]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(strComparableStream27);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator43);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator47);
        org.junit.Assert.assertNotNull(hashSetArray49);
        org.junit.Assert.assertNotNull(strComparableSetArray50);
        org.junit.Assert.assertNotNull(strComparableSetArray55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test56");
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet1 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Object[] objArray2 = strComparableSet1.toArray();
        strComparableSet1.clear();
        boolean boolean5 = strComparableSet1.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Object[] objArray6 = strComparableSet1.toArray();
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet8 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Object[] objArray9 = strComparableSet8.toArray();
        strComparableSet8.clear();
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet12 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean13 = strComparableSet12.isEmpty();
        boolean boolean14 = strComparableSet8.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet12);
        java.lang.String str15 = strComparableSet12.toString();
        boolean boolean16 = strComparableSet1.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet12);
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet18 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Object[] objArray19 = strComparableSet18.toArray();
        strComparableSet18.clear();
        boolean boolean22 = strComparableSet18.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream23 = strComparableSet18.parallelStream();
        boolean boolean24 = strComparableSet12.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet18);
        java.lang.Class<?> wildcardClass25 = strComparableSet18.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[hi!]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[]" + "'", str15, "[]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(strComparableStream23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test57");
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet1 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Object[] objArray2 = strComparableSet1.toArray();
        strComparableSet1.clear();
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet5 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean6 = strComparableSet5.isEmpty();
        boolean boolean7 = strComparableSet1.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet5);
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet9 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Object[] objArray10 = strComparableSet9.toArray();
        boolean boolean11 = strComparableSet1.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet9);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet13 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean14 = strComparableSet13.add((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator15 = strComparableSet13.spliterator();
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet17 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean18 = strComparableSet17.add((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator19 = strComparableSet17.spliterator();
        java.util.HashSet[] hashSetArray21 = new java.util.HashSet[2];
        @SuppressWarnings("unchecked")
        java.util.HashSet<java.lang.Comparable<java.lang.String>>[] strComparableSetArray22 = (java.util.HashSet<java.lang.Comparable<java.lang.String>>[]) hashSetArray21;
        strComparableSetArray22[0] = strComparableSet13;
        strComparableSetArray22[1] = strComparableSet17;
        java.util.HashSet<java.lang.Comparable<java.lang.String>>[] strComparableSetArray27 = strComparableSet9.toArray(strComparableSetArray22);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator28 = strComparableSet9.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator29 = strComparableSet9.spliterator();
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet31 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Object[] objArray32 = strComparableSet31.toArray();
        strComparableSet31.clear();
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet35 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean36 = strComparableSet35.isEmpty();
        boolean boolean37 = strComparableSet31.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet35);
        boolean boolean38 = strComparableSet9.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet31);
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet40 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean41 = strComparableSet40.isEmpty();
        boolean boolean43 = strComparableSet40.remove((java.lang.Object) '4');
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream44 = strComparableSet40.parallelStream();
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet46 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Object obj47 = strComparableSet46.clone();
        boolean boolean48 = strComparableSet46.isEmpty();
        boolean boolean49 = strComparableSet40.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet46);
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet51 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Object[] objArray52 = strComparableSet51.toArray();
        strComparableSet51.clear();
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet55 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean56 = strComparableSet55.isEmpty();
        boolean boolean57 = strComparableSet51.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet55);
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet59 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Object[] objArray60 = strComparableSet59.toArray();
        boolean boolean61 = strComparableSet51.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet59);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet63 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean64 = strComparableSet63.add((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator65 = strComparableSet63.spliterator();
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet67 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean68 = strComparableSet67.add((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator69 = strComparableSet67.spliterator();
        java.util.HashSet[] hashSetArray71 = new java.util.HashSet[2];
        @SuppressWarnings("unchecked")
        java.util.HashSet<java.lang.Comparable<java.lang.String>>[] strComparableSetArray72 = (java.util.HashSet<java.lang.Comparable<java.lang.String>>[]) hashSetArray71;
        strComparableSetArray72[0] = strComparableSet63;
        strComparableSetArray72[1] = strComparableSet67;
        java.util.HashSet<java.lang.Comparable<java.lang.String>>[] strComparableSetArray77 = strComparableSet59.toArray(strComparableSetArray72);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator78 = strComparableSet59.spliterator();
        boolean boolean79 = strComparableSet46.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet59);
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet81 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean82 = strComparableSet81.isEmpty();
        boolean boolean84 = strComparableSet81.remove((java.lang.Object) '4');
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream85 = strComparableSet81.parallelStream();
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet87 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Object obj88 = strComparableSet87.clone();
        boolean boolean89 = strComparableSet87.isEmpty();
        boolean boolean90 = strComparableSet81.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet87);
        boolean boolean91 = strComparableSet46.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet81);
        boolean boolean92 = strComparableSet9.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet81);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator19);
        org.junit.Assert.assertNotNull(hashSetArray21);
        org.junit.Assert.assertNotNull(strComparableSetArray22);
        org.junit.Assert.assertNotNull(strComparableSetArray27);
        org.junit.Assert.assertNotNull(strComparableSpliterator28);
        org.junit.Assert.assertNotNull(strComparableSpliterator29);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(strComparableStream44);
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertEquals(obj47.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj47), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj47), "[]");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray52), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray52), "[]");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray60), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray60), "[]");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator65);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator69);
        org.junit.Assert.assertNotNull(hashSetArray71);
        org.junit.Assert.assertNotNull(strComparableSetArray72);
        org.junit.Assert.assertNotNull(strComparableSetArray77);
        org.junit.Assert.assertNotNull(strComparableSpliterator78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(strComparableStream85);
        org.junit.Assert.assertNotNull(obj88);
        org.junit.Assert.assertEquals(obj88.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj88), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj88), "[]");
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test58");
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet1 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Object obj2 = strComparableSet1.clone();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor3 = strComparableSet1.iterator();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "[]");
        org.junit.Assert.assertNotNull(strComparableItor3);
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test59");
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet3 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean4 = strComparableSet3.add((java.lang.Comparable<java.lang.String>) "[]");
        boolean boolean5 = strComparableSet3.add((java.lang.Comparable<java.lang.String>) "[]");
        boolean boolean6 = strComparableSet3.add((java.lang.Comparable<java.lang.String>) "hi!");
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet8 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Object[] objArray9 = strComparableSet8.toArray();
        strComparableSet8.clear();
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet12 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean13 = strComparableSet12.isEmpty();
        boolean boolean14 = strComparableSet8.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet12);
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet16 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Object[] objArray17 = strComparableSet16.toArray();
        strComparableSet16.clear();
        boolean boolean20 = strComparableSet16.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream21 = strComparableSet16.parallelStream();
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet23 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean24 = strComparableSet23.isEmpty();
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet26 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Object obj27 = strComparableSet26.clone();
        boolean boolean28 = strComparableSet23.equals(obj27);
        boolean boolean29 = strComparableSet16.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet23);
        boolean boolean30 = strComparableSet8.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet16);
        boolean boolean31 = strComparableSet3.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet8);
        boolean boolean33 = strComparableSet8.add((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(strComparableStream21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertEquals(obj27.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj27), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj27), "[]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test60");
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet1 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Object[] objArray2 = strComparableSet1.toArray();
        strComparableSet1.clear();
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet5 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean6 = strComparableSet5.isEmpty();
        boolean boolean7 = strComparableSet1.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet5);
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet9 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Object[] objArray10 = strComparableSet9.toArray();
        boolean boolean11 = strComparableSet1.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet9);
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor12 = strComparableSet9.iterator();
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet14 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Object[] objArray15 = strComparableSet14.toArray();
        strComparableSet14.clear();
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet18 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean19 = strComparableSet18.isEmpty();
        boolean boolean20 = strComparableSet14.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet18);
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet22 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Object[] objArray23 = strComparableSet22.toArray();
        boolean boolean24 = strComparableSet14.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet22);
        boolean boolean25 = strComparableSet9.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet14);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strComparableItor12);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test61");
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet1 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean2 = strComparableSet1.isEmpty();
        boolean boolean4 = strComparableSet1.remove((java.lang.Object) '4');
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream5 = strComparableSet1.parallelStream();
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet7 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Object obj8 = strComparableSet7.clone();
        boolean boolean9 = strComparableSet7.isEmpty();
        boolean boolean10 = strComparableSet1.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet7);
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet12 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Object[] objArray13 = strComparableSet12.toArray();
        strComparableSet12.clear();
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet16 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean17 = strComparableSet16.isEmpty();
        boolean boolean18 = strComparableSet12.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet16);
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet20 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Object[] objArray21 = strComparableSet20.toArray();
        boolean boolean22 = strComparableSet12.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet20);
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor23 = strComparableSet20.iterator();
        java.util.Iterator[] iteratorArray25 = new java.util.Iterator[1];
        @SuppressWarnings("unchecked")
        java.util.Iterator<java.lang.Comparable<java.lang.String>>[] strComparableItorArray26 = (java.util.Iterator<java.lang.Comparable<java.lang.String>>[]) iteratorArray25;
        strComparableItorArray26[0] = strComparableItor23;
        java.util.Iterator<java.lang.Comparable<java.lang.String>>[] strComparableItorArray29 = strComparableSet7.toArray(strComparableItorArray26);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strComparableStream5);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strComparableItor23);
        org.junit.Assert.assertNotNull(iteratorArray25);
        org.junit.Assert.assertNotNull(strComparableItorArray26);
        org.junit.Assert.assertNotNull(strComparableItorArray29);
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test62");
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet1 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean2 = strComparableSet1.isEmpty();
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet4 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Object[] objArray5 = strComparableSet4.toArray();
        strComparableSet4.clear();
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet8 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean9 = strComparableSet8.isEmpty();
        boolean boolean10 = strComparableSet4.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet8);
        java.lang.String str11 = strComparableSet8.toString();
        strComparableSet8.clear();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream13 = strComparableSet8.parallelStream();
        boolean boolean14 = strComparableSet1.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet8);
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet15 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet1);
        int int16 = strComparableSet1.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertNotNull(strComparableStream13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test63");
        org.leplus.ristretto.util.IdentityHashSet<java.util.Collection<java.lang.Comparable<java.lang.String>>[]> comparableCollectionArraySet0 = new org.leplus.ristretto.util.IdentityHashSet<java.util.Collection<java.lang.Comparable<java.lang.String>>[]>();
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test64");
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet1 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Object[] objArray2 = strComparableSet1.toArray();
        strComparableSet1.clear();
        boolean boolean5 = strComparableSet1.add((java.lang.Comparable<java.lang.String>) "[]");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test65");
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet1 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Object[] objArray2 = strComparableSet1.toArray();
        strComparableSet1.clear();
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet5 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean6 = strComparableSet5.isEmpty();
        boolean boolean7 = strComparableSet1.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet5);
        java.lang.String str8 = strComparableSet5.toString();
        strComparableSet5.clear();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream10 = strComparableSet5.parallelStream();
        java.lang.Object obj11 = strComparableSet5.clone();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertNotNull(strComparableStream10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "[]");
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test66");
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet1 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Object[] objArray2 = strComparableSet1.toArray();
        strComparableSet1.clear();
        boolean boolean5 = strComparableSet1.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Object[] objArray6 = strComparableSet1.toArray();
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet8 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Object[] objArray9 = strComparableSet8.toArray();
        strComparableSet8.clear();
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet12 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean13 = strComparableSet12.isEmpty();
        boolean boolean14 = strComparableSet8.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet12);
        java.lang.String str15 = strComparableSet12.toString();
        boolean boolean16 = strComparableSet1.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet12);
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet18 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Object obj19 = strComparableSet18.clone();
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet21 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Object[] objArray22 = strComparableSet21.toArray();
        boolean boolean23 = strComparableSet18.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet21);
        boolean boolean24 = strComparableSet21.isEmpty();
        strComparableSet21.clear();
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet27 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean28 = strComparableSet27.add((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator29 = strComparableSet27.spliterator();
        boolean boolean30 = strComparableSet21.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet27);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet32 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean33 = strComparableSet32.add((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator34 = strComparableSet32.spliterator();
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet36 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean37 = strComparableSet36.add((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator38 = strComparableSet36.spliterator();
        java.util.HashSet[] hashSetArray40 = new java.util.HashSet[3];
        @SuppressWarnings("unchecked")
        java.util.HashSet<java.lang.Comparable<java.lang.String>>[] strComparableSetArray41 = (java.util.HashSet<java.lang.Comparable<java.lang.String>>[]) hashSetArray40;
        strComparableSetArray41[0] = strComparableSet27;
        strComparableSetArray41[1] = strComparableSet32;
        strComparableSetArray41[2] = strComparableSet36;
        java.util.HashSet[][] hashSetArray49 = new java.util.HashSet[1][];
        @SuppressWarnings("unchecked")
        java.util.HashSet<java.lang.Comparable<java.lang.String>>[][] strComparableSetArray50 = (java.util.HashSet<java.lang.Comparable<java.lang.String>>[][]) hashSetArray49;
        strComparableSetArray50[0] = strComparableSetArray41;
        java.util.HashSet<java.lang.Comparable<java.lang.String>>[][] strComparableSetArray53 = strComparableSet12.toArray(strComparableSetArray50);
        int int54 = strComparableSet12.size();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[hi!]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[]" + "'", str15, "[]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "[]");
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator38);
        org.junit.Assert.assertNotNull(hashSetArray40);
        org.junit.Assert.assertNotNull(strComparableSetArray41);
        org.junit.Assert.assertNotNull(hashSetArray49);
        org.junit.Assert.assertNotNull(strComparableSetArray50);
        org.junit.Assert.assertNotNull(strComparableSetArray53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test67");
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet1 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Object obj2 = strComparableSet1.clone();
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet4 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Object[] objArray5 = strComparableSet4.toArray();
        boolean boolean6 = strComparableSet1.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet4);
        boolean boolean7 = strComparableSet4.isEmpty();
        boolean boolean8 = strComparableSet4.isEmpty();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream9 = strComparableSet4.stream();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "[]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strComparableStream9);
    }

    @Test
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test68");
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet1 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Object[] objArray2 = strComparableSet1.toArray();
        strComparableSet1.clear();
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet5 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean6 = strComparableSet5.isEmpty();
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet8 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Object[] objArray9 = strComparableSet8.toArray();
        strComparableSet8.clear();
        boolean boolean12 = strComparableSet8.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream13 = strComparableSet8.parallelStream();
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet15 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean16 = strComparableSet15.isEmpty();
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet18 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Object obj19 = strComparableSet18.clone();
        boolean boolean20 = strComparableSet15.equals(obj19);
        boolean boolean21 = strComparableSet8.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet15);
        boolean boolean22 = strComparableSet5.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet15);
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet24 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Object obj25 = strComparableSet24.clone();
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet27 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Object[] objArray28 = strComparableSet27.toArray();
        boolean boolean29 = strComparableSet24.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet27);
        boolean boolean30 = strComparableSet27.isEmpty();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor31 = strComparableSet27.iterator();
        boolean boolean32 = strComparableSet5.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet27);
        java.lang.String str33 = strComparableSet27.toString();
        boolean boolean34 = strComparableSet1.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet27);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strComparableStream13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "[]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertEquals(obj25.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj25), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj25), "[]");
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(strComparableItor31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "[]" + "'", str33, "[]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test69() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test69");
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet1 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Object[] objArray2 = strComparableSet1.toArray();
        strComparableSet1.clear();
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet5 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean6 = strComparableSet5.isEmpty();
        boolean boolean7 = strComparableSet1.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet5);
        boolean boolean8 = strComparableSet5.isEmpty();
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet10 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Object obj11 = strComparableSet10.clone();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream12 = strComparableSet10.stream();
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet14 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Object[] objArray15 = strComparableSet14.toArray();
        strComparableSet14.clear();
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet18 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean19 = strComparableSet18.isEmpty();
        boolean boolean20 = strComparableSet14.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet18);
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet22 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Object[] objArray23 = strComparableSet22.toArray();
        boolean boolean24 = strComparableSet14.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet22);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator25 = strComparableSet14.spliterator();
        boolean boolean26 = strComparableSet10.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet14);
        boolean boolean27 = strComparableSet5.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet14);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "[]");
        org.junit.Assert.assertNotNull(strComparableStream12);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test70() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test70");
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet1 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Object[] objArray2 = strComparableSet1.toArray();
        strComparableSet1.clear();
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet5 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean6 = strComparableSet5.isEmpty();
        boolean boolean7 = strComparableSet1.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet5);
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet9 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Object[] objArray10 = strComparableSet9.toArray();
        boolean boolean11 = strComparableSet1.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet9);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet13 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean14 = strComparableSet13.add((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator15 = strComparableSet13.spliterator();
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet17 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean18 = strComparableSet17.add((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator19 = strComparableSet17.spliterator();
        java.util.HashSet[] hashSetArray21 = new java.util.HashSet[2];
        @SuppressWarnings("unchecked")
        java.util.HashSet<java.lang.Comparable<java.lang.String>>[] strComparableSetArray22 = (java.util.HashSet<java.lang.Comparable<java.lang.String>>[]) hashSetArray21;
        strComparableSetArray22[0] = strComparableSet13;
        strComparableSetArray22[1] = strComparableSet17;
        java.util.HashSet<java.lang.Comparable<java.lang.String>>[] strComparableSetArray27 = strComparableSet9.toArray(strComparableSetArray22);
        java.lang.Object obj28 = null;
        boolean boolean29 = strComparableSet9.equals(obj28);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator19);
        org.junit.Assert.assertNotNull(hashSetArray21);
        org.junit.Assert.assertNotNull(strComparableSetArray22);
        org.junit.Assert.assertNotNull(strComparableSetArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test71() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test71");
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet1 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean2 = strComparableSet1.isEmpty();
        boolean boolean4 = strComparableSet1.remove((java.lang.Object) '4');
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream5 = strComparableSet1.parallelStream();
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet7 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Object obj8 = strComparableSet7.clone();
        boolean boolean9 = strComparableSet7.isEmpty();
        boolean boolean10 = strComparableSet1.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet7);
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet12 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Object[] objArray13 = strComparableSet12.toArray();
        strComparableSet12.clear();
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet16 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean17 = strComparableSet16.isEmpty();
        boolean boolean18 = strComparableSet12.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet16);
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet20 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Object[] objArray21 = strComparableSet20.toArray();
        boolean boolean22 = strComparableSet12.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet20);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet24 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean25 = strComparableSet24.add((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator26 = strComparableSet24.spliterator();
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet28 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean29 = strComparableSet28.add((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator30 = strComparableSet28.spliterator();
        java.util.HashSet[] hashSetArray32 = new java.util.HashSet[2];
        @SuppressWarnings("unchecked")
        java.util.HashSet<java.lang.Comparable<java.lang.String>>[] strComparableSetArray33 = (java.util.HashSet<java.lang.Comparable<java.lang.String>>[]) hashSetArray32;
        strComparableSetArray33[0] = strComparableSet24;
        strComparableSetArray33[1] = strComparableSet28;
        java.util.HashSet<java.lang.Comparable<java.lang.String>>[] strComparableSetArray38 = strComparableSet20.toArray(strComparableSetArray33);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator39 = strComparableSet20.spliterator();
        boolean boolean40 = strComparableSet7.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet20);
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet42 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean43 = strComparableSet42.isEmpty();
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet45 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Object[] objArray46 = strComparableSet45.toArray();
        strComparableSet45.clear();
        boolean boolean49 = strComparableSet45.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream50 = strComparableSet45.parallelStream();
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet52 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean53 = strComparableSet52.isEmpty();
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet55 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Object obj56 = strComparableSet55.clone();
        boolean boolean57 = strComparableSet52.equals(obj56);
        boolean boolean58 = strComparableSet45.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet52);
        boolean boolean59 = strComparableSet42.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet52);
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet61 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Object obj62 = strComparableSet61.clone();
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet64 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Object[] objArray65 = strComparableSet64.toArray();
        boolean boolean66 = strComparableSet61.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet64);
        boolean boolean67 = strComparableSet64.isEmpty();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor68 = strComparableSet64.iterator();
        boolean boolean69 = strComparableSet42.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet64);
        boolean boolean70 = strComparableSet20.addAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet64);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strComparableStream5);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator30);
        org.junit.Assert.assertNotNull(hashSetArray32);
        org.junit.Assert.assertNotNull(strComparableSetArray33);
        org.junit.Assert.assertNotNull(strComparableSetArray38);
        org.junit.Assert.assertNotNull(strComparableSpliterator39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray46), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray46), "[]");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(strComparableStream50);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(obj56);
        org.junit.Assert.assertEquals(obj56.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj56), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj56), "[]");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(obj62);
        org.junit.Assert.assertEquals(obj62.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj62), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj62), "[]");
        org.junit.Assert.assertNotNull(objArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray65), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray65), "[]");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(strComparableItor68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
    }

    @Test
    public void test72() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test72");
        org.leplus.ristretto.util.IdentityHashSet<java.lang.reflect.Type> typeSet0 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.reflect.Type>();
    }

    @Test
    public void test73() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test73");
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet1 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Object[] objArray2 = strComparableSet1.toArray();
        strComparableSet1.clear();
        boolean boolean5 = strComparableSet1.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream6 = strComparableSet1.parallelStream();
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet8 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean9 = strComparableSet8.isEmpty();
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet11 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Object obj12 = strComparableSet11.clone();
        boolean boolean13 = strComparableSet8.equals(obj12);
        boolean boolean14 = strComparableSet1.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet8);
        int int15 = strComparableSet1.size();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strComparableStream6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test74() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test74");
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet1 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Object[] objArray2 = strComparableSet1.toArray();
        strComparableSet1.clear();
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet5 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean6 = strComparableSet5.isEmpty();
        boolean boolean7 = strComparableSet1.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet5);
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet9 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Object[] objArray10 = strComparableSet9.toArray();
        boolean boolean11 = strComparableSet1.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet9);
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet13 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean14 = strComparableSet13.add((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator15 = strComparableSet13.spliterator();
        java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>> strComparableSet17 = new java.util.LinkedHashSet<java.lang.Comparable<java.lang.String>>();
        boolean boolean18 = strComparableSet17.add((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator19 = strComparableSet17.spliterator();
        java.util.HashSet[] hashSetArray21 = new java.util.HashSet[2];
        @SuppressWarnings("unchecked")
        java.util.HashSet<java.lang.Comparable<java.lang.String>>[] strComparableSetArray22 = (java.util.HashSet<java.lang.Comparable<java.lang.String>>[]) hashSetArray21;
        strComparableSetArray22[0] = strComparableSet13;
        strComparableSetArray22[1] = strComparableSet17;
        java.util.HashSet<java.lang.Comparable<java.lang.String>>[] strComparableSetArray27 = strComparableSet9.toArray(strComparableSetArray22);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator28 = strComparableSet9.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator29 = strComparableSet9.spliterator();
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet31 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Object[] objArray32 = strComparableSet31.toArray();
        strComparableSet31.clear();
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet35 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean36 = strComparableSet35.isEmpty();
        boolean boolean37 = strComparableSet31.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet35);
        boolean boolean38 = strComparableSet9.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet31);
        java.lang.Object[] objArray39 = strComparableSet9.toArray();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator19);
        org.junit.Assert.assertNotNull(hashSetArray21);
        org.junit.Assert.assertNotNull(strComparableSetArray22);
        org.junit.Assert.assertNotNull(strComparableSetArray27);
        org.junit.Assert.assertNotNull(strComparableSpliterator28);
        org.junit.Assert.assertNotNull(strComparableSpliterator29);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[]");
    }

    @Test
    public void test75() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test75");
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet1 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean2 = strComparableSet1.isEmpty();
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet4 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Object[] objArray5 = strComparableSet4.toArray();
        strComparableSet4.clear();
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet8 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean9 = strComparableSet8.isEmpty();
        boolean boolean10 = strComparableSet4.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet8);
        java.lang.String str11 = strComparableSet8.toString();
        strComparableSet8.clear();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream13 = strComparableSet8.parallelStream();
        boolean boolean14 = strComparableSet1.removeAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet8);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator15 = strComparableSet1.spliterator();
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet17 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Object[] objArray18 = strComparableSet17.toArray();
        strComparableSet17.clear();
        org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>> strComparableSet21 = new org.leplus.ristretto.util.IdentityHashSet<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean boolean22 = strComparableSet21.isEmpty();
        boolean boolean23 = strComparableSet17.containsAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet21);
        java.lang.String str24 = strComparableSet21.toString();
        boolean boolean25 = strComparableSet1.retainAll((java.util.Collection<java.lang.Comparable<java.lang.String>>) strComparableSet21);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream26 = strComparableSet21.stream();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertNotNull(strComparableStream13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator15);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "[]" + "'", str24, "[]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(strComparableStream26);
    }
}
