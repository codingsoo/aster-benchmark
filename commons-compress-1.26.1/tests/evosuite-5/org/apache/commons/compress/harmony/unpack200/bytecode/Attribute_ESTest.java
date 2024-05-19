
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
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PipedOutputStream;
import java.util.LinkedList;
import org.apache.commons.compress.harmony.unpack200.Segment;
import org.apache.commons.compress.harmony.unpack200.bytecode.AnnotationDefaultAttribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.AnnotationsAttribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPClass;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPNameAndType;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8;
import org.apache.commons.compress.harmony.unpack200.bytecode.ClassConstantPool;
import org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry;
import org.apache.commons.compress.harmony.unpack200.bytecode.CodeAttribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.ConstantValueAttribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.DeprecatedAttribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.EnclosingMethodAttribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.ExceptionTableEntry;
import org.apache.commons.compress.harmony.unpack200.bytecode.ExceptionsAttribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.LineNumberTableAttribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.LocalVariableTableAttribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.LocalVariableTypeTableAttribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.NewAttribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager;
import org.apache.commons.compress.harmony.unpack200.bytecode.RuntimeVisibleorInvisibleAnnotationsAttribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.RuntimeVisibleorInvisibleParameterAnnotationsAttribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.SourceFileAttribute;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class Attribute_ESTest extends Attribute_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DeprecatedAttribute deprecatedAttribute0 = new DeprecatedAttribute();
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      classConstantPool0.resolve((Segment) null);
      deprecatedAttribute0.resolve(classConstantPool0);
      assertEquals(0, classConstantPool0.size());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("");
      NewAttribute newAttribute0 = new NewAttribute(cPUTF8_0, (byte)3);
      newAttribute0.hashCode();
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SourceFileAttribute sourceFileAttribute0 = new SourceFileAttribute((CPUTF8) null);
      File file0 = MockFile.createTempFile("b$-snGq", "b$-snGq");
      MockPrintStream mockPrintStream0 = new MockPrintStream(file0);
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockPrintStream0);
      sourceFileAttribute0.doWrite(dataOutputStream0);
      assertTrue(sourceFileAttribute0.isSourceFileAttribute());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("iDC[K&");
      SourceFileAttribute sourceFileAttribute0 = new SourceFileAttribute(cPUTF8_0);
      boolean boolean0 = sourceFileAttribute0.isSourceFileAttribute();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      int[] intArray0 = new int[2];
      CPUTF8[] cPUTF8Array0 = new CPUTF8[1];
      LocalVariableTypeTableAttribute localVariableTypeTableAttribute0 = new LocalVariableTypeTableAttribute(0, intArray0, intArray0, cPUTF8Array0, cPUTF8Array0, intArray0);
      boolean boolean0 = localVariableTypeTableAttribute0.hasBCIRenumbering();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      int[] intArray0 = new int[3];
      LineNumberTableAttribute lineNumberTableAttribute0 = new LineNumberTableAttribute((-1173), intArray0, intArray0);
      int int0 = lineNumberTableAttribute0.getLengthIncludingHeader();
      assertEquals((-4684), int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CPClass[] cPClassArray0 = new CPClass[0];
      ExceptionsAttribute exceptionsAttribute0 = new ExceptionsAttribute(cPClassArray0);
      CPUTF8 cPUTF8_0 = exceptionsAttribute0.getAttributeName();
      assertNull(cPUTF8_0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("");
      NewAttribute newAttribute0 = new NewAttribute(cPUTF8_0, (byte)3);
      cPUTF8_0.setGlobalIndex(829);
      CPUTF8 cPUTF8_1 = newAttribute0.getAttributeName();
      assertSame(cPUTF8_0, cPUTF8_1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("C.SZ> H?LJayW&");
      NewAttribute newAttribute0 = new NewAttribute(cPUTF8_0, (byte)1);
      CPUTF8 cPUTF8_1 = newAttribute0.getAttributeName();
      assertSame(cPUTF8_0, cPUTF8_1);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DeprecatedAttribute deprecatedAttribute0 = new DeprecatedAttribute();
      Object object0 = new Object();
      boolean boolean0 = deprecatedAttribute0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("");
      CPClass cPClass0 = new CPClass(cPUTF8_0, (byte)3);
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, cPUTF8_0, (byte)8);
      EnclosingMethodAttribute enclosingMethodAttribute0 = new EnclosingMethodAttribute(cPClass0, cPNameAndType0);
      // Undeclared exception!
      try { 
        enclosingMethodAttribute0.resolve((ClassConstantPool) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.Attribute", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("E-P", 2);
      RuntimeVisibleorInvisibleParameterAnnotationsAttribute.ParameterAnnotation[] runtimeVisibleorInvisibleParameterAnnotationsAttribute_ParameterAnnotationArray0 = new RuntimeVisibleorInvisibleParameterAnnotationsAttribute.ParameterAnnotation[5];
      RuntimeVisibleorInvisibleParameterAnnotationsAttribute runtimeVisibleorInvisibleParameterAnnotationsAttribute0 = new RuntimeVisibleorInvisibleParameterAnnotationsAttribute(cPUTF8_0, runtimeVisibleorInvisibleParameterAnnotationsAttribute_ParameterAnnotationArray0);
      // Undeclared exception!
      try { 
        runtimeVisibleorInvisibleParameterAnnotationsAttribute0.getNestedClassFileEntries();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.RuntimeVisibleorInvisibleParameterAnnotationsAttribute", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      int[] intArray0 = new int[9];
      CPUTF8[] cPUTF8Array0 = new CPUTF8[4];
      LocalVariableTableAttribute localVariableTableAttribute0 = new LocalVariableTableAttribute(5718, intArray0, intArray0, cPUTF8Array0, cPUTF8Array0, intArray0);
      // Undeclared exception!
      try { 
        localVariableTableAttribute0.getNestedClassFileEntries();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 4
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.LocalVariableTableAttribute", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ExceptionsAttribute exceptionsAttribute0 = new ExceptionsAttribute((CPClass[]) null);
      // Undeclared exception!
      try { 
        exceptionsAttribute0.getLengthIncludingHeader();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ExceptionsAttribute", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      int[] intArray0 = new int[2];
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
      Object object0 = new Object();
      AnnotationsAttribute.ElementValue annotationsAttribute_ElementValue0 = new AnnotationsAttribute.ElementValue((-588), object0);
      AnnotationDefaultAttribute annotationDefaultAttribute0 = new AnnotationDefaultAttribute(annotationsAttribute_ElementValue0);
      MockPrintStream mockPrintStream0 = new MockPrintStream("AnnotationDefault: org.apache.commons.compress.harmony.unpack200.bytecode.AnnotationsAttribute$ElementValue@1");
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

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("Eo-", 2);
      ConstantValueAttribute constantValueAttribute0 = new ConstantValueAttribute(cPUTF8_0);
      ConstantValueAttribute.setAttributeName(cPUTF8_0);
      ConstantValueAttribute constantValueAttribute1 = new ConstantValueAttribute(constantValueAttribute0);
      boolean boolean0 = constantValueAttribute0.equals(constantValueAttribute1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SourceFileAttribute sourceFileAttribute0 = new SourceFileAttribute((CPUTF8) null);
      boolean boolean0 = sourceFileAttribute0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("Eo-", 2);
      ConstantValueAttribute constantValueAttribute0 = new ConstantValueAttribute(cPUTF8_0);
      ConstantValueAttribute constantValueAttribute1 = new ConstantValueAttribute(constantValueAttribute0);
      boolean boolean0 = constantValueAttribute0.equals(constantValueAttribute1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      int[] intArray0 = new int[8];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = new CodeAttribute(1, (-1225), byteArray0, (Segment) null, operandManager0, linkedList0);
      boolean boolean0 = codeAttribute0.isSourceFileAttribute();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("<bXI?@XI925}'i5", (-1756));
      AnnotationsAttribute.Annotation[] annotationsAttribute_AnnotationArray0 = new AnnotationsAttribute.Annotation[0];
      RuntimeVisibleorInvisibleAnnotationsAttribute runtimeVisibleorInvisibleAnnotationsAttribute0 = new RuntimeVisibleorInvisibleAnnotationsAttribute(cPUTF8_0, annotationsAttribute_AnnotationArray0);
      boolean boolean0 = runtimeVisibleorInvisibleAnnotationsAttribute0.hasBCIRenumbering();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("");
      NewAttribute newAttribute0 = new NewAttribute(cPUTF8_0, (byte)3);
      int int0 = newAttribute0.getLengthIncludingHeader();
      assertEquals(6, int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DeprecatedAttribute deprecatedAttribute0 = new DeprecatedAttribute();
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      // Undeclared exception!
      try { 
        deprecatedAttribute0.resolve(classConstantPool0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Constant pool is not yet resolved; this does not make any sense
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ClassConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DeprecatedAttribute deprecatedAttribute0 = new DeprecatedAttribute();
      ClassFileEntry[] classFileEntryArray0 = deprecatedAttribute0.getNestedClassFileEntries();
      assertEquals(1, classFileEntryArray0.length);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("E-P", 2);
      ConstantValueAttribute constantValueAttribute0 = new ConstantValueAttribute(cPUTF8_0);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      DataOutputStream dataOutputStream0 = new DataOutputStream(pipedOutputStream0);
      try { 
        constantValueAttribute0.doWrite(dataOutputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }
}
