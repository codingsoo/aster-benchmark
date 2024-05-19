
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
import org.apache.commons.codec.digest.PureJavaCrc32C;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class PureJavaCrc32C_ESTest extends PureJavaCrc32C_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      PureJavaCrc32C pureJavaCrc32C0 = new PureJavaCrc32C();
      pureJavaCrc32C0.update(313797554);
      assertEquals(22237551L, pureJavaCrc32C0.getValue());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      PureJavaCrc32C pureJavaCrc32C0 = new PureJavaCrc32C();
      byte[] byteArray0 = new byte[5];
      byteArray0[4] = (byte)59;
      // Undeclared exception!
      try { 
        pureJavaCrc32C0.update(byteArray0, (int) (byte)0, 1211244662);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 5
         //
         verifyException("org.apache.commons.codec.digest.PureJavaCrc32C", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      PureJavaCrc32C pureJavaCrc32C0 = new PureJavaCrc32C();
      byte[] byteArray0 = new byte[5];
      byteArray0[3] = (byte) (-57);
      // Undeclared exception!
      try { 
        pureJavaCrc32C0.update(byteArray0, (int) (byte)0, 115);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 5
         //
         verifyException("org.apache.commons.codec.digest.PureJavaCrc32C", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      PureJavaCrc32C pureJavaCrc32C0 = new PureJavaCrc32C();
      byte[] byteArray0 = new byte[5];
      byteArray0[2] = (byte)96;
      // Undeclared exception!
      try { 
        pureJavaCrc32C0.update(byteArray0, (int) (byte)0, 115);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 5
         //
         verifyException("org.apache.commons.codec.digest.PureJavaCrc32C", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PureJavaCrc32C pureJavaCrc32C0 = new PureJavaCrc32C();
      byte[] byteArray0 = new byte[5];
      byteArray0[1] = (byte) (-86);
      // Undeclared exception!
      try { 
        pureJavaCrc32C0.update(byteArray0, (int) (byte)0, 1211244662);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 5
         //
         verifyException("org.apache.commons.codec.digest.PureJavaCrc32C", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PureJavaCrc32C pureJavaCrc32C0 = new PureJavaCrc32C();
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)87;
      // Undeclared exception!
      try { 
        pureJavaCrc32C0.update(byteArray0, (int) (byte)0, 115);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 6
         //
         verifyException("org.apache.commons.codec.digest.PureJavaCrc32C", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PureJavaCrc32C pureJavaCrc32C0 = new PureJavaCrc32C();
      pureJavaCrc32C0.reset();
      assertEquals(0L, pureJavaCrc32C0.getValue());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PureJavaCrc32C pureJavaCrc32C0 = new PureJavaCrc32C();
      byte[] byteArray0 = new byte[8];
      pureJavaCrc32C0.update(byteArray0, 0, (-623));
      assertEquals(0L, pureJavaCrc32C0.getValue());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PureJavaCrc32C pureJavaCrc32C0 = new PureJavaCrc32C();
      byte[] byteArray0 = new byte[8];
      pureJavaCrc32C0.update(byteArray0, 1, 7);
      assertEquals(3141429869L, pureJavaCrc32C0.getValue());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      PureJavaCrc32C pureJavaCrc32C0 = new PureJavaCrc32C();
      // Undeclared exception!
      try { 
        pureJavaCrc32C0.update(byteArray0, (int) (byte)6, (int) (byte)6);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 6
         //
         verifyException("org.apache.commons.codec.digest.PureJavaCrc32C", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PureJavaCrc32C pureJavaCrc32C0 = new PureJavaCrc32C();
      // Undeclared exception!
      try { 
        pureJavaCrc32C0.update((byte[]) null, (-3335), 5);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.PureJavaCrc32C", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      PureJavaCrc32C pureJavaCrc32C0 = new PureJavaCrc32C();
      byte[] byteArray0 = new byte[4];
      // Undeclared exception!
      try { 
        pureJavaCrc32C0.update(byteArray0, (int) (byte) (-78), 4);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -78
         //
         verifyException("org.apache.commons.codec.digest.PureJavaCrc32C", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      PureJavaCrc32C pureJavaCrc32C0 = new PureJavaCrc32C();
      pureJavaCrc32C0.update(byteArray0, (int) (byte)2, (int) (byte)2);
      assertEquals(4049696722L, pureJavaCrc32C0.getValue());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      PureJavaCrc32C pureJavaCrc32C0 = new PureJavaCrc32C();
      byte[] byteArray0 = new byte[7];
      // Undeclared exception!
      try { 
        pureJavaCrc32C0.update(byteArray0, 302, 1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 302
         //
         verifyException("org.apache.commons.codec.digest.PureJavaCrc32C", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      PureJavaCrc32C pureJavaCrc32C0 = new PureJavaCrc32C();
      byte[] byteArray0 = new byte[8];
      // Undeclared exception!
      try { 
        pureJavaCrc32C0.update(byteArray0, 0, 2075979607);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 8
         //
         verifyException("org.apache.commons.codec.digest.PureJavaCrc32C", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      PureJavaCrc32C pureJavaCrc32C0 = new PureJavaCrc32C();
      byte[] byteArray0 = new byte[2];
      // Undeclared exception!
      try { 
        pureJavaCrc32C0.update(byteArray0, 24, 3);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 24
         //
         verifyException("org.apache.commons.codec.digest.PureJavaCrc32C", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      PureJavaCrc32C pureJavaCrc32C0 = new PureJavaCrc32C();
      pureJavaCrc32C0.update((-1));
      long long0 = pureJavaCrc32C0.getValue();
      assertEquals(4278190080L, long0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      PureJavaCrc32C pureJavaCrc32C0 = new PureJavaCrc32C();
      long long0 = pureJavaCrc32C0.getValue();
      assertEquals(0L, long0);
  }
}
