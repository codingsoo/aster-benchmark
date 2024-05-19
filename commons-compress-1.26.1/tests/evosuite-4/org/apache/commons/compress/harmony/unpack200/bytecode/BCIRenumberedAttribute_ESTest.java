
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
import java.util.LinkedList;
import org.apache.commons.compress.harmony.unpack200.Segment;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8;
import org.apache.commons.compress.harmony.unpack200.bytecode.CodeAttribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.ExceptionTableEntry;
import org.apache.commons.compress.harmony.unpack200.bytecode.LineNumberTableAttribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.LocalVariableTableAttribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.LocalVariableTypeTableAttribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.NewAttribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class BCIRenumberedAttribute_ESTest extends BCIRenumberedAttribute_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("Trying to renumber a line number table that has already been renumbered");
      NewAttribute newAttribute0 = new NewAttribute(cPUTF8_0, (byte)5);
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      newAttribute0.renumber(linkedList0);
      assertEquals(5, newAttribute0.getLayoutIndex());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      int[] intArray0 = new int[0];
      CPUTF8[] cPUTF8Array0 = new CPUTF8[5];
      LocalVariableTypeTableAttribute localVariableTypeTableAttribute0 = new LocalVariableTypeTableAttribute(0, intArray0, intArray0, cPUTF8Array0, cPUTF8Array0, intArray0);
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      localVariableTypeTableAttribute0.renumber(linkedList0);
      assertTrue(localVariableTypeTableAttribute0.hasBCIRenumbering());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      int[] intArray0 = new int[6];
      CPUTF8[] cPUTF8Array0 = new CPUTF8[19];
      LocalVariableTableAttribute localVariableTableAttribute0 = new LocalVariableTableAttribute(216, intArray0, intArray0, cPUTF8Array0, cPUTF8Array0, intArray0);
      String string0 = localVariableTableAttribute0.toString();
      assertEquals("LocalVariableTable: 216 variables", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("");
      NewAttribute newAttribute0 = new NewAttribute(cPUTF8_0, 0);
      String string0 = newAttribute0.toString();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      CPUTF8[] cPUTF8Array0 = new CPUTF8[8];
      LocalVariableTypeTableAttribute localVariableTypeTableAttribute0 = new LocalVariableTypeTableAttribute(0, (int[]) null, (int[]) null, cPUTF8Array0, cPUTF8Array0, (int[]) null);
      byte[] byteArray0 = new byte[1];
      int[] intArray0 = new int[4];
      OperandManager operandManager0 = new OperandManager((int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, intArray0, (int[]) null, (int[]) null);
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = new CodeAttribute((-1295), 1144, byteArray0, (Segment) null, operandManager0, linkedList0);
      // Undeclared exception!
      try { 
        localVariableTypeTableAttribute0.renumber(codeAttribute0.byteCodeOffsets);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.LocalVariableTypeTableAttribute", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      int[] intArray0 = new int[7];
      CPUTF8[] cPUTF8Array0 = new CPUTF8[1];
      LocalVariableTypeTableAttribute localVariableTypeTableAttribute0 = new LocalVariableTypeTableAttribute(0, intArray0, intArray0, cPUTF8Array0, cPUTF8Array0, intArray0);
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      // Undeclared exception!
      try { 
        localVariableTypeTableAttribute0.renumber(linkedList0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.LinkedList", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      int[] intArray0 = new int[8];
      intArray0[0] = (-1754);
      LineNumberTableAttribute lineNumberTableAttribute0 = new LineNumberTableAttribute((-1754), intArray0, intArray0);
      byte[] byteArray0 = new byte[6];
      LinkedList<ExceptionTableEntry> linkedList0 = new LinkedList<ExceptionTableEntry>();
      CodeAttribute codeAttribute0 = new CodeAttribute(0, (-1754), byteArray0, (Segment) null, (OperandManager) null, linkedList0);
      // Undeclared exception!
      try { 
        lineNumberTableAttribute0.renumber(codeAttribute0.byteCodeOffsets);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      int[] intArray0 = new int[3];
      LineNumberTableAttribute lineNumberTableAttribute0 = new LineNumberTableAttribute((-1698), intArray0, intArray0);
      lineNumberTableAttribute0.renumbered = true;
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      // Undeclared exception!
      try { 
        lineNumberTableAttribute0.renumber(linkedList0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Trying to renumber a line number table that has already been renumbered
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.BCIRenumberedAttribute", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      int[] intArray0 = new int[1];
      CPUTF8[] cPUTF8Array0 = new CPUTF8[6];
      LocalVariableTableAttribute localVariableTableAttribute0 = new LocalVariableTableAttribute((-632), intArray0, intArray0, cPUTF8Array0, cPUTF8Array0, intArray0);
      boolean boolean0 = localVariableTableAttribute0.hasBCIRenumbering();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      NewAttribute newAttribute0 = new NewAttribute((CPUTF8) null, (-831));
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
}
