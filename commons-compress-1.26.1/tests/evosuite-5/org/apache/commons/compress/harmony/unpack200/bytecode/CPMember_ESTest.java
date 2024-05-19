
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
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PipedOutputStream;
import java.util.LinkedList;
import java.util.List;
import org.apache.commons.compress.harmony.unpack200.Segment;
import org.apache.commons.compress.harmony.unpack200.bytecode.AnnotationDefaultAttribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.AnnotationsAttribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.Attribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPField;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPMember;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPMethod;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8;
import org.apache.commons.compress.harmony.unpack200.bytecode.ClassConstantPool;
import org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry;
import org.apache.commons.compress.harmony.unpack200.bytecode.CodeAttribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.ExceptionTableEntry;
import org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager;
import org.apache.commons.compress.harmony.unpack200.bytecode.RuntimeVisibleorInvisibleParameterAnnotationsAttribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.SignatureAttribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.SourceFileAttribute;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class CPMember_ESTest extends CPMember_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("org.apache.commons.compress.harmony.unpack200.bytecode.CPMember");
      CPUTF8 cPUTF8_1 = new CPUTF8("", (byte)9);
      LinkedList<Attribute> linkedList0 = new LinkedList<Attribute>();
      CPMember cPMember0 = new CPMember(cPUTF8_0, cPUTF8_1, (-2307L), linkedList0);
      String string0 = cPMember0.toString();
      assertEquals("CPMember: UTF-8:org.apache.commons.compress.harmony.unpack200.bytecode.CPMember(UTF-8:)", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("`Sj+ P@oWE");
      CPUTF8 cPUTF8_1 = new CPUTF8("`Sj+ P@oWE", (byte)10);
      LinkedList<Attribute> linkedList0 = new LinkedList<Attribute>();
      CPMember cPMember0 = new CPMember(cPUTF8_0, cPUTF8_1, (byte)1, linkedList0);
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      classConstantPool0.resolve((Segment) null);
      cPMember0.resolve(classConstantPool0);
      assertEquals(0, classConstantPool0.size());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("`Sj+ P@oWE");
      CPUTF8 cPUTF8_1 = new CPUTF8("`Sj+ P@oWE", (byte)10);
      LinkedList<Attribute> linkedList0 = new LinkedList<Attribute>();
      CPMember cPMember0 = new CPMember(cPUTF8_0, cPUTF8_1, (byte)1, linkedList0);
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      // Undeclared exception!
      try { 
        cPMember0.resolve(classConstantPool0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Constant pool is not yet resolved; this does not make any sense
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ClassConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("`Sj+ P@oWE");
      CPUTF8 cPUTF8_1 = new CPUTF8("`Sj+ P@oWE", (byte)10);
      LinkedList<Attribute> linkedList0 = new LinkedList<Attribute>();
      CPMember cPMember0 = new CPMember(cPUTF8_0, cPUTF8_1, (byte)1, linkedList0);
      cPMember0.hashCode();
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("CPMember: ", 0);
      LinkedList<Attribute> linkedList0 = new LinkedList<Attribute>();
      SourceFileAttribute sourceFileAttribute0 = new SourceFileAttribute(cPUTF8_0);
      linkedList0.offer(sourceFileAttribute0);
      CPField cPField0 = new CPField(cPUTF8_0, cPUTF8_0, (byte)1, linkedList0);
      linkedList0.add((Attribute) sourceFileAttribute0);
      ClassFileEntry[] classFileEntryArray0 = cPField0.getNestedClassFileEntries();
      assertEquals(4, classFileEntryArray0.length);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("", 1125);
      CPUTF8 cPUTF8_1 = new CPUTF8("");
      LinkedList<Attribute> linkedList0 = new LinkedList<Attribute>();
      CPMember cPMember0 = new CPMember(cPUTF8_0, cPUTF8_1, (byte)1, linkedList0);
      ClassFileEntry[] classFileEntryArray0 = cPMember0.getNestedClassFileEntries();
      assertEquals(2, classFileEntryArray0.length);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("y[* 5h(g.", 0);
      LinkedList<Attribute> linkedList0 = new LinkedList<Attribute>();
      CPMethod cPMethod0 = new CPMethod(cPUTF8_0, cPUTF8_0, 0, linkedList0);
      CPMethod cPMethod1 = new CPMethod(cPUTF8_0, cPUTF8_0, (byte)7, linkedList0);
      boolean boolean0 = cPMethod0.equals(cPMethod1);
      assertFalse(cPMethod1.equals((Object)cPMethod0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("y[* 5h(g.", 0);
      LinkedList<Attribute> linkedList0 = new LinkedList<Attribute>();
      Object object0 = new Object();
      AnnotationsAttribute.ElementValue annotationsAttribute_ElementValue0 = new AnnotationsAttribute.ElementValue((byte)10, object0);
      AnnotationDefaultAttribute annotationDefaultAttribute0 = new AnnotationDefaultAttribute(annotationsAttribute_ElementValue0);
      linkedList0.add((Attribute) annotationDefaultAttribute0);
      CPMethod cPMethod0 = new CPMethod(cPUTF8_0, cPUTF8_0, 1391L, linkedList0);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("y[* 5h(g.");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFileOutputStream0);
      cPMethod0.descriptorIndex = (int) (byte)5;
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockPrintStream0);
      // Undeclared exception!
      try { 
        cPMethod0.doWrite(dataOutputStream0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // 
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.AnnotationsAttribute$ElementValue", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("lstore_2", (-1));
      LinkedList<Attribute> linkedList0 = new LinkedList<Attribute>();
      CPMember cPMember0 = new CPMember(cPUTF8_0, cPUTF8_0, (byte)1, linkedList0);
      SignatureAttribute signatureAttribute0 = new SignatureAttribute((CPUTF8) null);
      linkedList0.add((Attribute) signatureAttribute0);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("lstore_2", true);
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream(mockFileOutputStream0);
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream(bufferedOutputStream0);
      DataOutputStream dataOutputStream0 = new DataOutputStream(objectOutputStream0);
      cPMember0.nameIndex = (-1);
      cPMember0.doWrite(dataOutputStream0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("#");
      LinkedList<Attribute> linkedList0 = new LinkedList<Attribute>();
      CPMember cPMember0 = new CPMember(cPUTF8_0, cPUTF8_0, (byte)6, linkedList0);
      // Undeclared exception!
      try { 
        cPMember0.resolve((ClassConstantPool) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.CPMember", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("w<1O4nB");
      CPMember cPMember0 = new CPMember(cPUTF8_0, cPUTF8_0, (byte)3, (List<Attribute>) null);
      cPMember0.attributes = null;
      // Undeclared exception!
      try { 
        cPMember0.hashCode();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.CPMember", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8(")");
      CPMethod cPMethod0 = new CPMethod(cPUTF8_0, cPUTF8_0, (byte)6, (List<Attribute>) null);
      cPMethod0.attributes = null;
      // Undeclared exception!
      try { 
        cPMethod0.getNestedClassFileEntries();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.CPMember", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("w<1O4nB");
      CPMember cPMember0 = new CPMember(cPUTF8_0, cPUTF8_0, (byte)3, (List<Attribute>) null);
      cPMember0.attributes = null;
      CPMember cPMember1 = new CPMember(cPUTF8_0, cPUTF8_0, 0L, (List<Attribute>) null);
      // Undeclared exception!
      try { 
        cPMember0.equals(cPMember1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.CPMember", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("Nothing but CP_METHOD can be an <init>", 1);
      LinkedList<Attribute> linkedList0 = new LinkedList<Attribute>();
      CPField cPField0 = new CPField(cPUTF8_0, cPUTF8_0, (byte)8, linkedList0);
      DataOutputStream dataOutputStream0 = new DataOutputStream((OutputStream) null);
      // Undeclared exception!
      try { 
        cPField0.doWrite(dataOutputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("y[* 5h(g.", 0);
      LinkedList<Attribute> linkedList0 = new LinkedList<Attribute>();
      Object object0 = new Object();
      AnnotationsAttribute.ElementValue annotationsAttribute_ElementValue0 = new AnnotationsAttribute.ElementValue((byte)10, object0);
      CPMethod cPMethod0 = new CPMethod(cPUTF8_0, cPUTF8_0, 1391L, linkedList0);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("y[* 5h(g.");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFileOutputStream0);
      RuntimeVisibleorInvisibleParameterAnnotationsAttribute.ParameterAnnotation[] runtimeVisibleorInvisibleParameterAnnotationsAttribute_ParameterAnnotationArray0 = new RuntimeVisibleorInvisibleParameterAnnotationsAttribute.ParameterAnnotation[2];
      AnnotationsAttribute.Annotation[] annotationsAttribute_AnnotationArray0 = new AnnotationsAttribute.Annotation[7];
      CPUTF8[] cPUTF8Array0 = new CPUTF8[8];
      AnnotationsAttribute.ElementValue[] annotationsAttribute_ElementValueArray0 = new AnnotationsAttribute.ElementValue[2];
      annotationsAttribute_ElementValueArray0[0] = annotationsAttribute_ElementValue0;
      annotationsAttribute_ElementValueArray0[1] = annotationsAttribute_ElementValue0;
      AnnotationsAttribute.Annotation annotationsAttribute_Annotation0 = new AnnotationsAttribute.Annotation(1454, cPUTF8_0, cPUTF8Array0, annotationsAttribute_ElementValueArray0);
      annotationsAttribute_AnnotationArray0[0] = annotationsAttribute_Annotation0;
      RuntimeVisibleorInvisibleParameterAnnotationsAttribute.ParameterAnnotation runtimeVisibleorInvisibleParameterAnnotationsAttribute_ParameterAnnotation0 = new RuntimeVisibleorInvisibleParameterAnnotationsAttribute.ParameterAnnotation(annotationsAttribute_AnnotationArray0);
      runtimeVisibleorInvisibleParameterAnnotationsAttribute_ParameterAnnotationArray0[0] = runtimeVisibleorInvisibleParameterAnnotationsAttribute_ParameterAnnotation0;
      RuntimeVisibleorInvisibleParameterAnnotationsAttribute runtimeVisibleorInvisibleParameterAnnotationsAttribute0 = new RuntimeVisibleorInvisibleParameterAnnotationsAttribute(cPUTF8_0, runtimeVisibleorInvisibleParameterAnnotationsAttribute_ParameterAnnotationArray0);
      linkedList0.add((Attribute) runtimeVisibleorInvisibleParameterAnnotationsAttribute0);
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockPrintStream0);
      // Undeclared exception!
      try { 
        cPMethod0.doWrite(dataOutputStream0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.AnnotationsAttribute$Annotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("fI!\"QU|A0!<znE", 31);
      LinkedList<Attribute> linkedList0 = new LinkedList<Attribute>();
      CPField cPField0 = new CPField(cPUTF8_0, cPUTF8_0, (-382L), linkedList0);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      DataOutputStream dataOutputStream0 = new DataOutputStream(pipedOutputStream0);
      try { 
        cPField0.doWrite(dataOutputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      int[] intArray0 = new int[9];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = new CodeAttribute((-1), (byte)6, byteArray0, (Segment) null, operandManager0, linkedList0);
      CPMember cPMember0 = null;
      try {
        cPMember0 = new CPMember((CPUTF8) null, (CPUTF8) null, 1000L, codeAttribute0.attributes);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // name
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("y[* 5h(g.", 0);
      LinkedList<Attribute> linkedList0 = new LinkedList<Attribute>();
      CPMethod cPMethod0 = new CPMethod(cPUTF8_0, cPUTF8_0, (byte)7, linkedList0);
      CPMethod cPMethod1 = new CPMethod(cPUTF8_0, cPUTF8_0, (byte)7, linkedList0);
      boolean boolean0 = cPMethod0.equals(cPMethod1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("w<1O4nB");
      CPMember cPMember0 = new CPMember(cPUTF8_0, cPUTF8_0, (byte)3, (List<Attribute>) null);
      CPUTF8 cPUTF8_1 = new CPUTF8("CPMember: UTF-8:w<1O4nB(UTF-8:w<1O4nB)", 186);
      CPMember cPMember1 = new CPMember(cPUTF8_1, cPUTF8_1, (byte)1, (List<Attribute>) null);
      boolean boolean0 = cPMember0.equals(cPMember1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("y[* 5h(g.", 0);
      LinkedList<Attribute> linkedList0 = new LinkedList<Attribute>();
      Object object0 = new Object();
      AnnotationsAttribute.ElementValue annotationsAttribute_ElementValue0 = new AnnotationsAttribute.ElementValue((byte)10, object0);
      AnnotationDefaultAttribute annotationDefaultAttribute0 = new AnnotationDefaultAttribute(annotationsAttribute_ElementValue0);
      linkedList0.add((Attribute) annotationDefaultAttribute0);
      CPMethod cPMethod0 = new CPMethod(cPUTF8_0, cPUTF8_0, (byte)7, linkedList0);
      CPMethod cPMethod1 = new CPMethod(cPUTF8_0, cPUTF8_0, (byte)7, linkedList0);
      assertTrue(cPMethod1.equals((Object)cPMethod0));
      
      LinkedList<Attribute> linkedList1 = new LinkedList<Attribute>();
      cPMethod0.attributes = (List<Attribute>) linkedList1;
      boolean boolean0 = cPMethod0.equals(cPMethod1);
      assertFalse(cPMethod1.equals((Object)cPMethod0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("iRfX");
      LinkedList<Attribute> linkedList0 = new LinkedList<Attribute>();
      CPMember cPMember0 = new CPMember(cPUTF8_0, cPUTF8_0, (byte)12, linkedList0);
      CPMethod cPMethod0 = new CPMethod(cPUTF8_0, cPUTF8_0, (byte)11, linkedList0);
      boolean boolean0 = cPMember0.equals(cPMethod0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("");
      CPMethod cPMethod0 = new CPMethod(cPUTF8_0, cPUTF8_0, (byte)8, (List<Attribute>) null);
      boolean boolean0 = cPMethod0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("y[* 5h(8Dg.", 0);
      LinkedList<Attribute> linkedList0 = new LinkedList<Attribute>();
      CPMethod cPMethod0 = new CPMethod(cPUTF8_0, cPUTF8_0, (byte)3, linkedList0);
      boolean boolean0 = cPMethod0.equals(cPMethod0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("y[* 5h(g.", 0);
      LinkedList<Attribute> linkedList0 = new LinkedList<Attribute>();
      CPMethod cPMethod0 = new CPMethod(cPUTF8_0, cPUTF8_0, 1391L, linkedList0);
      CPMethod cPMethod1 = new CPMethod(cPUTF8_0, cPUTF8_0, (byte)7, linkedList0);
      boolean boolean0 = cPMethod0.equals(cPMethod1);
      assertFalse(boolean0);
      assertFalse(cPMethod1.equals((Object)cPMethod0));
  }
}
