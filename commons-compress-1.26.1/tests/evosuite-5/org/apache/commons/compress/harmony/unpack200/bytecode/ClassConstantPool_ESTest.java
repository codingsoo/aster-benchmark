
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
import java.util.HashSet;
import java.util.List;
import org.apache.commons.compress.harmony.unpack200.Segment;
import org.apache.commons.compress.harmony.unpack200.bytecode.AnnotationsAttribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPDouble;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPFloat;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPInteger;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPLong;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8;
import org.apache.commons.compress.harmony.unpack200.bytecode.ClassConstantPool;
import org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry;
import org.apache.commons.compress.harmony.unpack200.bytecode.DeprecatedAttribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.LocalVariableTableAttribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.NewAttribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.RuntimeVisibleorInvisibleAnnotationsAttribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.RuntimeVisibleorInvisibleParameterAnnotationsAttribute;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class ClassConstantPool_ESTest extends ClassConstantPool_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      CPUTF8 cPUTF8_0 = new CPUTF8("st");
      NewAttribute newAttribute0 = new NewAttribute(cPUTF8_0, (byte)11);
      classConstantPool0.addWithNestedEntries(newAttribute0);
      cPUTF8_0.globalIndex = (-3405);
      classConstantPool0.resolve((Segment) null);
      assertEquals(1, classConstantPool0.size());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      Float float0 = new Float(686.0151F);
      CPFloat cPFloat0 = new CPFloat(float0, 0);
      classConstantPool0.add(cPFloat0);
      int int0 = classConstantPool0.size();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      classConstantPool0.add((ClassFileEntry) null);
      // Undeclared exception!
      try { 
        classConstantPool0.resolve((Segment) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ClassConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      int[] intArray0 = new int[4];
      LocalVariableTableAttribute localVariableTableAttribute0 = new LocalVariableTableAttribute((-2389), intArray0, intArray0, (CPUTF8[]) null, (CPUTF8[]) null, intArray0);
      classConstantPool0.add(localVariableTableAttribute0);
      // Undeclared exception!
      try { 
        classConstantPool0.resolve((Segment) null);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.LocalVariableTableAttribute", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      classConstantPool0.resolve((Segment) null);
      // Undeclared exception!
      try { 
        classConstantPool0.get(0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      // Undeclared exception!
      try { 
        classConstantPool0.addWithNestedEntries((ClassFileEntry) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ClassConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      RuntimeVisibleorInvisibleParameterAnnotationsAttribute.ParameterAnnotation[] runtimeVisibleorInvisibleParameterAnnotationsAttribute_ParameterAnnotationArray0 = new RuntimeVisibleorInvisibleParameterAnnotationsAttribute.ParameterAnnotation[8];
      AnnotationsAttribute.Annotation[] annotationsAttribute_AnnotationArray0 = new AnnotationsAttribute.Annotation[0];
      RuntimeVisibleorInvisibleParameterAnnotationsAttribute.ParameterAnnotation runtimeVisibleorInvisibleParameterAnnotationsAttribute_ParameterAnnotation0 = new RuntimeVisibleorInvisibleParameterAnnotationsAttribute.ParameterAnnotation(annotationsAttribute_AnnotationArray0);
      runtimeVisibleorInvisibleParameterAnnotationsAttribute_ParameterAnnotationArray0[0] = runtimeVisibleorInvisibleParameterAnnotationsAttribute_ParameterAnnotation0;
      AnnotationsAttribute.Annotation[] annotationsAttribute_AnnotationArray1 = new AnnotationsAttribute.Annotation[1];
      CPUTF8[] cPUTF8Array0 = new CPUTF8[2];
      AnnotationsAttribute.ElementValue[] annotationsAttribute_ElementValueArray0 = new AnnotationsAttribute.ElementValue[0];
      AnnotationsAttribute.Annotation annotationsAttribute_Annotation0 = new AnnotationsAttribute.Annotation((byte)1, (CPUTF8) null, cPUTF8Array0, annotationsAttribute_ElementValueArray0);
      annotationsAttribute_AnnotationArray1[0] = annotationsAttribute_Annotation0;
      RuntimeVisibleorInvisibleParameterAnnotationsAttribute.ParameterAnnotation runtimeVisibleorInvisibleParameterAnnotationsAttribute_ParameterAnnotation1 = new RuntimeVisibleorInvisibleParameterAnnotationsAttribute.ParameterAnnotation(annotationsAttribute_AnnotationArray1);
      runtimeVisibleorInvisibleParameterAnnotationsAttribute_ParameterAnnotationArray0[1] = runtimeVisibleorInvisibleParameterAnnotationsAttribute_ParameterAnnotation1;
      RuntimeVisibleorInvisibleParameterAnnotationsAttribute runtimeVisibleorInvisibleParameterAnnotationsAttribute0 = new RuntimeVisibleorInvisibleParameterAnnotationsAttribute((CPUTF8) null, runtimeVisibleorInvisibleParameterAnnotationsAttribute_ParameterAnnotationArray0);
      // Undeclared exception!
      try { 
        classConstantPool0.addWithNestedEntries(runtimeVisibleorInvisibleParameterAnnotationsAttribute0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.AnnotationsAttribute$Annotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      classConstantPool0.entriesContainsSet = null;
      Double double0 = new Double((-394.2804946));
      CPDouble cPDouble0 = new CPDouble(double0, 0);
      // Undeclared exception!
      try { 
        classConstantPool0.add(cPDouble0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ClassConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      CPUTF8 cPUTF8_0 = new CPUTF8("X", 1);
      AnnotationsAttribute.Annotation[] annotationsAttribute_AnnotationArray0 = new AnnotationsAttribute.Annotation[8];
      RuntimeVisibleorInvisibleAnnotationsAttribute runtimeVisibleorInvisibleAnnotationsAttribute0 = new RuntimeVisibleorInvisibleAnnotationsAttribute(cPUTF8_0, annotationsAttribute_AnnotationArray0);
      ClassFileEntry classFileEntry0 = classConstantPool0.add(runtimeVisibleorInvisibleAnnotationsAttribute0);
      ClassFileEntry classFileEntry1 = classConstantPool0.add(classFileEntry0);
      assertSame(classFileEntry0, classFileEntry1);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      Integer integer0 = new Integer(0);
      CPInteger cPInteger0 = new CPInteger(integer0, 0);
      ClassFileEntry classFileEntry0 = classConstantPool0.addWithNestedEntries(cPInteger0);
      ClassFileEntry classFileEntry1 = classConstantPool0.add(classFileEntry0);
      assertSame(classFileEntry1, classFileEntry0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      DeprecatedAttribute deprecatedAttribute0 = new DeprecatedAttribute();
      classConstantPool0.add(deprecatedAttribute0);
      // Undeclared exception!
      try { 
        classConstantPool0.addNestedEntries();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ClassConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      ByteCode byteCode0 = ByteCode.getByteCode(0);
      ClassFileEntry classFileEntry0 = classConstantPool0.add(byteCode0);
      assertNull(classFileEntry0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      Double double0 = new Double(2190.642190245);
      CPDouble cPDouble0 = new CPDouble(double0, 1101);
      classConstantPool0.addWithNestedEntries(cPDouble0);
      classConstantPool0.sortClassPool();
      assertEquals(2, classConstantPool0.size());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      Long long0 = new Long(2081L);
      CPLong cPLong0 = new CPLong(long0, (-1));
      classConstantPool0.addWithNestedEntries(cPLong0);
      // Undeclared exception!
      try { 
        classConstantPool0.resolve((Segment) null);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // error
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ClassConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      CPUTF8 cPUTF8_0 = new CPUTF8("st");
      NewAttribute newAttribute0 = new NewAttribute(cPUTF8_0, (byte)11);
      classConstantPool0.resolve((Segment) null);
      int int0 = classConstantPool0.indexOf(newAttribute0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      Integer integer0 = new Integer(0);
      CPInteger cPInteger0 = new CPInteger(integer0, 0);
      // Undeclared exception!
      try { 
        classConstantPool0.indexOf(cPInteger0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Constant pool is not yet resolved; this does not make any sense
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ClassConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      CPUTF8 cPUTF8_0 = new CPUTF8("st");
      NewAttribute newAttribute0 = new NewAttribute(cPUTF8_0, (byte)11);
      classConstantPool0.addWithNestedEntries(newAttribute0);
      classConstantPool0.resolve((Segment) null);
      int int0 = classConstantPool0.indexOf(cPUTF8_0);
      assertEquals(1, classConstantPool0.size());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      // Undeclared exception!
      try { 
        classConstantPool0.get(3020);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Constant pool is not yet resolved; this does not make any sense
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ClassConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      CPUTF8 cPUTF8_0 = new CPUTF8("st");
      NewAttribute newAttribute0 = new NewAttribute(cPUTF8_0, (byte)11);
      classConstantPool0.addWithNestedEntries(newAttribute0);
      HashSet<ClassFileEntry> hashSet0 = new HashSet<ClassFileEntry>();
      classConstantPool0.entriesContainsSet = hashSet0;
      classConstantPool0.addNestedEntries();
      assertEquals(2, classConstantPool0.size());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      Long long0 = new Long(2081L);
      CPLong cPLong0 = new CPLong(long0, 445);
      classConstantPool0.addWithNestedEntries(cPLong0);
      classConstantPool0.resolve((Segment) null);
      classConstantPool0.get(1);
      assertEquals(2, classConstantPool0.size());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      int int0 = classConstantPool0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      classConstantPool0.resolve((Segment) null);
      // Undeclared exception!
      try { 
        classConstantPool0.get(1);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      List<ClassFileEntry> list0 = classConstantPool0.entries();
      assertTrue(list0.isEmpty());
  }
}
