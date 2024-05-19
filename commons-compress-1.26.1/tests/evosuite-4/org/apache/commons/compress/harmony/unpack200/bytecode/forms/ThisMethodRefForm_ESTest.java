
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
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.ThisMethodRefForm;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class ThisMethodRefForm_ESTest extends ThisMethodRefForm_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      int[] intArray0 = new int[5];
      ThisMethodRefForm thisMethodRefForm0 = new ThisMethodRefForm((-1871), (String) null, intArray0);
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      int int0 = thisMethodRefForm0.getOffset(operandManager0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      int[] intArray0 = new int[2];
      ThisMethodRefForm thisMethodRefForm0 = new ThisMethodRefForm(0, "L4jA8yp?eiPY", intArray0);
      int[] intArray1 = new int[1];
      intArray1[0] = 420;
      OperandManager operandManager0 = new OperandManager(intArray0, intArray1, intArray1, intArray0, intArray1, intArray1, intArray0, intArray1, intArray1, intArray1, intArray0, intArray1, intArray1, intArray1, intArray1, intArray0, intArray1, intArray1, intArray1, intArray1, intArray0);
      int int0 = thisMethodRefForm0.getOffset(operandManager0);
      assertEquals(420, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      int[] intArray0 = new int[2];
      intArray0[0] = (-2375);
      ThisMethodRefForm thisMethodRefForm0 = new ThisMethodRefForm((-2375), "WEd^Q>Ss\\z6T(R}S~", intArray0);
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      int int0 = thisMethodRefForm0.getOffset(operandManager0);
      assertEquals((-2375), int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      int[] intArray0 = new int[2];
      ThisMethodRefForm thisMethodRefForm0 = new ThisMethodRefForm((-2375), "WEd^Q>Ss\\z6T(R}S~", intArray0);
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, (int[]) null, intArray0, intArray0, intArray0, intArray0, intArray0);
      operandManager0.setCurrentClass("WEd^Q>Ss\\z6T(R}S~");
      String string0 = thisMethodRefForm0.context(operandManager0);
      assertEquals("WEd^Q>Ss\\z6T(R}S~", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      int[] intArray0 = new int[8];
      ThisMethodRefForm thisMethodRefForm0 = new ThisMethodRefForm(540, (String) null, intArray0);
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      operandManager0.setCurrentClass("");
      String string0 = thisMethodRefForm0.context(operandManager0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      int[] intArray0 = new int[9];
      ThisMethodRefForm thisMethodRefForm0 = new ThisMethodRefForm(1486, "t9{:k'", intArray0);
      int[] intArray1 = new int[0];
      OperandManager operandManager0 = new OperandManager(intArray1, intArray0, intArray0, intArray0, intArray0, intArray1, (int[]) null, intArray0, intArray0, (int[]) null, intArray1, intArray0, (int[]) null, (int[]) null, intArray0, intArray1, intArray0, intArray1, intArray0, intArray0, intArray1);
      // Undeclared exception!
      try { 
        thisMethodRefForm0.getOffset(operandManager0);
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
      int[] intArray0 = new int[1];
      ThisMethodRefForm thisMethodRefForm0 = new ThisMethodRefForm(65280, "org.apache.commons.compress.harmony.unpack200.bytecode.forms.ThisMethodRefForm", intArray0);
      // Undeclared exception!
      try { 
        thisMethodRefForm0.context((OperandManager) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.forms.ThisMethodRefForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ThisMethodRefForm thisMethodRefForm0 = null;
      try {
        thisMethodRefForm0 = new ThisMethodRefForm(0, "A+r|ef(PvARZy#n=", (int[]) null);
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
      int[] intArray0 = new int[5];
      ThisMethodRefForm thisMethodRefForm0 = new ThisMethodRefForm((-1871), (String) null, intArray0);
      int int0 = thisMethodRefForm0.getPoolID();
      assertEquals(11, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      int[] intArray0 = new int[5];
      ThisMethodRefForm thisMethodRefForm0 = new ThisMethodRefForm((-1871), (String) null, intArray0);
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      // Undeclared exception!
      try { 
        thisMethodRefForm0.context(operandManager0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Current class not set yet
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      int[] intArray0 = new int[1];
      ThisMethodRefForm thisMethodRefForm0 = new ThisMethodRefForm(461, "", intArray0);
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, (int[]) null, intArray0, intArray0, intArray0);
      // Undeclared exception!
      try { 
        thisMethodRefForm0.getOffset(operandManager0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager", e);
      }
  }
}
