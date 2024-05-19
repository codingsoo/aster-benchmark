
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
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.NewInitMethodRefForm;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class NewInitMethodRefForm_ESTest extends NewInitMethodRefForm_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int[] intArray0 = new int[6];
      NewInitMethodRefForm newInitMethodRefForm0 = new NewInitMethodRefForm(346, ",F%3cp_1(g,USFO", intArray0);
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      operandManager0.setNewClass(",F%3cp_1(g,USFO");
      String string0 = newInitMethodRefForm0.context(operandManager0);
      assertEquals(",F%3cp_1(g,USFO", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      int[] intArray0 = new int[7];
      NewInitMethodRefForm newInitMethodRefForm0 = new NewInitMethodRefForm(1090, "", intArray0);
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      operandManager0.setNewClass("");
      String string0 = newInitMethodRefForm0.context(operandManager0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      int[] intArray0 = new int[3];
      NewInitMethodRefForm newInitMethodRefForm0 = new NewInitMethodRefForm(229, "", intArray0);
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      // Undeclared exception!
      try { 
        newInitMethodRefForm0.context(operandManager0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // New class not set yet
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      NewInitMethodRefForm newInitMethodRefForm0 = null;
      try {
        newInitMethodRefForm0 = new NewInitMethodRefForm(0, "", (int[]) null);
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
      int[] intArray0 = new int[6];
      NewInitMethodRefForm newInitMethodRefForm0 = new NewInitMethodRefForm(346, ",F%3cp_1(g,USFO", intArray0);
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      // Undeclared exception!
      try { 
        newInitMethodRefForm0.setNestedEntries((ByteCode) null, operandManager0, 346);
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
      int[] intArray0 = new int[3];
      NewInitMethodRefForm newInitMethodRefForm0 = new NewInitMethodRefForm(2329, "", intArray0);
      // Undeclared exception!
      try { 
        newInitMethodRefForm0.context((OperandManager) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.forms.NewInitMethodRefForm", e);
      }
  }
}
