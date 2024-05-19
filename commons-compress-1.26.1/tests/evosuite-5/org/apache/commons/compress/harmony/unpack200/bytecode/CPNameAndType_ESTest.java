
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
import org.apache.commons.compress.harmony.unpack200.Segment;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPNameAndType;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8;
import org.apache.commons.compress.harmony.unpack200.bytecode.ClassConstantPool;
import org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry;
import org.apache.commons.compress.harmony.unpack200.bytecode.ConstantPoolEntry;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class CPNameAndType_ESTest extends CPNameAndType_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8(".B#5w0@BT", 3252);
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, cPUTF8_0, (byte)9);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("NameAndType: UTF-8:.B#5w0@BT(UTF-8:.B#5w0@BT)", false);
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockFileOutputStream0);
      cPNameAndType0.descriptorIndex = 3252;
      cPNameAndType0.writeBody(dataOutputStream0);
      assertEquals((byte)6, ConstantPoolEntry.CP_Double);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8(".B#5w0@BT", 3252);
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, cPUTF8_0, (byte)9);
      cPNameAndType0.descriptorIndex = 3252;
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
  public void test02()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8(".B#5w0@BT", 1200);
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, cPUTF8_0, (byte)9);
      cPNameAndType0.descriptor = null;
      String string0 = cPNameAndType0.toString();
      assertEquals("NameAndType: UTF-8:.B#5w0@BT(null)", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("NameAndType: ", (-131));
      CPUTF8 cPUTF8_1 = new CPUTF8("NameAndType: ", (-131));
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, cPUTF8_1, (byte)5);
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      classConstantPool0.resolve((Segment) null);
      cPNameAndType0.resolve(classConstantPool0);
      assertEquals((byte)5, ConstantPoolEntry.CP_Long);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("NameAndType: ", (-131));
      CPUTF8 cPUTF8_1 = new CPUTF8("NameAndType: ", (-131));
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, cPUTF8_1, (byte)5);
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
  public void test05()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8(">g_L<dBEA&lxl?Xl&Mq");
      CPUTF8 cPUTF8_1 = new CPUTF8("org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager", 2532);
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, cPUTF8_1, (byte)5);
      ClassFileEntry[] classFileEntryArray0 = cPNameAndType0.getNestedClassFileEntries();
      assertEquals(2, classFileEntryArray0.length);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8(".B#5w0@BT", 3252);
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, cPUTF8_0, (byte)9);
      CPUTF8 cPUTF8_1 = new CPUTF8(";&@VEm3");
      cPNameAndType0.descriptor = cPUTF8_1;
      cPNameAndType0.hashCode();
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("z");
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, cPUTF8_0, (-1964));
      CPUTF8 cPUTF8_1 = new CPUTF8("NameAndType: UTF-8:z(UTF-8:z)", (byte)7);
      CPNameAndType cPNameAndType1 = new CPNameAndType(cPUTF8_1, cPUTF8_0, (byte)7);
      boolean boolean0 = cPNameAndType1.equals(cPNameAndType0);
      assertFalse(cPNameAndType0.equals((Object)cPNameAndType1));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("NameAndType: UTF-8:z(UTF-8:z)");
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, cPUTF8_0, (byte)9);
      int int0 = cPNameAndType0.invokeInterfaceCount();
      assertEquals(8, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("Xm^.^AP?dkS!BLen<");
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, cPUTF8_0, (-87));
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
      CPUTF8 cPUTF8_0 = new CPUTF8("|H(=@C5", 3616);
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, cPUTF8_0, 3428);
      cPNameAndType0.descriptor = null;
      // Undeclared exception!
      try { 
        cPNameAndType0.invokeInterfaceCount();
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
      CPUTF8 cPUTF8_0 = new CPUTF8(".B#5w0@BT", 1200);
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, cPUTF8_0, (byte)9);
      cPNameAndType0.descriptor = null;
      // Undeclared exception!
      try { 
        cPNameAndType0.hashCode();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.CPNameAndType", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CPNameAndType cPNameAndType0 = null;
      try {
        cPNameAndType0 = new CPNameAndType((CPUTF8) null, (CPUTF8) null, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // name
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("z");
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, cPUTF8_0, (byte)6);
      CPUTF8 cPUTF8_1 = new CPUTF8("NameAndType: UTF-8:z(UTF-8:z)");
      CPNameAndType cPNameAndType1 = new CPNameAndType(cPUTF8_1, cPUTF8_0, (byte)8);
      boolean boolean0 = cPNameAndType0.equals(cPNameAndType1);
      assertFalse(boolean0);
      assertFalse(cPNameAndType1.equals((Object)cPNameAndType0));
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("z");
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, cPUTF8_0, (byte)6);
      CPUTF8 cPUTF8_1 = new CPUTF8("NameAndType: UTF-8:z(UTF-8:z)");
      CPNameAndType cPNameAndType1 = new CPNameAndType(cPUTF8_1, cPUTF8_1, (byte)9);
      boolean boolean0 = cPNameAndType0.equals(cPNameAndType1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("z");
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, cPUTF8_0, (byte)6);
      CPNameAndType cPNameAndType1 = new CPNameAndType(cPUTF8_0, cPUTF8_0, (byte)8);
      boolean boolean0 = cPNameAndType0.equals(cPNameAndType1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8(".B#5w0@BT", 1200);
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, cPUTF8_0, (byte)9);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("NameAndType: UTF-8:.B#5w0@BT(UTF-8:.B#5w0@BT)");
      boolean boolean0 = cPNameAndType0.equals(mockFileOutputStream0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("H=@C5");
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, cPUTF8_0, 3616);
      boolean boolean0 = cPNameAndType0.equals(cPNameAndType0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8(".B#5w0@BT", 1200);
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, cPUTF8_0, (byte)9);
      boolean boolean0 = cPNameAndType0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8(".B#5w0@BT", 1200);
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, cPUTF8_0, (byte)9);
      cPNameAndType0.hashCode();
      cPNameAndType0.hashCode();
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("z");
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, cPUTF8_0, (byte)6);
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
  public void test21()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("z");
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, cPUTF8_0, (-1964));
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
}
