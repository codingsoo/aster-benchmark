
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
import java.io.OutputStream;
import java.io.PipedOutputStream;
import org.apache.commons.compress.harmony.unpack200.Segment;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPClass;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8;
import org.apache.commons.compress.harmony.unpack200.bytecode.ClassConstantPool;
import org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry;
import org.apache.commons.compress.harmony.unpack200.bytecode.InnerClassesAttribute;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class InnerClassesAttribute_ESTest extends InnerClassesAttribute_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      InnerClassesAttribute innerClassesAttribute0 = new InnerClassesAttribute("org.apache.commons.compress.harmony.unpack200.bytecode.InnerClassesAttribute$InnerClassesEntry");
      CPUTF8 cPUTF8_0 = new CPUTF8("org.apache.commons.compress.harmony.unpack200.bytecode.InnerClassesAttribute$InnerClassesEntry", 0);
      CPClass cPClass0 = new CPClass(cPUTF8_0, 2105);
      CPClass cPClass1 = new CPClass(cPUTF8_0, (byte)4);
      // Undeclared exception!
      try { 
        innerClassesAttribute0.addInnerClassesEntry(cPClass0, cPClass1, cPUTF8_0, 0);
       //  fail("Expecting exception: IncompatibleClassChangeError");
       // Unstable assertion
      } catch(IncompatibleClassChangeError e) {
         //
         // Expected non-static field org.apache.commons.compress.harmony.unpack200.bytecode.InnerClassesAttribute.attributeName
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.InnerClassesAttribute", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      InnerClassesAttribute innerClassesAttribute0 = new InnerClassesAttribute(")Hc");
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      MockPrintStream mockPrintStream0 = new MockPrintStream(pipedOutputStream0);
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockPrintStream0);
      innerClassesAttribute0.writeBody(dataOutputStream0);
      assertFalse(innerClassesAttribute0.isSourceFileAttribute());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      InnerClassesAttribute innerClassesAttribute0 = new InnerClassesAttribute("iR");
      int int0 = innerClassesAttribute0.getLength();
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      InnerClassesAttribute innerClassesAttribute0 = new InnerClassesAttribute("IkeD");
      DataOutputStream dataOutputStream0 = new DataOutputStream((OutputStream) null);
      // Undeclared exception!
      try { 
        innerClassesAttribute0.writeBody(dataOutputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      InnerClassesAttribute innerClassesAttribute0 = new InnerClassesAttribute((String) null);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      FilterOutputStream filterOutputStream0 = new FilterOutputStream(pipedOutputStream0);
      DataOutputStream dataOutputStream0 = new DataOutputStream(filterOutputStream0);
      try { 
        innerClassesAttribute0.writeBody(dataOutputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      InnerClassesAttribute innerClassesAttribute0 = new InnerClassesAttribute((String) null);
      // Undeclared exception!
      try { 
        innerClassesAttribute0.resolve((ClassConstantPool) null);
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
      InnerClassesAttribute innerClassesAttribute0 = new InnerClassesAttribute("fF}MnwQT");
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      // Undeclared exception!
      try { 
        innerClassesAttribute0.resolve(classConstantPool0);
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
      InnerClassesAttribute innerClassesAttribute0 = new InnerClassesAttribute("");
      DataOutputStream dataOutputStream0 = new DataOutputStream((OutputStream) null);
      // Undeclared exception!
      try { 
        innerClassesAttribute0.doWrite(dataOutputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      InnerClassesAttribute innerClassesAttribute0 = new InnerClassesAttribute("dload_3");
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      DataOutputStream dataOutputStream0 = new DataOutputStream(pipedOutputStream0);
      try { 
        innerClassesAttribute0.doWrite(dataOutputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      InnerClassesAttribute innerClassesAttribute0 = new InnerClassesAttribute("_L'A?bk");
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      classConstantPool0.resolve((Segment) null);
      innerClassesAttribute0.resolve(classConstantPool0);
      assertFalse(innerClassesAttribute0.hasBCIRenumbering());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      InnerClassesAttribute innerClassesAttribute0 = new InnerClassesAttribute("9)pvG9ivmjKmA@B");
      innerClassesAttribute0.hashCode();
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      InnerClassesAttribute innerClassesAttribute0 = new InnerClassesAttribute("cf6gSm%yk]");
      boolean boolean0 = innerClassesAttribute0.equals("cf6gSm%yk]");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      InnerClassesAttribute innerClassesAttribute0 = new InnerClassesAttribute("ifge");
      boolean boolean0 = innerClassesAttribute0.equals(innerClassesAttribute0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      InnerClassesAttribute innerClassesAttribute0 = new InnerClassesAttribute("ifge");
      InnerClassesAttribute innerClassesAttribute1 = new InnerClassesAttribute("InnerClasses: ");
      boolean boolean0 = innerClassesAttribute1.equals(innerClassesAttribute0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      InnerClassesAttribute innerClassesAttribute0 = new InnerClassesAttribute("ifge");
      // Undeclared exception!
      try { 
        innerClassesAttribute0.addInnerClassesEntry((CPClass) null, (CPClass) null, (CPUTF8) null, (byte)12);
       //  fail("Expecting exception: IncompatibleClassChangeError");
       // Unstable assertion
      } catch(IncompatibleClassChangeError e) {
         //
         // Expected non-static field org.apache.commons.compress.harmony.unpack200.bytecode.InnerClassesAttribute.attributeName
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.InnerClassesAttribute", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      InnerClassesAttribute innerClassesAttribute0 = new InnerClassesAttribute("cf6gSm%yk]");
      String string0 = innerClassesAttribute0.toString();
      assertEquals("InnerClasses: null", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      InnerClassesAttribute innerClassesAttribute0 = new InnerClassesAttribute("9)pvG9ivmjKmA@B");
      ClassFileEntry[] classFileEntryArray0 = innerClassesAttribute0.getNestedClassFileEntries();
      assertEquals(1, classFileEntryArray0.length);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      InnerClassesAttribute innerClassesAttribute0 = new InnerClassesAttribute("cf6gSm%yk]");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("cf6gSm%yk]", false);
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockFileOutputStream0);
      innerClassesAttribute0.doWrite(dataOutputStream0);
      assertFalse(innerClassesAttribute0.hasBCIRenumbering());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("J,L>>)* IOTm-");
      InnerClassesAttribute.setAttributeName(cPUTF8_0);
      InnerClassesAttribute innerClassesAttribute0 = new InnerClassesAttribute("J,L>>)* IOTm-");
      innerClassesAttribute0.hashCode();
  }
}
