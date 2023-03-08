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
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        // The following exception was thrown during execution in test generation
        try {
            stackAr0.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.UnderflowException; message: null");
        } catch (DataStructures.UnderflowException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        boolean boolean1 = stackAr0.isEmpty();
        boolean boolean2 = stackAr0.isFull();
        java.lang.Class<?> wildcardClass3 = stackAr0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        // The following exception was thrown during execution in test generation
        try {
            DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        stackAr0.push((java.lang.Object) 1.0f);
        java.lang.Class<?> wildcardClass3 = stackAr0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) (byte) 0);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        stackAr0.push((java.lang.Object) 1.0f);
        boolean boolean3 = stackAr0.isFull();
        stackAr0.push((java.lang.Object) (short) -1);
        java.lang.Class<?> wildcardClass6 = stackAr0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) 'a');
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        boolean boolean1 = stackAr0.isEmpty();
        stackAr0.push((java.lang.Object) 1);
        java.lang.Object obj4 = null;
        stackAr0.push(obj4);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        stackAr0.push((java.lang.Object) 1.0f);
        stackAr0.makeEmpty();
        // The following exception was thrown during execution in test generation
        try {
            stackAr0.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.UnderflowException; message: null");
        } catch (DataStructures.UnderflowException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        boolean boolean1 = stackAr0.isEmpty();
        stackAr0.push((java.lang.Object) 1);
        stackAr0.push((java.lang.Object) 10.0d);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        stackAr0.push((java.lang.Object) 1.0f);
        java.lang.Object obj3 = stackAr0.top();
        stackAr0.makeEmpty();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 1.0f + "'", obj3, 1.0f);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        boolean boolean1 = stackAr0.isEmpty();
        java.lang.Object obj2 = stackAr0.top();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        stackAr0.push((java.lang.Object) 1.0f);
        boolean boolean3 = stackAr0.isFull();
        stackAr0.pop();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        boolean boolean1 = stackAr0.isEmpty();
        boolean boolean2 = stackAr0.isFull();
        java.lang.Object obj3 = stackAr0.top();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(obj3);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        stackAr0.push((java.lang.Object) 1.0f);
        boolean boolean3 = stackAr0.isFull();
        java.lang.Object obj4 = stackAr0.top();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 1.0f + "'", obj4, 1.0f);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr();
        stackAr1.push((java.lang.Object) 1.0f);
        boolean boolean4 = stackAr1.isFull();
        stackAr1.push((java.lang.Object) (short) -1);
        boolean boolean7 = stackAr1.isEmpty();
        boolean boolean8 = stackAr1.isFull();
        java.lang.Class<?> wildcardClass9 = stackAr1.getClass();
        stackAr0.push((java.lang.Object) wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        boolean boolean1 = stackAr0.isEmpty();
        stackAr0.push((java.lang.Object) 1);
        java.lang.Class<?> wildcardClass4 = stackAr0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        boolean boolean1 = stackAr0.isEmpty();
        java.lang.Class<?> wildcardClass2 = stackAr0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) (short) 0);
        boolean boolean2 = stackAr1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) (short) 0);
        java.lang.Class<?> wildcardClass2 = stackAr1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        boolean boolean1 = stackAr0.isEmpty();
        boolean boolean2 = stackAr0.isFull();
        boolean boolean3 = stackAr0.isFull();
        java.lang.Object obj4 = stackAr0.top();
        stackAr0.makeEmpty();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        stackAr0.push((java.lang.Object) 1.0f);
        boolean boolean3 = stackAr0.isFull();
        stackAr0.push((java.lang.Object) (short) -1);
        boolean boolean6 = stackAr0.isEmpty();
        stackAr0.makeEmpty();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        java.lang.Object obj1 = stackAr0.top();
        DataStructures.StackAr stackAr2 = new DataStructures.StackAr();
        stackAr2.push((java.lang.Object) 1.0f);
        boolean boolean5 = stackAr2.isFull();
        stackAr2.push((java.lang.Object) (short) -1);
        boolean boolean8 = stackAr2.isEmpty();
        boolean boolean9 = stackAr2.isFull();
        java.lang.Class<?> wildcardClass10 = stackAr2.getClass();
        stackAr0.push((java.lang.Object) wildcardClass10);
        org.junit.Assert.assertNull(obj1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        boolean boolean1 = stackAr0.isEmpty();
        boolean boolean2 = stackAr0.isEmpty();
        stackAr0.makeEmpty();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        boolean boolean1 = stackAr0.isEmpty();
        boolean boolean2 = stackAr0.isEmpty();
        java.lang.Object obj3 = stackAr0.top();
        java.lang.Class<?> wildcardClass4 = stackAr0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        boolean boolean1 = stackAr0.isEmpty();
        stackAr0.push((java.lang.Object) 100L);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        boolean boolean1 = stackAr0.isEmpty();
        boolean boolean2 = stackAr0.isFull();
        boolean boolean3 = stackAr0.isFull();
        boolean boolean4 = stackAr0.isFull();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        boolean boolean1 = stackAr0.isEmpty();
        stackAr0.push((java.lang.Object) 1);
        java.lang.Object obj4 = stackAr0.top();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 1 + "'", obj4, 1);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) '4');
        DataStructures.StackAr stackAr2 = new DataStructures.StackAr();
        boolean boolean3 = stackAr2.isEmpty();
        boolean boolean4 = stackAr2.isFull();
        boolean boolean5 = stackAr2.isFull();
        java.lang.Object obj6 = stackAr2.top();
        boolean boolean7 = stackAr2.isFull();
        stackAr1.push((java.lang.Object) stackAr2);
        java.lang.Object obj9 = stackAr2.top();
        boolean boolean10 = stackAr2.isFull();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) '#');
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        boolean boolean1 = stackAr0.isEmpty();
        boolean boolean2 = stackAr0.isEmpty();
        java.lang.Object obj3 = stackAr0.top();
        // The following exception was thrown during execution in test generation
        try {
            stackAr0.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.UnderflowException; message: null");
        } catch (DataStructures.UnderflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj3);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        stackAr0.push((java.lang.Object) 1.0f);
        boolean boolean3 = stackAr0.isFull();
        java.lang.Class<?> wildcardClass4 = stackAr0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        stackAr0.push((java.lang.Object) 1.0f);
        boolean boolean3 = stackAr0.isFull();
        stackAr0.push((java.lang.Object) (short) -1);
        java.lang.Object obj6 = stackAr0.top();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) -1 + "'", obj6, (short) -1);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(10);
        java.lang.Class<?> wildcardClass2 = stackAr1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        stackAr0.push((java.lang.Object) 1.0f);
        stackAr0.pop();
        boolean boolean4 = stackAr0.isFull();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        DataStructures.StackAr stackAr0 = new DataStructures.StackAr();
        stackAr0.push((java.lang.Object) 1.0f);
        boolean boolean3 = stackAr0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }
}

