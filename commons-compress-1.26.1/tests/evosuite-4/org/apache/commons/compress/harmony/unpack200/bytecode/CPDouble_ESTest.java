
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
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PipedOutputStream;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPDouble;
import org.apache.commons.compress.harmony.unpack200.bytecode.ConstantPoolEntry;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class CPDouble_ESTest extends CPDouble_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Double double0 = new Double(0.0);
      CPDouble cPDouble0 = new CPDouble(double0, (-2503));
      DataOutputStream dataOutputStream0 = new DataOutputStream((OutputStream) null);
      // Undeclared exception!
      try { 
        cPDouble0.writeBody(dataOutputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Double double0 = new Double(250.5049);
      CPDouble cPDouble0 = new CPDouble(double0, (-1687));
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      FilterOutputStream filterOutputStream0 = new FilterOutputStream(pipedOutputStream0);
      DataOutputStream dataOutputStream0 = new DataOutputStream(filterOutputStream0);
      try { 
        cPDouble0.writeBody(dataOutputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      CPDouble cPDouble0 = null;
      try {
        cPDouble0 = new CPDouble((Double) null, (-1264));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // value
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Double double0 = new Double((-1416.14956698652));
      CPDouble cPDouble0 = new CPDouble(double0, 0);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("4dfS7p");
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockFileOutputStream0);
      cPDouble0.writeBody(dataOutputStream0);
      assertEquals((byte)5, ConstantPoolEntry.CP_Long);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Double double0 = new Double((-1416.14956698652));
      CPDouble cPDouble0 = new CPDouble(double0, 0);
      String string0 = cPDouble0.toString();
      assertEquals("Double: -1416.14956698652", string0);
  }
}
