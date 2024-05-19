
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
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.SuperInitMethodRefForm;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class SuperInitMethodRefForm_ESTest extends SuperInitMethodRefForm_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int[] intArray0 = new int[9];
      SuperInitMethodRefForm superInitMethodRefForm0 = new SuperInitMethodRefForm((-2648), "d2i", intArray0);
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, (int[]) null, intArray0, intArray0, intArray0);
      operandManager0.setSuperClass("Iy}*T5zC<1$<");
      String string0 = superInitMethodRefForm0.context(operandManager0);
      assertEquals("Iy}*T5zC<1$<", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      int[] intArray0 = new int[7];
      SuperInitMethodRefForm superInitMethodRefForm0 = new SuperInitMethodRefForm(159, "", intArray0);
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      operandManager0.setSuperClass("");
      String string0 = superInitMethodRefForm0.context(operandManager0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      int[] intArray0 = new int[8];
      SuperInitMethodRefForm superInitMethodRefForm0 = new SuperInitMethodRefForm(0, "I&]P5s[YO", intArray0);
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      // Undeclared exception!
      try { 
        superInitMethodRefForm0.context(operandManager0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // SuperClass not set yet
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      SuperInitMethodRefForm superInitMethodRefForm0 = null;
      try {
        superInitMethodRefForm0 = new SuperInitMethodRefForm(1, "@Jwxq8\"W|Eld#", (int[]) null);
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
      int[] intArray0 = new int[7];
      SuperInitMethodRefForm superInitMethodRefForm0 = new SuperInitMethodRefForm((-1760), "h#2UP$~", intArray0);
      // Undeclared exception!
      try { 
        superInitMethodRefForm0.context((OperandManager) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.forms.SuperInitMethodRefForm", e);
      }
  }
}
