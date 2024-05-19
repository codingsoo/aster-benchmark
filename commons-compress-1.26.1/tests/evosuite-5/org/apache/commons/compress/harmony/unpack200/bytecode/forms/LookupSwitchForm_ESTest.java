
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
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.LookupSwitchForm;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class LookupSwitchForm_ESTest extends LookupSwitchForm_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LookupSwitchForm lookupSwitchForm0 = new LookupSwitchForm(3, "");
      ByteCode byteCode0 = ByteCode.getByteCode(3);
      int[] intArray0 = new int[6];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, (int[]) null, intArray0, intArray0, (int[]) null, intArray0);
      lookupSwitchForm0.setByteCodeOperands(byteCode0, operandManager0, (-2160));
      assertEquals(12, byteCode0.getLength());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LookupSwitchForm lookupSwitchForm0 = new LookupSwitchForm(0, "");
      ByteCode byteCode0 = ByteCode.getByteCode(0);
      int[] intArray0 = new int[9];
      int[] intArray1 = new int[4];
      intArray1[0] = 1851;
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, (int[]) null, intArray0, intArray1, intArray0, intArray0, intArray1, intArray0, intArray1, intArray1, intArray1, intArray1, intArray0, intArray1, intArray1, intArray1, intArray1, intArray0, intArray1);
      lookupSwitchForm0.setByteCodeOperands(byteCode0, operandManager0, 0);
      assertEquals(12, byteCode0.getLength());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      LookupSwitchForm lookupSwitchForm0 = new LookupSwitchForm(1, "^Ji-nj/@-s 6dGZma");
      ByteCode byteCode0 = ByteCode.getByteCode((-2598));
      int[] intArray0 = new int[3];
      intArray0[0] = (-2598);
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, (int[]) null, intArray0, intArray0, intArray0, intArray0, intArray0, (int[]) null, (int[]) null, (int[]) null, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      // Undeclared exception!
      try { 
        lookupSwitchForm0.setByteCodeOperands(byteCode0, operandManager0, 3);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.forms.LookupSwitchForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      LookupSwitchForm lookupSwitchForm0 = new LookupSwitchForm(2717, "");
      ByteCode byteCode0 = ByteCode.getByteCode(2717);
      int[] intArray0 = new int[6];
      intArray0[0] = 2717;
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      // Undeclared exception!
      try { 
        lookupSwitchForm0.setByteCodeOperands(byteCode0, operandManager0, 3);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 6
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      LookupSwitchForm lookupSwitchForm0 = new LookupSwitchForm(2, "");
      ByteCode byteCode0 = ByteCode.getByteCode(2);
      int[] intArray0 = new int[16];
      intArray0[0] = 2;
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      lookupSwitchForm0.setByteCodeOperands(byteCode0, operandManager0, 2);
      assertEquals(26, byteCode0.getLength());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      LookupSwitchForm lookupSwitchForm0 = new LookupSwitchForm((-1550), "");
      int[] intArray0 = new int[5];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      // Undeclared exception!
      try { 
        lookupSwitchForm0.setByteCodeOperands((ByteCode) null, operandManager0, 1622);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.forms.LookupSwitchForm", e);
      }
  }
}
