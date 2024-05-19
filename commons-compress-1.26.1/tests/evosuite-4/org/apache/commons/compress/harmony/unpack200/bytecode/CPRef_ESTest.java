
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
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PipedOutputStream;
import org.apache.commons.compress.harmony.unpack200.Segment;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPClass;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPInterfaceMethodRef;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPMethodRef;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPNameAndType;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8;
import org.apache.commons.compress.harmony.unpack200.bytecode.ClassConstantPool;
import org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry;
import org.apache.commons.compress.harmony.unpack200.bytecode.ConstantPoolEntry;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class CPRef_ESTest extends CPRef_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("");
      CPClass cPClass0 = new CPClass(cPUTF8_0, (byte)10);
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, cPUTF8_0, (byte)11);
      CPInterfaceMethodRef cPInterfaceMethodRef0 = new CPInterfaceMethodRef(cPClass0, cPNameAndType0, (byte)5);
      cPInterfaceMethodRef0.classNameIndex = (int) (byte)11;
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream((byte)10);
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream(byteArrayOutputStream0);
      DataOutputStream dataOutputStream0 = new DataOutputStream(objectOutputStream0);
      cPInterfaceMethodRef0.writeBody(dataOutputStream0);
      assertEquals((byte)6, ConstantPoolEntry.CP_Double);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("2-LV~$[I", 0);
      CPClass cPClass0 = new CPClass(cPUTF8_0, (byte)12);
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, cPUTF8_0, (byte)7);
      CPInterfaceMethodRef cPInterfaceMethodRef0 = new CPInterfaceMethodRef(cPClass0, cPNameAndType0, (byte)8);
      cPInterfaceMethodRef0.tag = (byte)12;
      String string0 = cPInterfaceMethodRef0.toString();
      assertEquals("unknown: Class: 2-LV~$[I#NameAndType: UTF-8:2-LV~$[I(UTF-8:2-LV~$[I)", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("l2i", 846);
      CPClass cPClass0 = new CPClass(cPUTF8_0, (byte)10);
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, cPUTF8_0, 2437);
      CPInterfaceMethodRef cPInterfaceMethodRef0 = new CPInterfaceMethodRef(cPClass0, cPNameAndType0, (byte)1);
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      classConstantPool0.resolve((Segment) null);
      cPInterfaceMethodRef0.resolve(classConstantPool0);
      assertEquals((byte)6, ConstantPoolEntry.CP_Double);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("2-LV~$[I", 0);
      CPClass cPClass0 = new CPClass(cPUTF8_0, (byte)12);
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, cPUTF8_0, (byte)7);
      CPInterfaceMethodRef cPInterfaceMethodRef0 = new CPInterfaceMethodRef(cPClass0, cPNameAndType0, (byte)8);
      cPInterfaceMethodRef0.cachedToString = "";
      String string0 = cPInterfaceMethodRef0.toString();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("InterfaceMethodRef");
      CPClass cPClass0 = new CPClass(cPUTF8_0, (byte)9);
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, cPUTF8_0, 0);
      CPMethodRef cPMethodRef0 = new CPMethodRef(cPClass0, cPNameAndType0, 0);
      DataOutputStream dataOutputStream0 = new DataOutputStream((OutputStream) null);
      // Undeclared exception!
      try { 
        cPMethodRef0.writeBody(dataOutputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("xmkI><COi0k");
      CPClass cPClass0 = new CPClass(cPUTF8_0, (byte)4);
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, cPUTF8_0, 0);
      CPInterfaceMethodRef cPInterfaceMethodRef0 = new CPInterfaceMethodRef(cPClass0, cPNameAndType0, 58);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      DataOutputStream dataOutputStream0 = new DataOutputStream(pipedOutputStream0);
      try { 
        cPInterfaceMethodRef0.writeBody(dataOutputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("*", 3211);
      CPClass cPClass0 = new CPClass(cPUTF8_0, 414);
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, cPUTF8_0, (-3502));
      CPInterfaceMethodRef cPInterfaceMethodRef0 = new CPInterfaceMethodRef(cPClass0, cPNameAndType0, (byte)11);
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      // Undeclared exception!
      try { 
        cPInterfaceMethodRef0.resolve(classConstantPool0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Constant pool is not yet resolved; this does not make any sense
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ClassConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("PN");
      CPClass cPClass0 = new CPClass(cPUTF8_0, (byte)12);
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, cPUTF8_0, (byte)7);
      CPInterfaceMethodRef cPInterfaceMethodRef0 = new CPInterfaceMethodRef(cPClass0, cPNameAndType0, (byte)8);
      cPInterfaceMethodRef0.tag = (byte)3;
      String string0 = cPInterfaceMethodRef0.toString();
      assertEquals("unknown: Class: PN#NameAndType: UTF-8:PN(UTF-8:PN)", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("");
      CPClass cPClass0 = new CPClass(cPUTF8_0, (byte)10);
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, cPUTF8_0, (byte)11);
      CPInterfaceMethodRef cPInterfaceMethodRef0 = new CPInterfaceMethodRef(cPClass0, cPNameAndType0, (byte)5);
      String string0 = cPInterfaceMethodRef0.toString();
      assertNotNull(string0);
      assertEquals("InterfaceMethodRef: Class: #NameAndType: UTF-8:(UTF-8:)", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("2-LV~$[I");
      CPClass cPClass0 = new CPClass(cPUTF8_0, (byte)12);
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, cPUTF8_0, (byte)7);
      CPInterfaceMethodRef cPInterfaceMethodRef0 = new CPInterfaceMethodRef(cPClass0, cPNameAndType0, (byte)8);
      cPInterfaceMethodRef0.tag = (byte)9;
      String string0 = cPInterfaceMethodRef0.toString();
      assertEquals("FieldRef: Class: 2-LV~$[I#NameAndType: UTF-8:2-LV~$[I(UTF-8:2-LV~$[I)", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("");
      CPClass cPClass0 = new CPClass(cPUTF8_0, (byte)4);
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, cPUTF8_0, (byte)12);
      CPMethodRef cPMethodRef0 = new CPMethodRef(cPClass0, cPNameAndType0, (byte)5);
      cPMethodRef0.toString();
      String string0 = cPMethodRef0.toString();
      assertEquals("MethoddRef: Class: #NameAndType: UTF-8:(UTF-8:)", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("");
      CPClass cPClass0 = new CPClass(cPUTF8_0, (byte)4);
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, cPUTF8_0, (byte)12);
      CPMethodRef cPMethodRef0 = new CPMethodRef(cPClass0, cPNameAndType0, (byte)5);
      CPMethodRef cPMethodRef1 = new CPMethodRef(cPClass0, cPNameAndType0, (byte)5);
      boolean boolean0 = cPMethodRef0.equals(cPMethodRef1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("?n");
      CPClass cPClass0 = new CPClass(cPUTF8_0, (byte)4);
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, cPUTF8_0, (byte)12);
      CPMethodRef cPMethodRef0 = new CPMethodRef(cPClass0, cPNameAndType0, (byte)5);
      boolean boolean0 = cPMethodRef0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("");
      CPClass cPClass0 = new CPClass(cPUTF8_0, (byte)4);
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, cPUTF8_0, (byte)12);
      CPMethodRef cPMethodRef0 = new CPMethodRef(cPClass0, cPNameAndType0, (byte)5);
      boolean boolean0 = cPMethodRef0.equals(cPMethodRef0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("");
      CPClass cPClass0 = new CPClass(cPUTF8_0, (byte)10);
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, cPUTF8_0, (byte)11);
      CPInterfaceMethodRef cPInterfaceMethodRef0 = new CPInterfaceMethodRef(cPClass0, cPNameAndType0, (byte)5);
      Object object0 = new Object();
      boolean boolean0 = cPInterfaceMethodRef0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("PN");
      CPClass cPClass0 = new CPClass(cPUTF8_0, (byte)12);
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, cPUTF8_0, (byte)7);
      CPInterfaceMethodRef cPInterfaceMethodRef0 = new CPInterfaceMethodRef(cPClass0, cPNameAndType0, (byte)8);
      ClassFileEntry[] classFileEntryArray0 = cPInterfaceMethodRef0.getNestedClassFileEntries();
      assertEquals(2, classFileEntryArray0.length);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("!AVT)l");
      CPClass cPClass0 = new CPClass(cPUTF8_0, 132);
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, cPUTF8_0, 18);
      CPInterfaceMethodRef cPInterfaceMethodRef0 = new CPInterfaceMethodRef(cPClass0, cPNameAndType0, 2);
      // Undeclared exception!
      try { 
        cPInterfaceMethodRef0.resolve((ClassConstantPool) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.CPRef", e);
      }
  }
}
