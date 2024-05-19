
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
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
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
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class AnnotationsAttribute_ESTest extends AnnotationsAttribute_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("7/[<i%lb", 0);
      AnnotationsAttribute.Annotation[] annotationsAttribute_AnnotationArray0 = new AnnotationsAttribute.Annotation[5];
      CPUTF8[] cPUTF8Array0 = new CPUTF8[8];
      AnnotationsAttribute.ElementValue[] annotationsAttribute_ElementValueArray0 = new AnnotationsAttribute.ElementValue[8];
      AnnotationsAttribute.Annotation annotationsAttribute_Annotation0 = new AnnotationsAttribute.Annotation(0, cPUTF8_0, cPUTF8Array0, annotationsAttribute_ElementValueArray0);
      annotationsAttribute_AnnotationArray0[0] = annotationsAttribute_Annotation0;
      RuntimeVisibleorInvisibleAnnotationsAttribute runtimeVisibleorInvisibleAnnotationsAttribute0 = new RuntimeVisibleorInvisibleAnnotationsAttribute(cPUTF8_0, annotationsAttribute_AnnotationArray0);
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(494);
      DataOutputStream dataOutputStream0 = new DataOutputStream(byteArrayOutputStream0);
      // Undeclared exception!
      try { 
        runtimeVisibleorInvisibleAnnotationsAttribute0.writeBody(dataOutputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.RuntimeVisibleorInvisibleAnnotationsAttribute", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CPUTF8[] cPUTF8Array0 = new CPUTF8[1];
      AnnotationsAttribute.ElementValue[] annotationsAttribute_ElementValueArray0 = new AnnotationsAttribute.ElementValue[5];
      AnnotationsAttribute.Annotation annotationsAttribute_Annotation0 = new AnnotationsAttribute.Annotation((-248), (CPUTF8) null, cPUTF8Array0, annotationsAttribute_ElementValueArray0);
      int int0 = annotationsAttribute_Annotation0.getLength();
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Object object0 = new Object();
      AnnotationsAttribute.ElementValue annotationsAttribute_ElementValue0 = new AnnotationsAttribute.ElementValue(0, object0);
      CPUTF8 cPUTF8_0 = new CPUTF8("AnnotationDefault: org.apache.commons.compress.harmony.unpack200.bytecode.AnnotationsAttribute$ElementValue@1", 0);
      CPUTF8[] cPUTF8Array0 = new CPUTF8[3];
      AnnotationsAttribute.ElementValue[] annotationsAttribute_ElementValueArray0 = new AnnotationsAttribute.ElementValue[8];
      annotationsAttribute_ElementValueArray0[0] = annotationsAttribute_ElementValue0;
      annotationsAttribute_ElementValueArray0[1] = annotationsAttribute_ElementValue0;
      annotationsAttribute_ElementValueArray0[2] = annotationsAttribute_ElementValue0;
      AnnotationsAttribute.Annotation annotationsAttribute_Annotation0 = new AnnotationsAttribute.Annotation(0, cPUTF8_0, cPUTF8Array0, annotationsAttribute_ElementValueArray0);
      List<Object> list0 = annotationsAttribute_Annotation0.getClassFileEntries();
      assertEquals(4, annotationsAttribute_Annotation0.getLength());
      assertEquals(4, list0.size());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CPUTF8[] cPUTF8Array0 = new CPUTF8[9];
      AnnotationsAttribute.ElementValue[] annotationsAttribute_ElementValueArray0 = new AnnotationsAttribute.ElementValue[1];
      AnnotationsAttribute.Annotation annotationsAttribute_Annotation0 = new AnnotationsAttribute.Annotation((-920), (CPUTF8) null, cPUTF8Array0, annotationsAttribute_ElementValueArray0);
      MockFile mockFile0 = new MockFile((File) null, "%");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0);
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockFileOutputStream0);
      annotationsAttribute_Annotation0.writeBody(dataOutputStream0);
      assertEquals(4, annotationsAttribute_Annotation0.getLength());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("", 3);
      CPUTF8[] cPUTF8Array0 = new CPUTF8[6];
      AnnotationsAttribute.ElementValue[] annotationsAttribute_ElementValueArray0 = new AnnotationsAttribute.ElementValue[2];
      AnnotationsAttribute.Annotation annotationsAttribute_Annotation0 = new AnnotationsAttribute.Annotation(3, cPUTF8_0, cPUTF8Array0, annotationsAttribute_ElementValueArray0);
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
      CPUTF8 cPUTF8_0 = new CPUTF8("+^3k%?c\"*|)L{");
      RuntimeVisibleorInvisibleParameterAnnotationsAttribute.ParameterAnnotation[] runtimeVisibleorInvisibleParameterAnnotationsAttribute_ParameterAnnotationArray0 = new RuntimeVisibleorInvisibleParameterAnnotationsAttribute.ParameterAnnotation[1];
      AnnotationsAttribute.Annotation[] annotationsAttribute_AnnotationArray0 = new AnnotationsAttribute.Annotation[1];
      CPUTF8[] cPUTF8Array0 = new CPUTF8[1];
      cPUTF8Array0[0] = cPUTF8_0;
      AnnotationsAttribute.ElementValue[] annotationsAttribute_ElementValueArray0 = new AnnotationsAttribute.ElementValue[0];
      AnnotationsAttribute.Annotation annotationsAttribute_Annotation0 = new AnnotationsAttribute.Annotation(142, cPUTF8_0, cPUTF8Array0, annotationsAttribute_ElementValueArray0);
      annotationsAttribute_AnnotationArray0[0] = annotationsAttribute_Annotation0;
      RuntimeVisibleorInvisibleParameterAnnotationsAttribute.ParameterAnnotation runtimeVisibleorInvisibleParameterAnnotationsAttribute_ParameterAnnotation0 = new RuntimeVisibleorInvisibleParameterAnnotationsAttribute.ParameterAnnotation(annotationsAttribute_AnnotationArray0);
      runtimeVisibleorInvisibleParameterAnnotationsAttribute_ParameterAnnotationArray0[0] = runtimeVisibleorInvisibleParameterAnnotationsAttribute_ParameterAnnotation0;
      RuntimeVisibleorInvisibleParameterAnnotationsAttribute runtimeVisibleorInvisibleParameterAnnotationsAttribute0 = new RuntimeVisibleorInvisibleParameterAnnotationsAttribute(cPUTF8_0, runtimeVisibleorInvisibleParameterAnnotationsAttribute_ParameterAnnotationArray0);
      // Undeclared exception!
      try { 
        runtimeVisibleorInvisibleParameterAnnotationsAttribute0.resolve(classConstantPool0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.AnnotationsAttribute$Annotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Integer integer0 = new Integer(112);
      AnnotationsAttribute.ElementValue annotationsAttribute_ElementValue0 = new AnnotationsAttribute.ElementValue(112, integer0);
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream(pipedInputStream0);
      DataOutputStream dataOutputStream0 = new DataOutputStream(pipedOutputStream0);
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
  public void test07()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("", (-4464));
      AnnotationsAttribute.ElementValue[] annotationsAttribute_ElementValueArray0 = new AnnotationsAttribute.ElementValue[4];
      AnnotationsAttribute.ElementValue annotationsAttribute_ElementValue0 = new AnnotationsAttribute.ElementValue((byte)6, cPUTF8_0);
      annotationsAttribute_ElementValueArray0[0] = annotationsAttribute_ElementValue0;
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      // Undeclared exception!
      try { 
        annotationsAttribute_ElementValueArray0[0].resolve(classConstantPool0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Constant pool is not yet resolved; this does not make any sense
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ClassConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Object object0 = new Object();
      AnnotationsAttribute.ElementValue annotationsAttribute_ElementValue0 = new AnnotationsAttribute.ElementValue(84, object0);
      annotationsAttribute_ElementValue0.resolve((ClassConstantPool) null);
      assertEquals(0, annotationsAttribute_ElementValue0.getLength());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      AnnotationsAttribute.ElementValue annotationsAttribute_ElementValue0 = new AnnotationsAttribute.ElementValue(115, (Object) null);
      int int0 = annotationsAttribute_ElementValue0.getLength();
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Integer integer0 = new Integer(114);
      AnnotationsAttribute.ElementValue annotationsAttribute_ElementValue0 = new AnnotationsAttribute.ElementValue(114, integer0);
      int int0 = annotationsAttribute_ElementValue0.getLength();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      AnnotationsAttribute.ElementValue annotationsAttribute_ElementValue0 = new AnnotationsAttribute.ElementValue(113, (Object) null);
      int int0 = annotationsAttribute_ElementValue0.getLength();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Integer integer0 = new Integer(112);
      AnnotationsAttribute.ElementValue annotationsAttribute_ElementValue0 = new AnnotationsAttribute.ElementValue(112, integer0);
      int int0 = annotationsAttribute_ElementValue0.getLength();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("org.apache.commons.compress.harmony.unpack200.bytecode.AnnotationsAttribute$Annotation", 2656);
      AnnotationsAttribute.Annotation[] annotationsAttribute_AnnotationArray0 = new AnnotationsAttribute.Annotation[6];
      CPUTF8[] cPUTF8Array0 = new CPUTF8[7];
      AnnotationsAttribute.ElementValue[] annotationsAttribute_ElementValueArray0 = new AnnotationsAttribute.ElementValue[9];
      AnnotationsAttribute.ElementValue annotationsAttribute_ElementValue0 = new AnnotationsAttribute.ElementValue(2084, cPUTF8_0);
      annotationsAttribute_ElementValueArray0[0] = annotationsAttribute_ElementValue0;
      annotationsAttribute_ElementValueArray0[1] = annotationsAttribute_ElementValueArray0[0];
      annotationsAttribute_ElementValueArray0[2] = annotationsAttribute_ElementValueArray0[0];
      annotationsAttribute_ElementValueArray0[3] = annotationsAttribute_ElementValueArray0[2];
      Object object0 = new Object();
      AnnotationsAttribute.ElementValue annotationsAttribute_ElementValue1 = new AnnotationsAttribute.ElementValue(110, object0);
      annotationsAttribute_ElementValueArray0[4] = annotationsAttribute_ElementValue1;
      AnnotationsAttribute.Annotation annotationsAttribute_Annotation0 = new AnnotationsAttribute.Annotation((byte)5, cPUTF8_0, cPUTF8Array0, annotationsAttribute_ElementValueArray0);
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
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.RuntimeVisibleorInvisibleAnnotationsAttribute", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("", (-1));
      AnnotationsAttribute.Annotation[] annotationsAttribute_AnnotationArray0 = new AnnotationsAttribute.Annotation[4];
      AnnotationsAttribute.ElementValue[] annotationsAttribute_ElementValueArray0 = new AnnotationsAttribute.ElementValue[8];
      Integer integer0 = new Integer(106);
      AnnotationsAttribute.ElementValue annotationsAttribute_ElementValue0 = new AnnotationsAttribute.ElementValue((-2044), integer0);
      annotationsAttribute_ElementValueArray0[0] = annotationsAttribute_ElementValue0;
      annotationsAttribute_ElementValueArray0[1] = annotationsAttribute_ElementValueArray0[0];
      annotationsAttribute_ElementValueArray0[2] = annotationsAttribute_ElementValue0;
      Object object0 = new Object();
      AnnotationsAttribute.ElementValue annotationsAttribute_ElementValue1 = new AnnotationsAttribute.ElementValue(109, object0);
      annotationsAttribute_ElementValueArray0[3] = annotationsAttribute_ElementValue1;
      AnnotationsAttribute.Annotation annotationsAttribute_Annotation0 = new AnnotationsAttribute.Annotation(100, cPUTF8_0, (CPUTF8[]) null, annotationsAttribute_ElementValueArray0);
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
  public void test15()  throws Throwable  {
      AnnotationsAttribute.ElementValue annotationsAttribute_ElementValue0 = new AnnotationsAttribute.ElementValue(75, (Object) null);
      CPUTF8 cPUTF8_0 = new CPUTF8("org.apache.commons.compress.harmony.unpack200.bytecode.AnnotationsAttribute$Annotation");
      AnnotationsAttribute.Annotation[] annotationsAttribute_AnnotationArray0 = new AnnotationsAttribute.Annotation[1];
      CPUTF8[] cPUTF8Array0 = new CPUTF8[8];
      AnnotationsAttribute.ElementValue[] annotationsAttribute_ElementValueArray0 = new AnnotationsAttribute.ElementValue[2];
      annotationsAttribute_ElementValueArray0[0] = annotationsAttribute_ElementValue0;
      AnnotationsAttribute.ElementValue annotationsAttribute_ElementValue1 = new AnnotationsAttribute.ElementValue(107, cPUTF8_0);
      annotationsAttribute_ElementValueArray0[1] = annotationsAttribute_ElementValue1;
      AnnotationsAttribute.Annotation annotationsAttribute_Annotation0 = new AnnotationsAttribute.Annotation(913, cPUTF8_0, cPUTF8Array0, annotationsAttribute_ElementValueArray0);
      annotationsAttribute_AnnotationArray0[0] = annotationsAttribute_Annotation0;
      RuntimeVisibleorInvisibleAnnotationsAttribute runtimeVisibleorInvisibleAnnotationsAttribute0 = new RuntimeVisibleorInvisibleAnnotationsAttribute(cPUTF8_0, annotationsAttribute_AnnotationArray0);
      // Undeclared exception!
      try { 
        runtimeVisibleorInvisibleAnnotationsAttribute0.getLength();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("");
      CPUTF8[] cPUTF8Array0 = new CPUTF8[4];
      AnnotationsAttribute.ElementValue[] annotationsAttribute_ElementValueArray0 = new AnnotationsAttribute.ElementValue[9];
      AnnotationsAttribute.ElementValue annotationsAttribute_ElementValue0 = new AnnotationsAttribute.ElementValue((byte)8, cPUTF8_0);
      annotationsAttribute_ElementValueArray0[0] = annotationsAttribute_ElementValue0;
      annotationsAttribute_ElementValueArray0[1] = annotationsAttribute_ElementValue0;
      annotationsAttribute_ElementValueArray0[2] = annotationsAttribute_ElementValue0;
      annotationsAttribute_ElementValueArray0[3] = annotationsAttribute_ElementValueArray0[1];
      annotationsAttribute_ElementValueArray0[4] = annotationsAttribute_ElementValue0;
      annotationsAttribute_ElementValueArray0[5] = annotationsAttribute_ElementValueArray0[2];
      AnnotationsAttribute.ElementValue annotationsAttribute_ElementValue1 = new AnnotationsAttribute.ElementValue(106, cPUTF8_0);
      annotationsAttribute_ElementValueArray0[6] = annotationsAttribute_ElementValue1;
      AnnotationsAttribute.Annotation annotationsAttribute_Annotation0 = new AnnotationsAttribute.Annotation(1926, cPUTF8_0, cPUTF8Array0, annotationsAttribute_ElementValueArray0);
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
  public void test17()  throws Throwable  {
      Integer integer0 = new Integer(104);
      AnnotationsAttribute.ElementValue annotationsAttribute_ElementValue0 = new AnnotationsAttribute.ElementValue(104, integer0);
      int int0 = annotationsAttribute_ElementValue0.getLength();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Object object0 = new Object();
      AnnotationsAttribute.ElementValue annotationsAttribute_ElementValue0 = new AnnotationsAttribute.ElementValue(101, object0);
      int int0 = annotationsAttribute_ElementValue0.getLength();
      assertEquals(5, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      AnnotationsAttribute.ElementValue annotationsAttribute_ElementValue0 = new AnnotationsAttribute.ElementValue(99, (Object) null);
      int int0 = annotationsAttribute_ElementValue0.getLength();
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      AnnotationsAttribute.ElementValue annotationsAttribute_ElementValue0 = new AnnotationsAttribute.ElementValue(98, (Object) null);
      int int0 = annotationsAttribute_ElementValue0.getLength();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Integer integer0 = new Integer(95);
      AnnotationsAttribute.ElementValue annotationsAttribute_ElementValue0 = new AnnotationsAttribute.ElementValue(95, integer0);
      int int0 = annotationsAttribute_ElementValue0.getLength();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Integer integer0 = new Integer(94);
      AnnotationsAttribute.ElementValue annotationsAttribute_ElementValue0 = new AnnotationsAttribute.ElementValue(94, integer0);
      AnnotationDefaultAttribute annotationDefaultAttribute0 = new AnnotationDefaultAttribute(annotationsAttribute_ElementValue0);
      int int0 = annotationDefaultAttribute0.getLengthIncludingHeader();
      assertEquals(6, int0);
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
      Integer integer0 = new Integer(91);
      AnnotationsAttribute.ElementValue annotationsAttribute_ElementValue0 = new AnnotationsAttribute.ElementValue(91, integer0);
      // Undeclared exception!
      try { 
        annotationsAttribute_ElementValue0.getLength();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("", (-1));
      AnnotationsAttribute.Annotation[] annotationsAttribute_AnnotationArray0 = new AnnotationsAttribute.Annotation[4];
      AnnotationsAttribute.ElementValue[] annotationsAttribute_ElementValueArray0 = new AnnotationsAttribute.ElementValue[8];
      Integer integer0 = new Integer(106);
      AnnotationsAttribute.ElementValue annotationsAttribute_ElementValue0 = new AnnotationsAttribute.ElementValue((-2044), integer0);
      annotationsAttribute_ElementValueArray0[0] = annotationsAttribute_ElementValue0;
      AnnotationsAttribute.ElementValue annotationsAttribute_ElementValue1 = new AnnotationsAttribute.ElementValue(90, cPUTF8_0);
      annotationsAttribute_ElementValueArray0[1] = annotationsAttribute_ElementValue1;
      AnnotationsAttribute.Annotation annotationsAttribute_Annotation0 = new AnnotationsAttribute.Annotation(100, cPUTF8_0, (CPUTF8[]) null, annotationsAttribute_ElementValueArray0);
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
      AnnotationsAttribute.ElementValue annotationsAttribute_ElementValue0 = new AnnotationsAttribute.ElementValue(89, (Object) null);
      int int0 = annotationsAttribute_ElementValue0.getLength();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      AnnotationsAttribute.ElementValue annotationsAttribute_ElementValue0 = new AnnotationsAttribute.ElementValue(88, (Object) null);
      int int0 = annotationsAttribute_ElementValue0.getLength();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      AnnotationsAttribute.ElementValue annotationsAttribute_ElementValue0 = new AnnotationsAttribute.ElementValue(86, (Object) null);
      int int0 = annotationsAttribute_ElementValue0.getLength();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Object object0 = new Object();
      AnnotationsAttribute.ElementValue annotationsAttribute_ElementValue0 = new AnnotationsAttribute.ElementValue(84, object0);
      int int0 = annotationsAttribute_ElementValue0.getLength();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      RuntimeVisibleorInvisibleParameterAnnotationsAttribute.ParameterAnnotation[] runtimeVisibleorInvisibleParameterAnnotationsAttribute_ParameterAnnotationArray0 = new RuntimeVisibleorInvisibleParameterAnnotationsAttribute.ParameterAnnotation[3];
      AnnotationsAttribute.Annotation[] annotationsAttribute_AnnotationArray0 = new AnnotationsAttribute.Annotation[6];
      CPUTF8[] cPUTF8Array0 = new CPUTF8[9];
      AnnotationsAttribute.ElementValue[] annotationsAttribute_ElementValueArray0 = new AnnotationsAttribute.ElementValue[7];
      AnnotationsAttribute.ElementValue annotationsAttribute_ElementValue0 = new AnnotationsAttribute.ElementValue((byte)10, "");
      annotationsAttribute_ElementValueArray0[0] = annotationsAttribute_ElementValue0;
      Integer integer0 = new Integer(71);
      AnnotationsAttribute.ElementValue annotationsAttribute_ElementValue1 = new AnnotationsAttribute.ElementValue(83, integer0);
      annotationsAttribute_ElementValueArray0[1] = annotationsAttribute_ElementValue1;
      AnnotationsAttribute.Annotation annotationsAttribute_Annotation0 = new AnnotationsAttribute.Annotation(93, (CPUTF8) null, cPUTF8Array0, annotationsAttribute_ElementValueArray0);
      annotationsAttribute_AnnotationArray0[0] = annotationsAttribute_Annotation0;
      RuntimeVisibleorInvisibleParameterAnnotationsAttribute.ParameterAnnotation runtimeVisibleorInvisibleParameterAnnotationsAttribute_ParameterAnnotation0 = new RuntimeVisibleorInvisibleParameterAnnotationsAttribute.ParameterAnnotation(annotationsAttribute_AnnotationArray0);
      runtimeVisibleorInvisibleParameterAnnotationsAttribute_ParameterAnnotationArray0[0] = runtimeVisibleorInvisibleParameterAnnotationsAttribute_ParameterAnnotation0;
      RuntimeVisibleorInvisibleParameterAnnotationsAttribute runtimeVisibleorInvisibleParameterAnnotationsAttribute0 = new RuntimeVisibleorInvisibleParameterAnnotationsAttribute((CPUTF8) null, runtimeVisibleorInvisibleParameterAnnotationsAttribute_ParameterAnnotationArray0);
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
  public void test31()  throws Throwable  {
      AnnotationsAttribute.ElementValue annotationsAttribute_ElementValue0 = new AnnotationsAttribute.ElementValue(82, (Object) null);
      int int0 = annotationsAttribute_ElementValue0.getLength();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      AnnotationsAttribute.ElementValue annotationsAttribute_ElementValue0 = new AnnotationsAttribute.ElementValue(79, (Object) null);
      int int0 = annotationsAttribute_ElementValue0.getLength();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      AnnotationsAttribute.ElementValue annotationsAttribute_ElementValue0 = new AnnotationsAttribute.ElementValue(77, (Object) null);
      int int0 = annotationsAttribute_ElementValue0.getLength();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Object object0 = new Object();
      AnnotationsAttribute.ElementValue annotationsAttribute_ElementValue0 = new AnnotationsAttribute.ElementValue(74, object0);
      int int0 = annotationsAttribute_ElementValue0.getLength();
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      AnnotationsAttribute.ElementValue annotationsAttribute_ElementValue0 = new AnnotationsAttribute.ElementValue(72, (Object) null);
      int int0 = annotationsAttribute_ElementValue0.getLength();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("");
      AnnotationsAttribute.ElementValue annotationsAttribute_ElementValue0 = new AnnotationsAttribute.ElementValue(71, cPUTF8_0);
      AnnotationDefaultAttribute annotationDefaultAttribute0 = new AnnotationDefaultAttribute(annotationsAttribute_ElementValue0);
      int int0 = annotationDefaultAttribute0.getLength();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      AnnotationsAttribute.ElementValue annotationsAttribute_ElementValue0 = new AnnotationsAttribute.ElementValue(70, (Object) null);
      int int0 = annotationsAttribute_ElementValue0.getLength();
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      AnnotationsAttribute.ElementValue annotationsAttribute_ElementValue0 = new AnnotationsAttribute.ElementValue(66, (Object) null);
      int int0 = annotationsAttribute_ElementValue0.getLength();
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Integer integer0 = new Integer(65);
      AnnotationsAttribute.ElementValue annotationsAttribute_ElementValue0 = new AnnotationsAttribute.ElementValue(65, integer0);
      AnnotationDefaultAttribute annotationDefaultAttribute0 = new AnnotationDefaultAttribute(annotationsAttribute_ElementValue0);
      int int0 = annotationDefaultAttribute0.getLengthIncludingHeader();
      assertEquals(6, int0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Integer integer0 = new Integer(1629);
      AnnotationsAttribute.ElementValue annotationsAttribute_ElementValue0 = new AnnotationsAttribute.ElementValue(0, integer0);
      List<Object> list0 = annotationsAttribute_ElementValue0.getClassFileEntries();
      assertFalse(list0.contains(1629));
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("");
      AnnotationsAttribute.Annotation[] annotationsAttribute_AnnotationArray0 = new AnnotationsAttribute.Annotation[7];
      CPUTF8[] cPUTF8Array0 = new CPUTF8[8];
      AnnotationsAttribute.ElementValue[] annotationsAttribute_ElementValueArray0 = new AnnotationsAttribute.ElementValue[2];
      AnnotationsAttribute.Annotation annotationsAttribute_Annotation0 = new AnnotationsAttribute.Annotation((-1), cPUTF8_0, cPUTF8Array0, annotationsAttribute_ElementValueArray0);
      annotationsAttribute_AnnotationArray0[0] = annotationsAttribute_Annotation0;
      AnnotationsAttribute.Annotation annotationsAttribute_Annotation1 = new AnnotationsAttribute.Annotation(159, cPUTF8_0, cPUTF8Array0, annotationsAttribute_ElementValueArray0);
      annotationsAttribute_AnnotationArray0[1] = annotationsAttribute_Annotation1;
      RuntimeVisibleorInvisibleAnnotationsAttribute runtimeVisibleorInvisibleAnnotationsAttribute0 = new RuntimeVisibleorInvisibleAnnotationsAttribute(cPUTF8_0, annotationsAttribute_AnnotationArray0);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("!AUMb-@9", false);
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockFileOutputStream0);
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
  public void test42()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("dmul", (-4362));
      AnnotationsAttribute.Annotation[] annotationsAttribute_AnnotationArray0 = new AnnotationsAttribute.Annotation[8];
      CPUTF8[] cPUTF8Array0 = new CPUTF8[2];
      AnnotationsAttribute.ElementValue[] annotationsAttribute_ElementValueArray0 = new AnnotationsAttribute.ElementValue[9];
      AnnotationsAttribute.ElementValue annotationsAttribute_ElementValue0 = new AnnotationsAttribute.ElementValue((-861), cPUTF8_0);
      annotationsAttribute_ElementValueArray0[0] = annotationsAttribute_ElementValue0;
      annotationsAttribute_ElementValueArray0[1] = annotationsAttribute_ElementValue0;
      AnnotationsAttribute.Annotation annotationsAttribute_Annotation0 = new AnnotationsAttribute.Annotation((byte)9, cPUTF8_0, cPUTF8Array0, annotationsAttribute_ElementValueArray0);
      annotationsAttribute_AnnotationArray0[0] = annotationsAttribute_Annotation0;
      RuntimeVisibleorInvisibleAnnotationsAttribute runtimeVisibleorInvisibleAnnotationsAttribute0 = new RuntimeVisibleorInvisibleAnnotationsAttribute(cPUTF8_0, annotationsAttribute_AnnotationArray0);
      // Undeclared exception!
      try { 
        runtimeVisibleorInvisibleAnnotationsAttribute0.getNestedClassFileEntries();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.RuntimeVisibleorInvisibleAnnotationsAttribute", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      AnnotationsAttribute.ElementValue annotationsAttribute_ElementValue0 = new AnnotationsAttribute.ElementValue(108, (Object) null);
      int int0 = annotationsAttribute_ElementValue0.getLength();
      assertEquals(0, int0);
  }
}
