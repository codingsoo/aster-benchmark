
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
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class ExceptionTableEntry_ESTest extends ExceptionTableEntry_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8(">`.7u", 0);
      byte[] byteArray0 = new byte[13];
      int[] intArray0 = new int[2];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      CPClass cPClass0 = new CPClass(cPUTF8_0, 4662);
      ExceptionTableEntry exceptionTableEntry0 = new ExceptionTableEntry(0, 0, 10, cPClass0);
      CodeAttribute codeAttribute0 = new CodeAttribute((byte)4, 0, byteArray0, (Segment) null, operandManager0, linkedList0);
      exceptionTableEntry0.renumber(codeAttribute0.byteCodeOffsets);
      assertFalse(codeAttribute0.isSourceFileAttribute());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("r`w-)KHmXl+}|m6", (-565));
      CPClass cPClass0 = new CPClass(cPUTF8_0, (-1508));
      ExceptionTableEntry exceptionTableEntry0 = new ExceptionTableEntry((-565), (-565), (-565), cPClass0);
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      classConstantPool0.resolve((Segment) null);
      exceptionTableEntry0.resolve(classConstantPool0);
      assertEquals(0, classConstantPool0.size());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("dldc2_w");
      CPClass cPClass0 = new CPClass(cPUTF8_0, (-328));
      cPClass0.tag = (byte)0;
      ExceptionTableEntry exceptionTableEntry0 = new ExceptionTableEntry(5, 5, 5, cPClass0);
      CPClass cPClass1 = exceptionTableEntry0.getCatchType();
      assertEquals((byte)8, ConstantPoolEntry.CP_String);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8(">`.7u", 10);
      CPClass cPClass0 = new CPClass(cPUTF8_0, (-1640));
      ExceptionTableEntry exceptionTableEntry0 = new ExceptionTableEntry(10, 10, 10, cPClass0);
      cPClass0.tag = (byte) (-38);
      CPClass cPClass1 = exceptionTableEntry0.getCatchType();
      assertEquals((byte)12, ConstantPoolEntry.CP_NameAndType);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("hG.F#");
      CPClass cPClass0 = new CPClass(cPUTF8_0, 0);
      ExceptionTableEntry exceptionTableEntry0 = new ExceptionTableEntry(46, 1686, 0, cPClass0);
      CPClass cPClass1 = exceptionTableEntry0.getCatchType();
      assertEquals((byte)12, ConstantPoolEntry.CP_NameAndType);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("JWu8JKI?4w}eHP7K(G8", 56);
      CPClass cPClass0 = new CPClass(cPUTF8_0, (byte)3);
      ExceptionTableEntry exceptionTableEntry0 = new ExceptionTableEntry((-2620), (-2620), (-1), cPClass0);
      CPClass cPClass1 = exceptionTableEntry0.getCatchType();
      assertEquals((byte)4, ConstantPoolEntry.CP_Float);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ExceptionTableEntry exceptionTableEntry0 = new ExceptionTableEntry(2842, 0, 2842, (CPClass) null);
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
  public void test07()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("Xxo2-");
      CPClass cPClass0 = new CPClass(cPUTF8_0, (-1772));
      ExceptionTableEntry exceptionTableEntry0 = new ExceptionTableEntry(1565, 0, (-1111), cPClass0);
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

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("org.apache.commons.compress.harmony.unpack200.bytecode.ExceptionTableEntry", (-1858));
      CPClass cPClass0 = new CPClass(cPUTF8_0, (byte)10);
      ExceptionTableEntry exceptionTableEntry0 = new ExceptionTableEntry(1, (-1858), (-1858), cPClass0);
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
      CPUTF8 cPUTF8_0 = new CPUTF8("'r E$", 21);
      CPClass cPClass0 = new CPClass(cPUTF8_0, (-251));
      ExceptionTableEntry exceptionTableEntry0 = new ExceptionTableEntry((-1367), (-661), (-813), cPClass0);
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
      ExceptionTableEntry exceptionTableEntry0 = new ExceptionTableEntry(0, (-141), 0, (CPClass) null);
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      exceptionTableEntry0.resolve(classConstantPool0);
      assertEquals(0, classConstantPool0.size());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("O`w-)KHmXl+}|m6");
      CPClass cPClass0 = new CPClass(cPUTF8_0, (byte)6);
      ExceptionTableEntry exceptionTableEntry0 = new ExceptionTableEntry((-565), (-565), (-565), cPClass0);
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
  public void test12()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8(">`.7u");
      CPClass cPClass0 = new CPClass(cPUTF8_0, (-1640));
      ExceptionTableEntry exceptionTableEntry0 = new ExceptionTableEntry(0, 0, 0, cPClass0);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(">`.7u");
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockFileOutputStream0);
      exceptionTableEntry0.write(dataOutputStream0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ExceptionTableEntry exceptionTableEntry0 = new ExceptionTableEntry(0, (-141), 0, (CPClass) null);
      byte[] byteArray0 = new byte[3];
      int[] intArray0 = new int[2];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = new CodeAttribute(0, (byte)6, byteArray0, (Segment) null, operandManager0, linkedList0);
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
  public void test14()  throws Throwable  {
      ExceptionTableEntry exceptionTableEntry0 = new ExceptionTableEntry(0, (-141), 0, (CPClass) null);
      CPClass cPClass0 = exceptionTableEntry0.getCatchType();
      assertNull(cPClass0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("", 277);
      CPClass cPClass0 = new CPClass(cPUTF8_0, (-3132));
      ExceptionTableEntry exceptionTableEntry0 = new ExceptionTableEntry(1954, 277, 1954, cPClass0);
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      // Undeclared exception!
      try { 
        exceptionTableEntry0.renumber(linkedList0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1954, Size: 0
         //
         verifyException("java.util.LinkedList", e);
      }
  }
}
