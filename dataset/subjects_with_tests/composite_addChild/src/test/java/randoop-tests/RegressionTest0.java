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
        examples.Composite composite1 = new examples.Composite((int) (short) -1);
        java.lang.Class<?> wildcardClass2 = composite1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        examples.Composite composite1 = new examples.Composite(0);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.lang.Class<?> wildcardClass4 = compositeSet3.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        examples.Composite composite1 = new examples.Composite(0);
        java.lang.Class<?> wildcardClass2 = composite1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        examples.Composite composite1 = new examples.Composite((int) (short) -1);
        examples.Composite composite3 = new examples.Composite(0);
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet5 = composite3.children();
        java.lang.Class<?> wildcardClass6 = composite3.getClass();
        org.junit.Assert.assertNotNull(compositeSet5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        examples.Composite composite1 = new examples.Composite((int) (short) -1);
        examples.Composite composite3 = new examples.Composite(0);
        composite1.addChild(composite3);
        examples.Composite composite6 = new examples.Composite((int) (short) -1);
        examples.Composite composite8 = new examples.Composite(0);
        composite6.addChild(composite8);
        java.util.Set<examples.Composite> compositeSet10 = composite8.children();
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet10);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        examples.Composite composite1 = new examples.Composite((int) 'a');
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.lang.Class<?> wildcardClass3 = composite1.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        examples.Composite composite1 = new examples.Composite((int) (short) -1);
        examples.Composite composite3 = new examples.Composite(0);
        composite1.addChild(composite3);
        examples.Composite composite6 = new examples.Composite(0);
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        java.util.Set<examples.Composite> compositeSet8 = composite6.children();
        java.util.Set<examples.Composite> compositeSet9 = composite6.children();
        composite1.addChild(composite6);
        java.util.Set<examples.Composite> compositeSet11 = composite1.children();
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet11);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        examples.Composite composite1 = new examples.Composite((int) 'a');
        java.lang.Class<?> wildcardClass2 = composite1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        examples.Composite composite1 = new examples.Composite(0);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        java.lang.Class<?> wildcardClass5 = compositeSet4.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        examples.Composite composite1 = new examples.Composite((int) (short) -1);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.lang.Class<?> wildcardClass4 = composite1.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        examples.Composite composite1 = new examples.Composite(0);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        examples.Composite composite6 = new examples.Composite((int) 'a');
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        composite1.addChild(composite6);
        java.util.Set<examples.Composite> compositeSet9 = composite6.children();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet9);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        examples.Composite composite1 = new examples.Composite(0);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.lang.Class<?> wildcardClass3 = composite1.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        examples.Composite composite1 = new examples.Composite(1);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        examples.Composite composite1 = new examples.Composite((int) '#');
        java.lang.Class<?> wildcardClass2 = composite1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        examples.Composite composite1 = new examples.Composite((int) (byte) -1);
        java.lang.Class<?> wildcardClass2 = composite1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        examples.Composite composite1 = new examples.Composite((int) (short) -1);
        examples.Composite composite3 = new examples.Composite(0);
        composite1.addChild(composite3);
        examples.Composite composite6 = new examples.Composite(0);
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        java.util.Set<examples.Composite> compositeSet8 = composite6.children();
        java.util.Set<examples.Composite> compositeSet9 = composite6.children();
        composite1.addChild(composite6);
        examples.Composite composite12 = new examples.Composite(0);
        java.util.Set<examples.Composite> compositeSet13 = composite12.children();
        java.util.Set<examples.Composite> compositeSet14 = composite12.children();
        java.util.Set<examples.Composite> compositeSet15 = composite12.children();
        composite1.addChild(composite12);
        java.lang.Class<?> wildcardClass17 = composite12.getClass();
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        examples.Composite composite1 = new examples.Composite(0);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        examples.Composite composite6 = new examples.Composite((int) 'a');
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        composite1.addChild(composite6);
        examples.Composite composite9 = null;
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet7);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        examples.Composite composite1 = new examples.Composite(0);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        java.lang.Class<?> wildcardClass5 = composite1.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        examples.Composite composite1 = new examples.Composite((int) (byte) 0);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        examples.Composite composite1 = new examples.Composite(0);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.lang.Class<?> wildcardClass3 = compositeSet2.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        examples.Composite composite1 = new examples.Composite((int) (byte) 1);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        examples.Composite composite1 = new examples.Composite((int) (byte) -1);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((int) (short) -1);
        java.util.Set<examples.Composite> compositeSet5 = composite4.children();
        examples.Composite composite7 = new examples.Composite((-1));
        composite4.addChild(composite7);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet5);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        examples.Composite composite1 = new examples.Composite(0);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        examples.Composite composite5 = new examples.Composite((int) 'a');
        composite1.addChild(composite5);
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        examples.Composite composite1 = new examples.Composite((int) (short) 1);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        examples.Composite composite1 = new examples.Composite((int) (short) 100);
        java.lang.Class<?> wildcardClass2 = composite1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        examples.Composite composite1 = new examples.Composite(0);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        examples.Composite composite6 = new examples.Composite((int) 'a');
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        composite1.addChild(composite6);
        examples.Composite composite10 = new examples.Composite(0);
        java.util.Set<examples.Composite> compositeSet11 = composite10.children();
        composite6.addChild(composite10);
        examples.Composite composite14 = new examples.Composite(0);
        java.util.Set<examples.Composite> compositeSet15 = composite14.children();
        java.util.Set<examples.Composite> compositeSet16 = composite14.children();
        java.util.Set<examples.Composite> compositeSet17 = composite14.children();
        examples.Composite composite19 = new examples.Composite((int) 'a');
        java.util.Set<examples.Composite> compositeSet20 = composite19.children();
        composite14.addChild(composite19);
        examples.Composite composite23 = new examples.Composite(0);
        java.util.Set<examples.Composite> compositeSet24 = composite23.children();
        composite19.addChild(composite23);
        examples.Composite composite27 = new examples.Composite((int) '#');
        composite23.addChild(composite27);
        // The following exception was thrown during execution in test generation
        try {
            composite10.addChild(composite23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet16);
        org.junit.Assert.assertNotNull(compositeSet17);
        org.junit.Assert.assertNotNull(compositeSet20);
        org.junit.Assert.assertNotNull(compositeSet24);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        examples.Composite composite1 = new examples.Composite(10);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        examples.Composite composite5 = new examples.Composite((int) (short) -1);
        examples.Composite composite7 = new examples.Composite(0);
        composite5.addChild(composite7);
        examples.Composite composite10 = new examples.Composite(0);
        java.util.Set<examples.Composite> compositeSet11 = composite10.children();
        java.util.Set<examples.Composite> compositeSet12 = composite10.children();
        java.util.Set<examples.Composite> compositeSet13 = composite10.children();
        composite5.addChild(composite10);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet13);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        examples.Composite composite1 = new examples.Composite((int) (byte) -1);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((int) '4');
        composite1.addChild(composite4);
        examples.Composite composite7 = new examples.Composite((int) ' ');
        composite4.addChild(composite7);
        java.util.Set<examples.Composite> compositeSet9 = composite4.children();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet9);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        examples.Composite composite1 = new examples.Composite(100);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        examples.Composite composite1 = new examples.Composite((int) (short) -1);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((int) (short) -1);
        examples.Composite composite6 = new examples.Composite(0);
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        composite4.addChild(composite6);
        java.util.Set<examples.Composite> compositeSet9 = composite4.children();
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet9);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        examples.Composite composite1 = new examples.Composite(0);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        examples.Composite composite6 = new examples.Composite((int) 'a');
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        composite1.addChild(composite6);
        examples.Composite composite10 = new examples.Composite(0);
        java.util.Set<examples.Composite> compositeSet11 = composite10.children();
        composite6.addChild(composite10);
        java.util.Set<examples.Composite> compositeSet13 = composite10.children();
        java.lang.Class<?> wildcardClass14 = composite10.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        examples.Composite composite1 = new examples.Composite(0);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        examples.Composite composite6 = new examples.Composite((int) 'a');
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        composite1.addChild(composite6);
        java.util.Set<examples.Composite> compositeSet9 = composite1.children();
        java.lang.Class<?> wildcardClass10 = composite1.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        examples.Composite composite1 = new examples.Composite((int) (short) -1);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((-1));
        composite1.addChild(composite4);
        java.lang.Class<?> wildcardClass6 = composite4.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        examples.Composite composite1 = new examples.Composite((int) (short) 10);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        examples.Composite composite1 = new examples.Composite(0);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        examples.Composite composite6 = new examples.Composite((int) 'a');
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        composite1.addChild(composite6);
        java.util.Set<examples.Composite> compositeSet9 = composite1.children();
        java.lang.Class<?> wildcardClass10 = compositeSet9.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        examples.Composite composite1 = new examples.Composite((int) (short) -1);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        java.lang.Class<?> wildcardClass5 = composite1.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        examples.Composite composite1 = new examples.Composite((int) (short) 0);
        examples.Composite composite3 = new examples.Composite((int) (byte) -1);
        composite1.addChild(composite3);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        examples.Composite composite1 = new examples.Composite((int) (byte) -1);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.lang.Class<?> wildcardClass3 = compositeSet2.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        examples.Composite composite1 = new examples.Composite(0);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        examples.Composite composite4 = new examples.Composite((int) (short) -1);
        examples.Composite composite6 = new examples.Composite(0);
        composite4.addChild(composite6);
        examples.Composite composite9 = new examples.Composite(0);
        java.util.Set<examples.Composite> compositeSet10 = composite9.children();
        java.util.Set<examples.Composite> compositeSet11 = composite9.children();
        java.util.Set<examples.Composite> compositeSet12 = composite9.children();
        composite4.addChild(composite9);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet12);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        examples.Composite composite1 = new examples.Composite((int) (short) -1);
        examples.Composite composite3 = new examples.Composite(0);
        composite1.addChild(composite3);
        examples.Composite composite6 = new examples.Composite(0);
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        java.util.Set<examples.Composite> compositeSet8 = composite6.children();
        java.util.Set<examples.Composite> compositeSet9 = composite6.children();
        composite1.addChild(composite6);
        examples.Composite composite12 = new examples.Composite(0);
        java.util.Set<examples.Composite> compositeSet13 = composite12.children();
        java.util.Set<examples.Composite> compositeSet14 = composite12.children();
        java.util.Set<examples.Composite> compositeSet15 = composite12.children();
        composite1.addChild(composite12);
        java.lang.Class<?> wildcardClass17 = composite1.getClass();
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        examples.Composite composite1 = new examples.Composite(10);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.lang.Class<?> wildcardClass3 = compositeSet2.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        examples.Composite composite1 = new examples.Composite((int) (short) -1);
        examples.Composite composite3 = new examples.Composite(0);
        composite1.addChild(composite3);
        examples.Composite composite6 = new examples.Composite(0);
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        java.util.Set<examples.Composite> compositeSet8 = composite6.children();
        java.util.Set<examples.Composite> compositeSet9 = composite6.children();
        examples.Composite composite11 = new examples.Composite((int) 'a');
        java.util.Set<examples.Composite> compositeSet12 = composite11.children();
        composite6.addChild(composite11);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet12);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        examples.Composite composite1 = new examples.Composite(10);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet4);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        examples.Composite composite1 = new examples.Composite(0);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        examples.Composite composite5 = new examples.Composite(0);
        java.util.Set<examples.Composite> compositeSet6 = composite5.children();
        java.util.Set<examples.Composite> compositeSet7 = composite5.children();
        java.util.Set<examples.Composite> compositeSet8 = composite5.children();
        examples.Composite composite10 = new examples.Composite((int) (byte) -1);
        composite5.addChild(composite10);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        examples.Composite composite1 = new examples.Composite(0);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        examples.Composite composite6 = new examples.Composite((int) 'a');
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        composite1.addChild(composite6);
        examples.Composite composite10 = new examples.Composite(0);
        java.util.Set<examples.Composite> compositeSet11 = composite10.children();
        composite6.addChild(composite10);
        java.lang.Class<?> wildcardClass13 = composite6.getClass();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        examples.Composite composite1 = new examples.Composite((int) '4');
        examples.Composite composite3 = new examples.Composite((int) (short) -1);
        composite1.addChild(composite3);
        examples.Composite composite6 = new examples.Composite((int) (byte) -1);
        composite1.addChild(composite6);
        examples.Composite composite9 = new examples.Composite(0);
        java.util.Set<examples.Composite> compositeSet10 = composite9.children();
        java.util.Set<examples.Composite> compositeSet11 = composite9.children();
        java.util.Set<examples.Composite> compositeSet12 = composite9.children();
        examples.Composite composite14 = new examples.Composite((int) 'a');
        java.util.Set<examples.Composite> compositeSet15 = composite14.children();
        composite9.addChild(composite14);
        examples.Composite composite18 = new examples.Composite(0);
        java.util.Set<examples.Composite> compositeSet19 = composite18.children();
        composite14.addChild(composite18);
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet10);
        org.junit.Assert.assertNotNull(compositeSet11);
        org.junit.Assert.assertNotNull(compositeSet12);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet19);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        examples.Composite composite1 = new examples.Composite((int) (short) -1);
        examples.Composite composite3 = new examples.Composite(0);
        composite1.addChild(composite3);
        examples.Composite composite6 = new examples.Composite(0);
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        java.util.Set<examples.Composite> compositeSet8 = composite6.children();
        java.util.Set<examples.Composite> compositeSet9 = composite6.children();
        composite1.addChild(composite6);
        examples.Composite composite12 = new examples.Composite(0);
        java.util.Set<examples.Composite> compositeSet13 = composite12.children();
        java.util.Set<examples.Composite> compositeSet14 = composite12.children();
        java.util.Set<examples.Composite> compositeSet15 = composite12.children();
        composite1.addChild(composite12);
        java.util.Set<examples.Composite> compositeSet17 = composite1.children();
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet17);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        examples.Composite composite1 = new examples.Composite((int) (short) -1);
        examples.Composite composite3 = new examples.Composite(0);
        composite1.addChild(composite3);
        examples.Composite composite6 = new examples.Composite(0);
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        java.util.Set<examples.Composite> compositeSet8 = composite6.children();
        java.util.Set<examples.Composite> compositeSet9 = composite6.children();
        composite1.addChild(composite6);
        examples.Composite composite12 = new examples.Composite(0);
        java.util.Set<examples.Composite> compositeSet13 = composite12.children();
        java.util.Set<examples.Composite> compositeSet14 = composite12.children();
        java.util.Set<examples.Composite> compositeSet15 = composite12.children();
        composite1.addChild(composite12);
        java.util.Set<examples.Composite> compositeSet17 = composite12.children();
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet8);
        org.junit.Assert.assertNotNull(compositeSet9);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet14);
        org.junit.Assert.assertNotNull(compositeSet15);
        org.junit.Assert.assertNotNull(compositeSet17);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        examples.Composite composite1 = new examples.Composite((int) (short) -1);
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        java.util.Set<examples.Composite> compositeSet4 = composite1.children();
        examples.Composite composite6 = new examples.Composite((int) (byte) -1);
        java.util.Set<examples.Composite> compositeSet7 = composite6.children();
        examples.Composite composite9 = new examples.Composite((int) '4');
        composite6.addChild(composite9);
        java.util.Set<examples.Composite> compositeSet11 = composite6.children();
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet11);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        examples.Composite composite1 = new examples.Composite(10);
        examples.Composite composite3 = new examples.Composite((int) (short) -1);
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        examples.Composite composite6 = new examples.Composite((-1));
        composite3.addChild(composite6);
        java.util.Set<examples.Composite> compositeSet8 = composite3.children();
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet8);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        examples.Composite composite1 = new examples.Composite((-1));
        java.util.Set<examples.Composite> compositeSet2 = composite1.children();
        java.util.Set<examples.Composite> compositeSet3 = composite1.children();
        org.junit.Assert.assertNotNull(compositeSet2);
        org.junit.Assert.assertNotNull(compositeSet3);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
        examples.Composite composite1 = new examples.Composite((int) '4');
        examples.Composite composite3 = new examples.Composite((int) (short) -1);
        composite1.addChild(composite3);
        java.lang.Class<?> wildcardClass5 = composite1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test53");
        examples.Composite composite1 = new examples.Composite((int) (short) -1);
        examples.Composite composite3 = new examples.Composite(0);
        java.util.Set<examples.Composite> compositeSet4 = composite3.children();
        composite1.addChild(composite3);
        java.util.Set<examples.Composite> compositeSet6 = composite1.children();
        java.util.Set<examples.Composite> compositeSet7 = composite1.children();
        examples.Composite composite9 = new examples.Composite((int) (short) -1);
        examples.Composite composite11 = new examples.Composite(0);
        composite9.addChild(composite11);
        java.util.Set<examples.Composite> compositeSet13 = composite11.children();
        java.util.Set<examples.Composite> compositeSet14 = composite11.children();
        // The following exception was thrown during execution in test generation
        try {
            composite1.addChild(composite11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeSet4);
        org.junit.Assert.assertNotNull(compositeSet6);
        org.junit.Assert.assertNotNull(compositeSet7);
        org.junit.Assert.assertNotNull(compositeSet13);
        org.junit.Assert.assertNotNull(compositeSet14);
    }
}

