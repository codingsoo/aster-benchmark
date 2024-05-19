
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
import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import org.apache.commons.compress.harmony.unpack200.Segment;
import org.apache.commons.compress.harmony.unpack200.bytecode.Attribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPField;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8;
import org.apache.commons.compress.harmony.unpack200.bytecode.ClassConstantPool;
import org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry;
import org.apache.commons.compress.harmony.unpack200.bytecode.CodeAttribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.ExceptionTableEntry;
import org.apache.commons.compress.harmony.unpack200.bytecode.NewAttribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class NewAttribute_ESTest extends NewAttribute_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("LocalVariableTable: ", 0);
      NewAttribute newAttribute0 = new NewAttribute(cPUTF8_0, 5066);
      newAttribute0.addBCOffset((byte)8, (byte)3);
      newAttribute0.addBCOffset(3680, 8);
      byte[] byteArray0 = new byte[8];
      int[] intArray0 = new int[0];
      int[] intArray1 = new int[3];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray1, intArray1, intArray1, intArray0, intArray1, intArray0, intArray1, intArray0, intArray1, intArray1, intArray1, intArray0, intArray1, intArray1, intArray1, intArray1, intArray1, intArray1, intArray1);
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = new CodeAttribute((-943), 274, byteArray0, (Segment) null, operandManager0, linkedList0);
      // Undeclared exception!
      try { 
        newAttribute0.renumber(codeAttribute0.byteCodeOffsets);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 8, Size: 8
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("org.apache.commons.compress.harmony.unpack200.bytecode.NewAttribute$BCOffset", 21);
      NewAttribute newAttribute0 = new NewAttribute(cPUTF8_0, 1524);
      newAttribute0.addBCIndex((byte)7, 0);
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      Integer integer0 = new Integer((byte)9);
      linkedList0.offerFirst(integer0);
      newAttribute0.renumber(linkedList0);
      assertEquals(1524, newAttribute0.getLayoutIndex());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("#YNCL\"Qty J");
      NewAttribute newAttribute0 = new NewAttribute(cPUTF8_0, 0);
      newAttribute0.toString();
      assertEquals(0, newAttribute0.getLayoutIndex());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("EU");
      NewAttribute newAttribute0 = new NewAttribute(cPUTF8_0, (byte)4);
      newAttribute0.addBCLength(2055, (byte)7);
      int int0 = newAttribute0.getLength();
      assertEquals(4, newAttribute0.getLayoutIndex());
      assertEquals(2055, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("?E4No~A:<,T", (-1));
      NewAttribute newAttribute0 = new NewAttribute(cPUTF8_0, 0);
      newAttribute0.addBCIndex((-1), (byte)12);
      int int0 = newAttribute0.getLength();
      assertEquals((-1), int0);
      assertEquals(0, newAttribute0.getLayoutIndex());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("]", 0);
      NewAttribute newAttribute0 = new NewAttribute(cPUTF8_0, 0);
      int int0 = newAttribute0.getLayoutIndex();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("", (-4622));
      NewAttribute newAttribute0 = new NewAttribute(cPUTF8_0, (-3111));
      int int0 = newAttribute0.getLayoutIndex();
      assertEquals((-3111), int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("qpm>");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(" varaibles", false);
      NewAttribute newAttribute0 = new NewAttribute(cPUTF8_0, (byte)3);
      mockFileOutputStream0.close();
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockFileOutputStream0);
      newAttribute0.addBCLength((byte)4, (-555));
      try { 
        newAttribute0.writeBody(dataOutputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NewAttribute newAttribute0 = new NewAttribute((CPUTF8) null, (-545));
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
  public void test09()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("znb'L*V", 0);
      NewAttribute newAttribute0 = new NewAttribute(cPUTF8_0, (byte)11);
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
  public void test10()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("");
      NewAttribute newAttribute0 = new NewAttribute(cPUTF8_0, (byte)12);
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
  public void test11()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("*>2;T)VVcH%");
      NewAttribute newAttribute0 = new NewAttribute(cPUTF8_0, (byte)12);
      newAttribute0.addInteger(0, (byte)4);
      newAttribute0.addBCLength((byte)12, (byte)7);
      byte[] byteArray0 = new byte[5];
      int[] intArray0 = new int[7];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0, intArray0);
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = new CodeAttribute(0, 2248, byteArray0, (Segment) null, operandManager0, linkedList0);
      // Undeclared exception!
      try { 
        newAttribute0.renumber(codeAttribute0.byteCodeOffsets);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Long cannot be cast to org.apache.commons.compress.harmony.unpack200.bytecode.NewAttribute$BCIndex
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.NewAttribute", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("", (-2890));
      NewAttribute newAttribute0 = new NewAttribute(cPUTF8_0, (-1566));
      newAttribute0.addBCOffset((-959), (-959));
      byte[] byteArray0 = new byte[4];
      int[] intArray0 = new int[6];
      OperandManager operandManager0 = new OperandManager((int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, intArray0, (int[]) null, (int[]) null, intArray0, (int[]) null, (int[]) null, (int[]) null, intArray0, (int[]) null, (int[]) null, intArray0);
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = new CodeAttribute(73, 0, byteArray0, (Segment) null, operandManager0, linkedList0);
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
  public void test13()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8(")RsM>fL;Y}");
      NewAttribute newAttribute0 = new NewAttribute(cPUTF8_0, 20);
      newAttribute0.addInteger((byte)8, (byte)9);
      // Undeclared exception!
      try { 
        newAttribute0.writeBody((DataOutputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.NewAttribute", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("org.apache.commons.compress.harmony.unpack200.bytecode.NewAttribute$BCOffset", 21);
      NewAttribute newAttribute0 = new NewAttribute(cPUTF8_0, 1524);
      newAttribute0.addBCIndex((byte)7, 0);
      newAttribute0.writeBody((DataOutputStream) null);
      assertEquals(1524, newAttribute0.getLayoutIndex());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("(dWq12;e_]Tx_n1J8%");
      NewAttribute newAttribute0 = new NewAttribute(cPUTF8_0, 1234);
      newAttribute0.addBCIndex((byte)6, (byte)12);
      File file0 = MockFile.createTempFile("lstore", "lstore");
      MockPrintStream mockPrintStream0 = new MockPrintStream(file0);
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockPrintStream0);
      newAttribute0.writeBody(dataOutputStream0);
      assertEquals(1234, newAttribute0.getLayoutIndex());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("(dWq12;e_]Tx_n1J8%");
      NewAttribute newAttribute0 = new NewAttribute(cPUTF8_0, 1234);
      newAttribute0.addBCOffset((byte)1, (byte)7);
      File file0 = MockFile.createTempFile("lstore", "lstore");
      MockPrintStream mockPrintStream0 = new MockPrintStream(file0);
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockPrintStream0);
      newAttribute0.writeBody(dataOutputStream0);
      assertEquals(1L, file0.length());
      assertEquals(1234, newAttribute0.getLayoutIndex());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("qpm>");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("qpm>", false);
      NewAttribute newAttribute0 = new NewAttribute(cPUTF8_0, (byte)3);
      newAttribute0.addBCIndex((byte)10, (-1305));
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockFileOutputStream0);
      newAttribute0.writeBody(dataOutputStream0);
      assertEquals(3, newAttribute0.getLayoutIndex());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("[Luc- ?)5#q>Q");
      NewAttribute newAttribute0 = new NewAttribute(cPUTF8_0, (byte)3);
      LinkedList<Attribute> linkedList0 = new LinkedList<Attribute>();
      CPField cPField0 = new CPField(cPUTF8_0, cPUTF8_0, (byte)3, linkedList0);
      newAttribute0.addToBody(10, cPField0);
      // Undeclared exception!
      try { 
        newAttribute0.writeBody((DataOutputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.NewAttribute", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("DCK}SKr#857");
      NewAttribute newAttribute0 = new NewAttribute(cPUTF8_0, (byte)3);
      MockFile mockFile0 = new MockFile("org.apache.commons.compress.harmony.unpack200.bytecode.forms.ClassRefForm");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream(mockPrintStream0);
      DataOutputStream dataOutputStream0 = new DataOutputStream(bufferedOutputStream0);
      newAttribute0.addInteger((byte)4, (byte)7);
      newAttribute0.writeBody(dataOutputStream0);
      assertEquals(3, newAttribute0.getLayoutIndex());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("qpm>");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("qpm>", false);
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFileOutputStream0, false);
      NewAttribute newAttribute0 = new NewAttribute(cPUTF8_0, (byte)3);
      newAttribute0.addToBody((byte)5, mockPrintStream0);
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockFileOutputStream0);
      newAttribute0.writeBody(dataOutputStream0);
      assertEquals(3, newAttribute0.getLayoutIndex());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("[Luc- ?)5#q>Q");
      NewAttribute newAttribute0 = new NewAttribute(cPUTF8_0, (byte)3);
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      LinkedList<Attribute> linkedList0 = new LinkedList<Attribute>();
      CPField cPField0 = new CPField(cPUTF8_0, cPUTF8_0, (byte)3, linkedList0);
      newAttribute0.addToBody(10, cPField0);
      classConstantPool0.resolve((Segment) null);
      newAttribute0.resolve(classConstantPool0);
      assertEquals(3, newAttribute0.getLayoutIndex());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("[Luc- ?)5#q>Q");
      NewAttribute newAttribute0 = new NewAttribute(cPUTF8_0, (byte)3);
      newAttribute0.addBCOffset((byte)7, (byte)7);
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      classConstantPool0.resolve((Segment) null);
      newAttribute0.resolve(classConstantPool0);
      assertEquals(3, newAttribute0.getLayoutIndex());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("EU");
      NewAttribute newAttribute0 = new NewAttribute(cPUTF8_0, (byte)4);
      newAttribute0.addBCLength(0, (byte)12);
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
  public void test24()  throws Throwable  {
      NewAttribute newAttribute0 = new NewAttribute((CPUTF8) null, (-545));
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      newAttribute0.renumbered = true;
      newAttribute0.renumber(linkedList0);
      assertEquals((-545), newAttribute0.getLayoutIndex());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("LocalVariableTable: ", 0);
      NewAttribute newAttribute0 = new NewAttribute(cPUTF8_0, 5066);
      newAttribute0.addToBody((byte)11, cPUTF8_0);
      ClassFileEntry[] classFileEntryArray0 = newAttribute0.getNestedClassFileEntries();
      assertEquals(2, classFileEntryArray0.length);
      assertEquals(5066, newAttribute0.getLayoutIndex());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("org.apache.commons.compress.harmony.unpack200.bytecode.NewAttribute$BCOffset", 21);
      NewAttribute newAttribute0 = new NewAttribute(cPUTF8_0, 1524);
      newAttribute0.addBCIndex((byte)7, 0);
      ClassFileEntry[] classFileEntryArray0 = newAttribute0.getNestedClassFileEntries();
      assertEquals(1, classFileEntryArray0.length);
      assertEquals(1524, newAttribute0.getLayoutIndex());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("EU");
      NewAttribute newAttribute0 = new NewAttribute(cPUTF8_0, (byte)4);
      newAttribute0.addBCLength(0, (byte)12);
      int int0 = newAttribute0.getLength();
      assertEquals(0, int0);
      assertEquals(4, newAttribute0.getLayoutIndex());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("LocalVariableTable: ", 0);
      NewAttribute newAttribute0 = new NewAttribute(cPUTF8_0, 5066);
      newAttribute0.addBCOffset((byte)8, (byte)3);
      newAttribute0.addBCOffset(626, 0);
      byte[] byteArray0 = new byte[8];
      int[] intArray0 = new int[0];
      int[] intArray1 = new int[3];
      OperandManager operandManager0 = new OperandManager(intArray0, intArray0, intArray1, intArray1, intArray1, intArray0, intArray1, intArray0, intArray1, intArray0, intArray1, intArray1, intArray1, intArray0, intArray1, intArray1, intArray1, intArray1, intArray1, intArray1, intArray1);
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = new CodeAttribute((byte)4, 274, byteArray0, (Segment) null, operandManager0, linkedList0);
      newAttribute0.renumber(codeAttribute0.byteCodeOffsets);
      assertEquals(5066, newAttribute0.getLayoutIndex());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("", (-2890));
      NewAttribute newAttribute0 = new NewAttribute(cPUTF8_0, (-1566));
      newAttribute0.getStartPCs();
      assertEquals((-1566), newAttribute0.getLayoutIndex());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("(dWq12;e_]Tx_n1J8%");
      NewAttribute newAttribute0 = new NewAttribute(cPUTF8_0, 1234);
      int int0 = newAttribute0.getLayoutIndex();
      assertEquals(1234, int0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("", (-2890));
      NewAttribute newAttribute0 = new NewAttribute(cPUTF8_0, (-1566));
      newAttribute0.toString();
      assertEquals((-1566), newAttribute0.getLayoutIndex());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("");
      NewAttribute newAttribute0 = new NewAttribute(cPUTF8_0, (byte)10);
      newAttribute0.addBCOffset((byte)3, (-2683));
      newAttribute0.writeBody((DataOutputStream) null);
      assertEquals(10, newAttribute0.getLayoutIndex());
  }
}
