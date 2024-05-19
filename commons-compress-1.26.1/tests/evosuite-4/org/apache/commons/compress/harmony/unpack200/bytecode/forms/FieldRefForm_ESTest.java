
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
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.FieldRefForm;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class FieldRefForm_ESTest extends FieldRefForm_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int[] intArray0 = new int[2];
      intArray0[0] = 107;
      FieldRefForm fieldRefForm0 = new FieldRefForm(107, "Q}j}A?MG>;J3l", intArray0);
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      int int0 = fieldRefForm0.getOffset(operandManager0);
      assertEquals(107, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      int[] intArray0 = new int[2];
      intArray0[0] = (-2699);
      FieldRefForm fieldRefForm0 = new FieldRefForm((-2699), "org.apache.commons.compress.harmony.unpack200.bytecode.forms.FieldRefForm", intArray0);
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      int int0 = fieldRefForm0.getOffset(operandManager0);
      assertEquals((-2699), int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      int[] intArray0 = new int[7];
      FieldRefForm fieldRefForm0 = new FieldRefForm(1, "", intArray0);
      // Undeclared exception!
      try { 
        fieldRefForm0.getOffset((OperandManager) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.forms.FieldRefForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      int[] intArray0 = new int[2];
      FieldRefForm fieldRefForm0 = new FieldRefForm(107, "Q}j}A?MG>;J3l", intArray0);
      int[] intArray1 = new int[1];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray1, intArray0, intArray1, intArray1, intArray1, intArray1, intArray0, intArray1, intArray1, intArray1, intArray1, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      fieldRefForm0.getOffset(operandManager0);
      // Undeclared exception!
      try { 
        fieldRefForm0.getOffset(operandManager0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      FieldRefForm fieldRefForm0 = null;
      try {
        fieldRefForm0 = new FieldRefForm(1, "@zxUBQK", (int[]) null);
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
      int[] intArray0 = new int[2];
      FieldRefForm fieldRefForm0 = new FieldRefForm(0, ")L", intArray0);
      int int0 = fieldRefForm0.getPoolID();
      assertEquals(10, int0);
  }
}
