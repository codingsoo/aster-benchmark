
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
import java.io.PipedOutputStream;
import java.util.LinkedList;
import java.util.List;
import org.apache.commons.compress.harmony.unpack200.Segment;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPClass;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8;
import org.apache.commons.compress.harmony.unpack200.bytecode.ClassConstantPool;
import org.apache.commons.compress.harmony.unpack200.bytecode.CodeAttribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.ConstantPoolEntry;
import org.apache.commons.compress.harmony.unpack200.bytecode.ExceptionTableEntry;
import org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class ExceptionTableEntry_ESTest extends ExceptionTableEntry_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("u'P_7)|KV`rcSBi}", 1);
      CPClass cPClass0 = new CPClass(cPUTF8_0, 0);
      ExceptionTableEntry exceptionTableEntry0 = new ExceptionTableEntry((byte)1, (byte)7, (byte)4, cPClass0);
      byte[] byteArray0 = new byte[3];
      int[] intArray0 = new int[7];
      OperandManager operandManager0 = new OperandManager((int[]) null, (int[]) null, intArray0, intArray0, (int[]) null, (int[]) null, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, (int[]) null, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, (int[]) null);
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = new CodeAttribute((byte)8, 0, byteArray0, (Segment) null, operandManager0, linkedList0);
      // Undeclared exception!
      try { 
        exceptionTableEntry0.renumber(codeAttribute0.byteCodeOffsets);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 8, Size: 3
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("", (-304));
      CPClass cPClass0 = new CPClass(cPUTF8_0, (-2266));
      ExceptionTableEntry exceptionTableEntry0 = new ExceptionTableEntry(1, 1, (-304), cPClass0);
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      classConstantPool0.resolve((Segment) null);
      exceptionTableEntry0.resolve(classConstantPool0);
      assertEquals(0, classConstantPool0.size());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ExceptionTableEntry exceptionTableEntry0 = new ExceptionTableEntry(0, 0, 0, (CPClass) null);
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      Integer integer0 = new Integer((-2677));
      linkedList0.add(integer0);
      exceptionTableEntry0.renumber(linkedList0);
      assertTrue(linkedList0.contains((-2677)));
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ExceptionTableEntry exceptionTableEntry0 = new ExceptionTableEntry((-19), (-19), 0, (CPClass) null);
      CPClass cPClass0 = exceptionTableEntry0.getCatchType();
      assertNull(cPClass0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("", (-13));
      CPClass cPClass0 = new CPClass(cPUTF8_0, (byte)1);
      ExceptionTableEntry exceptionTableEntry0 = new ExceptionTableEntry((-13), (-13), (-13), cPClass0);
      cPClass0.tag = (byte)0;
      CPClass cPClass1 = exceptionTableEntry0.getCatchType();
      assertEquals((byte)9, ConstantPoolEntry.CP_Fieldref);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("", 0);
      CPClass cPClass0 = new CPClass(cPUTF8_0, 0);
      ExceptionTableEntry exceptionTableEntry0 = new ExceptionTableEntry(0, 0, 173, cPClass0);
      CPClass cPClass1 = exceptionTableEntry0.getCatchType();
      assertEquals((byte)10, ConstantPoolEntry.CP_Methodref);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("$-*m#V", 1);
      CPClass cPClass0 = new CPClass(cPUTF8_0, (-251));
      ExceptionTableEntry exceptionTableEntry0 = new ExceptionTableEntry(1, 1, 1, cPClass0);
      CPClass cPClass1 = exceptionTableEntry0.getCatchType();
      cPClass1.tag = (byte) (-101);
      CPClass cPClass2 = exceptionTableEntry0.getCatchType();
      assertEquals((byte)5, ConstantPoolEntry.CP_Long);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8(";kox9FL _6>O=", 0);
      CPClass cPClass0 = new CPClass(cPUTF8_0, (byte)8);
      ExceptionTableEntry exceptionTableEntry0 = new ExceptionTableEntry(548, 548, 0, cPClass0);
      DataOutputStream dataOutputStream0 = new DataOutputStream((OutputStream) null);
      // Undeclared exception!
      try { 
        exceptionTableEntry0.write(dataOutputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("AdW");
      CPClass cPClass0 = new CPClass(cPUTF8_0, 0);
      ExceptionTableEntry exceptionTableEntry0 = new ExceptionTableEntry((-2795), (-2795), (-334), cPClass0);
      // Undeclared exception!
      try { 
        exceptionTableEntry0.resolve((ClassConstantPool) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.CPClass", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("DPr%sBYIch", 0);
      CPClass cPClass0 = new CPClass(cPUTF8_0, (byte)11);
      ExceptionTableEntry exceptionTableEntry0 = new ExceptionTableEntry(0, 0, 0, cPClass0);
      // Undeclared exception!
      try { 
        exceptionTableEntry0.renumber((List<Integer>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ExceptionTableEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ExceptionTableEntry exceptionTableEntry0 = new ExceptionTableEntry((-762), (-762), (-762), (CPClass) null);
      byte[] byteArray0 = new byte[9];
      int[] intArray0 = new int[7];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = new CodeAttribute(0, 0, byteArray0, (Segment) null, operandManager0, linkedList0);
      // Undeclared exception!
      try { 
        exceptionTableEntry0.renumber(codeAttribute0.byteCodeOffsets);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ExceptionTableEntry exceptionTableEntry0 = new ExceptionTableEntry((-19), (-19), 0, (CPClass) null);
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      exceptionTableEntry0.resolve(classConstantPool0);
      assertEquals(0, classConstantPool0.size());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("", (-13));
      CPClass cPClass0 = new CPClass(cPUTF8_0, (byte)1);
      ExceptionTableEntry exceptionTableEntry0 = new ExceptionTableEntry((-13), (-13), (-13), cPClass0);
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      // Undeclared exception!
      try { 
        exceptionTableEntry0.resolve(classConstantPool0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Constant pool is not yet resolved; this does not make any sense
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ClassConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ExceptionTableEntry exceptionTableEntry0 = new ExceptionTableEntry((-19), (-19), 0, (CPClass) null);
      MockPrintStream mockPrintStream0 = new MockPrintStream(">w;w=/}Ar}/|0<|%8");
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockPrintStream0);
      exceptionTableEntry0.write(dataOutputStream0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("org.apache.commons.compress.harmony.unpack200.bytecode.CPField");
      CPClass cPClass0 = new CPClass(cPUTF8_0, (byte)9);
      ExceptionTableEntry exceptionTableEntry0 = new ExceptionTableEntry((byte)3, 0, 954, cPClass0);
      byte[] byteArray0 = new byte[4];
      int[] intArray0 = new int[7];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = new CodeAttribute((byte)6, 0, byteArray0, (Segment) null, operandManager0, linkedList0);
      // Undeclared exception!
      try { 
        exceptionTableEntry0.renumber(codeAttribute0.byteCodeOffsets);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 957, Size: 4
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("");
      CPClass cPClass0 = new CPClass(cPUTF8_0, (byte)11);
      ExceptionTableEntry exceptionTableEntry0 = new ExceptionTableEntry((-2885), (-609), 1349, cPClass0);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      DataOutputStream dataOutputStream0 = new DataOutputStream(pipedOutputStream0);
      try { 
        exceptionTableEntry0.write(dataOutputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }
}