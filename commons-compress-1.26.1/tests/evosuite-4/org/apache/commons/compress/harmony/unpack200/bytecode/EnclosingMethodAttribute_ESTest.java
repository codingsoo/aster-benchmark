
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
import java.io.IOException;
import org.apache.commons.compress.harmony.unpack200.Segment;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPClass;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPNameAndType;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8;
import org.apache.commons.compress.harmony.unpack200.bytecode.ClassConstantPool;
import org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry;
import org.apache.commons.compress.harmony.unpack200.bytecode.ConstantPoolEntry;
import org.apache.commons.compress.harmony.unpack200.bytecode.EnclosingMethodAttribute;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class EnclosingMethodAttribute_ESTest extends EnclosingMethodAttribute_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      EnclosingMethodAttribute enclosingMethodAttribute0 = new EnclosingMethodAttribute((CPClass) null, (CPNameAndType) null);
      int int0 = enclosingMethodAttribute0.getLength();
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("org.apache.commons.compress.harmony.unpack200.bytecode.EnclosingMethodAttribute");
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, cPUTF8_0, (byte)12);
      EnclosingMethodAttribute enclosingMethodAttribute0 = new EnclosingMethodAttribute((CPClass) null, cPNameAndType0);
      // Undeclared exception!
      try { 
        enclosingMethodAttribute0.writeBody((DataOutputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.EnclosingMethodAttribute", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("EnclosingMethod");
      CPClass cPClass0 = new CPClass(cPUTF8_0, 0);
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, cPUTF8_0, (byte)12);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("EnclosingMethod");
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockFileOutputStream0);
      FileSystemHandling.shouldAllThrowIOExceptions();
      EnclosingMethodAttribute enclosingMethodAttribute0 = new EnclosingMethodAttribute(cPClass0, cPNameAndType0);
      try { 
        enclosingMethodAttribute0.writeBody(dataOutputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Simulated IOException
         //
         verifyException("org.evosuite.runtime.vfs.VirtualFileSystem", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("W#t^S<NdJ|k04{4cg(", 1758);
      CPClass cPClass0 = new CPClass(cPUTF8_0, (byte)9);
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, cPUTF8_0, 0);
      EnclosingMethodAttribute enclosingMethodAttribute0 = new EnclosingMethodAttribute(cPClass0, cPNameAndType0);
      // Undeclared exception!
      try { 
        enclosingMethodAttribute0.resolve((ClassConstantPool) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.Attribute", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      EnclosingMethodAttribute enclosingMethodAttribute0 = new EnclosingMethodAttribute((CPClass) null, (CPNameAndType) null);
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      // Undeclared exception!
      try { 
        enclosingMethodAttribute0.resolve(classConstantPool0);
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
      CPUTF8 cPUTF8_0 = new CPUTF8(";5!)Ofin'&Q6R");
      CPClass cPClass0 = new CPClass(cPUTF8_0, (byte)5);
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, cPUTF8_0, (byte)5);
      EnclosingMethodAttribute enclosingMethodAttribute0 = new EnclosingMethodAttribute(cPClass0, cPNameAndType0);
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      classConstantPool0.resolve((Segment) null);
      enclosingMethodAttribute0.resolve(classConstantPool0);
      assertEquals(0, classConstantPool0.size());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("H')8TX:J", 131);
      CPClass cPClass0 = new CPClass(cPUTF8_0, (byte)3);
      EnclosingMethodAttribute enclosingMethodAttribute0 = new EnclosingMethodAttribute(cPClass0, (CPNameAndType) null);
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      classConstantPool0.resolve((Segment) null);
      enclosingMethodAttribute0.resolve(classConstantPool0);
      assertFalse(enclosingMethodAttribute0.hasBCIRenumbering());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8(";5!)Ofin'&Q6R");
      CPClass cPClass0 = new CPClass(cPUTF8_0, (byte)5);
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, cPUTF8_0, (byte)5);
      EnclosingMethodAttribute enclosingMethodAttribute0 = new EnclosingMethodAttribute(cPClass0, cPNameAndType0);
      ClassFileEntry[] classFileEntryArray0 = enclosingMethodAttribute0.getNestedClassFileEntries();
      assertEquals(3, classFileEntryArray0.length);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("H')8TX:J", 131);
      CPClass cPClass0 = new CPClass(cPUTF8_0, (byte)3);
      EnclosingMethodAttribute enclosingMethodAttribute0 = new EnclosingMethodAttribute(cPClass0, (CPNameAndType) null);
      ClassFileEntry[] classFileEntryArray0 = enclosingMethodAttribute0.getNestedClassFileEntries();
      assertEquals(2, classFileEntryArray0.length);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8(";5!)Ofin'&Q6R");
      CPClass cPClass0 = new CPClass(cPUTF8_0, (byte)5);
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, cPUTF8_0, (byte)5);
      EnclosingMethodAttribute enclosingMethodAttribute0 = new EnclosingMethodAttribute(cPClass0, cPNameAndType0);
      String string0 = enclosingMethodAttribute0.toString();
      assertEquals("EnclosingMethod", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("B)jq%-tqkDnC`?n");
      CPClass cPClass0 = new CPClass(cPUTF8_0, (byte)4);
      CPNameAndType cPNameAndType0 = mock(CPNameAndType.class, new ViolatedAssumptionAnswer());
      EnclosingMethodAttribute enclosingMethodAttribute0 = new EnclosingMethodAttribute(cPClass0, cPNameAndType0);
      MockPrintStream mockPrintStream0 = new MockPrintStream("B)jq%-tqkDnC`?n");
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockPrintStream0);
      enclosingMethodAttribute0.writeBody(dataOutputStream0);
      assertEquals("EnclosingMethod", enclosingMethodAttribute0.toString());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("B)jq%-tqkDnC`?n");
      EnclosingMethodAttribute.setAttributeName(cPUTF8_0);
      assertEquals((byte)10, ConstantPoolEntry.CP_Methodref);
  }
}
