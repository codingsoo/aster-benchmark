
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


package org.apache.commons.compress.harmony.unpack200.bytecode;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.LinkedList;
import org.apache.commons.compress.harmony.unpack200.Segment;
import org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode;
import org.apache.commons.compress.harmony.unpack200.bytecode.ClassConstantPool;
import org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry;
import org.apache.commons.compress.harmony.unpack200.bytecode.CodeAttribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.ExceptionTableEntry;
import org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager;
import org.apache.commons.compress.harmony.unpack200.bytecode.forms.ByteCodeForm;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class ByteCode_ESTest extends ByteCode_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ByteCode byteCode0 = new ByteCode(221);
      // Undeclared exception!
      try { 
        byteCode0.setOperandSigned2Bytes((-2596), 391);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Trying to rewrite invokespecial_super with an int at position 391 but this won't fit in the rewrite array
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ByteCode byteCode0 = new ByteCode(221);
      int[] intArray0 = new int[5];
      // Undeclared exception!
      try { 
        byteCode0.setOperandBytes(intArray0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Trying to rewrite invokespecial_super with 5 but bytecode has length 2
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode(1239);
      byteCode0.setOperandByte(388, 0);
      assertEquals((-1), byteCode0.getByteCodeIndex());
      assertEquals("aload_0_invokestatic_this", byteCode0.getName());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode((-78));
      byteCode0.setOperand2Bytes(830, (-1));
      assertEquals((-1), byteCode0.getByteCodeIndex());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode((-2760));
      // Undeclared exception!
      try { 
        byteCode0.setOperand2Bytes((-1689), 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ByteCode byteCode0 = new ByteCode(10);
      ClassFileEntry[] classFileEntryArray0 = new ClassFileEntry[5];
      byteCode0.setNested(classFileEntryArray0);
      int[][] intArray0 = new int[1][6];
      int[] intArray1 = new int[9];
      intArray1[1] = 10;
      intArray0[0] = intArray1;
      byteCode0.setNestedPositions(intArray0);
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      // Undeclared exception!
      try { 
        byteCode0.resolve(classConstantPool0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Unhandled resolve lconst_1
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode((-1201));
      int[] intArray0 = new int[9];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, (int[]) null, intArray0, intArray0, intArray0, intArray0, (int[]) null, intArray0, intArray0, (int[]) null, intArray0, (int[]) null, intArray0, intArray0, intArray0, intArray0);
      byteCode0.extractOperands(operandManager0, (Segment) null, 764);
      assertEquals((-1), byteCode0.getByteCodeIndex());
      assertEquals("iastore", byteCode0.toString());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ByteCode byteCode0 = new ByteCode(0);
      byte[] byteArray0 = new byte[6];
      int[] intArray0 = new int[7];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = new CodeAttribute(1717, 832, byteArray0, (Segment) null, operandManager0, linkedList0);
      byteCode0.applyByteCodeTargetFixup(codeAttribute0);
      assertEquals((-1), byteCode0.getByteCodeIndex());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode((-2350));
      byteCode0.setOperandSigned2Bytes(125, 0);
      assertEquals(210, byteCode0.getOpcode());
      assertEquals((-1), byteCode0.getByteCodeIndex());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode(116);
      String string0 = byteCode0.toString();
      assertEquals("", string0);
      assertEquals((-1), byteCode0.getByteCodeIndex());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode((-2071));
      boolean boolean0 = byteCode0.nestedMustStartClassPool();
      assertEquals("cldc", byteCode0.getName());
      assertEquals((-1), byteCode0.getByteCodeIndex());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode((-33));
      boolean boolean0 = byteCode0.hasMultipleByteCodes();
      assertEquals((-1), byteCode0.getByteCodeIndex());
      assertEquals("aload_0_getstatic_super", byteCode0.getName());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode(196);
      byteCode0.hasMultipleByteCodes();
      assertEquals((-1), byteCode0.getByteCodeIndex());
      assertEquals("wide", byteCode0.toString());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ByteCode byteCode0 = new ByteCode(0);
      byteCode0.setRewrite((int[]) null);
      byteCode0.getRewrite();
      assertEquals((-1), byteCode0.getByteCodeIndex());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode(2388);
      int int0 = byteCode0.getOpcode();
      assertEquals((-1), byteCode0.getByteCodeIndex());
      assertEquals(84, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode(42);
      int[][] intArray0 = new int[4][3];
      byteCode0.setNestedPositions(intArray0);
      byteCode0.getNestedPositions();
      assertEquals((-1), byteCode0.getByteCodeIndex());
      assertEquals("aload_0", byteCode0.toString());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ByteCode byteCode0 = new ByteCode(0);
      int[][] intArray0 = new int[2][2];
      intArray0[0] = null;
      byteCode0.setNestedPositions(intArray0);
      int[] intArray1 = byteCode0.getNestedPosition(0);
      assertEquals((-1), byteCode0.getByteCodeIndex());
      assertNull(intArray1);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode(2);
      byteCode0.setNested((ClassFileEntry[]) null);
      ClassFileEntry[] classFileEntryArray0 = byteCode0.getNestedClassFileEntries();
      assertEquals((-1), byteCode0.getByteCodeIndex());
      assertEquals(2, byteCode0.getOpcode());
      assertNull(classFileEntryArray0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode((-1));
      ClassFileEntry[] classFileEntryArray0 = new ClassFileEntry[4];
      byteCode0.setNested(classFileEntryArray0);
      ClassFileEntry[] classFileEntryArray1 = byteCode0.getNestedClassFileEntries();
      assertEquals((-1), byteCode0.getByteCodeIndex());
      assertEquals(4, classFileEntryArray1.length);
      assertEquals("impdep2", byteCode0.toString());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode(1032);
      byteCode0.getNestedClassFileEntries();
      assertEquals((-1), byteCode0.getByteCodeIndex());
      assertEquals("iconst_5", byteCode0.toString());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode(0);
      byteCode0.getLength();
      assertEquals((-1), byteCode0.getByteCodeIndex());
      assertEquals(0, byteCode0.getOpcode());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode(1);
      int[] intArray0 = new int[2];
      byteCode0.setByteCodeTargets(intArray0);
      byteCode0.getByteCodeTargets();
      assertEquals("aconst_null", byteCode0.getName());
      assertEquals((-1), byteCode0.getByteCodeIndex());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ByteCode byteCode0 = new ByteCode(0);
      assertEquals((-1), byteCode0.getByteCodeIndex());
      
      byteCode0.setByteCodeIndex(0);
      int int0 = byteCode0.getByteCodeIndex();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode(196);
      byteCode0.setByteCodeIndex(1262);
      int int0 = byteCode0.getByteCodeIndex();
      assertEquals(1262, int0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ByteCode byteCode0 = new ByteCode(226, (ClassFileEntry[]) null);
      byteCode0.getByteCodeForm();
      assertEquals((-1), byteCode0.getByteCodeIndex());
      assertEquals(226, byteCode0.getOpcode());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode(274);
      ByteCodeForm byteCodeForm0 = byteCode0.getByteCodeForm();
      assertTrue(byteCodeForm0.nestedMustStartClassPool());
      assertEquals((-1), byteCode0.getByteCodeIndex());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode(0);
      ByteCodeForm byteCodeForm0 = byteCode0.getByteCodeForm();
      assertEquals((-1), byteCode0.getByteCodeIndex());
      assertEquals(0, byteCodeForm0.getOpcode());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode((-78));
      int[] intArray0 = new int[2];
      byteCode0.setRewrite(intArray0);
      // Undeclared exception!
      try { 
        byteCode0.setOperandBytes(intArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode(1243);
      byteCode0.setRewrite((int[]) null);
      // Undeclared exception!
      try { 
        byteCode0.setOperandByte(388, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode((-2353));
      // Undeclared exception!
      try { 
        byteCode0.setOperandByte((-2054), (-2054));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2053
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ByteCode byteCode0 = new ByteCode(0);
      int[][] intArray0 = new int[0][4];
      byteCode0.setNestedPositions(intArray0);
      // Undeclared exception!
      try { 
        byteCode0.getNestedPosition((-499));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -499
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode(58);
      byteCode0.setRewrite((int[]) null);
      // Undeclared exception!
      try { 
        byteCode0.getLength();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      // Undeclared exception!
      try { 
        ByteCode.getByteCode(2553);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode(2471);
      int[] intArray0 = new int[9];
      OperandManager operandManager0 = new OperandManager((int[]) null, (int[]) null, intArray0, intArray0, (int[]) null, (int[]) null, intArray0, intArray0, intArray0, (int[]) null, intArray0, intArray0, (int[]) null, (int[]) null, (int[]) null, (int[]) null, intArray0, intArray0, (int[]) null, (int[]) null, (int[]) null);
      // Undeclared exception!
      try { 
        byteCode0.extractOperands(operandManager0, (Segment) null, 193);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode((-2351));
      int[] intArray0 = new int[6];
      int[] intArray1 = new int[0];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray1, intArray1, intArray1, intArray0, intArray1, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray1, intArray0, intArray0, intArray0, intArray0, intArray1);
      // Undeclared exception!
      try { 
        byteCode0.extractOperands(operandManager0, (Segment) null, (-2347));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode((-5040));
      DataOutputStream dataOutputStream0 = new DataOutputStream((OutputStream) null);
      // Undeclared exception!
      try { 
        byteCode0.doWrite(dataOutputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode((-54));
      MockFile mockFile0 = new MockFile("", "dsub");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0);
      mockFileOutputStream0.close();
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockFileOutputStream0);
      try { 
        byteCode0.doWrite(dataOutputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      ClassFileEntry[] classFileEntryArray0 = new ClassFileEntry[0];
      ByteCode byteCode0 = null;
      try {
        byteCode0 = new ByteCode(250, classFileEntryArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      ClassFileEntry[] classFileEntryArray0 = new ClassFileEntry[2];
      ByteCode byteCode0 = null;
      try {
        byteCode0 = new ByteCode(2481, classFileEntryArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2481
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.forms.ByteCodeForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      ByteCode byteCode0 = null;
      try {
        byteCode0 = new ByteCode(241);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      ByteCode byteCode0 = null;
      try {
        byteCode0 = new ByteCode(1908);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1908
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.forms.ByteCodeForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      ByteCode byteCode0 = new ByteCode(0);
      // Undeclared exception!
      try { 
        byteCode0.setOperand2Bytes(0, 0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Trying to rewrite nop that has no rewrite
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode((-54));
      // Undeclared exception!
      try { 
        byteCode0.getNestedPosition((-54));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode(196);
      String string0 = byteCode0.toString();
      assertEquals("wide", string0);
      assertEquals((-1), byteCode0.getByteCodeIndex());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode((-2353));
      // Undeclared exception!
      try { 
        byteCode0.setOperandSigned2Bytes((-2353), (-2353));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2352
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode((-55));
      int[] intArray0 = new int[2];
      // Undeclared exception!
      try { 
        byteCode0.setOperandBytes(intArray0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Trying to rewrite jsr_w with 2 but bytecode has length 4
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode((-54));
      int[] intArray0 = new int[2];
      byteCode0.setOperandBytes(intArray0);
      assertEquals("getstatic_this", byteCode0.getName());
      assertEquals((-1), byteCode0.getByteCodeIndex());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      ByteCode byteCode0 = new ByteCode(0);
      int[] intArray0 = new int[3];
      // Undeclared exception!
      try { 
        byteCode0.setOperandBytes(intArray0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Trying to rewrite nop that has no rewrite
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode((-4590));
      // Undeclared exception!
      try { 
        byteCode0.setOperandBytes((int[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      ByteCode byteCode0 = new ByteCode(0);
      // Undeclared exception!
      try { 
        byteCode0.setOperandByte(0, 0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Trying to rewrite nop that has no rewrite
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode((-4590));
      // Undeclared exception!
      try { 
        byteCode0.setOperandByte(2113, (byte)11);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Trying to rewrite ldc with an byte at position 11 but this won't fit in the rewrite array
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode(156);
      // Undeclared exception!
      try { 
        byteCode0.setOperand2Bytes((-1), 122);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Trying to rewrite ifge with an int at position 122 but this won't fit in the rewrite array
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode(196);
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      byteCode0.resolve(classConstantPool0);
      assertEquals("wide", byteCode0.toString());
      assertEquals((-1), byteCode0.getByteCodeIndex());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      ByteCode byteCode0 = new ByteCode(0);
      boolean boolean0 = byteCode0.equals(byteCode0);
      assertTrue(boolean0);
      assertEquals((-1), byteCode0.getByteCodeIndex());
      assertEquals(0, byteCode0.getOpcode());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode((-54));
      Object object0 = new Object();
      boolean boolean0 = byteCode0.equals(object0);
      assertEquals((-1), byteCode0.getByteCodeIndex());
      assertFalse(boolean0);
      assertEquals("getstatic_this", byteCode0.getName());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode((-54));
      MockFile mockFile0 = new MockFile("", "dsub");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0);
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockFileOutputStream0);
      byteCode0.doWrite(dataOutputStream0);
      assertEquals(3L, mockFile0.length());
      assertEquals(202, byteCode0.getOpcode());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode(393);
      String string0 = byteCode0.getName();
      assertEquals((-1), byteCode0.getByteCodeIndex());
      assertEquals("l2f", string0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode((-54));
      byteCode0.hashCode();
      assertEquals("getstatic_this", byteCode0.getName());
      assertEquals((-1), byteCode0.getByteCodeIndex());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode(196);
      int int0 = byteCode0.getByteCodeIndex();
      assertEquals((-1), int0);
      assertEquals(196, byteCode0.getOpcode());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode(196);
      byteCode0.nestedMustStartClassPool();
      assertEquals((-1), byteCode0.getByteCodeIndex());
      assertEquals(196, byteCode0.getOpcode());
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      ByteCode byteCode0 = new ByteCode(10);
      ClassFileEntry[] classFileEntryArray0 = new ClassFileEntry[5];
      byteCode0.setNested(classFileEntryArray0);
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      // Undeclared exception!
      try { 
        byteCode0.resolve(classConstantPool0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode", e);
      }
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      ByteCode byteCode0 = new ByteCode(0);
      int[] intArray0 = byteCode0.getRewrite();
      assertEquals((-1), byteCode0.getByteCodeIndex());
      assertArrayEquals(new int[] {0}, intArray0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      ByteCode byteCode0 = new ByteCode(0);
      byteCode0.getNestedPositions();
      assertEquals((-1), byteCode0.getByteCodeIndex());
      assertEquals("nop", byteCode0.toString());
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      ByteCode byteCode0 = new ByteCode(0);
      byteCode0.getByteCodeTargets();
      assertEquals((-1), byteCode0.getByteCodeIndex());
      assertEquals("nop", byteCode0.toString());
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      ByteCode byteCode0 = new ByteCode(0);
      // Undeclared exception!
      try { 
        byteCode0.setOperandSigned2Bytes(0, (-1610));
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Trying to rewrite nop that has no rewrite
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode", e);
      }
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      ByteCode byteCode0 = new ByteCode(0);
      int int0 = byteCode0.getOpcode();
      assertEquals(0, int0);
      assertEquals((-1), byteCode0.getByteCodeIndex());
  }
}
