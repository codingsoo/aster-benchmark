
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
import java.util.List;
import org.apache.commons.compress.harmony.unpack200.Segment;
import org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode;
import org.apache.commons.compress.harmony.unpack200.bytecode.CodeAttribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.ExceptionTableEntry;
import org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager;
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.LabelForm;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class LabelForm_ESTest extends LabelForm_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int[] intArray0 = new int[4];
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte) (-55);
      byteArray0[1] = (byte) (-55);
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = new CodeAttribute(0, (-966), byteArray0, (Segment) null, operandManager0, linkedList0);
      assertEquals(10, codeAttribute0.codeLength);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      int[] intArray0 = new int[4];
      intArray0[1] = 4;
      LabelForm labelForm0 = new LabelForm(4, "<", intArray0);
      ByteCode byteCode0 = ByteCode.getByteCode(125);
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      labelForm0.setByteCodeOperands(byteCode0, operandManager0, 117);
      byte[] byteArray0 = new byte[8];
      byteArray0[1] = (byte) (-102);
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = new CodeAttribute((-1), 0, byteArray0, (Segment) null, operandManager0, linkedList0);
      assertTrue(codeAttribute0.hasBCIRenumbering());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      int[] intArray0 = new int[3];
      LabelForm labelForm0 = new LabelForm(124, "", intArray0, false);
      assertEquals("", labelForm0.getName());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      int[] intArray0 = new int[6];
      LabelForm labelForm0 = new LabelForm((-1280), (String) null, intArray0);
      ByteCode byteCode0 = ByteCode.getByteCode((-1280));
      // Undeclared exception!
      try { 
        labelForm0.setByteCodeOperands(byteCode0, (OperandManager) null, (-1280));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.forms.LabelForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      int[] intArray0 = new int[0];
      LabelForm labelForm0 = new LabelForm(0, "", intArray0);
      ByteCode byteCode0 = ByteCode.getByteCode(0);
      int[] intArray1 = new int[9];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray1, intArray0, intArray1, intArray1, intArray1, intArray1, intArray0, intArray0, intArray0, intArray1, intArray0, intArray0, intArray1);
      // Undeclared exception!
      try { 
        labelForm0.setByteCodeOperands(byteCode0, operandManager0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      int[] intArray0 = new int[1];
      LabelForm labelForm0 = new LabelForm(0, "", intArray0, true);
      ByteCode byteCode0 = ByteCode.getByteCode(0);
      byte[] byteArray0 = new byte[4];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = new CodeAttribute(0, 0, byteArray0, (Segment) null, operandManager0, linkedList0);
      // Undeclared exception!
      try { 
        labelForm0.fixUpByteCodeTargets(byteCode0, codeAttribute0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.forms.LabelForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      int[] intArray0 = new int[6];
      LabelForm labelForm0 = new LabelForm(0, "impdep2", intArray0);
      ByteCode byteCode0 = ByteCode.getByteCode(276);
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      labelForm0.setByteCodeOperands(byteCode0, operandManager0, (-913));
      byte[] byteArray0 = new byte[2];
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = new CodeAttribute(0, 0, byteArray0, (Segment) null, operandManager0, linkedList0);
      LinkedList<Integer> linkedList1 = new LinkedList<Integer>();
      codeAttribute0.byteCodeOffsets = (List<Integer>) linkedList1;
      // Undeclared exception!
      try { 
        labelForm0.fixUpByteCodeTargets(byteCode0, codeAttribute0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: -1, Size: 0
         //
         verifyException("java.util.LinkedList", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      int[] intArray0 = new int[6];
      LabelForm labelForm0 = new LabelForm(0, "impdep2", intArray0);
      ByteCode byteCode0 = ByteCode.getByteCode(276);
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      labelForm0.setByteCodeOperands(byteCode0, operandManager0, (-913));
      byte[] byteArray0 = new byte[2];
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = new CodeAttribute(0, 0, byteArray0, (Segment) null, operandManager0, linkedList0);
      // Undeclared exception!
      try { 
        labelForm0.fixUpByteCodeTargets(byteCode0, codeAttribute0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      LabelForm labelForm0 = null;
      try {
        labelForm0 = new LabelForm((-1305), "org.apache.commons.compress.harmony.unpack200.bytecode.forms.LabelForm", (int[]) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.forms.ByteCodeForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      LabelForm labelForm0 = null;
      try {
        labelForm0 = new LabelForm(0, "3LHK7M", (int[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.forms.ByteCodeForm", e);
      }
  }
}
