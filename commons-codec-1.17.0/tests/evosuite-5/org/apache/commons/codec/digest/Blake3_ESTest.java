
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
      assertNotNull(blake3_0);
      
      Blake3 blake3_1 = blake3_0.reset();
      assertNotNull(blake3_1);
      assertSame(blake3_0, blake3_1);
      assertSame(blake3_1, blake3_0);
      
      Blake3 blake3_2 = Blake3.initHash();
      assertNotNull(blake3_2);
      assertNotSame(blake3_2, blake3_0);
      assertNotSame(blake3_2, blake3_1);
      assertFalse(blake3_2.equals((Object)blake3_0));
      assertFalse(blake3_2.equals((Object)blake3_1));
      
      byte[] byteArray0 = blake3_0.doFinalize(0);
      assertEquals(0, byteArray0.length);
      assertNotNull(byteArray0);
      assertArrayEquals(new byte[] {}, byteArray0);
      assertNotSame(blake3_0, blake3_2);
      assertSame(blake3_0, blake3_1);
      assertFalse(blake3_0.equals((Object)blake3_2));
      
      int int0 = 1308;
      byte[] byteArray1 = blake3_0.doFinalize(1308);
      assertEquals(1308, byteArray1.length);
      assertNotNull(byteArray1);
      assertNotSame(blake3_0, blake3_2);
      assertSame(blake3_0, blake3_1);
      assertNotSame(byteArray1, byteArray0);
      assertFalse(blake3_0.equals((Object)blake3_2));
      assertFalse(byteArray1.equals((Object)byteArray0));
      
      Blake3 blake3_3 = Blake3.initKeyDerivationFunction(byteArray1);
      assertEquals(1308, byteArray1.length);
      assertNotNull(blake3_3);
      assertNotSame(blake3_0, blake3_2);
      assertSame(blake3_0, blake3_1);
      assertNotSame(blake3_0, blake3_3);
      assertNotSame(byteArray1, byteArray0);
      assertNotSame(blake3_3, blake3_2);
      assertNotSame(blake3_3, blake3_0);
      assertNotSame(blake3_3, blake3_1);
      assertFalse(blake3_0.equals((Object)blake3_2));
      assertFalse(byteArray1.equals((Object)byteArray0));
      assertFalse(blake3_3.equals((Object)blake3_2));
      assertFalse(blake3_3.equals((Object)blake3_0));
      assertFalse(blake3_3.equals((Object)blake3_1));
      
      Blake3 blake3_4 = blake3_3.update(byteArray1);
      assertEquals(1308, byteArray1.length);
      assertNotNull(blake3_4);
      assertNotSame(blake3_0, blake3_4);
      assertNotSame(blake3_0, blake3_2);
      assertSame(blake3_0, blake3_1);
      assertNotSame(blake3_0, blake3_3);
      assertNotSame(byteArray1, byteArray0);
      assertNotSame(blake3_3, blake3_2);
      assertNotSame(blake3_3, blake3_0);
      assertSame(blake3_3, blake3_4);
      assertNotSame(blake3_3, blake3_1);
      assertNotSame(blake3_4, blake3_0);
      assertSame(blake3_4, blake3_3);
      assertNotSame(blake3_4, blake3_1);
      assertNotSame(blake3_4, blake3_2);
      assertFalse(blake3_0.equals((Object)blake3_2));
      assertFalse(blake3_0.equals((Object)blake3_3));
      assertFalse(byteArray1.equals((Object)byteArray0));
      assertFalse(blake3_3.equals((Object)blake3_2));
      assertFalse(blake3_3.equals((Object)blake3_0));
      assertFalse(blake3_3.equals((Object)blake3_1));
      assertFalse(blake3_4.equals((Object)blake3_0));
      assertFalse(blake3_4.equals((Object)blake3_1));
      assertFalse(blake3_4.equals((Object)blake3_2));
      
      Blake3 blake3_5 = blake3_0.update(byteArray1);
      assertEquals(1308, byteArray1.length);
      assertNotNull(blake3_5);
      assertSame(blake3_0, blake3_5);
      assertNotSame(blake3_0, blake3_4);
      assertNotSame(blake3_0, blake3_2);
      assertSame(blake3_0, blake3_1);
      assertNotSame(blake3_0, blake3_3);
      assertNotSame(byteArray1, byteArray0);
      assertSame(blake3_5, blake3_0);
      assertNotSame(blake3_5, blake3_2);
      assertNotSame(blake3_5, blake3_3);
      assertNotSame(blake3_5, blake3_4);
      assertSame(blake3_5, blake3_1);
      assertFalse(blake3_0.equals((Object)blake3_4));
      assertFalse(blake3_0.equals((Object)blake3_2));
      assertFalse(blake3_0.equals((Object)blake3_3));
      assertFalse(byteArray1.equals((Object)byteArray0));
      assertFalse(blake3_5.equals((Object)blake3_2));
      assertFalse(blake3_5.equals((Object)blake3_3));
      assertFalse(blake3_5.equals((Object)blake3_4));
      
      byte[] byteArray2 = blake3_0.doFinalize(1308);
      assertEquals(1308, byteArray2.length);
      assertNotNull(byteArray2);
      assertSame(blake3_0, blake3_5);
      assertNotSame(blake3_0, blake3_4);
      assertNotSame(blake3_0, blake3_2);
      assertSame(blake3_0, blake3_1);
      assertNotSame(blake3_0, blake3_3);
      assertNotSame(byteArray2, byteArray0);
      assertNotSame(byteArray2, byteArray1);
      assertFalse(blake3_0.equals((Object)blake3_4));
      assertFalse(blake3_0.equals((Object)blake3_2));
      assertFalse(blake3_0.equals((Object)blake3_3));
      assertFalse(byteArray2.equals((Object)byteArray0));
      assertFalse(byteArray2.equals((Object)byteArray1));
      
      byte[] byteArray3 = Blake3.hash(byteArray2);
      assertEquals(1308, byteArray2.length);
      assertEquals(32, byteArray3.length);
      assertNotNull(byteArray3);
      assertSame(blake3_0, blake3_5);
      assertNotSame(blake3_0, blake3_4);
      assertNotSame(blake3_0, blake3_2);
      assertSame(blake3_0, blake3_1);
      assertNotSame(blake3_0, blake3_3);
      assertNotSame(byteArray2, byteArray0);
      assertNotSame(byteArray2, byteArray1);
      assertNotSame(byteArray2, byteArray3);
      assertNotSame(byteArray3, byteArray1);
      assertNotSame(byteArray3, byteArray0);
      assertNotSame(byteArray3, byteArray2);
      assertFalse(blake3_0.equals((Object)blake3_4));
      assertFalse(blake3_0.equals((Object)blake3_2));
      assertFalse(blake3_0.equals((Object)blake3_3));
      assertFalse(byteArray2.equals((Object)byteArray0));
      assertFalse(byteArray2.equals((Object)byteArray1));
      assertFalse(byteArray3.equals((Object)byteArray1));
      assertFalse(byteArray3.equals((Object)byteArray0));
      assertFalse(byteArray3.equals((Object)byteArray2));
      
      Blake3 blake3_6 = blake3_0.update(byteArray2);
      assertEquals(1308, byteArray2.length);
      assertNotNull(blake3_6);
      assertSame(blake3_0, blake3_5);
      assertNotSame(blake3_0, blake3_4);
      assertNotSame(blake3_0, blake3_2);
      assertSame(blake3_0, blake3_6);
      assertSame(blake3_0, blake3_1);
      assertNotSame(blake3_0, blake3_3);
      assertNotSame(byteArray2, byteArray0);
      assertNotSame(byteArray2, byteArray1);
      assertNotSame(byteArray2, byteArray3);
      assertSame(blake3_6, blake3_1);
      assertNotSame(blake3_6, blake3_4);
      assertSame(blake3_6, blake3_0);
      assertNotSame(blake3_6, blake3_2);
      assertNotSame(blake3_6, blake3_3);
      assertSame(blake3_6, blake3_5);
      assertFalse(blake3_0.equals((Object)blake3_4));
      assertFalse(blake3_0.equals((Object)blake3_2));
      assertFalse(blake3_0.equals((Object)blake3_3));
      assertFalse(byteArray2.equals((Object)byteArray0));
      assertFalse(byteArray2.equals((Object)byteArray1));
      assertFalse(byteArray2.equals((Object)byteArray3));
      assertFalse(blake3_6.equals((Object)blake3_4));
      assertFalse(blake3_6.equals((Object)blake3_2));
      assertFalse(blake3_6.equals((Object)blake3_3));
      
      // Undeclared exception!
      try { 
        Blake3.initKeyedHash(byteArray1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Blake3 keys must be 32 bytes
         //
         verifyException("org.apache.commons.codec.digest.Blake3", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = null;
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
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)0;
      Blake3 blake3_0 = Blake3.initKeyDerivationFunction(byteArray0);
      assertEquals(1, byteArray0.length);
      assertNotNull(blake3_0);
      assertArrayEquals(new byte[] {(byte)0}, byteArray0);
      
      Blake3 blake3_1 = blake3_0.update(byteArray0, 0, (int) (byte)0);
      assertEquals(1, byteArray0.length);
      assertNotNull(blake3_1);
      assertArrayEquals(new byte[] {(byte)0}, byteArray0);
      assertSame(blake3_0, blake3_1);
      assertSame(blake3_1, blake3_0);
      
      Blake3 blake3_2 = blake3_1.reset();
      assertEquals(1, byteArray0.length);
      assertNotNull(blake3_2);
      assertArrayEquals(new byte[] {(byte)0}, byteArray0);
      assertSame(blake3_0, blake3_1);
      assertSame(blake3_0, blake3_2);
      assertSame(blake3_1, blake3_0);
      assertSame(blake3_1, blake3_2);
      assertSame(blake3_2, blake3_1);
      assertSame(blake3_2, blake3_0);
      
      // Undeclared exception!
      try { 
        blake3_0.doFinalize((byte[]) null, 1690, 1690);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)1;
      byte[] byteArray1 = Blake3.hash(byteArray0);
      //  // Unstable assertion: assertEquals(1, byteArray0.length);
      //  // Unstable assertion: assertEquals(32, byteArray1.length);
      //  // Unstable assertion: assertNotNull(byteArray1);
      //  // Unstable assertion: assertArrayEquals(new byte[] {(byte)1}, byteArray0);
      //  // Unstable assertion: assertNotSame(byteArray0, byteArray1);
      //  // Unstable assertion: assertNotSame(byteArray1, byteArray0);
      //  // Unstable assertion: assertFalse(byteArray1.equals((Object)byteArray0));
      
      Blake3 blake3_0 = Blake3.initKeyDerivationFunction(byteArray1);
      //  // Unstable assertion: assertEquals(1, byteArray0.length);
      //  // Unstable assertion: assertEquals(32, byteArray1.length);
      //  // Unstable assertion: assertNotNull(blake3_0);
      //  // Unstable assertion: assertArrayEquals(new byte[] {(byte)1}, byteArray0);
      //  // Unstable assertion: assertNotSame(byteArray0, byteArray1);
      //  // Unstable assertion: assertNotSame(byteArray1, byteArray0);
      //  // Unstable assertion: assertFalse(byteArray0.equals((Object)byteArray1));
      //  // Unstable assertion: assertFalse(byteArray1.equals((Object)byteArray0));
      
      Blake3 blake3_1 = blake3_0.doFinalize(byteArray0);
      //  // Unstable assertion: assertEquals(1, byteArray0.length);
      //  // Unstable assertion: assertEquals(32, byteArray1.length);
      //  // Unstable assertion: assertNotNull(blake3_1);
      //  // Unstable assertion: assertArrayEquals(new byte[] {(byte)95}, byteArray0);
      //  // Unstable assertion: assertNotSame(byteArray0, byteArray1);
      //  // Unstable assertion: assertNotSame(byteArray1, byteArray0);
      //  // Unstable assertion: assertSame(blake3_0, blake3_1);
      //  // Unstable assertion: assertSame(blake3_1, blake3_0);
      //  // Unstable assertion: assertFalse(byteArray0.equals((Object)byteArray1));
      //  // Unstable assertion: assertFalse(byteArray1.equals((Object)byteArray0));
      
      Blake3 blake3_2 = blake3_1.update(byteArray1);
      //  // Unstable assertion: assertEquals(1, byteArray0.length);
      //  // Unstable assertion: assertEquals(32, byteArray1.length);
      //  // Unstable assertion: assertNotNull(blake3_2);
      //  // Unstable assertion: assertArrayEquals(new byte[] {(byte)95}, byteArray0);
      //  // Unstable assertion: assertNotSame(byteArray0, byteArray1);
      //  // Unstable assertion: assertNotSame(byteArray1, byteArray0);
      //  // Unstable assertion: assertSame(blake3_0, blake3_2);
      //  // Unstable assertion: assertSame(blake3_0, blake3_1);
      //  // Unstable assertion: assertSame(blake3_1, blake3_0);
      //  // Unstable assertion: assertSame(blake3_1, blake3_2);
      //  // Unstable assertion: assertSame(blake3_2, blake3_1);
      //  // Unstable assertion: assertSame(blake3_2, blake3_0);
      //  // Unstable assertion: assertFalse(byteArray0.equals((Object)byteArray1));
      //  // Unstable assertion: assertFalse(byteArray1.equals((Object)byteArray0));
      
      Blake3 blake3_3 = blake3_0.update(byteArray0);
      //  // Unstable assertion: assertEquals(1, byteArray0.length);
      //  // Unstable assertion: assertEquals(32, byteArray1.length);
      //  // Unstable assertion: assertNotNull(blake3_3);
      //  // Unstable assertion: assertArrayEquals(new byte[] {(byte)95}, byteArray0);
      //  // Unstable assertion: assertNotSame(byteArray0, byteArray1);
      //  // Unstable assertion: assertNotSame(byteArray1, byteArray0);
      //  // Unstable assertion: assertSame(blake3_0, blake3_2);
      //  // Unstable assertion: assertSame(blake3_0, blake3_3);
      //  // Unstable assertion: assertSame(blake3_0, blake3_1);
      //  // Unstable assertion: assertSame(blake3_3, blake3_0);
      //  // Unstable assertion: assertSame(blake3_3, blake3_2);
      //  // Unstable assertion: assertSame(blake3_3, blake3_1);
      //  // Unstable assertion: assertFalse(byteArray0.equals((Object)byteArray1));
      //  // Unstable assertion: assertFalse(byteArray1.equals((Object)byteArray0));
      
      byte[] byteArray2 = Blake3.keyedHash(byteArray1, byteArray0);
      //  // Unstable assertion: assertEquals(1, byteArray0.length);
      //  // Unstable assertion: assertEquals(32, byteArray1.length);
      //  // Unstable assertion: assertEquals(32, byteArray2.length);
      //  // Unstable assertion: assertNotNull(byteArray2);
      //  // Unstable assertion: assertArrayEquals(new byte[] {(byte)95}, byteArray0);
      //  // Unstable assertion: assertNotSame(byteArray0, byteArray2);
      //  // Unstable assertion: assertNotSame(byteArray0, byteArray1);
      //  // Unstable assertion: assertNotSame(byteArray1, byteArray0);
      //  // Unstable assertion: assertNotSame(byteArray1, byteArray2);
      //  // Unstable assertion: assertNotSame(byteArray2, byteArray0);
      //  // Unstable assertion: assertNotSame(byteArray2, byteArray1);
      //  // Unstable assertion: assertFalse(byteArray0.equals((Object)byteArray1));
      //  // Unstable assertion: assertFalse(byteArray1.equals((Object)byteArray0));
      //  // Unstable assertion: assertFalse(byteArray2.equals((Object)byteArray0));
      //  // Unstable assertion: assertFalse(byteArray2.equals((Object)byteArray1));
      
      Blake3 blake3_4 = blake3_1.reset();
      //  // Unstable assertion: assertEquals(1, byteArray0.length);
      //  // Unstable assertion: assertEquals(32, byteArray1.length);
      //  // Unstable assertion: assertNotNull(blake3_4);
      //  // Unstable assertion: assertArrayEquals(new byte[] {(byte)95}, byteArray0);
      //  // Unstable assertion: assertNotSame(byteArray0, byteArray2);
      //  // Unstable assertion: assertNotSame(byteArray0, byteArray1);
      //  // Unstable assertion: assertNotSame(byteArray1, byteArray0);
      //  // Unstable assertion: assertNotSame(byteArray1, byteArray2);
      //  // Unstable assertion: assertSame(blake3_0, blake3_2);
      //  // Unstable assertion: assertSame(blake3_0, blake3_4);
      //  // Unstable assertion: assertSame(blake3_0, blake3_3);
      //  // Unstable assertion: assertSame(blake3_0, blake3_1);
      //  // Unstable assertion: assertSame(blake3_1, blake3_3);
      //  // Unstable assertion: assertSame(blake3_1, blake3_4);
      //  // Unstable assertion: assertSame(blake3_1, blake3_0);
      //  // Unstable assertion: assertSame(blake3_1, blake3_2);
      //  // Unstable assertion: assertSame(blake3_4, blake3_3);
      //  // Unstable assertion: assertSame(blake3_4, blake3_2);
      //  // Unstable assertion: assertSame(blake3_4, blake3_1);
      //  // Unstable assertion: assertSame(blake3_4, blake3_0);
      //  // Unstable assertion: assertFalse(byteArray0.equals((Object)byteArray2));
      //  // Unstable assertion: assertFalse(byteArray0.equals((Object)byteArray1));
      //  // Unstable assertion: assertFalse(byteArray1.equals((Object)byteArray0));
      //  // Unstable assertion: assertFalse(byteArray1.equals((Object)byteArray2));
      
      Blake3 blake3_5 = Blake3.initKeyedHash(byteArray1);
      //  // Unstable assertion: assertEquals(1, byteArray0.length);
      //  // Unstable assertion: assertEquals(32, byteArray1.length);
      //  // Unstable assertion: assertNotNull(blake3_5);
      //  // Unstable assertion: assertArrayEquals(new byte[] {(byte)95}, byteArray0);
      //  // Unstable assertion: assertNotSame(byteArray0, byteArray2);
      //  // Unstable assertion: assertNotSame(byteArray0, byteArray1);
      //  // Unstable assertion: assertNotSame(byteArray1, byteArray0);
      //  // Unstable assertion: assertNotSame(byteArray1, byteArray2);
      //  // Unstable assertion: assertNotSame(blake3_5, blake3_0);
      //  // Unstable assertion: assertNotSame(blake3_5, blake3_2);
      //  // Unstable assertion: assertNotSame(blake3_5, blake3_4);
      //  // Unstable assertion: assertNotSame(blake3_5, blake3_3);
      //  // Unstable assertion: assertNotSame(blake3_5, blake3_1);
      //  // Unstable assertion: assertFalse(byteArray0.equals((Object)byteArray2));
      //  // Unstable assertion: assertFalse(byteArray0.equals((Object)byteArray1));
      //  // Unstable assertion: assertFalse(byteArray1.equals((Object)byteArray0));
      //  // Unstable assertion: assertFalse(byteArray1.equals((Object)byteArray2));
      //  // Unstable assertion: assertFalse(blake3_5.equals((Object)blake3_0));
      //  // Unstable assertion: assertFalse(blake3_5.equals((Object)blake3_2));
      //  // Unstable assertion: assertFalse(blake3_5.equals((Object)blake3_4));
      //  // Unstable assertion: assertFalse(blake3_5.equals((Object)blake3_3));
      //  // Unstable assertion: assertFalse(blake3_5.equals((Object)blake3_1));
      
      Blake3 blake3_6 = blake3_2.doFinalize(byteArray0, 0, 0);
      //  // Unstable assertion: assertEquals(1, byteArray0.length);
      //  // Unstable assertion: assertEquals(32, byteArray1.length);
      //  // Unstable assertion: assertNotNull(blake3_6);
      //  // Unstable assertion: assertArrayEquals(new byte[] {(byte)95}, byteArray0);
      //  // Unstable assertion: assertNotSame(byteArray0, byteArray2);
      //  // Unstable assertion: assertNotSame(byteArray0, byteArray1);
      //  // Unstable assertion: assertNotSame(byteArray1, byteArray0);
      //  // Unstable assertion: assertNotSame(byteArray1, byteArray2);
      //  // Unstable assertion: assertSame(blake3_0, blake3_6);
      //  // Unstable assertion: assertSame(blake3_0, blake3_2);
      //  // Unstable assertion: assertSame(blake3_0, blake3_4);
      //  // Unstable assertion: assertSame(blake3_0, blake3_3);
      //  // Unstable assertion: assertSame(blake3_0, blake3_1);
      //  // Unstable assertion: assertNotSame(blake3_0, blake3_5);
      //  // Unstable assertion: assertSame(blake3_1, blake3_3);
      //  // Unstable assertion: assertSame(blake3_1, blake3_4);
      //  // Unstable assertion: assertSame(blake3_1, blake3_6);
      //  // Unstable assertion: assertSame(blake3_1, blake3_0);
      //  // Unstable assertion: assertSame(blake3_1, blake3_2);
      //  // Unstable assertion: assertNotSame(blake3_1, blake3_5);
      //  // Unstable assertion: assertSame(blake3_2, blake3_6);
      //  // Unstable assertion: assertSame(blake3_2, blake3_1);
      //  // Unstable assertion: assertNotSame(blake3_2, blake3_5);
      //  // Unstable assertion: assertSame(blake3_2, blake3_4);
      //  // Unstable assertion: assertSame(blake3_2, blake3_0);
      //  // Unstable assertion: assertSame(blake3_2, blake3_3);
      //  // Unstable assertion: assertSame(blake3_6, blake3_4);
      //  // Unstable assertion: assertSame(blake3_6, blake3_3);
      //  // Unstable assertion: assertSame(blake3_6, blake3_0);
      //  // Unstable assertion: assertSame(blake3_6, blake3_1);
      //  // Unstable assertion: assertSame(blake3_6, blake3_2);
      //  // Unstable assertion: assertNotSame(blake3_6, blake3_5);
      //  // Unstable assertion: assertFalse(byteArray0.equals((Object)byteArray2));
      //  // Unstable assertion: assertFalse(byteArray0.equals((Object)byteArray1));
      //  // Unstable assertion: assertFalse(byteArray1.equals((Object)byteArray0));
      //  // Unstable assertion: assertFalse(byteArray1.equals((Object)byteArray2));
      //  // Unstable assertion: assertFalse(blake3_0.equals((Object)blake3_5));
      //  // Unstable assertion: assertFalse(blake3_1.equals((Object)blake3_5));
      //  // Unstable assertion: assertFalse(blake3_2.equals((Object)blake3_5));
      //  // Unstable assertion: assertFalse(blake3_6.equals((Object)blake3_5));
      
      byte[] byteArray3 = blake3_2.doFinalize(3837);
      //  // Unstable assertion: assertEquals(1, byteArray0.length);
      //  // Unstable assertion: assertEquals(32, byteArray1.length);
      //  // Unstable assertion: assertEquals(3837, byteArray3.length);
      //  // Unstable assertion: assertNotNull(byteArray3);
      //  // Unstable assertion: assertArrayEquals(new byte[] {(byte)95}, byteArray0);
      //  // Unstable assertion: assertNotSame(byteArray0, byteArray2);
      //  // Unstable assertion: assertNotSame(byteArray0, byteArray1);
      //  // Unstable assertion: assertNotSame(byteArray0, byteArray3);
      //  // Unstable assertion: assertNotSame(byteArray1, byteArray0);
      //  // Unstable assertion: assertNotSame(byteArray1, byteArray3);
      //  // Unstable assertion: assertNotSame(byteArray1, byteArray2);
      //  // Unstable assertion: assertSame(blake3_0, blake3_6);
      //  // Unstable assertion: assertSame(blake3_0, blake3_2);
      //  // Unstable assertion: assertSame(blake3_0, blake3_4);
      //  // Unstable assertion: assertSame(blake3_0, blake3_3);
      //  // Unstable assertion: assertSame(blake3_0, blake3_1);
      //  // Unstable assertion: assertNotSame(blake3_0, blake3_5);
      //  // Unstable assertion: assertSame(blake3_1, blake3_3);
      //  // Unstable assertion: assertSame(blake3_1, blake3_4);
      //  // Unstable assertion: assertSame(blake3_1, blake3_6);
      //  // Unstable assertion: assertSame(blake3_1, blake3_0);
      //  // Unstable assertion: assertSame(blake3_1, blake3_2);
      //  // Unstable assertion: assertNotSame(blake3_1, blake3_5);
      //  // Unstable assertion: assertSame(blake3_2, blake3_6);
      //  // Unstable assertion: assertSame(blake3_2, blake3_1);
      //  // Unstable assertion: assertNotSame(blake3_2, blake3_5);
      //  // Unstable assertion: assertSame(blake3_2, blake3_4);
      //  // Unstable assertion: assertSame(blake3_2, blake3_0);
      //  // Unstable assertion: assertSame(blake3_2, blake3_3);
      //  // Unstable assertion: assertNotSame(byteArray3, byteArray2);
      //  // Unstable assertion: assertNotSame(byteArray3, byteArray0);
      //  // Unstable assertion: assertNotSame(byteArray3, byteArray1);
      //  // Unstable assertion: assertFalse(byteArray0.equals((Object)byteArray2));
      //  // Unstable assertion: assertFalse(byteArray0.equals((Object)byteArray1));
      //  // Unstable assertion: assertFalse(byteArray1.equals((Object)byteArray0));
      //  // Unstable assertion: assertFalse(byteArray1.equals((Object)byteArray2));
      //  // Unstable assertion: assertFalse(blake3_0.equals((Object)blake3_5));
      //  // Unstable assertion: assertFalse(blake3_1.equals((Object)blake3_5));
      //  // Unstable assertion: assertFalse(blake3_2.equals((Object)blake3_5));
      //  // Unstable assertion: assertFalse(byteArray3.equals((Object)byteArray2));
      //  // Unstable assertion: assertFalse(byteArray3.equals((Object)byteArray0));
      //  // Unstable assertion: assertFalse(byteArray3.equals((Object)byteArray1));
      
      Blake3 blake3_7 = Blake3.initHash();
      //  // Unstable assertion: assertNotNull(blake3_7);
      //  // Unstable assertion: assertNotSame(blake3_7, blake3_3);
      //  // Unstable assertion: assertNotSame(blake3_7, blake3_4);
      //  // Unstable assertion: assertNotSame(blake3_7, blake3_1);
      //  // Unstable assertion: assertNotSame(blake3_7, blake3_2);
      //  // Unstable assertion: assertNotSame(blake3_7, blake3_0);
      //  // Unstable assertion: assertNotSame(blake3_7, blake3_5);
      //  // Unstable assertion: assertNotSame(blake3_7, blake3_6);
      //  // Unstable assertion: assertFalse(blake3_7.equals((Object)blake3_3));
      //  // Unstable assertion: assertFalse(blake3_7.equals((Object)blake3_4));
      //  // Unstable assertion: assertFalse(blake3_7.equals((Object)blake3_1));
      //  // Unstable assertion: assertFalse(blake3_7.equals((Object)blake3_2));
      //  // Unstable assertion: assertFalse(blake3_7.equals((Object)blake3_0));
      //  // Unstable assertion: assertFalse(blake3_7.equals((Object)blake3_5));
      //  // Unstable assertion: assertFalse(blake3_7.equals((Object)blake3_6));
      
      Blake3 blake3_8 = blake3_1.reset();
      //  // Unstable assertion: assertEquals(1, byteArray0.length);
      //  // Unstable assertion: assertEquals(32, byteArray1.length);
      //  // Unstable assertion: assertNotNull(blake3_8);
      //  // Unstable assertion: assertArrayEquals(new byte[] {(byte)95}, byteArray0);
      //  // Unstable assertion: assertNotSame(byteArray0, byteArray2);
      //  // Unstable assertion: assertNotSame(byteArray0, byteArray1);
      //  // Unstable assertion: assertNotSame(byteArray0, byteArray3);
      //  // Unstable assertion: assertNotSame(byteArray1, byteArray0);
      //  // Unstable assertion: assertNotSame(byteArray1, byteArray3);
      //  // Unstable assertion: assertNotSame(byteArray1, byteArray2);
      //  // Unstable assertion: assertSame(blake3_0, blake3_6);
      //  // Unstable assertion: assertSame(blake3_0, blake3_2);
      //  // Unstable assertion: assertSame(blake3_0, blake3_8);
      //  // Unstable assertion: assertSame(blake3_0, blake3_4);
      //  // Unstable assertion: assertSame(blake3_0, blake3_3);
      //  // Unstable assertion: assertSame(blake3_0, blake3_1);
      //  // Unstable assertion: assertNotSame(blake3_0, blake3_7);
      //  // Unstable assertion: assertNotSame(blake3_0, blake3_5);
      //  // Unstable assertion: assertSame(blake3_1, blake3_8);
      //  // Unstable assertion: assertSame(blake3_1, blake3_3);
      //  // Unstable assertion: assertSame(blake3_1, blake3_4);
      //  // Unstable assertion: assertSame(blake3_1, blake3_6);
      //  // Unstable assertion: assertSame(blake3_1, blake3_0);
      //  // Unstable assertion: assertSame(blake3_1, blake3_2);
      //  // Unstable assertion: assertNotSame(blake3_1, blake3_7);
      //  // Unstable assertion: assertNotSame(blake3_1, blake3_5);
      //  // Unstable assertion: assertSame(blake3_8, blake3_6);
      //  // Unstable assertion: assertSame(blake3_8, blake3_0);
      //  // Unstable assertion: assertSame(blake3_8, blake3_4);
      //  // Unstable assertion: assertSame(blake3_8, blake3_3);
      //  // Unstable assertion: assertSame(blake3_8, blake3_1);
      //  // Unstable assertion: assertSame(blake3_8, blake3_2);
      //  // Unstable assertion: assertNotSame(blake3_8, blake3_5);
      //  // Unstable assertion: assertNotSame(blake3_8, blake3_7);
      //  // Unstable assertion: assertFalse(byteArray0.equals((Object)byteArray2));
      //  // Unstable assertion: assertFalse(byteArray0.equals((Object)byteArray1));
      //  // Unstable assertion: assertFalse(byteArray0.equals((Object)byteArray3));
      //  // Unstable assertion: assertFalse(byteArray1.equals((Object)byteArray0));
      //  // Unstable assertion: assertFalse(byteArray1.equals((Object)byteArray3));
      //  // Unstable assertion: assertFalse(byteArray1.equals((Object)byteArray2));
      //  // Unstable assertion: assertFalse(blake3_0.equals((Object)blake3_7));
      //  // Unstable assertion: assertFalse(blake3_0.equals((Object)blake3_5));
      //  // Unstable assertion: assertFalse(blake3_1.equals((Object)blake3_7));
      //  // Unstable assertion: assertFalse(blake3_1.equals((Object)blake3_5));
      //  // Unstable assertion: assertFalse(blake3_8.equals((Object)blake3_5));
      //  // Unstable assertion: assertFalse(blake3_8.equals((Object)blake3_7));
      
      byte[] byteArray4 = new byte[3];
      //  // Unstable assertion: assertFalse(byteArray4.equals((Object)byteArray2));
      //  // Unstable assertion: assertFalse(byteArray4.equals((Object)byteArray1));
      //  // Unstable assertion: assertFalse(byteArray4.equals((Object)byteArray3));
      //  // Unstable assertion: assertFalse(byteArray4.equals((Object)byteArray0));
      
      byteArray4[0] = (byte) (-18);
      byteArray4[1] = (byte)1;
      byteArray4[2] = (byte)1;
      // Undeclared exception!
      try { 
        Blake3.keyedHash(byteArray4, byteArray1);
       //  fail("Expecting exception: IllegalArgumentException");
       // Unstable assertion
      } catch(IllegalArgumentException e) {
         //
         // Blake3 keys must be 32 bytes
         //
         verifyException("org.apache.commons.codec.digest.Blake3", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Blake3 blake3_0 = Blake3.initHash();
      //  // Unstable assertion: assertNotNull(blake3_0);
      
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte) (-124);
      Blake3 blake3_1 = blake3_0.doFinalize(byteArray0);
      //  // Unstable assertion: assertEquals(1, byteArray0.length);
      //  // Unstable assertion: assertNotNull(blake3_1);
      //  // Unstable assertion: assertArrayEquals(new byte[] {(byte) (-53)}, byteArray0);
      //  // Unstable assertion: assertSame(blake3_0, blake3_1);
      //  // Unstable assertion: assertSame(blake3_1, blake3_0);
      
      byte[] byteArray1 = new byte[2];
      //  // Unstable assertion: assertFalse(byteArray1.equals((Object)byteArray0));
      
      byteArray1[0] = (byte) (-66);
      byteArray1[1] = (byte)0;
      Blake3 blake3_2 = Blake3.initKeyDerivationFunction(byteArray1);
      //  // Unstable assertion: assertEquals(2, byteArray1.length);
      //  // Unstable assertion: assertNotNull(blake3_2);
      //  // Unstable assertion: assertArrayEquals(new byte[] {(byte) (-66), (byte)0}, byteArray1);
      //  // Unstable assertion: assertNotSame(byteArray1, byteArray0);
      //  // Unstable assertion: assertNotSame(blake3_2, blake3_0);
      //  // Unstable assertion: assertNotSame(blake3_2, blake3_1);
      //  // Unstable assertion: assertFalse(byteArray1.equals((Object)byteArray0));
      //  // Unstable assertion: assertFalse(blake3_2.equals((Object)blake3_0));
      //  // Unstable assertion: assertFalse(blake3_2.equals((Object)blake3_1));
      
      // Undeclared exception!
      try { 
        Blake3.hash((byte[]) null);
       //  fail("Expecting exception: NullPointerException");
       // Unstable assertion
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.Blake3", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      Blake3 blake3_0 = Blake3.initKeyDerivationFunction(byteArray0);
      assertEquals(0, byteArray0.length);
      assertNotNull(blake3_0);
      assertArrayEquals(new byte[] {}, byteArray0);
      
      Blake3 blake3_1 = blake3_0.reset();
      assertEquals(0, byteArray0.length);
      assertNotNull(blake3_1);
      assertArrayEquals(new byte[] {}, byteArray0);
      assertSame(blake3_0, blake3_1);
      assertSame(blake3_1, blake3_0);
      
      Blake3 blake3_2 = blake3_1.update(byteArray0);
      assertEquals(0, byteArray0.length);
      assertNotNull(blake3_2);
      assertArrayEquals(new byte[] {}, byteArray0);
      assertSame(blake3_0, blake3_1);
      assertSame(blake3_0, blake3_2);
      assertSame(blake3_1, blake3_0);
      assertSame(blake3_1, blake3_2);
      assertSame(blake3_2, blake3_1);
      assertSame(blake3_2, blake3_0);
      
      Blake3 blake3_3 = blake3_2.doFinalize(byteArray0, 0, 0);
      assertEquals(0, byteArray0.length);
      assertNotNull(blake3_3);
      assertArrayEquals(new byte[] {}, byteArray0);
      assertSame(blake3_0, blake3_1);
      assertSame(blake3_0, blake3_3);
      assertSame(blake3_0, blake3_2);
      assertSame(blake3_1, blake3_3);
      assertSame(blake3_1, blake3_0);
      assertSame(blake3_1, blake3_2);
      assertSame(blake3_2, blake3_1);
      assertSame(blake3_2, blake3_3);
      assertSame(blake3_2, blake3_0);
      assertSame(blake3_3, blake3_0);
      assertSame(blake3_3, blake3_1);
      assertSame(blake3_3, blake3_2);
      
      int int0 = 54;
      // Undeclared exception!
      try { 
        blake3_3.update((byte[]) null, 54, 0);
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
      assertNotNull(blake3_0);
      
      byte[] byteArray0 = null;
      int int0 = 2136;
      // Undeclared exception!
      try { 
        blake3_0.update((byte[]) null, 2136, 2136);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte) (-1);
      byteArray0[1] = (byte) (-86);
      byteArray0[2] = (byte)14;
      byteArray0[3] = (byte) (-127);
      byteArray0[4] = (byte)38;
      byteArray0[5] = (byte)11;
      byteArray0[6] = (byte)0;
      byteArray0[7] = (byte) (-81);
      byte[] byteArray1 = Blake3.hash(byteArray0);
      //  // Unstable assertion: assertEquals(8, byteArray0.length);
      //  // Unstable assertion: assertEquals(32, byteArray1.length);
      //  // Unstable assertion: assertNotNull(byteArray1);
      //  // Unstable assertion: assertArrayEquals(new byte[] {(byte) (-1), (byte) (-86), (byte)14, (byte) (-127), (byte)38, (byte)11, (byte)0, (byte) (-81)}, byteArray0);
      //  // Unstable assertion: assertNotSame(byteArray0, byteArray1);
      //  // Unstable assertion: assertNotSame(byteArray1, byteArray0);
      //  // Unstable assertion: assertFalse(byteArray1.equals((Object)byteArray0));
      
      Blake3 blake3_0 = Blake3.initKeyedHash(byteArray1);
      //  // Unstable assertion: assertEquals(8, byteArray0.length);
      //  // Unstable assertion: assertEquals(32, byteArray1.length);
      //  // Unstable assertion: assertNotNull(blake3_0);
      //  // Unstable assertion: assertArrayEquals(new byte[] {(byte) (-1), (byte) (-86), (byte)14, (byte) (-127), (byte)38, (byte)11, (byte)0, (byte) (-81)}, byteArray0);
      //  // Unstable assertion: assertNotSame(byteArray0, byteArray1);
      //  // Unstable assertion: assertNotSame(byteArray1, byteArray0);
      //  // Unstable assertion: assertFalse(byteArray0.equals((Object)byteArray1));
      //  // Unstable assertion: assertFalse(byteArray1.equals((Object)byteArray0));
      
      Blake3 blake3_1 = blake3_0.doFinalize(byteArray0);
      //  // Unstable assertion: assertEquals(8, byteArray0.length);
      //  // Unstable assertion: assertEquals(32, byteArray1.length);
      //  // Unstable assertion: assertNotNull(blake3_1);
      //  // Unstable assertion: assertArrayEquals(new byte[] {(byte)80, (byte) (-35), (byte) (-84), (byte)66, (byte)42, (byte) (-81), (byte) (-105), (byte)57}, byteArray0);
      //  // Unstable assertion: assertNotSame(byteArray0, byteArray1);
      //  // Unstable assertion: assertNotSame(byteArray1, byteArray0);
      //  // Unstable assertion: assertSame(blake3_0, blake3_1);
      //  // Unstable assertion: assertSame(blake3_1, blake3_0);
      //  // Unstable assertion: assertFalse(byteArray0.equals((Object)byteArray1));
      //  // Unstable assertion: assertFalse(byteArray1.equals((Object)byteArray0));
      
      Blake3 blake3_2 = Blake3.initHash();
      //  // Unstable assertion: assertNotNull(blake3_2);
      //  // Unstable assertion: assertNotSame(blake3_2, blake3_0);
      //  // Unstable assertion: assertNotSame(blake3_2, blake3_1);
      //  // Unstable assertion: assertFalse(blake3_2.equals((Object)blake3_0));
      //  // Unstable assertion: assertFalse(blake3_2.equals((Object)blake3_1));
      
      byte[] byteArray2 = blake3_1.doFinalize(1175);
      //  // Unstable assertion: assertEquals(8, byteArray0.length);
      //  // Unstable assertion: assertEquals(32, byteArray1.length);
      //  // Unstable assertion: assertEquals(1175, byteArray2.length);
      //  // Unstable assertion: assertNotNull(byteArray2);
      //  // Unstable assertion: assertArrayEquals(new byte[] {(byte)80, (byte) (-35), (byte) (-84), (byte)66, (byte)42, (byte) (-81), (byte) (-105), (byte)57}, byteArray0);
      //  // Unstable assertion: assertNotSame(byteArray0, byteArray2);
      //  // Unstable assertion: assertNotSame(byteArray0, byteArray1);
      //  // Unstable assertion: assertNotSame(byteArray1, byteArray0);
      //  // Unstable assertion: assertNotSame(byteArray1, byteArray2);
      //  // Unstable assertion: assertSame(blake3_0, blake3_1);
      //  // Unstable assertion: assertNotSame(blake3_0, blake3_2);
      //  // Unstable assertion: assertSame(blake3_1, blake3_0);
      //  // Unstable assertion: assertNotSame(blake3_1, blake3_2);
      //  // Unstable assertion: assertNotSame(byteArray2, byteArray1);
      //  // Unstable assertion: assertNotSame(byteArray2, byteArray0);
      //  // Unstable assertion: assertFalse(byteArray0.equals((Object)byteArray1));
      //  // Unstable assertion: assertFalse(byteArray1.equals((Object)byteArray0));
      //  // Unstable assertion: assertFalse(blake3_0.equals((Object)blake3_2));
      //  // Unstable assertion: assertFalse(blake3_1.equals((Object)blake3_2));
      //  // Unstable assertion: assertFalse(byteArray2.equals((Object)byteArray1));
      //  // Unstable assertion: assertFalse(byteArray2.equals((Object)byteArray0));
      
      Blake3 blake3_3 = Blake3.initKeyDerivationFunction(byteArray2);
      //  // Unstable assertion: assertEquals(8, byteArray0.length);
      //  // Unstable assertion: assertEquals(32, byteArray1.length);
      //  // Unstable assertion: assertEquals(1175, byteArray2.length);
      //  // Unstable assertion: assertNotNull(blake3_3);
      //  // Unstable assertion: assertArrayEquals(new byte[] {(byte)80, (byte) (-35), (byte) (-84), (byte)66, (byte)42, (byte) (-81), (byte) (-105), (byte)57}, byteArray0);
      //  // Unstable assertion: assertNotSame(byteArray0, byteArray2);
      //  // Unstable assertion: assertNotSame(byteArray0, byteArray1);
      //  // Unstable assertion: assertNotSame(byteArray1, byteArray0);
      //  // Unstable assertion: assertNotSame(byteArray1, byteArray2);
      //  // Unstable assertion: assertNotSame(blake3_0, blake3_3);
      //  // Unstable assertion: assertSame(blake3_0, blake3_1);
      //  // Unstable assertion: assertNotSame(blake3_0, blake3_2);
      //  // Unstable assertion: assertSame(blake3_1, blake3_0);
      //  // Unstable assertion: assertNotSame(blake3_1, blake3_2);
      //  // Unstable assertion: assertNotSame(blake3_1, blake3_3);
      //  // Unstable assertion: assertNotSame(byteArray2, byteArray1);
      //  // Unstable assertion: assertNotSame(byteArray2, byteArray0);
      //  // Unstable assertion: assertNotSame(blake3_3, blake3_0);
      //  // Unstable assertion: assertNotSame(blake3_3, blake3_1);
      //  // Unstable assertion: assertNotSame(blake3_3, blake3_2);
      //  // Unstable assertion: assertFalse(byteArray0.equals((Object)byteArray2));
      //  // Unstable assertion: assertFalse(byteArray0.equals((Object)byteArray1));
      //  // Unstable assertion: assertFalse(byteArray1.equals((Object)byteArray0));
      //  // Unstable assertion: assertFalse(byteArray1.equals((Object)byteArray2));
      //  // Unstable assertion: assertFalse(blake3_0.equals((Object)blake3_2));
      //  // Unstable assertion: assertFalse(blake3_1.equals((Object)blake3_2));
      //  // Unstable assertion: assertFalse(byteArray2.equals((Object)byteArray1));
      //  // Unstable assertion: assertFalse(byteArray2.equals((Object)byteArray0));
      //  // Unstable assertion: assertFalse(blake3_3.equals((Object)blake3_0));
      //  // Unstable assertion: assertFalse(blake3_3.equals((Object)blake3_1));
      //  // Unstable assertion: assertFalse(blake3_3.equals((Object)blake3_2));
      
      byte[] byteArray3 = blake3_0.doFinalize(0);
      //  // Unstable assertion: assertEquals(8, byteArray0.length);
      //  // Unstable assertion: assertEquals(32, byteArray1.length);
      //  // Unstable assertion: assertEquals(0, byteArray3.length);
      //  // Unstable assertion: assertNotNull(byteArray3);
      //  // Unstable assertion: assertArrayEquals(new byte[] {(byte)80, (byte) (-35), (byte) (-84), (byte)66, (byte)42, (byte) (-81), (byte) (-105), (byte)57}, byteArray0);
      //  // Unstable assertion: assertArrayEquals(new byte[] {}, byteArray3);
      //  // Unstable assertion: assertNotSame(byteArray0, byteArray3);
      //  // Unstable assertion: assertNotSame(byteArray0, byteArray2);
      //  // Unstable assertion: assertNotSame(byteArray0, byteArray1);
      //  // Unstable assertion: assertNotSame(byteArray1, byteArray0);
      //  // Unstable assertion: assertNotSame(byteArray1, byteArray3);
      //  // Unstable assertion: assertNotSame(byteArray1, byteArray2);
      //  // Unstable assertion: assertNotSame(blake3_0, blake3_3);
      //  // Unstable assertion: assertSame(blake3_0, blake3_1);
      //  // Unstable assertion: assertNotSame(blake3_0, blake3_2);
      //  // Unstable assertion: assertNotSame(byteArray3, byteArray1);
      //  // Unstable assertion: assertNotSame(byteArray3, byteArray0);
      //  // Unstable assertion: assertNotSame(byteArray3, byteArray2);
      //  // Unstable assertion: assertFalse(byteArray0.equals((Object)byteArray2));
      //  // Unstable assertion: assertFalse(byteArray0.equals((Object)byteArray1));
      //  // Unstable assertion: assertFalse(byteArray1.equals((Object)byteArray0));
      //  // Unstable assertion: assertFalse(byteArray1.equals((Object)byteArray2));
      //  // Unstable assertion: assertFalse(blake3_0.equals((Object)blake3_3));
      //  // Unstable assertion: assertFalse(blake3_0.equals((Object)blake3_2));
      //  // Unstable assertion: assertFalse(byteArray3.equals((Object)byteArray1));
      //  // Unstable assertion: assertFalse(byteArray3.equals((Object)byteArray0));
      //  // Unstable assertion: assertFalse(byteArray3.equals((Object)byteArray2));
      
      byte[] byteArray4 = blake3_0.doFinalize(1175);
      //  // Unstable assertion: assertEquals(1175, byteArray4.length);
      //  // Unstable assertion: assertEquals(8, byteArray0.length);
      //  // Unstable assertion: assertEquals(32, byteArray1.length);
      //  // Unstable assertion: assertNotNull(byteArray4);
      //  // Unstable assertion: assertArrayEquals(new byte[] {(byte)80, (byte) (-35), (byte) (-84), (byte)66, (byte)42, (byte) (-81), (byte) (-105), (byte)57}, byteArray0);
      //  // Unstable assertion: assertNotSame(byteArray4, byteArray2);
      //  // Unstable assertion: assertNotSame(byteArray4, byteArray3);
      //  // Unstable assertion: assertNotSame(byteArray4, byteArray1);
      //  // Unstable assertion: assertNotSame(byteArray4, byteArray0);
      //  // Unstable assertion: assertNotSame(byteArray0, byteArray3);
      //  // Unstable assertion: assertNotSame(byteArray0, byteArray2);
      //  // Unstable assertion: assertNotSame(byteArray0, byteArray4);
      //  // Unstable assertion: assertNotSame(byteArray0, byteArray1);
      //  // Unstable assertion: assertNotSame(byteArray1, byteArray4);
      //  // Unstable assertion: assertNotSame(byteArray1, byteArray0);
      //  // Unstable assertion: assertNotSame(byteArray1, byteArray3);
      //  // Unstable assertion: assertNotSame(byteArray1, byteArray2);
      //  // Unstable assertion: assertNotSame(blake3_0, blake3_3);
      //  // Unstable assertion: assertSame(blake3_0, blake3_1);
      //  // Unstable assertion: assertNotSame(blake3_0, blake3_2);
      //  // Unstable assertion: assertFalse(byteArray4.equals((Object)byteArray2));
      //  // Unstable assertion: assertFalse(byteArray4.equals((Object)byteArray3));
      //  // Unstable assertion: assertFalse(byteArray4.equals((Object)byteArray1));
      //  // Unstable assertion: assertFalse(byteArray4.equals((Object)byteArray0));
      //  // Unstable assertion: assertFalse(byteArray0.equals((Object)byteArray3));
      //  // Unstable assertion: assertFalse(byteArray0.equals((Object)byteArray2));
      //  // Unstable assertion: assertFalse(byteArray0.equals((Object)byteArray1));
      //  // Unstable assertion: assertFalse(byteArray1.equals((Object)byteArray0));
      //  // Unstable assertion: assertFalse(byteArray1.equals((Object)byteArray3));
      //  // Unstable assertion: assertFalse(byteArray1.equals((Object)byteArray2));
      //  // Unstable assertion: assertFalse(blake3_0.equals((Object)blake3_3));
      //  // Unstable assertion: assertFalse(blake3_0.equals((Object)blake3_2));
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      byte[] byteArray1 = Blake3.hash(byteArray0);
      assertEquals(0, byteArray0.length);
      assertEquals(32, byteArray1.length);
      assertNotNull(byteArray1);
      assertArrayEquals(new byte[] {}, byteArray0);
      assertNotSame(byteArray0, byteArray1);
      assertNotSame(byteArray1, byteArray0);
      assertFalse(byteArray1.equals((Object)byteArray0));
      
      Blake3 blake3_0 = Blake3.initKeyedHash(byteArray1);
      assertEquals(0, byteArray0.length);
      assertEquals(32, byteArray1.length);
      assertNotNull(blake3_0);
      assertArrayEquals(new byte[] {}, byteArray0);
      assertNotSame(byteArray0, byteArray1);
      assertNotSame(byteArray1, byteArray0);
      assertFalse(byteArray0.equals((Object)byteArray1));
      assertFalse(byteArray1.equals((Object)byteArray0));
      
      Blake3 blake3_1 = blake3_0.reset();
      assertEquals(0, byteArray0.length);
      assertEquals(32, byteArray1.length);
      assertNotNull(blake3_1);
      assertArrayEquals(new byte[] {}, byteArray0);
      assertNotSame(byteArray0, byteArray1);
      assertNotSame(byteArray1, byteArray0);
      assertSame(blake3_0, blake3_1);
      assertSame(blake3_1, blake3_0);
      assertFalse(byteArray0.equals((Object)byteArray1));
      assertFalse(byteArray1.equals((Object)byteArray0));
      
      Blake3 blake3_2 = Blake3.initHash();
      assertNotNull(blake3_2);
      assertNotSame(blake3_2, blake3_1);
      assertNotSame(blake3_2, blake3_0);
      assertFalse(blake3_2.equals((Object)blake3_1));
      assertFalse(blake3_2.equals((Object)blake3_0));
      
      // Undeclared exception!
      try { 
        blake3_1.update(byteArray1, 0, (-1525));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Length must be non-negative
         //
         verifyException("org.apache.commons.codec.digest.Blake3", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte)127;
      byteArray0[2] = (byte)1;
      byteArray0[3] = (byte)79;
      byteArray0[4] = (byte)0;
      byteArray0[5] = (byte) (-1);
      byteArray0[6] = (byte)0;
      Blake3 blake3_0 = Blake3.initKeyDerivationFunction(byteArray0);
      assertEquals(7, byteArray0.length);
      assertNotNull(blake3_0);
      assertArrayEquals(new byte[] {(byte)0, (byte)127, (byte)1, (byte)79, (byte)0, (byte) (-1), (byte)0}, byteArray0);
      
      Blake3 blake3_1 = blake3_0.reset();
      assertEquals(7, byteArray0.length);
      assertNotNull(blake3_1);
      assertArrayEquals(new byte[] {(byte)0, (byte)127, (byte)1, (byte)79, (byte)0, (byte) (-1), (byte)0}, byteArray0);
      assertSame(blake3_0, blake3_1);
      assertSame(blake3_1, blake3_0);
      
      byte[] byteArray1 = new byte[7];
      assertFalse(byteArray1.equals((Object)byteArray0));
      
      byteArray1[0] = (byte)0;
      byteArray1[1] = (byte) (-1);
      byteArray1[2] = (byte)79;
      byteArray1[3] = (byte)127;
      byteArray1[4] = (byte)0;
      byteArray1[5] = (byte)79;
      byteArray1[6] = (byte)0;
      Blake3 blake3_2 = blake3_1.update(byteArray1, (int) (byte)0, 3);
      assertEquals(7, byteArray0.length);
      assertEquals(7, byteArray1.length);
      assertNotNull(blake3_2);
      assertArrayEquals(new byte[] {(byte)0, (byte)127, (byte)1, (byte)79, (byte)0, (byte) (-1), (byte)0}, byteArray0);
      assertArrayEquals(new byte[] {(byte)0, (byte) (-1), (byte)79, (byte)127, (byte)0, (byte)79, (byte)0}, byteArray1);
      assertNotSame(byteArray0, byteArray1);
      assertSame(blake3_2, blake3_0);
      assertSame(blake3_2, blake3_1);
      assertSame(blake3_0, blake3_1);
      assertSame(blake3_0, blake3_2);
      assertSame(blake3_1, blake3_2);
      assertSame(blake3_1, blake3_0);
      assertNotSame(byteArray1, byteArray0);
      assertFalse(byteArray0.equals((Object)byteArray1));
      assertFalse(byteArray1.equals((Object)byteArray0));
      
      // Undeclared exception!
      try { 
        blake3_2.doFinalize(byteArray0, (int) (byte)79, (int) (byte)79);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Offset 79 and length 79 out of bounds with buffer length 7
         //
         verifyException("org.apache.commons.codec.digest.Blake3", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Blake3 blake3_0 = Blake3.initHash();
      assertNotNull(blake3_0);
      
      byte[] byteArray0 = new byte[4];
      byte[] byteArray1 = blake3_0.doFinalize(537);
      assertEquals(537, byteArray1.length);
      assertNotNull(byteArray1);
      assertNotSame(byteArray1, byteArray0);
      assertFalse(byteArray1.equals((Object)byteArray0));
      
      byte byte0 = (byte)0;
      byteArray0[0] = (byte)0;
      byte byte1 = (byte) (-1);
      byteArray0[1] = (byte) (-1);
      // Undeclared exception!
      try { 
        Blake3.initKeyedHash(byteArray1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Blake3 keys must be 32 bytes
         //
         verifyException("org.apache.commons.codec.digest.Blake3", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      Blake3 blake3_0 = Blake3.initKeyDerivationFunction(byteArray0);
      assertEquals(0, byteArray0.length);
      assertNotNull(blake3_0);
      assertArrayEquals(new byte[] {}, byteArray0);
      
      Blake3 blake3_1 = blake3_0.doFinalize(byteArray0);
      assertEquals(0, byteArray0.length);
      assertNotNull(blake3_1);
      assertArrayEquals(new byte[] {}, byteArray0);
      assertSame(blake3_0, blake3_1);
      assertSame(blake3_1, blake3_0);
      
      Blake3 blake3_2 = Blake3.initKeyDerivationFunction(byteArray0);
      assertEquals(0, byteArray0.length);
      assertNotNull(blake3_2);
      assertArrayEquals(new byte[] {}, byteArray0);
      assertNotSame(blake3_2, blake3_0);
      assertNotSame(blake3_2, blake3_1);
      assertFalse(blake3_2.equals((Object)blake3_0));
      assertFalse(blake3_2.equals((Object)blake3_1));
      
      Blake3 blake3_3 = blake3_0.doFinalize(byteArray0);
      assertEquals(0, byteArray0.length);
      assertNotNull(blake3_3);
      assertArrayEquals(new byte[] {}, byteArray0);
      assertSame(blake3_0, blake3_1);
      assertNotSame(blake3_0, blake3_2);
      assertSame(blake3_0, blake3_3);
      assertNotSame(blake3_3, blake3_2);
      assertSame(blake3_3, blake3_1);
      assertSame(blake3_3, blake3_0);
      assertFalse(blake3_0.equals((Object)blake3_2));
      assertFalse(blake3_3.equals((Object)blake3_2));
      
      Blake3 blake3_4 = blake3_3.update(byteArray0, 0, 0);
      assertEquals(0, byteArray0.length);
      assertNotNull(blake3_4);
      assertArrayEquals(new byte[] {}, byteArray0);
      assertSame(blake3_0, blake3_1);
      assertNotSame(blake3_0, blake3_2);
      assertSame(blake3_0, blake3_3);
      assertSame(blake3_0, blake3_4);
      assertNotSame(blake3_3, blake3_2);
      assertSame(blake3_3, blake3_1);
      assertSame(blake3_3, blake3_4);
      assertSame(blake3_3, blake3_0);
      assertSame(blake3_4, blake3_1);
      assertSame(blake3_4, blake3_0);
      assertSame(blake3_4, blake3_3);
      assertNotSame(blake3_4, blake3_2);
      assertFalse(blake3_0.equals((Object)blake3_2));
      assertFalse(blake3_3.equals((Object)blake3_2));
      assertFalse(blake3_4.equals((Object)blake3_2));
      
      // Undeclared exception!
      try { 
        blake3_0.doFinalize(byteArray0, (-654), (-654));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Offset must be non-negative
         //
         verifyException("org.apache.commons.codec.digest.Blake3", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Blake3 blake3_0 = Blake3.initHash();
      //  // Unstable assertion: assertNotNull(blake3_0);
      
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte) (-16);
      byteArray0[1] = (byte)0;
      Blake3 blake3_1 = blake3_0.update(byteArray0);
      //  // Unstable assertion: assertEquals(2, byteArray0.length);
      //  // Unstable assertion: assertNotNull(blake3_1);
      //  // Unstable assertion: assertArrayEquals(new byte[] {(byte) (-16), (byte)0}, byteArray0);
      //  // Unstable assertion: assertSame(blake3_0, blake3_1);
      //  // Unstable assertion: assertSame(blake3_1, blake3_0);
      
      byte[] byteArray1 = new byte[7];
      //  // Unstable assertion: assertFalse(byteArray1.equals((Object)byteArray0));
      
      byteArray1[0] = (byte)0;
      byteArray1[1] = (byte)63;
      byteArray1[2] = (byte)28;
      byteArray1[3] = (byte)0;
      byteArray1[4] = (byte) (-1);
      byteArray1[5] = (byte)15;
      byteArray1[6] = (byte) (-115);
      Blake3 blake3_2 = blake3_0.update(byteArray1);
      //  // Unstable assertion: assertEquals(7, byteArray1.length);
      //  // Unstable assertion: assertNotNull(blake3_2);
      //  // Unstable assertion: assertArrayEquals(new byte[] {(byte)0, (byte)63, (byte)28, (byte)0, (byte) (-1), (byte)15, (byte) (-115)}, byteArray1);
      //  // Unstable assertion: assertSame(blake3_0, blake3_2);
      //  // Unstable assertion: assertSame(blake3_0, blake3_1);
      //  // Unstable assertion: assertNotSame(byteArray1, byteArray0);
      //  // Unstable assertion: assertSame(blake3_2, blake3_0);
      //  // Unstable assertion: assertSame(blake3_2, blake3_1);
      //  // Unstable assertion: assertFalse(byteArray1.equals((Object)byteArray0));
      
      Blake3 blake3_3 = blake3_2.reset();
      //  // Unstable assertion: assertEquals(7, byteArray1.length);
      //  // Unstable assertion: assertNotNull(blake3_3);
      //  // Unstable assertion: assertArrayEquals(new byte[] {(byte)0, (byte)63, (byte)28, (byte)0, (byte) (-1), (byte)15, (byte) (-115)}, byteArray1);
      //  // Unstable assertion: assertSame(blake3_0, blake3_2);
      //  // Unstable assertion: assertSame(blake3_0, blake3_3);
      //  // Unstable assertion: assertSame(blake3_0, blake3_1);
      //  // Unstable assertion: assertNotSame(byteArray1, byteArray0);
      //  // Unstable assertion: assertSame(blake3_2, blake3_3);
      //  // Unstable assertion: assertSame(blake3_2, blake3_0);
      //  // Unstable assertion: assertSame(blake3_2, blake3_1);
      //  // Unstable assertion: assertSame(blake3_3, blake3_0);
      //  // Unstable assertion: assertSame(blake3_3, blake3_2);
      //  // Unstable assertion: assertSame(blake3_3, blake3_1);
      //  // Unstable assertion: assertFalse(byteArray1.equals((Object)byteArray0));
      
      Blake3 blake3_4 = blake3_3.doFinalize(byteArray1);
      //  // Unstable assertion: assertEquals(7, byteArray1.length);
      //  // Unstable assertion: assertNotNull(blake3_4);
      //  // Unstable assertion: assertArrayEquals(new byte[] {(byte) (-53), (byte) (-8), (byte) (-63), (byte)76, (byte) (-39), (byte) (-29), (byte) (-113)}, byteArray1);
      //  // Unstable assertion: assertSame(blake3_0, blake3_2);
      //  // Unstable assertion: assertSame(blake3_0, blake3_3);
      //  // Unstable assertion: assertSame(blake3_0, blake3_4);
      //  // Unstable assertion: assertSame(blake3_0, blake3_1);
      //  // Unstable assertion: assertNotSame(byteArray1, byteArray0);
      //  // Unstable assertion: assertSame(blake3_2, blake3_3);
      //  // Unstable assertion: assertSame(blake3_2, blake3_0);
      //  // Unstable assertion: assertSame(blake3_2, blake3_1);
      //  // Unstable assertion: assertSame(blake3_2, blake3_4);
      //  // Unstable assertion: assertSame(blake3_3, blake3_0);
      //  // Unstable assertion: assertSame(blake3_3, blake3_2);
      //  // Unstable assertion: assertSame(blake3_3, blake3_4);
      //  // Unstable assertion: assertSame(blake3_3, blake3_1);
      //  // Unstable assertion: assertSame(blake3_4, blake3_1);
      //  // Unstable assertion: assertSame(blake3_4, blake3_0);
      //  // Unstable assertion: assertSame(blake3_4, blake3_2);
      //  // Unstable assertion: assertSame(blake3_4, blake3_3);
      //  // Unstable assertion: assertFalse(byteArray1.equals((Object)byteArray0));
      
      Blake3 blake3_5 = blake3_4.update(byteArray1);
      //  // Unstable assertion: assertEquals(7, byteArray1.length);
      //  // Unstable assertion: assertNotNull(blake3_5);
      //  // Unstable assertion: assertArrayEquals(new byte[] {(byte) (-53), (byte) (-8), (byte) (-63), (byte)76, (byte) (-39), (byte) (-29), (byte) (-113)}, byteArray1);
      //  // Unstable assertion: assertSame(blake3_5, blake3_0);
      //  // Unstable assertion: assertSame(blake3_5, blake3_3);
      //  // Unstable assertion: assertSame(blake3_5, blake3_2);
      //  // Unstable assertion: assertSame(blake3_5, blake3_1);
      //  // Unstable assertion: assertSame(blake3_5, blake3_4);
      //  // Unstable assertion: assertSame(blake3_0, blake3_2);
      //  // Unstable assertion: assertSame(blake3_0, blake3_3);
      //  // Unstable assertion: assertSame(blake3_0, blake3_5);
      //  // Unstable assertion: assertSame(blake3_0, blake3_4);
      //  // Unstable assertion: assertSame(blake3_0, blake3_1);
      //  // Unstable assertion: assertNotSame(byteArray1, byteArray0);
      //  // Unstable assertion: assertSame(blake3_2, blake3_3);
      //  // Unstable assertion: assertSame(blake3_2, blake3_0);
      //  // Unstable assertion: assertSame(blake3_2, blake3_1);
      //  // Unstable assertion: assertSame(blake3_2, blake3_4);
      //  // Unstable assertion: assertSame(blake3_2, blake3_5);
      //  // Unstable assertion: assertSame(blake3_3, blake3_0);
      //  // Unstable assertion: assertSame(blake3_3, blake3_2);
      //  // Unstable assertion: assertSame(blake3_3, blake3_4);
      //  // Unstable assertion: assertSame(blake3_3, blake3_5);
      //  // Unstable assertion: assertSame(blake3_3, blake3_1);
      //  // Unstable assertion: assertSame(blake3_4, blake3_1);
      //  // Unstable assertion: assertSame(blake3_4, blake3_5);
      //  // Unstable assertion: assertSame(blake3_4, blake3_0);
      //  // Unstable assertion: assertSame(blake3_4, blake3_2);
      //  // Unstable assertion: assertSame(blake3_4, blake3_3);
      //  // Unstable assertion: assertFalse(byteArray1.equals((Object)byteArray0));
      
      // Undeclared exception!
      try { 
        blake3_4.update(byteArray1, (-916), (-4210));
       //  fail("Expecting exception: IndexOutOfBoundsException");
       // Unstable assertion
      } catch(IndexOutOfBoundsException e) {
         //
         // Offset must be non-negative
         //
         verifyException("org.apache.commons.codec.digest.Blake3", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)99;
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte)1;
      byteArray0[4] = (byte)0;
      byteArray0[5] = (byte) (-118);
      Blake3 blake3_0 = Blake3.initKeyDerivationFunction(byteArray0);
      assertEquals(6, byteArray0.length);
      assertNotNull(blake3_0);
      assertArrayEquals(new byte[] {(byte)99, (byte)0, (byte)0, (byte)1, (byte)0, (byte) (-118)}, byteArray0);
      
      Blake3 blake3_1 = blake3_0.update(byteArray0);
      assertEquals(6, byteArray0.length);
      assertNotNull(blake3_1);
      assertArrayEquals(new byte[] {(byte)99, (byte)0, (byte)0, (byte)1, (byte)0, (byte) (-118)}, byteArray0);
      assertSame(blake3_0, blake3_1);
      assertSame(blake3_1, blake3_0);
      
      byte[] byteArray1 = blake3_1.doFinalize(0);
      assertEquals(6, byteArray0.length);
      assertEquals(0, byteArray1.length);
      assertNotNull(byteArray1);
      assertArrayEquals(new byte[] {(byte)99, (byte)0, (byte)0, (byte)1, (byte)0, (byte) (-118)}, byteArray0);
      assertArrayEquals(new byte[] {}, byteArray1);
      assertNotSame(byteArray0, byteArray1);
      assertSame(blake3_0, blake3_1);
      assertSame(blake3_1, blake3_0);
      assertNotSame(byteArray1, byteArray0);
      assertFalse(byteArray1.equals((Object)byteArray0));
      
      // Undeclared exception!
      try { 
        Blake3.initKeyedHash(byteArray1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Blake3 keys must be 32 bytes
         //
         verifyException("org.apache.commons.codec.digest.Blake3", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Blake3 blake3_0 = Blake3.initHash();
      assertNotNull(blake3_0);
      
      byte[] byteArray0 = null;
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
  public void test15()  throws Throwable  {
      Blake3 blake3_0 = Blake3.initHash();
      assertNotNull(blake3_0);
      
      Blake3 blake3_1 = blake3_0.reset();
      assertNotNull(blake3_1);
      assertSame(blake3_0, blake3_1);
      assertSame(blake3_1, blake3_0);
      
      byte[] byteArray0 = null;
      // Undeclared exception!
      try { 
        blake3_1.doFinalize((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.codec.digest.Blake3", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Blake3 blake3_0 = Blake3.initHash();
      assertNotNull(blake3_0);
      
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)1;
      byteArray0[1] = (byte)58;
      Blake3 blake3_1 = blake3_0.update(byteArray0);
      assertEquals(8, byteArray0.length);
      assertNotNull(blake3_1);
      assertArrayEquals(new byte[] {(byte)1, (byte)58, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertSame(blake3_0, blake3_1);
      assertSame(blake3_1, blake3_0);
      
      byteArray0[2] = (byte)124;
      byteArray0[3] = (byte)0;
      byteArray0[4] = (byte)57;
      byteArray0[5] = (byte)64;
      byteArray0[6] = (byte)0;
      byteArray0[7] = (byte)36;
      // Undeclared exception!
      try { 
        blake3_0.update(byteArray0, 1, (int) (byte)57);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Offset 1 and length 57 out of bounds with buffer length 8
         //
         verifyException("org.apache.commons.codec.digest.Blake3", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Blake3 blake3_0 = Blake3.initHash();
      assertNotNull(blake3_0);
      
      byte[] byteArray0 = new byte[0];
      Blake3 blake3_1 = blake3_0.doFinalize(byteArray0);
      assertEquals(0, byteArray0.length);
      assertNotNull(blake3_1);
      assertArrayEquals(new byte[] {}, byteArray0);
      assertSame(blake3_0, blake3_1);
      assertSame(blake3_1, blake3_0);
      
      int int0 = 2313;
      // Undeclared exception!
      try { 
        blake3_1.update(byteArray0, 0, 2313);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Offset 0 and length 2313 out of bounds with buffer length 0
         //
         verifyException("org.apache.commons.codec.digest.Blake3", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      byte[] byteArray0 = null;
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
  public void test19()  throws Throwable  {
      Blake3 blake3_0 = Blake3.initHash();
      assertNotNull(blake3_0);
      
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte) (-1);
      byteArray0[1] = (byte)16;
      byteArray0[2] = (byte) (-67);
      byteArray0[3] = (byte)0;
      byteArray0[4] = (byte)0;
      byteArray0[5] = (byte) (-43);
      byteArray0[6] = (byte) (-1);
      byteArray0[7] = (byte) (-85);
      byteArray0[8] = (byte) (-112);
      byte[] byteArray1 = Blake3.hash(byteArray0);
      assertEquals(9, byteArray0.length);
      assertEquals(32, byteArray1.length);
      assertNotNull(byteArray1);
      assertArrayEquals(new byte[] {(byte) (-1), (byte)16, (byte) (-67), (byte)0, (byte)0, (byte) (-43), (byte) (-1), (byte) (-85), (byte) (-112)}, byteArray0);
      assertNotSame(byteArray0, byteArray1);
      assertNotSame(byteArray1, byteArray0);
      assertFalse(byteArray1.equals((Object)byteArray0));
      
      // Undeclared exception!
      try { 
        blake3_0.doFinalize((-555));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Requested bytes must be non-negative
         //
         verifyException("org.apache.commons.codec.digest.Blake3", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Blake3 blake3_0 = Blake3.initHash();
      //  // Unstable assertion: assertNotNull(blake3_0);
      
      byte[] byteArray0 = new byte[5];
      byte byte0 = (byte)0;
      Blake3 blake3_1 = blake3_0.doFinalize(byteArray0);
      //  // Unstable assertion: assertEquals(5, byteArray0.length);
      //  // Unstable assertion: assertNotNull(blake3_1);
      //  // Unstable assertion: assertArrayEquals(new byte[] {(byte) (-53), (byte) (-8), (byte) (-63), (byte)76, (byte) (-39)}, byteArray0);
      //  // Unstable assertion: assertSame(blake3_0, blake3_1);
      //  // Unstable assertion: assertSame(blake3_1, blake3_0);
      
      byteArray0[0] = (byte)0;
      byte byte1 = (byte) (-5);
      byteArray0[1] = (byte) (-5);
      byteArray0[2] = (byte) (-15);
      byteArray0[3] = (byte)73;
      byte byte2 = (byte) (-1);
      byteArray0[4] = (byte) (-1);
      // Undeclared exception!
      try { 
        blake3_0.update(byteArray0, (int) (byte) (-5), (-175));
       //  fail("Expecting exception: IndexOutOfBoundsException");
       // Unstable assertion
      } catch(IndexOutOfBoundsException e) {
         //
         // Offset must be non-negative
         //
         verifyException("org.apache.commons.codec.digest.Blake3", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte)0;
      byteArray0[4] = (byte)98;
      byteArray0[5] = (byte) (-69);
      byteArray0[6] = (byte) (-118);
      byteArray0[7] = (byte)91;
      Blake3 blake3_0 = Blake3.initKeyDerivationFunction(byteArray0);
      //  // Unstable assertion: assertEquals(8, byteArray0.length);
      //  // Unstable assertion: assertNotNull(blake3_0);
      //  // Unstable assertion: assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)98, (byte) (-69), (byte) (-118), (byte)91}, byteArray0);
      
      Blake3 blake3_1 = blake3_0.doFinalize(byteArray0);
      //  // Unstable assertion: assertEquals(8, byteArray0.length);
      //  // Unstable assertion: assertNotNull(blake3_1);
      //  // Unstable assertion: assertArrayEquals(new byte[] {(byte)19, (byte)102, (byte) (-77), (byte) (-1), (byte)18, (byte) (-23), (byte) (-107), (byte)12}, byteArray0);
      //  // Unstable assertion: assertSame(blake3_0, blake3_1);
      //  // Unstable assertion: assertSame(blake3_1, blake3_0);
      
      Blake3 blake3_2 = blake3_1.update(byteArray0);
      //  // Unstable assertion: assertEquals(8, byteArray0.length);
      //  // Unstable assertion: assertNotNull(blake3_2);
      //  // Unstable assertion: assertArrayEquals(new byte[] {(byte)19, (byte)102, (byte) (-77), (byte) (-1), (byte)18, (byte) (-23), (byte) (-107), (byte)12}, byteArray0);
      //  // Unstable assertion: assertSame(blake3_0, blake3_1);
      //  // Unstable assertion: assertSame(blake3_0, blake3_2);
      //  // Unstable assertion: assertSame(blake3_1, blake3_0);
      //  // Unstable assertion: assertSame(blake3_1, blake3_2);
      //  // Unstable assertion: assertSame(blake3_2, blake3_0);
      //  // Unstable assertion: assertSame(blake3_2, blake3_1);
      
      // Undeclared exception!
      try { 
        blake3_2.doFinalize(byteArray0, 702, 4530);
       //  fail("Expecting exception: IndexOutOfBoundsException");
       // Unstable assertion
      } catch(IndexOutOfBoundsException e) {
         //
         // Offset 702 and length 4530 out of bounds with buffer length 8
         //
         verifyException("org.apache.commons.codec.digest.Blake3", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
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
  public void test23()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byte byte0 = (byte) (-125);
      byteArray0[0] = (byte) (-125);
      byteArray0[1] = (byte)56;
      byte byte1 = (byte) (-98);
      byteArray0[2] = (byte) (-98);
      byte byte2 = (byte)83;
      byteArray0[3] = (byte)83;
      byte byte3 = (byte) (-81);
      byteArray0[4] = (byte) (-81);
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
  public void test24()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byte byte0 = (byte)0;
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte)107;
      byteArray0[4] = (byte) (-1);
      byteArray0[5] = (byte) (-42);
      byteArray0[6] = (byte)32;
      byteArray0[7] = (byte)0;
      byteArray0[8] = (byte)0;
      Blake3 blake3_0 = Blake3.initKeyDerivationFunction(byteArray0);
      assertEquals(9, byteArray0.length);
      assertNotNull(blake3_0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)107, (byte) (-1), (byte) (-42), (byte)32, (byte)0, (byte)0}, byteArray0);
      
      Blake3 blake3_1 = blake3_0.reset();
      assertEquals(9, byteArray0.length);
      assertNotNull(blake3_1);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)107, (byte) (-1), (byte) (-42), (byte)32, (byte)0, (byte)0}, byteArray0);
      assertSame(blake3_0, blake3_1);
      assertSame(blake3_1, blake3_0);
      
      // Undeclared exception!
      try { 
        blake3_1.doFinalize((-1499));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Requested bytes must be non-negative
         //
         verifyException("org.apache.commons.codec.digest.Blake3", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Blake3 blake3_0 = Blake3.initHash();
      assertNotNull(blake3_0);
      
      Blake3 blake3_1 = blake3_0.reset();
      assertNotNull(blake3_1);
      assertSame(blake3_0, blake3_1);
      assertSame(blake3_1, blake3_0);
      
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte) (-72);
      byteArray0[1] = (byte)3;
      byteArray0[2] = (byte) (-4);
      byteArray0[3] = (byte)127;
      byteArray0[4] = (byte)25;
      byteArray0[5] = (byte)6;
      byteArray0[6] = (byte)0;
      byteArray0[7] = (byte)2;
      // Undeclared exception!
      try { 
        Blake3.keyedHash(byteArray0, byteArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Blake3 keys must be 32 bytes
         //
         verifyException("org.apache.commons.codec.digest.Blake3", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byte byte0 = (byte)0;
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte) (-88);
      byteArray0[2] = (byte) (-90);
      byteArray0[3] = (byte)97;
      byteArray0[4] = (byte)0;
      byteArray0[5] = (byte) (-1);
      byteArray0[6] = (byte)54;
      Blake3 blake3_0 = Blake3.initKeyDerivationFunction(byteArray0);
      //  // Unstable assertion: assertEquals(7, byteArray0.length);
      //  // Unstable assertion: assertNotNull(blake3_0);
      //  // Unstable assertion: assertArrayEquals(new byte[] {(byte)0, (byte) (-88), (byte) (-90), (byte)97, (byte)0, (byte) (-1), (byte)54}, byteArray0);
      
      Blake3 blake3_1 = blake3_0.doFinalize(byteArray0);
      //  // Unstable assertion: assertEquals(7, byteArray0.length);
      //  // Unstable assertion: assertNotNull(blake3_1);
      //  // Unstable assertion: assertArrayEquals(new byte[] {(byte)101, (byte) (-83), (byte)120, (byte) (-66), (byte) (-128), (byte)99, (byte) (-27)}, byteArray0);
      //  // Unstable assertion: assertSame(blake3_0, blake3_1);
      //  // Unstable assertion: assertSame(blake3_1, blake3_0);
      
      int int0 = (-63);
      // Undeclared exception!
      try { 
        blake3_1.doFinalize(byteArray0, (int) (byte)97, (-63));
       //  fail("Expecting exception: IndexOutOfBoundsException");
       // Unstable assertion
      } catch(IndexOutOfBoundsException e) {
         //
         // Length must be non-negative
         //
         verifyException("org.apache.commons.codec.digest.Blake3", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byte[] byteArray1 = Blake3.hash(byteArray0);
      Blake3 blake3_0 = Blake3.initKeyDerivationFunction(byteArray1);
      Blake3 blake3_1 = blake3_0.doFinalize(byteArray0);
      Blake3 blake3_2 = blake3_1.update(byteArray1);
      blake3_0.reset();
      Blake3.keyedHash(byteArray1, byteArray0);
      blake3_1.reset();
      Blake3.initKeyedHash(byteArray1);
      Blake3.hash(byteArray0);
      // Undeclared exception!
      try { 
        blake3_2.doFinalize(byteArray0, 0, (-8));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Length must be non-negative
         //
         verifyException("org.apache.commons.codec.digest.Blake3", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      Blake3 blake3_0 = Blake3.initHash();
      Blake3.hash(byteArray0);
      int int0 = 4027;
      // Undeclared exception!
      try { 
        blake3_0.update(byteArray0, 4195, 4027);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Offset 4195 and length 4027 out of bounds with buffer length 0
         //
         verifyException("org.apache.commons.codec.digest.Blake3", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Blake3 blake3_0 = Blake3.initHash();
      Blake3 blake3_1 = blake3_0.reset();
      Blake3.initHash();
      blake3_0.doFinalize(0);
      int int0 = 1308;
      byte[] byteArray0 = blake3_0.doFinalize(1308);
      Blake3.initKeyDerivationFunction(byteArray0);
      blake3_0.update(byteArray0);
      Blake3.hash(byteArray0);
      blake3_0.update(byteArray0);
      blake3_0.doFinalize(20);
      Blake3.initHash();
      Blake3.initHash();
      byte[] byteArray1 = blake3_1.doFinalize(0);
      Blake3 blake3_2 = blake3_1.reset();
      // Undeclared exception!
      try { 
        blake3_2.update(byteArray1, (-2000), 0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Offset must be non-negative
         //
         verifyException("org.apache.commons.codec.digest.Blake3", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)116;
      byteArray0[1] = (byte)8;
      byteArray0[2] = (byte)113;
      byteArray0[3] = (byte) (-57);
      byteArray0[4] = (byte)0;
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
  public void test31()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byte byte0 = (byte) (-4);
      byteArray0[0] = (byte) (-4);
      byte byte1 = (byte)114;
      byteArray0[1] = (byte)114;
      byte byte2 = (byte)0;
      byteArray0[2] = (byte) (-4);
      Blake3 blake3_0 = Blake3.initKeyDerivationFunction(byteArray0);
      blake3_0.doFinalize(byteArray0);
      Blake3 blake3_1 = blake3_0.doFinalize(byteArray0);
      Blake3.hash(byteArray0);
      Blake3.initKeyDerivationFunction(byteArray0);
      // Undeclared exception!
      try { 
        blake3_1.doFinalize((-1473));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Requested bytes must be non-negative
         //
         verifyException("org.apache.commons.codec.digest.Blake3", e);
      }
  }
}
