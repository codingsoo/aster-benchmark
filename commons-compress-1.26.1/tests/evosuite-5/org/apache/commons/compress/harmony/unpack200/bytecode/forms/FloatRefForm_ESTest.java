
/*
  Licensed to the Apache Software Foundation (ASF) under one or more
  contributor license agreements.  See the NOTICE file distributed with
  this work for additional information regarding copyright ownership.
  The ASF licenses this file to You under the Apache License, Version 2.0
  (the "License"); you may not use this file except in compliance with
  the License.  You may obtain a copy of the License at

      http://www.apache.org/licenses/LICENSE-2.0

  Unless required by applicable law or agreed to in writing, software
  distributed under the License is distributed on an "AS IS" BASIS,
  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
  See the License for the specific language governing permissions and
  limitations under the License.
 */


package org.apache.commons.compress.harmony.unpack200.bytecode.forms;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager;
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.FloatRefForm;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class FloatRefForm_ESTest extends FloatRefForm_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int[] intArray0 = new int[2];
      FloatRefForm floatRefForm0 = new FloatRefForm((-1060), "(U(Sp9A3*=", intArray0, false);
      assertTrue(floatRefForm0.nestedMustStartClassPool());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      int[] intArray0 = new int[31];
      FloatRefForm floatRefForm0 = new FloatRefForm(0, "bfe*/S}ZKa-", intArray0);
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      int int0 = floatRefForm0.getOffset(operandManager0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      int[] intArray0 = new int[8];
      FloatRefForm floatRefForm0 = new FloatRefForm(0, "O-4d=>r", intArray0);
      int[] intArray1 = new int[5];
      intArray1[0] = 3;
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray1, intArray1, intArray1, intArray0, intArray1, intArray1, intArray1, intArray1, intArray1, intArray1, intArray0, intArray0, intArray1, intArray1);
      int int0 = floatRefForm0.getOffset(operandManager0);
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      int[] intArray0 = new int[2];
      intArray0[0] = (-2110);
      FloatRefForm floatRefForm0 = new FloatRefForm((-2110), "", intArray0);
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, (int[]) null, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, (int[]) null);
      int int0 = floatRefForm0.getOffset(operandManager0);
      assertEquals((-2110), int0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      int[] intArray0 = new int[9];
      FloatRefForm floatRefForm0 = new FloatRefForm((-3203), "|bqSR`] 1&w7->S]Bb", intArray0);
      int[] intArray1 = new int[0];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray1, intArray1, intArray0, intArray0, intArray1, intArray1, intArray0, intArray1, intArray1, intArray1, intArray0, intArray0, intArray0, intArray0, intArray1, intArray0, intArray0, intArray0);
      // Undeclared exception!
      try { 
        floatRefForm0.getOffset(operandManager0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      FloatRefForm floatRefForm0 = null;
      try {
        floatRefForm0 = new FloatRefForm(494, "jsr_w", (int[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.forms.ByteCodeForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      int[] intArray0 = new int[3];
      FloatRefForm floatRefForm0 = new FloatRefForm(0, "l", intArray0, true);
      int int0 = floatRefForm0.getPoolID();
      assertFalse(floatRefForm0.nestedMustStartClassPool());
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      FloatRefForm floatRefForm0 = null;
      try {
        floatRefForm0 = new FloatRefForm(0, "", (int[]) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.forms.ByteCodeForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      int[] intArray0 = new int[1];
      FloatRefForm floatRefForm0 = new FloatRefForm(615, "G\"Mky~*n", intArray0);
      // Undeclared exception!
      try { 
        floatRefForm0.getOffset((OperandManager) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.forms.FloatRefForm", e);
      }
  }
}
