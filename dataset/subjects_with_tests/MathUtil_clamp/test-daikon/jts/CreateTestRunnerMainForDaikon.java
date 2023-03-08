package jts;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.Enumeration;
import java.io.File;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.zip.ZipEntry;

/**
 * DAIKON does not work with reflection for this reason this class uses Reflection to create a java class that invokes all tests in the current package
 */
public class CreateTestRunnerMainForDaikon {

    private static String pathJar;

    public static void main(final String[] args) throws Throwable {
        final StringBuilder javaSB = new StringBuilder();
        pathJar = args[0];
        javaSB.append("package " + CreateTestRunnerMainForDaikon.class.getPackage().getName() + ";");
        javaSB.append(System.lineSeparator());
        javaSB.append("public class RunAllTests{");
        javaSB.append(System.lineSeparator());
        javaSB.append("public static void main(String[] args) throws Throwable {");
        javaSB.append(System.lineSeparator());
        javaSB.append(getInvocations());
        javaSB.append("}");
        javaSB.append(System.lineSeparator());
        javaSB.append("}");
        javaSB.append(System.lineSeparator());

        final String outputFolder = pathJar.split("/build")[0] + "/src/test/java/" + CreateTestRunnerMainForDaikon.class.getPackage().getName().replaceAll("\\.", "/");

        final BufferedWriter writer = new BufferedWriter(new FileWriter(outputFolder + "/RunAllTests.java"));
        writer.write(javaSB.toString());
        writer.close();
    }

    private static String getInvocations() throws Throwable {
        // get classloader
        //final ClassLoader loader = Thread.currentThread().getContextClassLoader();
        // get path of the JAR file
        // pathJar = loader.getResource(CreateTestRunnerMainForDaikon.class.getPackage().getName() + "/CreateTestRunnerMainForDaikon.class").getFile().split("file:")[1].split("!")[0];
        // create url
        final URL url = new File(pathJar).toURI().toURL();
        final URL[] urls = {url};
        final ClassLoader classLoaderJar = new URLClassLoader(urls);

        final JarFile jar = new JarFile(pathJar);
        // Getting the files into the jar
        final Enumeration<? extends JarEntry> enumeration = jar.entries();
        final StringBuilder sb = new StringBuilder();
        // Iterates into the files in the jar file
        while (enumeration.hasMoreElements()) {
            final ZipEntry zipEntry = enumeration.nextElement();

            // Is this a class?
            if (zipEntry.getName().endsWith(".class")) {

                // Relative path of file into the jar.
                String className = zipEntry.getName();

                // Complete class name
                className = className.replace(".class", "").replace("/", ".");
                // Load class definition from JVM

                if (!className.contains("Test") || !className.startsWith(CreateTestRunnerMainForDaikon.class.getPackage().getName())) {
                    continue;
                }

                final Class<?> c = classLoaderJar.loadClass(className);

                if (c.getSimpleName().equals("CreateTestRunnerMainForDaikon") || !c.getSimpleName().contains("Test")) {
                    continue;
                }

                final String invokeString = "new " + c.getSimpleName() + "().";
                for (final Method m : c.getMethods()) {
                    if (m.getName().startsWith("test")) {
                        sb.append(invokeString);
                        sb.append(m.getName());
                        sb.append("();");
                        sb.append(System.lineSeparator());
                    }
                }
            }
        }
        return sb.toString();
    }

}


