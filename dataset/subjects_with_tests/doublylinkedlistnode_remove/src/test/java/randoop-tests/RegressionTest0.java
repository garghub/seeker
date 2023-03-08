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
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        java.lang.Class<?> wildcardClass1 = doublyLinkedListNode0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode1 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode1);
        java.lang.Class<?> wildcardClass3 = doublyLinkedListNode0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode2 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode2);
        examples.DoublyLinkedListNode doublyLinkedListNode4 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode5 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode4.insertRight(doublyLinkedListNode5);
        doublyLinkedListNode5.remove();
        doublyLinkedListNode2.insertRight(doublyLinkedListNode5);
        java.lang.Class<?> wildcardClass9 = doublyLinkedListNode5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode2 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode2);
        java.lang.Class<?> wildcardClass4 = doublyLinkedListNode0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode1 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode1);
        doublyLinkedListNode1.remove();
        java.lang.Class<?> wildcardClass4 = doublyLinkedListNode1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.remove();
        java.lang.Class<?> wildcardClass2 = doublyLinkedListNode0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode1 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode1);
        doublyLinkedListNode1.remove();
        doublyLinkedListNode1.remove();
        java.lang.Class<?> wildcardClass5 = doublyLinkedListNode1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode1 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode1);
        doublyLinkedListNode1.remove();
        doublyLinkedListNode1.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode5 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode5.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode7 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode5.insertRight(doublyLinkedListNode7);
        examples.DoublyLinkedListNode doublyLinkedListNode9 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode10 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode9.insertRight(doublyLinkedListNode10);
        doublyLinkedListNode10.remove();
        doublyLinkedListNode7.insertRight(doublyLinkedListNode10);
        // The following exception was thrown during execution in test generation
        try {
            doublyLinkedListNode1.insertRight(doublyLinkedListNode7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter is not singleton");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode1 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode1);
        doublyLinkedListNode1.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode4 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode5 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode4.insertRight(doublyLinkedListNode5);
        doublyLinkedListNode4.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode8 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode9 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode8.insertRight(doublyLinkedListNode9);
        doublyLinkedListNode9.remove();
        doublyLinkedListNode9.remove();
        doublyLinkedListNode4.insertRight(doublyLinkedListNode9);
        // The following exception was thrown during execution in test generation
        try {
            doublyLinkedListNode1.insertRight(doublyLinkedListNode4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter is not singleton");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode2 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode3 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode2.insertRight(doublyLinkedListNode3);
        doublyLinkedListNode3.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode3);
        examples.DoublyLinkedListNode doublyLinkedListNode7 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode7.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode9 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode7.insertRight(doublyLinkedListNode9);
        // The following exception was thrown during execution in test generation
        try {
            doublyLinkedListNode3.insertRight(doublyLinkedListNode9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter is not singleton");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode1 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode1);
        doublyLinkedListNode0.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode4 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode5 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode4.insertRight(doublyLinkedListNode5);
        doublyLinkedListNode5.remove();
        doublyLinkedListNode5.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode5);
        examples.DoublyLinkedListNode doublyLinkedListNode10 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode10.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode12 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode10.insertRight(doublyLinkedListNode12);
        // The following exception was thrown during execution in test generation
        try {
            doublyLinkedListNode0.insertRight(doublyLinkedListNode12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter is not singleton");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode2 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode2);
        examples.DoublyLinkedListNode doublyLinkedListNode4 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode5 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode4.insertRight(doublyLinkedListNode5);
        doublyLinkedListNode5.remove();
        doublyLinkedListNode2.insertRight(doublyLinkedListNode5);
        examples.DoublyLinkedListNode doublyLinkedListNode9 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode9.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode11 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode9.insertRight(doublyLinkedListNode11);
        // The following exception was thrown during execution in test generation
        try {
            doublyLinkedListNode2.insertRight(doublyLinkedListNode11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter is not singleton");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode2 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode2);
        examples.DoublyLinkedListNode doublyLinkedListNode4 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode5 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode4.insertRight(doublyLinkedListNode5);
        doublyLinkedListNode5.remove();
        doublyLinkedListNode2.insertRight(doublyLinkedListNode5);
        doublyLinkedListNode2.remove();
        java.lang.Class<?> wildcardClass10 = doublyLinkedListNode2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode1 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode1);
        examples.DoublyLinkedListNode doublyLinkedListNode3 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode4 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode3.insertRight(doublyLinkedListNode4);
        // The following exception was thrown during execution in test generation
        try {
            doublyLinkedListNode0.insertRight(doublyLinkedListNode4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter is not singleton");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode2 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode2);
        examples.DoublyLinkedListNode doublyLinkedListNode4 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode5 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode4.insertRight(doublyLinkedListNode5);
        doublyLinkedListNode5.remove();
        doublyLinkedListNode2.insertRight(doublyLinkedListNode5);
        examples.DoublyLinkedListNode doublyLinkedListNode9 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode10 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode9.insertRight(doublyLinkedListNode10);
        examples.DoublyLinkedListNode doublyLinkedListNode12 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode12.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode14 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode12.insertRight(doublyLinkedListNode14);
        examples.DoublyLinkedListNode doublyLinkedListNode16 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode17 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode16.insertRight(doublyLinkedListNode17);
        doublyLinkedListNode17.remove();
        doublyLinkedListNode14.insertRight(doublyLinkedListNode17);
        doublyLinkedListNode14.remove();
        doublyLinkedListNode9.insertRight(doublyLinkedListNode14);
        // The following exception was thrown during execution in test generation
        try {
            doublyLinkedListNode5.insertRight(doublyLinkedListNode14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter is not singleton");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode1 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode1);
        doublyLinkedListNode0.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode4 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode5 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode4.insertRight(doublyLinkedListNode5);
        doublyLinkedListNode5.remove();
        doublyLinkedListNode5.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode5);
        java.lang.Class<?> wildcardClass10 = doublyLinkedListNode0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode1 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode1);
        doublyLinkedListNode0.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode4 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode5 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode4.insertRight(doublyLinkedListNode5);
        doublyLinkedListNode5.remove();
        doublyLinkedListNode5.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode5);
        examples.DoublyLinkedListNode doublyLinkedListNode10 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode11 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode10.insertRight(doublyLinkedListNode11);
        // The following exception was thrown during execution in test generation
        try {
            doublyLinkedListNode5.insertRight(doublyLinkedListNode10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter is not singleton");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode2 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode2);
        examples.DoublyLinkedListNode doublyLinkedListNode4 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode5 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode4.insertRight(doublyLinkedListNode5);
        doublyLinkedListNode5.remove();
        doublyLinkedListNode2.insertRight(doublyLinkedListNode5);
        java.lang.Class<?> wildcardClass9 = doublyLinkedListNode2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode2 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode2);
        java.lang.Class<?> wildcardClass4 = doublyLinkedListNode2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode1 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode1);
        examples.DoublyLinkedListNode doublyLinkedListNode3 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode3.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode5 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode3.insertRight(doublyLinkedListNode5);
        examples.DoublyLinkedListNode doublyLinkedListNode7 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode8 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode7.insertRight(doublyLinkedListNode8);
        doublyLinkedListNode8.remove();
        doublyLinkedListNode5.insertRight(doublyLinkedListNode8);
        doublyLinkedListNode5.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode5);
        java.lang.Class<?> wildcardClass14 = doublyLinkedListNode0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode1 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode1);
        doublyLinkedListNode0.remove();
        java.lang.Class<?> wildcardClass4 = doublyLinkedListNode0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode2 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode3 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode2.insertRight(doublyLinkedListNode3);
        doublyLinkedListNode3.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode3);
        examples.DoublyLinkedListNode doublyLinkedListNode7 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode7.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode9 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode7.insertRight(doublyLinkedListNode9);
        examples.DoublyLinkedListNode doublyLinkedListNode11 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode12 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode11.insertRight(doublyLinkedListNode12);
        doublyLinkedListNode12.remove();
        doublyLinkedListNode9.insertRight(doublyLinkedListNode12);
        doublyLinkedListNode9.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode9);
        java.lang.Class<?> wildcardClass18 = doublyLinkedListNode9.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode2 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode3 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode2.insertRight(doublyLinkedListNode3);
        doublyLinkedListNode3.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode3);
        examples.DoublyLinkedListNode doublyLinkedListNode7 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode8 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode7.insertRight(doublyLinkedListNode8);
        doublyLinkedListNode8.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode8);
        java.lang.Class<?> wildcardClass12 = doublyLinkedListNode8.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode1 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode1);
        examples.DoublyLinkedListNode doublyLinkedListNode3 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode3.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode5 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode3.insertRight(doublyLinkedListNode5);
        // The following exception was thrown during execution in test generation
        try {
            doublyLinkedListNode0.insertRight(doublyLinkedListNode5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter is not singleton");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode1 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode1);
        doublyLinkedListNode0.remove();
        doublyLinkedListNode0.remove();
        java.lang.Class<?> wildcardClass5 = doublyLinkedListNode0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode2 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode3 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode2.insertRight(doublyLinkedListNode3);
        doublyLinkedListNode3.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode3);
        examples.DoublyLinkedListNode doublyLinkedListNode7 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode7.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode9 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode7.insertRight(doublyLinkedListNode9);
        examples.DoublyLinkedListNode doublyLinkedListNode11 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode12 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode11.insertRight(doublyLinkedListNode12);
        doublyLinkedListNode12.remove();
        doublyLinkedListNode9.insertRight(doublyLinkedListNode12);
        doublyLinkedListNode9.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode9);
        examples.DoublyLinkedListNode doublyLinkedListNode18 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode18.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode20 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode21 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode20.insertRight(doublyLinkedListNode21);
        doublyLinkedListNode21.remove();
        doublyLinkedListNode18.insertRight(doublyLinkedListNode21);
        doublyLinkedListNode18.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode18);
        examples.DoublyLinkedListNode doublyLinkedListNode27 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode27.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode29 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode30 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode29.insertRight(doublyLinkedListNode30);
        doublyLinkedListNode30.remove();
        doublyLinkedListNode27.insertRight(doublyLinkedListNode30);
        examples.DoublyLinkedListNode doublyLinkedListNode34 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode35 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode34.insertRight(doublyLinkedListNode35);
        doublyLinkedListNode35.remove();
        doublyLinkedListNode27.insertRight(doublyLinkedListNode35);
        // The following exception was thrown during execution in test generation
        try {
            doublyLinkedListNode0.insertRight(doublyLinkedListNode35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter is not singleton");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode1 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode1);
        doublyLinkedListNode0.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode4 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode5 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode4.insertRight(doublyLinkedListNode5);
        doublyLinkedListNode5.remove();
        doublyLinkedListNode5.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode5);
        examples.DoublyLinkedListNode doublyLinkedListNode10 = null;
        // The following exception was thrown during execution in test generation
        try {
            doublyLinkedListNode5.insertRight(doublyLinkedListNode10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: undefined for null parameter");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode1 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode1);
        examples.DoublyLinkedListNode doublyLinkedListNode3 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode4 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode3.insertRight(doublyLinkedListNode4);
        // The following exception was thrown during execution in test generation
        try {
            doublyLinkedListNode0.insertRight(doublyLinkedListNode3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter is not singleton");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode2 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode3 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode2.insertRight(doublyLinkedListNode3);
        doublyLinkedListNode3.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode3);
        examples.DoublyLinkedListNode doublyLinkedListNode7 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode8 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode7.insertRight(doublyLinkedListNode8);
        doublyLinkedListNode8.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode8);
        doublyLinkedListNode0.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode13 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode14 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode13.insertRight(doublyLinkedListNode14);
        // The following exception was thrown during execution in test generation
        try {
            doublyLinkedListNode0.insertRight(doublyLinkedListNode13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter is not singleton");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode2 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode3 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode2.insertRight(doublyLinkedListNode3);
        doublyLinkedListNode3.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode3);
        examples.DoublyLinkedListNode doublyLinkedListNode7 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode8 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode7.insertRight(doublyLinkedListNode8);
        doublyLinkedListNode8.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode8);
        examples.DoublyLinkedListNode doublyLinkedListNode12 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode12.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode14 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode12.insertRight(doublyLinkedListNode14);
        // The following exception was thrown during execution in test generation
        try {
            doublyLinkedListNode8.insertRight(doublyLinkedListNode12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter is not singleton");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode2 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode3 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode2.insertRight(doublyLinkedListNode3);
        doublyLinkedListNode3.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode3);
        examples.DoublyLinkedListNode doublyLinkedListNode7 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode7.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode9 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode7.insertRight(doublyLinkedListNode9);
        examples.DoublyLinkedListNode doublyLinkedListNode11 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode12 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode11.insertRight(doublyLinkedListNode12);
        doublyLinkedListNode12.remove();
        doublyLinkedListNode9.insertRight(doublyLinkedListNode12);
        doublyLinkedListNode9.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode9);
        java.lang.Class<?> wildcardClass18 = doublyLinkedListNode0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode1 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode1);
        doublyLinkedListNode0.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode4 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode5 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode4.insertRight(doublyLinkedListNode5);
        doublyLinkedListNode5.remove();
        doublyLinkedListNode5.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode5);
        doublyLinkedListNode0.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode11 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode11.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode13 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode14 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode13.insertRight(doublyLinkedListNode14);
        doublyLinkedListNode14.remove();
        doublyLinkedListNode11.insertRight(doublyLinkedListNode14);
        examples.DoublyLinkedListNode doublyLinkedListNode18 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode18.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode20 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode18.insertRight(doublyLinkedListNode20);
        examples.DoublyLinkedListNode doublyLinkedListNode22 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode23 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode22.insertRight(doublyLinkedListNode23);
        doublyLinkedListNode23.remove();
        doublyLinkedListNode20.insertRight(doublyLinkedListNode23);
        doublyLinkedListNode20.remove();
        doublyLinkedListNode11.insertRight(doublyLinkedListNode20);
        examples.DoublyLinkedListNode doublyLinkedListNode29 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode29.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode31 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode32 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode31.insertRight(doublyLinkedListNode32);
        doublyLinkedListNode32.remove();
        doublyLinkedListNode29.insertRight(doublyLinkedListNode32);
        doublyLinkedListNode29.remove();
        doublyLinkedListNode11.insertRight(doublyLinkedListNode29);
        // The following exception was thrown during execution in test generation
        try {
            doublyLinkedListNode0.insertRight(doublyLinkedListNode11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter is not singleton");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode2 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode3 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode2.insertRight(doublyLinkedListNode3);
        doublyLinkedListNode3.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode3);
        doublyLinkedListNode0.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode8 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode8.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode10 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode11 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode10.insertRight(doublyLinkedListNode11);
        doublyLinkedListNode11.remove();
        doublyLinkedListNode8.insertRight(doublyLinkedListNode11);
        doublyLinkedListNode11.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode11);
        java.lang.Class<?> wildcardClass17 = doublyLinkedListNode0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode2 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode3 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode2.insertRight(doublyLinkedListNode3);
        doublyLinkedListNode3.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode3);
        examples.DoublyLinkedListNode doublyLinkedListNode7 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode7.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode9 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode7.insertRight(doublyLinkedListNode9);
        examples.DoublyLinkedListNode doublyLinkedListNode11 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode12 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode11.insertRight(doublyLinkedListNode12);
        doublyLinkedListNode12.remove();
        doublyLinkedListNode9.insertRight(doublyLinkedListNode12);
        doublyLinkedListNode9.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode9);
        examples.DoublyLinkedListNode doublyLinkedListNode18 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode18.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode20 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode21 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode20.insertRight(doublyLinkedListNode21);
        doublyLinkedListNode21.remove();
        doublyLinkedListNode18.insertRight(doublyLinkedListNode21);
        doublyLinkedListNode18.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode18);
        examples.DoublyLinkedListNode doublyLinkedListNode27 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode27.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode29 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode30 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode29.insertRight(doublyLinkedListNode30);
        doublyLinkedListNode30.remove();
        doublyLinkedListNode27.insertRight(doublyLinkedListNode30);
        // The following exception was thrown during execution in test generation
        try {
            doublyLinkedListNode0.insertRight(doublyLinkedListNode30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter is not singleton");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode1 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode1);
        doublyLinkedListNode0.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode4 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode5 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode4.insertRight(doublyLinkedListNode5);
        doublyLinkedListNode5.remove();
        doublyLinkedListNode5.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode5);
        doublyLinkedListNode0.remove();
        java.lang.Class<?> wildcardClass11 = doublyLinkedListNode0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode2 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode3 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode2.insertRight(doublyLinkedListNode3);
        doublyLinkedListNode3.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode3);
        doublyLinkedListNode0.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode8 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode8.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode10 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode11 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode10.insertRight(doublyLinkedListNode11);
        doublyLinkedListNode11.remove();
        doublyLinkedListNode8.insertRight(doublyLinkedListNode11);
        doublyLinkedListNode11.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode11);
        examples.DoublyLinkedListNode doublyLinkedListNode17 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode17.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode19 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode17.insertRight(doublyLinkedListNode19);
        // The following exception was thrown during execution in test generation
        try {
            doublyLinkedListNode11.insertRight(doublyLinkedListNode17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter is not singleton");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode2 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode3 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode2.insertRight(doublyLinkedListNode3);
        doublyLinkedListNode3.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode3);
        doublyLinkedListNode0.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode8 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode8.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode10 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode11 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode10.insertRight(doublyLinkedListNode11);
        doublyLinkedListNode11.remove();
        doublyLinkedListNode8.insertRight(doublyLinkedListNode11);
        doublyLinkedListNode11.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode11);
        java.lang.Class<?> wildcardClass17 = doublyLinkedListNode11.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode1 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode1);
        doublyLinkedListNode0.remove();
        doublyLinkedListNode0.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode5 = null;
        // The following exception was thrown during execution in test generation
        try {
            doublyLinkedListNode0.insertRight(doublyLinkedListNode5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: undefined for null parameter");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode2 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode3 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode2.insertRight(doublyLinkedListNode3);
        doublyLinkedListNode3.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode3);
        examples.DoublyLinkedListNode doublyLinkedListNode7 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode7.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode9 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode10 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode9.insertRight(doublyLinkedListNode10);
        doublyLinkedListNode10.remove();
        doublyLinkedListNode7.insertRight(doublyLinkedListNode10);
        doublyLinkedListNode10.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode10);
        java.lang.Class<?> wildcardClass16 = doublyLinkedListNode0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode2 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode3 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode2.insertRight(doublyLinkedListNode3);
        doublyLinkedListNode3.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode3);
        examples.DoublyLinkedListNode doublyLinkedListNode7 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode7.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode9 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode7.insertRight(doublyLinkedListNode9);
        examples.DoublyLinkedListNode doublyLinkedListNode11 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode12 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode11.insertRight(doublyLinkedListNode12);
        doublyLinkedListNode12.remove();
        doublyLinkedListNode9.insertRight(doublyLinkedListNode12);
        doublyLinkedListNode9.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode9);
        doublyLinkedListNode0.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode19 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode20 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode19.insertRight(doublyLinkedListNode20);
        doublyLinkedListNode19.remove();
        doublyLinkedListNode19.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode19);
        examples.DoublyLinkedListNode doublyLinkedListNode25 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode25.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode27 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode28 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode27.insertRight(doublyLinkedListNode28);
        doublyLinkedListNode28.remove();
        doublyLinkedListNode25.insertRight(doublyLinkedListNode28);
        // The following exception was thrown during execution in test generation
        try {
            doublyLinkedListNode0.insertRight(doublyLinkedListNode28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter is not singleton");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode2 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode2);
        examples.DoublyLinkedListNode doublyLinkedListNode4 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode5 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode4.insertRight(doublyLinkedListNode5);
        doublyLinkedListNode5.remove();
        doublyLinkedListNode2.insertRight(doublyLinkedListNode5);
        examples.DoublyLinkedListNode doublyLinkedListNode9 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode10 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode9.insertRight(doublyLinkedListNode10);
        // The following exception was thrown during execution in test generation
        try {
            doublyLinkedListNode5.insertRight(doublyLinkedListNode10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter is not singleton");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode2 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode3 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode2.insertRight(doublyLinkedListNode3);
        doublyLinkedListNode3.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode3);
        examples.DoublyLinkedListNode doublyLinkedListNode7 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode7.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode9 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode7.insertRight(doublyLinkedListNode9);
        examples.DoublyLinkedListNode doublyLinkedListNode11 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode12 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode11.insertRight(doublyLinkedListNode12);
        doublyLinkedListNode12.remove();
        doublyLinkedListNode9.insertRight(doublyLinkedListNode12);
        doublyLinkedListNode9.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode9);
        examples.DoublyLinkedListNode doublyLinkedListNode18 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode18.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode20 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode21 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode20.insertRight(doublyLinkedListNode21);
        doublyLinkedListNode21.remove();
        doublyLinkedListNode18.insertRight(doublyLinkedListNode21);
        doublyLinkedListNode18.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode18);
        doublyLinkedListNode18.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode28 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode28.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode30 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode31 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode30.insertRight(doublyLinkedListNode31);
        doublyLinkedListNode31.remove();
        doublyLinkedListNode28.insertRight(doublyLinkedListNode31);
        examples.DoublyLinkedListNode doublyLinkedListNode35 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode35.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode37 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode38 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode37.insertRight(doublyLinkedListNode38);
        doublyLinkedListNode38.remove();
        doublyLinkedListNode35.insertRight(doublyLinkedListNode38);
        doublyLinkedListNode38.remove();
        doublyLinkedListNode28.insertRight(doublyLinkedListNode38);
        // The following exception was thrown during execution in test generation
        try {
            doublyLinkedListNode18.insertRight(doublyLinkedListNode28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter is not singleton");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode1 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode1.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode3 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode4 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode3.insertRight(doublyLinkedListNode4);
        doublyLinkedListNode4.remove();
        doublyLinkedListNode1.insertRight(doublyLinkedListNode4);
        examples.DoublyLinkedListNode doublyLinkedListNode8 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode8.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode10 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode8.insertRight(doublyLinkedListNode10);
        examples.DoublyLinkedListNode doublyLinkedListNode12 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode13 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode12.insertRight(doublyLinkedListNode13);
        doublyLinkedListNode13.remove();
        doublyLinkedListNode10.insertRight(doublyLinkedListNode13);
        doublyLinkedListNode10.remove();
        doublyLinkedListNode1.insertRight(doublyLinkedListNode10);
        doublyLinkedListNode1.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode20 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode21 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode20.insertRight(doublyLinkedListNode21);
        doublyLinkedListNode20.remove();
        doublyLinkedListNode20.remove();
        doublyLinkedListNode1.insertRight(doublyLinkedListNode20);
        // The following exception was thrown during execution in test generation
        try {
            doublyLinkedListNode0.insertRight(doublyLinkedListNode20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter is not singleton");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode1 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode1);
        examples.DoublyLinkedListNode doublyLinkedListNode3 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode3.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode5 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode6 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode5.insertRight(doublyLinkedListNode6);
        doublyLinkedListNode6.remove();
        doublyLinkedListNode3.insertRight(doublyLinkedListNode6);
        examples.DoublyLinkedListNode doublyLinkedListNode10 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode10.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode12 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode10.insertRight(doublyLinkedListNode12);
        examples.DoublyLinkedListNode doublyLinkedListNode14 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode15 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode14.insertRight(doublyLinkedListNode15);
        doublyLinkedListNode15.remove();
        doublyLinkedListNode12.insertRight(doublyLinkedListNode15);
        doublyLinkedListNode12.remove();
        doublyLinkedListNode3.insertRight(doublyLinkedListNode12);
        doublyLinkedListNode3.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode22 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode23 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode22.insertRight(doublyLinkedListNode23);
        doublyLinkedListNode22.remove();
        doublyLinkedListNode22.remove();
        doublyLinkedListNode3.insertRight(doublyLinkedListNode22);
        // The following exception was thrown during execution in test generation
        try {
            doublyLinkedListNode0.insertRight(doublyLinkedListNode3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter is not singleton");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode1 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode1);
        examples.DoublyLinkedListNode doublyLinkedListNode3 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode3.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode5 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode3.insertRight(doublyLinkedListNode5);
        examples.DoublyLinkedListNode doublyLinkedListNode7 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode8 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode7.insertRight(doublyLinkedListNode8);
        doublyLinkedListNode8.remove();
        doublyLinkedListNode5.insertRight(doublyLinkedListNode8);
        doublyLinkedListNode5.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode5);
        examples.DoublyLinkedListNode doublyLinkedListNode14 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode14.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode16 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode14.insertRight(doublyLinkedListNode16);
        examples.DoublyLinkedListNode doublyLinkedListNode18 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode19 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode18.insertRight(doublyLinkedListNode19);
        doublyLinkedListNode19.remove();
        doublyLinkedListNode16.insertRight(doublyLinkedListNode19);
        doublyLinkedListNode16.remove();
        doublyLinkedListNode5.insertRight(doublyLinkedListNode16);
        java.lang.Class<?> wildcardClass25 = doublyLinkedListNode16.getClass();
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode1 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode1);
        doublyLinkedListNode0.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode4 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode5 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode4.insertRight(doublyLinkedListNode5);
        doublyLinkedListNode5.remove();
        doublyLinkedListNode5.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode5);
        doublyLinkedListNode0.remove();
        doublyLinkedListNode0.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode12 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode12.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode14 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode15 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode14.insertRight(doublyLinkedListNode15);
        doublyLinkedListNode15.remove();
        doublyLinkedListNode12.insertRight(doublyLinkedListNode15);
        examples.DoublyLinkedListNode doublyLinkedListNode19 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode19.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode21 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode22 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode21.insertRight(doublyLinkedListNode22);
        doublyLinkedListNode22.remove();
        doublyLinkedListNode19.insertRight(doublyLinkedListNode22);
        doublyLinkedListNode22.remove();
        doublyLinkedListNode12.insertRight(doublyLinkedListNode22);
        doublyLinkedListNode12.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode12);
        java.lang.Class<?> wildcardClass30 = doublyLinkedListNode12.getClass();
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode2 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode3 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode2.insertRight(doublyLinkedListNode3);
        doublyLinkedListNode3.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode3);
        examples.DoublyLinkedListNode doublyLinkedListNode7 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode7.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode9 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode7.insertRight(doublyLinkedListNode9);
        examples.DoublyLinkedListNode doublyLinkedListNode11 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode12 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode11.insertRight(doublyLinkedListNode12);
        doublyLinkedListNode12.remove();
        doublyLinkedListNode9.insertRight(doublyLinkedListNode12);
        doublyLinkedListNode9.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode9);
        doublyLinkedListNode0.remove();
        java.lang.Class<?> wildcardClass19 = doublyLinkedListNode0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode1 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode1.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode3 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode1.insertRight(doublyLinkedListNode3);
        examples.DoublyLinkedListNode doublyLinkedListNode5 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode6 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode5.insertRight(doublyLinkedListNode6);
        doublyLinkedListNode6.remove();
        doublyLinkedListNode3.insertRight(doublyLinkedListNode6);
        doublyLinkedListNode3.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode3);
        doublyLinkedListNode0.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode13 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode13.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode15 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode16 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode15.insertRight(doublyLinkedListNode16);
        doublyLinkedListNode16.remove();
        doublyLinkedListNode13.insertRight(doublyLinkedListNode16);
        examples.DoublyLinkedListNode doublyLinkedListNode20 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode21 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode20.insertRight(doublyLinkedListNode21);
        doublyLinkedListNode21.remove();
        doublyLinkedListNode13.insertRight(doublyLinkedListNode21);
        // The following exception was thrown during execution in test generation
        try {
            doublyLinkedListNode0.insertRight(doublyLinkedListNode13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter is not singleton");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode1 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode1);
        doublyLinkedListNode0.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode4 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode5 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode4.insertRight(doublyLinkedListNode5);
        doublyLinkedListNode5.remove();
        doublyLinkedListNode5.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode5);
        doublyLinkedListNode0.remove();
        doublyLinkedListNode0.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode12 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode12.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode14 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode15 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode14.insertRight(doublyLinkedListNode15);
        doublyLinkedListNode15.remove();
        doublyLinkedListNode12.insertRight(doublyLinkedListNode15);
        examples.DoublyLinkedListNode doublyLinkedListNode19 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode19.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode21 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode22 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode21.insertRight(doublyLinkedListNode22);
        doublyLinkedListNode22.remove();
        doublyLinkedListNode19.insertRight(doublyLinkedListNode22);
        doublyLinkedListNode22.remove();
        doublyLinkedListNode12.insertRight(doublyLinkedListNode22);
        doublyLinkedListNode12.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode12);
        java.lang.Class<?> wildcardClass30 = doublyLinkedListNode0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode1 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode1);
        doublyLinkedListNode1.remove();
        doublyLinkedListNode1.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode5 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode6 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode6.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode8 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode6.insertRight(doublyLinkedListNode8);
        examples.DoublyLinkedListNode doublyLinkedListNode10 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode11 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode10.insertRight(doublyLinkedListNode11);
        doublyLinkedListNode11.remove();
        doublyLinkedListNode8.insertRight(doublyLinkedListNode11);
        doublyLinkedListNode8.remove();
        doublyLinkedListNode5.insertRight(doublyLinkedListNode8);
        // The following exception was thrown during execution in test generation
        try {
            doublyLinkedListNode1.insertRight(doublyLinkedListNode5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter is not singleton");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode2 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode2);
        examples.DoublyLinkedListNode doublyLinkedListNode4 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode5 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode4.insertRight(doublyLinkedListNode5);
        doublyLinkedListNode5.remove();
        doublyLinkedListNode2.insertRight(doublyLinkedListNode5);
        doublyLinkedListNode2.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode10 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode11 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode10.insertRight(doublyLinkedListNode11);
        examples.DoublyLinkedListNode doublyLinkedListNode13 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode13.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode15 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode13.insertRight(doublyLinkedListNode15);
        examples.DoublyLinkedListNode doublyLinkedListNode17 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode18 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode17.insertRight(doublyLinkedListNode18);
        doublyLinkedListNode18.remove();
        doublyLinkedListNode15.insertRight(doublyLinkedListNode18);
        doublyLinkedListNode15.remove();
        doublyLinkedListNode10.insertRight(doublyLinkedListNode15);
        // The following exception was thrown during execution in test generation
        try {
            doublyLinkedListNode2.insertRight(doublyLinkedListNode10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter is not singleton");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode1 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode1.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode3 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode4 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode3.insertRight(doublyLinkedListNode4);
        doublyLinkedListNode4.remove();
        doublyLinkedListNode1.insertRight(doublyLinkedListNode4);
        examples.DoublyLinkedListNode doublyLinkedListNode8 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode8.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode10 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode11 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode10.insertRight(doublyLinkedListNode11);
        doublyLinkedListNode11.remove();
        doublyLinkedListNode8.insertRight(doublyLinkedListNode11);
        doublyLinkedListNode11.remove();
        doublyLinkedListNode1.insertRight(doublyLinkedListNode11);
        // The following exception was thrown during execution in test generation
        try {
            doublyLinkedListNode0.insertRight(doublyLinkedListNode1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter is not singleton");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode1 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode1.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode3 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode1.insertRight(doublyLinkedListNode3);
        examples.DoublyLinkedListNode doublyLinkedListNode5 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode6 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode5.insertRight(doublyLinkedListNode6);
        doublyLinkedListNode6.remove();
        doublyLinkedListNode3.insertRight(doublyLinkedListNode6);
        doublyLinkedListNode3.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode3);
        doublyLinkedListNode0.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode13 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode13.remove();
        doublyLinkedListNode13.remove();
        doublyLinkedListNode13.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode13);
        java.lang.Class<?> wildcardClass18 = doublyLinkedListNode0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode1 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode1.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode3 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode1.insertRight(doublyLinkedListNode3);
        examples.DoublyLinkedListNode doublyLinkedListNode5 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode6 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode5.insertRight(doublyLinkedListNode6);
        doublyLinkedListNode6.remove();
        doublyLinkedListNode3.insertRight(doublyLinkedListNode6);
        doublyLinkedListNode3.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode3);
        doublyLinkedListNode0.remove();
        doublyLinkedListNode0.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode14 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode14.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode16 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode17 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode16.insertRight(doublyLinkedListNode17);
        doublyLinkedListNode17.remove();
        doublyLinkedListNode14.insertRight(doublyLinkedListNode17);
        examples.DoublyLinkedListNode doublyLinkedListNode21 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode22 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode21.insertRight(doublyLinkedListNode22);
        doublyLinkedListNode22.remove();
        doublyLinkedListNode14.insertRight(doublyLinkedListNode22);
        // The following exception was thrown during execution in test generation
        try {
            doublyLinkedListNode0.insertRight(doublyLinkedListNode14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter is not singleton");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode2 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode3 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode2.insertRight(doublyLinkedListNode3);
        doublyLinkedListNode3.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode3);
        examples.DoublyLinkedListNode doublyLinkedListNode7 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode7.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode9 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode7.insertRight(doublyLinkedListNode9);
        examples.DoublyLinkedListNode doublyLinkedListNode11 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode12 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode11.insertRight(doublyLinkedListNode12);
        doublyLinkedListNode12.remove();
        doublyLinkedListNode9.insertRight(doublyLinkedListNode12);
        doublyLinkedListNode9.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode9);
        examples.DoublyLinkedListNode doublyLinkedListNode18 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode18.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode20 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode21 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode20.insertRight(doublyLinkedListNode21);
        doublyLinkedListNode21.remove();
        doublyLinkedListNode18.insertRight(doublyLinkedListNode21);
        examples.DoublyLinkedListNode doublyLinkedListNode25 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode25.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode27 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode28 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode27.insertRight(doublyLinkedListNode28);
        doublyLinkedListNode28.remove();
        doublyLinkedListNode25.insertRight(doublyLinkedListNode28);
        doublyLinkedListNode28.remove();
        doublyLinkedListNode18.insertRight(doublyLinkedListNode28);
        doublyLinkedListNode18.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode18);
        java.lang.Class<?> wildcardClass36 = doublyLinkedListNode18.getClass();
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode2 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode2);
        doublyLinkedListNode2.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode5 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode5.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode7 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode8 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode7.insertRight(doublyLinkedListNode8);
        doublyLinkedListNode8.remove();
        doublyLinkedListNode5.insertRight(doublyLinkedListNode8);
        examples.DoublyLinkedListNode doublyLinkedListNode12 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode12.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode14 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode12.insertRight(doublyLinkedListNode14);
        examples.DoublyLinkedListNode doublyLinkedListNode16 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode17 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode16.insertRight(doublyLinkedListNode17);
        doublyLinkedListNode17.remove();
        doublyLinkedListNode14.insertRight(doublyLinkedListNode17);
        doublyLinkedListNode14.remove();
        doublyLinkedListNode5.insertRight(doublyLinkedListNode14);
        examples.DoublyLinkedListNode doublyLinkedListNode23 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode23.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode25 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode26 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode25.insertRight(doublyLinkedListNode26);
        doublyLinkedListNode26.remove();
        doublyLinkedListNode23.insertRight(doublyLinkedListNode26);
        examples.DoublyLinkedListNode doublyLinkedListNode30 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode30.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode32 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode33 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode32.insertRight(doublyLinkedListNode33);
        doublyLinkedListNode33.remove();
        doublyLinkedListNode30.insertRight(doublyLinkedListNode33);
        doublyLinkedListNode33.remove();
        doublyLinkedListNode23.insertRight(doublyLinkedListNode33);
        doublyLinkedListNode23.remove();
        doublyLinkedListNode5.insertRight(doublyLinkedListNode23);
        // The following exception was thrown during execution in test generation
        try {
            doublyLinkedListNode2.insertRight(doublyLinkedListNode5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter is not singleton");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode1 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode1);
        doublyLinkedListNode1.remove();
        doublyLinkedListNode1.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode5 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode5.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode7 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode8 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode7.insertRight(doublyLinkedListNode8);
        doublyLinkedListNode8.remove();
        doublyLinkedListNode5.insertRight(doublyLinkedListNode8);
        doublyLinkedListNode5.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode13 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode13.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode15 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode16 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode15.insertRight(doublyLinkedListNode16);
        doublyLinkedListNode16.remove();
        doublyLinkedListNode13.insertRight(doublyLinkedListNode16);
        doublyLinkedListNode16.remove();
        doublyLinkedListNode5.insertRight(doublyLinkedListNode16);
        // The following exception was thrown during execution in test generation
        try {
            doublyLinkedListNode1.insertRight(doublyLinkedListNode5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter is not singleton");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode2 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode3 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode2.insertRight(doublyLinkedListNode3);
        doublyLinkedListNode3.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode3);
        doublyLinkedListNode0.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode8 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode8.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode10 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode11 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode10.insertRight(doublyLinkedListNode11);
        doublyLinkedListNode11.remove();
        doublyLinkedListNode8.insertRight(doublyLinkedListNode11);
        // The following exception was thrown during execution in test generation
        try {
            doublyLinkedListNode0.insertRight(doublyLinkedListNode8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter is not singleton");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode2 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode3 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode2.insertRight(doublyLinkedListNode3);
        doublyLinkedListNode3.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode3);
        examples.DoublyLinkedListNode doublyLinkedListNode7 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode7.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode9 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode7.insertRight(doublyLinkedListNode9);
        examples.DoublyLinkedListNode doublyLinkedListNode11 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode12 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode11.insertRight(doublyLinkedListNode12);
        doublyLinkedListNode12.remove();
        doublyLinkedListNode9.insertRight(doublyLinkedListNode12);
        doublyLinkedListNode9.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode9);
        doublyLinkedListNode0.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode19 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode20 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode19.insertRight(doublyLinkedListNode20);
        doublyLinkedListNode19.remove();
        doublyLinkedListNode19.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode19);
        java.lang.Class<?> wildcardClass25 = doublyLinkedListNode0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode2 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode3 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode2.insertRight(doublyLinkedListNode3);
        doublyLinkedListNode3.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode3);
        examples.DoublyLinkedListNode doublyLinkedListNode7 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode8 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode7.insertRight(doublyLinkedListNode8);
        doublyLinkedListNode8.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode8);
        doublyLinkedListNode0.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode13 = null;
        // The following exception was thrown during execution in test generation
        try {
            doublyLinkedListNode0.insertRight(doublyLinkedListNode13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: undefined for null parameter");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode1 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode1.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode3 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode1.insertRight(doublyLinkedListNode3);
        examples.DoublyLinkedListNode doublyLinkedListNode5 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode6 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode5.insertRight(doublyLinkedListNode6);
        doublyLinkedListNode6.remove();
        doublyLinkedListNode3.insertRight(doublyLinkedListNode6);
        doublyLinkedListNode3.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode3);
        doublyLinkedListNode0.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode13 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode14 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode14.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode16 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode14.insertRight(doublyLinkedListNode16);
        examples.DoublyLinkedListNode doublyLinkedListNode18 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode19 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode18.insertRight(doublyLinkedListNode19);
        doublyLinkedListNode19.remove();
        doublyLinkedListNode16.insertRight(doublyLinkedListNode19);
        doublyLinkedListNode16.remove();
        doublyLinkedListNode13.insertRight(doublyLinkedListNode16);
        // The following exception was thrown during execution in test generation
        try {
            doublyLinkedListNode0.insertRight(doublyLinkedListNode16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter is not singleton");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode1 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode1);
        doublyLinkedListNode0.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode4 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode5 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode4.insertRight(doublyLinkedListNode5);
        doublyLinkedListNode5.remove();
        doublyLinkedListNode5.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode5);
        examples.DoublyLinkedListNode doublyLinkedListNode10 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode10.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode12 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode10.insertRight(doublyLinkedListNode12);
        examples.DoublyLinkedListNode doublyLinkedListNode14 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode15 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode14.insertRight(doublyLinkedListNode15);
        doublyLinkedListNode15.remove();
        doublyLinkedListNode12.insertRight(doublyLinkedListNode15);
        doublyLinkedListNode12.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode12);
        examples.DoublyLinkedListNode doublyLinkedListNode21 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode22 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode21.insertRight(doublyLinkedListNode22);
        doublyLinkedListNode21.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode25 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode26 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode25.insertRight(doublyLinkedListNode26);
        doublyLinkedListNode26.remove();
        doublyLinkedListNode26.remove();
        doublyLinkedListNode21.insertRight(doublyLinkedListNode26);
        examples.DoublyLinkedListNode doublyLinkedListNode31 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode31.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode33 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode31.insertRight(doublyLinkedListNode33);
        examples.DoublyLinkedListNode doublyLinkedListNode35 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode36 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode35.insertRight(doublyLinkedListNode36);
        doublyLinkedListNode36.remove();
        doublyLinkedListNode33.insertRight(doublyLinkedListNode36);
        doublyLinkedListNode33.remove();
        doublyLinkedListNode21.insertRight(doublyLinkedListNode33);
        // The following exception was thrown during execution in test generation
        try {
            doublyLinkedListNode0.insertRight(doublyLinkedListNode33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter is not singleton");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode2 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode3 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode2.insertRight(doublyLinkedListNode3);
        doublyLinkedListNode3.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode3);
        examples.DoublyLinkedListNode doublyLinkedListNode7 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode7.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode9 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode7.insertRight(doublyLinkedListNode9);
        examples.DoublyLinkedListNode doublyLinkedListNode11 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode12 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode11.insertRight(doublyLinkedListNode12);
        doublyLinkedListNode12.remove();
        doublyLinkedListNode9.insertRight(doublyLinkedListNode12);
        doublyLinkedListNode9.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode9);
        examples.DoublyLinkedListNode doublyLinkedListNode18 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode19 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode18.insertRight(doublyLinkedListNode19);
        // The following exception was thrown during execution in test generation
        try {
            doublyLinkedListNode9.insertRight(doublyLinkedListNode18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter is not singleton");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode1 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode1.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode3 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode1.insertRight(doublyLinkedListNode3);
        examples.DoublyLinkedListNode doublyLinkedListNode5 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode6 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode5.insertRight(doublyLinkedListNode6);
        doublyLinkedListNode6.remove();
        doublyLinkedListNode3.insertRight(doublyLinkedListNode6);
        doublyLinkedListNode3.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode3);
        java.lang.Class<?> wildcardClass12 = doublyLinkedListNode0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode2 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode3 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode2.insertRight(doublyLinkedListNode3);
        doublyLinkedListNode3.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode3);
        examples.DoublyLinkedListNode doublyLinkedListNode7 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode7.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode9 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode7.insertRight(doublyLinkedListNode9);
        examples.DoublyLinkedListNode doublyLinkedListNode11 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode12 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode11.insertRight(doublyLinkedListNode12);
        doublyLinkedListNode12.remove();
        doublyLinkedListNode9.insertRight(doublyLinkedListNode12);
        doublyLinkedListNode9.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode9);
        examples.DoublyLinkedListNode doublyLinkedListNode18 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode18.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode20 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode21 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode20.insertRight(doublyLinkedListNode21);
        doublyLinkedListNode21.remove();
        doublyLinkedListNode18.insertRight(doublyLinkedListNode21);
        examples.DoublyLinkedListNode doublyLinkedListNode25 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode25.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode27 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode28 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode27.insertRight(doublyLinkedListNode28);
        doublyLinkedListNode28.remove();
        doublyLinkedListNode25.insertRight(doublyLinkedListNode28);
        doublyLinkedListNode28.remove();
        doublyLinkedListNode18.insertRight(doublyLinkedListNode28);
        doublyLinkedListNode18.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode18);
        doublyLinkedListNode18.remove();
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode1 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode1);
        doublyLinkedListNode0.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode4 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode5 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode4.insertRight(doublyLinkedListNode5);
        doublyLinkedListNode5.remove();
        doublyLinkedListNode5.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode5);
        doublyLinkedListNode0.remove();
        doublyLinkedListNode0.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode12 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode12.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode14 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode15 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode14.insertRight(doublyLinkedListNode15);
        doublyLinkedListNode15.remove();
        doublyLinkedListNode12.insertRight(doublyLinkedListNode15);
        examples.DoublyLinkedListNode doublyLinkedListNode19 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode19.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode21 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode22 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode21.insertRight(doublyLinkedListNode22);
        doublyLinkedListNode22.remove();
        doublyLinkedListNode19.insertRight(doublyLinkedListNode22);
        doublyLinkedListNode22.remove();
        doublyLinkedListNode12.insertRight(doublyLinkedListNode22);
        doublyLinkedListNode12.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode12);
        examples.DoublyLinkedListNode doublyLinkedListNode30 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode30.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode32 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode33 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode32.insertRight(doublyLinkedListNode33);
        doublyLinkedListNode33.remove();
        doublyLinkedListNode30.insertRight(doublyLinkedListNode33);
        examples.DoublyLinkedListNode doublyLinkedListNode37 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode37.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode39 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode37.insertRight(doublyLinkedListNode39);
        examples.DoublyLinkedListNode doublyLinkedListNode41 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode42 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode41.insertRight(doublyLinkedListNode42);
        doublyLinkedListNode42.remove();
        doublyLinkedListNode39.insertRight(doublyLinkedListNode42);
        doublyLinkedListNode39.remove();
        doublyLinkedListNode30.insertRight(doublyLinkedListNode39);
        doublyLinkedListNode30.remove();
        doublyLinkedListNode12.insertRight(doublyLinkedListNode30);
        java.lang.Class<?> wildcardClass50 = doublyLinkedListNode30.getClass();
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode2 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode3 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode2.insertRight(doublyLinkedListNode3);
        doublyLinkedListNode3.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode3);
        doublyLinkedListNode0.remove();
        java.lang.Class<?> wildcardClass8 = doublyLinkedListNode0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode1 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode1);
        examples.DoublyLinkedListNode doublyLinkedListNode3 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode3.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode5 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode3.insertRight(doublyLinkedListNode5);
        examples.DoublyLinkedListNode doublyLinkedListNode7 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode8 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode7.insertRight(doublyLinkedListNode8);
        doublyLinkedListNode8.remove();
        doublyLinkedListNode5.insertRight(doublyLinkedListNode8);
        doublyLinkedListNode5.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode5);
        examples.DoublyLinkedListNode doublyLinkedListNode14 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode14.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode16 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode14.insertRight(doublyLinkedListNode16);
        examples.DoublyLinkedListNode doublyLinkedListNode18 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode19 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode18.insertRight(doublyLinkedListNode19);
        doublyLinkedListNode19.remove();
        doublyLinkedListNode16.insertRight(doublyLinkedListNode19);
        doublyLinkedListNode16.remove();
        doublyLinkedListNode5.insertRight(doublyLinkedListNode16);
        doublyLinkedListNode16.remove();
        java.lang.Class<?> wildcardClass26 = doublyLinkedListNode16.getClass();
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode2 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode3 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode2.insertRight(doublyLinkedListNode3);
        doublyLinkedListNode3.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode3);
        java.lang.Class<?> wildcardClass7 = doublyLinkedListNode3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode1 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode1.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode3 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode1.insertRight(doublyLinkedListNode3);
        examples.DoublyLinkedListNode doublyLinkedListNode5 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode6 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode5.insertRight(doublyLinkedListNode6);
        doublyLinkedListNode6.remove();
        doublyLinkedListNode3.insertRight(doublyLinkedListNode6);
        doublyLinkedListNode3.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode3);
        doublyLinkedListNode0.remove();
        java.lang.Class<?> wildcardClass13 = doublyLinkedListNode0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode1 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode1);
        examples.DoublyLinkedListNode doublyLinkedListNode3 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode3.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode5 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode3.insertRight(doublyLinkedListNode5);
        examples.DoublyLinkedListNode doublyLinkedListNode7 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode8 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode7.insertRight(doublyLinkedListNode8);
        doublyLinkedListNode8.remove();
        doublyLinkedListNode5.insertRight(doublyLinkedListNode8);
        doublyLinkedListNode5.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode5);
        examples.DoublyLinkedListNode doublyLinkedListNode14 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode14.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode16 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode14.insertRight(doublyLinkedListNode16);
        examples.DoublyLinkedListNode doublyLinkedListNode18 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode19 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode18.insertRight(doublyLinkedListNode19);
        doublyLinkedListNode19.remove();
        doublyLinkedListNode16.insertRight(doublyLinkedListNode19);
        doublyLinkedListNode16.remove();
        doublyLinkedListNode5.insertRight(doublyLinkedListNode16);
        doublyLinkedListNode16.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode26 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode26.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode28 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode29 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode28.insertRight(doublyLinkedListNode29);
        doublyLinkedListNode29.remove();
        doublyLinkedListNode26.insertRight(doublyLinkedListNode29);
        examples.DoublyLinkedListNode doublyLinkedListNode33 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode33.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode35 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode36 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode35.insertRight(doublyLinkedListNode36);
        doublyLinkedListNode36.remove();
        doublyLinkedListNode33.insertRight(doublyLinkedListNode36);
        doublyLinkedListNode36.remove();
        doublyLinkedListNode26.insertRight(doublyLinkedListNode36);
        // The following exception was thrown during execution in test generation
        try {
            doublyLinkedListNode16.insertRight(doublyLinkedListNode26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter is not singleton");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode1 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode1);
        doublyLinkedListNode1.remove();
        doublyLinkedListNode1.remove();
        doublyLinkedListNode1.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode6 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode6.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode8 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode9 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode8.insertRight(doublyLinkedListNode9);
        doublyLinkedListNode9.remove();
        doublyLinkedListNode6.insertRight(doublyLinkedListNode9);
        doublyLinkedListNode6.remove();
        doublyLinkedListNode1.insertRight(doublyLinkedListNode6);
        java.lang.Class<?> wildcardClass15 = doublyLinkedListNode1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode1 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode1);
        doublyLinkedListNode0.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode4 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode5 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode4.insertRight(doublyLinkedListNode5);
        doublyLinkedListNode5.remove();
        doublyLinkedListNode5.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode5);
        examples.DoublyLinkedListNode doublyLinkedListNode10 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode10.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode12 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode10.insertRight(doublyLinkedListNode12);
        examples.DoublyLinkedListNode doublyLinkedListNode14 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode15 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode14.insertRight(doublyLinkedListNode15);
        doublyLinkedListNode15.remove();
        doublyLinkedListNode12.insertRight(doublyLinkedListNode15);
        doublyLinkedListNode12.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode12);
        examples.DoublyLinkedListNode doublyLinkedListNode21 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode21.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode23 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode21.insertRight(doublyLinkedListNode23);
        examples.DoublyLinkedListNode doublyLinkedListNode25 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode26 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode25.insertRight(doublyLinkedListNode26);
        doublyLinkedListNode26.remove();
        doublyLinkedListNode23.insertRight(doublyLinkedListNode26);
        doublyLinkedListNode23.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode31 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode23.insertRight(doublyLinkedListNode31);
        // The following exception was thrown during execution in test generation
        try {
            doublyLinkedListNode0.insertRight(doublyLinkedListNode31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter is not singleton");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode2 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode2);
        doublyLinkedListNode2.remove();
        java.lang.Class<?> wildcardClass5 = doublyLinkedListNode2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode2 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode3 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode2.insertRight(doublyLinkedListNode3);
        doublyLinkedListNode3.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode3);
        examples.DoublyLinkedListNode doublyLinkedListNode7 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode8 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode7.insertRight(doublyLinkedListNode8);
        doublyLinkedListNode8.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode8);
        examples.DoublyLinkedListNode doublyLinkedListNode12 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode12.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode14 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode15 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode14.insertRight(doublyLinkedListNode15);
        doublyLinkedListNode15.remove();
        doublyLinkedListNode12.insertRight(doublyLinkedListNode15);
        examples.DoublyLinkedListNode doublyLinkedListNode19 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode19.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode21 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode19.insertRight(doublyLinkedListNode21);
        examples.DoublyLinkedListNode doublyLinkedListNode23 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode24 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode23.insertRight(doublyLinkedListNode24);
        doublyLinkedListNode24.remove();
        doublyLinkedListNode21.insertRight(doublyLinkedListNode24);
        doublyLinkedListNode21.remove();
        doublyLinkedListNode12.insertRight(doublyLinkedListNode21);
        doublyLinkedListNode12.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode31 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode32 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode31.insertRight(doublyLinkedListNode32);
        doublyLinkedListNode31.remove();
        doublyLinkedListNode31.remove();
        doublyLinkedListNode12.insertRight(doublyLinkedListNode31);
        // The following exception was thrown during execution in test generation
        try {
            doublyLinkedListNode8.insertRight(doublyLinkedListNode31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter is not singleton");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode1 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode1.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode3 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode1.insertRight(doublyLinkedListNode3);
        examples.DoublyLinkedListNode doublyLinkedListNode5 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode6 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode5.insertRight(doublyLinkedListNode6);
        doublyLinkedListNode6.remove();
        doublyLinkedListNode3.insertRight(doublyLinkedListNode6);
        doublyLinkedListNode3.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode3);
        java.lang.Class<?> wildcardClass12 = doublyLinkedListNode3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode1 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode1);
        doublyLinkedListNode0.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode4 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode5 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode4.insertRight(doublyLinkedListNode5);
        doublyLinkedListNode5.remove();
        doublyLinkedListNode5.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode5);
        examples.DoublyLinkedListNode doublyLinkedListNode10 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode10.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode12 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode13 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode12.insertRight(doublyLinkedListNode13);
        doublyLinkedListNode13.remove();
        doublyLinkedListNode10.insertRight(doublyLinkedListNode13);
        examples.DoublyLinkedListNode doublyLinkedListNode17 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode17.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode19 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode17.insertRight(doublyLinkedListNode19);
        examples.DoublyLinkedListNode doublyLinkedListNode21 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode22 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode21.insertRight(doublyLinkedListNode22);
        doublyLinkedListNode22.remove();
        doublyLinkedListNode19.insertRight(doublyLinkedListNode22);
        doublyLinkedListNode19.remove();
        doublyLinkedListNode10.insertRight(doublyLinkedListNode19);
        doublyLinkedListNode10.remove();
        doublyLinkedListNode10.remove();
        doublyLinkedListNode5.insertRight(doublyLinkedListNode10);
        java.lang.Class<?> wildcardClass31 = doublyLinkedListNode10.getClass();
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode2 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode3 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode2.insertRight(doublyLinkedListNode3);
        doublyLinkedListNode3.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode3);
        examples.DoublyLinkedListNode doublyLinkedListNode7 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode7.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode9 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode7.insertRight(doublyLinkedListNode9);
        examples.DoublyLinkedListNode doublyLinkedListNode11 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode12 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode11.insertRight(doublyLinkedListNode12);
        doublyLinkedListNode12.remove();
        doublyLinkedListNode9.insertRight(doublyLinkedListNode12);
        doublyLinkedListNode9.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode9);
        examples.DoublyLinkedListNode doublyLinkedListNode18 = null;
        // The following exception was thrown during execution in test generation
        try {
            doublyLinkedListNode0.insertRight(doublyLinkedListNode18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: undefined for null parameter");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode1 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode1);
        examples.DoublyLinkedListNode doublyLinkedListNode3 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode3.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode5 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode3.insertRight(doublyLinkedListNode5);
        examples.DoublyLinkedListNode doublyLinkedListNode7 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode8 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode7.insertRight(doublyLinkedListNode8);
        doublyLinkedListNode8.remove();
        doublyLinkedListNode5.insertRight(doublyLinkedListNode8);
        doublyLinkedListNode5.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode5);
        java.lang.Class<?> wildcardClass14 = doublyLinkedListNode5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode1 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode1);
        doublyLinkedListNode0.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode4 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode5 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode4.insertRight(doublyLinkedListNode5);
        doublyLinkedListNode5.remove();
        doublyLinkedListNode5.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode5);
        doublyLinkedListNode0.remove();
        doublyLinkedListNode0.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode12 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode12.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode14 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode15 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode14.insertRight(doublyLinkedListNode15);
        doublyLinkedListNode15.remove();
        doublyLinkedListNode12.insertRight(doublyLinkedListNode15);
        examples.DoublyLinkedListNode doublyLinkedListNode19 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode19.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode21 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode22 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode21.insertRight(doublyLinkedListNode22);
        doublyLinkedListNode22.remove();
        doublyLinkedListNode19.insertRight(doublyLinkedListNode22);
        doublyLinkedListNode22.remove();
        doublyLinkedListNode12.insertRight(doublyLinkedListNode22);
        doublyLinkedListNode12.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode12);
        examples.DoublyLinkedListNode doublyLinkedListNode30 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode31 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode30.insertRight(doublyLinkedListNode31);
        examples.DoublyLinkedListNode doublyLinkedListNode33 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode33.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode35 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode33.insertRight(doublyLinkedListNode35);
        examples.DoublyLinkedListNode doublyLinkedListNode37 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode38 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode37.insertRight(doublyLinkedListNode38);
        doublyLinkedListNode38.remove();
        doublyLinkedListNode35.insertRight(doublyLinkedListNode38);
        doublyLinkedListNode35.remove();
        doublyLinkedListNode30.insertRight(doublyLinkedListNode35);
        examples.DoublyLinkedListNode doublyLinkedListNode44 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode44.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode46 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode44.insertRight(doublyLinkedListNode46);
        examples.DoublyLinkedListNode doublyLinkedListNode48 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode49 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode48.insertRight(doublyLinkedListNode49);
        doublyLinkedListNode49.remove();
        doublyLinkedListNode46.insertRight(doublyLinkedListNode49);
        doublyLinkedListNode46.remove();
        doublyLinkedListNode35.insertRight(doublyLinkedListNode46);
        // The following exception was thrown during execution in test generation
        try {
            doublyLinkedListNode0.insertRight(doublyLinkedListNode35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter is not singleton");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode2 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode3 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode2.insertRight(doublyLinkedListNode3);
        doublyLinkedListNode3.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode3);
        doublyLinkedListNode3.remove();
        java.lang.Class<?> wildcardClass8 = doublyLinkedListNode3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode2 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode2);
        examples.DoublyLinkedListNode doublyLinkedListNode4 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode5 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode4.insertRight(doublyLinkedListNode5);
        doublyLinkedListNode5.remove();
        doublyLinkedListNode2.insertRight(doublyLinkedListNode5);
        doublyLinkedListNode2.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode10 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode2.insertRight(doublyLinkedListNode10);
        doublyLinkedListNode2.remove();
        doublyLinkedListNode2.remove();
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode1 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode1);
        doublyLinkedListNode0.remove();
        doublyLinkedListNode0.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode5 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode6 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode5.insertRight(doublyLinkedListNode6);
        examples.DoublyLinkedListNode doublyLinkedListNode8 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode8.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode10 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode8.insertRight(doublyLinkedListNode10);
        examples.DoublyLinkedListNode doublyLinkedListNode12 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode13 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode12.insertRight(doublyLinkedListNode13);
        doublyLinkedListNode13.remove();
        doublyLinkedListNode10.insertRight(doublyLinkedListNode13);
        doublyLinkedListNode10.remove();
        doublyLinkedListNode5.insertRight(doublyLinkedListNode10);
        // The following exception was thrown during execution in test generation
        try {
            doublyLinkedListNode0.insertRight(doublyLinkedListNode10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter is not singleton");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode2 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode3 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode2.insertRight(doublyLinkedListNode3);
        doublyLinkedListNode3.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode3);
        examples.DoublyLinkedListNode doublyLinkedListNode7 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode7.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode9 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode7.insertRight(doublyLinkedListNode9);
        examples.DoublyLinkedListNode doublyLinkedListNode11 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode12 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode11.insertRight(doublyLinkedListNode12);
        doublyLinkedListNode12.remove();
        doublyLinkedListNode9.insertRight(doublyLinkedListNode12);
        doublyLinkedListNode9.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode9);
        examples.DoublyLinkedListNode doublyLinkedListNode18 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode18.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode20 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode21 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode20.insertRight(doublyLinkedListNode21);
        doublyLinkedListNode21.remove();
        doublyLinkedListNode18.insertRight(doublyLinkedListNode21);
        doublyLinkedListNode18.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode18);
        doublyLinkedListNode18.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode28 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode28.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode30 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode31 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode30.insertRight(doublyLinkedListNode31);
        doublyLinkedListNode31.remove();
        doublyLinkedListNode28.insertRight(doublyLinkedListNode31);
        examples.DoublyLinkedListNode doublyLinkedListNode35 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode36 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode35.insertRight(doublyLinkedListNode36);
        doublyLinkedListNode36.remove();
        doublyLinkedListNode28.insertRight(doublyLinkedListNode36);
        doublyLinkedListNode28.remove();
        doublyLinkedListNode28.remove();
        doublyLinkedListNode18.insertRight(doublyLinkedListNode28);
        java.lang.Class<?> wildcardClass43 = doublyLinkedListNode28.getClass();
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode2 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode3 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode2.insertRight(doublyLinkedListNode3);
        doublyLinkedListNode3.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode3);
        examples.DoublyLinkedListNode doublyLinkedListNode7 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode7.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode9 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode7.insertRight(doublyLinkedListNode9);
        examples.DoublyLinkedListNode doublyLinkedListNode11 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode12 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode11.insertRight(doublyLinkedListNode12);
        doublyLinkedListNode12.remove();
        doublyLinkedListNode9.insertRight(doublyLinkedListNode12);
        doublyLinkedListNode9.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode9);
        doublyLinkedListNode0.remove();
        doublyLinkedListNode0.remove();
        java.lang.Class<?> wildcardClass20 = doublyLinkedListNode0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode2 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode2);
        examples.DoublyLinkedListNode doublyLinkedListNode4 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode5 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode4.insertRight(doublyLinkedListNode5);
        doublyLinkedListNode5.remove();
        doublyLinkedListNode2.insertRight(doublyLinkedListNode5);
        doublyLinkedListNode2.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode10 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode2.insertRight(doublyLinkedListNode10);
        java.lang.Class<?> wildcardClass12 = doublyLinkedListNode10.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode2 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode3 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode2.insertRight(doublyLinkedListNode3);
        doublyLinkedListNode3.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode3);
        examples.DoublyLinkedListNode doublyLinkedListNode7 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode7.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode9 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode7.insertRight(doublyLinkedListNode9);
        examples.DoublyLinkedListNode doublyLinkedListNode11 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode12 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode11.insertRight(doublyLinkedListNode12);
        doublyLinkedListNode12.remove();
        doublyLinkedListNode9.insertRight(doublyLinkedListNode12);
        doublyLinkedListNode9.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode9);
        examples.DoublyLinkedListNode doublyLinkedListNode18 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode18.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode20 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode21 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode20.insertRight(doublyLinkedListNode21);
        doublyLinkedListNode21.remove();
        doublyLinkedListNode18.insertRight(doublyLinkedListNode21);
        doublyLinkedListNode18.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode18);
        doublyLinkedListNode0.remove();
        doublyLinkedListNode0.remove();
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode2 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode2);
        examples.DoublyLinkedListNode doublyLinkedListNode4 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode5 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode4.insertRight(doublyLinkedListNode5);
        doublyLinkedListNode5.remove();
        doublyLinkedListNode2.insertRight(doublyLinkedListNode5);
        doublyLinkedListNode2.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode10 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode2.insertRight(doublyLinkedListNode10);
        doublyLinkedListNode2.remove();
        java.lang.Class<?> wildcardClass13 = doublyLinkedListNode2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode1 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode1);
        examples.DoublyLinkedListNode doublyLinkedListNode3 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode3.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode5 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode6 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode5.insertRight(doublyLinkedListNode6);
        doublyLinkedListNode6.remove();
        doublyLinkedListNode3.insertRight(doublyLinkedListNode6);
        examples.DoublyLinkedListNode doublyLinkedListNode10 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode10.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode12 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode10.insertRight(doublyLinkedListNode12);
        examples.DoublyLinkedListNode doublyLinkedListNode14 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode15 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode14.insertRight(doublyLinkedListNode15);
        doublyLinkedListNode15.remove();
        doublyLinkedListNode12.insertRight(doublyLinkedListNode15);
        doublyLinkedListNode12.remove();
        doublyLinkedListNode3.insertRight(doublyLinkedListNode12);
        examples.DoublyLinkedListNode doublyLinkedListNode21 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode21.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode23 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode24 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode23.insertRight(doublyLinkedListNode24);
        doublyLinkedListNode24.remove();
        doublyLinkedListNode21.insertRight(doublyLinkedListNode24);
        doublyLinkedListNode21.remove();
        doublyLinkedListNode3.insertRight(doublyLinkedListNode21);
        examples.DoublyLinkedListNode doublyLinkedListNode30 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode30.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode32 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode33 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode32.insertRight(doublyLinkedListNode33);
        doublyLinkedListNode33.remove();
        doublyLinkedListNode30.insertRight(doublyLinkedListNode33);
        examples.DoublyLinkedListNode doublyLinkedListNode37 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode37.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode39 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode40 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode39.insertRight(doublyLinkedListNode40);
        doublyLinkedListNode40.remove();
        doublyLinkedListNode37.insertRight(doublyLinkedListNode40);
        examples.DoublyLinkedListNode doublyLinkedListNode44 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode44.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode46 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode44.insertRight(doublyLinkedListNode46);
        examples.DoublyLinkedListNode doublyLinkedListNode48 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode49 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode48.insertRight(doublyLinkedListNode49);
        doublyLinkedListNode49.remove();
        doublyLinkedListNode46.insertRight(doublyLinkedListNode49);
        doublyLinkedListNode46.remove();
        doublyLinkedListNode37.insertRight(doublyLinkedListNode46);
        examples.DoublyLinkedListNode doublyLinkedListNode55 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode55.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode57 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode58 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode57.insertRight(doublyLinkedListNode58);
        doublyLinkedListNode58.remove();
        doublyLinkedListNode55.insertRight(doublyLinkedListNode58);
        doublyLinkedListNode55.remove();
        doublyLinkedListNode37.insertRight(doublyLinkedListNode55);
        doublyLinkedListNode55.remove();
        doublyLinkedListNode33.insertRight(doublyLinkedListNode55);
        doublyLinkedListNode33.remove();
        doublyLinkedListNode3.insertRight(doublyLinkedListNode33);
        // The following exception was thrown during execution in test generation
        try {
            doublyLinkedListNode0.insertRight(doublyLinkedListNode3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter is not singleton");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode2 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode3 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode2.insertRight(doublyLinkedListNode3);
        doublyLinkedListNode3.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode3);
        doublyLinkedListNode0.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode8 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode8.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode10 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode11 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode10.insertRight(doublyLinkedListNode11);
        doublyLinkedListNode11.remove();
        doublyLinkedListNode8.insertRight(doublyLinkedListNode11);
        doublyLinkedListNode11.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode11);
        doublyLinkedListNode11.remove();
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode1 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode1.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode3 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode1.insertRight(doublyLinkedListNode3);
        examples.DoublyLinkedListNode doublyLinkedListNode5 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode6 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode5.insertRight(doublyLinkedListNode6);
        doublyLinkedListNode6.remove();
        doublyLinkedListNode3.insertRight(doublyLinkedListNode6);
        doublyLinkedListNode3.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode3);
        doublyLinkedListNode0.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode13 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode13.remove();
        doublyLinkedListNode13.remove();
        doublyLinkedListNode13.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode13);
        examples.DoublyLinkedListNode doublyLinkedListNode18 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode18.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode20 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode21 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode20.insertRight(doublyLinkedListNode21);
        doublyLinkedListNode21.remove();
        doublyLinkedListNode18.insertRight(doublyLinkedListNode21);
        examples.DoublyLinkedListNode doublyLinkedListNode25 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode26 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode25.insertRight(doublyLinkedListNode26);
        doublyLinkedListNode26.remove();
        doublyLinkedListNode18.insertRight(doublyLinkedListNode26);
        doublyLinkedListNode18.remove();
        doublyLinkedListNode18.remove();
        doublyLinkedListNode18.remove();
        doublyLinkedListNode13.insertRight(doublyLinkedListNode18);
        examples.DoublyLinkedListNode doublyLinkedListNode34 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode34.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode36 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode34.insertRight(doublyLinkedListNode36);
        // The following exception was thrown during execution in test generation
        try {
            doublyLinkedListNode18.insertRight(doublyLinkedListNode36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter is not singleton");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode1 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode1);
        examples.DoublyLinkedListNode doublyLinkedListNode3 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode3.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode5 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode3.insertRight(doublyLinkedListNode5);
        examples.DoublyLinkedListNode doublyLinkedListNode7 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode8 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode7.insertRight(doublyLinkedListNode8);
        doublyLinkedListNode8.remove();
        doublyLinkedListNode5.insertRight(doublyLinkedListNode8);
        doublyLinkedListNode5.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode5);
        examples.DoublyLinkedListNode doublyLinkedListNode14 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode14.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode16 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode17 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode16.insertRight(doublyLinkedListNode17);
        doublyLinkedListNode17.remove();
        doublyLinkedListNode14.insertRight(doublyLinkedListNode17);
        examples.DoublyLinkedListNode doublyLinkedListNode21 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode21.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode23 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode24 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode23.insertRight(doublyLinkedListNode24);
        doublyLinkedListNode24.remove();
        doublyLinkedListNode21.insertRight(doublyLinkedListNode24);
        examples.DoublyLinkedListNode doublyLinkedListNode28 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode28.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode30 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode28.insertRight(doublyLinkedListNode30);
        examples.DoublyLinkedListNode doublyLinkedListNode32 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode33 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode32.insertRight(doublyLinkedListNode33);
        doublyLinkedListNode33.remove();
        doublyLinkedListNode30.insertRight(doublyLinkedListNode33);
        doublyLinkedListNode30.remove();
        doublyLinkedListNode21.insertRight(doublyLinkedListNode30);
        examples.DoublyLinkedListNode doublyLinkedListNode39 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode39.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode41 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode42 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode41.insertRight(doublyLinkedListNode42);
        doublyLinkedListNode42.remove();
        doublyLinkedListNode39.insertRight(doublyLinkedListNode42);
        doublyLinkedListNode39.remove();
        doublyLinkedListNode21.insertRight(doublyLinkedListNode39);
        doublyLinkedListNode39.remove();
        doublyLinkedListNode17.insertRight(doublyLinkedListNode39);
        doublyLinkedListNode17.remove();
        doublyLinkedListNode5.insertRight(doublyLinkedListNode17);
        examples.DoublyLinkedListNode doublyLinkedListNode52 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode53 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode53.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode55 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode53.insertRight(doublyLinkedListNode55);
        examples.DoublyLinkedListNode doublyLinkedListNode57 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode58 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode57.insertRight(doublyLinkedListNode58);
        doublyLinkedListNode58.remove();
        doublyLinkedListNode55.insertRight(doublyLinkedListNode58);
        doublyLinkedListNode55.remove();
        doublyLinkedListNode52.insertRight(doublyLinkedListNode55);
        doublyLinkedListNode52.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode65 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode65.remove();
        doublyLinkedListNode65.remove();
        doublyLinkedListNode65.remove();
        doublyLinkedListNode52.insertRight(doublyLinkedListNode65);
        examples.DoublyLinkedListNode doublyLinkedListNode70 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode70.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode72 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode73 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode72.insertRight(doublyLinkedListNode73);
        doublyLinkedListNode73.remove();
        doublyLinkedListNode70.insertRight(doublyLinkedListNode73);
        examples.DoublyLinkedListNode doublyLinkedListNode77 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode78 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode77.insertRight(doublyLinkedListNode78);
        doublyLinkedListNode78.remove();
        doublyLinkedListNode70.insertRight(doublyLinkedListNode78);
        doublyLinkedListNode70.remove();
        doublyLinkedListNode70.remove();
        doublyLinkedListNode65.insertRight(doublyLinkedListNode70);
        // The following exception was thrown during execution in test generation
        try {
            doublyLinkedListNode17.insertRight(doublyLinkedListNode65);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter is not singleton");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode2 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode3 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode2.insertRight(doublyLinkedListNode3);
        doublyLinkedListNode3.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode3);
        examples.DoublyLinkedListNode doublyLinkedListNode7 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode7.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode9 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode10 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode9.insertRight(doublyLinkedListNode10);
        doublyLinkedListNode10.remove();
        doublyLinkedListNode7.insertRight(doublyLinkedListNode10);
        doublyLinkedListNode10.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode10);
        examples.DoublyLinkedListNode doublyLinkedListNode16 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode17 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode16.insertRight(doublyLinkedListNode17);
        doublyLinkedListNode16.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode20 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode21 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode20.insertRight(doublyLinkedListNode21);
        doublyLinkedListNode21.remove();
        doublyLinkedListNode21.remove();
        doublyLinkedListNode16.insertRight(doublyLinkedListNode21);
        doublyLinkedListNode16.remove();
        doublyLinkedListNode16.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode28 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode28.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode30 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode31 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode30.insertRight(doublyLinkedListNode31);
        doublyLinkedListNode31.remove();
        doublyLinkedListNode28.insertRight(doublyLinkedListNode31);
        examples.DoublyLinkedListNode doublyLinkedListNode35 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode35.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode37 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode38 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode37.insertRight(doublyLinkedListNode38);
        doublyLinkedListNode38.remove();
        doublyLinkedListNode35.insertRight(doublyLinkedListNode38);
        doublyLinkedListNode38.remove();
        doublyLinkedListNode28.insertRight(doublyLinkedListNode38);
        doublyLinkedListNode28.remove();
        doublyLinkedListNode16.insertRight(doublyLinkedListNode28);
        // The following exception was thrown during execution in test generation
        try {
            doublyLinkedListNode10.insertRight(doublyLinkedListNode28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter is not singleton");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode1 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode1.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode3 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode1.insertRight(doublyLinkedListNode3);
        examples.DoublyLinkedListNode doublyLinkedListNode5 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode6 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode5.insertRight(doublyLinkedListNode6);
        doublyLinkedListNode6.remove();
        doublyLinkedListNode3.insertRight(doublyLinkedListNode6);
        doublyLinkedListNode3.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode3);
        doublyLinkedListNode0.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode13 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode13.remove();
        doublyLinkedListNode13.remove();
        doublyLinkedListNode13.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode13);
        examples.DoublyLinkedListNode doublyLinkedListNode18 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode18.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode20 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode21 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode20.insertRight(doublyLinkedListNode21);
        doublyLinkedListNode21.remove();
        doublyLinkedListNode18.insertRight(doublyLinkedListNode21);
        examples.DoublyLinkedListNode doublyLinkedListNode25 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode26 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode25.insertRight(doublyLinkedListNode26);
        doublyLinkedListNode26.remove();
        doublyLinkedListNode18.insertRight(doublyLinkedListNode26);
        doublyLinkedListNode18.remove();
        doublyLinkedListNode18.remove();
        doublyLinkedListNode18.remove();
        doublyLinkedListNode13.insertRight(doublyLinkedListNode18);
        java.lang.Class<?> wildcardClass34 = doublyLinkedListNode18.getClass();
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode2 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode3 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode2.insertRight(doublyLinkedListNode3);
        doublyLinkedListNode3.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode3);
        examples.DoublyLinkedListNode doublyLinkedListNode7 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode8 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode7.insertRight(doublyLinkedListNode8);
        doublyLinkedListNode8.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode8);
        doublyLinkedListNode0.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode13 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode14 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode13.insertRight(doublyLinkedListNode14);
        doublyLinkedListNode13.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode17 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode18 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode17.insertRight(doublyLinkedListNode18);
        doublyLinkedListNode18.remove();
        doublyLinkedListNode18.remove();
        doublyLinkedListNode13.insertRight(doublyLinkedListNode18);
        doublyLinkedListNode13.remove();
        doublyLinkedListNode13.remove();
        doublyLinkedListNode13.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode13);
        examples.DoublyLinkedListNode doublyLinkedListNode27 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode28 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode27.insertRight(doublyLinkedListNode28);
        examples.DoublyLinkedListNode doublyLinkedListNode30 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode30.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode32 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode30.insertRight(doublyLinkedListNode32);
        examples.DoublyLinkedListNode doublyLinkedListNode34 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode35 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode34.insertRight(doublyLinkedListNode35);
        doublyLinkedListNode35.remove();
        doublyLinkedListNode32.insertRight(doublyLinkedListNode35);
        doublyLinkedListNode32.remove();
        doublyLinkedListNode27.insertRight(doublyLinkedListNode32);
        examples.DoublyLinkedListNode doublyLinkedListNode41 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode41.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode43 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode41.insertRight(doublyLinkedListNode43);
        examples.DoublyLinkedListNode doublyLinkedListNode45 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode46 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode45.insertRight(doublyLinkedListNode46);
        doublyLinkedListNode46.remove();
        doublyLinkedListNode43.insertRight(doublyLinkedListNode46);
        doublyLinkedListNode43.remove();
        doublyLinkedListNode32.insertRight(doublyLinkedListNode43);
        // The following exception was thrown during execution in test generation
        try {
            doublyLinkedListNode13.insertRight(doublyLinkedListNode32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter is not singleton");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode2 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode3 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode2.insertRight(doublyLinkedListNode3);
        doublyLinkedListNode3.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode3);
        examples.DoublyLinkedListNode doublyLinkedListNode7 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode7.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode9 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode7.insertRight(doublyLinkedListNode9);
        examples.DoublyLinkedListNode doublyLinkedListNode11 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode12 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode11.insertRight(doublyLinkedListNode12);
        doublyLinkedListNode12.remove();
        doublyLinkedListNode9.insertRight(doublyLinkedListNode12);
        doublyLinkedListNode9.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode9);
        examples.DoublyLinkedListNode doublyLinkedListNode18 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode18.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode20 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode21 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode20.insertRight(doublyLinkedListNode21);
        doublyLinkedListNode21.remove();
        doublyLinkedListNode18.insertRight(doublyLinkedListNode21);
        examples.DoublyLinkedListNode doublyLinkedListNode25 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode25.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode27 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode28 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode27.insertRight(doublyLinkedListNode28);
        doublyLinkedListNode28.remove();
        doublyLinkedListNode25.insertRight(doublyLinkedListNode28);
        doublyLinkedListNode28.remove();
        doublyLinkedListNode18.insertRight(doublyLinkedListNode28);
        doublyLinkedListNode18.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode18);
        doublyLinkedListNode0.remove();
        doublyLinkedListNode0.remove();
        java.lang.Class<?> wildcardClass38 = doublyLinkedListNode0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode1 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode1.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode3 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode1.insertRight(doublyLinkedListNode3);
        examples.DoublyLinkedListNode doublyLinkedListNode5 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode6 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode5.insertRight(doublyLinkedListNode6);
        doublyLinkedListNode6.remove();
        doublyLinkedListNode3.insertRight(doublyLinkedListNode6);
        doublyLinkedListNode3.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode3);
        doublyLinkedListNode0.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode13 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode13.remove();
        doublyLinkedListNode13.remove();
        doublyLinkedListNode13.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode13);
        examples.DoublyLinkedListNode doublyLinkedListNode18 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode18.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode20 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode21 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode20.insertRight(doublyLinkedListNode21);
        doublyLinkedListNode21.remove();
        doublyLinkedListNode18.insertRight(doublyLinkedListNode21);
        examples.DoublyLinkedListNode doublyLinkedListNode25 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode25.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode27 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode25.insertRight(doublyLinkedListNode27);
        examples.DoublyLinkedListNode doublyLinkedListNode29 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode30 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode29.insertRight(doublyLinkedListNode30);
        doublyLinkedListNode30.remove();
        doublyLinkedListNode27.insertRight(doublyLinkedListNode30);
        doublyLinkedListNode27.remove();
        doublyLinkedListNode18.insertRight(doublyLinkedListNode27);
        examples.DoublyLinkedListNode doublyLinkedListNode36 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode36.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode38 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode39 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode38.insertRight(doublyLinkedListNode39);
        doublyLinkedListNode39.remove();
        doublyLinkedListNode36.insertRight(doublyLinkedListNode39);
        examples.DoublyLinkedListNode doublyLinkedListNode43 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode43.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode45 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode46 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode45.insertRight(doublyLinkedListNode46);
        doublyLinkedListNode46.remove();
        doublyLinkedListNode43.insertRight(doublyLinkedListNode46);
        doublyLinkedListNode46.remove();
        doublyLinkedListNode36.insertRight(doublyLinkedListNode46);
        doublyLinkedListNode36.remove();
        doublyLinkedListNode18.insertRight(doublyLinkedListNode36);
        doublyLinkedListNode18.remove();
        doublyLinkedListNode18.remove();
        doublyLinkedListNode13.insertRight(doublyLinkedListNode18);
        doublyLinkedListNode18.remove();
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode2 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode2);
        examples.DoublyLinkedListNode doublyLinkedListNode4 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode4.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode6 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode7 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode6.insertRight(doublyLinkedListNode7);
        doublyLinkedListNode7.remove();
        doublyLinkedListNode4.insertRight(doublyLinkedListNode7);
        examples.DoublyLinkedListNode doublyLinkedListNode11 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode11.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode13 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode14 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode13.insertRight(doublyLinkedListNode14);
        doublyLinkedListNode14.remove();
        doublyLinkedListNode11.insertRight(doublyLinkedListNode14);
        examples.DoublyLinkedListNode doublyLinkedListNode18 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode18.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode20 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode18.insertRight(doublyLinkedListNode20);
        examples.DoublyLinkedListNode doublyLinkedListNode22 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode23 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode22.insertRight(doublyLinkedListNode23);
        doublyLinkedListNode23.remove();
        doublyLinkedListNode20.insertRight(doublyLinkedListNode23);
        doublyLinkedListNode20.remove();
        doublyLinkedListNode11.insertRight(doublyLinkedListNode20);
        examples.DoublyLinkedListNode doublyLinkedListNode29 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode29.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode31 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode32 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode31.insertRight(doublyLinkedListNode32);
        doublyLinkedListNode32.remove();
        doublyLinkedListNode29.insertRight(doublyLinkedListNode32);
        doublyLinkedListNode29.remove();
        doublyLinkedListNode11.insertRight(doublyLinkedListNode29);
        doublyLinkedListNode29.remove();
        doublyLinkedListNode7.insertRight(doublyLinkedListNode29);
        // The following exception was thrown during execution in test generation
        try {
            doublyLinkedListNode0.insertRight(doublyLinkedListNode7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter is not singleton");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode1 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode1);
        examples.DoublyLinkedListNode doublyLinkedListNode3 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode3.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode5 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode3.insertRight(doublyLinkedListNode5);
        examples.DoublyLinkedListNode doublyLinkedListNode7 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode8 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode7.insertRight(doublyLinkedListNode8);
        doublyLinkedListNode8.remove();
        doublyLinkedListNode5.insertRight(doublyLinkedListNode8);
        doublyLinkedListNode5.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode5);
        examples.DoublyLinkedListNode doublyLinkedListNode14 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode14.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode16 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode14.insertRight(doublyLinkedListNode16);
        examples.DoublyLinkedListNode doublyLinkedListNode18 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode19 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode18.insertRight(doublyLinkedListNode19);
        doublyLinkedListNode19.remove();
        doublyLinkedListNode16.insertRight(doublyLinkedListNode19);
        doublyLinkedListNode16.remove();
        doublyLinkedListNode5.insertRight(doublyLinkedListNode16);
        doublyLinkedListNode16.remove();
        doublyLinkedListNode16.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode27 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode27.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode29 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode30 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode29.insertRight(doublyLinkedListNode30);
        doublyLinkedListNode30.remove();
        doublyLinkedListNode27.insertRight(doublyLinkedListNode30);
        examples.DoublyLinkedListNode doublyLinkedListNode34 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode34.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode36 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode37 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode36.insertRight(doublyLinkedListNode37);
        doublyLinkedListNode37.remove();
        doublyLinkedListNode34.insertRight(doublyLinkedListNode37);
        examples.DoublyLinkedListNode doublyLinkedListNode41 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode41.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode43 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode41.insertRight(doublyLinkedListNode43);
        examples.DoublyLinkedListNode doublyLinkedListNode45 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode46 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode45.insertRight(doublyLinkedListNode46);
        doublyLinkedListNode46.remove();
        doublyLinkedListNode43.insertRight(doublyLinkedListNode46);
        doublyLinkedListNode43.remove();
        doublyLinkedListNode34.insertRight(doublyLinkedListNode43);
        examples.DoublyLinkedListNode doublyLinkedListNode52 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode52.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode54 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode55 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode54.insertRight(doublyLinkedListNode55);
        doublyLinkedListNode55.remove();
        doublyLinkedListNode52.insertRight(doublyLinkedListNode55);
        doublyLinkedListNode52.remove();
        doublyLinkedListNode34.insertRight(doublyLinkedListNode52);
        doublyLinkedListNode52.remove();
        doublyLinkedListNode30.insertRight(doublyLinkedListNode52);
        doublyLinkedListNode30.remove();
        doublyLinkedListNode16.insertRight(doublyLinkedListNode30);
        java.lang.Class<?> wildcardClass65 = doublyLinkedListNode16.getClass();
        org.junit.Assert.assertNotNull(wildcardClass65);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode1 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode1);
        examples.DoublyLinkedListNode doublyLinkedListNode3 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode3.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode5 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode3.insertRight(doublyLinkedListNode5);
        examples.DoublyLinkedListNode doublyLinkedListNode7 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode8 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode7.insertRight(doublyLinkedListNode8);
        doublyLinkedListNode8.remove();
        doublyLinkedListNode5.insertRight(doublyLinkedListNode8);
        doublyLinkedListNode5.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode5);
        examples.DoublyLinkedListNode doublyLinkedListNode14 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode15 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode15.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode17 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode15.insertRight(doublyLinkedListNode17);
        examples.DoublyLinkedListNode doublyLinkedListNode19 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode20 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode19.insertRight(doublyLinkedListNode20);
        doublyLinkedListNode20.remove();
        doublyLinkedListNode17.insertRight(doublyLinkedListNode20);
        doublyLinkedListNode17.remove();
        doublyLinkedListNode14.insertRight(doublyLinkedListNode17);
        // The following exception was thrown during execution in test generation
        try {
            doublyLinkedListNode0.insertRight(doublyLinkedListNode14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter is not singleton");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode1 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode1);
        doublyLinkedListNode0.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode4 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode5 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode4.insertRight(doublyLinkedListNode5);
        doublyLinkedListNode5.remove();
        doublyLinkedListNode5.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode5);
        doublyLinkedListNode0.remove();
        doublyLinkedListNode0.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode12 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode12.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode14 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode15 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode14.insertRight(doublyLinkedListNode15);
        doublyLinkedListNode15.remove();
        doublyLinkedListNode12.insertRight(doublyLinkedListNode15);
        examples.DoublyLinkedListNode doublyLinkedListNode19 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode19.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode21 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode22 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode21.insertRight(doublyLinkedListNode22);
        doublyLinkedListNode22.remove();
        doublyLinkedListNode19.insertRight(doublyLinkedListNode22);
        doublyLinkedListNode22.remove();
        doublyLinkedListNode12.insertRight(doublyLinkedListNode22);
        doublyLinkedListNode12.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode12);
        examples.DoublyLinkedListNode doublyLinkedListNode30 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode30.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode32 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode33 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode32.insertRight(doublyLinkedListNode33);
        doublyLinkedListNode33.remove();
        doublyLinkedListNode30.insertRight(doublyLinkedListNode33);
        examples.DoublyLinkedListNode doublyLinkedListNode37 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode37.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode39 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode37.insertRight(doublyLinkedListNode39);
        examples.DoublyLinkedListNode doublyLinkedListNode41 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode42 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode41.insertRight(doublyLinkedListNode42);
        doublyLinkedListNode42.remove();
        doublyLinkedListNode39.insertRight(doublyLinkedListNode42);
        doublyLinkedListNode39.remove();
        doublyLinkedListNode30.insertRight(doublyLinkedListNode39);
        doublyLinkedListNode30.remove();
        doublyLinkedListNode12.insertRight(doublyLinkedListNode30);
        examples.DoublyLinkedListNode doublyLinkedListNode50 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode50.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode52 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode53 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode52.insertRight(doublyLinkedListNode53);
        doublyLinkedListNode53.remove();
        doublyLinkedListNode50.insertRight(doublyLinkedListNode53);
        examples.DoublyLinkedListNode doublyLinkedListNode57 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode57.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode59 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode60 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode59.insertRight(doublyLinkedListNode60);
        doublyLinkedListNode60.remove();
        doublyLinkedListNode57.insertRight(doublyLinkedListNode60);
        examples.DoublyLinkedListNode doublyLinkedListNode64 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode64.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode66 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode64.insertRight(doublyLinkedListNode66);
        examples.DoublyLinkedListNode doublyLinkedListNode68 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode69 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode68.insertRight(doublyLinkedListNode69);
        doublyLinkedListNode69.remove();
        doublyLinkedListNode66.insertRight(doublyLinkedListNode69);
        doublyLinkedListNode66.remove();
        doublyLinkedListNode57.insertRight(doublyLinkedListNode66);
        examples.DoublyLinkedListNode doublyLinkedListNode75 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode75.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode77 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode78 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode77.insertRight(doublyLinkedListNode78);
        doublyLinkedListNode78.remove();
        doublyLinkedListNode75.insertRight(doublyLinkedListNode78);
        doublyLinkedListNode75.remove();
        doublyLinkedListNode57.insertRight(doublyLinkedListNode75);
        doublyLinkedListNode75.remove();
        doublyLinkedListNode53.insertRight(doublyLinkedListNode75);
        // The following exception was thrown during execution in test generation
        try {
            doublyLinkedListNode12.insertRight(doublyLinkedListNode75);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter is not singleton");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode2 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode3 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode2.insertRight(doublyLinkedListNode3);
        doublyLinkedListNode3.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode3);
        examples.DoublyLinkedListNode doublyLinkedListNode7 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode7.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode9 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode10 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode9.insertRight(doublyLinkedListNode10);
        doublyLinkedListNode10.remove();
        doublyLinkedListNode7.insertRight(doublyLinkedListNode10);
        examples.DoublyLinkedListNode doublyLinkedListNode14 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode14.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode16 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode14.insertRight(doublyLinkedListNode16);
        examples.DoublyLinkedListNode doublyLinkedListNode18 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode19 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode18.insertRight(doublyLinkedListNode19);
        doublyLinkedListNode19.remove();
        doublyLinkedListNode16.insertRight(doublyLinkedListNode19);
        doublyLinkedListNode16.remove();
        doublyLinkedListNode7.insertRight(doublyLinkedListNode16);
        examples.DoublyLinkedListNode doublyLinkedListNode25 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode25.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode27 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode28 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode27.insertRight(doublyLinkedListNode28);
        doublyLinkedListNode28.remove();
        doublyLinkedListNode25.insertRight(doublyLinkedListNode28);
        doublyLinkedListNode25.remove();
        doublyLinkedListNode7.insertRight(doublyLinkedListNode25);
        doublyLinkedListNode25.remove();
        doublyLinkedListNode3.insertRight(doublyLinkedListNode25);
        doublyLinkedListNode3.remove();
        java.lang.Class<?> wildcardClass37 = doublyLinkedListNode3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode1 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode1);
        doublyLinkedListNode1.remove();
        doublyLinkedListNode1.remove();
        doublyLinkedListNode1.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode6 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode6.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode8 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode9 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode8.insertRight(doublyLinkedListNode9);
        doublyLinkedListNode9.remove();
        doublyLinkedListNode6.insertRight(doublyLinkedListNode9);
        doublyLinkedListNode6.remove();
        doublyLinkedListNode1.insertRight(doublyLinkedListNode6);
        examples.DoublyLinkedListNode doublyLinkedListNode15 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode16 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode15.insertRight(doublyLinkedListNode16);
        doublyLinkedListNode15.remove();
        doublyLinkedListNode6.insertRight(doublyLinkedListNode15);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode2 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode2);
        doublyLinkedListNode0.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode5 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode6 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode6.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode8 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode6.insertRight(doublyLinkedListNode8);
        examples.DoublyLinkedListNode doublyLinkedListNode10 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode11 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode10.insertRight(doublyLinkedListNode11);
        doublyLinkedListNode11.remove();
        doublyLinkedListNode8.insertRight(doublyLinkedListNode11);
        doublyLinkedListNode8.remove();
        doublyLinkedListNode5.insertRight(doublyLinkedListNode8);
        // The following exception was thrown during execution in test generation
        try {
            doublyLinkedListNode0.insertRight(doublyLinkedListNode5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter is not singleton");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode1 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode1);
        doublyLinkedListNode0.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode4 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode5 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode4.insertRight(doublyLinkedListNode5);
        doublyLinkedListNode5.remove();
        doublyLinkedListNode5.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode5);
        examples.DoublyLinkedListNode doublyLinkedListNode10 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode10.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode12 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode10.insertRight(doublyLinkedListNode12);
        examples.DoublyLinkedListNode doublyLinkedListNode14 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode15 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode14.insertRight(doublyLinkedListNode15);
        doublyLinkedListNode15.remove();
        doublyLinkedListNode12.insertRight(doublyLinkedListNode15);
        doublyLinkedListNode12.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode12);
        examples.DoublyLinkedListNode doublyLinkedListNode21 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode21.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode23 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode24 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode23.insertRight(doublyLinkedListNode24);
        doublyLinkedListNode24.remove();
        doublyLinkedListNode21.insertRight(doublyLinkedListNode24);
        // The following exception was thrown during execution in test generation
        try {
            doublyLinkedListNode12.insertRight(doublyLinkedListNode24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter is not singleton");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode1 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode1);
        doublyLinkedListNode1.remove();
        doublyLinkedListNode1.remove();
        doublyLinkedListNode1.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode6 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode6.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode8 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode9 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode8.insertRight(doublyLinkedListNode9);
        doublyLinkedListNode9.remove();
        doublyLinkedListNode6.insertRight(doublyLinkedListNode9);
        doublyLinkedListNode6.remove();
        doublyLinkedListNode1.insertRight(doublyLinkedListNode6);
        examples.DoublyLinkedListNode doublyLinkedListNode15 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode16 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode16.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode18 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode16.insertRight(doublyLinkedListNode18);
        examples.DoublyLinkedListNode doublyLinkedListNode20 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode21 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode20.insertRight(doublyLinkedListNode21);
        doublyLinkedListNode21.remove();
        doublyLinkedListNode18.insertRight(doublyLinkedListNode21);
        doublyLinkedListNode18.remove();
        doublyLinkedListNode15.insertRight(doublyLinkedListNode18);
        doublyLinkedListNode15.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode28 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode28.remove();
        doublyLinkedListNode28.remove();
        doublyLinkedListNode28.remove();
        doublyLinkedListNode15.insertRight(doublyLinkedListNode28);
        examples.DoublyLinkedListNode doublyLinkedListNode33 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode33.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode35 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode36 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode35.insertRight(doublyLinkedListNode36);
        doublyLinkedListNode36.remove();
        doublyLinkedListNode33.insertRight(doublyLinkedListNode36);
        examples.DoublyLinkedListNode doublyLinkedListNode40 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode41 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode40.insertRight(doublyLinkedListNode41);
        doublyLinkedListNode41.remove();
        doublyLinkedListNode33.insertRight(doublyLinkedListNode41);
        doublyLinkedListNode33.remove();
        doublyLinkedListNode33.remove();
        doublyLinkedListNode33.remove();
        doublyLinkedListNode28.insertRight(doublyLinkedListNode33);
        // The following exception was thrown during execution in test generation
        try {
            doublyLinkedListNode1.insertRight(doublyLinkedListNode28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter is not singleton");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode1 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode1);
        examples.DoublyLinkedListNode doublyLinkedListNode3 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode3.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode5 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode3.insertRight(doublyLinkedListNode5);
        examples.DoublyLinkedListNode doublyLinkedListNode7 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode8 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode7.insertRight(doublyLinkedListNode8);
        doublyLinkedListNode8.remove();
        doublyLinkedListNode5.insertRight(doublyLinkedListNode8);
        doublyLinkedListNode5.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode5);
        examples.DoublyLinkedListNode doublyLinkedListNode14 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode14.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode16 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode14.insertRight(doublyLinkedListNode16);
        examples.DoublyLinkedListNode doublyLinkedListNode18 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode19 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode18.insertRight(doublyLinkedListNode19);
        doublyLinkedListNode19.remove();
        doublyLinkedListNode16.insertRight(doublyLinkedListNode19);
        doublyLinkedListNode16.remove();
        doublyLinkedListNode5.insertRight(doublyLinkedListNode16);
        examples.DoublyLinkedListNode doublyLinkedListNode25 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode25.remove();
        doublyLinkedListNode5.insertRight(doublyLinkedListNode25);
        examples.DoublyLinkedListNode doublyLinkedListNode28 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode29 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode28.insertRight(doublyLinkedListNode29);
        examples.DoublyLinkedListNode doublyLinkedListNode31 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode31.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode33 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode31.insertRight(doublyLinkedListNode33);
        examples.DoublyLinkedListNode doublyLinkedListNode35 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode36 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode35.insertRight(doublyLinkedListNode36);
        doublyLinkedListNode36.remove();
        doublyLinkedListNode33.insertRight(doublyLinkedListNode36);
        doublyLinkedListNode33.remove();
        doublyLinkedListNode28.insertRight(doublyLinkedListNode33);
        // The following exception was thrown during execution in test generation
        try {
            doublyLinkedListNode5.insertRight(doublyLinkedListNode33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter is not singleton");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode2 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode3 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode2.insertRight(doublyLinkedListNode3);
        doublyLinkedListNode3.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode3);
        examples.DoublyLinkedListNode doublyLinkedListNode7 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode7.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode9 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode7.insertRight(doublyLinkedListNode9);
        examples.DoublyLinkedListNode doublyLinkedListNode11 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode12 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode11.insertRight(doublyLinkedListNode12);
        doublyLinkedListNode12.remove();
        doublyLinkedListNode9.insertRight(doublyLinkedListNode12);
        doublyLinkedListNode9.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode9);
        examples.DoublyLinkedListNode doublyLinkedListNode18 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode18.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode20 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode21 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode20.insertRight(doublyLinkedListNode21);
        doublyLinkedListNode21.remove();
        doublyLinkedListNode18.insertRight(doublyLinkedListNode21);
        doublyLinkedListNode18.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode18);
        java.lang.Class<?> wildcardClass27 = doublyLinkedListNode18.getClass();
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode1 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode1);
        examples.DoublyLinkedListNode doublyLinkedListNode3 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode3.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode5 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode3.insertRight(doublyLinkedListNode5);
        examples.DoublyLinkedListNode doublyLinkedListNode7 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode8 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode7.insertRight(doublyLinkedListNode8);
        doublyLinkedListNode8.remove();
        doublyLinkedListNode5.insertRight(doublyLinkedListNode8);
        doublyLinkedListNode5.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode5);
        examples.DoublyLinkedListNode doublyLinkedListNode14 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode14.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode16 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode14.insertRight(doublyLinkedListNode16);
        examples.DoublyLinkedListNode doublyLinkedListNode18 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode19 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode18.insertRight(doublyLinkedListNode19);
        doublyLinkedListNode19.remove();
        doublyLinkedListNode16.insertRight(doublyLinkedListNode19);
        doublyLinkedListNode16.remove();
        doublyLinkedListNode5.insertRight(doublyLinkedListNode16);
        doublyLinkedListNode16.remove();
        doublyLinkedListNode16.remove();
        doublyLinkedListNode16.remove();
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode2 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode3 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode2.insertRight(doublyLinkedListNode3);
        doublyLinkedListNode3.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode3);
        doublyLinkedListNode0.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode8 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode8.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode10 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode11 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode10.insertRight(doublyLinkedListNode11);
        doublyLinkedListNode11.remove();
        doublyLinkedListNode8.insertRight(doublyLinkedListNode11);
        examples.DoublyLinkedListNode doublyLinkedListNode15 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode15.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode17 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode15.insertRight(doublyLinkedListNode17);
        examples.DoublyLinkedListNode doublyLinkedListNode19 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode20 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode19.insertRight(doublyLinkedListNode20);
        doublyLinkedListNode20.remove();
        doublyLinkedListNode17.insertRight(doublyLinkedListNode20);
        doublyLinkedListNode17.remove();
        doublyLinkedListNode8.insertRight(doublyLinkedListNode17);
        examples.DoublyLinkedListNode doublyLinkedListNode26 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode26.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode28 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode29 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode28.insertRight(doublyLinkedListNode29);
        doublyLinkedListNode29.remove();
        doublyLinkedListNode26.insertRight(doublyLinkedListNode29);
        doublyLinkedListNode26.remove();
        doublyLinkedListNode8.insertRight(doublyLinkedListNode26);
        doublyLinkedListNode8.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode8);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode1 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode1);
        doublyLinkedListNode0.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode4 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode5 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode4.insertRight(doublyLinkedListNode5);
        doublyLinkedListNode5.remove();
        doublyLinkedListNode5.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode5);
        doublyLinkedListNode0.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode11 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode12 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode11.insertRight(doublyLinkedListNode12);
        doublyLinkedListNode12.remove();
        doublyLinkedListNode12.remove();
        doublyLinkedListNode12.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode17 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode17.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode19 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode20 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode19.insertRight(doublyLinkedListNode20);
        doublyLinkedListNode20.remove();
        doublyLinkedListNode17.insertRight(doublyLinkedListNode20);
        doublyLinkedListNode17.remove();
        doublyLinkedListNode12.insertRight(doublyLinkedListNode17);
        // The following exception was thrown during execution in test generation
        try {
            doublyLinkedListNode0.insertRight(doublyLinkedListNode12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter is not singleton");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.remove();
        doublyLinkedListNode0.remove();
        doublyLinkedListNode0.remove();
        doublyLinkedListNode0.remove();
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode1 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode1);
        examples.DoublyLinkedListNode doublyLinkedListNode3 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode3.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode5 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode3.insertRight(doublyLinkedListNode5);
        examples.DoublyLinkedListNode doublyLinkedListNode7 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode8 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode7.insertRight(doublyLinkedListNode8);
        doublyLinkedListNode8.remove();
        doublyLinkedListNode5.insertRight(doublyLinkedListNode8);
        doublyLinkedListNode5.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode5);
        doublyLinkedListNode0.remove();
        java.lang.Class<?> wildcardClass15 = doublyLinkedListNode0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode1 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode1.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode3 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode4 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode3.insertRight(doublyLinkedListNode4);
        doublyLinkedListNode4.remove();
        doublyLinkedListNode1.insertRight(doublyLinkedListNode4);
        examples.DoublyLinkedListNode doublyLinkedListNode8 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode8.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode10 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode8.insertRight(doublyLinkedListNode10);
        examples.DoublyLinkedListNode doublyLinkedListNode12 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode13 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode12.insertRight(doublyLinkedListNode13);
        doublyLinkedListNode13.remove();
        doublyLinkedListNode10.insertRight(doublyLinkedListNode13);
        doublyLinkedListNode10.remove();
        doublyLinkedListNode1.insertRight(doublyLinkedListNode10);
        examples.DoublyLinkedListNode doublyLinkedListNode19 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode19.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode21 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode22 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode21.insertRight(doublyLinkedListNode22);
        doublyLinkedListNode22.remove();
        doublyLinkedListNode19.insertRight(doublyLinkedListNode22);
        doublyLinkedListNode19.remove();
        doublyLinkedListNode1.insertRight(doublyLinkedListNode19);
        doublyLinkedListNode19.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode29 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode29.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode31 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode32 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode31.insertRight(doublyLinkedListNode32);
        doublyLinkedListNode32.remove();
        doublyLinkedListNode29.insertRight(doublyLinkedListNode32);
        examples.DoublyLinkedListNode doublyLinkedListNode36 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode37 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode36.insertRight(doublyLinkedListNode37);
        doublyLinkedListNode37.remove();
        doublyLinkedListNode29.insertRight(doublyLinkedListNode37);
        doublyLinkedListNode29.remove();
        doublyLinkedListNode29.remove();
        doublyLinkedListNode19.insertRight(doublyLinkedListNode29);
        // The following exception was thrown during execution in test generation
        try {
            doublyLinkedListNode0.insertRight(doublyLinkedListNode29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter is not singleton");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode2 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode3 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode2.insertRight(doublyLinkedListNode3);
        doublyLinkedListNode3.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode3);
        examples.DoublyLinkedListNode doublyLinkedListNode7 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode7.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode9 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode7.insertRight(doublyLinkedListNode9);
        examples.DoublyLinkedListNode doublyLinkedListNode11 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode12 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode11.insertRight(doublyLinkedListNode12);
        doublyLinkedListNode12.remove();
        doublyLinkedListNode9.insertRight(doublyLinkedListNode12);
        doublyLinkedListNode9.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode9);
        doublyLinkedListNode0.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode19 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode20 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode19.insertRight(doublyLinkedListNode20);
        doublyLinkedListNode19.remove();
        doublyLinkedListNode19.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode19);
        examples.DoublyLinkedListNode doublyLinkedListNode25 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode25.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode27 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode28 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode27.insertRight(doublyLinkedListNode28);
        doublyLinkedListNode28.remove();
        doublyLinkedListNode25.insertRight(doublyLinkedListNode28);
        examples.DoublyLinkedListNode doublyLinkedListNode32 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode33 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode32.insertRight(doublyLinkedListNode33);
        doublyLinkedListNode33.remove();
        doublyLinkedListNode25.insertRight(doublyLinkedListNode33);
        doublyLinkedListNode25.remove();
        doublyLinkedListNode25.remove();
        doublyLinkedListNode25.remove();
        doublyLinkedListNode19.insertRight(doublyLinkedListNode25);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode1 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode1);
        doublyLinkedListNode0.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode4 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode5 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode4.insertRight(doublyLinkedListNode5);
        doublyLinkedListNode5.remove();
        doublyLinkedListNode5.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode5);
        doublyLinkedListNode0.remove();
        doublyLinkedListNode0.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode12 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode12.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode14 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode15 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode14.insertRight(doublyLinkedListNode15);
        doublyLinkedListNode15.remove();
        doublyLinkedListNode12.insertRight(doublyLinkedListNode15);
        examples.DoublyLinkedListNode doublyLinkedListNode19 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode19.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode21 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode22 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode21.insertRight(doublyLinkedListNode22);
        doublyLinkedListNode22.remove();
        doublyLinkedListNode19.insertRight(doublyLinkedListNode22);
        doublyLinkedListNode22.remove();
        doublyLinkedListNode12.insertRight(doublyLinkedListNode22);
        doublyLinkedListNode12.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode12);
        examples.DoublyLinkedListNode doublyLinkedListNode30 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode30.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode32 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode33 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode32.insertRight(doublyLinkedListNode33);
        doublyLinkedListNode33.remove();
        doublyLinkedListNode30.insertRight(doublyLinkedListNode33);
        doublyLinkedListNode30.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode30);
        java.lang.Class<?> wildcardClass39 = doublyLinkedListNode0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode1 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode1);
        doublyLinkedListNode0.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode4 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode4.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode6 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode7 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode6.insertRight(doublyLinkedListNode7);
        doublyLinkedListNode7.remove();
        doublyLinkedListNode4.insertRight(doublyLinkedListNode7);
        examples.DoublyLinkedListNode doublyLinkedListNode11 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode12 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode11.insertRight(doublyLinkedListNode12);
        doublyLinkedListNode12.remove();
        doublyLinkedListNode4.insertRight(doublyLinkedListNode12);
        // The following exception was thrown during execution in test generation
        try {
            doublyLinkedListNode0.insertRight(doublyLinkedListNode12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter is not singleton");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode1 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode1);
        doublyLinkedListNode0.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode4 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode5 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode4.insertRight(doublyLinkedListNode5);
        doublyLinkedListNode5.remove();
        doublyLinkedListNode5.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode5);
        doublyLinkedListNode0.remove();
        doublyLinkedListNode0.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode12 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode12.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode14 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode15 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode14.insertRight(doublyLinkedListNode15);
        doublyLinkedListNode15.remove();
        doublyLinkedListNode12.insertRight(doublyLinkedListNode15);
        examples.DoublyLinkedListNode doublyLinkedListNode19 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode19.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode21 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode22 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode21.insertRight(doublyLinkedListNode22);
        doublyLinkedListNode22.remove();
        doublyLinkedListNode19.insertRight(doublyLinkedListNode22);
        doublyLinkedListNode22.remove();
        doublyLinkedListNode12.insertRight(doublyLinkedListNode22);
        doublyLinkedListNode12.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode12);
        examples.DoublyLinkedListNode doublyLinkedListNode30 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode30.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode32 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode33 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode32.insertRight(doublyLinkedListNode33);
        doublyLinkedListNode33.remove();
        doublyLinkedListNode30.insertRight(doublyLinkedListNode33);
        examples.DoublyLinkedListNode doublyLinkedListNode37 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode37.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode39 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode37.insertRight(doublyLinkedListNode39);
        examples.DoublyLinkedListNode doublyLinkedListNode41 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode42 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode41.insertRight(doublyLinkedListNode42);
        doublyLinkedListNode42.remove();
        doublyLinkedListNode39.insertRight(doublyLinkedListNode42);
        doublyLinkedListNode39.remove();
        doublyLinkedListNode30.insertRight(doublyLinkedListNode39);
        doublyLinkedListNode30.remove();
        doublyLinkedListNode12.insertRight(doublyLinkedListNode30);
        examples.DoublyLinkedListNode doublyLinkedListNode50 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode50.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode52 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode53 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode52.insertRight(doublyLinkedListNode53);
        doublyLinkedListNode53.remove();
        doublyLinkedListNode50.insertRight(doublyLinkedListNode53);
        examples.DoublyLinkedListNode doublyLinkedListNode57 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode57.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode59 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode60 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode59.insertRight(doublyLinkedListNode60);
        doublyLinkedListNode60.remove();
        doublyLinkedListNode57.insertRight(doublyLinkedListNode60);
        examples.DoublyLinkedListNode doublyLinkedListNode64 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode64.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode66 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode64.insertRight(doublyLinkedListNode66);
        examples.DoublyLinkedListNode doublyLinkedListNode68 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode69 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode68.insertRight(doublyLinkedListNode69);
        doublyLinkedListNode69.remove();
        doublyLinkedListNode66.insertRight(doublyLinkedListNode69);
        doublyLinkedListNode66.remove();
        doublyLinkedListNode57.insertRight(doublyLinkedListNode66);
        examples.DoublyLinkedListNode doublyLinkedListNode75 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode75.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode77 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode78 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode77.insertRight(doublyLinkedListNode78);
        doublyLinkedListNode78.remove();
        doublyLinkedListNode75.insertRight(doublyLinkedListNode78);
        doublyLinkedListNode75.remove();
        doublyLinkedListNode57.insertRight(doublyLinkedListNode75);
        doublyLinkedListNode75.remove();
        doublyLinkedListNode53.insertRight(doublyLinkedListNode75);
        doublyLinkedListNode53.remove();
        doublyLinkedListNode12.insertRight(doublyLinkedListNode53);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode1 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode1.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode3 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode1.insertRight(doublyLinkedListNode3);
        examples.DoublyLinkedListNode doublyLinkedListNode5 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode6 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode5.insertRight(doublyLinkedListNode6);
        doublyLinkedListNode6.remove();
        doublyLinkedListNode3.insertRight(doublyLinkedListNode6);
        doublyLinkedListNode3.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode3);
        doublyLinkedListNode0.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode13 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode13.remove();
        doublyLinkedListNode13.remove();
        doublyLinkedListNode13.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode13);
        examples.DoublyLinkedListNode doublyLinkedListNode18 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode18.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode20 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode21 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode20.insertRight(doublyLinkedListNode21);
        doublyLinkedListNode21.remove();
        doublyLinkedListNode18.insertRight(doublyLinkedListNode21);
        examples.DoublyLinkedListNode doublyLinkedListNode25 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode26 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode25.insertRight(doublyLinkedListNode26);
        doublyLinkedListNode26.remove();
        doublyLinkedListNode18.insertRight(doublyLinkedListNode26);
        doublyLinkedListNode18.remove();
        doublyLinkedListNode18.remove();
        doublyLinkedListNode18.remove();
        doublyLinkedListNode13.insertRight(doublyLinkedListNode18);
        java.lang.Class<?> wildcardClass34 = doublyLinkedListNode13.getClass();
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode2 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode2);
        examples.DoublyLinkedListNode doublyLinkedListNode4 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode5 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode4.insertRight(doublyLinkedListNode5);
        doublyLinkedListNode5.remove();
        doublyLinkedListNode2.insertRight(doublyLinkedListNode5);
        examples.DoublyLinkedListNode doublyLinkedListNode9 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode10 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode10.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode12 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode10.insertRight(doublyLinkedListNode12);
        examples.DoublyLinkedListNode doublyLinkedListNode14 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode15 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode14.insertRight(doublyLinkedListNode15);
        doublyLinkedListNode15.remove();
        doublyLinkedListNode12.insertRight(doublyLinkedListNode15);
        doublyLinkedListNode12.remove();
        doublyLinkedListNode9.insertRight(doublyLinkedListNode12);
        doublyLinkedListNode9.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode22 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode22.remove();
        doublyLinkedListNode22.remove();
        doublyLinkedListNode22.remove();
        doublyLinkedListNode9.insertRight(doublyLinkedListNode22);
        examples.DoublyLinkedListNode doublyLinkedListNode27 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode27.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode29 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode30 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode29.insertRight(doublyLinkedListNode30);
        doublyLinkedListNode30.remove();
        doublyLinkedListNode27.insertRight(doublyLinkedListNode30);
        examples.DoublyLinkedListNode doublyLinkedListNode34 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode35 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode34.insertRight(doublyLinkedListNode35);
        doublyLinkedListNode35.remove();
        doublyLinkedListNode27.insertRight(doublyLinkedListNode35);
        doublyLinkedListNode27.remove();
        doublyLinkedListNode27.remove();
        doublyLinkedListNode22.insertRight(doublyLinkedListNode27);
        // The following exception was thrown during execution in test generation
        try {
            doublyLinkedListNode5.insertRight(doublyLinkedListNode27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter is not singleton");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode2 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode3 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode2.insertRight(doublyLinkedListNode3);
        doublyLinkedListNode3.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode3);
        examples.DoublyLinkedListNode doublyLinkedListNode7 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode8 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode7.insertRight(doublyLinkedListNode8);
        doublyLinkedListNode8.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode8);
        doublyLinkedListNode0.remove();
        doublyLinkedListNode0.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode14 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode15 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode14.insertRight(doublyLinkedListNode15);
        doublyLinkedListNode14.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode18 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode19 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode18.insertRight(doublyLinkedListNode19);
        doublyLinkedListNode19.remove();
        doublyLinkedListNode19.remove();
        doublyLinkedListNode14.insertRight(doublyLinkedListNode19);
        examples.DoublyLinkedListNode doublyLinkedListNode24 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode24.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode26 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode27 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode26.insertRight(doublyLinkedListNode27);
        doublyLinkedListNode27.remove();
        doublyLinkedListNode24.insertRight(doublyLinkedListNode27);
        examples.DoublyLinkedListNode doublyLinkedListNode31 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode31.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode33 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode31.insertRight(doublyLinkedListNode33);
        examples.DoublyLinkedListNode doublyLinkedListNode35 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode36 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode35.insertRight(doublyLinkedListNode36);
        doublyLinkedListNode36.remove();
        doublyLinkedListNode33.insertRight(doublyLinkedListNode36);
        doublyLinkedListNode33.remove();
        doublyLinkedListNode24.insertRight(doublyLinkedListNode33);
        doublyLinkedListNode24.remove();
        doublyLinkedListNode24.remove();
        doublyLinkedListNode19.insertRight(doublyLinkedListNode24);
        // The following exception was thrown during execution in test generation
        try {
            doublyLinkedListNode0.insertRight(doublyLinkedListNode19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter is not singleton");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode2 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode3 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode2.insertRight(doublyLinkedListNode3);
        doublyLinkedListNode3.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode3);
        examples.DoublyLinkedListNode doublyLinkedListNode7 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode8 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode7.insertRight(doublyLinkedListNode8);
        doublyLinkedListNode8.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode8);
        doublyLinkedListNode0.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode13 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode14 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode13.insertRight(doublyLinkedListNode14);
        doublyLinkedListNode13.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode17 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode18 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode17.insertRight(doublyLinkedListNode18);
        doublyLinkedListNode18.remove();
        doublyLinkedListNode18.remove();
        doublyLinkedListNode13.insertRight(doublyLinkedListNode18);
        doublyLinkedListNode13.remove();
        doublyLinkedListNode13.remove();
        doublyLinkedListNode13.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode13);
        examples.DoublyLinkedListNode doublyLinkedListNode27 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode28 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode28.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode30 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode28.insertRight(doublyLinkedListNode30);
        examples.DoublyLinkedListNode doublyLinkedListNode32 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode33 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode32.insertRight(doublyLinkedListNode33);
        doublyLinkedListNode33.remove();
        doublyLinkedListNode30.insertRight(doublyLinkedListNode33);
        doublyLinkedListNode30.remove();
        doublyLinkedListNode27.insertRight(doublyLinkedListNode30);
        doublyLinkedListNode27.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode40 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode40.remove();
        doublyLinkedListNode40.remove();
        doublyLinkedListNode40.remove();
        doublyLinkedListNode27.insertRight(doublyLinkedListNode40);
        examples.DoublyLinkedListNode doublyLinkedListNode45 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode45.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode47 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode48 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode47.insertRight(doublyLinkedListNode48);
        doublyLinkedListNode48.remove();
        doublyLinkedListNode45.insertRight(doublyLinkedListNode48);
        examples.DoublyLinkedListNode doublyLinkedListNode52 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode52.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode54 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode52.insertRight(doublyLinkedListNode54);
        examples.DoublyLinkedListNode doublyLinkedListNode56 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode57 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode56.insertRight(doublyLinkedListNode57);
        doublyLinkedListNode57.remove();
        doublyLinkedListNode54.insertRight(doublyLinkedListNode57);
        doublyLinkedListNode54.remove();
        doublyLinkedListNode45.insertRight(doublyLinkedListNode54);
        examples.DoublyLinkedListNode doublyLinkedListNode63 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode63.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode65 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode66 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode65.insertRight(doublyLinkedListNode66);
        doublyLinkedListNode66.remove();
        doublyLinkedListNode63.insertRight(doublyLinkedListNode66);
        examples.DoublyLinkedListNode doublyLinkedListNode70 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode70.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode72 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode73 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode72.insertRight(doublyLinkedListNode73);
        doublyLinkedListNode73.remove();
        doublyLinkedListNode70.insertRight(doublyLinkedListNode73);
        doublyLinkedListNode73.remove();
        doublyLinkedListNode63.insertRight(doublyLinkedListNode73);
        doublyLinkedListNode63.remove();
        doublyLinkedListNode45.insertRight(doublyLinkedListNode63);
        doublyLinkedListNode45.remove();
        doublyLinkedListNode45.remove();
        doublyLinkedListNode40.insertRight(doublyLinkedListNode45);
        // The following exception was thrown during execution in test generation
        try {
            doublyLinkedListNode0.insertRight(doublyLinkedListNode45);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter is not singleton");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode1 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode1.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode3 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode1.insertRight(doublyLinkedListNode3);
        examples.DoublyLinkedListNode doublyLinkedListNode5 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode6 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode5.insertRight(doublyLinkedListNode6);
        doublyLinkedListNode6.remove();
        doublyLinkedListNode3.insertRight(doublyLinkedListNode6);
        doublyLinkedListNode3.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode3);
        doublyLinkedListNode0.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode13 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode13.remove();
        doublyLinkedListNode13.remove();
        doublyLinkedListNode13.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode13);
        examples.DoublyLinkedListNode doublyLinkedListNode18 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode18.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode20 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode21 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode20.insertRight(doublyLinkedListNode21);
        doublyLinkedListNode21.remove();
        doublyLinkedListNode18.insertRight(doublyLinkedListNode21);
        examples.DoublyLinkedListNode doublyLinkedListNode25 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode26 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode25.insertRight(doublyLinkedListNode26);
        doublyLinkedListNode26.remove();
        doublyLinkedListNode18.insertRight(doublyLinkedListNode26);
        doublyLinkedListNode18.remove();
        doublyLinkedListNode18.remove();
        doublyLinkedListNode18.remove();
        doublyLinkedListNode13.insertRight(doublyLinkedListNode18);
        doublyLinkedListNode18.remove();
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode1 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode1.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode3 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode1.insertRight(doublyLinkedListNode3);
        examples.DoublyLinkedListNode doublyLinkedListNode5 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode6 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode5.insertRight(doublyLinkedListNode6);
        doublyLinkedListNode6.remove();
        doublyLinkedListNode3.insertRight(doublyLinkedListNode6);
        doublyLinkedListNode3.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode3);
        doublyLinkedListNode0.remove();
        doublyLinkedListNode0.remove();
        doublyLinkedListNode0.remove();
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode2 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode2);
        examples.DoublyLinkedListNode doublyLinkedListNode4 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode5 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode4.insertRight(doublyLinkedListNode5);
        doublyLinkedListNode5.remove();
        doublyLinkedListNode2.insertRight(doublyLinkedListNode5);
        examples.DoublyLinkedListNode doublyLinkedListNode9 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode9.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode11 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode12 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode11.insertRight(doublyLinkedListNode12);
        doublyLinkedListNode12.remove();
        doublyLinkedListNode9.insertRight(doublyLinkedListNode12);
        examples.DoublyLinkedListNode doublyLinkedListNode16 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode17 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode16.insertRight(doublyLinkedListNode17);
        doublyLinkedListNode17.remove();
        doublyLinkedListNode9.insertRight(doublyLinkedListNode17);
        doublyLinkedListNode9.remove();
        doublyLinkedListNode9.remove();
        doublyLinkedListNode2.insertRight(doublyLinkedListNode9);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode2 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode3 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode2.insertRight(doublyLinkedListNode3);
        doublyLinkedListNode3.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode3);
        doublyLinkedListNode0.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode8 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode8.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode10 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode11 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode10.insertRight(doublyLinkedListNode11);
        doublyLinkedListNode11.remove();
        doublyLinkedListNode8.insertRight(doublyLinkedListNode11);
        doublyLinkedListNode11.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode11);
        doublyLinkedListNode0.remove();
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode1 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode1);
        doublyLinkedListNode0.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode4 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode5 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode4.insertRight(doublyLinkedListNode5);
        doublyLinkedListNode5.remove();
        doublyLinkedListNode5.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode5);
        doublyLinkedListNode0.remove();
        doublyLinkedListNode0.remove();
        doublyLinkedListNode0.remove();
        doublyLinkedListNode0.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode14 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode14.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode16 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode17 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode16.insertRight(doublyLinkedListNode17);
        doublyLinkedListNode17.remove();
        doublyLinkedListNode14.insertRight(doublyLinkedListNode17);
        examples.DoublyLinkedListNode doublyLinkedListNode21 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode22 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode21.insertRight(doublyLinkedListNode22);
        doublyLinkedListNode22.remove();
        doublyLinkedListNode14.insertRight(doublyLinkedListNode22);
        doublyLinkedListNode14.remove();
        doublyLinkedListNode14.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode14);
        doublyLinkedListNode0.remove();
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode1 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode1.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode3 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode1.insertRight(doublyLinkedListNode3);
        examples.DoublyLinkedListNode doublyLinkedListNode5 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode6 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode5.insertRight(doublyLinkedListNode6);
        doublyLinkedListNode6.remove();
        doublyLinkedListNode3.insertRight(doublyLinkedListNode6);
        doublyLinkedListNode3.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode3);
        doublyLinkedListNode0.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode13 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode13.remove();
        doublyLinkedListNode13.remove();
        doublyLinkedListNode13.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode13);
        examples.DoublyLinkedListNode doublyLinkedListNode18 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode18.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode20 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode21 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode20.insertRight(doublyLinkedListNode21);
        doublyLinkedListNode21.remove();
        doublyLinkedListNode18.insertRight(doublyLinkedListNode21);
        examples.DoublyLinkedListNode doublyLinkedListNode25 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode26 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode25.insertRight(doublyLinkedListNode26);
        doublyLinkedListNode26.remove();
        doublyLinkedListNode18.insertRight(doublyLinkedListNode26);
        doublyLinkedListNode18.remove();
        doublyLinkedListNode18.remove();
        doublyLinkedListNode18.remove();
        doublyLinkedListNode13.insertRight(doublyLinkedListNode18);
        doublyLinkedListNode13.remove();
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode1 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode1);
        doublyLinkedListNode0.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode4 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode5 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode4.insertRight(doublyLinkedListNode5);
        doublyLinkedListNode5.remove();
        doublyLinkedListNode5.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode5);
        examples.DoublyLinkedListNode doublyLinkedListNode10 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode10.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode12 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode13 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode12.insertRight(doublyLinkedListNode13);
        doublyLinkedListNode13.remove();
        doublyLinkedListNode10.insertRight(doublyLinkedListNode13);
        examples.DoublyLinkedListNode doublyLinkedListNode17 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode17.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode19 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode17.insertRight(doublyLinkedListNode19);
        examples.DoublyLinkedListNode doublyLinkedListNode21 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode22 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode21.insertRight(doublyLinkedListNode22);
        doublyLinkedListNode22.remove();
        doublyLinkedListNode19.insertRight(doublyLinkedListNode22);
        doublyLinkedListNode19.remove();
        doublyLinkedListNode10.insertRight(doublyLinkedListNode19);
        doublyLinkedListNode10.remove();
        doublyLinkedListNode10.remove();
        doublyLinkedListNode5.insertRight(doublyLinkedListNode10);
        doublyLinkedListNode10.remove();
        java.lang.Class<?> wildcardClass32 = doublyLinkedListNode10.getClass();
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode2 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode3 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode2.insertRight(doublyLinkedListNode3);
        doublyLinkedListNode3.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode3);
        examples.DoublyLinkedListNode doublyLinkedListNode7 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode8 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode7.insertRight(doublyLinkedListNode8);
        doublyLinkedListNode8.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode8);
        doublyLinkedListNode0.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode13 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode14 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode13.insertRight(doublyLinkedListNode14);
        doublyLinkedListNode13.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode17 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode18 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode17.insertRight(doublyLinkedListNode18);
        doublyLinkedListNode18.remove();
        doublyLinkedListNode18.remove();
        doublyLinkedListNode13.insertRight(doublyLinkedListNode18);
        doublyLinkedListNode13.remove();
        doublyLinkedListNode13.remove();
        doublyLinkedListNode13.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode13);
        doublyLinkedListNode13.remove();
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode2 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode2);
        examples.DoublyLinkedListNode doublyLinkedListNode4 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode5 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode4.insertRight(doublyLinkedListNode5);
        doublyLinkedListNode5.remove();
        doublyLinkedListNode2.insertRight(doublyLinkedListNode5);
        doublyLinkedListNode2.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode10 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode11 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode11.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode13 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode11.insertRight(doublyLinkedListNode13);
        examples.DoublyLinkedListNode doublyLinkedListNode15 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode16 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode15.insertRight(doublyLinkedListNode16);
        doublyLinkedListNode16.remove();
        doublyLinkedListNode13.insertRight(doublyLinkedListNode16);
        doublyLinkedListNode13.remove();
        doublyLinkedListNode10.insertRight(doublyLinkedListNode13);
        doublyLinkedListNode10.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode23 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode23.remove();
        doublyLinkedListNode23.remove();
        doublyLinkedListNode23.remove();
        doublyLinkedListNode10.insertRight(doublyLinkedListNode23);
        examples.DoublyLinkedListNode doublyLinkedListNode28 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode28.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode30 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode31 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode30.insertRight(doublyLinkedListNode31);
        doublyLinkedListNode31.remove();
        doublyLinkedListNode28.insertRight(doublyLinkedListNode31);
        examples.DoublyLinkedListNode doublyLinkedListNode35 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode35.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode37 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode35.insertRight(doublyLinkedListNode37);
        examples.DoublyLinkedListNode doublyLinkedListNode39 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode40 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode39.insertRight(doublyLinkedListNode40);
        doublyLinkedListNode40.remove();
        doublyLinkedListNode37.insertRight(doublyLinkedListNode40);
        doublyLinkedListNode37.remove();
        doublyLinkedListNode28.insertRight(doublyLinkedListNode37);
        examples.DoublyLinkedListNode doublyLinkedListNode46 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode46.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode48 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode49 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode48.insertRight(doublyLinkedListNode49);
        doublyLinkedListNode49.remove();
        doublyLinkedListNode46.insertRight(doublyLinkedListNode49);
        examples.DoublyLinkedListNode doublyLinkedListNode53 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode53.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode55 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode56 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode55.insertRight(doublyLinkedListNode56);
        doublyLinkedListNode56.remove();
        doublyLinkedListNode53.insertRight(doublyLinkedListNode56);
        doublyLinkedListNode56.remove();
        doublyLinkedListNode46.insertRight(doublyLinkedListNode56);
        doublyLinkedListNode46.remove();
        doublyLinkedListNode28.insertRight(doublyLinkedListNode46);
        doublyLinkedListNode28.remove();
        doublyLinkedListNode28.remove();
        doublyLinkedListNode23.insertRight(doublyLinkedListNode28);
        // The following exception was thrown during execution in test generation
        try {
            doublyLinkedListNode2.insertRight(doublyLinkedListNode23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter is not singleton");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode1 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode1.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode3 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode1.insertRight(doublyLinkedListNode3);
        examples.DoublyLinkedListNode doublyLinkedListNode5 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode6 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode5.insertRight(doublyLinkedListNode6);
        doublyLinkedListNode6.remove();
        doublyLinkedListNode3.insertRight(doublyLinkedListNode6);
        doublyLinkedListNode3.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode3);
        doublyLinkedListNode0.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode13 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode13.remove();
        doublyLinkedListNode13.remove();
        doublyLinkedListNode13.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode13);
        examples.DoublyLinkedListNode doublyLinkedListNode18 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode18.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode20 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode21 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode20.insertRight(doublyLinkedListNode21);
        doublyLinkedListNode21.remove();
        doublyLinkedListNode18.insertRight(doublyLinkedListNode21);
        examples.DoublyLinkedListNode doublyLinkedListNode25 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode26 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode25.insertRight(doublyLinkedListNode26);
        doublyLinkedListNode26.remove();
        doublyLinkedListNode18.insertRight(doublyLinkedListNode26);
        doublyLinkedListNode18.remove();
        doublyLinkedListNode18.remove();
        doublyLinkedListNode18.remove();
        doublyLinkedListNode13.insertRight(doublyLinkedListNode18);
        examples.DoublyLinkedListNode doublyLinkedListNode34 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode34.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode36 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode37 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode36.insertRight(doublyLinkedListNode37);
        doublyLinkedListNode37.remove();
        doublyLinkedListNode34.insertRight(doublyLinkedListNode37);
        examples.DoublyLinkedListNode doublyLinkedListNode41 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode41.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode43 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode44 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode43.insertRight(doublyLinkedListNode44);
        doublyLinkedListNode44.remove();
        doublyLinkedListNode41.insertRight(doublyLinkedListNode44);
        examples.DoublyLinkedListNode doublyLinkedListNode48 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode48.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode50 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode48.insertRight(doublyLinkedListNode50);
        examples.DoublyLinkedListNode doublyLinkedListNode52 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode53 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode52.insertRight(doublyLinkedListNode53);
        doublyLinkedListNode53.remove();
        doublyLinkedListNode50.insertRight(doublyLinkedListNode53);
        doublyLinkedListNode50.remove();
        doublyLinkedListNode41.insertRight(doublyLinkedListNode50);
        examples.DoublyLinkedListNode doublyLinkedListNode59 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode59.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode61 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode62 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode61.insertRight(doublyLinkedListNode62);
        doublyLinkedListNode62.remove();
        doublyLinkedListNode59.insertRight(doublyLinkedListNode62);
        doublyLinkedListNode59.remove();
        doublyLinkedListNode41.insertRight(doublyLinkedListNode59);
        doublyLinkedListNode59.remove();
        doublyLinkedListNode37.insertRight(doublyLinkedListNode59);
        // The following exception was thrown during execution in test generation
        try {
            doublyLinkedListNode18.insertRight(doublyLinkedListNode37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter is not singleton");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }
}

