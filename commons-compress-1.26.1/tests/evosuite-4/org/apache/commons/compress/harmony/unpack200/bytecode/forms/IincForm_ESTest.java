
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
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.IincForm;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class IincForm_ESTest extends IincForm_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int[] intArray0 = new int[6];
      intArray0[0] = 1223;
      IincForm iincForm0 = new IincForm(1223, "PLId*", intArray0);
      ByteCode byteCode0 = ByteCode.getByteCode(1223);
      int[] intArray1 = new int[2];
      OperandManager operandManager0 = new OperandManager(intArray1, intArray0, intArray0, intArray1, intArray1, intArray0, intArray0, intArray1, intArray1, intArray0, intArray1, intArray0, intArray0, intArray0, intArray0, intArray1, intArray1, intArray0, intArray1, intArray1, intArray1);
      iincForm0.setByteCodeOperands(byteCode0, operandManager0, 0);
      assertEquals((-1), iincForm0.operandLength());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      int[] intArray0 = new int[8];
      IincForm iincForm0 = new IincForm(2, "Dx%mR|a0O%R?x|K/tj&", intArray0);
      ByteCode byteCode0 = ByteCode.getByteCode(0);
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      // Undeclared exception!
      try { 
        iincForm0.setByteCodeOperands(byteCode0, operandManager0, 2);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Trying to rewrite nop that has no rewrite
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      int[] intArray0 = new int[0];
      IincForm iincForm0 = new IincForm(178, "", intArray0);
      ByteCode byteCode0 = ByteCode.getByteCode(178);
      int[] intArray1 = new int[9];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray1, intArray1, intArray0, intArray0, intArray1, intArray0, intArray1, intArray1, intArray0, intArray1);
      // Undeclared exception!
      try { 
        iincForm0.setByteCodeOperands(byteCode0, operandManager0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      IincForm iincForm0 = null;
      try {
        iincForm0 = new IincForm(1636, "org.apache.commons.compress.harmony.unpack200.bytecode.forms.IincForm", (int[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.forms.ByteCodeForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      int[] intArray0 = new int[9];
      IincForm iincForm0 = new IincForm(0, "8", intArray0);
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      // Undeclared exception!
      try { 
        iincForm0.setByteCodeOperands((ByteCode) null, operandManager0, (-1348));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.forms.IincForm", e);
      }
  }
}
