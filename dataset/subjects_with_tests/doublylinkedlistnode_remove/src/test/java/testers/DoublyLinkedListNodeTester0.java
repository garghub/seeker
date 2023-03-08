package testers;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DoublyLinkedListNodeTester0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test001");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        java.lang.Class<?> wildcardClass1 = doublyLinkedListNode0.getClass();
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test002");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode1 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode1);
        java.lang.Class<?> wildcardClass3 = doublyLinkedListNode0.getClass();
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test003");
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
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test004");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode2 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode2);
        java.lang.Class<?> wildcardClass4 = doublyLinkedListNode0.getClass();
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test005");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode1 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode1);
        doublyLinkedListNode1.remove();
        java.lang.Class<?> wildcardClass4 = doublyLinkedListNode1.getClass();
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test006");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.remove();
        java.lang.Class<?> wildcardClass2 = doublyLinkedListNode0.getClass();
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test007");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode1 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode1);
        doublyLinkedListNode1.remove();
        doublyLinkedListNode1.remove();
        java.lang.Class<?> wildcardClass5 = doublyLinkedListNode1.getClass();
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test008");
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
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test009");
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
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test010");
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
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test011");
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
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test012");
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
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test013");
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
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test014");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test015");
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
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test016");
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
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test017");
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
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test018");
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
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test019");
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
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test020");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode2 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode2);
        java.lang.Class<?> wildcardClass4 = doublyLinkedListNode2.getClass();
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test021");
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
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test022");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode1 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode1);
        doublyLinkedListNode0.remove();
        java.lang.Class<?> wildcardClass4 = doublyLinkedListNode0.getClass();
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test023");
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
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test024");
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
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test025");
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
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test026");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode1 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode1);
        doublyLinkedListNode0.remove();
        doublyLinkedListNode0.remove();
        java.lang.Class<?> wildcardClass5 = doublyLinkedListNode0.getClass();
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test027");
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
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test028");
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
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test029");
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
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test030");
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
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test031");
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
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test032");
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
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test033");
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
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test034");
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
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test035");
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
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test036");
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
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test037");
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
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test038");
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
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test039");
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
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test040");
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
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test041");
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
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test042");
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
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test043");
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
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test044");
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
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test045");
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
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test046");
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
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test047");
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
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test048");
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
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test049");
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
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test050");
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
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test051");
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
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test052");
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
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test053");
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
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test054");
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
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test055");
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
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test056");
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
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test057");
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
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test058");
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
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test059");
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
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test060");
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
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test061");
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
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test062");
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
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test063");
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
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test064");
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
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test065");
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
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test066");
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
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test067");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode2 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode3 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode2.insertRight(doublyLinkedListNode3);
        doublyLinkedListNode3.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode3);
        doublyLinkedListNode0.remove();
        java.lang.Class<?> wildcardClass8 = doublyLinkedListNode0.getClass();
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test068");
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
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test069");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode2 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode3 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode2.insertRight(doublyLinkedListNode3);
        doublyLinkedListNode3.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode3);
        java.lang.Class<?> wildcardClass7 = doublyLinkedListNode3.getClass();
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test070");
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
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test071");
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
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test072");
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
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test073");
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
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test074");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode2 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode2);
        doublyLinkedListNode2.remove();
        java.lang.Class<?> wildcardClass5 = doublyLinkedListNode2.getClass();
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test075");
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
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test076");
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
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test077");
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
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test078");
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
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test079");
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
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test080");
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
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test081");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode2 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode3 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode2.insertRight(doublyLinkedListNode3);
        doublyLinkedListNode3.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode3);
        doublyLinkedListNode3.remove();
        java.lang.Class<?> wildcardClass8 = doublyLinkedListNode3.getClass();
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test082");
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
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test083");
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
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test084");
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
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test085");
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
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test086");
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
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test087");
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
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test088");
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
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test089");
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
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test090");
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
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test091");
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
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test092");
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
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test093");
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
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test094");
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
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test095");
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
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test096");
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
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test097");
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
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test098");
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
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test099");
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
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test100");
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
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test101");
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
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test102");
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
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test103");
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
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test104");
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
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test105");
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
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test106");
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
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test107");
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
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test108");
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
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test109");
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
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test110");
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
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test111");
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
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test112");
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
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test113");
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
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test114");
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
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test115");
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
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test116");
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

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test117");
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
        java.lang.Class<?> wildcardClass37 = doublyLinkedListNode8.getClass();
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test118");
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
        java.lang.Class<?> wildcardClass15 = doublyLinkedListNode0.getClass();
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test119");
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
        examples.DoublyLinkedListNode doublyLinkedListNode14 = null;
        // The following exception was thrown during execution in test generation
        try {
            doublyLinkedListNode0.insertRight(doublyLinkedListNode14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: undefined for null parameter");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test120");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode1 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode1);
        doublyLinkedListNode0.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode4 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode5 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode5.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode7 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode5.insertRight(doublyLinkedListNode7);
        examples.DoublyLinkedListNode doublyLinkedListNode9 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode10 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode9.insertRight(doublyLinkedListNode10);
        doublyLinkedListNode10.remove();
        doublyLinkedListNode7.insertRight(doublyLinkedListNode10);
        doublyLinkedListNode7.remove();
        doublyLinkedListNode4.insertRight(doublyLinkedListNode7);
        doublyLinkedListNode4.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode17 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode17.remove();
        doublyLinkedListNode17.remove();
        doublyLinkedListNode17.remove();
        doublyLinkedListNode4.insertRight(doublyLinkedListNode17);
        examples.DoublyLinkedListNode doublyLinkedListNode22 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode22.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode24 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode25 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode24.insertRight(doublyLinkedListNode25);
        doublyLinkedListNode25.remove();
        doublyLinkedListNode22.insertRight(doublyLinkedListNode25);
        examples.DoublyLinkedListNode doublyLinkedListNode29 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode30 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode29.insertRight(doublyLinkedListNode30);
        doublyLinkedListNode30.remove();
        doublyLinkedListNode22.insertRight(doublyLinkedListNode30);
        doublyLinkedListNode22.remove();
        doublyLinkedListNode22.remove();
        doublyLinkedListNode22.remove();
        doublyLinkedListNode17.insertRight(doublyLinkedListNode22);
        // The following exception was thrown during execution in test generation
        try {
            doublyLinkedListNode0.insertRight(doublyLinkedListNode17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter is not singleton");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test121");
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
        java.lang.Class<?> wildcardClass14 = doublyLinkedListNode0.getClass();
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test122");
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
        examples.DoublyLinkedListNode doublyLinkedListNode65 = null;
        // The following exception was thrown during execution in test generation
        try {
            doublyLinkedListNode30.insertRight(doublyLinkedListNode65);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: undefined for null parameter");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test123");
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
        examples.DoublyLinkedListNode doublyLinkedListNode88 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode89 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode88.insertRight(doublyLinkedListNode89);
        doublyLinkedListNode88.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode92 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode93 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode92.insertRight(doublyLinkedListNode93);
        doublyLinkedListNode93.remove();
        doublyLinkedListNode88.insertRight(doublyLinkedListNode93);
        // The following exception was thrown during execution in test generation
        try {
            doublyLinkedListNode12.insertRight(doublyLinkedListNode88);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter is not singleton");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test124");
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
        java.lang.Class<?> wildcardClass52 = doublyLinkedListNode5.getClass();
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test125");
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
        examples.DoublyLinkedListNode doublyLinkedListNode20 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode21 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode20.insertRight(doublyLinkedListNode21);
        doublyLinkedListNode20.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode24 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode25 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode24.insertRight(doublyLinkedListNode25);
        doublyLinkedListNode25.remove();
        doublyLinkedListNode25.remove();
        doublyLinkedListNode20.insertRight(doublyLinkedListNode25);
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
        doublyLinkedListNode20.insertRight(doublyLinkedListNode32);
        // The following exception was thrown during execution in test generation
        try {
            doublyLinkedListNode15.insertRight(doublyLinkedListNode20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter is not singleton");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test126");
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
        doublyLinkedListNode25.remove();
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test127");
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
        java.lang.Class<?> wildcardClass88 = doublyLinkedListNode53.getClass();
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test128");
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
        examples.DoublyLinkedListNode doublyLinkedListNode43 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode43.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode45 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode46 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode45.insertRight(doublyLinkedListNode46);
        doublyLinkedListNode46.remove();
        doublyLinkedListNode43.insertRight(doublyLinkedListNode46);
        doublyLinkedListNode43.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode51 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode51.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode53 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode54 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode53.insertRight(doublyLinkedListNode54);
        doublyLinkedListNode54.remove();
        doublyLinkedListNode51.insertRight(doublyLinkedListNode54);
        doublyLinkedListNode54.remove();
        doublyLinkedListNode43.insertRight(doublyLinkedListNode54);
        // The following exception was thrown during execution in test generation
        try {
            doublyLinkedListNode28.insertRight(doublyLinkedListNode54);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter is not singleton");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test129");
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
        java.lang.Class<?> wildcardClass41 = doublyLinkedListNode25.getClass();
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test130");
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
        doublyLinkedListNode0.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode15 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode16 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode15.insertRight(doublyLinkedListNode16);
        doublyLinkedListNode15.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode19 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode20 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode19.insertRight(doublyLinkedListNode20);
        doublyLinkedListNode20.remove();
        doublyLinkedListNode20.remove();
        doublyLinkedListNode15.insertRight(doublyLinkedListNode20);
        doublyLinkedListNode15.remove();
        doublyLinkedListNode15.remove();
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
        doublyLinkedListNode37.remove();
        doublyLinkedListNode27.insertRight(doublyLinkedListNode37);
        doublyLinkedListNode27.remove();
        doublyLinkedListNode15.insertRight(doublyLinkedListNode27);
        // The following exception was thrown during execution in test generation
        try {
            doublyLinkedListNode0.insertRight(doublyLinkedListNode15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter is not singleton");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test131");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode1 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode1);
        doublyLinkedListNode0.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode4 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode5 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode4.insertRight(doublyLinkedListNode5);
        doublyLinkedListNode5.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode5);
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
        doublyLinkedListNode9.remove();
        doublyLinkedListNode9.remove();
        doublyLinkedListNode5.insertRight(doublyLinkedListNode9);
        examples.DoublyLinkedListNode doublyLinkedListNode25 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode26 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode25.insertRight(doublyLinkedListNode26);
        doublyLinkedListNode26.remove();
        doublyLinkedListNode26.remove();
        doublyLinkedListNode5.insertRight(doublyLinkedListNode26);
        java.lang.Class<?> wildcardClass31 = doublyLinkedListNode26.getClass();
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test132");
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
        examples.DoublyLinkedListNode doublyLinkedListNode28 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode29 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode28.insertRight(doublyLinkedListNode29);
        doublyLinkedListNode28.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode32 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode33 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode32.insertRight(doublyLinkedListNode33);
        doublyLinkedListNode33.remove();
        doublyLinkedListNode33.remove();
        doublyLinkedListNode28.insertRight(doublyLinkedListNode33);
        doublyLinkedListNode28.remove();
        doublyLinkedListNode28.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode40 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode40.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode42 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode43 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode42.insertRight(doublyLinkedListNode43);
        doublyLinkedListNode43.remove();
        doublyLinkedListNode40.insertRight(doublyLinkedListNode43);
        examples.DoublyLinkedListNode doublyLinkedListNode47 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode47.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode49 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode50 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode49.insertRight(doublyLinkedListNode50);
        doublyLinkedListNode50.remove();
        doublyLinkedListNode47.insertRight(doublyLinkedListNode50);
        doublyLinkedListNode50.remove();
        doublyLinkedListNode40.insertRight(doublyLinkedListNode50);
        doublyLinkedListNode40.remove();
        doublyLinkedListNode28.insertRight(doublyLinkedListNode40);
        examples.DoublyLinkedListNode doublyLinkedListNode58 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode58.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode60 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode61 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode60.insertRight(doublyLinkedListNode61);
        doublyLinkedListNode61.remove();
        doublyLinkedListNode58.insertRight(doublyLinkedListNode61);
        doublyLinkedListNode58.remove();
        doublyLinkedListNode28.insertRight(doublyLinkedListNode58);
        // The following exception was thrown during execution in test generation
        try {
            doublyLinkedListNode16.insertRight(doublyLinkedListNode58);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter is not singleton");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test133");
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
        doublyLinkedListNode2.remove();
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test134");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode2 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode2);
        examples.DoublyLinkedListNode doublyLinkedListNode4 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode5 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode4.insertRight(doublyLinkedListNode5);
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
        doublyLinkedListNode4.insertRight(doublyLinkedListNode9);
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
        doublyLinkedListNode9.insertRight(doublyLinkedListNode20);
        doublyLinkedListNode20.remove();
        doublyLinkedListNode20.remove();
        doublyLinkedListNode20.remove();
        doublyLinkedListNode2.insertRight(doublyLinkedListNode20);
        examples.DoublyLinkedListNode doublyLinkedListNode33 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode34 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode34.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode36 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode34.insertRight(doublyLinkedListNode36);
        examples.DoublyLinkedListNode doublyLinkedListNode38 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode39 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode38.insertRight(doublyLinkedListNode39);
        doublyLinkedListNode39.remove();
        doublyLinkedListNode36.insertRight(doublyLinkedListNode39);
        doublyLinkedListNode36.remove();
        doublyLinkedListNode33.insertRight(doublyLinkedListNode36);
        doublyLinkedListNode33.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode46 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode46.remove();
        doublyLinkedListNode46.remove();
        doublyLinkedListNode46.remove();
        doublyLinkedListNode33.insertRight(doublyLinkedListNode46);
        examples.DoublyLinkedListNode doublyLinkedListNode51 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode51.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode53 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode54 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode53.insertRight(doublyLinkedListNode54);
        doublyLinkedListNode54.remove();
        doublyLinkedListNode51.insertRight(doublyLinkedListNode54);
        examples.DoublyLinkedListNode doublyLinkedListNode58 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode59 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode58.insertRight(doublyLinkedListNode59);
        doublyLinkedListNode59.remove();
        doublyLinkedListNode51.insertRight(doublyLinkedListNode59);
        doublyLinkedListNode51.remove();
        doublyLinkedListNode51.remove();
        doublyLinkedListNode46.insertRight(doublyLinkedListNode51);
        // The following exception was thrown during execution in test generation
        try {
            doublyLinkedListNode2.insertRight(doublyLinkedListNode51);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter is not singleton");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test135");
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
        examples.DoublyLinkedListNode doublyLinkedListNode18 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode18.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode20 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode21 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode20.insertRight(doublyLinkedListNode21);
        doublyLinkedListNode21.remove();
        doublyLinkedListNode18.insertRight(doublyLinkedListNode21);
        doublyLinkedListNode18.remove();
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
        doublyLinkedListNode33.insertRight(doublyLinkedListNode35);
        examples.DoublyLinkedListNode doublyLinkedListNode37 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode38 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode37.insertRight(doublyLinkedListNode38);
        doublyLinkedListNode38.remove();
        doublyLinkedListNode35.insertRight(doublyLinkedListNode38);
        doublyLinkedListNode35.remove();
        doublyLinkedListNode26.insertRight(doublyLinkedListNode35);
        examples.DoublyLinkedListNode doublyLinkedListNode44 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode44.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode46 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode47 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode46.insertRight(doublyLinkedListNode47);
        doublyLinkedListNode47.remove();
        doublyLinkedListNode44.insertRight(doublyLinkedListNode47);
        doublyLinkedListNode44.remove();
        doublyLinkedListNode26.insertRight(doublyLinkedListNode44);
        doublyLinkedListNode26.remove();
        doublyLinkedListNode18.insertRight(doublyLinkedListNode26);
        // The following exception was thrown during execution in test generation
        try {
            doublyLinkedListNode0.insertRight(doublyLinkedListNode18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter is not singleton");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test136");
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
        java.lang.Class<?> wildcardClass39 = doublyLinkedListNode30.getClass();
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test137");
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
        examples.DoublyLinkedListNode doublyLinkedListNode24 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode24.remove();
        doublyLinkedListNode24.remove();
        doublyLinkedListNode2.insertRight(doublyLinkedListNode24);
        java.lang.Class<?> wildcardClass28 = doublyLinkedListNode24.getClass();
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test138");
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
        doublyLinkedListNode16.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode18 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode16.insertRight(doublyLinkedListNode18);
        examples.DoublyLinkedListNode doublyLinkedListNode20 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode21 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode20.insertRight(doublyLinkedListNode21);
        doublyLinkedListNode21.remove();
        doublyLinkedListNode18.insertRight(doublyLinkedListNode21);
        doublyLinkedListNode18.remove();
        doublyLinkedListNode9.insertRight(doublyLinkedListNode18);
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
        doublyLinkedListNode37.remove();
        doublyLinkedListNode27.insertRight(doublyLinkedListNode37);
        doublyLinkedListNode27.remove();
        doublyLinkedListNode9.insertRight(doublyLinkedListNode27);
        // The following exception was thrown during execution in test generation
        try {
            doublyLinkedListNode2.insertRight(doublyLinkedListNode27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter is not singleton");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test139");
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
        examples.DoublyLinkedListNode doublyLinkedListNode12 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode13 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode12.insertRight(doublyLinkedListNode13);
        doublyLinkedListNode12.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode16 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode17 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode16.insertRight(doublyLinkedListNode17);
        doublyLinkedListNode17.remove();
        doublyLinkedListNode17.remove();
        doublyLinkedListNode12.insertRight(doublyLinkedListNode17);
        doublyLinkedListNode12.remove();
        doublyLinkedListNode12.remove();
        doublyLinkedListNode12.remove();
        doublyLinkedListNode12.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode26 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode26.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode28 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode29 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode28.insertRight(doublyLinkedListNode29);
        doublyLinkedListNode29.remove();
        doublyLinkedListNode26.insertRight(doublyLinkedListNode29);
        examples.DoublyLinkedListNode doublyLinkedListNode33 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode34 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode33.insertRight(doublyLinkedListNode34);
        doublyLinkedListNode34.remove();
        doublyLinkedListNode26.insertRight(doublyLinkedListNode34);
        doublyLinkedListNode26.remove();
        doublyLinkedListNode26.remove();
        doublyLinkedListNode12.insertRight(doublyLinkedListNode26);
        doublyLinkedListNode26.remove();
        doublyLinkedListNode3.insertRight(doublyLinkedListNode26);
        java.lang.Class<?> wildcardClass43 = doublyLinkedListNode3.getClass();
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test140");
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
        doublyLinkedListNode31.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode33 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode31.insertRight(doublyLinkedListNode33);
        examples.DoublyLinkedListNode doublyLinkedListNode35 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode36 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode35.insertRight(doublyLinkedListNode36);
        doublyLinkedListNode36.remove();
        doublyLinkedListNode33.insertRight(doublyLinkedListNode36);
        doublyLinkedListNode33.remove();
        doublyLinkedListNode30.insertRight(doublyLinkedListNode33);
        examples.DoublyLinkedListNode doublyLinkedListNode42 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode43 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode42.insertRight(doublyLinkedListNode43);
        doublyLinkedListNode42.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode46 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode47 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode46.insertRight(doublyLinkedListNode47);
        doublyLinkedListNode47.remove();
        doublyLinkedListNode47.remove();
        doublyLinkedListNode42.insertRight(doublyLinkedListNode47);
        doublyLinkedListNode42.remove();
        doublyLinkedListNode42.remove();
        doublyLinkedListNode42.remove();
        doublyLinkedListNode42.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode56 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode56.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode58 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode59 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode58.insertRight(doublyLinkedListNode59);
        doublyLinkedListNode59.remove();
        doublyLinkedListNode56.insertRight(doublyLinkedListNode59);
        examples.DoublyLinkedListNode doublyLinkedListNode63 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode64 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode63.insertRight(doublyLinkedListNode64);
        doublyLinkedListNode64.remove();
        doublyLinkedListNode56.insertRight(doublyLinkedListNode64);
        doublyLinkedListNode56.remove();
        doublyLinkedListNode56.remove();
        doublyLinkedListNode42.insertRight(doublyLinkedListNode56);
        doublyLinkedListNode56.remove();
        doublyLinkedListNode33.insertRight(doublyLinkedListNode56);
        // The following exception was thrown during execution in test generation
        try {
            doublyLinkedListNode12.insertRight(doublyLinkedListNode56);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter is not singleton");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test141");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode1 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode1);
        doublyLinkedListNode0.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode4 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode5 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode4.insertRight(doublyLinkedListNode5);
        doublyLinkedListNode5.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode5);
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
        doublyLinkedListNode9.remove();
        doublyLinkedListNode9.remove();
        doublyLinkedListNode5.insertRight(doublyLinkedListNode9);
        examples.DoublyLinkedListNode doublyLinkedListNode25 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode26 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode25.insertRight(doublyLinkedListNode26);
        doublyLinkedListNode26.remove();
        doublyLinkedListNode26.remove();
        doublyLinkedListNode5.insertRight(doublyLinkedListNode26);
        java.lang.Class<?> wildcardClass31 = doublyLinkedListNode5.getClass();
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test142");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode2 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode2);
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
        doublyLinkedListNode4.remove();
        doublyLinkedListNode4.remove();
        doublyLinkedListNode4.remove();
        doublyLinkedListNode4.remove();
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
        doublyLinkedListNode4.insertRight(doublyLinkedListNode18);
        // The following exception was thrown during execution in test generation
        try {
            doublyLinkedListNode0.insertRight(doublyLinkedListNode4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter is not singleton");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test143");
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
        doublyLinkedListNode0.remove();
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test144");
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
        examples.DoublyLinkedListNode doublyLinkedListNode24 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode24.remove();
        doublyLinkedListNode24.remove();
        doublyLinkedListNode2.insertRight(doublyLinkedListNode24);
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
        doublyLinkedListNode28.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode47 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode48 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode47.insertRight(doublyLinkedListNode48);
        doublyLinkedListNode47.remove();
        doublyLinkedListNode47.remove();
        doublyLinkedListNode28.insertRight(doublyLinkedListNode47);
        // The following exception was thrown during execution in test generation
        try {
            doublyLinkedListNode24.insertRight(doublyLinkedListNode28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter is not singleton");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test145");
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
        examples.DoublyLinkedListNode doublyLinkedListNode12 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode13 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode12.insertRight(doublyLinkedListNode13);
        doublyLinkedListNode12.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode16 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode17 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode16.insertRight(doublyLinkedListNode17);
        doublyLinkedListNode17.remove();
        doublyLinkedListNode17.remove();
        doublyLinkedListNode12.insertRight(doublyLinkedListNode17);
        doublyLinkedListNode12.remove();
        doublyLinkedListNode12.remove();
        doublyLinkedListNode12.remove();
        doublyLinkedListNode12.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode26 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode26.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode28 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode29 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode28.insertRight(doublyLinkedListNode29);
        doublyLinkedListNode29.remove();
        doublyLinkedListNode26.insertRight(doublyLinkedListNode29);
        examples.DoublyLinkedListNode doublyLinkedListNode33 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode34 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode33.insertRight(doublyLinkedListNode34);
        doublyLinkedListNode34.remove();
        doublyLinkedListNode26.insertRight(doublyLinkedListNode34);
        doublyLinkedListNode26.remove();
        doublyLinkedListNode26.remove();
        doublyLinkedListNode12.insertRight(doublyLinkedListNode26);
        doublyLinkedListNode26.remove();
        doublyLinkedListNode3.insertRight(doublyLinkedListNode26);
        examples.DoublyLinkedListNode doublyLinkedListNode43 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode44 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode43.insertRight(doublyLinkedListNode44);
        examples.DoublyLinkedListNode doublyLinkedListNode46 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode46.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode48 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode46.insertRight(doublyLinkedListNode48);
        examples.DoublyLinkedListNode doublyLinkedListNode50 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode51 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode50.insertRight(doublyLinkedListNode51);
        doublyLinkedListNode51.remove();
        doublyLinkedListNode48.insertRight(doublyLinkedListNode51);
        doublyLinkedListNode48.remove();
        doublyLinkedListNode43.insertRight(doublyLinkedListNode48);
        examples.DoublyLinkedListNode doublyLinkedListNode57 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode57.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode59 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode57.insertRight(doublyLinkedListNode59);
        examples.DoublyLinkedListNode doublyLinkedListNode61 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode62 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode61.insertRight(doublyLinkedListNode62);
        doublyLinkedListNode62.remove();
        doublyLinkedListNode59.insertRight(doublyLinkedListNode62);
        doublyLinkedListNode59.remove();
        doublyLinkedListNode48.insertRight(doublyLinkedListNode59);
        examples.DoublyLinkedListNode doublyLinkedListNode68 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode68.remove();
        doublyLinkedListNode48.insertRight(doublyLinkedListNode68);
        // The following exception was thrown during execution in test generation
        try {
            doublyLinkedListNode3.insertRight(doublyLinkedListNode68);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter is not singleton");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test146");
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
        doublyLinkedListNode21.remove();
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
        doublyLinkedListNode33.insertRight(doublyLinkedListNode35);
        examples.DoublyLinkedListNode doublyLinkedListNode37 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode38 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode37.insertRight(doublyLinkedListNode38);
        doublyLinkedListNode38.remove();
        doublyLinkedListNode35.insertRight(doublyLinkedListNode38);
        doublyLinkedListNode35.remove();
        doublyLinkedListNode26.insertRight(doublyLinkedListNode35);
        examples.DoublyLinkedListNode doublyLinkedListNode44 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode44.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode46 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode47 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode46.insertRight(doublyLinkedListNode47);
        doublyLinkedListNode47.remove();
        doublyLinkedListNode44.insertRight(doublyLinkedListNode47);
        doublyLinkedListNode44.remove();
        doublyLinkedListNode26.insertRight(doublyLinkedListNode44);
        doublyLinkedListNode26.remove();
        doublyLinkedListNode21.insertRight(doublyLinkedListNode26);
        // The following exception was thrown during execution in test generation
        try {
            doublyLinkedListNode0.insertRight(doublyLinkedListNode21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter is not singleton");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test147");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode1 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode1);
        doublyLinkedListNode0.remove();
        doublyLinkedListNode0.remove();
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
        doublyLinkedListNode23.remove();
        doublyLinkedListNode5.insertRight(doublyLinkedListNode23);
        doublyLinkedListNode5.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode5);
        examples.DoublyLinkedListNode doublyLinkedListNode34 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode34.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode36 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode34.insertRight(doublyLinkedListNode36);
        examples.DoublyLinkedListNode doublyLinkedListNode38 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode39 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode38.insertRight(doublyLinkedListNode39);
        doublyLinkedListNode39.remove();
        doublyLinkedListNode36.insertRight(doublyLinkedListNode39);
        doublyLinkedListNode36.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode44 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode36.insertRight(doublyLinkedListNode44);
        // The following exception was thrown during execution in test generation
        try {
            doublyLinkedListNode5.insertRight(doublyLinkedListNode36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter is not singleton");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test148");
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
        examples.DoublyLinkedListNode doublyLinkedListNode35 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode36 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode36.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode38 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode36.insertRight(doublyLinkedListNode38);
        examples.DoublyLinkedListNode doublyLinkedListNode40 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode41 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode40.insertRight(doublyLinkedListNode41);
        doublyLinkedListNode41.remove();
        doublyLinkedListNode38.insertRight(doublyLinkedListNode41);
        doublyLinkedListNode38.remove();
        doublyLinkedListNode35.insertRight(doublyLinkedListNode38);
        examples.DoublyLinkedListNode doublyLinkedListNode47 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode48 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode47.insertRight(doublyLinkedListNode48);
        doublyLinkedListNode47.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode51 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode52 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode51.insertRight(doublyLinkedListNode52);
        doublyLinkedListNode52.remove();
        doublyLinkedListNode52.remove();
        doublyLinkedListNode47.insertRight(doublyLinkedListNode52);
        doublyLinkedListNode47.remove();
        doublyLinkedListNode47.remove();
        doublyLinkedListNode47.remove();
        doublyLinkedListNode47.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode61 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode61.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode63 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode64 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode63.insertRight(doublyLinkedListNode64);
        doublyLinkedListNode64.remove();
        doublyLinkedListNode61.insertRight(doublyLinkedListNode64);
        examples.DoublyLinkedListNode doublyLinkedListNode68 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode69 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode68.insertRight(doublyLinkedListNode69);
        doublyLinkedListNode69.remove();
        doublyLinkedListNode61.insertRight(doublyLinkedListNode69);
        doublyLinkedListNode61.remove();
        doublyLinkedListNode61.remove();
        doublyLinkedListNode47.insertRight(doublyLinkedListNode61);
        doublyLinkedListNode61.remove();
        doublyLinkedListNode38.insertRight(doublyLinkedListNode61);
        // The following exception was thrown during execution in test generation
        try {
            doublyLinkedListNode13.insertRight(doublyLinkedListNode61);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter is not singleton");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test149");
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
        doublyLinkedListNode0.insertRight(doublyLinkedListNode14);
        doublyLinkedListNode0.remove();
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test150");
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
        examples.DoublyLinkedListNode doublyLinkedListNode88 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode89 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode88.insertRight(doublyLinkedListNode89);
        // The following exception was thrown during execution in test generation
        try {
            doublyLinkedListNode12.insertRight(doublyLinkedListNode88);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter is not singleton");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test151");
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
        examples.DoublyLinkedListNode doublyLinkedListNode16 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode17 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode16.insertRight(doublyLinkedListNode17);
        doublyLinkedListNode17.remove();
        doublyLinkedListNode14.insertRight(doublyLinkedListNode17);
        doublyLinkedListNode14.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode14);
        java.lang.Class<?> wildcardClass23 = doublyLinkedListNode14.getClass();
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test152");
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
        examples.DoublyLinkedListNode doublyLinkedListNode20 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode20.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode22 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode23 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode22.insertRight(doublyLinkedListNode23);
        doublyLinkedListNode23.remove();
        doublyLinkedListNode20.insertRight(doublyLinkedListNode23);
        examples.DoublyLinkedListNode doublyLinkedListNode27 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode28 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode27.insertRight(doublyLinkedListNode28);
        doublyLinkedListNode28.remove();
        doublyLinkedListNode20.insertRight(doublyLinkedListNode28);
        examples.DoublyLinkedListNode doublyLinkedListNode32 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode32.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode34 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode32.insertRight(doublyLinkedListNode34);
        examples.DoublyLinkedListNode doublyLinkedListNode36 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode37 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode36.insertRight(doublyLinkedListNode37);
        doublyLinkedListNode37.remove();
        doublyLinkedListNode34.insertRight(doublyLinkedListNode37);
        doublyLinkedListNode34.remove();
        doublyLinkedListNode20.insertRight(doublyLinkedListNode34);
        // The following exception was thrown during execution in test generation
        try {
            doublyLinkedListNode15.insertRight(doublyLinkedListNode20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter is not singleton");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test153");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode1 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode1);
        doublyLinkedListNode0.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode4 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode5 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode4.insertRight(doublyLinkedListNode5);
        doublyLinkedListNode5.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode5);
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
        doublyLinkedListNode9.remove();
        doublyLinkedListNode9.remove();
        doublyLinkedListNode5.insertRight(doublyLinkedListNode9);
        examples.DoublyLinkedListNode doublyLinkedListNode25 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode26 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode25.insertRight(doublyLinkedListNode26);
        doublyLinkedListNode26.remove();
        doublyLinkedListNode26.remove();
        doublyLinkedListNode5.insertRight(doublyLinkedListNode26);
        examples.DoublyLinkedListNode doublyLinkedListNode31 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode32 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode31.insertRight(doublyLinkedListNode32);
        examples.DoublyLinkedListNode doublyLinkedListNode34 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode34.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode36 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode34.insertRight(doublyLinkedListNode36);
        examples.DoublyLinkedListNode doublyLinkedListNode38 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode39 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode38.insertRight(doublyLinkedListNode39);
        doublyLinkedListNode39.remove();
        doublyLinkedListNode36.insertRight(doublyLinkedListNode39);
        doublyLinkedListNode36.remove();
        doublyLinkedListNode31.insertRight(doublyLinkedListNode36);
        examples.DoublyLinkedListNode doublyLinkedListNode45 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode45.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode47 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode45.insertRight(doublyLinkedListNode47);
        examples.DoublyLinkedListNode doublyLinkedListNode49 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode50 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode49.insertRight(doublyLinkedListNode50);
        doublyLinkedListNode50.remove();
        doublyLinkedListNode47.insertRight(doublyLinkedListNode50);
        doublyLinkedListNode47.remove();
        doublyLinkedListNode36.insertRight(doublyLinkedListNode47);
        // The following exception was thrown during execution in test generation
        try {
            doublyLinkedListNode26.insertRight(doublyLinkedListNode36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter is not singleton");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test154");
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
        doublyLinkedListNode0.remove();
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test155");
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
        examples.DoublyLinkedListNode doublyLinkedListNode16 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode17 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode16.insertRight(doublyLinkedListNode17);
        doublyLinkedListNode17.remove();
        doublyLinkedListNode14.insertRight(doublyLinkedListNode17);
        doublyLinkedListNode14.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode14);
        examples.DoublyLinkedListNode doublyLinkedListNode23 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode23.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode25 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode23.insertRight(doublyLinkedListNode25);
        // The following exception was thrown during execution in test generation
        try {
            doublyLinkedListNode0.insertRight(doublyLinkedListNode25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter is not singleton");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test156");
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
        java.lang.Class<?> wildcardClass36 = doublyLinkedListNode0.getClass();
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test157");
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
        examples.DoublyLinkedListNode doublyLinkedListNode37 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode38 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode37.insertRight(doublyLinkedListNode38);
        doublyLinkedListNode37.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode41 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode42 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode41.insertRight(doublyLinkedListNode42);
        doublyLinkedListNode42.remove();
        doublyLinkedListNode37.insertRight(doublyLinkedListNode42);
        // The following exception was thrown during execution in test generation
        try {
            doublyLinkedListNode18.insertRight(doublyLinkedListNode37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter is not singleton");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test158");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.remove();
        doublyLinkedListNode0.remove();
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
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test159");
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
        java.lang.Class<?> wildcardClass36 = doublyLinkedListNode3.getClass();
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test160");
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
        java.lang.Class<?> wildcardClass12 = doublyLinkedListNode2.getClass();
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test161");
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
        doublyLinkedListNode0.remove();
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test162");
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
        examples.DoublyLinkedListNode doublyLinkedListNode20 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode21 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode20.insertRight(doublyLinkedListNode21);
        doublyLinkedListNode20.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode24 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode25 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode24.insertRight(doublyLinkedListNode25);
        doublyLinkedListNode25.remove();
        doublyLinkedListNode20.insertRight(doublyLinkedListNode25);
        examples.DoublyLinkedListNode doublyLinkedListNode29 = new examples.DoublyLinkedListNode();
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
        doublyLinkedListNode29.insertRight(doublyLinkedListNode32);
        doublyLinkedListNode29.remove();
        doublyLinkedListNode29.remove();
        doublyLinkedListNode29.remove();
        doublyLinkedListNode25.insertRight(doublyLinkedListNode29);
        examples.DoublyLinkedListNode doublyLinkedListNode45 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode46 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode45.insertRight(doublyLinkedListNode46);
        doublyLinkedListNode46.remove();
        doublyLinkedListNode46.remove();
        doublyLinkedListNode25.insertRight(doublyLinkedListNode46);
        // The following exception was thrown during execution in test generation
        try {
            doublyLinkedListNode6.insertRight(doublyLinkedListNode25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter is not singleton");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test163");
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
        examples.DoublyLinkedListNode doublyLinkedListNode38 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode38.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode40 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode41 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode40.insertRight(doublyLinkedListNode41);
        doublyLinkedListNode41.remove();
        doublyLinkedListNode38.insertRight(doublyLinkedListNode41);
        examples.DoublyLinkedListNode doublyLinkedListNode45 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode45.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode47 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode45.insertRight(doublyLinkedListNode47);
        examples.DoublyLinkedListNode doublyLinkedListNode49 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode50 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode49.insertRight(doublyLinkedListNode50);
        doublyLinkedListNode50.remove();
        doublyLinkedListNode47.insertRight(doublyLinkedListNode50);
        doublyLinkedListNode47.remove();
        doublyLinkedListNode38.insertRight(doublyLinkedListNode47);
        doublyLinkedListNode38.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode57 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode58 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode57.insertRight(doublyLinkedListNode58);
        doublyLinkedListNode57.remove();
        doublyLinkedListNode57.remove();
        doublyLinkedListNode38.insertRight(doublyLinkedListNode57);
        examples.DoublyLinkedListNode doublyLinkedListNode63 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode63.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode65 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode66 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode65.insertRight(doublyLinkedListNode66);
        doublyLinkedListNode66.remove();
        doublyLinkedListNode63.insertRight(doublyLinkedListNode66);
        examples.DoublyLinkedListNode doublyLinkedListNode70 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode71 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode70.insertRight(doublyLinkedListNode71);
        doublyLinkedListNode71.remove();
        doublyLinkedListNode63.insertRight(doublyLinkedListNode71);
        doublyLinkedListNode63.remove();
        doublyLinkedListNode63.remove();
        doublyLinkedListNode63.remove();
        doublyLinkedListNode57.insertRight(doublyLinkedListNode63);
        // The following exception was thrown during execution in test generation
        try {
            doublyLinkedListNode0.insertRight(doublyLinkedListNode63);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter is not singleton");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test164");
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
        doublyLinkedListNode2.remove();
        java.lang.Class<?> wildcardClass11 = doublyLinkedListNode2.getClass();
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test165");
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
        examples.DoublyLinkedListNode doublyLinkedListNode27 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode25.insertRight(doublyLinkedListNode27);
        examples.DoublyLinkedListNode doublyLinkedListNode29 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode30 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode29.insertRight(doublyLinkedListNode30);
        doublyLinkedListNode30.remove();
        doublyLinkedListNode27.insertRight(doublyLinkedListNode30);
        doublyLinkedListNode27.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode35 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode27.insertRight(doublyLinkedListNode35);
        // The following exception was thrown during execution in test generation
        try {
            doublyLinkedListNode5.insertRight(doublyLinkedListNode35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter is not singleton");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test166");
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
        examples.DoublyLinkedListNode doublyLinkedListNode37 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode38 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode37.insertRight(doublyLinkedListNode38);
        doublyLinkedListNode37.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode41 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode42 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode41.insertRight(doublyLinkedListNode42);
        doublyLinkedListNode42.remove();
        doublyLinkedListNode42.remove();
        doublyLinkedListNode37.insertRight(doublyLinkedListNode42);
        doublyLinkedListNode37.remove();
        doublyLinkedListNode37.remove();
        doublyLinkedListNode37.remove();
        doublyLinkedListNode37.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode51 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode51.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode53 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode54 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode53.insertRight(doublyLinkedListNode54);
        doublyLinkedListNode54.remove();
        doublyLinkedListNode51.insertRight(doublyLinkedListNode54);
        examples.DoublyLinkedListNode doublyLinkedListNode58 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode59 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode58.insertRight(doublyLinkedListNode59);
        doublyLinkedListNode59.remove();
        doublyLinkedListNode51.insertRight(doublyLinkedListNode59);
        doublyLinkedListNode51.remove();
        doublyLinkedListNode51.remove();
        doublyLinkedListNode37.insertRight(doublyLinkedListNode51);
        doublyLinkedListNode51.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode51);
        examples.DoublyLinkedListNode doublyLinkedListNode68 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode68.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode70 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode71 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode70.insertRight(doublyLinkedListNode71);
        doublyLinkedListNode71.remove();
        doublyLinkedListNode68.insertRight(doublyLinkedListNode71);
        examples.DoublyLinkedListNode doublyLinkedListNode75 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode75.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode77 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode75.insertRight(doublyLinkedListNode77);
        examples.DoublyLinkedListNode doublyLinkedListNode79 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode80 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode79.insertRight(doublyLinkedListNode80);
        doublyLinkedListNode80.remove();
        doublyLinkedListNode77.insertRight(doublyLinkedListNode80);
        doublyLinkedListNode77.remove();
        doublyLinkedListNode68.insertRight(doublyLinkedListNode77);
        examples.DoublyLinkedListNode doublyLinkedListNode86 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode86.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode88 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode89 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode88.insertRight(doublyLinkedListNode89);
        doublyLinkedListNode89.remove();
        doublyLinkedListNode86.insertRight(doublyLinkedListNode89);
        doublyLinkedListNode86.remove();
        doublyLinkedListNode68.insertRight(doublyLinkedListNode86);
        // The following exception was thrown during execution in test generation
        try {
            doublyLinkedListNode51.insertRight(doublyLinkedListNode86);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter is not singleton");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test167");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode1 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode1);
        doublyLinkedListNode1.remove();
        doublyLinkedListNode1.remove();
        doublyLinkedListNode1.remove();
        java.lang.Class<?> wildcardClass6 = doublyLinkedListNode1.getClass();
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test168");
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
        doublyLinkedListNode20.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode22 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode20.insertRight(doublyLinkedListNode22);
        examples.DoublyLinkedListNode doublyLinkedListNode24 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode25 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode24.insertRight(doublyLinkedListNode25);
        doublyLinkedListNode25.remove();
        doublyLinkedListNode22.insertRight(doublyLinkedListNode25);
        doublyLinkedListNode22.remove();
        doublyLinkedListNode19.insertRight(doublyLinkedListNode22);
        doublyLinkedListNode19.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode32 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode32.remove();
        doublyLinkedListNode32.remove();
        doublyLinkedListNode32.remove();
        doublyLinkedListNode19.insertRight(doublyLinkedListNode32);
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
        examples.DoublyLinkedListNode doublyLinkedListNode62 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode62.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode64 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode65 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode64.insertRight(doublyLinkedListNode65);
        doublyLinkedListNode65.remove();
        doublyLinkedListNode62.insertRight(doublyLinkedListNode65);
        doublyLinkedListNode65.remove();
        doublyLinkedListNode55.insertRight(doublyLinkedListNode65);
        doublyLinkedListNode55.remove();
        doublyLinkedListNode37.insertRight(doublyLinkedListNode55);
        doublyLinkedListNode37.remove();
        doublyLinkedListNode37.remove();
        doublyLinkedListNode32.insertRight(doublyLinkedListNode37);
        // The following exception was thrown during execution in test generation
        try {
            doublyLinkedListNode0.insertRight(doublyLinkedListNode32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter is not singleton");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test169");
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
        java.lang.Class<?> wildcardClass12 = doublyLinkedListNode0.getClass();
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test170");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode1 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode1);
        java.lang.Class<?> wildcardClass3 = doublyLinkedListNode1.getClass();
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test171");
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
        doublyLinkedListNode30.remove();
        java.lang.Class<?> wildcardClass66 = doublyLinkedListNode30.getClass();
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test172");
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
        java.lang.Class<?> wildcardClass27 = doublyLinkedListNode16.getClass();
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test173");
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
        doublyLinkedListNode3.remove();
        doublyLinkedListNode3.remove();
        java.lang.Class<?> wildcardClass39 = doublyLinkedListNode3.getClass();
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test174");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode1 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode1);
        doublyLinkedListNode0.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode4 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode5 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode4.insertRight(doublyLinkedListNode5);
        doublyLinkedListNode5.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode5);
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
        doublyLinkedListNode9.remove();
        doublyLinkedListNode9.remove();
        doublyLinkedListNode5.insertRight(doublyLinkedListNode9);
        examples.DoublyLinkedListNode doublyLinkedListNode25 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode26 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode25.insertRight(doublyLinkedListNode26);
        doublyLinkedListNode26.remove();
        doublyLinkedListNode26.remove();
        doublyLinkedListNode5.insertRight(doublyLinkedListNode26);
        doublyLinkedListNode26.remove();
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test175");
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
        examples.DoublyLinkedListNode doublyLinkedListNode16 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode17 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode16.insertRight(doublyLinkedListNode17);
        doublyLinkedListNode17.remove();
        doublyLinkedListNode14.insertRight(doublyLinkedListNode17);
        doublyLinkedListNode14.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode14);
        java.lang.Class<?> wildcardClass23 = doublyLinkedListNode0.getClass();
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test176");
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
        java.lang.Class<?> wildcardClass24 = doublyLinkedListNode2.getClass();
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test177");
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
        doublyLinkedListNode0.insertRight(doublyLinkedListNode14);
        java.lang.Class<?> wildcardClass16 = doublyLinkedListNode0.getClass();
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test178");
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
        // The following exception was thrown during execution in test generation
        try {
            doublyLinkedListNode16.insertRight(doublyLinkedListNode30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter is not singleton");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test179");
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
        doublyLinkedListNode8.remove();
        doublyLinkedListNode8.remove();
        doublyLinkedListNode8.remove();
        doublyLinkedListNode2.insertRight(doublyLinkedListNode8);
        java.lang.Class<?> wildcardClass16 = doublyLinkedListNode8.getClass();
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test180");
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
        doublyLinkedListNode0.remove();
        doublyLinkedListNode0.remove();
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test181");
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
        doublyLinkedListNode18.remove();
        java.lang.Class<?> wildcardClass38 = doublyLinkedListNode18.getClass();
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test182");
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
        examples.DoublyLinkedListNode doublyLinkedListNode12 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode13 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode12.insertRight(doublyLinkedListNode13);
        doublyLinkedListNode12.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode16 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode17 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode16.insertRight(doublyLinkedListNode17);
        doublyLinkedListNode17.remove();
        doublyLinkedListNode17.remove();
        doublyLinkedListNode12.insertRight(doublyLinkedListNode17);
        doublyLinkedListNode12.remove();
        doublyLinkedListNode12.remove();
        doublyLinkedListNode12.remove();
        doublyLinkedListNode12.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode26 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode26.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode28 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode29 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode28.insertRight(doublyLinkedListNode29);
        doublyLinkedListNode29.remove();
        doublyLinkedListNode26.insertRight(doublyLinkedListNode29);
        examples.DoublyLinkedListNode doublyLinkedListNode33 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode34 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode33.insertRight(doublyLinkedListNode34);
        doublyLinkedListNode34.remove();
        doublyLinkedListNode26.insertRight(doublyLinkedListNode34);
        doublyLinkedListNode26.remove();
        doublyLinkedListNode26.remove();
        doublyLinkedListNode12.insertRight(doublyLinkedListNode26);
        doublyLinkedListNode26.remove();
        doublyLinkedListNode3.insertRight(doublyLinkedListNode26);
        examples.DoublyLinkedListNode doublyLinkedListNode43 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode43.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode45 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode43.insertRight(doublyLinkedListNode45);
        doublyLinkedListNode45.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode48 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode48.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode50 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode51 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode50.insertRight(doublyLinkedListNode51);
        doublyLinkedListNode51.remove();
        doublyLinkedListNode48.insertRight(doublyLinkedListNode51);
        doublyLinkedListNode51.remove();
        doublyLinkedListNode51.remove();
        doublyLinkedListNode51.remove();
        doublyLinkedListNode45.insertRight(doublyLinkedListNode51);
        // The following exception was thrown during execution in test generation
        try {
            doublyLinkedListNode26.insertRight(doublyLinkedListNode45);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter is not singleton");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test183");
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
        examples.DoublyLinkedListNode doublyLinkedListNode27 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode28 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode27.insertRight(doublyLinkedListNode28);
        doublyLinkedListNode27.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode31 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode32 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode31.insertRight(doublyLinkedListNode32);
        doublyLinkedListNode32.remove();
        doublyLinkedListNode32.remove();
        doublyLinkedListNode27.insertRight(doublyLinkedListNode32);
        doublyLinkedListNode27.remove();
        doublyLinkedListNode27.remove();
        doublyLinkedListNode27.remove();
        doublyLinkedListNode27.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode41 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode41.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode43 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode44 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode43.insertRight(doublyLinkedListNode44);
        doublyLinkedListNode44.remove();
        doublyLinkedListNode41.insertRight(doublyLinkedListNode44);
        examples.DoublyLinkedListNode doublyLinkedListNode48 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode49 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode48.insertRight(doublyLinkedListNode49);
        doublyLinkedListNode49.remove();
        doublyLinkedListNode41.insertRight(doublyLinkedListNode49);
        doublyLinkedListNode41.remove();
        doublyLinkedListNode41.remove();
        doublyLinkedListNode27.insertRight(doublyLinkedListNode41);
        doublyLinkedListNode41.remove();
        doublyLinkedListNode18.insertRight(doublyLinkedListNode41);
        // The following exception was thrown during execution in test generation
        try {
            doublyLinkedListNode6.insertRight(doublyLinkedListNode18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter is not singleton");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test184");
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
        examples.DoublyLinkedListNode doublyLinkedListNode16 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode17 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode16.insertRight(doublyLinkedListNode17);
        doublyLinkedListNode17.remove();
        doublyLinkedListNode14.insertRight(doublyLinkedListNode17);
        doublyLinkedListNode14.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode14);
        doublyLinkedListNode14.remove();
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test185");
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
        examples.DoublyLinkedListNode doublyLinkedListNode35 = null;
        // The following exception was thrown during execution in test generation
        try {
            doublyLinkedListNode13.insertRight(doublyLinkedListNode35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: undefined for null parameter");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test186");
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
        doublyLinkedListNode8.remove();
        doublyLinkedListNode8.remove();
        doublyLinkedListNode8.remove();
        doublyLinkedListNode2.insertRight(doublyLinkedListNode8);
        doublyLinkedListNode8.remove();
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test187");
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
        doublyLinkedListNode17.remove();
        doublyLinkedListNode17.remove();
        java.lang.Class<?> wildcardClass54 = doublyLinkedListNode17.getClass();
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test188");
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
        java.lang.Class<?> wildcardClass21 = doublyLinkedListNode0.getClass();
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test189");
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
        // The following exception was thrown during execution in test generation
        try {
            doublyLinkedListNode0.insertRight(doublyLinkedListNode27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter is not singleton");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test190");
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
        // The following exception was thrown during execution in test generation
        try {
            doublyLinkedListNode5.insertRight(doublyLinkedListNode16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter is not singleton");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test191");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode2 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode3 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode2.insertRight(doublyLinkedListNode3);
        doublyLinkedListNode3.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode3);
        doublyLinkedListNode0.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode8 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode9 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode9.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode11 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode9.insertRight(doublyLinkedListNode11);
        examples.DoublyLinkedListNode doublyLinkedListNode13 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode14 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode13.insertRight(doublyLinkedListNode14);
        doublyLinkedListNode14.remove();
        doublyLinkedListNode11.insertRight(doublyLinkedListNode14);
        doublyLinkedListNode11.remove();
        doublyLinkedListNode8.insertRight(doublyLinkedListNode11);
        doublyLinkedListNode8.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode21 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode21.remove();
        doublyLinkedListNode21.remove();
        doublyLinkedListNode21.remove();
        doublyLinkedListNode8.insertRight(doublyLinkedListNode21);
        examples.DoublyLinkedListNode doublyLinkedListNode26 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode26.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode28 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode29 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode28.insertRight(doublyLinkedListNode29);
        doublyLinkedListNode29.remove();
        doublyLinkedListNode26.insertRight(doublyLinkedListNode29);
        examples.DoublyLinkedListNode doublyLinkedListNode33 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode34 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode33.insertRight(doublyLinkedListNode34);
        doublyLinkedListNode34.remove();
        doublyLinkedListNode26.insertRight(doublyLinkedListNode34);
        doublyLinkedListNode26.remove();
        doublyLinkedListNode26.remove();
        doublyLinkedListNode21.insertRight(doublyLinkedListNode26);
        // The following exception was thrown during execution in test generation
        try {
            doublyLinkedListNode0.insertRight(doublyLinkedListNode21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter is not singleton");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test192");
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
        examples.DoublyLinkedListNode doublyLinkedListNode12 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode13 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode12.insertRight(doublyLinkedListNode13);
        doublyLinkedListNode12.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode16 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode17 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode16.insertRight(doublyLinkedListNode17);
        doublyLinkedListNode17.remove();
        doublyLinkedListNode17.remove();
        doublyLinkedListNode12.insertRight(doublyLinkedListNode17);
        doublyLinkedListNode12.remove();
        doublyLinkedListNode12.remove();
        doublyLinkedListNode12.remove();
        doublyLinkedListNode12.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode26 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode26.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode28 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode29 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode28.insertRight(doublyLinkedListNode29);
        doublyLinkedListNode29.remove();
        doublyLinkedListNode26.insertRight(doublyLinkedListNode29);
        examples.DoublyLinkedListNode doublyLinkedListNode33 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode34 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode33.insertRight(doublyLinkedListNode34);
        doublyLinkedListNode34.remove();
        doublyLinkedListNode26.insertRight(doublyLinkedListNode34);
        doublyLinkedListNode26.remove();
        doublyLinkedListNode26.remove();
        doublyLinkedListNode12.insertRight(doublyLinkedListNode26);
        doublyLinkedListNode26.remove();
        doublyLinkedListNode3.insertRight(doublyLinkedListNode26);
        doublyLinkedListNode26.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode44 = null;
        // The following exception was thrown during execution in test generation
        try {
            doublyLinkedListNode26.insertRight(doublyLinkedListNode44);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: undefined for null parameter");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test193");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode2 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode2);
        doublyLinkedListNode0.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode5 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode5.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode7 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode5.insertRight(doublyLinkedListNode7);
        // The following exception was thrown during execution in test generation
        try {
            doublyLinkedListNode0.insertRight(doublyLinkedListNode5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter is not singleton");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test194");
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
        doublyLinkedListNode14.insertRight(doublyLinkedListNode16);
        examples.DoublyLinkedListNode doublyLinkedListNode18 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode19 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode18.insertRight(doublyLinkedListNode19);
        doublyLinkedListNode19.remove();
        doublyLinkedListNode16.insertRight(doublyLinkedListNode19);
        doublyLinkedListNode16.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode24 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode16.insertRight(doublyLinkedListNode24);
        doublyLinkedListNode16.remove();
        doublyLinkedListNode16.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode16);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test195");
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
        doublyLinkedListNode8.remove();
        doublyLinkedListNode8.remove();
        doublyLinkedListNode8.remove();
        doublyLinkedListNode2.insertRight(doublyLinkedListNode8);
        examples.DoublyLinkedListNode doublyLinkedListNode16 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode16.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode18 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode19 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode18.insertRight(doublyLinkedListNode19);
        doublyLinkedListNode19.remove();
        doublyLinkedListNode16.insertRight(doublyLinkedListNode19);
        examples.DoublyLinkedListNode doublyLinkedListNode23 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode23.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode25 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode23.insertRight(doublyLinkedListNode25);
        examples.DoublyLinkedListNode doublyLinkedListNode27 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode28 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode27.insertRight(doublyLinkedListNode28);
        doublyLinkedListNode28.remove();
        doublyLinkedListNode25.insertRight(doublyLinkedListNode28);
        doublyLinkedListNode25.remove();
        doublyLinkedListNode16.insertRight(doublyLinkedListNode25);
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
        doublyLinkedListNode44.remove();
        doublyLinkedListNode34.insertRight(doublyLinkedListNode44);
        doublyLinkedListNode34.remove();
        doublyLinkedListNode16.insertRight(doublyLinkedListNode34);
        // The following exception was thrown during execution in test generation
        try {
            doublyLinkedListNode2.insertRight(doublyLinkedListNode16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter is not singleton");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test196");
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
        doublyLinkedListNode30.remove();
        doublyLinkedListNode30.remove();
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test197");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.remove();
        doublyLinkedListNode0.remove();
        doublyLinkedListNode0.remove();
        doublyLinkedListNode0.remove();
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
        // The following exception was thrown during execution in test generation
        try {
            doublyLinkedListNode0.insertRight(doublyLinkedListNode14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter is not singleton");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test198");
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
        examples.DoublyLinkedListNode doublyLinkedListNode21 = null;
        // The following exception was thrown during execution in test generation
        try {
            doublyLinkedListNode12.insertRight(doublyLinkedListNode21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: undefined for null parameter");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test199");
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
            doublyLinkedListNode0.insertRight(doublyLinkedListNode27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter is not singleton");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test200");
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
        java.lang.Class<?> wildcardClass25 = doublyLinkedListNode5.getClass();
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test201");
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
        examples.DoublyLinkedListNode doublyLinkedListNode58 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode59 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode58.insertRight(doublyLinkedListNode59);
        doublyLinkedListNode58.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode62 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode63 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode62.insertRight(doublyLinkedListNode63);
        doublyLinkedListNode63.remove();
        doublyLinkedListNode63.remove();
        doublyLinkedListNode58.insertRight(doublyLinkedListNode63);
        doublyLinkedListNode58.remove();
        doublyLinkedListNode58.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode70 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode70.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode72 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode73 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode72.insertRight(doublyLinkedListNode73);
        doublyLinkedListNode73.remove();
        doublyLinkedListNode70.insertRight(doublyLinkedListNode73);
        examples.DoublyLinkedListNode doublyLinkedListNode77 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode77.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode79 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode80 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode79.insertRight(doublyLinkedListNode80);
        doublyLinkedListNode80.remove();
        doublyLinkedListNode77.insertRight(doublyLinkedListNode80);
        doublyLinkedListNode80.remove();
        doublyLinkedListNode70.insertRight(doublyLinkedListNode80);
        doublyLinkedListNode70.remove();
        doublyLinkedListNode58.insertRight(doublyLinkedListNode70);
        doublyLinkedListNode58.remove();
        doublyLinkedListNode18.insertRight(doublyLinkedListNode58);
        doublyLinkedListNode58.remove();
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test202");
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
        doublyLinkedListNode0.insertRight(doublyLinkedListNode30);
        doublyLinkedListNode30.remove();
        doublyLinkedListNode30.remove();
        doublyLinkedListNode30.remove();
        java.lang.Class<?> wildcardClass68 = doublyLinkedListNode30.getClass();
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test203");
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
        java.lang.Class<?> wildcardClass28 = doublyLinkedListNode25.getClass();
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test204");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode1 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode1);
        doublyLinkedListNode0.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode4 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode5 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode4.insertRight(doublyLinkedListNode5);
        doublyLinkedListNode5.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode5);
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
        doublyLinkedListNode9.remove();
        doublyLinkedListNode9.remove();
        doublyLinkedListNode5.insertRight(doublyLinkedListNode9);
        examples.DoublyLinkedListNode doublyLinkedListNode25 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode26 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode25.insertRight(doublyLinkedListNode26);
        doublyLinkedListNode26.remove();
        doublyLinkedListNode26.remove();
        doublyLinkedListNode5.insertRight(doublyLinkedListNode26);
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
        examples.DoublyLinkedListNode doublyLinkedListNode41 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode33.insertRight(doublyLinkedListNode41);
        // The following exception was thrown during execution in test generation
        try {
            doublyLinkedListNode5.insertRight(doublyLinkedListNode33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter is not singleton");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test205");
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
        examples.DoublyLinkedListNode doublyLinkedListNode24 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode24.remove();
        doublyLinkedListNode24.remove();
        doublyLinkedListNode2.insertRight(doublyLinkedListNode24);
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
        examples.DoublyLinkedListNode doublyLinkedListNode42 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode42.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode44 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode45 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode44.insertRight(doublyLinkedListNode45);
        doublyLinkedListNode45.remove();
        doublyLinkedListNode42.insertRight(doublyLinkedListNode45);
        examples.DoublyLinkedListNode doublyLinkedListNode49 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode49.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode51 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode52 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode51.insertRight(doublyLinkedListNode52);
        doublyLinkedListNode52.remove();
        doublyLinkedListNode49.insertRight(doublyLinkedListNode52);
        examples.DoublyLinkedListNode doublyLinkedListNode56 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode56.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode58 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode56.insertRight(doublyLinkedListNode58);
        examples.DoublyLinkedListNode doublyLinkedListNode60 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode61 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode60.insertRight(doublyLinkedListNode61);
        doublyLinkedListNode61.remove();
        doublyLinkedListNode58.insertRight(doublyLinkedListNode61);
        doublyLinkedListNode58.remove();
        doublyLinkedListNode49.insertRight(doublyLinkedListNode58);
        examples.DoublyLinkedListNode doublyLinkedListNode67 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode67.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode69 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode70 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode69.insertRight(doublyLinkedListNode70);
        doublyLinkedListNode70.remove();
        doublyLinkedListNode67.insertRight(doublyLinkedListNode70);
        doublyLinkedListNode67.remove();
        doublyLinkedListNode49.insertRight(doublyLinkedListNode67);
        doublyLinkedListNode67.remove();
        doublyLinkedListNode45.insertRight(doublyLinkedListNode67);
        doublyLinkedListNode45.remove();
        doublyLinkedListNode33.insertRight(doublyLinkedListNode45);
        // The following exception was thrown during execution in test generation
        try {
            doublyLinkedListNode24.insertRight(doublyLinkedListNode33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter is not singleton");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test206");
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
        java.lang.Class<?> wildcardClass35 = doublyLinkedListNode18.getClass();
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test207");
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
        doublyLinkedListNode0.remove();
        doublyLinkedListNode0.remove();
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test208");
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
        doublyLinkedListNode0.insertRight(doublyLinkedListNode30);
        doublyLinkedListNode30.remove();
        doublyLinkedListNode30.remove();
        java.lang.Class<?> wildcardClass67 = doublyLinkedListNode30.getClass();
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test209");
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
        java.lang.Class<?> wildcardClass28 = doublyLinkedListNode18.getClass();
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test210");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.remove();
        doublyLinkedListNode0.remove();
        doublyLinkedListNode0.remove();
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
        doublyLinkedListNode11.insertRight(doublyLinkedListNode13);
        examples.DoublyLinkedListNode doublyLinkedListNode15 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode16 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode15.insertRight(doublyLinkedListNode16);
        doublyLinkedListNode16.remove();
        doublyLinkedListNode13.insertRight(doublyLinkedListNode16);
        doublyLinkedListNode13.remove();
        doublyLinkedListNode4.insertRight(doublyLinkedListNode13);
        examples.DoublyLinkedListNode doublyLinkedListNode22 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode22.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode24 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode25 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode24.insertRight(doublyLinkedListNode25);
        doublyLinkedListNode25.remove();
        doublyLinkedListNode22.insertRight(doublyLinkedListNode25);
        examples.DoublyLinkedListNode doublyLinkedListNode29 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode29.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode31 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode32 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode31.insertRight(doublyLinkedListNode32);
        doublyLinkedListNode32.remove();
        doublyLinkedListNode29.insertRight(doublyLinkedListNode32);
        doublyLinkedListNode32.remove();
        doublyLinkedListNode22.insertRight(doublyLinkedListNode32);
        doublyLinkedListNode22.remove();
        doublyLinkedListNode4.insertRight(doublyLinkedListNode22);
        doublyLinkedListNode4.remove();
        doublyLinkedListNode4.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode4);
        examples.DoublyLinkedListNode doublyLinkedListNode43 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode44 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode43.insertRight(doublyLinkedListNode44);
        examples.DoublyLinkedListNode doublyLinkedListNode46 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode46.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode48 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode46.insertRight(doublyLinkedListNode48);
        examples.DoublyLinkedListNode doublyLinkedListNode50 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode51 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode50.insertRight(doublyLinkedListNode51);
        doublyLinkedListNode51.remove();
        doublyLinkedListNode48.insertRight(doublyLinkedListNode51);
        doublyLinkedListNode48.remove();
        doublyLinkedListNode43.insertRight(doublyLinkedListNode48);
        doublyLinkedListNode43.remove();
        doublyLinkedListNode4.insertRight(doublyLinkedListNode43);
        examples.DoublyLinkedListNode doublyLinkedListNode59 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode60 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode60.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode62 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode60.insertRight(doublyLinkedListNode62);
        examples.DoublyLinkedListNode doublyLinkedListNode64 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode65 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode64.insertRight(doublyLinkedListNode65);
        doublyLinkedListNode65.remove();
        doublyLinkedListNode62.insertRight(doublyLinkedListNode65);
        doublyLinkedListNode62.remove();
        doublyLinkedListNode59.insertRight(doublyLinkedListNode62);
        doublyLinkedListNode59.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode72 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode72.remove();
        doublyLinkedListNode72.remove();
        doublyLinkedListNode72.remove();
        doublyLinkedListNode59.insertRight(doublyLinkedListNode72);
        examples.DoublyLinkedListNode doublyLinkedListNode77 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode77.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode79 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode80 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode79.insertRight(doublyLinkedListNode80);
        doublyLinkedListNode80.remove();
        doublyLinkedListNode77.insertRight(doublyLinkedListNode80);
        examples.DoublyLinkedListNode doublyLinkedListNode84 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode85 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode84.insertRight(doublyLinkedListNode85);
        doublyLinkedListNode85.remove();
        doublyLinkedListNode77.insertRight(doublyLinkedListNode85);
        doublyLinkedListNode77.remove();
        doublyLinkedListNode77.remove();
        doublyLinkedListNode72.insertRight(doublyLinkedListNode77);
        doublyLinkedListNode77.remove();
        doublyLinkedListNode4.insertRight(doublyLinkedListNode77);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test211");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode2 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode2);
        examples.DoublyLinkedListNode doublyLinkedListNode4 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode5 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode4.insertRight(doublyLinkedListNode5);
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
        doublyLinkedListNode4.insertRight(doublyLinkedListNode9);
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
        doublyLinkedListNode9.insertRight(doublyLinkedListNode20);
        doublyLinkedListNode20.remove();
        doublyLinkedListNode20.remove();
        doublyLinkedListNode20.remove();
        doublyLinkedListNode2.insertRight(doublyLinkedListNode20);
        doublyLinkedListNode20.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode34 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode34.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode36 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode37 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode36.insertRight(doublyLinkedListNode37);
        doublyLinkedListNode37.remove();
        doublyLinkedListNode34.insertRight(doublyLinkedListNode37);
        doublyLinkedListNode34.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode42 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode42.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode44 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode45 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode44.insertRight(doublyLinkedListNode45);
        doublyLinkedListNode45.remove();
        doublyLinkedListNode42.insertRight(doublyLinkedListNode45);
        doublyLinkedListNode45.remove();
        doublyLinkedListNode34.insertRight(doublyLinkedListNode45);
        // The following exception was thrown during execution in test generation
        try {
            doublyLinkedListNode20.insertRight(doublyLinkedListNode34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter is not singleton");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test212");
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
        examples.DoublyLinkedListNode doublyLinkedListNode39 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode39.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode41 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode42 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode41.insertRight(doublyLinkedListNode42);
        doublyLinkedListNode42.remove();
        doublyLinkedListNode39.insertRight(doublyLinkedListNode42);
        examples.DoublyLinkedListNode doublyLinkedListNode46 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode46.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode48 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode46.insertRight(doublyLinkedListNode48);
        examples.DoublyLinkedListNode doublyLinkedListNode50 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode51 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode50.insertRight(doublyLinkedListNode51);
        doublyLinkedListNode51.remove();
        doublyLinkedListNode48.insertRight(doublyLinkedListNode51);
        doublyLinkedListNode48.remove();
        doublyLinkedListNode39.insertRight(doublyLinkedListNode48);
        doublyLinkedListNode39.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode58 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode59 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode58.insertRight(doublyLinkedListNode59);
        doublyLinkedListNode58.remove();
        doublyLinkedListNode58.remove();
        doublyLinkedListNode39.insertRight(doublyLinkedListNode58);
        examples.DoublyLinkedListNode doublyLinkedListNode64 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode64.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode66 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode67 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode66.insertRight(doublyLinkedListNode67);
        doublyLinkedListNode67.remove();
        doublyLinkedListNode64.insertRight(doublyLinkedListNode67);
        examples.DoublyLinkedListNode doublyLinkedListNode71 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode72 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode71.insertRight(doublyLinkedListNode72);
        doublyLinkedListNode72.remove();
        doublyLinkedListNode64.insertRight(doublyLinkedListNode72);
        doublyLinkedListNode64.remove();
        doublyLinkedListNode64.remove();
        doublyLinkedListNode64.remove();
        doublyLinkedListNode58.insertRight(doublyLinkedListNode64);
        // The following exception was thrown during execution in test generation
        try {
            doublyLinkedListNode0.insertRight(doublyLinkedListNode64);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter is not singleton");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test213");
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
        examples.DoublyLinkedListNode doublyLinkedListNode12 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode13 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode12.insertRight(doublyLinkedListNode13);
        doublyLinkedListNode12.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode16 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode17 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode16.insertRight(doublyLinkedListNode17);
        doublyLinkedListNode17.remove();
        doublyLinkedListNode17.remove();
        doublyLinkedListNode12.insertRight(doublyLinkedListNode17);
        doublyLinkedListNode12.remove();
        doublyLinkedListNode12.remove();
        doublyLinkedListNode12.remove();
        doublyLinkedListNode12.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode12);
        java.lang.Class<?> wildcardClass27 = doublyLinkedListNode12.getClass();
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test214");
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
        doublyLinkedListNode25.remove();
        java.lang.Class<?> wildcardClass42 = doublyLinkedListNode25.getClass();
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test215");
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
        doublyLinkedListNode27.remove();
        doublyLinkedListNode27.remove();
        doublyLinkedListNode27.remove();
        doublyLinkedListNode27.remove();
        doublyLinkedListNode16.insertRight(doublyLinkedListNode27);
        java.lang.Class<?> wildcardClass34 = doublyLinkedListNode16.getClass();
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test216");
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
        doublyLinkedListNode28.remove();
        java.lang.Class<?> wildcardClass44 = doublyLinkedListNode28.getClass();
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test217");
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
        java.lang.Class<?> wildcardClass20 = doublyLinkedListNode15.getClass();
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test218");
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
        doublyLinkedListNode0.remove();
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test219");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode2 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode2);
        doublyLinkedListNode2.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode5 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode5.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode7 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode5.insertRight(doublyLinkedListNode7);
        examples.DoublyLinkedListNode doublyLinkedListNode9 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode10 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode9.insertRight(doublyLinkedListNode10);
        doublyLinkedListNode10.remove();
        doublyLinkedListNode7.insertRight(doublyLinkedListNode10);
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
        doublyLinkedListNode7.insertRight(doublyLinkedListNode14);
        doublyLinkedListNode7.remove();
        doublyLinkedListNode2.insertRight(doublyLinkedListNode7);
        java.lang.Class<?> wildcardClass31 = doublyLinkedListNode7.getClass();
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test220");
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
        java.lang.Class<?> wildcardClass57 = doublyLinkedListNode18.getClass();
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test221");
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
        doublyLinkedListNode8.remove();
        doublyLinkedListNode8.remove();
        doublyLinkedListNode8.remove();
        doublyLinkedListNode2.insertRight(doublyLinkedListNode8);
        examples.DoublyLinkedListNode doublyLinkedListNode16 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode17 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode16.insertRight(doublyLinkedListNode17);
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
        doublyLinkedListNode16.insertRight(doublyLinkedListNode21);
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
        doublyLinkedListNode21.insertRight(doublyLinkedListNode32);
        examples.DoublyLinkedListNode doublyLinkedListNode41 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode41.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode43 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode44 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode43.insertRight(doublyLinkedListNode44);
        doublyLinkedListNode44.remove();
        doublyLinkedListNode41.insertRight(doublyLinkedListNode44);
        examples.DoublyLinkedListNode doublyLinkedListNode48 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode49 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode48.insertRight(doublyLinkedListNode49);
        doublyLinkedListNode49.remove();
        doublyLinkedListNode41.insertRight(doublyLinkedListNode49);
        doublyLinkedListNode41.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode54 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode55 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode54.insertRight(doublyLinkedListNode55);
        doublyLinkedListNode54.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode58 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode59 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode58.insertRight(doublyLinkedListNode59);
        doublyLinkedListNode59.remove();
        doublyLinkedListNode59.remove();
        doublyLinkedListNode54.insertRight(doublyLinkedListNode59);
        doublyLinkedListNode54.remove();
        doublyLinkedListNode54.remove();
        doublyLinkedListNode54.remove();
        doublyLinkedListNode41.insertRight(doublyLinkedListNode54);
        doublyLinkedListNode41.remove();
        doublyLinkedListNode21.insertRight(doublyLinkedListNode41);
        // The following exception was thrown during execution in test generation
        try {
            doublyLinkedListNode2.insertRight(doublyLinkedListNode41);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter is not singleton");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test222");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode1 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode1);
        doublyLinkedListNode0.remove();
        doublyLinkedListNode0.remove();
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
        doublyLinkedListNode23.remove();
        doublyLinkedListNode5.insertRight(doublyLinkedListNode23);
        doublyLinkedListNode5.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode5);
        java.lang.Class<?> wildcardClass34 = doublyLinkedListNode0.getClass();
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test223");
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
        examples.DoublyLinkedListNode doublyLinkedListNode48 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode49 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode48.insertRight(doublyLinkedListNode49);
        doublyLinkedListNode48.remove();
        doublyLinkedListNode39.insertRight(doublyLinkedListNode48);
        // The following exception was thrown during execution in test generation
        try {
            doublyLinkedListNode12.insertRight(doublyLinkedListNode48);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter is not singleton");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test224");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode1 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode1);
        doublyLinkedListNode0.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode4 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode5 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode4.insertRight(doublyLinkedListNode5);
        doublyLinkedListNode5.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode5);
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
        doublyLinkedListNode9.remove();
        doublyLinkedListNode9.remove();
        doublyLinkedListNode5.insertRight(doublyLinkedListNode9);
        doublyLinkedListNode9.remove();
        java.lang.Class<?> wildcardClass26 = doublyLinkedListNode9.getClass();
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test225");
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
        examples.DoublyLinkedListNode doublyLinkedListNode21 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode22 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode21.insertRight(doublyLinkedListNode22);
        doublyLinkedListNode22.remove();
        doublyLinkedListNode19.insertRight(doublyLinkedListNode22);
        examples.DoublyLinkedListNode doublyLinkedListNode26 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode26.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode28 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode29 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode28.insertRight(doublyLinkedListNode29);
        doublyLinkedListNode29.remove();
        doublyLinkedListNode26.insertRight(doublyLinkedListNode29);
        examples.DoublyLinkedListNode doublyLinkedListNode33 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode34 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode33.insertRight(doublyLinkedListNode34);
        doublyLinkedListNode34.remove();
        doublyLinkedListNode26.insertRight(doublyLinkedListNode34);
        doublyLinkedListNode26.remove();
        doublyLinkedListNode26.remove();
        doublyLinkedListNode19.insertRight(doublyLinkedListNode26);
        // The following exception was thrown during execution in test generation
        try {
            doublyLinkedListNode11.insertRight(doublyLinkedListNode19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter is not singleton");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test226");
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
        doublyLinkedListNode2.remove();
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
        doublyLinkedListNode11.remove();
        doublyLinkedListNode2.insertRight(doublyLinkedListNode11);
        examples.DoublyLinkedListNode doublyLinkedListNode31 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode31.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode33 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode31.insertRight(doublyLinkedListNode33);
        // The following exception was thrown during execution in test generation
        try {
            doublyLinkedListNode2.insertRight(doublyLinkedListNode33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter is not singleton");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test227");
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
        doublyLinkedListNode0.insertRight(doublyLinkedListNode30);
        doublyLinkedListNode0.remove();
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test228");
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
        doublyLinkedListNode0.remove();
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
        doublyLinkedListNode28.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode28);
        examples.DoublyLinkedListNode doublyLinkedListNode44 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode44.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode46 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode44.insertRight(doublyLinkedListNode46);
        examples.DoublyLinkedListNode doublyLinkedListNode48 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode49 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode48.insertRight(doublyLinkedListNode49);
        doublyLinkedListNode49.remove();
        doublyLinkedListNode46.insertRight(doublyLinkedListNode49);
        // The following exception was thrown during execution in test generation
        try {
            doublyLinkedListNode0.insertRight(doublyLinkedListNode49);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter is not singleton");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test229");
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
        doublyLinkedListNode17.remove();
        doublyLinkedListNode17.remove();
        doublyLinkedListNode17.remove();
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test230");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.remove();
        doublyLinkedListNode0.remove();
        doublyLinkedListNode0.remove();
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
        doublyLinkedListNode11.insertRight(doublyLinkedListNode13);
        examples.DoublyLinkedListNode doublyLinkedListNode15 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode16 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode15.insertRight(doublyLinkedListNode16);
        doublyLinkedListNode16.remove();
        doublyLinkedListNode13.insertRight(doublyLinkedListNode16);
        doublyLinkedListNode13.remove();
        doublyLinkedListNode4.insertRight(doublyLinkedListNode13);
        examples.DoublyLinkedListNode doublyLinkedListNode22 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode22.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode24 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode25 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode24.insertRight(doublyLinkedListNode25);
        doublyLinkedListNode25.remove();
        doublyLinkedListNode22.insertRight(doublyLinkedListNode25);
        examples.DoublyLinkedListNode doublyLinkedListNode29 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode29.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode31 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode32 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode31.insertRight(doublyLinkedListNode32);
        doublyLinkedListNode32.remove();
        doublyLinkedListNode29.insertRight(doublyLinkedListNode32);
        doublyLinkedListNode32.remove();
        doublyLinkedListNode22.insertRight(doublyLinkedListNode32);
        doublyLinkedListNode22.remove();
        doublyLinkedListNode4.insertRight(doublyLinkedListNode22);
        doublyLinkedListNode4.remove();
        doublyLinkedListNode4.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode4);
        doublyLinkedListNode4.remove();
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test231");
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
        doublyLinkedListNode50.remove();
        doublyLinkedListNode50.remove();
        doublyLinkedListNode50.remove();
        doublyLinkedListNode12.insertRight(doublyLinkedListNode50);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test232");
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
        examples.DoublyLinkedListNode doublyLinkedListNode12 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode13 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode12.insertRight(doublyLinkedListNode13);
        doublyLinkedListNode12.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode16 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode17 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode16.insertRight(doublyLinkedListNode17);
        doublyLinkedListNode17.remove();
        doublyLinkedListNode17.remove();
        doublyLinkedListNode12.insertRight(doublyLinkedListNode17);
        doublyLinkedListNode12.remove();
        doublyLinkedListNode12.remove();
        doublyLinkedListNode12.remove();
        doublyLinkedListNode12.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode12);
        examples.DoublyLinkedListNode doublyLinkedListNode27 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode28 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode27.insertRight(doublyLinkedListNode28);
        doublyLinkedListNode27.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode31 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode32 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode31.insertRight(doublyLinkedListNode32);
        doublyLinkedListNode32.remove();
        doublyLinkedListNode32.remove();
        doublyLinkedListNode27.insertRight(doublyLinkedListNode32);
        doublyLinkedListNode27.remove();
        doublyLinkedListNode27.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode39 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode39.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode41 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode42 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode41.insertRight(doublyLinkedListNode42);
        doublyLinkedListNode42.remove();
        doublyLinkedListNode39.insertRight(doublyLinkedListNode42);
        examples.DoublyLinkedListNode doublyLinkedListNode46 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode46.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode48 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode49 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode48.insertRight(doublyLinkedListNode49);
        doublyLinkedListNode49.remove();
        doublyLinkedListNode46.insertRight(doublyLinkedListNode49);
        doublyLinkedListNode49.remove();
        doublyLinkedListNode39.insertRight(doublyLinkedListNode49);
        doublyLinkedListNode39.remove();
        doublyLinkedListNode27.insertRight(doublyLinkedListNode39);
        examples.DoublyLinkedListNode doublyLinkedListNode57 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode57.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode59 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode60 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode59.insertRight(doublyLinkedListNode60);
        doublyLinkedListNode60.remove();
        doublyLinkedListNode57.insertRight(doublyLinkedListNode60);
        doublyLinkedListNode57.remove();
        doublyLinkedListNode27.insertRight(doublyLinkedListNode57);
        // The following exception was thrown during execution in test generation
        try {
            doublyLinkedListNode0.insertRight(doublyLinkedListNode57);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter is not singleton");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test233");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.remove();
        doublyLinkedListNode0.remove();
        doublyLinkedListNode0.remove();
        doublyLinkedListNode0.remove();
        doublyLinkedListNode0.remove();
        java.lang.Class<?> wildcardClass6 = doublyLinkedListNode0.getClass();
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test234");
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
        doublyLinkedListNode27.remove();
        doublyLinkedListNode27.remove();
        doublyLinkedListNode27.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode31 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode31.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode33 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode34 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode33.insertRight(doublyLinkedListNode34);
        doublyLinkedListNode34.remove();
        doublyLinkedListNode31.insertRight(doublyLinkedListNode34);
        examples.DoublyLinkedListNode doublyLinkedListNode38 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode38.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode40 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode38.insertRight(doublyLinkedListNode40);
        examples.DoublyLinkedListNode doublyLinkedListNode42 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode43 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode42.insertRight(doublyLinkedListNode43);
        doublyLinkedListNode43.remove();
        doublyLinkedListNode40.insertRight(doublyLinkedListNode43);
        doublyLinkedListNode40.remove();
        doublyLinkedListNode31.insertRight(doublyLinkedListNode40);
        examples.DoublyLinkedListNode doublyLinkedListNode49 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode49.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode51 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode52 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode51.insertRight(doublyLinkedListNode52);
        doublyLinkedListNode52.remove();
        doublyLinkedListNode49.insertRight(doublyLinkedListNode52);
        examples.DoublyLinkedListNode doublyLinkedListNode56 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode56.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode58 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode59 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode58.insertRight(doublyLinkedListNode59);
        doublyLinkedListNode59.remove();
        doublyLinkedListNode56.insertRight(doublyLinkedListNode59);
        doublyLinkedListNode59.remove();
        doublyLinkedListNode49.insertRight(doublyLinkedListNode59);
        doublyLinkedListNode49.remove();
        doublyLinkedListNode31.insertRight(doublyLinkedListNode49);
        doublyLinkedListNode31.remove();
        doublyLinkedListNode31.remove();
        doublyLinkedListNode27.insertRight(doublyLinkedListNode31);
        // The following exception was thrown during execution in test generation
        try {
            doublyLinkedListNode13.insertRight(doublyLinkedListNode27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter is not singleton");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test235");
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
        doublyLinkedListNode12.insertRight(doublyLinkedListNode15);
        doublyLinkedListNode12.remove();
        doublyLinkedListNode12.remove();
        doublyLinkedListNode12.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode12);
        java.lang.Class<?> wildcardClass28 = doublyLinkedListNode0.getClass();
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test236");
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
        doublyLinkedListNode18.remove();
        doublyLinkedListNode9.insertRight(doublyLinkedListNode18);
        java.lang.Class<?> wildcardClass23 = doublyLinkedListNode18.getClass();
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test237");
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
        doublyLinkedListNode13.insertRight(doublyLinkedListNode18);
        doublyLinkedListNode13.remove();
        doublyLinkedListNode13.remove();
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test238");
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
        examples.DoublyLinkedListNode doublyLinkedListNode41 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode41.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode43 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode44 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode43.insertRight(doublyLinkedListNode44);
        doublyLinkedListNode44.remove();
        doublyLinkedListNode41.insertRight(doublyLinkedListNode44);
        examples.DoublyLinkedListNode doublyLinkedListNode48 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode49 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode48.insertRight(doublyLinkedListNode49);
        doublyLinkedListNode49.remove();
        doublyLinkedListNode41.insertRight(doublyLinkedListNode49);
        doublyLinkedListNode41.remove();
        doublyLinkedListNode41.remove();
        doublyLinkedListNode41.remove();
        doublyLinkedListNode25.insertRight(doublyLinkedListNode41);
        doublyLinkedListNode41.remove();
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test239");
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
        java.lang.Class<?> wildcardClass18 = doublyLinkedListNode13.getClass();
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test240");
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
        doublyLinkedListNode12.insertRight(doublyLinkedListNode15);
        doublyLinkedListNode12.remove();
        doublyLinkedListNode12.remove();
        doublyLinkedListNode12.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode12);
        examples.DoublyLinkedListNode doublyLinkedListNode28 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode28.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode30 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode28.insertRight(doublyLinkedListNode30);
        doublyLinkedListNode30.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode30);
        java.lang.Class<?> wildcardClass34 = doublyLinkedListNode30.getClass();
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test241");
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
        examples.DoublyLinkedListNode doublyLinkedListNode50 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode50.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode52 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode50.insertRight(doublyLinkedListNode52);
        examples.DoublyLinkedListNode doublyLinkedListNode54 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode55 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode54.insertRight(doublyLinkedListNode55);
        doublyLinkedListNode55.remove();
        doublyLinkedListNode52.insertRight(doublyLinkedListNode55);
        doublyLinkedListNode52.remove();
        doublyLinkedListNode43.insertRight(doublyLinkedListNode52);
        examples.DoublyLinkedListNode doublyLinkedListNode61 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode61.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode63 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode64 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode63.insertRight(doublyLinkedListNode64);
        doublyLinkedListNode64.remove();
        doublyLinkedListNode61.insertRight(doublyLinkedListNode64);
        doublyLinkedListNode61.remove();
        doublyLinkedListNode43.insertRight(doublyLinkedListNode61);
        doublyLinkedListNode61.remove();
        doublyLinkedListNode39.insertRight(doublyLinkedListNode61);
        doublyLinkedListNode39.remove();
        doublyLinkedListNode39.remove();
        doublyLinkedListNode39.remove();
        doublyLinkedListNode3.insertRight(doublyLinkedListNode39);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test242");
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
        java.lang.Class<?> wildcardClass37 = doublyLinkedListNode0.getClass();
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test243");
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
        doublyLinkedListNode3.remove();
        doublyLinkedListNode3.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode39 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode39.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode41 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode42 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode41.insertRight(doublyLinkedListNode42);
        doublyLinkedListNode42.remove();
        doublyLinkedListNode39.insertRight(doublyLinkedListNode42);
        examples.DoublyLinkedListNode doublyLinkedListNode46 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode46.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode48 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode46.insertRight(doublyLinkedListNode48);
        examples.DoublyLinkedListNode doublyLinkedListNode50 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode51 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode50.insertRight(doublyLinkedListNode51);
        doublyLinkedListNode51.remove();
        doublyLinkedListNode48.insertRight(doublyLinkedListNode51);
        doublyLinkedListNode48.remove();
        doublyLinkedListNode39.insertRight(doublyLinkedListNode48);
        doublyLinkedListNode39.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode58 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode59 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode58.insertRight(doublyLinkedListNode59);
        doublyLinkedListNode58.remove();
        doublyLinkedListNode58.remove();
        doublyLinkedListNode39.insertRight(doublyLinkedListNode58);
        examples.DoublyLinkedListNode doublyLinkedListNode64 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode64.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode66 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode67 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode66.insertRight(doublyLinkedListNode67);
        doublyLinkedListNode67.remove();
        doublyLinkedListNode64.insertRight(doublyLinkedListNode67);
        examples.DoublyLinkedListNode doublyLinkedListNode71 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode72 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode71.insertRight(doublyLinkedListNode72);
        doublyLinkedListNode72.remove();
        doublyLinkedListNode64.insertRight(doublyLinkedListNode72);
        doublyLinkedListNode64.remove();
        doublyLinkedListNode64.remove();
        doublyLinkedListNode64.remove();
        doublyLinkedListNode58.insertRight(doublyLinkedListNode64);
        examples.DoublyLinkedListNode doublyLinkedListNode80 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode80.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode82 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode83 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode82.insertRight(doublyLinkedListNode83);
        doublyLinkedListNode83.remove();
        doublyLinkedListNode80.insertRight(doublyLinkedListNode83);
        examples.DoublyLinkedListNode doublyLinkedListNode87 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode88 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode87.insertRight(doublyLinkedListNode88);
        doublyLinkedListNode88.remove();
        doublyLinkedListNode80.insertRight(doublyLinkedListNode88);
        doublyLinkedListNode80.remove();
        doublyLinkedListNode80.remove();
        doublyLinkedListNode80.remove();
        doublyLinkedListNode64.insertRight(doublyLinkedListNode80);
        // The following exception was thrown during execution in test generation
        try {
            doublyLinkedListNode3.insertRight(doublyLinkedListNode80);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter is not singleton");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test244");
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
        doublyLinkedListNode13.insertRight(doublyLinkedListNode27);
        // The following exception was thrown during execution in test generation
        try {
            doublyLinkedListNode0.insertRight(doublyLinkedListNode27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter is not singleton");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test245");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode1 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode1);
        doublyLinkedListNode0.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode4 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode5 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode4.insertRight(doublyLinkedListNode5);
        doublyLinkedListNode5.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode5);
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
        doublyLinkedListNode9.remove();
        doublyLinkedListNode9.remove();
        doublyLinkedListNode5.insertRight(doublyLinkedListNode9);
        examples.DoublyLinkedListNode doublyLinkedListNode25 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode25.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode27 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode25.insertRight(doublyLinkedListNode27);
        doublyLinkedListNode27.remove();
        doublyLinkedListNode9.insertRight(doublyLinkedListNode27);
        examples.DoublyLinkedListNode doublyLinkedListNode31 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode31.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode33 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode34 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode33.insertRight(doublyLinkedListNode34);
        doublyLinkedListNode34.remove();
        doublyLinkedListNode31.insertRight(doublyLinkedListNode34);
        examples.DoublyLinkedListNode doublyLinkedListNode38 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode39 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode38.insertRight(doublyLinkedListNode39);
        doublyLinkedListNode39.remove();
        doublyLinkedListNode31.insertRight(doublyLinkedListNode39);
        doublyLinkedListNode31.remove();
        doublyLinkedListNode31.remove();
        doublyLinkedListNode27.insertRight(doublyLinkedListNode31);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test246");
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
        java.lang.Class<?> wildcardClass24 = doublyLinkedListNode9.getClass();
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test247");
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
        doublyLinkedListNode5.remove();
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test248");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.remove();
        doublyLinkedListNode0.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode3 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode4 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode3.insertRight(doublyLinkedListNode4);
        doublyLinkedListNode3.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode7 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode8 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode7.insertRight(doublyLinkedListNode8);
        doublyLinkedListNode8.remove();
        doublyLinkedListNode3.insertRight(doublyLinkedListNode8);
        examples.DoublyLinkedListNode doublyLinkedListNode12 = new examples.DoublyLinkedListNode();
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
        doublyLinkedListNode12.insertRight(doublyLinkedListNode15);
        doublyLinkedListNode12.remove();
        doublyLinkedListNode12.remove();
        doublyLinkedListNode12.remove();
        doublyLinkedListNode8.insertRight(doublyLinkedListNode12);
        // The following exception was thrown during execution in test generation
        try {
            doublyLinkedListNode0.insertRight(doublyLinkedListNode8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter is not singleton");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test249");
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
        doublyLinkedListNode12.insertRight(doublyLinkedListNode15);
        doublyLinkedListNode12.remove();
        doublyLinkedListNode12.remove();
        doublyLinkedListNode12.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode12);
        examples.DoublyLinkedListNode doublyLinkedListNode28 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode28.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode30 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode28.insertRight(doublyLinkedListNode30);
        doublyLinkedListNode30.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode30);
        doublyLinkedListNode30.remove();
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test250");
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
        doublyLinkedListNode10.remove();
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test251");
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
        doublyLinkedListNode13.insertRight(doublyLinkedListNode18);
        doublyLinkedListNode13.remove();
        java.lang.Class<?> wildcardClass34 = doublyLinkedListNode13.getClass();
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test252");
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
        doublyLinkedListNode6.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode16 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode16.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode18 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode19 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode18.insertRight(doublyLinkedListNode19);
        doublyLinkedListNode19.remove();
        doublyLinkedListNode16.insertRight(doublyLinkedListNode19);
        examples.DoublyLinkedListNode doublyLinkedListNode23 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode23.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode25 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode26 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode25.insertRight(doublyLinkedListNode26);
        doublyLinkedListNode26.remove();
        doublyLinkedListNode23.insertRight(doublyLinkedListNode26);
        doublyLinkedListNode26.remove();
        doublyLinkedListNode16.insertRight(doublyLinkedListNode26);
        examples.DoublyLinkedListNode doublyLinkedListNode32 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode33 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode32.insertRight(doublyLinkedListNode33);
        doublyLinkedListNode32.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode36 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode37 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode36.insertRight(doublyLinkedListNode37);
        doublyLinkedListNode37.remove();
        doublyLinkedListNode37.remove();
        doublyLinkedListNode32.insertRight(doublyLinkedListNode37);
        examples.DoublyLinkedListNode doublyLinkedListNode42 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode42.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode44 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode45 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode44.insertRight(doublyLinkedListNode45);
        doublyLinkedListNode45.remove();
        doublyLinkedListNode42.insertRight(doublyLinkedListNode45);
        examples.DoublyLinkedListNode doublyLinkedListNode49 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode49.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode51 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode49.insertRight(doublyLinkedListNode51);
        examples.DoublyLinkedListNode doublyLinkedListNode53 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode54 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode53.insertRight(doublyLinkedListNode54);
        doublyLinkedListNode54.remove();
        doublyLinkedListNode51.insertRight(doublyLinkedListNode54);
        doublyLinkedListNode51.remove();
        doublyLinkedListNode42.insertRight(doublyLinkedListNode51);
        doublyLinkedListNode42.remove();
        doublyLinkedListNode42.remove();
        doublyLinkedListNode37.insertRight(doublyLinkedListNode42);
        doublyLinkedListNode42.remove();
        doublyLinkedListNode26.insertRight(doublyLinkedListNode42);
        // The following exception was thrown during execution in test generation
        try {
            doublyLinkedListNode6.insertRight(doublyLinkedListNode42);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter is not singleton");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test253");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode1 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode1);
        doublyLinkedListNode0.remove();
        doublyLinkedListNode0.remove();
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
        doublyLinkedListNode23.remove();
        doublyLinkedListNode5.insertRight(doublyLinkedListNode23);
        doublyLinkedListNode5.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode5);
        doublyLinkedListNode5.remove();
        doublyLinkedListNode5.remove();
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test254");
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
        doublyLinkedListNode0.remove();
        java.lang.Class<?> wildcardClass31 = doublyLinkedListNode0.getClass();
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test255");
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
        examples.DoublyLinkedListNode doublyLinkedListNode12 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode13 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode12.insertRight(doublyLinkedListNode13);
        doublyLinkedListNode12.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode16 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode17 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode16.insertRight(doublyLinkedListNode17);
        doublyLinkedListNode17.remove();
        doublyLinkedListNode17.remove();
        doublyLinkedListNode12.insertRight(doublyLinkedListNode17);
        doublyLinkedListNode12.remove();
        doublyLinkedListNode12.remove();
        doublyLinkedListNode12.remove();
        doublyLinkedListNode12.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode26 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode26.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode28 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode29 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode28.insertRight(doublyLinkedListNode29);
        doublyLinkedListNode29.remove();
        doublyLinkedListNode26.insertRight(doublyLinkedListNode29);
        examples.DoublyLinkedListNode doublyLinkedListNode33 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode34 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode33.insertRight(doublyLinkedListNode34);
        doublyLinkedListNode34.remove();
        doublyLinkedListNode26.insertRight(doublyLinkedListNode34);
        doublyLinkedListNode26.remove();
        doublyLinkedListNode26.remove();
        doublyLinkedListNode12.insertRight(doublyLinkedListNode26);
        doublyLinkedListNode26.remove();
        doublyLinkedListNode3.insertRight(doublyLinkedListNode26);
        doublyLinkedListNode3.remove();
        java.lang.Class<?> wildcardClass44 = doublyLinkedListNode3.getClass();
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test256");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode1 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode1);
        doublyLinkedListNode0.remove();
        doublyLinkedListNode0.remove();
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
        doublyLinkedListNode23.remove();
        doublyLinkedListNode5.insertRight(doublyLinkedListNode23);
        doublyLinkedListNode5.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode5);
        java.lang.Class<?> wildcardClass34 = doublyLinkedListNode5.getClass();
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test257");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode2 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode3 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode2.insertRight(doublyLinkedListNode3);
        doublyLinkedListNode3.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode3);
        doublyLinkedListNode3.remove();
        doublyLinkedListNode3.remove();
        java.lang.Class<?> wildcardClass9 = doublyLinkedListNode3.getClass();
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test258");
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
        doublyLinkedListNode14.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode22 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode22.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode24 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode25 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode24.insertRight(doublyLinkedListNode25);
        doublyLinkedListNode25.remove();
        doublyLinkedListNode22.insertRight(doublyLinkedListNode25);
        examples.DoublyLinkedListNode doublyLinkedListNode29 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode29.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode31 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode29.insertRight(doublyLinkedListNode31);
        examples.DoublyLinkedListNode doublyLinkedListNode33 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode34 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode33.insertRight(doublyLinkedListNode34);
        doublyLinkedListNode34.remove();
        doublyLinkedListNode31.insertRight(doublyLinkedListNode34);
        doublyLinkedListNode31.remove();
        doublyLinkedListNode22.insertRight(doublyLinkedListNode31);
        examples.DoublyLinkedListNode doublyLinkedListNode40 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode40.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode42 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode43 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode42.insertRight(doublyLinkedListNode43);
        doublyLinkedListNode43.remove();
        doublyLinkedListNode40.insertRight(doublyLinkedListNode43);
        doublyLinkedListNode40.remove();
        doublyLinkedListNode22.insertRight(doublyLinkedListNode40);
        doublyLinkedListNode22.remove();
        doublyLinkedListNode14.insertRight(doublyLinkedListNode22);
        examples.DoublyLinkedListNode doublyLinkedListNode51 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode52 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode51.insertRight(doublyLinkedListNode52);
        doublyLinkedListNode51.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode55 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode56 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode55.insertRight(doublyLinkedListNode56);
        doublyLinkedListNode56.remove();
        doublyLinkedListNode56.remove();
        doublyLinkedListNode51.insertRight(doublyLinkedListNode56);
        doublyLinkedListNode51.remove();
        doublyLinkedListNode51.remove();
        doublyLinkedListNode51.remove();
        doublyLinkedListNode51.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode65 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode65.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode67 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode68 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode67.insertRight(doublyLinkedListNode68);
        doublyLinkedListNode68.remove();
        doublyLinkedListNode65.insertRight(doublyLinkedListNode68);
        examples.DoublyLinkedListNode doublyLinkedListNode72 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode73 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode72.insertRight(doublyLinkedListNode73);
        doublyLinkedListNode73.remove();
        doublyLinkedListNode65.insertRight(doublyLinkedListNode73);
        doublyLinkedListNode65.remove();
        doublyLinkedListNode65.remove();
        doublyLinkedListNode51.insertRight(doublyLinkedListNode65);
        doublyLinkedListNode65.remove();
        doublyLinkedListNode14.insertRight(doublyLinkedListNode65);
        // The following exception was thrown during execution in test generation
        try {
            doublyLinkedListNode0.insertRight(doublyLinkedListNode14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter is not singleton");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test259");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode1 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode1);
        doublyLinkedListNode0.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode4 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode5 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode4.insertRight(doublyLinkedListNode5);
        doublyLinkedListNode5.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode5);
        java.lang.Class<?> wildcardClass9 = doublyLinkedListNode0.getClass();
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test260");
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
        examples.DoublyLinkedListNode doublyLinkedListNode65 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode66 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode65.insertRight(doublyLinkedListNode66);
        doublyLinkedListNode65.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode69 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode70 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode69.insertRight(doublyLinkedListNode70);
        doublyLinkedListNode70.remove();
        doublyLinkedListNode65.insertRight(doublyLinkedListNode70);
        examples.DoublyLinkedListNode doublyLinkedListNode74 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode75 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode75.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode77 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode75.insertRight(doublyLinkedListNode77);
        examples.DoublyLinkedListNode doublyLinkedListNode79 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode80 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode79.insertRight(doublyLinkedListNode80);
        doublyLinkedListNode80.remove();
        doublyLinkedListNode77.insertRight(doublyLinkedListNode80);
        doublyLinkedListNode77.remove();
        doublyLinkedListNode74.insertRight(doublyLinkedListNode77);
        doublyLinkedListNode74.remove();
        doublyLinkedListNode74.remove();
        doublyLinkedListNode74.remove();
        doublyLinkedListNode70.insertRight(doublyLinkedListNode74);
        examples.DoublyLinkedListNode doublyLinkedListNode90 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode91 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode90.insertRight(doublyLinkedListNode91);
        doublyLinkedListNode91.remove();
        doublyLinkedListNode91.remove();
        doublyLinkedListNode70.insertRight(doublyLinkedListNode91);
        doublyLinkedListNode70.remove();
        doublyLinkedListNode16.insertRight(doublyLinkedListNode70);
        java.lang.Class<?> wildcardClass98 = doublyLinkedListNode70.getClass();
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test261");
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
        doublyLinkedListNode0.remove();
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test262");
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
        examples.DoublyLinkedListNode doublyLinkedListNode16 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode17 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode16.insertRight(doublyLinkedListNode17);
        doublyLinkedListNode17.remove();
        doublyLinkedListNode14.insertRight(doublyLinkedListNode17);
        doublyLinkedListNode14.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode14);
        doublyLinkedListNode0.remove();
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test263");
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
        examples.DoublyLinkedListNode doublyLinkedListNode18 = new examples.DoublyLinkedListNode();
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
        doublyLinkedListNode18.insertRight(doublyLinkedListNode21);
        doublyLinkedListNode18.remove();
        doublyLinkedListNode18.remove();
        doublyLinkedListNode18.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode33 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode33.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode35 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode36 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode35.insertRight(doublyLinkedListNode36);
        doublyLinkedListNode36.remove();
        doublyLinkedListNode33.insertRight(doublyLinkedListNode36);
        examples.DoublyLinkedListNode doublyLinkedListNode40 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode40.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode42 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode40.insertRight(doublyLinkedListNode42);
        examples.DoublyLinkedListNode doublyLinkedListNode44 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode45 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode44.insertRight(doublyLinkedListNode45);
        doublyLinkedListNode45.remove();
        doublyLinkedListNode42.insertRight(doublyLinkedListNode45);
        doublyLinkedListNode42.remove();
        doublyLinkedListNode33.insertRight(doublyLinkedListNode42);
        examples.DoublyLinkedListNode doublyLinkedListNode51 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode51.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode53 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode54 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode53.insertRight(doublyLinkedListNode54);
        doublyLinkedListNode54.remove();
        doublyLinkedListNode51.insertRight(doublyLinkedListNode54);
        examples.DoublyLinkedListNode doublyLinkedListNode58 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode58.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode60 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode61 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode60.insertRight(doublyLinkedListNode61);
        doublyLinkedListNode61.remove();
        doublyLinkedListNode58.insertRight(doublyLinkedListNode61);
        doublyLinkedListNode61.remove();
        doublyLinkedListNode51.insertRight(doublyLinkedListNode61);
        doublyLinkedListNode51.remove();
        doublyLinkedListNode33.insertRight(doublyLinkedListNode51);
        doublyLinkedListNode51.remove();
        doublyLinkedListNode51.remove();
        doublyLinkedListNode51.remove();
        doublyLinkedListNode18.insertRight(doublyLinkedListNode51);
        // The following exception was thrown during execution in test generation
        try {
            doublyLinkedListNode11.insertRight(doublyLinkedListNode18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter is not singleton");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test264");
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
        doublyLinkedListNode13.remove();
        java.lang.Class<?> wildcardClass36 = doublyLinkedListNode13.getClass();
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test265");
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
        doublyLinkedListNode8.remove();
        doublyLinkedListNode8.remove();
        doublyLinkedListNode8.remove();
        doublyLinkedListNode2.insertRight(doublyLinkedListNode8);
        doublyLinkedListNode2.remove();
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test266");
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
        examples.DoublyLinkedListNode doublyLinkedListNode36 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode36.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode38 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode36.insertRight(doublyLinkedListNode38);
        examples.DoublyLinkedListNode doublyLinkedListNode40 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode41 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode40.insertRight(doublyLinkedListNode41);
        doublyLinkedListNode41.remove();
        doublyLinkedListNode38.insertRight(doublyLinkedListNode41);
        examples.DoublyLinkedListNode doublyLinkedListNode45 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode45.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode47 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode48 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode47.insertRight(doublyLinkedListNode48);
        doublyLinkedListNode48.remove();
        doublyLinkedListNode45.insertRight(doublyLinkedListNode48);
        examples.DoublyLinkedListNode doublyLinkedListNode52 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode53 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode52.insertRight(doublyLinkedListNode53);
        doublyLinkedListNode53.remove();
        doublyLinkedListNode45.insertRight(doublyLinkedListNode53);
        doublyLinkedListNode45.remove();
        doublyLinkedListNode45.remove();
        doublyLinkedListNode38.insertRight(doublyLinkedListNode45);
        examples.DoublyLinkedListNode doublyLinkedListNode60 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode60.remove();
        doublyLinkedListNode60.remove();
        doublyLinkedListNode38.insertRight(doublyLinkedListNode60);
        // The following exception was thrown during execution in test generation
        try {
            doublyLinkedListNode3.insertRight(doublyLinkedListNode38);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter is not singleton");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test267");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.remove();
        doublyLinkedListNode0.remove();
        doublyLinkedListNode0.remove();
        doublyLinkedListNode0.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode5 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode6 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode5.insertRight(doublyLinkedListNode6);
        doublyLinkedListNode5.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode9 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode10 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode9.insertRight(doublyLinkedListNode10);
        doublyLinkedListNode10.remove();
        doublyLinkedListNode10.remove();
        doublyLinkedListNode5.insertRight(doublyLinkedListNode10);
        examples.DoublyLinkedListNode doublyLinkedListNode15 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode15.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode17 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode18 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode17.insertRight(doublyLinkedListNode18);
        doublyLinkedListNode18.remove();
        doublyLinkedListNode15.insertRight(doublyLinkedListNode18);
        examples.DoublyLinkedListNode doublyLinkedListNode22 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode22.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode24 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode22.insertRight(doublyLinkedListNode24);
        examples.DoublyLinkedListNode doublyLinkedListNode26 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode27 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode26.insertRight(doublyLinkedListNode27);
        doublyLinkedListNode27.remove();
        doublyLinkedListNode24.insertRight(doublyLinkedListNode27);
        doublyLinkedListNode24.remove();
        doublyLinkedListNode15.insertRight(doublyLinkedListNode24);
        doublyLinkedListNode15.remove();
        doublyLinkedListNode15.remove();
        doublyLinkedListNode10.insertRight(doublyLinkedListNode15);
        // The following exception was thrown during execution in test generation
        try {
            doublyLinkedListNode0.insertRight(doublyLinkedListNode15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter is not singleton");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test268");
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
        doublyLinkedListNode2.remove();
        java.lang.Class<?> wildcardClass25 = doublyLinkedListNode2.getClass();
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test269");
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
        doublyLinkedListNode21.remove();
        doublyLinkedListNode21.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode33 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode33.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode35 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode36 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode35.insertRight(doublyLinkedListNode36);
        doublyLinkedListNode36.remove();
        doublyLinkedListNode33.insertRight(doublyLinkedListNode36);
        examples.DoublyLinkedListNode doublyLinkedListNode40 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode40.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode42 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode43 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode42.insertRight(doublyLinkedListNode43);
        doublyLinkedListNode43.remove();
        doublyLinkedListNode40.insertRight(doublyLinkedListNode43);
        doublyLinkedListNode43.remove();
        doublyLinkedListNode33.insertRight(doublyLinkedListNode43);
        doublyLinkedListNode33.remove();
        doublyLinkedListNode21.insertRight(doublyLinkedListNode33);
        examples.DoublyLinkedListNode doublyLinkedListNode51 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode51.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode53 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode54 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode53.insertRight(doublyLinkedListNode54);
        doublyLinkedListNode54.remove();
        doublyLinkedListNode51.insertRight(doublyLinkedListNode54);
        examples.DoublyLinkedListNode doublyLinkedListNode58 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode58.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode60 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode58.insertRight(doublyLinkedListNode60);
        examples.DoublyLinkedListNode doublyLinkedListNode62 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode63 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode62.insertRight(doublyLinkedListNode63);
        doublyLinkedListNode63.remove();
        doublyLinkedListNode60.insertRight(doublyLinkedListNode63);
        doublyLinkedListNode60.remove();
        doublyLinkedListNode51.insertRight(doublyLinkedListNode60);
        doublyLinkedListNode51.remove();
        doublyLinkedListNode33.insertRight(doublyLinkedListNode51);
        // The following exception was thrown during execution in test generation
        try {
            doublyLinkedListNode12.insertRight(doublyLinkedListNode51);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter is not singleton");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test270");
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
        examples.DoublyLinkedListNode doublyLinkedListNode42 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode42.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode44 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode45 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode44.insertRight(doublyLinkedListNode45);
        doublyLinkedListNode45.remove();
        doublyLinkedListNode42.insertRight(doublyLinkedListNode45);
        examples.DoublyLinkedListNode doublyLinkedListNode49 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode49.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode51 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode52 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode51.insertRight(doublyLinkedListNode52);
        doublyLinkedListNode52.remove();
        doublyLinkedListNode49.insertRight(doublyLinkedListNode52);
        doublyLinkedListNode52.remove();
        doublyLinkedListNode42.insertRight(doublyLinkedListNode52);
        doublyLinkedListNode42.remove();
        doublyLinkedListNode24.insertRight(doublyLinkedListNode42);
        doublyLinkedListNode42.remove();
        doublyLinkedListNode42.remove();
        doublyLinkedListNode42.remove();
        doublyLinkedListNode9.insertRight(doublyLinkedListNode42);
        examples.DoublyLinkedListNode doublyLinkedListNode64 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode65 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode64.insertRight(doublyLinkedListNode65);
        doublyLinkedListNode64.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode68 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode69 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode68.insertRight(doublyLinkedListNode69);
        doublyLinkedListNode69.remove();
        doublyLinkedListNode69.remove();
        doublyLinkedListNode64.insertRight(doublyLinkedListNode69);
        doublyLinkedListNode64.remove();
        doublyLinkedListNode64.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode76 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode77 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode77.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode79 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode77.insertRight(doublyLinkedListNode79);
        examples.DoublyLinkedListNode doublyLinkedListNode81 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode82 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode81.insertRight(doublyLinkedListNode82);
        doublyLinkedListNode82.remove();
        doublyLinkedListNode79.insertRight(doublyLinkedListNode82);
        doublyLinkedListNode79.remove();
        doublyLinkedListNode76.insertRight(doublyLinkedListNode79);
        doublyLinkedListNode76.remove();
        doublyLinkedListNode76.remove();
        doublyLinkedListNode76.remove();
        doublyLinkedListNode64.insertRight(doublyLinkedListNode76);
        examples.DoublyLinkedListNode doublyLinkedListNode92 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode92.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode94 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode92.insertRight(doublyLinkedListNode94);
        doublyLinkedListNode94.remove();
        doublyLinkedListNode64.insertRight(doublyLinkedListNode94);
        // The following exception was thrown during execution in test generation
        try {
            doublyLinkedListNode9.insertRight(doublyLinkedListNode94);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter is not singleton");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test271");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode2 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode2);
        examples.DoublyLinkedListNode doublyLinkedListNode4 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode5 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode4.insertRight(doublyLinkedListNode5);
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
        doublyLinkedListNode4.insertRight(doublyLinkedListNode9);
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
        doublyLinkedListNode9.insertRight(doublyLinkedListNode20);
        doublyLinkedListNode20.remove();
        doublyLinkedListNode20.remove();
        doublyLinkedListNode20.remove();
        doublyLinkedListNode2.insertRight(doublyLinkedListNode20);
        doublyLinkedListNode20.remove();
        doublyLinkedListNode20.remove();
        doublyLinkedListNode20.remove();
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test272");
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
        doublyLinkedListNode46.remove();
        doublyLinkedListNode28.insertRight(doublyLinkedListNode46);
        doublyLinkedListNode28.remove();
        doublyLinkedListNode25.insertRight(doublyLinkedListNode28);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test273");
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
        examples.DoublyLinkedListNode doublyLinkedListNode38 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode39 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode38.insertRight(doublyLinkedListNode39);
        doublyLinkedListNode38.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode42 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode43 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode42.insertRight(doublyLinkedListNode43);
        doublyLinkedListNode43.remove();
        doublyLinkedListNode43.remove();
        doublyLinkedListNode38.insertRight(doublyLinkedListNode43);
        doublyLinkedListNode38.remove();
        doublyLinkedListNode38.remove();
        doublyLinkedListNode38.remove();
        doublyLinkedListNode25.insertRight(doublyLinkedListNode38);
        doublyLinkedListNode25.remove();
        doublyLinkedListNode5.insertRight(doublyLinkedListNode25);
        examples.DoublyLinkedListNode doublyLinkedListNode54 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode54.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode56 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode57 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode56.insertRight(doublyLinkedListNode57);
        doublyLinkedListNode57.remove();
        doublyLinkedListNode54.insertRight(doublyLinkedListNode57);
        doublyLinkedListNode54.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode62 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode62.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode64 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode65 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode64.insertRight(doublyLinkedListNode65);
        doublyLinkedListNode65.remove();
        doublyLinkedListNode62.insertRight(doublyLinkedListNode65);
        doublyLinkedListNode65.remove();
        doublyLinkedListNode54.insertRight(doublyLinkedListNode65);
        // The following exception was thrown during execution in test generation
        try {
            doublyLinkedListNode25.insertRight(doublyLinkedListNode54);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter is not singleton");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test274");
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
        doublyLinkedListNode5.remove();
        doublyLinkedListNode1.insertRight(doublyLinkedListNode5);
        examples.DoublyLinkedListNode doublyLinkedListNode15 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode16 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode15.insertRight(doublyLinkedListNode16);
        doublyLinkedListNode15.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode19 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode20 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode19.insertRight(doublyLinkedListNode20);
        doublyLinkedListNode20.remove();
        doublyLinkedListNode15.insertRight(doublyLinkedListNode20);
        // The following exception was thrown during execution in test generation
        try {
            doublyLinkedListNode5.insertRight(doublyLinkedListNode15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter is not singleton");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test275");
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
        doublyLinkedListNode5.remove();
        doublyLinkedListNode1.insertRight(doublyLinkedListNode5);
        java.lang.Class<?> wildcardClass15 = doublyLinkedListNode1.getClass();
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test276");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.remove();
        doublyLinkedListNode0.remove();
        doublyLinkedListNode0.remove();
        doublyLinkedListNode0.remove();
        java.lang.Class<?> wildcardClass5 = doublyLinkedListNode0.getClass();
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test277");
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
        doublyLinkedListNode2.remove();
        doublyLinkedListNode2.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode12 = new examples.DoublyLinkedListNode();
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
        doublyLinkedListNode12.insertRight(doublyLinkedListNode15);
        doublyLinkedListNode12.remove();
        doublyLinkedListNode12.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode26 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode12.insertRight(doublyLinkedListNode26);
        examples.DoublyLinkedListNode doublyLinkedListNode28 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode28.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode30 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode28.insertRight(doublyLinkedListNode30);
        doublyLinkedListNode30.remove();
        doublyLinkedListNode12.insertRight(doublyLinkedListNode30);
        // The following exception was thrown during execution in test generation
        try {
            doublyLinkedListNode2.insertRight(doublyLinkedListNode30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter is not singleton");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test278");
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
        examples.DoublyLinkedListNode doublyLinkedListNode37 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode38 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode37.insertRight(doublyLinkedListNode38);
        doublyLinkedListNode37.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode41 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode42 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode41.insertRight(doublyLinkedListNode42);
        doublyLinkedListNode42.remove();
        doublyLinkedListNode42.remove();
        doublyLinkedListNode37.insertRight(doublyLinkedListNode42);
        doublyLinkedListNode37.remove();
        doublyLinkedListNode37.remove();
        doublyLinkedListNode37.remove();
        doublyLinkedListNode37.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode51 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode51.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode53 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode54 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode53.insertRight(doublyLinkedListNode54);
        doublyLinkedListNode54.remove();
        doublyLinkedListNode51.insertRight(doublyLinkedListNode54);
        examples.DoublyLinkedListNode doublyLinkedListNode58 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode59 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode58.insertRight(doublyLinkedListNode59);
        doublyLinkedListNode59.remove();
        doublyLinkedListNode51.insertRight(doublyLinkedListNode59);
        doublyLinkedListNode51.remove();
        doublyLinkedListNode51.remove();
        doublyLinkedListNode37.insertRight(doublyLinkedListNode51);
        doublyLinkedListNode51.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode51);
        examples.DoublyLinkedListNode doublyLinkedListNode68 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode69 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode68.insertRight(doublyLinkedListNode69);
        doublyLinkedListNode68.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode72 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode73 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode72.insertRight(doublyLinkedListNode73);
        doublyLinkedListNode73.remove();
        doublyLinkedListNode73.remove();
        doublyLinkedListNode68.insertRight(doublyLinkedListNode73);
        examples.DoublyLinkedListNode doublyLinkedListNode78 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode78.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode80 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode81 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode80.insertRight(doublyLinkedListNode81);
        doublyLinkedListNode81.remove();
        doublyLinkedListNode78.insertRight(doublyLinkedListNode81);
        examples.DoublyLinkedListNode doublyLinkedListNode85 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode85.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode87 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode85.insertRight(doublyLinkedListNode87);
        examples.DoublyLinkedListNode doublyLinkedListNode89 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode90 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode89.insertRight(doublyLinkedListNode90);
        doublyLinkedListNode90.remove();
        doublyLinkedListNode87.insertRight(doublyLinkedListNode90);
        doublyLinkedListNode87.remove();
        doublyLinkedListNode78.insertRight(doublyLinkedListNode87);
        doublyLinkedListNode78.remove();
        doublyLinkedListNode78.remove();
        doublyLinkedListNode73.insertRight(doublyLinkedListNode78);
        // The following exception was thrown during execution in test generation
        try {
            doublyLinkedListNode51.insertRight(doublyLinkedListNode73);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter is not singleton");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test279");
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
        examples.DoublyLinkedListNode doublyLinkedListNode38 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode39 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode38.insertRight(doublyLinkedListNode39);
        doublyLinkedListNode38.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode42 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode43 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode42.insertRight(doublyLinkedListNode43);
        doublyLinkedListNode43.remove();
        doublyLinkedListNode43.remove();
        doublyLinkedListNode38.insertRight(doublyLinkedListNode43);
        doublyLinkedListNode38.remove();
        doublyLinkedListNode38.remove();
        doublyLinkedListNode38.remove();
        doublyLinkedListNode25.insertRight(doublyLinkedListNode38);
        doublyLinkedListNode25.remove();
        doublyLinkedListNode5.insertRight(doublyLinkedListNode25);
        java.lang.Class<?> wildcardClass54 = doublyLinkedListNode25.getClass();
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test280");
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
        doublyLinkedListNode13.insertRight(doublyLinkedListNode18);
        doublyLinkedListNode18.remove();
        doublyLinkedListNode18.remove();
        doublyLinkedListNode18.remove();
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test281");
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
        doublyLinkedListNode0.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode19 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode19.remove();
        doublyLinkedListNode19.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode19);
        java.lang.Class<?> wildcardClass23 = doublyLinkedListNode19.getClass();
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test282");
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
        doublyLinkedListNode18.remove();
        doublyLinkedListNode9.insertRight(doublyLinkedListNode18);
        doublyLinkedListNode9.remove();
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test283");
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
        doublyLinkedListNode12.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode14 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode12.insertRight(doublyLinkedListNode14);
        examples.DoublyLinkedListNode doublyLinkedListNode16 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode17 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode16.insertRight(doublyLinkedListNode17);
        doublyLinkedListNode17.remove();
        doublyLinkedListNode14.insertRight(doublyLinkedListNode17);
        doublyLinkedListNode14.remove();
        doublyLinkedListNode11.insertRight(doublyLinkedListNode14);
        doublyLinkedListNode11.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode24 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode24.remove();
        doublyLinkedListNode24.remove();
        doublyLinkedListNode24.remove();
        doublyLinkedListNode11.insertRight(doublyLinkedListNode24);
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
        doublyLinkedListNode24.insertRight(doublyLinkedListNode29);
        // The following exception was thrown during execution in test generation
        try {
            doublyLinkedListNode0.insertRight(doublyLinkedListNode29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter is not singleton");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test284");
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
        doublyLinkedListNode0.insertRight(doublyLinkedListNode14);
        examples.DoublyLinkedListNode doublyLinkedListNode16 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode16.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode18 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode16.insertRight(doublyLinkedListNode18);
        doublyLinkedListNode18.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode18);
        doublyLinkedListNode0.remove();
        java.lang.Class<?> wildcardClass23 = doublyLinkedListNode0.getClass();
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test285");
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
        doublyLinkedListNode0.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode31 = null;
        // The following exception was thrown during execution in test generation
        try {
            doublyLinkedListNode0.insertRight(doublyLinkedListNode31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: undefined for null parameter");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test286");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.remove();
        doublyLinkedListNode0.remove();
        doublyLinkedListNode0.remove();
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
        doublyLinkedListNode11.insertRight(doublyLinkedListNode13);
        examples.DoublyLinkedListNode doublyLinkedListNode15 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode16 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode15.insertRight(doublyLinkedListNode16);
        doublyLinkedListNode16.remove();
        doublyLinkedListNode13.insertRight(doublyLinkedListNode16);
        doublyLinkedListNode13.remove();
        doublyLinkedListNode4.insertRight(doublyLinkedListNode13);
        examples.DoublyLinkedListNode doublyLinkedListNode22 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode22.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode24 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode25 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode24.insertRight(doublyLinkedListNode25);
        doublyLinkedListNode25.remove();
        doublyLinkedListNode22.insertRight(doublyLinkedListNode25);
        examples.DoublyLinkedListNode doublyLinkedListNode29 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode29.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode31 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode32 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode31.insertRight(doublyLinkedListNode32);
        doublyLinkedListNode32.remove();
        doublyLinkedListNode29.insertRight(doublyLinkedListNode32);
        doublyLinkedListNode32.remove();
        doublyLinkedListNode22.insertRight(doublyLinkedListNode32);
        doublyLinkedListNode22.remove();
        doublyLinkedListNode4.insertRight(doublyLinkedListNode22);
        doublyLinkedListNode4.remove();
        doublyLinkedListNode4.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode4);
        examples.DoublyLinkedListNode doublyLinkedListNode43 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode44 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode43.insertRight(doublyLinkedListNode44);
        examples.DoublyLinkedListNode doublyLinkedListNode46 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode46.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode48 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode46.insertRight(doublyLinkedListNode48);
        examples.DoublyLinkedListNode doublyLinkedListNode50 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode51 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode50.insertRight(doublyLinkedListNode51);
        doublyLinkedListNode51.remove();
        doublyLinkedListNode48.insertRight(doublyLinkedListNode51);
        doublyLinkedListNode48.remove();
        doublyLinkedListNode43.insertRight(doublyLinkedListNode48);
        doublyLinkedListNode43.remove();
        doublyLinkedListNode4.insertRight(doublyLinkedListNode43);
        examples.DoublyLinkedListNode doublyLinkedListNode59 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode59.remove();
        doublyLinkedListNode59.remove();
        doublyLinkedListNode4.insertRight(doublyLinkedListNode59);
        java.lang.Class<?> wildcardClass63 = doublyLinkedListNode59.getClass();
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test287");
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
        doublyLinkedListNode14.remove();
        doublyLinkedListNode14.remove();
        java.lang.Class<?> wildcardClass31 = doublyLinkedListNode14.getClass();
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test288");
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
        java.lang.Class<?> wildcardClass52 = doublyLinkedListNode17.getClass();
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test289");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode1 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode1);
        doublyLinkedListNode0.remove();
        doublyLinkedListNode0.remove();
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
        doublyLinkedListNode23.remove();
        doublyLinkedListNode5.insertRight(doublyLinkedListNode23);
        doublyLinkedListNode5.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode5);
        doublyLinkedListNode0.remove();
        doublyLinkedListNode0.remove();
        doublyLinkedListNode0.remove();
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test290");
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
        doublyLinkedListNode13.insertRight(doublyLinkedListNode18);
        doublyLinkedListNode18.remove();
        doublyLinkedListNode18.remove();
        java.lang.Class<?> wildcardClass35 = doublyLinkedListNode18.getClass();
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test291");
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
        doublyLinkedListNode0.remove();
        java.lang.Class<?> wildcardClass15 = doublyLinkedListNode0.getClass();
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test292");
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
        doublyLinkedListNode12.insertRight(doublyLinkedListNode15);
        doublyLinkedListNode12.remove();
        doublyLinkedListNode12.remove();
        doublyLinkedListNode12.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode12);
        examples.DoublyLinkedListNode doublyLinkedListNode28 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode29 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode28.insertRight(doublyLinkedListNode29);
        doublyLinkedListNode28.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode32 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode33 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode32.insertRight(doublyLinkedListNode33);
        doublyLinkedListNode33.remove();
        doublyLinkedListNode33.remove();
        doublyLinkedListNode28.insertRight(doublyLinkedListNode33);
        doublyLinkedListNode28.remove();
        doublyLinkedListNode28.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode40 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode40.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode42 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode43 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode42.insertRight(doublyLinkedListNode43);
        doublyLinkedListNode43.remove();
        doublyLinkedListNode40.insertRight(doublyLinkedListNode43);
        examples.DoublyLinkedListNode doublyLinkedListNode47 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode47.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode49 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode50 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode49.insertRight(doublyLinkedListNode50);
        doublyLinkedListNode50.remove();
        doublyLinkedListNode47.insertRight(doublyLinkedListNode50);
        doublyLinkedListNode50.remove();
        doublyLinkedListNode40.insertRight(doublyLinkedListNode50);
        doublyLinkedListNode40.remove();
        doublyLinkedListNode28.insertRight(doublyLinkedListNode40);
        examples.DoublyLinkedListNode doublyLinkedListNode58 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode58.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode60 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode61 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode60.insertRight(doublyLinkedListNode61);
        doublyLinkedListNode61.remove();
        doublyLinkedListNode58.insertRight(doublyLinkedListNode61);
        doublyLinkedListNode58.remove();
        doublyLinkedListNode28.insertRight(doublyLinkedListNode58);
        doublyLinkedListNode58.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode58);
        doublyLinkedListNode0.remove();
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test293");
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
        doublyLinkedListNode14.remove();
        doublyLinkedListNode14.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode31 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode31.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode33 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode31.insertRight(doublyLinkedListNode33);
        doublyLinkedListNode31.remove();
        doublyLinkedListNode14.insertRight(doublyLinkedListNode31);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test294");
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
        doublyLinkedListNode12.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode22 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode22.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode24 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode22.insertRight(doublyLinkedListNode24);
        examples.DoublyLinkedListNode doublyLinkedListNode26 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode27 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode26.insertRight(doublyLinkedListNode27);
        examples.DoublyLinkedListNode doublyLinkedListNode29 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode29.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode31 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode29.insertRight(doublyLinkedListNode31);
        examples.DoublyLinkedListNode doublyLinkedListNode33 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode34 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode33.insertRight(doublyLinkedListNode34);
        doublyLinkedListNode34.remove();
        doublyLinkedListNode31.insertRight(doublyLinkedListNode34);
        doublyLinkedListNode31.remove();
        doublyLinkedListNode26.insertRight(doublyLinkedListNode31);
        examples.DoublyLinkedListNode doublyLinkedListNode40 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode40.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode42 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode40.insertRight(doublyLinkedListNode42);
        examples.DoublyLinkedListNode doublyLinkedListNode44 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode45 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode44.insertRight(doublyLinkedListNode45);
        doublyLinkedListNode45.remove();
        doublyLinkedListNode42.insertRight(doublyLinkedListNode45);
        doublyLinkedListNode42.remove();
        doublyLinkedListNode31.insertRight(doublyLinkedListNode42);
        doublyLinkedListNode42.remove();
        doublyLinkedListNode42.remove();
        doublyLinkedListNode42.remove();
        doublyLinkedListNode24.insertRight(doublyLinkedListNode42);
        doublyLinkedListNode24.remove();
        doublyLinkedListNode12.insertRight(doublyLinkedListNode24);
        java.lang.Class<?> wildcardClass57 = doublyLinkedListNode24.getClass();
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test295");
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
        doublyLinkedListNode19.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode21 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode22 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode21.insertRight(doublyLinkedListNode22);
        doublyLinkedListNode22.remove();
        doublyLinkedListNode19.insertRight(doublyLinkedListNode22);
        doublyLinkedListNode19.remove();
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
        doublyLinkedListNode34.insertRight(doublyLinkedListNode36);
        examples.DoublyLinkedListNode doublyLinkedListNode38 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode39 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode38.insertRight(doublyLinkedListNode39);
        doublyLinkedListNode39.remove();
        doublyLinkedListNode36.insertRight(doublyLinkedListNode39);
        doublyLinkedListNode36.remove();
        doublyLinkedListNode27.insertRight(doublyLinkedListNode36);
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
        examples.DoublyLinkedListNode doublyLinkedListNode55 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode54.insertRight(doublyLinkedListNode55);
        doublyLinkedListNode55.remove();
        doublyLinkedListNode52.insertRight(doublyLinkedListNode55);
        doublyLinkedListNode55.remove();
        doublyLinkedListNode45.insertRight(doublyLinkedListNode55);
        doublyLinkedListNode45.remove();
        doublyLinkedListNode27.insertRight(doublyLinkedListNode45);
        doublyLinkedListNode45.remove();
        doublyLinkedListNode19.insertRight(doublyLinkedListNode45);
        // The following exception was thrown during execution in test generation
        try {
            doublyLinkedListNode0.insertRight(doublyLinkedListNode19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter is not singleton");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test296");
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
        doublyLinkedListNode2.remove();
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
        doublyLinkedListNode11.remove();
        doublyLinkedListNode2.insertRight(doublyLinkedListNode11);
        examples.DoublyLinkedListNode doublyLinkedListNode31 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode32 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode31.insertRight(doublyLinkedListNode32);
        doublyLinkedListNode31.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode35 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode36 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode35.insertRight(doublyLinkedListNode36);
        doublyLinkedListNode36.remove();
        doublyLinkedListNode36.remove();
        doublyLinkedListNode31.insertRight(doublyLinkedListNode36);
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
        doublyLinkedListNode41.remove();
        doublyLinkedListNode41.remove();
        doublyLinkedListNode36.insertRight(doublyLinkedListNode41);
        doublyLinkedListNode41.remove();
        doublyLinkedListNode41.remove();
        doublyLinkedListNode11.insertRight(doublyLinkedListNode41);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test297");
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
        examples.DoublyLinkedListNode doublyLinkedListNode29 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode29.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode31 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode32 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode31.insertRight(doublyLinkedListNode32);
        doublyLinkedListNode32.remove();
        doublyLinkedListNode29.insertRight(doublyLinkedListNode32);
        examples.DoublyLinkedListNode doublyLinkedListNode36 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode36.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode38 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode36.insertRight(doublyLinkedListNode38);
        examples.DoublyLinkedListNode doublyLinkedListNode40 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode41 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode40.insertRight(doublyLinkedListNode41);
        doublyLinkedListNode41.remove();
        doublyLinkedListNode38.insertRight(doublyLinkedListNode41);
        doublyLinkedListNode38.remove();
        doublyLinkedListNode29.insertRight(doublyLinkedListNode38);
        examples.DoublyLinkedListNode doublyLinkedListNode47 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode47.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode49 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode50 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode49.insertRight(doublyLinkedListNode50);
        doublyLinkedListNode50.remove();
        doublyLinkedListNode47.insertRight(doublyLinkedListNode50);
        doublyLinkedListNode47.remove();
        doublyLinkedListNode29.insertRight(doublyLinkedListNode47);
        doublyLinkedListNode47.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode47);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test298");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode1 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode1);
        doublyLinkedListNode0.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode4 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode5 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode4.insertRight(doublyLinkedListNode5);
        doublyLinkedListNode5.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode5);
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
        doublyLinkedListNode9.remove();
        doublyLinkedListNode9.remove();
        doublyLinkedListNode5.insertRight(doublyLinkedListNode9);
        examples.DoublyLinkedListNode doublyLinkedListNode25 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode25.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode27 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode25.insertRight(doublyLinkedListNode27);
        doublyLinkedListNode27.remove();
        doublyLinkedListNode9.insertRight(doublyLinkedListNode27);
        doublyLinkedListNode9.remove();
        doublyLinkedListNode9.remove();
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test299");
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
        examples.DoublyLinkedListNode doublyLinkedListNode29 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode30 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode29.insertRight(doublyLinkedListNode30);
        doublyLinkedListNode29.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode33 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode34 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode33.insertRight(doublyLinkedListNode34);
        doublyLinkedListNode34.remove();
        doublyLinkedListNode34.remove();
        doublyLinkedListNode29.insertRight(doublyLinkedListNode34);
        doublyLinkedListNode29.remove();
        doublyLinkedListNode29.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode41 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode42 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode42.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode44 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode42.insertRight(doublyLinkedListNode44);
        examples.DoublyLinkedListNode doublyLinkedListNode46 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode47 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode46.insertRight(doublyLinkedListNode47);
        doublyLinkedListNode47.remove();
        doublyLinkedListNode44.insertRight(doublyLinkedListNode47);
        doublyLinkedListNode44.remove();
        doublyLinkedListNode41.insertRight(doublyLinkedListNode44);
        doublyLinkedListNode41.remove();
        doublyLinkedListNode41.remove();
        doublyLinkedListNode41.remove();
        doublyLinkedListNode29.insertRight(doublyLinkedListNode41);
        examples.DoublyLinkedListNode doublyLinkedListNode57 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode58 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode57.insertRight(doublyLinkedListNode58);
        doublyLinkedListNode57.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode61 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode62 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode61.insertRight(doublyLinkedListNode62);
        doublyLinkedListNode62.remove();
        doublyLinkedListNode62.remove();
        doublyLinkedListNode57.insertRight(doublyLinkedListNode62);
        doublyLinkedListNode57.remove();
        doublyLinkedListNode57.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode69 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode69.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode71 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode72 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode71.insertRight(doublyLinkedListNode72);
        doublyLinkedListNode72.remove();
        doublyLinkedListNode69.insertRight(doublyLinkedListNode72);
        examples.DoublyLinkedListNode doublyLinkedListNode76 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode76.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode78 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode79 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode78.insertRight(doublyLinkedListNode79);
        doublyLinkedListNode79.remove();
        doublyLinkedListNode76.insertRight(doublyLinkedListNode79);
        doublyLinkedListNode79.remove();
        doublyLinkedListNode69.insertRight(doublyLinkedListNode79);
        doublyLinkedListNode69.remove();
        doublyLinkedListNode57.insertRight(doublyLinkedListNode69);
        examples.DoublyLinkedListNode doublyLinkedListNode87 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode87.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode89 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode90 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode89.insertRight(doublyLinkedListNode90);
        doublyLinkedListNode90.remove();
        doublyLinkedListNode87.insertRight(doublyLinkedListNode90);
        doublyLinkedListNode87.remove();
        doublyLinkedListNode57.insertRight(doublyLinkedListNode87);
        doublyLinkedListNode87.remove();
        doublyLinkedListNode29.insertRight(doublyLinkedListNode87);
        // The following exception was thrown during execution in test generation
        try {
            doublyLinkedListNode0.insertRight(doublyLinkedListNode87);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter is not singleton");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test300");
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
        doublyLinkedListNode18.insertRight(doublyLinkedListNode20);
        examples.DoublyLinkedListNode doublyLinkedListNode22 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode23 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode22.insertRight(doublyLinkedListNode23);
        doublyLinkedListNode23.remove();
        doublyLinkedListNode20.insertRight(doublyLinkedListNode23);
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
        doublyLinkedListNode20.insertRight(doublyLinkedListNode27);
        doublyLinkedListNode27.remove();
        doublyLinkedListNode13.insertRight(doublyLinkedListNode27);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test301");
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
        doublyLinkedListNode16.insertRight(doublyLinkedListNode21);
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
        doublyLinkedListNode21.insertRight(doublyLinkedListNode32);
        doublyLinkedListNode32.remove();
        doublyLinkedListNode32.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode43 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode43.remove();
        doublyLinkedListNode43.remove();
        doublyLinkedListNode43.remove();
        doublyLinkedListNode43.remove();
        doublyLinkedListNode43.remove();
        doublyLinkedListNode32.insertRight(doublyLinkedListNode43);
        // The following exception was thrown during execution in test generation
        try {
            doublyLinkedListNode10.insertRight(doublyLinkedListNode43);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter is not singleton");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test302");
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
        doublyLinkedListNode30.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode40 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode41 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode40.insertRight(doublyLinkedListNode41);
        doublyLinkedListNode40.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode44 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode45 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode44.insertRight(doublyLinkedListNode45);
        doublyLinkedListNode45.remove();
        doublyLinkedListNode40.insertRight(doublyLinkedListNode45);
        examples.DoublyLinkedListNode doublyLinkedListNode49 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode50 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode50.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode52 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode50.insertRight(doublyLinkedListNode52);
        examples.DoublyLinkedListNode doublyLinkedListNode54 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode55 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode54.insertRight(doublyLinkedListNode55);
        doublyLinkedListNode55.remove();
        doublyLinkedListNode52.insertRight(doublyLinkedListNode55);
        doublyLinkedListNode52.remove();
        doublyLinkedListNode49.insertRight(doublyLinkedListNode52);
        doublyLinkedListNode49.remove();
        doublyLinkedListNode49.remove();
        doublyLinkedListNode49.remove();
        doublyLinkedListNode45.insertRight(doublyLinkedListNode49);
        doublyLinkedListNode45.remove();
        doublyLinkedListNode30.insertRight(doublyLinkedListNode45);
        doublyLinkedListNode45.remove();
        java.lang.Class<?> wildcardClass68 = doublyLinkedListNode45.getClass();
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test303");
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
        doublyLinkedListNode8.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode38 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode39 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode39.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode41 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode39.insertRight(doublyLinkedListNode41);
        examples.DoublyLinkedListNode doublyLinkedListNode43 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode44 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode43.insertRight(doublyLinkedListNode44);
        doublyLinkedListNode44.remove();
        doublyLinkedListNode41.insertRight(doublyLinkedListNode44);
        doublyLinkedListNode41.remove();
        doublyLinkedListNode38.insertRight(doublyLinkedListNode41);
        doublyLinkedListNode38.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode51 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode52 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode51.insertRight(doublyLinkedListNode52);
        doublyLinkedListNode51.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode55 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode56 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode55.insertRight(doublyLinkedListNode56);
        doublyLinkedListNode56.remove();
        doublyLinkedListNode56.remove();
        doublyLinkedListNode51.insertRight(doublyLinkedListNode56);
        doublyLinkedListNode51.remove();
        doublyLinkedListNode51.remove();
        doublyLinkedListNode51.remove();
        doublyLinkedListNode38.insertRight(doublyLinkedListNode51);
        // The following exception was thrown during execution in test generation
        try {
            doublyLinkedListNode8.insertRight(doublyLinkedListNode51);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter is not singleton");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test304");
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
        examples.DoublyLinkedListNode doublyLinkedListNode13 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode13.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode15 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode16 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode15.insertRight(doublyLinkedListNode16);
        doublyLinkedListNode16.remove();
        doublyLinkedListNode13.insertRight(doublyLinkedListNode16);
        doublyLinkedListNode13.remove();
        doublyLinkedListNode13.remove();
        doublyLinkedListNode2.insertRight(doublyLinkedListNode13);
        doublyLinkedListNode13.remove();
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test305");
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
        doublyLinkedListNode5.remove();
        doublyLinkedListNode5.remove();
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
        examples.DoublyLinkedListNode doublyLinkedListNode26 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode18.insertRight(doublyLinkedListNode26);
        // The following exception was thrown during execution in test generation
        try {
            doublyLinkedListNode5.insertRight(doublyLinkedListNode26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter is not singleton");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test306");
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
        java.lang.Class<?> wildcardClass50 = doublyLinkedListNode12.getClass();
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test307");
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
        doublyLinkedListNode11.insertRight(doublyLinkedListNode16);
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
        doublyLinkedListNode16.insertRight(doublyLinkedListNode27);
        doublyLinkedListNode27.remove();
        doublyLinkedListNode27.remove();
        doublyLinkedListNode27.remove();
        doublyLinkedListNode9.insertRight(doublyLinkedListNode27);
        doublyLinkedListNode27.remove();
        doublyLinkedListNode3.insertRight(doublyLinkedListNode27);
        doublyLinkedListNode3.remove();
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test308");
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
        doublyLinkedListNode0.remove();
        doublyLinkedListNode0.remove();
        java.lang.Class<?> wildcardClass32 = doublyLinkedListNode0.getClass();
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test309");
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
        doublyLinkedListNode18.insertRight(doublyLinkedListNode21);
        doublyLinkedListNode18.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode31 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode31.remove();
        doublyLinkedListNode31.remove();
        doublyLinkedListNode31.remove();
        doublyLinkedListNode18.insertRight(doublyLinkedListNode31);
        examples.DoublyLinkedListNode doublyLinkedListNode36 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode36.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode38 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode39 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode38.insertRight(doublyLinkedListNode39);
        doublyLinkedListNode39.remove();
        doublyLinkedListNode36.insertRight(doublyLinkedListNode39);
        examples.DoublyLinkedListNode doublyLinkedListNode43 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode44 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode43.insertRight(doublyLinkedListNode44);
        doublyLinkedListNode44.remove();
        doublyLinkedListNode36.insertRight(doublyLinkedListNode44);
        doublyLinkedListNode36.remove();
        doublyLinkedListNode36.remove();
        doublyLinkedListNode36.remove();
        doublyLinkedListNode31.insertRight(doublyLinkedListNode36);
        doublyLinkedListNode36.remove();
        doublyLinkedListNode13.insertRight(doublyLinkedListNode36);
        examples.DoublyLinkedListNode doublyLinkedListNode54 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode55 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode54.insertRight(doublyLinkedListNode55);
        doublyLinkedListNode54.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode58 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode59 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode58.insertRight(doublyLinkedListNode59);
        doublyLinkedListNode59.remove();
        doublyLinkedListNode54.insertRight(doublyLinkedListNode59);
        examples.DoublyLinkedListNode doublyLinkedListNode63 = new examples.DoublyLinkedListNode();
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
        doublyLinkedListNode63.insertRight(doublyLinkedListNode66);
        doublyLinkedListNode63.remove();
        doublyLinkedListNode63.remove();
        doublyLinkedListNode63.remove();
        doublyLinkedListNode59.insertRight(doublyLinkedListNode63);
        examples.DoublyLinkedListNode doublyLinkedListNode79 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode79.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode81 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode79.insertRight(doublyLinkedListNode81);
        doublyLinkedListNode81.remove();
        doublyLinkedListNode63.insertRight(doublyLinkedListNode81);
        // The following exception was thrown during execution in test generation
        try {
            doublyLinkedListNode13.insertRight(doublyLinkedListNode81);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: parameter is not singleton");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test310");
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
        doublyLinkedListNode11.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode30 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode31 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode30.insertRight(doublyLinkedListNode31);
        doublyLinkedListNode30.remove();
        doublyLinkedListNode30.remove();
        doublyLinkedListNode11.insertRight(doublyLinkedListNode30);
        doublyLinkedListNode30.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode30);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test311");
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
        doublyLinkedListNode1.remove();
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test312");
        examples.DoublyLinkedListNode doublyLinkedListNode0 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode1 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode1);
        doublyLinkedListNode0.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode4 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode5 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode4.insertRight(doublyLinkedListNode5);
        doublyLinkedListNode5.remove();
        doublyLinkedListNode0.insertRight(doublyLinkedListNode5);
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
        doublyLinkedListNode9.remove();
        doublyLinkedListNode9.remove();
        doublyLinkedListNode5.insertRight(doublyLinkedListNode9);
        examples.DoublyLinkedListNode doublyLinkedListNode25 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode25.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode27 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode25.insertRight(doublyLinkedListNode27);
        doublyLinkedListNode27.remove();
        doublyLinkedListNode9.insertRight(doublyLinkedListNode27);
        examples.DoublyLinkedListNode doublyLinkedListNode31 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode31.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode33 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode31.insertRight(doublyLinkedListNode33);
        examples.DoublyLinkedListNode doublyLinkedListNode35 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode36 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode35.insertRight(doublyLinkedListNode36);
        doublyLinkedListNode36.remove();
        doublyLinkedListNode33.insertRight(doublyLinkedListNode36);
        examples.DoublyLinkedListNode doublyLinkedListNode40 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode40.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode42 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode43 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode42.insertRight(doublyLinkedListNode43);
        doublyLinkedListNode43.remove();
        doublyLinkedListNode40.insertRight(doublyLinkedListNode43);
        examples.DoublyLinkedListNode doublyLinkedListNode47 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode48 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode47.insertRight(doublyLinkedListNode48);
        doublyLinkedListNode48.remove();
        doublyLinkedListNode40.insertRight(doublyLinkedListNode48);
        doublyLinkedListNode40.remove();
        doublyLinkedListNode40.remove();
        doublyLinkedListNode33.insertRight(doublyLinkedListNode40);
        doublyLinkedListNode33.remove();
        doublyLinkedListNode27.insertRight(doublyLinkedListNode33);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test313");
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
        doublyLinkedListNode28.remove();
        doublyLinkedListNode28.remove();
        doublyLinkedListNode28.remove();
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test314");
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
        doublyLinkedListNode11.remove();
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test315");
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
        doublyLinkedListNode2.remove();
        doublyLinkedListNode2.remove();
        java.lang.Class<?> wildcardClass26 = doublyLinkedListNode2.getClass();
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DoublyLinkedListNodeTester0.test316");
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
        examples.DoublyLinkedListNode doublyLinkedListNode20 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode20.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode22 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode23 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode22.insertRight(doublyLinkedListNode23);
        doublyLinkedListNode23.remove();
        doublyLinkedListNode20.insertRight(doublyLinkedListNode23);
        examples.DoublyLinkedListNode doublyLinkedListNode27 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode27.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode29 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode27.insertRight(doublyLinkedListNode29);
        examples.DoublyLinkedListNode doublyLinkedListNode31 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode32 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode31.insertRight(doublyLinkedListNode32);
        doublyLinkedListNode32.remove();
        doublyLinkedListNode29.insertRight(doublyLinkedListNode32);
        doublyLinkedListNode29.remove();
        doublyLinkedListNode20.insertRight(doublyLinkedListNode29);
        examples.DoublyLinkedListNode doublyLinkedListNode38 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode38.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode40 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode41 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode40.insertRight(doublyLinkedListNode41);
        doublyLinkedListNode41.remove();
        doublyLinkedListNode38.insertRight(doublyLinkedListNode41);
        doublyLinkedListNode38.remove();
        doublyLinkedListNode20.insertRight(doublyLinkedListNode38);
        doublyLinkedListNode38.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode48 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode48.remove();
        examples.DoublyLinkedListNode doublyLinkedListNode50 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode51 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode50.insertRight(doublyLinkedListNode51);
        doublyLinkedListNode51.remove();
        doublyLinkedListNode48.insertRight(doublyLinkedListNode51);
        examples.DoublyLinkedListNode doublyLinkedListNode55 = new examples.DoublyLinkedListNode();
        examples.DoublyLinkedListNode doublyLinkedListNode56 = new examples.DoublyLinkedListNode();
        doublyLinkedListNode55.insertRight(doublyLinkedListNode56);
        doublyLinkedListNode56.remove();
        doublyLinkedListNode48.insertRight(doublyLinkedListNode56);
        doublyLinkedListNode48.remove();
        doublyLinkedListNode48.remove();
        doublyLinkedListNode38.insertRight(doublyLinkedListNode48);
        doublyLinkedListNode48.remove();
        doublyLinkedListNode48.remove();
        doublyLinkedListNode15.insertRight(doublyLinkedListNode48);
    }
}

