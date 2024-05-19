
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
      int[] intArray0 = new int[8];
      FloatRefForm floatRefForm0 = new FloatRefForm(107, "l2d", intArray0);
      assertEquals((-1), floatRefForm0.firstOperandIndex());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      int[] intArray0 = new int[2];
      FloatRefForm floatRefForm0 = new FloatRefForm(0, (String) null, intArray0, true);
      int[] intArray1 = new int[6];
      intArray1[0] = 601;
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray1, intArray1, intArray1, intArray1, intArray1, intArray1, intArray0, intArray1, intArray1, intArray0, intArray0, intArray1, intArray0, intArray1, intArray1, intArray0, (int[]) null, intArray1);
      floatRefForm0.getOffset(operandManager0);
      assertFalse(floatRefForm0.nestedMustStartClassPool());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      int[] intArray0 = new int[3];
      intArray0[0] = (-2750);
      FloatRefForm floatRefForm0 = new FloatRefForm((-2750), (String) null, intArray0, false);
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      floatRefForm0.getOffset(operandManager0);
      assertTrue(floatRefForm0.nestedMustStartClassPool());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      int[] intArray0 = new int[5];
      FloatRefForm floatRefForm0 = new FloatRefForm((-3342), (String) null, intArray0, true);
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

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      FloatRefForm floatRefForm0 = null;
      try {
        floatRefForm0 = new FloatRefForm(0, "*@x3F", (int[]) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.forms.ByteCodeForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      FloatRefForm floatRefForm0 = null;
      try {
        floatRefForm0 = new FloatRefForm((-1729), ".&FtDz`($D", (int[]) null);
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
      FloatRefForm floatRefForm0 = new FloatRefForm((-2750), (String) null, intArray0, false);
      int int0 = floatRefForm0.getPoolID();
      assertEquals(3, int0);
      assertTrue(floatRefForm0.nestedMustStartClassPool());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      int[] intArray0 = new int[3];
      FloatRefForm floatRefForm0 = new FloatRefForm((-2750), (String) null, intArray0, false);
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      floatRefForm0.getOffset(operandManager0);
      floatRefForm0.getOffset(operandManager0);
      operandManager0.nextFloatRef();
      // Undeclared exception!
      try { 
        floatRefForm0.getOffset(operandManager0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager", e);
      }
  }
}
