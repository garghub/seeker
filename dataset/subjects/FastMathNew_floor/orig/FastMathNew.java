/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.commons.math3.util;

import java.io.PrintStream;

import org.apache.commons.math3.exception.MathArithmeticException;
import org.apache.commons.math3.exception.util.LocalizedFormats;

import java.util.Arrays;
import org.plumelib.*;

/**
 * Faster, more accurate, portable alternative to {@link Math} and
 * {@link StrictMath} for large scale computation.
 * <p>
 * FastMath is a drop-in replacement for both Math and StrictMath. This
 * means that for any method in Math (say {@code Math.sin(x)} or
 * {@code Math.cbrt(y)}), user can directly change the class and use the
 * methods as is (using {@code FastMathNew.sin(x)} or {@code FastMathNew.cbrt(y)}
 * in the previous example).
 * </p>
 * <p>
 * FastMath speed is achieved by relying heavily on optimizing compilers
 * to native code present in many JVMs today and use of large tables.
 * The larger tables are lazily initialised on first use, so that the setup
 * time does not penalise methods that don't need them.
 * </p>
 * <p>
 * Note that FastMath is
 * extensively used inside Apache Commons Math, so by calling some algorithms,
 * the overhead when the the tables need to be intialised will occur
 * regardless of the end-user calling FastMath methods directly or not.
 * Performance figures for a specific JVM and hardware can be evaluated by
 * running the FastMathTestPerformance tests in the test directory of the source
 * distribution.
 * </p>
 * <p>
 * FastMath accuracy should be mostly independent of the JVM as it relies only
 * on IEEE-754 basic operations and on embedded tables. Almost all operations
 * are accurate to about 0.5 ulp throughout the domain range. This statement,
 * of course is only a rough global observed behavior, it is <em>not</em> a
 * guarantee for <em>every</em> double numbers input (see William Kahan's <a
 * href="http://en.wikipedia.org/wiki/Rounding#The_table-maker.27s_dilemma">Table
 * Maker's Dilemma</a>).
 * </p>
 * <p>
 * FastMath additionally implements the following methods not found in Math/StrictMath:
 * <ul>
 * <li>{@link #asinh(double)}</li>
 * <li>{@link #acosh(double)}</li>
 * <li>{@link #atanh(double)}</li>
 * </ul>
 * The following methods are found in Math/StrictMath since 1.6 only, they are provided
 * by FastMath even in 1.5 Java virtual machines
 * <ul>
 * <li>{@link #copySign(double, double)}</li>
 * <li>{@link #getExponent(double)}</li>
 * <li>{@link #nextAfter(double,double)}</li>
 * <li>{@link #nextUp(double)}</li>
 * <li>{@link #scalb(double, int)}</li>
 * <li>{@link #copySign(float, float)}</li>
 * <li>{@link #getExponent(float)}</li>
 * <li>{@link #nextAfter(float,double)}</li>
 * <li>{@link #nextUp(float)}</li>
 * <li>{@link #scalb(float, int)}</li>
 * </ul>
 * </p>
 * @since 2.2
 */
public class FastMathNew {
/** 2^52 - double numbers this large must be integral (no fraction) or NaN or Infinite */
    private static final double TWO_POWER_52 = 4503599627370496.0;

    /**
     * Private Constructor
     */
    private FastMathNew() {}

    // Generic helper methods

    /** Get the largest whole number smaller than x.
     * @param x number from which floor is requested
     * @return a double number f such that f is an integer f <= x < f + 1.0
     */
    public static double floor(double x) {
        long y;

        if (x != x) { // NaN
            return x;
        }

        if (x >= TWO_POWER_52 || x <= -TWO_POWER_52) {
            return x;
        }

        y = (long) x;
        if (x < 0 && y != x) {
            y--;
        }

        double result;
        if (y == 0) {
            result = x * y;
        } else {
        	result = y;
        }

        assert (true);
        return result;
    }

}
