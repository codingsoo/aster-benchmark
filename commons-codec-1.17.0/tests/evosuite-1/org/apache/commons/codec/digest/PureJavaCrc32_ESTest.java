
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
import org.apache.commons.codec.digest.PureJavaCrc32;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class PureJavaCrc32_ESTest extends PureJavaCrc32_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      PureJavaCrc32 pureJavaCrc32_0 = new PureJavaCrc32();
      byte[] byteArray0 = new byte[9];
      byteArray0[4] = (byte) (-108);
      // Undeclared exception!
      try { 
        pureJavaCrc32_0.update(byteArray0, (int) (byte)0, (int) (byte)69);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 9
         //
         verifyException("org.apache.commons.codec.digest.PureJavaCrc32", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      PureJavaCrc32 pureJavaCrc32_0 = new PureJavaCrc32();
      byte[] byteArray0 = new byte[9];
      byteArray0[3] = (byte)1;
      // Undeclared exception!
      try { 
        pureJavaCrc32_0.update(byteArray0, (int) (byte)0, (int) (byte)49);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 9
         //
         verifyException("org.apache.commons.codec.digest.PureJavaCrc32", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      PureJavaCrc32 pureJavaCrc32_0 = new PureJavaCrc32();
      byte[] byteArray0 = new byte[9];
      byteArray0[2] = (byte) (-22);
      // Undeclared exception!
      try { 
        pureJavaCrc32_0.update(byteArray0, (int) (byte)0, (int) (byte)49);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 9
         //
         verifyException("org.apache.commons.codec.digest.PureJavaCrc32", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      PureJavaCrc32 pureJavaCrc32_0 = new PureJavaCrc32();
      byte[] byteArray0 = new byte[2];
      byteArray0[1] = (byte) (-127);
      // Undeclared exception!
      try { 
        pureJavaCrc32_0.update(byteArray0, 0, (int) (byte)16);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
         verifyException("org.apache.commons.codec.digest.PureJavaCrc32", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PureJavaCrc32 pureJavaCrc32_0 = new PureJavaCrc32();
      byte[] byteArray0 = new byte[24];
      byteArray0[1] = (byte)1;
      // Undeclared exception!
      try { 
        pureJavaCrc32_0.update(byteArray0, 0, 2018);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 24
         //
         verifyException("org.apache.commons.codec.digest.PureJavaCrc32", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PureJavaCrc32 pureJavaCrc32_0 = new PureJavaCrc32();
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte) (-1);
      // Undeclared exception!
      try { 
        pureJavaCrc32_0.update(byteArray0, (int) (byte)0, (int) (byte)49);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 9
         //
         verifyException("org.apache.commons.codec.digest.PureJavaCrc32", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PureJavaCrc32 pureJavaCrc32_0 = new PureJavaCrc32();
      pureJavaCrc32_0.update((-429));
      long long0 = pureJavaCrc32_0.getValue();
      assertEquals(543223747L, long0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PureJavaCrc32 pureJavaCrc32_0 = new PureJavaCrc32();
      // Undeclared exception!
      try { 
        pureJavaCrc32_0.update((byte[]) null, (-1281015991), (-1281015991));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.PureJavaCrc32", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PureJavaCrc32 pureJavaCrc32_0 = new PureJavaCrc32();
      byte[] byteArray0 = new byte[1];
      // Undeclared exception!
      try { 
        pureJavaCrc32_0.update(byteArray0, (-2761), (-2761));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2761
         //
         verifyException("org.apache.commons.codec.digest.PureJavaCrc32", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PureJavaCrc32 pureJavaCrc32_0 = new PureJavaCrc32();
      byte[] byteArray0 = new byte[24];
      pureJavaCrc32_0.update(byteArray0, 0, (int) (byte) (-106));
      assertEquals(2982322595L, pureJavaCrc32_0.getValue());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PureJavaCrc32 pureJavaCrc32_0 = new PureJavaCrc32();
      byte[] byteArray0 = new byte[24];
      // Undeclared exception!
      try { 
        pureJavaCrc32_0.update(byteArray0, (-2515), (-2515));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2515
         //
         verifyException("org.apache.commons.codec.digest.PureJavaCrc32", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      PureJavaCrc32 pureJavaCrc32_0 = new PureJavaCrc32();
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        pureJavaCrc32_0.update(byteArray0, (-2388), (-2388));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2388
         //
         verifyException("org.apache.commons.codec.digest.PureJavaCrc32", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      PureJavaCrc32 pureJavaCrc32_0 = new PureJavaCrc32();
      byte[] byteArray0 = new byte[5];
      // Undeclared exception!
      try { 
        pureJavaCrc32_0.update(byteArray0, (-429), (-429));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -429
         //
         verifyException("org.apache.commons.codec.digest.PureJavaCrc32", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      PureJavaCrc32 pureJavaCrc32_0 = new PureJavaCrc32();
      byte[] byteArray0 = new byte[6];
      // Undeclared exception!
      try { 
        pureJavaCrc32_0.update(byteArray0, 788, (int) (byte) (-54));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 788
         //
         verifyException("org.apache.commons.codec.digest.PureJavaCrc32", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      PureJavaCrc32 pureJavaCrc32_0 = new PureJavaCrc32();
      byte[] byteArray0 = new byte[3];
      pureJavaCrc32_0.update(byteArray0, (int) (byte)0, 1);
      assertEquals(3523407757L, pureJavaCrc32_0.getValue());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      PureJavaCrc32 pureJavaCrc32_0 = new PureJavaCrc32();
      byte[] byteArray0 = new byte[6];
      pureJavaCrc32_0.update(byteArray0, 0, (int) (byte)0);
      assertEquals(0L, pureJavaCrc32_0.getValue());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      PureJavaCrc32 pureJavaCrc32_0 = new PureJavaCrc32();
      pureJavaCrc32_0.reset();
      assertEquals(0L, pureJavaCrc32_0.getValue());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      PureJavaCrc32 pureJavaCrc32_0 = new PureJavaCrc32();
      long long0 = pureJavaCrc32_0.getValue();
      assertEquals(0L, long0);
  }
}