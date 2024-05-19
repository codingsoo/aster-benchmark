
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
import java.io.IOException;
import java.io.PipedOutputStream;
import org.apache.commons.compress.harmony.unpack200.Segment;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPNameAndType;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8;
import org.apache.commons.compress.harmony.unpack200.bytecode.ClassConstantPool;
import org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry;
import org.apache.commons.compress.harmony.unpack200.bytecode.ConstantPoolEntry;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class CPNameAndType_ESTest extends CPNameAndType_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("(z?\"6|\"5?X*@pv");
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, cPUTF8_0, 1335);
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(0);
      DataOutputStream dataOutputStream0 = new DataOutputStream(byteArrayOutputStream0);
      cPNameAndType0.nameIndex = (int) (byte)6;
      cPNameAndType0.writeBody(dataOutputStream0);
      assertEquals("\u0000\u0006\u0000\u0000", byteArrayOutputStream0.toString());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("org.apache.commons.compress.harmony.unpack200.bytecode.InnerClassesAttribute$InnerClassesEntry");
      CPUTF8 cPUTF8_1 = new CPUTF8("org.apache.commons.compress.harmony.unpack200.bytecode.InnerClassesAttribute$InnerClassesEntry");
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_1, cPUTF8_0, (byte)3);
      String string0 = cPNameAndType0.toString();
      assertEquals("NameAndType: UTF-8:org.apache.commons.compress.harmony.unpack200.bytecode.InnerClassesAttribute$InnerClassesEntry(UTF-8:org.apache.commons.compress.harmony.unpack200.bytecode.InnerClassesAttribute$InnerClassesEntry)", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("org.apache.commons.compress.harmony.unpack200.bytecode.InnerClassesAttribute$InnerClassesEntry");
      CPUTF8 cPUTF8_1 = new CPUTF8("org.apache.commons.compress.harmony.unpack200.bytecode.InnerClassesAttribute$InnerClassesEntry");
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_1, cPUTF8_0, (byte)3);
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      classConstantPool0.resolve((Segment) null);
      cPNameAndType0.resolve(classConstantPool0);
      assertEquals((byte)6, ConstantPoolEntry.CP_Double);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("org.apache.commons.compress.harmony.unpack200.bytecode.InnerClassesAttribute$InnerClassesEntry");
      CPUTF8 cPUTF8_1 = new CPUTF8("org.apache.commons.compress.harmony.unpack200.bytecode.InnerClassesAttribute$InnerClassesEntry");
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_1, cPUTF8_0, (byte)3);
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      // Undeclared exception!
      try { 
        cPNameAndType0.resolve(classConstantPool0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Constant pool is not yet resolved; this does not make any sense
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ClassConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("");
      CPUTF8 cPUTF8_1 = new CPUTF8("", (-1892));
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, cPUTF8_1, (byte)8);
      // Undeclared exception!
      try { 
        cPNameAndType0.invokeInterfaceCount();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No arguments
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.SegmentUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("$ea]F");
      CPUTF8 cPUTF8_1 = new CPUTF8("$ea]F", 1956);
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, cPUTF8_1, 585);
      ClassFileEntry[] classFileEntryArray0 = cPNameAndType0.getNestedClassFileEntries();
      assertEquals(2, classFileEntryArray0.length);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8(")2P'");
      CPUTF8 cPUTF8_1 = new CPUTF8("putstatic_this", (byte)12);
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, cPUTF8_1, 0);
      cPNameAndType0.hashCode();
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8(")2P'");
      CPUTF8 cPUTF8_1 = new CPUTF8("putstatic_this", (byte)12);
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, cPUTF8_0, (byte)8);
      CPNameAndType cPNameAndType1 = new CPNameAndType(cPUTF8_1, cPUTF8_0, (byte)7);
      boolean boolean0 = cPNameAndType0.equals(cPNameAndType1);
      assertFalse(cPNameAndType1.equals((Object)cPNameAndType0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("descriptor");
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, cPUTF8_0, (byte)9);
      // Undeclared exception!
      try { 
        cPNameAndType0.writeBody((DataOutputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.CPNameAndType", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("org.apache.commons.compress.harmony.unpack200.bytecode.CPNameAndType", (-1073));
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, cPUTF8_0, (byte)4);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      DataOutputStream dataOutputStream0 = new DataOutputStream(pipedOutputStream0);
      try { 
        cPNameAndType0.writeBody(dataOutputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("descriptor", 6252);
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, cPUTF8_0, (-877));
      // Undeclared exception!
      try { 
        cPNameAndType0.resolve((ClassConstantPool) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.CPNameAndType", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CPNameAndType cPNameAndType0 = null;
      try {
        cPNameAndType0 = new CPNameAndType((CPUTF8) null, (CPUTF8) null, (byte)11);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // name
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("e+_vTsUB=w");
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, cPUTF8_0, 0);
      cPNameAndType0.hashCode();
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      CPNameAndType cPNameAndType1 = (CPNameAndType)classConstantPool0.add(cPNameAndType0);
      assertEquals((byte)10, ConstantPoolEntry.CP_Methodref);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8(")2P");
      CPUTF8 cPUTF8_1 = new CPUTF8("putstatic_this", (byte)12);
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, cPUTF8_1, (byte)3);
      CPNameAndType cPNameAndType1 = new CPNameAndType(cPUTF8_1, cPUTF8_1, (byte)10);
      boolean boolean0 = cPNameAndType0.equals(cPNameAndType1);
      assertFalse(cPNameAndType1.equals((Object)cPNameAndType0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8(")2P");
      CPUTF8 cPUTF8_1 = new CPUTF8("putstatic_this", (byte)12);
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, cPUTF8_1, (byte)3);
      CPNameAndType cPNameAndType1 = new CPNameAndType(cPUTF8_1, cPUTF8_0, (byte)7);
      boolean boolean0 = cPNameAndType0.equals(cPNameAndType1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("deWscritor", 6252);
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, cPUTF8_0, 6252);
      CPNameAndType cPNameAndType1 = new CPNameAndType(cPUTF8_0, cPUTF8_0, (byte)9);
      boolean boolean0 = cPNameAndType0.equals(cPNameAndType1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("deWscritor", 6252);
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, cPUTF8_0, 6252);
      boolean boolean0 = cPNameAndType0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("pGo");
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, cPUTF8_0, (byte)7);
      boolean boolean0 = cPNameAndType0.equals(cPNameAndType0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("^");
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, cPUTF8_0, (byte)3);
      Object object0 = new Object();
      boolean boolean0 = cPNameAndType0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("q(9)7{WR:dYoB/5+wi{");
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, cPUTF8_0, (byte)5);
      int int0 = cPNameAndType0.invokeInterfaceCount();
      assertEquals(2, int0);
  }
}
