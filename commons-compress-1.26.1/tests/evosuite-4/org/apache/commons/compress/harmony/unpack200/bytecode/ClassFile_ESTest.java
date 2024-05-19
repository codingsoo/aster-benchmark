
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
import java.io.File;
import java.io.IOException;
import java.io.PipedOutputStream;
import org.apache.commons.compress.harmony.unpack200.bytecode.Attribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPDouble;
import org.apache.commons.compress.harmony.unpack200.bytecode.ClassFile;
import org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class ClassFile_ESTest extends ClassFile_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ClassFile classFile0 = new ClassFile();
      MockFile mockFile0 = new MockFile("org.apache.commons.compress.harmony.unpack200.bytecode.ClassFile");
      int[] intArray0 = new int[5];
      intArray0[1] = 5;
      classFile0.interfaces = intArray0;
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0);
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockFileOutputStream0);
      // Undeclared exception!
      try { 
        classFile0.write(dataOutputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ClassFile", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ClassFile classFile0 = new ClassFile();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      classFile0.superClass = (-2048);
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream(pipedOutputStream0, 1417);
      DataOutputStream dataOutputStream0 = new DataOutputStream(bufferedOutputStream0);
      // Undeclared exception!
      try { 
        classFile0.write(dataOutputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ClassFile", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ClassFile classFile0 = new ClassFile();
      MockFile mockFile0 = new MockFile("org.apache.commons.compress.harmony.unpack200.bytecode.ClassFile");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0);
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockFileOutputStream0);
      classFile0.minor = 15;
      // Undeclared exception!
      try { 
        classFile0.write(dataOutputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ClassFile", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ClassFile classFile0 = new ClassFile();
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(0);
      DataOutputStream dataOutputStream0 = new DataOutputStream(byteArrayOutputStream0);
      classFile0.thisClass = (-778);
      // Undeclared exception!
      try { 
        classFile0.write(dataOutputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ClassFile", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ClassFile classFile0 = new ClassFile();
      File file0 = MockFile.createTempFile(":g>EUby5 fF90n_%`4V", ":g>EUby5 fF90n_%`4V", (File) null);
      MockPrintStream mockPrintStream0 = new MockPrintStream(file0);
      classFile0.accessFlags = (-191);
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockPrintStream0);
      // Undeclared exception!
      try { 
        classFile0.write(dataOutputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ClassFile", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ClassFile classFile0 = new ClassFile();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      DataOutputStream dataOutputStream0 = new DataOutputStream(pipedOutputStream0);
      try { 
        classFile0.write(dataOutputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ClassFile classFile0 = new ClassFile();
      Attribute[] attributeArray0 = new Attribute[1];
      classFile0.attributes = attributeArray0;
      int[] intArray0 = new int[7];
      classFile0.interfaces = intArray0;
      ClassFileEntry[] classFileEntryArray0 = new ClassFileEntry[0];
      classFile0.fields = classFileEntryArray0;
      classFile0.methods = classFileEntryArray0;
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("fu4u(Yj");
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockFileOutputStream0);
      // Undeclared exception!
      try { 
        classFile0.write(dataOutputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ClassFile", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      ClassFile classFile0 = new ClassFile();
      Attribute[] attributeArray0 = new Attribute[3];
      classFile0.attributes = attributeArray0;
      int[] intArray0 = new int[7];
      classFile0.interfaces = intArray0;
      ClassFileEntry[] classFileEntryArray0 = new ClassFileEntry[0];
      classFile0.fields = classFileEntryArray0;
      classFile0.methods = (ClassFileEntry[]) classFile0.attributes;
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("fu4u(Yj");
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockFileOutputStream0);
      // Undeclared exception!
      try { 
        classFile0.write(dataOutputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ClassFile", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      ClassFile classFile0 = new ClassFile();
      int[] intArray0 = new int[5];
      classFile0.interfaces = intArray0;
      ClassFileEntry[] classFileEntryArray0 = new ClassFileEntry[1];
      classFile0.fields = classFileEntryArray0;
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(0);
      DataOutputStream dataOutputStream0 = new DataOutputStream(byteArrayOutputStream0);
      // Undeclared exception!
      try { 
        classFile0.write(dataOutputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ClassFile", e);
      }
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      ClassFile classFile0 = new ClassFile();
      MockFile mockFile0 = new MockFile("c%N5%8t", "c%N5%8t");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0);
      Double double0 = new Double(0);
      CPDouble cPDouble0 = new CPDouble(double0, 0);
      classFile0.pool.add(cPDouble0);
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockFileOutputStream0);
      // Undeclared exception!
      try { 
        classFile0.write(dataOutputStream0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Constant pool is not yet resolved; this does not make any sense
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ClassConstantPool", e);
      }
  }
}
