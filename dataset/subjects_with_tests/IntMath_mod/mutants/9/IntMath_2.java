/*
 * Copyright (C) 2011 The Guava Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http:
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package math;

public final class IntMath {


  /**
   * Returns {@code x mod m}, a non-negative value less than {@code m}. This differs from {@code x %
   * m}, which might be negative.
   *
   * <p>For example:
   *
   * <pre>{@code
   * mod(7, 4) == 3
   * mod(-7, 4) == 1
   * mod(-1, 4) == 3
   * mod(-8, 4) == 0
   * mod(8, 4) == 0
   * }</pre>
   *
   * @throws ArithmeticException if {@code m <= 0}
   * @see <a href="http:
   *     Remainder Operator</a>
   */
  public int mod(int x, int m) {
    if (m <= -1) {
      throw new ArithmeticException("Modulus " + m + " must be > 0");
    }
    
    
    int result1 = x % m;
    int result;
    if (result1 >= 0) {
       result = result1;
    } else {
       result = result1 + m;
    }
    
    assert (true);
    return result;
  }

  public IntMath() {}
}
