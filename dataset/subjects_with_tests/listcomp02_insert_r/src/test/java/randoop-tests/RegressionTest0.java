import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test1");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test2");
        examples.ListComp02 listComp02_0 = new examples.ListComp02();
        java.lang.Class<?> wildcardClass1 = listComp02_0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test3");
        examples.ListComp02 listComp02_0 = new examples.ListComp02();
        examples.S s1 = null;
        listComp02_0.insert_s(s1);
        java.lang.Class<?> wildcardClass3 = listComp02_0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test4");
        examples.ListComp02 listComp02_0 = new examples.ListComp02();
        listComp02_0.clear();
        listComp02_0.clear();
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test5");
        examples.ListComp02 listComp02_0 = new examples.ListComp02();
        listComp02_0.clear();
        examples.R r2 = null;
        listComp02_0.insert_r(r2);
        listComp02_0.clear();
    }

    @Test
    public void test6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test6");
        examples.R[] rArray0 = new examples.R[] {};
        java.util.ArrayList<examples.R> rList1 = new java.util.ArrayList<examples.R>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList1, rArray0);
        examples.S[] sArray3 = new examples.S[] {};
        java.util.ArrayList<examples.S> sList4 = new java.util.ArrayList<examples.S>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList4, sArray3);
        examples.ListComp02 listComp02_6 = new examples.ListComp02(rList1, sList4);
        examples.S[] sArray7 = new examples.S[] {};
        java.util.ArrayList<examples.S> sList8 = new java.util.ArrayList<examples.S>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList8, sArray7);
        examples.ListComp02 listComp02_10 = new examples.ListComp02(rList1, sList8);
        listComp02_10.clear();
        org.junit.Assert.assertNotNull(rArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(sArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(sArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test7() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test7");
        examples.ListComp02 listComp02_0 = new examples.ListComp02();
        examples.S s1 = null;
        listComp02_0.insert_s(s1);
        examples.R r3 = null;
        listComp02_0.insert_r(r3);
        examples.S s5 = null;
        listComp02_0.insert_s(s5);
        examples.S s7 = null;
        listComp02_0.insert_s(s7);
        java.lang.Class<?> wildcardClass9 = listComp02_0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test8() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test8");
        examples.R[] rArray0 = new examples.R[] {};
        java.util.ArrayList<examples.R> rList1 = new java.util.ArrayList<examples.R>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList1, rArray0);
        examples.S[] sArray3 = new examples.S[] {};
        java.util.ArrayList<examples.S> sList4 = new java.util.ArrayList<examples.S>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList4, sArray3);
        examples.ListComp02 listComp02_6 = new examples.ListComp02(rList1, sList4);
        examples.S[] sArray7 = new examples.S[] {};
        java.util.ArrayList<examples.S> sList8 = new java.util.ArrayList<examples.S>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList8, sArray7);
        examples.ListComp02 listComp02_10 = new examples.ListComp02(rList1, sList8);
        java.lang.Class<?> wildcardClass11 = rList1.getClass();
        org.junit.Assert.assertNotNull(rArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(sArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(sArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test9() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test9");
        examples.R[] rArray0 = new examples.R[] {};
        java.util.ArrayList<examples.R> rList1 = new java.util.ArrayList<examples.R>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList1, rArray0);
        examples.S[] sArray3 = new examples.S[] {};
        java.util.ArrayList<examples.S> sList4 = new java.util.ArrayList<examples.S>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList4, sArray3);
        examples.ListComp02 listComp02_6 = new examples.ListComp02(rList1, sList4);
        examples.S[] sArray7 = new examples.S[] {};
        java.util.ArrayList<examples.S> sList8 = new java.util.ArrayList<examples.S>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList8, sArray7);
        examples.ListComp02 listComp02_10 = new examples.ListComp02(rList1, sList8);
        examples.R[] rArray11 = new examples.R[] {};
        java.util.ArrayList<examples.R> rList12 = new java.util.ArrayList<examples.R>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList12, rArray11);
        examples.S[] sArray14 = new examples.S[] {};
        java.util.ArrayList<examples.S> sList15 = new java.util.ArrayList<examples.S>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList15, sArray14);
        examples.ListComp02 listComp02_17 = new examples.ListComp02(rList12, sList15);
        examples.R[] rArray18 = new examples.R[] {};
        java.util.ArrayList<examples.R> rList19 = new java.util.ArrayList<examples.R>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<examples.R>) rList19, rArray18);
        examples.S[] sArray21 = new examples.S[] {};
        java.util.ArrayList<examples.S> sList22 = new java.util.ArrayList<examples.S>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList22, sArray21);
        examples.ListComp02 listComp02_24 = new examples.ListComp02(rList19, sList22);
        examples.S[] sArray25 = new examples.S[] {};
        java.util.ArrayList<examples.S> sList26 = new java.util.ArrayList<examples.S>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<examples.S>) sList26, sArray25);
        examples.ListComp02 listComp02_28 = new examples.ListComp02(rList19, sList26);
        examples.ListComp02 listComp02_29 = new examples.ListComp02(rList12, sList26);
        examples.ListComp02 listComp02_30 = new examples.ListComp02(rList1, sList26);
        org.junit.Assert.assertNotNull(rArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(sArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(sArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(rArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(sArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(rArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(sArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(sArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }
}

