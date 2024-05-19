
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
import java.util.LinkedList;
import org.apache.commons.compress.harmony.unpack200.Segment;
import org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode;
import org.apache.commons.compress.harmony.unpack200.bytecode.CodeAttribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.ExceptionTableEntry;
import org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager;
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.LookupSwitchForm;
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.TableSwitchForm;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class SwitchForm_ESTest extends SwitchForm_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode(0);
      int[] intArray0 = new int[6];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      TableSwitchForm tableSwitchForm0 = new TableSwitchForm(0, (String) null);
      byteCode0.setByteCodeIndex(0);
      tableSwitchForm0.setRewrite2Bytes(480, 0, intArray0);
      tableSwitchForm0.setByteCodeOperands(byteCode0, operandManager0, (-543));
      byte[] byteArray0 = new byte[8];
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = new CodeAttribute(0, 0, byteArray0, (Segment) null, operandManager0, linkedList0);
      // Undeclared exception!
      try { 
        tableSwitchForm0.fixUpByteCodeTargets(byteCode0, codeAttribute0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 224, Size: 8
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode(1);
      int[] intArray0 = new int[6];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      TableSwitchForm tableSwitchForm0 = new TableSwitchForm(0, (String) null);
      byteCode0.setByteCodeIndex(1);
      tableSwitchForm0.setByteCodeOperands(byteCode0, operandManager0, (-543));
      byte[] byteArray0 = new byte[8];
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = new CodeAttribute(0, 0, byteArray0, (Segment) null, operandManager0, linkedList0);
      tableSwitchForm0.fixUpByteCodeTargets(byteCode0, codeAttribute0);
      assertNull(tableSwitchForm0.getName());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      TableSwitchForm tableSwitchForm0 = new TableSwitchForm((-217), "aload_0_getfield_super");
      ByteCode byteCode0 = ByteCode.getByteCode(0);
      // Undeclared exception!
      try { 
        tableSwitchForm0.fixUpByteCodeTargets(byteCode0, (CodeAttribute) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.forms.SwitchForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode(0);
      int[] intArray0 = new int[6];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      TableSwitchForm tableSwitchForm0 = new TableSwitchForm(0, (String) null);
      byteCode0.setByteCodeIndex(0);
      tableSwitchForm0.setByteCodeOperands(byteCode0, operandManager0, 0);
      byte[] byteArray0 = new byte[8];
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = new CodeAttribute(0, 0, byteArray0, (Segment) null, operandManager0, linkedList0);
      tableSwitchForm0.fixUpByteCodeTargets(byteCode0, codeAttribute0);
      // Undeclared exception!
      try { 
        tableSwitchForm0.fixUpByteCodeTargets(byteCode0, codeAttribute0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Trying to rewrite org.apache.commons.compress.harmony.unpack200.bytecode.forms.TableSwitchForm(null) but there is no room for 4 bytes
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.forms.VariableInstructionForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      LookupSwitchForm lookupSwitchForm0 = new LookupSwitchForm(0, (String) null);
      ByteCode byteCode0 = ByteCode.getByteCode(0);
      int[] intArray0 = new int[6];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      lookupSwitchForm0.setByteCodeOperands(byteCode0, operandManager0, 0);
      TableSwitchForm tableSwitchForm0 = new TableSwitchForm(1, (String) null);
      byte[] byteArray0 = new byte[8];
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = new CodeAttribute(0, 0, byteArray0, (Segment) null, operandManager0, linkedList0);
      // Undeclared exception!
      try { 
        tableSwitchForm0.fixUpByteCodeTargets(byteCode0, codeAttribute0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
