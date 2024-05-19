
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


package org.apache.commons.codec.digest;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.codec.digest.XXHash32;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class XXHash32_ESTest extends XXHash32_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      XXHash32 xXHash32_0 = new XXHash32();
      byte[] byteArray0 = new byte[32];
      // Undeclared exception!
      try { 
        xXHash32_0.update(byteArray0, 6, 30);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      XXHash32 xXHash32_0 = new XXHash32(145);
      byte[] byteArray0 = new byte[9];
      xXHash32_0.update(byteArray0, 1, 1);
      assertEquals(4060666947L, xXHash32_0.getValue());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      XXHash32 xXHash32_0 = new XXHash32(0);
      byte[] byteArray0 = new byte[0];
      xXHash32_0.update(byteArray0, 0, 0);
      assertEquals(46947589L, xXHash32_0.getValue());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      XXHash32 xXHash32_0 = new XXHash32();
      byte[] byteArray0 = new byte[32];
      xXHash32_0.update((-1980));
      byteArray0[3] = (byte) (-8);
      xXHash32_0.update(byteArray0, 0, 30);
      assertEquals(1839939230L, xXHash32_0.getValue());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      XXHash32 xXHash32_0 = new XXHash32();
      xXHash32_0.update((int) (byte) (-44));
      long long0 = xXHash32_0.getValue();
      assertEquals(574920255L, long0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      XXHash32 xXHash32_0 = new XXHash32(0);
      xXHash32_0.update(0);
      xXHash32_0.update(0);
      xXHash32_0.update((int) (byte) (-121));
      xXHash32_0.update((int) (byte) (-79));
      long long0 = xXHash32_0.getValue();
      assertEquals(179682747L, long0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      XXHash32 xXHash32_0 = new XXHash32();
      byte[] byteArray0 = new byte[32];
      xXHash32_0.update((-1980));
      xXHash32_0.update((int) (byte) (-6));
      byteArray0[6] = (byte) (-6);
      xXHash32_0.update(byteArray0, 0, 30);
      long long0 = xXHash32_0.getValue();
      assertEquals(979076707L, long0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      XXHash32 xXHash32_0 = new XXHash32();
      byte[] byteArray0 = new byte[41];
      xXHash32_0.update(byteArray0, (int) (byte)0, 30);
      xXHash32_0.update((int) (byte) (-44));
      xXHash32_0.update((int) (byte)0);
      assertEquals(3736619996L, xXHash32_0.getValue());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      XXHash32 xXHash32_0 = new XXHash32();
      // Undeclared exception!
      try { 
        xXHash32_0.update((byte[]) null, 1, 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      XXHash32 xXHash32_0 = new XXHash32();
      byte[] byteArray0 = new byte[32];
      xXHash32_0.update(byteArray0, (-925), (-3998));
      assertEquals(46947589L, xXHash32_0.getValue());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      XXHash32 xXHash32_0 = new XXHash32();
      xXHash32_0.reset();
      assertEquals(46947589L, xXHash32_0.getValue());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      XXHash32 xXHash32_0 = new XXHash32();
      byte[] byteArray0 = new byte[32];
      xXHash32_0.update(byteArray0, 0, 30);
      long long0 = xXHash32_0.getValue();
      assertEquals(2271093519L, long0);
  }
}
