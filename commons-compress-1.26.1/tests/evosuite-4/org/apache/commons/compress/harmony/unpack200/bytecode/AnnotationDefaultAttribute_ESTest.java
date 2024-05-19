
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
import java.io.PipedOutputStream;
import java.util.LinkedList;
import java.util.List;
import org.apache.commons.compress.harmony.unpack200.Segment;
import org.apache.commons.compress.harmony.unpack200.bytecode.AnnotationDefaultAttribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.AnnotationsAttribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.Attribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPField;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8;
import org.apache.commons.compress.harmony.unpack200.bytecode.ClassConstantPool;
import org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry;
import org.apache.commons.compress.harmony.unpack200.bytecode.ConstantPoolEntry;
import org.apache.commons.compress.harmony.unpack200.bytecode.LocalVariableTableAttribute;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class AnnotationDefaultAttribute_ESTest extends AnnotationDefaultAttribute_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Object object0 = new Object();
      AnnotationsAttribute.ElementValue annotationsAttribute_ElementValue0 = new AnnotationsAttribute.ElementValue(0, object0);
      AnnotationDefaultAttribute annotationDefaultAttribute0 = new AnnotationDefaultAttribute(annotationsAttribute_ElementValue0);
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      classConstantPool0.resolve((Segment) null);
      annotationDefaultAttribute0.resolve(classConstantPool0);
      assertEquals(0, classConstantPool0.size());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      int[] intArray0 = new int[4];
      CPUTF8[] cPUTF8Array0 = new CPUTF8[0];
      LocalVariableTableAttribute localVariableTableAttribute0 = new LocalVariableTableAttribute(196, intArray0, intArray0, cPUTF8Array0, cPUTF8Array0, intArray0);
      AnnotationsAttribute.ElementValue annotationsAttribute_ElementValue0 = new AnnotationsAttribute.ElementValue(73, localVariableTableAttribute0);
      AnnotationDefaultAttribute annotationDefaultAttribute0 = new AnnotationDefaultAttribute(annotationsAttribute_ElementValue0);
      int int0 = annotationDefaultAttribute0.getLength();
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      AnnotationsAttribute.ElementValue annotationsAttribute_ElementValue0 = new AnnotationsAttribute.ElementValue(2332, (Object) null);
      AnnotationDefaultAttribute annotationDefaultAttribute0 = new AnnotationDefaultAttribute(annotationsAttribute_ElementValue0);
      // Undeclared exception!
      try { 
        annotationDefaultAttribute0.writeBody((DataOutputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.AnnotationsAttribute$ElementValue", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Object object0 = new Object();
      AnnotationsAttribute.ElementValue annotationsAttribute_ElementValue0 = new AnnotationsAttribute.ElementValue((-359), object0);
      AnnotationDefaultAttribute annotationDefaultAttribute0 = new AnnotationDefaultAttribute(annotationsAttribute_ElementValue0);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("p*.4#M4-H4%_n2r");
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockFileOutputStream0);
      // Undeclared exception!
      try { 
        annotationDefaultAttribute0.writeBody(dataOutputStream0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // 
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.AnnotationsAttribute$ElementValue", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("AnnotationDefault: ");
      CPField cPField0 = new CPField(cPUTF8_0, cPUTF8_0, 2370L, (List<Attribute>) null);
      AnnotationsAttribute.ElementValue annotationsAttribute_ElementValue0 = new AnnotationsAttribute.ElementValue((-1317), cPField0);
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
  public void test05()  throws Throwable  {
      AnnotationDefaultAttribute annotationDefaultAttribute0 = new AnnotationDefaultAttribute((AnnotationsAttribute.ElementValue) null);
      // Undeclared exception!
      try { 
        annotationDefaultAttribute0.getNestedClassFileEntries();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.AnnotationDefaultAttribute", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      AnnotationDefaultAttribute annotationDefaultAttribute0 = new AnnotationDefaultAttribute((AnnotationsAttribute.ElementValue) null);
      // Undeclared exception!
      try { 
        annotationDefaultAttribute0.getLength();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.AnnotationDefaultAttribute", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Object object0 = new Object();
      AnnotationsAttribute.ElementValue annotationsAttribute_ElementValue0 = new AnnotationsAttribute.ElementValue((-39), object0);
      AnnotationDefaultAttribute annotationDefaultAttribute0 = new AnnotationDefaultAttribute(annotationsAttribute_ElementValue0);
      ClassFileEntry[] classFileEntryArray0 = annotationDefaultAttribute0.getNestedClassFileEntries();
      assertEquals(1, classFileEntryArray0.length);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Object object0 = new Object();
      AnnotationsAttribute.ElementValue annotationsAttribute_ElementValue0 = new AnnotationsAttribute.ElementValue((-359), object0);
      AnnotationDefaultAttribute annotationDefaultAttribute0 = new AnnotationDefaultAttribute(annotationsAttribute_ElementValue0);
      boolean boolean0 = annotationDefaultAttribute0.equals(annotationDefaultAttribute0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Object object0 = new Object();
      AnnotationsAttribute.ElementValue annotationsAttribute_ElementValue0 = new AnnotationsAttribute.ElementValue((-39), object0);
      AnnotationDefaultAttribute annotationDefaultAttribute0 = new AnnotationDefaultAttribute(annotationsAttribute_ElementValue0);
      LinkedList<ClassFileEntry> linkedList0 = new LinkedList<ClassFileEntry>();
      boolean boolean0 = annotationDefaultAttribute0.equals(linkedList0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Object object0 = new Object();
      AnnotationsAttribute.ElementValue annotationsAttribute_ElementValue0 = new AnnotationsAttribute.ElementValue((-39), object0);
      AnnotationDefaultAttribute annotationDefaultAttribute0 = new AnnotationDefaultAttribute(annotationsAttribute_ElementValue0);
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      // Undeclared exception!
      try { 
        annotationDefaultAttribute0.resolve(classConstantPool0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Constant pool is not yet resolved; this does not make any sense
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ClassConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      AnnotationsAttribute.ElementValue annotationsAttribute_ElementValue0 = new AnnotationsAttribute.ElementValue(0, (Object) null);
      AnnotationDefaultAttribute annotationDefaultAttribute0 = new AnnotationDefaultAttribute(annotationsAttribute_ElementValue0);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      DataOutputStream dataOutputStream0 = new DataOutputStream(pipedOutputStream0);
      try { 
        annotationDefaultAttribute0.writeBody(dataOutputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("W9qNe1sZdw3!V69nK", (-39));
      AnnotationDefaultAttribute.setAttributeName(cPUTF8_0);
      assertEquals((byte)6, ConstantPoolEntry.CP_Double);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Object object0 = new Object();
      AnnotationsAttribute.ElementValue annotationsAttribute_ElementValue0 = new AnnotationsAttribute.ElementValue((-39), object0);
      AnnotationDefaultAttribute annotationDefaultAttribute0 = new AnnotationDefaultAttribute(annotationsAttribute_ElementValue0);
      int int0 = annotationDefaultAttribute0.getLength();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      AnnotationDefaultAttribute annotationDefaultAttribute0 = new AnnotationDefaultAttribute((AnnotationsAttribute.ElementValue) null);
      String string0 = annotationDefaultAttribute0.toString();
      assertEquals("AnnotationDefault: null", string0);
  }
}
