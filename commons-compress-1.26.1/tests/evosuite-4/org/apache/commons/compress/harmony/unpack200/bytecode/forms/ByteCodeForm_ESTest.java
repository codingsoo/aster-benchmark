
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
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.ByteCodeForm;
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.ByteForm;
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.ClassRefForm;
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.FloatRefForm;
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.IincForm;
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.IntRefForm;
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.LabelForm;
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.LookupSwitchForm;
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.MethodRefForm;
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.NarrowClassRefForm;
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.NewClassRefForm;
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.NewInitMethodRefForm;
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.StringRefForm;
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.SuperInitMethodRefForm;
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.ThisInitMethodRefForm;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class ByteCodeForm_ESTest extends ByteCodeForm_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      int[] intArray0 = new int[2];
      intArray0[0] = (-1075);
      intArray0[1] = (-1075);
      ByteForm byteForm0 = new ByteForm((-1075), "ifne", intArray0);
      assertEquals(2, byteForm0.operandLength());
      assertEquals((-1075), byteForm0.getOpcode());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      int[] intArray0 = new int[8];
      intArray0[2] = (int) (byte) (-60);
      intArray0[4] = 226;
      MethodRefForm methodRefForm0 = new MethodRefForm((byte)2, "k[< ", intArray0);
      assertEquals(2, methodRefForm0.getOpcode());
      assertEquals(1, methodRefForm0.operandLength());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      int[] intArray0 = new int[8];
      LabelForm labelForm0 = new LabelForm(134, "Q[dRC", intArray0, true);
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      ByteCode byteCode0 = ByteCode.getByteCode((-755));
      labelForm0.setByteCodeOperands(byteCode0, operandManager0, 2577);
      assertEquals((-1), labelForm0.operandLength());
      assertEquals(134, labelForm0.getOpcode());
      assertFalse(labelForm0.hasNoOperand());
      assertEquals("fconst_2", byteCode0.getName());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      int[] intArray0 = new int[5];
      FloatRefForm floatRefForm0 = new FloatRefForm(1006, "iload", intArray0, true);
      ByteCode byteCode0 = ByteCode.getByteCode(1006);
      floatRefForm0.fixUpByteCodeTargets(byteCode0, (CodeAttribute) null);
      assertEquals(1006, floatRefForm0.getOpcode());
      assertEquals("fldc_w", byteCode0.getName());
      assertEquals((-1), floatRefForm0.operandLength());
      assertFalse(floatRefForm0.hasNoOperand());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      int[] intArray0 = new int[2];
      ByteForm byteForm0 = new ByteForm((-1075), "ifne", intArray0);
      byteForm0.calculateOperandPosition();
      assertEquals((-1), byteForm0.operandLength());
      assertEquals((-1075), byteForm0.getOpcode());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      int[] intArray0 = new int[3];
      intArray0[0] = (-463);
      ByteForm byteForm0 = new ByteForm((-463), "", intArray0);
      int int0 = byteForm0.operandLength();
      assertEquals((-463), byteForm0.getOpcode());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      int[] intArray0 = new int[4];
      SuperInitMethodRefForm superInitMethodRefForm0 = new SuperInitMethodRefForm(1850, "/NQB|$33l!\"", intArray0);
      int int0 = superInitMethodRefForm0.operandLength();
      assertEquals(1850, superInitMethodRefForm0.getOpcode());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      int[] intArray0 = new int[6];
      NarrowClassRefForm narrowClassRefForm0 = new NarrowClassRefForm(4, "G8O.G1yGX>p", intArray0);
      narrowClassRefForm0.nestedMustStartClassPool();
      assertEquals(4, narrowClassRefForm0.getOpcode());
      assertEquals((-1), narrowClassRefForm0.operandLength());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      int[] intArray0 = new int[6];
      StringRefForm stringRefForm0 = new StringRefForm(229, "<init>", intArray0);
      boolean boolean0 = stringRefForm0.hasNoOperand();
      assertEquals(229, stringRefForm0.getOpcode());
      assertEquals((-1), stringRefForm0.operandLength());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      int[] intArray0 = new int[9];
      NewClassRefForm newClassRefForm0 = new NewClassRefForm(935, "", intArray0);
      boolean boolean0 = newClassRefForm0.hasMultipleByteCodes();
      assertEquals(935, newClassRefForm0.getOpcode());
      assertEquals((-1), newClassRefForm0.operandLength());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      int[] intArray0 = new int[2];
      IntRefForm intRefForm0 = new IntRefForm(20, "K{I^>Urs)F*%{QBx", intArray0, true);
      intRefForm0.getRewriteCopy();
      assertEquals((-1), intRefForm0.operandLength());
      assertEquals(20, intRefForm0.getOpcode());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      int[] intArray0 = new int[0];
      NewInitMethodRefForm newInitMethodRefForm0 = new NewInitMethodRefForm((-2893), "org.apache.commons.compress.harmony.unpack200.bytecode.ConstantValueAttribute", intArray0);
      newInitMethodRefForm0.getRewriteCopy();
      assertEquals((-2893), newInitMethodRefForm0.getOpcode());
      assertEquals((-1), newInitMethodRefForm0.operandLength());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      int[] intArray0 = new int[8];
      LabelForm labelForm0 = new LabelForm((-2031), "vfwMdxEg", intArray0);
      labelForm0.getRewrite();
      assertEquals((-1), labelForm0.operandLength());
      assertEquals((-2031), labelForm0.getOpcode());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      int[] intArray0 = new int[0];
      NarrowClassRefForm narrowClassRefForm0 = new NarrowClassRefForm(255, "AwX.", intArray0, false);
      narrowClassRefForm0.getRewrite();
      assertEquals(255, narrowClassRefForm0.getOpcode());
      assertEquals((-1), narrowClassRefForm0.operandLength());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      int[] intArray0 = new int[2];
      IincForm iincForm0 = new IincForm((byte)0, "Bm^^\"`H`VwJiM0D", intArray0);
      int int0 = iincForm0.getOpcode();
      assertEquals(0, int0);
      assertEquals((-1), iincForm0.operandLength());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      int[] intArray0 = new int[0];
      NarrowClassRefForm narrowClassRefForm0 = new NarrowClassRefForm(255, "AwX.", intArray0, false);
      int int0 = narrowClassRefForm0.getOpcode();
      assertEquals(255, int0);
      assertEquals((-1), narrowClassRefForm0.operandLength());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      int[] intArray0 = new int[2];
      ByteForm byteForm0 = new ByteForm((-1075), "ifne", intArray0);
      int int0 = byteForm0.getOpcode();
      assertEquals((-1), byteForm0.operandLength());
      assertEquals((-1075), int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      int[] intArray0 = new int[9];
      ClassRefForm classRefForm0 = new ClassRefForm(96, (String) null, intArray0, false);
      classRefForm0.getName();
      assertEquals(96, classRefForm0.getOpcode());
      assertEquals((-1), classRefForm0.operandLength());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      int[] intArray0 = new int[2];
      IincForm iincForm0 = new IincForm(2285, "O.Z(N2N'EX7Dv=p", intArray0);
      iincForm0.getName();
      assertEquals((-1), iincForm0.operandLength());
      assertEquals(2285, iincForm0.getOpcode());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      int[] intArray0 = new int[2];
      ThisInitMethodRefForm thisInitMethodRefForm0 = new ThisInitMethodRefForm(10, "", intArray0);
      thisInitMethodRefForm0.getName();
      assertEquals(10, thisInitMethodRefForm0.getOpcode());
      assertEquals((-1), thisInitMethodRefForm0.operandLength());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ByteCodeForm byteCodeForm0 = ByteCodeForm.get(0);
      assertEquals(0, byteCodeForm0.getOpcode());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ByteCodeForm byteCodeForm0 = ByteCodeForm.get(226);
      assertEquals(2, byteCodeForm0.operandLength());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      int[] intArray0 = new int[8];
      intArray0[0] = (-16777216);
      IntRefForm intRefForm0 = new IntRefForm((-16777216), "NameAndType: ", intArray0);
      int int0 = intRefForm0.firstOperandIndex();
      assertEquals((-16777216), intRefForm0.getOpcode());
      assertEquals(1, intRefForm0.operandLength());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      int[] intArray0 = new int[7];
      intArray0[2] = (-71);
      ThisInitMethodRefForm thisInitMethodRefForm0 = new ThisInitMethodRefForm(238, "", intArray0);
      int int0 = thisInitMethodRefForm0.firstOperandIndex();
      assertEquals(238, thisInitMethodRefForm0.getOpcode());
      assertEquals(1, thisInitMethodRefForm0.operandLength());
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ByteCodeForm byteCodeForm0 = ByteCodeForm.get(1);
      byteCodeForm0.firstOperandIndex();
      assertEquals("aconst_null", byteCodeForm0.getName());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      LookupSwitchForm lookupSwitchForm0 = new LookupSwitchForm(78, (String) null);
      ByteCode byteCode0 = ByteCode.getByteCode(305);
      // Undeclared exception!
      try { 
        lookupSwitchForm0.setByteCodeOperands(byteCode0, (OperandManager) null, 171);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.forms.LookupSwitchForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      // Undeclared exception!
      try { 
        ByteCodeForm.get(426);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 426
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.forms.ByteCodeForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      int[] intArray0 = new int[12];
      ByteForm byteForm0 = new ByteForm(171, "org.apache.commons.compress.^armony.unpack200.bytecode.forms.ByteCodeForm", intArray0);
      boolean boolean0 = byteForm0.nestedMustStartClassPool();
      assertFalse(boolean0);
      assertEquals(171, byteForm0.getOpcode());
      assertEquals((-1), byteForm0.operandLength());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      LookupSwitchForm lookupSwitchForm0 = new LookupSwitchForm(264, "K 9[AhYl");
      int[] intArray0 = new int[9];
      intArray0[0] = 264;
      ByteCode byteCode0 = ByteCode.getByteCode(199);
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      // Undeclared exception!
      try { 
        lookupSwitchForm0.setByteCodeOperands(byteCode0, operandManager0, 264);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 9
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[5] = (byte)54;
      int[] intArray0 = new int[5];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = new CodeAttribute(228, 228, byteArray0, (Segment) null, operandManager0, linkedList0);
      assertEquals(228, codeAttribute0.maxLocals);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      int[] intArray0 = new int[12];
      ByteForm byteForm0 = new ByteForm(171, "org.apache.commons.compress.^armony.unpack200.bytecode.forms.ByteCodeForm", intArray0);
      String string0 = byteForm0.toString();
      assertEquals(171, byteForm0.getOpcode());
      assertEquals("org.apache.commons.compress.harmony.unpack200.bytecode.forms.ByteForm(org.apache.commons.compress.^armony.unpack200.bytecode.forms.ByteCodeForm)", string0);
      assertEquals((-1), byteForm0.operandLength());
  }
}
