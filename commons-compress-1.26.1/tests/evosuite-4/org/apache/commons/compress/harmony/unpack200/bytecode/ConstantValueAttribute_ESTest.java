
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
import org.apache.commons.compress.harmony.unpack200.Segment;
import org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPClass;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPInterfaceMethodRef;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPNameAndType;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8;
import org.apache.commons.compress.harmony.unpack200.bytecode.ClassConstantPool;
import org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry;
import org.apache.commons.compress.harmony.unpack200.bytecode.ConstantValueAttribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.DeprecatedAttribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.ExceptionsAttribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.LineNumberTableAttribute;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class ConstantValueAttribute_ESTest extends ConstantValueAttribute_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("t.`");
      ConstantValueAttribute.setAttributeName(cPUTF8_0);
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      ConstantValueAttribute constantValueAttribute0 = new ConstantValueAttribute(cPUTF8_0);
      ConstantValueAttribute constantValueAttribute1 = (ConstantValueAttribute)classConstantPool0.add(constantValueAttribute0);
      assertFalse(constantValueAttribute1.hasBCIRenumbering());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      int[] intArray0 = new int[0];
      LineNumberTableAttribute lineNumberTableAttribute0 = new LineNumberTableAttribute(0, intArray0, intArray0);
      ConstantValueAttribute constantValueAttribute0 = new ConstantValueAttribute(lineNumberTableAttribute0);
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      classConstantPool0.resolve((Segment) null);
      constantValueAttribute0.resolve(classConstantPool0);
      assertFalse(constantValueAttribute0.hasBCIRenumbering());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DeprecatedAttribute deprecatedAttribute0 = new DeprecatedAttribute();
      ConstantValueAttribute constantValueAttribute0 = new ConstantValueAttribute(deprecatedAttribute0);
      // Undeclared exception!
      try { 
        constantValueAttribute0.writeBody((DataOutputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ConstantValueAttribute", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("");
      ConstantValueAttribute constantValueAttribute0 = new ConstantValueAttribute(cPUTF8_0);
      FileSystemHandling.shouldAllThrowIOExceptions();
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("@j");
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockFileOutputStream0);
      try { 
        constantValueAttribute0.writeBody(dataOutputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Simulated IOException
         //
         verifyException("org.evosuite.runtime.vfs.VirtualFileSystem", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ExceptionsAttribute exceptionsAttribute0 = new ExceptionsAttribute((CPClass[]) null);
      ConstantValueAttribute constantValueAttribute0 = new ConstantValueAttribute(exceptionsAttribute0);
      // Undeclared exception!
      try { 
        constantValueAttribute0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ExceptionsAttribute", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("lstore_2", 629);
      CPClass cPClass0 = new CPClass(cPUTF8_0, 0);
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, cPUTF8_0, (-3103));
      CPInterfaceMethodRef cPInterfaceMethodRef0 = new CPInterfaceMethodRef(cPClass0, cPNameAndType0, (-758));
      ConstantValueAttribute constantValueAttribute0 = new ConstantValueAttribute(cPInterfaceMethodRef0);
      // Undeclared exception!
      try { 
        constantValueAttribute0.resolve((ClassConstantPool) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.Attribute", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ConstantValueAttribute constantValueAttribute0 = null;
      try {
        constantValueAttribute0 = new ConstantValueAttribute((ClassFileEntry) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // entry
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("");
      ConstantValueAttribute constantValueAttribute0 = new ConstantValueAttribute(cPUTF8_0);
      constantValueAttribute0.hashCode();
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("");
      ConstantValueAttribute constantValueAttribute0 = new ConstantValueAttribute(cPUTF8_0);
      ConstantValueAttribute constantValueAttribute1 = new ConstantValueAttribute(cPUTF8_0);
      boolean boolean0 = constantValueAttribute0.equals(constantValueAttribute1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ByteCode byteCode0 = new ByteCode(172);
      ConstantValueAttribute constantValueAttribute0 = new ConstantValueAttribute(byteCode0);
      ConstantValueAttribute constantValueAttribute1 = new ConstantValueAttribute(constantValueAttribute0);
      boolean boolean0 = constantValueAttribute0.equals(constantValueAttribute1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      int[] intArray0 = new int[7];
      LineNumberTableAttribute lineNumberTableAttribute0 = new LineNumberTableAttribute(749, intArray0, intArray0);
      ConstantValueAttribute constantValueAttribute0 = new ConstantValueAttribute(lineNumberTableAttribute0);
      boolean boolean0 = constantValueAttribute0.equals(constantValueAttribute0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      int[] intArray0 = new int[7];
      LineNumberTableAttribute lineNumberTableAttribute0 = new LineNumberTableAttribute(749, intArray0, intArray0);
      ConstantValueAttribute constantValueAttribute0 = new ConstantValueAttribute(lineNumberTableAttribute0);
      MockPrintStream mockPrintStream0 = new MockPrintStream("Constant:LineNumberTable: 749 lines");
      boolean boolean0 = constantValueAttribute0.equals(mockPrintStream0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      int[] intArray0 = new int[7];
      LineNumberTableAttribute lineNumberTableAttribute0 = new LineNumberTableAttribute(749, intArray0, intArray0);
      ConstantValueAttribute constantValueAttribute0 = new ConstantValueAttribute(lineNumberTableAttribute0);
      String string0 = constantValueAttribute0.toString();
      assertEquals("Constant:LineNumberTable: 749 lines", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      int[] intArray0 = new int[7];
      LineNumberTableAttribute lineNumberTableAttribute0 = new LineNumberTableAttribute(749, intArray0, intArray0);
      ConstantValueAttribute constantValueAttribute0 = new ConstantValueAttribute(lineNumberTableAttribute0);
      MockPrintStream mockPrintStream0 = new MockPrintStream("Constant:LineNumberTable: 749 lines");
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockPrintStream0);
      constantValueAttribute0.writeBody(dataOutputStream0);
      assertFalse(constantValueAttribute0.hasBCIRenumbering());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      int[] intArray0 = new int[7];
      LineNumberTableAttribute lineNumberTableAttribute0 = new LineNumberTableAttribute(749, intArray0, intArray0);
      ConstantValueAttribute constantValueAttribute0 = new ConstantValueAttribute(lineNumberTableAttribute0);
      int int0 = constantValueAttribute0.getLength();
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ByteCode byteCode0 = new ByteCode(172);
      ConstantValueAttribute constantValueAttribute0 = new ConstantValueAttribute(byteCode0);
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      // Undeclared exception!
      try { 
        constantValueAttribute0.resolve(classConstantPool0);
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
      ByteCode byteCode0 = new ByteCode(172);
      ConstantValueAttribute constantValueAttribute0 = new ConstantValueAttribute(byteCode0);
      ClassFileEntry[] classFileEntryArray0 = constantValueAttribute0.getNestedClassFileEntries();
      assertEquals(2, classFileEntryArray0.length);
  }
}
