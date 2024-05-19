
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
import org.apache.commons.compress.harmony.unpack200.bytecode.Attribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8;
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
      MockPrintStream mockPrintStream0 = new MockPrintStream("SourceFile");
      int[] intArray0 = new int[4];
      intArray0[3] = 214;
      classFile0.interfaces = intArray0;
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
  public void test1()  throws Throwable  {
      ClassFile classFile0 = new ClassFile();
      classFile0.major = 4088;
      MockFile mockFile0 = new MockFile("c![$#QVM4Oofw9^PwB", "");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
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
  public void test2()  throws Throwable  {
      ClassFile classFile0 = new ClassFile();
      MockPrintStream mockPrintStream0 = new MockPrintStream("SourceFile");
      classFile0.thisClass = 198;
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
  public void test3()  throws Throwable  {
      ClassFile classFile0 = new ClassFile();
      MockFile mockFile0 = new MockFile("");
      MockFile mockFile1 = new MockFile(mockFile0, "org.apache.commons.compress.harmony.unpack200.bytecode.ClassFile");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile1);
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockPrintStream0);
      classFile0.minor = 476;
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
      classFile0.accessFlags = (int) (byte)5;
      MockFile mockFile0 = new MockFile("nDD]-i6", "");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0, true);
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
  public void test5()  throws Throwable  {
      ClassFile classFile0 = new ClassFile();
      MockFile mockFile0 = new MockFile("^y6O8sKnVC?XO60r/g", "bm@?8N93a;;'P'5a\u0000");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0, true);
      mockFileOutputStream0.close();
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockFileOutputStream0);
      try { 
        classFile0.write(dataOutputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ClassFile classFile0 = new ClassFile();
      MockPrintStream mockPrintStream0 = new MockPrintStream("SourceFi");
      ClassFileEntry[] classFileEntryArray0 = new ClassFileEntry[0];
      classFile0.fields = classFileEntryArray0;
      int[] intArray0 = new int[6];
      Attribute[] attributeArray0 = new Attribute[2];
      classFile0.attributes = attributeArray0;
      classFile0.interfaces = intArray0;
      classFile0.methods = classFileEntryArray0;
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
  public void test7()  throws Throwable  {
      ClassFile classFile0 = new ClassFile();
      MockPrintStream mockPrintStream0 = new MockPrintStream("SourceFi");
      ClassFileEntry[] classFileEntryArray0 = new ClassFileEntry[0];
      classFile0.fields = classFileEntryArray0;
      int[] intArray0 = new int[6];
      Attribute[] attributeArray0 = new Attribute[10];
      classFile0.attributes = attributeArray0;
      classFile0.interfaces = intArray0;
      classFile0.methods = (ClassFileEntry[]) classFile0.attributes;
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
  public void test8()  throws Throwable  {
      ClassFile classFile0 = new ClassFile();
      MockPrintStream mockPrintStream0 = new MockPrintStream("A\"I<X P7~cDh");
      ClassFileEntry[] classFileEntryArray0 = new ClassFileEntry[1];
      classFile0.fields = classFileEntryArray0;
      int[] intArray0 = new int[3];
      classFile0.interfaces = intArray0;
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
  public void test9()  throws Throwable  {
      ClassFile classFile0 = new ClassFile();
      CPUTF8 cPUTF8_0 = new CPUTF8("mnitorenter");
      classFile0.pool.add(cPUTF8_0);
      MockFile mockFile0 = new MockFile("mnitorenter", "mnitorenter");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0, true);
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
