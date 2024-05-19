
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
import org.apache.commons.compress.harmony.unpack200.bytecode.AnnotationDefaultAttribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.AnnotationsAttribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPDouble;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPFloat;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPLong;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPNameAndType;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8;
import org.apache.commons.compress.harmony.unpack200.bytecode.ClassConstantPool;
import org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry;
import org.apache.commons.compress.harmony.unpack200.bytecode.DeprecatedAttribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.LocalVariableTypeTableAttribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.SignatureAttribute;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class ClassConstantPool_ESTest extends ClassConstantPool_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      CPUTF8 cPUTF8_0 = new CPUTF8("#\"`*Q>C");
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, cPUTF8_0, (-867));
      classConstantPool0.add(cPNameAndType0);
      int int0 = classConstantPool0.size();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      CPUTF8 cPUTF8_0 = new CPUTF8("#\"`*Q>C");
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, cPUTF8_0, (-867));
      classConstantPool0.add(cPNameAndType0);
      classConstantPool0.resolve((Segment) null);
      classConstantPool0.get(1);
      assertEquals(1, classConstantPool0.size());
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
      classConstantPool0.resolve((Segment) null);
      // Undeclared exception!
      try { 
        classConstantPool0.get(89);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 88, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      Object object0 = new Object();
      AnnotationsAttribute.ElementValue annotationsAttribute_ElementValue0 = new AnnotationsAttribute.ElementValue((-2472), object0);
      AnnotationDefaultAttribute annotationDefaultAttribute0 = new AnnotationDefaultAttribute(annotationsAttribute_ElementValue0);
      // Undeclared exception!
      try { 
        classConstantPool0.addWithNestedEntries(annotationDefaultAttribute0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ClassConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      int[] intArray0 = new int[6];
      CPUTF8[] cPUTF8Array0 = new CPUTF8[9];
      LocalVariableTypeTableAttribute localVariableTypeTableAttribute0 = new LocalVariableTypeTableAttribute(1200, intArray0, intArray0, cPUTF8Array0, cPUTF8Array0, intArray0);
      // Undeclared exception!
      try { 
        classConstantPool0.addWithNestedEntries(localVariableTypeTableAttribute0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 9
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.LocalVariableTypeTableAttribute", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      classConstantPool0.resolve((Segment) null);
      Double double0 = new Double(0);
      CPDouble cPDouble0 = new CPDouble(double0, (byte) (-81));
      classConstantPool0.addWithNestedEntries(cPDouble0);
      classConstantPool0.sortClassPool();
      int int0 = classConstantPool0.indexOf(cPDouble0);
      assertEquals(2, classConstantPool0.size());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      Float float0 = new Float((-1.0));
      CPFloat cPFloat0 = new CPFloat(float0, 24);
      HashSet<ClassFileEntry> hashSet0 = classConstantPool0.entriesContainsSet;
      hashSet0.add(cPFloat0);
      ClassFileEntry classFileEntry0 = classConstantPool0.add(cPFloat0);
      assertNotNull(classFileEntry0);
      assertEquals(0, classConstantPool0.size());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      ByteCode byteCode0 = ByteCode.getByteCode(1701);
      ClassFileEntry classFileEntry0 = classConstantPool0.add(byteCode0);
      assertNull(classFileEntry0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      Long long0 = new Long((-2373L));
      CPLong cPLong0 = new CPLong(long0, 0);
      classConstantPool0.addWithNestedEntries(cPLong0);
      classConstantPool0.resolve((Segment) null);
      assertEquals(2, classConstantPool0.size());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      CPUTF8 cPUTF8_0 = new CPUTF8("", 1);
      SignatureAttribute signatureAttribute0 = new SignatureAttribute(cPUTF8_0);
      // Undeclared exception!
      try { 
        classConstantPool0.indexOf(signatureAttribute0);
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
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      classConstantPool0.resolve((Segment) null);
      DeprecatedAttribute deprecatedAttribute0 = new DeprecatedAttribute();
      int int0 = classConstantPool0.indexOf(deprecatedAttribute0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      // Undeclared exception!
      try { 
        classConstantPool0.get(16);
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
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      DeprecatedAttribute deprecatedAttribute0 = new DeprecatedAttribute();
      classConstantPool0.add(deprecatedAttribute0);
      HashSet<ClassFileEntry> hashSet0 = new HashSet<ClassFileEntry>();
      classConstantPool0.othersContainsSet = hashSet0;
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
  public void test14()  throws Throwable  {
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
  public void test15()  throws Throwable  {
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      classConstantPool0.add((ClassFileEntry) null);
      classConstantPool0.add((ClassFileEntry) null);
      assertEquals(0, classConstantPool0.size());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      CPUTF8 cPUTF8_0 = new CPUTF8("#\"`*Q>C");
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, cPUTF8_0, (-867));
      classConstantPool0.add(cPNameAndType0);
      classConstantPool0.addNestedEntries();
      classConstantPool0.resolve((Segment) null);
      assertEquals(2, classConstantPool0.size());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      int int0 = classConstantPool0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      classConstantPool0.resolve((Segment) null);
      // Undeclared exception!
      try { 
        classConstantPool0.get((-940));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      List<ClassFileEntry> list0 = classConstantPool0.entries();
      assertTrue(list0.isEmpty());
  }
}
