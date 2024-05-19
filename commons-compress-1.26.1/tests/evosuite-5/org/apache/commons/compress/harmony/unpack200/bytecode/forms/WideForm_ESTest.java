
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
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.WideForm;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class WideForm_ESTest extends WideForm_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      WideForm wideForm0 = new WideForm(0, "");
      ByteCode byteCode0 = ByteCode.getByteCode(4482);
      int[] intArray0 = new int[8];
      int[] intArray1 = new int[4];
      intArray1[0] = 4482;
      OperandManager operandManager0 = new OperandManager(intArray0, intArray1, intArray0, intArray0, intArray1, intArray0, intArray1, intArray0, intArray1, intArray0, intArray0, intArray0, (int[]) null, intArray0, intArray0, intArray1, intArray1, intArray1, intArray1, intArray1, intArray1);
      wideForm0.setByteCodeOperandsFormat2(0, byteCode0, operandManager0, (-665));
      assertEquals(6, byteCode0.getLength());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      WideForm wideForm0 = new WideForm(1814, "HhO]>uy}E");
      ByteCode byteCode0 = ByteCode.getByteCode(1814);
      int[] intArray0 = new int[3];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      wideForm0.setByteCodeOperandsFormat2(1814, byteCode0, operandManager0, 1814);
      assertEquals(6, byteCode0.getLength());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      WideForm wideForm0 = new WideForm((-2079), "HB5Y;8>#7");
      int[] intArray0 = new int[9];
      intArray0[0] = (-2079);
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      // Undeclared exception!
      try { 
        wideForm0.setByteCodeOperandsFormat2((-2079), (ByteCode) null, operandManager0, (-2079));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.forms.WideForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      WideForm wideForm0 = new WideForm(1646, "");
      ByteCode byteCode0 = ByteCode.getByteCode(0);
      int[] intArray0 = new int[7];
      intArray0[0] = 1646;
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      wideForm0.setByteCodeOperands(byteCode0, operandManager0, 1646);
      assertEquals(4, byteCode0.getLength());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      WideForm wideForm0 = new WideForm(227, (String) null);
      ByteCode byteCode0 = ByteCode.getByteCode(227);
      int[] intArray0 = new int[6];
      intArray0[0] = 227;
      OperandManager operandManager0 = new OperandManager((int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, intArray0, intArray0, intArray0, (int[]) null, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      // Undeclared exception!
      try { 
        wideForm0.setByteCodeOperands(byteCode0, operandManager0, 0);
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
      WideForm wideForm0 = new WideForm(424, "@ pR'");
      ByteCode byteCode0 = ByteCode.getByteCode((-1));
      int[] intArray0 = new int[0];
      int[] intArray1 = new int[7];
      OperandManager operandManager0 = new OperandManager(intArray1, intArray1, intArray1, intArray0, intArray1, intArray1, intArray1, intArray1, intArray0, intArray1, intArray1, intArray1, intArray1, intArray1, intArray1, intArray1, intArray1, intArray1, intArray0, intArray1, intArray1);
      // Undeclared exception!
      try { 
        wideForm0.setByteCodeOperandsFormat2(424, byteCode0, operandManager0, 424);
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
      WideForm wideForm0 = new WideForm(2399, ">o5");
      int[] intArray0 = new int[2];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      // Undeclared exception!
      try { 
        wideForm0.setByteCodeOperandsFormat1(37, (ByteCode) null, operandManager0, (-3090));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.forms.WideForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      WideForm wideForm0 = new WideForm(4, "k+lk/?;\"23Aj98l8nT");
      ByteCode byteCode0 = ByteCode.getByteCode(4);
      int[] intArray0 = new int[8];
      int[] intArray1 = new int[0];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray1, intArray1, intArray0, intArray1, intArray0, intArray0, intArray0, intArray1, intArray0, intArray0, intArray1, intArray0, intArray0, intArray1, intArray0, intArray0, intArray1);
      // Undeclared exception!
      try { 
        wideForm0.setByteCodeOperandsFormat1(4, byteCode0, operandManager0, (-251));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      WideForm wideForm0 = new WideForm(227, (String) null);
      ByteCode byteCode0 = ByteCode.getByteCode(227);
      int[] intArray0 = new int[6];
      OperandManager operandManager0 = new OperandManager((int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, intArray0, intArray0, intArray0, (int[]) null, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      // Undeclared exception!
      try { 
        wideForm0.setByteCodeOperands(byteCode0, operandManager0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      WideForm wideForm0 = new WideForm(132, "org.apache.commons.compress.harmony.unpack200.bytecode.forms.WideForm");
      ByteCode byteCode0 = ByteCode.getByteCode(132);
      int[] intArray0 = new int[0];
      int[] intArray1 = new int[2];
      intArray1[0] = 132;
      OperandManager operandManager0 = new OperandManager(intArray0, intArray1, intArray0, intArray1, intArray0, intArray0, intArray1, intArray0, intArray1, intArray1, intArray0, intArray1, intArray0, intArray1, intArray1, intArray1, intArray1, intArray0, intArray1, intArray1, intArray1);
      // Undeclared exception!
      try { 
        wideForm0.setByteCodeOperands(byteCode0, operandManager0, 358);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      WideForm wideForm0 = new WideForm((-3327), "");
      ByteCode byteCode0 = ByteCode.getByteCode((-3327));
      int[] intArray0 = new int[1];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      wideForm0.setByteCodeOperands(byteCode0, operandManager0, (-3327));
      assertEquals(4, byteCode0.getLength());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      WideForm wideForm0 = new WideForm(424, "@ pR'");
      ByteCode byteCode0 = ByteCode.getByteCode((-1));
      int[] intArray0 = new int[0];
      int[] intArray1 = new int[7];
      OperandManager operandManager0 = new OperandManager(intArray1, intArray1, intArray1, intArray0, intArray1, intArray1, intArray1, intArray1, intArray0, intArray1, intArray1, intArray1, intArray1, intArray1, intArray1, intArray1, intArray1, intArray1, intArray0, intArray1, intArray1);
      wideForm0.setByteCodeOperandsFormat1((-1), byteCode0, operandManager0, 132);
      assertEquals(4, byteCode0.getLength());
  }
}
