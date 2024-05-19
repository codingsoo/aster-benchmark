
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
import java.io.OutputStream;
import java.io.PipedOutputStream;
import java.util.LinkedList;
import java.util.List;
import org.apache.commons.compress.harmony.unpack200.Segment;
import org.apache.commons.compress.harmony.unpack200.bytecode.AnnotationDefaultAttribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.AnnotationsAttribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.Attribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPClass;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPField;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPMember;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPMethod;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPNameAndType;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8;
import org.apache.commons.compress.harmony.unpack200.bytecode.ClassConstantPool;
import org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry;
import org.apache.commons.compress.harmony.unpack200.bytecode.CodeAttribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.EnclosingMethodAttribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.ExceptionTableEntry;
import org.apache.commons.compress.harmony.unpack200.bytecode.InnerClassesAttribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.LineNumberTableAttribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.LocalVariableTableAttribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.LocalVariableTypeTableAttribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager;
import org.apache.commons.compress.harmony.unpack200.bytecode.RuntimeVisibleorInvisibleAnnotationsAttribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.SignatureAttribute;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class CPMember_ESTest extends CPMember_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("|;nUlB^qZ", (-374));
      LinkedList<Attribute> linkedList0 = new LinkedList<Attribute>();
      CPUTF8 cPUTF8_1 = new CPUTF8("|;nUlB^qZ", (-374));
      CPMember cPMember0 = new CPMember(cPUTF8_0, cPUTF8_1, (byte)9, linkedList0);
      String string0 = cPMember0.toString();
      assertEquals("CPMember: UTF-8:|;nUlB^qZ(UTF-8:|;nUlB^qZ)", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("");
      CPUTF8 cPUTF8_1 = new CPUTF8("", (byte)12);
      LinkedList<Attribute> linkedList0 = new LinkedList<Attribute>();
      CPMethod cPMethod0 = new CPMethod(cPUTF8_0, cPUTF8_1, (byte)12, linkedList0);
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      classConstantPool0.resolve((Segment) null);
      cPMethod0.resolve(classConstantPool0);
      assertEquals(0, classConstantPool0.size());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("");
      CPUTF8 cPUTF8_1 = new CPUTF8("", (byte)12);
      LinkedList<Attribute> linkedList0 = new LinkedList<Attribute>();
      CPMethod cPMethod0 = new CPMethod(cPUTF8_0, cPUTF8_1, (byte)12, linkedList0);
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      // Undeclared exception!
      try { 
        cPMethod0.resolve(classConstantPool0);
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
      CPUTF8 cPUTF8_0 = new CPUTF8(".class", 0);
      CPUTF8 cPUTF8_1 = new CPUTF8("");
      LinkedList<Attribute> linkedList0 = new LinkedList<Attribute>();
      CPField cPField0 = new CPField(cPUTF8_0, cPUTF8_1, 0L, linkedList0);
      cPField0.hashCode();
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("CPMember: ");
      LinkedList<Attribute> linkedList0 = new LinkedList<Attribute>();
      CPMethod cPMethod0 = new CPMethod(cPUTF8_0, cPUTF8_0, (byte)1, linkedList0);
      int[] intArray0 = new int[7];
      CPUTF8[] cPUTF8Array0 = new CPUTF8[8];
      LocalVariableTypeTableAttribute localVariableTypeTableAttribute0 = new LocalVariableTypeTableAttribute((byte)6, intArray0, intArray0, cPUTF8Array0, cPUTF8Array0, intArray0);
      linkedList0.add((Attribute) localVariableTypeTableAttribute0);
      SignatureAttribute signatureAttribute0 = new SignatureAttribute(cPUTF8_0);
      linkedList0.add((Attribute) signatureAttribute0);
      ClassFileEntry[] classFileEntryArray0 = cPMethod0.getNestedClassFileEntries();
      assertEquals(4, classFileEntryArray0.length);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8(".class", 0);
      CPUTF8 cPUTF8_1 = new CPUTF8("");
      LinkedList<Attribute> linkedList0 = new LinkedList<Attribute>();
      CPField cPField0 = new CPField(cPUTF8_0, cPUTF8_1, 0L, linkedList0);
      ClassFileEntry[] classFileEntryArray0 = cPField0.getNestedClassFileEntries();
      assertEquals(2, classFileEntryArray0.length);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("invokespecial_new_init");
      LinkedList<Attribute> linkedList0 = new LinkedList<Attribute>();
      CPMember cPMember0 = new CPMember(cPUTF8_0, cPUTF8_0, (byte)7, linkedList0);
      CPMember cPMember1 = new CPMember(cPUTF8_0, cPUTF8_0, 1546L, linkedList0);
      boolean boolean0 = cPMember0.equals(cPMember1);
      assertFalse(boolean0);
      assertFalse(cPMember1.equals((Object)cPMember0));
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("");
      CPMethod cPMethod0 = new CPMethod(cPUTF8_0, cPUTF8_0, (byte)6, (List<Attribute>) null);
      CPUTF8 cPUTF8_1 = new CPUTF8("");
      CPMethod cPMethod1 = new CPMethod(cPUTF8_0, cPUTF8_1, (byte)6, (List<Attribute>) null);
      boolean boolean0 = cPMethod1.equals(cPMethod0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("|;nUlB^qZ", (-374));
      LinkedList<Attribute> linkedList0 = new LinkedList<Attribute>();
      InnerClassesAttribute innerClassesAttribute0 = new InnerClassesAttribute("");
      linkedList0.addLast(innerClassesAttribute0);
      CPClass cPClass0 = new CPClass(cPUTF8_0, 0);
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, cPUTF8_0, (byte)10);
      EnclosingMethodAttribute enclosingMethodAttribute0 = new EnclosingMethodAttribute(cPClass0, cPNameAndType0);
      linkedList0.add((Attribute) enclosingMethodAttribute0);
      CPMember cPMember0 = new CPMember(cPUTF8_0, cPUTF8_0, (byte)4, linkedList0);
      MockFile mockFile0 = new MockFile("ifnonnull");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockPrintStream0);
      cPMember0.doWrite(dataOutputStream0);
      assertEquals(26L, mockFile0.length());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8(";90]/zd=c|+p/dErsE");
      byte[] byteArray0 = new byte[2];
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = new CodeAttribute((byte)8, 53, byteArray0, (Segment) null, (OperandManager) null, linkedList0);
      CPMember cPMember0 = new CPMember(cPUTF8_0, cPUTF8_0, (byte)8, codeAttribute0.attributes);
      cPMember0.nameIndex = (int) (byte)10;
      MockFile mockFile0 = new MockFile(";90]/zd=c|+p/dErsE", "CPMember: ");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0);
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockFileOutputStream0);
      cPMember0.doWrite(dataOutputStream0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("|\"+");
      CPMember cPMember0 = new CPMember(cPUTF8_0, cPUTF8_0, 4142L, (List<Attribute>) null);
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
  public void test11()  throws Throwable  {
      LinkedList<Attribute> linkedList0 = new LinkedList<Attribute>();
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      int[] intArray0 = new int[0];
      CPUTF8[] cPUTF8Array0 = new CPUTF8[6];
      CPUTF8 cPUTF8_0 = new CPUTF8("", 0);
      cPUTF8Array0[3] = cPUTF8_0;
      LocalVariableTableAttribute localVariableTableAttribute0 = new LocalVariableTableAttribute((-746), intArray0, intArray0, cPUTF8Array0, cPUTF8Array0, intArray0);
      linkedList0.add(0, (Attribute) localVariableTableAttribute0);
      classConstantPool0.resolve((Segment) null);
      CPMember cPMember0 = new CPMember(cPUTF8Array0[3], cPUTF8Array0[3], (byte)11, linkedList0);
      // Undeclared exception!
      try { 
        cPMember0.resolve(classConstantPool0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.LocalVariableTableAttribute", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LinkedList<Attribute> linkedList0 = new LinkedList<Attribute>();
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      int[] intArray0 = new int[3];
      CPUTF8 cPUTF8_0 = new CPUTF8(")", (-3437));
      AnnotationsAttribute.Annotation[] annotationsAttribute_AnnotationArray0 = new AnnotationsAttribute.Annotation[5];
      CPUTF8[] cPUTF8Array0 = new CPUTF8[9];
      cPUTF8Array0[0] = cPUTF8_0;
      cPUTF8Array0[1] = cPUTF8_0;
      cPUTF8Array0[5] = cPUTF8_0;
      AnnotationsAttribute.ElementValue[] annotationsAttribute_ElementValueArray0 = new AnnotationsAttribute.ElementValue[1];
      LineNumberTableAttribute lineNumberTableAttribute0 = new LineNumberTableAttribute(1, intArray0, intArray0);
      AnnotationsAttribute.ElementValue annotationsAttribute_ElementValue0 = new AnnotationsAttribute.ElementValue((byte)4, lineNumberTableAttribute0);
      annotationsAttribute_ElementValueArray0[0] = annotationsAttribute_ElementValue0;
      AnnotationsAttribute.Annotation annotationsAttribute_Annotation0 = new AnnotationsAttribute.Annotation((byte)5, cPUTF8_0, cPUTF8Array0, annotationsAttribute_ElementValueArray0);
      annotationsAttribute_AnnotationArray0[0] = annotationsAttribute_Annotation0;
      RuntimeVisibleorInvisibleAnnotationsAttribute runtimeVisibleorInvisibleAnnotationsAttribute0 = new RuntimeVisibleorInvisibleAnnotationsAttribute(cPUTF8_0, annotationsAttribute_AnnotationArray0);
      linkedList0.offerLast(runtimeVisibleorInvisibleAnnotationsAttribute0);
      classConstantPool0.resolve((Segment) null);
      CPMember cPMember0 = new CPMember(cPUTF8Array0[5], cPUTF8Array0[5], (byte)11, linkedList0);
      // Undeclared exception!
      try { 
        cPMember0.resolve(classConstantPool0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.AnnotationsAttribute$Annotation", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("7]Nyzp31\"`_b;3VMq*5");
      CPMember cPMember0 = new CPMember(cPUTF8_0, cPUTF8_0, (byte)1, (List<Attribute>) null);
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
  public void test14()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("fcpl");
      CPMember cPMember0 = new CPMember(cPUTF8_0, cPUTF8_0, (-23L), (List<Attribute>) null);
      cPMember0.attributes = null;
      // Undeclared exception!
      try { 
        cPMember0.getNestedClassFileEntries();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.CPMember", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("");
      CPMethod cPMethod0 = new CPMethod(cPUTF8_0, cPUTF8_0, (byte)6, (List<Attribute>) null);
      cPMethod0.attributes = null;
      CPMethod cPMethod1 = new CPMethod(cPUTF8_0, cPUTF8_0, (byte)6, (List<Attribute>) null);
      // Undeclared exception!
      try { 
        cPMethod0.equals(cPMethod1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.CPMember", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8(")", (-701));
      LinkedList<Attribute> linkedList0 = new LinkedList<Attribute>();
      CPMethod cPMethod0 = new CPMethod(cPUTF8_0, cPUTF8_0, 1691L, linkedList0);
      DataOutputStream dataOutputStream0 = new DataOutputStream((OutputStream) null);
      // Undeclared exception!
      try { 
        cPMethod0.doWrite(dataOutputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("|;nUlB^qZ", (-385));
      LinkedList<Attribute> linkedList0 = new LinkedList<Attribute>();
      byte[] byteArray0 = new byte[7];
      int[] intArray0 = new int[0];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      LinkedList<ExceptionTableEntry> linkedList1 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = new CodeAttribute((byte)6, (-346), byteArray0, (Segment) null, operandManager0, linkedList1);
      linkedList0.add((Attribute) codeAttribute0);
      CPMember cPMember0 = new CPMember(cPUTF8_0, cPUTF8_0, (byte)4, linkedList0);
      MockPrintStream mockPrintStream0 = new MockPrintStream("|;nUlB^qZ");
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockPrintStream0);
      // Undeclared exception!
      try { 
        cPMember0.doWrite(dataOutputStream0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Entry has not been resolved
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("|;nUlB^qZ", (-374));
      LinkedList<Attribute> linkedList0 = new LinkedList<Attribute>();
      AnnotationsAttribute.ElementValue annotationsAttribute_ElementValue0 = new AnnotationsAttribute.ElementValue((byte)8, (Object) null);
      AnnotationDefaultAttribute annotationDefaultAttribute0 = new AnnotationDefaultAttribute(annotationsAttribute_ElementValue0);
      linkedList0.offer(annotationDefaultAttribute0);
      CPMember cPMember0 = new CPMember(cPUTF8_0, cPUTF8_0, (byte)9, linkedList0);
      MockFile mockFile0 = new MockFile("ifnonnull");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockPrintStream0);
      // Undeclared exception!
      try { 
        cPMember0.doWrite(dataOutputStream0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // 
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.AnnotationsAttribute$ElementValue", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("new", 0);
      LinkedList<Attribute> linkedList0 = new LinkedList<Attribute>();
      CPMember cPMember0 = new CPMember(cPUTF8_0, cPUTF8_0, 1L, linkedList0);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      DataOutputStream dataOutputStream0 = new DataOutputStream(pipedOutputStream0);
      try { 
        cPMember0.doWrite(dataOutputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("");
      CPMember cPMember0 = null;
      try {
        cPMember0 = new CPMember(cPUTF8_0, (CPUTF8) null, 1L, (List<Attribute>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // descriptor
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("ydM)K/5fGdf}q^Td");
      LinkedList<Attribute> linkedList0 = new LinkedList<Attribute>();
      CPMember cPMember0 = new CPMember(cPUTF8_0, cPUTF8_0, (byte)7, linkedList0);
      CPMember cPMember1 = new CPMember(cPUTF8_0, cPUTF8_0, (byte)6, linkedList0);
      boolean boolean0 = cPMember0.equals(cPMember1);
      assertFalse(boolean0);
      assertFalse(cPMember1.equals((Object)cPMember0));
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("");
      CPMethod cPMethod0 = new CPMethod(cPUTF8_0, cPUTF8_0, (byte)6, (List<Attribute>) null);
      CPUTF8 cPUTF8_1 = new CPUTF8("fz{6x");
      CPMethod cPMethod1 = new CPMethod(cPUTF8_0, cPUTF8_1, (byte)6, (List<Attribute>) null);
      boolean boolean0 = cPMethod0.equals(cPMethod1);
      assertFalse(cPMethod1.equals((Object)cPMethod0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("");
      CPMethod cPMethod0 = new CPMethod(cPUTF8_0, cPUTF8_0, (byte)6, (List<Attribute>) null);
      CPMethod cPMethod1 = new CPMethod(cPUTF8_0, cPUTF8_0, (byte)6, (List<Attribute>) null);
      cPMethod1.attributes = null;
      boolean boolean0 = cPMethod0.equals(cPMethod1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("");
      CPMethod cPMethod0 = new CPMethod(cPUTF8_0, cPUTF8_0, (byte)6, (List<Attribute>) null);
      boolean boolean0 = cPMethod0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("invoespecial_new_init");
      LinkedList<Attribute> linkedList0 = new LinkedList<Attribute>();
      CPMember cPMember0 = new CPMember(cPUTF8_0, cPUTF8_0, (byte)7, linkedList0);
      boolean boolean0 = cPMember0.equals(cPMember0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("|;nUlB^qZ", (-374));
      LinkedList<Attribute> linkedList0 = new LinkedList<Attribute>();
      CPMember cPMember0 = new CPMember(cPUTF8_0, cPUTF8_0, (byte)9, linkedList0);
      boolean boolean0 = cPMember0.equals(cPUTF8_0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("7]Nyzp31\"`_b;3VMq*5");
      CPMember cPMember0 = new CPMember(cPUTF8_0, cPUTF8_0, (byte)1, (List<Attribute>) null);
      cPMember0.hashCode();
  }
}
