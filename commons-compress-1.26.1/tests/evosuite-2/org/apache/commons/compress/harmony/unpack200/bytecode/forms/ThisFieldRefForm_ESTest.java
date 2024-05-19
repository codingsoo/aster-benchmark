
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
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.ThisFieldRefForm;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class ThisFieldRefForm_ESTest extends ThisFieldRefForm_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      int[] intArray0 = new int[2];
      intArray0[0] = 98;
      ThisFieldRefForm thisFieldRefForm0 = new ThisFieldRefForm(98, ":z<5F'=LQ@83CU]", intArray0);
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      int int0 = thisFieldRefForm0.getOffset(operandManager0);
      assertEquals(98, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      int[] intArray0 = new int[5];
      intArray0[0] = (-1826);
      ThisFieldRefForm thisFieldRefForm0 = new ThisFieldRefForm((-1826), (String) null, intArray0);
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      int int0 = thisFieldRefForm0.getOffset(operandManager0);
      assertEquals((-1826), int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      int[] intArray0 = new int[4];
      ThisFieldRefForm thisFieldRefForm0 = new ThisFieldRefForm(0, "I`,g]V3(CY{F4,-EI_O", intArray0);
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, (int[]) null, intArray0, (int[]) null, intArray0, intArray0, (int[]) null, intArray0, intArray0, intArray0, intArray0, intArray0, (int[]) null, intArray0, intArray0, intArray0, intArray0, intArray0, (int[]) null, (int[]) null);
      operandManager0.setCurrentClass("I`,g]V3(CY{F4,-EI_O");
      String string0 = thisFieldRefForm0.context(operandManager0);
      assertEquals("I`,g]V3(CY{F4,-EI_O", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      int[] intArray0 = new int[5];
      ThisFieldRefForm thisFieldRefForm0 = new ThisFieldRefForm((-1826), (String) null, intArray0);
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      operandManager0.setCurrentClass("");
      String string0 = thisFieldRefForm0.context(operandManager0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      int[] intArray0 = new int[6];
      ThisFieldRefForm thisFieldRefForm0 = new ThisFieldRefForm(0, ".SD", intArray0);
      // Undeclared exception!
      try { 
        thisFieldRefForm0.getOffset((OperandManager) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.forms.ThisFieldRefForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      int[] intArray0 = new int[9];
      ThisFieldRefForm thisFieldRefForm0 = new ThisFieldRefForm((-3760), (String) null, intArray0);
      int[] intArray1 = new int[0];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray1, intArray1, intArray1, intArray0, intArray0, intArray1, intArray1, intArray1, intArray1, intArray0, intArray1, intArray1, intArray0, intArray0, intArray1, intArray0, intArray1, intArray0, intArray0, intArray1);
      // Undeclared exception!
      try { 
        thisFieldRefForm0.getOffset(operandManager0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      int[] intArray0 = new int[3];
      ThisFieldRefForm thisFieldRefForm0 = new ThisFieldRefForm(0, "istore_1", intArray0);
      // Undeclared exception!
      try { 
        thisFieldRefForm0.context((OperandManager) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.forms.ThisFieldRefForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ThisFieldRefForm thisFieldRefForm0 = null;
      try {
        thisFieldRefForm0 = new ThisFieldRefForm((-99), "", (int[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.forms.ByteCodeForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      int[] intArray0 = new int[21];
      ThisFieldRefForm thisFieldRefForm0 = new ThisFieldRefForm(26, (String) null, intArray0);
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      // Undeclared exception!
      try { 
        thisFieldRefForm0.context(operandManager0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Current class not set yet
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      int[] intArray0 = new int[21];
      ThisFieldRefForm thisFieldRefForm0 = new ThisFieldRefForm(26, (String) null, intArray0);
      int int0 = thisFieldRefForm0.getPoolID();
      assertEquals(10, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      int[] intArray0 = new int[21];
      ThisFieldRefForm thisFieldRefForm0 = new ThisFieldRefForm(26, (String) null, intArray0);
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      int int0 = thisFieldRefForm0.getOffset(operandManager0);
      assertEquals(0, int0);
  }
}
