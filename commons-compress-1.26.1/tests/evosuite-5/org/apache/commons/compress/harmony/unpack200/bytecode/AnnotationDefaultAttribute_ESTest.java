
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
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.DataOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import org.apache.commons.compress.harmony.unpack200.Segment;
import org.apache.commons.compress.harmony.unpack200.bytecode.AnnotationDefaultAttribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.AnnotationsAttribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8;
import org.apache.commons.compress.harmony.unpack200.bytecode.ClassConstantPool;
import org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class AnnotationDefaultAttribute_ESTest extends AnnotationDefaultAttribute_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      AnnotationsAttribute.ElementValue annotationsAttribute_ElementValue0 = mock(AnnotationsAttribute.ElementValue.class, new ViolatedAssumptionAnswer());
      AnnotationDefaultAttribute annotationDefaultAttribute0 = new AnnotationDefaultAttribute(annotationsAttribute_ElementValue0);
      annotationDefaultAttribute0.writeBody((DataOutputStream) null);
      assertFalse(annotationDefaultAttribute0.hasBCIRenumbering());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Object object0 = new Object();
      AnnotationsAttribute.ElementValue annotationsAttribute_ElementValue0 = new AnnotationsAttribute.ElementValue((-2437), object0);
      AnnotationDefaultAttribute annotationDefaultAttribute0 = new AnnotationDefaultAttribute(annotationsAttribute_ElementValue0);
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      classConstantPool0.resolve((Segment) null);
      annotationDefaultAttribute0.resolve(classConstantPool0);
      assertFalse(annotationDefaultAttribute0.hasBCIRenumbering());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      AnnotationsAttribute.ElementValue annotationsAttribute_ElementValue0 = mock(AnnotationsAttribute.ElementValue.class, new ViolatedAssumptionAnswer());
      doReturn(1).when(annotationsAttribute_ElementValue0).getLength();
      AnnotationDefaultAttribute annotationDefaultAttribute0 = new AnnotationDefaultAttribute(annotationsAttribute_ElementValue0);
      int int0 = annotationDefaultAttribute0.getLength();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      AnnotationsAttribute.ElementValue annotationsAttribute_ElementValue0 = mock(AnnotationsAttribute.ElementValue.class, new ViolatedAssumptionAnswer());
      doReturn((-346)).when(annotationsAttribute_ElementValue0).getLength();
      AnnotationDefaultAttribute annotationDefaultAttribute0 = new AnnotationDefaultAttribute(annotationsAttribute_ElementValue0);
      int int0 = annotationDefaultAttribute0.getLength();
      assertEquals((-346), int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Object object0 = new Object();
      AnnotationsAttribute.ElementValue annotationsAttribute_ElementValue0 = new AnnotationsAttribute.ElementValue((-3569), object0);
      AnnotationDefaultAttribute annotationDefaultAttribute0 = new AnnotationDefaultAttribute(annotationsAttribute_ElementValue0);
      MockPrintStream mockPrintStream0 = new MockPrintStream("d$%o2V");
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockPrintStream0);
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
  public void test05()  throws Throwable  {
      Object object0 = new Object();
      AnnotationsAttribute.ElementValue annotationsAttribute_ElementValue0 = new AnnotationsAttribute.ElementValue(1235, object0);
      AnnotationDefaultAttribute annotationDefaultAttribute0 = new AnnotationDefaultAttribute(annotationsAttribute_ElementValue0);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("h|hqq#WG", true);
      FilterOutputStream filterOutputStream0 = new FilterOutputStream(mockFileOutputStream0);
      filterOutputStream0.close();
      DataOutputStream dataOutputStream0 = new DataOutputStream(filterOutputStream0);
      try { 
        annotationDefaultAttribute0.writeBody(dataOutputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Object object0 = new Object();
      AnnotationsAttribute.ElementValue annotationsAttribute_ElementValue0 = new AnnotationsAttribute.ElementValue(1, object0);
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
  public void test07()  throws Throwable  {
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
  public void test08()  throws Throwable  {
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
  public void test09()  throws Throwable  {
      Object object0 = new Object();
      AnnotationsAttribute.ElementValue annotationsAttribute_ElementValue0 = new AnnotationsAttribute.ElementValue(0, object0);
      AnnotationDefaultAttribute annotationDefaultAttribute0 = new AnnotationDefaultAttribute(annotationsAttribute_ElementValue0);
      ClassFileEntry[] classFileEntryArray0 = annotationDefaultAttribute0.getNestedClassFileEntries();
      assertEquals(1, classFileEntryArray0.length);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Object object0 = new Object();
      AnnotationsAttribute.ElementValue annotationsAttribute_ElementValue0 = new AnnotationsAttribute.ElementValue(0, object0);
      AnnotationDefaultAttribute annotationDefaultAttribute0 = new AnnotationDefaultAttribute(annotationsAttribute_ElementValue0);
      boolean boolean0 = annotationDefaultAttribute0.equals(annotationDefaultAttribute0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Object object0 = new Object();
      AnnotationsAttribute.ElementValue annotationsAttribute_ElementValue0 = new AnnotationsAttribute.ElementValue(0, object0);
      AnnotationDefaultAttribute annotationDefaultAttribute0 = new AnnotationDefaultAttribute(annotationsAttribute_ElementValue0);
      boolean boolean0 = annotationDefaultAttribute0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      AnnotationsAttribute.ElementValue annotationsAttribute_ElementValue0 = mock(AnnotationsAttribute.ElementValue.class, new ViolatedAssumptionAnswer());
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
  public void test13()  throws Throwable  {
      Object object0 = new Object();
      AnnotationsAttribute.ElementValue annotationsAttribute_ElementValue0 = new AnnotationsAttribute.ElementValue(1, object0);
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
  public void test14()  throws Throwable  {
      AnnotationDefaultAttribute.setAttributeName((CPUTF8) null);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Object object0 = new Object();
      AnnotationsAttribute.ElementValue annotationsAttribute_ElementValue0 = new AnnotationsAttribute.ElementValue(0, object0);
      AnnotationDefaultAttribute annotationDefaultAttribute0 = new AnnotationDefaultAttribute(annotationsAttribute_ElementValue0);
      int int0 = annotationDefaultAttribute0.getLength();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Object object0 = new Object();
      AnnotationsAttribute.ElementValue annotationsAttribute_ElementValue0 = new AnnotationsAttribute.ElementValue(0, object0);
      AnnotationDefaultAttribute annotationDefaultAttribute0 = new AnnotationDefaultAttribute(annotationsAttribute_ElementValue0);
      String string0 = annotationDefaultAttribute0.toString();
      assertNotNull(string0);
  }
}
