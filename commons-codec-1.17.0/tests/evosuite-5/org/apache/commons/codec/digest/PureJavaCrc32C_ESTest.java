
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
      pureJavaCrc32C0.update(1559552647);
      assertEquals(71371970L, pureJavaCrc32C0.getValue());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      PureJavaCrc32C pureJavaCrc32C0 = new PureJavaCrc32C();
      byte[] byteArray0 = new byte[5];
      byteArray0[4] = (byte) (-1);
      // Undeclared exception!
      try { 
        pureJavaCrc32C0.update(byteArray0, (int) (byte)0, (int) (byte)15);
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
      byte[] byteArray0 = new byte[7];
      byteArray0[3] = (byte) (-29);
      // Undeclared exception!
      try { 
        pureJavaCrc32C0.update(byteArray0, 0, 968);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 7
         //
         verifyException("org.apache.commons.codec.digest.PureJavaCrc32C", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      PureJavaCrc32C pureJavaCrc32C0 = new PureJavaCrc32C();
      byte[] byteArray0 = new byte[5];
      byteArray0[2] = (byte)15;
      // Undeclared exception!
      try { 
        pureJavaCrc32C0.update(byteArray0, (int) (byte)0, (int) (byte)15);
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
      byteArray0[1] = (byte) (-9);
      // Undeclared exception!
      try { 
        pureJavaCrc32C0.update(byteArray0, (int) (byte)0, (int) (byte)15);
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
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte) (-1);
      // Undeclared exception!
      try { 
        pureJavaCrc32C0.update(byteArray0, 0, 968);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 7
         //
         verifyException("org.apache.commons.codec.digest.PureJavaCrc32C", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PureJavaCrc32C pureJavaCrc32C0 = new PureJavaCrc32C();
      // Undeclared exception!
      try { 
        pureJavaCrc32C0.update((byte[]) null, (-818), 356);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.PureJavaCrc32C", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PureJavaCrc32C pureJavaCrc32C0 = new PureJavaCrc32C();
      pureJavaCrc32C0.reset();
      assertEquals(0L, pureJavaCrc32C0.getValue());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PureJavaCrc32C pureJavaCrc32C0 = new PureJavaCrc32C();
      byte[] byteArray0 = new byte[9];
      pureJavaCrc32C0.update(byteArray0, (int) (byte)89, (int) (byte) (-8));
      assertEquals(0L, pureJavaCrc32C0.getValue());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PureJavaCrc32C pureJavaCrc32C0 = new PureJavaCrc32C();
      byte[] byteArray0 = new byte[1];
      // Undeclared exception!
      try { 
        pureJavaCrc32C0.update(byteArray0, 7, 7);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 7
         //
         verifyException("org.apache.commons.codec.digest.PureJavaCrc32C", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PureJavaCrc32C pureJavaCrc32C0 = new PureJavaCrc32C();
      byte[] byteArray0 = new byte[6];
      // Undeclared exception!
      try { 
        pureJavaCrc32C0.update(byteArray0, (int) (byte)4, 6);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 6
         //
         verifyException("org.apache.commons.codec.digest.PureJavaCrc32C", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      PureJavaCrc32C pureJavaCrc32C0 = new PureJavaCrc32C();
      byte[] byteArray0 = new byte[7];
      // Undeclared exception!
      try { 
        pureJavaCrc32C0.update(byteArray0, (int) (byte)48, 5);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 48
         //
         verifyException("org.apache.commons.codec.digest.PureJavaCrc32C", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      PureJavaCrc32C pureJavaCrc32C0 = new PureJavaCrc32C();
      byte[] byteArray0 = new byte[6];
      pureJavaCrc32C0.update(byteArray0, (int) (byte)0, (int) (byte)4);
      assertEquals(1214729159L, pureJavaCrc32C0.getValue());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      PureJavaCrc32C pureJavaCrc32C0 = new PureJavaCrc32C();
      // Undeclared exception!
      try { 
        pureJavaCrc32C0.update(byteArray0, (int) (byte)3, (int) (byte)3);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         verifyException("org.apache.commons.codec.digest.PureJavaCrc32C", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      PureJavaCrc32C pureJavaCrc32C0 = new PureJavaCrc32C();
      pureJavaCrc32C0.update(byteArray0, 1, 1);
      assertEquals(1383945041L, pureJavaCrc32C0.getValue());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      PureJavaCrc32C pureJavaCrc32C0 = new PureJavaCrc32C();
      byte[] byteArray0 = new byte[11];
      pureJavaCrc32C0.update(byteArray0, (int) (byte)0, (int) (byte)10);
      assertEquals(3822973035L, pureJavaCrc32C0.getValue());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      PureJavaCrc32C pureJavaCrc32C0 = new PureJavaCrc32C();
      pureJavaCrc32C0.update(0);
      long long0 = pureJavaCrc32C0.getValue();
      assertEquals(1383945041L, long0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      PureJavaCrc32C pureJavaCrc32C0 = new PureJavaCrc32C();
      long long0 = pureJavaCrc32C0.getValue();
      assertEquals(0L, long0);
  }
}
