
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
import org.apache.commons.compress.harmony.unpack200.bytecode.CPFloat;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPLong;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPNameAndType;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class ConstantPoolEntry_ESTest extends ConstantPoolEntry_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8(";3{/byW[,");
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream((byte)6);
      DataOutputStream dataOutputStream0 = new DataOutputStream(byteArrayOutputStream0);
      cPUTF8_0.doWrite(dataOutputStream0);
      assertEquals("\u0001\u0000\t;3{/byW[,", byteArrayOutputStream0.toString());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("1kOO&%S)1x+T|1A\"RV", 962);
      assertEquals((byte)1, cPUTF8_0.getTag());
      
      cPUTF8_0.tag = (byte)0;
      byte byte0 = cPUTF8_0.getTag();
      assertEquals((byte)0, byte0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Long long0 = new Long(3L);
      CPLong cPLong0 = new CPLong(long0, 3);
      cPLong0.tag = (byte) (-2);
      byte byte0 = cPLong0.getTag();
      assertEquals((byte) (-2), byte0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("1kO,&%S)1x+T|1A\"RV", 1004);
      assertEquals(1004, cPUTF8_0.getGlobalIndex());
      
      cPUTF8_0.setGlobalIndex(0);
      int int0 = cPUTF8_0.getGlobalIndex();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("1kOO&%S)1x+T|1A\"RV", 962);
      int int0 = cPUTF8_0.getGlobalIndex();
      assertEquals(962, int0);
      assertEquals((byte)1, cPUTF8_0.getTag());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("", 0);
      CPNameAndType cPNameAndType0 = new CPNameAndType(cPUTF8_0, cPUTF8_0, 12);
      cPNameAndType0.equals(cPUTF8_0);
      assertEquals((byte)1, cPUTF8_0.getTag());
      assertEquals(12, cPNameAndType0.getGlobalIndex());
      assertEquals((byte)12, cPNameAndType0.getTag());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Float float0 = new Float((-179.6F));
      CPFloat cPFloat0 = new CPFloat(float0, 181);
      // Undeclared exception!
      try { 
        cPFloat0.doWrite((DataOutputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.ConstantPoolEntry", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Long long0 = new Long(0L);
      CPLong cPLong0 = new CPLong(long0, 3);
      byte byte0 = cPLong0.getTag();
      assertEquals((byte)5, byte0);
      assertEquals(3, cPLong0.getGlobalIndex());
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("Long: 0");
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      DataOutputStream dataOutputStream0 = new DataOutputStream(pipedOutputStream0);
      try { 
        cPUTF8_0.doWrite(dataOutputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      CPUTF8 cPUTF8_0 = new CPUTF8("lstore");
      int int0 = cPUTF8_0.getGlobalIndex();
      assertEquals((-1), int0);
      assertEquals((byte)1, cPUTF8_0.getTag());
  }
}
