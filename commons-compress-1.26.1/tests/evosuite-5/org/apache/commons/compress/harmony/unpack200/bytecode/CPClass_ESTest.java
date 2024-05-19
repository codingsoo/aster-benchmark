
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
import java.io.PipedOutputStream;
import org.apache.commons.compress.harmony.unpack200.Segment;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPClass;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8;
import org.apache.commons.compress.harmony.unpack200.bytecode.ClassConstantPool;
import org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry;
import org.apache.commons.compress.harmony.unpack200.bytecode.ConstantPoolEntry;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class CPClass_ESTest extends CPClass_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("", 139);
      CPClass cPClass0 = new CPClass(cPUTF8_0, (-907));
      MockPrintStream mockPrintStream0 = new MockPrintStream("z+\"0U&FNj%D_,a");
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockPrintStream0);
      cPClass0.writeBody(dataOutputStream0);
      assertEquals((-907), cPClass0.getGlobalIndex());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("B:l?k", 0);
      CPClass cPClass0 = new CPClass(cPUTF8_0, (byte)8);
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      classConstantPool0.resolve((Segment) null);
      cPClass0.resolve(classConstantPool0);
      assertEquals((byte)7, ConstantPoolEntry.CP_Class);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("y~:w'R}W'");
      CPClass cPClass0 = new CPClass(cPUTF8_0, (byte)7);
      String string0 = cPClass0.getName();
      assertEquals("y~:w'R}W'", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("p!!'Hk", (-2406));
      CPClass cPClass0 = new CPClass(cPUTF8_0, (byte)8);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      DataOutputStream dataOutputStream0 = new DataOutputStream(pipedOutputStream0);
      try { 
        cPClass0.writeBody(dataOutputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("", 139);
      CPClass cPClass0 = new CPClass(cPUTF8_0, (-907));
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      // Undeclared exception!
      try { 
        cPClass0.resolve(classConstantPool0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Constant pool is not yet resolved; this does not make any sense
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ClassConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CPClass cPClass0 = null;
      try {
        cPClass0 = new CPClass((CPUTF8) null, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // name
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("");
      CPClass cPClass0 = new CPClass(cPUTF8_0, (byte)8);
      String string0 = cPClass0.getName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8(" that has no rewrite", 3949);
      CPClass cPClass0 = new CPClass(cPUTF8_0, 3949);
      Object object0 = new Object();
      boolean boolean0 = cPClass0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("*u21:^I5Erfc");
      CPClass cPClass0 = new CPClass(cPUTF8_0, (byte)7);
      boolean boolean0 = cPClass0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8(" that has no rewrite", 3949);
      CPClass cPClass0 = new CPClass(cPUTF8_0, 3949);
      boolean boolean0 = cPClass0.equals(cPClass0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8(" that has no rewrite", 3949);
      CPClass cPClass0 = new CPClass(cPUTF8_0, 3949);
      CPClass cPClass1 = new CPClass(cPUTF8_0, (byte)7);
      boolean boolean0 = cPClass1.equals(cPClass0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("*u21:^I5Erfc");
      CPClass cPClass0 = new CPClass(cPUTF8_0, (byte)7);
      // Undeclared exception!
      try { 
        cPClass0.writeBody((DataOutputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.CPClass", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("if_icmpge", 6);
      CPClass cPClass0 = new CPClass(cPUTF8_0, (byte)11);
      // Undeclared exception!
      try { 
        cPClass0.resolve((ClassConstantPool) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.CPClass", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8(" that has no rewrite", 3949);
      CPClass cPClass0 = new CPClass(cPUTF8_0, 3949);
      String string0 = cPClass0.toString();
      assertEquals("Class:  that has no rewrite", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("fsub", (-1126));
      CPClass cPClass0 = new CPClass(cPUTF8_0, (byte)8);
      cPClass0.hashCode();
      cPClass0.hashCode();
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8(" that has no rewrite", 3949);
      CPClass cPClass0 = new CPClass(cPUTF8_0, 3949);
      ClassFileEntry[] classFileEntryArray0 = cPClass0.getNestedClassFileEntries();
      assertEquals(1, classFileEntryArray0.length);
  }
}
