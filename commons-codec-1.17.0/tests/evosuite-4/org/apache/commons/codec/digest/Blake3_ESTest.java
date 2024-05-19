
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
import org.apache.commons.codec.digest.Blake3;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class Blake3_ESTest extends Blake3_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Blake3 blake3_0 = Blake3.initHash();
      byte[] byteArray0 = new byte[3];
      Blake3 blake3_1 = blake3_0.update(byteArray0, 1, 0);
      assertSame(blake3_0, blake3_1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      byte[] byteArray1 = Blake3.hash(byteArray0);
      assertEquals(32, byteArray1.length);
      
      byte[] byteArray2 = Blake3.keyedHash(byteArray1, byteArray0);
      assertEquals(32, byteArray2.length);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Blake3 blake3_0 = Blake3.initHash();
      byte[] byteArray0 = new byte[4];
      blake3_0.doFinalize(byteArray0, (int) (byte)0, 0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      Blake3 blake3_0 = Blake3.initKeyDerivationFunction(byteArray0);
      Blake3 blake3_1 = blake3_0.doFinalize(byteArray0);
      assertSame(blake3_0, blake3_1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      byte[] byteArray1 = Blake3.hash(byteArray0);
      Blake3 blake3_0 = Blake3.initKeyDerivationFunction(byteArray1);
      byte[] byteArray2 = blake3_0.doFinalize(0);
      assertFalse(byteArray2.equals((Object)byteArray1));
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Blake3 blake3_0 = Blake3.initHash();
      // Undeclared exception!
      try { 
        blake3_0.update((byte[]) null, 2618, (int) (byte)1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Blake3 blake3_0 = Blake3.initHash();
      // Undeclared exception!
      try { 
        blake3_0.update((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.Blake3", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      // Undeclared exception!
      try { 
        Blake3.keyedHash((byte[]) null, (byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      // Undeclared exception!
      try { 
        Blake3.initKeyedHash((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      // Undeclared exception!
      try { 
        Blake3.initKeyDerivationFunction((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      // Undeclared exception!
      try { 
        Blake3.hash((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.Blake3", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Blake3 blake3_0 = Blake3.initHash();
      // Undeclared exception!
      try { 
        blake3_0.doFinalize((byte[]) null, (int) (byte)0, (-306));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        Blake3.initKeyedHash(byteArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Blake3 keys must be 32 bytes
         //
         verifyException("org.apache.commons.codec.digest.Blake3", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      Blake3 blake3_0 = Blake3.initKeyDerivationFunction(byteArray0);
      // Undeclared exception!
      try { 
        blake3_0.doFinalize(byteArray0, (-6065), 603);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Offset must be non-negative
         //
         verifyException("org.apache.commons.codec.digest.Blake3", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Blake3 blake3_0 = Blake3.initHash();
      // Undeclared exception!
      try { 
        blake3_0.doFinalize((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.Blake3", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Blake3 blake3_0 = Blake3.initHash();
      byte[] byteArray0 = new byte[4];
      blake3_0.update(byteArray0);
      Blake3 blake3_1 = blake3_0.update(byteArray0);
      assertSame(blake3_1, blake3_0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      Blake3 blake3_0 = Blake3.initKeyDerivationFunction(byteArray0);
      // Undeclared exception!
      try { 
        blake3_0.doFinalize((-1572));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Requested bytes must be non-negative
         //
         verifyException("org.apache.commons.codec.digest.Blake3", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Blake3 blake3_0 = Blake3.initHash();
      byte[] byteArray0 = new byte[1];
      // Undeclared exception!
      try { 
        blake3_0.doFinalize(byteArray0, 5, 1024);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Offset 5 and length 1024 out of bounds with buffer length 1
         //
         verifyException("org.apache.commons.codec.digest.Blake3", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      byte[] byteArray0 = new byte[16];
      Blake3 blake3_0 = Blake3.initHash();
      // Undeclared exception!
      try { 
        blake3_0.update(byteArray0, 16, (-2142));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Length must be non-negative
         //
         verifyException("org.apache.commons.codec.digest.Blake3", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byte[] byteArray1 = Blake3.hash(byteArray0);
      Blake3 blake3_0 = Blake3.initKeyedHash(byteArray1);
      // Undeclared exception!
      try { 
        blake3_0.doFinalize(byteArray0, (-2409), (-2409));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Offset must be non-negative
         //
         verifyException("org.apache.commons.codec.digest.Blake3", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      Blake3 blake3_0 = Blake3.initKeyDerivationFunction(byteArray0);
      byte[] byteArray1 = blake3_0.doFinalize(213);
      // Undeclared exception!
      try { 
        Blake3.keyedHash(byteArray1, byteArray1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Blake3 keys must be 32 bytes
         //
         verifyException("org.apache.commons.codec.digest.Blake3", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      Blake3 blake3_0 = Blake3.initKeyDerivationFunction(byteArray0);
      byte[] byteArray1 = blake3_0.doFinalize(213);
      byte[] byteArray2 = Blake3.hash(byteArray1);
      assertNotSame(byteArray1, byteArray2);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      Blake3 blake3_0 = Blake3.initKeyDerivationFunction(byteArray0);
      Blake3 blake3_1 = blake3_0.reset();
      assertSame(blake3_1, blake3_0);
  }
}
