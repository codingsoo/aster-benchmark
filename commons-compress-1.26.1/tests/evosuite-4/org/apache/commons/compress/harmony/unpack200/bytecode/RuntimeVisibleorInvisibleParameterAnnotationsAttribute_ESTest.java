
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
import java.io.ObjectOutputStream;
import java.io.PipedOutputStream;
import java.util.List;
import org.apache.commons.compress.harmony.unpack200.Segment;
import org.apache.commons.compress.harmony.unpack200.bytecode.AnnotationsAttribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8;
import org.apache.commons.compress.harmony.unpack200.bytecode.ClassConstantPool;
import org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry;
import org.apache.commons.compress.harmony.unpack200.bytecode.RuntimeVisibleorInvisibleParameterAnnotationsAttribute;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class RuntimeVisibleorInvisibleParameterAnnotationsAttribute_ESTest extends RuntimeVisibleorInvisibleParameterAnnotationsAttribute_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8(".)imhLr", (-1));
      RuntimeVisibleorInvisibleParameterAnnotationsAttribute.ParameterAnnotation[] runtimeVisibleorInvisibleParameterAnnotationsAttribute_ParameterAnnotationArray0 = new RuntimeVisibleorInvisibleParameterAnnotationsAttribute.ParameterAnnotation[2];
      RuntimeVisibleorInvisibleParameterAnnotationsAttribute runtimeVisibleorInvisibleParameterAnnotationsAttribute0 = new RuntimeVisibleorInvisibleParameterAnnotationsAttribute(cPUTF8_0, runtimeVisibleorInvisibleParameterAnnotationsAttribute_ParameterAnnotationArray0);
      String string0 = runtimeVisibleorInvisibleParameterAnnotationsAttribute0.toString();
      assertEquals(".)imhLr: 2 parameter annotations", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("");
      RuntimeVisibleorInvisibleParameterAnnotationsAttribute.ParameterAnnotation[] runtimeVisibleorInvisibleParameterAnnotationsAttribute_ParameterAnnotationArray0 = new RuntimeVisibleorInvisibleParameterAnnotationsAttribute.ParameterAnnotation[6];
      RuntimeVisibleorInvisibleParameterAnnotationsAttribute runtimeVisibleorInvisibleParameterAnnotationsAttribute0 = new RuntimeVisibleorInvisibleParameterAnnotationsAttribute(cPUTF8_0, runtimeVisibleorInvisibleParameterAnnotationsAttribute_ParameterAnnotationArray0);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      DataOutputStream dataOutputStream0 = new DataOutputStream(pipedOutputStream0);
      try { 
        runtimeVisibleorInvisibleParameterAnnotationsAttribute0.writeBody(dataOutputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("*NahyQr\"UM/:Hb(", 0);
      RuntimeVisibleorInvisibleParameterAnnotationsAttribute.ParameterAnnotation[] runtimeVisibleorInvisibleParameterAnnotationsAttribute_ParameterAnnotationArray0 = new RuntimeVisibleorInvisibleParameterAnnotationsAttribute.ParameterAnnotation[8];
      RuntimeVisibleorInvisibleParameterAnnotationsAttribute runtimeVisibleorInvisibleParameterAnnotationsAttribute0 = new RuntimeVisibleorInvisibleParameterAnnotationsAttribute(cPUTF8_0, runtimeVisibleorInvisibleParameterAnnotationsAttribute_ParameterAnnotationArray0);
      // Undeclared exception!
      try { 
        runtimeVisibleorInvisibleParameterAnnotationsAttribute0.resolve((ClassConstantPool) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.Attribute", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("", 68);
      RuntimeVisibleorInvisibleParameterAnnotationsAttribute.ParameterAnnotation[] runtimeVisibleorInvisibleParameterAnnotationsAttribute_ParameterAnnotationArray0 = new RuntimeVisibleorInvisibleParameterAnnotationsAttribute.ParameterAnnotation[6];
      AnnotationsAttribute.Annotation[] annotationsAttribute_AnnotationArray0 = new AnnotationsAttribute.Annotation[2];
      CPUTF8[] cPUTF8Array0 = new CPUTF8[3];
      AnnotationsAttribute.ElementValue[] annotationsAttribute_ElementValueArray0 = new AnnotationsAttribute.ElementValue[1];
      Object object0 = new Object();
      AnnotationsAttribute.ElementValue annotationsAttribute_ElementValue0 = new AnnotationsAttribute.ElementValue(2, object0);
      annotationsAttribute_ElementValueArray0[0] = annotationsAttribute_ElementValue0;
      AnnotationsAttribute.Annotation annotationsAttribute_Annotation0 = new AnnotationsAttribute.Annotation((-281), cPUTF8_0, cPUTF8Array0, annotationsAttribute_ElementValueArray0);
      annotationsAttribute_AnnotationArray0[0] = annotationsAttribute_Annotation0;
      RuntimeVisibleorInvisibleParameterAnnotationsAttribute.ParameterAnnotation runtimeVisibleorInvisibleParameterAnnotationsAttribute_ParameterAnnotation0 = new RuntimeVisibleorInvisibleParameterAnnotationsAttribute.ParameterAnnotation(annotationsAttribute_AnnotationArray0);
      runtimeVisibleorInvisibleParameterAnnotationsAttribute_ParameterAnnotationArray0[0] = runtimeVisibleorInvisibleParameterAnnotationsAttribute_ParameterAnnotation0;
      RuntimeVisibleorInvisibleParameterAnnotationsAttribute runtimeVisibleorInvisibleParameterAnnotationsAttribute0 = new RuntimeVisibleorInvisibleParameterAnnotationsAttribute(cPUTF8_0, runtimeVisibleorInvisibleParameterAnnotationsAttribute_ParameterAnnotationArray0);
      // Undeclared exception!
      try { 
        runtimeVisibleorInvisibleParameterAnnotationsAttribute0.getNestedClassFileEntries();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.AnnotationsAttribute$Annotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("HJYT5~$JJ{`]?'CDR_9");
      RuntimeVisibleorInvisibleParameterAnnotationsAttribute.ParameterAnnotation[] runtimeVisibleorInvisibleParameterAnnotationsAttribute_ParameterAnnotationArray0 = new RuntimeVisibleorInvisibleParameterAnnotationsAttribute.ParameterAnnotation[3];
      AnnotationsAttribute.Annotation[] annotationsAttribute_AnnotationArray0 = new AnnotationsAttribute.Annotation[7];
      CPUTF8[] cPUTF8Array0 = new CPUTF8[0];
      AnnotationsAttribute.ElementValue[] annotationsAttribute_ElementValueArray0 = new AnnotationsAttribute.ElementValue[7];
      Object object0 = new Object();
      AnnotationsAttribute.ElementValue annotationsAttribute_ElementValue0 = new AnnotationsAttribute.ElementValue((byte)4, object0);
      annotationsAttribute_ElementValueArray0[0] = annotationsAttribute_ElementValue0;
      annotationsAttribute_ElementValueArray0[1] = annotationsAttribute_ElementValue0;
      annotationsAttribute_ElementValueArray0[2] = annotationsAttribute_ElementValue0;
      annotationsAttribute_ElementValueArray0[3] = annotationsAttribute_ElementValueArray0[1];
      annotationsAttribute_ElementValueArray0[4] = annotationsAttribute_ElementValueArray0[0];
      annotationsAttribute_ElementValueArray0[5] = annotationsAttribute_ElementValueArray0[3];
      annotationsAttribute_ElementValueArray0[6] = annotationsAttribute_ElementValueArray0[2];
      AnnotationsAttribute.Annotation annotationsAttribute_Annotation0 = new AnnotationsAttribute.Annotation(2, cPUTF8_0, cPUTF8Array0, annotationsAttribute_ElementValueArray0);
      annotationsAttribute_AnnotationArray0[0] = annotationsAttribute_Annotation0;
      annotationsAttribute_AnnotationArray0[1] = annotationsAttribute_AnnotationArray0[0];
      AnnotationsAttribute.Annotation annotationsAttribute_Annotation1 = new AnnotationsAttribute.Annotation(38, cPUTF8_0, cPUTF8Array0, annotationsAttribute_ElementValueArray0);
      annotationsAttribute_AnnotationArray0[2] = annotationsAttribute_Annotation1;
      RuntimeVisibleorInvisibleParameterAnnotationsAttribute.ParameterAnnotation runtimeVisibleorInvisibleParameterAnnotationsAttribute_ParameterAnnotation0 = new RuntimeVisibleorInvisibleParameterAnnotationsAttribute.ParameterAnnotation(annotationsAttribute_AnnotationArray0);
      runtimeVisibleorInvisibleParameterAnnotationsAttribute_ParameterAnnotationArray0[0] = runtimeVisibleorInvisibleParameterAnnotationsAttribute_ParameterAnnotation0;
      RuntimeVisibleorInvisibleParameterAnnotationsAttribute runtimeVisibleorInvisibleParameterAnnotationsAttribute0 = new RuntimeVisibleorInvisibleParameterAnnotationsAttribute(cPUTF8_0, runtimeVisibleorInvisibleParameterAnnotationsAttribute_ParameterAnnotationArray0);
      // Undeclared exception!
      try { 
        runtimeVisibleorInvisibleParameterAnnotationsAttribute0.getLength();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 7
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.AnnotationsAttribute$Annotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("");
      RuntimeVisibleorInvisibleParameterAnnotationsAttribute runtimeVisibleorInvisibleParameterAnnotationsAttribute0 = null;
      try {
        runtimeVisibleorInvisibleParameterAnnotationsAttribute0 = new RuntimeVisibleorInvisibleParameterAnnotationsAttribute(cPUTF8_0, (RuntimeVisibleorInvisibleParameterAnnotationsAttribute.ParameterAnnotation[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.RuntimeVisibleorInvisibleParameterAnnotationsAttribute", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      AnnotationsAttribute.Annotation[] annotationsAttribute_AnnotationArray0 = new AnnotationsAttribute.Annotation[9];
      RuntimeVisibleorInvisibleParameterAnnotationsAttribute.ParameterAnnotation runtimeVisibleorInvisibleParameterAnnotationsAttribute_ParameterAnnotation0 = new RuntimeVisibleorInvisibleParameterAnnotationsAttribute.ParameterAnnotation(annotationsAttribute_AnnotationArray0);
      MockPrintStream mockPrintStream0 = new MockPrintStream("\"C9>-Z^JuXKooJ.gzar");
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockPrintStream0);
      // Undeclared exception!
      try { 
        runtimeVisibleorInvisibleParameterAnnotationsAttribute_ParameterAnnotation0.writeBody(dataOutputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.RuntimeVisibleorInvisibleParameterAnnotationsAttribute$ParameterAnnotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      AnnotationsAttribute.Annotation[] annotationsAttribute_AnnotationArray0 = new AnnotationsAttribute.Annotation[3];
      RuntimeVisibleorInvisibleParameterAnnotationsAttribute.ParameterAnnotation runtimeVisibleorInvisibleParameterAnnotationsAttribute_ParameterAnnotation0 = new RuntimeVisibleorInvisibleParameterAnnotationsAttribute.ParameterAnnotation(annotationsAttribute_AnnotationArray0);
      // Undeclared exception!
      try { 
        runtimeVisibleorInvisibleParameterAnnotationsAttribute_ParameterAnnotation0.getLength();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.RuntimeVisibleorInvisibleParameterAnnotationsAttribute$ParameterAnnotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      AnnotationsAttribute.Annotation[] annotationsAttribute_AnnotationArray0 = new AnnotationsAttribute.Annotation[0];
      RuntimeVisibleorInvisibleParameterAnnotationsAttribute.ParameterAnnotation runtimeVisibleorInvisibleParameterAnnotationsAttribute_ParameterAnnotation0 = new RuntimeVisibleorInvisibleParameterAnnotationsAttribute.ParameterAnnotation(annotationsAttribute_AnnotationArray0);
      int int0 = runtimeVisibleorInvisibleParameterAnnotationsAttribute_ParameterAnnotation0.getLength();
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      AnnotationsAttribute.Annotation[] annotationsAttribute_AnnotationArray0 = new AnnotationsAttribute.Annotation[0];
      RuntimeVisibleorInvisibleParameterAnnotationsAttribute.ParameterAnnotation runtimeVisibleorInvisibleParameterAnnotationsAttribute_ParameterAnnotation0 = new RuntimeVisibleorInvisibleParameterAnnotationsAttribute.ParameterAnnotation(annotationsAttribute_AnnotationArray0);
      List<Object> list0 = runtimeVisibleorInvisibleParameterAnnotationsAttribute_ParameterAnnotation0.getClassFileEntries();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      AnnotationsAttribute.Annotation[] annotationsAttribute_AnnotationArray0 = new AnnotationsAttribute.Annotation[1];
      RuntimeVisibleorInvisibleParameterAnnotationsAttribute.ParameterAnnotation runtimeVisibleorInvisibleParameterAnnotationsAttribute_ParameterAnnotation0 = new RuntimeVisibleorInvisibleParameterAnnotationsAttribute.ParameterAnnotation(annotationsAttribute_AnnotationArray0);
      // Undeclared exception!
      try { 
        runtimeVisibleorInvisibleParameterAnnotationsAttribute_ParameterAnnotation0.getClassFileEntries();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.RuntimeVisibleorInvisibleParameterAnnotationsAttribute$ParameterAnnotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("");
      RuntimeVisibleorInvisibleParameterAnnotationsAttribute.ParameterAnnotation[] runtimeVisibleorInvisibleParameterAnnotationsAttribute_ParameterAnnotationArray0 = new RuntimeVisibleorInvisibleParameterAnnotationsAttribute.ParameterAnnotation[3];
      AnnotationsAttribute.Annotation[] annotationsAttribute_AnnotationArray0 = new AnnotationsAttribute.Annotation[0];
      RuntimeVisibleorInvisibleParameterAnnotationsAttribute.ParameterAnnotation runtimeVisibleorInvisibleParameterAnnotationsAttribute_ParameterAnnotation0 = new RuntimeVisibleorInvisibleParameterAnnotationsAttribute.ParameterAnnotation(annotationsAttribute_AnnotationArray0);
      runtimeVisibleorInvisibleParameterAnnotationsAttribute_ParameterAnnotationArray0[0] = runtimeVisibleorInvisibleParameterAnnotationsAttribute_ParameterAnnotation0;
      runtimeVisibleorInvisibleParameterAnnotationsAttribute_ParameterAnnotationArray0[1] = runtimeVisibleorInvisibleParameterAnnotationsAttribute_ParameterAnnotation0;
      MockFile mockFile0 = new MockFile("", " parameter annotations");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockPrintStream0);
      runtimeVisibleorInvisibleParameterAnnotationsAttribute_ParameterAnnotationArray0[2] = runtimeVisibleorInvisibleParameterAnnotationsAttribute_ParameterAnnotationArray0[1];
      RuntimeVisibleorInvisibleParameterAnnotationsAttribute runtimeVisibleorInvisibleParameterAnnotationsAttribute0 = new RuntimeVisibleorInvisibleParameterAnnotationsAttribute(cPUTF8_0, runtimeVisibleorInvisibleParameterAnnotationsAttribute_ParameterAnnotationArray0);
      runtimeVisibleorInvisibleParameterAnnotationsAttribute0.writeBody(dataOutputStream0);
      assertEquals(7L, mockFile0.length());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      CPUTF8 cPUTF8_0 = new CPUTF8("%z iuM");
      RuntimeVisibleorInvisibleParameterAnnotationsAttribute.ParameterAnnotation[] runtimeVisibleorInvisibleParameterAnnotationsAttribute_ParameterAnnotationArray0 = new RuntimeVisibleorInvisibleParameterAnnotationsAttribute.ParameterAnnotation[0];
      RuntimeVisibleorInvisibleParameterAnnotationsAttribute runtimeVisibleorInvisibleParameterAnnotationsAttribute0 = new RuntimeVisibleorInvisibleParameterAnnotationsAttribute(cPUTF8_0, runtimeVisibleorInvisibleParameterAnnotationsAttribute_ParameterAnnotationArray0);
      classConstantPool0.resolve((Segment) null);
      runtimeVisibleorInvisibleParameterAnnotationsAttribute0.resolve(classConstantPool0);
      assertFalse(runtimeVisibleorInvisibleParameterAnnotationsAttribute0.isSourceFileAttribute());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("");
      RuntimeVisibleorInvisibleParameterAnnotationsAttribute.ParameterAnnotation[] runtimeVisibleorInvisibleParameterAnnotationsAttribute_ParameterAnnotationArray0 = new RuntimeVisibleorInvisibleParameterAnnotationsAttribute.ParameterAnnotation[3];
      AnnotationsAttribute.Annotation[] annotationsAttribute_AnnotationArray0 = new AnnotationsAttribute.Annotation[0];
      RuntimeVisibleorInvisibleParameterAnnotationsAttribute.ParameterAnnotation runtimeVisibleorInvisibleParameterAnnotationsAttribute_ParameterAnnotation0 = new RuntimeVisibleorInvisibleParameterAnnotationsAttribute.ParameterAnnotation(annotationsAttribute_AnnotationArray0);
      runtimeVisibleorInvisibleParameterAnnotationsAttribute_ParameterAnnotationArray0[0] = runtimeVisibleorInvisibleParameterAnnotationsAttribute_ParameterAnnotation0;
      runtimeVisibleorInvisibleParameterAnnotationsAttribute_ParameterAnnotationArray0[1] = runtimeVisibleorInvisibleParameterAnnotationsAttribute_ParameterAnnotation0;
      runtimeVisibleorInvisibleParameterAnnotationsAttribute_ParameterAnnotationArray0[2] = runtimeVisibleorInvisibleParameterAnnotationsAttribute_ParameterAnnotation0;
      RuntimeVisibleorInvisibleParameterAnnotationsAttribute runtimeVisibleorInvisibleParameterAnnotationsAttribute0 = new RuntimeVisibleorInvisibleParameterAnnotationsAttribute(cPUTF8_0, runtimeVisibleorInvisibleParameterAnnotationsAttribute_ParameterAnnotationArray0);
      ClassFileEntry[] classFileEntryArray0 = runtimeVisibleorInvisibleParameterAnnotationsAttribute0.getNestedClassFileEntries();
      assertEquals(1, classFileEntryArray0.length);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("");
      RuntimeVisibleorInvisibleParameterAnnotationsAttribute.ParameterAnnotation[] runtimeVisibleorInvisibleParameterAnnotationsAttribute_ParameterAnnotationArray0 = new RuntimeVisibleorInvisibleParameterAnnotationsAttribute.ParameterAnnotation[3];
      AnnotationsAttribute.Annotation[] annotationsAttribute_AnnotationArray0 = new AnnotationsAttribute.Annotation[0];
      RuntimeVisibleorInvisibleParameterAnnotationsAttribute.ParameterAnnotation runtimeVisibleorInvisibleParameterAnnotationsAttribute_ParameterAnnotation0 = new RuntimeVisibleorInvisibleParameterAnnotationsAttribute.ParameterAnnotation(annotationsAttribute_AnnotationArray0);
      runtimeVisibleorInvisibleParameterAnnotationsAttribute_ParameterAnnotationArray0[0] = runtimeVisibleorInvisibleParameterAnnotationsAttribute_ParameterAnnotation0;
      runtimeVisibleorInvisibleParameterAnnotationsAttribute_ParameterAnnotationArray0[1] = runtimeVisibleorInvisibleParameterAnnotationsAttribute_ParameterAnnotationArray0[0];
      runtimeVisibleorInvisibleParameterAnnotationsAttribute_ParameterAnnotationArray0[2] = runtimeVisibleorInvisibleParameterAnnotationsAttribute_ParameterAnnotationArray0[1];
      RuntimeVisibleorInvisibleParameterAnnotationsAttribute runtimeVisibleorInvisibleParameterAnnotationsAttribute0 = new RuntimeVisibleorInvisibleParameterAnnotationsAttribute(cPUTF8_0, runtimeVisibleorInvisibleParameterAnnotationsAttribute_ParameterAnnotationArray0);
      int int0 = runtimeVisibleorInvisibleParameterAnnotationsAttribute0.getLength();
      assertEquals(7, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("lneg", 777);
      RuntimeVisibleorInvisibleParameterAnnotationsAttribute.ParameterAnnotation[] runtimeVisibleorInvisibleParameterAnnotationsAttribute_ParameterAnnotationArray0 = new RuntimeVisibleorInvisibleParameterAnnotationsAttribute.ParameterAnnotation[5];
      AnnotationsAttribute.Annotation[] annotationsAttribute_AnnotationArray0 = new AnnotationsAttribute.Annotation[3];
      RuntimeVisibleorInvisibleParameterAnnotationsAttribute.ParameterAnnotation runtimeVisibleorInvisibleParameterAnnotationsAttribute_ParameterAnnotation0 = new RuntimeVisibleorInvisibleParameterAnnotationsAttribute.ParameterAnnotation(annotationsAttribute_AnnotationArray0);
      runtimeVisibleorInvisibleParameterAnnotationsAttribute_ParameterAnnotationArray0[0] = runtimeVisibleorInvisibleParameterAnnotationsAttribute_ParameterAnnotation0;
      RuntimeVisibleorInvisibleParameterAnnotationsAttribute runtimeVisibleorInvisibleParameterAnnotationsAttribute0 = new RuntimeVisibleorInvisibleParameterAnnotationsAttribute(cPUTF8_0, runtimeVisibleorInvisibleParameterAnnotationsAttribute_ParameterAnnotationArray0);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("lneg");
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream(mockFileOutputStream0);
      DataOutputStream dataOutputStream0 = new DataOutputStream(objectOutputStream0);
      // Undeclared exception!
      try { 
        runtimeVisibleorInvisibleParameterAnnotationsAttribute0.writeBody(dataOutputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.RuntimeVisibleorInvisibleParameterAnnotationsAttribute$ParameterAnnotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      AnnotationsAttribute.Annotation[] annotationsAttribute_AnnotationArray0 = new AnnotationsAttribute.Annotation[0];
      RuntimeVisibleorInvisibleParameterAnnotationsAttribute.ParameterAnnotation runtimeVisibleorInvisibleParameterAnnotationsAttribute_ParameterAnnotation0 = new RuntimeVisibleorInvisibleParameterAnnotationsAttribute.ParameterAnnotation(annotationsAttribute_AnnotationArray0);
      MockFile mockFile0 = new MockFile("", " parameter annotations");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockPrintStream0);
      runtimeVisibleorInvisibleParameterAnnotationsAttribute_ParameterAnnotation0.writeBody(dataOutputStream0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      AnnotationsAttribute.Annotation[] annotationsAttribute_AnnotationArray0 = new AnnotationsAttribute.Annotation[3];
      RuntimeVisibleorInvisibleParameterAnnotationsAttribute.ParameterAnnotation runtimeVisibleorInvisibleParameterAnnotationsAttribute_ParameterAnnotation0 = new RuntimeVisibleorInvisibleParameterAnnotationsAttribute.ParameterAnnotation(annotationsAttribute_AnnotationArray0);
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      // Undeclared exception!
      try { 
        runtimeVisibleorInvisibleParameterAnnotationsAttribute_ParameterAnnotation0.resolve(classConstantPool0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.RuntimeVisibleorInvisibleParameterAnnotationsAttribute$ParameterAnnotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      AnnotationsAttribute.Annotation[] annotationsAttribute_AnnotationArray0 = new AnnotationsAttribute.Annotation[0];
      RuntimeVisibleorInvisibleParameterAnnotationsAttribute.ParameterAnnotation runtimeVisibleorInvisibleParameterAnnotationsAttribute_ParameterAnnotation0 = new RuntimeVisibleorInvisibleParameterAnnotationsAttribute.ParameterAnnotation(annotationsAttribute_AnnotationArray0);
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      runtimeVisibleorInvisibleParameterAnnotationsAttribute_ParameterAnnotation0.resolve(classConstantPool0);
      assertEquals(0, classConstantPool0.size());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("HJYT5~$JJ{`]?'CDR_9");
      RuntimeVisibleorInvisibleParameterAnnotationsAttribute.ParameterAnnotation[] runtimeVisibleorInvisibleParameterAnnotationsAttribute_ParameterAnnotationArray0 = new RuntimeVisibleorInvisibleParameterAnnotationsAttribute.ParameterAnnotation[3];
      AnnotationsAttribute.Annotation[] annotationsAttribute_AnnotationArray0 = new AnnotationsAttribute.Annotation[7];
      RuntimeVisibleorInvisibleParameterAnnotationsAttribute.ParameterAnnotation runtimeVisibleorInvisibleParameterAnnotationsAttribute_ParameterAnnotation0 = new RuntimeVisibleorInvisibleParameterAnnotationsAttribute.ParameterAnnotation(annotationsAttribute_AnnotationArray0);
      runtimeVisibleorInvisibleParameterAnnotationsAttribute_ParameterAnnotationArray0[0] = runtimeVisibleorInvisibleParameterAnnotationsAttribute_ParameterAnnotation0;
      RuntimeVisibleorInvisibleParameterAnnotationsAttribute runtimeVisibleorInvisibleParameterAnnotationsAttribute0 = new RuntimeVisibleorInvisibleParameterAnnotationsAttribute(cPUTF8_0, runtimeVisibleorInvisibleParameterAnnotationsAttribute_ParameterAnnotationArray0);
      // Undeclared exception!
      try { 
        runtimeVisibleorInvisibleParameterAnnotationsAttribute0.getLength();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.RuntimeVisibleorInvisibleParameterAnnotationsAttribute$ParameterAnnotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("?PxRg1bqFGd&'");
      RuntimeVisibleorInvisibleParameterAnnotationsAttribute.ParameterAnnotation[] runtimeVisibleorInvisibleParameterAnnotationsAttribute_ParameterAnnotationArray0 = new RuntimeVisibleorInvisibleParameterAnnotationsAttribute.ParameterAnnotation[4];
      AnnotationsAttribute.Annotation[] annotationsAttribute_AnnotationArray0 = new AnnotationsAttribute.Annotation[3];
      RuntimeVisibleorInvisibleParameterAnnotationsAttribute.ParameterAnnotation runtimeVisibleorInvisibleParameterAnnotationsAttribute_ParameterAnnotation0 = new RuntimeVisibleorInvisibleParameterAnnotationsAttribute.ParameterAnnotation(annotationsAttribute_AnnotationArray0);
      runtimeVisibleorInvisibleParameterAnnotationsAttribute_ParameterAnnotationArray0[0] = runtimeVisibleorInvisibleParameterAnnotationsAttribute_ParameterAnnotation0;
      RuntimeVisibleorInvisibleParameterAnnotationsAttribute runtimeVisibleorInvisibleParameterAnnotationsAttribute0 = new RuntimeVisibleorInvisibleParameterAnnotationsAttribute(cPUTF8_0, runtimeVisibleorInvisibleParameterAnnotationsAttribute_ParameterAnnotationArray0);
      // Undeclared exception!
      try { 
        runtimeVisibleorInvisibleParameterAnnotationsAttribute0.getNestedClassFileEntries();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.RuntimeVisibleorInvisibleParameterAnnotationsAttribute$ParameterAnnotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      RuntimeVisibleorInvisibleParameterAnnotationsAttribute.ParameterAnnotation[] runtimeVisibleorInvisibleParameterAnnotationsAttribute_ParameterAnnotationArray0 = new RuntimeVisibleorInvisibleParameterAnnotationsAttribute.ParameterAnnotation[0];
      RuntimeVisibleorInvisibleParameterAnnotationsAttribute runtimeVisibleorInvisibleParameterAnnotationsAttribute0 = new RuntimeVisibleorInvisibleParameterAnnotationsAttribute((CPUTF8) null, runtimeVisibleorInvisibleParameterAnnotationsAttribute_ParameterAnnotationArray0);
      // Undeclared exception!
      try { 
        runtimeVisibleorInvisibleParameterAnnotationsAttribute0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.RuntimeVisibleorInvisibleParameterAnnotationsAttribute", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("");
      RuntimeVisibleorInvisibleParameterAnnotationsAttribute.ParameterAnnotation[] runtimeVisibleorInvisibleParameterAnnotationsAttribute_ParameterAnnotationArray0 = new RuntimeVisibleorInvisibleParameterAnnotationsAttribute.ParameterAnnotation[3];
      RuntimeVisibleorInvisibleParameterAnnotationsAttribute runtimeVisibleorInvisibleParameterAnnotationsAttribute0 = new RuntimeVisibleorInvisibleParameterAnnotationsAttribute(cPUTF8_0, runtimeVisibleorInvisibleParameterAnnotationsAttribute_ParameterAnnotationArray0);
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      // Undeclared exception!
      try { 
        runtimeVisibleorInvisibleParameterAnnotationsAttribute0.resolve(classConstantPool0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Constant pool is not yet resolved; this does not make any sense
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ClassConstantPool", e);
      }
  }
}
