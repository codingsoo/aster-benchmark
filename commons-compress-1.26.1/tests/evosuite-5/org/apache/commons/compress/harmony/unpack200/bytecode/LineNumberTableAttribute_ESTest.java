
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
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PipedOutputStream;
import org.apache.commons.compress.harmony.unpack200.Segment;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8;
import org.apache.commons.compress.harmony.unpack200.bytecode.ClassConstantPool;
import org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry;
import org.apache.commons.compress.harmony.unpack200.bytecode.LineNumberTableAttribute;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class LineNumberTableAttribute_ESTest extends LineNumberTableAttribute_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LineNumberTableAttribute lineNumberTableAttribute0 = new LineNumberTableAttribute(0, (int[]) null, (int[]) null);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("Trying to rewrite ");
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockFileOutputStream0);
      lineNumberTableAttribute0.writeBody(dataOutputStream0);
      assertTrue(lineNumberTableAttribute0.hasBCIRenumbering());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      int[] intArray0 = new int[7];
      int[] intArray1 = new int[4];
      LineNumberTableAttribute lineNumberTableAttribute0 = new LineNumberTableAttribute(2179, intArray0, intArray1);
      assertFalse(lineNumberTableAttribute0.isSourceFileAttribute());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      int[] intArray0 = new int[0];
      LineNumberTableAttribute lineNumberTableAttribute0 = new LineNumberTableAttribute((-998), intArray0, intArray0);
      MockFile mockFile0 = new MockFile("", "RP!C8\"m7@ VgUxY");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0, true);
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream(mockFileOutputStream0);
      FilterOutputStream filterOutputStream0 = new FilterOutputStream(objectOutputStream0);
      DataOutputStream dataOutputStream0 = new DataOutputStream(filterOutputStream0);
      lineNumberTableAttribute0.writeBody(dataOutputStream0);
      assertFalse(lineNumberTableAttribute0.isSourceFileAttribute());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      int[] intArray0 = new int[9];
      LineNumberTableAttribute lineNumberTableAttribute0 = new LineNumberTableAttribute(0, intArray0, intArray0);
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      classConstantPool0.resolve((Segment) null);
      lineNumberTableAttribute0.resolve(classConstantPool0);
      assertEquals(0, classConstantPool0.size());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      int[] intArray0 = new int[5];
      LineNumberTableAttribute lineNumberTableAttribute0 = new LineNumberTableAttribute(0, intArray0, intArray0);
      int[] intArray1 = lineNumberTableAttribute0.getStartPCs();
      assertEquals(5, intArray1.length);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      int[] intArray0 = new int[0];
      LineNumberTableAttribute lineNumberTableAttribute0 = new LineNumberTableAttribute((-998), intArray0, intArray0);
      int[] intArray1 = lineNumberTableAttribute0.getStartPCs();
      assertSame(intArray1, intArray0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      int[] intArray0 = new int[0];
      LineNumberTableAttribute lineNumberTableAttribute0 = new LineNumberTableAttribute(1768, intArray0, intArray0);
      int int0 = lineNumberTableAttribute0.getLength();
      assertEquals(7074, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      int[] intArray0 = new int[1];
      LineNumberTableAttribute lineNumberTableAttribute0 = new LineNumberTableAttribute((-1277), intArray0, intArray0);
      int int0 = lineNumberTableAttribute0.getLength();
      assertEquals((-5106), int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      int[] intArray0 = new int[4];
      LineNumberTableAttribute lineNumberTableAttribute0 = new LineNumberTableAttribute(232, intArray0, intArray0);
      File file0 = MockFile.createTempFile("G-&/*ugl]-XE8<D", "G-&/*ugl]-XE8<D", (File) null);
      MockPrintStream mockPrintStream0 = new MockPrintStream(file0);
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockPrintStream0);
      // Undeclared exception!
      try { 
        lineNumberTableAttribute0.writeBody(dataOutputStream0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 4
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.LineNumberTableAttribute", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      int[] intArray0 = new int[4];
      LineNumberTableAttribute lineNumberTableAttribute0 = new LineNumberTableAttribute(0, intArray0, intArray0);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      DataOutputStream dataOutputStream0 = new DataOutputStream(pipedOutputStream0);
      try { 
        lineNumberTableAttribute0.writeBody(dataOutputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      int[] intArray0 = new int[1];
      LineNumberTableAttribute lineNumberTableAttribute0 = new LineNumberTableAttribute(0, intArray0, intArray0);
      // Undeclared exception!
      try { 
        lineNumberTableAttribute0.resolve((ClassConstantPool) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.Attribute", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LineNumberTableAttribute lineNumberTableAttribute0 = new LineNumberTableAttribute(1, (int[]) null, (int[]) null);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("}{");
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockFileOutputStream0);
      // Undeclared exception!
      try { 
        lineNumberTableAttribute0.writeBody(dataOutputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.LineNumberTableAttribute", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      int[] intArray0 = new int[3];
      LineNumberTableAttribute lineNumberTableAttribute0 = new LineNumberTableAttribute((-26), intArray0, intArray0);
      boolean boolean0 = lineNumberTableAttribute0.equals(lineNumberTableAttribute0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LineNumberTableAttribute lineNumberTableAttribute0 = new LineNumberTableAttribute((-3590), (int[]) null, (int[]) null);
      Object object0 = new Object();
      boolean boolean0 = lineNumberTableAttribute0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LineNumberTableAttribute lineNumberTableAttribute0 = new LineNumberTableAttribute(0, (int[]) null, (int[]) null);
      int[] intArray0 = lineNumberTableAttribute0.getStartPCs();
      assertNull(intArray0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LineNumberTableAttribute lineNumberTableAttribute0 = new LineNumberTableAttribute((-3590), (int[]) null, (int[]) null);
      ClassFileEntry[] classFileEntryArray0 = lineNumberTableAttribute0.getNestedClassFileEntries();
      assertEquals(1, classFileEntryArray0.length);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LineNumberTableAttribute lineNumberTableAttribute0 = new LineNumberTableAttribute(0, (int[]) null, (int[]) null);
      String string0 = lineNumberTableAttribute0.toString();
      assertEquals("LineNumberTable: 0 lines", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LineNumberTableAttribute.setAttributeName((CPUTF8) null);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LineNumberTableAttribute lineNumberTableAttribute0 = new LineNumberTableAttribute((-10), (int[]) null, (int[]) null);
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      // Undeclared exception!
      try { 
        lineNumberTableAttribute0.resolve(classConstantPool0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Constant pool is not yet resolved; this does not make any sense
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ClassConstantPool", e);
      }
  }
}
