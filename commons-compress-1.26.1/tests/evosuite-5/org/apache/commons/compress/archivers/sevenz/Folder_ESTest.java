
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


package org.apache.commons.compress.archivers.sevenz;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.IOException;
import org.apache.commons.compress.archivers.sevenz.BindPair;
import org.apache.commons.compress.archivers.sevenz.Coder;
import org.apache.commons.compress.archivers.sevenz.Folder;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class Folder_ESTest extends Folder_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Folder folder0 = new Folder();
      long[] longArray0 = new long[7];
      Coder[] coderArray0 = new Coder[2];
      folder0.coders = coderArray0;
      folder0.packedStreams = longArray0;
      BindPair[] bindPairArray0 = new BindPair[5];
      folder0.bindPairs = bindPairArray0;
      // Undeclared exception!
      try { 
        folder0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.sevenz.Folder", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Folder folder0 = new Folder();
      Coder[] coderArray0 = new Coder[0];
      folder0.coders = coderArray0;
      folder0.totalInputStreams = 0L;
      folder0.totalInputStreams = (long) 704;
      // Undeclared exception!
      try { 
        folder0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.sevenz.Folder", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Folder folder0 = new Folder();
      folder0.crc = 15L;
      Coder[] coderArray0 = new Coder[2];
      folder0.coders = coderArray0;
      // Undeclared exception!
      try { 
        folder0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.sevenz.Folder", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Folder folder0 = new Folder();
      Coder[] coderArray0 = new Coder[7];
      Coder coder0 = new Coder((byte[]) null, 732L, 732L, (byte[]) null);
      coderArray0[1] = coder0;
      folder0.coders = coderArray0;
      // Undeclared exception!
      try { 
        folder0.getUnpackSizeForCoder(coder0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.sevenz.Folder", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Folder folder0 = new Folder();
      folder0.numUnpackSubStreams = 0;
      folder0.numUnpackSubStreams = 3092;
      Coder[] coderArray0 = new Coder[1];
      long[] longArray0 = new long[3];
      folder0.packedStreams = longArray0;
      folder0.coders = coderArray0;
      Iterable<Coder> iterable0 = folder0.getOrderedCoders();
      assertNotNull(iterable0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Folder folder0 = new Folder();
      Coder[] coderArray0 = new Coder[1];
      long[] longArray0 = new long[3];
      longArray0[0] = (long) 1;
      folder0.packedStreams = longArray0;
      folder0.coders = coderArray0;
      Iterable<Coder> iterable0 = folder0.getOrderedCoders();
      assertNotNull(iterable0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Folder folder0 = new Folder();
      BindPair[] bindPairArray0 = new BindPair[7];
      BindPair bindPair0 = new BindPair((-325L), (-5987L));
      bindPairArray0[0] = bindPair0;
      folder0.bindPairs = bindPairArray0;
      // Undeclared exception!
      try { 
        folder0.findBindPairForInStream((-1));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.sevenz.Folder", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Folder folder0 = new Folder();
      Coder[] coderArray0 = new Coder[21];
      long[] longArray0 = new long[9];
      longArray0[0] = 1217L;
      folder0.unpackSizes = longArray0;
      folder0.coders = coderArray0;
      long long0 = folder0.getUnpackSizeForCoder(coderArray0[1]);
      assertEquals(1217L, long0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Folder folder0 = new Folder();
      Coder[] coderArray0 = new Coder[7];
      long[] longArray0 = new long[9];
      longArray0[0] = (-2394L);
      folder0.unpackSizes = longArray0;
      folder0.coders = coderArray0;
      long long0 = folder0.getUnpackSizeForCoder(coderArray0[1]);
      assertEquals((-2394L), long0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Folder folder0 = new Folder();
      long[] longArray0 = new long[6];
      longArray0[5] = 4747L;
      folder0.totalOutputStreams = 6L;
      folder0.unpackSizes = longArray0;
      long long0 = folder0.getUnpackSize();
      assertEquals(4747L, long0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Folder folder0 = new Folder();
      long[] longArray0 = new long[5];
      longArray0[0] = (long) (-1);
      folder0.unpackSizes = longArray0;
      folder0.totalOutputStreams = 1L;
      long long0 = folder0.getUnpackSize();
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Folder folder0 = new Folder();
      BindPair[] bindPairArray0 = new BindPair[2];
      BindPair bindPair0 = new BindPair(0L, (-1L));
      bindPairArray0[0] = bindPair0;
      folder0.bindPairs = bindPairArray0;
      int int0 = folder0.findBindPairForOutStream((-1));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Folder folder0 = new Folder();
      BindPair[] bindPairArray0 = new BindPair[9];
      BindPair bindPair0 = new BindPair(2211L, 2440L);
      bindPairArray0[0] = bindPair0;
      bindPairArray0[1] = bindPairArray0[0];
      bindPairArray0[2] = bindPair0;
      bindPairArray0[3] = bindPair0;
      bindPairArray0[4] = bindPair0;
      bindPairArray0[5] = bindPair0;
      BindPair bindPair1 = new BindPair(269L, 0L);
      bindPairArray0[6] = bindPair1;
      folder0.bindPairs = bindPairArray0;
      int int0 = folder0.findBindPairForOutStream(0);
      assertEquals(6, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Folder folder0 = new Folder();
      BindPair[] bindPairArray0 = new BindPair[5];
      BindPair bindPair0 = new BindPair(5143L, 636L);
      bindPairArray0[0] = bindPair0;
      bindPairArray0[1] = bindPair0;
      BindPair bindPair1 = new BindPair(0L, (-2132L));
      bindPairArray0[2] = bindPair1;
      folder0.bindPairs = bindPairArray0;
      int int0 = folder0.findBindPairForInStream(0);
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Folder folder0 = new Folder();
      folder0.totalOutputStreams = 0L;
      long[] longArray0 = new long[3];
      folder0.unpackSizes = longArray0;
      folder0.totalOutputStreams = (long) 3092;
      // Undeclared exception!
      try { 
        folder0.getUnpackSize();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3091
         //
         verifyException("org.apache.commons.compress.archivers.sevenz.Folder", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Folder folder0 = new Folder();
      BindPair[] bindPairArray0 = new BindPair[9];
      folder0.bindPairs = bindPairArray0;
      // Undeclared exception!
      try { 
        folder0.findBindPairForOutStream(0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Folder folder0 = new Folder();
      long[] longArray0 = new long[2];
      BindPair[] bindPairArray0 = new BindPair[9];
      folder0.bindPairs = bindPairArray0;
      folder0.unpackSizes = longArray0;
      folder0.hasCrc = true;
      Coder[] coderArray0 = new Coder[0];
      folder0.coders = coderArray0;
      folder0.packedStreams = longArray0;
      String string0 = folder0.toString();
      assertEquals("Folder with 0 coders, 0 input streams, 0 output streams, 9 bind pairs, 2 packed streams, 2 unpack sizes, with CRC 0 and 0 unpack streams", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Folder folder0 = new Folder();
      long[] longArray0 = new long[2];
      BindPair[] bindPairArray0 = new BindPair[9];
      folder0.bindPairs = bindPairArray0;
      folder0.unpackSizes = longArray0;
      Coder[] coderArray0 = new Coder[0];
      folder0.coders = coderArray0;
      folder0.packedStreams = longArray0;
      String string0 = folder0.toString();
      assertEquals("Folder with 0 coders, 0 input streams, 0 output streams, 9 bind pairs, 2 packed streams, 2 unpack sizes, without CRC and 0 unpack streams", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Folder folder0 = new Folder();
      Coder[] coderArray0 = new Coder[5];
      byte[] byteArray0 = new byte[9];
      Coder coder0 = new Coder(byteArray0, (byte)0, (byte)0, byteArray0);
      folder0.coders = coderArray0;
      long long0 = folder0.getUnpackSizeForCoder(coder0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Folder folder0 = new Folder();
      byte[] byteArray0 = new byte[4];
      Coder coder0 = new Coder(byteArray0, (-11L), (-11L), byteArray0);
      long long0 = folder0.getUnpackSizeForCoder(coder0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Folder folder0 = new Folder();
      folder0.totalOutputStreams = (-2285L);
      long long0 = folder0.getUnpackSize();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Folder folder0 = new Folder();
      long long0 = folder0.getUnpackSize();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Folder folder0 = new Folder();
      folder0.totalOutputStreams = 1L;
      // Undeclared exception!
      try { 
        folder0.getUnpackSize();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.sevenz.Folder", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Folder folder0 = new Folder();
      BindPair[] bindPairArray0 = new BindPair[9];
      BindPair bindPair0 = new BindPair(3092, 3092);
      bindPairArray0[0] = bindPair0;
      bindPairArray0[1] = bindPairArray0[0];
      BindPair bindPair1 = new BindPair(3092, 0L);
      bindPairArray0[2] = bindPair1;
      folder0.bindPairs = bindPairArray0;
      Coder[] coderArray0 = new Coder[1];
      long[] longArray0 = new long[3];
      folder0.packedStreams = longArray0;
      folder0.coders = coderArray0;
      Iterable<Coder> iterable0 = folder0.getOrderedCoders();
      assertNotNull(iterable0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Folder folder0 = new Folder();
      long[] longArray0 = new long[2];
      Coder[] coderArray0 = new Coder[0];
      folder0.coders = coderArray0;
      folder0.packedStreams = longArray0;
      Iterable<Coder> iterable0 = folder0.getOrderedCoders();
      assertNotNull(iterable0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Folder folder0 = new Folder();
      long[] longArray0 = new long[0];
      folder0.packedStreams = longArray0;
      Coder[] coderArray0 = new Coder[5];
      folder0.coders = coderArray0;
      Iterable<Coder> iterable0 = folder0.getOrderedCoders();
      assertNotNull(iterable0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Folder folder0 = new Folder();
      long[] longArray0 = new long[4];
      folder0.packedStreams = longArray0;
      Iterable<Coder> iterable0 = folder0.getOrderedCoders();
      assertNotNull(iterable0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Folder folder0 = new Folder();
      Iterable<Coder> iterable0 = folder0.getOrderedCoders();
      assertNotNull(iterable0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Folder folder0 = new Folder();
      long[] longArray0 = new long[22];
      Coder[] coderArray0 = new Coder[2];
      folder0.coders = coderArray0;
      folder0.packedStreams = longArray0;
      BindPair[] bindPairArray0 = new BindPair[5];
      BindPair bindPair0 = new BindPair(0L, 636L);
      bindPairArray0[0] = bindPair0;
      BindPair bindPair1 = new BindPair((byte)0, 0L);
      bindPairArray0[1] = bindPair1;
      folder0.bindPairs = bindPairArray0;
      try { 
        folder0.getOrderedCoders();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // folder uses the same coder more than once in coder chain
         //
         verifyException("org.apache.commons.compress.archivers.sevenz.Folder", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Folder folder0 = new Folder();
      BindPair[] bindPairArray0 = new BindPair[2];
      BindPair bindPair0 = new BindPair(0L, (-1L));
      bindPairArray0[0] = bindPair0;
      bindPairArray0[1] = bindPairArray0[0];
      folder0.bindPairs = bindPairArray0;
      int int0 = folder0.findBindPairForOutStream(0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Folder folder0 = new Folder();
      long[] longArray0 = new long[22];
      Coder[] coderArray0 = new Coder[2];
      folder0.coders = coderArray0;
      folder0.packedStreams = longArray0;
      BindPair[] bindPairArray0 = new BindPair[5];
      folder0.bindPairs = bindPairArray0;
      // Undeclared exception!
      try { 
        folder0.getOrderedCoders();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Folder folder0 = new Folder();
      BindPair[] bindPairArray0 = new BindPair[5];
      BindPair bindPair0 = new BindPair(0L, 636L);
      bindPairArray0[0] = bindPair0;
      folder0.bindPairs = bindPairArray0;
      int int0 = folder0.findBindPairForInStream(0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Folder folder0 = new Folder();
      BindPair[] bindPairArray0 = new BindPair[9];
      BindPair bindPair0 = new BindPair(2211L, 2440L);
      bindPairArray0[0] = bindPair0;
      bindPairArray0[1] = bindPairArray0[0];
      bindPairArray0[2] = bindPairArray0[1];
      bindPairArray0[3] = bindPairArray0[0];
      bindPairArray0[4] = bindPairArray0[2];
      bindPairArray0[5] = bindPair0;
      bindPairArray0[6] = bindPairArray0[1];
      bindPairArray0[7] = bindPair0;
      bindPairArray0[8] = bindPairArray0[6];
      folder0.bindPairs = bindPairArray0;
      int int0 = folder0.findBindPairForInStream(1);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Folder folder0 = new Folder();
      int int0 = folder0.findBindPairForInStream((byte) (-43));
      assertEquals((-1), int0);
  }
}
