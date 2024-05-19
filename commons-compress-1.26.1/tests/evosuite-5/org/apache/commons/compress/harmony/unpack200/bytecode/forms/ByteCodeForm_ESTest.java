
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
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.ClassRefForm;
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.FieldRefForm;
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.FloatRefForm;
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.IntRefForm;
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.LabelForm;
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.LongForm;
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.LookupSwitchForm;
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.NarrowClassRefForm;
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.NoArgumentForm;
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.StringRefForm;
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.SuperFieldRefForm;
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.TableSwitchForm;
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.ThisFieldRefForm;
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.ThisInitMethodRefForm;
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.WideForm;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class ByteCodeForm_ESTest extends ByteCodeForm_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      int[] intArray0 = new int[3];
      intArray0[0] = 198;
      LongForm longForm0 = new LongForm(198, "", intArray0);
      boolean boolean0 = longForm0.hasMultipleByteCodes();
      assertFalse(boolean0);
      assertEquals(198, longForm0.getOpcode());
      assertEquals((-1), longForm0.operandLength());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      int[] intArray0 = new int[3];
      intArray0[0] = (-1391);
      intArray0[1] = (-1526);
      FloatRefForm floatRefForm0 = new FloatRefForm((-1526), "C;qY?A-", intArray0, true);
      assertEquals((-1526), floatRefForm0.getOpcode());
      assertEquals(2, floatRefForm0.operandLength());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      int[] intArray0 = new int[4];
      intArray0[2] = (-53);
      intArray0[3] = 3;
      ThisFieldRefForm thisFieldRefForm0 = new ThisFieldRefForm(3, "V>j6d*,2", intArray0);
      assertEquals(3, thisFieldRefForm0.getOpcode());
      assertEquals(1, thisFieldRefForm0.operandLength());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      int[] intArray0 = new int[3];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      LabelForm labelForm0 = new LabelForm(2075, "{VbJ;YSmQZ@,!Z", intArray0, false);
      ByteCode byteCode0 = ByteCode.getByteCode(30);
      labelForm0.setByteCodeOperands(byteCode0, operandManager0, 198);
      assertFalse(labelForm0.hasNoOperand());
      assertEquals((-1), labelForm0.operandLength());
      assertEquals(2075, labelForm0.getOpcode());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      int[] intArray0 = new int[2];
      SuperFieldRefForm superFieldRefForm0 = new SuperFieldRefForm(0, "H3 V5rbAKJCxms+gO?", intArray0);
      ByteCode byteCode0 = ByteCode.getByteCode(0);
      superFieldRefForm0.fixUpByteCodeTargets(byteCode0, (CodeAttribute) null);
      assertEquals(0, superFieldRefForm0.getOpcode());
      assertEquals((-1), byteCode0.getByteCodeIndex());
      assertEquals((-1), superFieldRefForm0.operandLength());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      NoArgumentForm noArgumentForm0 = new NoArgumentForm(218, "");
      noArgumentForm0.calculateOperandPosition();
      assertEquals((-1), noArgumentForm0.operandLength());
      assertEquals(218, noArgumentForm0.getOpcode());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      int[] intArray0 = new int[1];
      intArray0[0] = (-1526);
      FieldRefForm fieldRefForm0 = new FieldRefForm((-1526), "", intArray0);
      int int0 = fieldRefForm0.operandLength();
      assertEquals((-1526), fieldRefForm0.getOpcode());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      int[] intArray0 = new int[0];
      NarrowClassRefForm narrowClassRefForm0 = new NarrowClassRefForm(1872, "", intArray0, false);
      int int0 = narrowClassRefForm0.operandLength();
      assertEquals(1872, narrowClassRefForm0.getOpcode());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      int[] intArray0 = new int[4];
      IntRefForm intRefForm0 = new IntRefForm(2248, "-v;=R4'mT?smSX", intArray0, false);
      intRefForm0.nestedMustStartClassPool();
      assertEquals((-1), intRefForm0.operandLength());
      assertEquals(2248, intRefForm0.getOpcode());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      int[] intArray0 = new int[1];
      FieldRefForm fieldRefForm0 = new FieldRefForm((-1526), "", intArray0);
      boolean boolean0 = fieldRefForm0.hasNoOperand();
      assertEquals((-1), fieldRefForm0.operandLength());
      assertFalse(boolean0);
      assertEquals((-1526), fieldRefForm0.getOpcode());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      NoArgumentForm noArgumentForm0 = new NoArgumentForm(218, "");
      boolean boolean0 = noArgumentForm0.hasMultipleByteCodes();
      assertEquals(218, noArgumentForm0.getOpcode());
      assertFalse(boolean0);
      assertEquals((-1), noArgumentForm0.operandLength());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      WideForm wideForm0 = new WideForm(143, "3! h8&]A'p-!`<");
      wideForm0.getRewriteCopy();
      assertEquals((-1), wideForm0.operandLength());
      assertEquals(143, wideForm0.getOpcode());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      int[] intArray0 = new int[0];
      ClassRefForm classRefForm0 = new ClassRefForm(1579, "/", intArray0, false);
      classRefForm0.getRewriteCopy();
      assertEquals(1579, classRefForm0.getOpcode());
      assertEquals((-1), classRefForm0.operandLength());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      int[] intArray0 = new int[1];
      LabelForm labelForm0 = new LabelForm(169, "f'H", intArray0);
      labelForm0.getRewrite();
      assertEquals(169, labelForm0.getOpcode());
      assertEquals((-1), labelForm0.operandLength());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      int[] intArray0 = new int[0];
      StringRefForm stringRefForm0 = new StringRefForm(189, "dmul", intArray0, true);
      stringRefForm0.getRewrite();
      assertEquals(189, stringRefForm0.getOpcode());
      assertEquals((-1), stringRefForm0.operandLength());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      int[] intArray0 = new int[2];
      SuperFieldRefForm superFieldRefForm0 = new SuperFieldRefForm(0, "H3 V5rbAKJCxms+gO?", intArray0);
      int int0 = superFieldRefForm0.getOpcode();
      assertEquals((-1), superFieldRefForm0.operandLength());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      int[] intArray0 = new int[5];
      ThisInitMethodRefForm thisInitMethodRefForm0 = new ThisInitMethodRefForm(628, "8Zd2gV+z:t}saQ!`WJ", intArray0);
      int int0 = thisInitMethodRefForm0.getOpcode();
      assertEquals((-1), thisInitMethodRefForm0.operandLength());
      assertEquals(628, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      int[] intArray0 = new int[6];
      LabelForm labelForm0 = new LabelForm((-2789), (String) null, intArray0, false);
      int int0 = labelForm0.getOpcode();
      assertEquals((-1), labelForm0.operandLength());
      assertEquals((-2789), int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      NoArgumentForm noArgumentForm0 = new NoArgumentForm((-3358), "org.apache.commons.compress.harmony.unpack200.bytecode.forms.ClassRefForm");
      noArgumentForm0.getName();
      assertEquals((-3358), noArgumentForm0.getOpcode());
      assertEquals(1, noArgumentForm0.operandLength());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      int[] intArray0 = new int[3];
      LongForm longForm0 = new LongForm(403, "", intArray0);
      longForm0.getName();
      assertEquals(403, longForm0.getOpcode());
      assertEquals((-1), longForm0.operandLength());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ByteCodeForm byteCodeForm0 = ByteCodeForm.get(245);
      assertNull(byteCodeForm0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ByteCodeForm byteCodeForm0 = ByteCodeForm.get(0);
      assertFalse(byteCodeForm0.hasNoOperand());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ByteCodeForm byteCodeForm0 = ByteCodeForm.get(212);
      assertEquals(212, byteCodeForm0.getOpcode());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      int[] intArray0 = new int[1];
      intArray0[0] = (-1526);
      FloatRefForm floatRefForm0 = new FloatRefForm((-1526), "C;qY?A-", intArray0, true);
      int int0 = floatRefForm0.firstOperandIndex();
      assertEquals((-1526), floatRefForm0.getOpcode());
      assertEquals(1, floatRefForm0.operandLength());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      int[] intArray0 = new int[4];
      intArray0[2] = (-53);
      LabelForm labelForm0 = new LabelForm(3, "gyu$AXHrvRNq}8*", intArray0);
      int int0 = labelForm0.firstOperandIndex();
      assertEquals(1, labelForm0.operandLength());
      assertEquals(3, labelForm0.getOpcode());
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      int[] intArray0 = new int[0];
      StringRefForm stringRefForm0 = new StringRefForm(189, "dmul", intArray0, true);
      stringRefForm0.firstOperandIndex();
      assertEquals(189, stringRefForm0.getOpcode());
      assertEquals((-1), stringRefForm0.operandLength());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      int[] intArray0 = new int[5];
      ThisInitMethodRefForm thisInitMethodRefForm0 = new ThisInitMethodRefForm(31, "ja%c#eE-z?Hx*2)qpcw", intArray0);
      ByteCode byteCode0 = ByteCode.getByteCode(185);
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      // Undeclared exception!
      try { 
        thisInitMethodRefForm0.setByteCodeOperands(byteCode0, operandManager0, (-1245));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      // Undeclared exception!
      try { 
        ByteCodeForm.get(1730);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1730
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.forms.ByteCodeForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      LookupSwitchForm lookupSwitchForm0 = new LookupSwitchForm((-1004), (String) null);
      lookupSwitchForm0.getName();
      assertEquals(1, lookupSwitchForm0.operandLength());
      assertEquals((-1004), lookupSwitchForm0.getOpcode());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      int[] intArray0 = new int[1];
      LabelForm labelForm0 = new LabelForm((-1), "f'H", intArray0);
      boolean boolean0 = labelForm0.nestedMustStartClassPool();
      assertEquals((-1), labelForm0.getOpcode());
      assertEquals((-1), labelForm0.operandLength());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      TableSwitchForm tableSwitchForm0 = new TableSwitchForm(82, "ifnull");
      ByteCode byteCode0 = ByteCode.getByteCode(82);
      int[] intArray0 = new int[8];
      intArray0[0] = 82;
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      // Undeclared exception!
      try { 
        tableSwitchForm0.setByteCodeOperands(byteCode0, operandManager0, (-2312));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 8
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte)17;
      int[] intArray0 = new int[2];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = new CodeAttribute((-3358), (-3358), byteArray0, (Segment) null, operandManager0, linkedList0);
      assertEquals((-3358), codeAttribute0.maxLocals);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      int[] intArray0 = new int[1];
      LabelForm labelForm0 = new LabelForm((-1), "f'H", intArray0);
      String string0 = labelForm0.toString();
      assertEquals((-1), labelForm0.getOpcode());
      assertEquals((-1), labelForm0.operandLength());
      assertEquals("org.apache.commons.compress.harmony.unpack200.bytecode.forms.LabelForm(f'H)", string0);
  }
}
