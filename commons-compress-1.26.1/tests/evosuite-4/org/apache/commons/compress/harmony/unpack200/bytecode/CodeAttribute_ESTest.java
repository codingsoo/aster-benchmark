
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
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.util.LinkedList;
import java.util.List;
import org.apache.commons.compress.harmony.unpack200.Segment;
import org.apache.commons.compress.harmony.unpack200.bytecode.Attribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPClass;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8;
import org.apache.commons.compress.harmony.unpack200.bytecode.ClassConstantPool;
import org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry;
import org.apache.commons.compress.harmony.unpack200.bytecode.CodeAttribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.ConstantPoolEntry;
import org.apache.commons.compress.harmony.unpack200.bytecode.ExceptionTableEntry;
import org.apache.commons.compress.harmony.unpack200.bytecode.ExceptionsAttribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.LocalVariableTableAttribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.LocalVariableTypeTableAttribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class CodeAttribute_ESTest extends CodeAttribute_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      int[] intArray0 = new int[4];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, (int[]) null, intArray0, intArray0, (int[]) null, (int[]) null, intArray0, (int[]) null, (int[]) null, (int[]) null, intArray0, intArray0, (int[]) null, intArray0);
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      ExceptionTableEntry exceptionTableEntry0 = new ExceptionTableEntry(221, 0, 998, (CPClass) null);
      linkedList0.add(exceptionTableEntry0);
      CodeAttribute codeAttribute0 = new CodeAttribute(152, 221, byteArray0, (Segment) null, operandManager0, linkedList0);
      int int0 = codeAttribute0.getLength();
      assertEquals(21, int0);
      assertEquals(152, codeAttribute0.maxStack);
      assertEquals(221, codeAttribute0.maxLocals);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byteArray0[1] = (byte) (-60);
      int[] intArray0 = new int[6];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = new CodeAttribute((-1649), (-1649), byteArray0, (Segment) null, operandManager0, linkedList0);
      assertEquals((-1649), codeAttribute0.maxLocals);
      assertEquals((-1649), codeAttribute0.maxStack);
      assertEquals(5, codeAttribute0.codeLength);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      int[] intArray0 = new int[9];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = new CodeAttribute(139, 139, byteArray0, (Segment) null, operandManager0, linkedList0);
      assertEquals(9, codeAttribute0.codeLength);
      
      codeAttribute0.codeLength = (-93);
      int int0 = codeAttribute0.getLength();
      assertEquals((-81), int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      int[] intArray0 = new int[4];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = new CodeAttribute((-5125), (-5125), byteArray0, (Segment) null, operandManager0, linkedList0);
      DataOutputStream dataOutputStream0 = new DataOutputStream((OutputStream) null);
      // Undeclared exception!
      try { 
        codeAttribute0.writeBody(dataOutputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      int[] intArray0 = new int[4];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, (int[]) null, intArray0, intArray0, (int[]) null, (int[]) null, intArray0, (int[]) null, (int[]) null, (int[]) null, intArray0, intArray0, (int[]) null, intArray0);
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = new CodeAttribute(152, 221, byteArray0, (Segment) null, operandManager0, linkedList0);
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
  public void test05()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      int[] intArray0 = new int[0];
      int[] intArray1 = new int[0];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray1, intArray0, intArray1, intArray1, intArray0, intArray1, intArray0, intArray0, intArray0);
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = new CodeAttribute(1745, 1745, byteArray0, (Segment) null, operandManager0, linkedList0);
      codeAttribute0.addAttribute((Attribute) null);
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

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      int[] intArray0 = new int[6];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = new CodeAttribute((-1649), (-1649), byteArray0, (Segment) null, operandManager0, linkedList0);
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
  public void test07()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      int[] intArray0 = new int[1];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      CodeAttribute codeAttribute0 = new CodeAttribute(0, 0, byteArray0, (Segment) null, operandManager0, (List<ExceptionTableEntry>) null);
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      // Undeclared exception!
      try { 
        codeAttribute0.renumber(linkedList0);
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
      byte[] byteArray0 = new byte[1];
      int[] intArray0 = new int[4];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, (int[]) null, intArray0, intArray0, (int[]) null, (int[]) null, intArray0, (int[]) null, (int[]) null, (int[]) null, intArray0, intArray0, (int[]) null, intArray0);
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      CPUTF8 cPUTF8_0 = new CPUTF8(" annotations");
      CPClass cPClass0 = new CPClass(cPUTF8_0, 11);
      ExceptionTableEntry exceptionTableEntry0 = new ExceptionTableEntry(89, (-4195), 0, cPClass0);
      linkedList0.add(exceptionTableEntry0);
      CodeAttribute codeAttribute0 = new CodeAttribute(152, 221, byteArray0, (Segment) null, operandManager0, linkedList0);
      // Undeclared exception!
      try { 
        codeAttribute0.renumber(codeAttribute0.byteCodeOffsets);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 89, Size: 1
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      int[] intArray0 = new int[2];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      CodeAttribute codeAttribute0 = new CodeAttribute(2220, (-2128), byteArray0, (Segment) null, operandManager0, (List<ExceptionTableEntry>) null);
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
  public void test10()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      int[] intArray0 = new int[5];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      CodeAttribute codeAttribute0 = new CodeAttribute(0, 0, byteArray0, (Segment) null, operandManager0, (List<ExceptionTableEntry>) null);
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
  public void test11()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[1] = (byte)16;
      int[] intArray0 = new int[8];
      OperandManager operandManager0 = new OperandManager((int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, intArray0, (int[]) null, intArray0, (int[]) null, intArray0);
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = null;
      try {
        codeAttribute0 = new CodeAttribute(196, 40, byteArray0, (Segment) null, operandManager0, linkedList0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[6] = (byte) (-85);
      int[] intArray0 = new int[7];
      intArray0[0] = (int) (byte) (-115);
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = null;
      try {
        codeAttribute0 = new CodeAttribute(0, 1585, byteArray0, (Segment) null, operandManager0, linkedList0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.forms.LookupSwitchForm", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[5] = (byte) (-93);
      int[] intArray0 = new int[9];
      int[] intArray1 = new int[4];
      intArray1[0] = (int) (byte)112;
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray1, intArray1, intArray1, intArray0, intArray1, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray1, intArray0, intArray0);
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = null;
      try {
        codeAttribute0 = new CodeAttribute(139, 139, byteArray0, (Segment) null, operandManager0, linkedList0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 117, Size: 9
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[4] = (byte) (-99);
      int[] intArray0 = new int[2];
      intArray0[0] = (int) (byte) (-126);
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, (int[]) null, intArray0, intArray0, (int[]) null, intArray0, (int[]) null, intArray0, (int[]) null, (int[]) null, intArray0);
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = null;
      try {
        codeAttribute0 = new CodeAttribute(0, 3670, byteArray0, (Segment) null, operandManager0, linkedList0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      int[] intArray0 = new int[7];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, (int[]) null, (int[]) null, (int[]) null, (int[]) null, intArray0, intArray0, intArray0, (int[]) null, (int[]) null, (int[]) null);
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = new CodeAttribute(8, 8, byteArray0, (Segment) null, operandManager0, linkedList0);
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream(byteArrayOutputStream0);
      DataOutputStream dataOutputStream0 = new DataOutputStream(bufferedOutputStream0);
      CPClass[] cPClassArray0 = new CPClass[0];
      ExceptionsAttribute exceptionsAttribute0 = new ExceptionsAttribute(cPClassArray0);
      codeAttribute0.addAttribute(exceptionsAttribute0);
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
  public void test16()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      int[] intArray0 = new int[7];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, (int[]) null, (int[]) null, (int[]) null, (int[]) null, intArray0, intArray0, intArray0, (int[]) null, (int[]) null, (int[]) null);
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = new CodeAttribute(8, 8, byteArray0, (Segment) null, operandManager0, linkedList0);
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream(byteArrayOutputStream0);
      DataOutputStream dataOutputStream0 = new DataOutputStream(bufferedOutputStream0);
      CPUTF8 cPUTF8_0 = new CPUTF8("org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode", 29);
      CPClass cPClass0 = new CPClass(cPUTF8_0, (byte)5);
      ExceptionTableEntry exceptionTableEntry0 = new ExceptionTableEntry(14, 0, 1963, cPClass0);
      linkedList0.push(exceptionTableEntry0);
      codeAttribute0.writeBody(dataOutputStream0);
      assertEquals(0, codeAttribute0.codeLength);
      assertEquals(8, codeAttribute0.maxLocals);
      assertEquals(8, codeAttribute0.maxStack);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      int[] intArray0 = new int[7];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = new CodeAttribute(19, 390, byteArray0, (Segment) null, operandManager0, linkedList0);
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      classConstantPool0.resolve((Segment) null);
      codeAttribute0.resolve(classConstantPool0);
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream(pipedInputStream0);
      DataOutputStream dataOutputStream0 = new DataOutputStream(pipedOutputStream0);
      codeAttribute0.writeBody(dataOutputStream0);
      assertEquals(19, pipedInputStream0.available());
      assertEquals(7, codeAttribute0.codeLength);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      int[] intArray0 = new int[4];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, (int[]) null, intArray0, intArray0, (int[]) null, (int[]) null, intArray0, (int[]) null, (int[]) null, (int[]) null, intArray0, intArray0, (int[]) null, intArray0);
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      CPUTF8 cPUTF8_0 = new CPUTF8(" annotations");
      CPClass cPClass0 = new CPClass(cPUTF8_0, 11);
      ExceptionTableEntry exceptionTableEntry0 = new ExceptionTableEntry(89, (-4195), 0, cPClass0);
      linkedList0.add(exceptionTableEntry0);
      CodeAttribute codeAttribute0 = new CodeAttribute(152, 221, byteArray0, (Segment) null, operandManager0, linkedList0);
      ClassFileEntry[] classFileEntryArray0 = codeAttribute0.getNestedClassFileEntries();
      assertEquals(3, classFileEntryArray0.length);
      assertEquals(152, codeAttribute0.maxStack);
      assertEquals(221, codeAttribute0.maxLocals);
      assertEquals(1, codeAttribute0.codeLength);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      int[] intArray0 = new int[4];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, (int[]) null, intArray0, intArray0, (int[]) null, (int[]) null, intArray0, (int[]) null, (int[]) null, (int[]) null, intArray0, intArray0, (int[]) null, intArray0);
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      ExceptionTableEntry exceptionTableEntry0 = new ExceptionTableEntry(221, 0, 998, (CPClass) null);
      linkedList0.add(exceptionTableEntry0);
      CodeAttribute codeAttribute0 = new CodeAttribute(152, 221, byteArray0, (Segment) null, operandManager0, linkedList0);
      assertEquals(1, linkedList0.size());
      
      codeAttribute0.getNestedClassFileEntries();
      assertEquals(1, codeAttribute0.codeLength);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      int[] intArray0 = new int[8];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = new CodeAttribute(0, 560, byteArray0, (Segment) null, operandManager0, linkedList0);
      CPUTF8[] cPUTF8Array0 = new CPUTF8[7];
      LocalVariableTableAttribute localVariableTableAttribute0 = new LocalVariableTableAttribute((byte)0, intArray0, intArray0, cPUTF8Array0, cPUTF8Array0, intArray0);
      codeAttribute0.addAttribute(localVariableTableAttribute0);
      assertEquals(5, codeAttribute0.codeLength);
      assertEquals(560, codeAttribute0.maxLocals);
      assertEquals(0, codeAttribute0.maxStack);
      assertEquals(0, linkedList0.size());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      int[] intArray0 = new int[3];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = new CodeAttribute(3195, (-6), byteArray0, (Segment) null, operandManager0, linkedList0);
      CPUTF8[] cPUTF8Array0 = new CPUTF8[8];
      LocalVariableTypeTableAttribute localVariableTypeTableAttribute0 = new LocalVariableTypeTableAttribute(3195, intArray0, intArray0, cPUTF8Array0, cPUTF8Array0, intArray0);
      codeAttribute0.addAttribute(localVariableTypeTableAttribute0);
      String string0 = codeAttribute0.toString();
      assertEquals("Code: 31978 bytes", string0);
      assertEquals((-6), codeAttribute0.maxLocals);
      assertEquals(3195, codeAttribute0.maxStack);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[1] = (byte) (-60);
      int[] intArray0 = new int[9];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = new CodeAttribute(139, 139, byteArray0, (Segment) null, operandManager0, linkedList0);
      assertEquals(11, codeAttribute0.codeLength);
      assertEquals(139, codeAttribute0.maxStack);
      assertEquals(139, codeAttribute0.maxLocals);
      assertEquals(0, linkedList0.size());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode", 29);
      CodeAttribute.setAttributeName(cPUTF8_0);
      assertEquals((byte)1, ConstantPoolEntry.CP_UTF8);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      int[] intArray0 = new int[7];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, (int[]) null, (int[]) null, (int[]) null, (int[]) null, intArray0, intArray0, intArray0, (int[]) null, (int[]) null, (int[]) null);
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = new CodeAttribute(8, 8, byteArray0, (Segment) null, operandManager0, linkedList0);
      codeAttribute0.renumber(codeAttribute0.byteCodeOffsets);
      assertEquals(8, codeAttribute0.maxStack);
      assertEquals(0, codeAttribute0.codeLength);
      assertEquals(8, codeAttribute0.maxLocals);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      int[] intArray0 = new int[7];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = new CodeAttribute(19, 19, byteArray0, (Segment) null, operandManager0, linkedList0);
      codeAttribute0.getStartPCs();
      assertEquals(19, codeAttribute0.maxStack);
      assertEquals(0, linkedList0.size());
      assertEquals(7, codeAttribute0.codeLength);
      assertEquals(19, codeAttribute0.maxLocals);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      int[] intArray0 = new int[7];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = new CodeAttribute(0, 0, byteArray0, (Segment) null, operandManager0, linkedList0);
      // Undeclared exception!
      try { 
        codeAttribute0.resolve((ClassConstantPool) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.Attribute", e);
      }
  }
}
