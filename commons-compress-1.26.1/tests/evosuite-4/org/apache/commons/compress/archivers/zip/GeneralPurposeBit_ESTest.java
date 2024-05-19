
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


package org.apache.commons.compress.archivers.zip;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.compress.archivers.zip.GeneralPurposeBit;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class GeneralPurposeBit_ESTest extends GeneralPurposeBit_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      GeneralPurposeBit generalPurposeBit0 = new GeneralPurposeBit();
      generalPurposeBit0.useUTF8ForNames(true);
      boolean boolean0 = generalPurposeBit0.usesUTF8ForNames();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      GeneralPurposeBit generalPurposeBit0 = new GeneralPurposeBit();
      generalPurposeBit0.useStrongEncryption(true);
      boolean boolean0 = generalPurposeBit0.usesEncryption();
      assertTrue(generalPurposeBit0.usesStrongEncryption());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      GeneralPurposeBit generalPurposeBit0 = new GeneralPurposeBit();
      generalPurposeBit0.useDataDescriptor(true);
      boolean boolean0 = generalPurposeBit0.usesDataDescriptor();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      GeneralPurposeBit generalPurposeBit0 = GeneralPurposeBit.parse(byteArray0, 0);
      int int0 = generalPurposeBit0.getSlidingDictionarySize();
      assertFalse(generalPurposeBit0.usesUTF8ForNames());
      assertFalse(generalPurposeBit0.usesDataDescriptor());
      assertFalse(generalPurposeBit0.usesEncryption());
      assertEquals(4096, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      GeneralPurposeBit generalPurposeBit0 = GeneralPurposeBit.parse(byteArray0, 0);
      int int0 = generalPurposeBit0.getNumberOfShannonFanoTrees();
      assertFalse(generalPurposeBit0.usesUTF8ForNames());
      assertFalse(generalPurposeBit0.usesEncryption());
      assertEquals(2, int0);
      assertFalse(generalPurposeBit0.usesDataDescriptor());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      // Undeclared exception!
      try { 
        GeneralPurposeBit.parse((byte[]) null, (-956));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.utils.ByteUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      // Undeclared exception!
      try { 
        GeneralPurposeBit.parse(byteArray0, (byte)96);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 96
         //
         verifyException("org.apache.commons.compress.utils.ByteUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      GeneralPurposeBit generalPurposeBit0 = new GeneralPurposeBit();
      // Undeclared exception!
      try { 
        generalPurposeBit0.encode((byte[]) null, 17);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.utils.ByteUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      GeneralPurposeBit generalPurposeBit0 = new GeneralPurposeBit();
      generalPurposeBit0.useStrongEncryption(false);
      assertFalse(generalPurposeBit0.usesEncryption());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      GeneralPurposeBit generalPurposeBit0 = new GeneralPurposeBit();
      generalPurposeBit0.useDataDescriptor(true);
      byte[] byteArray0 = new byte[4];
      // Undeclared exception!
      try { 
        generalPurposeBit0.encode(byteArray0, 3085);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3085
         //
         verifyException("org.apache.commons.compress.utils.ByteUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      GeneralPurposeBit generalPurposeBit0 = new GeneralPurposeBit();
      byte[] byteArray0 = new byte[7];
      generalPurposeBit0.useStrongEncryption(true);
      // Undeclared exception!
      try { 
        generalPurposeBit0.encode(byteArray0, 1562);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1562
         //
         verifyException("org.apache.commons.compress.utils.ByteUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      GeneralPurposeBit generalPurposeBit0 = new GeneralPurposeBit();
      byte[] byteArray0 = new byte[7];
      generalPurposeBit0.useEncryption(true);
      // Undeclared exception!
      try { 
        generalPurposeBit0.encode(byteArray0, 1562);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1562
         //
         verifyException("org.apache.commons.compress.utils.ByteUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      GeneralPurposeBit generalPurposeBit0 = new GeneralPurposeBit();
      generalPurposeBit0.useUTF8ForNames(true);
      byte[] byteArray0 = generalPurposeBit0.encode();
      generalPurposeBit0.encode(byteArray0, 0);
      assertTrue(generalPurposeBit0.usesUTF8ForNames());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      GeneralPurposeBit generalPurposeBit0 = new GeneralPurposeBit();
      generalPurposeBit0.useStrongEncryption(true);
      boolean boolean0 = generalPurposeBit0.usesStrongEncryption();
      assertTrue(generalPurposeBit0.usesEncryption());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      GeneralPurposeBit generalPurposeBit0 = new GeneralPurposeBit();
      generalPurposeBit0.useEncryption(true);
      boolean boolean0 = generalPurposeBit0.usesStrongEncryption();
      assertTrue(generalPurposeBit0.usesEncryption());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      GeneralPurposeBit generalPurposeBit0 = new GeneralPurposeBit();
      boolean boolean0 = generalPurposeBit0.usesStrongEncryption();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      GeneralPurposeBit generalPurposeBit0 = new GeneralPurposeBit();
      generalPurposeBit0.useUTF8ForNames(true);
      generalPurposeBit0.hashCode();
      assertTrue(generalPurposeBit0.usesUTF8ForNames());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      GeneralPurposeBit generalPurposeBit0 = new GeneralPurposeBit();
      generalPurposeBit0.useEncryption(true);
      generalPurposeBit0.hashCode();
      assertTrue(generalPurposeBit0.usesEncryption());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      GeneralPurposeBit generalPurposeBit0 = GeneralPurposeBit.parse(byteArray0, (byte)0);
      assertFalse(generalPurposeBit0.usesDataDescriptor());
      
      GeneralPurposeBit generalPurposeBit1 = new GeneralPurposeBit();
      generalPurposeBit0.useDataDescriptor(true);
      boolean boolean0 = generalPurposeBit0.equals(generalPurposeBit1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      GeneralPurposeBit generalPurposeBit0 = new GeneralPurposeBit();
      GeneralPurposeBit generalPurposeBit1 = new GeneralPurposeBit();
      generalPurposeBit1.useUTF8ForNames(true);
      boolean boolean0 = generalPurposeBit0.equals(generalPurposeBit1);
      assertTrue(generalPurposeBit1.usesUTF8ForNames());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      GeneralPurposeBit generalPurposeBit0 = new GeneralPurposeBit();
      generalPurposeBit0.useEncryption(true);
      Object object0 = generalPurposeBit0.clone();
      generalPurposeBit0.useStrongEncryption(true);
      boolean boolean0 = generalPurposeBit0.equals(object0);
      assertTrue(generalPurposeBit0.usesEncryption());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      GeneralPurposeBit generalPurposeBit0 = new GeneralPurposeBit();
      GeneralPurposeBit generalPurposeBit1 = new GeneralPurposeBit();
      generalPurposeBit0.useStrongEncryption(true);
      boolean boolean0 = generalPurposeBit0.equals(generalPurposeBit1);
      assertTrue(generalPurposeBit0.usesEncryption());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      GeneralPurposeBit generalPurposeBit0 = new GeneralPurposeBit();
      Object object0 = new Object();
      boolean boolean0 = generalPurposeBit0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      GeneralPurposeBit generalPurposeBit0 = GeneralPurposeBit.parse(byteArray0, (byte)0);
      boolean boolean0 = generalPurposeBit0.equals(generalPurposeBit0);
      assertFalse(generalPurposeBit0.usesUTF8ForNames());
      assertFalse(generalPurposeBit0.usesDataDescriptor());
      assertTrue(boolean0);
      assertFalse(generalPurposeBit0.usesEncryption());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[1] = (byte) (-1);
      GeneralPurposeBit generalPurposeBit0 = GeneralPurposeBit.parse(byteArray0, 0);
      byte[] byteArray1 = generalPurposeBit0.encode();
      assertArrayEquals(new byte[] {(byte)0, (byte)8}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte) (-1);
      GeneralPurposeBit generalPurposeBit0 = GeneralPurposeBit.parse(byteArray0, 0);
      byte[] byteArray1 = generalPurposeBit0.encode();
      assertArrayEquals(new byte[] {(byte)73, (byte)0}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      GeneralPurposeBit generalPurposeBit0 = new GeneralPurposeBit();
      boolean boolean0 = generalPurposeBit0.usesDataDescriptor();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      GeneralPurposeBit generalPurposeBit0 = new GeneralPurposeBit();
      generalPurposeBit0.useStrongEncryption(true);
      generalPurposeBit0.hashCode();
      assertTrue(generalPurposeBit0.usesStrongEncryption());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      GeneralPurposeBit generalPurposeBit0 = new GeneralPurposeBit();
      boolean boolean0 = generalPurposeBit0.usesUTF8ForNames();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      GeneralPurposeBit generalPurposeBit0 = new GeneralPurposeBit();
      boolean boolean0 = generalPurposeBit0.usesEncryption();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      GeneralPurposeBit generalPurposeBit0 = new GeneralPurposeBit();
      int int0 = generalPurposeBit0.getSlidingDictionarySize();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      GeneralPurposeBit generalPurposeBit0 = new GeneralPurposeBit();
      generalPurposeBit0.useDataDescriptor(true);
      generalPurposeBit0.hashCode();
      assertTrue(generalPurposeBit0.usesDataDescriptor());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      GeneralPurposeBit generalPurposeBit0 = new GeneralPurposeBit();
      int int0 = generalPurposeBit0.getNumberOfShannonFanoTrees();
      assertEquals(0, int0);
  }
}
