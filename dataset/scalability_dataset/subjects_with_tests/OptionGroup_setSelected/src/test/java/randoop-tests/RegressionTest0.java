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
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection<java.lang.String> strCollection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        org.apache.commons.cli.Option option3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup4 = optionGroup0.addOption(option3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strCollection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection<java.lang.String> strCollection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.toString();
        org.apache.commons.cli.Option option6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup7 = optionGroup0.addOption(option6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strCollection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection1 = optionGroup0.getOptions();
        optionGroup0.setRequired(true);
        org.junit.Assert.assertNotNull(optionCollection1);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection1 = optionGroup0.getOptions();
        boolean boolean2 = optionGroup0.isRequired();
        org.junit.Assert.assertNotNull(optionCollection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection<java.lang.String> strCollection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        java.lang.Class<?> wildcardClass3 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(strCollection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        org.apache.commons.cli.Option option1 = null;
        optionGroup0.setSelected(option1);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection<java.lang.String> strCollection1 = optionGroup0.getNames();
        java.util.Collection<java.lang.String> strCollection2 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        java.util.Collection<java.lang.String> strCollection5 = optionGroup0.getNames();
        org.junit.Assert.assertNotNull(strCollection1);
        org.junit.Assert.assertNotNull(strCollection2);
        org.junit.Assert.assertNotNull(strCollection5);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection<java.lang.String> strCollection1 = optionGroup0.getNames();
        java.util.Collection<java.lang.String> strCollection2 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        org.apache.commons.cli.Option option5 = null;
        optionGroup0.setSelected(option5);
        java.util.Collection<org.apache.commons.cli.Option> optionCollection7 = optionGroup0.getOptions();
        java.lang.Class<?> wildcardClass8 = optionCollection7.getClass();
        org.junit.Assert.assertNotNull(strCollection1);
        org.junit.Assert.assertNotNull(strCollection2);
        org.junit.Assert.assertNotNull(optionCollection7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection<java.lang.String> strCollection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.toString();
        java.util.Collection<java.lang.String> strCollection6 = optionGroup0.getNames();
        org.apache.commons.cli.Option option7 = null;
        optionGroup0.setSelected(option7);
        org.junit.Assert.assertNotNull(strCollection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(strCollection6);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection<java.lang.String> strCollection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.toString();
        boolean boolean6 = optionGroup0.isRequired();
        optionGroup0.setRequired(true);
        org.apache.commons.cli.Option option9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup10 = optionGroup0.addOption(option9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strCollection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection<java.lang.String> strCollection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.toString();
        boolean boolean6 = optionGroup0.isRequired();
        optionGroup0.setRequired(true);
        boolean boolean9 = optionGroup0.isRequired();
        org.junit.Assert.assertNotNull(strCollection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection<java.lang.String> strCollection1 = optionGroup0.getNames();
        java.util.Collection<java.lang.String> strCollection2 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        org.apache.commons.cli.Option option5 = null;
        optionGroup0.setSelected(option5);
        boolean boolean7 = optionGroup0.isRequired();
        org.junit.Assert.assertNotNull(strCollection1);
        org.junit.Assert.assertNotNull(strCollection2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection<java.lang.String> strCollection1 = optionGroup0.getNames();
        java.util.Collection<java.lang.String> strCollection2 = optionGroup0.getNames();
        java.util.Collection<java.lang.String> strCollection3 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        java.lang.String str6 = optionGroup0.toString();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection7 = optionGroup0.getOptions();
        java.lang.Class<?> wildcardClass8 = optionCollection7.getClass();
        org.junit.Assert.assertNotNull(strCollection1);
        org.junit.Assert.assertNotNull(strCollection2);
        org.junit.Assert.assertNotNull(strCollection3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertNotNull(optionCollection7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection<java.lang.String> strCollection1 = optionGroup0.getNames();
        java.util.Collection<java.lang.String> strCollection2 = optionGroup0.getNames();
        java.util.Collection<java.lang.String> strCollection3 = optionGroup0.getNames();
        java.util.Collection<java.lang.String> strCollection4 = optionGroup0.getNames();
        java.lang.String str5 = optionGroup0.getSelected();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection6 = optionGroup0.getOptions();
        java.util.Collection<java.lang.String> strCollection7 = optionGroup0.getNames();
        org.apache.commons.cli.Option option8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup9 = optionGroup0.addOption(option8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strCollection1);
        org.junit.Assert.assertNotNull(strCollection2);
        org.junit.Assert.assertNotNull(strCollection3);
        org.junit.Assert.assertNotNull(strCollection4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(optionCollection6);
        org.junit.Assert.assertNotNull(strCollection7);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection<java.lang.String> strCollection1 = optionGroup0.getNames();
        java.util.Collection<java.lang.String> strCollection2 = optionGroup0.getNames();
        java.util.Collection<java.lang.String> strCollection3 = optionGroup0.getNames();
        java.util.Collection<java.lang.String> strCollection4 = optionGroup0.getNames();
        java.lang.String str5 = optionGroup0.getSelected();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection6 = optionGroup0.getOptions();
        java.util.Collection<java.lang.String> strCollection7 = optionGroup0.getNames();
        boolean boolean8 = optionGroup0.isRequired();
        java.lang.String str9 = optionGroup0.toString();
        org.junit.Assert.assertNotNull(strCollection1);
        org.junit.Assert.assertNotNull(strCollection2);
        org.junit.Assert.assertNotNull(strCollection3);
        org.junit.Assert.assertNotNull(strCollection4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(optionCollection6);
        org.junit.Assert.assertNotNull(strCollection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection<java.lang.String> strCollection1 = optionGroup0.getNames();
        java.util.Collection<java.lang.String> strCollection2 = optionGroup0.getNames();
        java.util.Collection<java.lang.String> strCollection3 = optionGroup0.getNames();
        java.lang.String str4 = optionGroup0.getSelected();
        org.junit.Assert.assertNotNull(strCollection1);
        org.junit.Assert.assertNotNull(strCollection2);
        org.junit.Assert.assertNotNull(strCollection3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection<java.lang.String> strCollection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        org.apache.commons.cli.Option option3 = null;
        optionGroup0.setSelected(option3);
        boolean boolean5 = optionGroup0.isRequired();
        org.junit.Assert.assertNotNull(strCollection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection<java.lang.String> strCollection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.toString();
        java.util.Collection<java.lang.String> strCollection6 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        java.util.Collection<java.lang.String> strCollection9 = optionGroup0.getNames();
        java.lang.Class<?> wildcardClass10 = strCollection9.getClass();
        org.junit.Assert.assertNotNull(strCollection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(strCollection6);
        org.junit.Assert.assertNotNull(strCollection9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection<java.lang.String> strCollection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.toString();
        java.util.Collection<java.lang.String> strCollection6 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        java.util.Collection<java.lang.String> strCollection9 = optionGroup0.getNames();
        java.lang.String str10 = optionGroup0.toString();
        org.junit.Assert.assertNotNull(strCollection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNotNull(strCollection6);
        org.junit.Assert.assertNotNull(strCollection9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection<java.lang.String> strCollection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        java.lang.String str5 = optionGroup0.toString();
        boolean boolean6 = optionGroup0.isRequired();
        optionGroup0.setRequired(true);
        java.lang.Class<?> wildcardClass9 = optionGroup0.getClass();
        org.junit.Assert.assertNotNull(strCollection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection<java.lang.String> strCollection1 = optionGroup0.getNames();
        java.util.Collection<java.lang.String> strCollection2 = optionGroup0.getNames();
        java.lang.String str3 = optionGroup0.getSelected();
        org.apache.commons.cli.Option option4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup5 = optionGroup0.addOption(option4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strCollection1);
        org.junit.Assert.assertNotNull(strCollection2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection<java.lang.String> strCollection1 = optionGroup0.getNames();
        java.util.Collection<java.lang.String> strCollection2 = optionGroup0.getNames();
        java.util.Collection<java.lang.String> strCollection3 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        org.apache.commons.cli.Option option6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.cli.OptionGroup optionGroup7 = optionGroup0.addOption(option6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strCollection1);
        org.junit.Assert.assertNotNull(strCollection2);
        org.junit.Assert.assertNotNull(strCollection3);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection<org.apache.commons.cli.Option> optionCollection1 = optionGroup0.getOptions();
        java.lang.String str2 = optionGroup0.toString();
        org.junit.Assert.assertNotNull(optionCollection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection<java.lang.String> strCollection1 = optionGroup0.getNames();
        java.lang.String str2 = optionGroup0.toString();
        optionGroup0.setRequired(true);
        boolean boolean5 = optionGroup0.isRequired();
        boolean boolean6 = optionGroup0.isRequired();
        org.junit.Assert.assertNotNull(strCollection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        org.apache.commons.cli.OptionGroup optionGroup0 = new org.apache.commons.cli.OptionGroup();
        java.util.Collection<java.lang.String> strCollection1 = optionGroup0.getNames();
        java.util.Collection<java.lang.String> strCollection2 = optionGroup0.getNames();
        optionGroup0.setRequired(false);
        org.apache.commons.cli.Option option5 = null;
        optionGroup0.setSelected(option5);
        java.util.Collection<org.apache.commons.cli.Option> optionCollection7 = optionGroup0.getOptions();
        boolean boolean8 = optionGroup0.isRequired();
        java.util.Collection<java.lang.String> strCollection9 = optionGroup0.getNames();
        org.junit.Assert.assertNotNull(strCollection1);
        org.junit.Assert.assertNotNull(strCollection2);
        org.junit.Assert.assertNotNull(optionCollection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strCollection9);
    }
}

