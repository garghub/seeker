package testers;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CompositeTester0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test001");
        examples.Composite composite1 = new examples.Composite((-100));
        java.lang.Class<?> wildcardClass2 = composite1.getClass();
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test002");
        examples.Composite composite1 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.lang.Class<?> wildcardClass4 = compositeSet3.getClass();
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test003");
        examples.Composite composite1 = new examples.Composite((-3));
        java.lang.Class<?> wildcardClass2 = composite1.getClass();
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test004");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.lang.Class<?> wildcardClass6 = composite3.getClass();
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test005");
        examples.Composite composite1 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        examples.Composite composite6 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        java.util.Set<examples.Composite> compositeSet8 = composite6.children();
        composite1.addChild(composite6);
        java.lang.Class<?> wildcardClass10 = composite6.getClass();
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test006");
        examples.Composite composite1 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.lang.Class<?> wildcardClass4 = compositeSet3.getClass();
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test007");
        examples.Composite composite1 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.lang.Class<?> wildcardClass3 = compositeSet2.getClass();
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test008");
        examples.Composite composite1 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.lang.Class<?> wildcardClass3 = composite1.getClass();
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test009");
        examples.Composite composite1 = new examples.Composite((int) '4');
        examples.Composite composite3 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        composite1.addChild(composite3);
        java.lang.Class<?> wildcardClass7 = composite1.getClass();
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test010");
        examples.Composite composite1 = new examples.Composite((int) '4');
        java.lang.Class<?> wildcardClass2 = composite1.getClass();
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test011");
        examples.Composite composite1 = new examples.Composite(100);
        examples.Composite composite3 = new examples.Composite((-100));
        examples.Composite composite5 = new examples.Composite((-3));
        composite3.addChild(composite5);
        java.util.Set<examples.Composite> compositeSet7 = composite5.children();
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test012");
        examples.Composite composite1 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.lang.Class<?> wildcardClass3 = compositeSet2.getClass();
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test013");
        examples.Composite composite1 = new examples.Composite((-9));
        java.lang.Class<?> wildcardClass2 = composite1.getClass();
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test014");
        examples.Composite composite1 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.lang.Class<?> wildcardClass4 = composite1.getClass();
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test015");
        examples.Composite composite1 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        examples.Composite composite6 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        java.util.Set<examples.Composite> compositeSet8 = composite6.children();
        composite1.addChild(composite6);
        examples.Composite composite11 = new examples.Composite((-100));
        examples.Composite composite13 = new examples.Composite((-3));
        composite11.addChild(composite13);
        java.util.Set<examples.Composite> compositeSet15 = composite13.children();
        examples.Composite composite17 = new examples.Composite((-9));
        composite13.addChild(composite17);
        // The following exception was thrown during execution in test generation
        try {
            composite6.addChild(composite13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test016");
        examples.Composite composite1 = new examples.Composite((int) '4');
        examples.Composite composite3 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        composite1.addChild(composite3);
        java.lang.Class<?> wildcardClass7 = composite3.getClass();
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test017");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.lang.Class<?> wildcardClass5 = composite1.getClass();
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test018");
        examples.Composite composite1 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        composite1.addChild(composite4);
        java.lang.Class<?> wildcardClass7 = composite4.getClass();
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test019");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        examples.Composite composite6 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        java.util.Set<examples.Composite> compositeSet8 = composite6.children();
        java.util.Set<examples.Composite> compositeSet9 = composite6.children();
        composite1.addChild(composite6);
        java.util.Set<examples.Composite> compositeSet11 = composite1.children();
        java.lang.Class<?> wildcardClass12 = compositeSet11.getClass();
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test020");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        examples.Composite composite6 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        java.util.Set<examples.Composite> compositeSet8 = composite6.children();
        java.util.Set<examples.Composite> compositeSet9 = composite6.children();
        composite1.addChild(composite6);
        java.util.Set<examples.Composite> compositeSet11 = composite1.children();
        java.lang.Class<?> wildcardClass12 = composite1.getClass();
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test021");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        examples.Composite composite7 = new examples.Composite((-9));
        composite3.addChild(composite7);
        java.lang.Class<?> wildcardClass9 = composite7.getClass();
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test022");
        examples.Composite composite1 = new examples.Composite((-1));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.lang.Class<?> wildcardClass3 = compositeSet2.getClass();
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test023");
        examples.Composite composite1 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        examples.Composite composite5 = new examples.Composite((-6));
        composite1.addChild(composite5);
        examples.Composite composite8 = new examples.Composite((-100));
        examples.Composite composite10 = new examples.Composite((-3));
        composite8.addChild(composite10);
        java.util.Set<examples.Composite> compositeSet12 = composite10.children();
        examples.Composite composite14 = new examples.Composite((-9));
        composite10.addChild(composite14);
        // The following exception was thrown during execution in test generation
        try {
            composite5.addChild(composite10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test024");
        examples.Composite composite1 = new examples.Composite(9);
        java.lang.Class<?> wildcardClass2 = composite1.getClass();
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test025");
        examples.Composite composite1 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        examples.Composite composite6 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        java.util.Set<examples.Composite> compositeSet8 = composite6.children();
        composite1.addChild(composite6);
        examples.Composite composite11 = new examples.Composite((int) '4');
        examples.Composite composite13 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet14 = composite13.children();
        java.util.Set<examples.Composite> compositeSet15 = composite13.children();
        composite11.addChild(composite13);
        // The following exception was thrown during execution in test generation
        try {
            composite6.addChild(composite11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test026");
        examples.Composite composite1 = new examples.Composite((int) (byte) 1);
        java.lang.Class<?> wildcardClass2 = composite1.getClass();
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test027");
        examples.Composite composite1 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        examples.Composite composite5 = new examples.Composite((-6));
        composite1.addChild(composite5);
        java.util.Set<examples.Composite> compositeSet7 = composite5.children();
        examples.Composite composite9 = new examples.Composite((-100));
        examples.Composite composite11 = new examples.Composite((-3));
        composite9.addChild(composite11);
        examples.Composite composite14 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet15 = composite14.children();
        java.util.Set<examples.Composite> compositeSet16 = composite14.children();
        java.util.Set<examples.Composite> compositeSet17 = composite14.children();
        composite9.addChild(composite14);
        // The following exception was thrown during execution in test generation
        try {
            composite5.addChild(composite9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test028");
        examples.Composite composite1 = new examples.Composite((-2));
        examples.Composite composite3 = new examples.Composite((-100));
        examples.Composite composite5 = new examples.Composite((-3));
        composite3.addChild(composite5);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test029");
        examples.Composite composite1 = new examples.Composite((-6));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.lang.Class<?> wildcardClass3 = compositeSet2.getClass();
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test030");
        examples.Composite composite1 = new examples.Composite((-6));
        java.lang.Class<?> wildcardClass2 = composite1.getClass();
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test031");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        examples.Composite composite7 = new examples.Composite((-100));
        examples.Composite composite9 = new examples.Composite((-3));
        composite7.addChild(composite9);
        java.util.Set<examples.Composite> compositeSet11 = composite9.children();
        java.util.Set<examples.Composite> compositeSet12 = composite9.children();
        examples.Composite composite14 = new examples.Composite((-9));
        composite9.addChild(composite14);
        // The following exception was thrown during execution in test generation
        try {
            composite3.addChild(composite14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test032");
        examples.Composite composite1 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        composite1.addChild(composite4);
        examples.Composite composite8 = new examples.Composite((-100));
        examples.Composite composite10 = new examples.Composite((-3));
        composite8.addChild(composite10);
        java.util.Set<examples.Composite> compositeSet12 = composite10.children();
        java.util.Set<examples.Composite> compositeSet13 = composite10.children();
        examples.Composite composite15 = new examples.Composite((-9));
        composite10.addChild(composite15);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test033");
        examples.Composite composite1 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.lang.Class<?> wildcardClass3 = compositeSet2.getClass();
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test034");
        examples.Composite composite1 = new examples.Composite((-1));
        java.lang.Class<?> wildcardClass2 = composite1.getClass();
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test035");
        examples.Composite composite1 = new examples.Composite((-2));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        java.util.Set<examples.Composite> compositeSet6 = composite4.children();
        composite1.addChild(composite4);
        java.lang.Class<?> wildcardClass8 = composite4.getClass();
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test036");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        examples.Composite composite6 = new examples.Composite((-100));
        examples.Composite composite8 = new examples.Composite((-3));
        composite6.addChild(composite8);
        java.util.Set<examples.Composite> compositeSet10 = composite8.children();
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test037");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        examples.Composite composite8 = new examples.Composite((-9));
        composite3.addChild(composite8);
        java.util.Set<examples.Composite> compositeSet10 = composite8.children();
        examples.Composite composite12 = new examples.Composite((int) '4');
        composite8.addChild(composite12);
        examples.Composite composite15 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet16 = composite15.children();
        java.util.Set<examples.Composite> compositeSet17 = composite15.children();
        composite12.addChild(composite15);
        java.lang.Class<?> wildcardClass19 = composite15.getClass();
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test038");
        examples.Composite composite1 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite3 = null;
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test039");
        examples.Composite composite1 = new examples.Composite((int) (short) -1);
        examples.Composite composite3 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        composite1.addChild(composite3);
        examples.Composite composite7 = new examples.Composite((int) '4');
        examples.Composite composite9 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet10 = composite9.children();
        java.util.Set<examples.Composite> compositeSet11 = composite9.children();
        composite7.addChild(composite9);
        examples.Composite composite14 = new examples.Composite((-6));
        java.util.Set<examples.Composite> compositeSet15 = composite14.children();
        composite7.addChild(composite14);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test040");
        examples.Composite composite1 = new examples.Composite((-6));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.lang.Class<?> wildcardClass4 = composite1.getClass();
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test041");
        examples.Composite composite1 = new examples.Composite((int) (byte) 1);
        examples.Composite composite3 = new examples.Composite((int) '4');
        examples.Composite composite5 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet6 = composite5.children();
        java.util.Set<examples.Composite> compositeSet7 = composite5.children();
        composite3.addChild(composite5);
        java.util.Set<examples.Composite> compositeSet9 = composite5.children();
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test042");
        examples.Composite composite1 = new examples.Composite((-2));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.lang.Class<?> wildcardClass3 = compositeSet2.getClass();
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test043");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        examples.Composite composite8 = new examples.Composite((-9));
        composite3.addChild(composite8);
        java.util.Set<examples.Composite> compositeSet10 = composite8.children();
        examples.Composite composite12 = new examples.Composite((int) '4');
        composite8.addChild(composite12);
        examples.Composite composite15 = new examples.Composite((int) '4');
        examples.Composite composite17 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet18 = composite17.children();
        java.util.Set<examples.Composite> compositeSet19 = composite17.children();
        composite15.addChild(composite17);
        // The following exception was thrown during execution in test generation
        try {
            composite8.addChild(composite15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test044");
        examples.Composite composite1 = new examples.Composite((-2));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        java.util.Set<examples.Composite> compositeSet6 = composite4.children();
        composite1.addChild(composite4);
        java.util.Set<examples.Composite> compositeSet8 = composite4.children();
        java.lang.Class<?> wildcardClass9 = composite4.getClass();
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test045");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        java.util.Set<examples.Composite> compositeSet7 = composite3.children();
        java.util.Set<examples.Composite> compositeSet8 = composite3.children();
        examples.Composite composite10 = new examples.Composite((int) (short) 0);
        composite3.addChild(composite10);
        examples.Composite composite13 = new examples.Composite((-100));
        examples.Composite composite15 = new examples.Composite((-3));
        composite13.addChild(composite15);
        // The following exception was thrown during execution in test generation
        try {
            composite3.addChild(composite15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test046");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        examples.Composite composite8 = new examples.Composite((-9));
        composite3.addChild(composite8);
        examples.Composite composite11 = new examples.Composite((-100));
        examples.Composite composite13 = new examples.Composite((-3));
        composite11.addChild(composite13);
        examples.Composite composite16 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet17 = composite16.children();
        java.util.Set<examples.Composite> compositeSet18 = composite16.children();
        java.util.Set<examples.Composite> compositeSet19 = composite16.children();
        composite11.addChild(composite16);
        java.util.Set<examples.Composite> compositeSet21 = composite11.children();
        java.util.Set<examples.Composite> compositeSet22 = composite11.children();
        // The following exception was thrown during execution in test generation
        try {
            composite8.addChild(composite11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test047");
        examples.Composite composite1 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        examples.Composite composite5 = new examples.Composite((-6));
        composite1.addChild(composite5);
        java.lang.Class<?> wildcardClass7 = composite5.getClass();
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test048");
        examples.Composite composite1 = new examples.Composite(3);
        java.lang.Class<?> wildcardClass2 = composite1.getClass();
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test049");
        examples.Composite composite1 = new examples.Composite((int) '4');
        examples.Composite composite3 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet7 = composite3.children();
        java.lang.Class<?> wildcardClass8 = compositeSet7.getClass();
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test050");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        examples.Composite composite8 = new examples.Composite((-9));
        composite3.addChild(composite8);
        java.util.Set<examples.Composite> compositeSet10 = composite8.children();
        examples.Composite composite12 = new examples.Composite((int) '4');
        composite8.addChild(composite12);
        examples.Composite composite15 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet16 = composite15.children();
        composite8.addChild(composite15);
        java.lang.Class<?> wildcardClass18 = composite8.getClass();
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test051");
        examples.Composite composite1 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        composite1.addChild(composite4);
        examples.Composite composite8 = new examples.Composite((-3));
        composite4.addChild(composite8);
        examples.Composite composite11 = new examples.Composite((int) '#');
        composite4.addChild(composite11);
        examples.Composite composite14 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet15 = composite14.children();
        java.util.Set<examples.Composite> compositeSet16 = composite14.children();
        java.util.Set<examples.Composite> compositeSet17 = composite14.children();
        examples.Composite composite19 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet20 = composite19.children();
        java.util.Set<examples.Composite> compositeSet21 = composite19.children();
        composite14.addChild(composite19);
        examples.Composite composite24 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet25 = composite24.children();
        java.util.Set<examples.Composite> compositeSet26 = composite24.children();
        java.util.Set<examples.Composite> compositeSet27 = composite24.children();
        composite14.addChild(composite24);
        // The following exception was thrown during execution in test generation
        try {
            composite11.addChild(composite14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test052");
        examples.Composite composite1 = new examples.Composite((-7));
        examples.Composite composite3 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        examples.Composite composite8 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet9 = composite8.children();
        java.util.Set<examples.Composite> compositeSet10 = composite8.children();
        composite3.addChild(composite8);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test053");
        examples.Composite composite1 = new examples.Composite(3);
        examples.Composite composite3 = new examples.Composite((-100));
        examples.Composite composite5 = new examples.Composite((-3));
        composite3.addChild(composite5);
        java.util.Set<examples.Composite> compositeSet7 = composite5.children();
        java.util.Set<examples.Composite> compositeSet8 = composite5.children();
        examples.Composite composite10 = new examples.Composite((-9));
        composite5.addChild(composite10);
        java.util.Set<examples.Composite> compositeSet12 = composite5.children();
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test054");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        examples.Composite composite6 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        java.util.Set<examples.Composite> compositeSet8 = composite6.children();
        java.util.Set<examples.Composite> compositeSet9 = composite6.children();
        composite1.addChild(composite6);
        java.util.Set<examples.Composite> compositeSet11 = composite1.children();
        java.util.Set<examples.Composite> compositeSet12 = composite1.children();
        java.lang.Class<?> wildcardClass13 = composite1.getClass();
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test055");
        examples.Composite composite1 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        examples.Composite composite5 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet6 = composite5.children();
        java.util.Set<examples.Composite> compositeSet7 = composite5.children();
        examples.Composite composite9 = new examples.Composite((-6));
        composite5.addChild(composite9);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test056");
        examples.Composite composite1 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.lang.Class<?> wildcardClass3 = composite1.getClass();
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test057");
        examples.Composite composite1 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        examples.Composite composite6 = new examples.Composite(3);
        composite1.addChild(composite6);
        examples.Composite composite9 = new examples.Composite(5);
        composite6.addChild(composite9);
        examples.Composite composite12 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet13 = composite12.children();
        examples.Composite composite15 = new examples.Composite(8);
        composite12.addChild(composite15);
        // The following exception was thrown during execution in test generation
        try {
            composite6.addChild(composite12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test058");
        examples.Composite composite1 = new examples.Composite((int) (byte) 0);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((int) '4');
        examples.Composite composite6 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        java.util.Set<examples.Composite> compositeSet8 = composite6.children();
        composite4.addChild(composite6);
        java.util.Set<examples.Composite> compositeSet10 = composite6.children();
        examples.Composite composite12 = new examples.Composite((-5));
        composite6.addChild(composite12);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test059");
        examples.Composite composite1 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        examples.Composite composite6 = new examples.Composite(3);
        composite1.addChild(composite6);
        examples.Composite composite9 = new examples.Composite(5);
        composite6.addChild(composite9);
        java.lang.Class<?> wildcardClass11 = composite6.getClass();
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test060");
        examples.Composite composite1 = new examples.Composite((int) (short) -1);
        examples.Composite composite3 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        java.lang.Class<?> wildcardClass7 = composite3.getClass();
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test061");
        examples.Composite composite1 = new examples.Composite(0);
        java.lang.Class<?> wildcardClass2 = composite1.getClass();
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test062");
        examples.Composite composite1 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        composite1.addChild(composite4);
        java.util.Set<examples.Composite> compositeSet7 = composite4.children();
        examples.Composite composite9 = new examples.Composite((-100));
        examples.Composite composite11 = new examples.Composite((-3));
        composite9.addChild(composite11);
        java.util.Set<examples.Composite> compositeSet13 = composite11.children();
        java.util.Set<examples.Composite> compositeSet14 = composite11.children();
        examples.Composite composite16 = new examples.Composite((-9));
        composite11.addChild(composite16);
        java.util.Set<examples.Composite> compositeSet18 = composite16.children();
        examples.Composite composite20 = new examples.Composite((int) '4');
        composite16.addChild(composite20);
        examples.Composite composite23 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet24 = composite23.children();
        java.util.Set<examples.Composite> compositeSet25 = composite23.children();
        composite20.addChild(composite23);
        // The following exception was thrown during execution in test generation
        try {
            composite4.addChild(composite23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test063");
        examples.Composite composite1 = new examples.Composite((-1));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((int) '4');
        examples.Composite composite6 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        java.util.Set<examples.Composite> compositeSet8 = composite6.children();
        composite4.addChild(composite6);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test064");
        examples.Composite composite1 = new examples.Composite((int) (byte) 1);
        examples.Composite composite3 = new examples.Composite((-100));
        examples.Composite composite5 = new examples.Composite((-3));
        composite3.addChild(composite5);
        examples.Composite composite8 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet9 = composite8.children();
        java.util.Set<examples.Composite> compositeSet10 = composite8.children();
        java.util.Set<examples.Composite> compositeSet11 = composite8.children();
        composite3.addChild(composite8);
        java.util.Set<examples.Composite> compositeSet13 = composite8.children();
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test065");
        examples.Composite composite1 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        composite1.addChild(composite4);
        examples.Composite composite8 = new examples.Composite((-3));
        composite4.addChild(composite8);
        examples.Composite composite11 = new examples.Composite((int) '#');
        composite4.addChild(composite11);
        java.lang.Class<?> wildcardClass13 = composite4.getClass();
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test066");
        examples.Composite composite1 = new examples.Composite(2);
        examples.Composite composite3 = new examples.Composite((-100));
        examples.Composite composite5 = new examples.Composite((-3));
        composite3.addChild(composite5);
        examples.Composite composite8 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet9 = composite8.children();
        java.util.Set<examples.Composite> compositeSet10 = composite8.children();
        java.util.Set<examples.Composite> compositeSet11 = composite8.children();
        composite3.addChild(composite8);
        java.util.Set<examples.Composite> compositeSet13 = composite3.children();
        java.util.Set<examples.Composite> compositeSet14 = composite3.children();
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test067");
        examples.Composite composite1 = new examples.Composite(0);
        examples.Composite composite3 = new examples.Composite((int) '4');
        examples.Composite composite5 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet6 = composite5.children();
        java.util.Set<examples.Composite> compositeSet7 = composite5.children();
        composite3.addChild(composite5);
        examples.Composite composite10 = new examples.Composite((-6));
        java.util.Set<examples.Composite> compositeSet11 = composite10.children();
        composite3.addChild(composite10);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test068");
        examples.Composite composite1 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        examples.Composite composite6 = new examples.Composite(9);
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        composite1.addChild(composite6);
        examples.Composite composite10 = new examples.Composite((-100));
        examples.Composite composite12 = new examples.Composite((-3));
        composite10.addChild(composite12);
        examples.Composite composite15 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet16 = composite15.children();
        java.util.Set<examples.Composite> compositeSet17 = composite15.children();
        java.util.Set<examples.Composite> compositeSet18 = composite15.children();
        composite10.addChild(composite15);
        // The following exception was thrown during execution in test generation
        try {
            composite6.addChild(composite15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test069");
        examples.Composite composite1 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        composite1.addChild(composite4);
        examples.Composite composite8 = new examples.Composite((-3));
        composite4.addChild(composite8);
        examples.Composite composite11 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet12 = composite11.children();
        java.util.Set<examples.Composite> compositeSet13 = composite11.children();
        composite4.addChild(composite11);
        java.lang.Class<?> wildcardClass15 = composite4.getClass();
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test070");
        examples.Composite composite1 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        java.lang.Class<?> wildcardClass5 = compositeSet4.getClass();
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test071");
        examples.Composite composite1 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        examples.Composite composite6 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        java.util.Set<examples.Composite> compositeSet8 = composite6.children();
        composite1.addChild(composite6);
        examples.Composite composite11 = new examples.Composite((-8));
        composite1.addChild(composite11);
        java.lang.Class<?> wildcardClass13 = composite1.getClass();
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test072");
        examples.Composite composite1 = new examples.Composite((int) (short) -1);
        java.lang.Class<?> wildcardClass2 = composite1.getClass();
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test073");
        examples.Composite composite1 = new examples.Composite((-2));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        java.util.Set<examples.Composite> compositeSet6 = composite4.children();
        composite1.addChild(composite4);
        examples.Composite composite9 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet10 = composite9.children();
        examples.Composite composite12 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet13 = composite12.children();
        composite9.addChild(composite12);
        examples.Composite composite16 = new examples.Composite((-3));
        composite12.addChild(composite16);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test074");
        examples.Composite composite1 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        examples.Composite composite6 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        java.util.Set<examples.Composite> compositeSet8 = composite6.children();
        composite1.addChild(composite6);
        examples.Composite composite11 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet12 = composite11.children();
        java.util.Set<examples.Composite> compositeSet13 = composite11.children();
        java.util.Set<examples.Composite> compositeSet14 = composite11.children();
        composite1.addChild(composite11);
        examples.Composite composite17 = new examples.Composite((-2));
        java.util.Set<examples.Composite> compositeSet18 = composite17.children();
        examples.Composite composite20 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet21 = composite20.children();
        java.util.Set<examples.Composite> compositeSet22 = composite20.children();
        composite17.addChild(composite20);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test075");
        examples.Composite composite1 = new examples.Composite((int) (short) 1);
        java.lang.Class<?> wildcardClass2 = composite1.getClass();
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test076");
        examples.Composite composite1 = new examples.Composite((int) (short) -1);
        examples.Composite composite3 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet6 = composite1.children();
        java.lang.Class<?> wildcardClass7 = composite1.getClass();
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test077");
        examples.Composite composite1 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        composite1.addChild(composite4);
        examples.Composite composite8 = new examples.Composite((-3));
        composite4.addChild(composite8);
        examples.Composite composite11 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet12 = composite11.children();
        java.util.Set<examples.Composite> compositeSet13 = composite11.children();
        composite4.addChild(composite11);
        examples.Composite composite16 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet17 = composite16.children();
        examples.Composite composite19 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet20 = composite19.children();
        composite16.addChild(composite19);
        examples.Composite composite23 = new examples.Composite((-3));
        composite19.addChild(composite23);
        examples.Composite composite26 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet27 = composite26.children();
        java.util.Set<examples.Composite> compositeSet28 = composite26.children();
        composite19.addChild(composite26);
        // The following exception was thrown during execution in test generation
        try {
            composite11.addChild(composite19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test078");
        examples.Composite composite1 = new examples.Composite(7);
        java.lang.Class<?> wildcardClass2 = composite1.getClass();
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test079");
        examples.Composite composite1 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        examples.Composite composite6 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        java.util.Set<examples.Composite> compositeSet8 = composite6.children();
        composite1.addChild(composite6);
        examples.Composite composite11 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet12 = composite11.children();
        java.util.Set<examples.Composite> compositeSet13 = composite11.children();
        java.util.Set<examples.Composite> compositeSet14 = composite11.children();
        composite1.addChild(composite11);
        java.lang.Class<?> wildcardClass16 = composite11.getClass();
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test080");
        examples.Composite composite1 = new examples.Composite((int) ' ');
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.lang.Class<?> wildcardClass3 = compositeSet2.getClass();
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test081");
        examples.Composite composite1 = new examples.Composite((int) (byte) -1);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.lang.Class<?> wildcardClass3 = compositeSet2.getClass();
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test082");
        examples.Composite composite1 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        examples.Composite composite6 = new examples.Composite(9);
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        composite1.addChild(composite6);
        examples.Composite composite10 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet11 = composite10.children();
        java.util.Set<examples.Composite> compositeSet12 = composite10.children();
        java.util.Set<examples.Composite> compositeSet13 = composite10.children();
        examples.Composite composite15 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet16 = composite15.children();
        java.util.Set<examples.Composite> compositeSet17 = composite15.children();
        composite10.addChild(composite15);
        examples.Composite composite20 = new examples.Composite((-8));
        composite10.addChild(composite20);
        // The following exception was thrown during execution in test generation
        try {
            composite6.addChild(composite20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test083");
        examples.Composite composite1 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite(8);
        composite1.addChild(composite4);
        examples.Composite composite7 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet8 = composite7.children();
        examples.Composite composite10 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet11 = composite10.children();
        composite7.addChild(composite10);
        java.util.Set<examples.Composite> compositeSet13 = composite7.children();
        // The following exception was thrown during execution in test generation
        try {
            composite4.addChild(composite7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test084");
        examples.Composite composite1 = new examples.Composite((int) (short) -1);
        examples.Composite composite3 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet6 = composite1.children();
        java.lang.Class<?> wildcardClass7 = compositeSet6.getClass();
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test085");
        examples.Composite composite1 = new examples.Composite((int) '4');
        examples.Composite composite3 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet7 = composite3.children();
        examples.Composite composite9 = new examples.Composite((-5));
        composite3.addChild(composite9);
        java.lang.Class<?> wildcardClass11 = composite9.getClass();
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test086");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        java.util.Set<examples.Composite> compositeSet7 = composite3.children();
        java.util.Set<examples.Composite> compositeSet8 = composite3.children();
        examples.Composite composite10 = new examples.Composite((int) (short) 0);
        composite3.addChild(composite10);
        java.lang.Class<?> wildcardClass12 = composite3.getClass();
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test087");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        examples.Composite composite7 = new examples.Composite((-100));
        examples.Composite composite9 = new examples.Composite((-3));
        composite7.addChild(composite9);
        java.util.Set<examples.Composite> compositeSet11 = composite9.children();
        examples.Composite composite13 = new examples.Composite((-9));
        composite9.addChild(composite13);
        java.util.Set<examples.Composite> compositeSet15 = composite13.children();
        // The following exception was thrown during execution in test generation
        try {
            composite3.addChild(composite13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test088");
        examples.Composite composite1 = new examples.Composite((-2));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.lang.Class<?> wildcardClass4 = compositeSet3.getClass();
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test089");
        examples.Composite composite1 = new examples.Composite((int) (short) -1);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.lang.Class<?> wildcardClass3 = compositeSet2.getClass();
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test090");
        examples.Composite composite1 = new examples.Composite(5);
        examples.Composite composite3 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        composite1.addChild(composite3);
        java.lang.Class<?> wildcardClass7 = composite1.getClass();
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test091");
        examples.Composite composite1 = new examples.Composite((int) '#');
        examples.Composite composite3 = new examples.Composite((-2));
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        examples.Composite composite6 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        java.util.Set<examples.Composite> compositeSet8 = composite6.children();
        composite3.addChild(composite6);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test092");
        examples.Composite composite1 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        composite1.addChild(composite4);
        java.lang.Class<?> wildcardClass7 = composite1.getClass();
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test093");
        examples.Composite composite1 = new examples.Composite(5);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-100));
        examples.Composite composite6 = new examples.Composite((-3));
        composite4.addChild(composite6);
        java.util.Set<examples.Composite> compositeSet8 = composite6.children();
        java.util.Set<examples.Composite> compositeSet9 = composite6.children();
        examples.Composite composite11 = new examples.Composite((-9));
        composite6.addChild(composite11);
        java.util.Set<examples.Composite> compositeSet13 = composite11.children();
        examples.Composite composite15 = new examples.Composite((int) '4');
        composite11.addChild(composite15);
        java.util.Set<examples.Composite> compositeSet17 = composite11.children();
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test094");
        examples.Composite composite1 = new examples.Composite((int) (byte) 0);
        java.lang.Class<?> wildcardClass2 = composite1.getClass();
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test095");
        examples.Composite composite1 = new examples.Composite(100);
        examples.Composite composite3 = new examples.Composite((-100));
        examples.Composite composite5 = new examples.Composite((-3));
        composite3.addChild(composite5);
        java.util.Set<examples.Composite> compositeSet7 = composite5.children();
        java.util.Set<examples.Composite> compositeSet8 = composite5.children();
        examples.Composite composite10 = new examples.Composite((-9));
        composite5.addChild(composite10);
        java.util.Set<examples.Composite> compositeSet12 = composite10.children();
        java.util.Set<examples.Composite> compositeSet13 = composite10.children();
        examples.Composite composite15 = new examples.Composite((int) (byte) 0);
        java.util.Set<examples.Composite> compositeSet16 = composite15.children();
        composite10.addChild(composite15);
        examples.Composite composite19 = new examples.Composite((-7));
        java.util.Set<examples.Composite> compositeSet20 = composite19.children();
        composite15.addChild(composite19);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test096");
        examples.Composite composite1 = new examples.Composite((int) ' ');
        examples.Composite composite3 = new examples.Composite((-100));
        examples.Composite composite5 = new examples.Composite((-3));
        composite3.addChild(composite5);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test097");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite1.children();
        java.lang.Class<?> wildcardClass6 = compositeSet5.getClass();
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test098");
        examples.Composite composite1 = new examples.Composite((int) (short) -1);
        examples.Composite composite3 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        java.lang.Class<?> wildcardClass7 = compositeSet6.getClass();
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test099");
        examples.Composite composite1 = new examples.Composite((-9));
        examples.Composite composite2 = null;
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test100");
        examples.Composite composite1 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        examples.Composite composite5 = new examples.Composite((-100));
        examples.Composite composite7 = new examples.Composite((-3));
        composite5.addChild(composite7);
        java.util.Set<examples.Composite> compositeSet9 = composite7.children();
        java.util.Set<examples.Composite> compositeSet10 = composite7.children();
        examples.Composite composite12 = new examples.Composite((-9));
        composite7.addChild(composite12);
        java.util.Set<examples.Composite> compositeSet14 = composite12.children();
        examples.Composite composite16 = new examples.Composite((int) '4');
        composite12.addChild(composite16);
        examples.Composite composite19 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet20 = composite19.children();
        composite12.addChild(composite19);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test101");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        examples.Composite composite8 = new examples.Composite((-9));
        composite3.addChild(composite8);
        java.util.Set<examples.Composite> compositeSet10 = composite8.children();
        examples.Composite composite12 = new examples.Composite((int) '4');
        composite8.addChild(composite12);
        examples.Composite composite15 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet16 = composite15.children();
        java.util.Set<examples.Composite> compositeSet17 = composite15.children();
        composite12.addChild(composite15);
        examples.Composite composite20 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet21 = composite20.children();
        composite12.addChild(composite20);
        java.util.Set<examples.Composite> compositeSet23 = composite12.children();
        java.util.Set<examples.Composite> compositeSet24 = composite12.children();
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test102");
        examples.Composite composite1 = new examples.Composite((-2));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        java.util.Set<examples.Composite> compositeSet6 = composite4.children();
        composite1.addChild(composite4);
        examples.Composite composite9 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet10 = composite9.children();
        composite1.addChild(composite9);
        java.lang.Class<?> wildcardClass12 = composite1.getClass();
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test103");
        examples.Composite composite1 = new examples.Composite(5);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        examples.Composite composite7 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet8 = composite7.children();
        composite4.addChild(composite7);
        java.util.Set<examples.Composite> compositeSet10 = composite4.children();
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test104");
        examples.Composite composite1 = new examples.Composite(5);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.lang.Class<?> wildcardClass4 = compositeSet3.getClass();
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test105");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        examples.Composite composite8 = new examples.Composite((-9));
        composite3.addChild(composite8);
        java.util.Set<examples.Composite> compositeSet10 = composite8.children();
        examples.Composite composite12 = new examples.Composite((int) '4');
        composite8.addChild(composite12);
        examples.Composite composite15 = new examples.Composite((-100));
        examples.Composite composite17 = new examples.Composite((-3));
        composite15.addChild(composite17);
        java.util.Set<examples.Composite> compositeSet19 = composite17.children();
        java.util.Set<examples.Composite> compositeSet20 = composite17.children();
        examples.Composite composite22 = new examples.Composite((-9));
        composite17.addChild(composite22);
        java.util.Set<examples.Composite> compositeSet24 = composite22.children();
        // The following exception was thrown during execution in test generation
        try {
            composite8.addChild(composite22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test106");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        java.util.Set<examples.Composite> compositeSet7 = composite3.children();
        java.util.Set<examples.Composite> compositeSet8 = composite3.children();
        java.util.Set<examples.Composite> compositeSet9 = composite3.children();
        java.util.Set<examples.Composite> compositeSet10 = composite3.children();
        java.util.Set<examples.Composite> compositeSet11 = composite3.children();
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test107");
        examples.Composite composite1 = new examples.Composite((-2));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        java.util.Set<examples.Composite> compositeSet6 = composite4.children();
        composite1.addChild(composite4);
        java.util.Set<examples.Composite> compositeSet8 = composite4.children();
        examples.Composite composite10 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet11 = composite10.children();
        composite4.addChild(composite10);
        java.lang.Class<?> wildcardClass13 = composite10.getClass();
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test108");
        examples.Composite composite1 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        examples.Composite composite6 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        java.util.Set<examples.Composite> compositeSet8 = composite6.children();
        composite1.addChild(composite6);
        examples.Composite composite11 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet12 = composite11.children();
        java.util.Set<examples.Composite> compositeSet13 = composite11.children();
        java.util.Set<examples.Composite> compositeSet14 = composite11.children();
        composite1.addChild(composite11);
        java.util.Set<examples.Composite> compositeSet16 = composite1.children();
        examples.Composite composite18 = new examples.Composite((-100));
        examples.Composite composite20 = new examples.Composite((-3));
        composite18.addChild(composite20);
        java.util.Set<examples.Composite> compositeSet22 = composite20.children();
        java.util.Set<examples.Composite> compositeSet23 = composite20.children();
        examples.Composite composite25 = new examples.Composite((-9));
        composite20.addChild(composite25);
        java.util.Set<examples.Composite> compositeSet27 = composite25.children();
        java.util.Set<examples.Composite> compositeSet28 = composite25.children();
        examples.Composite composite30 = new examples.Composite((int) (byte) 0);
        java.util.Set<examples.Composite> compositeSet31 = composite30.children();
        composite25.addChild(composite30);
        examples.Composite composite34 = new examples.Composite((-7));
        java.util.Set<examples.Composite> compositeSet35 = composite34.children();
        composite30.addChild(composite34);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test109");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite1.children();
        examples.Composite composite7 = new examples.Composite((-100));
        examples.Composite composite9 = new examples.Composite((-3));
        composite7.addChild(composite9);
        java.util.Set<examples.Composite> compositeSet11 = composite9.children();
        java.util.Set<examples.Composite> compositeSet12 = composite9.children();
        java.util.Set<examples.Composite> compositeSet13 = composite9.children();
        java.util.Set<examples.Composite> compositeSet14 = composite9.children();
        examples.Composite composite16 = new examples.Composite((int) (short) 0);
        composite9.addChild(composite16);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test110");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        examples.Composite composite8 = new examples.Composite((-9));
        composite3.addChild(composite8);
        java.util.Set<examples.Composite> compositeSet10 = composite8.children();
        examples.Composite composite12 = new examples.Composite((int) '4');
        composite8.addChild(composite12);
        examples.Composite composite15 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet16 = composite15.children();
        java.util.Set<examples.Composite> compositeSet17 = composite15.children();
        composite12.addChild(composite15);
        examples.Composite composite20 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet21 = composite20.children();
        composite12.addChild(composite20);
        examples.Composite composite24 = new examples.Composite((int) '4');
        examples.Composite composite26 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet27 = composite26.children();
        java.util.Set<examples.Composite> compositeSet28 = composite26.children();
        composite24.addChild(composite26);
        java.util.Set<examples.Composite> compositeSet30 = composite26.children();
        // The following exception was thrown during execution in test generation
        try {
            composite12.addChild(composite26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test111");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        examples.Composite composite7 = new examples.Composite((-9));
        composite3.addChild(composite7);
        java.util.Set<examples.Composite> compositeSet9 = composite7.children();
        java.lang.Class<?> wildcardClass10 = composite7.getClass();
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test112");
        examples.Composite composite1 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        examples.Composite composite6 = new examples.Composite(3);
        composite1.addChild(composite6);
        java.util.Set<examples.Composite> compositeSet8 = composite6.children();
        java.lang.Class<?> wildcardClass9 = compositeSet8.getClass();
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test113");
        examples.Composite composite1 = new examples.Composite((int) (byte) 1);
        examples.Composite composite3 = new examples.Composite(2);
        composite1.addChild(composite3);
        java.lang.Class<?> wildcardClass5 = composite1.getClass();
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test114");
        examples.Composite composite1 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        composite1.addChild(composite4);
        java.util.Set<examples.Composite> compositeSet7 = composite1.children();
        java.lang.Class<?> wildcardClass8 = composite1.getClass();
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test115");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        examples.Composite composite7 = new examples.Composite((-9));
        composite3.addChild(composite7);
        examples.Composite composite10 = new examples.Composite((-100));
        examples.Composite composite12 = new examples.Composite((-3));
        composite10.addChild(composite12);
        java.util.Set<examples.Composite> compositeSet14 = composite12.children();
        java.util.Set<examples.Composite> compositeSet15 = composite12.children();
        java.util.Set<examples.Composite> compositeSet16 = composite12.children();
        java.util.Set<examples.Composite> compositeSet17 = composite12.children();
        // The following exception was thrown during execution in test generation
        try {
            composite7.addChild(composite12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test116");
        examples.Composite composite1 = new examples.Composite((int) '4');
        examples.Composite composite3 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet7 = composite3.children();
        examples.Composite composite9 = new examples.Composite((-2));
        java.util.Set<examples.Composite> compositeSet10 = composite9.children();
        examples.Composite composite12 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet13 = composite12.children();
        java.util.Set<examples.Composite> compositeSet14 = composite12.children();
        composite9.addChild(composite12);
        // The following exception was thrown during execution in test generation
        try {
            composite3.addChild(composite12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test117");
        examples.Composite composite1 = new examples.Composite((-2));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        java.util.Set<examples.Composite> compositeSet6 = composite4.children();
        composite1.addChild(composite4);
        examples.Composite composite9 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet10 = composite9.children();
        composite1.addChild(composite9);
        examples.Composite composite12 = null;
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test118");
        examples.Composite composite1 = new examples.Composite((-2));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.lang.Class<?> wildcardClass3 = composite1.getClass();
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test119");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        examples.Composite composite6 = new examples.Composite((-8));
        composite1.addChild(composite6);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test120");
        examples.Composite composite1 = new examples.Composite((-2));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.lang.Class<?> wildcardClass4 = composite1.getClass();
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test121");
        examples.Composite composite1 = new examples.Composite((-10));
        examples.Composite composite3 = new examples.Composite((-100));
        examples.Composite composite5 = new examples.Composite((-3));
        composite3.addChild(composite5);
        examples.Composite composite8 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet9 = composite8.children();
        java.util.Set<examples.Composite> compositeSet10 = composite8.children();
        java.util.Set<examples.Composite> compositeSet11 = composite8.children();
        composite3.addChild(composite8);
        java.util.Set<examples.Composite> compositeSet13 = composite8.children();
        java.util.Set<examples.Composite> compositeSet14 = composite8.children();
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test122");
        examples.Composite composite1 = new examples.Composite((int) ' ');
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((int) (byte) 1);
        examples.Composite composite6 = new examples.Composite(2);
        composite4.addChild(composite6);
        java.util.Set<examples.Composite> compositeSet8 = composite4.children();
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test123");
        examples.Composite composite1 = new examples.Composite((int) (byte) 1);
        examples.Composite composite3 = new examples.Composite(2);
        composite1.addChild(composite3);
        examples.Composite composite6 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        java.util.Set<examples.Composite> compositeSet8 = composite6.children();
        composite3.addChild(composite6);
        java.util.Set<examples.Composite> compositeSet10 = composite6.children();
        java.util.Set<examples.Composite> compositeSet11 = composite6.children();
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test124");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        java.util.Set<examples.Composite> compositeSet7 = composite3.children();
        java.util.Set<examples.Composite> compositeSet8 = composite3.children();
        java.util.Set<examples.Composite> compositeSet9 = composite3.children();
        java.lang.Class<?> wildcardClass10 = composite3.getClass();
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test125");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        examples.Composite composite8 = new examples.Composite((-9));
        composite3.addChild(composite8);
        java.util.Set<examples.Composite> compositeSet10 = composite8.children();
        examples.Composite composite12 = new examples.Composite((int) '4');
        composite8.addChild(composite12);
        java.util.Set<examples.Composite> compositeSet14 = composite8.children();
        java.lang.Class<?> wildcardClass15 = composite8.getClass();
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test126");
        examples.Composite composite1 = new examples.Composite(2);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        examples.Composite composite5 = new examples.Composite(0);
        composite1.addChild(composite5);
        java.lang.Class<?> wildcardClass7 = composite5.getClass();
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test127");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        java.util.Set<examples.Composite> compositeSet7 = composite3.children();
        java.util.Set<examples.Composite> compositeSet8 = composite3.children();
        examples.Composite composite10 = new examples.Composite((-9));
        examples.Composite composite12 = new examples.Composite((int) (byte) 1);
        composite10.addChild(composite12);
        // The following exception was thrown during execution in test generation
        try {
            composite3.addChild(composite12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test128");
        examples.Composite composite1 = new examples.Composite((-2));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        java.util.Set<examples.Composite> compositeSet6 = composite4.children();
        composite1.addChild(composite4);
        java.util.Set<examples.Composite> compositeSet8 = composite4.children();
        examples.Composite composite10 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet11 = composite10.children();
        composite4.addChild(composite10);
        java.lang.Class<?> wildcardClass13 = composite4.getClass();
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test129");
        examples.Composite composite1 = new examples.Composite((int) '4');
        examples.Composite composite3 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        composite1.addChild(composite3);
        examples.Composite composite8 = new examples.Composite((-6));
        java.util.Set<examples.Composite> compositeSet9 = composite8.children();
        composite1.addChild(composite8);
        examples.Composite composite12 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet13 = composite12.children();
        java.util.Set<examples.Composite> compositeSet14 = composite12.children();
        java.util.Set<examples.Composite> compositeSet15 = composite12.children();
        examples.Composite composite17 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet18 = composite17.children();
        java.util.Set<examples.Composite> compositeSet19 = composite17.children();
        composite12.addChild(composite17);
        examples.Composite composite22 = new examples.Composite((-8));
        composite12.addChild(composite22);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test130");
        examples.Composite composite1 = new examples.Composite((-6));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.lang.Class<?> wildcardClass4 = compositeSet3.getClass();
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test131");
        examples.Composite composite1 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        examples.Composite composite6 = new examples.Composite(9);
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        composite1.addChild(composite6);
        java.util.Set<examples.Composite> compositeSet9 = composite1.children();
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test132");
        examples.Composite composite1 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite(2);
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        java.util.Set<examples.Composite> compositeSet6 = composite4.children();
        composite1.addChild(composite4);
        java.util.Set<examples.Composite> compositeSet8 = composite1.children();
        examples.Composite composite10 = new examples.Composite(4);
        composite1.addChild(composite10);
        java.lang.Class<?> wildcardClass12 = composite10.getClass();
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test133");
        examples.Composite composite1 = new examples.Composite((int) (short) 100);
        java.lang.Class<?> wildcardClass2 = composite1.getClass();
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test134");
        examples.Composite composite1 = new examples.Composite((int) (byte) 100);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.lang.Class<?> wildcardClass4 = compositeSet3.getClass();
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test135");
        examples.Composite composite1 = new examples.Composite((-2));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        java.util.Set<examples.Composite> compositeSet6 = composite4.children();
        composite1.addChild(composite4);
        java.util.Set<examples.Composite> compositeSet8 = composite4.children();
        examples.Composite composite10 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet11 = composite10.children();
        composite4.addChild(composite10);
        examples.Composite composite14 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet15 = composite14.children();
        java.util.Set<examples.Composite> compositeSet16 = composite14.children();
        java.util.Set<examples.Composite> compositeSet17 = composite14.children();
        examples.Composite composite19 = new examples.Composite(3);
        composite14.addChild(composite19);
        // The following exception was thrown during execution in test generation
        try {
            composite10.addChild(composite19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test136");
        examples.Composite composite1 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite(8);
        composite1.addChild(composite4);
        java.util.Set<examples.Composite> compositeSet6 = composite4.children();
        java.lang.Class<?> wildcardClass7 = compositeSet6.getClass();
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test137");
        examples.Composite composite1 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite(8);
        composite1.addChild(composite4);
        examples.Composite composite7 = new examples.Composite((-100));
        examples.Composite composite9 = new examples.Composite((-3));
        composite7.addChild(composite9);
        java.util.Set<examples.Composite> compositeSet11 = composite9.children();
        java.util.Set<examples.Composite> compositeSet12 = composite9.children();
        examples.Composite composite14 = new examples.Composite((-9));
        composite9.addChild(composite14);
        java.util.Set<examples.Composite> compositeSet16 = composite14.children();
        // The following exception was thrown during execution in test generation
        try {
            composite4.addChild(composite14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test138");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        examples.Composite composite6 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        java.util.Set<examples.Composite> compositeSet8 = composite6.children();
        java.util.Set<examples.Composite> compositeSet9 = composite6.children();
        composite1.addChild(composite6);
        java.util.Set<examples.Composite> compositeSet11 = composite1.children();
        examples.Composite composite13 = new examples.Composite((int) (byte) 1);
        examples.Composite composite15 = new examples.Composite(2);
        composite13.addChild(composite15);
        examples.Composite composite18 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet19 = composite18.children();
        java.util.Set<examples.Composite> compositeSet20 = composite18.children();
        composite15.addChild(composite18);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test139");
        examples.Composite composite1 = new examples.Composite((int) (short) -1);
        examples.Composite composite3 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet6 = composite1.children();
        java.util.Set<examples.Composite> compositeSet7 = composite1.children();
        examples.Composite composite9 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet10 = composite9.children();
        examples.Composite composite12 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet13 = composite12.children();
        composite9.addChild(composite12);
        examples.Composite composite16 = new examples.Composite((-3));
        composite12.addChild(composite16);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test140");
        examples.Composite composite1 = new examples.Composite((-2));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        examples.Composite composite5 = new examples.Composite((-100));
        examples.Composite composite7 = new examples.Composite((-3));
        composite5.addChild(composite7);
        java.util.Set<examples.Composite> compositeSet9 = composite7.children();
        examples.Composite composite11 = new examples.Composite((-9));
        composite7.addChild(composite11);
        java.util.Set<examples.Composite> compositeSet13 = composite11.children();
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test141");
        examples.Composite composite1 = new examples.Composite(0);
        examples.Composite composite3 = new examples.Composite((int) (short) 1);
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite1.children();
        java.lang.Class<?> wildcardClass6 = compositeSet5.getClass();
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test142");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite1.children();
        examples.Composite composite7 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet8 = composite7.children();
        java.util.Set<examples.Composite> compositeSet9 = composite7.children();
        java.util.Set<examples.Composite> compositeSet10 = composite7.children();
        examples.Composite composite12 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet13 = composite12.children();
        java.util.Set<examples.Composite> compositeSet14 = composite12.children();
        composite7.addChild(composite12);
        examples.Composite composite17 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet18 = composite17.children();
        java.util.Set<examples.Composite> compositeSet19 = composite17.children();
        java.util.Set<examples.Composite> compositeSet20 = composite17.children();
        composite7.addChild(composite17);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test143");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        examples.Composite composite8 = new examples.Composite(4);
        composite3.addChild(composite8);
        java.lang.Class<?> wildcardClass10 = composite8.getClass();
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test144");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        examples.Composite composite8 = new examples.Composite((-9));
        composite3.addChild(composite8);
        java.util.Set<examples.Composite> compositeSet10 = composite3.children();
        java.util.Set<examples.Composite> compositeSet11 = composite3.children();
        java.lang.Class<?> wildcardClass12 = composite3.getClass();
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test145");
        examples.Composite composite1 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        examples.Composite composite6 = new examples.Composite(3);
        composite1.addChild(composite6);
        examples.Composite composite9 = new examples.Composite((-100));
        examples.Composite composite11 = new examples.Composite((-3));
        composite9.addChild(composite11);
        java.util.Set<examples.Composite> compositeSet13 = composite11.children();
        java.util.Set<examples.Composite> compositeSet14 = composite11.children();
        examples.Composite composite16 = new examples.Composite((-9));
        composite11.addChild(composite16);
        java.util.Set<examples.Composite> compositeSet18 = composite11.children();
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test146");
        examples.Composite composite1 = new examples.Composite((-4));
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test147");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        examples.Composite composite6 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        java.util.Set<examples.Composite> compositeSet8 = composite6.children();
        java.util.Set<examples.Composite> compositeSet9 = composite6.children();
        composite1.addChild(composite6);
        java.util.Set<examples.Composite> compositeSet11 = composite6.children();
        java.lang.Class<?> wildcardClass12 = composite6.getClass();
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test148");
        examples.Composite composite1 = new examples.Composite(6);
        examples.Composite composite3 = new examples.Composite((-5));
        examples.Composite composite5 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet6 = composite5.children();
        composite3.addChild(composite5);
        java.util.Set<examples.Composite> compositeSet8 = composite5.children();
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test149");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        examples.Composite composite8 = new examples.Composite((-9));
        composite3.addChild(composite8);
        java.util.Set<examples.Composite> compositeSet10 = composite8.children();
        examples.Composite composite12 = new examples.Composite((int) '4');
        composite8.addChild(composite12);
        examples.Composite composite15 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet16 = composite15.children();
        composite8.addChild(composite15);
        java.lang.Class<?> wildcardClass18 = composite15.getClass();
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test150");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        java.util.Set<examples.Composite> compositeSet7 = composite3.children();
        java.util.Set<examples.Composite> compositeSet8 = composite3.children();
        examples.Composite composite10 = new examples.Composite((int) (short) 0);
        composite3.addChild(composite10);
        java.lang.Class<?> wildcardClass12 = composite10.getClass();
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test151");
        examples.Composite composite1 = new examples.Composite(2);
        examples.Composite composite3 = new examples.Composite((-7));
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        composite1.addChild(composite3);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test152");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        examples.Composite composite8 = new examples.Composite(4);
        composite3.addChild(composite8);
        java.util.Set<examples.Composite> compositeSet10 = composite8.children();
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test153");
        examples.Composite composite1 = new examples.Composite(10);
        java.lang.Class<?> wildcardClass2 = composite1.getClass();
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test154");
        examples.Composite composite1 = new examples.Composite((int) (byte) 0);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        examples.Composite composite5 = new examples.Composite((-100));
        examples.Composite composite7 = new examples.Composite((-3));
        composite5.addChild(composite7);
        examples.Composite composite10 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet11 = composite10.children();
        java.util.Set<examples.Composite> compositeSet12 = composite10.children();
        java.util.Set<examples.Composite> compositeSet13 = composite10.children();
        composite5.addChild(composite10);
        java.util.Set<examples.Composite> compositeSet15 = composite5.children();
        java.util.Set<examples.Composite> compositeSet16 = composite5.children();
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test155");
        examples.Composite composite1 = new examples.Composite(9);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.lang.Class<?> wildcardClass3 = composite1.getClass();
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test156");
        examples.Composite composite1 = new examples.Composite((int) (short) 100);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.lang.Class<?> wildcardClass3 = composite1.getClass();
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test157");
        examples.Composite composite1 = new examples.Composite((-10));
        java.lang.Class<?> wildcardClass2 = composite1.getClass();
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test158");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        examples.Composite composite8 = new examples.Composite((-9));
        composite3.addChild(composite8);
        java.util.Set<examples.Composite> compositeSet10 = composite8.children();
        java.util.Set<examples.Composite> compositeSet11 = composite8.children();
        examples.Composite composite13 = new examples.Composite((int) (byte) 0);
        java.util.Set<examples.Composite> compositeSet14 = composite13.children();
        composite8.addChild(composite13);
        examples.Composite composite16 = null;
        // The following exception was thrown during execution in test generation
        try {
            composite13.addChild(composite16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test159");
        examples.Composite composite1 = new examples.Composite((int) (short) 10);
        examples.Composite composite3 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        examples.Composite composite6 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        composite3.addChild(composite6);
        examples.Composite composite10 = new examples.Composite((-2));
        composite3.addChild(composite10);
        java.util.Set<examples.Composite> compositeSet12 = composite10.children();
        java.util.Set<examples.Composite> compositeSet13 = composite10.children();
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test160");
        examples.Composite composite1 = new examples.Composite((-2));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        java.util.Set<examples.Composite> compositeSet6 = composite4.children();
        composite1.addChild(composite4);
        java.util.Set<examples.Composite> compositeSet8 = composite4.children();
        examples.Composite composite10 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet11 = composite10.children();
        composite4.addChild(composite10);
        java.util.Set<examples.Composite> compositeSet13 = composite4.children();
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test161");
        examples.Composite composite1 = new examples.Composite((int) (short) -1);
        examples.Composite composite3 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet6 = composite1.children();
        java.util.Set<examples.Composite> compositeSet7 = composite1.children();
        java.lang.Class<?> wildcardClass8 = compositeSet7.getClass();
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test162");
        examples.Composite composite1 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        composite1.addChild(composite4);
        examples.Composite composite8 = new examples.Composite((-2));
        composite1.addChild(composite8);
        java.util.Set<examples.Composite> compositeSet10 = composite8.children();
        examples.Composite composite12 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet13 = composite12.children();
        composite8.addChild(composite12);
        java.lang.Class<?> wildcardClass15 = composite12.getClass();
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test163");
        examples.Composite composite1 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        java.lang.Class<?> wildcardClass5 = composite1.getClass();
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test164");
        examples.Composite composite1 = new examples.Composite((int) '#');
        examples.Composite composite3 = new examples.Composite((int) (short) -1);
        examples.Composite composite5 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet6 = composite5.children();
        composite3.addChild(composite5);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test165");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        examples.Composite composite8 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet9 = composite8.children();
        java.util.Set<examples.Composite> compositeSet10 = composite8.children();
        java.util.Set<examples.Composite> compositeSet11 = composite8.children();
        examples.Composite composite13 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet14 = composite13.children();
        java.util.Set<examples.Composite> compositeSet15 = composite13.children();
        composite8.addChild(composite13);
        examples.Composite composite18 = new examples.Composite((-8));
        composite8.addChild(composite18);
        // The following exception was thrown during execution in test generation
        try {
            composite3.addChild(composite18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test166");
        examples.Composite composite1 = new examples.Composite((-7));
        java.lang.Class<?> wildcardClass2 = composite1.getClass();
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test167");
        examples.Composite composite1 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        examples.Composite composite5 = new examples.Composite((-6));
        composite1.addChild(composite5);
        examples.Composite composite8 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet9 = composite8.children();
        examples.Composite composite11 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet12 = composite11.children();
        composite8.addChild(composite11);
        examples.Composite composite15 = new examples.Composite((-3));
        composite11.addChild(composite15);
        // The following exception was thrown during execution in test generation
        try {
            composite5.addChild(composite15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test168");
        examples.Composite composite1 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite(8);
        composite1.addChild(composite4);
        examples.Composite composite7 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet8 = composite7.children();
        examples.Composite composite10 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet11 = composite10.children();
        composite7.addChild(composite10);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test169");
        examples.Composite composite1 = new examples.Composite((int) (short) -1);
        examples.Composite composite3 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        composite1.addChild(composite3);
        examples.Composite composite7 = new examples.Composite(2);
        java.util.Set<examples.Composite> compositeSet8 = composite7.children();
        java.util.Set<examples.Composite> compositeSet9 = composite7.children();
        composite1.addChild(composite7);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test170");
        examples.Composite composite1 = new examples.Composite((-8));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.lang.Class<?> wildcardClass3 = compositeSet2.getClass();
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test171");
        examples.Composite composite1 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        examples.Composite composite6 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        java.util.Set<examples.Composite> compositeSet8 = composite6.children();
        composite1.addChild(composite6);
        examples.Composite composite11 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet12 = composite11.children();
        java.util.Set<examples.Composite> compositeSet13 = composite11.children();
        java.util.Set<examples.Composite> compositeSet14 = composite11.children();
        composite1.addChild(composite11);
        java.util.Set<examples.Composite> compositeSet16 = composite1.children();
        examples.Composite composite18 = new examples.Composite((-100));
        examples.Composite composite20 = new examples.Composite((-3));
        composite18.addChild(composite20);
        examples.Composite composite23 = new examples.Composite((-6));
        composite18.addChild(composite23);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test172");
        examples.Composite composite1 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        examples.Composite composite6 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        java.util.Set<examples.Composite> compositeSet8 = composite6.children();
        composite1.addChild(composite6);
        examples.Composite composite11 = new examples.Composite((-8));
        composite1.addChild(composite11);
        examples.Composite composite14 = new examples.Composite((-100));
        examples.Composite composite16 = new examples.Composite((-3));
        composite14.addChild(composite16);
        java.util.Set<examples.Composite> compositeSet18 = composite16.children();
        java.util.Set<examples.Composite> compositeSet19 = composite16.children();
        examples.Composite composite21 = new examples.Composite(4);
        composite16.addChild(composite21);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test173");
        examples.Composite composite1 = new examples.Composite((int) (short) 100);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.lang.Class<?> wildcardClass3 = compositeSet2.getClass();
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test174");
        examples.Composite composite1 = new examples.Composite((-7));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        examples.Composite composite7 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet8 = composite7.children();
        composite4.addChild(composite7);
        examples.Composite composite11 = new examples.Composite((-2));
        composite4.addChild(composite11);
        java.util.Set<examples.Composite> compositeSet13 = composite11.children();
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test175");
        examples.Composite composite1 = new examples.Composite((int) (byte) 0);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.lang.Class<?> wildcardClass3 = composite1.getClass();
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test176");
        examples.Composite composite1 = new examples.Composite(2);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((int) ' ');
        composite1.addChild(composite4);
        java.lang.Class<?> wildcardClass6 = composite1.getClass();
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test177");
        examples.Composite composite1 = new examples.Composite(5);
        examples.Composite composite3 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet7 = composite3.children();
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test178");
        examples.Composite composite1 = new examples.Composite(100);
        java.lang.Class<?> wildcardClass2 = composite1.getClass();
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test179");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        java.util.Set<examples.Composite> compositeSet7 = composite3.children();
        java.util.Set<examples.Composite> compositeSet8 = composite3.children();
        examples.Composite composite10 = new examples.Composite((int) (short) 0);
        composite3.addChild(composite10);
        java.util.Set<examples.Composite> compositeSet12 = composite3.children();
        java.util.Set<examples.Composite> compositeSet13 = composite3.children();
        examples.Composite composite15 = new examples.Composite((-100));
        examples.Composite composite17 = new examples.Composite((-3));
        composite15.addChild(composite17);
        java.util.Set<examples.Composite> compositeSet19 = composite17.children();
        java.util.Set<examples.Composite> compositeSet20 = composite17.children();
        examples.Composite composite22 = new examples.Composite((-9));
        composite17.addChild(composite22);
        java.util.Set<examples.Composite> compositeSet24 = composite22.children();
        java.util.Set<examples.Composite> compositeSet25 = composite22.children();
        examples.Composite composite27 = new examples.Composite((int) (byte) 0);
        java.util.Set<examples.Composite> compositeSet28 = composite27.children();
        composite22.addChild(composite27);
        examples.Composite composite31 = new examples.Composite((-7));
        java.util.Set<examples.Composite> compositeSet32 = composite31.children();
        composite27.addChild(composite31);
        // The following exception was thrown during execution in test generation
        try {
            composite3.addChild(composite27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test180");
        examples.Composite composite1 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        examples.Composite composite6 = new examples.Composite(3);
        composite1.addChild(composite6);
        examples.Composite composite9 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet10 = composite9.children();
        java.util.Set<examples.Composite> compositeSet11 = composite9.children();
        java.util.Set<examples.Composite> compositeSet12 = composite9.children();
        composite1.addChild(composite9);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test181");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        examples.Composite composite7 = new examples.Composite((-9));
        composite3.addChild(composite7);
        examples.Composite composite10 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet11 = composite10.children();
        examples.Composite composite13 = new examples.Composite(8);
        composite10.addChild(composite13);
        java.util.Set<examples.Composite> compositeSet15 = composite13.children();
        // The following exception was thrown during execution in test generation
        try {
            composite7.addChild(composite13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test182");
        examples.Composite composite1 = new examples.Composite(3);
        examples.Composite composite3 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        composite1.addChild(composite3);
        examples.Composite composite7 = new examples.Composite((-100));
        examples.Composite composite9 = new examples.Composite((-3));
        composite7.addChild(composite9);
        examples.Composite composite12 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet13 = composite12.children();
        java.util.Set<examples.Composite> compositeSet14 = composite12.children();
        java.util.Set<examples.Composite> compositeSet15 = composite12.children();
        composite7.addChild(composite12);
        java.util.Set<examples.Composite> compositeSet17 = composite7.children();
        java.util.Set<examples.Composite> compositeSet18 = composite7.children();
        // The following exception was thrown during execution in test generation
        try {
            composite3.addChild(composite7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test183");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-10));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test184");
        examples.Composite composite1 = new examples.Composite((int) (byte) 100);
        java.lang.Class<?> wildcardClass2 = composite1.getClass();
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test185");
        examples.Composite composite1 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        composite1.addChild(composite4);
        examples.Composite composite8 = new examples.Composite((-2));
        composite1.addChild(composite8);
        java.util.Set<examples.Composite> compositeSet10 = composite8.children();
        java.lang.Class<?> wildcardClass11 = compositeSet10.getClass();
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test186");
        examples.Composite composite1 = new examples.Composite((-8));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.lang.Class<?> wildcardClass3 = composite1.getClass();
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test187");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        examples.Composite composite8 = new examples.Composite((-9));
        composite3.addChild(composite8);
        java.util.Set<examples.Composite> compositeSet10 = composite8.children();
        java.util.Set<examples.Composite> compositeSet11 = composite8.children();
        examples.Composite composite13 = new examples.Composite((int) (byte) 0);
        java.util.Set<examples.Composite> compositeSet14 = composite13.children();
        composite8.addChild(composite13);
        examples.Composite composite17 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet18 = composite17.children();
        examples.Composite composite20 = new examples.Composite(2);
        java.util.Set<examples.Composite> compositeSet21 = composite20.children();
        java.util.Set<examples.Composite> compositeSet22 = composite20.children();
        composite17.addChild(composite20);
        java.util.Set<examples.Composite> compositeSet24 = composite17.children();
        examples.Composite composite26 = new examples.Composite(4);
        composite17.addChild(composite26);
        // The following exception was thrown during execution in test generation
        try {
            composite13.addChild(composite26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test188");
        examples.Composite composite1 = new examples.Composite((int) (short) 1);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.lang.Class<?> wildcardClass3 = compositeSet2.getClass();
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test189");
        examples.Composite composite1 = new examples.Composite((-7));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.lang.Class<?> wildcardClass3 = compositeSet2.getClass();
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test190");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        examples.Composite composite8 = new examples.Composite(4);
        composite3.addChild(composite8);
        examples.Composite composite11 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet12 = composite11.children();
        java.util.Set<examples.Composite> compositeSet13 = composite11.children();
        java.util.Set<examples.Composite> compositeSet14 = composite11.children();
        examples.Composite composite16 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet17 = composite16.children();
        java.util.Set<examples.Composite> compositeSet18 = composite16.children();
        composite11.addChild(composite16);
        examples.Composite composite21 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet22 = composite21.children();
        java.util.Set<examples.Composite> compositeSet23 = composite21.children();
        java.util.Set<examples.Composite> compositeSet24 = composite21.children();
        composite11.addChild(composite21);
        java.util.Set<examples.Composite> compositeSet26 = composite11.children();
        // The following exception was thrown during execution in test generation
        try {
            composite8.addChild(composite11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test191");
        examples.Composite composite1 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        examples.Composite composite5 = new examples.Composite((-6));
        composite1.addChild(composite5);
        java.util.Set<examples.Composite> compositeSet7 = composite5.children();
        java.lang.Class<?> wildcardClass8 = composite5.getClass();
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test192");
        examples.Composite composite1 = new examples.Composite((int) (byte) 0);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        examples.Composite composite5 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet6 = composite5.children();
        examples.Composite composite8 = new examples.Composite(8);
        composite5.addChild(composite8);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test193");
        examples.Composite composite1 = new examples.Composite((int) '4');
        examples.Composite composite3 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet7 = composite3.children();
        examples.Composite composite9 = new examples.Composite((-5));
        composite3.addChild(composite9);
        examples.Composite composite12 = new examples.Composite(6);
        composite9.addChild(composite12);
        examples.Composite composite15 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet16 = composite15.children();
        examples.Composite composite18 = new examples.Composite(8);
        composite15.addChild(composite18);
        examples.Composite composite21 = new examples.Composite((-6));
        java.util.Set<examples.Composite> compositeSet22 = composite21.children();
        composite18.addChild(composite21);
        // The following exception was thrown during execution in test generation
        try {
            composite9.addChild(composite18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test194");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        examples.Composite composite8 = new examples.Composite((-9));
        composite3.addChild(composite8);
        java.util.Set<examples.Composite> compositeSet10 = composite8.children();
        examples.Composite composite12 = new examples.Composite((int) '4');
        composite8.addChild(composite12);
        examples.Composite composite15 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet16 = composite15.children();
        java.util.Set<examples.Composite> compositeSet17 = composite15.children();
        composite12.addChild(composite15);
        examples.Composite composite20 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet21 = composite20.children();
        composite12.addChild(composite20);
        java.util.Set<examples.Composite> compositeSet23 = composite20.children();
        java.lang.Class<?> wildcardClass24 = compositeSet23.getClass();
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test195");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        examples.Composite composite6 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        java.util.Set<examples.Composite> compositeSet8 = composite6.children();
        java.util.Set<examples.Composite> compositeSet9 = composite6.children();
        composite1.addChild(composite6);
        java.util.Set<examples.Composite> compositeSet11 = composite6.children();
        java.util.Set<examples.Composite> compositeSet12 = composite6.children();
        examples.Composite composite14 = new examples.Composite((-100));
        examples.Composite composite16 = new examples.Composite((-3));
        composite14.addChild(composite16);
        java.util.Set<examples.Composite> compositeSet18 = composite16.children();
        java.util.Set<examples.Composite> compositeSet19 = composite16.children();
        examples.Composite composite21 = new examples.Composite((-9));
        composite16.addChild(composite21);
        // The following exception was thrown during execution in test generation
        try {
            composite6.addChild(composite21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test196");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        java.util.Set<examples.Composite> compositeSet7 = composite3.children();
        java.util.Set<examples.Composite> compositeSet8 = composite3.children();
        java.util.Set<examples.Composite> compositeSet9 = composite3.children();
        java.lang.Class<?> wildcardClass10 = compositeSet9.getClass();
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test197");
        examples.Composite composite1 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        examples.Composite composite6 = new examples.Composite(9);
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        composite1.addChild(composite6);
        java.lang.Class<?> wildcardClass9 = composite1.getClass();
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test198");
        examples.Composite composite1 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        composite1.addChild(composite4);
        examples.Composite composite8 = new examples.Composite((-3));
        composite4.addChild(composite8);
        examples.Composite composite11 = new examples.Composite((int) '#');
        composite4.addChild(composite11);
        java.util.Set<examples.Composite> compositeSet13 = composite11.children();
        java.util.Set<examples.Composite> compositeSet14 = composite11.children();
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test199");
        examples.Composite composite1 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        examples.Composite composite5 = new examples.Composite((-100));
        examples.Composite composite7 = new examples.Composite((-3));
        composite5.addChild(composite7);
        java.util.Set<examples.Composite> compositeSet9 = composite7.children();
        java.util.Set<examples.Composite> compositeSet10 = composite7.children();
        examples.Composite composite12 = new examples.Composite((-9));
        composite7.addChild(composite12);
        java.util.Set<examples.Composite> compositeSet14 = composite12.children();
        examples.Composite composite16 = new examples.Composite((int) '4');
        composite12.addChild(composite16);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test200");
        examples.Composite composite1 = new examples.Composite(5);
        examples.Composite composite3 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        composite1.addChild(composite3);
        examples.Composite composite8 = new examples.Composite((-100));
        examples.Composite composite10 = new examples.Composite((-3));
        composite8.addChild(composite10);
        java.util.Set<examples.Composite> compositeSet12 = composite10.children();
        java.util.Set<examples.Composite> compositeSet13 = composite10.children();
        java.util.Set<examples.Composite> compositeSet14 = composite10.children();
        java.util.Set<examples.Composite> compositeSet15 = composite10.children();
        examples.Composite composite17 = new examples.Composite((int) (short) 0);
        composite10.addChild(composite17);
        java.util.Set<examples.Composite> compositeSet19 = composite17.children();
        // The following exception was thrown during execution in test generation
        try {
            composite3.addChild(composite17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test201");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        examples.Composite composite8 = new examples.Composite((-9));
        composite3.addChild(composite8);
        java.util.Set<examples.Composite> compositeSet10 = composite8.children();
        examples.Composite composite12 = new examples.Composite((int) '4');
        composite8.addChild(composite12);
        examples.Composite composite15 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet16 = composite15.children();
        java.util.Set<examples.Composite> compositeSet17 = composite15.children();
        composite12.addChild(composite15);
        examples.Composite composite20 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet21 = composite20.children();
        composite12.addChild(composite20);
        examples.Composite composite24 = new examples.Composite((int) (short) -1);
        examples.Composite composite26 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet27 = composite26.children();
        composite24.addChild(composite26);
        java.util.Set<examples.Composite> compositeSet29 = composite24.children();
        java.util.Set<examples.Composite> compositeSet30 = composite24.children();
        // The following exception was thrown during execution in test generation
        try {
            composite20.addChild(composite24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test202");
        examples.Composite composite1 = new examples.Composite((int) '4');
        examples.Composite composite3 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        composite1.addChild(composite3);
        examples.Composite composite8 = new examples.Composite((-6));
        java.util.Set<examples.Composite> compositeSet9 = composite8.children();
        composite1.addChild(composite8);
        examples.Composite composite12 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet13 = composite12.children();
        java.util.Set<examples.Composite> compositeSet14 = composite12.children();
        java.util.Set<examples.Composite> compositeSet15 = composite12.children();
        examples.Composite composite17 = new examples.Composite(3);
        composite12.addChild(composite17);
        examples.Composite composite20 = new examples.Composite(5);
        composite17.addChild(composite20);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test203");
        examples.Composite composite1 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        examples.Composite composite6 = new examples.Composite((int) (byte) -1);
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        java.util.Set<examples.Composite> compositeSet8 = composite6.children();
        composite1.addChild(composite6);
        examples.Composite composite11 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet12 = composite11.children();
        examples.Composite composite14 = new examples.Composite((int) (byte) -1);
        java.util.Set<examples.Composite> compositeSet15 = composite14.children();
        composite11.addChild(composite14);
        java.util.Set<examples.Composite> compositeSet17 = composite11.children();
        // The following exception was thrown during execution in test generation
        try {
            composite6.addChild(composite11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test204");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-10));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite1.children();
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test205");
        examples.Composite composite1 = new examples.Composite((-2));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        java.util.Set<examples.Composite> compositeSet6 = composite4.children();
        composite1.addChild(composite4);
        java.util.Set<examples.Composite> compositeSet8 = composite4.children();
        java.util.Set<examples.Composite> compositeSet9 = composite4.children();
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test206");
        examples.Composite composite1 = new examples.Composite((int) (byte) 1);
        examples.Composite composite3 = new examples.Composite((-5));
        examples.Composite composite5 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet6 = composite5.children();
        composite3.addChild(composite5);
        java.util.Set<examples.Composite> compositeSet8 = composite5.children();
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test207");
        examples.Composite composite1 = new examples.Composite((int) (short) -1);
        examples.Composite composite3 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        examples.Composite composite8 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet9 = composite8.children();
        examples.Composite composite11 = new examples.Composite(8);
        composite8.addChild(composite11);
        examples.Composite composite14 = new examples.Composite((-6));
        java.util.Set<examples.Composite> compositeSet15 = composite14.children();
        composite11.addChild(composite14);
        // The following exception was thrown during execution in test generation
        try {
            composite3.addChild(composite14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test208");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        examples.Composite composite6 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        java.util.Set<examples.Composite> compositeSet8 = composite6.children();
        java.util.Set<examples.Composite> compositeSet9 = composite6.children();
        composite1.addChild(composite6);
        java.util.Set<examples.Composite> compositeSet11 = composite1.children();
        java.util.Set<examples.Composite> compositeSet12 = composite1.children();
        java.lang.Class<?> wildcardClass13 = compositeSet12.getClass();
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test209");
        examples.Composite composite1 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        composite1.addChild(composite4);
        examples.Composite composite8 = new examples.Composite((-2));
        composite1.addChild(composite8);
        java.util.Set<examples.Composite> compositeSet10 = composite8.children();
        examples.Composite composite12 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet13 = composite12.children();
        composite8.addChild(composite12);
        java.lang.Class<?> wildcardClass15 = composite8.getClass();
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test210");
        examples.Composite composite1 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite(8);
        composite1.addChild(composite4);
        examples.Composite composite7 = new examples.Composite((-6));
        java.util.Set<examples.Composite> compositeSet8 = composite7.children();
        composite4.addChild(composite7);
        java.lang.Class<?> wildcardClass10 = composite4.getClass();
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test211");
        examples.Composite composite1 = new examples.Composite((int) (short) -1);
        examples.Composite composite3 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet6 = composite1.children();
        java.util.Set<examples.Composite> compositeSet7 = composite1.children();
        java.util.Set<examples.Composite> compositeSet8 = composite1.children();
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test212");
        examples.Composite composite1 = new examples.Composite((int) (byte) 100);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test213");
        examples.Composite composite1 = new examples.Composite((int) (byte) 10);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test214");
        examples.Composite composite1 = new examples.Composite((-6));
        examples.Composite composite3 = new examples.Composite((-100));
        examples.Composite composite5 = new examples.Composite((-3));
        composite3.addChild(composite5);
        java.util.Set<examples.Composite> compositeSet7 = composite5.children();
        java.util.Set<examples.Composite> compositeSet8 = composite5.children();
        examples.Composite composite10 = new examples.Composite((-9));
        composite5.addChild(composite10);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test215");
        examples.Composite composite1 = new examples.Composite((int) (byte) 1);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.lang.Class<?> wildcardClass3 = composite1.getClass();
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test216");
        examples.Composite composite1 = new examples.Composite(1);
        java.lang.Class<?> wildcardClass2 = composite1.getClass();
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test217");
        examples.Composite composite1 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        composite1.addChild(composite4);
        examples.Composite composite8 = new examples.Composite((-3));
        composite4.addChild(composite8);
        examples.Composite composite11 = new examples.Composite((int) '#');
        composite4.addChild(composite11);
        examples.Composite composite14 = new examples.Composite((-100));
        examples.Composite composite16 = new examples.Composite((-3));
        composite14.addChild(composite16);
        java.util.Set<examples.Composite> compositeSet18 = composite16.children();
        java.util.Set<examples.Composite> compositeSet19 = composite16.children();
        java.util.Set<examples.Composite> compositeSet20 = composite16.children();
        java.util.Set<examples.Composite> compositeSet21 = composite16.children();
        examples.Composite composite23 = new examples.Composite((int) (short) 0);
        composite16.addChild(composite23);
        // The following exception was thrown during execution in test generation
        try {
            composite4.addChild(composite16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test218");
        examples.Composite composite1 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        composite1.addChild(composite4);
        examples.Composite composite8 = new examples.Composite((-3));
        composite4.addChild(composite8);
        java.util.Set<examples.Composite> compositeSet10 = composite8.children();
        java.util.Set<examples.Composite> compositeSet11 = composite8.children();
        examples.Composite composite13 = new examples.Composite((int) (byte) 1);
        composite8.addChild(composite13);
        java.util.Set<examples.Composite> compositeSet15 = composite13.children();
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test219");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        java.util.Set<examples.Composite> compositeSet7 = composite3.children();
        java.util.Set<examples.Composite> compositeSet8 = composite3.children();
        examples.Composite composite10 = new examples.Composite((int) (short) 0);
        composite3.addChild(composite10);
        java.util.Set<examples.Composite> compositeSet12 = composite3.children();
        java.util.Set<examples.Composite> compositeSet13 = composite3.children();
        examples.Composite composite15 = new examples.Composite((-100));
        examples.Composite composite17 = new examples.Composite((-3));
        composite15.addChild(composite17);
        java.util.Set<examples.Composite> compositeSet19 = composite17.children();
        java.util.Set<examples.Composite> compositeSet20 = composite17.children();
        java.util.Set<examples.Composite> compositeSet21 = composite17.children();
        java.util.Set<examples.Composite> compositeSet22 = composite17.children();
        // The following exception was thrown during execution in test generation
        try {
            composite3.addChild(composite17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test220");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.lang.Class<?> wildcardClass6 = compositeSet5.getClass();
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test221");
        examples.Composite composite1 = new examples.Composite(8);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.lang.Class<?> wildcardClass3 = composite1.getClass();
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test222");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        examples.Composite composite6 = new examples.Composite((-6));
        composite1.addChild(composite6);
        java.lang.Class<?> wildcardClass8 = composite1.getClass();
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test223");
        examples.Composite composite1 = new examples.Composite((-2));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        java.util.Set<examples.Composite> compositeSet6 = composite4.children();
        composite1.addChild(composite4);
        examples.Composite composite9 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet10 = composite9.children();
        examples.Composite composite12 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet13 = composite12.children();
        composite9.addChild(composite12);
        examples.Composite composite16 = new examples.Composite((-3));
        composite12.addChild(composite16);
        examples.Composite composite19 = new examples.Composite((int) '#');
        composite12.addChild(composite19);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test224");
        examples.Composite composite1 = new examples.Composite(8);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((int) (short) 100);
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        composite1.addChild(composite4);
        java.lang.Class<?> wildcardClass7 = composite4.getClass();
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test225");
        examples.Composite composite1 = new examples.Composite((int) (byte) 1);
        examples.Composite composite3 = new examples.Composite(2);
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.lang.Class<?> wildcardClass6 = compositeSet5.getClass();
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test226");
        examples.Composite composite1 = new examples.Composite(3);
        examples.Composite composite3 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet6 = composite1.children();
        examples.Composite composite8 = new examples.Composite((-100));
        examples.Composite composite10 = new examples.Composite((-3));
        composite8.addChild(composite10);
        java.util.Set<examples.Composite> compositeSet12 = composite10.children();
        java.util.Set<examples.Composite> compositeSet13 = composite10.children();
        examples.Composite composite15 = new examples.Composite((-9));
        composite10.addChild(composite15);
        java.util.Set<examples.Composite> compositeSet17 = composite15.children();
        examples.Composite composite19 = new examples.Composite((int) '4');
        composite15.addChild(composite19);
        examples.Composite composite22 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet23 = composite22.children();
        java.util.Set<examples.Composite> compositeSet24 = composite22.children();
        composite19.addChild(composite22);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test227");
        examples.Composite composite1 = new examples.Composite((-2));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        java.util.Set<examples.Composite> compositeSet6 = composite4.children();
        composite1.addChild(composite4);
        examples.Composite composite9 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet10 = composite9.children();
        composite1.addChild(composite9);
        java.util.Set<examples.Composite> compositeSet12 = composite9.children();
        examples.Composite composite14 = new examples.Composite((-2));
        java.util.Set<examples.Composite> compositeSet15 = composite14.children();
        examples.Composite composite17 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet18 = composite17.children();
        java.util.Set<examples.Composite> compositeSet19 = composite17.children();
        composite14.addChild(composite17);
        examples.Composite composite22 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet23 = composite22.children();
        composite14.addChild(composite22);
        java.util.Set<examples.Composite> compositeSet25 = composite14.children();
        java.util.Set<examples.Composite> compositeSet26 = composite14.children();
        // The following exception was thrown during execution in test generation
        try {
            composite9.addChild(composite14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test228");
        examples.Composite composite1 = new examples.Composite((int) (byte) 0);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        examples.Composite composite5 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet6 = composite5.children();
        examples.Composite composite8 = new examples.Composite(2);
        java.util.Set<examples.Composite> compositeSet9 = composite8.children();
        java.util.Set<examples.Composite> compositeSet10 = composite8.children();
        composite5.addChild(composite8);
        java.util.Set<examples.Composite> compositeSet12 = composite5.children();
        examples.Composite composite14 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet15 = composite14.children();
        composite5.addChild(composite14);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test229");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        examples.Composite composite8 = new examples.Composite((-9));
        composite3.addChild(composite8);
        java.util.Set<examples.Composite> compositeSet10 = composite8.children();
        examples.Composite composite12 = new examples.Composite((int) '4');
        composite8.addChild(composite12);
        examples.Composite composite15 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet16 = composite15.children();
        java.util.Set<examples.Composite> compositeSet17 = composite15.children();
        composite12.addChild(composite15);
        java.util.Set<examples.Composite> compositeSet19 = composite15.children();
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test230");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        examples.Composite composite8 = new examples.Composite((-9));
        composite3.addChild(composite8);
        java.util.Set<examples.Composite> compositeSet10 = composite8.children();
        java.util.Set<examples.Composite> compositeSet11 = composite8.children();
        examples.Composite composite13 = new examples.Composite((int) (byte) 0);
        java.util.Set<examples.Composite> compositeSet14 = composite13.children();
        composite8.addChild(composite13);
        java.lang.Class<?> wildcardClass16 = composite13.getClass();
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test231");
        examples.Composite composite1 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.lang.Class<?> wildcardClass3 = composite1.getClass();
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test232");
        examples.Composite composite1 = new examples.Composite(100);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.lang.Class<?> wildcardClass3 = composite1.getClass();
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test233");
        examples.Composite composite1 = new examples.Composite((-2));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        java.util.Set<examples.Composite> compositeSet6 = composite4.children();
        composite1.addChild(composite4);
        examples.Composite composite9 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet10 = composite9.children();
        composite1.addChild(composite9);
        java.util.Set<examples.Composite> compositeSet12 = composite9.children();
        java.lang.Class<?> wildcardClass13 = composite9.getClass();
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test234");
        examples.Composite composite1 = new examples.Composite((int) '4');
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test235");
        examples.Composite composite1 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        examples.Composite composite6 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        java.util.Set<examples.Composite> compositeSet8 = composite6.children();
        composite1.addChild(composite6);
        examples.Composite composite11 = new examples.Composite((-8));
        composite1.addChild(composite11);
        examples.Composite composite14 = new examples.Composite((-2));
        java.util.Set<examples.Composite> compositeSet15 = composite14.children();
        examples.Composite composite17 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet18 = composite17.children();
        java.util.Set<examples.Composite> compositeSet19 = composite17.children();
        composite14.addChild(composite17);
        // The following exception was thrown during execution in test generation
        try {
            composite11.addChild(composite14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test236");
        examples.Composite composite1 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        examples.Composite composite6 = new examples.Composite(9);
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        composite1.addChild(composite6);
        examples.Composite composite10 = new examples.Composite(5);
        java.util.Set<examples.Composite> compositeSet11 = composite10.children();
        composite6.addChild(composite10);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test237");
        examples.Composite composite1 = new examples.Composite((int) (short) 100);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        examples.Composite composite5 = new examples.Composite(4);
        composite1.addChild(composite5);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test238");
        examples.Composite composite1 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite(2);
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        java.util.Set<examples.Composite> compositeSet6 = composite4.children();
        composite1.addChild(composite4);
        java.util.Set<examples.Composite> compositeSet8 = composite1.children();
        examples.Composite composite10 = new examples.Composite(4);
        composite1.addChild(composite10);
        examples.Composite composite13 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet14 = composite13.children();
        examples.Composite composite16 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet17 = composite16.children();
        composite13.addChild(composite16);
        examples.Composite composite20 = new examples.Composite((-3));
        composite16.addChild(composite20);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test239");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        examples.Composite composite8 = new examples.Composite((-9));
        composite3.addChild(composite8);
        java.util.Set<examples.Composite> compositeSet10 = composite8.children();
        examples.Composite composite12 = new examples.Composite((int) '4');
        composite8.addChild(composite12);
        java.util.Set<examples.Composite> compositeSet14 = composite8.children();
        java.util.Set<examples.Composite> compositeSet15 = composite8.children();
        java.util.Set<examples.Composite> compositeSet16 = composite8.children();
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test240");
        examples.Composite composite1 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test241");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        examples.Composite composite8 = new examples.Composite(4);
        composite3.addChild(composite8);
        examples.Composite composite11 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet12 = composite11.children();
        examples.Composite composite14 = new examples.Composite(2);
        java.util.Set<examples.Composite> compositeSet15 = composite14.children();
        java.util.Set<examples.Composite> compositeSet16 = composite14.children();
        composite11.addChild(composite14);
        java.util.Set<examples.Composite> compositeSet18 = composite11.children();
        examples.Composite composite20 = new examples.Composite(4);
        composite11.addChild(composite20);
        // The following exception was thrown during execution in test generation
        try {
            composite3.addChild(composite20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test242");
        examples.Composite composite1 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite(2);
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        java.util.Set<examples.Composite> compositeSet6 = composite4.children();
        composite1.addChild(composite4);
        java.util.Set<examples.Composite> compositeSet8 = composite1.children();
        examples.Composite composite10 = new examples.Composite(4);
        composite1.addChild(composite10);
        java.util.Set<examples.Composite> compositeSet12 = composite1.children();
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test243");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        java.util.Set<examples.Composite> compositeSet7 = composite3.children();
        java.util.Set<examples.Composite> compositeSet8 = composite3.children();
        examples.Composite composite10 = new examples.Composite((int) (short) 0);
        composite3.addChild(composite10);
        java.util.Set<examples.Composite> compositeSet12 = composite3.children();
        java.lang.Class<?> wildcardClass13 = composite3.getClass();
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test244");
        examples.Composite composite1 = new examples.Composite((-8));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.lang.Class<?> wildcardClass4 = compositeSet3.getClass();
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test245");
        examples.Composite composite1 = new examples.Composite((-2));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        java.util.Set<examples.Composite> compositeSet6 = composite4.children();
        composite1.addChild(composite4);
        examples.Composite composite9 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet10 = composite9.children();
        composite1.addChild(composite9);
        java.util.Set<examples.Composite> compositeSet12 = composite1.children();
        java.lang.Class<?> wildcardClass13 = compositeSet12.getClass();
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test246");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        java.util.Set<examples.Composite> compositeSet7 = composite3.children();
        java.util.Set<examples.Composite> compositeSet8 = composite3.children();
        examples.Composite composite10 = new examples.Composite((int) (short) 0);
        composite3.addChild(composite10);
        java.util.Set<examples.Composite> compositeSet12 = composite3.children();
        java.util.Set<examples.Composite> compositeSet13 = composite3.children();
        java.lang.Class<?> wildcardClass14 = compositeSet13.getClass();
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test247");
        examples.Composite composite1 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite(2);
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        java.util.Set<examples.Composite> compositeSet6 = composite4.children();
        composite1.addChild(composite4);
        java.util.Set<examples.Composite> compositeSet8 = composite1.children();
        java.util.Set<examples.Composite> compositeSet9 = composite1.children();
        java.util.Set<examples.Composite> compositeSet10 = composite1.children();
        java.util.Set<examples.Composite> compositeSet11 = composite1.children();
        java.util.Set<examples.Composite> compositeSet12 = composite1.children();
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test248");
        examples.Composite composite1 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite(8);
        composite1.addChild(composite4);
        java.lang.Class<?> wildcardClass6 = composite4.getClass();
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test249");
        examples.Composite composite1 = new examples.Composite((int) '4');
        examples.Composite composite3 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        composite1.addChild(composite3);
        examples.Composite composite8 = new examples.Composite((-6));
        java.util.Set<examples.Composite> compositeSet9 = composite8.children();
        composite1.addChild(composite8);
        examples.Composite composite12 = new examples.Composite(8);
        composite8.addChild(composite12);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test250");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        examples.Composite composite8 = new examples.Composite((-9));
        composite3.addChild(composite8);
        java.util.Set<examples.Composite> compositeSet10 = composite8.children();
        java.util.Set<examples.Composite> compositeSet11 = composite8.children();
        examples.Composite composite13 = new examples.Composite((int) (byte) 0);
        java.util.Set<examples.Composite> compositeSet14 = composite13.children();
        composite8.addChild(composite13);
        examples.Composite composite17 = new examples.Composite(4);
        composite13.addChild(composite17);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test251");
        examples.Composite composite1 = new examples.Composite((int) '4');
        examples.Composite composite3 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet7 = composite3.children();
        examples.Composite composite9 = new examples.Composite((-5));
        composite3.addChild(composite9);
        examples.Composite composite12 = new examples.Composite(6);
        composite9.addChild(composite12);
        examples.Composite composite15 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet16 = composite15.children();
        examples.Composite composite18 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet19 = composite18.children();
        composite15.addChild(composite18);
        java.util.Set<examples.Composite> compositeSet21 = composite15.children();
        examples.Composite composite23 = new examples.Composite((int) (short) 1);
        java.util.Set<examples.Composite> compositeSet24 = composite23.children();
        composite15.addChild(composite23);
        // The following exception was thrown during execution in test generation
        try {
            composite12.addChild(composite15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test252");
        examples.Composite composite1 = new examples.Composite((int) (byte) 0);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.lang.Class<?> wildcardClass4 = composite1.getClass();
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test253");
        examples.Composite composite1 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite(2);
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        java.util.Set<examples.Composite> compositeSet6 = composite4.children();
        composite1.addChild(composite4);
        java.util.Set<examples.Composite> compositeSet8 = composite1.children();
        examples.Composite composite10 = new examples.Composite(4);
        composite1.addChild(composite10);
        examples.Composite composite13 = new examples.Composite((-100));
        examples.Composite composite15 = new examples.Composite((-3));
        composite13.addChild(composite15);
        java.util.Set<examples.Composite> compositeSet17 = composite15.children();
        java.util.Set<examples.Composite> compositeSet18 = composite15.children();
        examples.Composite composite20 = new examples.Composite((-9));
        composite15.addChild(composite20);
        java.util.Set<examples.Composite> compositeSet22 = composite20.children();
        examples.Composite composite24 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet25 = composite24.children();
        java.util.Set<examples.Composite> compositeSet26 = composite24.children();
        composite20.addChild(composite24);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test254");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        examples.Composite composite8 = new examples.Composite((-9));
        composite3.addChild(composite8);
        java.util.Set<examples.Composite> compositeSet10 = composite8.children();
        examples.Composite composite12 = new examples.Composite((int) '4');
        composite8.addChild(composite12);
        examples.Composite composite15 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet16 = composite15.children();
        java.util.Set<examples.Composite> compositeSet17 = composite15.children();
        composite12.addChild(composite15);
        examples.Composite composite20 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet21 = composite20.children();
        composite12.addChild(composite20);
        java.util.Set<examples.Composite> compositeSet23 = composite12.children();
        java.lang.Class<?> wildcardClass24 = composite12.getClass();
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test255");
        examples.Composite composite1 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        composite1.addChild(composite4);
        examples.Composite composite8 = new examples.Composite((-3));
        composite4.addChild(composite8);
        java.util.Set<examples.Composite> compositeSet10 = composite8.children();
        java.util.Set<examples.Composite> compositeSet11 = composite8.children();
        examples.Composite composite13 = new examples.Composite((int) (byte) 1);
        composite8.addChild(composite13);
        examples.Composite composite16 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet17 = composite16.children();
        examples.Composite composite19 = new examples.Composite(2);
        java.util.Set<examples.Composite> compositeSet20 = composite19.children();
        java.util.Set<examples.Composite> compositeSet21 = composite19.children();
        composite16.addChild(composite19);
        java.util.Set<examples.Composite> compositeSet23 = composite16.children();
        java.util.Set<examples.Composite> compositeSet24 = composite16.children();
        java.util.Set<examples.Composite> compositeSet25 = composite16.children();
        java.util.Set<examples.Composite> compositeSet26 = composite16.children();
        // The following exception was thrown during execution in test generation
        try {
            composite13.addChild(composite16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test256");
        examples.Composite composite1 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        examples.Composite composite6 = new examples.Composite((int) (byte) -1);
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        java.util.Set<examples.Composite> compositeSet8 = composite6.children();
        composite1.addChild(composite6);
        java.util.Set<examples.Composite> compositeSet10 = composite1.children();
        java.lang.Class<?> wildcardClass11 = compositeSet10.getClass();
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test257");
        examples.Composite composite1 = new examples.Composite((int) ' ');
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        composite1.addChild(composite4);
        java.util.Set<examples.Composite> compositeSet7 = composite1.children();
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test258");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        examples.Composite composite8 = new examples.Composite((-9));
        composite3.addChild(composite8);
        java.util.Set<examples.Composite> compositeSet10 = composite3.children();
        java.util.Set<examples.Composite> compositeSet11 = composite3.children();
        java.lang.Class<?> wildcardClass12 = compositeSet11.getClass();
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test259");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        examples.Composite composite8 = new examples.Composite((-9));
        composite3.addChild(composite8);
        java.util.Set<examples.Composite> compositeSet10 = composite8.children();
        java.util.Set<examples.Composite> compositeSet11 = composite8.children();
        java.lang.Class<?> wildcardClass12 = composite8.getClass();
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test260");
        examples.Composite composite1 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        examples.Composite composite5 = new examples.Composite((-6));
        composite1.addChild(composite5);
        java.lang.Class<?> wildcardClass7 = composite1.getClass();
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test261");
        examples.Composite composite1 = new examples.Composite((int) (byte) 0);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((int) (byte) 0);
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        composite1.addChild(composite4);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test262");
        examples.Composite composite1 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        java.util.Set<examples.Composite> compositeSet5 = composite1.children();
        java.util.Set<examples.Composite> compositeSet6 = composite1.children();
        java.util.Set<examples.Composite> compositeSet7 = composite1.children();
        java.util.Set<examples.Composite> compositeSet8 = composite1.children();
        examples.Composite composite10 = new examples.Composite((int) (byte) 1);
        examples.Composite composite12 = new examples.Composite(2);
        composite10.addChild(composite12);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test263");
        examples.Composite composite1 = new examples.Composite((-5));
        examples.Composite composite3 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        composite1.addChild(composite3);
        java.lang.Class<?> wildcardClass6 = composite3.getClass();
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test264");
        examples.Composite composite1 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        examples.Composite composite6 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        java.util.Set<examples.Composite> compositeSet8 = composite6.children();
        composite1.addChild(composite6);
        examples.Composite composite11 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet12 = composite11.children();
        java.util.Set<examples.Composite> compositeSet13 = composite11.children();
        java.util.Set<examples.Composite> compositeSet14 = composite11.children();
        composite1.addChild(composite11);
        java.util.Set<examples.Composite> compositeSet16 = composite1.children();
        java.util.Set<examples.Composite> compositeSet17 = composite1.children();
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test265");
        examples.Composite composite1 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        examples.Composite composite6 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        java.util.Set<examples.Composite> compositeSet8 = composite6.children();
        composite1.addChild(composite6);
        examples.Composite composite11 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet12 = composite11.children();
        java.util.Set<examples.Composite> compositeSet13 = composite11.children();
        java.util.Set<examples.Composite> compositeSet14 = composite11.children();
        composite1.addChild(composite11);
        java.util.Set<examples.Composite> compositeSet16 = composite1.children();
        java.lang.Class<?> wildcardClass17 = composite1.getClass();
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test266");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        examples.Composite composite6 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        java.util.Set<examples.Composite> compositeSet8 = composite6.children();
        java.util.Set<examples.Composite> compositeSet9 = composite6.children();
        composite1.addChild(composite6);
        java.lang.Class<?> wildcardClass11 = composite6.getClass();
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test267");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        examples.Composite composite8 = new examples.Composite((-9));
        composite3.addChild(composite8);
        java.util.Set<examples.Composite> compositeSet10 = composite8.children();
        java.util.Set<examples.Composite> compositeSet11 = composite8.children();
        examples.Composite composite13 = new examples.Composite((int) (byte) 0);
        java.util.Set<examples.Composite> compositeSet14 = composite13.children();
        composite8.addChild(composite13);
        java.util.Set<examples.Composite> compositeSet16 = composite8.children();
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test268");
        examples.Composite composite1 = new examples.Composite((-2));
        examples.Composite composite3 = new examples.Composite((int) (short) 100);
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        composite1.addChild(composite3);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test269");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        examples.Composite composite8 = new examples.Composite((-9));
        composite3.addChild(composite8);
        java.util.Set<examples.Composite> compositeSet10 = composite8.children();
        examples.Composite composite12 = new examples.Composite((int) '4');
        composite8.addChild(composite12);
        java.util.Set<examples.Composite> compositeSet14 = composite8.children();
        java.util.Set<examples.Composite> compositeSet15 = composite8.children();
        java.lang.Class<?> wildcardClass16 = composite8.getClass();
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test270");
        examples.Composite composite1 = new examples.Composite((int) '4');
        examples.Composite composite3 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        composite1.addChild(composite3);
        examples.Composite composite8 = new examples.Composite((int) (byte) 100);
        composite1.addChild(composite8);
        java.util.Set<examples.Composite> compositeSet10 = composite1.children();
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test271");
        examples.Composite composite1 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        examples.Composite composite6 = new examples.Composite(3);
        composite1.addChild(composite6);
        java.util.Set<examples.Composite> compositeSet8 = composite1.children();
        examples.Composite composite10 = new examples.Composite((int) ' ');
        java.util.Set<examples.Composite> compositeSet11 = composite10.children();
        examples.Composite composite13 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet14 = composite13.children();
        composite10.addChild(composite13);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test272");
        examples.Composite composite1 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        composite1.addChild(composite4);
        examples.Composite composite8 = new examples.Composite((-3));
        composite4.addChild(composite8);
        java.util.Set<examples.Composite> compositeSet10 = composite8.children();
        java.util.Set<examples.Composite> compositeSet11 = composite8.children();
        examples.Composite composite13 = new examples.Composite((int) (byte) 1);
        composite8.addChild(composite13);
        java.lang.Class<?> wildcardClass15 = composite8.getClass();
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test273");
        examples.Composite composite1 = new examples.Composite((int) (byte) 1);
        examples.Composite composite3 = new examples.Composite(2);
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite1.children();
        java.util.Set<examples.Composite> compositeSet6 = composite1.children();
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test274");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        examples.Composite composite8 = new examples.Composite((-9));
        composite3.addChild(composite8);
        examples.Composite composite11 = new examples.Composite((int) (short) 1);
        composite8.addChild(composite11);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test275");
        examples.Composite composite1 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        composite1.addChild(composite4);
        examples.Composite composite8 = new examples.Composite((-2));
        composite1.addChild(composite8);
        java.util.Set<examples.Composite> compositeSet10 = composite8.children();
        java.util.Set<examples.Composite> compositeSet11 = composite8.children();
        java.lang.Class<?> wildcardClass12 = composite8.getClass();
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test276");
        examples.Composite composite1 = new examples.Composite((int) '4');
        examples.Composite composite3 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        composite1.addChild(composite3);
        examples.Composite composite8 = new examples.Composite((-100));
        examples.Composite composite10 = new examples.Composite((-3));
        composite8.addChild(composite10);
        java.util.Set<examples.Composite> compositeSet12 = composite10.children();
        java.util.Set<examples.Composite> compositeSet13 = composite10.children();
        examples.Composite composite15 = new examples.Composite((-9));
        composite10.addChild(composite15);
        java.util.Set<examples.Composite> compositeSet17 = composite10.children();
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test277");
        examples.Composite composite1 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        composite1.addChild(composite4);
        examples.Composite composite8 = new examples.Composite((-3));
        composite4.addChild(composite8);
        java.util.Set<examples.Composite> compositeSet10 = composite8.children();
        java.util.Set<examples.Composite> compositeSet11 = composite8.children();
        examples.Composite composite13 = new examples.Composite((int) 'a');
        composite8.addChild(composite13);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test278");
        examples.Composite composite1 = new examples.Composite(5);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        java.util.Set<examples.Composite> compositeSet5 = composite1.children();
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test279");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        examples.Composite composite8 = new examples.Composite((-9));
        composite3.addChild(composite8);
        java.util.Set<examples.Composite> compositeSet10 = composite8.children();
        examples.Composite composite12 = new examples.Composite((int) '4');
        composite8.addChild(composite12);
        examples.Composite composite15 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet16 = composite15.children();
        java.util.Set<examples.Composite> compositeSet17 = composite15.children();
        composite12.addChild(composite15);
        examples.Composite composite20 = new examples.Composite((-9));
        java.util.Set<examples.Composite> compositeSet21 = composite20.children();
        composite12.addChild(composite20);
        examples.Composite composite24 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet25 = composite24.children();
        examples.Composite composite27 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet28 = composite27.children();
        composite24.addChild(composite27);
        examples.Composite composite31 = new examples.Composite((-3));
        composite27.addChild(composite31);
        examples.Composite composite34 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet35 = composite34.children();
        java.util.Set<examples.Composite> compositeSet36 = composite34.children();
        composite27.addChild(composite34);
        examples.Composite composite39 = new examples.Composite((-9));
        composite34.addChild(composite39);
        java.util.Set<examples.Composite> compositeSet41 = composite34.children();
        // The following exception was thrown during execution in test generation
        try {
            composite20.addChild(composite34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test280");
        examples.Composite composite1 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        composite1.addChild(composite4);
        examples.Composite composite8 = new examples.Composite((-2));
        composite1.addChild(composite8);
        examples.Composite composite11 = new examples.Composite(7);
        composite1.addChild(composite11);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test281");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        examples.Composite composite8 = new examples.Composite((-9));
        composite3.addChild(composite8);
        java.util.Set<examples.Composite> compositeSet10 = composite8.children();
        java.util.Set<examples.Composite> compositeSet11 = composite8.children();
        java.lang.Class<?> wildcardClass12 = compositeSet11.getClass();
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test282");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        examples.Composite composite8 = new examples.Composite((-9));
        composite3.addChild(composite8);
        java.util.Set<examples.Composite> compositeSet10 = composite8.children();
        examples.Composite composite12 = new examples.Composite((int) '4');
        composite8.addChild(composite12);
        examples.Composite composite15 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet16 = composite15.children();
        composite8.addChild(composite15);
        examples.Composite composite19 = new examples.Composite((-100));
        composite15.addChild(composite19);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test283");
        examples.Composite composite1 = new examples.Composite((-5));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.lang.Class<?> wildcardClass3 = compositeSet2.getClass();
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test284");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        examples.Composite composite7 = new examples.Composite((-9));
        composite3.addChild(composite7);
        java.util.Set<examples.Composite> compositeSet9 = composite3.children();
        java.util.Set<examples.Composite> compositeSet10 = composite3.children();
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test285");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        examples.Composite composite8 = new examples.Composite((-9));
        composite3.addChild(composite8);
        java.util.Set<examples.Composite> compositeSet10 = composite8.children();
        java.util.Set<examples.Composite> compositeSet11 = composite8.children();
        examples.Composite composite13 = new examples.Composite((int) (byte) 0);
        java.util.Set<examples.Composite> compositeSet14 = composite13.children();
        composite8.addChild(composite13);
        examples.Composite composite17 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet18 = composite17.children();
        examples.Composite composite20 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet21 = composite20.children();
        composite17.addChild(composite20);
        // The following exception was thrown during execution in test generation
        try {
            composite8.addChild(composite20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test286");
        examples.Composite composite1 = new examples.Composite((-5));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.lang.Class<?> wildcardClass3 = composite1.getClass();
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test287");
        examples.Composite composite1 = new examples.Composite(2);
        examples.Composite composite3 = new examples.Composite((int) '4');
        examples.Composite composite5 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet6 = composite5.children();
        java.util.Set<examples.Composite> compositeSet7 = composite5.children();
        composite3.addChild(composite5);
        java.util.Set<examples.Composite> compositeSet9 = composite5.children();
        examples.Composite composite11 = new examples.Composite((-5));
        composite5.addChild(composite11);
        examples.Composite composite14 = new examples.Composite(6);
        composite11.addChild(composite14);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test288");
        examples.Composite composite1 = new examples.Composite((-5));
        examples.Composite composite3 = new examples.Composite(4);
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        composite1.addChild(composite3);
        java.lang.Class<?> wildcardClass6 = composite1.getClass();
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test289");
        examples.Composite composite1 = new examples.Composite((-5));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        examples.Composite composite5 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet6 = composite5.children();
        java.util.Set<examples.Composite> compositeSet7 = composite5.children();
        java.util.Set<examples.Composite> compositeSet8 = composite5.children();
        composite1.addChild(composite5);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test290");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        java.util.Set<examples.Composite> compositeSet7 = composite3.children();
        java.util.Set<examples.Composite> compositeSet8 = composite3.children();
        examples.Composite composite10 = new examples.Composite((int) (short) 0);
        composite3.addChild(composite10);
        java.util.Set<examples.Composite> compositeSet12 = composite3.children();
        java.lang.Class<?> wildcardClass13 = compositeSet12.getClass();
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test291");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        examples.Composite composite7 = new examples.Composite((-9));
        composite3.addChild(composite7);
        java.util.Set<examples.Composite> compositeSet9 = composite3.children();
        examples.Composite composite11 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet12 = composite11.children();
        composite3.addChild(composite11);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test292");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite1.children();
        examples.Composite composite7 = new examples.Composite((int) (byte) 10);
        composite1.addChild(composite7);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test293");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        examples.Composite composite8 = new examples.Composite((-9));
        composite3.addChild(composite8);
        java.util.Set<examples.Composite> compositeSet10 = composite8.children();
        java.util.Set<examples.Composite> compositeSet11 = composite8.children();
        examples.Composite composite13 = new examples.Composite((int) (byte) 0);
        java.util.Set<examples.Composite> compositeSet14 = composite13.children();
        composite8.addChild(composite13);
        examples.Composite composite17 = new examples.Composite((-2));
        java.util.Set<examples.Composite> compositeSet18 = composite17.children();
        examples.Composite composite20 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet21 = composite20.children();
        java.util.Set<examples.Composite> compositeSet22 = composite20.children();
        composite17.addChild(composite20);
        examples.Composite composite25 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet26 = composite25.children();
        composite17.addChild(composite25);
        // The following exception was thrown during execution in test generation
        try {
            composite13.addChild(composite25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test294");
        examples.Composite composite1 = new examples.Composite((-100));
        examples.Composite composite3 = new examples.Composite((-3));
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        java.util.Set<examples.Composite> compositeSet7 = composite3.children();
        java.util.Set<examples.Composite> compositeSet8 = composite3.children();
        java.util.Set<examples.Composite> compositeSet9 = composite3.children();
        examples.Composite composite11 = new examples.Composite((int) (byte) 0);
        composite3.addChild(composite11);
        java.lang.Class<?> wildcardClass13 = composite3.getClass();
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test295");
        examples.Composite composite1 = new examples.Composite((-9));
        examples.Composite composite3 = new examples.Composite((int) (byte) 1);
        composite1.addChild(composite3);
        examples.Composite composite6 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        examples.Composite composite9 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet10 = composite9.children();
        composite6.addChild(composite9);
        examples.Composite composite13 = new examples.Composite((-2));
        composite6.addChild(composite13);
        java.util.Set<examples.Composite> compositeSet15 = composite13.children();
        // The following exception was thrown during execution in test generation
        try {
            composite3.addChild(composite13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test296");
        examples.Composite composite1 = new examples.Composite(5);
        examples.Composite composite3 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        composite1.addChild(composite3);
        examples.Composite composite8 = new examples.Composite((int) (byte) 1);
        examples.Composite composite10 = new examples.Composite(2);
        composite8.addChild(composite10);
        java.util.Set<examples.Composite> compositeSet12 = composite10.children();
        // The following exception was thrown during execution in test generation
        try {
            composite3.addChild(composite10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test297");
        examples.Composite composite1 = new examples.Composite((int) (short) 1);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.lang.Class<?> wildcardClass4 = compositeSet3.getClass();
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test298");
        examples.Composite composite1 = new examples.Composite((int) '4');
        examples.Composite composite3 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet7 = composite3.children();
        java.util.Set<examples.Composite> compositeSet8 = composite3.children();
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CompositeTester0.test299");
        examples.Composite composite1 = new examples.Composite((int) (byte) -1);
        examples.Composite composite3 = new examples.Composite((-3));
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.util.Set<examples.Composite> compositeSet6 = composite3.children();
        examples.Composite composite8 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet9 = composite8.children();
        java.util.Set<examples.Composite> compositeSet10 = composite8.children();
        composite3.addChild(composite8);
        examples.Composite composite13 = new examples.Composite((-100));
        java.util.Set<examples.Composite> compositeSet14 = composite13.children();
        java.util.Set<examples.Composite> compositeSet15 = composite13.children();
        java.util.Set<examples.Composite> compositeSet16 = composite13.children();
        composite3.addChild(composite13);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }
}

