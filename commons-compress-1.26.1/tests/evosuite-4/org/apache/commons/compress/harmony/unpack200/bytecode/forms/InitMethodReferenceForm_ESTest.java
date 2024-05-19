
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
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.SuperInitMethodRefForm;
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.ThisInitMethodRefForm;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class InitMethodReferenceForm_ESTest extends InitMethodReferenceForm_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int[] intArray0 = new int[4];
      ThisInitMethodRefForm thisInitMethodRefForm0 = new ThisInitMethodRefForm(2492, "_kzq4oS,:ItqQHVP(Km", intArray0);
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, (int[]) null, intArray0, intArray0, (int[]) null, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      int int0 = thisInitMethodRefForm0.getOffset(operandManager0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      int[] intArray0 = new int[9];
      intArray0[0] = 281;
      SuperInitMethodRefForm superInitMethodRefForm0 = new SuperInitMethodRefForm(281, "", intArray0);
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      int int0 = superInitMethodRefForm0.getOffset(operandManager0);
      assertEquals(281, int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      int[] intArray0 = new int[5];
      intArray0[0] = (-1133);
      NewInitMethodRefForm newInitMethodRefForm0 = new NewInitMethodRefForm((-1133), "", intArray0);
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      int int0 = newInitMethodRefForm0.getOffset(operandManager0);
      assertEquals((-1133), int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      int[] intArray0 = new int[3];
      NewInitMethodRefForm newInitMethodRefForm0 = new NewInitMethodRefForm(2030, "org.apache.commons.compress.harmony.unpack200.bytecode.forms.InitMethodReferenceForm", intArray0);
      ByteCode byteCode0 = ByteCode.getByteCode(2030);
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      // Undeclared exception!
      try { 
        newInitMethodRefForm0.setNestedEntries(byteCode0, operandManager0, 2030);
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
      int[] intArray0 = new int[9];
      NewInitMethodRefForm newInitMethodRefForm0 = new NewInitMethodRefForm(0, "KHUzgk~<*rjPl", intArray0);
      // Undeclared exception!
      try { 
        newInitMethodRefForm0.getOffset((OperandManager) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.forms.InitMethodReferenceForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      int[] intArray0 = new int[0];
      NewInitMethodRefForm newInitMethodRefForm0 = new NewInitMethodRefForm(0, "getstatic_this", intArray0);
      int[] intArray1 = new int[6];
      OperandManager operandManager0 = new OperandManager(intArray1, (int[]) null, intArray1, intArray0, intArray1, intArray1, intArray1, intArray0, (int[]) null, (int[]) null, intArray1, intArray1, intArray0, intArray1, intArray0, intArray0, intArray1, intArray0, intArray1, intArray0, intArray1);
      // Undeclared exception!
      try { 
        newInitMethodRefForm0.getOffset(operandManager0);
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
      int[] intArray0 = new int[2];
      NewInitMethodRefForm newInitMethodRefForm0 = new NewInitMethodRefForm(0, "FT&\"xbIN($%", intArray0);
      int int0 = newInitMethodRefForm0.getPoolID();
      assertEquals(11, int0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      int[] intArray0 = new int[1];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      SuperInitMethodRefForm superInitMethodRefForm0 = new SuperInitMethodRefForm(388, "]Ej2;R>?/VLb", intArray0);
      // Undeclared exception!
      try { 
        superInitMethodRefForm0.setByteCodeOperands((ByteCode) null, operandManager0, 388);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager", e);
      }
  }
}
