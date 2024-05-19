
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
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.PipedOutputStream;
import java.util.LinkedList;
import java.util.List;
import org.apache.commons.compress.harmony.unpack200.Segment;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8;
import org.apache.commons.compress.harmony.unpack200.bytecode.ClassConstantPool;
import org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry;
import org.apache.commons.compress.harmony.unpack200.bytecode.CodeAttribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.ConstantPoolEntry;
import org.apache.commons.compress.harmony.unpack200.bytecode.ExceptionTableEntry;
import org.apache.commons.compress.harmony.unpack200.bytecode.LocalVariableTableAttribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class LocalVariableTableAttribute_ESTest extends LocalVariableTableAttribute_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      int[] intArray0 = new int[1];
      CPUTF8[] cPUTF8Array0 = new CPUTF8[0];
      LocalVariableTableAttribute localVariableTableAttribute0 = new LocalVariableTableAttribute(0, intArray0, intArray0, cPUTF8Array0, cPUTF8Array0, intArray0);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("fastore");
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockFileOutputStream0);
      localVariableTableAttribute0.writeBody(dataOutputStream0);
      assertFalse(localVariableTableAttribute0.isSourceFileAttribute());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      int[] intArray0 = new int[3];
      intArray0[0] = 2;
      LocalVariableTableAttribute localVariableTableAttribute0 = new LocalVariableTableAttribute(2, intArray0, intArray0, (CPUTF8[]) null, (CPUTF8[]) null, intArray0);
      byte[] byteArray0 = new byte[5];
      byteArray0[3] = (byte) (-87);
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, (int[]) null, intArray0, intArray0, (int[]) null, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, (int[]) null, (int[]) null, intArray0, (int[]) null);
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = new CodeAttribute(2, 204, byteArray0, (Segment) null, operandManager0, linkedList0);
      localVariableTableAttribute0.renumber(codeAttribute0.byteCodeOffsets);
      assertArrayEquals(new int[] {3, 0, 0}, intArray0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      int[] intArray0 = new int[6];
      intArray0[0] = 2;
      CPUTF8[] cPUTF8Array0 = new CPUTF8[2];
      LocalVariableTableAttribute localVariableTableAttribute0 = new LocalVariableTableAttribute(2, intArray0, intArray0, cPUTF8Array0, cPUTF8Array0, intArray0);
      byte[] byteArray0 = new byte[3];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = new CodeAttribute(2, (byte)7, byteArray0, (Segment) null, operandManager0, linkedList0);
      // Undeclared exception!
      try { 
        localVariableTableAttribute0.renumber(codeAttribute0.byteCodeOffsets);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 4, Size: 3
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      int[] intArray0 = new int[8];
      int[] intArray1 = new int[8];
      LocalVariableTableAttribute localVariableTableAttribute0 = new LocalVariableTableAttribute(0, intArray1, intArray0, (CPUTF8[]) null, (CPUTF8[]) null, intArray1);
      byte[] byteArray0 = new byte[2];
      intArray0[2] = (int) (byte)1;
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray1, intArray1, intArray1, intArray1, intArray1, intArray1, intArray0, intArray1, intArray1, intArray1, intArray0, intArray1, intArray0, intArray0, intArray1, intArray1, intArray1, intArray0, intArray0);
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = new CodeAttribute(2345, (byte)1, byteArray0, (Segment) null, operandManager0, linkedList0);
      localVariableTableAttribute0.renumber(codeAttribute0.byteCodeOffsets);
      assertArrayEquals(new int[] {0, 0, 1, 0, 0, 0, 0, 0}, intArray0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      int[] intArray0 = new int[4];
      CPUTF8[] cPUTF8Array0 = new CPUTF8[0];
      LocalVariableTableAttribute localVariableTableAttribute0 = new LocalVariableTableAttribute((-617), intArray0, intArray0, cPUTF8Array0, cPUTF8Array0, intArray0);
      ClassFileEntry[] classFileEntryArray0 = localVariableTableAttribute0.getNestedClassFileEntries();
      assertEquals(1, classFileEntryArray0.length);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      int[] intArray0 = new int[4];
      CPUTF8[] cPUTF8Array0 = new CPUTF8[3];
      LocalVariableTableAttribute localVariableTableAttribute0 = new LocalVariableTableAttribute(3713, intArray0, intArray0, cPUTF8Array0, (CPUTF8[]) null, intArray0);
      assertFalse(localVariableTableAttribute0.isSourceFileAttribute());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      int[] intArray0 = new int[6];
      CPUTF8[] cPUTF8Array0 = new CPUTF8[2];
      int[] intArray1 = new int[3];
      LocalVariableTableAttribute localVariableTableAttribute0 = new LocalVariableTableAttribute(2, intArray0, intArray0, cPUTF8Array0, cPUTF8Array0, intArray1);
      assertTrue(localVariableTableAttribute0.hasBCIRenumbering());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LocalVariableTableAttribute localVariableTableAttribute0 = new LocalVariableTableAttribute(6, (int[]) null, (int[]) null, (CPUTF8[]) null, (CPUTF8[]) null, (int[]) null);
      int[] intArray0 = localVariableTableAttribute0.getStartPCs();
      assertNull(intArray0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      int[] intArray0 = new int[8];
      LocalVariableTableAttribute localVariableTableAttribute0 = new LocalVariableTableAttribute(0, intArray0, intArray0, (CPUTF8[]) null, (CPUTF8[]) null, intArray0);
      int[] intArray1 = localVariableTableAttribute0.getStartPCs();
      assertSame(intArray0, intArray1);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      int[] intArray0 = new int[0];
      LocalVariableTableAttribute localVariableTableAttribute0 = new LocalVariableTableAttribute(2, intArray0, intArray0, (CPUTF8[]) null, (CPUTF8[]) null, intArray0);
      int[] intArray1 = localVariableTableAttribute0.getStartPCs();
      assertSame(intArray1, intArray0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      int[] intArray0 = new int[7];
      LocalVariableTableAttribute localVariableTableAttribute0 = new LocalVariableTableAttribute((-2626), intArray0, intArray0, (CPUTF8[]) null, (CPUTF8[]) null, intArray0);
      int int0 = localVariableTableAttribute0.getLength();
      assertEquals((-26258), int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      int[] intArray0 = new int[0];
      CPUTF8[] cPUTF8Array0 = new CPUTF8[1];
      LocalVariableTableAttribute localVariableTableAttribute0 = new LocalVariableTableAttribute(1235, intArray0, intArray0, cPUTF8Array0, cPUTF8Array0, intArray0);
      MockPrintStream mockPrintStream0 = new MockPrintStream("invokespecial_super_init");
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockPrintStream0);
      // Undeclared exception!
      try { 
        localVariableTableAttribute0.writeBody(dataOutputStream0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.LocalVariableTableAttribute", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      int[] intArray0 = new int[1];
      CPUTF8[] cPUTF8Array0 = new CPUTF8[2];
      LocalVariableTableAttribute localVariableTableAttribute0 = new LocalVariableTableAttribute(2, intArray0, intArray0, cPUTF8Array0, cPUTF8Array0, intArray0);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      DataOutputStream dataOutputStream0 = new DataOutputStream(pipedOutputStream0);
      try { 
        localVariableTableAttribute0.writeBody(dataOutputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      int[] intArray0 = new int[9];
      LocalVariableTableAttribute localVariableTableAttribute0 = new LocalVariableTableAttribute(0, intArray0, intArray0, (CPUTF8[]) null, (CPUTF8[]) null, intArray0);
      // Undeclared exception!
      try { 
        localVariableTableAttribute0.resolve((ClassConstantPool) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.Attribute", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      int[] intArray0 = new int[9];
      CPUTF8[] cPUTF8Array0 = new CPUTF8[0];
      LocalVariableTableAttribute localVariableTableAttribute0 = new LocalVariableTableAttribute((-2080), intArray0, intArray0, cPUTF8Array0, cPUTF8Array0, intArray0);
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      classConstantPool0.resolve((Segment) null);
      // Undeclared exception!
      try { 
        localVariableTableAttribute0.resolve(classConstantPool0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.LocalVariableTableAttribute", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CPUTF8[] cPUTF8Array0 = new CPUTF8[0];
      LocalVariableTableAttribute localVariableTableAttribute0 = new LocalVariableTableAttribute(0, (int[]) null, (int[]) null, cPUTF8Array0, cPUTF8Array0, (int[]) null);
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      // Undeclared exception!
      try { 
        localVariableTableAttribute0.resolve(classConstantPool0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Constant pool is not yet resolved; this does not make any sense
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ClassConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      int[] intArray0 = new int[4];
      CPUTF8[] cPUTF8Array0 = new CPUTF8[1];
      LocalVariableTableAttribute localVariableTableAttribute0 = new LocalVariableTableAttribute(0, intArray0, intArray0, cPUTF8Array0, cPUTF8Array0, intArray0);
      // Undeclared exception!
      try { 
        localVariableTableAttribute0.renumber((List<Integer>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.BCIRenumberedAttribute", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      int[] intArray0 = new int[3];
      int[] intArray1 = new int[9];
      LocalVariableTableAttribute localVariableTableAttribute0 = new LocalVariableTableAttribute(2, intArray0, intArray1, (CPUTF8[]) null, (CPUTF8[]) null, intArray0);
      byte[] byteArray0 = new byte[5];
      OperandManager operandManager0 = new OperandManager(intArray1, intArray1, intArray0, intArray0, intArray0, intArray1, intArray0, (int[]) null, intArray0, intArray1, (int[]) null, intArray0, intArray0, intArray1, intArray1, intArray1, intArray1, (int[]) null, (int[]) null, intArray0, (int[]) null);
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = new CodeAttribute(2, 204, byteArray0, (Segment) null, operandManager0, linkedList0);
      // Undeclared exception!
      try { 
        localVariableTableAttribute0.renumber(codeAttribute0.byteCodeOffsets);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.LocalVariableTableAttribute", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      int[] intArray0 = new int[8];
      LocalVariableTableAttribute localVariableTableAttribute0 = new LocalVariableTableAttribute(60, intArray0, intArray0, (CPUTF8[]) null, (CPUTF8[]) null, intArray0);
      // Undeclared exception!
      try { 
        localVariableTableAttribute0.getNestedClassFileEntries();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.LocalVariableTableAttribute", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      int[] intArray0 = new int[5];
      CPUTF8[] cPUTF8Array0 = new CPUTF8[10];
      LocalVariableTableAttribute localVariableTableAttribute0 = new LocalVariableTableAttribute(1337, intArray0, intArray0, cPUTF8Array0, cPUTF8Array0, intArray0);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("LocalVariableTable: 1337 variables");
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockFileOutputStream0);
      // Undeclared exception!
      try { 
        localVariableTableAttribute0.writeBody(dataOutputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.LocalVariableTableAttribute", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      int[] intArray0 = new int[4];
      CPUTF8[] cPUTF8Array0 = new CPUTF8[5];
      LocalVariableTableAttribute localVariableTableAttribute0 = new LocalVariableTableAttribute((-3153), intArray0, intArray0, cPUTF8Array0, cPUTF8Array0, intArray0);
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(0);
      DataOutputStream dataOutputStream0 = new DataOutputStream(byteArrayOutputStream0);
      localVariableTableAttribute0.writeBody(dataOutputStream0);
      assertEquals("\uFFFD", byteArrayOutputStream0.toString());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      int[] intArray0 = new int[2];
      CPUTF8[] cPUTF8Array0 = new CPUTF8[0];
      LocalVariableTableAttribute localVariableTableAttribute0 = new LocalVariableTableAttribute(504, intArray0, intArray0, cPUTF8Array0, cPUTF8Array0, intArray0);
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      classConstantPool0.resolve((Segment) null);
      // Undeclared exception!
      try { 
        localVariableTableAttribute0.resolve(classConstantPool0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.LocalVariableTableAttribute", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      int[] intArray0 = new int[0];
      LocalVariableTableAttribute localVariableTableAttribute0 = new LocalVariableTableAttribute(0, intArray0, intArray0, (CPUTF8[]) null, (CPUTF8[]) null, intArray0);
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      classConstantPool0.resolve((Segment) null);
      localVariableTableAttribute0.resolve(classConstantPool0);
      assertEquals(0, classConstantPool0.size());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      int[] intArray0 = new int[8];
      LocalVariableTableAttribute localVariableTableAttribute0 = new LocalVariableTableAttribute(0, intArray0, intArray0, (CPUTF8[]) null, (CPUTF8[]) null, intArray0);
      byte[] byteArray0 = new byte[2];
      intArray0[2] = (int) (byte)1;
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = new CodeAttribute(2345, (byte)1, byteArray0, (Segment) null, operandManager0, linkedList0);
      localVariableTableAttribute0.renumber(codeAttribute0.byteCodeOffsets);
      assertArrayEquals(new int[] {0, 0, (-1), 0, 0, 0, 0, 0}, intArray0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      int[] intArray0 = new int[8];
      LocalVariableTableAttribute localVariableTableAttribute0 = new LocalVariableTableAttribute(0, intArray0, intArray0, (CPUTF8[]) null, (CPUTF8[]) null, intArray0);
      byte[] byteArray0 = new byte[2];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = new CodeAttribute(2345, (byte)1, byteArray0, (Segment) null, operandManager0, linkedList0);
      localVariableTableAttribute0.renumber(codeAttribute0.byteCodeOffsets);
      // Undeclared exception!
      try { 
        localVariableTableAttribute0.renumber(codeAttribute0.byteCodeOffsets);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Trying to renumber a line number table that has already been renumbered
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.BCIRenumberedAttribute", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      int[] intArray0 = new int[9];
      CPUTF8[] cPUTF8Array0 = new CPUTF8[3];
      LocalVariableTableAttribute localVariableTableAttribute0 = new LocalVariableTableAttribute((byte)8, intArray0, intArray0, cPUTF8Array0, cPUTF8Array0, intArray0);
      // Undeclared exception!
      try { 
        localVariableTableAttribute0.getNestedClassFileEntries();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.LocalVariableTableAttribute", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      int[] intArray0 = new int[4];
      CPUTF8[] cPUTF8Array0 = new CPUTF8[1];
      LocalVariableTableAttribute localVariableTableAttribute0 = new LocalVariableTableAttribute(0, intArray0, intArray0, cPUTF8Array0, cPUTF8Array0, intArray0);
      ClassFileEntry[] classFileEntryArray0 = localVariableTableAttribute0.getNestedClassFileEntries();
      assertEquals(1, classFileEntryArray0.length);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      int[] intArray0 = new int[5];
      CPUTF8[] cPUTF8Array0 = new CPUTF8[10];
      LocalVariableTableAttribute localVariableTableAttribute0 = new LocalVariableTableAttribute(1337, intArray0, intArray0, cPUTF8Array0, cPUTF8Array0, intArray0);
      String string0 = localVariableTableAttribute0.toString();
      assertEquals("LocalVariableTable: 1337 variables", string0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      int[] intArray0 = new int[9];
      CPUTF8[] cPUTF8Array0 = new CPUTF8[3];
      LocalVariableTableAttribute localVariableTableAttribute0 = new LocalVariableTableAttribute((byte)8, intArray0, intArray0, cPUTF8Array0, cPUTF8Array0, intArray0);
      localVariableTableAttribute0.setCodeLength((-724));
      assertTrue(localVariableTableAttribute0.hasBCIRenumbering());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("");
      LocalVariableTableAttribute.setAttributeName(cPUTF8_0);
      assertEquals((byte)7, ConstantPoolEntry.CP_Class);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      int[] intArray0 = new int[9];
      CPUTF8[] cPUTF8Array0 = new CPUTF8[3];
      LocalVariableTableAttribute localVariableTableAttribute0 = new LocalVariableTableAttribute((byte)8, intArray0, intArray0, cPUTF8Array0, cPUTF8Array0, intArray0);
      int int0 = localVariableTableAttribute0.getLength();
      assertEquals(82, int0);
  }
}
