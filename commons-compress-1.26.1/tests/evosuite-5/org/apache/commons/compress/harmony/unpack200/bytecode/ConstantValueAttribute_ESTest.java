
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
import java.util.LinkedList;
import org.apache.commons.compress.harmony.unpack200.Segment;
import org.apache.commons.compress.harmony.unpack200.bytecode.AnnotationsAttribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.Attribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPClass;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPMethod;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPString;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8;
import org.apache.commons.compress.harmony.unpack200.bytecode.ClassConstantPool;
import org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry;
import org.apache.commons.compress.harmony.unpack200.bytecode.ConstantValueAttribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.InnerClassesAttribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.NewAttribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.RuntimeVisibleorInvisibleAnnotationsAttribute;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class ConstantValueAttribute_ESTest extends ConstantValueAttribute_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8(">O6s\"", 0);
      ConstantValueAttribute constantValueAttribute0 = new ConstantValueAttribute(cPUTF8_0);
      MockFile mockFile0 = new MockFile(">O6s\"");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockPrintStream0);
      constantValueAttribute0.writeBody(dataOutputStream0);
      assertFalse(constantValueAttribute0.isSourceFileAttribute());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      InnerClassesAttribute innerClassesAttribute0 = new InnerClassesAttribute(".bN~Q%(tI>L-'7");
      ConstantValueAttribute constantValueAttribute0 = new ConstantValueAttribute(innerClassesAttribute0);
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      classConstantPool0.resolve((Segment) null);
      constantValueAttribute0.resolve(classConstantPool0);
      assertFalse(constantValueAttribute0.isSourceFileAttribute());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("");
      AnnotationsAttribute.Annotation[] annotationsAttribute_AnnotationArray0 = new AnnotationsAttribute.Annotation[0];
      RuntimeVisibleorInvisibleAnnotationsAttribute runtimeVisibleorInvisibleAnnotationsAttribute0 = new RuntimeVisibleorInvisibleAnnotationsAttribute(cPUTF8_0, annotationsAttribute_AnnotationArray0);
      ConstantValueAttribute constantValueAttribute0 = new ConstantValueAttribute(runtimeVisibleorInvisibleAnnotationsAttribute0);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("org.apache.commons.compress.harmony.unpack200.bytecode.RuntimeVisibleorInvisibleParameterAnnotationsAttribute$ParameterAnnotation");
      mockFileOutputStream0.close();
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockFileOutputStream0);
      try { 
        constantValueAttribute0.writeBody(dataOutputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      NewAttribute newAttribute0 = new NewAttribute((CPUTF8) null, 667);
      ConstantValueAttribute constantValueAttribute0 = new ConstantValueAttribute(newAttribute0);
      // Undeclared exception!
      try { 
        constantValueAttribute0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.NewAttribute", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("");
      CPString cPString0 = new CPString(cPUTF8_0, (byte)11);
      ConstantValueAttribute constantValueAttribute0 = new ConstantValueAttribute(cPString0);
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
  public void test05()  throws Throwable  {
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
  public void test06()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("", 0);
      ConstantValueAttribute constantValueAttribute0 = new ConstantValueAttribute(cPUTF8_0);
      constantValueAttribute0.hashCode();
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("T");
      LinkedList<Attribute> linkedList0 = new LinkedList<Attribute>();
      CPMethod cPMethod0 = new CPMethod(cPUTF8_0, cPUTF8_0, (byte)11, linkedList0);
      ConstantValueAttribute constantValueAttribute0 = new ConstantValueAttribute(cPMethod0);
      ConstantValueAttribute constantValueAttribute1 = new ConstantValueAttribute(cPMethod0);
      boolean boolean0 = constantValueAttribute0.equals(constantValueAttribute1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("");
      CPString cPString0 = new CPString(cPUTF8_0, (byte)11);
      ConstantValueAttribute constantValueAttribute0 = new ConstantValueAttribute(cPString0);
      ConstantValueAttribute constantValueAttribute1 = new ConstantValueAttribute(constantValueAttribute0);
      boolean boolean0 = constantValueAttribute0.equals(constantValueAttribute1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("");
      LinkedList<Attribute> linkedList0 = new LinkedList<Attribute>();
      CPMethod cPMethod0 = new CPMethod(cPUTF8_0, cPUTF8_0, (byte)11, linkedList0);
      ConstantValueAttribute constantValueAttribute0 = new ConstantValueAttribute(cPMethod0);
      boolean boolean0 = constantValueAttribute0.equals(constantValueAttribute0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("", 0);
      ConstantValueAttribute constantValueAttribute0 = new ConstantValueAttribute(cPUTF8_0);
      boolean boolean0 = constantValueAttribute0.equals("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("", 0);
      ConstantValueAttribute constantValueAttribute0 = new ConstantValueAttribute(cPUTF8_0);
      String string0 = constantValueAttribute0.toString();
      assertEquals("Constant:UTF-8:", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("", 0);
      ConstantValueAttribute constantValueAttribute0 = new ConstantValueAttribute(cPUTF8_0);
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
  public void test13()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("");
      LinkedList<Attribute> linkedList0 = new LinkedList<Attribute>();
      CPMethod cPMethod0 = new CPMethod(cPUTF8_0, cPUTF8_0, (byte)11, linkedList0);
      ConstantValueAttribute constantValueAttribute0 = new ConstantValueAttribute(cPMethod0);
      int int0 = constantValueAttribute0.getLength();
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("vI4");
      CPClass cPClass0 = new CPClass(cPUTF8_0, (byte)8);
      ConstantValueAttribute constantValueAttribute0 = new ConstantValueAttribute(cPClass0);
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
  public void test15()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("", 0);
      ConstantValueAttribute constantValueAttribute0 = new ConstantValueAttribute(cPUTF8_0);
      ClassFileEntry[] classFileEntryArray0 = constantValueAttribute0.getNestedClassFileEntries();
      assertEquals(2, classFileEntryArray0.length);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("");
      ConstantValueAttribute.setAttributeName(cPUTF8_0);
      ConstantValueAttribute constantValueAttribute0 = new ConstantValueAttribute(cPUTF8_0);
      constantValueAttribute0.hashCode();
  }
}
