
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
import org.apache.commons.compress.harmony.unpack200.bytecode.LocalVariableTypeTableAttribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class LocalVariableTypeTableAttribute_ESTest extends LocalVariableTypeTableAttribute_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      int[] intArray0 = new int[2];
      intArray0[1] = (int) (byte)3;
      CPUTF8[] cPUTF8Array0 = new CPUTF8[9];
      LocalVariableTypeTableAttribute localVariableTypeTableAttribute0 = new LocalVariableTypeTableAttribute((byte)4, intArray0, intArray0, cPUTF8Array0, cPUTF8Array0, intArray0);
      byte[] byteArray0 = new byte[24];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = new CodeAttribute((byte)6, (-616), byteArray0, (Segment) null, operandManager0, linkedList0);
      localVariableTypeTableAttribute0.renumber(codeAttribute0.byteCodeOffsets);
      assertArrayEquals(new int[] {0, 3}, intArray0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      int[] intArray0 = new int[1];
      intArray0[0] = 1;
      LocalVariableTypeTableAttribute localVariableTypeTableAttribute0 = new LocalVariableTypeTableAttribute(1, intArray0, intArray0, (CPUTF8[]) null, (CPUTF8[]) null, intArray0);
      byte[] byteArray0 = new byte[2];
      localVariableTypeTableAttribute0.setCodeLength(579);
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, (int[]) null, (int[]) null, intArray0, intArray0, intArray0, (int[]) null);
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = new CodeAttribute(1, 1, byteArray0, (Segment) null, operandManager0, linkedList0);
      localVariableTypeTableAttribute0.renumber(codeAttribute0.byteCodeOffsets);
      assertArrayEquals(new int[] {578}, intArray0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      int[] intArray0 = new int[6];
      intArray0[0] = 9;
      CPUTF8[] cPUTF8Array0 = new CPUTF8[0];
      LocalVariableTypeTableAttribute localVariableTypeTableAttribute0 = new LocalVariableTypeTableAttribute(9, intArray0, intArray0, cPUTF8Array0, cPUTF8Array0, intArray0);
      byte[] byteArray0 = new byte[16];
      byteArray0[0] = (byte) (-60);
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = new CodeAttribute(9, 9, byteArray0, (Segment) null, operandManager0, linkedList0);
      // Undeclared exception!
      try { 
        localVariableTypeTableAttribute0.renumber(codeAttribute0.byteCodeOffsets);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 21, Size: 15
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      int[] intArray0 = new int[2];
      byte[] byteArray0 = new byte[5];
      int[] intArray1 = new int[8];
      intArray1[0] = (int) (byte)3;
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray1, intArray0, intArray1, intArray0, intArray1, intArray1, intArray1, intArray1, intArray0, intArray1, intArray1, intArray1, intArray1, intArray1, intArray1, intArray0);
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = new CodeAttribute((byte)6, 1841, byteArray0, (Segment) null, operandManager0, linkedList0);
      CPUTF8[] cPUTF8Array0 = new CPUTF8[9];
      LocalVariableTypeTableAttribute localVariableTypeTableAttribute0 = new LocalVariableTypeTableAttribute(3, intArray0, intArray1, cPUTF8Array0, cPUTF8Array0, intArray0);
      // Undeclared exception!
      try { 
        localVariableTypeTableAttribute0.renumber(codeAttribute0.byteCodeOffsets);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.LocalVariableTypeTableAttribute", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      int[] intArray0 = new int[1];
      LocalVariableTypeTableAttribute localVariableTypeTableAttribute0 = new LocalVariableTypeTableAttribute((-1232), intArray0, intArray0, (CPUTF8[]) null, (CPUTF8[]) null, intArray0);
      ClassFileEntry[] classFileEntryArray0 = localVariableTypeTableAttribute0.getNestedClassFileEntries();
      assertEquals(1, classFileEntryArray0.length);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CPUTF8[] cPUTF8Array0 = new CPUTF8[1];
      CPUTF8[] cPUTF8Array1 = new CPUTF8[0];
      LocalVariableTypeTableAttribute localVariableTypeTableAttribute0 = new LocalVariableTypeTableAttribute((-2825), (int[]) null, (int[]) null, cPUTF8Array0, cPUTF8Array1, (int[]) null);
      assertTrue(localVariableTypeTableAttribute0.hasBCIRenumbering());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      int[] intArray0 = new int[2];
      CPUTF8[] cPUTF8Array0 = new CPUTF8[6];
      int[] intArray1 = new int[9];
      LocalVariableTypeTableAttribute localVariableTypeTableAttribute0 = new LocalVariableTypeTableAttribute(0, intArray0, intArray1, cPUTF8Array0, cPUTF8Array0, intArray1);
      assertTrue(localVariableTypeTableAttribute0.hasBCIRenumbering());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      int[] intArray0 = new int[7];
      LocalVariableTypeTableAttribute localVariableTypeTableAttribute0 = new LocalVariableTypeTableAttribute((-1200), intArray0, intArray0, (CPUTF8[]) null, (CPUTF8[]) null, intArray0);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("+cr6", true);
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockFileOutputStream0);
      localVariableTypeTableAttribute0.writeBody(dataOutputStream0);
      assertTrue(localVariableTypeTableAttribute0.hasBCIRenumbering());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CPUTF8[] cPUTF8Array0 = new CPUTF8[1];
      LocalVariableTypeTableAttribute localVariableTypeTableAttribute0 = new LocalVariableTypeTableAttribute((-803), (int[]) null, (int[]) null, cPUTF8Array0, cPUTF8Array0, (int[]) null);
      int[] intArray0 = localVariableTypeTableAttribute0.getStartPCs();
      assertNull(intArray0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      int[] intArray0 = new int[3];
      CPUTF8[] cPUTF8Array0 = new CPUTF8[4];
      LocalVariableTypeTableAttribute localVariableTypeTableAttribute0 = new LocalVariableTypeTableAttribute((byte)6, intArray0, intArray0, cPUTF8Array0, cPUTF8Array0, intArray0);
      int[] intArray1 = localVariableTypeTableAttribute0.getStartPCs();
      assertSame(intArray1, intArray0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      int[] intArray0 = new int[0];
      CPUTF8[] cPUTF8Array0 = new CPUTF8[4];
      LocalVariableTypeTableAttribute localVariableTypeTableAttribute0 = new LocalVariableTypeTableAttribute(75, intArray0, intArray0, cPUTF8Array0, cPUTF8Array0, intArray0);
      int[] intArray1 = localVariableTypeTableAttribute0.getStartPCs();
      assertArrayEquals(new int[] {}, intArray1);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      int[] intArray0 = new int[1];
      LocalVariableTypeTableAttribute localVariableTypeTableAttribute0 = new LocalVariableTypeTableAttribute(0, intArray0, intArray0, (CPUTF8[]) null, (CPUTF8[]) null, intArray0);
      int int0 = localVariableTypeTableAttribute0.getLength();
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CPUTF8[] cPUTF8Array0 = new CPUTF8[1];
      LocalVariableTypeTableAttribute localVariableTypeTableAttribute0 = new LocalVariableTypeTableAttribute((-2825), (int[]) null, (int[]) null, cPUTF8Array0, cPUTF8Array0, (int[]) null);
      int int0 = localVariableTypeTableAttribute0.getLength();
      assertEquals((-28248), int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      int[] intArray0 = new int[1];
      LocalVariableTypeTableAttribute localVariableTypeTableAttribute0 = new LocalVariableTypeTableAttribute(4324, intArray0, intArray0, (CPUTF8[]) null, (CPUTF8[]) null, intArray0);
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      MockPrintStream mockPrintStream0 = new MockPrintStream(byteArrayOutputStream0, false);
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockPrintStream0);
      // Undeclared exception!
      try { 
        localVariableTypeTableAttribute0.writeBody(dataOutputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.LocalVariableTypeTableAttribute", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      int[] intArray0 = new int[0];
      LocalVariableTypeTableAttribute localVariableTypeTableAttribute0 = new LocalVariableTypeTableAttribute(3579, intArray0, intArray0, (CPUTF8[]) null, (CPUTF8[]) null, intArray0);
      MockFile mockFile0 = new MockFile(" varaibles", "frem");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0, false);
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockFileOutputStream0);
      // Undeclared exception!
      try { 
        localVariableTypeTableAttribute0.writeBody(dataOutputStream0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.LocalVariableTypeTableAttribute", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LocalVariableTypeTableAttribute localVariableTypeTableAttribute0 = new LocalVariableTypeTableAttribute(176, (int[]) null, (int[]) null, (CPUTF8[]) null, (CPUTF8[]) null, (int[]) null);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      DataOutputStream dataOutputStream0 = new DataOutputStream(pipedOutputStream0);
      try { 
        localVariableTypeTableAttribute0.writeBody(dataOutputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CPUTF8[] cPUTF8Array0 = new CPUTF8[0];
      LocalVariableTypeTableAttribute localVariableTypeTableAttribute0 = new LocalVariableTypeTableAttribute((-1861), (int[]) null, (int[]) null, cPUTF8Array0, cPUTF8Array0, (int[]) null);
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      classConstantPool0.resolve((Segment) null);
      // Undeclared exception!
      try { 
        localVariableTypeTableAttribute0.resolve(classConstantPool0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.LocalVariableTypeTableAttribute", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      int[] intArray0 = new int[5];
      CPUTF8[] cPUTF8Array0 = new CPUTF8[6];
      LocalVariableTypeTableAttribute localVariableTypeTableAttribute0 = new LocalVariableTypeTableAttribute(0, intArray0, intArray0, cPUTF8Array0, cPUTF8Array0, intArray0);
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      // Undeclared exception!
      try { 
        localVariableTypeTableAttribute0.resolve(classConstantPool0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Constant pool is not yet resolved; this does not make any sense
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ClassConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      int[] intArray0 = new int[2];
      CPUTF8[] cPUTF8Array0 = new CPUTF8[1];
      CPUTF8 cPUTF8_0 = new CPUTF8("pD2^D#i.LJT>,(", 2739);
      cPUTF8Array0[0] = cPUTF8_0;
      LocalVariableTypeTableAttribute localVariableTypeTableAttribute0 = new LocalVariableTypeTableAttribute(2739, intArray0, intArray0, cPUTF8Array0, cPUTF8Array0, intArray0);
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      classConstantPool0.resolve((Segment) null);
      // Undeclared exception!
      try { 
        localVariableTypeTableAttribute0.resolve(classConstantPool0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.LocalVariableTypeTableAttribute", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      int[] intArray0 = new int[8];
      LocalVariableTypeTableAttribute localVariableTypeTableAttribute0 = new LocalVariableTypeTableAttribute((-2724), intArray0, intArray0, (CPUTF8[]) null, (CPUTF8[]) null, intArray0);
      localVariableTypeTableAttribute0.renumbered = true;
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      // Undeclared exception!
      try { 
        localVariableTypeTableAttribute0.renumber(linkedList0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Trying to renumber a line number table that has already been renumbered
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.BCIRenumberedAttribute", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      int[] intArray0 = new int[5];
      CPUTF8[] cPUTF8Array0 = new CPUTF8[2];
      LocalVariableTypeTableAttribute localVariableTypeTableAttribute0 = new LocalVariableTypeTableAttribute(1917, intArray0, intArray0, cPUTF8Array0, cPUTF8Array0, intArray0);
      // Undeclared exception!
      try { 
        localVariableTypeTableAttribute0.getNestedClassFileEntries();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.LocalVariableTypeTableAttribute", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      int[] intArray0 = new int[1];
      LocalVariableTypeTableAttribute localVariableTypeTableAttribute0 = new LocalVariableTypeTableAttribute(0, intArray0, intArray0, (CPUTF8[]) null, (CPUTF8[]) null, intArray0);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("hv W^6i`xL~6kv5LK");
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockFileOutputStream0);
      localVariableTypeTableAttribute0.doWrite(dataOutputStream0);
      assertFalse(localVariableTypeTableAttribute0.isSourceFileAttribute());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      int[] intArray0 = new int[2];
      CPUTF8[] cPUTF8Array0 = new CPUTF8[14];
      LocalVariableTypeTableAttribute localVariableTypeTableAttribute0 = new LocalVariableTypeTableAttribute(2739, intArray0, intArray0, cPUTF8Array0, cPUTF8Array0, intArray0);
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      classConstantPool0.resolve((Segment) null);
      // Undeclared exception!
      try { 
        localVariableTypeTableAttribute0.resolve(classConstantPool0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.LocalVariableTypeTableAttribute", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      int[] intArray0 = new int[1];
      LocalVariableTypeTableAttribute localVariableTypeTableAttribute0 = new LocalVariableTypeTableAttribute(0, intArray0, intArray0, (CPUTF8[]) null, (CPUTF8[]) null, intArray0);
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      classConstantPool0.resolve((Segment) null);
      localVariableTypeTableAttribute0.resolve(classConstantPool0);
      assertFalse(localVariableTypeTableAttribute0.isSourceFileAttribute());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      int[] intArray0 = new int[0];
      LocalVariableTypeTableAttribute localVariableTypeTableAttribute0 = new LocalVariableTypeTableAttribute(2, intArray0, intArray0, (CPUTF8[]) null, (CPUTF8[]) null, intArray0);
      // Undeclared exception!
      try { 
        localVariableTypeTableAttribute0.getNestedClassFileEntries();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.LocalVariableTypeTableAttribute", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      int[] intArray0 = new int[6];
      CPUTF8[] cPUTF8Array0 = new CPUTF8[0];
      LocalVariableTypeTableAttribute localVariableTypeTableAttribute0 = new LocalVariableTypeTableAttribute(0, intArray0, intArray0, cPUTF8Array0, cPUTF8Array0, intArray0);
      ClassFileEntry[] classFileEntryArray0 = localVariableTypeTableAttribute0.getNestedClassFileEntries();
      assertEquals(1, classFileEntryArray0.length);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      CPUTF8[] cPUTF8Array0 = new CPUTF8[0];
      LocalVariableTypeTableAttribute localVariableTypeTableAttribute0 = new LocalVariableTypeTableAttribute((-1861), (int[]) null, (int[]) null, cPUTF8Array0, cPUTF8Array0, (int[]) null);
      String string0 = localVariableTypeTableAttribute0.toString();
      assertEquals("LocalVariableTypeTable: -1861 varaibles", string0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("@G");
      LocalVariableTypeTableAttribute.setAttributeName(cPUTF8_0);
      assertEquals((byte)7, ConstantPoolEntry.CP_Class);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      int[] intArray0 = new int[3];
      CPUTF8[] cPUTF8Array0 = new CPUTF8[6];
      LocalVariableTypeTableAttribute localVariableTypeTableAttribute0 = new LocalVariableTypeTableAttribute((byte)10, intArray0, intArray0, cPUTF8Array0, cPUTF8Array0, intArray0);
      // Undeclared exception!
      try { 
        localVariableTypeTableAttribute0.renumber((List<Integer>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.BCIRenumberedAttribute", e);
      }
  }
}
