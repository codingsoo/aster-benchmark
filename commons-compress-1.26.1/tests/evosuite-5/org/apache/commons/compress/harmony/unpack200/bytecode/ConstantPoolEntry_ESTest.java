
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
import java.io.OutputStream;
import java.io.PipedOutputStream;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPClass;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPDouble;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPLong;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class ConstantPoolEntry_ESTest extends ConstantPoolEntry_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Double double0 = new Double(3492.648360092586);
      CPDouble cPDouble0 = new CPDouble(double0, 0);
      assertEquals((byte)6, cPDouble0.getTag());
      
      cPDouble0.tag = (byte)0;
      byte byte0 = cPDouble0.getTag();
      assertEquals((byte)0, byte0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Long long0 = new Long((-1264L));
      CPLong cPLong0 = new CPLong(long0, (-1450));
      cPLong0.tag = (byte) (-125);
      byte byte0 = cPLong0.getTag();
      assertEquals((byte) (-125), byte0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Double double0 = new Double(3492.648360092586);
      CPDouble cPDouble0 = new CPDouble(double0, 0);
      int int0 = cPDouble0.getGlobalIndex();
      assertEquals(0, int0);
      assertEquals((byte)6, cPDouble0.getTag());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("i_RdY4cZ|MfY{%A9C", (-925));
      int int0 = cPUTF8_0.getGlobalIndex();
      assertEquals((-925), int0);
      assertEquals((byte)1, cPUTF8_0.getTag());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("wzgsbBbA{@!");
      cPUTF8_0.equals("wzgsbBbA{@!");
      assertEquals((byte)1, cPUTF8_0.getTag());
      assertEquals((-1), cPUTF8_0.getGlobalIndex());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("_7Z,_Q|Y1", (-700));
      CPClass cPClass0 = new CPClass(cPUTF8_0, 19);
      DataOutputStream dataOutputStream0 = new DataOutputStream((OutputStream) null);
      // Undeclared exception!
      try { 
        cPClass0.doWrite(dataOutputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Double double0 = new Double((-97.3467761977627));
      CPDouble cPDouble0 = new CPDouble(double0, 0);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      DataOutputStream dataOutputStream0 = new DataOutputStream(pipedOutputStream0);
      try { 
        cPDouble0.doWrite(dataOutputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Double double0 = new Double(3492.648360092586);
      CPDouble cPDouble0 = new CPDouble(double0, 0);
      byte byte0 = cPDouble0.getTag();
      assertEquals((byte)6, byte0);
      assertEquals(0, cPDouble0.getGlobalIndex());
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Double double0 = new Double(0.0);
      CPDouble cPDouble0 = new CPDouble(double0, 4);
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream((byte)10);
      DataOutputStream dataOutputStream0 = new DataOutputStream(byteArrayOutputStream0);
      cPDouble0.doWrite(dataOutputStream0);
      assertEquals("\u0006\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000", byteArrayOutputStream0.toString());
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      Double double0 = new Double(0.0);
      CPDouble cPDouble0 = new CPDouble(double0, 4);
      int int0 = cPDouble0.getGlobalIndex();
      assertEquals((byte)6, cPDouble0.getTag());
      assertEquals(4, int0);
  }
}
