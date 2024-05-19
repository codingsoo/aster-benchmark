
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
import org.apache.commons.compress.harmony.unpack200.Segment;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPClass;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPFieldRef;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPNameAndType;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8;
import org.apache.commons.compress.harmony.unpack200.bytecode.ClassConstantPool;
import org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry;
import org.apache.commons.compress.harmony.unpack200.bytecode.ConstantPoolEntry;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class CPFieldRef_ESTest extends CPFieldRef_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8(">Mxdkn&a*G}4,BX>", 1);
      CPClass cPClass0 = new CPClass(cPUTF8_0, (byte)11);
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, cPUTF8_0, (byte)6);
      CPFieldRef cPFieldRef0 = new CPFieldRef(cPClass0, cPNameAndType0, (byte)8);
      MockFile mockFile0 = new MockFile(">Mxdkn&a*G}4,BX>", ">Mxdkn&a*G}4,BX>");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0, false);
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockFileOutputStream0);
      cPFieldRef0.classNameIndex = (int) (byte)9;
      cPFieldRef0.writeBody(dataOutputStream0);
      assertEquals((byte)10, ConstantPoolEntry.CP_Methodref);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("", 2693);
      CPClass cPClass0 = new CPClass(cPUTF8_0, 624);
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, cPUTF8_0, (byte)12);
      CPFieldRef cPFieldRef0 = new CPFieldRef(cPClass0, cPNameAndType0, 9);
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      classConstantPool0.resolve((Segment) null);
      cPFieldRef0.resolve(classConstantPool0);
      assertEquals((byte)10, ConstantPoolEntry.CP_Methodref);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("r@F6e.nQ#?1");
      CPClass cPClass0 = new CPClass(cPUTF8_0, 13);
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, cPUTF8_0, (byte)7);
      CPFieldRef cPFieldRef0 = new CPFieldRef(cPClass0, cPNameAndType0, (byte)4);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      DataOutputStream dataOutputStream0 = new DataOutputStream(pipedOutputStream0);
      try { 
        cPFieldRef0.writeBody(dataOutputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8(")^K*@ni?Z");
      CPClass cPClass0 = new CPClass(cPUTF8_0, 0);
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, cPUTF8_0, 1813);
      CPFieldRef cPFieldRef0 = new CPFieldRef(cPClass0, cPNameAndType0, 0);
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      // Undeclared exception!
      try { 
        cPFieldRef0.resolve(classConstantPool0);
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
      CPFieldRef cPFieldRef0 = new CPFieldRef((CPClass) null, (CPNameAndType) null, (-3082));
      cPFieldRef0.hashCode();
      cPFieldRef0.hashCode();
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("yescripto,");
      CPClass cPClass0 = new CPClass(cPUTF8_0, (byte)5);
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, cPUTF8_0, (byte)8);
      CPFieldRef cPFieldRef0 = new CPFieldRef(cPClass0, cPNameAndType0, (byte)1);
      cPFieldRef0.hashCode();
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("fload_1");
      CPClass cPClass0 = new CPClass(cPUTF8_0, (byte)7);
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, cPUTF8_0, (byte)5);
      CPFieldRef cPFieldRef0 = new CPFieldRef(cPClass0, cPNameAndType0, (byte)10);
      CPFieldRef cPFieldRef1 = new CPFieldRef(cPClass0, (CPNameAndType) null, (byte)11);
      boolean boolean0 = cPFieldRef0.equals(cPFieldRef1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("yescripto,");
      CPClass cPClass0 = new CPClass(cPUTF8_0, (byte)5);
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, cPUTF8_0, (byte)8);
      CPFieldRef cPFieldRef0 = new CPFieldRef(cPClass0, cPNameAndType0, (byte)1);
      CPFieldRef cPFieldRef1 = new CPFieldRef(cPClass0, cPNameAndType0, (byte)5);
      boolean boolean0 = cPFieldRef0.equals(cPFieldRef1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("yescripto,");
      CPClass cPClass0 = new CPClass(cPUTF8_0, (byte)5);
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, cPUTF8_0, (byte)8);
      CPFieldRef cPFieldRef0 = new CPFieldRef(cPClass0, cPNameAndType0, (byte)1);
      boolean boolean0 = cPFieldRef0.equals(cPClass0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CPFieldRef cPFieldRef0 = new CPFieldRef((CPClass) null, (CPNameAndType) null, (-3082));
      boolean boolean0 = cPFieldRef0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8(">Mxdkn&a*G}4,BX>");
      CPClass cPClass0 = new CPClass(cPUTF8_0, (byte)11);
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, cPUTF8_0, (byte)6);
      CPFieldRef cPFieldRef0 = new CPFieldRef(cPClass0, cPNameAndType0, (byte)8);
      boolean boolean0 = cPFieldRef0.equals(cPFieldRef0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8(">Mxdkn&a*G}4,BX>");
      CPClass cPClass0 = new CPClass(cPUTF8_0, (byte)11);
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, cPUTF8_0, (byte)6);
      CPFieldRef cPFieldRef0 = new CPFieldRef(cPClass0, cPNameAndType0, (byte)8);
      CPFieldRef cPFieldRef1 = new CPFieldRef((CPClass) null, cPNameAndType0, (byte)7);
      boolean boolean0 = cPFieldRef0.equals(cPFieldRef1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("Ze2u8jT*OS[\"cUfW4}");
      CPClass cPClass0 = new CPClass(cPUTF8_0, 218);
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, cPUTF8_0, (byte)9);
      CPFieldRef cPFieldRef0 = new CPFieldRef(cPClass0, cPNameAndType0, (byte)12);
      DataOutputStream dataOutputStream0 = new DataOutputStream((OutputStream) null);
      // Undeclared exception!
      try { 
        cPFieldRef0.writeBody(dataOutputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CPFieldRef cPFieldRef0 = new CPFieldRef((CPClass) null, (CPNameAndType) null, (-3082));
      // Undeclared exception!
      try { 
        cPFieldRef0.resolve((ClassConstantPool) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.CPFieldRef", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("Ze2u8jT*OS[\"cUfW4}");
      CPClass cPClass0 = new CPClass(cPUTF8_0, 218);
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, cPUTF8_0, (byte)9);
      CPFieldRef cPFieldRef0 = new CPFieldRef(cPClass0, cPNameAndType0, (byte)12);
      String string0 = cPFieldRef0.toString();
      assertEquals("FieldRef: Class: Ze2u8jT*OS[\"cUfW4}#NameAndType: UTF-8:Ze2u8jT*OS[\"cUfW4}(UTF-8:Ze2u8jT*OS[\"cUfW4})", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("Ze2u8jT*OS[\"cUfW4}");
      CPClass cPClass0 = new CPClass(cPUTF8_0, 218);
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, cPUTF8_0, (byte)9);
      CPFieldRef cPFieldRef0 = new CPFieldRef(cPClass0, cPNameAndType0, (byte)12);
      ClassFileEntry[] classFileEntryArray0 = cPFieldRef0.getNestedClassFileEntries();
      assertEquals(2, classFileEntryArray0.length);
  }
}