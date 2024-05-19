
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
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.PipedOutputStream;
import java.util.HashSet;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8;
import org.apache.commons.compress.harmony.unpack200.bytecode.ClassConstantPool;
import org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry;
import org.apache.commons.compress.harmony.unpack200.bytecode.ConstantPoolEntry;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class CPUTF8_ESTest extends CPUTF8_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("5ekU", (-234));
      cPUTF8_0.hashCode();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("5ekU", (-234));
      String string0 = cPUTF8_0.underlyingString();
      assertEquals("5ekU", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("", 1743);
      // Undeclared exception!
      try { 
        cPUTF8_0.writeBody((DataOutputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8");
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      FilterOutputStream filterOutputStream0 = new FilterOutputStream(pipedOutputStream0);
      DataOutputStream dataOutputStream0 = new DataOutputStream(filterOutputStream0);
      try { 
        cPUTF8_0.writeBody(dataOutputStream0);
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
      CPUTF8 cPUTF8_0 = null;
      try {
        cPUTF8_0 = new CPUTF8((String) null, 31);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // utf8
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CPUTF8 cPUTF8_0 = null;
      try {
        cPUTF8_0 = new CPUTF8((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // utf8
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("org.aache.Wommonscompress.harmony.unpack200.bytecoAe.NewAttribute");
      CPUTF8 cPUTF8_1 = new CPUTF8("org.aache.Wommonscompress.harmony.unpack200.bytecoAe.NewAttribute");
      boolean boolean0 = cPUTF8_0.equals(cPUTF8_1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("");
      boolean boolean0 = cPUTF8_0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("org.apache.commons.compress.harmony.unpack200.bytecode.NewAttribute");
      boolean boolean0 = cPUTF8_0.equals(cPUTF8_0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("");
      boolean boolean0 = cPUTF8_0.equals("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("", 1743);
      String string0 = cPUTF8_0.toString();
      assertEquals("UTF-8:", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("org.aache.Wommonscompress.harmony.unpack200.bytecoAe.NewAttribute");
      cPUTF8_0.setGlobalIndex((byte)1);
      assertEquals(1, cPUTF8_0.getGlobalIndex());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("");
      String string0 = cPUTF8_0.underlyingString();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("org.aache.Wommonscompress.harmony.unpack200.bytecoAe.NewAttribute");
      MockPrintStream mockPrintStream0 = new MockPrintStream("org.aache.Wommonscompress.harmony.unpack200.bytecoAe.NewAttribute");
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockPrintStream0);
      cPUTF8_0.writeBody(dataOutputStream0);
      assertEquals((byte)11, ConstantPoolEntry.CP_InterfaceMethodref);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("");
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      HashSet<ClassFileEntry> hashSet0 = classConstantPool0.othersContainsSet;
      boolean boolean0 = hashSet0.add(cPUTF8_0);
      boolean boolean1 = hashSet0.add(cPUTF8_0);
      assertFalse(boolean1 == boolean0);
  }
}
