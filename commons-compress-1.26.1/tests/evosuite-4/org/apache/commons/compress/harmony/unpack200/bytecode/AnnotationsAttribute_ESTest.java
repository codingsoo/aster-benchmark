
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
import java.io.FilterOutputStream;
import java.util.List;
import org.apache.commons.compress.harmony.unpack200.Segment;
import org.apache.commons.compress.harmony.unpack200.bytecode.AnnotationDefaultAttribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.AnnotationsAttribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8;
import org.apache.commons.compress.harmony.unpack200.bytecode.ClassConstantPool;
import org.apache.commons.compress.harmony.unpack200.bytecode.RuntimeVisibleorInvisibleAnnotationsAttribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.RuntimeVisibleorInvisibleParameterAnnotationsAttribute;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class AnnotationsAttribute_ESTest extends AnnotationsAttribute_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("");
      CPUTF8[] cPUTF8Array0 = new CPUTF8[2];
      AnnotationsAttribute.ElementValue[] annotationsAttribute_ElementValueArray0 = new AnnotationsAttribute.ElementValue[19];
      AnnotationsAttribute.Annotation annotationsAttribute_Annotation0 = new AnnotationsAttribute.Annotation((-1), cPUTF8_0, cPUTF8Array0, annotationsAttribute_ElementValueArray0);
      int int0 = annotationsAttribute_Annotation0.getLength();
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      AnnotationsAttribute.ElementValue annotationsAttribute_ElementValue0 = new AnnotationsAttribute.ElementValue(3131, (Object) null);
      CPUTF8 cPUTF8_0 = new CPUTF8("");
      CPUTF8[] cPUTF8Array0 = new CPUTF8[1];
      AnnotationsAttribute.ElementValue[] annotationsAttribute_ElementValueArray0 = new AnnotationsAttribute.ElementValue[8];
      annotationsAttribute_ElementValueArray0[0] = annotationsAttribute_ElementValue0;
      AnnotationsAttribute.Annotation annotationsAttribute_Annotation0 = new AnnotationsAttribute.Annotation(3131, cPUTF8_0, cPUTF8Array0, annotationsAttribute_ElementValueArray0);
      List<Object> list0 = annotationsAttribute_Annotation0.getClassFileEntries();
      assertEquals(2, list0.size());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Integer integer0 = new Integer((-726));
      AnnotationsAttribute.ElementValue annotationsAttribute_ElementValue0 = new AnnotationsAttribute.ElementValue((-1387), integer0);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("i,V>/e$^F*?M[m=W0", true);
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockFileOutputStream0);
      // Undeclared exception!
      try { 
        annotationsAttribute_ElementValue0.writeBody(dataOutputStream0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // 
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.AnnotationsAttribute$ElementValue", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("u(r@4I2nB,6", 0);
      CPUTF8[] cPUTF8Array0 = new CPUTF8[7];
      AnnotationsAttribute.ElementValue[] annotationsAttribute_ElementValueArray0 = new AnnotationsAttribute.ElementValue[2];
      AnnotationsAttribute.Annotation annotationsAttribute_Annotation0 = new AnnotationsAttribute.Annotation(0, cPUTF8_0, cPUTF8Array0, annotationsAttribute_ElementValueArray0);
      MockFile mockFile0 = new MockFile("u(r@4I2nB,6");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockPrintStream0);
      annotationsAttribute_Annotation0.writeBody(dataOutputStream0);
      assertEquals(4, annotationsAttribute_Annotation0.getLength());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8(":Xg");
      CPUTF8[] cPUTF8Array0 = new CPUTF8[2];
      AnnotationsAttribute.ElementValue[] annotationsAttribute_ElementValueArray0 = new AnnotationsAttribute.ElementValue[0];
      AnnotationsAttribute.Annotation annotationsAttribute_Annotation0 = new AnnotationsAttribute.Annotation(122, cPUTF8_0, cPUTF8Array0, annotationsAttribute_ElementValueArray0);
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      // Undeclared exception!
      try { 
        annotationsAttribute_Annotation0.resolve(classConstantPool0);
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
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      classConstantPool0.resolve((Segment) null);
      CPUTF8 cPUTF8_0 = new CPUTF8("");
      RuntimeVisibleorInvisibleParameterAnnotationsAttribute.ParameterAnnotation[] runtimeVisibleorInvisibleParameterAnnotationsAttribute_ParameterAnnotationArray0 = new RuntimeVisibleorInvisibleParameterAnnotationsAttribute.ParameterAnnotation[9];
      AnnotationsAttribute.Annotation[] annotationsAttribute_AnnotationArray0 = new AnnotationsAttribute.Annotation[3];
      CPUTF8[] cPUTF8Array0 = new CPUTF8[4];
      cPUTF8Array0[0] = cPUTF8_0;
      AnnotationsAttribute.Annotation annotationsAttribute_Annotation0 = new AnnotationsAttribute.Annotation((byte)11, cPUTF8_0, cPUTF8Array0, (AnnotationsAttribute.ElementValue[]) null);
      annotationsAttribute_AnnotationArray0[0] = annotationsAttribute_Annotation0;
      RuntimeVisibleorInvisibleParameterAnnotationsAttribute.ParameterAnnotation runtimeVisibleorInvisibleParameterAnnotationsAttribute_ParameterAnnotation0 = new RuntimeVisibleorInvisibleParameterAnnotationsAttribute.ParameterAnnotation(annotationsAttribute_AnnotationArray0);
      runtimeVisibleorInvisibleParameterAnnotationsAttribute_ParameterAnnotationArray0[0] = runtimeVisibleorInvisibleParameterAnnotationsAttribute_ParameterAnnotation0;
      RuntimeVisibleorInvisibleParameterAnnotationsAttribute runtimeVisibleorInvisibleParameterAnnotationsAttribute0 = new RuntimeVisibleorInvisibleParameterAnnotationsAttribute(cPUTF8_0, runtimeVisibleorInvisibleParameterAnnotationsAttribute_ParameterAnnotationArray0);
      // Undeclared exception!
      try { 
        runtimeVisibleorInvisibleParameterAnnotationsAttribute0.resolve(classConstantPool0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.AnnotationsAttribute$Annotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("=dO.Y");
      AnnotationsAttribute.ElementValue[] annotationsAttribute_ElementValueArray0 = new AnnotationsAttribute.ElementValue[6];
      AnnotationsAttribute.ElementValue annotationsAttribute_ElementValue0 = new AnnotationsAttribute.ElementValue(3130, cPUTF8_0);
      annotationsAttribute_ElementValueArray0[0] = annotationsAttribute_ElementValue0;
      annotationsAttribute_ElementValueArray0[4] = annotationsAttribute_ElementValueArray0[0];
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      // Undeclared exception!
      try { 
        annotationsAttribute_ElementValueArray0[4].resolve(classConstantPool0);
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
      Object object0 = new Object();
      AnnotationsAttribute.ElementValue annotationsAttribute_ElementValue0 = new AnnotationsAttribute.ElementValue(4642, object0);
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      annotationsAttribute_ElementValue0.resolve(classConstantPool0);
      assertEquals(0, classConstantPool0.size());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("]w");
      RuntimeVisibleorInvisibleParameterAnnotationsAttribute.ParameterAnnotation[] runtimeVisibleorInvisibleParameterAnnotationsAttribute_ParameterAnnotationArray0 = new RuntimeVisibleorInvisibleParameterAnnotationsAttribute.ParameterAnnotation[6];
      AnnotationsAttribute.Annotation[] annotationsAttribute_AnnotationArray0 = new AnnotationsAttribute.Annotation[8];
      CPUTF8[] cPUTF8Array0 = new CPUTF8[4];
      AnnotationsAttribute.ElementValue[] annotationsAttribute_ElementValueArray0 = new AnnotationsAttribute.ElementValue[9];
      AnnotationsAttribute.ElementValue annotationsAttribute_ElementValue0 = new AnnotationsAttribute.ElementValue(98, (Object) null);
      annotationsAttribute_ElementValueArray0[0] = annotationsAttribute_ElementValue0;
      AnnotationsAttribute.ElementValue annotationsAttribute_ElementValue1 = new AnnotationsAttribute.ElementValue(114, annotationsAttribute_ElementValue0);
      annotationsAttribute_ElementValueArray0[1] = annotationsAttribute_ElementValue1;
      AnnotationsAttribute.Annotation annotationsAttribute_Annotation0 = new AnnotationsAttribute.Annotation(897, cPUTF8_0, cPUTF8Array0, annotationsAttribute_ElementValueArray0);
      annotationsAttribute_AnnotationArray0[0] = annotationsAttribute_Annotation0;
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
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Object object0 = new Object();
      CPUTF8[] cPUTF8Array0 = new CPUTF8[1];
      AnnotationsAttribute.ElementValue[] annotationsAttribute_ElementValueArray0 = new AnnotationsAttribute.ElementValue[8];
      AnnotationsAttribute.ElementValue annotationsAttribute_ElementValue0 = new AnnotationsAttribute.ElementValue(113, object0);
      annotationsAttribute_ElementValueArray0[0] = annotationsAttribute_ElementValue0;
      AnnotationsAttribute.Annotation annotationsAttribute_Annotation0 = new AnnotationsAttribute.Annotation(92, (CPUTF8) null, cPUTF8Array0, annotationsAttribute_ElementValueArray0);
      // Undeclared exception!
      try { 
        annotationsAttribute_Annotation0.getLength();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("ldc_w");
      CPUTF8[] cPUTF8Array0 = new CPUTF8[5];
      AnnotationsAttribute.ElementValue[] annotationsAttribute_ElementValueArray0 = new AnnotationsAttribute.ElementValue[9];
      Object object0 = new Object();
      AnnotationsAttribute.ElementValue annotationsAttribute_ElementValue0 = new AnnotationsAttribute.ElementValue((byte)8, object0);
      annotationsAttribute_ElementValueArray0[0] = annotationsAttribute_ElementValue0;
      annotationsAttribute_ElementValueArray0[1] = annotationsAttribute_ElementValueArray0[0];
      annotationsAttribute_ElementValueArray0[2] = annotationsAttribute_ElementValueArray0[0];
      annotationsAttribute_ElementValueArray0[3] = annotationsAttribute_ElementValueArray0[1];
      annotationsAttribute_ElementValueArray0[4] = annotationsAttribute_ElementValue0;
      annotationsAttribute_ElementValueArray0[5] = annotationsAttribute_ElementValueArray0[0];
      AnnotationsAttribute.ElementValue annotationsAttribute_ElementValue1 = new AnnotationsAttribute.ElementValue(112, object0);
      annotationsAttribute_ElementValueArray0[6] = annotationsAttribute_ElementValue1;
      AnnotationsAttribute.Annotation annotationsAttribute_Annotation0 = new AnnotationsAttribute.Annotation(112, cPUTF8_0, cPUTF8Array0, annotationsAttribute_ElementValueArray0);
      // Undeclared exception!
      try { 
        annotationsAttribute_Annotation0.getLength();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      AnnotationsAttribute.Annotation[] annotationsAttribute_AnnotationArray0 = new AnnotationsAttribute.Annotation[9];
      CPUTF8[] cPUTF8Array0 = new CPUTF8[3];
      AnnotationsAttribute.ElementValue[] annotationsAttribute_ElementValueArray0 = new AnnotationsAttribute.ElementValue[9];
      Integer integer0 = Integer.getInteger("^<init>.*", 6);
      AnnotationsAttribute.ElementValue annotationsAttribute_ElementValue0 = new AnnotationsAttribute.ElementValue(1, integer0);
      annotationsAttribute_ElementValueArray0[0] = annotationsAttribute_ElementValue0;
      annotationsAttribute_ElementValueArray0[1] = annotationsAttribute_ElementValue0;
      annotationsAttribute_ElementValueArray0[2] = annotationsAttribute_ElementValue0;
      AnnotationsAttribute.ElementValue annotationsAttribute_ElementValue1 = new AnnotationsAttribute.ElementValue(110, (Object) null);
      annotationsAttribute_ElementValueArray0[3] = annotationsAttribute_ElementValue1;
      AnnotationsAttribute.Annotation annotationsAttribute_Annotation0 = new AnnotationsAttribute.Annotation(110, (CPUTF8) null, cPUTF8Array0, annotationsAttribute_ElementValueArray0);
      annotationsAttribute_AnnotationArray0[0] = annotationsAttribute_Annotation0;
      RuntimeVisibleorInvisibleAnnotationsAttribute runtimeVisibleorInvisibleAnnotationsAttribute0 = new RuntimeVisibleorInvisibleAnnotationsAttribute((CPUTF8) null, annotationsAttribute_AnnotationArray0);
      // Undeclared exception!
      try { 
        runtimeVisibleorInvisibleAnnotationsAttribute0.getLength();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Integer integer0 = new Integer((byte)7);
      AnnotationsAttribute.ElementValue annotationsAttribute_ElementValue0 = new AnnotationsAttribute.ElementValue(108, integer0);
      int int0 = annotationsAttribute_ElementValue0.getLength();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Object object0 = new Object();
      AnnotationsAttribute.ElementValue annotationsAttribute_ElementValue0 = new AnnotationsAttribute.ElementValue(105, object0);
      AnnotationDefaultAttribute annotationDefaultAttribute0 = new AnnotationDefaultAttribute(annotationsAttribute_ElementValue0);
      int int0 = annotationDefaultAttribute0.getLength();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("org.apache.commons.compress.harmony.unpack200.bytecode.AnnotationsAttribute$ElementValue", 1602);
      RuntimeVisibleorInvisibleParameterAnnotationsAttribute.ParameterAnnotation[] runtimeVisibleorInvisibleParameterAnnotationsAttribute_ParameterAnnotationArray0 = new RuntimeVisibleorInvisibleParameterAnnotationsAttribute.ParameterAnnotation[9];
      AnnotationsAttribute.Annotation[] annotationsAttribute_AnnotationArray0 = new AnnotationsAttribute.Annotation[2];
      CPUTF8[] cPUTF8Array0 = new CPUTF8[4];
      AnnotationsAttribute.ElementValue[] annotationsAttribute_ElementValueArray0 = new AnnotationsAttribute.ElementValue[7];
      AnnotationsAttribute.ElementValue annotationsAttribute_ElementValue0 = new AnnotationsAttribute.ElementValue(103, cPUTF8_0);
      annotationsAttribute_ElementValueArray0[0] = annotationsAttribute_ElementValue0;
      AnnotationsAttribute.Annotation annotationsAttribute_Annotation0 = new AnnotationsAttribute.Annotation(115, cPUTF8_0, cPUTF8Array0, annotationsAttribute_ElementValueArray0);
      annotationsAttribute_AnnotationArray0[0] = annotationsAttribute_Annotation0;
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
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("ldc_w", 102);
      CPUTF8[] cPUTF8Array0 = new CPUTF8[5];
      AnnotationsAttribute.ElementValue[] annotationsAttribute_ElementValueArray0 = new AnnotationsAttribute.ElementValue[9];
      Object object0 = new Object();
      AnnotationsAttribute.ElementValue annotationsAttribute_ElementValue0 = new AnnotationsAttribute.ElementValue((byte)8, object0);
      annotationsAttribute_ElementValueArray0[0] = annotationsAttribute_ElementValue0;
      annotationsAttribute_ElementValueArray0[1] = annotationsAttribute_ElementValue0;
      annotationsAttribute_ElementValueArray0[2] = annotationsAttribute_ElementValueArray0[0];
      annotationsAttribute_ElementValueArray0[3] = annotationsAttribute_ElementValue0;
      annotationsAttribute_ElementValueArray0[4] = annotationsAttribute_ElementValue0;
      annotationsAttribute_ElementValueArray0[5] = annotationsAttribute_ElementValue0;
      AnnotationsAttribute.ElementValue annotationsAttribute_ElementValue1 = new AnnotationsAttribute.ElementValue(102, object0);
      annotationsAttribute_ElementValueArray0[6] = annotationsAttribute_ElementValue1;
      AnnotationsAttribute.Annotation annotationsAttribute_Annotation0 = new AnnotationsAttribute.Annotation(102, cPUTF8_0, cPUTF8Array0, annotationsAttribute_ElementValueArray0);
      // Undeclared exception!
      try { 
        annotationsAttribute_Annotation0.getLength();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Object object0 = new Object();
      AnnotationsAttribute.ElementValue annotationsAttribute_ElementValue0 = new AnnotationsAttribute.ElementValue(101, object0);
      int int0 = annotationsAttribute_ElementValue0.getLength();
      assertEquals(5, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Integer integer0 = new Integer(100);
      AnnotationsAttribute.ElementValue annotationsAttribute_ElementValue0 = new AnnotationsAttribute.ElementValue(100, integer0);
      int int0 = annotationsAttribute_ElementValue0.getLength();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      AnnotationsAttribute.ElementValue annotationsAttribute_ElementValue0 = new AnnotationsAttribute.ElementValue(99, (Object) null);
      AnnotationDefaultAttribute annotationDefaultAttribute0 = new AnnotationDefaultAttribute(annotationsAttribute_ElementValue0);
      int int0 = annotationDefaultAttribute0.getLength();
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("ldc_w");
      CPUTF8[] cPUTF8Array0 = new CPUTF8[5];
      AnnotationsAttribute.ElementValue[] annotationsAttribute_ElementValueArray0 = new AnnotationsAttribute.ElementValue[9];
      Object object0 = new Object();
      AnnotationsAttribute.ElementValue annotationsAttribute_ElementValue0 = new AnnotationsAttribute.ElementValue((byte)8, object0);
      annotationsAttribute_ElementValueArray0[0] = annotationsAttribute_ElementValue0;
      annotationsAttribute_ElementValueArray0[1] = annotationsAttribute_ElementValue0;
      annotationsAttribute_ElementValueArray0[2] = annotationsAttribute_ElementValueArray0[1];
      annotationsAttribute_ElementValueArray0[3] = annotationsAttribute_ElementValueArray0[0];
      annotationsAttribute_ElementValueArray0[4] = annotationsAttribute_ElementValue0;
      annotationsAttribute_ElementValueArray0[5] = annotationsAttribute_ElementValueArray0[4];
      annotationsAttribute_ElementValueArray0[6] = annotationsAttribute_ElementValue0;
      AnnotationsAttribute.ElementValue annotationsAttribute_ElementValue1 = new AnnotationsAttribute.ElementValue(97, object0);
      annotationsAttribute_ElementValueArray0[7] = annotationsAttribute_ElementValue1;
      AnnotationsAttribute.Annotation annotationsAttribute_Annotation0 = new AnnotationsAttribute.Annotation(112, cPUTF8_0, cPUTF8Array0, annotationsAttribute_ElementValueArray0);
      // Undeclared exception!
      try { 
        annotationsAttribute_Annotation0.getLength();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Object object0 = new Object();
      AnnotationsAttribute.ElementValue annotationsAttribute_ElementValue0 = new AnnotationsAttribute.ElementValue(96, object0);
      AnnotationDefaultAttribute annotationDefaultAttribute0 = new AnnotationDefaultAttribute(annotationsAttribute_ElementValue0);
      int int0 = annotationDefaultAttribute0.getLength();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("ldc_w");
      CPUTF8[] cPUTF8Array0 = new CPUTF8[5];
      AnnotationsAttribute.ElementValue[] annotationsAttribute_ElementValueArray0 = new AnnotationsAttribute.ElementValue[9];
      Object object0 = new Object();
      AnnotationsAttribute.ElementValue annotationsAttribute_ElementValue0 = new AnnotationsAttribute.ElementValue((byte)8, object0);
      annotationsAttribute_ElementValueArray0[0] = annotationsAttribute_ElementValue0;
      annotationsAttribute_ElementValueArray0[1] = annotationsAttribute_ElementValue0;
      annotationsAttribute_ElementValueArray0[2] = annotationsAttribute_ElementValueArray0[1];
      annotationsAttribute_ElementValueArray0[3] = annotationsAttribute_ElementValueArray0[1];
      annotationsAttribute_ElementValueArray0[4] = annotationsAttribute_ElementValue0;
      annotationsAttribute_ElementValueArray0[5] = annotationsAttribute_ElementValueArray0[0];
      annotationsAttribute_ElementValueArray0[6] = annotationsAttribute_ElementValueArray0[0];
      AnnotationsAttribute.ElementValue annotationsAttribute_ElementValue1 = new AnnotationsAttribute.ElementValue(95, object0);
      annotationsAttribute_ElementValueArray0[7] = annotationsAttribute_ElementValue1;
      AnnotationsAttribute.Annotation annotationsAttribute_Annotation0 = new AnnotationsAttribute.Annotation(112, cPUTF8_0, cPUTF8Array0, annotationsAttribute_ElementValueArray0);
      // Undeclared exception!
      try { 
        annotationsAttribute_Annotation0.getLength();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("cag8sn", 2127);
      AnnotationsAttribute.Annotation[] annotationsAttribute_AnnotationArray0 = new AnnotationsAttribute.Annotation[2];
      CPUTF8[] cPUTF8Array0 = new CPUTF8[7];
      AnnotationsAttribute.ElementValue[] annotationsAttribute_ElementValueArray0 = new AnnotationsAttribute.ElementValue[7];
      Integer integer0 = new Integer((byte)10);
      AnnotationsAttribute.ElementValue annotationsAttribute_ElementValue0 = new AnnotationsAttribute.ElementValue((byte)4, integer0);
      annotationsAttribute_ElementValueArray0[0] = annotationsAttribute_ElementValue0;
      annotationsAttribute_ElementValueArray0[1] = annotationsAttribute_ElementValue0;
      AnnotationsAttribute.ElementValue annotationsAttribute_ElementValue1 = new AnnotationsAttribute.ElementValue(93, annotationsAttribute_ElementValueArray0[0]);
      annotationsAttribute_ElementValueArray0[2] = annotationsAttribute_ElementValue1;
      AnnotationsAttribute.Annotation annotationsAttribute_Annotation0 = new AnnotationsAttribute.Annotation((byte)6, cPUTF8_0, cPUTF8Array0, annotationsAttribute_ElementValueArray0);
      annotationsAttribute_AnnotationArray0[0] = annotationsAttribute_Annotation0;
      RuntimeVisibleorInvisibleAnnotationsAttribute runtimeVisibleorInvisibleAnnotationsAttribute0 = new RuntimeVisibleorInvisibleAnnotationsAttribute(cPUTF8_0, annotationsAttribute_AnnotationArray0);
      // Undeclared exception!
      try { 
        runtimeVisibleorInvisibleAnnotationsAttribute0.getLength();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Object object0 = new Object();
      AnnotationsAttribute.ElementValue annotationsAttribute_ElementValue0 = new AnnotationsAttribute.ElementValue(92, object0);
      int int0 = annotationsAttribute_ElementValue0.getLength();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("]w");
      RuntimeVisibleorInvisibleParameterAnnotationsAttribute.ParameterAnnotation[] runtimeVisibleorInvisibleParameterAnnotationsAttribute_ParameterAnnotationArray0 = new RuntimeVisibleorInvisibleParameterAnnotationsAttribute.ParameterAnnotation[6];
      AnnotationsAttribute.Annotation[] annotationsAttribute_AnnotationArray0 = new AnnotationsAttribute.Annotation[8];
      CPUTF8[] cPUTF8Array0 = new CPUTF8[4];
      AnnotationsAttribute.ElementValue[] annotationsAttribute_ElementValueArray0 = new AnnotationsAttribute.ElementValue[9];
      AnnotationsAttribute.ElementValue annotationsAttribute_ElementValue0 = new AnnotationsAttribute.ElementValue(115, (Object) null);
      annotationsAttribute_ElementValueArray0[0] = annotationsAttribute_ElementValue0;
      annotationsAttribute_ElementValueArray0[1] = annotationsAttribute_ElementValueArray0[0];
      annotationsAttribute_ElementValueArray0[2] = annotationsAttribute_ElementValueArray0[0];
      Object object0 = new Object();
      annotationsAttribute_ElementValueArray0[3] = annotationsAttribute_ElementValueArray0[2];
      AnnotationsAttribute.ElementValue annotationsAttribute_ElementValue1 = new AnnotationsAttribute.ElementValue(90, object0);
      annotationsAttribute_ElementValueArray0[4] = annotationsAttribute_ElementValue1;
      AnnotationsAttribute.Annotation annotationsAttribute_Annotation0 = new AnnotationsAttribute.Annotation(897, cPUTF8_0, cPUTF8Array0, annotationsAttribute_ElementValueArray0);
      annotationsAttribute_AnnotationArray0[0] = annotationsAttribute_Annotation0;
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
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("dload_3");
      AnnotationsAttribute.Annotation[] annotationsAttribute_AnnotationArray0 = new AnnotationsAttribute.Annotation[7];
      CPUTF8[] cPUTF8Array0 = new CPUTF8[6];
      AnnotationsAttribute.ElementValue[] annotationsAttribute_ElementValueArray0 = new AnnotationsAttribute.ElementValue[7];
      AnnotationsAttribute.ElementValue annotationsAttribute_ElementValue0 = new AnnotationsAttribute.ElementValue(23, cPUTF8_0);
      annotationsAttribute_ElementValueArray0[0] = annotationsAttribute_ElementValue0;
      Object object0 = new Object();
      AnnotationsAttribute.ElementValue annotationsAttribute_ElementValue1 = new AnnotationsAttribute.ElementValue(89, object0);
      annotationsAttribute_ElementValueArray0[1] = annotationsAttribute_ElementValue1;
      AnnotationsAttribute.Annotation annotationsAttribute_Annotation0 = new AnnotationsAttribute.Annotation((byte)12, cPUTF8_0, cPUTF8Array0, annotationsAttribute_ElementValueArray0);
      annotationsAttribute_AnnotationArray0[0] = annotationsAttribute_Annotation0;
      RuntimeVisibleorInvisibleAnnotationsAttribute runtimeVisibleorInvisibleAnnotationsAttribute0 = new RuntimeVisibleorInvisibleAnnotationsAttribute(cPUTF8_0, annotationsAttribute_AnnotationArray0);
      // Undeclared exception!
      try { 
        runtimeVisibleorInvisibleAnnotationsAttribute0.getLength();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("]w");
      RuntimeVisibleorInvisibleParameterAnnotationsAttribute.ParameterAnnotation[] runtimeVisibleorInvisibleParameterAnnotationsAttribute_ParameterAnnotationArray0 = new RuntimeVisibleorInvisibleParameterAnnotationsAttribute.ParameterAnnotation[6];
      AnnotationsAttribute.Annotation[] annotationsAttribute_AnnotationArray0 = new AnnotationsAttribute.Annotation[8];
      CPUTF8[] cPUTF8Array0 = new CPUTF8[4];
      AnnotationsAttribute.ElementValue[] annotationsAttribute_ElementValueArray0 = new AnnotationsAttribute.ElementValue[9];
      AnnotationsAttribute.ElementValue annotationsAttribute_ElementValue0 = new AnnotationsAttribute.ElementValue(115, (Object) null);
      annotationsAttribute_ElementValueArray0[0] = annotationsAttribute_ElementValue0;
      annotationsAttribute_ElementValueArray0[1] = annotationsAttribute_ElementValueArray0[0];
      annotationsAttribute_ElementValueArray0[2] = annotationsAttribute_ElementValueArray0[1];
      annotationsAttribute_ElementValueArray0[3] = annotationsAttribute_ElementValue0;
      annotationsAttribute_ElementValueArray0[4] = annotationsAttribute_ElementValue0;
      annotationsAttribute_ElementValueArray0[5] = annotationsAttribute_ElementValue0;
      annotationsAttribute_ElementValueArray0[6] = annotationsAttribute_ElementValue0;
      annotationsAttribute_ElementValueArray0[7] = annotationsAttribute_ElementValueArray0[0];
      AnnotationsAttribute.ElementValue annotationsAttribute_ElementValue1 = new AnnotationsAttribute.ElementValue(88, cPUTF8_0);
      annotationsAttribute_ElementValueArray0[8] = annotationsAttribute_ElementValue1;
      AnnotationsAttribute.Annotation annotationsAttribute_Annotation0 = new AnnotationsAttribute.Annotation(897, cPUTF8_0, cPUTF8Array0, annotationsAttribute_ElementValueArray0);
      annotationsAttribute_AnnotationArray0[0] = annotationsAttribute_Annotation0;
      RuntimeVisibleorInvisibleParameterAnnotationsAttribute.ParameterAnnotation runtimeVisibleorInvisibleParameterAnnotationsAttribute_ParameterAnnotation0 = new RuntimeVisibleorInvisibleParameterAnnotationsAttribute.ParameterAnnotation(annotationsAttribute_AnnotationArray0);
      runtimeVisibleorInvisibleParameterAnnotationsAttribute_ParameterAnnotationArray0[0] = runtimeVisibleorInvisibleParameterAnnotationsAttribute_ParameterAnnotation0;
      RuntimeVisibleorInvisibleParameterAnnotationsAttribute runtimeVisibleorInvisibleParameterAnnotationsAttribute0 = new RuntimeVisibleorInvisibleParameterAnnotationsAttribute(cPUTF8_0, runtimeVisibleorInvisibleParameterAnnotationsAttribute_ParameterAnnotationArray0);
      // Undeclared exception!
      try { 
        runtimeVisibleorInvisibleParameterAnnotationsAttribute0.getLength();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      AnnotationsAttribute.Annotation[] annotationsAttribute_AnnotationArray0 = new AnnotationsAttribute.Annotation[9];
      CPUTF8[] cPUTF8Array0 = new CPUTF8[3];
      AnnotationsAttribute.ElementValue[] annotationsAttribute_ElementValueArray0 = new AnnotationsAttribute.ElementValue[9];
      Integer integer0 = Integer.getInteger("^<init>.*", 6);
      AnnotationsAttribute.ElementValue annotationsAttribute_ElementValue0 = new AnnotationsAttribute.ElementValue(1, integer0);
      annotationsAttribute_ElementValueArray0[0] = annotationsAttribute_ElementValue0;
      Object object0 = new Object();
      annotationsAttribute_ElementValueArray0[1] = annotationsAttribute_ElementValueArray0[0];
      annotationsAttribute_ElementValueArray0[2] = annotationsAttribute_ElementValue0;
      annotationsAttribute_ElementValueArray0[3] = annotationsAttribute_ElementValue0;
      AnnotationsAttribute.ElementValue annotationsAttribute_ElementValue1 = new AnnotationsAttribute.ElementValue(87, object0);
      annotationsAttribute_ElementValueArray0[4] = annotationsAttribute_ElementValue1;
      AnnotationsAttribute.Annotation annotationsAttribute_Annotation0 = new AnnotationsAttribute.Annotation(110, (CPUTF8) null, cPUTF8Array0, annotationsAttribute_ElementValueArray0);
      annotationsAttribute_AnnotationArray0[0] = annotationsAttribute_Annotation0;
      RuntimeVisibleorInvisibleAnnotationsAttribute runtimeVisibleorInvisibleAnnotationsAttribute0 = new RuntimeVisibleorInvisibleAnnotationsAttribute((CPUTF8) null, annotationsAttribute_AnnotationArray0);
      // Undeclared exception!
      try { 
        runtimeVisibleorInvisibleAnnotationsAttribute0.getLength();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Object object0 = new Object();
      AnnotationsAttribute.ElementValue annotationsAttribute_ElementValue0 = new AnnotationsAttribute.ElementValue(85, object0);
      AnnotationDefaultAttribute annotationDefaultAttribute0 = new AnnotationDefaultAttribute(annotationsAttribute_ElementValue0);
      int int0 = annotationDefaultAttribute0.getLength();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Object object0 = new Object();
      AnnotationsAttribute.ElementValue annotationsAttribute_ElementValue0 = new AnnotationsAttribute.ElementValue(83, object0);
      AnnotationDefaultAttribute annotationDefaultAttribute0 = new AnnotationDefaultAttribute(annotationsAttribute_ElementValue0);
      int int0 = annotationDefaultAttribute0.getLength();
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Object object0 = new Object();
      AnnotationsAttribute.ElementValue annotationsAttribute_ElementValue0 = new AnnotationsAttribute.ElementValue(81, object0);
      AnnotationDefaultAttribute annotationDefaultAttribute0 = new AnnotationDefaultAttribute(annotationsAttribute_ElementValue0);
      int int0 = annotationDefaultAttribute0.getLengthIncludingHeader();
      assertEquals(6, int0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("InterfaceMethodRef");
      RuntimeVisibleorInvisibleParameterAnnotationsAttribute.ParameterAnnotation[] runtimeVisibleorInvisibleParameterAnnotationsAttribute_ParameterAnnotationArray0 = new RuntimeVisibleorInvisibleParameterAnnotationsAttribute.ParameterAnnotation[6];
      AnnotationsAttribute.Annotation[] annotationsAttribute_AnnotationArray0 = new AnnotationsAttribute.Annotation[7];
      CPUTF8[] cPUTF8Array0 = new CPUTF8[6];
      AnnotationsAttribute.ElementValue[] annotationsAttribute_ElementValueArray0 = new AnnotationsAttribute.ElementValue[7];
      AnnotationsAttribute.ElementValue annotationsAttribute_ElementValue0 = new AnnotationsAttribute.ElementValue((byte)8, cPUTF8_0);
      annotationsAttribute_ElementValueArray0[0] = annotationsAttribute_ElementValue0;
      annotationsAttribute_ElementValueArray0[1] = annotationsAttribute_ElementValue0;
      annotationsAttribute_ElementValueArray0[2] = annotationsAttribute_ElementValueArray0[1];
      annotationsAttribute_ElementValueArray0[3] = annotationsAttribute_ElementValue0;
      annotationsAttribute_ElementValueArray0[4] = annotationsAttribute_ElementValueArray0[3];
      AnnotationsAttribute.ElementValue annotationsAttribute_ElementValue1 = new AnnotationsAttribute.ElementValue(77, annotationsAttribute_ElementValueArray0[0]);
      annotationsAttribute_ElementValueArray0[5] = annotationsAttribute_ElementValue1;
      AnnotationsAttribute.Annotation annotationsAttribute_Annotation0 = new AnnotationsAttribute.Annotation((-2094), cPUTF8_0, cPUTF8Array0, annotationsAttribute_ElementValueArray0);
      annotationsAttribute_AnnotationArray0[0] = annotationsAttribute_Annotation0;
      annotationsAttribute_AnnotationArray0[1] = annotationsAttribute_Annotation0;
      AnnotationsAttribute.Annotation annotationsAttribute_Annotation1 = new AnnotationsAttribute.Annotation(97, cPUTF8_0, cPUTF8Array0, annotationsAttribute_ElementValueArray0);
      annotationsAttribute_AnnotationArray0[2] = annotationsAttribute_Annotation1;
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
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("", 615);
      AnnotationsAttribute.Annotation[] annotationsAttribute_AnnotationArray0 = new AnnotationsAttribute.Annotation[7];
      CPUTF8[] cPUTF8Array0 = new CPUTF8[1];
      AnnotationsAttribute.ElementValue[] annotationsAttribute_ElementValueArray0 = new AnnotationsAttribute.ElementValue[8];
      AnnotationsAttribute.ElementValue annotationsAttribute_ElementValue0 = new AnnotationsAttribute.ElementValue((byte)1, cPUTF8_0);
      annotationsAttribute_ElementValueArray0[0] = annotationsAttribute_ElementValue0;
      Object object0 = new Object();
      AnnotationsAttribute.ElementValue annotationsAttribute_ElementValue1 = new AnnotationsAttribute.ElementValue(73, object0);
      annotationsAttribute_ElementValueArray0[1] = annotationsAttribute_ElementValue1;
      AnnotationsAttribute.Annotation annotationsAttribute_Annotation0 = new AnnotationsAttribute.Annotation(1, cPUTF8_0, cPUTF8Array0, annotationsAttribute_ElementValueArray0);
      annotationsAttribute_AnnotationArray0[0] = annotationsAttribute_Annotation0;
      AnnotationsAttribute.Annotation annotationsAttribute_Annotation1 = new AnnotationsAttribute.Annotation((byte)4, cPUTF8_0, cPUTF8Array0, annotationsAttribute_ElementValueArray0);
      annotationsAttribute_AnnotationArray0[1] = annotationsAttribute_Annotation1;
      RuntimeVisibleorInvisibleAnnotationsAttribute runtimeVisibleorInvisibleAnnotationsAttribute0 = new RuntimeVisibleorInvisibleAnnotationsAttribute(cPUTF8_0, annotationsAttribute_AnnotationArray0);
      // Undeclared exception!
      try { 
        runtimeVisibleorInvisibleAnnotationsAttribute0.getLength();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("ldc_w");
      CPUTF8[] cPUTF8Array0 = new CPUTF8[5];
      AnnotationsAttribute.ElementValue[] annotationsAttribute_ElementValueArray0 = new AnnotationsAttribute.ElementValue[9];
      Object object0 = new Object();
      AnnotationsAttribute.ElementValue annotationsAttribute_ElementValue0 = new AnnotationsAttribute.ElementValue((byte)8, object0);
      annotationsAttribute_ElementValueArray0[0] = annotationsAttribute_ElementValue0;
      AnnotationsAttribute.ElementValue annotationsAttribute_ElementValue1 = new AnnotationsAttribute.ElementValue(72, object0);
      annotationsAttribute_ElementValueArray0[1] = annotationsAttribute_ElementValue1;
      AnnotationsAttribute.Annotation annotationsAttribute_Annotation0 = new AnnotationsAttribute.Annotation(112, cPUTF8_0, cPUTF8Array0, annotationsAttribute_ElementValueArray0);
      // Undeclared exception!
      try { 
        annotationsAttribute_Annotation0.getLength();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Object object0 = new Object();
      AnnotationsAttribute.ElementValue annotationsAttribute_ElementValue0 = new AnnotationsAttribute.ElementValue(68, object0);
      AnnotationDefaultAttribute annotationDefaultAttribute0 = new AnnotationDefaultAttribute(annotationsAttribute_ElementValue0);
      int int0 = annotationDefaultAttribute0.getLengthIncludingHeader();
      assertEquals(9, int0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("", 208);
      CPUTF8[] cPUTF8Array0 = new CPUTF8[2];
      AnnotationsAttribute.ElementValue[] annotationsAttribute_ElementValueArray0 = new AnnotationsAttribute.ElementValue[0];
      AnnotationsAttribute.Annotation annotationsAttribute_Annotation0 = new AnnotationsAttribute.Annotation(208, cPUTF8_0, cPUTF8Array0, annotationsAttribute_ElementValueArray0);
      AnnotationsAttribute.ElementValue annotationsAttribute_ElementValue0 = new AnnotationsAttribute.ElementValue((byte)9, annotationsAttribute_Annotation0);
      // Undeclared exception!
      try { 
        annotationsAttribute_ElementValue0.getClassFileEntries();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.AnnotationsAttribute$Annotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Object object0 = new Object();
      AnnotationsAttribute.ElementValue annotationsAttribute_ElementValue0 = new AnnotationsAttribute.ElementValue(256, object0);
      List<Object> list0 = annotationsAttribute_ElementValue0.getClassFileEntries();
      assertFalse(list0.contains(object0));
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("8(5Jos|m)", 2060);
      AnnotationsAttribute.Annotation[] annotationsAttribute_AnnotationArray0 = new AnnotationsAttribute.Annotation[3];
      CPUTF8[] cPUTF8Array0 = new CPUTF8[3];
      AnnotationsAttribute.ElementValue[] annotationsAttribute_ElementValueArray0 = new AnnotationsAttribute.ElementValue[0];
      AnnotationsAttribute.Annotation annotationsAttribute_Annotation0 = new AnnotationsAttribute.Annotation((-12), cPUTF8_0, cPUTF8Array0, annotationsAttribute_ElementValueArray0);
      annotationsAttribute_AnnotationArray0[0] = annotationsAttribute_Annotation0;
      AnnotationsAttribute.ElementValue[] annotationsAttribute_ElementValueArray1 = new AnnotationsAttribute.ElementValue[4];
      AnnotationsAttribute.Annotation annotationsAttribute_Annotation1 = new AnnotationsAttribute.Annotation(99, cPUTF8_0, cPUTF8Array0, annotationsAttribute_ElementValueArray1);
      annotationsAttribute_AnnotationArray0[1] = annotationsAttribute_Annotation1;
      RuntimeVisibleorInvisibleAnnotationsAttribute runtimeVisibleorInvisibleAnnotationsAttribute0 = new RuntimeVisibleorInvisibleAnnotationsAttribute(cPUTF8_0, annotationsAttribute_AnnotationArray0);
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      FilterOutputStream filterOutputStream0 = new FilterOutputStream(byteArrayOutputStream0);
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream(filterOutputStream0);
      DataOutputStream dataOutputStream0 = new DataOutputStream(bufferedOutputStream0);
      // Undeclared exception!
      try { 
        runtimeVisibleorInvisibleAnnotationsAttribute0.writeBody(dataOutputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.AnnotationsAttribute$Annotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("org.apache.commons.compress.harmony.unpack200.bytecode.CPString");
      RuntimeVisibleorInvisibleParameterAnnotationsAttribute.ParameterAnnotation[] runtimeVisibleorInvisibleParameterAnnotationsAttribute_ParameterAnnotationArray0 = new RuntimeVisibleorInvisibleParameterAnnotationsAttribute.ParameterAnnotation[5];
      AnnotationsAttribute.Annotation[] annotationsAttribute_AnnotationArray0 = new AnnotationsAttribute.Annotation[7];
      CPUTF8[] cPUTF8Array0 = new CPUTF8[1];
      AnnotationsAttribute.ElementValue[] annotationsAttribute_ElementValueArray0 = new AnnotationsAttribute.ElementValue[7];
      AnnotationsAttribute.ElementValue annotationsAttribute_ElementValue0 = new AnnotationsAttribute.ElementValue((byte)11, cPUTF8_0);
      annotationsAttribute_ElementValueArray0[0] = annotationsAttribute_ElementValue0;
      AnnotationsAttribute.Annotation annotationsAttribute_Annotation0 = new AnnotationsAttribute.Annotation((-2162), cPUTF8_0, cPUTF8Array0, annotationsAttribute_ElementValueArray0);
      annotationsAttribute_AnnotationArray0[0] = annotationsAttribute_Annotation0;
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
}
