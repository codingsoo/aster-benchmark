
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
import java.io.File;
import java.io.IOException;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPFloat;
import org.apache.commons.compress.harmony.unpack200.bytecode.ConstantPoolEntry;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class CPFloat_ESTest extends CPFloat_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Float float0 = new Float((-1229.4972F));
      CPFloat cPFloat0 = new CPFloat(float0, 0);
      File file0 = MockFile.createTempFile("Xh-6T;[fL", "Xh-6T;[fL", (File) null);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(file0);
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockFileOutputStream0);
      cPFloat0.writeBody(dataOutputStream0);
      assertEquals((byte)7, ConstantPoolEntry.CP_Class);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Float float0 = new Float(1417.388037);
      CPFloat cPFloat0 = new CPFloat(float0, (-427));
      // Undeclared exception!
      try { 
        cPFloat0.writeBody((DataOutputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.CPFloat", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Float float0 = new Float((-1229.4972F));
      CPFloat cPFloat0 = new CPFloat(float0, 0);
      File file0 = MockFile.createTempFile("Xh-6T;[fL", "Xh-6T;[fL", (File) null);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(file0);
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockFileOutputStream0);
      dataOutputStream0.close();
      try { 
        cPFloat0.writeBody(dataOutputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      CPFloat cPFloat0 = null;
      try {
        cPFloat0 = new CPFloat((Float) null, 881);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // value
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Float float0 = new Float((float) (-1505));
      CPFloat cPFloat0 = new CPFloat(float0, (-1505));
      String string0 = cPFloat0.toString();
      assertEquals("Float: -1505.0", string0);
  }
}