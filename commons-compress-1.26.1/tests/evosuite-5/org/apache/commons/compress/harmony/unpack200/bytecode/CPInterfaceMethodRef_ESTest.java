
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
import org.apache.commons.compress.harmony.unpack200.bytecode.CPClass;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPInterfaceMethodRef;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPNameAndType;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class CPInterfaceMethodRef_ESTest extends CPInterfaceMethodRef_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("(Q+&)\"Q");
      CPClass cPClass0 = new CPClass(cPUTF8_0, 796);
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, cPUTF8_0, (byte)3);
      CPInterfaceMethodRef cPInterfaceMethodRef0 = new CPInterfaceMethodRef(cPClass0, cPNameAndType0, (byte)9);
      int int0 = cPInterfaceMethodRef0.invokeInterfaceCount();
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("Oqi[G_L1/cwp");
      CPClass cPClass0 = new CPClass(cPUTF8_0, (byte)8);
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, cPUTF8_0, (byte)9);
      CPInterfaceMethodRef cPInterfaceMethodRef0 = new CPInterfaceMethodRef(cPClass0, cPNameAndType0, (byte)8);
      cPInterfaceMethodRef0.className = null;
      // Undeclared exception!
      try { 
        cPInterfaceMethodRef0.hashCode();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.CPInterfaceMethodRef", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("`pDn{x/}csHI9o");
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, cPUTF8_0, (-562));
      CPInterfaceMethodRef cPInterfaceMethodRef0 = null;
      try {
        cPInterfaceMethodRef0 = new CPInterfaceMethodRef((CPClass) null, cPNameAndType0, (byte)9);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // className
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("", 0);
      CPClass cPClass0 = new CPClass(cPUTF8_0, 0);
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, cPUTF8_0, (byte)9);
      CPInterfaceMethodRef cPInterfaceMethodRef0 = new CPInterfaceMethodRef(cPClass0, cPNameAndType0, 0);
      // Undeclared exception!
      try { 
        cPInterfaceMethodRef0.invokeInterfaceCount();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No arguments
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.SegmentUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("", 0);
      CPClass cPClass0 = new CPClass(cPUTF8_0, 0);
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, cPUTF8_0, (byte)9);
      CPInterfaceMethodRef cPInterfaceMethodRef0 = new CPInterfaceMethodRef(cPClass0, cPNameAndType0, 0);
      cPInterfaceMethodRef0.hashCode();
      cPInterfaceMethodRef0.hashCode();
  }
}
