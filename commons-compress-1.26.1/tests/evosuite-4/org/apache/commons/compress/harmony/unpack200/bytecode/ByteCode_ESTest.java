
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
import java.io.File;
import java.io.IOException;
import java.io.PipedOutputStream;
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
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class ByteCode_ESTest extends ByteCode_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode(2975);
      int[] intArray0 = new int[2];
      byteCode0.setOperandBytes(intArray0);
      assertEquals((-1), byteCode0.getByteCodeIndex());
      assertEquals(159, byteCode0.getOpcode());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode((-567));
      int[] intArray0 = new int[3];
      // Undeclared exception!
      try { 
        byteCode0.setOperandBytes(intArray0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Trying to rewrite jsr_w with 3 but bytecode has length 4
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode((-584));
      // Undeclared exception!
      try { 
        byteCode0.setOperandByte(65246, (-584));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -583
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode((-557));
      // Undeclared exception!
      try { 
        byteCode0.setOperand2Bytes(0, 2);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Trying to rewrite aload_0_getfield_this with an int at position 2 but this won't fit in the rewrite array
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ByteCode byteCode0 = new ByteCode(22);
      // Undeclared exception!
      try { 
        byteCode0.setOperandSigned2Bytes(22, 0);
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
      ClassFileEntry[] classFileEntryArray0 = new ClassFileEntry[4];
      ByteCode byteCode0 = new ByteCode(158, classFileEntryArray0);
      int[][] intArray0 = new int[9][8];
      int[] intArray1 = new int[4];
      intArray1[1] = 3516;
      intArray0[0] = intArray1;
      byteCode0.setNestedPositions(intArray0);
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      // Undeclared exception!
      try { 
        byteCode0.resolve(classConstantPool0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Unhandled resolve ifle
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ByteCode byteCode0 = new ByteCode(145);
      int[] intArray0 = new int[8];
      OperandManager operandManager0 = new OperandManager((int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      byteCode0.extractOperands(operandManager0, (Segment) null, (-1538));
      assertEquals((-1), byteCode0.getByteCodeIndex());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode(114);
      byte[] byteArray0 = new byte[0];
      int[] intArray0 = new int[9];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, (int[]) null, intArray0, intArray0, (int[]) null, intArray0, (int[]) null, (int[]) null);
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = new CodeAttribute(114, 114, byteArray0, (Segment) null, operandManager0, linkedList0);
      byteCode0.applyByteCodeTargetFixup(codeAttribute0);
      assertEquals("frem", byteCode0.toString());
      assertEquals((-1), byteCode0.getByteCodeIndex());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode((-1301));
      boolean boolean0 = byteCode0.nestedMustStartClassPool();
      assertEquals((-1), byteCode0.getByteCodeIndex());
      assertEquals(235, byteCode0.getOpcode());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode((-557));
      byteCode0.hasMultipleByteCodes();
      assertEquals("aload_0_getfield_this", byteCode0.toString());
      assertEquals((-1), byteCode0.getByteCodeIndex());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode((-1301));
      byteCode0.hasMultipleByteCodes();
      assertEquals("fldc", byteCode0.toString());
      assertEquals((-1), byteCode0.getByteCodeIndex());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode(111);
      int[] intArray0 = new int[0];
      byteCode0.setRewrite(intArray0);
      byteCode0.getRewrite();
      assertEquals((-1), byteCode0.getByteCodeIndex());
      assertEquals("ddiv", byteCode0.toString());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode(0);
      int int0 = byteCode0.getOpcode();
      assertEquals(0, int0);
      assertEquals((-1), byteCode0.getByteCodeIndex());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode((-1301));
      int int0 = byteCode0.getOpcode();
      assertEquals(235, int0);
      assertEquals((-1), byteCode0.getByteCodeIndex());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ByteCode byteCode0 = new ByteCode(126);
      int[][] intArray0 = new int[2][0];
      byteCode0.setNestedPositions(intArray0);
      byteCode0.getNestedPositions();
      assertEquals((-1), byteCode0.getByteCodeIndex());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ByteCode byteCode0 = new ByteCode(0, (ClassFileEntry[]) null);
      ClassFileEntry[] classFileEntryArray0 = byteCode0.getNestedClassFileEntries();
      assertEquals((-1), byteCode0.getByteCodeIndex());
      assertNull(classFileEntryArray0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode(8);
      ClassFileEntry[] classFileEntryArray0 = new ClassFileEntry[7];
      byteCode0.setNested(classFileEntryArray0);
      ClassFileEntry[] classFileEntryArray1 = byteCode0.getNestedClassFileEntries();
      assertEquals((-1), byteCode0.getByteCodeIndex());
      assertEquals(7, classFileEntryArray1.length);
      assertEquals("iconst_5", byteCode0.toString());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode((-1313));
      int int0 = byteCode0.getLength();
      assertEquals((-1), byteCode0.getByteCodeIndex());
      assertEquals("aload_0_getstatic_super", byteCode0.toString());
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ByteCode byteCode0 = new ByteCode(0);
      int[] intArray0 = new int[2];
      byteCode0.setByteCodeTargets(intArray0);
      byteCode0.getByteCodeTargets();
      assertEquals((-1), byteCode0.getByteCodeIndex());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode(8);
      byteCode0.setByteCodeIndex(185);
      int int0 = byteCode0.getByteCodeIndex();
      assertEquals(185, int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ClassFileEntry[] classFileEntryArray0 = new ClassFileEntry[2];
      ByteCode byteCode0 = new ByteCode(0, classFileEntryArray0);
      byteCode0.getByteCodeForm();
      assertEquals((-1), byteCode0.getByteCodeIndex());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode((-1564));
      ByteCodeForm byteCodeForm0 = byteCode0.getByteCodeForm();
      assertEquals((-1), byteCode0.getByteCodeIndex());
      assertEquals("aload_0_invokespecial_super", byteCodeForm0.getName());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode((-567));
      byteCode0.setRewrite((int[]) null);
      // Undeclared exception!
      try { 
        byteCode0.setOperandSigned2Bytes((-567), 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode(0);
      // Undeclared exception!
      try { 
        byteCode0.setOperandSigned2Bytes(0, 1212);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Trying to rewrite nop that has no rewrite
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode((-567));
      // Undeclared exception!
      try { 
        byteCode0.setOperandSigned2Bytes(1645, (-653));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -652
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode((-567));
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
  public void test26()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode((-570));
      byteCode0.setRewrite((int[]) null);
      // Undeclared exception!
      try { 
        byteCode0.setOperandByte(65246, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode((-541));
      int[] intArray0 = new int[2];
      byteCode0.setRewrite(intArray0);
      // Undeclared exception!
      try { 
        byteCode0.setOperandByte(65280, 0);
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
      ByteCode byteCode0 = ByteCode.getByteCode(2974);
      // Undeclared exception!
      try { 
        byteCode0.setOperand2Bytes(733, (-16777216));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -16777215
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ClassFileEntry[] classFileEntryArray0 = new ClassFileEntry[4];
      int[] intArray0 = new int[0];
      ByteCode byteCode0 = new ByteCode(158, classFileEntryArray0);
      int[][] intArray1 = new int[9][8];
      intArray1[0] = intArray0;
      byteCode0.setNestedPositions(intArray1);
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      // Undeclared exception!
      try { 
        byteCode0.resolve(classConstantPool0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ByteCode byteCode0 = new ByteCode(9);
      int[][] intArray0 = new int[2][1];
      byteCode0.setNestedPositions(intArray0);
      // Undeclared exception!
      try { 
        byteCode0.getNestedPosition((-239));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -239
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ByteCode byteCode0 = new ByteCode(27);
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
        ByteCode.getByteCode((-3589));
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
      ByteCode byteCode0 = ByteCode.getByteCode((-1811));
      int[] intArray0 = new int[1];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      // Undeclared exception!
      try { 
        byteCode0.extractOperands(operandManager0, (Segment) null, (-1811));
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
      ByteCode byteCode0 = ByteCode.getByteCode((-1366));
      int[] intArray0 = new int[5];
      intArray0[0] = 86;
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      // Undeclared exception!
      try { 
        byteCode0.extractOperands(operandManager0, (Segment) null, 86);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 5
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode(1385);
      // Undeclared exception!
      try { 
        byteCode0.doWrite((DataOutputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode(8);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      DataOutputStream dataOutputStream0 = new DataOutputStream(pipedOutputStream0);
      try { 
        byteCode0.doWrite(dataOutputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      ClassFileEntry[] classFileEntryArray0 = new ClassFileEntry[5];
      ByteCode byteCode0 = null;
      try {
        byteCode0 = new ByteCode(241, classFileEntryArray0);
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
      ClassFileEntry[] classFileEntryArray0 = new ClassFileEntry[5];
      ByteCode byteCode0 = null;
      try {
        byteCode0 = new ByteCode((-2323), classFileEntryArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2323
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.forms.ByteCodeForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      ByteCode byteCode0 = null;
      try {
        byteCode0 = new ByteCode(252);
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
        byteCode0 = new ByteCode(831);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 831
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.forms.ByteCodeForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode((-567));
      byteCode0.setOperand2Bytes(0, 2);
      assertEquals((-1), byteCode0.getByteCodeIndex());
      assertEquals("jsr_w", byteCode0.toString());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      ByteCode byteCode0 = new ByteCode(0);
      // Undeclared exception!
      try { 
        byteCode0.getNestedPosition(0);
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
      ByteCode byteCode0 = new ByteCode(126);
      byteCode0.getNestedPositions();
      assertEquals((-1), byteCode0.getByteCodeIndex());
      assertEquals(126, byteCode0.getOpcode());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode((-1301));
      String string0 = byteCode0.toString();
      assertEquals("fldc", string0);
      assertEquals((-1), byteCode0.getByteCodeIndex());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode((-570));
      byteCode0.setOperandSigned2Bytes((-570), 0);
      assertEquals((-1), byteCode0.getByteCodeIndex());
      assertEquals(198, byteCode0.getOpcode());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      ByteCode byteCode0 = new ByteCode(0, (ClassFileEntry[]) null);
      // Undeclared exception!
      try { 
        byteCode0.setOperandBytes((int[]) null);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Trying to rewrite nop that has no rewrite
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode((-1301));
      int[] intArray0 = new int[5];
      // Undeclared exception!
      try { 
        byteCode0.setOperandBytes(intArray0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Trying to rewrite fldc with 5 but bytecode has length 1
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode((-570));
      byteCode0.setOperandByte(65246, 0);
      assertEquals((-1), byteCode0.getByteCodeIndex());
      assertEquals(198, byteCode0.getOpcode());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode(87);
      // Undeclared exception!
      try { 
        byteCode0.setOperandByte(87, (-833));
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Trying to rewrite pop that has no rewrite
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode((-1564));
      // Undeclared exception!
      try { 
        byteCode0.setOperandByte((-1), 228);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Trying to rewrite aload_0_invokespecial_super with an byte at position 228 but this won't fit in the rewrite array
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode(2228);
      // Undeclared exception!
      try { 
        byteCode0.setOperand2Bytes(228, 228);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Trying to rewrite getfield with an int at position 228 but this won't fit in the rewrite array
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      ByteCode byteCode0 = new ByteCode(0);
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      byteCode0.resolve(classConstantPool0);
      assertEquals((-1), byteCode0.getByteCodeIndex());
      assertEquals("nop", byteCode0.getName());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode(0);
      boolean boolean0 = byteCode0.equals(byteCode0);
      assertEquals((-1), byteCode0.getByteCodeIndex());
      assertTrue(boolean0);
      assertEquals("nop", byteCode0.getName());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode((-567));
      Object object0 = new Object();
      boolean boolean0 = byteCode0.equals(object0);
      assertFalse(boolean0);
      assertEquals((-1), byteCode0.getByteCodeIndex());
      assertEquals(201, byteCode0.getOpcode());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode((-16777214));
      File file0 = MockFile.createTempFile("k_o;f4N", "k_o;f4N");
      MockPrintStream mockPrintStream0 = new MockPrintStream(file0);
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockPrintStream0);
      byteCode0.doWrite(dataOutputStream0);
      assertEquals(1L, file0.length());
      assertEquals(2, byteCode0.getOpcode());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode((-567));
      String string0 = byteCode0.getName();
      assertEquals("jsr_w", string0);
      assertEquals((-1), byteCode0.getByteCodeIndex());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      ByteCode byteCode0 = new ByteCode(0);
      byteCode0.hashCode();
      assertEquals((-1), byteCode0.getByteCodeIndex());
      assertEquals("nop", byteCode0.toString());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      ByteCode byteCode0 = new ByteCode(0);
      int int0 = byteCode0.getByteCodeIndex();
      assertEquals((-1), int0);
      assertEquals("nop", byteCode0.toString());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode((-567));
      byteCode0.nestedMustStartClassPool();
      assertEquals("jsr_w", byteCode0.getName());
      assertEquals((-1), byteCode0.getByteCodeIndex());
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode((-567));
      byteCode0.getNestedClassFileEntries();
      assertEquals((-1), byteCode0.getByteCodeIndex());
      assertEquals("jsr_w", byteCode0.toString());
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode((-567));
      int[] intArray0 = byteCode0.getRewrite();
      assertArrayEquals(new int[] {201, (-1), (-1), (-1), (-1)}, intArray0);
      assertEquals((-1), byteCode0.getByteCodeIndex());
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      ClassFileEntry[] classFileEntryArray0 = new ClassFileEntry[4];
      ByteCode byteCode0 = new ByteCode(158, classFileEntryArray0);
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
  public void test63()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode((-16777214));
      byteCode0.getByteCodeTargets();
      assertEquals((-1), byteCode0.getByteCodeIndex());
      assertEquals("iconst_m1", byteCode0.toString());
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      ByteCode byteCode0 = ByteCode.getByteCode((-16777214));
      // Undeclared exception!
      try { 
        byteCode0.setOperand2Bytes(228, 228);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Trying to rewrite iconst_m1 that has no rewrite
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode", e);
      }
  }
}
