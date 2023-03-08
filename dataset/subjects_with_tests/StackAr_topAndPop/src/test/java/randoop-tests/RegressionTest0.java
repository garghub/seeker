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
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push((java.lang.Object) (byte) 10);
            org.junit.Assert.fail("Expected exception of type DataStructures.Overflow; message: null");
        } catch (DataStructures.Overflow e) {
            // Expected exception.
        }
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        java.lang.Object obj2 = stackAr1.topAndPop();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        java.lang.Object obj2 = stackAr1.topAndPop();
        boolean boolean3 = stackAr1.isFull();
        DataStructures.StackAr stackAr5 = new DataStructures.StackAr(0);
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push((java.lang.Object) stackAr5);
            org.junit.Assert.fail("Expected exception of type DataStructures.Overflow; message: null");
        } catch (DataStructures.Overflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        stackAr1.makeEmpty();
        DataStructures.StackAr stackAr4 = new DataStructures.StackAr(0);
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push((java.lang.Object) stackAr4);
            org.junit.Assert.fail("Expected exception of type DataStructures.Overflow; message: null");
        } catch (DataStructures.Overflow e) {
            // Expected exception.
        }
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push((java.lang.Object) (-1.0f));
            org.junit.Assert.fail("Expected exception of type DataStructures.Overflow; message: null");
        } catch (DataStructures.Overflow e) {
            // Expected exception.
        }
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) (byte) 1);
        stackAr1.makeEmpty();
        java.lang.Object obj3 = stackAr1.topAndPop();
        org.junit.Assert.assertNull(obj3);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) (byte) 1);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.topAndPop();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass4 = obj3.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) (byte) 1);
        java.lang.Class<?> wildcardClass2 = stackAr1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        boolean boolean4 = stackAr1.isFull();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        stackAr1.makeEmpty();
        java.lang.Object obj3 = stackAr1.topAndPop();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass4 = obj3.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj3);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        stackAr1.makeEmpty();
        java.lang.Object obj3 = stackAr1.top();
        org.junit.Assert.assertNull(obj3);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) (byte) 1);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.top();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        java.lang.Object obj2 = stackAr1.topAndPop();
        boolean boolean3 = stackAr1.isFull();
        java.lang.Object obj4 = stackAr1.topAndPop();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) (byte) 1);
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        java.lang.Object obj4 = stackAr1.topAndPop();
        stackAr1.makeEmpty();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        java.lang.Object obj2 = stackAr1.topAndPop();
        boolean boolean3 = stackAr1.isFull();
        java.lang.Object obj4 = stackAr1.topAndPop();
        DataStructures.StackAr stackAr6 = new DataStructures.StackAr(0);
        java.lang.Object obj7 = stackAr6.topAndPop();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push(obj7);
            org.junit.Assert.fail("Expected exception of type DataStructures.Overflow; message: null");
        } catch (DataStructures.Overflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) (byte) 1);
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) (byte) 1);
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        java.lang.Object obj4 = stackAr1.topAndPop();
        java.lang.Object obj5 = stackAr1.topAndPop();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        java.lang.Object obj2 = stackAr1.topAndPop();
        boolean boolean3 = stackAr1.isFull();
        java.lang.Object obj4 = stackAr1.topAndPop();
        boolean boolean5 = stackAr1.isEmpty();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        java.lang.Object obj4 = stackAr1.top();
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) (short) 1);
        boolean boolean2 = stackAr1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) (byte) 1);
        stackAr1.makeEmpty();
        DataStructures.StackAr stackAr4 = new DataStructures.StackAr((int) (byte) 1);
        java.lang.Object obj5 = stackAr4.top();
        java.lang.Object obj6 = stackAr4.topAndPop();
        stackAr1.push(obj6);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) (byte) 10);
        boolean boolean2 = stackAr1.isFull();
        DataStructures.StackAr stackAr4 = new DataStructures.StackAr((int) (byte) 1);
        DataStructures.StackAr stackAr6 = new DataStructures.StackAr(0);
        java.lang.Object obj7 = stackAr6.topAndPop();
        stackAr6.makeEmpty();
        stackAr4.push((java.lang.Object) stackAr6);
        stackAr1.push((java.lang.Object) stackAr6);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) (byte) 1);
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        stackAr1.push((java.lang.Object) 100);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) (byte) 1);
        stackAr1.makeEmpty();
        stackAr1.push((java.lang.Object) 1L);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) (byte) 1);
        java.lang.Object obj2 = stackAr1.top();
        stackAr1.makeEmpty();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) (byte) 100);
        boolean boolean2 = stackAr1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) (byte) 1);
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        boolean boolean4 = stackAr1.isFull();
        java.lang.Object obj5 = stackAr1.top();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) (byte) 1);
        DataStructures.StackAr stackAr3 = new DataStructures.StackAr(0);
        java.lang.Object obj4 = stackAr3.topAndPop();
        stackAr3.makeEmpty();
        stackAr1.push((java.lang.Object) stackAr3);
        boolean boolean7 = stackAr3.isEmpty();
        DataStructures.StackAr stackAr9 = new DataStructures.StackAr(0);
        // The following exception was thrown during execution in test generation
        try {
            stackAr3.push((java.lang.Object) stackAr9);
            org.junit.Assert.fail("Expected exception of type DataStructures.Overflow; message: null");
        } catch (DataStructures.Overflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) (byte) 1);
        DataStructures.StackAr stackAr3 = new DataStructures.StackAr(0);
        java.lang.Object obj4 = stackAr3.topAndPop();
        stackAr3.makeEmpty();
        stackAr1.push((java.lang.Object) stackAr3);
        boolean boolean7 = stackAr3.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            stackAr3.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) (byte) 1);
        java.lang.Object obj2 = stackAr1.top();
        DataStructures.StackAr stackAr4 = new DataStructures.StackAr((int) '#');
        java.lang.Class<?> wildcardClass5 = stackAr4.getClass();
        stackAr1.push((java.lang.Object) stackAr4);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) (byte) 10);
        boolean boolean2 = stackAr1.isFull();
        stackAr1.push((java.lang.Object) '#');
        stackAr1.pop();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) (byte) 1);
        stackAr1.makeEmpty();
        stackAr1.makeEmpty();
        java.lang.Object obj4 = stackAr1.topAndPop();
        stackAr1.makeEmpty();
        stackAr1.push((java.lang.Object) (byte) 10);
        boolean boolean8 = stackAr1.isFull();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        java.lang.Object obj2 = stackAr1.topAndPop();
        stackAr1.makeEmpty();
        java.lang.Object obj4 = stackAr1.topAndPop();
        DataStructures.StackAr stackAr6 = new DataStructures.StackAr((int) (byte) 1);
        stackAr6.makeEmpty();
        stackAr6.makeEmpty();
        java.lang.Object obj9 = stackAr6.topAndPop();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push(obj9);
            org.junit.Assert.fail("Expected exception of type DataStructures.Overflow; message: null");
        } catch (DataStructures.Overflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) (byte) 1);
        java.lang.Object obj2 = stackAr1.top();
        java.lang.Object obj3 = stackAr1.topAndPop();
        java.lang.Object obj4 = stackAr1.topAndPop();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) (byte) 1);
        stackAr1.makeEmpty();
        boolean boolean3 = stackAr1.isFull();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) (byte) 100);
        java.lang.Object obj2 = stackAr1.top();
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr((int) (byte) 1);
        java.lang.Object obj2 = stackAr1.top();
        stackAr1.push((java.lang.Object) 10);
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        DataStructures.StackAr stackAr1 = new DataStructures.StackAr(0);
        java.lang.Object obj2 = stackAr1.topAndPop();
        boolean boolean3 = stackAr1.isFull();
        java.lang.Object obj4 = stackAr1.topAndPop();
        java.lang.Object obj5 = stackAr1.topAndPop();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type DataStructures.Underflow; message: null");
        } catch (DataStructures.Underflow e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj5);
    }
}

