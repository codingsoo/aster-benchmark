
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
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.PipedOutputStream;
import org.apache.commons.compress.harmony.unpack200.Segment;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPClass;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8;
import org.apache.commons.compress.harmony.unpack200.bytecode.ClassConstantPool;
import org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry;
import org.apache.commons.compress.harmony.unpack200.bytecode.ExceptionsAttribute;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class ExceptionsAttribute_ESTest extends ExceptionsAttribute_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("eP4/", 0);
      ExceptionsAttribute.setAttributeName(cPUTF8_0);
      CPClass[] cPClassArray0 = new CPClass[2];
      ExceptionsAttribute exceptionsAttribute0 = new ExceptionsAttribute(cPClassArray0);
      exceptionsAttribute0.hashCode();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CPClass[] cPClassArray0 = new CPClass[8];
      ExceptionsAttribute exceptionsAttribute0 = new ExceptionsAttribute(cPClassArray0);
      int int0 = exceptionsAttribute0.getLength();
      assertEquals(18, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ExceptionsAttribute exceptionsAttribute0 = new ExceptionsAttribute((CPClass[]) null);
      // Undeclared exception!
      try { 
        exceptionsAttribute0.writeBody((DataOutputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ExceptionsAttribute", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CPClass[] cPClassArray0 = new CPClass[1];
      CPUTF8 cPUTF8_0 = new CPUTF8("()'+7R7[H!v 5H_MoWw", 0);
      CPClass cPClass0 = new CPClass(cPUTF8_0, 0);
      cPClassArray0[0] = cPClass0;
      ExceptionsAttribute exceptionsAttribute0 = new ExceptionsAttribute(cPClassArray0);
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      classConstantPool0.resolve((Segment) null);
      exceptionsAttribute0.resolve(classConstantPool0);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      DataOutputStream dataOutputStream0 = new DataOutputStream(pipedOutputStream0);
      try { 
        exceptionsAttribute0.writeBody(dataOutputStream0);
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
      ExceptionsAttribute exceptionsAttribute0 = new ExceptionsAttribute((CPClass[]) null);
      // Undeclared exception!
      try { 
        exceptionsAttribute0.toString();
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
      CPClass[] cPClassArray0 = new CPClass[0];
      ExceptionsAttribute exceptionsAttribute0 = new ExceptionsAttribute(cPClassArray0);
      // Undeclared exception!
      try { 
        exceptionsAttribute0.resolve((ClassConstantPool) null);
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
      CPClass[] cPClassArray0 = new CPClass[0];
      ExceptionsAttribute exceptionsAttribute0 = new ExceptionsAttribute(cPClassArray0);
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      // Undeclared exception!
      try { 
        exceptionsAttribute0.resolve(classConstantPool0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Constant pool is not yet resolved; this does not make any sense
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ClassConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ExceptionsAttribute exceptionsAttribute0 = new ExceptionsAttribute((CPClass[]) null);
      // Undeclared exception!
      try { 
        exceptionsAttribute0.getNestedClassFileEntries();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ExceptionsAttribute", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ExceptionsAttribute exceptionsAttribute0 = new ExceptionsAttribute((CPClass[]) null);
      // Undeclared exception!
      try { 
        exceptionsAttribute0.getLength();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ExceptionsAttribute", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CPClass[] cPClassArray0 = new CPClass[1];
      ExceptionsAttribute exceptionsAttribute0 = new ExceptionsAttribute(cPClassArray0);
      String string0 = exceptionsAttribute0.toString();
      assertEquals("Exceptions: null ", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CPClass[] cPClassArray0 = new CPClass[1];
      CPUTF8 cPUTF8_0 = new CPUTF8("()'+7R7[H!v 5H_MoWw", 0);
      CPClass cPClass0 = new CPClass(cPUTF8_0, 0);
      cPClassArray0[0] = cPClass0;
      ExceptionsAttribute exceptionsAttribute0 = new ExceptionsAttribute(cPClassArray0);
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      classConstantPool0.resolve((Segment) null);
      exceptionsAttribute0.resolve(classConstantPool0);
      MockPrintStream mockPrintStream0 = new MockPrintStream("Exceptions: Class: ()'+7R7[H!v 5H_MoWw ");
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream(mockPrintStream0, (byte)7);
      DataOutputStream dataOutputStream0 = new DataOutputStream(bufferedOutputStream0);
      exceptionsAttribute0.writeBody(dataOutputStream0);
      assertFalse(exceptionsAttribute0.isSourceFileAttribute());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CPClass[] cPClassArray0 = new CPClass[4];
      ExceptionsAttribute exceptionsAttribute0 = new ExceptionsAttribute(cPClassArray0);
      CPClass[] cPClassArray1 = new CPClass[1];
      ExceptionsAttribute exceptionsAttribute1 = new ExceptionsAttribute(cPClassArray1);
      boolean boolean0 = exceptionsAttribute0.equals(exceptionsAttribute1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CPClass[] cPClassArray0 = new CPClass[1];
      ExceptionsAttribute exceptionsAttribute0 = new ExceptionsAttribute(cPClassArray0);
      Object object0 = new Object();
      boolean boolean0 = exceptionsAttribute0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CPClass[] cPClassArray0 = new CPClass[5];
      ExceptionsAttribute exceptionsAttribute0 = new ExceptionsAttribute(cPClassArray0);
      boolean boolean0 = exceptionsAttribute0.equals(exceptionsAttribute0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CPClass[] cPClassArray0 = new CPClass[3];
      ExceptionsAttribute exceptionsAttribute0 = new ExceptionsAttribute(cPClassArray0);
      ExceptionsAttribute exceptionsAttribute1 = new ExceptionsAttribute(cPClassArray0);
      boolean boolean0 = exceptionsAttribute0.equals(exceptionsAttribute1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CPClass[] cPClassArray0 = new CPClass[1];
      CPUTF8 cPUTF8_0 = new CPUTF8("()'+7R7[H!v 5H_MoWw", 0);
      CPClass cPClass0 = new CPClass(cPUTF8_0, 0);
      cPClassArray0[0] = cPClass0;
      ExceptionsAttribute exceptionsAttribute0 = new ExceptionsAttribute(cPClassArray0);
      exceptionsAttribute0.hashCode();
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ExceptionsAttribute exceptionsAttribute0 = new ExceptionsAttribute((CPClass[]) null);
      exceptionsAttribute0.hashCode();
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CPClass[] cPClassArray0 = new CPClass[3];
      ExceptionsAttribute exceptionsAttribute0 = new ExceptionsAttribute(cPClassArray0);
      ClassFileEntry[] classFileEntryArray0 = exceptionsAttribute0.getNestedClassFileEntries();
      assertEquals(4, classFileEntryArray0.length);
  }
}
