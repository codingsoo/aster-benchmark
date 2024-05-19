
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
      CPUTF8[] cPUTF8Array0 = new CPUTF8[0];
      LocalVariableTypeTableAttribute localVariableTypeTableAttribute0 = new LocalVariableTypeTableAttribute((-117), (int[]) null, (int[]) null, cPUTF8Array0, (CPUTF8[]) null, (int[]) null);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("7vN'RWT(9~4e?D5dA");
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockFileOutputStream0);
      localVariableTypeTableAttribute0.writeBody(dataOutputStream0);
      assertTrue(localVariableTypeTableAttribute0.hasBCIRenumbering());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      int[] intArray0 = new int[6];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      int[] intArray1 = new int[6];
      intArray1[0] = 1787;
      CPUTF8[] cPUTF8Array0 = new CPUTF8[0];
      LocalVariableTypeTableAttribute localVariableTypeTableAttribute0 = new LocalVariableTypeTableAttribute(1787, intArray0, intArray1, cPUTF8Array0, cPUTF8Array0, intArray1);
      byte[] byteArray0 = new byte[0];
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = new CodeAttribute(1787, (-3761), byteArray0, (Segment) null, operandManager0, linkedList0);
      // Undeclared exception!
      try { 
        localVariableTypeTableAttribute0.renumber(codeAttribute0.byteCodeOffsets);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1787, Size: 1
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      int[] intArray0 = new int[2];
      intArray0[0] = 1;
      LocalVariableTypeTableAttribute localVariableTypeTableAttribute0 = new LocalVariableTypeTableAttribute(1, intArray0, intArray0, (CPUTF8[]) null, (CPUTF8[]) null, intArray0);
      byte[] byteArray0 = new byte[6];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, (int[]) null, intArray0, intArray0);
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = new CodeAttribute((-795), 1, byteArray0, (Segment) null, operandManager0, linkedList0);
      localVariableTypeTableAttribute0.renumber(codeAttribute0.byteCodeOffsets);
      assertArrayEquals(new int[] {1, 0}, intArray0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      int[] intArray0 = new int[2];
      CPUTF8[] cPUTF8Array0 = new CPUTF8[1];
      LocalVariableTypeTableAttribute localVariableTypeTableAttribute0 = new LocalVariableTypeTableAttribute(0, intArray0, intArray0, cPUTF8Array0, cPUTF8Array0, intArray0);
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      Integer integer0 = new Integer((byte)12);
      linkedList0.add(integer0);
      // Undeclared exception!
      try { 
        localVariableTypeTableAttribute0.renumber(linkedList0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 12, Size: 1
         //
         verifyException("java.util.LinkedList", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LocalVariableTypeTableAttribute localVariableTypeTableAttribute0 = new LocalVariableTypeTableAttribute((-85), (int[]) null, (int[]) null, (CPUTF8[]) null, (CPUTF8[]) null, (int[]) null);
      ClassFileEntry[] classFileEntryArray0 = localVariableTypeTableAttribute0.getNestedClassFileEntries();
      assertEquals(1, classFileEntryArray0.length);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      int[] intArray0 = new int[10];
      CPUTF8[] cPUTF8Array0 = new CPUTF8[1];
      int[] intArray1 = new int[8];
      LocalVariableTypeTableAttribute localVariableTypeTableAttribute0 = new LocalVariableTypeTableAttribute(0, intArray0, intArray0, cPUTF8Array0, cPUTF8Array0, intArray1);
      assertTrue(localVariableTypeTableAttribute0.hasBCIRenumbering());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      int[] intArray0 = new int[4];
      LocalVariableTypeTableAttribute localVariableTypeTableAttribute0 = new LocalVariableTypeTableAttribute(4720, intArray0, intArray0, (CPUTF8[]) null, (CPUTF8[]) null, intArray0);
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(4720);
      DataOutputStream dataOutputStream0 = new DataOutputStream(byteArrayOutputStream0);
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
  public void test07()  throws Throwable  {
      CPUTF8[] cPUTF8Array0 = new CPUTF8[0];
      LocalVariableTypeTableAttribute localVariableTypeTableAttribute0 = new LocalVariableTypeTableAttribute(1768, (int[]) null, (int[]) null, cPUTF8Array0, cPUTF8Array0, (int[]) null);
      int[] intArray0 = localVariableTypeTableAttribute0.getStartPCs();
      assertNull(intArray0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      int[] intArray0 = new int[10];
      CPUTF8[] cPUTF8Array0 = new CPUTF8[1];
      LocalVariableTypeTableAttribute localVariableTypeTableAttribute0 = new LocalVariableTypeTableAttribute(0, intArray0, intArray0, cPUTF8Array0, cPUTF8Array0, intArray0);
      int[] intArray1 = localVariableTypeTableAttribute0.getStartPCs();
      assertSame(intArray1, intArray0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      int[] intArray0 = new int[0];
      CPUTF8[] cPUTF8Array0 = new CPUTF8[0];
      LocalVariableTypeTableAttribute localVariableTypeTableAttribute0 = new LocalVariableTypeTableAttribute(178, intArray0, intArray0, cPUTF8Array0, cPUTF8Array0, intArray0);
      int[] intArray1 = localVariableTypeTableAttribute0.getStartPCs();
      assertSame(intArray0, intArray1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CPUTF8[] cPUTF8Array0 = new CPUTF8[1];
      LocalVariableTypeTableAttribute localVariableTypeTableAttribute0 = new LocalVariableTypeTableAttribute(227, (int[]) null, (int[]) null, cPUTF8Array0, cPUTF8Array0, (int[]) null);
      int int0 = localVariableTypeTableAttribute0.getLength();
      assertEquals(2272, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      int[] intArray0 = new int[5];
      CPUTF8[] cPUTF8Array0 = new CPUTF8[0];
      LocalVariableTypeTableAttribute localVariableTypeTableAttribute0 = new LocalVariableTypeTableAttribute((-2747), intArray0, intArray0, cPUTF8Array0, cPUTF8Array0, intArray0);
      int int0 = localVariableTypeTableAttribute0.getLength();
      assertEquals((-27468), int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      int[] intArray0 = new int[5];
      CPUTF8[] cPUTF8Array0 = new CPUTF8[0];
      LocalVariableTypeTableAttribute localVariableTypeTableAttribute0 = new LocalVariableTypeTableAttribute(0, intArray0, intArray0, cPUTF8Array0, cPUTF8Array0, intArray0);
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
  public void test13()  throws Throwable  {
      LocalVariableTypeTableAttribute localVariableTypeTableAttribute0 = new LocalVariableTypeTableAttribute((-85), (int[]) null, (int[]) null, (CPUTF8[]) null, (CPUTF8[]) null, (int[]) null);
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
  public void test14()  throws Throwable  {
      int[] intArray0 = new int[9];
      CPUTF8[] cPUTF8Array0 = new CPUTF8[5];
      LocalVariableTypeTableAttribute localVariableTypeTableAttribute0 = new LocalVariableTypeTableAttribute(305, intArray0, intArray0, cPUTF8Array0, cPUTF8Array0, intArray0);
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
  public void test15()  throws Throwable  {
      int[] intArray0 = new int[3];
      CPUTF8[] cPUTF8Array0 = new CPUTF8[2];
      CPUTF8 cPUTF8_0 = new CPUTF8("E%%P~V%arO-%");
      cPUTF8Array0[0] = cPUTF8_0;
      cPUTF8Array0[1] = cPUTF8_0;
      LocalVariableTypeTableAttribute localVariableTypeTableAttribute0 = new LocalVariableTypeTableAttribute(108, intArray0, intArray0, cPUTF8Array0, cPUTF8Array0, intArray0);
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      classConstantPool0.resolve((Segment) null);
      // Undeclared exception!
      try { 
        localVariableTypeTableAttribute0.resolve(classConstantPool0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.LocalVariableTypeTableAttribute", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      int[] intArray0 = new int[9];
      CPUTF8[] cPUTF8Array0 = new CPUTF8[5];
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

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      int[] intArray0 = new int[5];
      intArray0[0] = (-2747);
      CPUTF8[] cPUTF8Array0 = new CPUTF8[0];
      LocalVariableTypeTableAttribute localVariableTypeTableAttribute0 = new LocalVariableTypeTableAttribute((-2747), intArray0, intArray0, cPUTF8Array0, cPUTF8Array0, intArray0);
      byte[] byteArray0 = new byte[0];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      CodeAttribute codeAttribute0 = new CodeAttribute((-27468), 0, byteArray0, (Segment) null, operandManager0, (List<ExceptionTableEntry>) null);
      // Undeclared exception!
      try { 
        localVariableTypeTableAttribute0.renumber(codeAttribute0.byteCodeOffsets);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CPUTF8[] cPUTF8Array0 = new CPUTF8[1];
      LocalVariableTypeTableAttribute localVariableTypeTableAttribute0 = new LocalVariableTypeTableAttribute(227, (int[]) null, (int[]) null, cPUTF8Array0, cPUTF8Array0, (int[]) null);
      // Undeclared exception!
      try { 
        localVariableTypeTableAttribute0.getNestedClassFileEntries();
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
      int[] intArray0 = new int[0];
      CPUTF8[] cPUTF8Array0 = new CPUTF8[0];
      LocalVariableTypeTableAttribute localVariableTypeTableAttribute0 = new LocalVariableTypeTableAttribute(5423, intArray0, intArray0, cPUTF8Array0, cPUTF8Array0, intArray0);
      MockFile mockFile0 = new MockFile(";");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0, true);
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFileOutputStream0, true);
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream(mockPrintStream0, 5423);
      DataOutputStream dataOutputStream0 = new DataOutputStream(bufferedOutputStream0);
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
  public void test20()  throws Throwable  {
      int[] intArray0 = new int[5];
      CPUTF8[] cPUTF8Array0 = new CPUTF8[0];
      LocalVariableTypeTableAttribute localVariableTypeTableAttribute0 = new LocalVariableTypeTableAttribute(0, intArray0, intArray0, cPUTF8Array0, cPUTF8Array0, intArray0);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("LocalVariableTypeTable: 0 varaibles");
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream(mockFileOutputStream0, 87);
      DataOutputStream dataOutputStream0 = new DataOutputStream(bufferedOutputStream0);
      localVariableTypeTableAttribute0.writeBody(dataOutputStream0);
      assertTrue(localVariableTypeTableAttribute0.hasBCIRenumbering());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      int[] intArray0 = new int[3];
      CPUTF8[] cPUTF8Array0 = new CPUTF8[2];
      LocalVariableTypeTableAttribute localVariableTypeTableAttribute0 = new LocalVariableTypeTableAttribute(42, intArray0, intArray0, cPUTF8Array0, cPUTF8Array0, intArray0);
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
  public void test22()  throws Throwable  {
      int[] intArray0 = new int[10];
      CPUTF8[] cPUTF8Array0 = new CPUTF8[1];
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      classConstantPool0.resolve((Segment) null);
      LocalVariableTypeTableAttribute localVariableTypeTableAttribute0 = new LocalVariableTypeTableAttribute(0, intArray0, intArray0, cPUTF8Array0, cPUTF8Array0, intArray0);
      localVariableTypeTableAttribute0.resolve(classConstantPool0);
      assertTrue(localVariableTypeTableAttribute0.hasBCIRenumbering());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      int[] intArray0 = new int[10];
      CPUTF8[] cPUTF8Array0 = new CPUTF8[1];
      LocalVariableTypeTableAttribute localVariableTypeTableAttribute0 = new LocalVariableTypeTableAttribute(0, intArray0, intArray0, cPUTF8Array0, cPUTF8Array0, intArray0);
      byte[] byteArray0 = new byte[0];
      OperandManager operandManager0 = new OperandManager((int[]) null, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, (int[]) null, intArray0, intArray0, intArray0, (int[]) null, intArray0, intArray0, intArray0, intArray0, (int[]) null, intArray0, intArray0, intArray0);
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = new CodeAttribute((byte)7, (byte)7, byteArray0, (Segment) null, operandManager0, linkedList0);
      localVariableTypeTableAttribute0.renumber(codeAttribute0.byteCodeOffsets);
      // Undeclared exception!
      try { 
        localVariableTypeTableAttribute0.renumber(codeAttribute0.byteCodeOffsets);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Trying to renumber a line number table that has already been renumbered
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.BCIRenumberedAttribute", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      int[] intArray0 = new int[6];
      LocalVariableTypeTableAttribute localVariableTypeTableAttribute0 = new LocalVariableTypeTableAttribute(1092, intArray0, intArray0, (CPUTF8[]) null, (CPUTF8[]) null, intArray0);
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
      CPUTF8[] cPUTF8Array0 = new CPUTF8[2];
      LocalVariableTypeTableAttribute localVariableTypeTableAttribute0 = new LocalVariableTypeTableAttribute(0, intArray0, intArray0, (CPUTF8[]) null, cPUTF8Array0, intArray0);
      ClassFileEntry[] classFileEntryArray0 = localVariableTypeTableAttribute0.getNestedClassFileEntries();
      assertEquals(1, classFileEntryArray0.length);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      int[] intArray0 = new int[6];
      LocalVariableTypeTableAttribute localVariableTypeTableAttribute0 = new LocalVariableTypeTableAttribute(1092, intArray0, intArray0, (CPUTF8[]) null, (CPUTF8[]) null, intArray0);
      localVariableTypeTableAttribute0.setCodeLength((-1453));
      assertTrue(localVariableTypeTableAttribute0.hasBCIRenumbering());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      LocalVariableTypeTableAttribute localVariableTypeTableAttribute0 = new LocalVariableTypeTableAttribute((-85), (int[]) null, (int[]) null, (CPUTF8[]) null, (CPUTF8[]) null, (int[]) null);
      String string0 = localVariableTypeTableAttribute0.toString();
      assertEquals("LocalVariableTypeTable: -85 varaibles", string0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("", 0);
      LocalVariableTypeTableAttribute.setAttributeName(cPUTF8_0);
      assertEquals((byte)7, ConstantPoolEntry.CP_Class);
  }
}
