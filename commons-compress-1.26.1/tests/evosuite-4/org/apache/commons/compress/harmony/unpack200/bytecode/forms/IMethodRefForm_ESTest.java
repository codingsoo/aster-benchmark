
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
import org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode;
import org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager;
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.IMethodRefForm;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class IMethodRefForm_ESTest extends IMethodRefForm_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int[] intArray0 = new int[6];
      intArray0[0] = 2753;
      IMethodRefForm iMethodRefForm0 = new IMethodRefForm(2753, ":C=Tt&~", intArray0);
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, (int[]) null, (int[]) null, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, (int[]) null, intArray0, intArray0, intArray0, intArray0, intArray0);
      int int0 = iMethodRefForm0.getOffset(operandManager0);
      assertEquals(2753, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      int[] intArray0 = new int[1];
      intArray0[0] = (-408);
      IMethodRefForm iMethodRefForm0 = new IMethodRefForm((-408), "", intArray0);
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      int int0 = iMethodRefForm0.getOffset(operandManager0);
      assertEquals((-408), int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      int[] intArray0 = new int[6];
      IMethodRefForm iMethodRefForm0 = new IMethodRefForm(24, "*nZ4}7D_DQ(CYw7{Oe", intArray0);
      ByteCode byteCode0 = ByteCode.getByteCode(24);
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      // Undeclared exception!
      try { 
        iMethodRefForm0.setByteCodeOperands(byteCode0, operandManager0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      int[] intArray0 = new int[0];
      IMethodRefForm iMethodRefForm0 = new IMethodRefForm(1705, "l", intArray0);
      // Undeclared exception!
      try { 
        iMethodRefForm0.getOffset((OperandManager) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.forms.IMethodRefForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      int[] intArray0 = new int[1];
      IMethodRefForm iMethodRefForm0 = new IMethodRefForm((-408), "", intArray0);
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      iMethodRefForm0.getOffset(operandManager0);
      // Undeclared exception!
      try { 
        iMethodRefForm0.getOffset(operandManager0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      IMethodRefForm iMethodRefForm0 = null;
      try {
        iMethodRefForm0 = new IMethodRefForm(3705, "x{=pG-{)A}+KuH", (int[]) null);
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
      int[] intArray0 = new int[6];
      IMethodRefForm iMethodRefForm0 = new IMethodRefForm(24, "*nZ4}7D_DQ(CYw7{Oe", intArray0);
      int int0 = iMethodRefForm0.getPoolID();
      assertEquals(12, int0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      int[] intArray0 = new int[0];
      IMethodRefForm iMethodRefForm0 = new IMethodRefForm(0, "", intArray0);
      int[] intArray1 = new int[8];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray1, intArray1, intArray1, intArray1, intArray1, intArray1, intArray1, intArray1, intArray0, intArray0, intArray1, intArray1, intArray1, intArray1, (int[]) null, intArray1);
      // Undeclared exception!
      try { 
        iMethodRefForm0.setByteCodeOperands((ByteCode) null, operandManager0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager", e);
      }
  }
}
