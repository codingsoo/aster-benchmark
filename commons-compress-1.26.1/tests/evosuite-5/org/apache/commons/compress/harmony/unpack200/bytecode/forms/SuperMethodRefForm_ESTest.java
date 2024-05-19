
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
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.SuperMethodRefForm;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class SuperMethodRefForm_ESTest extends SuperMethodRefForm_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      int[] intArray0 = new int[0];
      SuperMethodRefForm superMethodRefForm0 = new SuperMethodRefForm(1810, "org.apache.commons.compress.harmony.unpack200.bytecode.forms.LocalForm", intArray0);
      int[] intArray1 = new int[4];
      intArray1[0] = 1810;
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray1, intArray1, intArray0);
      int int0 = superMethodRefForm0.getOffset(operandManager0);
      assertEquals(1810, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      int[] intArray0 = new int[0];
      SuperMethodRefForm superMethodRefForm0 = new SuperMethodRefForm(77, "._(.?g%C<4Qh_7FzG", intArray0);
      int[] intArray1 = new int[6];
      int[] intArray2 = new int[3];
      intArray2[0] = (-1616);
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray1, intArray0, intArray2, intArray2, intArray0);
      int int0 = superMethodRefForm0.getOffset(operandManager0);
      assertEquals((-1616), int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      int[] intArray0 = new int[0];
      SuperMethodRefForm superMethodRefForm0 = new SuperMethodRefForm(0, "", intArray0);
      int[] intArray1 = new int[2];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray1, intArray1, intArray0, intArray1, intArray0, intArray0, intArray0, intArray0, intArray1);
      operandManager0.setSuperClass("):");
      String string0 = superMethodRefForm0.context(operandManager0);
      assertEquals("):", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      int[] intArray0 = new int[1];
      SuperMethodRefForm superMethodRefForm0 = new SuperMethodRefForm(3622, "", intArray0);
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      operandManager0.setSuperClass("");
      String string0 = superMethodRefForm0.context(operandManager0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      int[] intArray0 = new int[3];
      SuperMethodRefForm superMethodRefForm0 = new SuperMethodRefForm(0, " 3F;4?)/8TLaeq", intArray0);
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, (int[]) null, intArray0, intArray0);
      // Undeclared exception!
      try { 
        superMethodRefForm0.getOffset(operandManager0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      int[] intArray0 = new int[0];
      SuperMethodRefForm superMethodRefForm0 = new SuperMethodRefForm((-2490), "lcmp", intArray0);
      int[] intArray1 = new int[3];
      OperandManager operandManager0 = new OperandManager(intArray1, intArray0, intArray0, intArray1, intArray0, intArray1, intArray0, intArray1, intArray1, intArray1, intArray1, intArray1, intArray1, intArray0, intArray1, intArray1, intArray1, intArray0, intArray0, intArray1, intArray1);
      // Undeclared exception!
      try { 
        superMethodRefForm0.getOffset(operandManager0);
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
      int[] intArray0 = new int[5];
      SuperMethodRefForm superMethodRefForm0 = new SuperMethodRefForm((-1873), "\"NJb)<7I", intArray0);
      // Undeclared exception!
      try { 
        superMethodRefForm0.context((OperandManager) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.forms.SuperMethodRefForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SuperMethodRefForm superMethodRefForm0 = null;
      try {
        superMethodRefForm0 = new SuperMethodRefForm((-984), "", (int[]) null);
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
      int[] intArray0 = new int[2];
      SuperMethodRefForm superMethodRefForm0 = new SuperMethodRefForm(0, "uqc (p#k!:6PX", intArray0);
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      int int0 = superMethodRefForm0.getOffset(operandManager0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      int[] intArray0 = new int[2];
      SuperMethodRefForm superMethodRefForm0 = new SuperMethodRefForm(0, "uqc (p#k!:6PX", intArray0);
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      // Undeclared exception!
      try { 
        superMethodRefForm0.context(operandManager0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // SuperClass not set yet
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      int[] intArray0 = new int[2];
      SuperMethodRefForm superMethodRefForm0 = new SuperMethodRefForm(0, "uqc (p#k!:6PX", intArray0);
      int int0 = superMethodRefForm0.getPoolID();
      assertEquals(11, int0);
  }
}
