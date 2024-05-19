
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
import java.io.IOException;
import java.io.OutputStream;
import java.io.PipedOutputStream;
import org.apache.commons.compress.harmony.unpack200.Segment;
import org.apache.commons.compress.harmony.unpack200.bytecode.AnnotationDefaultAttribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.AnnotationsAttribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPClass;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPFloat;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8;
import org.apache.commons.compress.harmony.unpack200.bytecode.ClassConstantPool;
import org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry;
import org.apache.commons.compress.harmony.unpack200.bytecode.ConstantPoolEntry;
import org.apache.commons.compress.harmony.unpack200.bytecode.ConstantValueAttribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.DeprecatedAttribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.ExceptionsAttribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.InnerClassesAttribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.LineNumberTableAttribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.LocalVariableTypeTableAttribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.NewAttribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.RuntimeVisibleorInvisibleAnnotationsAttribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.RuntimeVisibleorInvisibleParameterAnnotationsAttribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.SourceFileAttribute;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class Attribute_ESTest extends Attribute_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      int[] intArray0 = new int[6];
      LineNumberTableAttribute lineNumberTableAttribute0 = new LineNumberTableAttribute(0, intArray0, intArray0);
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      classConstantPool0.resolve((Segment) null);
      lineNumberTableAttribute0.resolve(classConstantPool0);
      assertFalse(lineNumberTableAttribute0.isSourceFileAttribute());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("dstore", (-498));
      SourceFileAttribute sourceFileAttribute0 = new SourceFileAttribute(cPUTF8_0);
      File file0 = MockFile.createTempFile("wX|", "wX|");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(file0, false);
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockFileOutputStream0);
      sourceFileAttribute0.doWrite(dataOutputStream0);
      assertTrue(sourceFileAttribute0.isSourceFileAttribute());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SourceFileAttribute sourceFileAttribute0 = new SourceFileAttribute((CPUTF8) null);
      boolean boolean0 = sourceFileAttribute0.isSourceFileAttribute();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("@+", 0);
      NewAttribute newAttribute0 = new NewAttribute(cPUTF8_0, (-2589));
      boolean boolean0 = newAttribute0.hasBCIRenumbering();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      int[] intArray0 = new int[10];
      LineNumberTableAttribute lineNumberTableAttribute0 = new LineNumberTableAttribute((-319), intArray0, intArray0);
      int int0 = lineNumberTableAttribute0.getLengthIncludingHeader();
      assertEquals((-1268), int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      int[] intArray0 = new int[8];
      LocalVariableTypeTableAttribute localVariableTypeTableAttribute0 = new LocalVariableTypeTableAttribute(1, intArray0, intArray0, (CPUTF8[]) null, (CPUTF8[]) null, intArray0);
      CPUTF8 cPUTF8_0 = localVariableTypeTableAttribute0.getAttributeName();
      assertNull(cPUTF8_0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("", 3736);
      NewAttribute newAttribute0 = new NewAttribute(cPUTF8_0, (-522));
      CPUTF8 cPUTF8_1 = newAttribute0.getAttributeName();
      assertEquals((byte)5, ConstantPoolEntry.CP_Long);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("");
      NewAttribute newAttribute0 = new NewAttribute(cPUTF8_0, 213);
      CPUTF8 cPUTF8_1 = newAttribute0.getAttributeName();
      assertEquals((byte)1, ConstantPoolEntry.CP_UTF8);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      AnnotationsAttribute.ElementValue annotationsAttribute_ElementValue0 = new AnnotationsAttribute.ElementValue(173, (Object) null);
      AnnotationDefaultAttribute annotationDefaultAttribute0 = new AnnotationDefaultAttribute(annotationsAttribute_ElementValue0);
      // Undeclared exception!
      try { 
        annotationDefaultAttribute0.resolve((ClassConstantPool) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.Attribute", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("");
      RuntimeVisibleorInvisibleParameterAnnotationsAttribute.ParameterAnnotation[] runtimeVisibleorInvisibleParameterAnnotationsAttribute_ParameterAnnotationArray0 = new RuntimeVisibleorInvisibleParameterAnnotationsAttribute.ParameterAnnotation[6];
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

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      int[] intArray0 = new int[8];
      LocalVariableTypeTableAttribute localVariableTypeTableAttribute0 = new LocalVariableTypeTableAttribute(1, intArray0, intArray0, (CPUTF8[]) null, (CPUTF8[]) null, intArray0);
      // Undeclared exception!
      try { 
        localVariableTypeTableAttribute0.getNestedClassFileEntries();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.LocalVariableTypeTableAttribute", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("mEg-", (-2358));
      RuntimeVisibleorInvisibleParameterAnnotationsAttribute.ParameterAnnotation[] runtimeVisibleorInvisibleParameterAnnotationsAttribute_ParameterAnnotationArray0 = new RuntimeVisibleorInvisibleParameterAnnotationsAttribute.ParameterAnnotation[3];
      AnnotationsAttribute.Annotation[] annotationsAttribute_AnnotationArray0 = new AnnotationsAttribute.Annotation[7];
      CPUTF8[] cPUTF8Array0 = new CPUTF8[6];
      AnnotationsAttribute.ElementValue[] annotationsAttribute_ElementValueArray0 = new AnnotationsAttribute.ElementValue[3];
      Object object0 = new Object();
      AnnotationsAttribute.ElementValue annotationsAttribute_ElementValue0 = new AnnotationsAttribute.ElementValue(279, object0);
      annotationsAttribute_ElementValueArray0[0] = annotationsAttribute_ElementValue0;
      annotationsAttribute_ElementValueArray0[1] = annotationsAttribute_ElementValueArray0[0];
      annotationsAttribute_ElementValueArray0[2] = annotationsAttribute_ElementValueArray0[1];
      AnnotationsAttribute.Annotation annotationsAttribute_Annotation0 = new AnnotationsAttribute.Annotation(1, cPUTF8_0, cPUTF8Array0, annotationsAttribute_ElementValueArray0);
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
         // 3
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.AnnotationsAttribute$Annotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("CVL8r5,4~Jv");
      AnnotationsAttribute.Annotation[] annotationsAttribute_AnnotationArray0 = new AnnotationsAttribute.Annotation[9];
      RuntimeVisibleorInvisibleAnnotationsAttribute runtimeVisibleorInvisibleAnnotationsAttribute0 = new RuntimeVisibleorInvisibleAnnotationsAttribute(cPUTF8_0, annotationsAttribute_AnnotationArray0);
      // Undeclared exception!
      try { 
        runtimeVisibleorInvisibleAnnotationsAttribute0.getLengthIncludingHeader();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.RuntimeVisibleorInvisibleAnnotationsAttribute", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("CVL8r5,4~Jv");
      AnnotationsAttribute.Annotation[] annotationsAttribute_AnnotationArray0 = new AnnotationsAttribute.Annotation[9];
      CPUTF8[] cPUTF8Array0 = new CPUTF8[4];
      AnnotationsAttribute.ElementValue[] annotationsAttribute_ElementValueArray0 = new AnnotationsAttribute.ElementValue[0];
      AnnotationsAttribute.Annotation annotationsAttribute_Annotation0 = new AnnotationsAttribute.Annotation((byte)12, cPUTF8_0, cPUTF8Array0, annotationsAttribute_ElementValueArray0);
      annotationsAttribute_AnnotationArray0[0] = annotationsAttribute_Annotation0;
      RuntimeVisibleorInvisibleAnnotationsAttribute runtimeVisibleorInvisibleAnnotationsAttribute0 = new RuntimeVisibleorInvisibleAnnotationsAttribute(cPUTF8_0, annotationsAttribute_AnnotationArray0);
      // Undeclared exception!
      try { 
        runtimeVisibleorInvisibleAnnotationsAttribute0.getLengthIncludingHeader();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.AnnotationsAttribute$Annotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      int[] intArray0 = new int[8];
      LineNumberTableAttribute lineNumberTableAttribute0 = new LineNumberTableAttribute((-1), intArray0, intArray0);
      DataOutputStream dataOutputStream0 = new DataOutputStream((OutputStream) null);
      // Undeclared exception!
      try { 
        lineNumberTableAttribute0.doWrite(dataOutputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      int[] intArray0 = new int[3];
      LineNumberTableAttribute lineNumberTableAttribute0 = new LineNumberTableAttribute(31, intArray0, intArray0);
      MockPrintStream mockPrintStream0 = new MockPrintStream(",Se=0`:q]");
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockPrintStream0);
      // Undeclared exception!
      try { 
        lineNumberTableAttribute0.doWrite(dataOutputStream0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.LineNumberTableAttribute", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      int[] intArray0 = new int[8];
      LineNumberTableAttribute lineNumberTableAttribute0 = new LineNumberTableAttribute(0, intArray0, intArray0);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      DataOutputStream dataOutputStream0 = new DataOutputStream(pipedOutputStream0);
      try { 
        lineNumberTableAttribute0.doWrite(dataOutputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("Current class not set yet");
      InnerClassesAttribute innerClassesAttribute0 = new InnerClassesAttribute("Current class not set yet");
      ConstantValueAttribute constantValueAttribute0 = new ConstantValueAttribute(cPUTF8_0);
      ConstantValueAttribute.setAttributeName(cPUTF8_0);
      ConstantValueAttribute constantValueAttribute1 = new ConstantValueAttribute(innerClassesAttribute0);
      boolean boolean0 = constantValueAttribute0.equals(constantValueAttribute1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("Current class not set yet");
      InnerClassesAttribute innerClassesAttribute0 = new InnerClassesAttribute("Current class not set yet");
      ConstantValueAttribute constantValueAttribute0 = new ConstantValueAttribute(cPUTF8_0);
      boolean boolean0 = innerClassesAttribute0.equals(constantValueAttribute0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      int[] intArray0 = new int[8];
      LocalVariableTypeTableAttribute localVariableTypeTableAttribute0 = new LocalVariableTypeTableAttribute((-1), intArray0, intArray0, (CPUTF8[]) null, (CPUTF8[]) null, intArray0);
      boolean boolean0 = localVariableTypeTableAttribute0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DeprecatedAttribute deprecatedAttribute0 = new DeprecatedAttribute();
      boolean boolean0 = deprecatedAttribute0.equals(deprecatedAttribute0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Float float0 = new Float(2264.523F);
      CPFloat cPFloat0 = new CPFloat(float0, 1823);
      ConstantValueAttribute constantValueAttribute0 = new ConstantValueAttribute(cPFloat0);
      ConstantValueAttribute constantValueAttribute1 = new ConstantValueAttribute(constantValueAttribute0);
      boolean boolean0 = constantValueAttribute0.equals(constantValueAttribute1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DeprecatedAttribute deprecatedAttribute0 = new DeprecatedAttribute();
      boolean boolean0 = deprecatedAttribute0.isSourceFileAttribute();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      CPClass[] cPClassArray0 = new CPClass[8];
      ExceptionsAttribute exceptionsAttribute0 = new ExceptionsAttribute(cPClassArray0);
      boolean boolean0 = exceptionsAttribute0.hasBCIRenumbering();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      int[] intArray0 = new int[3];
      LineNumberTableAttribute lineNumberTableAttribute0 = new LineNumberTableAttribute(31, intArray0, intArray0);
      int int0 = lineNumberTableAttribute0.getLengthIncludingHeader();
      assertEquals(132, int0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      int[] intArray0 = new int[8];
      LineNumberTableAttribute lineNumberTableAttribute0 = new LineNumberTableAttribute(0, intArray0, intArray0);
      lineNumberTableAttribute0.hashCode();
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DeprecatedAttribute deprecatedAttribute0 = new DeprecatedAttribute();
      ClassFileEntry[] classFileEntryArray0 = deprecatedAttribute0.getNestedClassFileEntries();
      assertEquals(1, classFileEntryArray0.length);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Object object0 = new Object();
      AnnotationsAttribute.ElementValue annotationsAttribute_ElementValue0 = new AnnotationsAttribute.ElementValue(122, object0);
      AnnotationDefaultAttribute annotationDefaultAttribute0 = new AnnotationDefaultAttribute(annotationsAttribute_ElementValue0);
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      MockPrintStream mockPrintStream0 = new MockPrintStream(byteArrayOutputStream0);
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockPrintStream0);
      // Undeclared exception!
      try { 
        annotationDefaultAttribute0.doWrite(dataOutputStream0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // 
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.AnnotationsAttribute$ElementValue", e);
      }
  }
}
