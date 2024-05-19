
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
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.TableSwitchForm;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class TableSwitchForm_ESTest extends TableSwitchForm_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TableSwitchForm tableSwitchForm0 = new TableSwitchForm(0, "<Q[86,Oq[Hc h|rB?");
      ByteCode byteCode0 = ByteCode.getByteCode((-1355));
      int[] intArray0 = new int[4];
      int[] intArray1 = new int[4];
      intArray1[0] = (-1355);
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray1, intArray1, intArray0, intArray1, intArray0, intArray1, intArray0, intArray0, intArray0, intArray1, intArray0, intArray1, intArray0, intArray1, (int[]) null, intArray0, (int[]) null);
      tableSwitchForm0.setByteCodeOperands(byteCode0, operandManager0, (-1355));
      assertEquals(19, byteCode0.getLength());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      TableSwitchForm tableSwitchForm0 = new TableSwitchForm(3, "h*L{U");
      ByteCode byteCode0 = ByteCode.getByteCode(3);
      int[] intArray0 = new int[1];
      intArray0[0] = 3;
      int[] intArray1 = new int[4];
      OperandManager operandManager0 = new OperandManager(intArray1, intArray0, intArray0, intArray0, intArray1, intArray0, intArray0, intArray1, intArray1, intArray1, intArray1, intArray1, intArray1, intArray0, intArray1, intArray1, intArray1, intArray0, intArray1, intArray0, intArray0);
      tableSwitchForm0.setByteCodeOperands(byteCode0, operandManager0, (-313));
      assertEquals(17, byteCode0.getLength());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      TableSwitchForm tableSwitchForm0 = new TableSwitchForm(3121, "Trying to renumber a line number table that has already been renumbered");
      // Undeclared exception!
      try { 
        tableSwitchForm0.setByteCodeOperands((ByteCode) null, (OperandManager) null, 3121);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.forms.TableSwitchForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      TableSwitchForm tableSwitchForm0 = new TableSwitchForm(820, "!KU%uI");
      ByteCode byteCode0 = ByteCode.getByteCode(5251);
      int[] intArray0 = new int[8];
      intArray0[0] = 3668;
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      // Undeclared exception!
      try { 
        tableSwitchForm0.setByteCodeOperands(byteCode0, operandManager0, 5251);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 8
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      TableSwitchForm tableSwitchForm0 = new TableSwitchForm(3121, "Trying to renumber a line number table that has already been renumbered");
      ByteCode byteCode0 = ByteCode.getByteCode(2311);
      int[] intArray0 = new int[9];
      intArray0[0] = 4;
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      tableSwitchForm0.setByteCodeOperands(byteCode0, operandManager0, 0);
      assertEquals(32, byteCode0.getLength());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      TableSwitchForm tableSwitchForm0 = new TableSwitchForm((-1), ";6*>)eRJkta#DN1UF");
      ByteCode byteCode0 = ByteCode.getByteCode((-1));
      int[] intArray0 = new int[6];
      intArray0[0] = (-1);
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, (int[]) null);
      // Undeclared exception!
      try { 
        tableSwitchForm0.setByteCodeOperands(byteCode0, operandManager0, 196);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.forms.TableSwitchForm", e);
      }
  }
}
