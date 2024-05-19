
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
import org.apache.commons.compress.harmony.unpack200.bytecode.CPClass;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPNameAndType;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8;
import org.apache.commons.compress.harmony.unpack200.bytecode.ClassConstantPool;
import org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry;
import org.apache.commons.compress.harmony.unpack200.bytecode.EnclosingMethodAttribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.LineNumberTableAttribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.NewAttribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.SignatureAttribute;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class ClassFileEntry_ESTest extends ClassFileEntry_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("3Fg>[63{pD%TlfF");
      String string0 = cPUTF8_0.toString();
      assertEquals("UTF-8:3Fg>[63{pD%TlfF", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("c@DY(LFL");
      SignatureAttribute signatureAttribute0 = new SignatureAttribute(cPUTF8_0);
      ClassFileEntry[] classFileEntryArray0 = signatureAttribute0.getNestedClassFileEntries();
      assertEquals(2, classFileEntryArray0.length);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("+");
      boolean boolean0 = cPUTF8_0.equals(cPUTF8_0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("c@DY(LFL");
      SignatureAttribute signatureAttribute0 = new SignatureAttribute(cPUTF8_0);
      boolean boolean0 = signatureAttribute0.equals("c@DY(LFL");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("!mJE3~Y$TV[O^h", 66);
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      cPUTF8_0.resolve(classConstantPool0);
      // Undeclared exception!
      try { 
        cPUTF8_0.write((DataOutputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ConstantPoolEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      NewAttribute newAttribute0 = new NewAttribute((CPUTF8) null, (byte)9);
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
  public void test06()  throws Throwable  {
      int[] intArray0 = new int[0];
      LineNumberTableAttribute lineNumberTableAttribute0 = new LineNumberTableAttribute(130, intArray0, intArray0);
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      // Undeclared exception!
      try { 
        lineNumberTableAttribute0.resolve(classConstantPool0);
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
      CPUTF8 cPUTF8_0 = new CPUTF8(">pythB8Bf.JS", 38);
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, cPUTF8_0, (byte)8);
      EnclosingMethodAttribute enclosingMethodAttribute0 = new EnclosingMethodAttribute((CPClass) null, cPNameAndType0);
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream((byte)7);
      DataOutputStream dataOutputStream0 = new DataOutputStream(byteArrayOutputStream0);
      // Undeclared exception!
      try { 
        enclosingMethodAttribute0.write(dataOutputStream0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Entry has not been resolved
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      int[] intArray0 = new int[3];
      LineNumberTableAttribute lineNumberTableAttribute0 = new LineNumberTableAttribute(840, intArray0, intArray0);
      int int0 = lineNumberTableAttribute0.objectHashCode();
      //  // Unstable assertion: assertEquals(2055490533, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("!mJE3~Y$+TV[O^h");
      ClassConstantPool classConstantPool0 = new ClassConstantPool();
      cPUTF8_0.resolve(classConstantPool0);
      MockPrintStream mockPrintStream0 = new MockPrintStream("!mJE3~Y$+TV[O^h");
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockPrintStream0);
      cPUTF8_0.write(dataOutputStream0);
      assertEquals("!mJE3~Y$+TV[O^h", cPUTF8_0.underlyingString());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("+");
      ClassFileEntry[] classFileEntryArray0 = cPUTF8_0.getNestedClassFileEntries();
      assertEquals(0, classFileEntryArray0.length);
  }
}
