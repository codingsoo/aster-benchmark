
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
import org.apache.commons.compress.harmony.unpack200.bytecode.CPString;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8;
import org.apache.commons.compress.harmony.unpack200.bytecode.ClassConstantPool;
import org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry;
import org.apache.commons.compress.harmony.unpack200.bytecode.ConstantPoolEntry;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class CPString_ESTest extends CPString_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("String: ");
      CPString cPString0 = new CPString(cPUTF8_0, (byte)11);
      MockFile mockFile0 = new MockFile("String: ");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0, false);
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockFileOutputStream0);
      cPString0.writeBody(dataOutputStream0);
      assertEquals((byte)8, cPString0.getTag());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("fk{|O", (-963));
      CPString cPString0 = new CPString(cPUTF8_0, 1093);
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      classConstantPool0.resolve((Segment) null);
      cPString0.resolve(classConstantPool0);
      assertEquals((byte)5, ConstantPoolEntry.CP_Long);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("T9.'-;s");
      CPString cPString0 = new CPString(cPUTF8_0, (byte)11);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      DataOutputStream dataOutputStream0 = new DataOutputStream(pipedOutputStream0);
      try { 
        cPString0.writeBody(dataOutputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("String: ");
      CPString cPString0 = new CPString(cPUTF8_0, (byte)11);
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      // Undeclared exception!
      try { 
        cPString0.resolve(classConstantPool0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Constant pool is not yet resolved; this does not make any sense
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ClassConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      CPString cPString0 = null;
      try {
        cPString0 = new CPString((CPUTF8) null, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // value
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("");
      CPString cPString0 = new CPString(cPUTF8_0, (byte)6);
      cPString0.hashCode();
      cPString0.hashCode();
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("");
      CPString cPString0 = new CPString(cPUTF8_0, (byte)6);
      String string0 = cPString0.toString();
      assertEquals("String: UTF-8:", string0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("");
      CPString cPString0 = new CPString(cPUTF8_0, (byte)6);
      // Undeclared exception!
      try { 
        cPString0.writeBody((DataOutputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.CPString", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("");
      CPString cPString0 = new CPString(cPUTF8_0, (byte)6);
      ClassFileEntry[] classFileEntryArray0 = cPString0.getNestedClassFileEntries();
      assertEquals(1, classFileEntryArray0.length);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("/%[ruFsJSVNG[d_R", (-401));
      CPString cPString0 = new CPString(cPUTF8_0, (byte)1);
      // Undeclared exception!
      try { 
        cPString0.resolve((ClassConstantPool) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.CPString", e);
      }
  }
}
