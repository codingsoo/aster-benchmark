
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
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.StringRefForm;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class StringRefForm_ESTest extends StringRefForm_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int[] intArray0 = new int[7];
      StringRefForm stringRefForm0 = new StringRefForm(3227, "fload_3", intArray0, true);
      assertFalse(stringRefForm0.nestedMustStartClassPool());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      int[] intArray0 = new int[5];
      intArray0[0] = 1;
      StringRefForm stringRefForm0 = new StringRefForm(1, "", intArray0, false);
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      stringRefForm0.getOffset(operandManager0);
      assertTrue(stringRefForm0.nestedMustStartClassPool());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      int[] intArray0 = new int[6];
      intArray0[0] = (-1669);
      StringRefForm stringRefForm0 = new StringRefForm(0, "org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry", intArray0, false);
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      stringRefForm0.getOffset(operandManager0);
      assertTrue(stringRefForm0.nestedMustStartClassPool());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      int[] intArray0 = new int[2];
      StringRefForm stringRefForm0 = new StringRefForm((-830), "", intArray0, false);
      ByteCode byteCode0 = ByteCode.getByteCode((-830));
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      // Undeclared exception!
      try { 
        stringRefForm0.setNestedEntries(byteCode0, operandManager0, (-830));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      int[] intArray0 = new int[5];
      StringRefForm stringRefForm0 = new StringRefForm(0, "", intArray0);
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, (int[]) null, (int[]) null, (int[]) null, intArray0, (int[]) null, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, (int[]) null);
      // Undeclared exception!
      try { 
        stringRefForm0.getOffset(operandManager0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      int[] intArray0 = new int[0];
      StringRefForm stringRefForm0 = new StringRefForm(0, "org.apache.commons.compress.harmony.unpack200.bytecode.forms.StringRefForm", intArray0);
      int[] intArray1 = new int[0];
      int[] intArray2 = new int[2];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray1, intArray0, intArray1, intArray1, intArray1, intArray1, intArray0, intArray1, intArray0, intArray1, intArray0, intArray0, intArray1, intArray2, intArray1, intArray2);
      // Undeclared exception!
      try { 
        stringRefForm0.getOffset(operandManager0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      StringRefForm stringRefForm0 = null;
      try {
        stringRefForm0 = new StringRefForm((-3779), "2d&|FFZ7L!{\"", (int[]) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.forms.ByteCodeForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      int[] intArray0 = new int[9];
      StringRefForm stringRefForm0 = new StringRefForm(84, "d5A", intArray0, false);
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      stringRefForm0.getOffset(operandManager0);
      assertTrue(stringRefForm0.nestedMustStartClassPool());
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      int[] intArray0 = new int[9];
      StringRefForm stringRefForm0 = new StringRefForm(84, "d5A", intArray0, false);
      int int0 = stringRefForm0.getPoolID();
      assertTrue(stringRefForm0.nestedMustStartClassPool());
      assertEquals(6, int0);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      StringRefForm stringRefForm0 = null;
      try {
        stringRefForm0 = new StringRefForm((-188), ">", (int[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.forms.ByteCodeForm", e);
      }
  }
}
