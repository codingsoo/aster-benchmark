
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
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.PipedOutputStream;
import java.util.LinkedList;
import java.util.List;
import org.apache.commons.compress.harmony.unpack200.Segment;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPClass;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8;
import org.apache.commons.compress.harmony.unpack200.bytecode.ClassConstantPool;
import org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry;
import org.apache.commons.compress.harmony.unpack200.bytecode.CodeAttribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.ExceptionTableEntry;
import org.apache.commons.compress.harmony.unpack200.bytecode.LocalVariableTableAttribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.LocalVariableTypeTableAttribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager;
import org.apache.commons.compress.harmony.unpack200.bytecode.SignatureAttribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.SourceFileAttribute;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class CodeAttribute_ESTest extends CodeAttribute_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      int[] intArray0 = new int[4];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = new CodeAttribute(147, 0, byteArray0, (Segment) null, operandManager0, linkedList0);
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      DataOutputStream dataOutputStream0 = new DataOutputStream(byteArrayOutputStream0);
      // Undeclared exception!
      try { 
        codeAttribute0.writeBody(dataOutputStream0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Entry has not been resolved
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[3] = (byte) (-60);
      int[] intArray0 = new int[7];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = new CodeAttribute(196, 576, byteArray0, (Segment) null, operandManager0, linkedList0);
      assertEquals(576, codeAttribute0.maxLocals);
      assertEquals(7, codeAttribute0.codeLength);
      assertEquals(196, codeAttribute0.maxStack);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      int[] intArray0 = new int[3];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = new CodeAttribute(476, 476, byteArray0, (Segment) null, operandManager0, linkedList0);
      int int0 = codeAttribute0.getLength();
      assertEquals(476, codeAttribute0.maxStack);
      assertEquals(15, int0);
      assertEquals(476, codeAttribute0.maxLocals);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      int[] intArray0 = new int[3];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = new CodeAttribute(192, 192, byteArray0, (Segment) null, operandManager0, linkedList0);
      CPUTF8[] cPUTF8Array0 = new CPUTF8[1];
      LocalVariableTableAttribute localVariableTableAttribute0 = new LocalVariableTableAttribute((-833), intArray0, intArray0, cPUTF8Array0, cPUTF8Array0, intArray0);
      codeAttribute0.addAttribute(localVariableTableAttribute0);
      int int0 = codeAttribute0.getLength();
      assertEquals((-8309), int0);
      assertEquals(192, codeAttribute0.maxStack);
      assertEquals(192, codeAttribute0.maxLocals);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[20];
      int[] intArray0 = new int[16];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = new CodeAttribute((-146), 727, byteArray0, (Segment) null, operandManager0, linkedList0);
      // Undeclared exception!
      try { 
        codeAttribute0.writeBody((DataOutputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.CodeAttribute", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      int[] intArray0 = new int[9];
      OperandManager operandManager0 = new OperandManager((int[]) null, (int[]) null, intArray0, intArray0, intArray0, intArray0, intArray0, (int[]) null, intArray0, (int[]) null, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, (int[]) null);
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = new CodeAttribute(782, 782, byteArray0, (Segment) null, operandManager0, linkedList0);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      DataOutputStream dataOutputStream0 = new DataOutputStream(pipedOutputStream0);
      try { 
        codeAttribute0.writeBody(dataOutputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      int[] intArray0 = new int[3];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = new CodeAttribute(476, 476, byteArray0, (Segment) null, operandManager0, linkedList0);
      SignatureAttribute signatureAttribute0 = new SignatureAttribute((CPUTF8) null);
      codeAttribute0.addAttribute(signatureAttribute0);
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      classConstantPool0.resolve((Segment) null);
      // Undeclared exception!
      try { 
        codeAttribute0.resolve(classConstantPool0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.SignatureAttribute", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      int[] intArray0 = new int[1];
      OperandManager operandManager0 = new OperandManager((int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, intArray0, intArray0, intArray0, intArray0, (int[]) null, intArray0, (int[]) null, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      CodeAttribute codeAttribute0 = new CodeAttribute(99, 2657, byteArray0, (Segment) null, operandManager0, (List<ExceptionTableEntry>) null);
      // Undeclared exception!
      try { 
        codeAttribute0.renumber(codeAttribute0.byteCodeOffsets);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.CodeAttribute", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      int[] intArray0 = new int[5];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = new CodeAttribute(61, 72, byteArray0, (Segment) null, operandManager0, linkedList0);
      CPUTF8 cPUTF8_0 = new CPUTF8("Y$_{`=s/Z!x7-Ez&#", 0);
      CPClass cPClass0 = new CPClass(cPUTF8_0, 256);
      ExceptionTableEntry exceptionTableEntry0 = new ExceptionTableEntry(2424, 61, 78, cPClass0);
      linkedList0.add(exceptionTableEntry0);
      LinkedList<Integer> linkedList1 = new LinkedList<Integer>();
      // Undeclared exception!
      try { 
        codeAttribute0.renumber(linkedList1);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 2424, Size: 0
         //
         verifyException("java.util.LinkedList", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      byte[] byteArray0 = new byte[20];
      int[] intArray0 = new int[16];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      ExceptionTableEntry exceptionTableEntry0 = new ExceptionTableEntry((byte)11, (-1306), 0, (CPClass) null);
      linkedList0.offerFirst(exceptionTableEntry0);
      CodeAttribute codeAttribute0 = new CodeAttribute((-153), 727, byteArray0, (Segment) null, operandManager0, linkedList0);
      // Undeclared exception!
      try { 
        codeAttribute0.renumber(codeAttribute0.byteCodeOffsets);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      int[] intArray0 = new int[1];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      CodeAttribute codeAttribute0 = new CodeAttribute(0, 38, byteArray0, (Segment) null, operandManager0, (List<ExceptionTableEntry>) null);
      // Undeclared exception!
      try { 
        codeAttribute0.getNestedClassFileEntries();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.CodeAttribute", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      int[] intArray0 = new int[8];
      OperandManager operandManager0 = new OperandManager((int[]) null, (int[]) null, intArray0, intArray0, intArray0, (int[]) null, (int[]) null, (int[]) null, (int[]) null, intArray0, (int[]) null, intArray0, intArray0, intArray0, (int[]) null, intArray0, (int[]) null, (int[]) null, intArray0, intArray0, intArray0);
      byte[] byteArray0 = new byte[1];
      CodeAttribute codeAttribute0 = new CodeAttribute(77, (-2981), byteArray0, (Segment) null, operandManager0, (List<ExceptionTableEntry>) null);
      // Undeclared exception!
      try { 
        codeAttribute0.getLength();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.CodeAttribute", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      int[] intArray0 = new int[4];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = new CodeAttribute(18, (-1024), byteArray0, (Segment) null, operandManager0, linkedList0);
      CPUTF8[] cPUTF8Array0 = new CPUTF8[2];
      codeAttribute0.attributes = null;
      LocalVariableTypeTableAttribute localVariableTypeTableAttribute0 = new LocalVariableTypeTableAttribute((byte)0, intArray0, intArray0, cPUTF8Array0, cPUTF8Array0, intArray0);
      // Undeclared exception!
      try { 
        codeAttribute0.addAttribute(localVariableTypeTableAttribute0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.CodeAttribute", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byteArray0[1] = (byte) (-29);
      int[] intArray0 = new int[6];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = null;
      try {
        codeAttribute0 = new CodeAttribute((-2544), 1727, byteArray0, (Segment) null, operandManager0, linkedList0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte) (-86);
      int[] intArray0 = new int[5];
      intArray0[0] = (int) (byte) (-86);
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = null;
      try {
        codeAttribute0 = new CodeAttribute(4821, 1, byteArray0, (Segment) null, operandManager0, linkedList0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.forms.TableSwitchForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[2] = (byte) (-89);
      int[] intArray0 = new int[8];
      intArray0[0] = (int) (byte)103;
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, (int[]) null, (int[]) null, (int[]) null, intArray0, intArray0, (int[]) null, (int[]) null, intArray0);
      CodeAttribute codeAttribute0 = null;
      try {
        codeAttribute0 = new CodeAttribute((-2981), 0, byteArray0, (Segment) null, operandManager0, (List<ExceptionTableEntry>) null);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 105, Size: 3
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte) (-103);
      int[] intArray0 = new int[0];
      int[] intArray1 = new int[2];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray1, intArray0, intArray1, intArray0, intArray1, intArray1, intArray0, intArray1, intArray0, intArray0, intArray1);
      CodeAttribute codeAttribute0 = null;
      try {
        codeAttribute0 = new CodeAttribute(0, 0, byteArray0, (Segment) null, operandManager0, (List<ExceptionTableEntry>) null);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      int[] intArray0 = new int[5];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = new CodeAttribute(61, 61, byteArray0, (Segment) null, operandManager0, linkedList0);
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(61);
      DataOutputStream dataOutputStream0 = new DataOutputStream(byteArrayOutputStream0);
      CPUTF8 cPUTF8_0 = new CPUTF8("=", 0);
      SourceFileAttribute sourceFileAttribute0 = new SourceFileAttribute(cPUTF8_0);
      codeAttribute0.addAttribute(sourceFileAttribute0);
      // Undeclared exception!
      try { 
        codeAttribute0.doWrite(dataOutputStream0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Entry has not been resolved
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      int[] intArray0 = new int[5];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = new CodeAttribute(61, 61, byteArray0, (Segment) null, operandManager0, linkedList0);
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(61);
      DataOutputStream dataOutputStream0 = new DataOutputStream(byteArrayOutputStream0);
      CPUTF8 cPUTF8_0 = new CPUTF8("=", 0);
      CPClass cPClass0 = new CPClass(cPUTF8_0, 61);
      ExceptionTableEntry exceptionTableEntry0 = new ExceptionTableEntry(2424, 61, 61, cPClass0);
      linkedList0.add(exceptionTableEntry0);
      codeAttribute0.doWrite(dataOutputStream0);
      assertEquals(26, byteArrayOutputStream0.size());
      assertEquals("\u0000\u0000\u0000\u0000\u0000\u0014\u0000=\u0000=\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000", byteArrayOutputStream0.toString());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      int[] intArray0 = new int[3];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = new CodeAttribute(476, 476, byteArray0, (Segment) null, operandManager0, linkedList0);
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      classConstantPool0.resolve((Segment) null);
      codeAttribute0.resolve(classConstantPool0);
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream(byteArrayOutputStream0);
      DataOutputStream dataOutputStream0 = new DataOutputStream(bufferedOutputStream0);
      codeAttribute0.writeBody(dataOutputStream0);
      assertEquals(476, codeAttribute0.maxStack);
      assertEquals(3, codeAttribute0.codeLength);
      assertEquals(476, codeAttribute0.maxLocals);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      int[] intArray0 = new int[9];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      CPUTF8 cPUTF8_0 = new CPUTF8("dldc2_w");
      CPClass cPClass0 = new CPClass(cPUTF8_0, 0);
      ExceptionTableEntry exceptionTableEntry0 = new ExceptionTableEntry((byte)0, (-1309), 919, cPClass0);
      linkedList0.offerFirst(exceptionTableEntry0);
      CodeAttribute codeAttribute0 = new CodeAttribute((-146), 742, byteArray0, (Segment) null, operandManager0, linkedList0);
      ClassFileEntry[] classFileEntryArray0 = codeAttribute0.getNestedClassFileEntries();
      assertEquals((-146), codeAttribute0.maxStack);
      assertEquals(4, classFileEntryArray0.length);
      assertEquals(2, codeAttribute0.codeLength);
      assertEquals(742, codeAttribute0.maxLocals);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      byte[] byteArray0 = new byte[20];
      int[] intArray0 = new int[16];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      ExceptionTableEntry exceptionTableEntry0 = new ExceptionTableEntry((byte)11, (-1306), 0, (CPClass) null);
      linkedList0.offerFirst(exceptionTableEntry0);
      CodeAttribute codeAttribute0 = new CodeAttribute((-153), 727, byteArray0, (Segment) null, operandManager0, linkedList0);
      assertEquals(1, linkedList0.size());
      
      ClassFileEntry[] classFileEntryArray0 = codeAttribute0.getNestedClassFileEntries();
      assertEquals(21, classFileEntryArray0.length);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      int[] intArray0 = new int[4];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = new CodeAttribute(18, 18, byteArray0, (Segment) null, operandManager0, linkedList0);
      CPUTF8[] cPUTF8Array0 = new CPUTF8[1];
      LocalVariableTypeTableAttribute localVariableTypeTableAttribute0 = new LocalVariableTypeTableAttribute((byte)0, intArray0, intArray0, cPUTF8Array0, cPUTF8Array0, intArray0);
      codeAttribute0.addAttribute(localVariableTypeTableAttribute0);
      String string0 = codeAttribute0.toString();
      assertEquals(18, codeAttribute0.maxLocals);
      assertEquals(18, codeAttribute0.maxStack);
      assertEquals("Code: 25 bytes", string0);
      assertEquals(0, linkedList0.size());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[4] = (byte) (-60);
      int[] intArray0 = new int[5];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = new CodeAttribute(150, 150, byteArray0, (Segment) null, operandManager0, linkedList0);
      assertEquals(11, codeAttribute0.codeLength);
      assertEquals(150, codeAttribute0.maxStack);
      assertEquals(150, codeAttribute0.maxLocals);
      assertEquals(0, linkedList0.size());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      CodeAttribute.setAttributeName((CPUTF8) null);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      int[] intArray0 = new int[5];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = new CodeAttribute(61, 61, byteArray0, (Segment) null, operandManager0, linkedList0);
      assertEquals(0, linkedList0.size());
      
      LinkedList<Integer> linkedList1 = new LinkedList<Integer>();
      codeAttribute0.renumber(linkedList1);
      assertEquals(61, codeAttribute0.maxLocals);
      assertEquals(0, codeAttribute0.codeLength);
      assertEquals(61, codeAttribute0.maxStack);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      int[] intArray0 = new int[5];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = new CodeAttribute(61, 61, byteArray0, (Segment) null, operandManager0, linkedList0);
      codeAttribute0.getStartPCs();
      assertEquals(61, codeAttribute0.maxLocals);
      assertEquals(0, codeAttribute0.codeLength);
      assertEquals(0, linkedList0.size());
      assertEquals(61, codeAttribute0.maxStack);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      int[] intArray0 = new int[3];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = new CodeAttribute(476, 476, byteArray0, (Segment) null, operandManager0, linkedList0);
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      // Undeclared exception!
      try { 
        codeAttribute0.resolve(classConstantPool0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Constant pool is not yet resolved; this does not make any sense
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ClassConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      int[] intArray0 = new int[1];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      CodeAttribute codeAttribute0 = new CodeAttribute(0, 205, byteArray0, (Segment) null, operandManager0, (List<ExceptionTableEntry>) null);
      // Undeclared exception!
      try { 
        codeAttribute0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.CodeAttribute", e);
      }
  }
}
