
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
import java.io.ObjectOutputStream;
import java.io.PipedOutputStream;
import java.util.LinkedList;
import java.util.List;
import org.apache.commons.compress.harmony.unpack200.Segment;
import org.apache.commons.compress.harmony.unpack200.bytecode.AnnotationDefaultAttribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.AnnotationsAttribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8;
import org.apache.commons.compress.harmony.unpack200.bytecode.ClassConstantPool;
import org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry;
import org.apache.commons.compress.harmony.unpack200.bytecode.CodeAttribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.ExceptionTableEntry;
import org.apache.commons.compress.harmony.unpack200.bytecode.NewAttribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class NewAttribute_ESTest extends NewAttribute_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("n@iqW");
      NewAttribute newAttribute0 = new NewAttribute(cPUTF8_0, (byte)8);
      newAttribute0.addBCOffset(8, 0);
      byte[] byteArray0 = new byte[0];
      int[] intArray0 = new int[1];
      OperandManager operandManager0 = new OperandManager((int[]) null, (int[]) null, (int[]) null, intArray0, (int[]) null, (int[]) null, intArray0, (int[]) null, (int[]) null, (int[]) null, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      newAttribute0.addBCOffset(815, 1454);
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = new CodeAttribute(8, (byte)1, byteArray0, (Segment) null, operandManager0, linkedList0);
      // Undeclared exception!
      try { 
        newAttribute0.renumber(codeAttribute0.byteCodeOffsets);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1454, Size: 1
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("Ay$zSmn${o~uFiF");
      NewAttribute newAttribute0 = new NewAttribute(cPUTF8_0, (-267));
      newAttribute0.addBCIndex((byte)7, 163);
      assertEquals((-267), newAttribute0.getLayoutIndex());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("");
      NewAttribute newAttribute0 = new NewAttribute(cPUTF8_0, (byte)7);
      MockPrintStream mockPrintStream0 = new MockPrintStream("i2l");
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockPrintStream0);
      newAttribute0.addInteger(1, (byte)3);
      newAttribute0.writeBody(dataOutputStream0);
      assertEquals(7, newAttribute0.getLayoutIndex());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8(".>c|T[n;FW:qUrK<J");
      NewAttribute newAttribute0 = new NewAttribute(cPUTF8_0, (byte)8);
      byte[] byteArray0 = new byte[1];
      int[] intArray0 = new int[9];
      newAttribute0.addBCIndex((byte)10, 0);
      newAttribute0.addBCLength((byte)9, 6);
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = new CodeAttribute((byte)3, (byte)6, byteArray0, (Segment) null, operandManager0, linkedList0);
      // Undeclared exception!
      try { 
        newAttribute0.renumber(codeAttribute0.byteCodeOffsets);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 6, Size: 1
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8(".>c|T[n;FW:qUrK<J");
      NewAttribute newAttribute0 = new NewAttribute(cPUTF8_0, (byte)8);
      byte[] byteArray0 = new byte[10];
      int[] intArray0 = new int[9];
      newAttribute0.addBCIndex((byte)10, 0);
      newAttribute0.addBCOffset((-101), (byte)3);
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = new CodeAttribute((byte)3, (byte)6, byteArray0, (Segment) null, operandManager0, linkedList0);
      newAttribute0.renumber(codeAttribute0.byteCodeOffsets);
      assertEquals(8, newAttribute0.getLayoutIndex());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("[[,", (-592));
      NewAttribute newAttribute0 = new NewAttribute(cPUTF8_0, 37);
      newAttribute0.toString();
      assertEquals(37, newAttribute0.getLayoutIndex());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("", 1);
      NewAttribute newAttribute0 = new NewAttribute(cPUTF8_0, (-4357));
      int int0 = newAttribute0.getLength();
      assertEquals(0, int0);
      assertEquals((-4357), newAttribute0.getLayoutIndex());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("");
      NewAttribute newAttribute0 = new NewAttribute(cPUTF8_0, (byte)7);
      newAttribute0.addInteger((byte)6, 0);
      int int0 = newAttribute0.getLength();
      assertEquals(6, int0);
      assertEquals(7, newAttribute0.getLayoutIndex());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("Unhandled resolve ");
      NewAttribute newAttribute0 = new NewAttribute(cPUTF8_0, (byte)5);
      newAttribute0.addBCOffset((-5644), (byte)8);
      int int0 = newAttribute0.getLength();
      assertEquals(5, newAttribute0.getLayoutIndex());
      assertEquals((-5644), int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("a<HRYDc");
      NewAttribute newAttribute0 = new NewAttribute(cPUTF8_0, 0);
      int int0 = newAttribute0.getLayoutIndex();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("", 1);
      NewAttribute newAttribute0 = new NewAttribute(cPUTF8_0, (-4357));
      int int0 = newAttribute0.getLayoutIndex();
      assertEquals((-4357), int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      NewAttribute newAttribute0 = new NewAttribute((CPUTF8) null, (-1865));
      // Undeclared exception!
      try { 
        newAttribute0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.NewAttribute", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("Unhandled resolve ");
      NewAttribute newAttribute0 = new NewAttribute(cPUTF8_0, (byte)5);
      // Undeclared exception!
      try { 
        newAttribute0.resolve((ClassConstantPool) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.Attribute", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("");
      NewAttribute newAttribute0 = new NewAttribute(cPUTF8_0, (byte)7);
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      // Undeclared exception!
      try { 
        newAttribute0.resolve(classConstantPool0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Constant pool is not yet resolved; this does not make any sense
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ClassConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("[v4U)VkS?b");
      NewAttribute newAttribute0 = new NewAttribute(cPUTF8_0, (byte)9);
      newAttribute0.addInteger((-1896), (byte)11);
      newAttribute0.addBCLength((byte)3, (byte)5);
      // Undeclared exception!
      try { 
        newAttribute0.renumber((List<Integer>) null);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Long cannot be cast to org.apache.commons.compress.harmony.unpack200.bytecode.NewAttribute$BCIndex
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.NewAttribute", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("n@iqW");
      NewAttribute newAttribute0 = new NewAttribute(cPUTF8_0, (byte)8);
      newAttribute0.addBCOffset(8, (-13));
      byte[] byteArray0 = new byte[0];
      int[] intArray0 = new int[1];
      OperandManager operandManager0 = new OperandManager((int[]) null, (int[]) null, (int[]) null, intArray0, (int[]) null, (int[]) null, intArray0, (int[]) null, (int[]) null, (int[]) null, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, (int[]) null);
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = new CodeAttribute(8, (-2142), byteArray0, (Segment) null, operandManager0, linkedList0);
      // Undeclared exception!
      try { 
        newAttribute0.renumber(codeAttribute0.byteCodeOffsets);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("n@iqW");
      NewAttribute newAttribute0 = new NewAttribute(cPUTF8_0, (byte)8);
      newAttribute0.addBCOffset(8, (-13));
      MockPrintStream mockPrintStream0 = new MockPrintStream("6oBa");
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockPrintStream0);
      newAttribute0.writeBody(dataOutputStream0);
      assertEquals(8, newAttribute0.getLayoutIndex());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("org.apache.commo.u.compress.harmony.unpack200.bytecode.NewAttribute");
      NewAttribute newAttribute0 = new NewAttribute(cPUTF8_0, 0);
      newAttribute0.addBCOffset((byte)6, (byte)11);
      MockPrintStream mockPrintStream0 = new MockPrintStream("org.apache.commo.u.compress.harmony.unpack200.bytecode.NewAttribute");
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockPrintStream0);
      newAttribute0.writeBody(dataOutputStream0);
      assertEquals(0, newAttribute0.getLayoutIndex());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("org.apache.commons.compress.harmony.unpack200.bytecode.NewAttribute$BCOffset");
      NewAttribute newAttribute0 = new NewAttribute(cPUTF8_0, (byte)6);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("org.apache.commons.compress.harmony.unpack200.bytecode.NewAttribute$BCOffset");
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream(mockFileOutputStream0);
      DataOutputStream dataOutputStream0 = new DataOutputStream(objectOutputStream0);
      newAttribute0.addInteger((byte)5, (byte)8);
      newAttribute0.writeBody(dataOutputStream0);
      assertEquals(6, newAttribute0.getLayoutIndex());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("org.apache.commo.u.compress.harmony.unpack200.bytecode.NewAttribute");
      NewAttribute newAttribute0 = new NewAttribute(cPUTF8_0, 0);
      newAttribute0.addBCOffset((byte)4, (-5540));
      MockPrintStream mockPrintStream0 = new MockPrintStream("org.apache.commo.u.compress.harmony.unpack200.bytecode.NewAttribute");
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockPrintStream0);
      newAttribute0.writeBody(dataOutputStream0);
      assertEquals(0, newAttribute0.getLayoutIndex());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("org.apache.commons.compress.harmony.unpack200.bytecode.NewAttribute$BCOffset");
      NewAttribute newAttribute0 = new NewAttribute(cPUTF8_0, (byte)6);
      newAttribute0.addBCLength(2, 1328);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("org.apache.commons.compress.harmony.unpack200.bytecode.NewAttribute$BCOffset");
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream(mockFileOutputStream0);
      DataOutputStream dataOutputStream0 = new DataOutputStream(objectOutputStream0);
      newAttribute0.writeBody(dataOutputStream0);
      assertEquals(6, newAttribute0.getLayoutIndex());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("3~w&n=P*Psx?kQ!");
      NewAttribute newAttribute0 = new NewAttribute(cPUTF8_0, (byte)8);
      newAttribute0.addInteger(1, (byte)4);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      DataOutputStream dataOutputStream0 = new DataOutputStream(pipedOutputStream0);
      try { 
        newAttribute0.writeBody(dataOutputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("org.apache.commo.u.compress.harmony.unpack200.bytecode.NewAttribute");
      NewAttribute newAttribute0 = new NewAttribute(cPUTF8_0, 0);
      Object object0 = new Object();
      newAttribute0.addToBody((byte)3, object0);
      MockPrintStream mockPrintStream0 = new MockPrintStream("org.apache.commo.u.compress.harmony.unpack200.bytecode.NewAttribute");
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockPrintStream0);
      newAttribute0.writeBody(dataOutputStream0);
      assertEquals(0, newAttribute0.getLayoutIndex());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("org.apache.commons.compress.harmony.unpack200.bytecode.NewAttribute$BCOffset");
      NewAttribute newAttribute0 = new NewAttribute(cPUTF8_0, (byte)6);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("org.apache.commons.compress.harmony.unpack200.bytecode.NewAttribute$BCOffset");
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream(mockFileOutputStream0);
      DataOutputStream dataOutputStream0 = new DataOutputStream(objectOutputStream0);
      AnnotationsAttribute.ElementValue annotationsAttribute_ElementValue0 = new AnnotationsAttribute.ElementValue(0, mockFileOutputStream0);
      AnnotationDefaultAttribute annotationDefaultAttribute0 = new AnnotationDefaultAttribute(annotationsAttribute_ElementValue0);
      newAttribute0.addToBody((byte)12, annotationDefaultAttribute0);
      // Undeclared exception!
      try { 
        newAttribute0.writeBody(dataOutputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.NewAttribute", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("");
      NewAttribute newAttribute0 = new NewAttribute(cPUTF8_0, (byte)7);
      MockPrintStream mockPrintStream0 = new MockPrintStream("i2l");
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockPrintStream0);
      newAttribute0.addBCOffset(805, (byte)1);
      newAttribute0.writeBody(dataOutputStream0);
      assertEquals(7, newAttribute0.getLayoutIndex());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("[[,", (-592));
      NewAttribute newAttribute0 = new NewAttribute(cPUTF8_0, 37);
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      classConstantPool0.resolve((Segment) null);
      newAttribute0.addBCLength(37, (byte)8);
      newAttribute0.resolve(classConstantPool0);
      assertEquals(37, newAttribute0.getLayoutIndex());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("n@iqW");
      NewAttribute newAttribute0 = new NewAttribute(cPUTF8_0, (byte)8);
      newAttribute0.addBCOffset(8, 0);
      byte[] byteArray0 = new byte[1];
      int[] intArray0 = new int[1];
      OperandManager operandManager0 = new OperandManager((int[]) null, (int[]) null, (int[]) null, intArray0, (int[]) null, (int[]) null, intArray0, (int[]) null, (int[]) null, (int[]) null, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      newAttribute0.addBCOffset(815, 0);
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = new CodeAttribute(8, (byte)1, byteArray0, (Segment) null, operandManager0, linkedList0);
      newAttribute0.renumber(codeAttribute0.byteCodeOffsets);
      assertEquals(8, newAttribute0.getLayoutIndex());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("n@iqW");
      NewAttribute newAttribute0 = new NewAttribute(cPUTF8_0, (byte)8);
      byte[] byteArray0 = new byte[1];
      int[] intArray0 = new int[1];
      OperandManager operandManager0 = new OperandManager((int[]) null, (int[]) null, (int[]) null, intArray0, (int[]) null, (int[]) null, intArray0, (int[]) null, (int[]) null, (int[]) null, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = new CodeAttribute(8, (byte)1, byteArray0, (Segment) null, operandManager0, linkedList0);
      newAttribute0.renumber(codeAttribute0.byteCodeOffsets);
      newAttribute0.renumber(codeAttribute0.byteCodeOffsets);
      assertEquals(8, newAttribute0.getLayoutIndex());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("org.apache.commons.compress.harmony.unpack200.bytecode.NewAttribute$BCOffset");
      NewAttribute newAttribute0 = new NewAttribute(cPUTF8_0, (-1736));
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("org.apache.commons.compress.harmony.unpack200.bytecode.NewAttribute$BCOffset");
      AnnotationsAttribute.ElementValue annotationsAttribute_ElementValue0 = new AnnotationsAttribute.ElementValue(0, mockFileOutputStream0);
      AnnotationDefaultAttribute annotationDefaultAttribute0 = new AnnotationDefaultAttribute(annotationsAttribute_ElementValue0);
      newAttribute0.addToBody((byte)12, annotationDefaultAttribute0);
      ClassFileEntry[] classFileEntryArray0 = newAttribute0.getNestedClassFileEntries();
      assertEquals(2, classFileEntryArray0.length);
      assertEquals((-1736), newAttribute0.getLayoutIndex());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("dload");
      NewAttribute newAttribute0 = new NewAttribute(cPUTF8_0, (byte)7);
      newAttribute0.addInteger((byte)7, (byte)6);
      ClassFileEntry[] classFileEntryArray0 = newAttribute0.getNestedClassFileEntries();
      assertEquals(7, newAttribute0.getLayoutIndex());
      assertEquals(1, classFileEntryArray0.length);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("dload");
      NewAttribute newAttribute0 = new NewAttribute(cPUTF8_0, (byte)7);
      MockPrintStream mockPrintStream0 = new MockPrintStream(" varaibles");
      newAttribute0.addInteger((byte)7, (byte)6);
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockPrintStream0);
      newAttribute0.doWrite(dataOutputStream0);
      assertEquals(7, newAttribute0.getLayoutIndex());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("");
      NewAttribute newAttribute0 = new NewAttribute(cPUTF8_0, (byte)7);
      newAttribute0.getStartPCs();
      assertEquals(7, newAttribute0.getLayoutIndex());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("dload");
      NewAttribute newAttribute0 = new NewAttribute(cPUTF8_0, (byte)7);
      newAttribute0.addBCLength(758, (byte)1);
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      // Undeclared exception!
      try { 
        newAttribute0.renumber(linkedList0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.NewAttribute$BCIndex", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("dload");
      NewAttribute newAttribute0 = new NewAttribute(cPUTF8_0, (byte)7);
      int int0 = newAttribute0.getLayoutIndex();
      assertEquals(7, int0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("");
      NewAttribute newAttribute0 = new NewAttribute(cPUTF8_0, (byte)7);
      newAttribute0.toString();
      assertEquals(7, newAttribute0.getLayoutIndex());
  }
}
